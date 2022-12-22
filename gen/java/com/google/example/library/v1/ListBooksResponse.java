// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/library/v1/library.proto

package com.google.example.library.v1;

/**
 * <pre>
 * Response message for LibraryService.ListBooks.
 * </pre>
 *
 * Protobuf type {@code google.example.library.v1.ListBooksResponse}
 */
public final class ListBooksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.example.library.v1.ListBooksResponse)
    ListBooksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListBooksResponse.newBuilder() to construct.
  private ListBooksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListBooksResponse() {
    books_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListBooksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListBooksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListBooksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.example.library.v1.ListBooksResponse.class, com.google.example.library.v1.ListBooksResponse.Builder.class);
  }

  public static final int BOOKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.example.library.v1.Book> books_;
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Book books = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.example.library.v1.Book> getBooksList() {
    return books_;
  }
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Book books = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.example.library.v1.BookOrBuilder> 
      getBooksOrBuilderList() {
    return books_;
  }
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Book books = 1;</code>
   */
  @java.lang.Override
  public int getBooksCount() {
    return books_.size();
  }
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Book books = 1;</code>
   */
  @java.lang.Override
  public com.google.example.library.v1.Book getBooks(int index) {
    return books_.get(index);
  }
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.v1.Book books = 1;</code>
   */
  @java.lang.Override
  public com.google.example.library.v1.BookOrBuilder getBooksOrBuilder(
      int index) {
    return books_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass this value in the
   * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
   * field in the subsequent call to `ListBooks` method to retrieve the next
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
   * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
   * field in the subsequent call to `ListBooks` method to retrieve the next
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
    for (int i = 0; i < books_.size(); i++) {
      output.writeMessage(1, books_.get(i));
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
    for (int i = 0; i < books_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, books_.get(i));
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
    if (!(obj instanceof com.google.example.library.v1.ListBooksResponse)) {
      return super.equals(obj);
    }
    com.google.example.library.v1.ListBooksResponse other = (com.google.example.library.v1.ListBooksResponse) obj;

    if (!getBooksList()
        .equals(other.getBooksList())) return false;
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
    if (getBooksCount() > 0) {
      hash = (37 * hash) + BOOKS_FIELD_NUMBER;
      hash = (53 * hash) + getBooksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.v1.ListBooksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.ListBooksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.ListBooksResponse parseFrom(
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
  public static Builder newBuilder(com.google.example.library.v1.ListBooksResponse prototype) {
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
   * Response message for LibraryService.ListBooks.
   * </pre>
   *
   * Protobuf type {@code google.example.library.v1.ListBooksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.example.library.v1.ListBooksResponse)
      com.google.example.library.v1.ListBooksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListBooksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListBooksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.example.library.v1.ListBooksResponse.class, com.google.example.library.v1.ListBooksResponse.Builder.class);
    }

    // Construct using com.google.example.library.v1.ListBooksResponse.newBuilder()
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
      if (booksBuilder_ == null) {
        books_ = java.util.Collections.emptyList();
      } else {
        books_ = null;
        booksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_ListBooksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.example.library.v1.ListBooksResponse getDefaultInstanceForType() {
      return com.google.example.library.v1.ListBooksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.example.library.v1.ListBooksResponse build() {
      com.google.example.library.v1.ListBooksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.example.library.v1.ListBooksResponse buildPartial() {
      com.google.example.library.v1.ListBooksResponse result = new com.google.example.library.v1.ListBooksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.example.library.v1.ListBooksResponse result) {
      if (booksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          books_ = java.util.Collections.unmodifiableList(books_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.books_ = books_;
      } else {
        result.books_ = booksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.example.library.v1.ListBooksResponse result) {
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
      if (other instanceof com.google.example.library.v1.ListBooksResponse) {
        return mergeFrom((com.google.example.library.v1.ListBooksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.example.library.v1.ListBooksResponse other) {
      if (other == com.google.example.library.v1.ListBooksResponse.getDefaultInstance()) return this;
      if (booksBuilder_ == null) {
        if (!other.books_.isEmpty()) {
          if (books_.isEmpty()) {
            books_ = other.books_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBooksIsMutable();
            books_.addAll(other.books_);
          }
          onChanged();
        }
      } else {
        if (!other.books_.isEmpty()) {
          if (booksBuilder_.isEmpty()) {
            booksBuilder_.dispose();
            booksBuilder_ = null;
            books_ = other.books_;
            bitField0_ = (bitField0_ & ~0x00000001);
            booksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBooksFieldBuilder() : null;
          } else {
            booksBuilder_.addAllMessages(other.books_);
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
              com.google.example.library.v1.Book m =
                  input.readMessage(
                      com.google.example.library.v1.Book.parser(),
                      extensionRegistry);
              if (booksBuilder_ == null) {
                ensureBooksIsMutable();
                books_.add(m);
              } else {
                booksBuilder_.addMessage(m);
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

    private java.util.List<com.google.example.library.v1.Book> books_ =
      java.util.Collections.emptyList();
    private void ensureBooksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        books_ = new java.util.ArrayList<com.google.example.library.v1.Book>(books_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.example.library.v1.Book, com.google.example.library.v1.Book.Builder, com.google.example.library.v1.BookOrBuilder> booksBuilder_;

    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public java.util.List<com.google.example.library.v1.Book> getBooksList() {
      if (booksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(books_);
      } else {
        return booksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public int getBooksCount() {
      if (booksBuilder_ == null) {
        return books_.size();
      } else {
        return booksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public com.google.example.library.v1.Book getBooks(int index) {
      if (booksBuilder_ == null) {
        return books_.get(index);
      } else {
        return booksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder setBooks(
        int index, com.google.example.library.v1.Book value) {
      if (booksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBooksIsMutable();
        books_.set(index, value);
        onChanged();
      } else {
        booksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder setBooks(
        int index, com.google.example.library.v1.Book.Builder builderForValue) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.set(index, builderForValue.build());
        onChanged();
      } else {
        booksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder addBooks(com.google.example.library.v1.Book value) {
      if (booksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBooksIsMutable();
        books_.add(value);
        onChanged();
      } else {
        booksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder addBooks(
        int index, com.google.example.library.v1.Book value) {
      if (booksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBooksIsMutable();
        books_.add(index, value);
        onChanged();
      } else {
        booksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder addBooks(
        com.google.example.library.v1.Book.Builder builderForValue) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.add(builderForValue.build());
        onChanged();
      } else {
        booksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder addBooks(
        int index, com.google.example.library.v1.Book.Builder builderForValue) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.add(index, builderForValue.build());
        onChanged();
      } else {
        booksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder addAllBooks(
        java.lang.Iterable<? extends com.google.example.library.v1.Book> values) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, books_);
        onChanged();
      } else {
        booksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder clearBooks() {
      if (booksBuilder_ == null) {
        books_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        booksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public Builder removeBooks(int index) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.remove(index);
        onChanged();
      } else {
        booksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public com.google.example.library.v1.Book.Builder getBooksBuilder(
        int index) {
      return getBooksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public com.google.example.library.v1.BookOrBuilder getBooksOrBuilder(
        int index) {
      if (booksBuilder_ == null) {
        return books_.get(index);  } else {
        return booksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public java.util.List<? extends com.google.example.library.v1.BookOrBuilder> 
         getBooksOrBuilderList() {
      if (booksBuilder_ != null) {
        return booksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(books_);
      }
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public com.google.example.library.v1.Book.Builder addBooksBuilder() {
      return getBooksFieldBuilder().addBuilder(
          com.google.example.library.v1.Book.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public com.google.example.library.v1.Book.Builder addBooksBuilder(
        int index) {
      return getBooksFieldBuilder().addBuilder(
          index, com.google.example.library.v1.Book.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of books.
     * </pre>
     *
     * <code>repeated .google.example.library.v1.Book books = 1;</code>
     */
    public java.util.List<com.google.example.library.v1.Book.Builder> 
         getBooksBuilderList() {
      return getBooksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.example.library.v1.Book, com.google.example.library.v1.Book.Builder, com.google.example.library.v1.BookOrBuilder> 
        getBooksFieldBuilder() {
      if (booksBuilder_ == null) {
        booksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.example.library.v1.Book, com.google.example.library.v1.Book.Builder, com.google.example.library.v1.BookOrBuilder>(
                books_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        books_ = null;
      }
      return booksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass this value in the
     * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
     * field in the subsequent call to `ListBooks` method to retrieve the next
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
     * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
     * field in the subsequent call to `ListBooks` method to retrieve the next
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
     * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
     * field in the subsequent call to `ListBooks` method to retrieve the next
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
     * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
     * field in the subsequent call to `ListBooks` method to retrieve the next
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
     * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
     * field in the subsequent call to `ListBooks` method to retrieve the next
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


    // @@protoc_insertion_point(builder_scope:google.example.library.v1.ListBooksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.example.library.v1.ListBooksResponse)
  private static final com.google.example.library.v1.ListBooksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.example.library.v1.ListBooksResponse();
  }

  public static com.google.example.library.v1.ListBooksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBooksResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListBooksResponse>() {
    @java.lang.Override
    public ListBooksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBooksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBooksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.example.library.v1.ListBooksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

