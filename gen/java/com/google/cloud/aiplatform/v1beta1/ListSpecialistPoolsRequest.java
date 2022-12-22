// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest}
 */
public final class ListSpecialistPoolsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest)
    ListSpecialistPoolsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSpecialistPoolsRequest.newBuilder() to construct.
  private ListSpecialistPoolsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSpecialistPoolsRequest() {
    parent_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSpecialistPoolsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.class, com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The name of the SpecialistPool's parent resource.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The name of the SpecialistPool's parent resource.
   * Format: `projects/{project}/locations/{location}`
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

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_ = 0;
  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   * <pre>
   * The standard list page token.
   * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
   * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
   * first page if empty.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The standard list page token.
   * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
   * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
   * first page if empty.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_MASK_FIELD_NUMBER = 4;
  private com.google.protobuf.FieldMask readMask_;
  /**
   * <pre>
   * Mask specifying which fields to read. FieldMask represents a set of
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   * @return Whether the readMask field is set.
   */
  @java.lang.Override
  public boolean hasReadMask() {
    return readMask_ != null;
  }
  /**
   * <pre>
   * Mask specifying which fields to read. FieldMask represents a set of
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   * @return The readMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getReadMask() {
    return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
  }
  /**
   * <pre>
   * Mask specifying which fields to read. FieldMask represents a set of
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
    return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
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
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (readMask_ != null) {
      output.writeMessage(4, getReadMask());
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
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (readMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getReadMask());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest other = (com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (hasReadMask() != other.hasReadMask()) return false;
    if (hasReadMask()) {
      if (!getReadMask()
          .equals(other.getReadMask())) return false;
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    if (hasReadMask()) {
      hash = (37 * hash) + READ_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getReadMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest prototype) {
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
   * Request message for [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest)
      com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.class, com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.newBuilder()
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
      pageSize_ = 0;
      pageToken_ = "";
      readMask_ = null;
      if (readMaskBuilder_ != null) {
        readMaskBuilder_.dispose();
        readMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest build() {
      com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest result = new com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.readMask_ = readMaskBuilder_ == null
            ? readMask_
            : readMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasReadMask()) {
        mergeReadMask(other.getReadMask());
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
            case 16: {
              pageSize_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              pageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getReadMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
     * Required. The name of the SpecialistPool's parent resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The name of the SpecialistPool's parent resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The name of the SpecialistPool's parent resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The name of the SpecialistPool's parent resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The name of the SpecialistPool's parent resource.
     * Format: `projects/{project}/locations/{location}`
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

    private int pageSize_ ;
    /**
     * <pre>
     * The standard list page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The standard list page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard list page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * The standard list page token.
     * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
     * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
     * first page if empty.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The standard list page token.
     * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
     * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
     * first page if empty.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The standard list page token.
     * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
     * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
     * first page if empty.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard list page token.
     * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
     * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
     * first page if empty.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard list page token.
     * Typically obtained by [ListSpecialistPoolsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.next_page_token] of
     * the previous [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools] call. Return
     * first page if empty.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask readMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> readMaskBuilder_;
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     * @return Whether the readMask field is set.
     */
    public boolean hasReadMask() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     * @return The readMask.
     */
    public com.google.protobuf.FieldMask getReadMask() {
      if (readMaskBuilder_ == null) {
        return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      } else {
        return readMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder setReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readMask_ = value;
      } else {
        readMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder setReadMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (readMaskBuilder_ == null) {
        readMask_ = builderForValue.build();
      } else {
        readMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder mergeReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          readMask_ != null &&
          readMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getReadMaskBuilder().mergeFrom(value);
        } else {
          readMask_ = value;
        }
      } else {
        readMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder clearReadMask() {
      bitField0_ = (bitField0_ & ~0x00000008);
      readMask_ = null;
      if (readMaskBuilder_ != null) {
        readMaskBuilder_.dispose();
        readMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public com.google.protobuf.FieldMask.Builder getReadMaskBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getReadMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
      if (readMaskBuilder_ != null) {
        return readMaskBuilder_.getMessageOrBuilder();
      } else {
        return readMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      }
    }
    /**
     * <pre>
     * Mask specifying which fields to read. FieldMask represents a set of
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getReadMaskFieldBuilder() {
      if (readMaskBuilder_ == null) {
        readMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getReadMask(),
                getParentForChildren(),
                isClean());
        readMask_ = null;
      }
      return readMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest)
  private static final com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSpecialistPoolsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListSpecialistPoolsRequest>() {
    @java.lang.Override
    public ListSpecialistPoolsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSpecialistPoolsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSpecialistPoolsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

