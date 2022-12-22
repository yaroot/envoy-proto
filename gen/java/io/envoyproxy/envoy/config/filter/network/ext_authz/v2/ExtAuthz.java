// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/ext_authz/v2/ext_authz.proto

package io.envoyproxy.envoy.config.filter.network.ext_authz.v2;

/**
 * <pre>
 * External Authorization filter calls out to an external service over the
 * gRPC Authorization API defined by
 * :ref:`CheckRequest &lt;envoy_api_msg_service.auth.v2.CheckRequest&gt;`.
 * A failed check will cause this filter to close the TCP connection.
 * </pre>
 *
 * Protobuf type {@code envoy.config.filter.network.ext_authz.v2.ExtAuthz}
 */
public final class ExtAuthz extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.network.ext_authz.v2.ExtAuthz)
    ExtAuthzOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtAuthz.newBuilder() to construct.
  private ExtAuthz(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtAuthz() {
    statPrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtAuthz();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthzProto.internal_static_envoy_config_filter_network_ext_authz_v2_ExtAuthz_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthzProto.internal_static_envoy_config_filter_network_ext_authz_v2_ExtAuthz_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.class, io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.Builder.class);
  }

  public static final int STAT_PREFIX_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object statPrefix_ = "";
  /**
   * <pre>
   * The prefix to use when emitting statistics.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  @java.lang.Override
  public java.lang.String getStatPrefix() {
    java.lang.Object ref = statPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      statPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The prefix to use when emitting statistics.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatPrefixBytes() {
    java.lang.Object ref = statPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      statPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRPC_SERVICE_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.api.v2.core.GrpcService grpcService_;
  /**
   * <pre>
   * The external authorization gRPC service configuration.
   * The default timeout is set to 200ms by this filter.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
   * @return Whether the grpcService field is set.
   */
  @java.lang.Override
  public boolean hasGrpcService() {
    return grpcService_ != null;
  }
  /**
   * <pre>
   * The external authorization gRPC service configuration.
   * The default timeout is set to 200ms by this filter.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
   * @return The grpcService.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.GrpcService getGrpcService() {
    return grpcService_ == null ? io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
  }
  /**
   * <pre>
   * The external authorization gRPC service configuration.
   * The default timeout is set to 200ms by this filter.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
    return grpcService_ == null ? io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
  }

  public static final int FAILURE_MODE_ALLOW_FIELD_NUMBER = 3;
  private boolean failureModeAllow_ = false;
  /**
   * <pre>
   * The filter's behaviour in case the external authorization service does
   * not respond back. When it is set to true, Envoy will also allow traffic in case of
   * communication failure between authorization service and the proxy.
   * Defaults to false.
   * </pre>
   *
   * <code>bool failure_mode_allow = 3;</code>
   * @return The failureModeAllow.
   */
  @java.lang.Override
  public boolean getFailureModeAllow() {
    return failureModeAllow_;
  }

  public static final int INCLUDE_PEER_CERTIFICATE_FIELD_NUMBER = 4;
  private boolean includePeerCertificate_ = false;
  /**
   * <pre>
   * Specifies if the peer certificate is sent to the external service.
   * When this field is true, Envoy will include the peer X.509 certificate, if available, in the
   * :ref:`certificate&lt;envoy_api_field_service.auth.v2.AttributeContext.Peer.certificate&gt;`.
   * </pre>
   *
   * <code>bool include_peer_certificate = 4;</code>
   * @return The includePeerCertificate.
   */
  @java.lang.Override
  public boolean getIncludePeerCertificate() {
    return includePeerCertificate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(statPrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, statPrefix_);
    }
    if (grpcService_ != null) {
      output.writeMessage(2, getGrpcService());
    }
    if (failureModeAllow_ != false) {
      output.writeBool(3, failureModeAllow_);
    }
    if (includePeerCertificate_ != false) {
      output.writeBool(4, includePeerCertificate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(statPrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, statPrefix_);
    }
    if (grpcService_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGrpcService());
    }
    if (failureModeAllow_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, failureModeAllow_);
    }
    if (includePeerCertificate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, includePeerCertificate_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz other = (io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz) obj;

    if (!getStatPrefix()
        .equals(other.getStatPrefix())) return false;
    if (hasGrpcService() != other.hasGrpcService()) return false;
    if (hasGrpcService()) {
      if (!getGrpcService()
          .equals(other.getGrpcService())) return false;
    }
    if (getFailureModeAllow()
        != other.getFailureModeAllow()) return false;
    if (getIncludePeerCertificate()
        != other.getIncludePeerCertificate()) return false;
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
    hash = (37 * hash) + STAT_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getStatPrefix().hashCode();
    if (hasGrpcService()) {
      hash = (37 * hash) + GRPC_SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getGrpcService().hashCode();
    }
    hash = (37 * hash) + FAILURE_MODE_ALLOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailureModeAllow());
    hash = (37 * hash) + INCLUDE_PEER_CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludePeerCertificate());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz prototype) {
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
   * External Authorization filter calls out to an external service over the
   * gRPC Authorization API defined by
   * :ref:`CheckRequest &lt;envoy_api_msg_service.auth.v2.CheckRequest&gt;`.
   * A failed check will cause this filter to close the TCP connection.
   * </pre>
   *
   * Protobuf type {@code envoy.config.filter.network.ext_authz.v2.ExtAuthz}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.network.ext_authz.v2.ExtAuthz)
      io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthzOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthzProto.internal_static_envoy_config_filter_network_ext_authz_v2_ExtAuthz_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthzProto.internal_static_envoy_config_filter_network_ext_authz_v2_ExtAuthz_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.class, io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.newBuilder()
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
      statPrefix_ = "";
      grpcService_ = null;
      if (grpcServiceBuilder_ != null) {
        grpcServiceBuilder_.dispose();
        grpcServiceBuilder_ = null;
      }
      failureModeAllow_ = false;
      includePeerCertificate_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthzProto.internal_static_envoy_config_filter_network_ext_authz_v2_ExtAuthz_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz build() {
      io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz buildPartial() {
      io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz result = new io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.statPrefix_ = statPrefix_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grpcService_ = grpcServiceBuilder_ == null
            ? grpcService_
            : grpcServiceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failureModeAllow_ = failureModeAllow_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.includePeerCertificate_ = includePeerCertificate_;
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
      if (other instanceof io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz other) {
      if (other == io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz.getDefaultInstance()) return this;
      if (!other.getStatPrefix().isEmpty()) {
        statPrefix_ = other.statPrefix_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGrpcService()) {
        mergeGrpcService(other.getGrpcService());
      }
      if (other.getFailureModeAllow() != false) {
        setFailureModeAllow(other.getFailureModeAllow());
      }
      if (other.getIncludePeerCertificate() != false) {
        setIncludePeerCertificate(other.getIncludePeerCertificate());
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
              statPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGrpcServiceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              failureModeAllow_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              includePeerCertificate_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object statPrefix_ = "";
    /**
     * <pre>
     * The prefix to use when emitting statistics.
     * </pre>
     *
     * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return The statPrefix.
     */
    public java.lang.String getStatPrefix() {
      java.lang.Object ref = statPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        statPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The prefix to use when emitting statistics.
     * </pre>
     *
     * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for statPrefix.
     */
    public com.google.protobuf.ByteString
        getStatPrefixBytes() {
      java.lang.Object ref = statPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        statPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The prefix to use when emitting statistics.
     * </pre>
     *
     * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
     * @param value The statPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setStatPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      statPrefix_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The prefix to use when emitting statistics.
     * </pre>
     *
     * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearStatPrefix() {
      statPrefix_ = getDefaultInstance().getStatPrefix();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The prefix to use when emitting statistics.
     * </pre>
     *
     * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for statPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setStatPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      statPrefix_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private io.envoyproxy.envoy.api.v2.core.GrpcService grpcService_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.GrpcService, io.envoyproxy.envoy.api.v2.core.GrpcService.Builder, io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder> grpcServiceBuilder_;
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     * @return Whether the grpcService field is set.
     */
    public boolean hasGrpcService() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     * @return The grpcService.
     */
    public io.envoyproxy.envoy.api.v2.core.GrpcService getGrpcService() {
      if (grpcServiceBuilder_ == null) {
        return grpcService_ == null ? io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
      } else {
        return grpcServiceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    public Builder setGrpcService(io.envoyproxy.envoy.api.v2.core.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        grpcService_ = value;
      } else {
        grpcServiceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    public Builder setGrpcService(
        io.envoyproxy.envoy.api.v2.core.GrpcService.Builder builderForValue) {
      if (grpcServiceBuilder_ == null) {
        grpcService_ = builderForValue.build();
      } else {
        grpcServiceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    public Builder mergeGrpcService(io.envoyproxy.envoy.api.v2.core.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          grpcService_ != null &&
          grpcService_ != io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance()) {
          getGrpcServiceBuilder().mergeFrom(value);
        } else {
          grpcService_ = value;
        }
      } else {
        grpcServiceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    public Builder clearGrpcService() {
      bitField0_ = (bitField0_ & ~0x00000002);
      grpcService_ = null;
      if (grpcServiceBuilder_ != null) {
        grpcServiceBuilder_.dispose();
        grpcServiceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.GrpcService.Builder getGrpcServiceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGrpcServiceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
      if (grpcServiceBuilder_ != null) {
        return grpcServiceBuilder_.getMessageOrBuilder();
      } else {
        return grpcService_ == null ?
            io.envoyproxy.envoy.api.v2.core.GrpcService.getDefaultInstance() : grpcService_;
      }
    }
    /**
     * <pre>
     * The external authorization gRPC service configuration.
     * The default timeout is set to 200ms by this filter.
     * </pre>
     *
     * <code>.envoy.api.v2.core.GrpcService grpc_service = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.GrpcService, io.envoyproxy.envoy.api.v2.core.GrpcService.Builder, io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder> 
        getGrpcServiceFieldBuilder() {
      if (grpcServiceBuilder_ == null) {
        grpcServiceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.GrpcService, io.envoyproxy.envoy.api.v2.core.GrpcService.Builder, io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder>(
                getGrpcService(),
                getParentForChildren(),
                isClean());
        grpcService_ = null;
      }
      return grpcServiceBuilder_;
    }

    private boolean failureModeAllow_ ;
    /**
     * <pre>
     * The filter's behaviour in case the external authorization service does
     * not respond back. When it is set to true, Envoy will also allow traffic in case of
     * communication failure between authorization service and the proxy.
     * Defaults to false.
     * </pre>
     *
     * <code>bool failure_mode_allow = 3;</code>
     * @return The failureModeAllow.
     */
    @java.lang.Override
    public boolean getFailureModeAllow() {
      return failureModeAllow_;
    }
    /**
     * <pre>
     * The filter's behaviour in case the external authorization service does
     * not respond back. When it is set to true, Envoy will also allow traffic in case of
     * communication failure between authorization service and the proxy.
     * Defaults to false.
     * </pre>
     *
     * <code>bool failure_mode_allow = 3;</code>
     * @param value The failureModeAllow to set.
     * @return This builder for chaining.
     */
    public Builder setFailureModeAllow(boolean value) {
      
      failureModeAllow_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The filter's behaviour in case the external authorization service does
     * not respond back. When it is set to true, Envoy will also allow traffic in case of
     * communication failure between authorization service and the proxy.
     * Defaults to false.
     * </pre>
     *
     * <code>bool failure_mode_allow = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureModeAllow() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failureModeAllow_ = false;
      onChanged();
      return this;
    }

    private boolean includePeerCertificate_ ;
    /**
     * <pre>
     * Specifies if the peer certificate is sent to the external service.
     * When this field is true, Envoy will include the peer X.509 certificate, if available, in the
     * :ref:`certificate&lt;envoy_api_field_service.auth.v2.AttributeContext.Peer.certificate&gt;`.
     * </pre>
     *
     * <code>bool include_peer_certificate = 4;</code>
     * @return The includePeerCertificate.
     */
    @java.lang.Override
    public boolean getIncludePeerCertificate() {
      return includePeerCertificate_;
    }
    /**
     * <pre>
     * Specifies if the peer certificate is sent to the external service.
     * When this field is true, Envoy will include the peer X.509 certificate, if available, in the
     * :ref:`certificate&lt;envoy_api_field_service.auth.v2.AttributeContext.Peer.certificate&gt;`.
     * </pre>
     *
     * <code>bool include_peer_certificate = 4;</code>
     * @param value The includePeerCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setIncludePeerCertificate(boolean value) {
      
      includePeerCertificate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies if the peer certificate is sent to the external service.
     * When this field is true, Envoy will include the peer X.509 certificate, if available, in the
     * :ref:`certificate&lt;envoy_api_field_service.auth.v2.AttributeContext.Peer.certificate&gt;`.
     * </pre>
     *
     * <code>bool include_peer_certificate = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludePeerCertificate() {
      bitField0_ = (bitField0_ & ~0x00000008);
      includePeerCertificate_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.network.ext_authz.v2.ExtAuthz)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.network.ext_authz.v2.ExtAuthz)
  private static final io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz();
  }

  public static io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtAuthz>
      PARSER = new com.google.protobuf.AbstractParser<ExtAuthz>() {
    @java.lang.Override
    public ExtAuthz parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExtAuthz> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtAuthz> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.network.ext_authz.v2.ExtAuthz getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

