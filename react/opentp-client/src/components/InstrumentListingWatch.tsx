import { Menu } from '@blueprintjs/core';
import { Cell, Column, IRegion, SelectionModes, Table } from "@blueprintjs/table";
import { Actions, Model, TabNode } from "flexlayout-react";
import React from 'react';
import { logDebug } from "../logging/Logging";
import { Listing } from "../serverapi/listing_pb";
import { Side } from "../serverapi/order_pb";
import { ListingId } from "../serverapi/static-data-service_pb";
import { ListingService } from "../services/ListingService";
import { QuoteListener, QuoteService } from "../services/QuoteService";
import { toNumber } from "../util/decimal64Conversion";
import { ListingContext, TicketController } from "./Container";
import InstrumentListingSearchBar from "./InstrumentListingSearchBar";
import './TableView/TableCommon.css';
import { ClobQuote } from '../serverapi/clobquote_pb';
import TableViewConfig, { getColIdsInOrder, getColumnState, reorderColumnData } from './TableView/TableLayout';


interface InstrumentListingWatchState {
  watches: Array<ListingWatch>
  columns: Array<JSX.Element>
  columnWidths: Array<number>
}

interface InstrumentListingWatchProps {
  node: TabNode,
  model: Model,
  quoteService: QuoteService,
  listingContext: ListingContext,
  ticketController: TicketController,
  listingService: ListingService
}

interface PersistentConfig extends TableViewConfig {
  listingIds: number[]
}

export default class InstrumentListingWatch extends React.Component<InstrumentListingWatchProps, InstrumentListingWatchState> implements QuoteListener {

  quoteService: QuoteService
  listingContext: ListingContext
  ticketController: TicketController
  listingService: ListingService

  watchMap: Map<number, ListingWatch> = new Map()

  selectedWatches: Map<number, ListingWatch> = new Map<number, ListingWatch>()

  constructor(props: InstrumentListingWatchProps) {
    super(props);

    this.quoteService = props.quoteService
    this.ticketController = props.ticketController
    this.listingService = props.listingService

    this.addListing = this.addListing.bind(this);


    let columns = [<Column key="id" id="id" name="Id" cellRenderer={this.renderId} />,
    <Column key="symbol" id="symbol" name="Symbol" cellRenderer={this.renderSymbol} />,
    <Column key="name" id="name" name="Name" cellRenderer={this.renderName} />,
    <Column key="mic" id="mic" name="Mic" cellRenderer={this.renderMic} />,
    <Column key="country" id="country" name="Country" cellRenderer={this.renderCountry} />,
    <Column key="bidSize" id="bidSize" name="Bid Qty" cellRenderer={this.renderBidSize} />,
    <Column key="bidPx" id="bidPx" name="Bid Px" cellRenderer={this.renderBidPrice} />,
    <Column key="askPx" id="askPx" name="Ask Px" cellRenderer={this.renderAskPrice} />,
    <Column key="askSize" id="askSize" name="Ask Qty" cellRenderer={this.renderAskSize} />]

    let config = this.props.node.getConfig()

    let { defaultCols, defaultColWidths } = getColumnState(columns, config);

    this.props.node.setEventListener("save", (p) => {
      let cols = this.state.columns
      let colOrderIds = getColIdsInOrder(cols);

      let persistentConfig: PersistentConfig = {
        columnWidths: this.state.columnWidths,
        columnOrder: colOrderIds,
        listingIds: Array.from(this.state.watches.map(l => l.listingId))
      }


      this.props.model.doAction(Actions.updateNodeAttributes(props.node.getId(), { config: persistentConfig }))
    });

    let initialWatches = new Array<ListingWatch>()
    if (this.props.node.getConfig() && this.props.node.getConfig()) {
      let persistentConfig: PersistentConfig = this.props.node.getConfig();
      persistentConfig.listingIds.forEach(id => {
        let watch = this.getListingWatch(id)
        initialWatches.push(watch)
      })
    }

    let initialState: InstrumentListingWatchState = {
      watches: initialWatches,
      columns: defaultCols,
      columnWidths: defaultColWidths
    }
    this.state = initialState

    this.listingContext = props.listingContext
    this.openBuyDialog = this.openBuyDialog.bind(this);
    this.openSellDialog = this.openSellDialog.bind(this);
    this.removeListings = this.removeListings.bind(this);
  }

