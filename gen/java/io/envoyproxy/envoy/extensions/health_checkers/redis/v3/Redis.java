// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/health_checkers/redis/v3/redis.proto

package io.envoyproxy.envoy.extensions.health_checkers.redis.v3;

/**
 * Protobuf type {@code envoy.extensions.health_checkers.redis.v3.Redis}
 */
public final class Redis extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.health_checkers.redis.v3.Redis)
    RedisOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Redis.newBuilder() to construct.
  private Redis(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Redis() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Redis();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.health_checkers.redis.v3.RedisProto.internal_static_envoy_extensions_health_checkers_redis_v3_Redis_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.health_checkers.redis.v3.RedisProto.internal_static_envoy_extensions_health_checkers_redis_v3_Redis_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.class, io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   * <pre>
   * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
   * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
   * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
   * by setting the specified key to any value and waiting for traffic to drain.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
   * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
   * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
   * by setting the specified key to any value and waiting for traffic to drain.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis other = (io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis prototype) {
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
   * Protobuf type {@code envoy.extensions.health_checkers.redis.v3.Redis}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.health_checkers.redis.v3.Redis)
      io.envoyproxy.envoy.extensions.health_checkers.redis.v3.RedisOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.health_checkers.redis.v3.RedisProto.internal_static_envoy_extensions_health_checkers_redis_v3_Redis_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.health_checkers.redis.v3.RedisProto.internal_static_envoy_extensions_health_checkers_redis_v3_Redis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.class, io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.newBuilder()
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
      key_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.health_checkers.redis.v3.RedisProto.internal_static_envoy_extensions_health_checkers_redis_v3_Redis_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis build() {
      io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis buildPartial() {
      io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis result = new io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis) {
        return mergeFrom((io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis other) {
      if (other == io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              key_ = input.readStringRequireUtf8();
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

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
     * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
     * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
     * by setting the specified key to any value and waiting for traffic to drain.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
     * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
     * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
     * by setting the specified key to any value and waiting for traffic to drain.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
     * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
     * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
     * by setting the specified key to any value and waiting for traffic to drain.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
     * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
     * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
     * by setting the specified key to any value and waiting for traffic to drain.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, optionally perform ``EXISTS &lt;key&gt;`` instead of ``PING``. A return value
     * from Redis of 0 (does not exist) is considered a passing healthcheck. A return value other
     * than 0 is considered a failure. This allows the user to mark a Redis instance for maintenance
     * by setting the specified key to any value and waiting for traffic to drain.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.health_checkers.redis.v3.Redis)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.health_checkers.redis.v3.Redis)
  private static final io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis();
  }

  public static io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Redis>
      PARSER = new com.google.protobuf.AbstractParser<Redis>() {
    @java.lang.Override
    public Redis parsePartialFrom(
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

  public static com.google.protobuf.Parser<Redis> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Redis> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.health_checkers.redis.v3.Redis getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
