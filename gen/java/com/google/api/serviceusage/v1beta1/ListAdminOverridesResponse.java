// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

/**
 * <pre>
 * Response message for ListAdminOverrides.
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1beta1.ListAdminOverridesResponse}
 */
public final class ListAdminOverridesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1beta1.ListAdminOverridesResponse)
    ListAdminOverridesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAdminOverridesResponse.newBuilder() to construct.
  private ListAdminOverridesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAdminOverridesResponse() {
    overrides_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAdminOverridesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_ListAdminOverridesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_ListAdminOverridesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.class, com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.Builder.class);
  }

  public static final int OVERRIDES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> overrides_;
  /**
   * <pre>
   * Admin overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> getOverridesList() {
    return overrides_;
  }
  /**
   * <pre>
   * Admin overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder> 
      getOverridesOrBuilderList() {
    return overrides_;
  }
  /**
   * <pre>
   * Admin overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public int getOverridesCount() {
    return overrides_.size();
  }
  /**
   * <pre>
   * Admin overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.QuotaOverride getOverrides(int index) {
    return overrides_.get(index);
  }
  /**
   * <pre>
   * Admin overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getOverridesOrBuilder(
      int index) {
    return overrides_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
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
   * Token identifying which result to start with; returned by a previous list
   * call.
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
    for (int i = 0; i < overrides_.size(); i++) {
      output.writeMessage(1, overrides_.get(i));
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
    for (int i = 0; i < overrides_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, overrides_.get(i));
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
    if (!(obj instanceof com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse other = (com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse) obj;

    if (!getOverridesList()
        .equals(other.getOverridesList())) return false;
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
    if (getOverridesCount() > 0) {
      hash = (37 * hash) + OVERRIDES_FIELD_NUMBER;
      hash = (53 * hash) + getOverridesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse parseFrom(
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
  public static Builder newBuilder(com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse prototype) {
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
   * Response message for ListAdminOverrides.
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1beta1.ListAdminOverridesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1beta1.ListAdminOverridesResponse)
      com.google.api.serviceusage.v1beta1.ListAdminOverridesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_ListAdminOverridesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_ListAdminOverridesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.class, com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.newBuilder()
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
      if (overridesBuilder_ == null) {
        overrides_ = java.util.Collections.emptyList();
      } else {
        overrides_ = null;
        overridesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_ListAdminOverridesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse build() {
      com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse buildPartial() {
      com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse result = new com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse result) {
      if (overridesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          overrides_ = java.util.Collections.unmodifiableList(overrides_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.overrides_ = overrides_;
      } else {
        result.overrides_ = overridesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse result) {
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
      if (other instanceof com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse) {
        return mergeFrom((com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse other) {
      if (other == com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse.getDefaultInstance()) return this;
      if (overridesBuilder_ == null) {
        if (!other.overrides_.isEmpty()) {
          if (overrides_.isEmpty()) {
            overrides_ = other.overrides_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOverridesIsMutable();
            overrides_.addAll(other.overrides_);
          }
          onChanged();
        }
      } else {
        if (!other.overrides_.isEmpty()) {
          if (overridesBuilder_.isEmpty()) {
            overridesBuilder_.dispose();
            overridesBuilder_ = null;
            overrides_ = other.overrides_;
            bitField0_ = (bitField0_ & ~0x00000001);
            overridesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOverridesFieldBuilder() : null;
          } else {
            overridesBuilder_.addAllMessages(other.overrides_);
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
              com.google.api.serviceusage.v1beta1.QuotaOverride m =
                  input.readMessage(
                      com.google.api.serviceusage.v1beta1.QuotaOverride.parser(),
                      extensionRegistry);
              if (overridesBuilder_ == null) {
                ensureOverridesIsMutable();
                overrides_.add(m);
              } else {
                overridesBuilder_.addMessage(m);
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

    private java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> overrides_ =
      java.util.Collections.emptyList();
    private void ensureOverridesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        overrides_ = new java.util.ArrayList<com.google.api.serviceusage.v1beta1.QuotaOverride>(overrides_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.serviceusage.v1beta1.QuotaOverride, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder, com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder> overridesBuilder_;

    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> getOverridesList() {
      if (overridesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(overrides_);
      } else {
        return overridesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public int getOverridesCount() {
      if (overridesBuilder_ == null) {
        return overrides_.size();
      } else {
        return overridesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride getOverrides(int index) {
      if (overridesBuilder_ == null) {
        return overrides_.get(index);
      } else {
        return overridesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder setOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride value) {
      if (overridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOverridesIsMutable();
        overrides_.set(index, value);
        onChanged();
      } else {
        overridesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder setOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder builderForValue) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.set(index, builderForValue.build());
        onChanged();
      } else {
        overridesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(com.google.api.serviceusage.v1beta1.QuotaOverride value) {
      if (overridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOverridesIsMutable();
        overrides_.add(value);
        onChanged();
      } else {
        overridesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride value) {
      if (overridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOverridesIsMutable();
        overrides_.add(index, value);
        onChanged();
      } else {
        overridesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(
        com.google.api.serviceusage.v1beta1.QuotaOverride.Builder builderForValue) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.add(builderForValue.build());
        onChanged();
      } else {
        overridesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder builderForValue) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.add(index, builderForValue.build());
        onChanged();
      } else {
        overridesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addAllOverrides(
        java.lang.Iterable<? extends com.google.api.serviceusage.v1beta1.QuotaOverride> values) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, overrides_);
        onChanged();
      } else {
        overridesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder clearOverrides() {
      if (overridesBuilder_ == null) {
        overrides_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        overridesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder removeOverrides(int index) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.remove(index);
        onChanged();
      } else {
        overridesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride.Builder getOverridesBuilder(
        int index) {
      return getOverridesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getOverridesOrBuilder(
        int index) {
      if (overridesBuilder_ == null) {
        return overrides_.get(index);  } else {
        return overridesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder> 
         getOverridesOrBuilderList() {
      if (overridesBuilder_ != null) {
        return overridesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(overrides_);
      }
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride.Builder addOverridesBuilder() {
      return getOverridesFieldBuilder().addBuilder(
          com.google.api.serviceusage.v1beta1.QuotaOverride.getDefaultInstance());
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride.Builder addOverridesBuilder(
        int index) {
      return getOverridesFieldBuilder().addBuilder(
          index, com.google.api.serviceusage.v1beta1.QuotaOverride.getDefaultInstance());
    }
    /**
     * <pre>
     * Admin overrides on this limit.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride.Builder> 
         getOverridesBuilderList() {
      return getOverridesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.serviceusage.v1beta1.QuotaOverride, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder, com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder> 
        getOverridesFieldBuilder() {
      if (overridesBuilder_ == null) {
        overridesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.QuotaOverride, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder, com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder>(
                overrides_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        overrides_ = null;
      }
      return overridesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token identifying which result to start with; returned by a previous list
     * call.
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
     * Token identifying which result to start with; returned by a previous list
     * call.
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
     * Token identifying which result to start with; returned by a previous list
     * call.
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
     * Token identifying which result to start with; returned by a previous list
     * call.
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
     * Token identifying which result to start with; returned by a previous list
     * call.
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


    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1beta1.ListAdminOverridesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1beta1.ListAdminOverridesResponse)
  private static final com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse();
  }

  public static com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAdminOverridesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAdminOverridesResponse>() {
    @java.lang.Override
    public ListAdminOverridesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAdminOverridesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAdminOverridesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ListAdminOverridesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

