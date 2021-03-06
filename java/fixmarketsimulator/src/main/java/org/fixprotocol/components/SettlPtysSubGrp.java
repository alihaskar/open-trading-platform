// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.SettlPtysSubGrp}
 */
public  final class SettlPtysSubGrp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.SettlPtysSubGrp)
    SettlPtysSubGrpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SettlPtysSubGrp.newBuilder() to construct.
  private SettlPtysSubGrp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SettlPtysSubGrp() {
    settlPartySubId_ = "";
    settlPartySubIdType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SettlPtysSubGrp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SettlPtysSubGrp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            settlPartySubId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            settlPartySubIdType_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.internal_static_Common_SettlPtysSubGrp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_SettlPtysSubGrp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.SettlPtysSubGrp.class, org.fixprotocol.components.SettlPtysSubGrp.Builder.class);
  }

  public static final int SETTL_PARTY_SUB_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object settlPartySubId_;
  /**
   * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The settlPartySubId.
   */
  public java.lang.String getSettlPartySubId() {
    java.lang.Object ref = settlPartySubId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      settlPartySubId_ = s;
      return s;
    }
  }
  /**
   * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for settlPartySubId.
   */
  public com.google.protobuf.ByteString
      getSettlPartySubIdBytes() {
    java.lang.Object ref = settlPartySubId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      settlPartySubId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SETTL_PARTY_SUB_ID_TYPE_FIELD_NUMBER = 2;
  private int settlPartySubIdType_;
  /**
   * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for settlPartySubIdType.
   */
  public int getSettlPartySubIdTypeValue() {
    return settlPartySubIdType_;
  }
  /**
   * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The settlPartySubIdType.
   */
  public org.fixprotocol.components.SettlPartySubIDTypeEnum getSettlPartySubIdType() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.SettlPartySubIDTypeEnum result = org.fixprotocol.components.SettlPartySubIDTypeEnum.valueOf(settlPartySubIdType_);
    return result == null ? org.fixprotocol.components.SettlPartySubIDTypeEnum.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSettlPartySubIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, settlPartySubId_);
    }
    if (settlPartySubIdType_ != org.fixprotocol.components.SettlPartySubIDTypeEnum.SETTL_PARTY_SUB_ID_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, settlPartySubIdType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSettlPartySubIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, settlPartySubId_);
    }
    if (settlPartySubIdType_ != org.fixprotocol.components.SettlPartySubIDTypeEnum.SETTL_PARTY_SUB_ID_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, settlPartySubIdType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.fixprotocol.components.SettlPtysSubGrp)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.SettlPtysSubGrp other = (org.fixprotocol.components.SettlPtysSubGrp) obj;

    if (!getSettlPartySubId()
        .equals(other.getSettlPartySubId())) return false;
    if (settlPartySubIdType_ != other.settlPartySubIdType_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SETTL_PARTY_SUB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSettlPartySubId().hashCode();
    hash = (37 * hash) + SETTL_PARTY_SUB_ID_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + settlPartySubIdType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.SettlPtysSubGrp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.fixprotocol.components.SettlPtysSubGrp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Common.SettlPtysSubGrp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.SettlPtysSubGrp)
      org.fixprotocol.components.SettlPtysSubGrpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_SettlPtysSubGrp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_SettlPtysSubGrp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.SettlPtysSubGrp.class, org.fixprotocol.components.SettlPtysSubGrp.Builder.class);
    }

    // Construct using org.fixprotocol.components.SettlPtysSubGrp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      settlPartySubId_ = "";

      settlPartySubIdType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_SettlPtysSubGrp_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.SettlPtysSubGrp getDefaultInstanceForType() {
      return org.fixprotocol.components.SettlPtysSubGrp.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.SettlPtysSubGrp build() {
      org.fixprotocol.components.SettlPtysSubGrp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.SettlPtysSubGrp buildPartial() {
      org.fixprotocol.components.SettlPtysSubGrp result = new org.fixprotocol.components.SettlPtysSubGrp(this);
      result.settlPartySubId_ = settlPartySubId_;
      result.settlPartySubIdType_ = settlPartySubIdType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.fixprotocol.components.SettlPtysSubGrp) {
        return mergeFrom((org.fixprotocol.components.SettlPtysSubGrp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.SettlPtysSubGrp other) {
      if (other == org.fixprotocol.components.SettlPtysSubGrp.getDefaultInstance()) return this;
      if (!other.getSettlPartySubId().isEmpty()) {
        settlPartySubId_ = other.settlPartySubId_;
        onChanged();
      }
      if (other.settlPartySubIdType_ != 0) {
        setSettlPartySubIdTypeValue(other.getSettlPartySubIdTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.fixprotocol.components.SettlPtysSubGrp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.SettlPtysSubGrp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object settlPartySubId_ = "";
    /**
     * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The settlPartySubId.
     */
    public java.lang.String getSettlPartySubId() {
      java.lang.Object ref = settlPartySubId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        settlPartySubId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The bytes for settlPartySubId.
     */
    public com.google.protobuf.ByteString
        getSettlPartySubIdBytes() {
      java.lang.Object ref = settlPartySubId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        settlPartySubId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @param value The settlPartySubId to set.
     * @return This builder for chaining.
     */
    public Builder setSettlPartySubId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      settlPartySubId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return This builder for chaining.
     */
    public Builder clearSettlPartySubId() {
      
      settlPartySubId_ = getDefaultInstance().getSettlPartySubId();
      onChanged();
      return this;
    }
    /**
     * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @param value The bytes for settlPartySubId to set.
     * @return This builder for chaining.
     */
    public Builder setSettlPartySubIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      settlPartySubId_ = value;
      onChanged();
      return this;
    }

    private int settlPartySubIdType_ = 0;
    /**
     * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The enum numeric value on the wire for settlPartySubIdType.
     */
    public int getSettlPartySubIdTypeValue() {
      return settlPartySubIdType_;
    }
    /**
     * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @param value The enum numeric value on the wire for settlPartySubIdType to set.
     * @return This builder for chaining.
     */
    public Builder setSettlPartySubIdTypeValue(int value) {
      settlPartySubIdType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The settlPartySubIdType.
     */
    public org.fixprotocol.components.SettlPartySubIDTypeEnum getSettlPartySubIdType() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.SettlPartySubIDTypeEnum result = org.fixprotocol.components.SettlPartySubIDTypeEnum.valueOf(settlPartySubIdType_);
      return result == null ? org.fixprotocol.components.SettlPartySubIDTypeEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @param value The settlPartySubIdType to set.
     * @return This builder for chaining.
     */
    public Builder setSettlPartySubIdType(org.fixprotocol.components.SettlPartySubIDTypeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      settlPartySubIdType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return This builder for chaining.
     */
    public Builder clearSettlPartySubIdType() {
      
      settlPartySubIdType_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Common.SettlPtysSubGrp)
  }

  // @@protoc_insertion_point(class_scope:Common.SettlPtysSubGrp)
  private static final org.fixprotocol.components.SettlPtysSubGrp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.SettlPtysSubGrp();
  }

  public static org.fixprotocol.components.SettlPtysSubGrp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SettlPtysSubGrp>
      PARSER = new com.google.protobuf.AbstractParser<SettlPtysSubGrp>() {
    @java.lang.Override
    public SettlPtysSubGrp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SettlPtysSubGrp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SettlPtysSubGrp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SettlPtysSubGrp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.SettlPtysSubGrp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

