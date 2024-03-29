// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

/**
 * <pre>
 * Binary log coordinates.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1beta4.BinLogCoordinates}
 */
public final class BinLogCoordinates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.BinLogCoordinates)
    BinLogCoordinatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BinLogCoordinates.newBuilder() to construct.
  private BinLogCoordinates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BinLogCoordinates() {
    binLogFileName_ = "";
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BinLogCoordinates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_BinLogCoordinates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_BinLogCoordinates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.BinLogCoordinates.class, com.google.cloud.sql.v1beta4.BinLogCoordinates.Builder.class);
  }

  public static final int BIN_LOG_FILE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object binLogFileName_ = "";
  /**
   * <pre>
   * Name of the binary log file for a Cloud SQL instance.
   * </pre>
   *
   * <code>string bin_log_file_name = 1;</code>
   * @return The binLogFileName.
   */
  @java.lang.Override
  public java.lang.String getBinLogFileName() {
    java.lang.Object ref = binLogFileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      binLogFileName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the binary log file for a Cloud SQL instance.
   * </pre>
   *
   * <code>string bin_log_file_name = 1;</code>
   * @return The bytes for binLogFileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBinLogFileNameBytes() {
    java.lang.Object ref = binLogFileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      binLogFileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIN_LOG_POSITION_FIELD_NUMBER = 2;
  private long binLogPosition_ = 0L;
  /**
   * <pre>
   * Position (offset) within the binary log file.
   * </pre>
   *
   * <code>int64 bin_log_position = 2;</code>
   * @return The binLogPosition.
   */
  @java.lang.Override
  public long getBinLogPosition() {
    return binLogPosition_;
  }

  public static final int KIND_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * This is always `sql#binLogCoordinates`.
   * </pre>
   *
   * <code>string kind = 3;</code>
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is always `sql#binLogCoordinates`.
   * </pre>
   *
   * <code>string kind = 3;</code>
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(binLogFileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, binLogFileName_);
    }
    if (binLogPosition_ != 0L) {
      output.writeInt64(2, binLogPosition_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(binLogFileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, binLogFileName_);
    }
    if (binLogPosition_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, binLogPosition_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kind_);
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.BinLogCoordinates)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.BinLogCoordinates other = (com.google.cloud.sql.v1beta4.BinLogCoordinates) obj;

    if (!getBinLogFileName()
        .equals(other.getBinLogFileName())) return false;
    if (getBinLogPosition()
        != other.getBinLogPosition()) return false;
    if (!getKind()
        .equals(other.getKind())) return false;
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
    hash = (37 * hash) + BIN_LOG_FILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBinLogFileName().hashCode();
    hash = (37 * hash) + BIN_LOG_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBinLogPosition());
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.BinLogCoordinates parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.BinLogCoordinates prototype) {
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
   * Binary log coordinates.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1beta4.BinLogCoordinates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.BinLogCoordinates)
      com.google.cloud.sql.v1beta4.BinLogCoordinatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_BinLogCoordinates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_BinLogCoordinates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.BinLogCoordinates.class, com.google.cloud.sql.v1beta4.BinLogCoordinates.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.BinLogCoordinates.newBuilder()
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
      binLogFileName_ = "";
      binLogPosition_ = 0L;
      kind_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_BinLogCoordinates_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.BinLogCoordinates getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.BinLogCoordinates.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.BinLogCoordinates build() {
      com.google.cloud.sql.v1beta4.BinLogCoordinates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.BinLogCoordinates buildPartial() {
      com.google.cloud.sql.v1beta4.BinLogCoordinates result = new com.google.cloud.sql.v1beta4.BinLogCoordinates(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.BinLogCoordinates result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.binLogFileName_ = binLogFileName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.binLogPosition_ = binLogPosition_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.kind_ = kind_;
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
      if (other instanceof com.google.cloud.sql.v1beta4.BinLogCoordinates) {
        return mergeFrom((com.google.cloud.sql.v1beta4.BinLogCoordinates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.BinLogCoordinates other) {
      if (other == com.google.cloud.sql.v1beta4.BinLogCoordinates.getDefaultInstance()) return this;
      if (!other.getBinLogFileName().isEmpty()) {
        binLogFileName_ = other.binLogFileName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getBinLogPosition() != 0L) {
        setBinLogPosition(other.getBinLogPosition());
      }
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
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
              binLogFileName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              binLogPosition_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              kind_ = input.readStringRequireUtf8();
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

    private java.lang.Object binLogFileName_ = "";
    /**
     * <pre>
     * Name of the binary log file for a Cloud SQL instance.
     * </pre>
     *
     * <code>string bin_log_file_name = 1;</code>
     * @return The binLogFileName.
     */
    public java.lang.String getBinLogFileName() {
      java.lang.Object ref = binLogFileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        binLogFileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the binary log file for a Cloud SQL instance.
     * </pre>
     *
     * <code>string bin_log_file_name = 1;</code>
     * @return The bytes for binLogFileName.
     */
    public com.google.protobuf.ByteString
        getBinLogFileNameBytes() {
      java.lang.Object ref = binLogFileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        binLogFileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the binary log file for a Cloud SQL instance.
     * </pre>
     *
     * <code>string bin_log_file_name = 1;</code>
     * @param value The binLogFileName to set.
     * @return This builder for chaining.
     */
    public Builder setBinLogFileName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      binLogFileName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the binary log file for a Cloud SQL instance.
     * </pre>
     *
     * <code>string bin_log_file_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBinLogFileName() {
      binLogFileName_ = getDefaultInstance().getBinLogFileName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the binary log file for a Cloud SQL instance.
     * </pre>
     *
     * <code>string bin_log_file_name = 1;</code>
     * @param value The bytes for binLogFileName to set.
     * @return This builder for chaining.
     */
    public Builder setBinLogFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      binLogFileName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long binLogPosition_ ;
    /**
     * <pre>
     * Position (offset) within the binary log file.
     * </pre>
     *
     * <code>int64 bin_log_position = 2;</code>
     * @return The binLogPosition.
     */
    @java.lang.Override
    public long getBinLogPosition() {
      return binLogPosition_;
    }
    /**
     * <pre>
     * Position (offset) within the binary log file.
     * </pre>
     *
     * <code>int64 bin_log_position = 2;</code>
     * @param value The binLogPosition to set.
     * @return This builder for chaining.
     */
    public Builder setBinLogPosition(long value) {
      
      binLogPosition_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Position (offset) within the binary log file.
     * </pre>
     *
     * <code>int64 bin_log_position = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBinLogPosition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      binLogPosition_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * This is always `sql#binLogCoordinates`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is always `sql#binLogCoordinates`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is always `sql#binLogCoordinates`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      kind_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always `sql#binLogCoordinates`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always `sql#binLogCoordinates`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      kind_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.BinLogCoordinates)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.BinLogCoordinates)
  private static final com.google.cloud.sql.v1beta4.BinLogCoordinates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.BinLogCoordinates();
  }

  public static com.google.cloud.sql.v1beta4.BinLogCoordinates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinLogCoordinates>
      PARSER = new com.google.protobuf.AbstractParser<BinLogCoordinates>() {
    @java.lang.Override
    public BinLogCoordinates parsePartialFrom(
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

  public static com.google.protobuf.Parser<BinLogCoordinates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinLogCoordinates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.BinLogCoordinates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

