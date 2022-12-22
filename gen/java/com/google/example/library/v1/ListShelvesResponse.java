// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/library/v1/library.proto

package com.google.example.library.v1;

/**
 * <pre>
 * Response message for LibraryService.ListShelves.
 * </pre>
 *
 * Protobuf type {@code google.example.library.v1.ListShelvesResponse}
 */
public final class ListShelvesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.example.library.v1.ListShelvesResponse)
    ListShelvesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListShelvesResponse.newBuilder() to construct.
  private ListShelvesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListShelvesResponse() {
    shelves_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListShelvesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListShelvesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListShelvesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.example.library.v1.ListShelvesResponse.class, com.google.example.library.v1.ListShelvesResponse.Builder.class);
  }

  public static final int SHELVES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.example.library.v1.Shelf> shelves_;
  /**
   * <pre>
   * The list of shelves.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.example.library.v1.Shelf> getShelvesList() {
    return shelves_;
  }
  /**
   * <pre>
   * The list of shelves.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.example.library.v1.ShelfOrBuilder> 
      getShelvesOrBuilderList() {
    return shelves_;
  }
  /**
   * <pre>
   * The list of shelves.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
   */
  @java.lang.Override
  public int getShelvesCount() {
    return shelves_.size();
  }
  /**
   * <pre>
   * The list of shelves.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
   */
  @java.lang.Override
  public com.google.example.library.v1.Shelf getShelves(int index) {
    return shelves_.get(index);
  }
  /**
   * <pre>
   * The list of shelves.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
   */
  @java.lang.Override
  public com.google.example.library.v1.ShelfOrBuilder getShelvesOrBuilder(
      int index) {
    return shelves_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass this value in the
   * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
   * field in the subsequent call to `ListShelves` method to retrieve the next
   * page of results.
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
   * A token to retrieve next page of results.
   * Pass this value in the
   * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
   * field in the subsequent call to `ListShelves` method to retrieve the next
   * page of results.
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
    for (int i = 0; i < shelves_.size(); i++) {
      output.writeMessage(1, shelves_.get(i));
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
    for (int i = 0; i < shelves_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, shelves_.get(i));
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
    if (!(obj instanceof com.google.example.library.v1.ListShelvesResponse)) {
      return super.equals(obj);
    }
    com.google.example.library.v1.ListShelvesResponse other = (com.google.example.library.v1.ListShelvesResponse) obj;

    if (!getShelvesList()
        .equals(other.getShelvesList())) return false;
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
    if (getShelvesCount() > 0) {
      hash = (37 * hash) + SHELVES_FIELD_NUMBER;
      hash = (53 * hash) + getShelvesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.ListShelvesResponse parseFrom(
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
  public static Builder newBuilder(com.google.example.library.v1.ListShelvesResponse prototype) {
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
   * Response message for LibraryService.ListShelves.
   * </pre>
   *
   * Protobuf type {@code google.example.library.v1.ListShelvesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.example.library.v1.ListShelvesResponse)
      com.google.example.library.v1.ListShelvesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListShelvesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListShelvesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.example.library.v1.ListShelvesResponse.class, com.google.example.library.v1.ListShelvesResponse.Builder.class);
    }

    // Construct using com.google.example.library.v1.ListShelvesResponse.newBuilder()
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
      if (shelvesBuilder_ == null) {
        shelves_ = java.util.Collections.emptyList();
      } else {
        shelves_ = null;
        shelvesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListShelvesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.example.library.v1.ListShelvesResponse getDefaultInstanceForType() {
      return com.google.example.library.v1.ListShelvesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.example.library.v1.ListShelvesResponse build() {
      com.google.example.library.v1.ListShelvesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.example.library.v1.ListShelvesResponse buildPartial() {
      com.google.example.library.v1.ListShelvesResponse result = new com.google.example.library.v1.ListShelvesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.example.library.v1.ListShelvesResponse result) {
      if (shelvesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          shelves_ = java.util.Collections.unmodifiableList(shelves_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.shelves_ = shelves_;
      } else {
        result.shelves_ = shelvesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.example.library.v1.ListShelvesResponse result) {
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
      if (other instanceof com.google.example.library.v1.ListShelvesResponse) {
        return mergeFrom((com.google.example.library.v1.ListShelvesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.example.library.v1.ListShelvesResponse other) {
      if (other == com.google.example.library.v1.ListShelvesResponse.getDefaultInstance()) return this;
      if (shelvesBuilder_ == null) {
        if (!other.shelves_.isEmpty()) {
          if (shelves_.isEmpty()) {
            shelves_ = other.shelves_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShelvesIsMutable();
            shelves_.addAll(other.shelves_);
          }
          onChanged();
        }
      } else {
        if (!other.shelves_.isEmpty()) {
          if (shelvesBuilder_.isEmpty()) {
            shelvesBuilder_.dispose();
            shelvesBuilder_ = null;
            shelves_ = other.shelves_;
            bitField0_ = (bitField0_ & ~0x00000001);
            shelvesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getShelvesFieldBuilder() : null;
          } else {
            shelvesBuilder_.addAllMessages(other.shelves_);
          }
        }
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
              com.google.example.library.v1.Shelf m =
                  input.readMessage(
                      com.google.example.library.v1.Shelf.parser(),
                      extensionRegistry);
              if (shelvesBuilder_ == null) {
                ensureShelvesIsMutable();
                shelves_.add(m);
              } else {
                shelvesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.example.library.v1.Shelf> shelves_ =
      java.util.Collections.emptyList();
    private void ensureShelvesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        shelves_ = new java.util.ArrayList<com.google.example.library.v1.Shelf>(shelves_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.example.library.v1.Shelf, com.google.example.library.v1.Shelf.Builder, com.google.example.library.v1.ShelfOrBuilder> shelvesBuilder_;

    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public java.util.List<com.google.example.library.v1.Shelf> getShelvesList() {
      if (shelvesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shelves_);
      } else {
        return shelvesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public int getShelvesCount() {
      if (shelvesBuilder_ == null) {
        return shelves_.size();
      } else {
        return shelvesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public com.google.example.library.v1.Shelf getShelves(int index) {
      if (shelvesBuilder_ == null) {
        return shelves_.get(index);
      } else {
        return shelvesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder setShelves(
        int index, com.google.example.library.v1.Shelf value) {
      if (shelvesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShelvesIsMutable();
        shelves_.set(index, value);
        onChanged();
      } else {
        shelvesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder setShelves(
        int index, com.google.example.library.v1.Shelf.Builder builderForValue) {
      if (shelvesBuilder_ == null) {
        ensureShelvesIsMutable();
        shelves_.set(index, builderForValue.build());
        onChanged();
      } else {
        shelvesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder addShelves(com.google.example.library.v1.Shelf value) {
      if (shelvesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShelvesIsMutable();
        shelves_.add(value);
        onChanged();
      } else {
        shelvesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder addShelves(
        int index, com.google.example.library.v1.Shelf value) {
      if (shelvesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShelvesIsMutable();
        shelves_.add(index, value);
        onChanged();
      } else {
        shelvesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder addShelves(
        com.google.example.library.v1.Shelf.Builder builderForValue) {
      if (shelvesBuilder_ == null) {
        ensureShelvesIsMutable();
        shelves_.add(builderForValue.build());
        onChanged();
      } else {
        shelvesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder addShelves(
        int index, com.google.example.library.v1.Shelf.Builder builderForValue) {
      if (shelvesBuilder_ == null) {
        ensureShelvesIsMutable();
        shelves_.add(index, builderForValue.build());
        onChanged();
      } else {
        shelvesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder addAllShelves(
        java.lang.Iterable<? extends com.google.example.library.v1.Shelf> values) {
      if (shelvesBuilder_ == null) {
        ensureShelvesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shelves_);
        onChanged();
      } else {
        shelvesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder clearShelves() {
      if (shelvesBuilder_ == null) {
        shelves_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        shelvesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public Builder removeShelves(int index) {
      if (shelvesBuilder_ == null) {
        ensureShelvesIsMutable();
        shelves_.remove(index);
        onChanged();
      } else {
        shelvesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public com.google.example.library.v1.Shelf.Builder getShelvesBuilder(
        int index) {
      return getShelvesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public com.google.example.library.v1.ShelfOrBuilder getShelvesOrBuilder(
        int index) {
      if (shelvesBuilder_ == null) {
        return shelves_.get(index);  } else {
        return shelvesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public java.util.List<? extends com.google.example.library.v1.ShelfOrBuilder> 
         getShelvesOrBuilderList() {
      if (shelvesBuilder_ != null) {
        return shelvesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shelves_);
      }
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public com.google.example.library.v1.Shelf.Builder addShelvesBuilder() {
      return getShelvesFieldBuilder().addBuilder(
          com.google.example.library.v1.Shelf.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public com.google.example.library.v1.Shelf.Builder addShelvesBuilder(
        int index) {
      return getShelvesFieldBuilder().addBuilder(
          index, com.google.example.library.v1.Shelf.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of shelves.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Shelf shelves = 1;</code>
     */
    public java.util.List<com.google.example.library.v1.Shelf.Builder> 
         getShelvesBuilderList() {
      return getShelvesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.example.library.v1.Shelf, com.google.example.library.v1.Shelf.Builder, com.google.example.library.v1.ShelfOrBuilder> 
        getShelvesFieldBuilder() {
      if (shelvesBuilder_ == null) {
        shelvesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.example.library.v1.Shelf, com.google.example.library.v1.Shelf.Builder, com.google.example.library.v1.ShelfOrBuilder>(
                shelves_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        shelves_ = null;
      }
      return shelvesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass this value in the
     * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
     * field in the subsequent call to `ListShelves` method to retrieve the next
     * page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in the
     * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
     * field in the subsequent call to `ListShelves` method to retrieve the next
     * page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in the
     * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
     * field in the subsequent call to `ListShelves` method to retrieve the next
     * page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in the
     * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
     * field in the subsequent call to `ListShelves` method to retrieve the next
     * page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in the
     * [ListShelvesRequest.page_token][google.example.library.v1.ListShelvesRequest.page_token]
     * field in the subsequent call to `ListShelves` method to retrieve the next
     * page of results.
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


    // @@protoc_insertion_point(builder_scope:google.example.library.v1.ListShelvesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.example.library.v1.ListShelvesResponse)
  private static final com.google.example.library.v1.ListShelvesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.example.library.v1.ListShelvesResponse();
  }

  public static com.google.example.library.v1.ListShelvesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListShelvesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListShelvesResponse>() {
    @java.lang.Override
    public ListShelvesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListShelvesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListShelvesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.example.library.v1.ListShelvesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

