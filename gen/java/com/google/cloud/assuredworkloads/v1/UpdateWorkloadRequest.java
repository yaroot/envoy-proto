// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

/**
 * <pre>
 * Request for Updating a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.assuredworkloads.v1.UpdateWorkloadRequest}
 */
public final class UpdateWorkloadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.assuredworkloads.v1.UpdateWorkloadRequest)
    UpdateWorkloadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWorkloadRequest.newBuilder() to construct.
  private UpdateWorkloadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWorkloadRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWorkloadRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.class, com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.Builder.class);
  }

  public static final int WORKLOAD_FIELD_NUMBER = 1;
  private com.google.cloud.assuredworkloads.v1.Workload workload_;
  /**
   * <pre>
   * Required. The workload to update.
   * The workload's `name` field is used to identify the workload to be updated.
   * Format:
   * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
   * </pre>
   *
   * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the workload field is set.
   */
  @java.lang.Override
  public boolean hasWorkload() {
    return workload_ != null;
  }
  /**
   * <pre>
   * Required. The workload to update.
   * The workload's `name` field is used to identify the workload to be updated.
   * Format:
   * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
   * </pre>
   *
   * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The workload.
   */
  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.Workload getWorkload() {
    return workload_ == null ? com.google.cloud.assuredworkloads.v1.Workload.getDefaultInstance() : workload_;
  }
  /**
   * <pre>
   * Required. The workload to update.
   * The workload's `name` field is used to identify the workload to be updated.
   * Format:
   * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
   * </pre>
   *
   * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.WorkloadOrBuilder getWorkloadOrBuilder() {
    return workload_ == null ? com.google.cloud.assuredworkloads.v1.Workload.getDefaultInstance() : workload_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (workload_ != null) {
      output.writeMessage(1, getWorkload());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkload());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest other = (com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest) obj;

    if (hasWorkload() != other.hasWorkload()) return false;
    if (hasWorkload()) {
      if (!getWorkload()
          .equals(other.getWorkload())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasWorkload()) {
      hash = (37 * hash) + WORKLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getWorkload().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest prototype) {
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
   * Request for Updating a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.assuredworkloads.v1.UpdateWorkloadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.assuredworkloads.v1.UpdateWorkloadRequest)
      com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.class, com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.Builder.class);
    }

    // Construct using com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.newBuilder()
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
      workload_ = null;
      if (workloadBuilder_ != null) {
        workloadBuilder_.dispose();
        workloadBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest getDefaultInstanceForType() {
      return com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest build() {
      com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest buildPartial() {
      com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest result = new com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workload_ = workloadBuilder_ == null
            ? workload_
            : workloadBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest) {
        return mergeFrom((com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest other) {
      if (other == com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest.getDefaultInstance()) return this;
      if (other.hasWorkload()) {
        mergeWorkload(other.getWorkload());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getWorkloadFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.assuredworkloads.v1.Workload workload_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.assuredworkloads.v1.Workload, com.google.cloud.assuredworkloads.v1.Workload.Builder, com.google.cloud.assuredworkloads.v1.WorkloadOrBuilder> workloadBuilder_;
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the workload field is set.
     */
    public boolean hasWorkload() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The workload.
     */
    public com.google.cloud.assuredworkloads.v1.Workload getWorkload() {
      if (workloadBuilder_ == null) {
        return workload_ == null ? com.google.cloud.assuredworkloads.v1.Workload.getDefaultInstance() : workload_;
      } else {
        return workloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setWorkload(com.google.cloud.assuredworkloads.v1.Workload value) {
      if (workloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workload_ = value;
      } else {
        workloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setWorkload(
        com.google.cloud.assuredworkloads.v1.Workload.Builder builderForValue) {
      if (workloadBuilder_ == null) {
        workload_ = builderForValue.build();
      } else {
        workloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeWorkload(com.google.cloud.assuredworkloads.v1.Workload value) {
      if (workloadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          workload_ != null &&
          workload_ != com.google.cloud.assuredworkloads.v1.Workload.getDefaultInstance()) {
          getWorkloadBuilder().mergeFrom(value);
        } else {
          workload_ = value;
        }
      } else {
        workloadBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearWorkload() {
      bitField0_ = (bitField0_ & ~0x00000001);
      workload_ = null;
      if (workloadBuilder_ != null) {
        workloadBuilder_.dispose();
        workloadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.assuredworkloads.v1.Workload.Builder getWorkloadBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.assuredworkloads.v1.WorkloadOrBuilder getWorkloadOrBuilder() {
      if (workloadBuilder_ != null) {
        return workloadBuilder_.getMessageOrBuilder();
      } else {
        return workload_ == null ?
            com.google.cloud.assuredworkloads.v1.Workload.getDefaultInstance() : workload_;
      }
    }
    /**
     * <pre>
     * Required. The workload to update.
     * The workload's `name` field is used to identify the workload to be updated.
     * Format:
     * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.assuredworkloads.v1.Workload, com.google.cloud.assuredworkloads.v1.Workload.Builder, com.google.cloud.assuredworkloads.v1.WorkloadOrBuilder> 
        getWorkloadFieldBuilder() {
      if (workloadBuilder_ == null) {
        workloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.assuredworkloads.v1.Workload, com.google.cloud.assuredworkloads.v1.Workload.Builder, com.google.cloud.assuredworkloads.v1.WorkloadOrBuilder>(
                getWorkload(),
                getParentForChildren(),
                isClean());
        workload_ = null;
      }
      return workloadBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.assuredworkloads.v1.UpdateWorkloadRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.assuredworkloads.v1.UpdateWorkloadRequest)
  private static final com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest();
  }

  public static com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWorkloadRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWorkloadRequest>() {
    @java.lang.Override
    public UpdateWorkloadRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWorkloadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWorkloadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

