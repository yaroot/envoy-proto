// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/rbac/matchers/upstream_ip_port/v3/upstream_ip_port_matcher.proto

package io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3;

/**
 * <pre>
 * This is configuration for matching upstream ip and port.
 * Note that although both fields are optional, at least one of IP or port must be supplied. If only
 * one is supplied the other is a wildcard match.
 * This matcher requires a filter in the chain to have saved the upstream address in the
 * filter state before the matcher is executed by RBAC filter. The state should be saved with key
 * ``envoy.stream.upstream_address`` (See
 * :repo:`upstream_address.h&lt;source/common/stream_info/upstream_address.h&gt;`).
 * Also, See :repo:`proxy_filter.cc&lt;source/extensions/filters/http/dynamic_forward_proxy/proxy_filter.cc&gt;`
 * for an example of a filter which populates the FilterState.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher}
 */
public final class UpstreamIpPortMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher)
    UpstreamIpPortMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpstreamIpPortMatcher.newBuilder() to construct.
  private UpstreamIpPortMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamIpPortMatcher() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpstreamIpPortMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcherProto.internal_static_envoy_extensions_rbac_matchers_upstream_ip_port_v3_UpstreamIpPortMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcherProto.internal_static_envoy_extensions_rbac_matchers_upstream_ip_port_v3_UpstreamIpPortMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.class, io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.Builder.class);
  }

  public static final int UPSTREAM_IP_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.CidrRange upstreamIp_;
  /**
   * <pre>
   * A CIDR block that will be used to match the upstream IP.
   * Both Ipv4 and Ipv6 ranges can be matched.
   * </pre>
   *
   * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
   * @return Whether the upstreamIp field is set.
   */
  @java.lang.Override
  public boolean hasUpstreamIp() {
    return upstreamIp_ != null;
  }
  /**
   * <pre>
   * A CIDR block that will be used to match the upstream IP.
   * Both Ipv4 and Ipv6 ranges can be matched.
   * </pre>
   *
   * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
   * @return The upstreamIp.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.CidrRange getUpstreamIp() {
    return upstreamIp_ == null ? io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance() : upstreamIp_;
  }
  /**
   * <pre>
   * A CIDR block that will be used to match the upstream IP.
   * Both Ipv4 and Ipv6 ranges can be matched.
   * </pre>
   *
   * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder getUpstreamIpOrBuilder() {
    return upstreamIp_ == null ? io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance() : upstreamIp_;
  }

  public static final int UPSTREAM_PORT_RANGE_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.type.v3.Int64Range upstreamPortRange_;
  /**
   * <pre>
   * A port range that will be used to match the upstream port.
   * </pre>
   *
   * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
   * @return Whether the upstreamPortRange field is set.
   */
  @java.lang.Override
  public boolean hasUpstreamPortRange() {
    return upstreamPortRange_ != null;
  }
  /**
   * <pre>
   * A port range that will be used to match the upstream port.
   * </pre>
   *
   * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
   * @return The upstreamPortRange.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.Int64Range getUpstreamPortRange() {
    return upstreamPortRange_ == null ? io.envoyproxy.envoy.type.v3.Int64Range.getDefaultInstance() : upstreamPortRange_;
  }
  /**
   * <pre>
   * A port range that will be used to match the upstream port.
   * </pre>
   *
   * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.Int64RangeOrBuilder getUpstreamPortRangeOrBuilder() {
    return upstreamPortRange_ == null ? io.envoyproxy.envoy.type.v3.Int64Range.getDefaultInstance() : upstreamPortRange_;
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
    if (upstreamIp_ != null) {
      output.writeMessage(1, getUpstreamIp());
    }
    if (upstreamPortRange_ != null) {
      output.writeMessage(2, getUpstreamPortRange());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (upstreamIp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpstreamIp());
    }
    if (upstreamPortRange_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpstreamPortRange());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher other = (io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher) obj;

    if (hasUpstreamIp() != other.hasUpstreamIp()) return false;
    if (hasUpstreamIp()) {
      if (!getUpstreamIp()
          .equals(other.getUpstreamIp())) return false;
    }
    if (hasUpstreamPortRange() != other.hasUpstreamPortRange()) return false;
    if (hasUpstreamPortRange()) {
      if (!getUpstreamPortRange()
          .equals(other.getUpstreamPortRange())) return false;
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
    if (hasUpstreamIp()) {
      hash = (37 * hash) + UPSTREAM_IP_FIELD_NUMBER;
      hash = (53 * hash) + getUpstreamIp().hashCode();
    }
    if (hasUpstreamPortRange()) {
      hash = (37 * hash) + UPSTREAM_PORT_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getUpstreamPortRange().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher prototype) {
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
   * This is configuration for matching upstream ip and port.
   * Note that although both fields are optional, at least one of IP or port must be supplied. If only
   * one is supplied the other is a wildcard match.
   * This matcher requires a filter in the chain to have saved the upstream address in the
   * filter state before the matcher is executed by RBAC filter. The state should be saved with key
   * ``envoy.stream.upstream_address`` (See
   * :repo:`upstream_address.h&lt;source/common/stream_info/upstream_address.h&gt;`).
   * Also, See :repo:`proxy_filter.cc&lt;source/extensions/filters/http/dynamic_forward_proxy/proxy_filter.cc&gt;`
   * for an example of a filter which populates the FilterState.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher)
      io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcherProto.internal_static_envoy_extensions_rbac_matchers_upstream_ip_port_v3_UpstreamIpPortMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcherProto.internal_static_envoy_extensions_rbac_matchers_upstream_ip_port_v3_UpstreamIpPortMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.class, io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.newBuilder()
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
      upstreamIp_ = null;
      if (upstreamIpBuilder_ != null) {
        upstreamIpBuilder_.dispose();
        upstreamIpBuilder_ = null;
      }
      upstreamPortRange_ = null;
      if (upstreamPortRangeBuilder_ != null) {
        upstreamPortRangeBuilder_.dispose();
        upstreamPortRangeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcherProto.internal_static_envoy_extensions_rbac_matchers_upstream_ip_port_v3_UpstreamIpPortMatcher_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher build() {
      io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher buildPartial() {
      io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher result = new io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.upstreamIp_ = upstreamIpBuilder_ == null
            ? upstreamIp_
            : upstreamIpBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.upstreamPortRange_ = upstreamPortRangeBuilder_ == null
            ? upstreamPortRange_
            : upstreamPortRangeBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher) {
        return mergeFrom((io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher other) {
      if (other == io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher.getDefaultInstance()) return this;
      if (other.hasUpstreamIp()) {
        mergeUpstreamIp(other.getUpstreamIp());
      }
      if (other.hasUpstreamPortRange()) {
        mergeUpstreamPortRange(other.getUpstreamPortRange());
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
                  getUpstreamIpFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpstreamPortRangeFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.config.core.v3.CidrRange upstreamIp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.CidrRange, io.envoyproxy.envoy.config.core.v3.CidrRange.Builder, io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder> upstreamIpBuilder_;
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     * @return Whether the upstreamIp field is set.
     */
    public boolean hasUpstreamIp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     * @return The upstreamIp.
     */
    public io.envoyproxy.envoy.config.core.v3.CidrRange getUpstreamIp() {
      if (upstreamIpBuilder_ == null) {
        return upstreamIp_ == null ? io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance() : upstreamIp_;
      } else {
        return upstreamIpBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    public Builder setUpstreamIp(io.envoyproxy.envoy.config.core.v3.CidrRange value) {
      if (upstreamIpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        upstreamIp_ = value;
      } else {
        upstreamIpBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    public Builder setUpstreamIp(
        io.envoyproxy.envoy.config.core.v3.CidrRange.Builder builderForValue) {
      if (upstreamIpBuilder_ == null) {
        upstreamIp_ = builderForValue.build();
      } else {
        upstreamIpBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    public Builder mergeUpstreamIp(io.envoyproxy.envoy.config.core.v3.CidrRange value) {
      if (upstreamIpBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          upstreamIp_ != null &&
          upstreamIp_ != io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance()) {
          getUpstreamIpBuilder().mergeFrom(value);
        } else {
          upstreamIp_ = value;
        }
      } else {
        upstreamIpBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    public Builder clearUpstreamIp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      upstreamIp_ = null;
      if (upstreamIpBuilder_ != null) {
        upstreamIpBuilder_.dispose();
        upstreamIpBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.CidrRange.Builder getUpstreamIpBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpstreamIpFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder getUpstreamIpOrBuilder() {
      if (upstreamIpBuilder_ != null) {
        return upstreamIpBuilder_.getMessageOrBuilder();
      } else {
        return upstreamIp_ == null ?
            io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance() : upstreamIp_;
      }
    }
    /**
     * <pre>
     * A CIDR block that will be used to match the upstream IP.
     * Both Ipv4 and Ipv6 ranges can be matched.
     * </pre>
     *
     * <code>.envoy.config.core.v3.CidrRange upstream_ip = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.CidrRange, io.envoyproxy.envoy.config.core.v3.CidrRange.Builder, io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder> 
        getUpstreamIpFieldBuilder() {
      if (upstreamIpBuilder_ == null) {
        upstreamIpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.CidrRange, io.envoyproxy.envoy.config.core.v3.CidrRange.Builder, io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder>(
                getUpstreamIp(),
                getParentForChildren(),
                isClean());
        upstreamIp_ = null;
      }
      return upstreamIpBuilder_;
    }

    private io.envoyproxy.envoy.type.v3.Int64Range upstreamPortRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.Int64Range, io.envoyproxy.envoy.type.v3.Int64Range.Builder, io.envoyproxy.envoy.type.v3.Int64RangeOrBuilder> upstreamPortRangeBuilder_;
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     * @return Whether the upstreamPortRange field is set.
     */
    public boolean hasUpstreamPortRange() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     * @return The upstreamPortRange.
     */
    public io.envoyproxy.envoy.type.v3.Int64Range getUpstreamPortRange() {
      if (upstreamPortRangeBuilder_ == null) {
        return upstreamPortRange_ == null ? io.envoyproxy.envoy.type.v3.Int64Range.getDefaultInstance() : upstreamPortRange_;
      } else {
        return upstreamPortRangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    public Builder setUpstreamPortRange(io.envoyproxy.envoy.type.v3.Int64Range value) {
      if (upstreamPortRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        upstreamPortRange_ = value;
      } else {
        upstreamPortRangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    public Builder setUpstreamPortRange(
        io.envoyproxy.envoy.type.v3.Int64Range.Builder builderForValue) {
      if (upstreamPortRangeBuilder_ == null) {
        upstreamPortRange_ = builderForValue.build();
      } else {
        upstreamPortRangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    public Builder mergeUpstreamPortRange(io.envoyproxy.envoy.type.v3.Int64Range value) {
      if (upstreamPortRangeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          upstreamPortRange_ != null &&
          upstreamPortRange_ != io.envoyproxy.envoy.type.v3.Int64Range.getDefaultInstance()) {
          getUpstreamPortRangeBuilder().mergeFrom(value);
        } else {
          upstreamPortRange_ = value;
        }
      } else {
        upstreamPortRangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    public Builder clearUpstreamPortRange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      upstreamPortRange_ = null;
      if (upstreamPortRangeBuilder_ != null) {
        upstreamPortRangeBuilder_.dispose();
        upstreamPortRangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    public io.envoyproxy.envoy.type.v3.Int64Range.Builder getUpstreamPortRangeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpstreamPortRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    public io.envoyproxy.envoy.type.v3.Int64RangeOrBuilder getUpstreamPortRangeOrBuilder() {
      if (upstreamPortRangeBuilder_ != null) {
        return upstreamPortRangeBuilder_.getMessageOrBuilder();
      } else {
        return upstreamPortRange_ == null ?
            io.envoyproxy.envoy.type.v3.Int64Range.getDefaultInstance() : upstreamPortRange_;
      }
    }
    /**
     * <pre>
     * A port range that will be used to match the upstream port.
     * </pre>
     *
     * <code>.envoy.type.v3.Int64Range upstream_port_range = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.Int64Range, io.envoyproxy.envoy.type.v3.Int64Range.Builder, io.envoyproxy.envoy.type.v3.Int64RangeOrBuilder> 
        getUpstreamPortRangeFieldBuilder() {
      if (upstreamPortRangeBuilder_ == null) {
        upstreamPortRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.v3.Int64Range, io.envoyproxy.envoy.type.v3.Int64Range.Builder, io.envoyproxy.envoy.type.v3.Int64RangeOrBuilder>(
                getUpstreamPortRange(),
                getParentForChildren(),
                isClean());
        upstreamPortRange_ = null;
      }
      return upstreamPortRangeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher)
  private static final io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher();
  }

  public static io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamIpPortMatcher>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamIpPortMatcher>() {
    @java.lang.Override
    public UpstreamIpPortMatcher parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpstreamIpPortMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamIpPortMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.rbac.matchers.upstream_ip_port.v3.UpstreamIpPortMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

