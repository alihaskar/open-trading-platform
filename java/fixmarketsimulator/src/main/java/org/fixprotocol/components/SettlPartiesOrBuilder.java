// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface SettlPartiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.SettlParties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string settl_party_id = 1 [(.fix.tag) = 782, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The settlPartyId.
   */
  java.lang.String getSettlPartyId();
  /**
   * <code>string settl_party_id = 1 [(.fix.tag) = 782, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for settlPartyId.
   */
  com.google.protobuf.ByteString
      getSettlPartyIdBytes();

  /**
   * <code>.Common.SettlPartyIDSourceEnum settl_party_id_source = 2 [(.fix.tag) = 783, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for settlPartyIdSource.
   */
  int getSettlPartyIdSourceValue();
  /**
   * <code>.Common.SettlPartyIDSourceEnum settl_party_id_source = 2 [(.fix.tag) = 783, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The settlPartyIdSource.
   */
  org.fixprotocol.components.SettlPartyIDSourceEnum getSettlPartyIdSource();

  /**
   * <code>.Common.SettlPartyRoleEnum settl_party_role = 3 [(.fix.tag) = 784, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for settlPartyRole.
   */
  int getSettlPartyRoleValue();
  /**
   * <code>.Common.SettlPartyRoleEnum settl_party_role = 3 [(.fix.tag) = 784, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The settlPartyRole.
   */
  org.fixprotocol.components.SettlPartyRoleEnum getSettlPartyRole();

  /**
   * <code>repeated .Common.SettlPtysSubGrp settl_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.SettlPtysSubGrp> 
      getSettlPtysSubGrpList();
  /**
   * <code>repeated .Common.SettlPtysSubGrp settl_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.SettlPtysSubGrp getSettlPtysSubGrp(int index);
  /**
   * <code>repeated .Common.SettlPtysSubGrp settl_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getSettlPtysSubGrpCount();
  /**
   * <code>repeated .Common.SettlPtysSubGrp settl_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.SettlPtysSubGrpOrBuilder> 
      getSettlPtysSubGrpOrBuilderList();
  /**
   * <code>repeated .Common.SettlPtysSubGrp settl_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.SettlPtysSubGrpOrBuilder getSettlPtysSubGrpOrBuilder(
      int index);
}
