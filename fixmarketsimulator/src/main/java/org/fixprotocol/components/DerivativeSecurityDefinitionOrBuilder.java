// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface DerivativeSecurityDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.DerivativeSecurityDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.DerivativeInstrument derivative_instrument = 1 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the derivativeInstrument field is set.
   */
  boolean hasDerivativeInstrument();
  /**
   * <code>.Common.DerivativeInstrument derivative_instrument = 1 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The derivativeInstrument.
   */
  org.fixprotocol.components.DerivativeInstrument getDerivativeInstrument();
  /**
   * <code>.Common.DerivativeInstrument derivative_instrument = 1 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeInstrumentOrBuilder getDerivativeInstrumentOrBuilder();

  /**
   * <code>repeated .Common.DerivativeInstrumentAttribute derivative_instrument_attribute = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.DerivativeInstrumentAttribute> 
      getDerivativeInstrumentAttributeList();
  /**
   * <code>repeated .Common.DerivativeInstrumentAttribute derivative_instrument_attribute = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeInstrumentAttribute getDerivativeInstrumentAttribute(int index);
  /**
   * <code>repeated .Common.DerivativeInstrumentAttribute derivative_instrument_attribute = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeInstrumentAttributeCount();
  /**
   * <code>repeated .Common.DerivativeInstrumentAttribute derivative_instrument_attribute = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.DerivativeInstrumentAttributeOrBuilder> 
      getDerivativeInstrumentAttributeOrBuilderList();
  /**
   * <code>repeated .Common.DerivativeInstrumentAttribute derivative_instrument_attribute = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeInstrumentAttributeOrBuilder getDerivativeInstrumentAttributeOrBuilder(
      int index);

  /**
   * <code>repeated .Common.MarketSegmentGrp market_segment_grp = 3 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.MarketSegmentGrp> 
      getMarketSegmentGrpList();
  /**
   * <code>repeated .Common.MarketSegmentGrp market_segment_grp = 3 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.MarketSegmentGrp getMarketSegmentGrp(int index);
  /**
   * <code>repeated .Common.MarketSegmentGrp market_segment_grp = 3 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getMarketSegmentGrpCount();
  /**
   * <code>repeated .Common.MarketSegmentGrp market_segment_grp = 3 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.MarketSegmentGrpOrBuilder> 
      getMarketSegmentGrpOrBuilderList();
  /**
   * <code>repeated .Common.MarketSegmentGrp market_segment_grp = 3 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.MarketSegmentGrpOrBuilder getMarketSegmentGrpOrBuilder(
      int index);
}