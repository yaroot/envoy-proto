// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/load_stats/v2/lrs.proto

package io.envoyproxy.envoy.service.load_stats.v2;

/**
 * <pre>
 * A load report Envoy sends to the management server.
 * [#not-implemented-hide:] Not configuration. TBD how to doc proto APIs.
 * </pre>
 *
 * Protobuf type {@code envoy.service.load_stats.v2.LoadStatsRequest}
 */
public final class LoadStatsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.load_stats.v2.LoadStatsRequest)
    LoadStatsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadStatsRequest.newBuilder() to construct.
  private LoadStatsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadStatsRequest() {
    clusterStats_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoadStatsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.load_stats.v2.LrsProto.internal_static_envoy_service_load_stats_v2_LoadStatsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.load_stats.v2.LrsProto.internal_static_envoy_service_load_stats_v2_LoadStatsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.class, io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.api.v2.core.Node node_;
  /**
   * <pre>
   * Node identifier for Envoy instance.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Node node = 1;</code>
   * @return Whether the node field is set.
   */
  @java.lang.Override
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <pre>
   * Node identifier for Envoy instance.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Node node = 1;</code>
   * @return The node.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.Node getNode() {
    return node_ == null ? io.envoyproxy.envoy.api.v2.core.Node.getDefaultInstance() : node_;
  }
  /**
   * <pre>
   * Node identifier for Envoy instance.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Node node = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.NodeOrBuilder getNodeOrBuilder() {
    return node_ == null ? io.envoyproxy.envoy.api.v2.core.Node.getDefaultInstance() : node_;
  }

  public static final int CLUSTER_STATS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<io.envoyproxy.envoy.api.v2.endpoint.ClusterStats> clusterStats_;
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.api.v2.endpoint.ClusterStats> getClusterStatsList() {
    return clusterStats_;
  }
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder> 
      getClusterStatsOrBuilderList() {
    return clusterStats_;
  }
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
   */
  @java.lang.Override
  public int getClusterStatsCount() {
    return clusterStats_.size();
  }
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.endpoint.ClusterStats getClusterStats(int index) {
    return clusterStats_.get(index);
  }
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder getClusterStatsOrBuilder(
      int index) {
    return clusterStats_.get(index);
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
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
    for (int i = 0; i < clusterStats_.size(); i++) {
      output.writeMessage(2, clusterStats_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
    }
    for (int i = 0; i < clusterStats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, clusterStats_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest other = (io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest) obj;

    if (hasNode() != other.hasNode()) return false;
    if (hasNode()) {
      if (!getNode()
          .equals(other.getNode())) return false;
    }
    if (!getClusterStatsList()
        .equals(other.getClusterStatsList())) return false;
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
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    if (getClusterStatsCount() > 0) {
      hash = (37 * hash) + CLUSTER_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getClusterStatsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest prototype) {
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
   * A load report Envoy sends to the management server.
   * [#not-implemented-hide:] Not configuration. TBD how to doc proto APIs.
   * </pre>
   *
   * Protobuf type {@code envoy.service.load_stats.v2.LoadStatsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.load_stats.v2.LoadStatsRequest)
      io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.load_stats.v2.LrsProto.internal_static_envoy_service_load_stats_v2_LoadStatsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.load_stats.v2.LrsProto.internal_static_envoy_service_load_stats_v2_LoadStatsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.class, io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.newBuilder()
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
      node_ = null;
      if (nodeBuilder_ != null) {
        nodeBuilder_.dispose();
        nodeBuilder_ = null;
      }
      if (clusterStatsBuilder_ == null) {
        clusterStats_ = java.util.Collections.emptyList();
      } else {
        clusterStats_ = null;
        clusterStatsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.load_stats.v2.LrsProto.internal_static_envoy_service_load_stats_v2_LoadStatsRequest_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest build() {
      io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest buildPartial() {
      io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest result = new io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest result) {
      if (clusterStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          clusterStats_ = java.util.Collections.unmodifiableList(clusterStats_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.clusterStats_ = clusterStats_;
      } else {
        result.clusterStats_ = clusterStatsBuilder_.build();
      }
    }

    private void buildPartial0(io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.node_ = nodeBuilder_ == null
            ? node_
            : nodeBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest) {
        return mergeFrom((io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest other) {
      if (other == io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      if (clusterStatsBuilder_ == null) {
        if (!other.clusterStats_.isEmpty()) {
          if (clusterStats_.isEmpty()) {
            clusterStats_ = other.clusterStats_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureClusterStatsIsMutable();
            clusterStats_.addAll(other.clusterStats_);
          }
          onChanged();
        }
      } else {
        if (!other.clusterStats_.isEmpty()) {
          if (clusterStatsBuilder_.isEmpty()) {
            clusterStatsBuilder_.dispose();
            clusterStatsBuilder_ = null;
            clusterStats_ = other.clusterStats_;
            bitField0_ = (bitField0_ & ~0x00000002);
            clusterStatsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClusterStatsFieldBuilder() : null;
          } else {
            clusterStatsBuilder_.addAllMessages(other.clusterStats_);
          }
        }
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
                  getNodeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              io.envoyproxy.envoy.api.v2.endpoint.ClusterStats m =
                  input.readMessage(
                      io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.parser(),
                      extensionRegistry);
              if (clusterStatsBuilder_ == null) {
                ensureClusterStatsIsMutable();
                clusterStats_.add(m);
              } else {
                clusterStatsBuilder_.addMessage(m);
              }
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

    private io.envoyproxy.envoy.api.v2.core.Node node_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.Node, io.envoyproxy.envoy.api.v2.core.Node.Builder, io.envoyproxy.envoy.api.v2.core.NodeOrBuilder> nodeBuilder_;
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     * @return Whether the node field is set.
     */
    public boolean hasNode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     * @return The node.
     */
    public io.envoyproxy.envoy.api.v2.core.Node getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? io.envoyproxy.envoy.api.v2.core.Node.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    public Builder setNode(io.envoyproxy.envoy.api.v2.core.Node value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
      } else {
        nodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    public Builder setNode(
        io.envoyproxy.envoy.api.v2.core.Node.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    public Builder mergeNode(io.envoyproxy.envoy.api.v2.core.Node value) {
      if (nodeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          node_ != null &&
          node_ != io.envoyproxy.envoy.api.v2.core.Node.getDefaultInstance()) {
          getNodeBuilder().mergeFrom(value);
        } else {
          node_ = value;
        }
      } else {
        nodeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    public Builder clearNode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      node_ = null;
      if (nodeBuilder_ != null) {
        nodeBuilder_.dispose();
        nodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.Node.Builder getNodeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.NodeOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            io.envoyproxy.envoy.api.v2.core.Node.getDefaultInstance() : node_;
      }
    }
    /**
     * <pre>
     * Node identifier for Envoy instance.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Node node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.Node, io.envoyproxy.envoy.api.v2.core.Node.Builder, io.envoyproxy.envoy.api.v2.core.NodeOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.Node, io.envoyproxy.envoy.api.v2.core.Node.Builder, io.envoyproxy.envoy.api.v2.core.NodeOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private java.util.List<io.envoyproxy.envoy.api.v2.endpoint.ClusterStats> clusterStats_ =
      java.util.Collections.emptyList();
    private void ensureClusterStatsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        clusterStats_ = new java.util.ArrayList<io.envoyproxy.envoy.api.v2.endpoint.ClusterStats>(clusterStats_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.endpoint.ClusterStats, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder, io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder> clusterStatsBuilder_;

    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public java.util.List<io.envoyproxy.envoy.api.v2.endpoint.ClusterStats> getClusterStatsList() {
      if (clusterStatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clusterStats_);
      } else {
        return clusterStatsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public int getClusterStatsCount() {
      if (clusterStatsBuilder_ == null) {
        return clusterStats_.size();
      } else {
        return clusterStatsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.endpoint.ClusterStats getClusterStats(int index) {
      if (clusterStatsBuilder_ == null) {
        return clusterStats_.get(index);
      } else {
        return clusterStatsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder setClusterStats(
        int index, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats value) {
      if (clusterStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClusterStatsIsMutable();
        clusterStats_.set(index, value);
        onChanged();
      } else {
        clusterStatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder setClusterStats(
        int index, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder builderForValue) {
      if (clusterStatsBuilder_ == null) {
        ensureClusterStatsIsMutable();
        clusterStats_.set(index, builderForValue.build());
        onChanged();
      } else {
        clusterStatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder addClusterStats(io.envoyproxy.envoy.api.v2.endpoint.ClusterStats value) {
      if (clusterStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClusterStatsIsMutable();
        clusterStats_.add(value);
        onChanged();
      } else {
        clusterStatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder addClusterStats(
        int index, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats value) {
      if (clusterStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClusterStatsIsMutable();
        clusterStats_.add(index, value);
        onChanged();
      } else {
        clusterStatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder addClusterStats(
        io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder builderForValue) {
      if (clusterStatsBuilder_ == null) {
        ensureClusterStatsIsMutable();
        clusterStats_.add(builderForValue.build());
        onChanged();
      } else {
        clusterStatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder addClusterStats(
        int index, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder builderForValue) {
      if (clusterStatsBuilder_ == null) {
        ensureClusterStatsIsMutable();
        clusterStats_.add(index, builderForValue.build());
        onChanged();
      } else {
        clusterStatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder addAllClusterStats(
        java.lang.Iterable<? extends io.envoyproxy.envoy.api.v2.endpoint.ClusterStats> values) {
      if (clusterStatsBuilder_ == null) {
        ensureClusterStatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clusterStats_);
        onChanged();
      } else {
        clusterStatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder clearClusterStats() {
      if (clusterStatsBuilder_ == null) {
        clusterStats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        clusterStatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public Builder removeClusterStats(int index) {
      if (clusterStatsBuilder_ == null) {
        ensureClusterStatsIsMutable();
        clusterStats_.remove(index);
        onChanged();
      } else {
        clusterStatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder getClusterStatsBuilder(
        int index) {
      return getClusterStatsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder getClusterStatsOrBuilder(
        int index) {
      if (clusterStatsBuilder_ == null) {
        return clusterStats_.get(index);  } else {
        return clusterStatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder> 
         getClusterStatsOrBuilderList() {
      if (clusterStatsBuilder_ != null) {
        return clusterStatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clusterStats_);
      }
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder addClusterStatsBuilder() {
      return getClusterStatsFieldBuilder().addBuilder(
          io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder addClusterStatsBuilder(
        int index) {
      return getClusterStatsFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of load stats to report.
     * </pre>
     *
     * <code>repeated .envoy.api.v2.endpoint.ClusterStats cluster_stats = 2;</code>
     */
    public java.util.List<io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder> 
         getClusterStatsBuilderList() {
      return getClusterStatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.endpoint.ClusterStats, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder, io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder> 
        getClusterStatsFieldBuilder() {
      if (clusterStatsBuilder_ == null) {
        clusterStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.endpoint.ClusterStats, io.envoyproxy.envoy.api.v2.endpoint.ClusterStats.Builder, io.envoyproxy.envoy.api.v2.endpoint.ClusterStatsOrBuilder>(
                clusterStats_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        clusterStats_ = null;
      }
      return clusterStatsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.load_stats.v2.LoadStatsRequest)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.load_stats.v2.LoadStatsRequest)
  private static final io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest();
  }

  public static io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoadStatsRequest>
      PARSER = new com.google.protobuf.AbstractParser<LoadStatsRequest>() {
    @java.lang.Override
    public LoadStatsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoadStatsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadStatsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.load_stats.v2.LoadStatsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
