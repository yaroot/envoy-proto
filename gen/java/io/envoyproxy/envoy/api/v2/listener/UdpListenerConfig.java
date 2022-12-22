// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/listener/udp_listener_config.proto

package io.envoyproxy.envoy.api.v2.listener;

/**
 * Protobuf type {@code envoy.api.v2.listener.UdpListenerConfig}
 */
public final class UdpListenerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.listener.UdpListenerConfig)
    UdpListenerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UdpListenerConfig.newBuilder() to construct.
  private UdpListenerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UdpListenerConfig() {
    udpListenerName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UdpListenerConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.listener.UdpListenerConfigProto.internal_static_envoy_api_v2_listener_UdpListenerConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.api.v2.listener.UdpListenerConfigProto.internal_static_envoy_api_v2_listener_UdpListenerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.class, io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.Builder.class);
  }

  private int configTypeCase_ = 0;
  private java.lang.Object configType_;
  public enum ConfigTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    @java.lang.Deprecated CONFIG(2),
    TYPED_CONFIG(3),
    CONFIGTYPE_NOT_SET(0);
    private final int value;
    private ConfigTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigTypeCase forNumber(int value) {
      switch (value) {
        case 2: return CONFIG;
        case 3: return TYPED_CONFIG;
        case 0: return CONFIGTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConfigTypeCase
  getConfigTypeCase() {
    return ConfigTypeCase.forNumber(
        configTypeCase_);
  }

  public static final int UDP_LISTENER_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object udpListenerName_ = "";
  /**
   * <pre>
   * Used to look up UDP listener factory, matches "raw_udp_listener" or
   * "quic_listener" to create a specific udp listener.
   * If not specified, treat as "raw_udp_listener".
   * </pre>
   *
   * <code>string udp_listener_name = 1;</code>
   * @return The udpListenerName.
   */
  @java.lang.Override
  public java.lang.String getUdpListenerName() {
    java.lang.Object ref = udpListenerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      udpListenerName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Used to look up UDP listener factory, matches "raw_udp_listener" or
   * "quic_listener" to create a specific udp listener.
   * If not specified, treat as "raw_udp_listener".
   * </pre>
   *
   * <code>string udp_listener_name = 1;</code>
   * @return The bytes for udpListenerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUdpListenerNameBytes() {
    java.lang.Object ref = udpListenerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      udpListenerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  /**
   * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
   * @deprecated envoy.api.v2.listener.UdpListenerConfig.config is deprecated.
   *     See envoy/api/v2/listener/udp_listener_config.proto;l=31
   * @return Whether the config field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasConfig() {
    return configTypeCase_ == 2;
  }
  /**
   * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
   * @deprecated envoy.api.v2.listener.UdpListenerConfig.config is deprecated.
   *     See envoy/api/v2/listener/udp_listener_config.proto;l=31
   * @return The config.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.Struct getConfig() {
    if (configTypeCase_ == 2) {
       return (com.google.protobuf.Struct) configType_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.StructOrBuilder getConfigOrBuilder() {
    if (configTypeCase_ == 2) {
       return (com.google.protobuf.Struct) configType_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }

  public static final int TYPED_CONFIG_FIELD_NUMBER = 3;
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return Whether the typedConfig field is set.
   */
  @java.lang.Override
  public boolean hasTypedConfig() {
    return configTypeCase_ == 3;
  }
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return The typedConfig.
   */
  @java.lang.Override
  public com.google.protobuf.Any getTypedConfig() {
    if (configTypeCase_ == 3) {
       return (com.google.protobuf.Any) configType_;
    }
    return com.google.protobuf.Any.getDefaultInstance();
  }
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder() {
    if (configTypeCase_ == 3) {
       return (com.google.protobuf.Any) configType_;
    }
    return com.google.protobuf.Any.getDefaultInstance();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(udpListenerName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, udpListenerName_);
    }
    if (configTypeCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Struct) configType_);
    }
    if (configTypeCase_ == 3) {
      output.writeMessage(3, (com.google.protobuf.Any) configType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(udpListenerName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, udpListenerName_);
    }
    if (configTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.protobuf.Struct) configType_);
    }
    if (configTypeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.protobuf.Any) configType_);
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
    if (!(obj instanceof io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig other = (io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig) obj;

    if (!getUdpListenerName()
        .equals(other.getUdpListenerName())) return false;
    if (!getConfigTypeCase().equals(other.getConfigTypeCase())) return false;
    switch (configTypeCase_) {
      case 2:
        if (!getConfig()
            .equals(other.getConfig())) return false;
        break;
      case 3:
        if (!getTypedConfig()
            .equals(other.getTypedConfig())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + UDP_LISTENER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUdpListenerName().hashCode();
    switch (configTypeCase_) {
      case 2:
        hash = (37 * hash) + CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getConfig().hashCode();
        break;
      case 3:
        hash = (37 * hash) + TYPED_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getTypedConfig().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig prototype) {
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
   * Protobuf type {@code envoy.api.v2.listener.UdpListenerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.listener.UdpListenerConfig)
      io.envoyproxy.envoy.api.v2.listener.UdpListenerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.listener.UdpListenerConfigProto.internal_static_envoy_api_v2_listener_UdpListenerConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.api.v2.listener.UdpListenerConfigProto.internal_static_envoy_api_v2_listener_UdpListenerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.class, io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.newBuilder()
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
      udpListenerName_ = "";
      if (configBuilder_ != null) {
        configBuilder_.clear();
      }
      if (typedConfigBuilder_ != null) {
        typedConfigBuilder_.clear();
      }
      configTypeCase_ = 0;
      configType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.api.v2.listener.UdpListenerConfigProto.internal_static_envoy_api_v2_listener_UdpListenerConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig build() {
      io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig buildPartial() {
      io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig result = new io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.udpListenerName_ = udpListenerName_;
      }
    }

    private void buildPartialOneofs(io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig result) {
      result.configTypeCase_ = configTypeCase_;
      result.configType_ = this.configType_;
      if (configTypeCase_ == 2 &&
          configBuilder_ != null) {
        result.configType_ = configBuilder_.build();
      }
      if (configTypeCase_ == 3 &&
          typedConfigBuilder_ != null) {
        result.configType_ = typedConfigBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig) {
        return mergeFrom((io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig other) {
      if (other == io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig.getDefaultInstance()) return this;
      if (!other.getUdpListenerName().isEmpty()) {
        udpListenerName_ = other.udpListenerName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getConfigTypeCase()) {
        case CONFIG: {
          mergeConfig(other.getConfig());
          break;
        }
        case TYPED_CONFIG: {
          mergeTypedConfig(other.getTypedConfig());
          break;
        }
        case CONFIGTYPE_NOT_SET: {
          break;
        }
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
              udpListenerName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              configTypeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTypedConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              configTypeCase_ = 3;
              break;
            } // case 26
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
    private int configTypeCase_ = 0;
    private java.lang.Object configType_;
    public ConfigTypeCase
        getConfigTypeCase() {
      return ConfigTypeCase.forNumber(
          configTypeCase_);
    }

    public Builder clearConfigType() {
      configTypeCase_ = 0;
      configType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object udpListenerName_ = "";
    /**
     * <pre>
     * Used to look up UDP listener factory, matches "raw_udp_listener" or
     * "quic_listener" to create a specific udp listener.
     * If not specified, treat as "raw_udp_listener".
     * </pre>
     *
     * <code>string udp_listener_name = 1;</code>
     * @return The udpListenerName.
     */
    public java.lang.String getUdpListenerName() {
      java.lang.Object ref = udpListenerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        udpListenerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Used to look up UDP listener factory, matches "raw_udp_listener" or
     * "quic_listener" to create a specific udp listener.
     * If not specified, treat as "raw_udp_listener".
     * </pre>
     *
     * <code>string udp_listener_name = 1;</code>
     * @return The bytes for udpListenerName.
     */
    public com.google.protobuf.ByteString
        getUdpListenerNameBytes() {
      java.lang.Object ref = udpListenerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        udpListenerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Used to look up UDP listener factory, matches "raw_udp_listener" or
     * "quic_listener" to create a specific udp listener.
     * If not specified, treat as "raw_udp_listener".
     * </pre>
     *
     * <code>string udp_listener_name = 1;</code>
     * @param value The udpListenerName to set.
     * @return This builder for chaining.
     */
    public Builder setUdpListenerName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      udpListenerName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to look up UDP listener factory, matches "raw_udp_listener" or
     * "quic_listener" to create a specific udp listener.
     * If not specified, treat as "raw_udp_listener".
     * </pre>
     *
     * <code>string udp_listener_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUdpListenerName() {
      udpListenerName_ = getDefaultInstance().getUdpListenerName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to look up UDP listener factory, matches "raw_udp_listener" or
     * "quic_listener" to create a specific udp listener.
     * If not specified, treat as "raw_udp_listener".
     * </pre>
     *
     * <code>string udp_listener_name = 1;</code>
     * @param value The bytes for udpListenerName to set.
     * @return This builder for chaining.
     */
    public Builder setUdpListenerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      udpListenerName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> configBuilder_;
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     * @deprecated envoy.api.v2.listener.UdpListenerConfig.config is deprecated.
     *     See envoy/api/v2/listener/udp_listener_config.proto;l=31
     * @return Whether the config field is set.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean hasConfig() {
      return configTypeCase_ == 2;
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     * @deprecated envoy.api.v2.listener.UdpListenerConfig.config is deprecated.
     *     See envoy/api/v2/listener/udp_listener_config.proto;l=31
     * @return The config.
     */
    @java.lang.Override
    @java.lang.Deprecated public com.google.protobuf.Struct getConfig() {
      if (configBuilder_ == null) {
        if (configTypeCase_ == 2) {
          return (com.google.protobuf.Struct) configType_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      } else {
        if (configTypeCase_ == 2) {
          return configBuilder_.getMessage();
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setConfig(com.google.protobuf.Struct value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configType_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }
      configTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setConfig(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (configBuilder_ == null) {
        configType_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      configTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeConfig(com.google.protobuf.Struct value) {
      if (configBuilder_ == null) {
        if (configTypeCase_ == 2 &&
            configType_ != com.google.protobuf.Struct.getDefaultInstance()) {
          configType_ = com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) configType_)
              .mergeFrom(value).buildPartial();
        } else {
          configType_ = value;
        }
        onChanged();
      } else {
        if (configTypeCase_ == 2) {
          configBuilder_.mergeFrom(value);
        } else {
          configBuilder_.setMessage(value);
        }
      }
      configTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearConfig() {
      if (configBuilder_ == null) {
        if (configTypeCase_ == 2) {
          configTypeCase_ = 0;
          configType_ = null;
          onChanged();
        }
      } else {
        if (configTypeCase_ == 2) {
          configTypeCase_ = 0;
          configType_ = null;
        }
        configBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.protobuf.Struct.Builder getConfigBuilder() {
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    @java.lang.Override
    @java.lang.Deprecated public com.google.protobuf.StructOrBuilder getConfigOrBuilder() {
      if ((configTypeCase_ == 2) && (configBuilder_ != null)) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        if (configTypeCase_ == 2) {
          return (com.google.protobuf.Struct) configType_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Struct config = 2 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        if (!(configTypeCase_ == 2)) {
          configType_ = com.google.protobuf.Struct.getDefaultInstance();
        }
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                (com.google.protobuf.Struct) configType_,
                getParentForChildren(),
                isClean());
        configType_ = null;
      }
      configTypeCase_ = 2;
      onChanged();
      return configBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> typedConfigBuilder_;
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     * @return Whether the typedConfig field is set.
     */
    @java.lang.Override
    public boolean hasTypedConfig() {
      return configTypeCase_ == 3;
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     * @return The typedConfig.
     */
    @java.lang.Override
    public com.google.protobuf.Any getTypedConfig() {
      if (typedConfigBuilder_ == null) {
        if (configTypeCase_ == 3) {
          return (com.google.protobuf.Any) configType_;
        }
        return com.google.protobuf.Any.getDefaultInstance();
      } else {
        if (configTypeCase_ == 3) {
          return typedConfigBuilder_.getMessage();
        }
        return com.google.protobuf.Any.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    public Builder setTypedConfig(com.google.protobuf.Any value) {
      if (typedConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configType_ = value;
        onChanged();
      } else {
        typedConfigBuilder_.setMessage(value);
      }
      configTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    public Builder setTypedConfig(
        com.google.protobuf.Any.Builder builderForValue) {
      if (typedConfigBuilder_ == null) {
        configType_ = builderForValue.build();
        onChanged();
      } else {
        typedConfigBuilder_.setMessage(builderForValue.build());
      }
      configTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    public Builder mergeTypedConfig(com.google.protobuf.Any value) {
      if (typedConfigBuilder_ == null) {
        if (configTypeCase_ == 3 &&
            configType_ != com.google.protobuf.Any.getDefaultInstance()) {
          configType_ = com.google.protobuf.Any.newBuilder((com.google.protobuf.Any) configType_)
              .mergeFrom(value).buildPartial();
        } else {
          configType_ = value;
        }
        onChanged();
      } else {
        if (configTypeCase_ == 3) {
          typedConfigBuilder_.mergeFrom(value);
        } else {
          typedConfigBuilder_.setMessage(value);
        }
      }
      configTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    public Builder clearTypedConfig() {
      if (typedConfigBuilder_ == null) {
        if (configTypeCase_ == 3) {
          configTypeCase_ = 0;
          configType_ = null;
          onChanged();
        }
      } else {
        if (configTypeCase_ == 3) {
          configTypeCase_ = 0;
          configType_ = null;
        }
        typedConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    public com.google.protobuf.Any.Builder getTypedConfigBuilder() {
      return getTypedConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder() {
      if ((configTypeCase_ == 3) && (typedConfigBuilder_ != null)) {
        return typedConfigBuilder_.getMessageOrBuilder();
      } else {
        if (configTypeCase_ == 3) {
          return (com.google.protobuf.Any) configType_;
        }
        return com.google.protobuf.Any.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Any typed_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getTypedConfigFieldBuilder() {
      if (typedConfigBuilder_ == null) {
        if (!(configTypeCase_ == 3)) {
          configType_ = com.google.protobuf.Any.getDefaultInstance();
        }
        typedConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                (com.google.protobuf.Any) configType_,
                getParentForChildren(),
                isClean());
        configType_ = null;
      }
      configTypeCase_ = 3;
      onChanged();
      return typedConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.listener.UdpListenerConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.listener.UdpListenerConfig)
  private static final io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig();
  }

  public static io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UdpListenerConfig>
      PARSER = new com.google.protobuf.AbstractParser<UdpListenerConfig>() {
    @java.lang.Override
    public UdpListenerConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<UdpListenerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UdpListenerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.listener.UdpListenerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

