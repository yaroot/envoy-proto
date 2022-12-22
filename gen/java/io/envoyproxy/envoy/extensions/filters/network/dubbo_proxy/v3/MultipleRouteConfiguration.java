// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/dubbo_proxy/v3/route.proto

package io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3;

/**
 * Protobuf type {@code envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration}
 */
public final class MultipleRouteConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration)
    MultipleRouteConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultipleRouteConfiguration.newBuilder() to construct.
  private MultipleRouteConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultipleRouteConfiguration() {
    name_ = "";
    routeConfig_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultipleRouteConfiguration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_MultipleRouteConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_MultipleRouteConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.class, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the named route configurations. This name is used in asynchronous route discovery.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the named route configurations. This name is used in asynchronous route discovery.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUTE_CONFIG_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration> routeConfig_;
  /**
   * <pre>
   * The route table of the dubbo connection manager.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration> getRouteConfigList() {
    return routeConfig_;
  }
  /**
   * <pre>
   * The route table of the dubbo connection manager.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder> 
      getRouteConfigOrBuilderList() {
    return routeConfig_;
  }
  /**
   * <pre>
   * The route table of the dubbo connection manager.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  @java.lang.Override
  public int getRouteConfigCount() {
    return routeConfig_.size();
  }
  /**
   * <pre>
   * The route table of the dubbo connection manager.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration getRouteConfig(int index) {
    return routeConfig_.get(index);
  }
  /**
   * <pre>
   * The route table of the dubbo connection manager.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder getRouteConfigOrBuilder(
      int index) {
    return routeConfig_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < routeConfig_.size(); i++) {
      output.writeMessage(4, routeConfig_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < routeConfig_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, routeConfig_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration other = (io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getRouteConfigList()
        .equals(other.getRouteConfigList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getRouteConfigCount() > 0) {
      hash = (37 * hash) + ROUTE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getRouteConfigList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration)
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_MultipleRouteConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_MultipleRouteConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.class, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.newBuilder()
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
      name_ = "";
      if (routeConfigBuilder_ == null) {
        routeConfig_ = java.util.Collections.emptyList();
      } else {
        routeConfig_ = null;
        routeConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_MultipleRouteConfiguration_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration build() {
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration buildPartial() {
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration result = new io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration result) {
      if (routeConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          routeConfig_ = java.util.Collections.unmodifiableList(routeConfig_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.routeConfig_ = routeConfig_;
      } else {
        result.routeConfig_ = routeConfigBuilder_.build();
      }
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration other) {
      if (other == io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (routeConfigBuilder_ == null) {
        if (!other.routeConfig_.isEmpty()) {
          if (routeConfig_.isEmpty()) {
            routeConfig_ = other.routeConfig_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRouteConfigIsMutable();
            routeConfig_.addAll(other.routeConfig_);
          }
          onChanged();
        }
      } else {
        if (!other.routeConfig_.isEmpty()) {
          if (routeConfigBuilder_.isEmpty()) {
            routeConfigBuilder_.dispose();
            routeConfigBuilder_ = null;
            routeConfig_ = other.routeConfig_;
            bitField0_ = (bitField0_ & ~0x00000002);
            routeConfigBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRouteConfigFieldBuilder() : null;
          } else {
            routeConfigBuilder_.addAllMessages(other.routeConfig_);
          }
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 34: {
              io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration m =
                  input.readMessage(
                      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.parser(),
                      extensionRegistry);
              if (routeConfigBuilder_ == null) {
                ensureRouteConfigIsMutable();
                routeConfig_.add(m);
              } else {
                routeConfigBuilder_.addMessage(m);
              }
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the named route configurations. This name is used in asynchronous route discovery.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the named route configurations. This name is used in asynchronous route discovery.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the named route configurations. This name is used in asynchronous route discovery.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the named route configurations. This name is used in asynchronous route discovery.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the named route configurations. This name is used in asynchronous route discovery.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration> routeConfig_ =
      java.util.Collections.emptyList();
    private void ensureRouteConfigIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        routeConfig_ = new java.util.ArrayList<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration>(routeConfig_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder> routeConfigBuilder_;

    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration> getRouteConfigList() {
      if (routeConfigBuilder_ == null) {
        return java.util.Collections.unmodifiableList(routeConfig_);
      } else {
        return routeConfigBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public int getRouteConfigCount() {
      if (routeConfigBuilder_ == null) {
        return routeConfig_.size();
      } else {
        return routeConfigBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration getRouteConfig(int index) {
      if (routeConfigBuilder_ == null) {
        return routeConfig_.get(index);
      } else {
        return routeConfigBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder setRouteConfig(
        int index, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration value) {
      if (routeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRouteConfigIsMutable();
        routeConfig_.set(index, value);
        onChanged();
      } else {
        routeConfigBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder setRouteConfig(
        int index, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder builderForValue) {
      if (routeConfigBuilder_ == null) {
        ensureRouteConfigIsMutable();
        routeConfig_.set(index, builderForValue.build());
        onChanged();
      } else {
        routeConfigBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder addRouteConfig(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration value) {
      if (routeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRouteConfigIsMutable();
        routeConfig_.add(value);
        onChanged();
      } else {
        routeConfigBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder addRouteConfig(
        int index, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration value) {
      if (routeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRouteConfigIsMutable();
        routeConfig_.add(index, value);
        onChanged();
      } else {
        routeConfigBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder addRouteConfig(
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder builderForValue) {
      if (routeConfigBuilder_ == null) {
        ensureRouteConfigIsMutable();
        routeConfig_.add(builderForValue.build());
        onChanged();
      } else {
        routeConfigBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder addRouteConfig(
        int index, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder builderForValue) {
      if (routeConfigBuilder_ == null) {
        ensureRouteConfigIsMutable();
        routeConfig_.add(index, builderForValue.build());
        onChanged();
      } else {
        routeConfigBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder addAllRouteConfig(
        java.lang.Iterable<? extends io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration> values) {
      if (routeConfigBuilder_ == null) {
        ensureRouteConfigIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, routeConfig_);
        onChanged();
      } else {
        routeConfigBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder clearRouteConfig() {
      if (routeConfigBuilder_ == null) {
        routeConfig_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        routeConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public Builder removeRouteConfig(int index) {
      if (routeConfigBuilder_ == null) {
        ensureRouteConfigIsMutable();
        routeConfig_.remove(index);
        onChanged();
      } else {
        routeConfigBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder getRouteConfigBuilder(
        int index) {
      return getRouteConfigFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder getRouteConfigOrBuilder(
        int index) {
      if (routeConfigBuilder_ == null) {
        return routeConfig_.get(index);  } else {
        return routeConfigBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder> 
         getRouteConfigOrBuilderList() {
      if (routeConfigBuilder_ != null) {
        return routeConfigBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(routeConfig_);
      }
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder addRouteConfigBuilder() {
      return getRouteConfigFieldBuilder().addBuilder(
          io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.getDefaultInstance());
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder addRouteConfigBuilder(
        int index) {
      return getRouteConfigFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.getDefaultInstance());
    }
    /**
     * <pre>
     * The route table of the dubbo connection manager.
     * </pre>
     *
     * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
     */
    public java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder> 
         getRouteConfigBuilderList() {
      return getRouteConfigFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder> 
        getRouteConfigFieldBuilder() {
      if (routeConfigBuilder_ == null) {
        routeConfigBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder>(
                routeConfig_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        routeConfig_ = null;
      }
      return routeConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration)
  private static final io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration();
  }

  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultipleRouteConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<MultipleRouteConfiguration>() {
    @java.lang.Override
    public MultipleRouteConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultipleRouteConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultipleRouteConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.MultipleRouteConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
