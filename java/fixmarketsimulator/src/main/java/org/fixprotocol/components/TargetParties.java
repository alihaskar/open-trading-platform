// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.TargetParties}
 */
public  final class TargetParties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.TargetParties)
    TargetPartiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetParties.newBuilder() to construct.
  private TargetParties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetParties() {
    targetPartyId_ = "";
    targetPartyIdSource_ = 0;
    targetPartyRole_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetParties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetParties(
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

            targetPartyId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            targetPartyIdSource_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            targetPartyRole_ = rawValue;
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
    return org.fixprotocol.components.Common.internal_static_Common_TargetParties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_TargetParties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.TargetParties.class, org.fixprotocol.components.TargetParties.Builder.class);
  }

  public static final int TARGET_PARTY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object targetPartyId_;
  /**
   * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The targetPartyId.
   */
  public java.lang.String getTargetPartyId() {
    java.lang.Object ref = targetPartyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetPartyId_ = s;
      return s;
    }
  }
  /**
   * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The bytes for targetPartyId.
   */
  public com.google.protobuf.ByteString
      getTargetPartyIdBytes() {
    java.lang.Object ref = targetPartyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetPartyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_PARTY_ID_SOURCE_FIELD_NUMBER = 2;
  private int targetPartyIdSource_;
  /**
   * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The enum numeric value on the wire for targetPartyIdSource.
   */
  public int getTargetPartyIdSourceValue() {
    return targetPartyIdSource_;
  }
  /**
   * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The targetPartyIdSource.
   */
  public org.fixprotocol.components.TargetPartyIDSourceEnum getTargetPartyIdSource() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.TargetPartyIDSourceEnum result = org.fixprotocol.components.TargetPartyIDSourceEnum.valueOf(targetPartyIdSource_);
    return result == null ? org.fixprotocol.components.TargetPartyIDSourceEnum.UNRECOGNIZED : result;
  }

  public static final int TARGET_PARTY_ROLE_FIELD_NUMBER = 3;
  private int targetPartyRole_;
  /**
   * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The enum numeric value on the wire for targetPartyRole.
   */
  public int getTargetPartyRoleValue() {
    return targetPartyRole_;
  }
  /**
   * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The targetPartyRole.
   */
  public org.fixprotocol.components.TargetPartyRoleEnum getTargetPartyRole() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.TargetPartyRoleEnum result = org.fixprotocol.components.TargetPartyRoleEnum.valueOf(targetPartyRole_);
    return result == null ? org.fixprotocol.components.TargetPartyRoleEnum.UNRECOGNIZED : result;
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
    if (!getTargetPartyIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetPartyId_);
    }
    if (targetPartyIdSource_ != org.fixprotocol.components.TargetPartyIDSourceEnum.TARGET_PARTY_ID_SOURCE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, targetPartyIdSource_);
    }
    if (targetPartyRole_ != org.fixprotocol.components.TargetPartyRoleEnum.TARGET_PARTY_ROLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, targetPartyRole_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTargetPartyIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetPartyId_);
    }
    if (targetPartyIdSource_ != org.fixprotocol.components.TargetPartyIDSourceEnum.TARGET_PARTY_ID_SOURCE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, targetPartyIdSource_);
    }
    if (targetPartyRole_ != org.fixprotocol.components.TargetPartyRoleEnum.TARGET_PARTY_ROLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, targetPartyRole_);
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
    if (!(obj instanceof org.fixprotocol.components.TargetParties)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.TargetParties other = (org.fixprotocol.components.TargetParties) obj;

    if (!getTargetPartyId()
        .equals(other.getTargetPartyId())) return false;
    if (targetPartyIdSource_ != other.targetPartyIdSource_) return false;
    if (targetPartyRole_ != other.targetPartyRole_) return false;
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
    hash = (37 * hash) + TARGET_PARTY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTargetPartyId().hashCode();
    hash = (37 * hash) + TARGET_PARTY_ID_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + targetPartyIdSource_;
    hash = (37 * hash) + TARGET_PARTY_ROLE_FIELD_NUMBER;
    hash = (53 * hash) + targetPartyRole_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.TargetParties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.TargetParties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.TargetParties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.TargetParties parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.TargetParties prototype) {
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
   * Protobuf type {@code Common.TargetParties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.TargetParties)
      org.fixprotocol.components.TargetPartiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_TargetParties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_TargetParties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.TargetParties.class, org.fixprotocol.components.TargetParties.Builder.class);
    }

    // Construct using org.fixprotocol.components.TargetParties.newBuilder()
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
      targetPartyId_ = "";

      targetPartyIdSource_ = 0;

      targetPartyRole_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_TargetParties_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.TargetParties getDefaultInstanceForType() {
      return org.fixprotocol.components.TargetParties.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.TargetParties build() {
      org.fixprotocol.components.TargetParties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.TargetParties buildPartial() {
      org.fixprotocol.components.TargetParties result = new org.fixprotocol.components.TargetParties(this);
      result.targetPartyId_ = targetPartyId_;
      result.targetPartyIdSource_ = targetPartyIdSource_;
      result.targetPartyRole_ = targetPartyRole_;
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
      if (other instanceof org.fixprotocol.components.TargetParties) {
        return mergeFrom((org.fixprotocol.components.TargetParties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.TargetParties other) {
      if (other == org.fixprotocol.components.TargetParties.getDefaultInstance()) return this;
      if (!other.getTargetPartyId().isEmpty()) {
        targetPartyId_ = other.targetPartyId_;
        onChanged();
      }
      if (other.targetPartyIdSource_ != 0) {
        setTargetPartyIdSourceValue(other.getTargetPartyIdSourceValue());
      }
      if (other.targetPartyRole_ != 0) {
        setTargetPartyRoleValue(other.getTargetPartyRoleValue());
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
      org.fixprotocol.components.TargetParties parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.TargetParties) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object targetPartyId_ = "";
    /**
     * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return The targetPartyId.
     */
    public java.lang.String getTargetPartyId() {
      java.lang.Object ref = targetPartyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetPartyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return The bytes for targetPartyId.
     */
    public com.google.protobuf.ByteString
        getTargetPartyIdBytes() {
      java.lang.Object ref = targetPartyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetPartyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @param value The targetPartyId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPartyId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      targetPartyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetPartyId() {
      
      targetPartyId_ = getDefaultInstance().getTargetPartyId();
      onChanged();
      return this;
    }
    /**
     * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @param value The bytes for targetPartyId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPartyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      targetPartyId_ = value;
      onChanged();
      return this;
    }

    private int targetPartyIdSource_ = 0;
    /**
     * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return The enum numeric value on the wire for targetPartyIdSource.
     */
    public int getTargetPartyIdSourceValue() {
      return targetPartyIdSource_;
    }
    /**
     * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @param value The enum numeric value on the wire for targetPartyIdSource to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPartyIdSourceValue(int value) {
      targetPartyIdSource_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return The targetPartyIdSource.
     */
    public org.fixprotocol.components.TargetPartyIDSourceEnum getTargetPartyIdSource() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.TargetPartyIDSourceEnum result = org.fixprotocol.components.TargetPartyIDSourceEnum.valueOf(targetPartyIdSource_);
      return result == null ? org.fixprotocol.components.TargetPartyIDSourceEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @param value The targetPartyIdSource to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPartyIdSource(org.fixprotocol.components.TargetPartyIDSourceEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      targetPartyIdSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetPartyIdSource() {
      
      targetPartyIdSource_ = 0;
      onChanged();
      return this;
    }

    private int targetPartyRole_ = 0;
    /**
     * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return The enum numeric value on the wire for targetPartyRole.
     */
    public int getTargetPartyRoleValue() {
      return targetPartyRole_;
    }
    /**
     * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @param value The enum numeric value on the wire for targetPartyRole to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPartyRoleValue(int value) {
      targetPartyRole_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return The targetPartyRole.
     */
    public org.fixprotocol.components.TargetPartyRoleEnum getTargetPartyRole() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.TargetPartyRoleEnum result = org.fixprotocol.components.TargetPartyRoleEnum.valueOf(targetPartyRole_);
      return result == null ? org.fixprotocol.components.TargetPartyRoleEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @param value The targetPartyRole to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPartyRole(org.fixprotocol.components.TargetPartyRoleEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      targetPartyRole_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetPartyRole() {
      
      targetPartyRole_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Common.TargetParties)
  }

  // @@protoc_insertion_point(class_scope:Common.TargetParties)
  private static final org.fixprotocol.components.TargetParties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.TargetParties();
  }

  public static org.fixprotocol.components.TargetParties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetParties>
      PARSER = new com.google.protobuf.AbstractParser<TargetParties>() {
    @java.lang.Override
    public TargetParties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetParties(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetParties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetParties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.TargetParties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