  addListing(listing?: Listing) {

    if (listing) {
      if (!this.watchMap.get(listing.getId())) {
        let watch = this.getListingWatch(listing.getId())
        let newWatches = this.state.watches.slice(0)
        newWatches.push(watch)
        this.setState(
          {
            watches: newWatches
          }
        )
      }
    }
  }



  private getListingWatch(listingId: number): ListingWatch {


    let line = new ListingWatch(listingId)

    let id = new ListingId()
    id.setListingid(listingId)

    this.listingService.GetListing(listingId, (listing: Listing) => {
      line.listing = listing

      this.quoteService.SubscribeToQuote(listing, this)

      this.setState({
        watches: Object.assign([], this.state.watches)
      })
    })

    this.watchMap.set(listingId, line);
    

    return line

  }

  onQuote(quote: ClobQuote): void {

    let line = this.watchMap.get(quote.getListingid())
    if (line) {

      line.quote = quote
      let lines = this.state.watches.slice(0)
      this.setState({
        watches: lines
      });

    } else {
      logDebug("received quote update for non-existent watch, quote id:" + quote.getListingid())
    }

  }

  public render() {

    return (

      <div className="bp3-dark">
        <InstrumentListingSearchBar add={this.addListing} />
        <Table enableRowResizing={false} numRows={this.state.watches.length} className="bp3-dark" selectionModes={SelectionModes.ROWS_AND_CELLS}
          onSelection={this.onSelection} bodyContextMenuRenderer={this.renderContextMenu} enableColumnReordering={true}
          onColumnsReordered={this.onColumnsReordered} enableColumnResizing={true} onColumnWidthChanged={this.columnResized} columnWidths={this.state.columnWidths}>
          {this.state.columns}
        </Table>
      </div>
    );
  }

  columnResized = (index: number, size: number) => {
    let newColWidths = this.state.columnWidths.slice();
    newColWidths[index] = size
    let blotterState: InstrumentListingWatchState = {
      ...this.state, ...{
        columnWidths: newColWidths
      }
    }

    this.setState(blotterState)

  }

  onColumnsReordered = (oldIndex: number, newIndex: number, length: number) => {

    let newCols = reorderColumnData(oldIndex, newIndex, length, this.state.columns)
    let newColWidths = reorderColumnData(oldIndex, newIndex, length, this.state.columnWidths)

    let blotterState = {
      ...this.state, ...{
        columns: newCols,
        columnWidths: newColWidths
      }
    }

    this.setState(blotterState)
  }



 

  private renderId = (row: number) => <Cell>{this.state.watches[row]?.Id()}</Cell>;
  private renderSymbol = (row: number) => <Cell>{this.state.watches[row]?.Symbol()}</Cell>;
  private renderName = (row: number) => <Cell>{this.state.watches[row]?.Name()}</Cell>;
  private renderMic = (row: number) => <Cell>{this.state.watches[row]?.Mic()}</Cell>;
  private renderCountry = (row: number) => <Cell>{this.state.watches[row]?.Country()}</Cell>;
  private renderBidSize = (row: number) => <Cell>{this.state.watches[row]?.BidSize()}</Cell>;
  private renderBidPrice = (row: number) => <Cell>{this.state.watches[row]?.BidPrice()}</Cell>;
  private renderAskPrice = (row: number) => <Cell>{this.state.watches[row]?.AskPrice()}</Cell>;
  private renderAskSize = (row: number) => <Cell>{this.state.watches[row]?.AskSize()}</Cell>;

