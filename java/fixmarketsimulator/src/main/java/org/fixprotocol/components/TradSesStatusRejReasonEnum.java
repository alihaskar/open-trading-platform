// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.TradSesStatusRejReasonEnum}
 */
public enum TradSesStatusRejReasonEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRAD_SES_STATUS_REJ_REASON_UNSPECIFIED = 0;</code>
   */
  TRAD_SES_STATUS_REJ_REASON_UNSPECIFIED(0),
  /**
   * <code>TRAD_SES_STATUS_REJ_REASON_UNKNOWN_OR_INVALID_TRADING_SESSION_ID = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  TRAD_SES_STATUS_REJ_REASON_UNKNOWN_OR_INVALID_TRADING_SESSION_ID(1),
  /**
   * <code>TRAD_SES_STATUS_REJ_REASON_OTHER = 2 [(.fix.enum_value) = "99", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  TRAD_SES_STATUS_REJ_REASON_OTHER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRAD_SES_STATUS_REJ_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int TRAD_SES_STATUS_REJ_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TRAD_SES_STATUS_REJ_REASON_UNKNOWN_OR_INVALID_TRADING_SESSION_ID = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int TRAD_SES_STATUS_REJ_REASON_UNKNOWN_OR_INVALID_TRADING_SESSION_ID_VALUE = 1;
  /**
   * <code>TRAD_SES_STATUS_REJ_REASON_OTHER = 2 [(.fix.enum_value) = "99", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int TRAD_SES_STATUS_REJ_REASON_OTHER_VALUE = 2;


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
  public static TradSesStatusRejReasonEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TradSesStatusRejReasonEnum forNumber(int value) {
    switch (value) {
      case 0: return TRAD_SES_STATUS_REJ_REASON_UNSPECIFIED;
      case 1: return TRAD_SES_STATUS_REJ_REASON_UNKNOWN_OR_INVALID_TRADING_SESSION_ID;
      case 2: return TRAD_SES_STATUS_REJ_REASON_OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradSesStatusRejReasonEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradSesStatusRejReasonEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradSesStatusRejReasonEnum>() {
          public TradSesStatusRejReasonEnum findValueByNumber(int number) {
            return TradSesStatusRejReasonEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(148);
  }

  private static final TradSesStatusRejReasonEnum[] VALUES = values();

  public static TradSesStatusRejReasonEnum valueOf(
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

  private TradSesStatusRejReasonEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.TradSesStatusRejReasonEnum)
}
