// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/connectors/v1/connection.proto

package com.google.cloud.connectors.v1;

/**
 * <pre>
 * Configuration for the connection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.connectors.v1.NodeConfig}
 */
public final class NodeConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.connectors.v1.NodeConfig)
    NodeConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeConfig.newBuilder() to construct.
  private NodeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_NodeConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_NodeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.connectors.v1.NodeConfig.class, com.google.cloud.connectors.v1.NodeConfig.Builder.class);
  }

  public static final int MIN_NODE_COUNT_FIELD_NUMBER = 1;
  private int minNodeCount_ = 0;
  /**
   * <pre>
   * Minimum number of nodes in the runtime nodes.
   * </pre>
   *
   * <code>int32 min_node_count = 1;</code>
   * @return The minNodeCount.
   */
  @java.lang.Override
  public int getMinNodeCount() {
    return minNodeCount_;
  }

  public static final int MAX_NODE_COUNT_FIELD_NUMBER = 2;
  private int maxNodeCount_ = 0;
  /**
   * <pre>
   * Maximum number of nodes in the runtime nodes.
   * </pre>
   *
   * <code>int32 max_node_count = 2;</code>
   * @return The maxNodeCount.
   */
  @java.lang.Override
  public int getMaxNodeCount() {
    return maxNodeCount_;
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
    if (minNodeCount_ != 0) {
      output.writeInt32(1, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      output.writeInt32(2, maxNodeCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxNodeCount_);
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
    if (!(obj instanceof com.google.cloud.connectors.v1.NodeConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.connectors.v1.NodeConfig other = (com.google.cloud.connectors.v1.NodeConfig) obj;

    if (getMinNodeCount()
        != other.getMinNodeCount()) return false;
    if (getMaxNodeCount()
        != other.getMaxNodeCount()) return false;
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
    hash = (37 * hash) + MIN_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinNodeCount();
    hash = (37 * hash) + MAX_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNodeCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.NodeConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.connectors.v1.NodeConfig prototype) {
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
   * Configuration for the connection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.connectors.v1.NodeConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.connectors.v1.NodeConfig)
      com.google.cloud.connectors.v1.NodeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_NodeConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_NodeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.connectors.v1.NodeConfig.class, com.google.cloud.connectors.v1.NodeConfig.Builder.class);
    }

    // Construct using com.google.cloud.connectors.v1.NodeConfig.newBuilder()
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
      minNodeCount_ = 0;
      maxNodeCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_NodeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.NodeConfig getDefaultInstanceForType() {
      return com.google.cloud.connectors.v1.NodeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.NodeConfig build() {
      com.google.cloud.connectors.v1.NodeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.NodeConfig buildPartial() {
      com.google.cloud.connectors.v1.NodeConfig result = new com.google.cloud.connectors.v1.NodeConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.connectors.v1.NodeConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minNodeCount_ = minNodeCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxNodeCount_ = maxNodeCount_;
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
      if (other instanceof com.google.cloud.connectors.v1.NodeConfig) {
        return mergeFrom((com.google.cloud.connectors.v1.NodeConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.connectors.v1.NodeConfig other) {
      if (other == com.google.cloud.connectors.v1.NodeConfig.getDefaultInstance()) return this;
      if (other.getMinNodeCount() != 0) {
        setMinNodeCount(other.getMinNodeCount());
      }
      if (other.getMaxNodeCount() != 0) {
        setMaxNodeCount(other.getMaxNodeCount());
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
            case 8: {
              minNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maxNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int minNodeCount_ ;
    /**
     * <pre>
     * Minimum number of nodes in the runtime nodes.
     * </pre>
     *
     * <code>int32 min_node_count = 1;</code>
     * @return The minNodeCount.
     */
    @java.lang.Override
    public int getMinNodeCount() {
      return minNodeCount_;
    }
    /**
     * <pre>
     * Minimum number of nodes in the runtime nodes.
     * </pre>
     *
     * <code>int32 min_node_count = 1;</code>
     * @param value The minNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinNodeCount(int value) {
      
      minNodeCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum number of nodes in the runtime nodes.
     * </pre>
     *
     * <code>int32 min_node_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minNodeCount_ = 0;
      onChanged();
      return this;
    }

    private int maxNodeCount_ ;
    /**
     * <pre>
     * Maximum number of nodes in the runtime nodes.
     * </pre>
     *
     * <code>int32 max_node_count = 2;</code>
     * @return The maxNodeCount.
     */
    @java.lang.Override
    public int getMaxNodeCount() {
      return maxNodeCount_;
    }
    /**
     * <pre>
     * Maximum number of nodes in the runtime nodes.
     * </pre>
     *
     * <code>int32 max_node_count = 2;</code>
     * @param value The maxNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNodeCount(int value) {
      
      maxNodeCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of nodes in the runtime nodes.
     * </pre>
     *
     * <code>int32 max_node_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxNodeCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.connectors.v1.NodeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.connectors.v1.NodeConfig)
  private static final com.google.cloud.connectors.v1.NodeConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.connectors.v1.NodeConfig();
  }

  public static com.google.cloud.connectors.v1.NodeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeConfig>
      PARSER = new com.google.protobuf.AbstractParser<NodeConfig>() {
    @java.lang.Override
    public NodeConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.connectors.v1.NodeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
