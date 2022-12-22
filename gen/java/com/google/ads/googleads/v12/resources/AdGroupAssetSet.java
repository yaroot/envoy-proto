// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/ad_group_asset_set.proto

package com.google.ads.googleads.v12.resources;

/**
 * <pre>
 * AdGroupAssetSet is the linkage between an ad group and an asset set.
 * Creating an AdGroupAssetSet links an asset set with an ad group.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.resources.AdGroupAssetSet}
 */
public final class AdGroupAssetSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.resources.AdGroupAssetSet)
    AdGroupAssetSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupAssetSet.newBuilder() to construct.
  private AdGroupAssetSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupAssetSet() {
    resourceName_ = "";
    adGroup_ = "";
    assetSet_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupAssetSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.resources.AdGroupAssetSetProto.internal_static_google_ads_googleads_v12_resources_AdGroupAssetSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.resources.AdGroupAssetSetProto.internal_static_google_ads_googleads_v12_resources_AdGroupAssetSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.resources.AdGroupAssetSet.class, com.google.ads.googleads.v12.resources.AdGroupAssetSet.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Immutable. The resource name of the ad group asset set.
   * Ad group asset set resource names have the form:
   * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The resource name of the ad group asset set.
   * Ad group asset set resource names have the form:
   * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AD_GROUP_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object adGroup_ = "";
  /**
   * <pre>
   * Immutable. The ad group to which this asset set is linked.
   * </pre>
   *
   * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  @java.lang.Override
  public java.lang.String getAdGroup() {
    java.lang.Object ref = adGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      adGroup_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The ad group to which this asset set is linked.
   * </pre>
   *
   * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdGroupBytes() {
    java.lang.Object ref = adGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      adGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_SET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assetSet_ = "";
  /**
   * <pre>
   * Immutable. The asset set which is linked to the ad group.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetSet.
   */
  @java.lang.Override
  public java.lang.String getAssetSet() {
    java.lang.Object ref = assetSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetSet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The asset set which is linked to the ad group.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetSet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetSetBytes() {
    java.lang.Object ref = assetSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_ = 0;
  /**
   * <pre>
   * Output only. The status of the ad group asset set. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Output only. The status of the ad group asset set. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus getStatus() {
    com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus result = com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.forNumber(status_);
    return result == null ? com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adGroup_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, adGroup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetSet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, assetSet_);
    }
    if (status_ != com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adGroup_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, adGroup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetSet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, assetSet_);
    }
    if (status_ != com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.resources.AdGroupAssetSet)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.resources.AdGroupAssetSet other = (com.google.ads.googleads.v12.resources.AdGroupAssetSet) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getAdGroup()
        .equals(other.getAdGroup())) return false;
    if (!getAssetSet()
        .equals(other.getAssetSet())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + AD_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getAdGroup().hashCode();
    hash = (37 * hash) + ASSET_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAssetSet().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.resources.AdGroupAssetSet prototype) {
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
   * AdGroupAssetSet is the linkage between an ad group and an asset set.
   * Creating an AdGroupAssetSet links an asset set with an ad group.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.resources.AdGroupAssetSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.resources.AdGroupAssetSet)
      com.google.ads.googleads.v12.resources.AdGroupAssetSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.resources.AdGroupAssetSetProto.internal_static_google_ads_googleads_v12_resources_AdGroupAssetSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.resources.AdGroupAssetSetProto.internal_static_google_ads_googleads_v12_resources_AdGroupAssetSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.resources.AdGroupAssetSet.class, com.google.ads.googleads.v12.resources.AdGroupAssetSet.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.resources.AdGroupAssetSet.newBuilder()
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
      resourceName_ = "";
      adGroup_ = "";
      assetSet_ = "";
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.resources.AdGroupAssetSetProto.internal_static_google_ads_googleads_v12_resources_AdGroupAssetSet_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.AdGroupAssetSet getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.resources.AdGroupAssetSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.AdGroupAssetSet build() {
      com.google.ads.googleads.v12.resources.AdGroupAssetSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.AdGroupAssetSet buildPartial() {
      com.google.ads.googleads.v12.resources.AdGroupAssetSet result = new com.google.ads.googleads.v12.resources.AdGroupAssetSet(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.resources.AdGroupAssetSet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adGroup_ = adGroup_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.assetSet_ = assetSet_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v12.resources.AdGroupAssetSet) {
        return mergeFrom((com.google.ads.googleads.v12.resources.AdGroupAssetSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.resources.AdGroupAssetSet other) {
      if (other == com.google.ads.googleads.v12.resources.AdGroupAssetSet.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAdGroup().isEmpty()) {
        adGroup_ = other.adGroup_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAssetSet().isEmpty()) {
        assetSet_ = other.assetSet_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              adGroup_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              assetSet_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the ad group asset set.
     * Ad group asset set resource names have the form:
     * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the ad group asset set.
     * Ad group asset set resource names have the form:
     * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the ad group asset set.
     * Ad group asset set resource names have the form:
     * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the ad group asset set.
     * Ad group asset set resource names have the form:
     * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the ad group asset set.
     * Ad group asset set resource names have the form:
     * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object adGroup_ = "";
    /**
     * <pre>
     * Immutable. The ad group to which this asset set is linked.
     * </pre>
     *
     * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The adGroup.
     */
    public java.lang.String getAdGroup() {
      java.lang.Object ref = adGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The ad group to which this asset set is linked.
     * </pre>
     *
     * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for adGroup.
     */
    public com.google.protobuf.ByteString
        getAdGroupBytes() {
      java.lang.Object ref = adGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The ad group to which this asset set is linked.
     * </pre>
     *
     * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The adGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroup(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      adGroup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ad group to which this asset set is linked.
     * </pre>
     *
     * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAdGroup() {
      adGroup_ = getDefaultInstance().getAdGroup();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ad group to which this asset set is linked.
     * </pre>
     *
     * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for adGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      adGroup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object assetSet_ = "";
    /**
     * <pre>
     * Immutable. The asset set which is linked to the ad group.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The assetSet.
     */
    public java.lang.String getAssetSet() {
      java.lang.Object ref = assetSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the ad group.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for assetSet.
     */
    public com.google.protobuf.ByteString
        getAssetSetBytes() {
      java.lang.Object ref = assetSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the ad group.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The assetSet to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSet(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assetSet_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the ad group.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetSet() {
      assetSet_ = getDefaultInstance().getAssetSet();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the ad group.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for assetSet to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assetSet_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Output only. The status of the ad group asset set. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Output only. The status of the ad group asset set. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the ad group asset set. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus getStatus() {
      com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus result = com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.forNumber(status_);
      return result == null ? com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. The status of the ad group asset set. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the ad group asset set. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.resources.AdGroupAssetSet)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.resources.AdGroupAssetSet)
  private static final com.google.ads.googleads.v12.resources.AdGroupAssetSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.resources.AdGroupAssetSet();
  }

  public static com.google.ads.googleads.v12.resources.AdGroupAssetSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupAssetSet>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupAssetSet>() {
    @java.lang.Override
    public AdGroupAssetSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdGroupAssetSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupAssetSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.resources.AdGroupAssetSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
