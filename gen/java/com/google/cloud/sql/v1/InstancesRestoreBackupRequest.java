// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_instances.proto

package com.google.cloud.sql.v1;

/**
 * <pre>
 * Database instance restore backup request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1.InstancesRestoreBackupRequest}
 */
public final class InstancesRestoreBackupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1.InstancesRestoreBackupRequest)
    InstancesRestoreBackupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstancesRestoreBackupRequest.newBuilder() to construct.
  private InstancesRestoreBackupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstancesRestoreBackupRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstancesRestoreBackupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1.CloudSqlServiceProto.internal_static_google_cloud_sql_v1_InstancesRestoreBackupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1.CloudSqlServiceProto.internal_static_google_cloud_sql_v1_InstancesRestoreBackupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1.InstancesRestoreBackupRequest.class, com.google.cloud.sql.v1.InstancesRestoreBackupRequest.Builder.class);
  }

  public static final int RESTORE_BACKUP_CONTEXT_FIELD_NUMBER = 1;
  private com.google.cloud.sql.v1.RestoreBackupContext restoreBackupContext_;
  /**
   * <pre>
   * Parameters required to perform the restore backup operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
   * @return Whether the restoreBackupContext field is set.
   */
  @java.lang.Override
  public boolean hasRestoreBackupContext() {
    return restoreBackupContext_ != null;
  }
  /**
   * <pre>
   * Parameters required to perform the restore backup operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
   * @return The restoreBackupContext.
   */
  @java.lang.Override
  public com.google.cloud.sql.v1.RestoreBackupContext getRestoreBackupContext() {
    return restoreBackupContext_ == null ? com.google.cloud.sql.v1.RestoreBackupContext.getDefaultInstance() : restoreBackupContext_;
  }
  /**
   * <pre>
   * Parameters required to perform the restore backup operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1.RestoreBackupContextOrBuilder getRestoreBackupContextOrBuilder() {
    return restoreBackupContext_ == null ? com.google.cloud.sql.v1.RestoreBackupContext.getDefaultInstance() : restoreBackupContext_;
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
    if (restoreBackupContext_ != null) {
      output.writeMessage(1, getRestoreBackupContext());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (restoreBackupContext_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRestoreBackupContext());
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
    if (!(obj instanceof com.google.cloud.sql.v1.InstancesRestoreBackupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1.InstancesRestoreBackupRequest other = (com.google.cloud.sql.v1.InstancesRestoreBackupRequest) obj;

    if (hasRestoreBackupContext() != other.hasRestoreBackupContext()) return false;
    if (hasRestoreBackupContext()) {
      if (!getRestoreBackupContext()
          .equals(other.getRestoreBackupContext())) return false;
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
    if (hasRestoreBackupContext()) {
      hash = (37 * hash) + RESTORE_BACKUP_CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getRestoreBackupContext().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1.InstancesRestoreBackupRequest prototype) {
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
   * Database instance restore backup request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1.InstancesRestoreBackupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1.InstancesRestoreBackupRequest)
      com.google.cloud.sql.v1.InstancesRestoreBackupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1.CloudSqlServiceProto.internal_static_google_cloud_sql_v1_InstancesRestoreBackupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1.CloudSqlServiceProto.internal_static_google_cloud_sql_v1_InstancesRestoreBackupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1.InstancesRestoreBackupRequest.class, com.google.cloud.sql.v1.InstancesRestoreBackupRequest.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1.InstancesRestoreBackupRequest.newBuilder()
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
      restoreBackupContext_ = null;
      if (restoreBackupContextBuilder_ != null) {
        restoreBackupContextBuilder_.dispose();
        restoreBackupContextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1.CloudSqlServiceProto.internal_static_google_cloud_sql_v1_InstancesRestoreBackupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.InstancesRestoreBackupRequest getDefaultInstanceForType() {
      return com.google.cloud.sql.v1.InstancesRestoreBackupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.InstancesRestoreBackupRequest build() {
      com.google.cloud.sql.v1.InstancesRestoreBackupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.InstancesRestoreBackupRequest buildPartial() {
      com.google.cloud.sql.v1.InstancesRestoreBackupRequest result = new com.google.cloud.sql.v1.InstancesRestoreBackupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1.InstancesRestoreBackupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.restoreBackupContext_ = restoreBackupContextBuilder_ == null
            ? restoreBackupContext_
            : restoreBackupContextBuilder_.build();
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
      if (other instanceof com.google.cloud.sql.v1.InstancesRestoreBackupRequest) {
        return mergeFrom((com.google.cloud.sql.v1.InstancesRestoreBackupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1.InstancesRestoreBackupRequest other) {
      if (other == com.google.cloud.sql.v1.InstancesRestoreBackupRequest.getDefaultInstance()) return this;
      if (other.hasRestoreBackupContext()) {
        mergeRestoreBackupContext(other.getRestoreBackupContext());
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
                  getRestoreBackupContextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.sql.v1.RestoreBackupContext restoreBackupContext_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1.RestoreBackupContext, com.google.cloud.sql.v1.RestoreBackupContext.Builder, com.google.cloud.sql.v1.RestoreBackupContextOrBuilder> restoreBackupContextBuilder_;
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     * @return Whether the restoreBackupContext field is set.
     */
    public boolean hasRestoreBackupContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     * @return The restoreBackupContext.
     */
    public com.google.cloud.sql.v1.RestoreBackupContext getRestoreBackupContext() {
      if (restoreBackupContextBuilder_ == null) {
        return restoreBackupContext_ == null ? com.google.cloud.sql.v1.RestoreBackupContext.getDefaultInstance() : restoreBackupContext_;
      } else {
        return restoreBackupContextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    public Builder setRestoreBackupContext(com.google.cloud.sql.v1.RestoreBackupContext value) {
      if (restoreBackupContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        restoreBackupContext_ = value;
      } else {
        restoreBackupContextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    public Builder setRestoreBackupContext(
        com.google.cloud.sql.v1.RestoreBackupContext.Builder builderForValue) {
      if (restoreBackupContextBuilder_ == null) {
        restoreBackupContext_ = builderForValue.build();
      } else {
        restoreBackupContextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    public Builder mergeRestoreBackupContext(com.google.cloud.sql.v1.RestoreBackupContext value) {
      if (restoreBackupContextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          restoreBackupContext_ != null &&
          restoreBackupContext_ != com.google.cloud.sql.v1.RestoreBackupContext.getDefaultInstance()) {
          getRestoreBackupContextBuilder().mergeFrom(value);
        } else {
          restoreBackupContext_ = value;
        }
      } else {
        restoreBackupContextBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    public Builder clearRestoreBackupContext() {
      bitField0_ = (bitField0_ & ~0x00000001);
      restoreBackupContext_ = null;
      if (restoreBackupContextBuilder_ != null) {
        restoreBackupContextBuilder_.dispose();
        restoreBackupContextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    public com.google.cloud.sql.v1.RestoreBackupContext.Builder getRestoreBackupContextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRestoreBackupContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    public com.google.cloud.sql.v1.RestoreBackupContextOrBuilder getRestoreBackupContextOrBuilder() {
      if (restoreBackupContextBuilder_ != null) {
        return restoreBackupContextBuilder_.getMessageOrBuilder();
      } else {
        return restoreBackupContext_ == null ?
            com.google.cloud.sql.v1.RestoreBackupContext.getDefaultInstance() : restoreBackupContext_;
      }
    }
    /**
     * <pre>
     * Parameters required to perform the restore backup operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.RestoreBackupContext restore_backup_context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1.RestoreBackupContext, com.google.cloud.sql.v1.RestoreBackupContext.Builder, com.google.cloud.sql.v1.RestoreBackupContextOrBuilder> 
        getRestoreBackupContextFieldBuilder() {
      if (restoreBackupContextBuilder_ == null) {
        restoreBackupContextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.sql.v1.RestoreBackupContext, com.google.cloud.sql.v1.RestoreBackupContext.Builder, com.google.cloud.sql.v1.RestoreBackupContextOrBuilder>(
                getRestoreBackupContext(),
                getParentForChildren(),
                isClean());
        restoreBackupContext_ = null;
      }
      return restoreBackupContextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1.InstancesRestoreBackupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1.InstancesRestoreBackupRequest)
  private static final com.google.cloud.sql.v1.InstancesRestoreBackupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1.InstancesRestoreBackupRequest();
  }

  public static com.google.cloud.sql.v1.InstancesRestoreBackupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesRestoreBackupRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstancesRestoreBackupRequest>() {
    @java.lang.Override
    public InstancesRestoreBackupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesRestoreBackupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesRestoreBackupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1.InstancesRestoreBackupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
