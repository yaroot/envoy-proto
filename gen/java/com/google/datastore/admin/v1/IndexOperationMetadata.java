// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

/**
 * <pre>
 * Metadata for Index operations.
 * </pre>
 *
 * Protobuf type {@code google.datastore.admin.v1.IndexOperationMetadata}
 */
public final class IndexOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.admin.v1.IndexOperationMetadata)
    IndexOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IndexOperationMetadata.newBuilder() to construct.
  private IndexOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IndexOperationMetadata() {
    indexId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IndexOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_IndexOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_IndexOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.admin.v1.IndexOperationMetadata.class, com.google.datastore.admin.v1.IndexOperationMetadata.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  private com.google.datastore.admin.v1.CommonMetadata common_;
  /**
   * <pre>
   * Metadata common to all Datastore Admin operations.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return common_ != null;
  }
  /**
   * <pre>
   * Metadata common to all Datastore Admin operations.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public com.google.datastore.admin.v1.CommonMetadata getCommon() {
    return common_ == null ? com.google.datastore.admin.v1.CommonMetadata.getDefaultInstance() : common_;
  }
  /**
   * <pre>
   * Metadata common to all Datastore Admin operations.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
   */
  @java.lang.Override
  public com.google.datastore.admin.v1.CommonMetadataOrBuilder getCommonOrBuilder() {
    return common_ == null ? com.google.datastore.admin.v1.CommonMetadata.getDefaultInstance() : common_;
  }

  public static final int PROGRESS_ENTITIES_FIELD_NUMBER = 2;
  private com.google.datastore.admin.v1.Progress progressEntities_;
  /**
   * <pre>
   * An estimate of the number of entities processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
   * @return Whether the progressEntities field is set.
   */
  @java.lang.Override
  public boolean hasProgressEntities() {
    return progressEntities_ != null;
  }
  /**
   * <pre>
   * An estimate of the number of entities processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
   * @return The progressEntities.
   */
  @java.lang.Override
  public com.google.datastore.admin.v1.Progress getProgressEntities() {
    return progressEntities_ == null ? com.google.datastore.admin.v1.Progress.getDefaultInstance() : progressEntities_;
  }
  /**
   * <pre>
   * An estimate of the number of entities processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
   */
  @java.lang.Override
  public com.google.datastore.admin.v1.ProgressOrBuilder getProgressEntitiesOrBuilder() {
    return progressEntities_ == null ? com.google.datastore.admin.v1.Progress.getDefaultInstance() : progressEntities_;
  }

  public static final int INDEX_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object indexId_ = "";
  /**
   * <pre>
   * The index resource ID that this operation is acting on.
   * </pre>
   *
   * <code>string index_id = 3;</code>
   * @return The indexId.
   */
  @java.lang.Override
  public java.lang.String getIndexId() {
    java.lang.Object ref = indexId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      indexId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The index resource ID that this operation is acting on.
   * </pre>
   *
   * <code>string index_id = 3;</code>
   * @return The bytes for indexId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIndexIdBytes() {
    java.lang.Object ref = indexId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      indexId_ = b;
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
    if (common_ != null) {
      output.writeMessage(1, getCommon());
    }
    if (progressEntities_ != null) {
      output.writeMessage(2, getProgressEntities());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, indexId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (common_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    if (progressEntities_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProgressEntities());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, indexId_);
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
    if (!(obj instanceof com.google.datastore.admin.v1.IndexOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.datastore.admin.v1.IndexOperationMetadata other = (com.google.datastore.admin.v1.IndexOperationMetadata) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (hasProgressEntities() != other.hasProgressEntities()) return false;
    if (hasProgressEntities()) {
      if (!getProgressEntities()
          .equals(other.getProgressEntities())) return false;
    }
    if (!getIndexId()
        .equals(other.getIndexId())) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (hasProgressEntities()) {
      hash = (37 * hash) + PROGRESS_ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getProgressEntities().hashCode();
    }
    hash = (37 * hash) + INDEX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIndexId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.admin.v1.IndexOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.datastore.admin.v1.IndexOperationMetadata prototype) {
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
   * Metadata for Index operations.
   * </pre>
   *
   * Protobuf type {@code google.datastore.admin.v1.IndexOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.admin.v1.IndexOperationMetadata)
      com.google.datastore.admin.v1.IndexOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_IndexOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_IndexOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.admin.v1.IndexOperationMetadata.class, com.google.datastore.admin.v1.IndexOperationMetadata.Builder.class);
    }

    // Construct using com.google.datastore.admin.v1.IndexOperationMetadata.newBuilder()
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
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      progressEntities_ = null;
      if (progressEntitiesBuilder_ != null) {
        progressEntitiesBuilder_.dispose();
        progressEntitiesBuilder_ = null;
      }
      indexId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_IndexOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.IndexOperationMetadata getDefaultInstanceForType() {
      return com.google.datastore.admin.v1.IndexOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.IndexOperationMetadata build() {
      com.google.datastore.admin.v1.IndexOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.IndexOperationMetadata buildPartial() {
      com.google.datastore.admin.v1.IndexOperationMetadata result = new com.google.datastore.admin.v1.IndexOperationMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.datastore.admin.v1.IndexOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null
            ? common_
            : commonBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.progressEntities_ = progressEntitiesBuilder_ == null
            ? progressEntities_
            : progressEntitiesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.indexId_ = indexId_;
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
      if (other instanceof com.google.datastore.admin.v1.IndexOperationMetadata) {
        return mergeFrom((com.google.datastore.admin.v1.IndexOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.admin.v1.IndexOperationMetadata other) {
      if (other == com.google.datastore.admin.v1.IndexOperationMetadata.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (other.hasProgressEntities()) {
        mergeProgressEntities(other.getProgressEntities());
      }
      if (!other.getIndexId().isEmpty()) {
        indexId_ = other.indexId_;
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
                  getCommonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getProgressEntitiesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              indexId_ = input.readStringRequireUtf8();
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

    private com.google.datastore.admin.v1.CommonMetadata common_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.admin.v1.CommonMetadata, com.google.datastore.admin.v1.CommonMetadata.Builder, com.google.datastore.admin.v1.CommonMetadataOrBuilder> commonBuilder_;
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     * @return The common.
     */
    public com.google.datastore.admin.v1.CommonMetadata getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? com.google.datastore.admin.v1.CommonMetadata.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    public Builder setCommon(com.google.datastore.admin.v1.CommonMetadata value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    public Builder setCommon(
        com.google.datastore.admin.v1.CommonMetadata.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    public Builder mergeCommon(com.google.datastore.admin.v1.CommonMetadata value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          common_ != null &&
          common_ != com.google.datastore.admin.v1.CommonMetadata.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    public com.google.datastore.admin.v1.CommonMetadata.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    public com.google.datastore.admin.v1.CommonMetadataOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            com.google.datastore.admin.v1.CommonMetadata.getDefaultInstance() : common_;
      }
    }
    /**
     * <pre>
     * Metadata common to all Datastore Admin operations.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.admin.v1.CommonMetadata, com.google.datastore.admin.v1.CommonMetadata.Builder, com.google.datastore.admin.v1.CommonMetadataOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.admin.v1.CommonMetadata, com.google.datastore.admin.v1.CommonMetadata.Builder, com.google.datastore.admin.v1.CommonMetadataOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private com.google.datastore.admin.v1.Progress progressEntities_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.admin.v1.Progress, com.google.datastore.admin.v1.Progress.Builder, com.google.datastore.admin.v1.ProgressOrBuilder> progressEntitiesBuilder_;
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     * @return Whether the progressEntities field is set.
     */
    public boolean hasProgressEntities() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     * @return The progressEntities.
     */
    public com.google.datastore.admin.v1.Progress getProgressEntities() {
      if (progressEntitiesBuilder_ == null) {
        return progressEntities_ == null ? com.google.datastore.admin.v1.Progress.getDefaultInstance() : progressEntities_;
      } else {
        return progressEntitiesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    public Builder setProgressEntities(com.google.datastore.admin.v1.Progress value) {
      if (progressEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        progressEntities_ = value;
      } else {
        progressEntitiesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    public Builder setProgressEntities(
        com.google.datastore.admin.v1.Progress.Builder builderForValue) {
      if (progressEntitiesBuilder_ == null) {
        progressEntities_ = builderForValue.build();
      } else {
        progressEntitiesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    public Builder mergeProgressEntities(com.google.datastore.admin.v1.Progress value) {
      if (progressEntitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          progressEntities_ != null &&
          progressEntities_ != com.google.datastore.admin.v1.Progress.getDefaultInstance()) {
          getProgressEntitiesBuilder().mergeFrom(value);
        } else {
          progressEntities_ = value;
        }
      } else {
        progressEntitiesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    public Builder clearProgressEntities() {
      bitField0_ = (bitField0_ & ~0x00000002);
      progressEntities_ = null;
      if (progressEntitiesBuilder_ != null) {
        progressEntitiesBuilder_.dispose();
        progressEntitiesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    public com.google.datastore.admin.v1.Progress.Builder getProgressEntitiesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProgressEntitiesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    public com.google.datastore.admin.v1.ProgressOrBuilder getProgressEntitiesOrBuilder() {
      if (progressEntitiesBuilder_ != null) {
        return progressEntitiesBuilder_.getMessageOrBuilder();
      } else {
        return progressEntities_ == null ?
            com.google.datastore.admin.v1.Progress.getDefaultInstance() : progressEntities_;
      }
    }
    /**
     * <pre>
     * An estimate of the number of entities processed.
     * </pre>
     *
     * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.admin.v1.Progress, com.google.datastore.admin.v1.Progress.Builder, com.google.datastore.admin.v1.ProgressOrBuilder> 
        getProgressEntitiesFieldBuilder() {
      if (progressEntitiesBuilder_ == null) {
        progressEntitiesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.admin.v1.Progress, com.google.datastore.admin.v1.Progress.Builder, com.google.datastore.admin.v1.ProgressOrBuilder>(
                getProgressEntities(),
                getParentForChildren(),
                isClean());
        progressEntities_ = null;
      }
      return progressEntitiesBuilder_;
    }

    private java.lang.Object indexId_ = "";
    /**
     * <pre>
     * The index resource ID that this operation is acting on.
     * </pre>
     *
     * <code>string index_id = 3;</code>
     * @return The indexId.
     */
    public java.lang.String getIndexId() {
      java.lang.Object ref = indexId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        indexId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The index resource ID that this operation is acting on.
     * </pre>
     *
     * <code>string index_id = 3;</code>
     * @return The bytes for indexId.
     */
    public com.google.protobuf.ByteString
        getIndexIdBytes() {
      java.lang.Object ref = indexId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        indexId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The index resource ID that this operation is acting on.
     * </pre>
     *
     * <code>string index_id = 3;</code>
     * @param value The indexId to set.
     * @return This builder for chaining.
     */
    public Builder setIndexId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      indexId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index resource ID that this operation is acting on.
     * </pre>
     *
     * <code>string index_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndexId() {
      indexId_ = getDefaultInstance().getIndexId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index resource ID that this operation is acting on.
     * </pre>
     *
     * <code>string index_id = 3;</code>
     * @param value The bytes for indexId to set.
     * @return This builder for chaining.
     */
    public Builder setIndexIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      indexId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.datastore.admin.v1.IndexOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.admin.v1.IndexOperationMetadata)
  private static final com.google.datastore.admin.v1.IndexOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.admin.v1.IndexOperationMetadata();
  }

  public static com.google.datastore.admin.v1.IndexOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IndexOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<IndexOperationMetadata>() {
    @java.lang.Override
    public IndexOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<IndexOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IndexOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.admin.v1.IndexOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

