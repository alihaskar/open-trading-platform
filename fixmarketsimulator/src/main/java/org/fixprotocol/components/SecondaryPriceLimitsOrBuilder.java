// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface SecondaryPriceLimitsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.SecondaryPriceLimits)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 secondary_high_limit_price = 1 [(.fix.tag) = 1230, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the secondaryHighLimitPrice field is set.
   */
  boolean hasSecondaryHighLimitPrice();
  /**
   * <code>.fix.Decimal64 secondary_high_limit_price = 1 [(.fix.tag) = 1230, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The secondaryHighLimitPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getSecondaryHighLimitPrice();
  /**
   * <code>.fix.Decimal64 secondary_high_limit_price = 1 [(.fix.tag) = 1230, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getSecondaryHighLimitPriceOrBuilder();

  /**
   * <code>.fix.Decimal64 secondary_low_limit_price = 2 [(.fix.tag) = 1221, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the secondaryLowLimitPrice field is set.
   */
  boolean hasSecondaryLowLimitPrice();
  /**
   * <code>.fix.Decimal64 secondary_low_limit_price = 2 [(.fix.tag) = 1221, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The secondaryLowLimitPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getSecondaryLowLimitPrice();
  /**
   * <code>.fix.Decimal64 secondary_low_limit_price = 2 [(.fix.tag) = 1221, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getSecondaryLowLimitPriceOrBuilder();

  /**
   * <code>.Common.SecondaryPriceLimitTypeEnum secondary_price_limit_type = 3 [(.fix.tag) = 1305, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for secondaryPriceLimitType.
   */
  int getSecondaryPriceLimitTypeValue();
  /**
   * <code>.Common.SecondaryPriceLimitTypeEnum secondary_price_limit_type = 3 [(.fix.tag) = 1305, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The secondaryPriceLimitType.
   */
  org.fixprotocol.components.SecondaryPriceLimitTypeEnum getSecondaryPriceLimitType();

  /**
   * <code>.fix.Decimal64 secondary_trading_reference_price = 4 [(.fix.tag) = 1240, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the secondaryTradingReferencePrice field is set.
   */
  boolean hasSecondaryTradingReferencePrice();
  /**
   * <code>.fix.Decimal64 secondary_trading_reference_price = 4 [(.fix.tag) = 1240, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The secondaryTradingReferencePrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getSecondaryTradingReferencePrice();
  /**
   * <code>.fix.Decimal64 secondary_trading_reference_price = 4 [(.fix.tag) = 1240, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getSecondaryTradingReferencePriceOrBuilder();
}