// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/arrow.proto

package com.google.cloud.bigquery.storage.v1;

/**
 * <pre>
 * Arrow schema as specified in
 * https://arrow.apache.org/docs/python/api/datatypes.html
 * and serialized to bytes using IPC:
 * https://arrow.apache.org/docs/format/Columnar.html#serialization-and-interprocess-communication-ipc
 * See code samples on how this message can be deserialized.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1.ArrowSchema}
 */
public final class ArrowSchema extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1.ArrowSchema)
    ArrowSchemaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArrowSchema.newBuilder() to construct.
  private ArrowSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArrowSchema() {
    serializedSchema_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArrowSchema();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.storage.v1.ArrowProto.internal_static_google_cloud_bigquery_storage_v1_ArrowSchema_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1.ArrowProto.internal_static_google_cloud_bigquery_storage_v1_ArrowSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1.ArrowSchema.class, com.google.cloud.bigquery.storage.v1.ArrowSchema.Builder.class);
  }

  public static final int SERIALIZED_SCHEMA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString serializedSchema_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * IPC serialized Arrow schema.
   * </pre>
   *
   * <code>bytes serialized_schema = 1;</code>
   * @return The serializedSchema.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSerializedSchema() {
    return serializedSchema_;
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
    if (!serializedSchema_.isEmpty()) {
      output.writeBytes(1, serializedSchema_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!serializedSchema_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, serializedSchema_);
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
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1.ArrowSchema)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1.ArrowSchema other = (com.google.cloud.bigquery.storage.v1.ArrowSchema) obj;

    if (!getSerializedSchema()
        .equals(other.getSerializedSchema())) return false;
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
    hash = (37 * hash) + SERIALIZED_SCHEMA_FIELD_NUMBER;
    hash = (53 * hash) + getSerializedSchema().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.storage.v1.ArrowSchema parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.storage.v1.ArrowSchema prototype) {
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
   * Arrow schema as specified in
   * https://arrow.apache.org/docs/python/api/datatypes.html
   * and serialized to bytes using IPC:
   * https://arrow.apache.org/docs/format/Columnar.html#serialization-and-interprocess-communication-ipc
   * See code samples on how this message can be deserialized.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1.ArrowSchema}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1.ArrowSchema)
      com.google.cloud.bigquery.storage.v1.ArrowSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.ArrowProto.internal_static_google_cloud_bigquery_storage_v1_ArrowSchema_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1.ArrowProto.internal_static_google_cloud_bigquery_storage_v1_ArrowSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1.ArrowSchema.class, com.google.cloud.bigquery.storage.v1.ArrowSchema.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.storage.v1.ArrowSchema.newBuilder()
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
      serializedSchema_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1.ArrowProto.internal_static_google_cloud_bigquery_storage_v1_ArrowSchema_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSchema getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1.ArrowSchema.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSchema build() {
      com.google.cloud.bigquery.storage.v1.ArrowSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSchema buildPartial() {
      com.google.cloud.bigquery.storage.v1.ArrowSchema result = new com.google.cloud.bigquery.storage.v1.ArrowSchema(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.storage.v1.ArrowSchema result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serializedSchema_ = serializedSchema_;
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
      if (other instanceof com.google.cloud.bigquery.storage.v1.ArrowSchema) {
        return mergeFrom((com.google.cloud.bigquery.storage.v1.ArrowSchema)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.storage.v1.ArrowSchema other) {
      if (other == com.google.cloud.bigquery.storage.v1.ArrowSchema.getDefaultInstance()) return this;
      if (other.getSerializedSchema() != com.google.protobuf.ByteString.EMPTY) {
        setSerializedSchema(other.getSerializedSchema());
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
              serializedSchema_ = input.readBytes();
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

    private com.google.protobuf.ByteString serializedSchema_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * IPC serialized Arrow schema.
     * </pre>
     *
     * <code>bytes serialized_schema = 1;</code>
     * @return The serializedSchema.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSerializedSchema() {
      return serializedSchema_;
    }
    /**
     * <pre>
     * IPC serialized Arrow schema.
     * </pre>
     *
     * <code>bytes serialized_schema = 1;</code>
     * @param value The serializedSchema to set.
     * @return This builder for chaining.
     */
    public Builder setSerializedSchema(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      serializedSchema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IPC serialized Arrow schema.
     * </pre>
     *
     * <code>bytes serialized_schema = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSerializedSchema() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serializedSchema_ = getDefaultInstance().getSerializedSchema();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1.ArrowSchema)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1.ArrowSchema)
  private static final com.google.cloud.bigquery.storage.v1.ArrowSchema DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1.ArrowSchema();
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArrowSchema>
      PARSER = new com.google.protobuf.AbstractParser<ArrowSchema>() {
    @java.lang.Override
    public ArrowSchema parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArrowSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArrowSchema> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.ArrowSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
