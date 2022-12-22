// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/logging/autoscaler_log.proto

package com.google.cloud.dataproc.logging;

/**
 * <pre>
 * The short version of cluster configuration for Cloud logging.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.logging.ClusterSize}
 */
public final class ClusterSize extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.logging.ClusterSize)
    ClusterSizeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClusterSize.newBuilder() to construct.
  private ClusterSize(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterSize() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClusterSize();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.logging.AutoscalerLogOuterClass.internal_static_google_cloud_dataproc_logging_ClusterSize_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.logging.AutoscalerLogOuterClass.internal_static_google_cloud_dataproc_logging_ClusterSize_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.logging.ClusterSize.class, com.google.cloud.dataproc.logging.ClusterSize.Builder.class);
  }

  public static final int PRIMARY_WORKER_COUNT_FIELD_NUMBER = 1;
  private int primaryWorkerCount_ = 0;
  /**
   * <pre>
   * The number of primary workers in the cluster.
   * </pre>
   *
   * <code>int32 primary_worker_count = 1;</code>
   * @return The primaryWorkerCount.
   */
  @java.lang.Override
  public int getPrimaryWorkerCount() {
    return primaryWorkerCount_;
  }

  public static final int SECONDARY_WORKER_COUNT_FIELD_NUMBER = 2;
  private int secondaryWorkerCount_ = 0;
  /**
   * <pre>
   * The number of secondary workers in the cluster.
   * </pre>
   *
   * <code>int32 secondary_worker_count = 2;</code>
   * @return The secondaryWorkerCount.
   */
  @java.lang.Override
  public int getSecondaryWorkerCount() {
    return secondaryWorkerCount_;
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
    if (primaryWorkerCount_ != 0) {
      output.writeInt32(1, primaryWorkerCount_);
    }
    if (secondaryWorkerCount_ != 0) {
      output.writeInt32(2, secondaryWorkerCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primaryWorkerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, primaryWorkerCount_);
    }
    if (secondaryWorkerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondaryWorkerCount_);
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
    if (!(obj instanceof com.google.cloud.dataproc.logging.ClusterSize)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.logging.ClusterSize other = (com.google.cloud.dataproc.logging.ClusterSize) obj;

    if (getPrimaryWorkerCount()
        != other.getPrimaryWorkerCount()) return false;
    if (getSecondaryWorkerCount()
        != other.getSecondaryWorkerCount()) return false;
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
    hash = (37 * hash) + PRIMARY_WORKER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryWorkerCount();
    hash = (37 * hash) + SECONDARY_WORKER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSecondaryWorkerCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.logging.ClusterSize parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.logging.ClusterSize prototype) {
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
   * The short version of cluster configuration for Cloud logging.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.logging.ClusterSize}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.logging.ClusterSize)
      com.google.cloud.dataproc.logging.ClusterSizeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.logging.AutoscalerLogOuterClass.internal_static_google_cloud_dataproc_logging_ClusterSize_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.logging.AutoscalerLogOuterClass.internal_static_google_cloud_dataproc_logging_ClusterSize_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.logging.ClusterSize.class, com.google.cloud.dataproc.logging.ClusterSize.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.logging.ClusterSize.newBuilder()
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
      primaryWorkerCount_ = 0;
      secondaryWorkerCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.logging.AutoscalerLogOuterClass.internal_static_google_cloud_dataproc_logging_ClusterSize_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.logging.ClusterSize getDefaultInstanceForType() {
      return com.google.cloud.dataproc.logging.ClusterSize.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.logging.ClusterSize build() {
      com.google.cloud.dataproc.logging.ClusterSize result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.logging.ClusterSize buildPartial() {
      com.google.cloud.dataproc.logging.ClusterSize result = new com.google.cloud.dataproc.logging.ClusterSize(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.logging.ClusterSize result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.primaryWorkerCount_ = primaryWorkerCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secondaryWorkerCount_ = secondaryWorkerCount_;
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
      if (other instanceof com.google.cloud.dataproc.logging.ClusterSize) {
        return mergeFrom((com.google.cloud.dataproc.logging.ClusterSize)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.logging.ClusterSize other) {
      if (other == com.google.cloud.dataproc.logging.ClusterSize.getDefaultInstance()) return this;
      if (other.getPrimaryWorkerCount() != 0) {
        setPrimaryWorkerCount(other.getPrimaryWorkerCount());
      }
      if (other.getSecondaryWorkerCount() != 0) {
        setSecondaryWorkerCount(other.getSecondaryWorkerCount());
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
              primaryWorkerCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              secondaryWorkerCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int primaryWorkerCount_ ;
    /**
     * <pre>
     * The number of primary workers in the cluster.
     * </pre>
     *
     * <code>int32 primary_worker_count = 1;</code>
     * @return The primaryWorkerCount.
     */
    @java.lang.Override
    public int getPrimaryWorkerCount() {
      return primaryWorkerCount_;
    }
    /**
     * <pre>
     * The number of primary workers in the cluster.
     * </pre>
     *
     * <code>int32 primary_worker_count = 1;</code>
     * @param value The primaryWorkerCount to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryWorkerCount(int value) {
      
      primaryWorkerCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of primary workers in the cluster.
     * </pre>
     *
     * <code>int32 primary_worker_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryWorkerCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      primaryWorkerCount_ = 0;
      onChanged();
      return this;
    }

    private int secondaryWorkerCount_ ;
    /**
     * <pre>
     * The number of secondary workers in the cluster.
     * </pre>
     *
     * <code>int32 secondary_worker_count = 2;</code>
     * @return The secondaryWorkerCount.
     */
    @java.lang.Override
    public int getSecondaryWorkerCount() {
      return secondaryWorkerCount_;
    }
    /**
     * <pre>
     * The number of secondary workers in the cluster.
     * </pre>
     *
     * <code>int32 secondary_worker_count = 2;</code>
     * @param value The secondaryWorkerCount to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryWorkerCount(int value) {
      
      secondaryWorkerCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of secondary workers in the cluster.
     * </pre>
     *
     * <code>int32 secondary_worker_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondaryWorkerCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      secondaryWorkerCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.logging.ClusterSize)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.logging.ClusterSize)
  private static final com.google.cloud.dataproc.logging.ClusterSize DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.logging.ClusterSize();
  }

  public static com.google.cloud.dataproc.logging.ClusterSize getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterSize>
      PARSER = new com.google.protobuf.AbstractParser<ClusterSize>() {
    @java.lang.Override
    public ClusterSize parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClusterSize> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterSize> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.logging.ClusterSize getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

