// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/firestore.proto

package com.google.firestore.v1beta1;

/**
 * <pre>
 * The response from [Firestore.ListCollectionIds][google.firestore.v1beta1.Firestore.ListCollectionIds].
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1beta1.ListCollectionIdsResponse}
 */
public final class ListCollectionIdsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1beta1.ListCollectionIdsResponse)
    ListCollectionIdsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCollectionIdsResponse.newBuilder() to construct.
  private ListCollectionIdsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCollectionIdsResponse() {
    collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCollectionIdsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firestore.v1beta1.FirestoreProto.internal_static_google_firestore_v1beta1_ListCollectionIdsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1beta1.FirestoreProto.internal_static_google_firestore_v1beta1_ListCollectionIdsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1beta1.ListCollectionIdsResponse.class, com.google.firestore.v1beta1.ListCollectionIdsResponse.Builder.class);
  }

  public static final int COLLECTION_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList collectionIds_;
  /**
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   * @return A list containing the collectionIds.
   */
  public com.google.protobuf.ProtocolStringList
      getCollectionIdsList() {
    return collectionIds_;
  }
  /**
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   * @return The count of collectionIds.
   */
  public int getCollectionIdsCount() {
    return collectionIds_.size();
  }
  /**
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The collectionIds at the given index.
   */
  public java.lang.String getCollectionIds(int index) {
    return collectionIds_.get(index);
  }
  /**
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the collectionIds at the given index.
   */
  public com.google.protobuf.ByteString
      getCollectionIdsBytes(int index) {
    return collectionIds_.getByteString(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A page token that may be used to continue the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A page token that may be used to continue the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < collectionIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collectionIds_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
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
      for (int i = 0; i < collectionIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(collectionIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCollectionIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.firestore.v1beta1.ListCollectionIdsResponse)) {
      return super.equals(obj);
    }
    com.google.firestore.v1beta1.ListCollectionIdsResponse other = (com.google.firestore.v1beta1.ListCollectionIdsResponse) obj;

    if (!getCollectionIdsList()
        .equals(other.getCollectionIdsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getCollectionIdsCount() > 0) {
      hash = (37 * hash) + COLLECTION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCollectionIdsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1beta1.ListCollectionIdsResponse parseFrom(
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
  public static Builder newBuilder(com.google.firestore.v1beta1.ListCollectionIdsResponse prototype) {
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
   * The response from [Firestore.ListCollectionIds][google.firestore.v1beta1.Firestore.ListCollectionIds].
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1beta1.ListCollectionIdsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1beta1.ListCollectionIdsResponse)
      com.google.firestore.v1beta1.ListCollectionIdsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firestore.v1beta1.FirestoreProto.internal_static_google_firestore_v1beta1_ListCollectionIdsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1beta1.FirestoreProto.internal_static_google_firestore_v1beta1_ListCollectionIdsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1beta1.ListCollectionIdsResponse.class, com.google.firestore.v1beta1.ListCollectionIdsResponse.Builder.class);
    }

    // Construct using com.google.firestore.v1beta1.ListCollectionIdsResponse.newBuilder()
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
      collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firestore.v1beta1.FirestoreProto.internal_static_google_firestore_v1beta1_ListCollectionIdsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1beta1.ListCollectionIdsResponse getDefaultInstanceForType() {
      return com.google.firestore.v1beta1.ListCollectionIdsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1beta1.ListCollectionIdsResponse build() {
      com.google.firestore.v1beta1.ListCollectionIdsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1beta1.ListCollectionIdsResponse buildPartial() {
      com.google.firestore.v1beta1.ListCollectionIdsResponse result = new com.google.firestore.v1beta1.ListCollectionIdsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.firestore.v1beta1.ListCollectionIdsResponse result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        collectionIds_ = collectionIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.collectionIds_ = collectionIds_;
    }

    private void buildPartial0(com.google.firestore.v1beta1.ListCollectionIdsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.firestore.v1beta1.ListCollectionIdsResponse) {
        return mergeFrom((com.google.firestore.v1beta1.ListCollectionIdsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1beta1.ListCollectionIdsResponse other) {
      if (other == com.google.firestore.v1beta1.ListCollectionIdsResponse.getDefaultInstance()) return this;
      if (!other.collectionIds_.isEmpty()) {
        if (collectionIds_.isEmpty()) {
          collectionIds_ = other.collectionIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCollectionIdsIsMutable();
          collectionIds_.addAll(other.collectionIds_);
        }
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              ensureCollectionIdsIsMutable();
              collectionIds_.add(s);
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.LazyStringList collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCollectionIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        collectionIds_ = new com.google.protobuf.LazyStringArrayList(collectionIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @return A list containing the collectionIds.
     */
    public com.google.protobuf.ProtocolStringList
        getCollectionIdsList() {
      return collectionIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @return The count of collectionIds.
     */
    public int getCollectionIdsCount() {
      return collectionIds_.size();
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The collectionIds at the given index.
     */
    public java.lang.String getCollectionIds(int index) {
      return collectionIds_.get(index);
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the collectionIds at the given index.
     */
    public com.google.protobuf.ByteString
        getCollectionIdsBytes(int index) {
      return collectionIds_.getByteString(index);
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The collectionIds to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCollectionIdsIsMutable();
      collectionIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @param value The collectionIds to add.
     * @return This builder for chaining.
     */
    public Builder addCollectionIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCollectionIdsIsMutable();
      collectionIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @param values The collectionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllCollectionIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureCollectionIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, collectionIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionIds() {
      collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection ids.
     * </pre>
     *
     * <code>repeated string collection_ids = 1;</code>
     * @param value The bytes of the collectionIds to add.
     * @return This builder for chaining.
     */
    public Builder addCollectionIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureCollectionIdsIsMutable();
      collectionIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A page token that may be used to continue the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A page token that may be used to continue the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A page token that may be used to continue the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A page token that may be used to continue the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A page token that may be used to continue the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.firestore.v1beta1.ListCollectionIdsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1beta1.ListCollectionIdsResponse)
  private static final com.google.firestore.v1beta1.ListCollectionIdsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1beta1.ListCollectionIdsResponse();
  }

  public static com.google.firestore.v1beta1.ListCollectionIdsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCollectionIdsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCollectionIdsResponse>() {
    @java.lang.Override
    public ListCollectionIdsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCollectionIdsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCollectionIdsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1beta1.ListCollectionIdsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