  renderContextMenu = () => {
    return (

      <Menu >
        <Menu.Item text="Buy" onClick={this.openBuyDialog} disabled={this.listingContext.selectedListing === undefined}>
         </Menu.Item>
        <Menu.Divider />
        <Menu.Item  text="Sell" onClick={this.openSellDialog} disabled={this.listingContext.selectedListing === undefined}>
         </Menu.Item>
         <Menu.Divider />
        <Menu.Item text="Remove Listings" onClick={this.removeListings} disabled={this.listingContext.selectedListing === undefined}>
         </Menu.Item>
      </Menu>

    );
  };

  private removeListings() {

    for (let watch of this.selectedWatches.values()) {
      this.watchMap.delete(watch.listingId)
      this.quoteService.UnsubscribeFromQuote(watch.listingId, this)
    }

    let newWatches = Array<ListingWatch>()

    for( let watch of this.state.watches ) {
      if( this.watchMap.has(watch.listingId)) {
        newWatches.push(watch)
      }
    }

    let blotterState = {
      ...this.state, ...{
        watches: newWatches
      }
    }

    console.log("removed watches")

    this.setState(blotterState)
  }


  private openBuyDialog() {

    if (this.listingContext.selectedListing) {
      this.ticketController.openTicket(Side.BUY, this.listingContext.selectedListing)
    }

  }

  private openSellDialog() {
    if (this.listingContext.selectedListing) {
      this.ticketController.openTicket(Side.SELL, this.listingContext.selectedListing)
    }
  }

  private onSelection = (selectedRegions: IRegion[]) => {


    this.selectedWatches.clear()

    for (let region of selectedRegions) {

      let firstRowIdx: number;
      let lastRowIdx: number;

      if (region.rows) {
        firstRowIdx = region.rows[0]
        lastRowIdx = region.rows[1]
      } else {
        firstRowIdx = 0
        lastRowIdx = this.state.watches.length - 1
      }

      for (let i = firstRowIdx; i <= lastRowIdx; i++) {
        let watch = this.state.watches[i]
        this.selectedWatches.set(watch.Id(), watch)

        if (i === firstRowIdx) {
          if (watch.listing) {
            this.listingContext.setSelectedListing(watch.listing)
          }

        }

      }
    }

  }


}

class ListingWatch {

  listingId: number;
  listing?: Listing;
  quote?: ClobQuote;

  constructor(listingId: number) {
    this.listingId = listingId
  }

  Id(): number {
    return this.listingId
  }

  Symbol(): string {
    if (this.listing) {
      let i = this.listing.getInstrument()
      if (i) {
        return i.getDisplaysymbol()
      }
    }

    return ""
  }

  Name(): string {
    if (this.listing) {
      let i = this.listing.getInstrument()
      if (i) {
        return i.getName()
      }
    }


    return ""
  }

  Mic(): string {
    if (this.listing) {
      let m = this.listing.getMarket()
      if (m) {
        return m.getMic()
      }
    }
    return ""
  }

  Country(): string {
    if (this.listing) {
      let m = this.listing.getMarket()
      if (m) {
        return m.getCountrycode()
      }
    }
    return ""
  }

  BidSize(): string {
    if (this.quote) {
      if (this.quote.getBidsList().length >= 1) {
        let depth = this.quote.getBidsList()[0]
        let sz = toNumber(depth.getSize())
        if (sz) {
          return sz.toString()
        }
      }
    }

    return ""
  }

  BidPrice(): string {
    if (this.quote) {
      if (this.quote.getBidsList().length >= 1) {
        let depth = this.quote.getBidsList()[0]
        let sz = toNumber(depth.getPrice())
        if (sz) {
          return sz.toString()
        }
      }
    }

    return ""
  }

  AskSize(): string {
    if (this.quote) {
      if (this.quote.getOffersList().length >= 1) {
        let depth = this.quote.getOffersList()[0]
        let sz = toNumber(depth.getSize())
        if (sz) {
          return sz.toString()
        }
      }
    }

    return ""
  }

  AskPrice(): string {
    if (this.quote) {
      if (this.quote.getOffersList().length >= 1) {
        let depth = this.quote.getOffersList()[0]
        let sz = toNumber(depth.getPrice())
        if (sz) {
          return sz.toString()
        }
      }
    }

    return ""
  }

}
