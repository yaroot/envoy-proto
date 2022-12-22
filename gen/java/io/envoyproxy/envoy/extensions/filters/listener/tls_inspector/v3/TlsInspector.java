// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/listener/tls_inspector/v3/tls_inspector.proto

package io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3;

/**
 * Protobuf type {@code envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector}
 */
public final class TlsInspector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector)
    TlsInspectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TlsInspector.newBuilder() to construct.
  private TlsInspector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TlsInspector() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TlsInspector();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspectorProto.internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspectorProto.internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.class, io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.Builder.class);
  }

  public static final int ENABLE_JA3_FINGERPRINTING_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue enableJa3Fingerprinting_;
  /**
   * <pre>
   * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
   * @return Whether the enableJa3Fingerprinting field is set.
   */
  @java.lang.Override
  public boolean hasEnableJa3Fingerprinting() {
    return enableJa3Fingerprinting_ != null;
  }
  /**
   * <pre>
   * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
   * @return The enableJa3Fingerprinting.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getEnableJa3Fingerprinting() {
    return enableJa3Fingerprinting_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enableJa3Fingerprinting_;
  }
  /**
   * <pre>
   * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getEnableJa3FingerprintingOrBuilder() {
    return enableJa3Fingerprinting_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enableJa3Fingerprinting_;
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
    if (enableJa3Fingerprinting_ != null) {
      output.writeMessage(1, getEnableJa3Fingerprinting());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableJa3Fingerprinting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnableJa3Fingerprinting());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector other = (io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector) obj;

    if (hasEnableJa3Fingerprinting() != other.hasEnableJa3Fingerprinting()) return false;
    if (hasEnableJa3Fingerprinting()) {
      if (!getEnableJa3Fingerprinting()
          .equals(other.getEnableJa3Fingerprinting())) return false;
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
    if (hasEnableJa3Fingerprinting()) {
      hash = (37 * hash) + ENABLE_JA3_FINGERPRINTING_FIELD_NUMBER;
      hash = (53 * hash) + getEnableJa3Fingerprinting().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector)
      io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspectorProto.internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspectorProto.internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.class, io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.newBuilder()
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
      enableJa3Fingerprinting_ = null;
      if (enableJa3FingerprintingBuilder_ != null) {
        enableJa3FingerprintingBuilder_.dispose();
        enableJa3FingerprintingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspectorProto.internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector build() {
      io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector buildPartial() {
      io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector result = new io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableJa3Fingerprinting_ = enableJa3FingerprintingBuilder_ == null
            ? enableJa3Fingerprinting_
            : enableJa3FingerprintingBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector other) {
      if (other == io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector.getDefaultInstance()) return this;
      if (other.hasEnableJa3Fingerprinting()) {
        mergeEnableJa3Fingerprinting(other.getEnableJa3Fingerprinting());
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
                  getEnableJa3FingerprintingFieldBuilder().getBuilder(),
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

    private com.google.protobuf.BoolValue enableJa3Fingerprinting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> enableJa3FingerprintingBuilder_;
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     * @return Whether the enableJa3Fingerprinting field is set.
     */
    public boolean hasEnableJa3Fingerprinting() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     * @return The enableJa3Fingerprinting.
     */
    public com.google.protobuf.BoolValue getEnableJa3Fingerprinting() {
      if (enableJa3FingerprintingBuilder_ == null) {
        return enableJa3Fingerprinting_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enableJa3Fingerprinting_;
      } else {
        return enableJa3FingerprintingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    public Builder setEnableJa3Fingerprinting(com.google.protobuf.BoolValue value) {
      if (enableJa3FingerprintingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        enableJa3Fingerprinting_ = value;
      } else {
        enableJa3FingerprintingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    public Builder setEnableJa3Fingerprinting(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (enableJa3FingerprintingBuilder_ == null) {
        enableJa3Fingerprinting_ = builderForValue.build();
      } else {
        enableJa3FingerprintingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    public Builder mergeEnableJa3Fingerprinting(com.google.protobuf.BoolValue value) {
      if (enableJa3FingerprintingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          enableJa3Fingerprinting_ != null &&
          enableJa3Fingerprinting_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getEnableJa3FingerprintingBuilder().mergeFrom(value);
        } else {
          enableJa3Fingerprinting_ = value;
        }
      } else {
        enableJa3FingerprintingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    public Builder clearEnableJa3Fingerprinting() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableJa3Fingerprinting_ = null;
      if (enableJa3FingerprintingBuilder_ != null) {
        enableJa3FingerprintingBuilder_.dispose();
        enableJa3FingerprintingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getEnableJa3FingerprintingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnableJa3FingerprintingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getEnableJa3FingerprintingOrBuilder() {
      if (enableJa3FingerprintingBuilder_ != null) {
        return enableJa3FingerprintingBuilder_.getMessageOrBuilder();
      } else {
        return enableJa3Fingerprinting_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : enableJa3Fingerprinting_;
      }
    }
    /**
     * <pre>
     * Populate ``JA3`` fingerprint hash using data from the TLS Client Hello packet. Default is false.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_ja3_fingerprinting = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getEnableJa3FingerprintingFieldBuilder() {
      if (enableJa3FingerprintingBuilder_ == null) {
        enableJa3FingerprintingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getEnableJa3Fingerprinting(),
                getParentForChildren(),
                isClean());
        enableJa3Fingerprinting_ = null;
      }
      return enableJa3FingerprintingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector)
  private static final io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector();
  }

  public static io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TlsInspector>
      PARSER = new com.google.protobuf.AbstractParser<TlsInspector>() {
    @java.lang.Override
    public TlsInspector parsePartialFrom(
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

  public static com.google.protobuf.Parser<TlsInspector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TlsInspector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
