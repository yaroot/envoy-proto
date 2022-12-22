// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/api_listener.proto

package io.envoyproxy.envoy.config.listener.v3;

/**
 * <pre>
 * Describes a type of API listener, which is used in non-proxy clients. The type of API
 * exposed to the non-proxy application depends on the type of API listener.
 * </pre>
 *
 * Protobuf type {@code envoy.config.listener.v3.ApiListener}
 */
public final class ApiListener extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.listener.v3.ApiListener)
    ApiListenerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiListener.newBuilder() to construct.
  private ApiListener(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiListener() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiListener();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.listener.v3.ApiListenerProto.internal_static_envoy_config_listener_v3_ApiListener_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.listener.v3.ApiListenerProto.internal_static_envoy_config_listener_v3_ApiListener_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.listener.v3.ApiListener.class, io.envoyproxy.envoy.config.listener.v3.ApiListener.Builder.class);
  }

  public static final int API_LISTENER_FIELD_NUMBER = 1;
  private com.google.protobuf.Any apiListener_;
  /**
   * <pre>
   * The type in this field determines the type of API listener. At present, the following
   * types are supported:
   * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
   * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
   * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
   * specific config message for each type of API listener. We could not do this in v2 because
   * it would have caused circular dependencies for go protos: lds.proto depends on this file,
   * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
   * lds.proto, so lds.proto cannot depend on this file.]
   * </pre>
   *
   * <code>.google.protobuf.Any api_listener = 1;</code>
   * @return Whether the apiListener field is set.
   */
  @java.lang.Override
  public boolean hasApiListener() {
    return apiListener_ != null;
  }
  /**
   * <pre>
   * The type in this field determines the type of API listener. At present, the following
   * types are supported:
   * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
   * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
   * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
   * specific config message for each type of API listener. We could not do this in v2 because
   * it would have caused circular dependencies for go protos: lds.proto depends on this file,
   * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
   * lds.proto, so lds.proto cannot depend on this file.]
   * </pre>
   *
   * <code>.google.protobuf.Any api_listener = 1;</code>
   * @return The apiListener.
   */
  @java.lang.Override
  public com.google.protobuf.Any getApiListener() {
    return apiListener_ == null ? com.google.protobuf.Any.getDefaultInstance() : apiListener_;
  }
  /**
   * <pre>
   * The type in this field determines the type of API listener. At present, the following
   * types are supported:
   * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
   * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
   * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
   * specific config message for each type of API listener. We could not do this in v2 because
   * it would have caused circular dependencies for go protos: lds.proto depends on this file,
   * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
   * lds.proto, so lds.proto cannot depend on this file.]
   * </pre>
   *
   * <code>.google.protobuf.Any api_listener = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getApiListenerOrBuilder() {
    return apiListener_ == null ? com.google.protobuf.Any.getDefaultInstance() : apiListener_;
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
    if (apiListener_ != null) {
      output.writeMessage(1, getApiListener());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apiListener_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getApiListener());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.listener.v3.ApiListener)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.listener.v3.ApiListener other = (io.envoyproxy.envoy.config.listener.v3.ApiListener) obj;

    if (hasApiListener() != other.hasApiListener()) return false;
    if (hasApiListener()) {
      if (!getApiListener()
          .equals(other.getApiListener())) return false;
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
    if (hasApiListener()) {
      hash = (37 * hash) + API_LISTENER_FIELD_NUMBER;
      hash = (53 * hash) + getApiListener().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.listener.v3.ApiListener parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.listener.v3.ApiListener prototype) {
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
   * Describes a type of API listener, which is used in non-proxy clients. The type of API
   * exposed to the non-proxy application depends on the type of API listener.
   * </pre>
   *
   * Protobuf type {@code envoy.config.listener.v3.ApiListener}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.listener.v3.ApiListener)
      io.envoyproxy.envoy.config.listener.v3.ApiListenerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.listener.v3.ApiListenerProto.internal_static_envoy_config_listener_v3_ApiListener_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.listener.v3.ApiListenerProto.internal_static_envoy_config_listener_v3_ApiListener_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.listener.v3.ApiListener.class, io.envoyproxy.envoy.config.listener.v3.ApiListener.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.listener.v3.ApiListener.newBuilder()
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
      apiListener_ = null;
      if (apiListenerBuilder_ != null) {
        apiListenerBuilder_.dispose();
        apiListenerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.listener.v3.ApiListenerProto.internal_static_envoy_config_listener_v3_ApiListener_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.listener.v3.ApiListener getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.listener.v3.ApiListener.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.listener.v3.ApiListener build() {
      io.envoyproxy.envoy.config.listener.v3.ApiListener result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.listener.v3.ApiListener buildPartial() {
      io.envoyproxy.envoy.config.listener.v3.ApiListener result = new io.envoyproxy.envoy.config.listener.v3.ApiListener(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.listener.v3.ApiListener result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.apiListener_ = apiListenerBuilder_ == null
            ? apiListener_
            : apiListenerBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.listener.v3.ApiListener) {
        return mergeFrom((io.envoyproxy.envoy.config.listener.v3.ApiListener)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.listener.v3.ApiListener other) {
      if (other == io.envoyproxy.envoy.config.listener.v3.ApiListener.getDefaultInstance()) return this;
      if (other.hasApiListener()) {
        mergeApiListener(other.getApiListener());
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
                  getApiListenerFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Any apiListener_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> apiListenerBuilder_;
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     * @return Whether the apiListener field is set.
     */
    public boolean hasApiListener() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     * @return The apiListener.
     */
    public com.google.protobuf.Any getApiListener() {
      if (apiListenerBuilder_ == null) {
        return apiListener_ == null ? com.google.protobuf.Any.getDefaultInstance() : apiListener_;
      } else {
        return apiListenerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    public Builder setApiListener(com.google.protobuf.Any value) {
      if (apiListenerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiListener_ = value;
      } else {
        apiListenerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    public Builder setApiListener(
        com.google.protobuf.Any.Builder builderForValue) {
      if (apiListenerBuilder_ == null) {
        apiListener_ = builderForValue.build();
      } else {
        apiListenerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    public Builder mergeApiListener(com.google.protobuf.Any value) {
      if (apiListenerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          apiListener_ != null &&
          apiListener_ != com.google.protobuf.Any.getDefaultInstance()) {
          getApiListenerBuilder().mergeFrom(value);
        } else {
          apiListener_ = value;
        }
      } else {
        apiListenerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    public Builder clearApiListener() {
      bitField0_ = (bitField0_ & ~0x00000001);
      apiListener_ = null;
      if (apiListenerBuilder_ != null) {
        apiListenerBuilder_.dispose();
        apiListenerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    public com.google.protobuf.Any.Builder getApiListenerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getApiListenerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    public com.google.protobuf.AnyOrBuilder getApiListenerOrBuilder() {
      if (apiListenerBuilder_ != null) {
        return apiListenerBuilder_.getMessageOrBuilder();
      } else {
        return apiListener_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : apiListener_;
      }
    }
    /**
     * <pre>
     * The type in this field determines the type of API listener. At present, the following
     * types are supported:
     * envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager (HTTP)
     * envoy.extensions.filters.network.http_connection_manager.v3.EnvoyMobileHttpConnectionManager (HTTP)
     * [#next-major-version: In the v3 API, replace this Any field with a oneof containing the
     * specific config message for each type of API listener. We could not do this in v2 because
     * it would have caused circular dependencies for go protos: lds.proto depends on this file,
     * and http_connection_manager.proto depends on rds.proto, which is in the same directory as
     * lds.proto, so lds.proto cannot depend on this file.]
     * </pre>
     *
     * <code>.google.protobuf.Any api_listener = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getApiListenerFieldBuilder() {
      if (apiListenerBuilder_ == null) {
        apiListenerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getApiListener(),
                getParentForChildren(),
                isClean());
        apiListener_ = null;
      }
      return apiListenerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.listener.v3.ApiListener)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.listener.v3.ApiListener)
  private static final io.envoyproxy.envoy.config.listener.v3.ApiListener DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.listener.v3.ApiListener();
  }

  public static io.envoyproxy.envoy.config.listener.v3.ApiListener getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiListener>
      PARSER = new com.google.protobuf.AbstractParser<ApiListener>() {
    @java.lang.Override
    public ApiListener parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApiListener> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiListener> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.listener.v3.ApiListener getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
