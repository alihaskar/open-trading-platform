// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.MaturityMonthYearFormatEnum}
 */
public enum MaturityMonthYearFormatEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_UNSPECIFIED = 0;</code>
   */
  MATURITY_MONTH_YEAR_FORMAT_UNSPECIFIED(0),
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_DAY = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_DAY(1),
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_ONLY = 2 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_ONLY(2),
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_WEEK = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_WEEK(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int MATURITY_MONTH_YEAR_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_DAY = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_DAY_VALUE = 1;
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_ONLY = 2 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_ONLY_VALUE = 2;
  /**
   * <code>MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_WEEK = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_WEEK_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MaturityMonthYearFormatEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MaturityMonthYearFormatEnum forNumber(int value) {
    switch (value) {
      case 0: return MATURITY_MONTH_YEAR_FORMAT_UNSPECIFIED;
      case 1: return MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_DAY;
      case 2: return MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_ONLY;
      case 3: return MATURITY_MONTH_YEAR_FORMAT_YEAR_MONTH_WEEK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MaturityMonthYearFormatEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MaturityMonthYearFormatEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MaturityMonthYearFormatEnum>() {
          public MaturityMonthYearFormatEnum findValueByNumber(int number) {
            return MaturityMonthYearFormatEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(155);
  }

  private static final MaturityMonthYearFormatEnum[] VALUES = values();

  public static MaturityMonthYearFormatEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MaturityMonthYearFormatEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.MaturityMonthYearFormatEnum)
}

