// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/merchant_center_link_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Response message for [MerchantCenterLinkService.ListMerchantCenterLinks][google.ads.googleads.v10.services.MerchantCenterLinkService.ListMerchantCenterLinks].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.ListMerchantCenterLinksResponse}
 */
public final class ListMerchantCenterLinksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.ListMerchantCenterLinksResponse)
    ListMerchantCenterLinksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMerchantCenterLinksResponse.newBuilder() to construct.
  private ListMerchantCenterLinksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMerchantCenterLinksResponse() {
    merchantCenterLinks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListMerchantCenterLinksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v10_services_ListMerchantCenterLinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v10_services_ListMerchantCenterLinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.class, com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.Builder.class);
  }

  public static final int MERCHANT_CENTER_LINKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v10.resources.MerchantCenterLink> merchantCenterLinks_;
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v10.resources.MerchantCenterLink> getMerchantCenterLinksList() {
    return merchantCenterLinks_;
  }
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder> 
      getMerchantCenterLinksOrBuilderList() {
    return merchantCenterLinks_;
  }
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  @java.lang.Override
  public int getMerchantCenterLinksCount() {
    return merchantCenterLinks_.size();
  }
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.MerchantCenterLink getMerchantCenterLinks(int index) {
    return merchantCenterLinks_.get(index);
  }
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder getMerchantCenterLinksOrBuilder(
      int index) {
    return merchantCenterLinks_.get(index);
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
    for (int i = 0; i < merchantCenterLinks_.size(); i++) {
      output.writeMessage(1, merchantCenterLinks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < merchantCenterLinks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, merchantCenterLinks_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse other = (com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse) obj;

    if (!getMerchantCenterLinksList()
        .equals(other.getMerchantCenterLinksList())) return false;
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
    if (getMerchantCenterLinksCount() > 0) {
      hash = (37 * hash) + MERCHANT_CENTER_LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getMerchantCenterLinksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse prototype) {
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
   * Response message for [MerchantCenterLinkService.ListMerchantCenterLinks][google.ads.googleads.v10.services.MerchantCenterLinkService.ListMerchantCenterLinks].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.ListMerchantCenterLinksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.ListMerchantCenterLinksResponse)
      com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v10_services_ListMerchantCenterLinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v10_services_ListMerchantCenterLinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.class, com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.newBuilder()
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
      if (merchantCenterLinksBuilder_ == null) {
        merchantCenterLinks_ = java.util.Collections.emptyList();
      } else {
        merchantCenterLinks_ = null;
        merchantCenterLinksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v10_services_ListMerchantCenterLinksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse build() {
      com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse buildPartial() {
      com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse result = new com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse result) {
      if (merchantCenterLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          merchantCenterLinks_ = java.util.Collections.unmodifiableList(merchantCenterLinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.merchantCenterLinks_ = merchantCenterLinks_;
      } else {
        result.merchantCenterLinks_ = merchantCenterLinksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse) {
        return mergeFrom((com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse other) {
      if (other == com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse.getDefaultInstance()) return this;
      if (merchantCenterLinksBuilder_ == null) {
        if (!other.merchantCenterLinks_.isEmpty()) {
          if (merchantCenterLinks_.isEmpty()) {
            merchantCenterLinks_ = other.merchantCenterLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMerchantCenterLinksIsMutable();
            merchantCenterLinks_.addAll(other.merchantCenterLinks_);
          }
          onChanged();
        }
      } else {
        if (!other.merchantCenterLinks_.isEmpty()) {
          if (merchantCenterLinksBuilder_.isEmpty()) {
            merchantCenterLinksBuilder_.dispose();
            merchantCenterLinksBuilder_ = null;
            merchantCenterLinks_ = other.merchantCenterLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            merchantCenterLinksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMerchantCenterLinksFieldBuilder() : null;
          } else {
            merchantCenterLinksBuilder_.addAllMessages(other.merchantCenterLinks_);
          }
        }
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
              com.google.ads.googleads.v10.resources.MerchantCenterLink m =
                  input.readMessage(
                      com.google.ads.googleads.v10.resources.MerchantCenterLink.parser(),
                      extensionRegistry);
              if (merchantCenterLinksBuilder_ == null) {
                ensureMerchantCenterLinksIsMutable();
                merchantCenterLinks_.add(m);
              } else {
                merchantCenterLinksBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v10.resources.MerchantCenterLink> merchantCenterLinks_ =
      java.util.Collections.emptyList();
    private void ensureMerchantCenterLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        merchantCenterLinks_ = new java.util.ArrayList<com.google.ads.googleads.v10.resources.MerchantCenterLink>(merchantCenterLinks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.resources.MerchantCenterLink, com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder, com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder> merchantCenterLinksBuilder_;

    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.resources.MerchantCenterLink> getMerchantCenterLinksList() {
      if (merchantCenterLinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(merchantCenterLinks_);
      } else {
        return merchantCenterLinksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public int getMerchantCenterLinksCount() {
      if (merchantCenterLinksBuilder_ == null) {
        return merchantCenterLinks_.size();
      } else {
        return merchantCenterLinksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.MerchantCenterLink getMerchantCenterLinks(int index) {
      if (merchantCenterLinksBuilder_ == null) {
        return merchantCenterLinks_.get(index);
      } else {
        return merchantCenterLinksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder setMerchantCenterLinks(
        int index, com.google.ads.googleads.v10.resources.MerchantCenterLink value) {
      if (merchantCenterLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.set(index, value);
        onChanged();
      } else {
        merchantCenterLinksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder setMerchantCenterLinks(
        int index, com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder builderForValue) {
      if (merchantCenterLinksBuilder_ == null) {
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        merchantCenterLinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder addMerchantCenterLinks(com.google.ads.googleads.v10.resources.MerchantCenterLink value) {
      if (merchantCenterLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.add(value);
        onChanged();
      } else {
        merchantCenterLinksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder addMerchantCenterLinks(
        int index, com.google.ads.googleads.v10.resources.MerchantCenterLink value) {
      if (merchantCenterLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.add(index, value);
        onChanged();
      } else {
        merchantCenterLinksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder addMerchantCenterLinks(
        com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder builderForValue) {
      if (merchantCenterLinksBuilder_ == null) {
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.add(builderForValue.build());
        onChanged();
      } else {
        merchantCenterLinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder addMerchantCenterLinks(
        int index, com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder builderForValue) {
      if (merchantCenterLinksBuilder_ == null) {
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        merchantCenterLinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder addAllMerchantCenterLinks(
        java.lang.Iterable<? extends com.google.ads.googleads.v10.resources.MerchantCenterLink> values) {
      if (merchantCenterLinksBuilder_ == null) {
        ensureMerchantCenterLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, merchantCenterLinks_);
        onChanged();
      } else {
        merchantCenterLinksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder clearMerchantCenterLinks() {
      if (merchantCenterLinksBuilder_ == null) {
        merchantCenterLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        merchantCenterLinksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public Builder removeMerchantCenterLinks(int index) {
      if (merchantCenterLinksBuilder_ == null) {
        ensureMerchantCenterLinksIsMutable();
        merchantCenterLinks_.remove(index);
        onChanged();
      } else {
        merchantCenterLinksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder getMerchantCenterLinksBuilder(
        int index) {
      return getMerchantCenterLinksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder getMerchantCenterLinksOrBuilder(
        int index) {
      if (merchantCenterLinksBuilder_ == null) {
        return merchantCenterLinks_.get(index);  } else {
        return merchantCenterLinksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder> 
         getMerchantCenterLinksOrBuilderList() {
      if (merchantCenterLinksBuilder_ != null) {
        return merchantCenterLinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(merchantCenterLinks_);
      }
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder addMerchantCenterLinksBuilder() {
      return getMerchantCenterLinksFieldBuilder().addBuilder(
          com.google.ads.googleads.v10.resources.MerchantCenterLink.getDefaultInstance());
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder addMerchantCenterLinksBuilder(
        int index) {
      return getMerchantCenterLinksFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v10.resources.MerchantCenterLink.getDefaultInstance());
    }
    /**
     * <pre>
     * Merchant Center links available for the requested customer
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.MerchantCenterLink merchant_center_links = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder> 
         getMerchantCenterLinksBuilderList() {
      return getMerchantCenterLinksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.resources.MerchantCenterLink, com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder, com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder> 
        getMerchantCenterLinksFieldBuilder() {
      if (merchantCenterLinksBuilder_ == null) {
        merchantCenterLinksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v10.resources.MerchantCenterLink, com.google.ads.googleads.v10.resources.MerchantCenterLink.Builder, com.google.ads.googleads.v10.resources.MerchantCenterLinkOrBuilder>(
                merchantCenterLinks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        merchantCenterLinks_ = null;
      }
      return merchantCenterLinksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.ListMerchantCenterLinksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.ListMerchantCenterLinksResponse)
  private static final com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse();
  }

  public static com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMerchantCenterLinksResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMerchantCenterLinksResponse>() {
    @java.lang.Override
    public ListMerchantCenterLinksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMerchantCenterLinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMerchantCenterLinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

