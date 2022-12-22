// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * A description of resources that can be shared by multiple DeployedModels,
 * whose underlying specification consists of a DedicatedResources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.DeploymentResourcePool}
 */
public final class DeploymentResourcePool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.DeploymentResourcePool)
    DeploymentResourcePoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeploymentResourcePool.newBuilder() to construct.
  private DeploymentResourcePool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeploymentResourcePool() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeploymentResourcePool();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.class, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Output only. The resource name of the DeploymentResourcePool.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The resource name of the DeploymentResourcePool.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEDICATED_RESOURCES_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.DedicatedResources dedicatedResources_;
  /**
   * <pre>
   * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dedicatedResources field is set.
   */
  @java.lang.Override
  public boolean hasDedicatedResources() {
    return dedicatedResources_ != null;
  }
  /**
   * <pre>
   * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dedicatedResources.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DedicatedResources getDedicatedResources() {
    return dedicatedResources_ == null ? com.google.cloud.aiplatform.v1beta1.DedicatedResources.getDefaultInstance() : dedicatedResources_;
  }
  /**
   * <pre>
   * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DedicatedResourcesOrBuilder getDedicatedResourcesOrBuilder() {
    return dedicatedResources_ == null ? com.google.cloud.aiplatform.v1beta1.DedicatedResources.getDefaultInstance() : dedicatedResources_;
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (dedicatedResources_ != null) {
      output.writeMessage(2, getDedicatedResources());
    }
    if (createTime_ != null) {
      output.writeMessage(4, getCreateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (dedicatedResources_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDedicatedResources());
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCreateTime());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool other = (com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasDedicatedResources() != other.hasDedicatedResources()) return false;
    if (hasDedicatedResources()) {
      if (!getDedicatedResources()
          .equals(other.getDedicatedResources())) return false;
    }
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasDedicatedResources()) {
      hash = (37 * hash) + DEDICATED_RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getDedicatedResources().hashCode();
    }
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool prototype) {
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
   * A description of resources that can be shared by multiple DeployedModels,
   * whose underlying specification consists of a DedicatedResources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.DeploymentResourcePool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.DeploymentResourcePool)
      com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.class, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.newBuilder()
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
      name_ = "";
      dedicatedResources_ = null;
      if (dedicatedResourcesBuilder_ != null) {
        dedicatedResourcesBuilder_.dispose();
        dedicatedResourcesBuilder_ = null;
      }
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool build() {
      com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool buildPartial() {
      com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool result = new com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dedicatedResources_ = dedicatedResourcesBuilder_ == null
            ? dedicatedResources_
            : dedicatedResourcesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool other) {
      if (other == com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDedicatedResources()) {
        mergeDedicatedResources(other.getDedicatedResources());
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDedicatedResourcesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 34: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. The resource name of the DeploymentResourcePool.
     * Format:
     * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the DeploymentResourcePool.
     * Format:
     * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the DeploymentResourcePool.
     * Format:
     * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the DeploymentResourcePool.
     * Format:
     * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the DeploymentResourcePool.
     * Format:
     * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.DedicatedResources dedicatedResources_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.DedicatedResources, com.google.cloud.aiplatform.v1beta1.DedicatedResources.Builder, com.google.cloud.aiplatform.v1beta1.DedicatedResourcesOrBuilder> dedicatedResourcesBuilder_;
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the dedicatedResources field is set.
     */
    public boolean hasDedicatedResources() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dedicatedResources.
     */
    public com.google.cloud.aiplatform.v1beta1.DedicatedResources getDedicatedResources() {
      if (dedicatedResourcesBuilder_ == null) {
        return dedicatedResources_ == null ? com.google.cloud.aiplatform.v1beta1.DedicatedResources.getDefaultInstance() : dedicatedResources_;
      } else {
        return dedicatedResourcesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDedicatedResources(com.google.cloud.aiplatform.v1beta1.DedicatedResources value) {
      if (dedicatedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dedicatedResources_ = value;
      } else {
        dedicatedResourcesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDedicatedResources(
        com.google.cloud.aiplatform.v1beta1.DedicatedResources.Builder builderForValue) {
      if (dedicatedResourcesBuilder_ == null) {
        dedicatedResources_ = builderForValue.build();
      } else {
        dedicatedResourcesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDedicatedResources(com.google.cloud.aiplatform.v1beta1.DedicatedResources value) {
      if (dedicatedResourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dedicatedResources_ != null &&
          dedicatedResources_ != com.google.cloud.aiplatform.v1beta1.DedicatedResources.getDefaultInstance()) {
          getDedicatedResourcesBuilder().mergeFrom(value);
        } else {
          dedicatedResources_ = value;
        }
      } else {
        dedicatedResourcesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDedicatedResources() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dedicatedResources_ = null;
      if (dedicatedResourcesBuilder_ != null) {
        dedicatedResourcesBuilder_.dispose();
        dedicatedResourcesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DedicatedResources.Builder getDedicatedResourcesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDedicatedResourcesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DedicatedResourcesOrBuilder getDedicatedResourcesOrBuilder() {
      if (dedicatedResourcesBuilder_ != null) {
        return dedicatedResourcesBuilder_.getMessageOrBuilder();
      } else {
        return dedicatedResources_ == null ?
            com.google.cloud.aiplatform.v1beta1.DedicatedResources.getDefaultInstance() : dedicatedResources_;
      }
    }
    /**
     * <pre>
     * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.DedicatedResources, com.google.cloud.aiplatform.v1beta1.DedicatedResources.Builder, com.google.cloud.aiplatform.v1beta1.DedicatedResourcesOrBuilder> 
        getDedicatedResourcesFieldBuilder() {
      if (dedicatedResourcesBuilder_ == null) {
        dedicatedResourcesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DedicatedResources, com.google.cloud.aiplatform.v1beta1.DedicatedResources.Builder, com.google.cloud.aiplatform.v1beta1.DedicatedResourcesOrBuilder>(
                getDedicatedResources(),
                getParentForChildren(),
                isClean());
        dedicatedResources_ = null;
      }
      return dedicatedResourcesBuilder_;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
      } else {
        createTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Output only. Timestamp when this DeploymentResourcePool was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.DeploymentResourcePool)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.DeploymentResourcePool)
  private static final com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool();
  }

  public static com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeploymentResourcePool>
      PARSER = new com.google.protobuf.AbstractParser<DeploymentResourcePool>() {
    @java.lang.Override
    public DeploymentResourcePool parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeploymentResourcePool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeploymentResourcePool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

