// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.MatchTypeEnum}
 */
public enum MatchTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MATCH_TYPE_UNSPECIFIED = 0;</code>
   */
  MATCH_TYPE_UNSPECIFIED(0),
  /**
   * <code>MATCH_TYPE_A1EXACT_MATCH_SUMMARIZED_QUANTITY = 1 [(.fix.enum_value) = "S1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_A1EXACT_MATCH_SUMMARIZED_QUANTITY(1),
  /**
   * <code>MATCH_TYPE_A2EXACT_MATCH_SUMMARIZED_QUANTITY = 2 [(.fix.enum_value) = "S2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_A2EXACT_MATCH_SUMMARIZED_QUANTITY(2),
  /**
   * <code>MATCH_TYPE_A3EXACT_MATCH_SUMMARIZED_QUANTITY = 3 [(.fix.enum_value) = "S3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_A3EXACT_MATCH_SUMMARIZED_QUANTITY(3),
  /**
   * <code>MATCH_TYPE_A4EXACT_MATCH_SUMMARIZED_QUANTITY = 4 [(.fix.enum_value) = "S4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_A4EXACT_MATCH_SUMMARIZED_QUANTITY(4),
  /**
   * <code>MATCH_TYPE_A5EXACT_MATCH_SUMMARIZED_QUANTITY = 5 [(.fix.enum_value) = "S5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_A5EXACT_MATCH_SUMMARIZED_QUANTITY(5),
  /**
   * <code>MATCH_TYPE_ACTACCEPTED_TRADE = 6 [(.fix.enum_value) = "M3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_ACTACCEPTED_TRADE(6),
  /**
   * <code>MATCH_TYPE_ACTDEFAULT_AFTER_M2 = 7 [(.fix.enum_value) = "M5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_ACTDEFAULT_AFTER_M2(7),
  /**
   * <code>MATCH_TYPE_ACTDEFAULT_TRADE = 8 [(.fix.enum_value) = "M4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_ACTDEFAULT_TRADE(8),
  /**
   * <code>MATCH_TYPE_ACTM6MATCH = 9 [(.fix.enum_value) = "M6", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_ACTM6MATCH(9),
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_MINUS_BADGES_TIMES = 10 [(.fix.enum_value) = "M1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_EXACT_MATCH_MINUS_BADGES_TIMES(10),
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS2BADGES = 11 [(.fix.enum_value) = "A4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_EXACT_MATCH_PLUS2BADGES(11),
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS2BADGES_EXEC_TIME = 12 [(.fix.enum_value) = "A3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_EXACT_MATCH_PLUS2BADGES_EXEC_TIME(12),
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS4BADGES = 13 [(.fix.enum_value) = "A2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_EXACT_MATCH_PLUS4BADGES(13),
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS4BADGES_EXEC_TIME = 14 [(.fix.enum_value) = "A1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_EXACT_MATCH_PLUS4BADGES_EXEC_TIME(14),
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS_EXEC_TIME = 15 [(.fix.enum_value) = "A5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_EXACT_MATCH_PLUS_EXEC_TIME(15),
  /**
   * <code>MATCH_TYPE_OCSLOCKED_IN = 16 [(.fix.enum_value) = "MT", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_OCSLOCKED_IN(16),
  /**
   * <code>MATCH_TYPE_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS = 17 [(.fix.enum_value) = "AQ", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS(17),
  /**
   * <code>MATCH_TYPE_SUMMARIZED_MATCH_MINUS_BADGES_TIMES = 18 [(.fix.enum_value) = "M2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  MATCH_TYPE_SUMMARIZED_MATCH_MINUS_BADGES_TIMES(18),
  /**
   * <code>MATCH_TYPE_AUTO_MATCH = 19 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_AUTO_MATCH(19),
  /**
   * <code>MATCH_TYPE_CALL_AUCTION = 20 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_CALL_AUCTION(20),
  /**
   * <code>MATCH_TYPE_CONFIRMED_TRADE_REPORT = 21 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_CONFIRMED_TRADE_REPORT(21),
  /**
   * <code>MATCH_TYPE_COUNTER_ORDER_SELECTION = 22 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_COUNTER_ORDER_SELECTION(22),
  /**
   * <code>MATCH_TYPE_CROSS_AUCTION = 23 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_CROSS_AUCTION(23),
  /**
   * <code>MATCH_TYPE_ONE_PARTY_TRADE_REPORT = 24 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_ONE_PARTY_TRADE_REPORT(24),
  /**
   * <code>MATCH_TYPE_TWO_PARTY_TRADE_REPORT = 25 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  MATCH_TYPE_TWO_PARTY_TRADE_REPORT(25),
  /**
   * <code>MATCH_TYPE_ISSUING = 26 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 47];</code>
   */
  MATCH_TYPE_ISSUING(26),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MATCH_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MATCH_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>MATCH_TYPE_A1EXACT_MATCH_SUMMARIZED_QUANTITY = 1 [(.fix.enum_value) = "S1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_A1EXACT_MATCH_SUMMARIZED_QUANTITY_VALUE = 1;
  /**
   * <code>MATCH_TYPE_A2EXACT_MATCH_SUMMARIZED_QUANTITY = 2 [(.fix.enum_value) = "S2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_A2EXACT_MATCH_SUMMARIZED_QUANTITY_VALUE = 2;
  /**
   * <code>MATCH_TYPE_A3EXACT_MATCH_SUMMARIZED_QUANTITY = 3 [(.fix.enum_value) = "S3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_A3EXACT_MATCH_SUMMARIZED_QUANTITY_VALUE = 3;
  /**
   * <code>MATCH_TYPE_A4EXACT_MATCH_SUMMARIZED_QUANTITY = 4 [(.fix.enum_value) = "S4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_A4EXACT_MATCH_SUMMARIZED_QUANTITY_VALUE = 4;
  /**
   * <code>MATCH_TYPE_A5EXACT_MATCH_SUMMARIZED_QUANTITY = 5 [(.fix.enum_value) = "S5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_A5EXACT_MATCH_SUMMARIZED_QUANTITY_VALUE = 5;
  /**
   * <code>MATCH_TYPE_ACTACCEPTED_TRADE = 6 [(.fix.enum_value) = "M3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_ACTACCEPTED_TRADE_VALUE = 6;
  /**
   * <code>MATCH_TYPE_ACTDEFAULT_AFTER_M2 = 7 [(.fix.enum_value) = "M5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_ACTDEFAULT_AFTER_M2_VALUE = 7;
  /**
   * <code>MATCH_TYPE_ACTDEFAULT_TRADE = 8 [(.fix.enum_value) = "M4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_ACTDEFAULT_TRADE_VALUE = 8;
  /**
   * <code>MATCH_TYPE_ACTM6MATCH = 9 [(.fix.enum_value) = "M6", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_ACTM6MATCH_VALUE = 9;
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_MINUS_BADGES_TIMES = 10 [(.fix.enum_value) = "M1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_EXACT_MATCH_MINUS_BADGES_TIMES_VALUE = 10;
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS2BADGES = 11 [(.fix.enum_value) = "A4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_EXACT_MATCH_PLUS2BADGES_VALUE = 11;
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS2BADGES_EXEC_TIME = 12 [(.fix.enum_value) = "A3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_EXACT_MATCH_PLUS2BADGES_EXEC_TIME_VALUE = 12;
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS4BADGES = 13 [(.fix.enum_value) = "A2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_EXACT_MATCH_PLUS4BADGES_VALUE = 13;
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS4BADGES_EXEC_TIME = 14 [(.fix.enum_value) = "A1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_EXACT_MATCH_PLUS4BADGES_EXEC_TIME_VALUE = 14;
  /**
   * <code>MATCH_TYPE_EXACT_MATCH_PLUS_EXEC_TIME = 15 [(.fix.enum_value) = "A5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_EXACT_MATCH_PLUS_EXEC_TIME_VALUE = 15;
  /**
   * <code>MATCH_TYPE_OCSLOCKED_IN = 16 [(.fix.enum_value) = "MT", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_OCSLOCKED_IN_VALUE = 16;
  /**
   * <code>MATCH_TYPE_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS = 17 [(.fix.enum_value) = "AQ", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS_VALUE = 17;
  /**
   * <code>MATCH_TYPE_SUMMARIZED_MATCH_MINUS_BADGES_TIMES = 18 [(.fix.enum_value) = "M2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int MATCH_TYPE_SUMMARIZED_MATCH_MINUS_BADGES_TIMES_VALUE = 18;
  /**
   * <code>MATCH_TYPE_AUTO_MATCH = 19 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_AUTO_MATCH_VALUE = 19;
  /**
   * <code>MATCH_TYPE_CALL_AUCTION = 20 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_CALL_AUCTION_VALUE = 20;
  /**
   * <code>MATCH_TYPE_CONFIRMED_TRADE_REPORT = 21 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_CONFIRMED_TRADE_REPORT_VALUE = 21;
  /**
   * <code>MATCH_TYPE_COUNTER_ORDER_SELECTION = 22 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_COUNTER_ORDER_SELECTION_VALUE = 22;
  /**
   * <code>MATCH_TYPE_CROSS_AUCTION = 23 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_CROSS_AUCTION_VALUE = 23;
  /**
   * <code>MATCH_TYPE_ONE_PARTY_TRADE_REPORT = 24 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_ONE_PARTY_TRADE_REPORT_VALUE = 24;
  /**
   * <code>MATCH_TYPE_TWO_PARTY_TRADE_REPORT = 25 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int MATCH_TYPE_TWO_PARTY_TRADE_REPORT_VALUE = 25;
  /**
   * <code>MATCH_TYPE_ISSUING = 26 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 47];</code>
   */
  public static final int MATCH_TYPE_ISSUING_VALUE = 26;


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
  public static MatchTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MatchTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return MATCH_TYPE_UNSPECIFIED;
      case 1: return MATCH_TYPE_A1EXACT_MATCH_SUMMARIZED_QUANTITY;
      case 2: return MATCH_TYPE_A2EXACT_MATCH_SUMMARIZED_QUANTITY;
      case 3: return MATCH_TYPE_A3EXACT_MATCH_SUMMARIZED_QUANTITY;
      case 4: return MATCH_TYPE_A4EXACT_MATCH_SUMMARIZED_QUANTITY;
      case 5: return MATCH_TYPE_A5EXACT_MATCH_SUMMARIZED_QUANTITY;
      case 6: return MATCH_TYPE_ACTACCEPTED_TRADE;
      case 7: return MATCH_TYPE_ACTDEFAULT_AFTER_M2;
      case 8: return MATCH_TYPE_ACTDEFAULT_TRADE;
      case 9: return MATCH_TYPE_ACTM6MATCH;
      case 10: return MATCH_TYPE_EXACT_MATCH_MINUS_BADGES_TIMES;
      case 11: return MATCH_TYPE_EXACT_MATCH_PLUS2BADGES;
      case 12: return MATCH_TYPE_EXACT_MATCH_PLUS2BADGES_EXEC_TIME;
      case 13: return MATCH_TYPE_EXACT_MATCH_PLUS4BADGES;
      case 14: return MATCH_TYPE_EXACT_MATCH_PLUS4BADGES_EXEC_TIME;
      case 15: return MATCH_TYPE_EXACT_MATCH_PLUS_EXEC_TIME;
      case 16: return MATCH_TYPE_OCSLOCKED_IN;
      case 17: return MATCH_TYPE_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS;
      case 18: return MATCH_TYPE_SUMMARIZED_MATCH_MINUS_BADGES_TIMES;
      case 19: return MATCH_TYPE_AUTO_MATCH;
      case 20: return MATCH_TYPE_CALL_AUCTION;
      case 21: return MATCH_TYPE_CONFIRMED_TRADE_REPORT;
      case 22: return MATCH_TYPE_COUNTER_ORDER_SELECTION;
      case 23: return MATCH_TYPE_CROSS_AUCTION;
      case 24: return MATCH_TYPE_ONE_PARTY_TRADE_REPORT;
      case 25: return MATCH_TYPE_TWO_PARTY_TRADE_REPORT;
      case 26: return MATCH_TYPE_ISSUING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MatchTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MatchTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MatchTypeEnum>() {
          public MatchTypeEnum findValueByNumber(int number) {
            return MatchTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(161);
  }

  private static final MatchTypeEnum[] VALUES = values();

  public static MatchTypeEnum valueOf(
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

  private MatchTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.MatchTypeEnum)
}

