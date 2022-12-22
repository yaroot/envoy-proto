// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/access_loggers/grpc/v3/als.proto

package io.envoyproxy.envoy.extensions.access_loggers.grpc.v3;

/**
 * <pre>
 * Configuration for the built-in ``envoy.access_loggers.tcp_grpc`` type. This configuration will
 * populate ``StreamAccessLogsMessage.tcp_logs``.
 * [#extension: envoy.access_loggers.tcp_grpc]
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig}
 */
public final class TcpGrpcAccessLogConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig)
    TcpGrpcAccessLogConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TcpGrpcAccessLogConfig.newBuilder() to construct.
  private TcpGrpcAccessLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TcpGrpcAccessLogConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TcpGrpcAccessLogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.AlsProto.internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.AlsProto.internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.class, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.Builder.class);
  }

  public static final int COMMON_CONFIG_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig commonConfig_;
  /**
   * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the commonConfig field is set.
   */
  @java.lang.Override
  public boolean hasCommonConfig() {
    return commonConfig_ != null;
  }
  /**
   * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
   * @return The commonConfig.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig getCommonConfig() {
    return commonConfig_ == null ? io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.getDefaultInstance() : commonConfig_;
  }
  /**
   * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfigOrBuilder getCommonConfigOrBuilder() {
    return commonConfig_ == null ? io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.getDefaultInstance() : commonConfig_;
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
    if (commonConfig_ != null) {
      output.writeMessage(1, getCommonConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commonConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommonConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig other = (io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig) obj;

    if (hasCommonConfig() != other.hasCommonConfig()) return false;
    if (hasCommonConfig()) {
      if (!getCommonConfig()
          .equals(other.getCommonConfig())) return false;
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
    if (hasCommonConfig()) {
      hash = (37 * hash) + COMMON_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getCommonConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig prototype) {
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
   * Configuration for the built-in ``envoy.access_loggers.tcp_grpc`` type. This configuration will
   * populate ``StreamAccessLogsMessage.tcp_logs``.
   * [#extension: envoy.access_loggers.tcp_grpc]
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig)
      io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.AlsProto.internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.AlsProto.internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.class, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.newBuilder()
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
      commonConfig_ = null;
      if (commonConfigBuilder_ != null) {
        commonConfigBuilder_.dispose();
        commonConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.AlsProto.internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig build() {
      io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig buildPartial() {
      io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig result = new io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.commonConfig_ = commonConfigBuilder_ == null
            ? commonConfig_
            : commonConfigBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig) {
        return mergeFrom((io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig other) {
      if (other == io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig.getDefaultInstance()) return this;
      if (other.hasCommonConfig()) {
        mergeCommonConfig(other.getCommonConfig());
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
                  getCommonConfigFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig commonConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.Builder, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfigOrBuilder> commonConfigBuilder_;
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the commonConfig field is set.
     */
    public boolean hasCommonConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     * @return The commonConfig.
     */
    public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig getCommonConfig() {
      if (commonConfigBuilder_ == null) {
        return commonConfig_ == null ? io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.getDefaultInstance() : commonConfig_;
      } else {
        return commonConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setCommonConfig(io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig value) {
      if (commonConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonConfig_ = value;
      } else {
        commonConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setCommonConfig(
        io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.Builder builderForValue) {
      if (commonConfigBuilder_ == null) {
        commonConfig_ = builderForValue.build();
      } else {
        commonConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeCommonConfig(io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig value) {
      if (commonConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          commonConfig_ != null &&
          commonConfig_ != io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.getDefaultInstance()) {
          getCommonConfigBuilder().mergeFrom(value);
        } else {
          commonConfig_ = value;
        }
      } else {
        commonConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearCommonConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commonConfig_ = null;
      if (commonConfigBuilder_ != null) {
        commonConfigBuilder_.dispose();
        commonConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.Builder getCommonConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfigOrBuilder getCommonConfigOrBuilder() {
      if (commonConfigBuilder_ != null) {
        return commonConfigBuilder_.getMessageOrBuilder();
      } else {
        return commonConfig_ == null ?
            io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.getDefaultInstance() : commonConfig_;
      }
    }
    /**
     * <code>.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.Builder, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfigOrBuilder> 
        getCommonConfigFieldBuilder() {
      if (commonConfigBuilder_ == null) {
        commonConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.Builder, io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfigOrBuilder>(
                getCommonConfig(),
                getParentForChildren(),
                isClean());
        commonConfig_ = null;
      }
      return commonConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig)
  private static final io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig();
  }

  public static io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TcpGrpcAccessLogConfig>
      PARSER = new com.google.protobuf.AbstractParser<TcpGrpcAccessLogConfig>() {
    @java.lang.Override
    public TcpGrpcAccessLogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TcpGrpcAccessLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TcpGrpcAccessLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.access_loggers.grpc.v3.TcpGrpcAccessLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

