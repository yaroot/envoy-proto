// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/bundle/bundle.proto

package com.google.firestore.bundle;

/**
 * <pre>
 * Metadata describing the bundle file/stream.
 * </pre>
 *
 * Protobuf type {@code google.firestore.bundle.BundleMetadata}
 */
public final class BundleMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firestore.bundle.BundleMetadata)
    BundleMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BundleMetadata.newBuilder() to construct.
  private BundleMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BundleMetadata() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BundleMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firestore.bundle.BundleProto.internal_static_google_firestore_bundle_BundleMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.bundle.BundleProto.internal_static_google_firestore_bundle_BundleMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.bundle.BundleMetadata.class, com.google.firestore.bundle.BundleMetadata.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * The ID of the bundle.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the bundle.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Time at which the documents snapshot is taken for this bundle.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Time at which the documents snapshot is taken for this bundle.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Time at which the documents snapshot is taken for this bundle.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private int version_ = 0;
  /**
   * <pre>
   * The schema version of the bundle.
   * </pre>
   *
   * <code>uint32 version = 3;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int TOTAL_DOCUMENTS_FIELD_NUMBER = 4;
  private int totalDocuments_ = 0;
  /**
   * <pre>
   * The number of documents in the bundle.
   * </pre>
   *
   * <code>uint32 total_documents = 4;</code>
   * @return The totalDocuments.
   */
  @java.lang.Override
  public int getTotalDocuments() {
    return totalDocuments_;
  }

  public static final int TOTAL_BYTES_FIELD_NUMBER = 5;
  private long totalBytes_ = 0L;
  /**
   * <pre>
   * The size of the bundle in bytes, excluding this `BundleMetadata`.
   * </pre>
   *
   * <code>uint64 total_bytes = 5;</code>
   * @return The totalBytes.
   */
  @java.lang.Override
  public long getTotalBytes() {
    return totalBytes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (createTime_ != null) {
      output.writeMessage(2, getCreateTime());
    }
    if (version_ != 0) {
      output.writeUInt32(3, version_);
    }
    if (totalDocuments_ != 0) {
      output.writeUInt32(4, totalDocuments_);
    }
    if (totalBytes_ != 0L) {
      output.writeUInt64(5, totalBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreateTime());
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, version_);
    }
    if (totalDocuments_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, totalDocuments_);
    }
    if (totalBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, totalBytes_);
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
    if (!(obj instanceof com.google.firestore.bundle.BundleMetadata)) {
      return super.equals(obj);
    }
    com.google.firestore.bundle.BundleMetadata other = (com.google.firestore.bundle.BundleMetadata) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (getVersion()
        != other.getVersion()) return false;
    if (getTotalDocuments()
        != other.getTotalDocuments()) return false;
    if (getTotalBytes()
        != other.getTotalBytes()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + TOTAL_DOCUMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalDocuments();
    hash = (37 * hash) + TOTAL_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalBytes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.bundle.BundleMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.firestore.bundle.BundleMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.bundle.BundleMetadata parseFrom(
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
  public static Builder newBuilder(com.google.firestore.bundle.BundleMetadata prototype) {
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
   * Metadata describing the bundle file/stream.
   * </pre>
   *
   * Protobuf type {@code google.firestore.bundle.BundleMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firestore.bundle.BundleMetadata)
      com.google.firestore.bundle.BundleMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firestore.bundle.BundleProto.internal_static_google_firestore_bundle_BundleMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.bundle.BundleProto.internal_static_google_firestore_bundle_BundleMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.bundle.BundleMetadata.class, com.google.firestore.bundle.BundleMetadata.Builder.class);
    }

    // Construct using com.google.firestore.bundle.BundleMetadata.newBuilder()
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
      id_ = "";
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      version_ = 0;
      totalDocuments_ = 0;
      totalBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firestore.bundle.BundleProto.internal_static_google_firestore_bundle_BundleMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.bundle.BundleMetadata getDefaultInstanceForType() {
      return com.google.firestore.bundle.BundleMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.bundle.BundleMetadata build() {
      com.google.firestore.bundle.BundleMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.bundle.BundleMetadata buildPartial() {
      com.google.firestore.bundle.BundleMetadata result = new com.google.firestore.bundle.BundleMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firestore.bundle.BundleMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.totalDocuments_ = totalDocuments_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.totalBytes_ = totalBytes_;
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
      if (other instanceof com.google.firestore.bundle.BundleMetadata) {
        return mergeFrom((com.google.firestore.bundle.BundleMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.bundle.BundleMetadata other) {
      if (other == com.google.firestore.bundle.BundleMetadata.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getTotalDocuments() != 0) {
        setTotalDocuments(other.getTotalDocuments());
      }
      if (other.getTotalBytes() != 0L) {
        setTotalBytes(other.getTotalBytes());
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              version_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              totalDocuments_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              totalBytes_ = input.readUInt64();
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The ID of the bundle.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the bundle.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the bundle.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the bundle.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the bundle.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
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
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
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
     * Time at which the documents snapshot is taken for this bundle.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
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

    private int version_ ;
    /**
     * <pre>
     * The schema version of the bundle.
     * </pre>
     *
     * <code>uint32 version = 3;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * The schema version of the bundle.
     * </pre>
     *
     * <code>uint32 version = 3;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The schema version of the bundle.
     * </pre>
     *
     * <code>uint32 version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = 0;
      onChanged();
      return this;
    }

    private int totalDocuments_ ;
    /**
     * <pre>
     * The number of documents in the bundle.
     * </pre>
     *
     * <code>uint32 total_documents = 4;</code>
     * @return The totalDocuments.
     */
    @java.lang.Override
    public int getTotalDocuments() {
      return totalDocuments_;
    }
    /**
     * <pre>
     * The number of documents in the bundle.
     * </pre>
     *
     * <code>uint32 total_documents = 4;</code>
     * @param value The totalDocuments to set.
     * @return This builder for chaining.
     */
    public Builder setTotalDocuments(int value) {
      
      totalDocuments_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of documents in the bundle.
     * </pre>
     *
     * <code>uint32 total_documents = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalDocuments() {
      bitField0_ = (bitField0_ & ~0x00000008);
      totalDocuments_ = 0;
      onChanged();
      return this;
    }

    private long totalBytes_ ;
    /**
     * <pre>
     * The size of the bundle in bytes, excluding this `BundleMetadata`.
     * </pre>
     *
     * <code>uint64 total_bytes = 5;</code>
     * @return The totalBytes.
     */
    @java.lang.Override
    public long getTotalBytes() {
      return totalBytes_;
    }
    /**
     * <pre>
     * The size of the bundle in bytes, excluding this `BundleMetadata`.
     * </pre>
     *
     * <code>uint64 total_bytes = 5;</code>
     * @param value The totalBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTotalBytes(long value) {
      
      totalBytes_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The size of the bundle in bytes, excluding this `BundleMetadata`.
     * </pre>
     *
     * <code>uint64 total_bytes = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalBytes() {
      bitField0_ = (bitField0_ & ~0x00000010);
      totalBytes_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.firestore.bundle.BundleMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.bundle.BundleMetadata)
  private static final com.google.firestore.bundle.BundleMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firestore.bundle.BundleMetadata();
  }

  public static com.google.firestore.bundle.BundleMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BundleMetadata>
      PARSER = new com.google.protobuf.AbstractParser<BundleMetadata>() {
    @java.lang.Override
    public BundleMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<BundleMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BundleMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.bundle.BundleMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
