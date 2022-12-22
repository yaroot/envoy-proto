// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

/**
 * <pre>
 * Request message for StopChannel.
 * </pre>
 *
 * Protobuf type {@code google.storage.v1.StopChannelRequest}
 */
public final class StopChannelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.storage.v1.StopChannelRequest)
    StopChannelRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StopChannelRequest.newBuilder() to construct.
  private StopChannelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StopChannelRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StopChannelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.storage.v1.Storage.internal_static_google_storage_v1_StopChannelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v1.Storage.internal_static_google_storage_v1_StopChannelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v1.StopChannelRequest.class, com.google.storage.v1.StopChannelRequest.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private com.google.storage.v1.Channel channel_;
  /**
   * <pre>
   * The channel to be stopped.
   * </pre>
   *
   * <code>.google.storage.v1.Channel channel = 1;</code>
   * @return Whether the channel field is set.
   */
  @java.lang.Override
  public boolean hasChannel() {
    return channel_ != null;
  }
  /**
   * <pre>
   * The channel to be stopped.
   * </pre>
   *
   * <code>.google.storage.v1.Channel channel = 1;</code>
   * @return The channel.
   */
  @java.lang.Override
  public com.google.storage.v1.Channel getChannel() {
    return channel_ == null ? com.google.storage.v1.Channel.getDefaultInstance() : channel_;
  }
  /**
   * <pre>
   * The channel to be stopped.
   * </pre>
   *
   * <code>.google.storage.v1.Channel channel = 1;</code>
   */
  @java.lang.Override
  public com.google.storage.v1.ChannelOrBuilder getChannelOrBuilder() {
    return channel_ == null ? com.google.storage.v1.Channel.getDefaultInstance() : channel_;
  }

  public static final int COMMON_REQUEST_PARAMS_FIELD_NUMBER = 2;
  private com.google.storage.v1.CommonRequestParams commonRequestParams_;
  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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
    if (channel_ != null) {
      output.writeMessage(1, getChannel());
    }
    if (commonRequestParams_ != null) {
      output.writeMessage(2, getCommonRequestParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getChannel());
    }
    if (commonRequestParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCommonRequestParams());
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
    if (!(obj instanceof com.google.storage.v1.StopChannelRequest)) {
      return super.equals(obj);
    }
    com.google.storage.v1.StopChannelRequest other = (com.google.storage.v1.StopChannelRequest) obj;

    if (hasChannel() != other.hasChannel()) return false;
    if (hasChannel()) {
      if (!getChannel()
          .equals(other.getChannel())) return false;
    }
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
    if (hasChannel()) {
      hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getChannel().hashCode();
    }
    if (hasCommonRequestParams()) {
      hash = (37 * hash) + COMMON_REQUEST_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonRequestParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v1.StopChannelRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.storage.v1.StopChannelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.storage.v1.StopChannelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.storage.v1.StopChannelRequest parseFrom(
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
  public static Builder newBuilder(com.google.storage.v1.StopChannelRequest prototype) {
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
   * Request message for StopChannel.
   * </pre>
   *
   * Protobuf type {@code google.storage.v1.StopChannelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.storage.v1.StopChannelRequest)
      com.google.storage.v1.StopChannelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.storage.v1.Storage.internal_static_google_storage_v1_StopChannelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v1.Storage.internal_static_google_storage_v1_StopChannelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v1.StopChannelRequest.class, com.google.storage.v1.StopChannelRequest.Builder.class);
    }

    // Construct using com.google.storage.v1.StopChannelRequest.newBuilder()
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
      channel_ = null;
      if (channelBuilder_ != null) {
        channelBuilder_.dispose();
        channelBuilder_ = null;
      }
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
      return com.google.storage.v1.Storage.internal_static_google_storage_v1_StopChannelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v1.StopChannelRequest getDefaultInstanceForType() {
      return com.google.storage.v1.StopChannelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v1.StopChannelRequest build() {
      com.google.storage.v1.StopChannelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v1.StopChannelRequest buildPartial() {
      com.google.storage.v1.StopChannelRequest result = new com.google.storage.v1.StopChannelRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v1.StopChannelRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channel_ = channelBuilder_ == null
            ? channel_
            : channelBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
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
      if (other instanceof com.google.storage.v1.StopChannelRequest) {
        return mergeFrom((com.google.storage.v1.StopChannelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v1.StopChannelRequest other) {
      if (other == com.google.storage.v1.StopChannelRequest.getDefaultInstance()) return this;
      if (other.hasChannel()) {
        mergeChannel(other.getChannel());
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
              input.readMessage(
                  getChannelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCommonRequestParamsFieldBuilder().getBuilder(),
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

    private com.google.storage.v1.Channel channel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.storage.v1.Channel, com.google.storage.v1.Channel.Builder, com.google.storage.v1.ChannelOrBuilder> channelBuilder_;
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     * @return Whether the channel field is set.
     */
    public boolean hasChannel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     * @return The channel.
     */
    public com.google.storage.v1.Channel getChannel() {
      if (channelBuilder_ == null) {
        return channel_ == null ? com.google.storage.v1.Channel.getDefaultInstance() : channel_;
      } else {
        return channelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    public Builder setChannel(com.google.storage.v1.Channel value) {
      if (channelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channel_ = value;
      } else {
        channelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    public Builder setChannel(
        com.google.storage.v1.Channel.Builder builderForValue) {
      if (channelBuilder_ == null) {
        channel_ = builderForValue.build();
      } else {
        channelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    public Builder mergeChannel(com.google.storage.v1.Channel value) {
      if (channelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          channel_ != null &&
          channel_ != com.google.storage.v1.Channel.getDefaultInstance()) {
          getChannelBuilder().mergeFrom(value);
        } else {
          channel_ = value;
        }
      } else {
        channelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    public Builder clearChannel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      channel_ = null;
      if (channelBuilder_ != null) {
        channelBuilder_.dispose();
        channelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    public com.google.storage.v1.Channel.Builder getChannelBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getChannelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    public com.google.storage.v1.ChannelOrBuilder getChannelOrBuilder() {
      if (channelBuilder_ != null) {
        return channelBuilder_.getMessageOrBuilder();
      } else {
        return channel_ == null ?
            com.google.storage.v1.Channel.getDefaultInstance() : channel_;
      }
    }
    /**
     * <pre>
     * The channel to be stopped.
     * </pre>
     *
     * <code>.google.storage.v1.Channel channel = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.storage.v1.Channel, com.google.storage.v1.Channel.Builder, com.google.storage.v1.ChannelOrBuilder> 
        getChannelFieldBuilder() {
      if (channelBuilder_ == null) {
        channelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v1.Channel, com.google.storage.v1.Channel.Builder, com.google.storage.v1.ChannelOrBuilder>(
                getChannel(),
                getParentForChildren(),
                isClean());
        channel_ = null;
      }
      return channelBuilder_;
    }

    private com.google.storage.v1.CommonRequestParams commonRequestParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.storage.v1.CommonRequestParams, com.google.storage.v1.CommonRequestParams.Builder, com.google.storage.v1.CommonRequestParamsOrBuilder> commonRequestParamsBuilder_;
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
     * @return Whether the commonRequestParams field is set.
     */
    public boolean hasCommonRequestParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
     */
    public Builder setCommonRequestParams(
        com.google.storage.v1.CommonRequestParams.Builder builderForValue) {
      if (commonRequestParamsBuilder_ == null) {
        commonRequestParams_ = builderForValue.build();
      } else {
        commonRequestParamsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
     */
    public Builder mergeCommonRequestParams(com.google.storage.v1.CommonRequestParams value) {
      if (commonRequestParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          commonRequestParams_ != null &&
          commonRequestParams_ != com.google.storage.v1.CommonRequestParams.getDefaultInstance()) {
          getCommonRequestParamsBuilder().mergeFrom(value);
        } else {
          commonRequestParams_ = value;
        }
      } else {
        commonRequestParamsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
     */
    public Builder clearCommonRequestParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
     */
    public com.google.storage.v1.CommonRequestParams.Builder getCommonRequestParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCommonRequestParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.storage.v1.StopChannelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v1.StopChannelRequest)
  private static final com.google.storage.v1.StopChannelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.storage.v1.StopChannelRequest();
  }

  public static com.google.storage.v1.StopChannelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StopChannelRequest>
      PARSER = new com.google.protobuf.AbstractParser<StopChannelRequest>() {
    @java.lang.Override
    public StopChannelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StopChannelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StopChannelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v1.StopChannelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
