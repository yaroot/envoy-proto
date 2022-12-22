// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

package com.google.cloud.vmwareengine.v1;

/**
 * <pre>
 * Information about the type and number of nodes associated with the cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmwareengine.v1.NodeTypeConfig}
 */
public final class NodeTypeConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmwareengine.v1.NodeTypeConfig)
    NodeTypeConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeTypeConfig.newBuilder() to construct.
  private NodeTypeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeTypeConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeTypeConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_NodeTypeConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_NodeTypeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmwareengine.v1.NodeTypeConfig.class, com.google.cloud.vmwareengine.v1.NodeTypeConfig.Builder.class);
  }

  public static final int NODE_COUNT_FIELD_NUMBER = 1;
  private int nodeCount_ = 0;
  /**
   * <pre>
   * Required. The number of nodes of this type in the cluster
   * </pre>
   *
   * <code>int32 node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nodeCount.
   */
  @java.lang.Override
  public int getNodeCount() {
    return nodeCount_;
  }

  public static final int CUSTOM_CORE_COUNT_FIELD_NUMBER = 2;
  private int customCoreCount_ = 0;
  /**
   * <pre>
   * Optional. Customized number of cores available to each node of the type.
   * This number must always be one of `nodeType.availableCustomCoreCounts`.
   * If zero is provided max value from `nodeType.availableCustomCoreCounts`
   * will be used.
   * </pre>
   *
   * <code>int32 custom_core_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The customCoreCount.
   */
  @java.lang.Override
  public int getCustomCoreCount() {
    return customCoreCount_;
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
    if (nodeCount_ != 0) {
      output.writeInt32(1, nodeCount_);
    }
    if (customCoreCount_ != 0) {
      output.writeInt32(2, customCoreCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, nodeCount_);
    }
    if (customCoreCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, customCoreCount_);
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
    if (!(obj instanceof com.google.cloud.vmwareengine.v1.NodeTypeConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.vmwareengine.v1.NodeTypeConfig other = (com.google.cloud.vmwareengine.v1.NodeTypeConfig) obj;

    if (getNodeCount()
        != other.getNodeCount()) return false;
    if (getCustomCoreCount()
        != other.getCustomCoreCount()) return false;
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
    hash = (37 * hash) + NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getNodeCount();
    hash = (37 * hash) + CUSTOM_CORE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCustomCoreCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmwareengine.v1.NodeTypeConfig prototype) {
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
   * Information about the type and number of nodes associated with the cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmwareengine.v1.NodeTypeConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmwareengine.v1.NodeTypeConfig)
      com.google.cloud.vmwareengine.v1.NodeTypeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_NodeTypeConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_NodeTypeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmwareengine.v1.NodeTypeConfig.class, com.google.cloud.vmwareengine.v1.NodeTypeConfig.Builder.class);
    }

    // Construct using com.google.cloud.vmwareengine.v1.NodeTypeConfig.newBuilder()
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
      nodeCount_ = 0;
      customCoreCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_NodeTypeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.NodeTypeConfig getDefaultInstanceForType() {
      return com.google.cloud.vmwareengine.v1.NodeTypeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.NodeTypeConfig build() {
      com.google.cloud.vmwareengine.v1.NodeTypeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.NodeTypeConfig buildPartial() {
      com.google.cloud.vmwareengine.v1.NodeTypeConfig result = new com.google.cloud.vmwareengine.v1.NodeTypeConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmwareengine.v1.NodeTypeConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nodeCount_ = nodeCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customCoreCount_ = customCoreCount_;
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
      if (other instanceof com.google.cloud.vmwareengine.v1.NodeTypeConfig) {
        return mergeFrom((com.google.cloud.vmwareengine.v1.NodeTypeConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmwareengine.v1.NodeTypeConfig other) {
      if (other == com.google.cloud.vmwareengine.v1.NodeTypeConfig.getDefaultInstance()) return this;
      if (other.getNodeCount() != 0) {
        setNodeCount(other.getNodeCount());
      }
      if (other.getCustomCoreCount() != 0) {
        setCustomCoreCount(other.getCustomCoreCount());
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
              nodeCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              customCoreCount_ = input.readInt32();
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

    private int nodeCount_ ;
    /**
     * <pre>
     * Required. The number of nodes of this type in the cluster
     * </pre>
     *
     * <code>int32 node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nodeCount.
     */
    @java.lang.Override
    public int getNodeCount() {
      return nodeCount_;
    }
    /**
     * <pre>
     * Required. The number of nodes of this type in the cluster
     * </pre>
     *
     * <code>int32 node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The nodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setNodeCount(int value) {
      
      nodeCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The number of nodes of this type in the cluster
     * </pre>
     *
     * <code>int32 node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nodeCount_ = 0;
      onChanged();
      return this;
    }

    private int customCoreCount_ ;
    /**
     * <pre>
     * Optional. Customized number of cores available to each node of the type.
     * This number must always be one of `nodeType.availableCustomCoreCounts`.
     * If zero is provided max value from `nodeType.availableCustomCoreCounts`
     * will be used.
     * </pre>
     *
     * <code>int32 custom_core_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The customCoreCount.
     */
    @java.lang.Override
    public int getCustomCoreCount() {
      return customCoreCount_;
    }
    /**
     * <pre>
     * Optional. Customized number of cores available to each node of the type.
     * This number must always be one of `nodeType.availableCustomCoreCounts`.
     * If zero is provided max value from `nodeType.availableCustomCoreCounts`
     * will be used.
     * </pre>
     *
     * <code>int32 custom_core_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The customCoreCount to set.
     * @return This builder for chaining.
     */
    public Builder setCustomCoreCount(int value) {
      
      customCoreCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Customized number of cores available to each node of the type.
     * This number must always be one of `nodeType.availableCustomCoreCounts`.
     * If zero is provided max value from `nodeType.availableCustomCoreCounts`
     * will be used.
     * </pre>
     *
     * <code>int32 custom_core_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomCoreCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      customCoreCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmwareengine.v1.NodeTypeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmwareengine.v1.NodeTypeConfig)
  private static final com.google.cloud.vmwareengine.v1.NodeTypeConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmwareengine.v1.NodeTypeConfig();
  }

  public static com.google.cloud.vmwareengine.v1.NodeTypeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeTypeConfig>
      PARSER = new com.google.protobuf.AbstractParser<NodeTypeConfig>() {
    @java.lang.Override
    public NodeTypeConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeTypeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeTypeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.NodeTypeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
