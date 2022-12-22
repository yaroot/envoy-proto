// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/load_balancing_policies/wrr_locality/v3/wrr_locality.proto

package io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3;

/**
 * <pre>
 * Configuration for the wrr_locality LB policy. See the :ref:`load balancing architecture overview
 * &lt;arch_overview_load_balancing_types&gt;` for more information.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality}
 */
public final class WrrLocality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality)
    WrrLocalityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WrrLocality.newBuilder() to construct.
  private WrrLocality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WrrLocality() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WrrLocality();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocalityProto.internal_static_envoy_extensions_load_balancing_policies_wrr_locality_v3_WrrLocality_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocalityProto.internal_static_envoy_extensions_load_balancing_policies_wrr_locality_v3_WrrLocality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.class, io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.Builder.class);
  }

  public static final int ENDPOINT_PICKING_POLICY_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy endpointPickingPolicy_;
  /**
   * <pre>
   * The child LB policy to create for endpoint-picking within the chosen locality.
   * </pre>
   *
   * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the endpointPickingPolicy field is set.
   */
  @java.lang.Override
  public boolean hasEndpointPickingPolicy() {
    return endpointPickingPolicy_ != null;
  }
  /**
   * <pre>
   * The child LB policy to create for endpoint-picking within the chosen locality.
   * </pre>
   *
   * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
   * @return The endpointPickingPolicy.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy getEndpointPickingPolicy() {
    return endpointPickingPolicy_ == null ? io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.getDefaultInstance() : endpointPickingPolicy_;
  }
  /**
   * <pre>
   * The child LB policy to create for endpoint-picking within the chosen locality.
   * </pre>
   *
   * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicyOrBuilder getEndpointPickingPolicyOrBuilder() {
    return endpointPickingPolicy_ == null ? io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.getDefaultInstance() : endpointPickingPolicy_;
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
    if (endpointPickingPolicy_ != null) {
      output.writeMessage(1, getEndpointPickingPolicy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (endpointPickingPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEndpointPickingPolicy());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality other = (io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality) obj;

    if (hasEndpointPickingPolicy() != other.hasEndpointPickingPolicy()) return false;
    if (hasEndpointPickingPolicy()) {
      if (!getEndpointPickingPolicy()
          .equals(other.getEndpointPickingPolicy())) return false;
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
    if (hasEndpointPickingPolicy()) {
      hash = (37 * hash) + ENDPOINT_PICKING_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getEndpointPickingPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality prototype) {
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
   * Configuration for the wrr_locality LB policy. See the :ref:`load balancing architecture overview
   * &lt;arch_overview_load_balancing_types&gt;` for more information.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality)
      io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocalityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocalityProto.internal_static_envoy_extensions_load_balancing_policies_wrr_locality_v3_WrrLocality_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocalityProto.internal_static_envoy_extensions_load_balancing_policies_wrr_locality_v3_WrrLocality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.class, io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.newBuilder()
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
      endpointPickingPolicy_ = null;
      if (endpointPickingPolicyBuilder_ != null) {
        endpointPickingPolicyBuilder_.dispose();
        endpointPickingPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocalityProto.internal_static_envoy_extensions_load_balancing_policies_wrr_locality_v3_WrrLocality_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality build() {
      io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality buildPartial() {
      io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality result = new io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpointPickingPolicy_ = endpointPickingPolicyBuilder_ == null
            ? endpointPickingPolicy_
            : endpointPickingPolicyBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality) {
        return mergeFrom((io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality other) {
      if (other == io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality.getDefaultInstance()) return this;
      if (other.hasEndpointPickingPolicy()) {
        mergeEndpointPickingPolicy(other.getEndpointPickingPolicy());
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
                  getEndpointPickingPolicyFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy endpointPickingPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy, io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.Builder, io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicyOrBuilder> endpointPickingPolicyBuilder_;
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the endpointPickingPolicy field is set.
     */
    public boolean hasEndpointPickingPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     * @return The endpointPickingPolicy.
     */
    public io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy getEndpointPickingPolicy() {
      if (endpointPickingPolicyBuilder_ == null) {
        return endpointPickingPolicy_ == null ? io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.getDefaultInstance() : endpointPickingPolicy_;
      } else {
        return endpointPickingPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setEndpointPickingPolicy(io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy value) {
      if (endpointPickingPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpointPickingPolicy_ = value;
      } else {
        endpointPickingPolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setEndpointPickingPolicy(
        io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.Builder builderForValue) {
      if (endpointPickingPolicyBuilder_ == null) {
        endpointPickingPolicy_ = builderForValue.build();
      } else {
        endpointPickingPolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeEndpointPickingPolicy(io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy value) {
      if (endpointPickingPolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          endpointPickingPolicy_ != null &&
          endpointPickingPolicy_ != io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.getDefaultInstance()) {
          getEndpointPickingPolicyBuilder().mergeFrom(value);
        } else {
          endpointPickingPolicy_ = value;
        }
      } else {
        endpointPickingPolicyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearEndpointPickingPolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      endpointPickingPolicy_ = null;
      if (endpointPickingPolicyBuilder_ != null) {
        endpointPickingPolicyBuilder_.dispose();
        endpointPickingPolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.Builder getEndpointPickingPolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndpointPickingPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicyOrBuilder getEndpointPickingPolicyOrBuilder() {
      if (endpointPickingPolicyBuilder_ != null) {
        return endpointPickingPolicyBuilder_.getMessageOrBuilder();
      } else {
        return endpointPickingPolicy_ == null ?
            io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.getDefaultInstance() : endpointPickingPolicy_;
      }
    }
    /**
     * <pre>
     * The child LB policy to create for endpoint-picking within the chosen locality.
     * </pre>
     *
     * <code>.envoy.config.cluster.v3.LoadBalancingPolicy endpoint_picking_policy = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy, io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.Builder, io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicyOrBuilder> 
        getEndpointPickingPolicyFieldBuilder() {
      if (endpointPickingPolicyBuilder_ == null) {
        endpointPickingPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy, io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicy.Builder, io.envoyproxy.envoy.config.cluster.v3.LoadBalancingPolicyOrBuilder>(
                getEndpointPickingPolicy(),
                getParentForChildren(),
                isClean());
        endpointPickingPolicy_ = null;
      }
      return endpointPickingPolicyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality)
  private static final io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality();
  }

  public static io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WrrLocality>
      PARSER = new com.google.protobuf.AbstractParser<WrrLocality>() {
    @java.lang.Override
    public WrrLocality parsePartialFrom(
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

  public static com.google.protobuf.Parser<WrrLocality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WrrLocality> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.load_balancing_policies.wrr_locality.v3.WrrLocality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
