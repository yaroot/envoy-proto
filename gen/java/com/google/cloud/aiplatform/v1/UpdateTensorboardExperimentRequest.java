// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for [TensorboardService.UpdateTensorboardExperiment][google.cloud.aiplatform.v1.TensorboardService.UpdateTensorboardExperiment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest}
 */
public final class UpdateTensorboardExperimentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest)
    UpdateTensorboardExperimentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTensorboardExperimentRequest.newBuilder() to construct.
  private UpdateTensorboardExperimentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTensorboardExperimentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTensorboardExperimentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateTensorboardExperimentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateTensorboardExperimentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.class, com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardExperiment resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten if new
   * values are specified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardExperiment resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten if new
   * values are specified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardExperiment resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten if new
   * values are specified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int TENSORBOARD_EXPERIMENT_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.TensorboardExperiment tensorboardExperiment_;
  /**
   * <pre>
   * Required. The TensorboardExperiment's `name` field is used to identify the
   * TensorboardExperiment to be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tensorboardExperiment field is set.
   */
  @java.lang.Override
  public boolean hasTensorboardExperiment() {
    return tensorboardExperiment_ != null;
  }
  /**
   * <pre>
   * Required. The TensorboardExperiment's `name` field is used to identify the
   * TensorboardExperiment to be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardExperiment.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardExperiment getTensorboardExperiment() {
    return tensorboardExperiment_ == null ? com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
  }
  /**
   * <pre>
   * Required. The TensorboardExperiment's `name` field is used to identify the
   * TensorboardExperiment to be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder getTensorboardExperimentOrBuilder() {
    return tensorboardExperiment_ == null ? com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (tensorboardExperiment_ != null) {
      output.writeMessage(2, getTensorboardExperiment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateMask());
    }
    if (tensorboardExperiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTensorboardExperiment());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest other = (com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasTensorboardExperiment() != other.hasTensorboardExperiment()) return false;
    if (hasTensorboardExperiment()) {
      if (!getTensorboardExperiment()
          .equals(other.getTensorboardExperiment())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasTensorboardExperiment()) {
      hash = (37 * hash) + TENSORBOARD_EXPERIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardExperiment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest prototype) {
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
   * Request message for [TensorboardService.UpdateTensorboardExperiment][google.cloud.aiplatform.v1.TensorboardService.UpdateTensorboardExperiment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest)
      com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateTensorboardExperimentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateTensorboardExperimentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.class, com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.newBuilder()
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
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      tensorboardExperiment_ = null;
      if (tensorboardExperimentBuilder_ != null) {
        tensorboardExperimentBuilder_.dispose();
        tensorboardExperimentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateTensorboardExperimentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest build() {
      com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest buildPartial() {
      com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest result = new com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tensorboardExperiment_ = tensorboardExperimentBuilder_ == null
            ? tensorboardExperiment_
            : tensorboardExperimentBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest other) {
      if (other == com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasTensorboardExperiment()) {
        mergeTensorboardExperiment(other.getTensorboardExperiment());
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
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTensorboardExperimentFieldBuilder().getBuilder(),
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardExperiment resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.aiplatform.v1.TensorboardExperiment tensorboardExperiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TensorboardExperiment, com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder, com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder> tensorboardExperimentBuilder_;
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tensorboardExperiment field is set.
     */
    public boolean hasTensorboardExperiment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tensorboardExperiment.
     */
    public com.google.cloud.aiplatform.v1.TensorboardExperiment getTensorboardExperiment() {
      if (tensorboardExperimentBuilder_ == null) {
        return tensorboardExperiment_ == null ? com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
      } else {
        return tensorboardExperimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTensorboardExperiment(com.google.cloud.aiplatform.v1.TensorboardExperiment value) {
      if (tensorboardExperimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensorboardExperiment_ = value;
      } else {
        tensorboardExperimentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTensorboardExperiment(
        com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder builderForValue) {
      if (tensorboardExperimentBuilder_ == null) {
        tensorboardExperiment_ = builderForValue.build();
      } else {
        tensorboardExperimentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTensorboardExperiment(com.google.cloud.aiplatform.v1.TensorboardExperiment value) {
      if (tensorboardExperimentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          tensorboardExperiment_ != null &&
          tensorboardExperiment_ != com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance()) {
          getTensorboardExperimentBuilder().mergeFrom(value);
        } else {
          tensorboardExperiment_ = value;
        }
      } else {
        tensorboardExperimentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTensorboardExperiment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tensorboardExperiment_ = null;
      if (tensorboardExperimentBuilder_ != null) {
        tensorboardExperimentBuilder_.dispose();
        tensorboardExperimentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder getTensorboardExperimentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTensorboardExperimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder getTensorboardExperimentOrBuilder() {
      if (tensorboardExperimentBuilder_ != null) {
        return tensorboardExperimentBuilder_.getMessageOrBuilder();
      } else {
        return tensorboardExperiment_ == null ?
            com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
      }
    }
    /**
     * <pre>
     * Required. The TensorboardExperiment's `name` field is used to identify the
     * TensorboardExperiment to be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TensorboardExperiment, com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder, com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder> 
        getTensorboardExperimentFieldBuilder() {
      if (tensorboardExperimentBuilder_ == null) {
        tensorboardExperimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardExperiment, com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder, com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder>(
                getTensorboardExperiment(),
                getParentForChildren(),
                isClean());
        tensorboardExperiment_ = null;
      }
      return tensorboardExperimentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest)
  private static final com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest();
  }

  public static com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTensorboardExperimentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTensorboardExperimentRequest>() {
    @java.lang.Override
    public UpdateTensorboardExperimentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTensorboardExperimentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTensorboardExperimentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UpdateTensorboardExperimentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

