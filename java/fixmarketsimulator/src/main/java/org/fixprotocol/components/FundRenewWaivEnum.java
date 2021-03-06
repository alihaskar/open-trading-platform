// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.FundRenewWaivEnum}
 */
public enum FundRenewWaivEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FUND_RENEW_WAIV_UNSPECIFIED = 0;</code>
   */
  FUND_RENEW_WAIV_UNSPECIFIED(0),
  /**
   * <code>FUND_RENEW_WAIV_NO = 1 [(.fix.enum_value) = "N", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  FUND_RENEW_WAIV_NO(1),
  /**
   * <code>FUND_RENEW_WAIV_YES = 2 [(.fix.enum_value) = "Y", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  FUND_RENEW_WAIV_YES(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FUND_RENEW_WAIV_UNSPECIFIED = 0;</code>
   */
  public static final int FUND_RENEW_WAIV_UNSPECIFIED_VALUE = 0;
  /**
   * <code>FUND_RENEW_WAIV_NO = 1 [(.fix.enum_value) = "N", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int FUND_RENEW_WAIV_NO_VALUE = 1;
  /**
   * <code>FUND_RENEW_WAIV_YES = 2 [(.fix.enum_value) = "Y", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int FUND_RENEW_WAIV_YES_VALUE = 2;


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
  public static FundRenewWaivEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FundRenewWaivEnum forNumber(int value) {
    switch (value) {
      case 0: return FUND_RENEW_WAIV_UNSPECIFIED;
      case 1: return FUND_RENEW_WAIV_NO;
      case 2: return FUND_RENEW_WAIV_YES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FundRenewWaivEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FundRenewWaivEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FundRenewWaivEnum>() {
          public FundRenewWaivEnum findValueByNumber(int number) {
            return FundRenewWaivEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(1);
  }

  private static final FundRenewWaivEnum[] VALUES = values();

  public static FundRenewWaivEnum valueOf(
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

  private FundRenewWaivEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.FundRenewWaivEnum)
}

