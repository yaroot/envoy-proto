// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Request message for VideoStitcherService.createCdnKey.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.CreateCdnKeyRequest}
 */
public final class CreateCdnKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.CreateCdnKeyRequest)
    CreateCdnKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCdnKeyRequest.newBuilder() to construct.
  private CreateCdnKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCdnKeyRequest() {
    parent_ = "";
    cdnKeyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCdnKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateCdnKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateCdnKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.class, com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The project in which the CDN key should be created, in the form of
   * `projects/{project_number}/locations/{location}`.
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
   * Required. The project in which the CDN key should be created, in the form of
   * `projects/{project_number}/locations/{location}`.
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

  public static final int CDN_KEY_FIELD_NUMBER = 2;
  private com.google.cloud.video.stitcher.v1.CdnKey cdnKey_;
  /**
   * <pre>
   * Required. The CDN key resource to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the cdnKey field is set.
   */
  @java.lang.Override
  public boolean hasCdnKey() {
    return cdnKey_ != null;
  }
  /**
   * <pre>
   * Required. The CDN key resource to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cdnKey.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CdnKey getCdnKey() {
    return cdnKey_ == null ? com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance() : cdnKey_;
  }
  /**
   * <pre>
   * Required. The CDN key resource to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder getCdnKeyOrBuilder() {
    return cdnKey_ == null ? com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance() : cdnKey_;
  }

  public static final int CDN_KEY_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cdnKeyId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the CDN key, which will become the final component of
   * the CDN key's resource name.
   * This value should conform to RFC-1034, which restricts to
   * lower-case letters, numbers, and hyphen, with the first character a
   * letter, the last a letter or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cdnKeyId.
   */
  @java.lang.Override
  public java.lang.String getCdnKeyId() {
    java.lang.Object ref = cdnKeyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cdnKeyId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the CDN key, which will become the final component of
   * the CDN key's resource name.
   * This value should conform to RFC-1034, which restricts to
   * lower-case letters, numbers, and hyphen, with the first character a
   * letter, the last a letter or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for cdnKeyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCdnKeyIdBytes() {
    java.lang.Object ref = cdnKeyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cdnKeyId_ = b;
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
    if (cdnKey_ != null) {
      output.writeMessage(2, getCdnKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cdnKeyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cdnKeyId_);
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
    if (cdnKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCdnKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cdnKeyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cdnKeyId_);
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest other = (com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasCdnKey() != other.hasCdnKey()) return false;
    if (hasCdnKey()) {
      if (!getCdnKey()
          .equals(other.getCdnKey())) return false;
    }
    if (!getCdnKeyId()
        .equals(other.getCdnKeyId())) return false;
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
    if (hasCdnKey()) {
      hash = (37 * hash) + CDN_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getCdnKey().hashCode();
    }
    hash = (37 * hash) + CDN_KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCdnKeyId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest prototype) {
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
   * Request message for VideoStitcherService.createCdnKey.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.CreateCdnKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.CreateCdnKeyRequest)
      com.google.cloud.video.stitcher.v1.CreateCdnKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateCdnKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateCdnKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.class, com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.newBuilder()
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
      cdnKey_ = null;
      if (cdnKeyBuilder_ != null) {
        cdnKeyBuilder_.dispose();
        cdnKeyBuilder_ = null;
      }
      cdnKeyId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateCdnKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest build() {
      com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest buildPartial() {
      com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest result = new com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cdnKey_ = cdnKeyBuilder_ == null
            ? cdnKey_
            : cdnKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cdnKeyId_ = cdnKeyId_;
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
      if (other instanceof com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest other) {
      if (other == com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCdnKey()) {
        mergeCdnKey(other.getCdnKey());
      }
      if (!other.getCdnKeyId().isEmpty()) {
        cdnKeyId_ = other.cdnKeyId_;
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
                  getCdnKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              cdnKeyId_ = input.readStringRequireUtf8();
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
     * Required. The project in which the CDN key should be created, in the form of
     * `projects/{project_number}/locations/{location}`.
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
     * Required. The project in which the CDN key should be created, in the form of
     * `projects/{project_number}/locations/{location}`.
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
     * Required. The project in which the CDN key should be created, in the form of
     * `projects/{project_number}/locations/{location}`.
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
     * Required. The project in which the CDN key should be created, in the form of
     * `projects/{project_number}/locations/{location}`.
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
     * Required. The project in which the CDN key should be created, in the form of
     * `projects/{project_number}/locations/{location}`.
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

    private com.google.cloud.video.stitcher.v1.CdnKey cdnKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.CdnKey, com.google.cloud.video.stitcher.v1.CdnKey.Builder, com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder> cdnKeyBuilder_;
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the cdnKey field is set.
     */
    public boolean hasCdnKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The cdnKey.
     */
    public com.google.cloud.video.stitcher.v1.CdnKey getCdnKey() {
      if (cdnKeyBuilder_ == null) {
        return cdnKey_ == null ? com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance() : cdnKey_;
      } else {
        return cdnKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCdnKey(com.google.cloud.video.stitcher.v1.CdnKey value) {
      if (cdnKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cdnKey_ = value;
      } else {
        cdnKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCdnKey(
        com.google.cloud.video.stitcher.v1.CdnKey.Builder builderForValue) {
      if (cdnKeyBuilder_ == null) {
        cdnKey_ = builderForValue.build();
      } else {
        cdnKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCdnKey(com.google.cloud.video.stitcher.v1.CdnKey value) {
      if (cdnKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          cdnKey_ != null &&
          cdnKey_ != com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance()) {
          getCdnKeyBuilder().mergeFrom(value);
        } else {
          cdnKey_ = value;
        }
      } else {
        cdnKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCdnKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cdnKey_ = null;
      if (cdnKeyBuilder_ != null) {
        cdnKeyBuilder_.dispose();
        cdnKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.video.stitcher.v1.CdnKey.Builder getCdnKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCdnKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder getCdnKeyOrBuilder() {
      if (cdnKeyBuilder_ != null) {
        return cdnKeyBuilder_.getMessageOrBuilder();
      } else {
        return cdnKey_ == null ?
            com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance() : cdnKey_;
      }
    }
    /**
     * <pre>
     * Required. The CDN key resource to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.CdnKey, com.google.cloud.video.stitcher.v1.CdnKey.Builder, com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder> 
        getCdnKeyFieldBuilder() {
      if (cdnKeyBuilder_ == null) {
        cdnKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.CdnKey, com.google.cloud.video.stitcher.v1.CdnKey.Builder, com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder>(
                getCdnKey(),
                getParentForChildren(),
                isClean());
        cdnKey_ = null;
      }
      return cdnKeyBuilder_;
    }

    private java.lang.Object cdnKeyId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the CDN key, which will become the final component of
     * the CDN key's resource name.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The cdnKeyId.
     */
    public java.lang.String getCdnKeyId() {
      java.lang.Object ref = cdnKeyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cdnKeyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the CDN key, which will become the final component of
     * the CDN key's resource name.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for cdnKeyId.
     */
    public com.google.protobuf.ByteString
        getCdnKeyIdBytes() {
      java.lang.Object ref = cdnKeyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cdnKeyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the CDN key, which will become the final component of
     * the CDN key's resource name.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The cdnKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setCdnKeyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cdnKeyId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the CDN key, which will become the final component of
     * the CDN key's resource name.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCdnKeyId() {
      cdnKeyId_ = getDefaultInstance().getCdnKeyId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the CDN key, which will become the final component of
     * the CDN key's resource name.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for cdnKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setCdnKeyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cdnKeyId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.CreateCdnKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.CreateCdnKeyRequest)
  private static final com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest();
  }

  public static com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCdnKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCdnKeyRequest>() {
    @java.lang.Override
    public CreateCdnKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCdnKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCdnKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CreateCdnKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

