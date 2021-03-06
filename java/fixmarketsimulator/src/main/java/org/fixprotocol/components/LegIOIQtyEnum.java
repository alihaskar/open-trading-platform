// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.LegIOIQtyEnum}
 */
public enum LegIOIQtyEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEG_IOI_QTY_UNSPECIFIED = 0;</code>
   */
  LEG_IOI_QTY_UNSPECIFIED(0),
  /**
   * <code>LEG_IOI_QTY_LARGE = 1 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  LEG_IOI_QTY_LARGE(1),
  /**
   * <code>LEG_IOI_QTY_MEDIUM = 2 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  LEG_IOI_QTY_MEDIUM(2),
  /**
   * <code>LEG_IOI_QTY_SMALL = 3 [(.fix.enum_value) = "S", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  LEG_IOI_QTY_SMALL(3),
  /**
   * <code>LEG_IOI_QTY_UNDISCLOSED_QUANTITY = 4 [(.fix.enum_value) = "U", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  LEG_IOI_QTY_UNDISCLOSED_QUANTITY(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LEG_IOI_QTY_UNSPECIFIED = 0;</code>
   */
  public static final int LEG_IOI_QTY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>LEG_IOI_QTY_LARGE = 1 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  public static final int LEG_IOI_QTY_LARGE_VALUE = 1;
  /**
   * <code>LEG_IOI_QTY_MEDIUM = 2 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  public static final int LEG_IOI_QTY_MEDIUM_VALUE = 2;
  /**
   * <code>LEG_IOI_QTY_SMALL = 3 [(.fix.enum_value) = "S", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  public static final int LEG_IOI_QTY_SMALL_VALUE = 3;
  /**
   * <code>LEG_IOI_QTY_UNDISCLOSED_QUANTITY = 4 [(.fix.enum_value) = "U", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  public static final int LEG_IOI_QTY_UNDISCLOSED_QUANTITY_VALUE = 4;


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
  public static LegIOIQtyEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LegIOIQtyEnum forNumber(int value) {
    switch (value) {
      case 0: return LEG_IOI_QTY_UNSPECIFIED;
      case 1: return LEG_IOI_QTY_LARGE;
      case 2: return LEG_IOI_QTY_MEDIUM;
      case 3: return LEG_IOI_QTY_SMALL;
      case 4: return LEG_IOI_QTY_UNDISCLOSED_QUANTITY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LegIOIQtyEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LegIOIQtyEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LegIOIQtyEnum>() {
          public LegIOIQtyEnum findValueByNumber(int number) {
            return LegIOIQtyEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(104);
  }

  private static final LegIOIQtyEnum[] VALUES = values();

  public static LegIOIQtyEnum valueOf(
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

  private LegIOIQtyEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.LegIOIQtyEnum)
}

