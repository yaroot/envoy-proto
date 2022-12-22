// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/batch_job_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * An individual batch job result.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.BatchJobResult}
 */
public final class BatchJobResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.BatchJobResult)
    BatchJobResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchJobResult.newBuilder() to construct.
  private BatchJobResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchJobResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchJobResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_BatchJobResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_BatchJobResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.BatchJobResult.class, com.google.ads.googleads.v11.services.BatchJobResult.Builder.class);
  }

  public static final int OPERATION_INDEX_FIELD_NUMBER = 1;
  private long operationIndex_ = 0L;
  /**
   * <pre>
   * Index of the mutate operation.
   * </pre>
   *
   * <code>int64 operation_index = 1;</code>
   * @return The operationIndex.
   */
  @java.lang.Override
  public long getOperationIndex() {
    return operationIndex_;
  }

  public static final int MUTATE_OPERATION_RESPONSE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v11.services.MutateOperationResponse mutateOperationResponse_;
  /**
   * <pre>
   * Response for the mutate.
   * May be empty if errors occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
   * @return Whether the mutateOperationResponse field is set.
   */
  @java.lang.Override
  public boolean hasMutateOperationResponse() {
    return mutateOperationResponse_ != null;
  }
  /**
   * <pre>
   * Response for the mutate.
   * May be empty if errors occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
   * @return The mutateOperationResponse.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateOperationResponse getMutateOperationResponse() {
    return mutateOperationResponse_ == null ? com.google.ads.googleads.v11.services.MutateOperationResponse.getDefaultInstance() : mutateOperationResponse_;
  }
  /**
   * <pre>
   * Response for the mutate.
   * May be empty if errors occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateOperationResponseOrBuilder getMutateOperationResponseOrBuilder() {
    return mutateOperationResponse_ == null ? com.google.ads.googleads.v11.services.MutateOperationResponse.getDefaultInstance() : mutateOperationResponse_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private com.google.rpc.Status status_;
  /**
   * <pre>
   * Details of the errors when processing the operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * Details of the errors when processing the operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Details of the errors when processing the operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
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
    if (operationIndex_ != 0L) {
      output.writeInt64(1, operationIndex_);
    }
    if (mutateOperationResponse_ != null) {
      output.writeMessage(2, getMutateOperationResponse());
    }
    if (status_ != null) {
      output.writeMessage(3, getStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, operationIndex_);
    }
    if (mutateOperationResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMutateOperationResponse());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatus());
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.BatchJobResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.BatchJobResult other = (com.google.ads.googleads.v11.services.BatchJobResult) obj;

    if (getOperationIndex()
        != other.getOperationIndex()) return false;
    if (hasMutateOperationResponse() != other.hasMutateOperationResponse()) return false;
    if (hasMutateOperationResponse()) {
      if (!getMutateOperationResponse()
          .equals(other.getMutateOperationResponse())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    hash = (37 * hash) + OPERATION_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOperationIndex());
    if (hasMutateOperationResponse()) {
      hash = (37 * hash) + MUTATE_OPERATION_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getMutateOperationResponse().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.BatchJobResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.BatchJobResult prototype) {
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
   * An individual batch job result.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.BatchJobResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.BatchJobResult)
      com.google.ads.googleads.v11.services.BatchJobResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_BatchJobResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_BatchJobResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.BatchJobResult.class, com.google.ads.googleads.v11.services.BatchJobResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.BatchJobResult.newBuilder()
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
      operationIndex_ = 0L;
      mutateOperationResponse_ = null;
      if (mutateOperationResponseBuilder_ != null) {
        mutateOperationResponseBuilder_.dispose();
        mutateOperationResponseBuilder_ = null;
      }
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_BatchJobResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.BatchJobResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.BatchJobResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.BatchJobResult build() {
      com.google.ads.googleads.v11.services.BatchJobResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.BatchJobResult buildPartial() {
      com.google.ads.googleads.v11.services.BatchJobResult result = new com.google.ads.googleads.v11.services.BatchJobResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.services.BatchJobResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operationIndex_ = operationIndex_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mutateOperationResponse_ = mutateOperationResponseBuilder_ == null
            ? mutateOperationResponse_
            : mutateOperationResponseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.services.BatchJobResult) {
        return mergeFrom((com.google.ads.googleads.v11.services.BatchJobResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.BatchJobResult other) {
      if (other == com.google.ads.googleads.v11.services.BatchJobResult.getDefaultInstance()) return this;
      if (other.getOperationIndex() != 0L) {
        setOperationIndex(other.getOperationIndex());
      }
      if (other.hasMutateOperationResponse()) {
        mergeMutateOperationResponse(other.getMutateOperationResponse());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
              operationIndex_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMutateOperationResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private long operationIndex_ ;
    /**
     * <pre>
     * Index of the mutate operation.
     * </pre>
     *
     * <code>int64 operation_index = 1;</code>
     * @return The operationIndex.
     */
    @java.lang.Override
    public long getOperationIndex() {
      return operationIndex_;
    }
    /**
     * <pre>
     * Index of the mutate operation.
     * </pre>
     *
     * <code>int64 operation_index = 1;</code>
     * @param value The operationIndex to set.
     * @return This builder for chaining.
     */
    public Builder setOperationIndex(long value) {
      
      operationIndex_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Index of the mutate operation.
     * </pre>
     *
     * <code>int64 operation_index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperationIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operationIndex_ = 0L;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.services.MutateOperationResponse mutateOperationResponse_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.MutateOperationResponse, com.google.ads.googleads.v11.services.MutateOperationResponse.Builder, com.google.ads.googleads.v11.services.MutateOperationResponseOrBuilder> mutateOperationResponseBuilder_;
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     * @return Whether the mutateOperationResponse field is set.
     */
    public boolean hasMutateOperationResponse() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     * @return The mutateOperationResponse.
     */
    public com.google.ads.googleads.v11.services.MutateOperationResponse getMutateOperationResponse() {
      if (mutateOperationResponseBuilder_ == null) {
        return mutateOperationResponse_ == null ? com.google.ads.googleads.v11.services.MutateOperationResponse.getDefaultInstance() : mutateOperationResponse_;
      } else {
        return mutateOperationResponseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    public Builder setMutateOperationResponse(com.google.ads.googleads.v11.services.MutateOperationResponse value) {
      if (mutateOperationResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mutateOperationResponse_ = value;
      } else {
        mutateOperationResponseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    public Builder setMutateOperationResponse(
        com.google.ads.googleads.v11.services.MutateOperationResponse.Builder builderForValue) {
      if (mutateOperationResponseBuilder_ == null) {
        mutateOperationResponse_ = builderForValue.build();
      } else {
        mutateOperationResponseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    public Builder mergeMutateOperationResponse(com.google.ads.googleads.v11.services.MutateOperationResponse value) {
      if (mutateOperationResponseBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          mutateOperationResponse_ != null &&
          mutateOperationResponse_ != com.google.ads.googleads.v11.services.MutateOperationResponse.getDefaultInstance()) {
          getMutateOperationResponseBuilder().mergeFrom(value);
        } else {
          mutateOperationResponse_ = value;
        }
      } else {
        mutateOperationResponseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    public Builder clearMutateOperationResponse() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mutateOperationResponse_ = null;
      if (mutateOperationResponseBuilder_ != null) {
        mutateOperationResponseBuilder_.dispose();
        mutateOperationResponseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    public com.google.ads.googleads.v11.services.MutateOperationResponse.Builder getMutateOperationResponseBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMutateOperationResponseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    public com.google.ads.googleads.v11.services.MutateOperationResponseOrBuilder getMutateOperationResponseOrBuilder() {
      if (mutateOperationResponseBuilder_ != null) {
        return mutateOperationResponseBuilder_.getMessageOrBuilder();
      } else {
        return mutateOperationResponse_ == null ?
            com.google.ads.googleads.v11.services.MutateOperationResponse.getDefaultInstance() : mutateOperationResponse_;
      }
    }
    /**
     * <pre>
     * Response for the mutate.
     * May be empty if errors occurred.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateOperationResponse mutate_operation_response = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.MutateOperationResponse, com.google.ads.googleads.v11.services.MutateOperationResponse.Builder, com.google.ads.googleads.v11.services.MutateOperationResponseOrBuilder> 
        getMutateOperationResponseFieldBuilder() {
      if (mutateOperationResponseBuilder_ == null) {
        mutateOperationResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.services.MutateOperationResponse, com.google.ads.googleads.v11.services.MutateOperationResponse.Builder, com.google.ads.googleads.v11.services.MutateOperationResponseOrBuilder>(
                getMutateOperationResponse(),
                getParentForChildren(),
                isClean());
        mutateOperationResponse_ = null;
      }
      return mutateOperationResponseBuilder_;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    public Builder setStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          status_ != null &&
          status_ != com.google.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * Details of the errors when processing the operation.
     * </pre>
     *
     * <code>.google.rpc.Status status = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.BatchJobResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.BatchJobResult)
  private static final com.google.ads.googleads.v11.services.BatchJobResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.BatchJobResult();
  }

  public static com.google.ads.googleads.v11.services.BatchJobResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchJobResult>
      PARSER = new com.google.protobuf.AbstractParser<BatchJobResult>() {
    @java.lang.Override
    public BatchJobResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchJobResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchJobResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.BatchJobResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

