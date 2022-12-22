// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/regionlookup/v1alpha/region_lookup_service.proto

package com.google.maps.regionlookup.v1alpha;

/**
 * <pre>
 * Lookup Region Response.
 * Next available tag: 3
 * </pre>
 *
 * Protobuf type {@code google.maps.regionlookup.v1alpha.LookupRegionResponse}
 */
public final class LookupRegionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.regionlookup.v1alpha.LookupRegionResponse)
    LookupRegionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LookupRegionResponse.newBuilder() to construct.
  private LookupRegionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LookupRegionResponse() {
    matches_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LookupRegionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.regionlookup.v1alpha.RegionLookupServiceProto.internal_static_google_maps_regionlookup_v1alpha_LookupRegionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.regionlookup.v1alpha.RegionLookupServiceProto.internal_static_google_maps_regionlookup_v1alpha_LookupRegionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.regionlookup.v1alpha.LookupRegionResponse.class, com.google.maps.regionlookup.v1alpha.LookupRegionResponse.Builder.class);
  }

  public static final int MATCHES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.maps.regionlookup.v1alpha.RegionMatch> matches_;
  /**
   * <pre>
   * Lookup region matches, one for each `RegionIdentifier` in
   * `LookupRegionRequest.identifiers`.
   * </pre>
   *
   * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.maps.regionlookup.v1alpha.RegionMatch> getMatchesList() {
    return matches_;
  }
  /**
   * <pre>
   * Lookup region matches, one for each `RegionIdentifier` in
   * `LookupRegionRequest.identifiers`.
   * </pre>
   *
   * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder> 
      getMatchesOrBuilderList() {
    return matches_;
  }
  /**
   * <pre>
   * Lookup region matches, one for each `RegionIdentifier` in
   * `LookupRegionRequest.identifiers`.
   * </pre>
   *
   * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
   */
  @java.lang.Override
  public int getMatchesCount() {
    return matches_.size();
  }
  /**
   * <pre>
   * Lookup region matches, one for each `RegionIdentifier` in
   * `LookupRegionRequest.identifiers`.
   * </pre>
   *
   * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
   */
  @java.lang.Override
  public com.google.maps.regionlookup.v1alpha.RegionMatch getMatches(int index) {
    return matches_.get(index);
  }
  /**
   * <pre>
   * Lookup region matches, one for each `RegionIdentifier` in
   * `LookupRegionRequest.identifiers`.
   * </pre>
   *
   * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
   */
  @java.lang.Override
  public com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder getMatchesOrBuilder(
      int index) {
    return matches_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < matches_.size(); i++) {
      output.writeMessage(1, matches_.get(i));
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
    for (int i = 0; i < matches_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, matches_.get(i));
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
    if (!(obj instanceof com.google.maps.regionlookup.v1alpha.LookupRegionResponse)) {
      return super.equals(obj);
    }
    com.google.maps.regionlookup.v1alpha.LookupRegionResponse other = (com.google.maps.regionlookup.v1alpha.LookupRegionResponse) obj;

    if (!getMatchesList()
        .equals(other.getMatchesList())) return false;
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
    if (getMatchesCount() > 0) {
      hash = (37 * hash) + MATCHES_FIELD_NUMBER;
      hash = (53 * hash) + getMatchesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse parseFrom(
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
  public static Builder newBuilder(com.google.maps.regionlookup.v1alpha.LookupRegionResponse prototype) {
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
   * Lookup Region Response.
   * Next available tag: 3
   * </pre>
   *
   * Protobuf type {@code google.maps.regionlookup.v1alpha.LookupRegionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.regionlookup.v1alpha.LookupRegionResponse)
      com.google.maps.regionlookup.v1alpha.LookupRegionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.regionlookup.v1alpha.RegionLookupServiceProto.internal_static_google_maps_regionlookup_v1alpha_LookupRegionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.regionlookup.v1alpha.RegionLookupServiceProto.internal_static_google_maps_regionlookup_v1alpha_LookupRegionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.regionlookup.v1alpha.LookupRegionResponse.class, com.google.maps.regionlookup.v1alpha.LookupRegionResponse.Builder.class);
    }

    // Construct using com.google.maps.regionlookup.v1alpha.LookupRegionResponse.newBuilder()
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
      if (matchesBuilder_ == null) {
        matches_ = java.util.Collections.emptyList();
      } else {
        matches_ = null;
        matchesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.regionlookup.v1alpha.RegionLookupServiceProto.internal_static_google_maps_regionlookup_v1alpha_LookupRegionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.maps.regionlookup.v1alpha.LookupRegionResponse getDefaultInstanceForType() {
      return com.google.maps.regionlookup.v1alpha.LookupRegionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.regionlookup.v1alpha.LookupRegionResponse build() {
      com.google.maps.regionlookup.v1alpha.LookupRegionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.regionlookup.v1alpha.LookupRegionResponse buildPartial() {
      com.google.maps.regionlookup.v1alpha.LookupRegionResponse result = new com.google.maps.regionlookup.v1alpha.LookupRegionResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.maps.regionlookup.v1alpha.LookupRegionResponse result) {
      if (matchesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          matches_ = java.util.Collections.unmodifiableList(matches_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.matches_ = matches_;
      } else {
        result.matches_ = matchesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.maps.regionlookup.v1alpha.LookupRegionResponse result) {
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
      if (other instanceof com.google.maps.regionlookup.v1alpha.LookupRegionResponse) {
        return mergeFrom((com.google.maps.regionlookup.v1alpha.LookupRegionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.regionlookup.v1alpha.LookupRegionResponse other) {
      if (other == com.google.maps.regionlookup.v1alpha.LookupRegionResponse.getDefaultInstance()) return this;
      if (matchesBuilder_ == null) {
        if (!other.matches_.isEmpty()) {
          if (matches_.isEmpty()) {
            matches_ = other.matches_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMatchesIsMutable();
            matches_.addAll(other.matches_);
          }
          onChanged();
        }
      } else {
        if (!other.matches_.isEmpty()) {
          if (matchesBuilder_.isEmpty()) {
            matchesBuilder_.dispose();
            matchesBuilder_ = null;
            matches_ = other.matches_;
            bitField0_ = (bitField0_ & ~0x00000001);
            matchesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMatchesFieldBuilder() : null;
          } else {
            matchesBuilder_.addAllMessages(other.matches_);
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
              com.google.maps.regionlookup.v1alpha.RegionMatch m =
                  input.readMessage(
                      com.google.maps.regionlookup.v1alpha.RegionMatch.parser(),
                      extensionRegistry);
              if (matchesBuilder_ == null) {
                ensureMatchesIsMutable();
                matches_.add(m);
              } else {
                matchesBuilder_.addMessage(m);
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

    private java.util.List<com.google.maps.regionlookup.v1alpha.RegionMatch> matches_ =
      java.util.Collections.emptyList();
    private void ensureMatchesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        matches_ = new java.util.ArrayList<com.google.maps.regionlookup.v1alpha.RegionMatch>(matches_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.maps.regionlookup.v1alpha.RegionMatch, com.google.maps.regionlookup.v1alpha.RegionMatch.Builder, com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder> matchesBuilder_;

    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public java.util.List<com.google.maps.regionlookup.v1alpha.RegionMatch> getMatchesList() {
      if (matchesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(matches_);
      } else {
        return matchesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public int getMatchesCount() {
      if (matchesBuilder_ == null) {
        return matches_.size();
      } else {
        return matchesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public com.google.maps.regionlookup.v1alpha.RegionMatch getMatches(int index) {
      if (matchesBuilder_ == null) {
        return matches_.get(index);
      } else {
        return matchesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder setMatches(
        int index, com.google.maps.regionlookup.v1alpha.RegionMatch value) {
      if (matchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatchesIsMutable();
        matches_.set(index, value);
        onChanged();
      } else {
        matchesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder setMatches(
        int index, com.google.maps.regionlookup.v1alpha.RegionMatch.Builder builderForValue) {
      if (matchesBuilder_ == null) {
        ensureMatchesIsMutable();
        matches_.set(index, builderForValue.build());
        onChanged();
      } else {
        matchesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder addMatches(com.google.maps.regionlookup.v1alpha.RegionMatch value) {
      if (matchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatchesIsMutable();
        matches_.add(value);
        onChanged();
      } else {
        matchesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder addMatches(
        int index, com.google.maps.regionlookup.v1alpha.RegionMatch value) {
      if (matchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatchesIsMutable();
        matches_.add(index, value);
        onChanged();
      } else {
        matchesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder addMatches(
        com.google.maps.regionlookup.v1alpha.RegionMatch.Builder builderForValue) {
      if (matchesBuilder_ == null) {
        ensureMatchesIsMutable();
        matches_.add(builderForValue.build());
        onChanged();
      } else {
        matchesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder addMatches(
        int index, com.google.maps.regionlookup.v1alpha.RegionMatch.Builder builderForValue) {
      if (matchesBuilder_ == null) {
        ensureMatchesIsMutable();
        matches_.add(index, builderForValue.build());
        onChanged();
      } else {
        matchesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder addAllMatches(
        java.lang.Iterable<? extends com.google.maps.regionlookup.v1alpha.RegionMatch> values) {
      if (matchesBuilder_ == null) {
        ensureMatchesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, matches_);
        onChanged();
      } else {
        matchesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder clearMatches() {
      if (matchesBuilder_ == null) {
        matches_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        matchesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public Builder removeMatches(int index) {
      if (matchesBuilder_ == null) {
        ensureMatchesIsMutable();
        matches_.remove(index);
        onChanged();
      } else {
        matchesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public com.google.maps.regionlookup.v1alpha.RegionMatch.Builder getMatchesBuilder(
        int index) {
      return getMatchesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder getMatchesOrBuilder(
        int index) {
      if (matchesBuilder_ == null) {
        return matches_.get(index);  } else {
        return matchesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public java.util.List<? extends com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder> 
         getMatchesOrBuilderList() {
      if (matchesBuilder_ != null) {
        return matchesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(matches_);
      }
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public com.google.maps.regionlookup.v1alpha.RegionMatch.Builder addMatchesBuilder() {
      return getMatchesFieldBuilder().addBuilder(
          com.google.maps.regionlookup.v1alpha.RegionMatch.getDefaultInstance());
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public com.google.maps.regionlookup.v1alpha.RegionMatch.Builder addMatchesBuilder(
        int index) {
      return getMatchesFieldBuilder().addBuilder(
          index, com.google.maps.regionlookup.v1alpha.RegionMatch.getDefaultInstance());
    }
    /**
     * <pre>
     * Lookup region matches, one for each `RegionIdentifier` in
     * `LookupRegionRequest.identifiers`.
     * </pre>
     *
     * <code>repeated .google.maps.regionlookup.v1alpha.RegionMatch matches = 1;</code>
     */
    public java.util.List<com.google.maps.regionlookup.v1alpha.RegionMatch.Builder> 
         getMatchesBuilderList() {
      return getMatchesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.maps.regionlookup.v1alpha.RegionMatch, com.google.maps.regionlookup.v1alpha.RegionMatch.Builder, com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder> 
        getMatchesFieldBuilder() {
      if (matchesBuilder_ == null) {
        matchesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.maps.regionlookup.v1alpha.RegionMatch, com.google.maps.regionlookup.v1alpha.RegionMatch.Builder, com.google.maps.regionlookup.v1alpha.RegionMatchOrBuilder>(
                matches_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        matches_ = null;
      }
      return matchesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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


    // @@protoc_insertion_point(builder_scope:google.maps.regionlookup.v1alpha.LookupRegionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.maps.regionlookup.v1alpha.LookupRegionResponse)
  private static final com.google.maps.regionlookup.v1alpha.LookupRegionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.regionlookup.v1alpha.LookupRegionResponse();
  }

  public static com.google.maps.regionlookup.v1alpha.LookupRegionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupRegionResponse>
      PARSER = new com.google.protobuf.AbstractParser<LookupRegionResponse>() {
    @java.lang.Override
    public LookupRegionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<LookupRegionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupRegionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.regionlookup.v1alpha.LookupRegionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

