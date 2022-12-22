// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v3/skywalking.proto

package io.envoyproxy.envoy.config.trace.v3;

/**
 * <pre>
 * Configuration for the SkyWalking tracer. Please note that if SkyWalking tracer is used as the
 * provider of http tracer, then
 * :ref:`start_child_span &lt;envoy_v3_api_field_extensions.filters.http.router.v3.Router.start_child_span&gt;`
 * in the router must be set to true to get the correct topology and tracing data. Moreover, SkyWalking
 * Tracer does not support SkyWalking extension header (``sw8-x``) temporarily.
 * [#extension: envoy.tracers.skywalking]
 * </pre>
 *
 * Protobuf type {@code envoy.config.trace.v3.SkyWalkingConfig}
 */
public final class SkyWalkingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.trace.v3.SkyWalkingConfig)
    SkyWalkingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkyWalkingConfig.newBuilder() to construct.
  private SkyWalkingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkyWalkingConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SkyWalkingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.trace.v3.SkywalkingProto.internal_static_envoy_config_trace_v3_SkyWalkingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.trace.v3.SkywalkingProto.internal_static_envoy_config_trace_v3_SkyWalkingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.class, io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.Builder.class);
  }

  public static final int GRPC_SERVICE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.GrpcService grpcService_;
  /**
   * <pre>
   * SkyWalking collector service.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the grpcService field is set.
   */
  @java.lang.Override
  public boolean hasGrpcService() {
    return grpcService_ != null;
  }
  /**
   * <pre>
   * SkyWalking collector service.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
   * @return The grpcService.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.GrpcService getGrpcService() {
    return grpcService_ == null ? io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
  }
  /**
   * <pre>
   * SkyWalking collector service.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
    return grpcService_ == null ? io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
  }

  public static final int CLIENT_CONFIG_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.trace.v3.ClientConfig clientConfig_;
  /**
   * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
   * @return Whether the clientConfig field is set.
   */
  @java.lang.Override
  public boolean hasClientConfig() {
    return clientConfig_ != null;
  }
  /**
   * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
   * @return The clientConfig.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.trace.v3.ClientConfig getClientConfig() {
    return clientConfig_ == null ? io.envoyproxy.envoy.config.trace.v3.ClientConfig.getDefaultInstance() : clientConfig_;
  }
  /**
   * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.trace.v3.ClientConfigOrBuilder getClientConfigOrBuilder() {
    return clientConfig_ == null ? io.envoyproxy.envoy.config.trace.v3.ClientConfig.getDefaultInstance() : clientConfig_;
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
    if (grpcService_ != null) {
      output.writeMessage(1, getGrpcService());
    }
    if (clientConfig_ != null) {
      output.writeMessage(2, getClientConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (grpcService_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGrpcService());
    }
    if (clientConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClientConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig other = (io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig) obj;

    if (hasGrpcService() != other.hasGrpcService()) return false;
    if (hasGrpcService()) {
      if (!getGrpcService()
          .equals(other.getGrpcService())) return false;
    }
    if (hasClientConfig() != other.hasClientConfig()) return false;
    if (hasClientConfig()) {
      if (!getClientConfig()
          .equals(other.getClientConfig())) return false;
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
    if (hasGrpcService()) {
      hash = (37 * hash) + GRPC_SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getGrpcService().hashCode();
    }
    if (hasClientConfig()) {
      hash = (37 * hash) + CLIENT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getClientConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig prototype) {
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
   * Configuration for the SkyWalking tracer. Please note that if SkyWalking tracer is used as the
   * provider of http tracer, then
   * :ref:`start_child_span &lt;envoy_v3_api_field_extensions.filters.http.router.v3.Router.start_child_span&gt;`
   * in the router must be set to true to get the correct topology and tracing data. Moreover, SkyWalking
   * Tracer does not support SkyWalking extension header (``sw8-x``) temporarily.
   * [#extension: envoy.tracers.skywalking]
   * </pre>
   *
   * Protobuf type {@code envoy.config.trace.v3.SkyWalkingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.trace.v3.SkyWalkingConfig)
      io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.trace.v3.SkywalkingProto.internal_static_envoy_config_trace_v3_SkyWalkingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.trace.v3.SkywalkingProto.internal_static_envoy_config_trace_v3_SkyWalkingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.class, io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.newBuilder()
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
      grpcService_ = null;
      if (grpcServiceBuilder_ != null) {
        grpcServiceBuilder_.dispose();
        grpcServiceBuilder_ = null;
      }
      clientConfig_ = null;
      if (clientConfigBuilder_ != null) {
        clientConfigBuilder_.dispose();
        clientConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.trace.v3.SkywalkingProto.internal_static_envoy_config_trace_v3_SkyWalkingConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig build() {
      io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig buildPartial() {
      io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig result = new io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.grpcService_ = grpcServiceBuilder_ == null
            ? grpcService_
            : grpcServiceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientConfig_ = clientConfigBuilder_ == null
            ? clientConfig_
            : clientConfigBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig other) {
      if (other == io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig.getDefaultInstance()) return this;
      if (other.hasGrpcService()) {
        mergeGrpcService(other.getGrpcService());
      }
      if (other.hasClientConfig()) {
        mergeClientConfig(other.getClientConfig());
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
                  getGrpcServiceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getClientConfigFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.config.core.v3.GrpcService grpcService_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.GrpcService, io.envoyproxy.envoy.config.core.v3.GrpcService.Builder, io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder> grpcServiceBuilder_;
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the grpcService field is set.
     */
    public boolean hasGrpcService() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     * @return The grpcService.
     */
    public io.envoyproxy.envoy.config.core.v3.GrpcService getGrpcService() {
      if (grpcServiceBuilder_ == null) {
        return grpcService_ == null ? io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
      } else {
        return grpcServiceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setGrpcService(io.envoyproxy.envoy.config.core.v3.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        grpcService_ = value;
      } else {
        grpcServiceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setGrpcService(
        io.envoyproxy.envoy.config.core.v3.GrpcService.Builder builderForValue) {
      if (grpcServiceBuilder_ == null) {
        grpcService_ = builderForValue.build();
      } else {
        grpcServiceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeGrpcService(io.envoyproxy.envoy.config.core.v3.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          grpcService_ != null &&
          grpcService_ != io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance()) {
          getGrpcServiceBuilder().mergeFrom(value);
        } else {
          grpcService_ = value;
        }
      } else {
        grpcServiceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearGrpcService() {
      bitField0_ = (bitField0_ & ~0x00000001);
      grpcService_ = null;
      if (grpcServiceBuilder_ != null) {
        grpcServiceBuilder_.dispose();
        grpcServiceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.GrpcService.Builder getGrpcServiceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGrpcServiceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
      if (grpcServiceBuilder_ != null) {
        return grpcServiceBuilder_.getMessageOrBuilder();
      } else {
        return grpcService_ == null ?
            io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
      }
    }
    /**
     * <pre>
     * SkyWalking collector service.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.GrpcService, io.envoyproxy.envoy.config.core.v3.GrpcService.Builder, io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder> 
        getGrpcServiceFieldBuilder() {
      if (grpcServiceBuilder_ == null) {
        grpcServiceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.GrpcService, io.envoyproxy.envoy.config.core.v3.GrpcService.Builder, io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder>(
                getGrpcService(),
                getParentForChildren(),
                isClean());
        grpcService_ = null;
      }
      return grpcServiceBuilder_;
    }

    private io.envoyproxy.envoy.config.trace.v3.ClientConfig clientConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.trace.v3.ClientConfig, io.envoyproxy.envoy.config.trace.v3.ClientConfig.Builder, io.envoyproxy.envoy.config.trace.v3.ClientConfigOrBuilder> clientConfigBuilder_;
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     * @return Whether the clientConfig field is set.
     */
    public boolean hasClientConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     * @return The clientConfig.
     */
    public io.envoyproxy.envoy.config.trace.v3.ClientConfig getClientConfig() {
      if (clientConfigBuilder_ == null) {
        return clientConfig_ == null ? io.envoyproxy.envoy.config.trace.v3.ClientConfig.getDefaultInstance() : clientConfig_;
      } else {
        return clientConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    public Builder setClientConfig(io.envoyproxy.envoy.config.trace.v3.ClientConfig value) {
      if (clientConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientConfig_ = value;
      } else {
        clientConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    public Builder setClientConfig(
        io.envoyproxy.envoy.config.trace.v3.ClientConfig.Builder builderForValue) {
      if (clientConfigBuilder_ == null) {
        clientConfig_ = builderForValue.build();
      } else {
        clientConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    public Builder mergeClientConfig(io.envoyproxy.envoy.config.trace.v3.ClientConfig value) {
      if (clientConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          clientConfig_ != null &&
          clientConfig_ != io.envoyproxy.envoy.config.trace.v3.ClientConfig.getDefaultInstance()) {
          getClientConfigBuilder().mergeFrom(value);
        } else {
          clientConfig_ = value;
        }
      } else {
        clientConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    public Builder clearClientConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clientConfig_ = null;
      if (clientConfigBuilder_ != null) {
        clientConfigBuilder_.dispose();
        clientConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    public io.envoyproxy.envoy.config.trace.v3.ClientConfig.Builder getClientConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getClientConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    public io.envoyproxy.envoy.config.trace.v3.ClientConfigOrBuilder getClientConfigOrBuilder() {
      if (clientConfigBuilder_ != null) {
        return clientConfigBuilder_.getMessageOrBuilder();
      } else {
        return clientConfig_ == null ?
            io.envoyproxy.envoy.config.trace.v3.ClientConfig.getDefaultInstance() : clientConfig_;
      }
    }
    /**
     * <code>.envoy.config.trace.v3.ClientConfig client_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.trace.v3.ClientConfig, io.envoyproxy.envoy.config.trace.v3.ClientConfig.Builder, io.envoyproxy.envoy.config.trace.v3.ClientConfigOrBuilder> 
        getClientConfigFieldBuilder() {
      if (clientConfigBuilder_ == null) {
        clientConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.trace.v3.ClientConfig, io.envoyproxy.envoy.config.trace.v3.ClientConfig.Builder, io.envoyproxy.envoy.config.trace.v3.ClientConfigOrBuilder>(
                getClientConfig(),
                getParentForChildren(),
                isClean());
        clientConfig_ = null;
      }
      return clientConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.trace.v3.SkyWalkingConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.trace.v3.SkyWalkingConfig)
  private static final io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig();
  }

  public static io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkyWalkingConfig>
      PARSER = new com.google.protobuf.AbstractParser<SkyWalkingConfig>() {
    @java.lang.Override
    public SkyWalkingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SkyWalkingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkyWalkingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.trace.v3.SkyWalkingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
