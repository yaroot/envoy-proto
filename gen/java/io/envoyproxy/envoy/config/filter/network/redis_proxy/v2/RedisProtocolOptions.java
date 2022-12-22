// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/redis_proxy/v2/redis_proxy.proto

package io.envoyproxy.envoy.config.filter.network.redis_proxy.v2;

/**
 * <pre>
 * RedisProtocolOptions specifies Redis upstream protocol options. This object is used in
 * :ref:`typed_extension_protocol_options&lt;envoy_api_field_Cluster.typed_extension_protocol_options&gt;`,
 * keyed by the name `envoy.filters.network.redis_proxy`.
 * </pre>
 *
 * Protobuf type {@code envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions}
 */
public final class RedisProtocolOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions)
    RedisProtocolOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedisProtocolOptions.newBuilder() to construct.
  private RedisProtocolOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedisProtocolOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedisProtocolOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProxyProto.internal_static_envoy_config_filter_network_redis_proxy_v2_RedisProtocolOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProxyProto.internal_static_envoy_config_filter_network_redis_proxy_v2_RedisProtocolOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.class, io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.Builder.class);
  }

  public static final int AUTH_PASSWORD_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.api.v2.core.DataSource authPassword_;
  /**
   * <pre>
   * Upstream server password as defined by the `requirepass` directive
   * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
   * @return Whether the authPassword field is set.
   */
  @java.lang.Override
  public boolean hasAuthPassword() {
    return authPassword_ != null;
  }
  /**
   * <pre>
   * Upstream server password as defined by the `requirepass` directive
   * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
   * @return The authPassword.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.DataSource getAuthPassword() {
    return authPassword_ == null ? io.envoyproxy.envoy.api.v2.core.DataSource.getDefaultInstance() : authPassword_;
  }
  /**
   * <pre>
   * Upstream server password as defined by the `requirepass` directive
   * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder getAuthPasswordOrBuilder() {
    return authPassword_ == null ? io.envoyproxy.envoy.api.v2.core.DataSource.getDefaultInstance() : authPassword_;
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
    if (authPassword_ != null) {
      output.writeMessage(1, getAuthPassword());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authPassword_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAuthPassword());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions other = (io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions) obj;

    if (hasAuthPassword() != other.hasAuthPassword()) return false;
    if (hasAuthPassword()) {
      if (!getAuthPassword()
          .equals(other.getAuthPassword())) return false;
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
    if (hasAuthPassword()) {
      hash = (37 * hash) + AUTH_PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getAuthPassword().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions prototype) {
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
   * RedisProtocolOptions specifies Redis upstream protocol options. This object is used in
   * :ref:`typed_extension_protocol_options&lt;envoy_api_field_Cluster.typed_extension_protocol_options&gt;`,
   * keyed by the name `envoy.filters.network.redis_proxy`.
   * </pre>
   *
   * Protobuf type {@code envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions)
      io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProxyProto.internal_static_envoy_config_filter_network_redis_proxy_v2_RedisProtocolOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProxyProto.internal_static_envoy_config_filter_network_redis_proxy_v2_RedisProtocolOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.class, io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.newBuilder()
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
      authPassword_ = null;
      if (authPasswordBuilder_ != null) {
        authPasswordBuilder_.dispose();
        authPasswordBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProxyProto.internal_static_envoy_config_filter_network_redis_proxy_v2_RedisProtocolOptions_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions build() {
      io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions buildPartial() {
      io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions result = new io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authPassword_ = authPasswordBuilder_ == null
            ? authPassword_
            : authPasswordBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions other) {
      if (other == io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions.getDefaultInstance()) return this;
      if (other.hasAuthPassword()) {
        mergeAuthPassword(other.getAuthPassword());
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
                  getAuthPasswordFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.api.v2.core.DataSource authPassword_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.DataSource, io.envoyproxy.envoy.api.v2.core.DataSource.Builder, io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder> authPasswordBuilder_;
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     * @return Whether the authPassword field is set.
     */
    public boolean hasAuthPassword() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     * @return The authPassword.
     */
    public io.envoyproxy.envoy.api.v2.core.DataSource getAuthPassword() {
      if (authPasswordBuilder_ == null) {
        return authPassword_ == null ? io.envoyproxy.envoy.api.v2.core.DataSource.getDefaultInstance() : authPassword_;
      } else {
        return authPasswordBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    public Builder setAuthPassword(io.envoyproxy.envoy.api.v2.core.DataSource value) {
      if (authPasswordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authPassword_ = value;
      } else {
        authPasswordBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    public Builder setAuthPassword(
        io.envoyproxy.envoy.api.v2.core.DataSource.Builder builderForValue) {
      if (authPasswordBuilder_ == null) {
        authPassword_ = builderForValue.build();
      } else {
        authPasswordBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    public Builder mergeAuthPassword(io.envoyproxy.envoy.api.v2.core.DataSource value) {
      if (authPasswordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          authPassword_ != null &&
          authPassword_ != io.envoyproxy.envoy.api.v2.core.DataSource.getDefaultInstance()) {
          getAuthPasswordBuilder().mergeFrom(value);
        } else {
          authPassword_ = value;
        }
      } else {
        authPasswordBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    public Builder clearAuthPassword() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authPassword_ = null;
      if (authPasswordBuilder_ != null) {
        authPasswordBuilder_.dispose();
        authPasswordBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    public io.envoyproxy.envoy.api.v2.core.DataSource.Builder getAuthPasswordBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuthPasswordFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    public io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder getAuthPasswordOrBuilder() {
      if (authPasswordBuilder_ != null) {
        return authPasswordBuilder_.getMessageOrBuilder();
      } else {
        return authPassword_ == null ?
            io.envoyproxy.envoy.api.v2.core.DataSource.getDefaultInstance() : authPassword_;
      }
    }
    /**
     * <pre>
     * Upstream server password as defined by the `requirepass` directive
     * &lt;https://redis.io/topics/config&gt;`_ in the server's configuration file.
     * </pre>
     *
     * <code>.envoy.api.v2.core.DataSource auth_password = 1 [(.udpa.annotations.sensitive) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.DataSource, io.envoyproxy.envoy.api.v2.core.DataSource.Builder, io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder> 
        getAuthPasswordFieldBuilder() {
      if (authPasswordBuilder_ == null) {
        authPasswordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.DataSource, io.envoyproxy.envoy.api.v2.core.DataSource.Builder, io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder>(
                getAuthPassword(),
                getParentForChildren(),
                isClean());
        authPassword_ = null;
      }
      return authPasswordBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions)
  private static final io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions();
  }

  public static io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedisProtocolOptions>
      PARSER = new com.google.protobuf.AbstractParser<RedisProtocolOptions>() {
    @java.lang.Override
    public RedisProtocolOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<RedisProtocolOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedisProtocolOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.network.redis_proxy.v2.RedisProtocolOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
