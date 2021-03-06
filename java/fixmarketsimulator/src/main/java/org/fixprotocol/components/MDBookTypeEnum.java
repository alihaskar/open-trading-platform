// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.MDBookTypeEnum}
 */
public enum MDBookTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MD_BOOK_TYPE_UNSPECIFIED = 0;</code>
   */
  MD_BOOK_TYPE_UNSPECIFIED(0),
  /**
   * <code>MD_BOOK_TYPE_ORDER_DEPTH = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  MD_BOOK_TYPE_ORDER_DEPTH(1),
  /**
   * <code>MD_BOOK_TYPE_PRICE_DEPTH = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  MD_BOOK_TYPE_PRICE_DEPTH(2),
  /**
   * <code>MD_BOOK_TYPE_TOP_OF_BOOK = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  MD_BOOK_TYPE_TOP_OF_BOOK(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MD_BOOK_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MD_BOOK_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>MD_BOOK_TYPE_ORDER_DEPTH = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int MD_BOOK_TYPE_ORDER_DEPTH_VALUE = 1;
  /**
   * <code>MD_BOOK_TYPE_PRICE_DEPTH = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int MD_BOOK_TYPE_PRICE_DEPTH_VALUE = 2;
  /**
   * <code>MD_BOOK_TYPE_TOP_OF_BOOK = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int MD_BOOK_TYPE_TOP_OF_BOOK_VALUE = 3;


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
  public static MDBookTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MDBookTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return MD_BOOK_TYPE_UNSPECIFIED;
      case 1: return MD_BOOK_TYPE_ORDER_DEPTH;
      case 2: return MD_BOOK_TYPE_PRICE_DEPTH;
      case 3: return MD_BOOK_TYPE_TOP_OF_BOOK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MDBookTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MDBookTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MDBookTypeEnum>() {
          public MDBookTypeEnum findValueByNumber(int number) {
            return MDBookTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(159);
  }

  private static final MDBookTypeEnum[] VALUES = values();

  public static MDBookTypeEnum valueOf(
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

  private MDBookTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.MDBookTypeEnum)
}

