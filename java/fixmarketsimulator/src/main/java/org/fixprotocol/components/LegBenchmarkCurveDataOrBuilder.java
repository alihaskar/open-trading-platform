// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface LegBenchmarkCurveDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.LegBenchmarkCurveData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string leg_benchmark_curve_currency = 1 [(.fix.tag) = 676, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legBenchmarkCurveCurrency.
   */
  java.lang.String getLegBenchmarkCurveCurrency();
  /**
   * <code>string leg_benchmark_curve_currency = 1 [(.fix.tag) = 676, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for legBenchmarkCurveCurrency.
   */
  com.google.protobuf.ByteString
      getLegBenchmarkCurveCurrencyBytes();

  /**
   * <code>.Common.LegBenchmarkCurveNameEnum leg_benchmark_curve_name = 2 [(.fix.tag) = 677, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legBenchmarkCurveName.
   */
  int getLegBenchmarkCurveNameValue();
  /**
   * <code>.Common.LegBenchmarkCurveNameEnum leg_benchmark_curve_name = 2 [(.fix.tag) = 677, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legBenchmarkCurveName.
   */
  org.fixprotocol.components.LegBenchmarkCurveNameEnum getLegBenchmarkCurveName();

  /**
   * <code>string leg_benchmark_curve_point = 3 [(.fix.tag) = 678, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legBenchmarkCurvePoint.
   */
  java.lang.String getLegBenchmarkCurvePoint();
  /**
   * <code>string leg_benchmark_curve_point = 3 [(.fix.tag) = 678, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for legBenchmarkCurvePoint.
   */
  com.google.protobuf.ByteString
      getLegBenchmarkCurvePointBytes();

  /**
   * <code>.fix.Decimal64 leg_benchmark_price = 4 [(.fix.tag) = 679, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legBenchmarkPrice field is set.
   */
  boolean hasLegBenchmarkPrice();
  /**
   * <code>.fix.Decimal64 leg_benchmark_price = 4 [(.fix.tag) = 679, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legBenchmarkPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegBenchmarkPrice();
  /**
   * <code>.fix.Decimal64 leg_benchmark_price = 4 [(.fix.tag) = 679, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegBenchmarkPriceOrBuilder();

  /**
   * <code>sfixed64 leg_benchmark_price_type = 5 [(.fix.tag) = 680, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legBenchmarkPriceType.
   */
  long getLegBenchmarkPriceType();
}
