// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 * <pre>
 * Response message for ListCustomDimensions RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.ListCustomDimensionsResponse}
 */
public final class ListCustomDimensionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.ListCustomDimensionsResponse)
    ListCustomDimensionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCustomDimensionsResponse.newBuilder() to construct.
  private ListCustomDimensionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCustomDimensionsResponse() {
    customDimensions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCustomDimensionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListCustomDimensionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListCustomDimensionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.class, com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.Builder.class);
  }

  public static final int CUSTOM_DIMENSIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1beta.CustomDimension> customDimensions_;
  /**
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1beta.CustomDimension> getCustomDimensionsList() {
    return customDimensions_;
  }
  /**
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1beta.CustomDimensionOrBuilder> 
      getCustomDimensionsOrBuilderList() {
    return customDimensions_;
  }
  /**
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
   */
  @java.lang.Override
  public int getCustomDimensionsCount() {
    return customDimensions_.size();
  }
  /**
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.CustomDimension getCustomDimensions(int index) {
    return customDimensions_.get(index);
  }
  /**
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.CustomDimensionOrBuilder getCustomDimensionsOrBuilder(
      int index) {
    return customDimensions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
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
    for (int i = 0; i < customDimensions_.size(); i++) {
      output.writeMessage(1, customDimensions_.get(i));
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
    for (int i = 0; i < customDimensions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, customDimensions_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.ListCustomDimensionsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.ListCustomDimensionsResponse other = (com.google.analytics.admin.v1beta.ListCustomDimensionsResponse) obj;

    if (!getCustomDimensionsList()
        .equals(other.getCustomDimensionsList())) return false;
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
    if (getCustomDimensionsCount() > 0) {
      hash = (37 * hash) + CUSTOM_DIMENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomDimensionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1beta.ListCustomDimensionsResponse prototype) {
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
   * Response message for ListCustomDimensions RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.ListCustomDimensionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.ListCustomDimensionsResponse)
      com.google.analytics.admin.v1beta.ListCustomDimensionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListCustomDimensionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListCustomDimensionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.class, com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.newBuilder()
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
      if (customDimensionsBuilder_ == null) {
        customDimensions_ = java.util.Collections.emptyList();
      } else {
        customDimensions_ = null;
        customDimensionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListCustomDimensionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListCustomDimensionsResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListCustomDimensionsResponse build() {
      com.google.analytics.admin.v1beta.ListCustomDimensionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListCustomDimensionsResponse buildPartial() {
      com.google.analytics.admin.v1beta.ListCustomDimensionsResponse result = new com.google.analytics.admin.v1beta.ListCustomDimensionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.analytics.admin.v1beta.ListCustomDimensionsResponse result) {
      if (customDimensionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          customDimensions_ = java.util.Collections.unmodifiableList(customDimensions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.customDimensions_ = customDimensions_;
      } else {
        result.customDimensions_ = customDimensionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.ListCustomDimensionsResponse result) {
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
      if (other instanceof com.google.analytics.admin.v1beta.ListCustomDimensionsResponse) {
        return mergeFrom((com.google.analytics.admin.v1beta.ListCustomDimensionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.ListCustomDimensionsResponse other) {
      if (other == com.google.analytics.admin.v1beta.ListCustomDimensionsResponse.getDefaultInstance()) return this;
      if (customDimensionsBuilder_ == null) {
        if (!other.customDimensions_.isEmpty()) {
          if (customDimensions_.isEmpty()) {
            customDimensions_ = other.customDimensions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCustomDimensionsIsMutable();
            customDimensions_.addAll(other.customDimensions_);
          }
          onChanged();
        }
      } else {
        if (!other.customDimensions_.isEmpty()) {
          if (customDimensionsBuilder_.isEmpty()) {
            customDimensionsBuilder_.dispose();
            customDimensionsBuilder_ = null;
            customDimensions_ = other.customDimensions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            customDimensionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCustomDimensionsFieldBuilder() : null;
          } else {
            customDimensionsBuilder_.addAllMessages(other.customDimensions_);
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
              com.google.analytics.admin.v1beta.CustomDimension m =
                  input.readMessage(
                      com.google.analytics.admin.v1beta.CustomDimension.parser(),
                      extensionRegistry);
              if (customDimensionsBuilder_ == null) {
                ensureCustomDimensionsIsMutable();
                customDimensions_.add(m);
              } else {
                customDimensionsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1beta.CustomDimension> customDimensions_ =
      java.util.Collections.emptyList();
    private void ensureCustomDimensionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        customDimensions_ = new java.util.ArrayList<com.google.analytics.admin.v1beta.CustomDimension>(customDimensions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1beta.CustomDimension, com.google.analytics.admin.v1beta.CustomDimension.Builder, com.google.analytics.admin.v1beta.CustomDimensionOrBuilder> customDimensionsBuilder_;

    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.CustomDimension> getCustomDimensionsList() {
      if (customDimensionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(customDimensions_);
      } else {
        return customDimensionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public int getCustomDimensionsCount() {
      if (customDimensionsBuilder_ == null) {
        return customDimensions_.size();
      } else {
        return customDimensionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimension getCustomDimensions(int index) {
      if (customDimensionsBuilder_ == null) {
        return customDimensions_.get(index);
      } else {
        return customDimensionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder setCustomDimensions(
        int index, com.google.analytics.admin.v1beta.CustomDimension value) {
      if (customDimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomDimensionsIsMutable();
        customDimensions_.set(index, value);
        onChanged();
      } else {
        customDimensionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder setCustomDimensions(
        int index, com.google.analytics.admin.v1beta.CustomDimension.Builder builderForValue) {
      if (customDimensionsBuilder_ == null) {
        ensureCustomDimensionsIsMutable();
        customDimensions_.set(index, builderForValue.build());
        onChanged();
      } else {
        customDimensionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder addCustomDimensions(com.google.analytics.admin.v1beta.CustomDimension value) {
      if (customDimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomDimensionsIsMutable();
        customDimensions_.add(value);
        onChanged();
      } else {
        customDimensionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder addCustomDimensions(
        int index, com.google.analytics.admin.v1beta.CustomDimension value) {
      if (customDimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomDimensionsIsMutable();
        customDimensions_.add(index, value);
        onChanged();
      } else {
        customDimensionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder addCustomDimensions(
        com.google.analytics.admin.v1beta.CustomDimension.Builder builderForValue) {
      if (customDimensionsBuilder_ == null) {
        ensureCustomDimensionsIsMutable();
        customDimensions_.add(builderForValue.build());
        onChanged();
      } else {
        customDimensionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder addCustomDimensions(
        int index, com.google.analytics.admin.v1beta.CustomDimension.Builder builderForValue) {
      if (customDimensionsBuilder_ == null) {
        ensureCustomDimensionsIsMutable();
        customDimensions_.add(index, builderForValue.build());
        onChanged();
      } else {
        customDimensionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder addAllCustomDimensions(
        java.lang.Iterable<? extends com.google.analytics.admin.v1beta.CustomDimension> values) {
      if (customDimensionsBuilder_ == null) {
        ensureCustomDimensionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, customDimensions_);
        onChanged();
      } else {
        customDimensionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder clearCustomDimensions() {
      if (customDimensionsBuilder_ == null) {
        customDimensions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        customDimensionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public Builder removeCustomDimensions(int index) {
      if (customDimensionsBuilder_ == null) {
        ensureCustomDimensionsIsMutable();
        customDimensions_.remove(index);
        onChanged();
      } else {
        customDimensionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimension.Builder getCustomDimensionsBuilder(
        int index) {
      return getCustomDimensionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimensionOrBuilder getCustomDimensionsOrBuilder(
        int index) {
      if (customDimensionsBuilder_ == null) {
        return customDimensions_.get(index);  } else {
        return customDimensionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1beta.CustomDimensionOrBuilder> 
         getCustomDimensionsOrBuilderList() {
      if (customDimensionsBuilder_ != null) {
        return customDimensionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(customDimensions_);
      }
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimension.Builder addCustomDimensionsBuilder() {
      return getCustomDimensionsFieldBuilder().addBuilder(
          com.google.analytics.admin.v1beta.CustomDimension.getDefaultInstance());
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimension.Builder addCustomDimensionsBuilder(
        int index) {
      return getCustomDimensionsFieldBuilder().addBuilder(
          index, com.google.analytics.admin.v1beta.CustomDimension.getDefaultInstance());
    }
    /**
     * <pre>
     * List of CustomDimensions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.CustomDimension custom_dimensions = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.CustomDimension.Builder> 
         getCustomDimensionsBuilderList() {
      return getCustomDimensionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1beta.CustomDimension, com.google.analytics.admin.v1beta.CustomDimension.Builder, com.google.analytics.admin.v1beta.CustomDimensionOrBuilder> 
        getCustomDimensionsFieldBuilder() {
      if (customDimensionsBuilder_ == null) {
        customDimensionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1beta.CustomDimension, com.google.analytics.admin.v1beta.CustomDimension.Builder, com.google.analytics.admin.v1beta.CustomDimensionOrBuilder>(
                customDimensions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        customDimensions_ = null;
      }
      return customDimensionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.ListCustomDimensionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.ListCustomDimensionsResponse)
  private static final com.google.analytics.admin.v1beta.ListCustomDimensionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.ListCustomDimensionsResponse();
  }

  public static com.google.analytics.admin.v1beta.ListCustomDimensionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomDimensionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCustomDimensionsResponse>() {
    @java.lang.Override
    public ListCustomDimensionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCustomDimensionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomDimensionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.ListCustomDimensionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

