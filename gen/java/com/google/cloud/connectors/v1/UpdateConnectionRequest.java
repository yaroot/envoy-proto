// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/connectors/v1/connection.proto

package com.google.cloud.connectors.v1;

/**
 * <pre>
 * Request message for ConnectorsService.UpdateConnection
 * </pre>
 *
 * Protobuf type {@code google.cloud.connectors.v1.UpdateConnectionRequest}
 */
public final class UpdateConnectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.connectors.v1.UpdateConnectionRequest)
    UpdateConnectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateConnectionRequest.newBuilder() to construct.
  private UpdateConnectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateConnectionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateConnectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_UpdateConnectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_UpdateConnectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.connectors.v1.UpdateConnectionRequest.class, com.google.cloud.connectors.v1.UpdateConnectionRequest.Builder.class);
  }

  public static final int CONNECTION_FIELD_NUMBER = 1;
  private com.google.cloud.connectors.v1.Connection connection_;
  /**
   * <pre>
   * Required. Connection resource.
   * </pre>
   *
   * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the connection field is set.
   */
  @java.lang.Override
  public boolean hasConnection() {
    return connection_ != null;
  }
  /**
   * <pre>
   * Required. Connection resource.
   * </pre>
   *
   * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The connection.
   */
  @java.lang.Override
  public com.google.cloud.connectors.v1.Connection getConnection() {
    return connection_ == null ? com.google.cloud.connectors.v1.Connection.getDefaultInstance() : connection_;
  }
  /**
   * <pre>
   * Required. Connection resource.
   * </pre>
   *
   * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.connectors.v1.ConnectionOrBuilder getConnectionOrBuilder() {
    return connection_ == null ? com.google.cloud.connectors.v1.Connection.getDefaultInstance() : connection_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Connection resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
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
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Connection resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
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
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Connection resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
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
    if (connection_ != null) {
      output.writeMessage(1, getConnection());
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
    if (connection_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConnection());
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
    if (!(obj instanceof com.google.cloud.connectors.v1.UpdateConnectionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.connectors.v1.UpdateConnectionRequest other = (com.google.cloud.connectors.v1.UpdateConnectionRequest) obj;

    if (hasConnection() != other.hasConnection()) return false;
    if (hasConnection()) {
      if (!getConnection()
          .equals(other.getConnection())) return false;
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
    if (hasConnection()) {
      hash = (37 * hash) + CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getConnection().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.UpdateConnectionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.connectors.v1.UpdateConnectionRequest prototype) {
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
   * Request message for ConnectorsService.UpdateConnection
   * </pre>
   *
   * Protobuf type {@code google.cloud.connectors.v1.UpdateConnectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.connectors.v1.UpdateConnectionRequest)
      com.google.cloud.connectors.v1.UpdateConnectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_UpdateConnectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_UpdateConnectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.connectors.v1.UpdateConnectionRequest.class, com.google.cloud.connectors.v1.UpdateConnectionRequest.Builder.class);
    }

    // Construct using com.google.cloud.connectors.v1.UpdateConnectionRequest.newBuilder()
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
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
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
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_UpdateConnectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.UpdateConnectionRequest getDefaultInstanceForType() {
      return com.google.cloud.connectors.v1.UpdateConnectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.UpdateConnectionRequest build() {
      com.google.cloud.connectors.v1.UpdateConnectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.UpdateConnectionRequest buildPartial() {
      com.google.cloud.connectors.v1.UpdateConnectionRequest result = new com.google.cloud.connectors.v1.UpdateConnectionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.connectors.v1.UpdateConnectionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connection_ = connectionBuilder_ == null
            ? connection_
            : connectionBuilder_.build();
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
      if (other instanceof com.google.cloud.connectors.v1.UpdateConnectionRequest) {
        return mergeFrom((com.google.cloud.connectors.v1.UpdateConnectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.connectors.v1.UpdateConnectionRequest other) {
      if (other == com.google.cloud.connectors.v1.UpdateConnectionRequest.getDefaultInstance()) return this;
      if (other.hasConnection()) {
        mergeConnection(other.getConnection());
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
                  getConnectionFieldBuilder().getBuilder(),
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

    private com.google.cloud.connectors.v1.Connection connection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.connectors.v1.Connection, com.google.cloud.connectors.v1.Connection.Builder, com.google.cloud.connectors.v1.ConnectionOrBuilder> connectionBuilder_;
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the connection field is set.
     */
    public boolean hasConnection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The connection.
     */
    public com.google.cloud.connectors.v1.Connection getConnection() {
      if (connectionBuilder_ == null) {
        return connection_ == null ? com.google.cloud.connectors.v1.Connection.getDefaultInstance() : connection_;
      } else {
        return connectionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setConnection(com.google.cloud.connectors.v1.Connection value) {
      if (connectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connection_ = value;
      } else {
        connectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setConnection(
        com.google.cloud.connectors.v1.Connection.Builder builderForValue) {
      if (connectionBuilder_ == null) {
        connection_ = builderForValue.build();
      } else {
        connectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeConnection(com.google.cloud.connectors.v1.Connection value) {
      if (connectionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          connection_ != null &&
          connection_ != com.google.cloud.connectors.v1.Connection.getDefaultInstance()) {
          getConnectionBuilder().mergeFrom(value);
        } else {
          connection_ = value;
        }
      } else {
        connectionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearConnection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.connectors.v1.Connection.Builder getConnectionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConnectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.connectors.v1.ConnectionOrBuilder getConnectionOrBuilder() {
      if (connectionBuilder_ != null) {
        return connectionBuilder_.getMessageOrBuilder();
      } else {
        return connection_ == null ?
            com.google.cloud.connectors.v1.Connection.getDefaultInstance() : connection_;
      }
    }
    /**
     * <pre>
     * Required. Connection resource.
     * </pre>
     *
     * <code>.google.cloud.connectors.v1.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.connectors.v1.Connection, com.google.cloud.connectors.v1.Connection.Builder, com.google.cloud.connectors.v1.ConnectionOrBuilder> 
        getConnectionFieldBuilder() {
      if (connectionBuilder_ == null) {
        connectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.connectors.v1.Connection, com.google.cloud.connectors.v1.Connection.Builder, com.google.cloud.connectors.v1.ConnectionOrBuilder>(
                getConnection(),
                getParentForChildren(),
                isClean());
        connection_ = null;
      }
      return connectionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Connection resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.connectors.v1.UpdateConnectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.connectors.v1.UpdateConnectionRequest)
  private static final com.google.cloud.connectors.v1.UpdateConnectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.connectors.v1.UpdateConnectionRequest();
  }

  public static com.google.cloud.connectors.v1.UpdateConnectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConnectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateConnectionRequest>() {
    @java.lang.Override
    public UpdateConnectionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateConnectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConnectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.connectors.v1.UpdateConnectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
