// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storagetransfer/logging/transfer_activity_log.proto

package com.google.storagetransfer.logging;

/**
 * <pre>
 * AWS S3 bucket metadata.
 * </pre>
 *
 * Protobuf type {@code google.storagetransfer.logging.AwsS3BucketMetadata}
 */
public final class AwsS3BucketMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.storagetransfer.logging.AwsS3BucketMetadata)
    AwsS3BucketMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsS3BucketMetadata.newBuilder() to construct.
  private AwsS3BucketMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsS3BucketMetadata() {
    bucket_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsS3BucketMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.storagetransfer.logging.TransferActivityLogProto.internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storagetransfer.logging.TransferActivityLogProto.internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storagetransfer.logging.AwsS3BucketMetadata.class, com.google.storagetransfer.logging.AwsS3BucketMetadata.Builder.class);
  }

  public static final int BUCKET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bucket_ = "";
  /**
   * <pre>
   * Required. Name of the S3 bucket.
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
   * Required. Name of the S3 bucket.
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

  public static final int PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <pre>
   * The path of transfer objects as an object key prefix ending with "/".
   * </pre>
   *
   * <code>string path = 2;</code>
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
   * The path of transfer objects as an object key prefix ending with "/".
   * </pre>
   *
   * <code>string path = 2;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
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
    if (!(obj instanceof com.google.storagetransfer.logging.AwsS3BucketMetadata)) {
      return super.equals(obj);
    }
    com.google.storagetransfer.logging.AwsS3BucketMetadata other = (com.google.storagetransfer.logging.AwsS3BucketMetadata) obj;

    if (!getBucket()
        .equals(other.getBucket())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.storagetransfer.logging.AwsS3BucketMetadata parseFrom(
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
  public static Builder newBuilder(com.google.storagetransfer.logging.AwsS3BucketMetadata prototype) {
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
   * AWS S3 bucket metadata.
   * </pre>
   *
   * Protobuf type {@code google.storagetransfer.logging.AwsS3BucketMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.storagetransfer.logging.AwsS3BucketMetadata)
      com.google.storagetransfer.logging.AwsS3BucketMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.storagetransfer.logging.TransferActivityLogProto.internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storagetransfer.logging.TransferActivityLogProto.internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storagetransfer.logging.AwsS3BucketMetadata.class, com.google.storagetransfer.logging.AwsS3BucketMetadata.Builder.class);
    }

    // Construct using com.google.storagetransfer.logging.AwsS3BucketMetadata.newBuilder()
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
      path_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.storagetransfer.logging.TransferActivityLogProto.internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.storagetransfer.logging.AwsS3BucketMetadata getDefaultInstanceForType() {
      return com.google.storagetransfer.logging.AwsS3BucketMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storagetransfer.logging.AwsS3BucketMetadata build() {
      com.google.storagetransfer.logging.AwsS3BucketMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storagetransfer.logging.AwsS3BucketMetadata buildPartial() {
      com.google.storagetransfer.logging.AwsS3BucketMetadata result = new com.google.storagetransfer.logging.AwsS3BucketMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storagetransfer.logging.AwsS3BucketMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucket_ = bucket_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.path_ = path_;
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
      if (other instanceof com.google.storagetransfer.logging.AwsS3BucketMetadata) {
        return mergeFrom((com.google.storagetransfer.logging.AwsS3BucketMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storagetransfer.logging.AwsS3BucketMetadata other) {
      if (other == com.google.storagetransfer.logging.AwsS3BucketMetadata.getDefaultInstance()) return this;
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000002;
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
              bucket_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              path_ = input.readStringRequireUtf8();
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

    private java.lang.Object bucket_ = "";
    /**
     * <pre>
     * Required. Name of the S3 bucket.
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
     * Required. Name of the S3 bucket.
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
     * Required. Name of the S3 bucket.
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
     * Required. Name of the S3 bucket.
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
     * Required. Name of the S3 bucket.
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

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * The path of transfer objects as an object key prefix ending with "/".
     * </pre>
     *
     * <code>string path = 2;</code>
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
     * The path of transfer objects as an object key prefix ending with "/".
     * </pre>
     *
     * <code>string path = 2;</code>
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
     * The path of transfer objects as an object key prefix ending with "/".
     * </pre>
     *
     * <code>string path = 2;</code>
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
     * The path of transfer objects as an object key prefix ending with "/".
     * </pre>
     *
     * <code>string path = 2;</code>
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
     * The path of transfer objects as an object key prefix ending with "/".
     * </pre>
     *
     * <code>string path = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.storagetransfer.logging.AwsS3BucketMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.storagetransfer.logging.AwsS3BucketMetadata)
  private static final com.google.storagetransfer.logging.AwsS3BucketMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.storagetransfer.logging.AwsS3BucketMetadata();
  }

  public static com.google.storagetransfer.logging.AwsS3BucketMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsS3BucketMetadata>
      PARSER = new com.google.protobuf.AbstractParser<AwsS3BucketMetadata>() {
    @java.lang.Override
    public AwsS3BucketMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsS3BucketMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsS3BucketMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storagetransfer.logging.AwsS3BucketMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

