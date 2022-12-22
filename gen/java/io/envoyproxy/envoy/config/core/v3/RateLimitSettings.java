// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/config_source.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * Rate Limit settings to be applied for discovery requests made by Envoy.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.RateLimitSettings}
 */
public final class RateLimitSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.RateLimitSettings)
    RateLimitSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLimitSettings.newBuilder() to construct.
  private RateLimitSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLimitSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RateLimitSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_RateLimitSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_RateLimitSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.RateLimitSettings.class, io.envoyproxy.envoy.config.core.v3.RateLimitSettings.Builder.class);
  }

  public static final int MAX_TOKENS_FIELD_NUMBER = 1;
  private com.google.protobuf.UInt32Value maxTokens_;
  /**
   * <pre>
   * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
   * default value of 100 will be used.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
   * @return Whether the maxTokens field is set.
   */
  @java.lang.Override
  public boolean hasMaxTokens() {
    return maxTokens_ != null;
  }
  /**
   * <pre>
   * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
   * default value of 100 will be used.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
   * @return The maxTokens.
   */
  @java.lang.Override
  public com.google.protobuf.UInt32Value getMaxTokens() {
    return maxTokens_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
  }
  /**
   * <pre>
   * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
   * default value of 100 will be used.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.UInt32ValueOrBuilder getMaxTokensOrBuilder() {
    return maxTokens_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
  }

  public static final int FILL_RATE_FIELD_NUMBER = 2;
  private com.google.protobuf.DoubleValue fillRate_;
  /**
   * <pre>
   * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
   * per second will be used.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the fillRate field is set.
   */
  @java.lang.Override
  public boolean hasFillRate() {
    return fillRate_ != null;
  }
  /**
   * <pre>
   * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
   * per second will be used.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
   * @return The fillRate.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getFillRate() {
    return fillRate_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
  }
  /**
   * <pre>
   * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
   * per second will be used.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getFillRateOrBuilder() {
    return fillRate_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
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
    if (maxTokens_ != null) {
      output.writeMessage(1, getMaxTokens());
    }
    if (fillRate_ != null) {
      output.writeMessage(2, getFillRate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxTokens_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMaxTokens());
    }
    if (fillRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFillRate());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.RateLimitSettings)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.RateLimitSettings other = (io.envoyproxy.envoy.config.core.v3.RateLimitSettings) obj;

    if (hasMaxTokens() != other.hasMaxTokens()) return false;
    if (hasMaxTokens()) {
      if (!getMaxTokens()
          .equals(other.getMaxTokens())) return false;
    }
    if (hasFillRate() != other.hasFillRate()) return false;
    if (hasFillRate()) {
      if (!getFillRate()
          .equals(other.getFillRate())) return false;
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
    if (hasMaxTokens()) {
      hash = (37 * hash) + MAX_TOKENS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxTokens().hashCode();
    }
    if (hasFillRate()) {
      hash = (37 * hash) + FILL_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getFillRate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.RateLimitSettings prototype) {
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
   * Rate Limit settings to be applied for discovery requests made by Envoy.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.RateLimitSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.RateLimitSettings)
      io.envoyproxy.envoy.config.core.v3.RateLimitSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_RateLimitSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_RateLimitSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.RateLimitSettings.class, io.envoyproxy.envoy.config.core.v3.RateLimitSettings.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.RateLimitSettings.newBuilder()
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
      maxTokens_ = null;
      if (maxTokensBuilder_ != null) {
        maxTokensBuilder_.dispose();
        maxTokensBuilder_ = null;
      }
      fillRate_ = null;
      if (fillRateBuilder_ != null) {
        fillRateBuilder_.dispose();
        fillRateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_RateLimitSettings_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RateLimitSettings getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.RateLimitSettings.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RateLimitSettings build() {
      io.envoyproxy.envoy.config.core.v3.RateLimitSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RateLimitSettings buildPartial() {
      io.envoyproxy.envoy.config.core.v3.RateLimitSettings result = new io.envoyproxy.envoy.config.core.v3.RateLimitSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.core.v3.RateLimitSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxTokens_ = maxTokensBuilder_ == null
            ? maxTokens_
            : maxTokensBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fillRate_ = fillRateBuilder_ == null
            ? fillRate_
            : fillRateBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.RateLimitSettings) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.RateLimitSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.RateLimitSettings other) {
      if (other == io.envoyproxy.envoy.config.core.v3.RateLimitSettings.getDefaultInstance()) return this;
      if (other.hasMaxTokens()) {
        mergeMaxTokens(other.getMaxTokens());
      }
      if (other.hasFillRate()) {
        mergeFillRate(other.getFillRate());
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
                  getMaxTokensFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFillRateFieldBuilder().getBuilder(),
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

    private com.google.protobuf.UInt32Value maxTokens_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> maxTokensBuilder_;
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     * @return Whether the maxTokens field is set.
     */
    public boolean hasMaxTokens() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     * @return The maxTokens.
     */
    public com.google.protobuf.UInt32Value getMaxTokens() {
      if (maxTokensBuilder_ == null) {
        return maxTokens_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
      } else {
        return maxTokensBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder setMaxTokens(com.google.protobuf.UInt32Value value) {
      if (maxTokensBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxTokens_ = value;
      } else {
        maxTokensBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder setMaxTokens(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (maxTokensBuilder_ == null) {
        maxTokens_ = builderForValue.build();
      } else {
        maxTokensBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder mergeMaxTokens(com.google.protobuf.UInt32Value value) {
      if (maxTokensBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          maxTokens_ != null &&
          maxTokens_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
          getMaxTokensBuilder().mergeFrom(value);
        } else {
          maxTokens_ = value;
        }
      } else {
        maxTokensBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder clearMaxTokens() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxTokens_ = null;
      if (maxTokensBuilder_ != null) {
        maxTokensBuilder_.dispose();
        maxTokensBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getMaxTokensBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMaxTokensFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getMaxTokensOrBuilder() {
      if (maxTokensBuilder_ != null) {
        return maxTokensBuilder_.getMessageOrBuilder();
      } else {
        return maxTokens_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
      }
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limiting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getMaxTokensFieldBuilder() {
      if (maxTokensBuilder_ == null) {
        maxTokensBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getMaxTokens(),
                getParentForChildren(),
                isClean());
        maxTokens_ = null;
      }
      return maxTokensBuilder_;
    }

    private com.google.protobuf.DoubleValue fillRate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> fillRateBuilder_;
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the fillRate field is set.
     */
    public boolean hasFillRate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     * @return The fillRate.
     */
    public com.google.protobuf.DoubleValue getFillRate() {
      if (fillRateBuilder_ == null) {
        return fillRate_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
      } else {
        return fillRateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setFillRate(com.google.protobuf.DoubleValue value) {
      if (fillRateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fillRate_ = value;
      } else {
        fillRateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setFillRate(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (fillRateBuilder_ == null) {
        fillRate_ = builderForValue.build();
      } else {
        fillRateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeFillRate(com.google.protobuf.DoubleValue value) {
      if (fillRateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fillRate_ != null &&
          fillRate_ != com.google.protobuf.DoubleValue.getDefaultInstance()) {
          getFillRateBuilder().mergeFrom(value);
        } else {
          fillRate_ = value;
        }
      } else {
        fillRateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearFillRate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fillRate_ = null;
      if (fillRateBuilder_ != null) {
        fillRateBuilder_.dispose();
        fillRateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.DoubleValue.Builder getFillRateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFillRateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getFillRateOrBuilder() {
      if (fillRateBuilder_ != null) {
        return fillRateBuilder_.getMessageOrBuilder();
      } else {
        return fillRate_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
      }
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getFillRateFieldBuilder() {
      if (fillRateBuilder_ == null) {
        fillRateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getFillRate(),
                getParentForChildren(),
                isClean());
        fillRate_ = null;
      }
      return fillRateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.RateLimitSettings)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.RateLimitSettings)
  private static final io.envoyproxy.envoy.config.core.v3.RateLimitSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.RateLimitSettings();
  }

  public static io.envoyproxy.envoy.config.core.v3.RateLimitSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimitSettings>
      PARSER = new com.google.protobuf.AbstractParser<RateLimitSettings>() {
    @java.lang.Override
    public RateLimitSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<RateLimitSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimitSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.RateLimitSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
