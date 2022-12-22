// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

/**
 * <pre>
 * ListNodePoolsResponse is the result of ListNodePoolsRequest.
 * </pre>
 *
 * Protobuf type {@code google.container.v1alpha1.ListNodePoolsResponse}
 */
public final class ListNodePoolsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1alpha1.ListNodePoolsResponse)
    ListNodePoolsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNodePoolsResponse.newBuilder() to construct.
  private ListNodePoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNodePoolsResponse() {
    nodePools_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNodePoolsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ListNodePoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ListNodePoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1alpha1.ListNodePoolsResponse.class, com.google.container.v1alpha1.ListNodePoolsResponse.Builder.class);
  }

  public static final int NODE_POOLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.container.v1alpha1.NodePool> nodePools_;
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.container.v1alpha1.NodePool> getNodePoolsList() {
    return nodePools_;
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.container.v1alpha1.NodePoolOrBuilder> 
      getNodePoolsOrBuilderList() {
    return nodePools_;
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  @java.lang.Override
  public int getNodePoolsCount() {
    return nodePools_.size();
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1alpha1.NodePool getNodePools(int index) {
    return nodePools_.get(index);
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1alpha1.NodePoolOrBuilder getNodePoolsOrBuilder(
      int index) {
    return nodePools_.get(index);
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
    for (int i = 0; i < nodePools_.size(); i++) {
      output.writeMessage(1, nodePools_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodePools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodePools_.get(i));
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
    if (!(obj instanceof com.google.container.v1alpha1.ListNodePoolsResponse)) {
      return super.equals(obj);
    }
    com.google.container.v1alpha1.ListNodePoolsResponse other = (com.google.container.v1alpha1.ListNodePoolsResponse) obj;

    if (!getNodePoolsList()
        .equals(other.getNodePoolsList())) return false;
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
    if (getNodePoolsCount() > 0) {
      hash = (37 * hash) + NODE_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getNodePoolsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.ListNodePoolsResponse parseFrom(
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
  public static Builder newBuilder(com.google.container.v1alpha1.ListNodePoolsResponse prototype) {
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
   * ListNodePoolsResponse is the result of ListNodePoolsRequest.
   * </pre>
   *
   * Protobuf type {@code google.container.v1alpha1.ListNodePoolsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1alpha1.ListNodePoolsResponse)
      com.google.container.v1alpha1.ListNodePoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ListNodePoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ListNodePoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1alpha1.ListNodePoolsResponse.class, com.google.container.v1alpha1.ListNodePoolsResponse.Builder.class);
    }

    // Construct using com.google.container.v1alpha1.ListNodePoolsResponse.newBuilder()
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
      if (nodePoolsBuilder_ == null) {
        nodePools_ = java.util.Collections.emptyList();
      } else {
        nodePools_ = null;
        nodePoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ListNodePoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1alpha1.ListNodePoolsResponse getDefaultInstanceForType() {
      return com.google.container.v1alpha1.ListNodePoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1alpha1.ListNodePoolsResponse build() {
      com.google.container.v1alpha1.ListNodePoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1alpha1.ListNodePoolsResponse buildPartial() {
      com.google.container.v1alpha1.ListNodePoolsResponse result = new com.google.container.v1alpha1.ListNodePoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.container.v1alpha1.ListNodePoolsResponse result) {
      if (nodePoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodePools_ = java.util.Collections.unmodifiableList(nodePools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodePools_ = nodePools_;
      } else {
        result.nodePools_ = nodePoolsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.container.v1alpha1.ListNodePoolsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.container.v1alpha1.ListNodePoolsResponse) {
        return mergeFrom((com.google.container.v1alpha1.ListNodePoolsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1alpha1.ListNodePoolsResponse other) {
      if (other == com.google.container.v1alpha1.ListNodePoolsResponse.getDefaultInstance()) return this;
      if (nodePoolsBuilder_ == null) {
        if (!other.nodePools_.isEmpty()) {
          if (nodePools_.isEmpty()) {
            nodePools_ = other.nodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodePoolsIsMutable();
            nodePools_.addAll(other.nodePools_);
          }
          onChanged();
        }
      } else {
        if (!other.nodePools_.isEmpty()) {
          if (nodePoolsBuilder_.isEmpty()) {
            nodePoolsBuilder_.dispose();
            nodePoolsBuilder_ = null;
            nodePools_ = other.nodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodePoolsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodePoolsFieldBuilder() : null;
          } else {
            nodePoolsBuilder_.addAllMessages(other.nodePools_);
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
              com.google.container.v1alpha1.NodePool m =
                  input.readMessage(
                      com.google.container.v1alpha1.NodePool.parser(),
                      extensionRegistry);
              if (nodePoolsBuilder_ == null) {
                ensureNodePoolsIsMutable();
                nodePools_.add(m);
              } else {
                nodePoolsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.container.v1alpha1.NodePool> nodePools_ =
      java.util.Collections.emptyList();
    private void ensureNodePoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodePools_ = new java.util.ArrayList<com.google.container.v1alpha1.NodePool>(nodePools_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1alpha1.NodePool, com.google.container.v1alpha1.NodePool.Builder, com.google.container.v1alpha1.NodePoolOrBuilder> nodePoolsBuilder_;

    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public java.util.List<com.google.container.v1alpha1.NodePool> getNodePoolsList() {
      if (nodePoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodePools_);
      } else {
        return nodePoolsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public int getNodePoolsCount() {
      if (nodePoolsBuilder_ == null) {
        return nodePools_.size();
      } else {
        return nodePoolsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1alpha1.NodePool getNodePools(int index) {
      if (nodePoolsBuilder_ == null) {
        return nodePools_.get(index);
      } else {
        return nodePoolsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder setNodePools(
        int index, com.google.container.v1alpha1.NodePool value) {
      if (nodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodePoolsIsMutable();
        nodePools_.set(index, value);
        onChanged();
      } else {
        nodePoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder setNodePools(
        int index, com.google.container.v1alpha1.NodePool.Builder builderForValue) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodePoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(com.google.container.v1alpha1.NodePool value) {
      if (nodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodePoolsIsMutable();
        nodePools_.add(value);
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(
        int index, com.google.container.v1alpha1.NodePool value) {
      if (nodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodePoolsIsMutable();
        nodePools_.add(index, value);
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(
        com.google.container.v1alpha1.NodePool.Builder builderForValue) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.add(builderForValue.build());
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(
        int index, com.google.container.v1alpha1.NodePool.Builder builderForValue) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder addAllNodePools(
        java.lang.Iterable<? extends com.google.container.v1alpha1.NodePool> values) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodePools_);
        onChanged();
      } else {
        nodePoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder clearNodePools() {
      if (nodePoolsBuilder_ == null) {
        nodePools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodePoolsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public Builder removeNodePools(int index) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.remove(index);
        onChanged();
      } else {
        nodePoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1alpha1.NodePool.Builder getNodePoolsBuilder(
        int index) {
      return getNodePoolsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1alpha1.NodePoolOrBuilder getNodePoolsOrBuilder(
        int index) {
      if (nodePoolsBuilder_ == null) {
        return nodePools_.get(index);  } else {
        return nodePoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public java.util.List<? extends com.google.container.v1alpha1.NodePoolOrBuilder> 
         getNodePoolsOrBuilderList() {
      if (nodePoolsBuilder_ != null) {
        return nodePoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodePools_);
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1alpha1.NodePool.Builder addNodePoolsBuilder() {
      return getNodePoolsFieldBuilder().addBuilder(
          com.google.container.v1alpha1.NodePool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1alpha1.NodePool.Builder addNodePoolsBuilder(
        int index) {
      return getNodePoolsFieldBuilder().addBuilder(
          index, com.google.container.v1alpha1.NodePool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
     */
    public java.util.List<com.google.container.v1alpha1.NodePool.Builder> 
         getNodePoolsBuilderList() {
      return getNodePoolsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1alpha1.NodePool, com.google.container.v1alpha1.NodePool.Builder, com.google.container.v1alpha1.NodePoolOrBuilder> 
        getNodePoolsFieldBuilder() {
      if (nodePoolsBuilder_ == null) {
        nodePoolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.container.v1alpha1.NodePool, com.google.container.v1alpha1.NodePool.Builder, com.google.container.v1alpha1.NodePoolOrBuilder>(
                nodePools_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nodePools_ = null;
      }
      return nodePoolsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1alpha1.ListNodePoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1alpha1.ListNodePoolsResponse)
  private static final com.google.container.v1alpha1.ListNodePoolsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1alpha1.ListNodePoolsResponse();
  }

  public static com.google.container.v1alpha1.ListNodePoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNodePoolsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNodePoolsResponse>() {
    @java.lang.Override
    public ListNodePoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNodePoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNodePoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1alpha1.ListNodePoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
