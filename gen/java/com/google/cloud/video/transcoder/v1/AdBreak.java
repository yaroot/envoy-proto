// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/resources.proto

package com.google.cloud.video.transcoder.v1;

/**
 * <pre>
 * Ad break.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.transcoder.v1.AdBreak}
 */
public final class AdBreak extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.transcoder.v1.AdBreak)
    AdBreakOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdBreak.newBuilder() to construct.
  private AdBreak(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdBreak() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdBreak();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.transcoder.v1.ResourcesProto.internal_static_google_cloud_video_transcoder_v1_AdBreak_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.transcoder.v1.ResourcesProto.internal_static_google_cloud_video_transcoder_v1_AdBreak_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.transcoder.v1.AdBreak.class, com.google.cloud.video.transcoder.v1.AdBreak.Builder.class);
  }

  public static final int START_TIME_OFFSET_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration startTimeOffset_;
  /**
   * <pre>
   * Start time in seconds for the ad break, relative to the output file
   * timeline. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   * @return Whether the startTimeOffset field is set.
   */
  @java.lang.Override
  public boolean hasStartTimeOffset() {
    return startTimeOffset_ != null;
  }
  /**
   * <pre>
   * Start time in seconds for the ad break, relative to the output file
   * timeline. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   * @return The startTimeOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getStartTimeOffset() {
    return startTimeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startTimeOffset_;
  }
  /**
   * <pre>
   * Start time in seconds for the ad break, relative to the output file
   * timeline. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder() {
    return startTimeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startTimeOffset_;
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
    if (startTimeOffset_ != null) {
      output.writeMessage(1, getStartTimeOffset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTimeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartTimeOffset());
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
    if (!(obj instanceof com.google.cloud.video.transcoder.v1.AdBreak)) {
      return super.equals(obj);
    }
    com.google.cloud.video.transcoder.v1.AdBreak other = (com.google.cloud.video.transcoder.v1.AdBreak) obj;

    if (hasStartTimeOffset() != other.hasStartTimeOffset()) return false;
    if (hasStartTimeOffset()) {
      if (!getStartTimeOffset()
          .equals(other.getStartTimeOffset())) return false;
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
    if (hasStartTimeOffset()) {
      hash = (37 * hash) + START_TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getStartTimeOffset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.transcoder.v1.AdBreak parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.transcoder.v1.AdBreak prototype) {
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
   * Ad break.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.transcoder.v1.AdBreak}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.transcoder.v1.AdBreak)
      com.google.cloud.video.transcoder.v1.AdBreakOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.transcoder.v1.ResourcesProto.internal_static_google_cloud_video_transcoder_v1_AdBreak_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.transcoder.v1.ResourcesProto.internal_static_google_cloud_video_transcoder_v1_AdBreak_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.transcoder.v1.AdBreak.class, com.google.cloud.video.transcoder.v1.AdBreak.Builder.class);
    }

    // Construct using com.google.cloud.video.transcoder.v1.AdBreak.newBuilder()
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
      startTimeOffset_ = null;
      if (startTimeOffsetBuilder_ != null) {
        startTimeOffsetBuilder_.dispose();
        startTimeOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.transcoder.v1.ResourcesProto.internal_static_google_cloud_video_transcoder_v1_AdBreak_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1.AdBreak getDefaultInstanceForType() {
      return com.google.cloud.video.transcoder.v1.AdBreak.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1.AdBreak build() {
      com.google.cloud.video.transcoder.v1.AdBreak result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1.AdBreak buildPartial() {
      com.google.cloud.video.transcoder.v1.AdBreak result = new com.google.cloud.video.transcoder.v1.AdBreak(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.transcoder.v1.AdBreak result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startTimeOffset_ = startTimeOffsetBuilder_ == null
            ? startTimeOffset_
            : startTimeOffsetBuilder_.build();
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
      if (other instanceof com.google.cloud.video.transcoder.v1.AdBreak) {
        return mergeFrom((com.google.cloud.video.transcoder.v1.AdBreak)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.transcoder.v1.AdBreak other) {
      if (other == com.google.cloud.video.transcoder.v1.AdBreak.getDefaultInstance()) return this;
      if (other.hasStartTimeOffset()) {
        mergeStartTimeOffset(other.getStartTimeOffset());
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
                  getStartTimeOffsetFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.protobuf.Duration startTimeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> startTimeOffsetBuilder_;
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     * @return Whether the startTimeOffset field is set.
     */
    public boolean hasStartTimeOffset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     * @return The startTimeOffset.
     */
    public com.google.protobuf.Duration getStartTimeOffset() {
      if (startTimeOffsetBuilder_ == null) {
        return startTimeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startTimeOffset_;
      } else {
        return startTimeOffsetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder setStartTimeOffset(com.google.protobuf.Duration value) {
      if (startTimeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTimeOffset_ = value;
      } else {
        startTimeOffsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder setStartTimeOffset(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (startTimeOffsetBuilder_ == null) {
        startTimeOffset_ = builderForValue.build();
      } else {
        startTimeOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder mergeStartTimeOffset(com.google.protobuf.Duration value) {
      if (startTimeOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          startTimeOffset_ != null &&
          startTimeOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getStartTimeOffsetBuilder().mergeFrom(value);
        } else {
          startTimeOffset_ = value;
        }
      } else {
        startTimeOffsetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder clearStartTimeOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startTimeOffset_ = null;
      if (startTimeOffsetBuilder_ != null) {
        startTimeOffsetBuilder_.dispose();
        startTimeOffsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getStartTimeOffsetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder() {
      if (startTimeOffsetBuilder_ != null) {
        return startTimeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return startTimeOffset_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : startTimeOffset_;
      }
    }
    /**
     * <pre>
     * Start time in seconds for the ad break, relative to the output file
     * timeline. The default is `0s`.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getStartTimeOffsetFieldBuilder() {
      if (startTimeOffsetBuilder_ == null) {
        startTimeOffsetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getStartTimeOffset(),
                getParentForChildren(),
                isClean());
        startTimeOffset_ = null;
      }
      return startTimeOffsetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.transcoder.v1.AdBreak)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.transcoder.v1.AdBreak)
  private static final com.google.cloud.video.transcoder.v1.AdBreak DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.transcoder.v1.AdBreak();
  }

  public static com.google.cloud.video.transcoder.v1.AdBreak getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdBreak>
      PARSER = new com.google.protobuf.AbstractParser<AdBreak>() {
    @java.lang.Override
    public AdBreak parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdBreak> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdBreak> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.transcoder.v1.AdBreak getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

