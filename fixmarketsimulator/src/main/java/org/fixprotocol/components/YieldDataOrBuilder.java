// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface YieldDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.YieldData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 yield = 1 [(.fix.tag) = 236, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return Whether the yield field is set.
   */
  boolean hasYield();
  /**
   * <code>.fix.Decimal64 yield = 1 [(.fix.tag) = 236, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The yield.
   */
  org.fixprotocol.components.Fix.Decimal64 getYield();
  /**
   * <code>.fix.Decimal64 yield = 1 [(.fix.tag) = 236, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getYieldOrBuilder();

  /**
   * <code>.Common.YieldTypeEnum yield_type = 2 [(.fix.tag) = 235, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The enum numeric value on the wire for yieldType.
   */
  int getYieldTypeValue();
  /**
   * <code>.Common.YieldTypeEnum yield_type = 2 [(.fix.tag) = 235, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The yieldType.
   */
  org.fixprotocol.components.YieldTypeEnum getYieldType();

  /**
   * <code>sfixed32 yield_calc_date = 3 [(.fix.tag) = 701, (.fix.type) = DATATYPE_LOCAL_MKT_DATE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The yieldCalcDate.
   */
  int getYieldCalcDate();

  /**
   * <code>sfixed32 yield_redemption_date = 4 [(.fix.tag) = 696, (.fix.type) = DATATYPE_LOCAL_MKT_DATE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The yieldRedemptionDate.
   */
  int getYieldRedemptionDate();

  /**
   * <code>.fix.Decimal64 yield_redemption_price = 5 [(.fix.tag) = 697, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the yieldRedemptionPrice field is set.
   */
  boolean hasYieldRedemptionPrice();
  /**
   * <code>.fix.Decimal64 yield_redemption_price = 5 [(.fix.tag) = 697, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The yieldRedemptionPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getYieldRedemptionPrice();
  /**
   * <code>.fix.Decimal64 yield_redemption_price = 5 [(.fix.tag) = 697, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getYieldRedemptionPriceOrBuilder();

  /**
   * <code>.Common.YieldRedemptionPriceTypeEnum yield_redemption_price_type = 6 [(.fix.tag) = 698, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for yieldRedemptionPriceType.
   */
  int getYieldRedemptionPriceTypeValue();
  /**
   * <code>.Common.YieldRedemptionPriceTypeEnum yield_redemption_price_type = 6 [(.fix.tag) = 698, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The yieldRedemptionPriceType.
   */
  org.fixprotocol.components.YieldRedemptionPriceTypeEnum getYieldRedemptionPriceType();
}