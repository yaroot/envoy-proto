// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

/**
 * <pre>
 * Request message for ListObjectAccessControls.
 * </pre>
 *
 * Protobuf type {@code google.storage.v1.ListObjectAccessControlsRequest}
 */
public final class ListObjectAccessControlsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.storage.v1.ListObjectAccessControlsRequest)
    ListObjectAccessControlsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListObjectAccessControlsRequest.newBuilder() to construct.
  private ListObjectAccessControlsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListObjectAccessControlsRequest() {
    bucket_ = "";
    object_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListObjectAccessControlsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.storage.v1.Storage.internal_static_google_storage_v1_ListObjectAccessControlsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v1.Storage.internal_static_google_storage_v1_ListObjectAccessControlsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v1.ListObjectAccessControlsRequest.class, com.google.storage.v1.ListObjectAccessControlsRequest.Builder.class);
  }

  public static final int BUCKET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bucket_ = "";
  /**
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bucket.
   */
  @java.lang.Override
  public java.lang.String getBucket() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for bucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketBytes() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object object_ = "";
  /**
   * <pre>
   * Required. Name of the object.
   * </pre>
   *
   * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The object.
   */
  @java.lang.Override
  public java.lang.String getObject() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      object_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Name of the object.
   * </pre>
   *
   * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for object.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectBytes() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      object_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENERATION_FIELD_NUMBER = 3;
  private long generation_ = 0L;
  /**
   * <pre>
   * If present, selects a specific revision of this object (as opposed to the
   * latest version, the default).
   * </pre>
   *
   * <code>int64 generation = 3;</code>
   * @return The generation.
   */
  @java.lang.Override
  public long getGeneration() {
    return generation_;
  }

  public static final int COMMON_REQUEST_PARAMS_FIELD_NUMBER = 5;
  private com.google.storage.v1.CommonRequestParams commonRequestParams_;
  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
   * @return Whether the commonRequestParams field is set.
   */
  @java.lang.Override
  public boolean hasCommonRequestParams() {
    return commonRequestParams_ != null;
  }
  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
   * @return The commonRequestParams.
   */
  @java.lang.Override
  public com.google.storage.v1.CommonRequestParams getCommonRequestParams() {
    return commonRequestParams_ == null ? com.google.storage.v1.CommonRequestParams.getDefaultInstance() : commonRequestParams_;
  }
  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
   */
  @java.lang.Override
  public com.google.storage.v1.CommonRequestParamsOrBuilder getCommonRequestParamsOrBuilder() {
    return commonRequestParams_ == null ? com.google.storage.v1.CommonRequestParams.getDefaultInstance() : commonRequestParams_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(object_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, object_);
    }
    if (generation_ != 0L) {
      output.writeInt64(3, generation_);
    }
    if (commonRequestParams_ != null) {
      output.writeMessage(5, getCommonRequestParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(object_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, object_);
    }
    if (generation_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, generation_);
    }
    if (commonRequestParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCommonRequestParams());
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
    if (!(obj instanceof com.google.storage.v1.ListObjectAccessControlsRequest)) {
      return super.equals(obj);
    }
    com.google.storage.v1.ListObjectAccessControlsRequest other = (com.google.storage.v1.ListObjectAccessControlsRequest) obj;

    if (!getBucket()
        .equals(other.getBucket())) return false;
    if (!getObject()
        .equals(other.getObject())) return false;
    if (getGeneration()
        != other.getGeneration()) return false;
    if (hasCommonRequestParams() != other.hasCommonRequestParams()) return false;
    if (hasCommonRequestParams()) {
      if (!getCommonRequestParams()
          .equals(other.getCommonRequestParams())) return false;
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
    hash = (37 * hash) + BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getBucket().hashCode();
    hash = (37 * hash) + OBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getObject().hashCode();
    hash = (37 * hash) + GENERATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGeneration());
    if (hasCommonRequestParams()) {
      hash = (37 * hash) + COMMON_REQUEST_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonRequestParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.storage.v1.ListObjectAccessControlsRequest parseFrom(
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
  public static Builder newBuilder(com.google.storage.v1.ListObjectAccessControlsRequest prototype) {
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
   * Request message for ListObjectAccessControls.
   * </pre>
   *
   * Protobuf type {@code google.storage.v1.ListObjectAccessControlsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.storage.v1.ListObjectAccessControlsRequest)
      com.google.storage.v1.ListObjectAccessControlsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.storage.v1.Storage.internal_static_google_storage_v1_ListObjectAccessControlsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v1.Storage.internal_static_google_storage_v1_ListObjectAccessControlsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v1.ListObjectAccessControlsRequest.class, com.google.storage.v1.ListObjectAccessControlsRequest.Builder.class);
    }

    // Construct using com.google.storage.v1.ListObjectAccessControlsRequest.newBuilder()
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
      bucket_ = "";
      object_ = "";
      generation_ = 0L;
      commonRequestParams_ = null;
      if (commonRequestParamsBuilder_ != null) {
        commonRequestParamsBuilder_.dispose();
        commonRequestParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.storage.v1.Storage.internal_static_google_storage_v1_ListObjectAccessControlsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v1.ListObjectAccessControlsRequest getDefaultInstanceForType() {
      return com.google.storage.v1.ListObjectAccessControlsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v1.ListObjectAccessControlsRequest build() {
      com.google.storage.v1.ListObjectAccessControlsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v1.ListObjectAccessControlsRequest buildPartial() {
      com.google.storage.v1.ListObjectAccessControlsRequest result = new com.google.storage.v1.ListObjectAccessControlsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v1.ListObjectAccessControlsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucket_ = bucket_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.object_ = object_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.generation_ = generation_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.commonRequestParams_ = commonRequestParamsBuilder_ == null
            ? commonRequestParams_
            : commonRequestParamsBuilder_.build();
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
      if (other instanceof com.google.storage.v1.ListObjectAccessControlsRequest) {
        return mergeFrom((com.google.storage.v1.ListObjectAccessControlsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v1.ListObjectAccessControlsRequest other) {
      if (other == com.google.storage.v1.ListObjectAccessControlsRequest.getDefaultInstance()) return this;
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getObject().isEmpty()) {
        object_ = other.object_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getGeneration() != 0L) {
        setGeneration(other.getGeneration());
      }
      if (other.hasCommonRequestParams()) {
        mergeCommonRequestParams(other.getCommonRequestParams());
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
              bucket_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              object_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              generation_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 42: {
              input.readMessage(
                  getCommonRequestParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 42
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

    private java.lang.Object bucket_ = "";
    /**
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bucket.
     */
    public java.lang.String getBucket() {
      java.lang.Object ref = bucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for bucket.
     */
    public com.google.protobuf.ByteString
        getBucketBytes() {
      java.lang.Object ref = bucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bucket_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBucket() {
      bucket_ = getDefaultInstance().getBucket();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bucket_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object object_ = "";
    /**
     * <pre>
     * Required. Name of the object.
     * </pre>
     *
     * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The object.
     */
    public java.lang.String getObject() {
      java.lang.Object ref = object_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        object_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the object.
     * </pre>
     *
     * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for object.
     */
    public com.google.protobuf.ByteString
        getObjectBytes() {
      java.lang.Object ref = object_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        object_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the object.
     * </pre>
     *
     * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The object to set.
     * @return This builder for chaining.
     */
    public Builder setObject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      object_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the object.
     * </pre>
     *
     * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearObject() {
      object_ = getDefaultInstance().getObject();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the object.
     * </pre>
     *
     * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for object to set.
     * @return This builder for chaining.
     */
    public Builder setObjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      object_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long generation_ ;
    /**
     * <pre>
     * If present, selects a specific revision of this object (as opposed to the
     * latest version, the default).
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     * @return The generation.
     */
    @java.lang.Override
    public long getGeneration() {
      return generation_;
    }
    /**
     * <pre>
     * If present, selects a specific revision of this object (as opposed to the
     * latest version, the default).
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     * @param value The generation to set.
     * @return This builder for chaining.
     */
    public Builder setGeneration(long value) {
      
      generation_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, selects a specific revision of this object (as opposed to the
     * latest version, the default).
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGeneration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      generation_ = 0L;
      onChanged();
      return this;
    }

    private com.google.storage.v1.CommonRequestParams commonRequestParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.storage.v1.CommonRequestParams, com.google.storage.v1.CommonRequestParams.Builder, com.google.storage.v1.CommonRequestParamsOrBuilder> commonRequestParamsBuilder_;
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     * @return Whether the commonRequestParams field is set.
     */
    public boolean hasCommonRequestParams() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     * @return The commonRequestParams.
     */
    public com.google.storage.v1.CommonRequestParams getCommonRequestParams() {
      if (commonRequestParamsBuilder_ == null) {
        return commonRequestParams_ == null ? com.google.storage.v1.CommonRequestParams.getDefaultInstance() : commonRequestParams_;
      } else {
        return commonRequestParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    public Builder setCommonRequestParams(com.google.storage.v1.CommonRequestParams value) {
      if (commonRequestParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonRequestParams_ = value;
      } else {
        commonRequestParamsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    public Builder setCommonRequestParams(
        com.google.storage.v1.CommonRequestParams.Builder builderForValue) {
      if (commonRequestParamsBuilder_ == null) {
        commonRequestParams_ = builderForValue.build();
      } else {
        commonRequestParamsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    public Builder mergeCommonRequestParams(com.google.storage.v1.CommonRequestParams value) {
      if (commonRequestParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          commonRequestParams_ != null &&
          commonRequestParams_ != com.google.storage.v1.CommonRequestParams.getDefaultInstance()) {
          getCommonRequestParamsBuilder().mergeFrom(value);
        } else {
          commonRequestParams_ = value;
        }
      } else {
        commonRequestParamsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    public Builder clearCommonRequestParams() {
      bitField0_ = (bitField0_ & ~0x00000008);
      commonRequestParams_ = null;
      if (commonRequestParamsBuilder_ != null) {
        commonRequestParamsBuilder_.dispose();
        commonRequestParamsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    public com.google.storage.v1.CommonRequestParams.Builder getCommonRequestParamsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getCommonRequestParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    public com.google.storage.v1.CommonRequestParamsOrBuilder getCommonRequestParamsOrBuilder() {
      if (commonRequestParamsBuilder_ != null) {
        return commonRequestParamsBuilder_.getMessageOrBuilder();
      } else {
        return commonRequestParams_ == null ?
            com.google.storage.v1.CommonRequestParams.getDefaultInstance() : commonRequestParams_;
      }
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.storage.v1.CommonRequestParams, com.google.storage.v1.CommonRequestParams.Builder, com.google.storage.v1.CommonRequestParamsOrBuilder> 
        getCommonRequestParamsFieldBuilder() {
      if (commonRequestParamsBuilder_ == null) {
        commonRequestParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v1.CommonRequestParams, com.google.storage.v1.CommonRequestParams.Builder, com.google.storage.v1.CommonRequestParamsOrBuilder>(
                getCommonRequestParams(),
                getParentForChildren(),
                isClean());
        commonRequestParams_ = null;
      }
      return commonRequestParamsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.storage.v1.ListObjectAccessControlsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v1.ListObjectAccessControlsRequest)
  private static final com.google.storage.v1.ListObjectAccessControlsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.storage.v1.ListObjectAccessControlsRequest();
  }

  public static com.google.storage.v1.ListObjectAccessControlsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListObjectAccessControlsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListObjectAccessControlsRequest>() {
    @java.lang.Override
    public ListObjectAccessControlsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListObjectAccessControlsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListObjectAccessControlsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v1.ListObjectAccessControlsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

