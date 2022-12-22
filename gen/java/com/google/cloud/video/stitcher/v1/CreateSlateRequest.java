// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Request message for VideoStitcherService.createSlate.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.CreateSlateRequest}
 */
public final class CreateSlateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.CreateSlateRequest)
    CreateSlateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSlateRequest.newBuilder() to construct.
  private CreateSlateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSlateRequest() {
    parent_ = "";
    slateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSlateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateSlateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateSlateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.CreateSlateRequest.class, com.google.cloud.video.stitcher.v1.CreateSlateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The project in which the slate should be created, in the form of
   * `projects/{project_number}`.
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
   * Required. The project in which the slate should be created, in the form of
   * `projects/{project_number}`.
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

  public static final int SLATE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object slateId_ = "";
  /**
   * <pre>
   * Required. The unique identifier for the slate.
   * This value should conform to RFC-1034, which restricts to
   * lower-case letters, numbers, and hyphen, with the first character a
   * letter, the last a letter or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The slateId.
   */
  @java.lang.Override
  public java.lang.String getSlateId() {
    java.lang.Object ref = slateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      slateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The unique identifier for the slate.
   * This value should conform to RFC-1034, which restricts to
   * lower-case letters, numbers, and hyphen, with the first character a
   * letter, the last a letter or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for slateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSlateIdBytes() {
    java.lang.Object ref = slateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      slateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SLATE_FIELD_NUMBER = 3;
  private com.google.cloud.video.stitcher.v1.Slate slate_;
  /**
   * <pre>
   * Required. The slate to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the slate field is set.
   */
  @java.lang.Override
  public boolean hasSlate() {
    return slate_ != null;
  }
  /**
   * <pre>
   * Required. The slate to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The slate.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.Slate getSlate() {
    return slate_ == null ? com.google.cloud.video.stitcher.v1.Slate.getDefaultInstance() : slate_;
  }
  /**
   * <pre>
   * Required. The slate to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.SlateOrBuilder getSlateOrBuilder() {
    return slate_ == null ? com.google.cloud.video.stitcher.v1.Slate.getDefaultInstance() : slate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, slateId_);
    }
    if (slate_ != null) {
      output.writeMessage(3, getSlate());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, slateId_);
    }
    if (slate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSlate());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.CreateSlateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.CreateSlateRequest other = (com.google.cloud.video.stitcher.v1.CreateSlateRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getSlateId()
        .equals(other.getSlateId())) return false;
    if (hasSlate() != other.hasSlate()) return false;
    if (hasSlate()) {
      if (!getSlate()
          .equals(other.getSlate())) return false;
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
    hash = (37 * hash) + SLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSlateId().hashCode();
    if (hasSlate()) {
      hash = (37 * hash) + SLATE_FIELD_NUMBER;
      hash = (53 * hash) + getSlate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.CreateSlateRequest prototype) {
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
   * Request message for VideoStitcherService.createSlate.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.CreateSlateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.CreateSlateRequest)
      com.google.cloud.video.stitcher.v1.CreateSlateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateSlateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateSlateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.CreateSlateRequest.class, com.google.cloud.video.stitcher.v1.CreateSlateRequest.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.CreateSlateRequest.newBuilder()
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
      slateId_ = "";
      slate_ = null;
      if (slateBuilder_ != null) {
        slateBuilder_.dispose();
        slateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateSlateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateSlateRequest getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.CreateSlateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateSlateRequest build() {
      com.google.cloud.video.stitcher.v1.CreateSlateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateSlateRequest buildPartial() {
      com.google.cloud.video.stitcher.v1.CreateSlateRequest result = new com.google.cloud.video.stitcher.v1.CreateSlateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.CreateSlateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.slateId_ = slateId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.slate_ = slateBuilder_ == null
            ? slate_
            : slateBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.CreateSlateRequest) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.CreateSlateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.CreateSlateRequest other) {
      if (other == com.google.cloud.video.stitcher.v1.CreateSlateRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSlateId().isEmpty()) {
        slateId_ = other.slateId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSlate()) {
        mergeSlate(other.getSlate());
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
              slateId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSlateFieldBuilder().getBuilder(),
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
     * Required. The project in which the slate should be created, in the form of
     * `projects/{project_number}`.
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
     * Required. The project in which the slate should be created, in the form of
     * `projects/{project_number}`.
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
     * Required. The project in which the slate should be created, in the form of
     * `projects/{project_number}`.
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
     * Required. The project in which the slate should be created, in the form of
     * `projects/{project_number}`.
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
     * Required. The project in which the slate should be created, in the form of
     * `projects/{project_number}`.
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

    private java.lang.Object slateId_ = "";
    /**
     * <pre>
     * Required. The unique identifier for the slate.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The slateId.
     */
    public java.lang.String getSlateId() {
      java.lang.Object ref = slateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        slateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique identifier for the slate.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for slateId.
     */
    public com.google.protobuf.ByteString
        getSlateIdBytes() {
      java.lang.Object ref = slateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        slateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique identifier for the slate.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The slateId to set.
     * @return This builder for chaining.
     */
    public Builder setSlateId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      slateId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique identifier for the slate.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSlateId() {
      slateId_ = getDefaultInstance().getSlateId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique identifier for the slate.
     * This value should conform to RFC-1034, which restricts to
     * lower-case letters, numbers, and hyphen, with the first character a
     * letter, the last a letter or a number, and a 63 character maximum.
     * </pre>
     *
     * <code>string slate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for slateId to set.
     * @return This builder for chaining.
     */
    public Builder setSlateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      slateId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.video.stitcher.v1.Slate slate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.Slate, com.google.cloud.video.stitcher.v1.Slate.Builder, com.google.cloud.video.stitcher.v1.SlateOrBuilder> slateBuilder_;
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the slate field is set.
     */
    public boolean hasSlate() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The slate.
     */
    public com.google.cloud.video.stitcher.v1.Slate getSlate() {
      if (slateBuilder_ == null) {
        return slate_ == null ? com.google.cloud.video.stitcher.v1.Slate.getDefaultInstance() : slate_;
      } else {
        return slateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSlate(com.google.cloud.video.stitcher.v1.Slate value) {
      if (slateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        slate_ = value;
      } else {
        slateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSlate(
        com.google.cloud.video.stitcher.v1.Slate.Builder builderForValue) {
      if (slateBuilder_ == null) {
        slate_ = builderForValue.build();
      } else {
        slateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSlate(com.google.cloud.video.stitcher.v1.Slate value) {
      if (slateBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          slate_ != null &&
          slate_ != com.google.cloud.video.stitcher.v1.Slate.getDefaultInstance()) {
          getSlateBuilder().mergeFrom(value);
        } else {
          slate_ = value;
        }
      } else {
        slateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSlate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      slate_ = null;
      if (slateBuilder_ != null) {
        slateBuilder_.dispose();
        slateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.video.stitcher.v1.Slate.Builder getSlateBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSlateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.video.stitcher.v1.SlateOrBuilder getSlateOrBuilder() {
      if (slateBuilder_ != null) {
        return slateBuilder_.getMessageOrBuilder();
      } else {
        return slate_ == null ?
            com.google.cloud.video.stitcher.v1.Slate.getDefaultInstance() : slate_;
      }
    }
    /**
     * <pre>
     * Required. The slate to create.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.Slate slate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.Slate, com.google.cloud.video.stitcher.v1.Slate.Builder, com.google.cloud.video.stitcher.v1.SlateOrBuilder> 
        getSlateFieldBuilder() {
      if (slateBuilder_ == null) {
        slateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.Slate, com.google.cloud.video.stitcher.v1.Slate.Builder, com.google.cloud.video.stitcher.v1.SlateOrBuilder>(
                getSlate(),
                getParentForChildren(),
                isClean());
        slate_ = null;
      }
      return slateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.CreateSlateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.CreateSlateRequest)
  private static final com.google.cloud.video.stitcher.v1.CreateSlateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.CreateSlateRequest();
  }

  public static com.google.cloud.video.stitcher.v1.CreateSlateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSlateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSlateRequest>() {
    @java.lang.Override
    public CreateSlateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSlateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSlateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CreateSlateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

