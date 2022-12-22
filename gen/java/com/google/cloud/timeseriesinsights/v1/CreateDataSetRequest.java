// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/timeseriesinsights/v1/timeseries_insights.proto

package com.google.cloud.timeseriesinsights.v1;

/**
 * <pre>
 * Create a DataSet request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.timeseriesinsights.v1.CreateDataSetRequest}
 */
public final class CreateDataSetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.timeseriesinsights.v1.CreateDataSetRequest)
    CreateDataSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDataSetRequest.newBuilder() to construct.
  private CreateDataSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDataSetRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDataSetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.timeseriesinsights.v1.TimeseriesInsightsProto.internal_static_google_cloud_timeseriesinsights_v1_CreateDataSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.timeseriesinsights.v1.TimeseriesInsightsProto.internal_static_google_cloud_timeseriesinsights_v1_CreateDataSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.class, com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Client project name which will own this DataSet in the format of
   * 'projects/{project}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Client project name which will own this DataSet in the format of
   * 'projects/{project}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASET_FIELD_NUMBER = 2;
  private com.google.cloud.timeseriesinsights.v1.DataSet dataset_;
  /**
   * <pre>
   * Required. Dataset to be loaded.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataset field is set.
   */
  @java.lang.Override
  public boolean hasDataset() {
    return dataset_ != null;
  }
  /**
   * <pre>
   * Required. Dataset to be loaded.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataset.
   */
  @java.lang.Override
  public com.google.cloud.timeseriesinsights.v1.DataSet getDataset() {
    return dataset_ == null ? com.google.cloud.timeseriesinsights.v1.DataSet.getDefaultInstance() : dataset_;
  }
  /**
   * <pre>
   * Required. Dataset to be loaded.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.timeseriesinsights.v1.DataSetOrBuilder getDatasetOrBuilder() {
    return dataset_ == null ? com.google.cloud.timeseriesinsights.v1.DataSet.getDefaultInstance() : dataset_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (dataset_ != null) {
      output.writeMessage(2, getDataset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (dataset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataset());
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
    if (!(obj instanceof com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest other = (com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasDataset() != other.hasDataset()) return false;
    if (hasDataset()) {
      if (!getDataset()
          .equals(other.getDataset())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDataset()) {
      hash = (37 * hash) + DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDataset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest prototype) {
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
   * Create a DataSet request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.timeseriesinsights.v1.CreateDataSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.timeseriesinsights.v1.CreateDataSetRequest)
      com.google.cloud.timeseriesinsights.v1.CreateDataSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.timeseriesinsights.v1.TimeseriesInsightsProto.internal_static_google_cloud_timeseriesinsights_v1_CreateDataSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.timeseriesinsights.v1.TimeseriesInsightsProto.internal_static_google_cloud_timeseriesinsights_v1_CreateDataSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.class, com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.newBuilder()
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
      parent_ = "";
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.timeseriesinsights.v1.TimeseriesInsightsProto.internal_static_google_cloud_timeseriesinsights_v1_CreateDataSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest getDefaultInstanceForType() {
      return com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest build() {
      com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest buildPartial() {
      com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest result = new com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataset_ = datasetBuilder_ == null
            ? dataset_
            : datasetBuilder_.build();
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
      if (other instanceof com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest) {
        return mergeFrom((com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest other) {
      if (other == com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDataset()) {
        mergeDataset(other.getDataset());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDatasetFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Client project name which will own this DataSet in the format of
     * 'projects/{project}'.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Client project name which will own this DataSet in the format of
     * 'projects/{project}'.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Client project name which will own this DataSet in the format of
     * 'projects/{project}'.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Client project name which will own this DataSet in the format of
     * 'projects/{project}'.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Client project name which will own this DataSet in the format of
     * 'projects/{project}'.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.timeseriesinsights.v1.DataSet dataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.timeseriesinsights.v1.DataSet, com.google.cloud.timeseriesinsights.v1.DataSet.Builder, com.google.cloud.timeseriesinsights.v1.DataSetOrBuilder> datasetBuilder_;
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the dataset field is set.
     */
    public boolean hasDataset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dataset.
     */
    public com.google.cloud.timeseriesinsights.v1.DataSet getDataset() {
      if (datasetBuilder_ == null) {
        return dataset_ == null ? com.google.cloud.timeseriesinsights.v1.DataSet.getDefaultInstance() : dataset_;
      } else {
        return datasetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDataset(com.google.cloud.timeseriesinsights.v1.DataSet value) {
      if (datasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataset_ = value;
      } else {
        datasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDataset(
        com.google.cloud.timeseriesinsights.v1.DataSet.Builder builderForValue) {
      if (datasetBuilder_ == null) {
        dataset_ = builderForValue.build();
      } else {
        datasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDataset(com.google.cloud.timeseriesinsights.v1.DataSet value) {
      if (datasetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dataset_ != null &&
          dataset_ != com.google.cloud.timeseriesinsights.v1.DataSet.getDefaultInstance()) {
          getDatasetBuilder().mergeFrom(value);
        } else {
          dataset_ = value;
        }
      } else {
        datasetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDataset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.timeseriesinsights.v1.DataSet.Builder getDatasetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDatasetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.timeseriesinsights.v1.DataSetOrBuilder getDatasetOrBuilder() {
      if (datasetBuilder_ != null) {
        return datasetBuilder_.getMessageOrBuilder();
      } else {
        return dataset_ == null ?
            com.google.cloud.timeseriesinsights.v1.DataSet.getDefaultInstance() : dataset_;
      }
    }
    /**
     * <pre>
     * Required. Dataset to be loaded.
     * </pre>
     *
     * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.timeseriesinsights.v1.DataSet, com.google.cloud.timeseriesinsights.v1.DataSet.Builder, com.google.cloud.timeseriesinsights.v1.DataSetOrBuilder> 
        getDatasetFieldBuilder() {
      if (datasetBuilder_ == null) {
        datasetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.timeseriesinsights.v1.DataSet, com.google.cloud.timeseriesinsights.v1.DataSet.Builder, com.google.cloud.timeseriesinsights.v1.DataSetOrBuilder>(
                getDataset(),
                getParentForChildren(),
                isClean());
        dataset_ = null;
      }
      return datasetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.timeseriesinsights.v1.CreateDataSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.timeseriesinsights.v1.CreateDataSetRequest)
  private static final com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest();
  }

  public static com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDataSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDataSetRequest>() {
    @java.lang.Override
    public CreateDataSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDataSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDataSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.timeseriesinsights.v1.CreateDataSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
