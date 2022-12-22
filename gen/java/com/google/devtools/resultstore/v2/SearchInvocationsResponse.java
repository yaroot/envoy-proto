// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_download.proto

package com.google.devtools.resultstore.v2;

/**
 * <pre>
 * Response from calling SearchInvocations
 * </pre>
 *
 * Protobuf type {@code google.devtools.resultstore.v2.SearchInvocationsResponse}
 */
public final class SearchInvocationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.resultstore.v2.SearchInvocationsResponse)
    SearchInvocationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchInvocationsResponse.newBuilder() to construct.
  private SearchInvocationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchInvocationsResponse() {
    invocations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchInvocationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_SearchInvocationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_SearchInvocationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.resultstore.v2.SearchInvocationsResponse.class, com.google.devtools.resultstore.v2.SearchInvocationsResponse.Builder.class);
  }

  public static final int INVOCATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.resultstore.v2.Invocation> invocations_;
  /**
   * <pre>
   * Invocations matching the search, possibly capped at request.page_size or a
   * server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.resultstore.v2.Invocation> getInvocationsList() {
    return invocations_;
  }
  /**
   * <pre>
   * Invocations matching the search, possibly capped at request.page_size or a
   * server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.resultstore.v2.InvocationOrBuilder> 
      getInvocationsOrBuilderList() {
    return invocations_;
  }
  /**
   * <pre>
   * Invocations matching the search, possibly capped at request.page_size or a
   * server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
   */
  @java.lang.Override
  public int getInvocationsCount() {
    return invocations_.size();
  }
  /**
   * <pre>
   * Invocations matching the search, possibly capped at request.page_size or a
   * server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.Invocation getInvocations(int index) {
    return invocations_.get(index);
  }
  /**
   * <pre>
   * Invocations matching the search, possibly capped at request.page_size or a
   * server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.InvocationOrBuilder getInvocationsOrBuilder(
      int index) {
    return invocations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results.
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
    for (int i = 0; i < invocations_.size(); i++) {
      output.writeMessage(1, invocations_.get(i));
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
    for (int i = 0; i < invocations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, invocations_.get(i));
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
    if (!(obj instanceof com.google.devtools.resultstore.v2.SearchInvocationsResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.resultstore.v2.SearchInvocationsResponse other = (com.google.devtools.resultstore.v2.SearchInvocationsResponse) obj;

    if (!getInvocationsList()
        .equals(other.getInvocationsList())) return false;
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
    if (getInvocationsCount() > 0) {
      hash = (37 * hash) + INVOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getInvocationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.devtools.resultstore.v2.SearchInvocationsResponse prototype) {
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
   * Response from calling SearchInvocations
   * </pre>
   *
   * Protobuf type {@code google.devtools.resultstore.v2.SearchInvocationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.resultstore.v2.SearchInvocationsResponse)
      com.google.devtools.resultstore.v2.SearchInvocationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_SearchInvocationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_SearchInvocationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.resultstore.v2.SearchInvocationsResponse.class, com.google.devtools.resultstore.v2.SearchInvocationsResponse.Builder.class);
    }

    // Construct using com.google.devtools.resultstore.v2.SearchInvocationsResponse.newBuilder()
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
      if (invocationsBuilder_ == null) {
        invocations_ = java.util.Collections.emptyList();
      } else {
        invocations_ = null;
        invocationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_SearchInvocationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.SearchInvocationsResponse getDefaultInstanceForType() {
      return com.google.devtools.resultstore.v2.SearchInvocationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.SearchInvocationsResponse build() {
      com.google.devtools.resultstore.v2.SearchInvocationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.SearchInvocationsResponse buildPartial() {
      com.google.devtools.resultstore.v2.SearchInvocationsResponse result = new com.google.devtools.resultstore.v2.SearchInvocationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.devtools.resultstore.v2.SearchInvocationsResponse result) {
      if (invocationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          invocations_ = java.util.Collections.unmodifiableList(invocations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.invocations_ = invocations_;
      } else {
        result.invocations_ = invocationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.devtools.resultstore.v2.SearchInvocationsResponse result) {
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
      if (other instanceof com.google.devtools.resultstore.v2.SearchInvocationsResponse) {
        return mergeFrom((com.google.devtools.resultstore.v2.SearchInvocationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.resultstore.v2.SearchInvocationsResponse other) {
      if (other == com.google.devtools.resultstore.v2.SearchInvocationsResponse.getDefaultInstance()) return this;
      if (invocationsBuilder_ == null) {
        if (!other.invocations_.isEmpty()) {
          if (invocations_.isEmpty()) {
            invocations_ = other.invocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInvocationsIsMutable();
            invocations_.addAll(other.invocations_);
          }
          onChanged();
        }
      } else {
        if (!other.invocations_.isEmpty()) {
          if (invocationsBuilder_.isEmpty()) {
            invocationsBuilder_.dispose();
            invocationsBuilder_ = null;
            invocations_ = other.invocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            invocationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInvocationsFieldBuilder() : null;
          } else {
            invocationsBuilder_.addAllMessages(other.invocations_);
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
              com.google.devtools.resultstore.v2.Invocation m =
                  input.readMessage(
                      com.google.devtools.resultstore.v2.Invocation.parser(),
                      extensionRegistry);
              if (invocationsBuilder_ == null) {
                ensureInvocationsIsMutable();
                invocations_.add(m);
              } else {
                invocationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.devtools.resultstore.v2.Invocation> invocations_ =
      java.util.Collections.emptyList();
    private void ensureInvocationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        invocations_ = new java.util.ArrayList<com.google.devtools.resultstore.v2.Invocation>(invocations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.resultstore.v2.Invocation, com.google.devtools.resultstore.v2.Invocation.Builder, com.google.devtools.resultstore.v2.InvocationOrBuilder> invocationsBuilder_;

    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public java.util.List<com.google.devtools.resultstore.v2.Invocation> getInvocationsList() {
      if (invocationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(invocations_);
      } else {
        return invocationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public int getInvocationsCount() {
      if (invocationsBuilder_ == null) {
        return invocations_.size();
      } else {
        return invocationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Invocation getInvocations(int index) {
      if (invocationsBuilder_ == null) {
        return invocations_.get(index);
      } else {
        return invocationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder setInvocations(
        int index, com.google.devtools.resultstore.v2.Invocation value) {
      if (invocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvocationsIsMutable();
        invocations_.set(index, value);
        onChanged();
      } else {
        invocationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder setInvocations(
        int index, com.google.devtools.resultstore.v2.Invocation.Builder builderForValue) {
      if (invocationsBuilder_ == null) {
        ensureInvocationsIsMutable();
        invocations_.set(index, builderForValue.build());
        onChanged();
      } else {
        invocationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder addInvocations(com.google.devtools.resultstore.v2.Invocation value) {
      if (invocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvocationsIsMutable();
        invocations_.add(value);
        onChanged();
      } else {
        invocationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder addInvocations(
        int index, com.google.devtools.resultstore.v2.Invocation value) {
      if (invocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvocationsIsMutable();
        invocations_.add(index, value);
        onChanged();
      } else {
        invocationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder addInvocations(
        com.google.devtools.resultstore.v2.Invocation.Builder builderForValue) {
      if (invocationsBuilder_ == null) {
        ensureInvocationsIsMutable();
        invocations_.add(builderForValue.build());
        onChanged();
      } else {
        invocationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder addInvocations(
        int index, com.google.devtools.resultstore.v2.Invocation.Builder builderForValue) {
      if (invocationsBuilder_ == null) {
        ensureInvocationsIsMutable();
        invocations_.add(index, builderForValue.build());
        onChanged();
      } else {
        invocationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder addAllInvocations(
        java.lang.Iterable<? extends com.google.devtools.resultstore.v2.Invocation> values) {
      if (invocationsBuilder_ == null) {
        ensureInvocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, invocations_);
        onChanged();
      } else {
        invocationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder clearInvocations() {
      if (invocationsBuilder_ == null) {
        invocations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        invocationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public Builder removeInvocations(int index) {
      if (invocationsBuilder_ == null) {
        ensureInvocationsIsMutable();
        invocations_.remove(index);
        onChanged();
      } else {
        invocationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Invocation.Builder getInvocationsBuilder(
        int index) {
      return getInvocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.InvocationOrBuilder getInvocationsOrBuilder(
        int index) {
      if (invocationsBuilder_ == null) {
        return invocations_.get(index);  } else {
        return invocationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.resultstore.v2.InvocationOrBuilder> 
         getInvocationsOrBuilderList() {
      if (invocationsBuilder_ != null) {
        return invocationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(invocations_);
      }
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Invocation.Builder addInvocationsBuilder() {
      return getInvocationsFieldBuilder().addBuilder(
          com.google.devtools.resultstore.v2.Invocation.getDefaultInstance());
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Invocation.Builder addInvocationsBuilder(
        int index) {
      return getInvocationsFieldBuilder().addBuilder(
          index, com.google.devtools.resultstore.v2.Invocation.getDefaultInstance());
    }
    /**
     * <pre>
     * Invocations matching the search, possibly capped at request.page_size or a
     * server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Invocation invocations = 1;</code>
     */
    public java.util.List<com.google.devtools.resultstore.v2.Invocation.Builder> 
         getInvocationsBuilderList() {
      return getInvocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.resultstore.v2.Invocation, com.google.devtools.resultstore.v2.Invocation.Builder, com.google.devtools.resultstore.v2.InvocationOrBuilder> 
        getInvocationsFieldBuilder() {
      if (invocationsBuilder_ == null) {
        invocationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.resultstore.v2.Invocation, com.google.devtools.resultstore.v2.Invocation.Builder, com.google.devtools.resultstore.v2.InvocationOrBuilder>(
                invocations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        invocations_ = null;
      }
      return invocationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results.
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


    // @@protoc_insertion_point(builder_scope:google.devtools.resultstore.v2.SearchInvocationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.SearchInvocationsResponse)
  private static final com.google.devtools.resultstore.v2.SearchInvocationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.resultstore.v2.SearchInvocationsResponse();
  }

  public static com.google.devtools.resultstore.v2.SearchInvocationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchInvocationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchInvocationsResponse>() {
    @java.lang.Override
    public SearchInvocationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchInvocationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchInvocationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.resultstore.v2.SearchInvocationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
