// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface TrdRegTimestampsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.TrdRegTimestamps)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Common.DeskOrderHandlingInstEnum desk_order_handling_inst = 1 [(.fix.tag) = 1035, (.fix.type) = DATATYPE_MULTIPLE_STRING_VALUE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return A list containing the deskOrderHandlingInst.
   */
  java.util.List<org.fixprotocol.components.DeskOrderHandlingInstEnum> getDeskOrderHandlingInstList();
  /**
   * <code>repeated .Common.DeskOrderHandlingInstEnum desk_order_handling_inst = 1 [(.fix.tag) = 1035, (.fix.type) = DATATYPE_MULTIPLE_STRING_VALUE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The count of deskOrderHandlingInst.
   */
  int getDeskOrderHandlingInstCount();
  /**
   * <code>repeated .Common.DeskOrderHandlingInstEnum desk_order_handling_inst = 1 [(.fix.tag) = 1035, (.fix.type) = DATATYPE_MULTIPLE_STRING_VALUE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @param index The index of the element to return.
   * @return The deskOrderHandlingInst at the given index.
   */
  org.fixprotocol.components.DeskOrderHandlingInstEnum getDeskOrderHandlingInst(int index);
  /**
   * <code>repeated .Common.DeskOrderHandlingInstEnum desk_order_handling_inst = 1 [(.fix.tag) = 1035, (.fix.type) = DATATYPE_MULTIPLE_STRING_VALUE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return A list containing the enum numeric values on the wire for deskOrderHandlingInst.
   */
  java.util.List<java.lang.Integer>
  getDeskOrderHandlingInstValueList();
  /**
   * <code>repeated .Common.DeskOrderHandlingInstEnum desk_order_handling_inst = 1 [(.fix.tag) = 1035, (.fix.type) = DATATYPE_MULTIPLE_STRING_VALUE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of deskOrderHandlingInst at the given index.
   */
  int getDeskOrderHandlingInstValue(int index);

  /**
   * <code>.Common.DeskTypeEnum desk_type = 2 [(.fix.tag) = 1033, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for deskType.
   */
  int getDeskTypeValue();
  /**
   * <code>.Common.DeskTypeEnum desk_type = 2 [(.fix.tag) = 1033, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The deskType.
   */
  org.fixprotocol.components.DeskTypeEnum getDeskType();

  /**
   * <code>.Common.DeskTypeSourceEnum desk_type_source = 3 [(.fix.tag) = 1034, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for deskTypeSource.
   */
  int getDeskTypeSourceValue();
  /**
   * <code>.Common.DeskTypeSourceEnum desk_type_source = 3 [(.fix.tag) = 1034, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The deskTypeSource.
   */
  org.fixprotocol.components.DeskTypeSourceEnum getDeskTypeSource();

  /**
   * <code>.fix.Timestamp trd_reg_timestamp = 4 [(.fix.tag) = 769, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the trdRegTimestamp field is set.
   */
  boolean hasTrdRegTimestamp();
  /**
   * <code>.fix.Timestamp trd_reg_timestamp = 4 [(.fix.tag) = 769, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The trdRegTimestamp.
   */
  org.fixprotocol.components.Fix.Timestamp getTrdRegTimestamp();
  /**
   * <code>.fix.Timestamp trd_reg_timestamp = 4 [(.fix.tag) = 769, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTrdRegTimestampOrBuilder();

  /**
   * <code>string trd_reg_timestamp_origin = 5 [(.fix.tag) = 771, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The trdRegTimestampOrigin.
   */
  java.lang.String getTrdRegTimestampOrigin();
  /**
   * <code>string trd_reg_timestamp_origin = 5 [(.fix.tag) = 771, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for trdRegTimestampOrigin.
   */
  com.google.protobuf.ByteString
      getTrdRegTimestampOriginBytes();

  /**
   * <code>.Common.TrdRegTimestampTypeEnum trd_reg_timestamp_type = 6 [(.fix.tag) = 770, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for trdRegTimestampType.
   */
  int getTrdRegTimestampTypeValue();
  /**
   * <code>.Common.TrdRegTimestampTypeEnum trd_reg_timestamp_type = 6 [(.fix.tag) = 770, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The trdRegTimestampType.
   */
  org.fixprotocol.components.TrdRegTimestampTypeEnum getTrdRegTimestampType();
}
