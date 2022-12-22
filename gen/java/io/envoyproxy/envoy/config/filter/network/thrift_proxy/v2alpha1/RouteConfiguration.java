// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/thrift_proxy/v2alpha1/route.proto

package io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1;

/**
 * Protobuf type {@code envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration}
 */
public final class RouteConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration)
    RouteConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteConfiguration.newBuilder() to construct.
  private RouteConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteConfiguration() {
    name_ = "";
    routes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouteConfiguration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteProto.internal_static_envoy_config_filter_network_thrift_proxy_v2alpha1_RouteConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteProto.internal_static_envoy_config_filter_network_thrift_proxy_v2alpha1_RouteConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.class, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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
   * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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

  public static final int ROUTES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route> routes_;
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route> getRoutesList() {
    return routes_;
  }
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder> 
      getRoutesOrBuilderList() {
    return routes_;
  }
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
   */
  @java.lang.Override
  public int getRoutesCount() {
    return routes_.size();
  }
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route getRoutes(int index) {
    return routes_.get(index);
  }
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder getRoutesOrBuilder(
      int index) {
    return routes_.get(index);
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
    for (int i = 0; i < routes_.size(); i++) {
      output.writeMessage(2, routes_.get(i));
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
    for (int i = 0; i < routes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, routes_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration other = (io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getRoutesList()
        .equals(other.getRoutesList())) return false;
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
    if (getRoutesCount() > 0) {
      hash = (37 * hash) + ROUTES_FIELD_NUMBER;
      hash = (53 * hash) + getRoutesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration prototype) {
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
   * Protobuf type {@code envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration)
      io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteProto.internal_static_envoy_config_filter_network_thrift_proxy_v2alpha1_RouteConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteProto.internal_static_envoy_config_filter_network_thrift_proxy_v2alpha1_RouteConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.class, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.newBuilder()
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
      if (routesBuilder_ == null) {
        routes_ = java.util.Collections.emptyList();
      } else {
        routes_ = null;
        routesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteProto.internal_static_envoy_config_filter_network_thrift_proxy_v2alpha1_RouteConfiguration_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration build() {
      io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration buildPartial() {
      io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration result = new io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration result) {
      if (routesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          routes_ = java.util.Collections.unmodifiableList(routes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.routes_ = routes_;
      } else {
        result.routes_ = routesBuilder_.build();
      }
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration result) {
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
      if (other instanceof io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration other) {
      if (other == io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (routesBuilder_ == null) {
        if (!other.routes_.isEmpty()) {
          if (routes_.isEmpty()) {
            routes_ = other.routes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRoutesIsMutable();
            routes_.addAll(other.routes_);
          }
          onChanged();
        }
      } else {
        if (!other.routes_.isEmpty()) {
          if (routesBuilder_.isEmpty()) {
            routesBuilder_.dispose();
            routesBuilder_ = null;
            routes_ = other.routes_;
            bitField0_ = (bitField0_ & ~0x00000002);
            routesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoutesFieldBuilder() : null;
          } else {
            routesBuilder_.addAllMessages(other.routes_);
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
            case 18: {
              io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route m =
                  input.readMessage(
                      io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.parser(),
                      extensionRegistry);
              if (routesBuilder_ == null) {
                ensureRoutesIsMutable();
                routes_.add(m);
              } else {
                routesBuilder_.addMessage(m);
              }
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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
     * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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
     * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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
     * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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
     * The name of the route configuration. Reserved for future use in asynchronous route discovery.
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

    private java.util.List<io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route> routes_ =
      java.util.Collections.emptyList();
    private void ensureRoutesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        routes_ = new java.util.ArrayList<io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route>(routes_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder> routesBuilder_;

    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route> getRoutesList() {
      if (routesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(routes_);
      } else {
        return routesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public int getRoutesCount() {
      if (routesBuilder_ == null) {
        return routes_.size();
      } else {
        return routesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route getRoutes(int index) {
      if (routesBuilder_ == null) {
        return routes_.get(index);
      } else {
        return routesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder setRoutes(
        int index, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route value) {
      if (routesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutesIsMutable();
        routes_.set(index, value);
        onChanged();
      } else {
        routesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder setRoutes(
        int index, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder builderForValue) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.set(index, builderForValue.build());
        onChanged();
      } else {
        routesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder addRoutes(io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route value) {
      if (routesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutesIsMutable();
        routes_.add(value);
        onChanged();
      } else {
        routesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder addRoutes(
        int index, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route value) {
      if (routesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutesIsMutable();
        routes_.add(index, value);
        onChanged();
      } else {
        routesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder addRoutes(
        io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder builderForValue) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.add(builderForValue.build());
        onChanged();
      } else {
        routesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder addRoutes(
        int index, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder builderForValue) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.add(index, builderForValue.build());
        onChanged();
      } else {
        routesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder addAllRoutes(
        java.lang.Iterable<? extends io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route> values) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, routes_);
        onChanged();
      } else {
        routesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder clearRoutes() {
      if (routesBuilder_ == null) {
        routes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        routesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public Builder removeRoutes(int index) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.remove(index);
        onChanged();
      } else {
        routesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder getRoutesBuilder(
        int index) {
      return getRoutesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder getRoutesOrBuilder(
        int index) {
      if (routesBuilder_ == null) {
        return routes_.get(index);  } else {
        return routesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder> 
         getRoutesOrBuilderList() {
      if (routesBuilder_ != null) {
        return routesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(routes_);
      }
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder addRoutesBuilder() {
      return getRoutesFieldBuilder().addBuilder(
          io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder addRoutesBuilder(
        int index) {
      return getRoutesFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of routes that will be matched, in order, against incoming requests. The first route
     * that matches will be used.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.network.thrift_proxy.v2alpha1.Route routes = 2;</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder> 
         getRoutesBuilderList() {
      return getRoutesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder> 
        getRoutesFieldBuilder() {
      if (routesBuilder_ == null) {
        routesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.Route.Builder, io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteOrBuilder>(
                routes_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        routes_ = null;
      }
      return routesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration)
  private static final io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration();
  }

  public static io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<RouteConfiguration>() {
    @java.lang.Override
    public RouteConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouteConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.RouteConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
