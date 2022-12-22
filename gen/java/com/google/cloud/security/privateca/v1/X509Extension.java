// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1/resources.proto

package com.google.cloud.security.privateca.v1;

/**
 * <pre>
 * An [X509Extension][google.cloud.security.privateca.v1.X509Extension] specifies an X.509 extension, which may be used in
 * different parts of X.509 objects like certificates, CSRs, and CRLs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1.X509Extension}
 */
public final class X509Extension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1.X509Extension)
    X509ExtensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use X509Extension.newBuilder() to construct.
  private X509Extension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private X509Extension() {
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new X509Extension();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_X509Extension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_X509Extension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1.X509Extension.class, com.google.cloud.security.privateca.v1.X509Extension.Builder.class);
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 1;
  private com.google.cloud.security.privateca.v1.ObjectId objectId_;
  /**
   * <pre>
   * Required. The OID for this X.509 extension.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the objectId field is set.
   */
  @java.lang.Override
  public boolean hasObjectId() {
    return objectId_ != null;
  }
  /**
   * <pre>
   * Required. The OID for this X.509 extension.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The objectId.
   */
  @java.lang.Override
  public com.google.cloud.security.privateca.v1.ObjectId getObjectId() {
    return objectId_ == null ? com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance() : objectId_;
  }
  /**
   * <pre>
   * Required. The OID for this X.509 extension.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.security.privateca.v1.ObjectIdOrBuilder getObjectIdOrBuilder() {
    return objectId_ == null ? com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance() : objectId_;
  }

  public static final int CRITICAL_FIELD_NUMBER = 2;
  private boolean critical_ = false;
  /**
   * <pre>
   * Optional. Indicates whether or not this extension is critical (i.e., if the client
   * does not know how to handle this extension, the client should consider this
   * to be an error).
   * </pre>
   *
   * <code>bool critical = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The critical.
   */
  @java.lang.Override
  public boolean getCritical() {
    return critical_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Required. The value of this X.509 extension.
   * </pre>
   *
   * <code>bytes value = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
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
    if (objectId_ != null) {
      output.writeMessage(1, getObjectId());
    }
    if (critical_ != false) {
      output.writeBool(2, critical_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(3, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (objectId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getObjectId());
    }
    if (critical_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, critical_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, value_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.security.privateca.v1.X509Extension)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1.X509Extension other = (com.google.cloud.security.privateca.v1.X509Extension) obj;

    if (hasObjectId() != other.hasObjectId()) return false;
    if (hasObjectId()) {
      if (!getObjectId()
          .equals(other.getObjectId())) return false;
    }
    if (getCritical()
        != other.getCritical()) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasObjectId()) {
      hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getObjectId().hashCode();
    }
    hash = (37 * hash) + CRITICAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCritical());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.security.privateca.v1.X509Extension parseFrom(
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
  public static Builder newBuilder(com.google.cloud.security.privateca.v1.X509Extension prototype) {
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
   * <pre>
   * An [X509Extension][google.cloud.security.privateca.v1.X509Extension] specifies an X.509 extension, which may be used in
   * different parts of X.509 objects like certificates, CSRs, and CRLs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1.X509Extension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1.X509Extension)
      com.google.cloud.security.privateca.v1.X509ExtensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_X509Extension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_X509Extension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1.X509Extension.class, com.google.cloud.security.privateca.v1.X509Extension.Builder.class);
    }

    // Construct using com.google.cloud.security.privateca.v1.X509Extension.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objectId_ = null;
      if (objectIdBuilder_ != null) {
        objectIdBuilder_.dispose();
        objectIdBuilder_ = null;
      }
      critical_ = false;
      value_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_X509Extension_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.X509Extension getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1.X509Extension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.X509Extension build() {
      com.google.cloud.security.privateca.v1.X509Extension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.X509Extension buildPartial() {
      com.google.cloud.security.privateca.v1.X509Extension result = new com.google.cloud.security.privateca.v1.X509Extension(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.security.privateca.v1.X509Extension result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectId_ = objectIdBuilder_ == null
            ? objectId_
            : objectIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.critical_ = critical_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
      }
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
      if (other instanceof com.google.cloud.security.privateca.v1.X509Extension) {
        return mergeFrom((com.google.cloud.security.privateca.v1.X509Extension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.security.privateca.v1.X509Extension other) {
      if (other == com.google.cloud.security.privateca.v1.X509Extension.getDefaultInstance()) return this;
      if (other.hasObjectId()) {
        mergeObjectId(other.getObjectId());
      }
      if (other.getCritical() != false) {
        setCritical(other.getCritical());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getObjectIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              critical_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              value_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.cloud.security.privateca.v1.ObjectId objectId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.security.privateca.v1.ObjectId, com.google.cloud.security.privateca.v1.ObjectId.Builder, com.google.cloud.security.privateca.v1.ObjectIdOrBuilder> objectIdBuilder_;
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the objectId field is set.
     */
    public boolean hasObjectId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The objectId.
     */
    public com.google.cloud.security.privateca.v1.ObjectId getObjectId() {
      if (objectIdBuilder_ == null) {
        return objectId_ == null ? com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance() : objectId_;
      } else {
        return objectIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setObjectId(com.google.cloud.security.privateca.v1.ObjectId value) {
      if (objectIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectId_ = value;
      } else {
        objectIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setObjectId(
        com.google.cloud.security.privateca.v1.ObjectId.Builder builderForValue) {
      if (objectIdBuilder_ == null) {
        objectId_ = builderForValue.build();
      } else {
        objectIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeObjectId(com.google.cloud.security.privateca.v1.ObjectId value) {
      if (objectIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          objectId_ != null &&
          objectId_ != com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance()) {
          getObjectIdBuilder().mergeFrom(value);
        } else {
          objectId_ = value;
        }
      } else {
        objectIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearObjectId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      objectId_ = null;
      if (objectIdBuilder_ != null) {
        objectIdBuilder_.dispose();
        objectIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.security.privateca.v1.ObjectId.Builder getObjectIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.security.privateca.v1.ObjectIdOrBuilder getObjectIdOrBuilder() {
      if (objectIdBuilder_ != null) {
        return objectIdBuilder_.getMessageOrBuilder();
      } else {
        return objectId_ == null ?
            com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance() : objectId_;
      }
    }
    /**
     * <pre>
     * Required. The OID for this X.509 extension.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.ObjectId object_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.security.privateca.v1.ObjectId, com.google.cloud.security.privateca.v1.ObjectId.Builder, com.google.cloud.security.privateca.v1.ObjectIdOrBuilder> 
        getObjectIdFieldBuilder() {
      if (objectIdBuilder_ == null) {
        objectIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.security.privateca.v1.ObjectId, com.google.cloud.security.privateca.v1.ObjectId.Builder, com.google.cloud.security.privateca.v1.ObjectIdOrBuilder>(
                getObjectId(),
                getParentForChildren(),
                isClean());
        objectId_ = null;
      }
      return objectIdBuilder_;
    }

    private boolean critical_ ;
    /**
     * <pre>
     * Optional. Indicates whether or not this extension is critical (i.e., if the client
     * does not know how to handle this extension, the client should consider this
     * to be an error).
     * </pre>
     *
     * <code>bool critical = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The critical.
     */
    @java.lang.Override
    public boolean getCritical() {
      return critical_;
    }
    /**
     * <pre>
     * Optional. Indicates whether or not this extension is critical (i.e., if the client
     * does not know how to handle this extension, the client should consider this
     * to be an error).
     * </pre>
     *
     * <code>bool critical = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The critical to set.
     * @return This builder for chaining.
     */
    public Builder setCritical(boolean value) {
      
      critical_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Indicates whether or not this extension is critical (i.e., if the client
     * does not know how to handle this extension, the client should consider this
     * to be an error).
     * </pre>
     *
     * <code>bool critical = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearCritical() {
      bitField0_ = (bitField0_ & ~0x00000002);
      critical_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Required. The value of this X.509 extension.
     * </pre>
     *
     * <code>bytes value = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * Required. The value of this X.509 extension.
     * </pre>
     *
     * <code>bytes value = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The value of this X.509 extension.
     * </pre>
     *
     * <code>bytes value = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = getDefaultInstance().getValue();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1.X509Extension)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1.X509Extension)
  private static final com.google.cloud.security.privateca.v1.X509Extension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.privateca.v1.X509Extension();
  }

  public static com.google.cloud.security.privateca.v1.X509Extension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<X509Extension>
      PARSER = new com.google.protobuf.AbstractParser<X509Extension>() {
    @java.lang.Override
    public X509Extension parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<X509Extension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<X509Extension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1.X509Extension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
