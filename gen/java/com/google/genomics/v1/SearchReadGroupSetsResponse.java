// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * <pre>
 * The read group set search response.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1.SearchReadGroupSetsResponse}
 */
public final class SearchReadGroupSetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.SearchReadGroupSetsResponse)
    SearchReadGroupSetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchReadGroupSetsResponse.newBuilder() to construct.
  private SearchReadGroupSetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchReadGroupSetsResponse() {
    readGroupSets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchReadGroupSetsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadGroupSetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadGroupSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.SearchReadGroupSetsResponse.class, com.google.genomics.v1.SearchReadGroupSetsResponse.Builder.class);
  }

  public static final int READ_GROUP_SETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.genomics.v1.ReadGroupSet> readGroupSets_;
  /**
   * <pre>
   * The list of matching read group sets.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.genomics.v1.ReadGroupSet> getReadGroupSetsList() {
    return readGroupSets_;
  }
  /**
   * <pre>
   * The list of matching read group sets.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.genomics.v1.ReadGroupSetOrBuilder> 
      getReadGroupSetsOrBuilderList() {
    return readGroupSets_;
  }
  /**
   * <pre>
   * The list of matching read group sets.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
   */
  @java.lang.Override
  public int getReadGroupSetsCount() {
    return readGroupSets_.size();
  }
  /**
   * <pre>
   * The list of matching read group sets.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
   */
  @java.lang.Override
  public com.google.genomics.v1.ReadGroupSet getReadGroupSets(int index) {
    return readGroupSets_.get(index);
  }
  /**
   * <pre>
   * The list of matching read group sets.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
   */
  @java.lang.Override
  public com.google.genomics.v1.ReadGroupSetOrBuilder getReadGroupSetsOrBuilder(
      int index) {
    return readGroupSets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
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
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
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
    for (int i = 0; i < readGroupSets_.size(); i++) {
      output.writeMessage(1, readGroupSets_.get(i));
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
    for (int i = 0; i < readGroupSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, readGroupSets_.get(i));
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
    if (!(obj instanceof com.google.genomics.v1.SearchReadGroupSetsResponse)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.SearchReadGroupSetsResponse other = (com.google.genomics.v1.SearchReadGroupSetsResponse) obj;

    if (!getReadGroupSetsList()
        .equals(other.getReadGroupSetsList())) return false;
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
    if (getReadGroupSetsCount() > 0) {
      hash = (37 * hash) + READ_GROUP_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getReadGroupSetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.SearchReadGroupSetsResponse parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.SearchReadGroupSetsResponse prototype) {
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
   * The read group set search response.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1.SearchReadGroupSetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.SearchReadGroupSetsResponse)
      com.google.genomics.v1.SearchReadGroupSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadGroupSetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadGroupSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.SearchReadGroupSetsResponse.class, com.google.genomics.v1.SearchReadGroupSetsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.SearchReadGroupSetsResponse.newBuilder()
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
      if (readGroupSetsBuilder_ == null) {
        readGroupSets_ = java.util.Collections.emptyList();
      } else {
        readGroupSets_ = null;
        readGroupSetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadGroupSetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.genomics.v1.SearchReadGroupSetsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.SearchReadGroupSetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.genomics.v1.SearchReadGroupSetsResponse build() {
      com.google.genomics.v1.SearchReadGroupSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.genomics.v1.SearchReadGroupSetsResponse buildPartial() {
      com.google.genomics.v1.SearchReadGroupSetsResponse result = new com.google.genomics.v1.SearchReadGroupSetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.genomics.v1.SearchReadGroupSetsResponse result) {
      if (readGroupSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          readGroupSets_ = java.util.Collections.unmodifiableList(readGroupSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.readGroupSets_ = readGroupSets_;
      } else {
        result.readGroupSets_ = readGroupSetsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.genomics.v1.SearchReadGroupSetsResponse result) {
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
      if (other instanceof com.google.genomics.v1.SearchReadGroupSetsResponse) {
        return mergeFrom((com.google.genomics.v1.SearchReadGroupSetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.SearchReadGroupSetsResponse other) {
      if (other == com.google.genomics.v1.SearchReadGroupSetsResponse.getDefaultInstance()) return this;
      if (readGroupSetsBuilder_ == null) {
        if (!other.readGroupSets_.isEmpty()) {
          if (readGroupSets_.isEmpty()) {
            readGroupSets_ = other.readGroupSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReadGroupSetsIsMutable();
            readGroupSets_.addAll(other.readGroupSets_);
          }
          onChanged();
        }
      } else {
        if (!other.readGroupSets_.isEmpty()) {
          if (readGroupSetsBuilder_.isEmpty()) {
            readGroupSetsBuilder_.dispose();
            readGroupSetsBuilder_ = null;
            readGroupSets_ = other.readGroupSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            readGroupSetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReadGroupSetsFieldBuilder() : null;
          } else {
            readGroupSetsBuilder_.addAllMessages(other.readGroupSets_);
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
              com.google.genomics.v1.ReadGroupSet m =
                  input.readMessage(
                      com.google.genomics.v1.ReadGroupSet.parser(),
                      extensionRegistry);
              if (readGroupSetsBuilder_ == null) {
                ensureReadGroupSetsIsMutable();
                readGroupSets_.add(m);
              } else {
                readGroupSetsBuilder_.addMessage(m);
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

    private java.util.List<com.google.genomics.v1.ReadGroupSet> readGroupSets_ =
      java.util.Collections.emptyList();
    private void ensureReadGroupSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        readGroupSets_ = new java.util.ArrayList<com.google.genomics.v1.ReadGroupSet>(readGroupSets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.genomics.v1.ReadGroupSet, com.google.genomics.v1.ReadGroupSet.Builder, com.google.genomics.v1.ReadGroupSetOrBuilder> readGroupSetsBuilder_;

    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public java.util.List<com.google.genomics.v1.ReadGroupSet> getReadGroupSetsList() {
      if (readGroupSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(readGroupSets_);
      } else {
        return readGroupSetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public int getReadGroupSetsCount() {
      if (readGroupSetsBuilder_ == null) {
        return readGroupSets_.size();
      } else {
        return readGroupSetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public com.google.genomics.v1.ReadGroupSet getReadGroupSets(int index) {
      if (readGroupSetsBuilder_ == null) {
        return readGroupSets_.get(index);
      } else {
        return readGroupSetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder setReadGroupSets(
        int index, com.google.genomics.v1.ReadGroupSet value) {
      if (readGroupSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReadGroupSetsIsMutable();
        readGroupSets_.set(index, value);
        onChanged();
      } else {
        readGroupSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder setReadGroupSets(
        int index, com.google.genomics.v1.ReadGroupSet.Builder builderForValue) {
      if (readGroupSetsBuilder_ == null) {
        ensureReadGroupSetsIsMutable();
        readGroupSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        readGroupSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder addReadGroupSets(com.google.genomics.v1.ReadGroupSet value) {
      if (readGroupSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReadGroupSetsIsMutable();
        readGroupSets_.add(value);
        onChanged();
      } else {
        readGroupSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder addReadGroupSets(
        int index, com.google.genomics.v1.ReadGroupSet value) {
      if (readGroupSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReadGroupSetsIsMutable();
        readGroupSets_.add(index, value);
        onChanged();
      } else {
        readGroupSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder addReadGroupSets(
        com.google.genomics.v1.ReadGroupSet.Builder builderForValue) {
      if (readGroupSetsBuilder_ == null) {
        ensureReadGroupSetsIsMutable();
        readGroupSets_.add(builderForValue.build());
        onChanged();
      } else {
        readGroupSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder addReadGroupSets(
        int index, com.google.genomics.v1.ReadGroupSet.Builder builderForValue) {
      if (readGroupSetsBuilder_ == null) {
        ensureReadGroupSetsIsMutable();
        readGroupSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        readGroupSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder addAllReadGroupSets(
        java.lang.Iterable<? extends com.google.genomics.v1.ReadGroupSet> values) {
      if (readGroupSetsBuilder_ == null) {
        ensureReadGroupSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, readGroupSets_);
        onChanged();
      } else {
        readGroupSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder clearReadGroupSets() {
      if (readGroupSetsBuilder_ == null) {
        readGroupSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        readGroupSetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public Builder removeReadGroupSets(int index) {
      if (readGroupSetsBuilder_ == null) {
        ensureReadGroupSetsIsMutable();
        readGroupSets_.remove(index);
        onChanged();
      } else {
        readGroupSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public com.google.genomics.v1.ReadGroupSet.Builder getReadGroupSetsBuilder(
        int index) {
      return getReadGroupSetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public com.google.genomics.v1.ReadGroupSetOrBuilder getReadGroupSetsOrBuilder(
        int index) {
      if (readGroupSetsBuilder_ == null) {
        return readGroupSets_.get(index);  } else {
        return readGroupSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public java.util.List<? extends com.google.genomics.v1.ReadGroupSetOrBuilder> 
         getReadGroupSetsOrBuilderList() {
      if (readGroupSetsBuilder_ != null) {
        return readGroupSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(readGroupSets_);
      }
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public com.google.genomics.v1.ReadGroupSet.Builder addReadGroupSetsBuilder() {
      return getReadGroupSetsFieldBuilder().addBuilder(
          com.google.genomics.v1.ReadGroupSet.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public com.google.genomics.v1.ReadGroupSet.Builder addReadGroupSetsBuilder(
        int index) {
      return getReadGroupSetsFieldBuilder().addBuilder(
          index, com.google.genomics.v1.ReadGroupSet.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of matching read group sets.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.ReadGroupSet read_group_sets = 1;</code>
     */
    public java.util.List<com.google.genomics.v1.ReadGroupSet.Builder> 
         getReadGroupSetsBuilderList() {
      return getReadGroupSetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.genomics.v1.ReadGroupSet, com.google.genomics.v1.ReadGroupSet.Builder, com.google.genomics.v1.ReadGroupSetOrBuilder> 
        getReadGroupSetsFieldBuilder() {
      if (readGroupSetsBuilder_ == null) {
        readGroupSetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.genomics.v1.ReadGroupSet, com.google.genomics.v1.ReadGroupSet.Builder, com.google.genomics.v1.ReadGroupSetOrBuilder>(
                readGroupSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        readGroupSets_ = null;
      }
      return readGroupSetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
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
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
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
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
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
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
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
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.SearchReadGroupSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.SearchReadGroupSetsResponse)
  private static final com.google.genomics.v1.SearchReadGroupSetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.SearchReadGroupSetsResponse();
  }

  public static com.google.genomics.v1.SearchReadGroupSetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchReadGroupSetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchReadGroupSetsResponse>() {
    @java.lang.Override
    public SearchReadGroupSetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchReadGroupSetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchReadGroupSetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.genomics.v1.SearchReadGroupSetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

