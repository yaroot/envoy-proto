// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/cdn_keys.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Configuration for an Akamai CDN key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.AkamaiCdnKey}
 */
public final class AkamaiCdnKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.AkamaiCdnKey)
    AkamaiCdnKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AkamaiCdnKey.newBuilder() to construct.
  private AkamaiCdnKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AkamaiCdnKey() {
    tokenKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AkamaiCdnKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.CdnKeysProto.internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.CdnKeysProto.internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.AkamaiCdnKey.class, com.google.cloud.video.stitcher.v1.AkamaiCdnKey.Builder.class);
  }

  public static final int TOKEN_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString tokenKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Input only. Token key for the Akamai CDN edge configuration.
   * </pre>
   *
   * <code>bytes token_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The tokenKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTokenKey() {
    return tokenKey_;
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
    if (!tokenKey_.isEmpty()) {
      output.writeBytes(1, tokenKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!tokenKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, tokenKey_);
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.AkamaiCdnKey)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.AkamaiCdnKey other = (com.google.cloud.video.stitcher.v1.AkamaiCdnKey) obj;

    if (!getTokenKey()
        .equals(other.getTokenKey())) return false;
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
    hash = (37 * hash) + TOKEN_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getTokenKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.AkamaiCdnKey prototype) {
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
   * Configuration for an Akamai CDN key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.AkamaiCdnKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.AkamaiCdnKey)
      com.google.cloud.video.stitcher.v1.AkamaiCdnKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.CdnKeysProto.internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.CdnKeysProto.internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.AkamaiCdnKey.class, com.google.cloud.video.stitcher.v1.AkamaiCdnKey.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.AkamaiCdnKey.newBuilder()
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
      tokenKey_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.CdnKeysProto.internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.AkamaiCdnKey getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.AkamaiCdnKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.AkamaiCdnKey build() {
      com.google.cloud.video.stitcher.v1.AkamaiCdnKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.AkamaiCdnKey buildPartial() {
      com.google.cloud.video.stitcher.v1.AkamaiCdnKey result = new com.google.cloud.video.stitcher.v1.AkamaiCdnKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.AkamaiCdnKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tokenKey_ = tokenKey_;
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
      if (other instanceof com.google.cloud.video.stitcher.v1.AkamaiCdnKey) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.AkamaiCdnKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.AkamaiCdnKey other) {
      if (other == com.google.cloud.video.stitcher.v1.AkamaiCdnKey.getDefaultInstance()) return this;
      if (other.getTokenKey() != com.google.protobuf.ByteString.EMPTY) {
        setTokenKey(other.getTokenKey());
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
              tokenKey_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.protobuf.ByteString tokenKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Input only. Token key for the Akamai CDN edge configuration.
     * </pre>
     *
     * <code>bytes token_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return The tokenKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTokenKey() {
      return tokenKey_;
    }
    /**
     * <pre>
     * Input only. Token key for the Akamai CDN edge configuration.
     * </pre>
     *
     * <code>bytes token_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     * @param value The tokenKey to set.
     * @return This builder for chaining.
     */
    public Builder setTokenKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      tokenKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Input only. Token key for the Akamai CDN edge configuration.
     * </pre>
     *
     * <code>bytes token_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tokenKey_ = getDefaultInstance().getTokenKey();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.AkamaiCdnKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.AkamaiCdnKey)
  private static final com.google.cloud.video.stitcher.v1.AkamaiCdnKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.AkamaiCdnKey();
  }

  public static com.google.cloud.video.stitcher.v1.AkamaiCdnKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AkamaiCdnKey>
      PARSER = new com.google.protobuf.AbstractParser<AkamaiCdnKey>() {
    @java.lang.Override
    public AkamaiCdnKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<AkamaiCdnKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AkamaiCdnKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.AkamaiCdnKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

