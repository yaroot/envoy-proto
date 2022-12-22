// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/grpc_stats/v2alpha/config.proto

package io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha;

/**
 * <pre>
 * gRPC statistics filter state object in protobuf form.
 * </pre>
 *
 * Protobuf type {@code envoy.config.filter.http.grpc_stats.v2alpha.FilterObject}
 */
public final class FilterObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.http.grpc_stats.v2alpha.FilterObject)
    FilterObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilterObject.newBuilder() to construct.
  private FilterObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilterObject() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilterObject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_grpc_stats_v2alpha_FilterObject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_grpc_stats_v2alpha_FilterObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.class, io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.Builder.class);
  }

  public static final int REQUEST_MESSAGE_COUNT_FIELD_NUMBER = 1;
  private long requestMessageCount_ = 0L;
  /**
   * <pre>
   * Count of request messages in the request stream.
   * </pre>
   *
   * <code>uint64 request_message_count = 1;</code>
   * @return The requestMessageCount.
   */
  @java.lang.Override
  public long getRequestMessageCount() {
    return requestMessageCount_;
  }

  public static final int RESPONSE_MESSAGE_COUNT_FIELD_NUMBER = 2;
  private long responseMessageCount_ = 0L;
  /**
   * <pre>
   * Count of response messages in the response stream.
   * </pre>
   *
   * <code>uint64 response_message_count = 2;</code>
   * @return The responseMessageCount.
   */
  @java.lang.Override
  public long getResponseMessageCount() {
    return responseMessageCount_;
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
    if (requestMessageCount_ != 0L) {
      output.writeUInt64(1, requestMessageCount_);
    }
    if (responseMessageCount_ != 0L) {
      output.writeUInt64(2, responseMessageCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestMessageCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, requestMessageCount_);
    }
    if (responseMessageCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, responseMessageCount_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject other = (io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject) obj;

    if (getRequestMessageCount()
        != other.getRequestMessageCount()) return false;
    if (getResponseMessageCount()
        != other.getResponseMessageCount()) return false;
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
    hash = (37 * hash) + REQUEST_MESSAGE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestMessageCount());
    hash = (37 * hash) + RESPONSE_MESSAGE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getResponseMessageCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject prototype) {
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
   * gRPC statistics filter state object in protobuf form.
   * </pre>
   *
   * Protobuf type {@code envoy.config.filter.http.grpc_stats.v2alpha.FilterObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.http.grpc_stats.v2alpha.FilterObject)
      io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_grpc_stats_v2alpha_FilterObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_grpc_stats_v2alpha_FilterObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.class, io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.newBuilder()
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
      requestMessageCount_ = 0L;
      responseMessageCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_grpc_stats_v2alpha_FilterObject_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject build() {
      io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject buildPartial() {
      io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject result = new io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestMessageCount_ = requestMessageCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.responseMessageCount_ = responseMessageCount_;
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
      if (other instanceof io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject other) {
      if (other == io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject.getDefaultInstance()) return this;
      if (other.getRequestMessageCount() != 0L) {
        setRequestMessageCount(other.getRequestMessageCount());
      }
      if (other.getResponseMessageCount() != 0L) {
        setResponseMessageCount(other.getResponseMessageCount());
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
            case 8: {
              requestMessageCount_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              responseMessageCount_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long requestMessageCount_ ;
    /**
     * <pre>
     * Count of request messages in the request stream.
     * </pre>
     *
     * <code>uint64 request_message_count = 1;</code>
     * @return The requestMessageCount.
     */
    @java.lang.Override
    public long getRequestMessageCount() {
      return requestMessageCount_;
    }
    /**
     * <pre>
     * Count of request messages in the request stream.
     * </pre>
     *
     * <code>uint64 request_message_count = 1;</code>
     * @param value The requestMessageCount to set.
     * @return This builder for chaining.
     */
    public Builder setRequestMessageCount(long value) {
      
      requestMessageCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of request messages in the request stream.
     * </pre>
     *
     * <code>uint64 request_message_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestMessageCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestMessageCount_ = 0L;
      onChanged();
      return this;
    }

    private long responseMessageCount_ ;
    /**
     * <pre>
     * Count of response messages in the response stream.
     * </pre>
     *
     * <code>uint64 response_message_count = 2;</code>
     * @return The responseMessageCount.
     */
    @java.lang.Override
    public long getResponseMessageCount() {
      return responseMessageCount_;
    }
    /**
     * <pre>
     * Count of response messages in the response stream.
     * </pre>
     *
     * <code>uint64 response_message_count = 2;</code>
     * @param value The responseMessageCount to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessageCount(long value) {
      
      responseMessageCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of response messages in the response stream.
     * </pre>
     *
     * <code>uint64 response_message_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseMessageCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      responseMessageCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.http.grpc_stats.v2alpha.FilterObject)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.http.grpc_stats.v2alpha.FilterObject)
  private static final io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject();
  }

  public static io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterObject>
      PARSER = new com.google.protobuf.AbstractParser<FilterObject>() {
    @java.lang.Override
    public FilterObject parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilterObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.FilterObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

