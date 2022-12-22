// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

/**
 * <pre>
 * Message for creating a listing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.CreateListingRequest}
 */
public final class CreateListingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.analyticshub.v1.CreateListingRequest)
    CreateListingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateListingRequest.newBuilder() to construct.
  private CreateListingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateListingRequest() {
    parent_ = "";
    listingId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateListingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto.internal_static_google_cloud_bigquery_analyticshub_v1_CreateListingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto.internal_static_google_cloud_bigquery_analyticshub_v1_CreateListingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.class, com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource path of the listing.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource path of the listing.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LISTING_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object listingId_ = "";
  /**
   * <pre>
   * Required. The ID of the listing to create.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The listingId.
   */
  @java.lang.Override
  public java.lang.String getListingId() {
    java.lang.Object ref = listingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      listingId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the listing to create.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for listingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getListingIdBytes() {
    java.lang.Object ref = listingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      listingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LISTING_FIELD_NUMBER = 3;
  private com.google.cloud.bigquery.analyticshub.v1.Listing listing_;
  /**
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the listing field is set.
   */
  @java.lang.Override
  public boolean hasListing() {
    return listing_ != null;
  }
  /**
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The listing.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.Listing getListing() {
    return listing_ == null ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance() : listing_;
  }
  /**
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingOrBuilder() {
    return listing_ == null ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance() : listing_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listingId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, listingId_);
    }
    if (listing_ != null) {
      output.writeMessage(3, getListing());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listingId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, listingId_);
    }
    if (listing_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getListing());
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
    if (!(obj instanceof com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest other = (com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getListingId()
        .equals(other.getListingId())) return false;
    if (hasListing() != other.hasListing()) return false;
    if (hasListing()) {
      if (!getListing()
          .equals(other.getListing())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + LISTING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getListingId().hashCode();
    if (hasListing()) {
      hash = (37 * hash) + LISTING_FIELD_NUMBER;
      hash = (53 * hash) + getListing().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest prototype) {
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
   * Message for creating a listing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.CreateListingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.analyticshub.v1.CreateListingRequest)
      com.google.cloud.bigquery.analyticshub.v1.CreateListingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto.internal_static_google_cloud_bigquery_analyticshub_v1_CreateListingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto.internal_static_google_cloud_bigquery_analyticshub_v1_CreateListingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.class, com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.newBuilder()
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
      parent_ = "";
      listingId_ = "";
      listing_ = null;
      if (listingBuilder_ != null) {
        listingBuilder_.dispose();
        listingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto.internal_static_google_cloud_bigquery_analyticshub_v1_CreateListingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest build() {
      com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest buildPartial() {
      com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest result = new com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.listingId_ = listingId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.listing_ = listingBuilder_ == null
            ? listing_
            : listingBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest) {
        return mergeFrom((com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest other) {
      if (other == com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getListingId().isEmpty()) {
        listingId_ = other.listingId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasListing()) {
        mergeListing(other.getListing());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              listingId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getListingFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object listingId_ = "";
    /**
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The listingId.
     */
    public java.lang.String getListingId() {
      java.lang.Object ref = listingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        listingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for listingId.
     */
    public com.google.protobuf.ByteString
        getListingIdBytes() {
      java.lang.Object ref = listingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        listingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The listingId to set.
     * @return This builder for chaining.
     */
    public Builder setListingId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      listingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearListingId() {
      listingId_ = getDefaultInstance().getListingId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for listingId to set.
     * @return This builder for chaining.
     */
    public Builder setListingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      listingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.analyticshub.v1.Listing listing_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.analyticshub.v1.Listing, com.google.cloud.bigquery.analyticshub.v1.Listing.Builder, com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder> listingBuilder_;
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the listing field is set.
     */
    public boolean hasListing() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The listing.
     */
    public com.google.cloud.bigquery.analyticshub.v1.Listing getListing() {
      if (listingBuilder_ == null) {
        return listing_ == null ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance() : listing_;
      } else {
        return listingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setListing(com.google.cloud.bigquery.analyticshub.v1.Listing value) {
      if (listingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        listing_ = value;
      } else {
        listingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setListing(
        com.google.cloud.bigquery.analyticshub.v1.Listing.Builder builderForValue) {
      if (listingBuilder_ == null) {
        listing_ = builderForValue.build();
      } else {
        listingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeListing(com.google.cloud.bigquery.analyticshub.v1.Listing value) {
      if (listingBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          listing_ != null &&
          listing_ != com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance()) {
          getListingBuilder().mergeFrom(value);
        } else {
          listing_ = value;
        }
      } else {
        listingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearListing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      listing_ = null;
      if (listingBuilder_ != null) {
        listingBuilder_.dispose();
        listingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.Listing.Builder getListingBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getListingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingOrBuilder() {
      if (listingBuilder_ != null) {
        return listingBuilder_.getMessageOrBuilder();
      } else {
        return listing_ == null ?
            com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance() : listing_;
      }
    }
    /**
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.analyticshub.v1.Listing, com.google.cloud.bigquery.analyticshub.v1.Listing.Builder, com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder> 
        getListingFieldBuilder() {
      if (listingBuilder_ == null) {
        listingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.Listing, com.google.cloud.bigquery.analyticshub.v1.Listing.Builder, com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder>(
                getListing(),
                getParentForChildren(),
                isClean());
        listing_ = null;
      }
      return listingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.analyticshub.v1.CreateListingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.analyticshub.v1.CreateListingRequest)
  private static final com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest();
  }

  public static com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateListingRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateListingRequest>() {
    @java.lang.Override
    public CreateListingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateListingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateListingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.CreateListingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
