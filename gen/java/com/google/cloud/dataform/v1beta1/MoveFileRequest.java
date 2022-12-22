// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

/**
 * <pre>
 * `MoveFile` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.MoveFileRequest}
 */
public final class MoveFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.MoveFileRequest)
    MoveFileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MoveFileRequest.newBuilder() to construct.
  private MoveFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MoveFileRequest() {
    workspace_ = "";
    path_ = "";
    newPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MoveFileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_MoveFileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_MoveFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.MoveFileRequest.class, com.google.cloud.dataform.v1beta1.MoveFileRequest.Builder.class);
  }

  public static final int WORKSPACE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object workspace_ = "";
  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The workspace.
   */
  @java.lang.Override
  public java.lang.String getWorkspace() {
    java.lang.Object ref = workspace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workspace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workspace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkspaceBytes() {
    java.lang.Object ref = workspace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workspace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <pre>
   * Required. The file's full path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The file's full path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_PATH_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newPath_ = "";
  /**
   * <pre>
   * Required. The file's new path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The newPath.
   */
  @java.lang.Override
  public java.lang.String getNewPath() {
    java.lang.Object ref = newPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The file's new path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for newPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewPathBytes() {
    java.lang.Object ref = newPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newPath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workspace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, workspace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workspace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, workspace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newPath_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.MoveFileRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.MoveFileRequest other = (com.google.cloud.dataform.v1beta1.MoveFileRequest) obj;

    if (!getWorkspace()
        .equals(other.getWorkspace())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
    if (!getNewPath()
        .equals(other.getNewPath())) return false;
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
    hash = (37 * hash) + WORKSPACE_FIELD_NUMBER;
    hash = (53 * hash) + getWorkspace().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + NEW_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getNewPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.MoveFileRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataform.v1beta1.MoveFileRequest prototype) {
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
   * `MoveFile` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.MoveFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.MoveFileRequest)
      com.google.cloud.dataform.v1beta1.MoveFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_MoveFileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_MoveFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.MoveFileRequest.class, com.google.cloud.dataform.v1beta1.MoveFileRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.MoveFileRequest.newBuilder()
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
      workspace_ = "";
      path_ = "";
      newPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_MoveFileRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.MoveFileRequest getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.MoveFileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.MoveFileRequest build() {
      com.google.cloud.dataform.v1beta1.MoveFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.MoveFileRequest buildPartial() {
      com.google.cloud.dataform.v1beta1.MoveFileRequest result = new com.google.cloud.dataform.v1beta1.MoveFileRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1beta1.MoveFileRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workspace_ = workspace_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newPath_ = newPath_;
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
      if (other instanceof com.google.cloud.dataform.v1beta1.MoveFileRequest) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.MoveFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.MoveFileRequest other) {
      if (other == com.google.cloud.dataform.v1beta1.MoveFileRequest.getDefaultInstance()) return this;
      if (!other.getWorkspace().isEmpty()) {
        workspace_ = other.workspace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNewPath().isEmpty()) {
        newPath_ = other.newPath_;
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
              workspace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              path_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              newPath_ = input.readStringRequireUtf8();
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

    private java.lang.Object workspace_ = "";
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The workspace.
     */
    public java.lang.String getWorkspace() {
      java.lang.Object ref = workspace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workspace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for workspace.
     */
    public com.google.protobuf.ByteString
        getWorkspaceBytes() {
      java.lang.Object ref = workspace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workspace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The workspace to set.
     * @return This builder for chaining.
     */
    public Builder setWorkspace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      workspace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkspace() {
      workspace_ = getDefaultInstance().getWorkspace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for workspace to set.
     * @return This builder for chaining.
     */
    public Builder setWorkspaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      workspace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Required. The file's full path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The file's full path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The file's full path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The file's full path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The file's full path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      path_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object newPath_ = "";
    /**
     * <pre>
     * Required. The file's new path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The newPath.
     */
    public java.lang.String getNewPath() {
      java.lang.Object ref = newPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The file's new path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for newPath.
     */
    public com.google.protobuf.ByteString
        getNewPathBytes() {
      java.lang.Object ref = newPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The file's new path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The newPath to set.
     * @return This builder for chaining.
     */
    public Builder setNewPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newPath_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The file's new path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPath() {
      newPath_ = getDefaultInstance().getNewPath();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The file's new path including filename, relative to the workspace root.
     * </pre>
     *
     * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for newPath to set.
     * @return This builder for chaining.
     */
    public Builder setNewPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.MoveFileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.MoveFileRequest)
  private static final com.google.cloud.dataform.v1beta1.MoveFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.MoveFileRequest();
  }

  public static com.google.cloud.dataform.v1beta1.MoveFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MoveFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<MoveFileRequest>() {
    @java.lang.Override
    public MoveFileRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MoveFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MoveFileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.MoveFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
