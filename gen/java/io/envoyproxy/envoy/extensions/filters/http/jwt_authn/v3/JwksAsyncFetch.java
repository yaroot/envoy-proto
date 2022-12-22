// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

/**
 * <pre>
 * Fetch Jwks asynchronously in the main thread when the filter config is parsed.
 * The listener is activated only after the Jwks is fetched.
 * When the Jwks is expired in the cache, it is fetched again in the main thread.
 * The fetched Jwks from the main thread can be used by all worker threads.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch}
 */
public final class JwksAsyncFetch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch)
    JwksAsyncFetchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JwksAsyncFetch.newBuilder() to construct.
  private JwksAsyncFetch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JwksAsyncFetch() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JwksAsyncFetch();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwksAsyncFetch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwksAsyncFetch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.Builder.class);
  }

  public static final int FAST_LISTENER_FIELD_NUMBER = 1;
  private boolean fastListener_ = false;
  /**
   * <pre>
   * If false, the listener is activated after the initial fetch is completed.
   * The initial fetch result can be either successful or failed.
   * If true, it is activated without waiting for the initial fetch to complete.
   * Default is false.
   * </pre>
   *
   * <code>bool fast_listener = 1;</code>
   * @return The fastListener.
   */
  @java.lang.Override
  public boolean getFastListener() {
    return fastListener_;
  }

  public static final int FAILED_REFETCH_DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration failedRefetchDuration_;
  /**
   * <pre>
   * The duration to refetch after a failed fetch. If not specified, default is 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
   * @return Whether the failedRefetchDuration field is set.
   */
  @java.lang.Override
  public boolean hasFailedRefetchDuration() {
    return failedRefetchDuration_ != null;
  }
  /**
   * <pre>
   * The duration to refetch after a failed fetch. If not specified, default is 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
   * @return The failedRefetchDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getFailedRefetchDuration() {
    return failedRefetchDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : failedRefetchDuration_;
  }
  /**
   * <pre>
   * The duration to refetch after a failed fetch. If not specified, default is 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getFailedRefetchDurationOrBuilder() {
    return failedRefetchDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : failedRefetchDuration_;
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
    if (fastListener_ != false) {
      output.writeBool(1, fastListener_);
    }
    if (failedRefetchDuration_ != null) {
      output.writeMessage(2, getFailedRefetchDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fastListener_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, fastListener_);
    }
    if (failedRefetchDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFailedRefetchDuration());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch other = (io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch) obj;

    if (getFastListener()
        != other.getFastListener()) return false;
    if (hasFailedRefetchDuration() != other.hasFailedRefetchDuration()) return false;
    if (hasFailedRefetchDuration()) {
      if (!getFailedRefetchDuration()
          .equals(other.getFailedRefetchDuration())) return false;
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
    hash = (37 * hash) + FAST_LISTENER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFastListener());
    if (hasFailedRefetchDuration()) {
      hash = (37 * hash) + FAILED_REFETCH_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getFailedRefetchDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch prototype) {
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
   * Fetch Jwks asynchronously in the main thread when the filter config is parsed.
   * The listener is activated only after the Jwks is fetched.
   * When the Jwks is expired in the cache, it is fetched again in the main thread.
   * The fetched Jwks from the main thread can be used by all worker threads.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch)
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwksAsyncFetch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwksAsyncFetch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.newBuilder()
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
      fastListener_ = false;
      failedRefetchDuration_ = null;
      if (failedRefetchDurationBuilder_ != null) {
        failedRefetchDurationBuilder_.dispose();
        failedRefetchDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwksAsyncFetch_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch build() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch result = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fastListener_ = fastListener_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failedRefetchDuration_ = failedRefetchDurationBuilder_ == null
            ? failedRefetchDuration_
            : failedRefetchDurationBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch.getDefaultInstance()) return this;
      if (other.getFastListener() != false) {
        setFastListener(other.getFastListener());
      }
      if (other.hasFailedRefetchDuration()) {
        mergeFailedRefetchDuration(other.getFailedRefetchDuration());
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
              fastListener_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getFailedRefetchDurationFieldBuilder().getBuilder(),
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

    private boolean fastListener_ ;
    /**
     * <pre>
     * If false, the listener is activated after the initial fetch is completed.
     * The initial fetch result can be either successful or failed.
     * If true, it is activated without waiting for the initial fetch to complete.
     * Default is false.
     * </pre>
     *
     * <code>bool fast_listener = 1;</code>
     * @return The fastListener.
     */
    @java.lang.Override
    public boolean getFastListener() {
      return fastListener_;
    }
    /**
     * <pre>
     * If false, the listener is activated after the initial fetch is completed.
     * The initial fetch result can be either successful or failed.
     * If true, it is activated without waiting for the initial fetch to complete.
     * Default is false.
     * </pre>
     *
     * <code>bool fast_listener = 1;</code>
     * @param value The fastListener to set.
     * @return This builder for chaining.
     */
    public Builder setFastListener(boolean value) {
      
      fastListener_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If false, the listener is activated after the initial fetch is completed.
     * The initial fetch result can be either successful or failed.
     * If true, it is activated without waiting for the initial fetch to complete.
     * Default is false.
     * </pre>
     *
     * <code>bool fast_listener = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFastListener() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fastListener_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration failedRefetchDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> failedRefetchDurationBuilder_;
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     * @return Whether the failedRefetchDuration field is set.
     */
    public boolean hasFailedRefetchDuration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     * @return The failedRefetchDuration.
     */
    public com.google.protobuf.Duration getFailedRefetchDuration() {
      if (failedRefetchDurationBuilder_ == null) {
        return failedRefetchDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : failedRefetchDuration_;
      } else {
        return failedRefetchDurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    public Builder setFailedRefetchDuration(com.google.protobuf.Duration value) {
      if (failedRefetchDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        failedRefetchDuration_ = value;
      } else {
        failedRefetchDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    public Builder setFailedRefetchDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (failedRefetchDurationBuilder_ == null) {
        failedRefetchDuration_ = builderForValue.build();
      } else {
        failedRefetchDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    public Builder mergeFailedRefetchDuration(com.google.protobuf.Duration value) {
      if (failedRefetchDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          failedRefetchDuration_ != null &&
          failedRefetchDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getFailedRefetchDurationBuilder().mergeFrom(value);
        } else {
          failedRefetchDuration_ = value;
        }
      } else {
        failedRefetchDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    public Builder clearFailedRefetchDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failedRefetchDuration_ = null;
      if (failedRefetchDurationBuilder_ != null) {
        failedRefetchDurationBuilder_.dispose();
        failedRefetchDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getFailedRefetchDurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFailedRefetchDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getFailedRefetchDurationOrBuilder() {
      if (failedRefetchDurationBuilder_ != null) {
        return failedRefetchDurationBuilder_.getMessageOrBuilder();
      } else {
        return failedRefetchDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : failedRefetchDuration_;
      }
    }
    /**
     * <pre>
     * The duration to refetch after a failed fetch. If not specified, default is 1 second.
     * </pre>
     *
     * <code>.google.protobuf.Duration failed_refetch_duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getFailedRefetchDurationFieldBuilder() {
      if (failedRefetchDurationBuilder_ == null) {
        failedRefetchDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getFailedRefetchDuration(),
                getParentForChildren(),
                isClean());
        failedRefetchDuration_ = null;
      }
      return failedRefetchDurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch)
  private static final io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JwksAsyncFetch>
      PARSER = new com.google.protobuf.AbstractParser<JwksAsyncFetch>() {
    @java.lang.Override
    public JwksAsyncFetch parsePartialFrom(
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

  public static com.google.protobuf.Parser<JwksAsyncFetch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JwksAsyncFetch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwksAsyncFetch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

