// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

/**
 * <pre>
 * Database instance import request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1beta4.InstancesImportRequest}
 */
public final class InstancesImportRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.InstancesImportRequest)
    InstancesImportRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstancesImportRequest.newBuilder() to construct.
  private InstancesImportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstancesImportRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstancesImportRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesImportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesImportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.InstancesImportRequest.class, com.google.cloud.sql.v1beta4.InstancesImportRequest.Builder.class);
  }

  public static final int IMPORT_CONTEXT_FIELD_NUMBER = 1;
  private com.google.cloud.sql.v1beta4.ImportContext importContext_;
  /**
   * <pre>
   * Contains details about the import operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
   * @return Whether the importContext field is set.
   */
  @java.lang.Override
  public boolean hasImportContext() {
    return importContext_ != null;
  }
  /**
   * <pre>
   * Contains details about the import operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
   * @return The importContext.
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.ImportContext getImportContext() {
    return importContext_ == null ? com.google.cloud.sql.v1beta4.ImportContext.getDefaultInstance() : importContext_;
  }
  /**
   * <pre>
   * Contains details about the import operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.ImportContextOrBuilder getImportContextOrBuilder() {
    return importContext_ == null ? com.google.cloud.sql.v1beta4.ImportContext.getDefaultInstance() : importContext_;
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
    if (importContext_ != null) {
      output.writeMessage(1, getImportContext());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (importContext_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getImportContext());
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.InstancesImportRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.InstancesImportRequest other = (com.google.cloud.sql.v1beta4.InstancesImportRequest) obj;

    if (hasImportContext() != other.hasImportContext()) return false;
    if (hasImportContext()) {
      if (!getImportContext()
          .equals(other.getImportContext())) return false;
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
    if (hasImportContext()) {
      hash = (37 * hash) + IMPORT_CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getImportContext().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.InstancesImportRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.InstancesImportRequest prototype) {
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
   * Database instance import request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1beta4.InstancesImportRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.InstancesImportRequest)
      com.google.cloud.sql.v1beta4.InstancesImportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesImportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesImportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.InstancesImportRequest.class, com.google.cloud.sql.v1beta4.InstancesImportRequest.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.InstancesImportRequest.newBuilder()
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
      importContext_ = null;
      if (importContextBuilder_ != null) {
        importContextBuilder_.dispose();
        importContextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesImportRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.InstancesImportRequest getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.InstancesImportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.InstancesImportRequest build() {
      com.google.cloud.sql.v1beta4.InstancesImportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.InstancesImportRequest buildPartial() {
      com.google.cloud.sql.v1beta4.InstancesImportRequest result = new com.google.cloud.sql.v1beta4.InstancesImportRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.InstancesImportRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.importContext_ = importContextBuilder_ == null
            ? importContext_
            : importContextBuilder_.build();
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
      if (other instanceof com.google.cloud.sql.v1beta4.InstancesImportRequest) {
        return mergeFrom((com.google.cloud.sql.v1beta4.InstancesImportRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.InstancesImportRequest other) {
      if (other == com.google.cloud.sql.v1beta4.InstancesImportRequest.getDefaultInstance()) return this;
      if (other.hasImportContext()) {
        mergeImportContext(other.getImportContext());
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
                  getImportContextFieldBuilder().getBuilder(),
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

    private com.google.cloud.sql.v1beta4.ImportContext importContext_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.ImportContext, com.google.cloud.sql.v1beta4.ImportContext.Builder, com.google.cloud.sql.v1beta4.ImportContextOrBuilder> importContextBuilder_;
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     * @return Whether the importContext field is set.
     */
    public boolean hasImportContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     * @return The importContext.
     */
    public com.google.cloud.sql.v1beta4.ImportContext getImportContext() {
      if (importContextBuilder_ == null) {
        return importContext_ == null ? com.google.cloud.sql.v1beta4.ImportContext.getDefaultInstance() : importContext_;
      } else {
        return importContextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    public Builder setImportContext(com.google.cloud.sql.v1beta4.ImportContext value) {
      if (importContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        importContext_ = value;
      } else {
        importContextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    public Builder setImportContext(
        com.google.cloud.sql.v1beta4.ImportContext.Builder builderForValue) {
      if (importContextBuilder_ == null) {
        importContext_ = builderForValue.build();
      } else {
        importContextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    public Builder mergeImportContext(com.google.cloud.sql.v1beta4.ImportContext value) {
      if (importContextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          importContext_ != null &&
          importContext_ != com.google.cloud.sql.v1beta4.ImportContext.getDefaultInstance()) {
          getImportContextBuilder().mergeFrom(value);
        } else {
          importContext_ = value;
        }
      } else {
        importContextBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    public Builder clearImportContext() {
      bitField0_ = (bitField0_ & ~0x00000001);
      importContext_ = null;
      if (importContextBuilder_ != null) {
        importContextBuilder_.dispose();
        importContextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    public com.google.cloud.sql.v1beta4.ImportContext.Builder getImportContextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getImportContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    public com.google.cloud.sql.v1beta4.ImportContextOrBuilder getImportContextOrBuilder() {
      if (importContextBuilder_ != null) {
        return importContextBuilder_.getMessageOrBuilder();
      } else {
        return importContext_ == null ?
            com.google.cloud.sql.v1beta4.ImportContext.getDefaultInstance() : importContext_;
      }
    }
    /**
     * <pre>
     * Contains details about the import operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.ImportContext import_context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.ImportContext, com.google.cloud.sql.v1beta4.ImportContext.Builder, com.google.cloud.sql.v1beta4.ImportContextOrBuilder> 
        getImportContextFieldBuilder() {
      if (importContextBuilder_ == null) {
        importContextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.sql.v1beta4.ImportContext, com.google.cloud.sql.v1beta4.ImportContext.Builder, com.google.cloud.sql.v1beta4.ImportContextOrBuilder>(
                getImportContext(),
                getParentForChildren(),
                isClean());
        importContext_ = null;
      }
      return importContextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.InstancesImportRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.InstancesImportRequest)
  private static final com.google.cloud.sql.v1beta4.InstancesImportRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.InstancesImportRequest();
  }

  public static com.google.cloud.sql.v1beta4.InstancesImportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesImportRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstancesImportRequest>() {
    @java.lang.Override
    public InstancesImportRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesImportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesImportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.InstancesImportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

