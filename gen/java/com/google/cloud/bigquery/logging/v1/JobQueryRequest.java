// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

/**
 * <pre>
 * Job query request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.logging.v1.JobQueryRequest}
 */
public final class JobQueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.logging.v1.JobQueryRequest)
    JobQueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobQueryRequest.newBuilder() to construct.
  private JobQueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobQueryRequest() {
    query_ = "";
    projectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobQueryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobQueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobQueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.logging.v1.JobQueryRequest.class, com.google.cloud.bigquery.logging.v1.JobQueryRequest.Builder.class);
  }

  public static final int QUERY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object query_ = "";
  /**
   * <pre>
   * The query.
   * </pre>
   *
   * <code>string query = 1;</code>
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The query.
   * </pre>
   *
   * <code>string query = 1;</code>
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_RESULTS_FIELD_NUMBER = 2;
  private int maxResults_ = 0;
  /**
   * <pre>
   * The maximum number of results.
   * </pre>
   *
   * <code>uint32 max_results = 2;</code>
   * @return The maxResults.
   */
  @java.lang.Override
  public int getMaxResults() {
    return maxResults_;
  }

  public static final int DEFAULT_DATASET_FIELD_NUMBER = 3;
  private com.google.cloud.bigquery.logging.v1.DatasetName defaultDataset_;
  /**
   * <pre>
   * The default dataset for tables that do not have a dataset specified.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
   * @return Whether the defaultDataset field is set.
   */
  @java.lang.Override
  public boolean hasDefaultDataset() {
    return defaultDataset_ != null;
  }
  /**
   * <pre>
   * The default dataset for tables that do not have a dataset specified.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
   * @return The defaultDataset.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.logging.v1.DatasetName getDefaultDataset() {
    return defaultDataset_ == null ? com.google.cloud.bigquery.logging.v1.DatasetName.getDefaultInstance() : defaultDataset_;
  }
  /**
   * <pre>
   * The default dataset for tables that do not have a dataset specified.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.logging.v1.DatasetNameOrBuilder getDefaultDatasetOrBuilder() {
    return defaultDataset_ == null ? com.google.cloud.bigquery.logging.v1.DatasetName.getDefaultInstance() : defaultDataset_;
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   * <pre>
   * Project that the query should be charged to.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project that the query should be charged to.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DRY_RUN_FIELD_NUMBER = 5;
  private boolean dryRun_ = false;
  /**
   * <pre>
   * If true, don't actually run the job. Just check that it would run.
   * </pre>
   *
   * <code>bool dry_run = 5;</code>
   * @return The dryRun.
   */
  @java.lang.Override
  public boolean getDryRun() {
    return dryRun_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
    }
    if (maxResults_ != 0) {
      output.writeUInt32(2, maxResults_);
    }
    if (defaultDataset_ != null) {
      output.writeMessage(3, getDefaultDataset());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, projectId_);
    }
    if (dryRun_ != false) {
      output.writeBool(5, dryRun_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
    }
    if (maxResults_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, maxResults_);
    }
    if (defaultDataset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDefaultDataset());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, projectId_);
    }
    if (dryRun_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, dryRun_);
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
    if (!(obj instanceof com.google.cloud.bigquery.logging.v1.JobQueryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.logging.v1.JobQueryRequest other = (com.google.cloud.bigquery.logging.v1.JobQueryRequest) obj;

    if (!getQuery()
        .equals(other.getQuery())) return false;
    if (getMaxResults()
        != other.getMaxResults()) return false;
    if (hasDefaultDataset() != other.hasDefaultDataset()) return false;
    if (hasDefaultDataset()) {
      if (!getDefaultDataset()
          .equals(other.getDefaultDataset())) return false;
    }
    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (getDryRun()
        != other.getDryRun()) return false;
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
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + MAX_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxResults();
    if (hasDefaultDataset()) {
      hash = (37 * hash) + DEFAULT_DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultDataset().hashCode();
    }
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + DRY_RUN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDryRun());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.logging.v1.JobQueryRequest prototype) {
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
   * Job query request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.logging.v1.JobQueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.logging.v1.JobQueryRequest)
      com.google.cloud.bigquery.logging.v1.JobQueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobQueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobQueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.logging.v1.JobQueryRequest.class, com.google.cloud.bigquery.logging.v1.JobQueryRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.logging.v1.JobQueryRequest.newBuilder()
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
      query_ = "";
      maxResults_ = 0;
      defaultDataset_ = null;
      if (defaultDatasetBuilder_ != null) {
        defaultDatasetBuilder_.dispose();
        defaultDatasetBuilder_ = null;
      }
      projectId_ = "";
      dryRun_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobQueryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.logging.v1.JobQueryRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.logging.v1.JobQueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.logging.v1.JobQueryRequest build() {
      com.google.cloud.bigquery.logging.v1.JobQueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.logging.v1.JobQueryRequest buildPartial() {
      com.google.cloud.bigquery.logging.v1.JobQueryRequest result = new com.google.cloud.bigquery.logging.v1.JobQueryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.logging.v1.JobQueryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.query_ = query_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxResults_ = maxResults_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultDataset_ = defaultDatasetBuilder_ == null
            ? defaultDataset_
            : defaultDatasetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.dryRun_ = dryRun_;
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
      if (other instanceof com.google.cloud.bigquery.logging.v1.JobQueryRequest) {
        return mergeFrom((com.google.cloud.bigquery.logging.v1.JobQueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.logging.v1.JobQueryRequest other) {
      if (other == com.google.cloud.bigquery.logging.v1.JobQueryRequest.getDefaultInstance()) return this;
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMaxResults() != 0) {
        setMaxResults(other.getMaxResults());
      }
      if (other.hasDefaultDataset()) {
        mergeDefaultDataset(other.getDefaultDataset());
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getDryRun() != false) {
        setDryRun(other.getDryRun());
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
              query_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              maxResults_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getDefaultDatasetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              projectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              dryRun_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object query_ = "";
    /**
     * <pre>
     * The query.
     * </pre>
     *
     * <code>string query = 1;</code>
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The query.
     * </pre>
     *
     * <code>string query = 1;</code>
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The query.
     * </pre>
     *
     * <code>string query = 1;</code>
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      query_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The query.
     * </pre>
     *
     * <code>string query = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      query_ = getDefaultInstance().getQuery();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The query.
     * </pre>
     *
     * <code>string query = 1;</code>
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      query_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int maxResults_ ;
    /**
     * <pre>
     * The maximum number of results.
     * </pre>
     *
     * <code>uint32 max_results = 2;</code>
     * @return The maxResults.
     */
    @java.lang.Override
    public int getMaxResults() {
      return maxResults_;
    }
    /**
     * <pre>
     * The maximum number of results.
     * </pre>
     *
     * <code>uint32 max_results = 2;</code>
     * @param value The maxResults to set.
     * @return This builder for chaining.
     */
    public Builder setMaxResults(int value) {
      
      maxResults_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of results.
     * </pre>
     *
     * <code>uint32 max_results = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxResults() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxResults_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.logging.v1.DatasetName defaultDataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.DatasetName, com.google.cloud.bigquery.logging.v1.DatasetName.Builder, com.google.cloud.bigquery.logging.v1.DatasetNameOrBuilder> defaultDatasetBuilder_;
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     * @return Whether the defaultDataset field is set.
     */
    public boolean hasDefaultDataset() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     * @return The defaultDataset.
     */
    public com.google.cloud.bigquery.logging.v1.DatasetName getDefaultDataset() {
      if (defaultDatasetBuilder_ == null) {
        return defaultDataset_ == null ? com.google.cloud.bigquery.logging.v1.DatasetName.getDefaultInstance() : defaultDataset_;
      } else {
        return defaultDatasetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    public Builder setDefaultDataset(com.google.cloud.bigquery.logging.v1.DatasetName value) {
      if (defaultDatasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultDataset_ = value;
      } else {
        defaultDatasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    public Builder setDefaultDataset(
        com.google.cloud.bigquery.logging.v1.DatasetName.Builder builderForValue) {
      if (defaultDatasetBuilder_ == null) {
        defaultDataset_ = builderForValue.build();
      } else {
        defaultDatasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    public Builder mergeDefaultDataset(com.google.cloud.bigquery.logging.v1.DatasetName value) {
      if (defaultDatasetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          defaultDataset_ != null &&
          defaultDataset_ != com.google.cloud.bigquery.logging.v1.DatasetName.getDefaultInstance()) {
          getDefaultDatasetBuilder().mergeFrom(value);
        } else {
          defaultDataset_ = value;
        }
      } else {
        defaultDatasetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    public Builder clearDefaultDataset() {
      bitField0_ = (bitField0_ & ~0x00000004);
      defaultDataset_ = null;
      if (defaultDatasetBuilder_ != null) {
        defaultDatasetBuilder_.dispose();
        defaultDatasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    public com.google.cloud.bigquery.logging.v1.DatasetName.Builder getDefaultDatasetBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDefaultDatasetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    public com.google.cloud.bigquery.logging.v1.DatasetNameOrBuilder getDefaultDatasetOrBuilder() {
      if (defaultDatasetBuilder_ != null) {
        return defaultDatasetBuilder_.getMessageOrBuilder();
      } else {
        return defaultDataset_ == null ?
            com.google.cloud.bigquery.logging.v1.DatasetName.getDefaultInstance() : defaultDataset_;
      }
    }
    /**
     * <pre>
     * The default dataset for tables that do not have a dataset specified.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.DatasetName default_dataset = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.DatasetName, com.google.cloud.bigquery.logging.v1.DatasetName.Builder, com.google.cloud.bigquery.logging.v1.DatasetNameOrBuilder> 
        getDefaultDatasetFieldBuilder() {
      if (defaultDatasetBuilder_ == null) {
        defaultDatasetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.logging.v1.DatasetName, com.google.cloud.bigquery.logging.v1.DatasetName.Builder, com.google.cloud.bigquery.logging.v1.DatasetNameOrBuilder>(
                getDefaultDataset(),
                getParentForChildren(),
                isClean());
        defaultDataset_ = null;
      }
      return defaultDatasetBuilder_;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * Project that the query should be charged to.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project that the query should be charged to.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project that the query should be charged to.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project that the query should be charged to.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project that the query should be charged to.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean dryRun_ ;
    /**
     * <pre>
     * If true, don't actually run the job. Just check that it would run.
     * </pre>
     *
     * <code>bool dry_run = 5;</code>
     * @return The dryRun.
     */
    @java.lang.Override
    public boolean getDryRun() {
      return dryRun_;
    }
    /**
     * <pre>
     * If true, don't actually run the job. Just check that it would run.
     * </pre>
     *
     * <code>bool dry_run = 5;</code>
     * @param value The dryRun to set.
     * @return This builder for chaining.
     */
    public Builder setDryRun(boolean value) {
      
      dryRun_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, don't actually run the job. Just check that it would run.
     * </pre>
     *
     * <code>bool dry_run = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDryRun() {
      bitField0_ = (bitField0_ & ~0x00000010);
      dryRun_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.logging.v1.JobQueryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.logging.v1.JobQueryRequest)
  private static final com.google.cloud.bigquery.logging.v1.JobQueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.logging.v1.JobQueryRequest();
  }

  public static com.google.cloud.bigquery.logging.v1.JobQueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobQueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<JobQueryRequest>() {
    @java.lang.Override
    public JobQueryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<JobQueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobQueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.logging.v1.JobQueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
