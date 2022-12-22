// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/route.proto

package io.envoyproxy.envoy.api.v2;

/**
 * Protobuf type {@code envoy.api.v2.Vhds}
 */
public final class Vhds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.Vhds)
    VhdsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vhds.newBuilder() to construct.
  private Vhds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vhds() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Vhds();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.RouteProto.internal_static_envoy_api_v2_Vhds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.api.v2.RouteProto.internal_static_envoy_api_v2_Vhds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.api.v2.Vhds.class, io.envoyproxy.envoy.api.v2.Vhds.Builder.class);
  }

  public static final int CONFIG_SOURCE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.api.v2.core.ConfigSource configSource_;
  /**
   * <pre>
   * Configuration source specifier for VHDS.
   * </pre>
   *
   * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the configSource field is set.
   */
  @java.lang.Override
  public boolean hasConfigSource() {
    return configSource_ != null;
  }
  /**
   * <pre>
   * Configuration source specifier for VHDS.
   * </pre>
   *
   * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
   * @return The configSource.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.ConfigSource getConfigSource() {
    return configSource_ == null ? io.envoyproxy.envoy.api.v2.core.ConfigSource.getDefaultInstance() : configSource_;
  }
  /**
   * <pre>
   * Configuration source specifier for VHDS.
   * </pre>
   *
   * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.ConfigSourceOrBuilder getConfigSourceOrBuilder() {
    return configSource_ == null ? io.envoyproxy.envoy.api.v2.core.ConfigSource.getDefaultInstance() : configSource_;
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
    if (configSource_ != null) {
      output.writeMessage(1, getConfigSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfigSource());
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
    if (!(obj instanceof io.envoyproxy.envoy.api.v2.Vhds)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.api.v2.Vhds other = (io.envoyproxy.envoy.api.v2.Vhds) obj;

    if (hasConfigSource() != other.hasConfigSource()) return false;
    if (hasConfigSource()) {
      if (!getConfigSource()
          .equals(other.getConfigSource())) return false;
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
    if (hasConfigSource()) {
      hash = (37 * hash) + CONFIG_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getConfigSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.Vhds parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.api.v2.Vhds prototype) {
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
   * Protobuf type {@code envoy.api.v2.Vhds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.Vhds)
      io.envoyproxy.envoy.api.v2.VhdsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.RouteProto.internal_static_envoy_api_v2_Vhds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.api.v2.RouteProto.internal_static_envoy_api_v2_Vhds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.api.v2.Vhds.class, io.envoyproxy.envoy.api.v2.Vhds.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.api.v2.Vhds.newBuilder()
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
      configSource_ = null;
      if (configSourceBuilder_ != null) {
        configSourceBuilder_.dispose();
        configSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.api.v2.RouteProto.internal_static_envoy_api_v2_Vhds_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.Vhds getDefaultInstanceForType() {
      return io.envoyproxy.envoy.api.v2.Vhds.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.Vhds build() {
      io.envoyproxy.envoy.api.v2.Vhds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.Vhds buildPartial() {
      io.envoyproxy.envoy.api.v2.Vhds result = new io.envoyproxy.envoy.api.v2.Vhds(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.api.v2.Vhds result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.configSource_ = configSourceBuilder_ == null
            ? configSource_
            : configSourceBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.api.v2.Vhds) {
        return mergeFrom((io.envoyproxy.envoy.api.v2.Vhds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.api.v2.Vhds other) {
      if (other == io.envoyproxy.envoy.api.v2.Vhds.getDefaultInstance()) return this;
      if (other.hasConfigSource()) {
        mergeConfigSource(other.getConfigSource());
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
                  getConfigSourceFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.api.v2.core.ConfigSource configSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.ConfigSource, io.envoyproxy.envoy.api.v2.core.ConfigSource.Builder, io.envoyproxy.envoy.api.v2.core.ConfigSourceOrBuilder> configSourceBuilder_;
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the configSource field is set.
     */
    public boolean hasConfigSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     * @return The configSource.
     */
    public io.envoyproxy.envoy.api.v2.core.ConfigSource getConfigSource() {
      if (configSourceBuilder_ == null) {
        return configSource_ == null ? io.envoyproxy.envoy.api.v2.core.ConfigSource.getDefaultInstance() : configSource_;
      } else {
        return configSourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setConfigSource(io.envoyproxy.envoy.api.v2.core.ConfigSource value) {
      if (configSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configSource_ = value;
      } else {
        configSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setConfigSource(
        io.envoyproxy.envoy.api.v2.core.ConfigSource.Builder builderForValue) {
      if (configSourceBuilder_ == null) {
        configSource_ = builderForValue.build();
      } else {
        configSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeConfigSource(io.envoyproxy.envoy.api.v2.core.ConfigSource value) {
      if (configSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          configSource_ != null &&
          configSource_ != io.envoyproxy.envoy.api.v2.core.ConfigSource.getDefaultInstance()) {
          getConfigSourceBuilder().mergeFrom(value);
        } else {
          configSource_ = value;
        }
      } else {
        configSourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearConfigSource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      configSource_ = null;
      if (configSourceBuilder_ != null) {
        configSourceBuilder_.dispose();
        configSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.api.v2.core.ConfigSource.Builder getConfigSourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConfigSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.api.v2.core.ConfigSourceOrBuilder getConfigSourceOrBuilder() {
      if (configSourceBuilder_ != null) {
        return configSourceBuilder_.getMessageOrBuilder();
      } else {
        return configSource_ == null ?
            io.envoyproxy.envoy.api.v2.core.ConfigSource.getDefaultInstance() : configSource_;
      }
    }
    /**
     * <pre>
     * Configuration source specifier for VHDS.
     * </pre>
     *
     * <code>.envoy.api.v2.core.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.ConfigSource, io.envoyproxy.envoy.api.v2.core.ConfigSource.Builder, io.envoyproxy.envoy.api.v2.core.ConfigSourceOrBuilder> 
        getConfigSourceFieldBuilder() {
      if (configSourceBuilder_ == null) {
        configSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.ConfigSource, io.envoyproxy.envoy.api.v2.core.ConfigSource.Builder, io.envoyproxy.envoy.api.v2.core.ConfigSourceOrBuilder>(
                getConfigSource(),
                getParentForChildren(),
                isClean());
        configSource_ = null;
      }
      return configSourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.Vhds)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.Vhds)
  private static final io.envoyproxy.envoy.api.v2.Vhds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.api.v2.Vhds();
  }

  public static io.envoyproxy.envoy.api.v2.Vhds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vhds>
      PARSER = new com.google.protobuf.AbstractParser<Vhds>() {
    @java.lang.Override
    public Vhds parsePartialFrom(
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

  public static com.google.protobuf.Parser<Vhds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vhds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.Vhds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
