// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iap/v1/service.proto

package com.google.cloud.iap.v1;

/**
 * <pre>
 * The request to CreateTunnelDestGroup.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.CreateTunnelDestGroupRequest}
 */
public final class CreateTunnelDestGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.CreateTunnelDestGroupRequest)
    CreateTunnelDestGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTunnelDestGroupRequest.newBuilder() to construct.
  private CreateTunnelDestGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTunnelDestGroupRequest() {
    parent_ = "";
    tunnelDestGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTunnelDestGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CreateTunnelDestGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CreateTunnelDestGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.class, com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Google Cloud Project ID and location.
   * In the following format:
   * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Google Cloud Project ID and location.
   * In the following format:
   * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TUNNEL_DEST_GROUP_FIELD_NUMBER = 2;
  private com.google.cloud.iap.v1.TunnelDestGroup tunnelDestGroup_;
  /**
   * <pre>
   * Required. The TunnelDestGroup to create.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tunnelDestGroup field is set.
   */
  @java.lang.Override
  public boolean hasTunnelDestGroup() {
    return tunnelDestGroup_ != null;
  }
  /**
   * <pre>
   * Required. The TunnelDestGroup to create.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tunnelDestGroup.
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.TunnelDestGroup getTunnelDestGroup() {
    return tunnelDestGroup_ == null ? com.google.cloud.iap.v1.TunnelDestGroup.getDefaultInstance() : tunnelDestGroup_;
  }
  /**
   * <pre>
   * Required. The TunnelDestGroup to create.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.TunnelDestGroupOrBuilder getTunnelDestGroupOrBuilder() {
    return tunnelDestGroup_ == null ? com.google.cloud.iap.v1.TunnelDestGroup.getDefaultInstance() : tunnelDestGroup_;
  }

  public static final int TUNNEL_DEST_GROUP_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tunnelDestGroupId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the TunnelDestGroup, which becomes the final
   * component of the resource name.
   * This value must be 4-63 characters, and valid characters
   * are `[a-z]-`.
   * </pre>
   *
   * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tunnelDestGroupId.
   */
  @java.lang.Override
  public java.lang.String getTunnelDestGroupId() {
    java.lang.Object ref = tunnelDestGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tunnelDestGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the TunnelDestGroup, which becomes the final
   * component of the resource name.
   * This value must be 4-63 characters, and valid characters
   * are `[a-z]-`.
   * </pre>
   *
   * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tunnelDestGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTunnelDestGroupIdBytes() {
    java.lang.Object ref = tunnelDestGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tunnelDestGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (tunnelDestGroup_ != null) {
      output.writeMessage(2, getTunnelDestGroup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tunnelDestGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tunnelDestGroupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (tunnelDestGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTunnelDestGroup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tunnelDestGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tunnelDestGroupId_);
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
    if (!(obj instanceof com.google.cloud.iap.v1.CreateTunnelDestGroupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.CreateTunnelDestGroupRequest other = (com.google.cloud.iap.v1.CreateTunnelDestGroupRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasTunnelDestGroup() != other.hasTunnelDestGroup()) return false;
    if (hasTunnelDestGroup()) {
      if (!getTunnelDestGroup()
          .equals(other.getTunnelDestGroup())) return false;
    }
    if (!getTunnelDestGroupId()
        .equals(other.getTunnelDestGroupId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasTunnelDestGroup()) {
      hash = (37 * hash) + TUNNEL_DEST_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getTunnelDestGroup().hashCode();
    }
    hash = (37 * hash) + TUNNEL_DEST_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTunnelDestGroupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iap.v1.CreateTunnelDestGroupRequest prototype) {
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
   * The request to CreateTunnelDestGroup.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.CreateTunnelDestGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.CreateTunnelDestGroupRequest)
      com.google.cloud.iap.v1.CreateTunnelDestGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CreateTunnelDestGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CreateTunnelDestGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.class, com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.newBuilder()
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
      parent_ = "";
      tunnelDestGroup_ = null;
      if (tunnelDestGroupBuilder_ != null) {
        tunnelDestGroupBuilder_.dispose();
        tunnelDestGroupBuilder_ = null;
      }
      tunnelDestGroupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CreateTunnelDestGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CreateTunnelDestGroupRequest getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CreateTunnelDestGroupRequest build() {
      com.google.cloud.iap.v1.CreateTunnelDestGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CreateTunnelDestGroupRequest buildPartial() {
      com.google.cloud.iap.v1.CreateTunnelDestGroupRequest result = new com.google.cloud.iap.v1.CreateTunnelDestGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.CreateTunnelDestGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tunnelDestGroup_ = tunnelDestGroupBuilder_ == null
            ? tunnelDestGroup_
            : tunnelDestGroupBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tunnelDestGroupId_ = tunnelDestGroupId_;
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
      if (other instanceof com.google.cloud.iap.v1.CreateTunnelDestGroupRequest) {
        return mergeFrom((com.google.cloud.iap.v1.CreateTunnelDestGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.CreateTunnelDestGroupRequest other) {
      if (other == com.google.cloud.iap.v1.CreateTunnelDestGroupRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTunnelDestGroup()) {
        mergeTunnelDestGroup(other.getTunnelDestGroup());
      }
      if (!other.getTunnelDestGroupId().isEmpty()) {
        tunnelDestGroupId_ = other.tunnelDestGroupId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTunnelDestGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              tunnelDestGroupId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Google Cloud Project ID and location.
     * In the following format:
     * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Google Cloud Project ID and location.
     * In the following format:
     * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Google Cloud Project ID and location.
     * In the following format:
     * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Project ID and location.
     * In the following format:
     * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Project ID and location.
     * In the following format:
     * `projects/{project_number/id}/iap_tunnel/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.iap.v1.TunnelDestGroup tunnelDestGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iap.v1.TunnelDestGroup, com.google.cloud.iap.v1.TunnelDestGroup.Builder, com.google.cloud.iap.v1.TunnelDestGroupOrBuilder> tunnelDestGroupBuilder_;
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tunnelDestGroup field is set.
     */
    public boolean hasTunnelDestGroup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tunnelDestGroup.
     */
    public com.google.cloud.iap.v1.TunnelDestGroup getTunnelDestGroup() {
      if (tunnelDestGroupBuilder_ == null) {
        return tunnelDestGroup_ == null ? com.google.cloud.iap.v1.TunnelDestGroup.getDefaultInstance() : tunnelDestGroup_;
      } else {
        return tunnelDestGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTunnelDestGroup(com.google.cloud.iap.v1.TunnelDestGroup value) {
      if (tunnelDestGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tunnelDestGroup_ = value;
      } else {
        tunnelDestGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTunnelDestGroup(
        com.google.cloud.iap.v1.TunnelDestGroup.Builder builderForValue) {
      if (tunnelDestGroupBuilder_ == null) {
        tunnelDestGroup_ = builderForValue.build();
      } else {
        tunnelDestGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTunnelDestGroup(com.google.cloud.iap.v1.TunnelDestGroup value) {
      if (tunnelDestGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          tunnelDestGroup_ != null &&
          tunnelDestGroup_ != com.google.cloud.iap.v1.TunnelDestGroup.getDefaultInstance()) {
          getTunnelDestGroupBuilder().mergeFrom(value);
        } else {
          tunnelDestGroup_ = value;
        }
      } else {
        tunnelDestGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTunnelDestGroup() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tunnelDestGroup_ = null;
      if (tunnelDestGroupBuilder_ != null) {
        tunnelDestGroupBuilder_.dispose();
        tunnelDestGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.iap.v1.TunnelDestGroup.Builder getTunnelDestGroupBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTunnelDestGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.iap.v1.TunnelDestGroupOrBuilder getTunnelDestGroupOrBuilder() {
      if (tunnelDestGroupBuilder_ != null) {
        return tunnelDestGroupBuilder_.getMessageOrBuilder();
      } else {
        return tunnelDestGroup_ == null ?
            com.google.cloud.iap.v1.TunnelDestGroup.getDefaultInstance() : tunnelDestGroup_;
      }
    }
    /**
     * <pre>
     * Required. The TunnelDestGroup to create.
     * </pre>
     *
     * <code>.google.cloud.iap.v1.TunnelDestGroup tunnel_dest_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iap.v1.TunnelDestGroup, com.google.cloud.iap.v1.TunnelDestGroup.Builder, com.google.cloud.iap.v1.TunnelDestGroupOrBuilder> 
        getTunnelDestGroupFieldBuilder() {
      if (tunnelDestGroupBuilder_ == null) {
        tunnelDestGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.TunnelDestGroup, com.google.cloud.iap.v1.TunnelDestGroup.Builder, com.google.cloud.iap.v1.TunnelDestGroupOrBuilder>(
                getTunnelDestGroup(),
                getParentForChildren(),
                isClean());
        tunnelDestGroup_ = null;
      }
      return tunnelDestGroupBuilder_;
    }

    private java.lang.Object tunnelDestGroupId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the TunnelDestGroup, which becomes the final
     * component of the resource name.
     * This value must be 4-63 characters, and valid characters
     * are `[a-z]-`.
     * </pre>
     *
     * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tunnelDestGroupId.
     */
    public java.lang.String getTunnelDestGroupId() {
      java.lang.Object ref = tunnelDestGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tunnelDestGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the TunnelDestGroup, which becomes the final
     * component of the resource name.
     * This value must be 4-63 characters, and valid characters
     * are `[a-z]-`.
     * </pre>
     *
     * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for tunnelDestGroupId.
     */
    public com.google.protobuf.ByteString
        getTunnelDestGroupIdBytes() {
      java.lang.Object ref = tunnelDestGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tunnelDestGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the TunnelDestGroup, which becomes the final
     * component of the resource name.
     * This value must be 4-63 characters, and valid characters
     * are `[a-z]-`.
     * </pre>
     *
     * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The tunnelDestGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setTunnelDestGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tunnelDestGroupId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the TunnelDestGroup, which becomes the final
     * component of the resource name.
     * This value must be 4-63 characters, and valid characters
     * are `[a-z]-`.
     * </pre>
     *
     * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTunnelDestGroupId() {
      tunnelDestGroupId_ = getDefaultInstance().getTunnelDestGroupId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the TunnelDestGroup, which becomes the final
     * component of the resource name.
     * This value must be 4-63 characters, and valid characters
     * are `[a-z]-`.
     * </pre>
     *
     * <code>string tunnel_dest_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for tunnelDestGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setTunnelDestGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tunnelDestGroupId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.CreateTunnelDestGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.CreateTunnelDestGroupRequest)
  private static final com.google.cloud.iap.v1.CreateTunnelDestGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.CreateTunnelDestGroupRequest();
  }

  public static com.google.cloud.iap.v1.CreateTunnelDestGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTunnelDestGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTunnelDestGroupRequest>() {
    @java.lang.Override
    public CreateTunnelDestGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTunnelDestGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTunnelDestGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.CreateTunnelDestGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

