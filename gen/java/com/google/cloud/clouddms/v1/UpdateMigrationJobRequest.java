// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

/**
 * <pre>
 * Request message for 'UpdateMigrationJob' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.UpdateMigrationJobRequest}
 */
public final class UpdateMigrationJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.UpdateMigrationJobRequest)
    UpdateMigrationJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateMigrationJobRequest.newBuilder() to construct.
  private UpdateMigrationJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateMigrationJobRequest() {
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateMigrationJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_UpdateMigrationJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_UpdateMigrationJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.class, com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * migration job resource by the update.
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
   * migration job resource by the update.
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
   * migration job resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int MIGRATION_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.clouddms.v1.MigrationJob migrationJob_;
  /**
   * <pre>
   * Required. The migration job parameters to update.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the migrationJob field is set.
   */
  @java.lang.Override
  public boolean hasMigrationJob() {
    return migrationJob_ != null;
  }
  /**
   * <pre>
   * Required. The migration job parameters to update.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The migrationJob.
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.MigrationJob getMigrationJob() {
    return migrationJob_ == null ? com.google.cloud.clouddms.v1.MigrationJob.getDefaultInstance() : migrationJob_;
  }
  /**
   * <pre>
   * Required. The migration job parameters to update.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.MigrationJobOrBuilder getMigrationJobOrBuilder() {
    return migrationJob_ == null ? com.google.cloud.clouddms.v1.MigrationJob.getDefaultInstance() : migrationJob_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   * <pre>
   * A unique id used to identify the request. If the server receives two
   * requests with the same id, then the second request will be ignored.
   * It is recommended to always set this value to a UUID.
   * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A unique id used to identify the request. If the server receives two
   * requests with the same id, then the second request will be ignored.
   * It is recommended to always set this value to a UUID.
   * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (migrationJob_ != null) {
      output.writeMessage(2, getMigrationJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, requestId_);
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
    if (migrationJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMigrationJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, requestId_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.UpdateMigrationJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.UpdateMigrationJobRequest other = (com.google.cloud.clouddms.v1.UpdateMigrationJobRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasMigrationJob() != other.hasMigrationJob()) return false;
    if (hasMigrationJob()) {
      if (!getMigrationJob()
          .equals(other.getMigrationJob())) return false;
    }
    if (!getRequestId()
        .equals(other.getRequestId())) return false;
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
    if (hasMigrationJob()) {
      hash = (37 * hash) + MIGRATION_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getMigrationJob().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.clouddms.v1.UpdateMigrationJobRequest prototype) {
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
   * Request message for 'UpdateMigrationJob' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.UpdateMigrationJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.UpdateMigrationJobRequest)
      com.google.cloud.clouddms.v1.UpdateMigrationJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_UpdateMigrationJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_UpdateMigrationJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.class, com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.newBuilder()
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
      migrationJob_ = null;
      if (migrationJobBuilder_ != null) {
        migrationJobBuilder_.dispose();
        migrationJobBuilder_ = null;
      }
      requestId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_UpdateMigrationJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.UpdateMigrationJobRequest getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.UpdateMigrationJobRequest build() {
      com.google.cloud.clouddms.v1.UpdateMigrationJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.UpdateMigrationJobRequest buildPartial() {
      com.google.cloud.clouddms.v1.UpdateMigrationJobRequest result = new com.google.cloud.clouddms.v1.UpdateMigrationJobRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.UpdateMigrationJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.migrationJob_ = migrationJobBuilder_ == null
            ? migrationJob_
            : migrationJobBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.requestId_ = requestId_;
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
      if (other instanceof com.google.cloud.clouddms.v1.UpdateMigrationJobRequest) {
        return mergeFrom((com.google.cloud.clouddms.v1.UpdateMigrationJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.UpdateMigrationJobRequest other) {
      if (other == com.google.cloud.clouddms.v1.UpdateMigrationJobRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasMigrationJob()) {
        mergeMigrationJob(other.getMigrationJob());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                  getMigrationJobFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              requestId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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
     * migration job resource by the update.
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

    private com.google.cloud.clouddms.v1.MigrationJob migrationJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.clouddms.v1.MigrationJob, com.google.cloud.clouddms.v1.MigrationJob.Builder, com.google.cloud.clouddms.v1.MigrationJobOrBuilder> migrationJobBuilder_;
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the migrationJob field is set.
     */
    public boolean hasMigrationJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The migrationJob.
     */
    public com.google.cloud.clouddms.v1.MigrationJob getMigrationJob() {
      if (migrationJobBuilder_ == null) {
        return migrationJob_ == null ? com.google.cloud.clouddms.v1.MigrationJob.getDefaultInstance() : migrationJob_;
      } else {
        return migrationJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMigrationJob(com.google.cloud.clouddms.v1.MigrationJob value) {
      if (migrationJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        migrationJob_ = value;
      } else {
        migrationJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMigrationJob(
        com.google.cloud.clouddms.v1.MigrationJob.Builder builderForValue) {
      if (migrationJobBuilder_ == null) {
        migrationJob_ = builderForValue.build();
      } else {
        migrationJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeMigrationJob(com.google.cloud.clouddms.v1.MigrationJob value) {
      if (migrationJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          migrationJob_ != null &&
          migrationJob_ != com.google.cloud.clouddms.v1.MigrationJob.getDefaultInstance()) {
          getMigrationJobBuilder().mergeFrom(value);
        } else {
          migrationJob_ = value;
        }
      } else {
        migrationJobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMigrationJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      migrationJob_ = null;
      if (migrationJobBuilder_ != null) {
        migrationJobBuilder_.dispose();
        migrationJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.clouddms.v1.MigrationJob.Builder getMigrationJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMigrationJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.clouddms.v1.MigrationJobOrBuilder getMigrationJobOrBuilder() {
      if (migrationJobBuilder_ != null) {
        return migrationJobBuilder_.getMessageOrBuilder();
      } else {
        return migrationJob_ == null ?
            com.google.cloud.clouddms.v1.MigrationJob.getDefaultInstance() : migrationJob_;
      }
    }
    /**
     * <pre>
     * Required. The migration job parameters to update.
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.clouddms.v1.MigrationJob, com.google.cloud.clouddms.v1.MigrationJob.Builder, com.google.cloud.clouddms.v1.MigrationJobOrBuilder> 
        getMigrationJobFieldBuilder() {
      if (migrationJobBuilder_ == null) {
        migrationJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.clouddms.v1.MigrationJob, com.google.cloud.clouddms.v1.MigrationJob.Builder, com.google.cloud.clouddms.v1.MigrationJobOrBuilder>(
                getMigrationJob(),
                getParentForChildren(),
                isClean());
        migrationJob_ = null;
      }
      return migrationJobBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     * <pre>
     * A unique id used to identify the request. If the server receives two
     * requests with the same id, then the second request will be ignored.
     * It is recommended to always set this value to a UUID.
     * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
     * (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A unique id used to identify the request. If the server receives two
     * requests with the same id, then the second request will be ignored.
     * It is recommended to always set this value to a UUID.
     * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
     * (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A unique id used to identify the request. If the server receives two
     * requests with the same id, then the second request will be ignored.
     * It is recommended to always set this value to a UUID.
     * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
     * (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      requestId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique id used to identify the request. If the server receives two
     * requests with the same id, then the second request will be ignored.
     * It is recommended to always set this value to a UUID.
     * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
     * (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique id used to identify the request. If the server receives two
     * requests with the same id, then the second request will be ignored.
     * It is recommended to always set this value to a UUID.
     * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
     * (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.UpdateMigrationJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.UpdateMigrationJobRequest)
  private static final com.google.cloud.clouddms.v1.UpdateMigrationJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.UpdateMigrationJobRequest();
  }

  public static com.google.cloud.clouddms.v1.UpdateMigrationJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMigrationJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMigrationJobRequest>() {
    @java.lang.Override
    public UpdateMigrationJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateMigrationJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMigrationJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.UpdateMigrationJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

