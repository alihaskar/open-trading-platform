// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DerivativeEventTypeEnum}
 */
public enum DerivativeEventTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DERIVATIVE_EVENT_TYPE_UNSPECIFIED = 0;</code>
   */
  DERIVATIVE_EVENT_TYPE_UNSPECIFIED(0),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_CALL = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_EVENT_TYPE_CALL(1),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_OTHER = 2 [(.fix.enum_value) = "99", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_EVENT_TYPE_OTHER(2),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_PUT = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_EVENT_TYPE_PUT(3),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SINKING_FUND_CALL = 4 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_EVENT_TYPE_SINKING_FUND_CALL(4),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_TENDER = 5 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_EVENT_TYPE_TENDER(5),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_ACTIVATION = 6 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 8];</code>
   */
  DERIVATIVE_EVENT_TYPE_ACTIVATION(6),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_INACTIVIATION = 7 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 8];</code>
   */
  DERIVATIVE_EVENT_TYPE_INACTIVIATION(7),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_LAST_ELIGIBLE_TRADE_DATE = 8 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 42];</code>
   */
  DERIVATIVE_EVENT_TYPE_LAST_ELIGIBLE_TRADE_DATE(8),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_FINAL_INVENTORY_DUE_DATE = 9 [(.fix.enum_value) = "16", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_FINAL_INVENTORY_DUE_DATE(9),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_FIRST_DELIVERY_DATE = 10 [(.fix.enum_value) = "13", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_FIRST_DELIVERY_DATE(10),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_FIRST_INTENT_DATE = 11 [(.fix.enum_value) = "17", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_FIRST_INTENT_DATE(11),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_INITIAL_INVENTORY_DUE_DATE = 12 [(.fix.enum_value) = "15", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_INITIAL_INVENTORY_DUE_DATE(12),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_LAST_DELIVERY_DATE = 13 [(.fix.enum_value) = "14", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_LAST_DELIVERY_DATE(13),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_LAST_INTENT_DATE = 14 [(.fix.enum_value) = "18", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_LAST_INTENT_DATE(14),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_POSITION_REMOVAL_DATE = 15 [(.fix.enum_value) = "19", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_POSITION_REMOVAL_DATE(15),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_END_DATE = 16 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_SWAP_END_DATE(16),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_NEXT_ROLL_DATE = 17 [(.fix.enum_value) = "12", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_SWAP_NEXT_ROLL_DATE(17),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_NEXT_START_DATE = 18 [(.fix.enum_value) = "11", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_SWAP_NEXT_START_DATE(18),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_ROLL_DATE = 19 [(.fix.enum_value) = "10", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_SWAP_ROLL_DATE(19),
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_START_DATE = 20 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_EVENT_TYPE_SWAP_START_DATE(20),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DERIVATIVE_EVENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_CALL = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_CALL_VALUE = 1;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_OTHER = 2 [(.fix.enum_value) = "99", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_OTHER_VALUE = 2;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_PUT = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_PUT_VALUE = 3;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SINKING_FUND_CALL = 4 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_SINKING_FUND_CALL_VALUE = 4;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_TENDER = 5 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_TENDER_VALUE = 5;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_ACTIVATION = 6 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 8];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_ACTIVATION_VALUE = 6;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_INACTIVIATION = 7 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 8];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_INACTIVIATION_VALUE = 7;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_LAST_ELIGIBLE_TRADE_DATE = 8 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 42];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_LAST_ELIGIBLE_TRADE_DATE_VALUE = 8;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_FINAL_INVENTORY_DUE_DATE = 9 [(.fix.enum_value) = "16", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_FINAL_INVENTORY_DUE_DATE_VALUE = 9;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_FIRST_DELIVERY_DATE = 10 [(.fix.enum_value) = "13", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_FIRST_DELIVERY_DATE_VALUE = 10;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_FIRST_INTENT_DATE = 11 [(.fix.enum_value) = "17", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_FIRST_INTENT_DATE_VALUE = 11;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_INITIAL_INVENTORY_DUE_DATE = 12 [(.fix.enum_value) = "15", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_INITIAL_INVENTORY_DUE_DATE_VALUE = 12;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_LAST_DELIVERY_DATE = 13 [(.fix.enum_value) = "14", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_LAST_DELIVERY_DATE_VALUE = 13;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_LAST_INTENT_DATE = 14 [(.fix.enum_value) = "18", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_LAST_INTENT_DATE_VALUE = 14;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_POSITION_REMOVAL_DATE = 15 [(.fix.enum_value) = "19", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_POSITION_REMOVAL_DATE_VALUE = 15;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_END_DATE = 16 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_SWAP_END_DATE_VALUE = 16;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_NEXT_ROLL_DATE = 17 [(.fix.enum_value) = "12", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_SWAP_NEXT_ROLL_DATE_VALUE = 17;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_NEXT_START_DATE = 18 [(.fix.enum_value) = "11", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_SWAP_NEXT_START_DATE_VALUE = 18;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_ROLL_DATE = 19 [(.fix.enum_value) = "10", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_SWAP_ROLL_DATE_VALUE = 19;
  /**
   * <code>DERIVATIVE_EVENT_TYPE_SWAP_START_DATE = 20 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_EVENT_TYPE_SWAP_START_DATE_VALUE = 20;


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
  public static DerivativeEventTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DerivativeEventTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return DERIVATIVE_EVENT_TYPE_UNSPECIFIED;
      case 1: return DERIVATIVE_EVENT_TYPE_CALL;
      case 2: return DERIVATIVE_EVENT_TYPE_OTHER;
      case 3: return DERIVATIVE_EVENT_TYPE_PUT;
      case 4: return DERIVATIVE_EVENT_TYPE_SINKING_FUND_CALL;
      case 5: return DERIVATIVE_EVENT_TYPE_TENDER;
      case 6: return DERIVATIVE_EVENT_TYPE_ACTIVATION;
      case 7: return DERIVATIVE_EVENT_TYPE_INACTIVIATION;
      case 8: return DERIVATIVE_EVENT_TYPE_LAST_ELIGIBLE_TRADE_DATE;
      case 9: return DERIVATIVE_EVENT_TYPE_FINAL_INVENTORY_DUE_DATE;
      case 10: return DERIVATIVE_EVENT_TYPE_FIRST_DELIVERY_DATE;
      case 11: return DERIVATIVE_EVENT_TYPE_FIRST_INTENT_DATE;
      case 12: return DERIVATIVE_EVENT_TYPE_INITIAL_INVENTORY_DUE_DATE;
      case 13: return DERIVATIVE_EVENT_TYPE_LAST_DELIVERY_DATE;
      case 14: return DERIVATIVE_EVENT_TYPE_LAST_INTENT_DATE;
      case 15: return DERIVATIVE_EVENT_TYPE_POSITION_REMOVAL_DATE;
      case 16: return DERIVATIVE_EVENT_TYPE_SWAP_END_DATE;
      case 17: return DERIVATIVE_EVENT_TYPE_SWAP_NEXT_ROLL_DATE;
      case 18: return DERIVATIVE_EVENT_TYPE_SWAP_NEXT_START_DATE;
      case 19: return DERIVATIVE_EVENT_TYPE_SWAP_ROLL_DATE;
      case 20: return DERIVATIVE_EVENT_TYPE_SWAP_START_DATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DerivativeEventTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DerivativeEventTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DerivativeEventTypeEnum>() {
          public DerivativeEventTypeEnum findValueByNumber(int number) {
            return DerivativeEventTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(193);
  }

  private static final DerivativeEventTypeEnum[] VALUES = values();

  public static DerivativeEventTypeEnum valueOf(
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

  private DerivativeEventTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DerivativeEventTypeEnum)
}

