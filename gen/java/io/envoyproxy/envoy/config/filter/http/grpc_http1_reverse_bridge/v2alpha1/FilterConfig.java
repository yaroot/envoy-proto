// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/grpc_http1_reverse_bridge/v2alpha1/config.proto

package io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1;

/**
 * <pre>
 * gRPC reverse bridge filter configuration
 * </pre>
 *
 * Protobuf type {@code envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig}
 */
public final class FilterConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig)
    FilterConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilterConfig.newBuilder() to construct.
  private FilterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilterConfig() {
    contentType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilterConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.ConfigProto.internal_static_envoy_config_filter_http_grpc_http1_reverse_bridge_v2alpha1_FilterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.ConfigProto.internal_static_envoy_config_filter_http_grpc_http1_reverse_bridge_v2alpha1_FilterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.class, io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.Builder.class);
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contentType_ = "";
  /**
   * <pre>
   * The content-type to pass to the upstream when the gRPC bridge filter is applied.
   * The filter will also validate that the upstream responds with the same content type.
   * </pre>
   *
   * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The content-type to pass to the upstream when the gRPC bridge filter is applied.
   * The filter will also validate that the upstream responds with the same content type.
   * </pre>
   *
   * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITHHOLD_GRPC_FRAMES_FIELD_NUMBER = 2;
  private boolean withholdGrpcFrames_ = false;
  /**
   * <pre>
   * If true, Envoy will assume that the upstream doesn't understand gRPC frames and
   * strip the gRPC frame from the request, and add it back in to the response. This will
   * hide the gRPC semantics from the upstream, allowing it to receive and respond with a
   * simple binary encoded protobuf.
   * </pre>
   *
   * <code>bool withhold_grpc_frames = 2;</code>
   * @return The withholdGrpcFrames.
   */
  @java.lang.Override
  public boolean getWithholdGrpcFrames() {
    return withholdGrpcFrames_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentType_);
    }
    if (withholdGrpcFrames_ != false) {
      output.writeBool(2, withholdGrpcFrames_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentType_);
    }
    if (withholdGrpcFrames_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, withholdGrpcFrames_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig other = (io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig) obj;

    if (!getContentType()
        .equals(other.getContentType())) return false;
    if (getWithholdGrpcFrames()
        != other.getWithholdGrpcFrames()) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (37 * hash) + WITHHOLD_GRPC_FRAMES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithholdGrpcFrames());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig prototype) {
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
   * gRPC reverse bridge filter configuration
   * </pre>
   *
   * Protobuf type {@code envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig)
      io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.ConfigProto.internal_static_envoy_config_filter_http_grpc_http1_reverse_bridge_v2alpha1_FilterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.ConfigProto.internal_static_envoy_config_filter_http_grpc_http1_reverse_bridge_v2alpha1_FilterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.class, io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.newBuilder()
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
      contentType_ = "";
      withholdGrpcFrames_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.ConfigProto.internal_static_envoy_config_filter_http_grpc_http1_reverse_bridge_v2alpha1_FilterConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig build() {
      io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig buildPartial() {
      io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig result = new io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contentType_ = contentType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withholdGrpcFrames_ = withholdGrpcFrames_;
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
      if (other instanceof io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig other) {
      if (other == io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig.getDefaultInstance()) return this;
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getWithholdGrpcFrames() != false) {
        setWithholdGrpcFrames(other.getWithholdGrpcFrames());
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
              contentType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              withholdGrpcFrames_ = input.readBool();
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

    private java.lang.Object contentType_ = "";
    /**
     * <pre>
     * The content-type to pass to the upstream when the gRPC bridge filter is applied.
     * The filter will also validate that the upstream responds with the same content type.
     * </pre>
     *
     * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
     * @return The contentType.
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The content-type to pass to the upstream when the gRPC bridge filter is applied.
     * The filter will also validate that the upstream responds with the same content type.
     * </pre>
     *
     * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for contentType.
     */
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The content-type to pass to the upstream when the gRPC bridge filter is applied.
     * The filter will also validate that the upstream responds with the same content type.
     * </pre>
     *
     * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contentType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content-type to pass to the upstream when the gRPC bridge filter is applied.
     * The filter will also validate that the upstream responds with the same content type.
     * </pre>
     *
     * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      contentType_ = getDefaultInstance().getContentType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content-type to pass to the upstream when the gRPC bridge filter is applied.
     * The filter will also validate that the upstream responds with the same content type.
     * </pre>
     *
     * <code>string content_type = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contentType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean withholdGrpcFrames_ ;
    /**
     * <pre>
     * If true, Envoy will assume that the upstream doesn't understand gRPC frames and
     * strip the gRPC frame from the request, and add it back in to the response. This will
     * hide the gRPC semantics from the upstream, allowing it to receive and respond with a
     * simple binary encoded protobuf.
     * </pre>
     *
     * <code>bool withhold_grpc_frames = 2;</code>
     * @return The withholdGrpcFrames.
     */
    @java.lang.Override
    public boolean getWithholdGrpcFrames() {
      return withholdGrpcFrames_;
    }
    /**
     * <pre>
     * If true, Envoy will assume that the upstream doesn't understand gRPC frames and
     * strip the gRPC frame from the request, and add it back in to the response. This will
     * hide the gRPC semantics from the upstream, allowing it to receive and respond with a
     * simple binary encoded protobuf.
     * </pre>
     *
     * <code>bool withhold_grpc_frames = 2;</code>
     * @param value The withholdGrpcFrames to set.
     * @return This builder for chaining.
     */
    public Builder setWithholdGrpcFrames(boolean value) {
      
      withholdGrpcFrames_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, Envoy will assume that the upstream doesn't understand gRPC frames and
     * strip the gRPC frame from the request, and add it back in to the response. This will
     * hide the gRPC semantics from the upstream, allowing it to receive and respond with a
     * simple binary encoded protobuf.
     * </pre>
     *
     * <code>bool withhold_grpc_frames = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWithholdGrpcFrames() {
      bitField0_ = (bitField0_ & ~0x00000002);
      withholdGrpcFrames_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig)
  private static final io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig();
  }

  public static io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterConfig>
      PARSER = new com.google.protobuf.AbstractParser<FilterConfig>() {
    @java.lang.Override
    public FilterConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.http.grpc_http1_reverse_bridge.v2alpha1.FilterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
