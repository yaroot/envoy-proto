// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1/mesh.proto

package com.google.cloud.networkservices.v1;

/**
 * <pre>
 * Request used by the CreateMesh method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkservices.v1.CreateMeshRequest}
 */
public final class CreateMeshRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkservices.v1.CreateMeshRequest)
    CreateMeshRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMeshRequest.newBuilder() to construct.
  private CreateMeshRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMeshRequest() {
    parent_ = "";
    meshId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateMeshRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networkservices.v1.MeshProto.internal_static_google_cloud_networkservices_v1_CreateMeshRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkservices.v1.MeshProto.internal_static_google_cloud_networkservices_v1_CreateMeshRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkservices.v1.CreateMeshRequest.class, com.google.cloud.networkservices.v1.CreateMeshRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource of the Mesh. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. The parent resource of the Mesh. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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

  public static final int MESH_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object meshId_ = "";
  /**
   * <pre>
   * Required. Short name of the Mesh resource to be created.
   * </pre>
   *
   * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The meshId.
   */
  @java.lang.Override
  public java.lang.String getMeshId() {
    java.lang.Object ref = meshId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      meshId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Short name of the Mesh resource to be created.
   * </pre>
   *
   * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for meshId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMeshIdBytes() {
    java.lang.Object ref = meshId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      meshId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESH_FIELD_NUMBER = 3;
  private com.google.cloud.networkservices.v1.Mesh mesh_;
  /**
   * <pre>
   * Required. Mesh resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the mesh field is set.
   */
  @java.lang.Override
  public boolean hasMesh() {
    return mesh_ != null;
  }
  /**
   * <pre>
   * Required. Mesh resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The mesh.
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.Mesh getMesh() {
    return mesh_ == null ? com.google.cloud.networkservices.v1.Mesh.getDefaultInstance() : mesh_;
  }
  /**
   * <pre>
   * Required. Mesh resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.MeshOrBuilder getMeshOrBuilder() {
    return mesh_ == null ? com.google.cloud.networkservices.v1.Mesh.getDefaultInstance() : mesh_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(meshId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, meshId_);
    }
    if (mesh_ != null) {
      output.writeMessage(3, getMesh());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(meshId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, meshId_);
    }
    if (mesh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMesh());
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
    if (!(obj instanceof com.google.cloud.networkservices.v1.CreateMeshRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networkservices.v1.CreateMeshRequest other = (com.google.cloud.networkservices.v1.CreateMeshRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getMeshId()
        .equals(other.getMeshId())) return false;
    if (hasMesh() != other.hasMesh()) return false;
    if (hasMesh()) {
      if (!getMesh()
          .equals(other.getMesh())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + MESH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMeshId().hashCode();
    if (hasMesh()) {
      hash = (37 * hash) + MESH_FIELD_NUMBER;
      hash = (53 * hash) + getMesh().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkservices.v1.CreateMeshRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networkservices.v1.CreateMeshRequest prototype) {
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
   * Request used by the CreateMesh method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkservices.v1.CreateMeshRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkservices.v1.CreateMeshRequest)
      com.google.cloud.networkservices.v1.CreateMeshRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networkservices.v1.MeshProto.internal_static_google_cloud_networkservices_v1_CreateMeshRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkservices.v1.MeshProto.internal_static_google_cloud_networkservices_v1_CreateMeshRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkservices.v1.CreateMeshRequest.class, com.google.cloud.networkservices.v1.CreateMeshRequest.Builder.class);
    }

    // Construct using com.google.cloud.networkservices.v1.CreateMeshRequest.newBuilder()
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
      meshId_ = "";
      mesh_ = null;
      if (meshBuilder_ != null) {
        meshBuilder_.dispose();
        meshBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networkservices.v1.MeshProto.internal_static_google_cloud_networkservices_v1_CreateMeshRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateMeshRequest getDefaultInstanceForType() {
      return com.google.cloud.networkservices.v1.CreateMeshRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateMeshRequest build() {
      com.google.cloud.networkservices.v1.CreateMeshRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateMeshRequest buildPartial() {
      com.google.cloud.networkservices.v1.CreateMeshRequest result = new com.google.cloud.networkservices.v1.CreateMeshRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networkservices.v1.CreateMeshRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.meshId_ = meshId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mesh_ = meshBuilder_ == null
            ? mesh_
            : meshBuilder_.build();
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
      if (other instanceof com.google.cloud.networkservices.v1.CreateMeshRequest) {
        return mergeFrom((com.google.cloud.networkservices.v1.CreateMeshRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkservices.v1.CreateMeshRequest other) {
      if (other == com.google.cloud.networkservices.v1.CreateMeshRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMeshId().isEmpty()) {
        meshId_ = other.meshId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasMesh()) {
        mergeMesh(other.getMesh());
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
              meshId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getMeshFieldBuilder().getBuilder(),
                  extensionRegistry);
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
     * Required. The parent resource of the Mesh. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the Mesh. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the Mesh. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the Mesh. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the Mesh. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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

    private java.lang.Object meshId_ = "";
    /**
     * <pre>
     * Required. Short name of the Mesh resource to be created.
     * </pre>
     *
     * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The meshId.
     */
    public java.lang.String getMeshId() {
      java.lang.Object ref = meshId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        meshId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the Mesh resource to be created.
     * </pre>
     *
     * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for meshId.
     */
    public com.google.protobuf.ByteString
        getMeshIdBytes() {
      java.lang.Object ref = meshId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        meshId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the Mesh resource to be created.
     * </pre>
     *
     * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The meshId to set.
     * @return This builder for chaining.
     */
    public Builder setMeshId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      meshId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the Mesh resource to be created.
     * </pre>
     *
     * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMeshId() {
      meshId_ = getDefaultInstance().getMeshId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the Mesh resource to be created.
     * </pre>
     *
     * <code>string mesh_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for meshId to set.
     * @return This builder for chaining.
     */
    public Builder setMeshIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      meshId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.networkservices.v1.Mesh mesh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networkservices.v1.Mesh, com.google.cloud.networkservices.v1.Mesh.Builder, com.google.cloud.networkservices.v1.MeshOrBuilder> meshBuilder_;
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the mesh field is set.
     */
    public boolean hasMesh() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The mesh.
     */
    public com.google.cloud.networkservices.v1.Mesh getMesh() {
      if (meshBuilder_ == null) {
        return mesh_ == null ? com.google.cloud.networkservices.v1.Mesh.getDefaultInstance() : mesh_;
      } else {
        return meshBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMesh(com.google.cloud.networkservices.v1.Mesh value) {
      if (meshBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mesh_ = value;
      } else {
        meshBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMesh(
        com.google.cloud.networkservices.v1.Mesh.Builder builderForValue) {
      if (meshBuilder_ == null) {
        mesh_ = builderForValue.build();
      } else {
        meshBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeMesh(com.google.cloud.networkservices.v1.Mesh value) {
      if (meshBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          mesh_ != null &&
          mesh_ != com.google.cloud.networkservices.v1.Mesh.getDefaultInstance()) {
          getMeshBuilder().mergeFrom(value);
        } else {
          mesh_ = value;
        }
      } else {
        meshBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMesh() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mesh_ = null;
      if (meshBuilder_ != null) {
        meshBuilder_.dispose();
        meshBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networkservices.v1.Mesh.Builder getMeshBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMeshFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networkservices.v1.MeshOrBuilder getMeshOrBuilder() {
      if (meshBuilder_ != null) {
        return meshBuilder_.getMessageOrBuilder();
      } else {
        return mesh_ == null ?
            com.google.cloud.networkservices.v1.Mesh.getDefaultInstance() : mesh_;
      }
    }
    /**
     * <pre>
     * Required. Mesh resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.Mesh mesh = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networkservices.v1.Mesh, com.google.cloud.networkservices.v1.Mesh.Builder, com.google.cloud.networkservices.v1.MeshOrBuilder> 
        getMeshFieldBuilder() {
      if (meshBuilder_ == null) {
        meshBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkservices.v1.Mesh, com.google.cloud.networkservices.v1.Mesh.Builder, com.google.cloud.networkservices.v1.MeshOrBuilder>(
                getMesh(),
                getParentForChildren(),
                isClean());
        mesh_ = null;
      }
      return meshBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networkservices.v1.CreateMeshRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkservices.v1.CreateMeshRequest)
  private static final com.google.cloud.networkservices.v1.CreateMeshRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkservices.v1.CreateMeshRequest();
  }

  public static com.google.cloud.networkservices.v1.CreateMeshRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMeshRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateMeshRequest>() {
    @java.lang.Override
    public CreateMeshRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMeshRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMeshRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkservices.v1.CreateMeshRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
