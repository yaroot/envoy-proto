// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * <pre>
 * The read group set import response.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1.ImportReadGroupSetsResponse}
 */
public final class ImportReadGroupSetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.ImportReadGroupSetsResponse)
    ImportReadGroupSetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportReadGroupSetsResponse.newBuilder() to construct.
  private ImportReadGroupSetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportReadGroupSetsResponse() {
    readGroupSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportReadGroupSetsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.ImportReadGroupSetsResponse.class, com.google.genomics.v1.ImportReadGroupSetsResponse.Builder.class);
  }

  public static final int READ_GROUP_SET_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList readGroupSetIds_;
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @return A list containing the readGroupSetIds.
   */
  public com.google.protobuf.ProtocolStringList
      getReadGroupSetIdsList() {
    return readGroupSetIds_;
  }
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @return The count of readGroupSetIds.
   */
  public int getReadGroupSetIdsCount() {
    return readGroupSetIds_.size();
  }
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The readGroupSetIds at the given index.
   */
  public java.lang.String getReadGroupSetIds(int index) {
    return readGroupSetIds_.get(index);
  }
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the readGroupSetIds at the given index.
   */
  public com.google.protobuf.ByteString
      getReadGroupSetIdsBytes(int index) {
    return readGroupSetIds_.getByteString(index);
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
    for (int i = 0; i < readGroupSetIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, readGroupSetIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < readGroupSetIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(readGroupSetIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getReadGroupSetIdsList().size();
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
    if (!(obj instanceof com.google.genomics.v1.ImportReadGroupSetsResponse)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.ImportReadGroupSetsResponse other = (com.google.genomics.v1.ImportReadGroupSetsResponse) obj;

    if (!getReadGroupSetIdsList()
        .equals(other.getReadGroupSetIdsList())) return false;
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
    if (getReadGroupSetIdsCount() > 0) {
      hash = (37 * hash) + READ_GROUP_SET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getReadGroupSetIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsResponse parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.ImportReadGroupSetsResponse prototype) {
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
   * The read group set import response.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1.ImportReadGroupSetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.ImportReadGroupSetsResponse)
      com.google.genomics.v1.ImportReadGroupSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.ImportReadGroupSetsResponse.class, com.google.genomics.v1.ImportReadGroupSetsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.ImportReadGroupSetsResponse.newBuilder()
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
      readGroupSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.genomics.v1.ImportReadGroupSetsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.ImportReadGroupSetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.genomics.v1.ImportReadGroupSetsResponse build() {
      com.google.genomics.v1.ImportReadGroupSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.genomics.v1.ImportReadGroupSetsResponse buildPartial() {
      com.google.genomics.v1.ImportReadGroupSetsResponse result = new com.google.genomics.v1.ImportReadGroupSetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.genomics.v1.ImportReadGroupSetsResponse result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        readGroupSetIds_ = readGroupSetIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.readGroupSetIds_ = readGroupSetIds_;
    }

    private void buildPartial0(com.google.genomics.v1.ImportReadGroupSetsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.genomics.v1.ImportReadGroupSetsResponse) {
        return mergeFrom((com.google.genomics.v1.ImportReadGroupSetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.ImportReadGroupSetsResponse other) {
      if (other == com.google.genomics.v1.ImportReadGroupSetsResponse.getDefaultInstance()) return this;
      if (!other.readGroupSetIds_.isEmpty()) {
        if (readGroupSetIds_.isEmpty()) {
          readGroupSetIds_ = other.readGroupSetIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureReadGroupSetIdsIsMutable();
          readGroupSetIds_.addAll(other.readGroupSetIds_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureReadGroupSetIdsIsMutable();
              readGroupSetIds_.add(s);
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

    private com.google.protobuf.LazyStringList readGroupSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureReadGroupSetIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        readGroupSetIds_ = new com.google.protobuf.LazyStringArrayList(readGroupSetIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @return A list containing the readGroupSetIds.
     */
    public com.google.protobuf.ProtocolStringList
        getReadGroupSetIdsList() {
      return readGroupSetIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @return The count of readGroupSetIds.
     */
    public int getReadGroupSetIdsCount() {
      return readGroupSetIds_.size();
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The readGroupSetIds at the given index.
     */
    public java.lang.String getReadGroupSetIds(int index) {
      return readGroupSetIds_.get(index);
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the readGroupSetIds at the given index.
     */
    public com.google.protobuf.ByteString
        getReadGroupSetIdsBytes(int index) {
      return readGroupSetIds_.getByteString(index);
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The readGroupSetIds to set.
     * @return This builder for chaining.
     */
    public Builder setReadGroupSetIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureReadGroupSetIdsIsMutable();
      readGroupSetIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @param value The readGroupSetIds to add.
     * @return This builder for chaining.
     */
    public Builder addReadGroupSetIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureReadGroupSetIdsIsMutable();
      readGroupSetIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @param values The readGroupSetIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllReadGroupSetIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureReadGroupSetIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, readGroupSetIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReadGroupSetIds() {
      readGroupSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the read group sets that were created.
     * </pre>
     *
     * <code>repeated string read_group_set_ids = 1;</code>
     * @param value The bytes of the readGroupSetIds to add.
     * @return This builder for chaining.
     */
    public Builder addReadGroupSetIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureReadGroupSetIdsIsMutable();
      readGroupSetIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.ImportReadGroupSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.ImportReadGroupSetsResponse)
  private static final com.google.genomics.v1.ImportReadGroupSetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.ImportReadGroupSetsResponse();
  }

  public static com.google.genomics.v1.ImportReadGroupSetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportReadGroupSetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImportReadGroupSetsResponse>() {
    @java.lang.Override
    public ImportReadGroupSetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportReadGroupSetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportReadGroupSetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.genomics.v1.ImportReadGroupSetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
