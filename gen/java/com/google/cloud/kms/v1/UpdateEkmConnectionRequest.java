// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/ekm_service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Request message for
 * [EkmService.UpdateEkmConnection][google.cloud.kms.v1.EkmService.UpdateEkmConnection].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.UpdateEkmConnectionRequest}
 */
public final class UpdateEkmConnectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.UpdateEkmConnectionRequest)
    UpdateEkmConnectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEkmConnectionRequest.newBuilder() to construct.
  private UpdateEkmConnectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEkmConnectionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEkmConnectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.UpdateEkmConnectionRequest.class, com.google.cloud.kms.v1.UpdateEkmConnectionRequest.Builder.class);
  }

  public static final int EKM_CONNECTION_FIELD_NUMBER = 1;
  private com.google.cloud.kms.v1.EkmConnection ekmConnection_;
  /**
   * <pre>
   * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
   * values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the ekmConnection field is set.
   */
  @java.lang.Override
  public boolean hasEkmConnection() {
    return ekmConnection_ != null;
  }
  /**
   * <pre>
   * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
   * values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The ekmConnection.
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.EkmConnection getEkmConnection() {
    return ekmConnection_ == null ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance() : ekmConnection_;
  }
  /**
   * <pre>
   * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
   * values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionOrBuilder() {
    return ekmConnection_ == null ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance() : ekmConnection_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (ekmConnection_ != null) {
      output.writeMessage(1, getEkmConnection());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ekmConnection_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEkmConnection());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.kms.v1.UpdateEkmConnectionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.UpdateEkmConnectionRequest other = (com.google.cloud.kms.v1.UpdateEkmConnectionRequest) obj;

    if (hasEkmConnection() != other.hasEkmConnection()) return false;
    if (hasEkmConnection()) {
      if (!getEkmConnection()
          .equals(other.getEkmConnection())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
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
    if (hasEkmConnection()) {
      hash = (37 * hash) + EKM_CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getEkmConnection().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.kms.v1.UpdateEkmConnectionRequest prototype) {
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
   * Request message for
   * [EkmService.UpdateEkmConnection][google.cloud.kms.v1.EkmService.UpdateEkmConnection].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.UpdateEkmConnectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.UpdateEkmConnectionRequest)
      com.google.cloud.kms.v1.UpdateEkmConnectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.UpdateEkmConnectionRequest.class, com.google.cloud.kms.v1.UpdateEkmConnectionRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.UpdateEkmConnectionRequest.newBuilder()
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
      ekmConnection_ = null;
      if (ekmConnectionBuilder_ != null) {
        ekmConnectionBuilder_.dispose();
        ekmConnectionBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateEkmConnectionRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.UpdateEkmConnectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateEkmConnectionRequest build() {
      com.google.cloud.kms.v1.UpdateEkmConnectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateEkmConnectionRequest buildPartial() {
      com.google.cloud.kms.v1.UpdateEkmConnectionRequest result = new com.google.cloud.kms.v1.UpdateEkmConnectionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.kms.v1.UpdateEkmConnectionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ekmConnection_ = ekmConnectionBuilder_ == null
            ? ekmConnection_
            : ekmConnectionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.kms.v1.UpdateEkmConnectionRequest) {
        return mergeFrom((com.google.cloud.kms.v1.UpdateEkmConnectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.UpdateEkmConnectionRequest other) {
      if (other == com.google.cloud.kms.v1.UpdateEkmConnectionRequest.getDefaultInstance()) return this;
      if (other.hasEkmConnection()) {
        mergeEkmConnection(other.getEkmConnection());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getEkmConnectionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.cloud.kms.v1.EkmConnection ekmConnection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.kms.v1.EkmConnection, com.google.cloud.kms.v1.EkmConnection.Builder, com.google.cloud.kms.v1.EkmConnectionOrBuilder> ekmConnectionBuilder_;
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the ekmConnection field is set.
     */
    public boolean hasEkmConnection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The ekmConnection.
     */
    public com.google.cloud.kms.v1.EkmConnection getEkmConnection() {
      if (ekmConnectionBuilder_ == null) {
        return ekmConnection_ == null ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance() : ekmConnection_;
      } else {
        return ekmConnectionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEkmConnection(com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ekmConnection_ = value;
      } else {
        ekmConnectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEkmConnection(
        com.google.cloud.kms.v1.EkmConnection.Builder builderForValue) {
      if (ekmConnectionBuilder_ == null) {
        ekmConnection_ = builderForValue.build();
      } else {
        ekmConnectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEkmConnection(com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          ekmConnection_ != null &&
          ekmConnection_ != com.google.cloud.kms.v1.EkmConnection.getDefaultInstance()) {
          getEkmConnectionBuilder().mergeFrom(value);
        } else {
          ekmConnection_ = value;
        }
      } else {
        ekmConnectionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEkmConnection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ekmConnection_ = null;
      if (ekmConnectionBuilder_ != null) {
        ekmConnectionBuilder_.dispose();
        ekmConnectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.kms.v1.EkmConnection.Builder getEkmConnectionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEkmConnectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionOrBuilder() {
      if (ekmConnectionBuilder_ != null) {
        return ekmConnectionBuilder_.getMessageOrBuilder();
      } else {
        return ekmConnection_ == null ?
            com.google.cloud.kms.v1.EkmConnection.getDefaultInstance() : ekmConnection_;
      }
    }
    /**
     * <pre>
     * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
     * values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.kms.v1.EkmConnection, com.google.cloud.kms.v1.EkmConnection.Builder, com.google.cloud.kms.v1.EkmConnectionOrBuilder> 
        getEkmConnectionFieldBuilder() {
      if (ekmConnectionBuilder_ == null) {
        ekmConnectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.EkmConnection, com.google.cloud.kms.v1.EkmConnection.Builder, com.google.cloud.kms.v1.EkmConnectionOrBuilder>(
                getEkmConnection(),
                getParentForChildren(),
                isClean());
        ekmConnection_ = null;
      }
      return ekmConnectionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.UpdateEkmConnectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.UpdateEkmConnectionRequest)
  private static final com.google.cloud.kms.v1.UpdateEkmConnectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.UpdateEkmConnectionRequest();
  }

  public static com.google.cloud.kms.v1.UpdateEkmConnectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEkmConnectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEkmConnectionRequest>() {
    @java.lang.Override
    public UpdateEkmConnectionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEkmConnectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEkmConnectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.UpdateEkmConnectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
