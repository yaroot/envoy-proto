// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

/**
 * <pre>
 * Request message for ListComponents.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest}
 */
public final class ListComponentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest)
    ListComponentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListComponentsRequest.newBuilder() to construct.
  private ListComponentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListComponentsRequest() {
    parent_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListComponentsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto.internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto.internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.class, com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent, which owns this collection of components.
   * Format:
   *  * `organizations/{organization}`
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
   * Required. The parent, which owns this collection of components.
   * Format:
   *  * `organizations/{organization}`
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
   * The maximum number of components to return. The service may return fewer
   * than this value. If unspecified, at most 100 components will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
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
   * A page token, received from a previous `ListComponents` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListComponents` must
   * match the call that provided the page token.
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
   * A page token, received from a previous `ListComponents` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListComponents` must
   * match the call that provided the page token.
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest other = (com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest prototype) {
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
   * Request message for ListComponents.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest)
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto.internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto.internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.class, com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto.internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest build() {
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest buildPartial() {
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest result = new com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest result) {
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
      if (other instanceof com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest) {
        return mergeFrom((com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest other) {
      if (other == com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest.getDefaultInstance()) return this;
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
     * Required. The parent, which owns this collection of components.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The parent, which owns this collection of components.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The parent, which owns this collection of components.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The parent, which owns this collection of components.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The parent, which owns this collection of components.
     * Format:
     *  * `organizations/{organization}`
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
     * The maximum number of components to return. The service may return fewer
     * than this value. If unspecified, at most 100 components will be returned.
     * The maximum value is 1000; values above 1000 will be coerced to 1000.
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
     * The maximum number of components to return. The service may return fewer
     * than this value. If unspecified, at most 100 components will be returned.
     * The maximum value is 1000; values above 1000 will be coerced to 1000.
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
     * The maximum number of components to return. The service may return fewer
     * than this value. If unspecified, at most 100 components will be returned.
     * The maximum value is 1000; values above 1000 will be coerced to 1000.
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
     * A page token, received from a previous `ListComponents` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListComponents` must
     * match the call that provided the page token.
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
     * A page token, received from a previous `ListComponents` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListComponents` must
     * match the call that provided the page token.
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
     * A page token, received from a previous `ListComponents` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListComponents` must
     * match the call that provided the page token.
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
     * A page token, received from a previous `ListComponents` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListComponents` must
     * match the call that provided the page token.
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
     * A page token, received from a previous `ListComponents` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListComponents` must
     * match the call that provided the page token.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest)
  private static final com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest();
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListComponentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListComponentsRequest>() {
    @java.lang.Override
    public ListComponentsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListComponentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListComponentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

