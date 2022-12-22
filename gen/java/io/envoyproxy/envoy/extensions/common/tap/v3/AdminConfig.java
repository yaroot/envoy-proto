// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/common/tap/v3/common.proto

package io.envoyproxy.envoy.extensions.common.tap.v3;

/**
 * <pre>
 * Configuration for the admin handler. See :ref:`here &lt;config_http_filters_tap_admin_handler&gt;` for
 * more information.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.common.tap.v3.AdminConfig}
 */
public final class AdminConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.common.tap.v3.AdminConfig)
    AdminConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdminConfig.newBuilder() to construct.
  private AdminConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdminConfig() {
    configId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdminConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.common.tap.v3.CommonProto.internal_static_envoy_extensions_common_tap_v3_AdminConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.common.tap.v3.CommonProto.internal_static_envoy_extensions_common_tap_v3_AdminConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.class, io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.Builder.class);
  }

  public static final int CONFIG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object configId_ = "";
  /**
   * <pre>
   * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
   * matched to the configured filter opaque ID to determine which filter to configure.
   * </pre>
   *
   * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
   * @return The configId.
   */
  @java.lang.Override
  public java.lang.String getConfigId() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      configId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
   * matched to the configured filter opaque ID to determine which filter to configure.
   * </pre>
   *
   * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for configId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfigIdBytes() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      configId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, configId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, configId_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig other = (io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig) obj;

    if (!getConfigId()
        .equals(other.getConfigId())) return false;
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
    hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConfigId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig prototype) {
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
   * Configuration for the admin handler. See :ref:`here &lt;config_http_filters_tap_admin_handler&gt;` for
   * more information.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.common.tap.v3.AdminConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.common.tap.v3.AdminConfig)
      io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.common.tap.v3.CommonProto.internal_static_envoy_extensions_common_tap_v3_AdminConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.common.tap.v3.CommonProto.internal_static_envoy_extensions_common_tap_v3_AdminConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.class, io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.newBuilder()
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
      configId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.common.tap.v3.CommonProto.internal_static_envoy_extensions_common_tap_v3_AdminConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig build() {
      io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig buildPartial() {
      io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig result = new io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.configId_ = configId_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig) {
        return mergeFrom((io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig other) {
      if (other == io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig.getDefaultInstance()) return this;
      if (!other.getConfigId().isEmpty()) {
        configId_ = other.configId_;
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
              configId_ = input.readStringRequireUtf8();
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

    private java.lang.Object configId_ = "";
    /**
     * <pre>
     * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
     * matched to the configured filter opaque ID to determine which filter to configure.
     * </pre>
     *
     * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
     * @return The configId.
     */
    public java.lang.String getConfigId() {
      java.lang.Object ref = configId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        configId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
     * matched to the configured filter opaque ID to determine which filter to configure.
     * </pre>
     *
     * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for configId.
     */
    public com.google.protobuf.ByteString
        getConfigIdBytes() {
      java.lang.Object ref = configId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        configId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
     * matched to the configured filter opaque ID to determine which filter to configure.
     * </pre>
     *
     * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
     * @param value The configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      configId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
     * matched to the configured filter opaque ID to determine which filter to configure.
     * </pre>
     *
     * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigId() {
      configId_ = getDefaultInstance().getConfigId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
     * matched to the configured filter opaque ID to determine which filter to configure.
     * </pre>
     *
     * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      configId_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.common.tap.v3.AdminConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.common.tap.v3.AdminConfig)
  private static final io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig();
  }

  public static io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdminConfig>
      PARSER = new com.google.protobuf.AbstractParser<AdminConfig>() {
    @java.lang.Override
    public AdminConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdminConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdminConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.common.tap.v3.AdminConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

