// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/metrics/v2/metrics_service.proto

package io.envoyproxy.envoy.config.metrics.v2;

/**
 * <pre>
 * Metrics Service is configured as a built-in *envoy.stat_sinks.metrics_service* :ref:`StatsSink
 * &lt;envoy_api_msg_config.metrics.v2.StatsSink&gt;`. This opaque configuration will be used to create
 * Metrics Service.
 * [#extension: envoy.stat_sinks.metrics_service]
 * </pre>
 *
 * Protobuf type {@code envoy.config.metrics.v2.MetricsServiceConfig}
 */
public final class MetricsServiceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.metrics.v2.MetricsServiceConfig)
    MetricsServiceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetricsServiceConfig.newBuilder() to construct.
  private MetricsServiceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricsServiceConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetricsServiceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.metrics.v2.MetricsServiceProto.internal_static_envoy_config_metrics_v2_MetricsServiceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.metrics.v2.MetricsServiceProto.internal_static_envoy_config_metrics_v2_MetricsServiceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.class, io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.Builder.class);
  }

  public static final int GRPC_SERVICE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.api.v2.core.GrpcService grpcService_;
  /**
   * <pre>
   * The upstream gRPC cluster that hosts the metrics service.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the grpcService field is set.
   */
  @java.lang.Override
  public boolean hasGrpcService() {
    return grpcService_ != null;
  }
  /**
   * <pre>
   * The upstream gRPC cluster that hosts the metrics service.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
   * @return The grpcService.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.GrpcService getGrpcService() {
    return grpcService_ == null ? io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
  }
  /**
   * <pre>
   * The upstream gRPC cluster that hosts the metrics service.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
    return grpcService_ == null ? io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig other = (io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig) obj;

    if (hasGrpcService() != other.hasGrpcService()) return false;
    if (hasGrpcService()) {
      if (!getGrpcService()
          .equals(other.getGrpcService())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig prototype) {
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
   * Metrics Service is configured as a built-in *envoy.stat_sinks.metrics_service* :ref:`StatsSink
   * &lt;envoy_api_msg_config.metrics.v2.StatsSink&gt;`. This opaque configuration will be used to create
   * Metrics Service.
   * [#extension: envoy.stat_sinks.metrics_service]
   * </pre>
   *
   * Protobuf type {@code envoy.config.metrics.v2.MetricsServiceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.metrics.v2.MetricsServiceConfig)
      io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.metrics.v2.MetricsServiceProto.internal_static_envoy_config_metrics_v2_MetricsServiceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.metrics.v2.MetricsServiceProto.internal_static_envoy_config_metrics_v2_MetricsServiceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.class, io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.metrics.v2.MetricsServiceProto.internal_static_envoy_config_metrics_v2_MetricsServiceConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig build() {
      io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig buildPartial() {
      io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig result = new io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.grpcService_ = grpcServiceBuilder_ == null
            ? grpcService_
            : grpcServiceBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig other) {
      if (other == io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig.getDefaultInstance()) return this;
      if (other.hasGrpcService()) {
        mergeGrpcService(other.getGrpcService());
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

    private io.envoyproxy.envoy.api.v2.core.GrpcService grpcService_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.GrpcService, io.envoyproxy.envoy.api.v2.core.GrpcService.Builder, io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder> grpcServiceBuilder_;
    /**
     * <pre>
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the grpcService field is set.
     */
    public boolean hasGrpcService() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     * @return The grpcService.
     */
    public io.envoyproxy.envoy.api.v2.core.GrpcService getGrpcService() {
      if (grpcServiceBuilder_ == null) {
        return grpcService_ == null ? io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
      } else {
        return grpcServiceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setGrpcService(io.envoyproxy.envoy.api.v2.core.GrpcService value) {
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
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setGrpcService(
        io.envoyproxy.envoy.api.v2.core.GrpcService.Builder builderForValue) {
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
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeGrpcService(io.envoyproxy.envoy.api.v2.core.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          grpcService_ != null &&
          grpcService_ != io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance()) {
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
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
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
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.api.v2.core.GrpcService.Builder getGrpcServiceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGrpcServiceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
      if (grpcServiceBuilder_ != null) {
        return grpcServiceBuilder_.getMessageOrBuilder();
      } else {
        return grpcService_ == null ?
            io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
      }
    }
    /**
     * <pre>
     * The upstream gRPC cluster that hosts the metrics service.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.GrpcService, io.envoyproxy.envoy.api.v2.core.GrpcService.Builder, io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder> 
        getGrpcServiceFieldBuilder() {
      if (grpcServiceBuilder_ == null) {
        grpcServiceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.GrpcService, io.envoyproxy.envoy.api.v2.core.GrpcService.Builder, io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder>(
                getGrpcService(),
                getParentForChildren(),
                isClean());
        grpcService_ = null;
      }
      return grpcServiceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.metrics.v2.MetricsServiceConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.metrics.v2.MetricsServiceConfig)
  private static final io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig();
  }

  public static io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricsServiceConfig>
      PARSER = new com.google.protobuf.AbstractParser<MetricsServiceConfig>() {
    @java.lang.Override
    public MetricsServiceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetricsServiceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricsServiceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.metrics.v2.MetricsServiceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
