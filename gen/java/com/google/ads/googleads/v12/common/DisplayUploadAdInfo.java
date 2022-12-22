// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/ad_type_infos.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * A generic type of display ad. The exact ad format is controlled by the
 * `display_upload_product_type` field, which determines what kinds of data
 * need to be included with the ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.DisplayUploadAdInfo}
 */
public final class DisplayUploadAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.DisplayUploadAdInfo)
    DisplayUploadAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisplayUploadAdInfo.newBuilder() to construct.
  private DisplayUploadAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisplayUploadAdInfo() {
    displayUploadProductType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisplayUploadAdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_DisplayUploadAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_DisplayUploadAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.DisplayUploadAdInfo.class, com.google.ads.googleads.v12.common.DisplayUploadAdInfo.Builder.class);
  }

  private int mediaAssetCase_ = 0;
  private java.lang.Object mediaAsset_;
  public enum MediaAssetCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MEDIA_BUNDLE(2),
    MEDIAASSET_NOT_SET(0);
    private final int value;
    private MediaAssetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MediaAssetCase valueOf(int value) {
      return forNumber(value);
    }

    public static MediaAssetCase forNumber(int value) {
      switch (value) {
        case 2: return MEDIA_BUNDLE;
        case 0: return MEDIAASSET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MediaAssetCase
  getMediaAssetCase() {
    return MediaAssetCase.forNumber(
        mediaAssetCase_);
  }

  public static final int DISPLAY_UPLOAD_PRODUCT_TYPE_FIELD_NUMBER = 1;
  private int displayUploadProductType_ = 0;
  /**
   * <pre>
   * The product type of this ad. See comments on the enum for details.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
   * @return The enum numeric value on the wire for displayUploadProductType.
   */
  @java.lang.Override public int getDisplayUploadProductTypeValue() {
    return displayUploadProductType_;
  }
  /**
   * <pre>
   * The product type of this ad. See comments on the enum for details.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
   * @return The displayUploadProductType.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType getDisplayUploadProductType() {
    com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType result = com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType.forNumber(displayUploadProductType_);
    return result == null ? com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType.UNRECOGNIZED : result;
  }

  public static final int MEDIA_BUNDLE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A media bundle asset to be used in the ad. For information about the
   * media bundle for HTML5_UPLOAD_AD, see
   * https://support.google.com/google-ads/answer/1722096
   * Media bundles that are part of dynamic product types use a special format
   * that needs to be created through the Google Web Designer. See
   * https://support.google.com/webdesigner/answer/7543898 for more
   * information.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
   * @return Whether the mediaBundle field is set.
   */
  @java.lang.Override
  public boolean hasMediaBundle() {
    return mediaAssetCase_ == 2;
  }
  /**
   * <pre>
   * A media bundle asset to be used in the ad. For information about the
   * media bundle for HTML5_UPLOAD_AD, see
   * https://support.google.com/google-ads/answer/1722096
   * Media bundles that are part of dynamic product types use a special format
   * that needs to be created through the Google Web Designer. See
   * https://support.google.com/webdesigner/answer/7543898 for more
   * information.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
   * @return The mediaBundle.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.AdMediaBundleAsset getMediaBundle() {
    if (mediaAssetCase_ == 2) {
       return (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_;
    }
    return com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance();
  }
  /**
   * <pre>
   * A media bundle asset to be used in the ad. For information about the
   * media bundle for HTML5_UPLOAD_AD, see
   * https://support.google.com/google-ads/answer/1722096
   * Media bundles that are part of dynamic product types use a special format
   * that needs to be created through the Google Web Designer. See
   * https://support.google.com/webdesigner/answer/7543898 for more
   * information.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.AdMediaBundleAssetOrBuilder getMediaBundleOrBuilder() {
    if (mediaAssetCase_ == 2) {
       return (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_;
    }
    return com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance();
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
    if (displayUploadProductType_ != com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, displayUploadProductType_);
    }
    if (mediaAssetCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (displayUploadProductType_ != com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, displayUploadProductType_);
    }
    if (mediaAssetCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.DisplayUploadAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.DisplayUploadAdInfo other = (com.google.ads.googleads.v12.common.DisplayUploadAdInfo) obj;

    if (displayUploadProductType_ != other.displayUploadProductType_) return false;
    if (!getMediaAssetCase().equals(other.getMediaAssetCase())) return false;
    switch (mediaAssetCase_) {
      case 2:
        if (!getMediaBundle()
            .equals(other.getMediaBundle())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + DISPLAY_UPLOAD_PRODUCT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + displayUploadProductType_;
    switch (mediaAssetCase_) {
      case 2:
        hash = (37 * hash) + MEDIA_BUNDLE_FIELD_NUMBER;
        hash = (53 * hash) + getMediaBundle().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.DisplayUploadAdInfo prototype) {
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
   * A generic type of display ad. The exact ad format is controlled by the
   * `display_upload_product_type` field, which determines what kinds of data
   * need to be included with the ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.DisplayUploadAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.DisplayUploadAdInfo)
      com.google.ads.googleads.v12.common.DisplayUploadAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_DisplayUploadAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_DisplayUploadAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.DisplayUploadAdInfo.class, com.google.ads.googleads.v12.common.DisplayUploadAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.DisplayUploadAdInfo.newBuilder()
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
      displayUploadProductType_ = 0;
      if (mediaBundleBuilder_ != null) {
        mediaBundleBuilder_.clear();
      }
      mediaAssetCase_ = 0;
      mediaAsset_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_DisplayUploadAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.DisplayUploadAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.DisplayUploadAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.DisplayUploadAdInfo build() {
      com.google.ads.googleads.v12.common.DisplayUploadAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.DisplayUploadAdInfo buildPartial() {
      com.google.ads.googleads.v12.common.DisplayUploadAdInfo result = new com.google.ads.googleads.v12.common.DisplayUploadAdInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.DisplayUploadAdInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.displayUploadProductType_ = displayUploadProductType_;
      }
    }

    private void buildPartialOneofs(com.google.ads.googleads.v12.common.DisplayUploadAdInfo result) {
      result.mediaAssetCase_ = mediaAssetCase_;
      result.mediaAsset_ = this.mediaAsset_;
      if (mediaAssetCase_ == 2 &&
          mediaBundleBuilder_ != null) {
        result.mediaAsset_ = mediaBundleBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.common.DisplayUploadAdInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.DisplayUploadAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.DisplayUploadAdInfo other) {
      if (other == com.google.ads.googleads.v12.common.DisplayUploadAdInfo.getDefaultInstance()) return this;
      if (other.displayUploadProductType_ != 0) {
        setDisplayUploadProductTypeValue(other.getDisplayUploadProductTypeValue());
      }
      switch (other.getMediaAssetCase()) {
        case MEDIA_BUNDLE: {
          mergeMediaBundle(other.getMediaBundle());
          break;
        }
        case MEDIAASSET_NOT_SET: {
          break;
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
            case 8: {
              displayUploadProductType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMediaBundleFieldBuilder().getBuilder(),
                  extensionRegistry);
              mediaAssetCase_ = 2;
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
    private int mediaAssetCase_ = 0;
    private java.lang.Object mediaAsset_;
    public MediaAssetCase
        getMediaAssetCase() {
      return MediaAssetCase.forNumber(
          mediaAssetCase_);
    }

    public Builder clearMediaAsset() {
      mediaAssetCase_ = 0;
      mediaAsset_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int displayUploadProductType_ = 0;
    /**
     * <pre>
     * The product type of this ad. See comments on the enum for details.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
     * @return The enum numeric value on the wire for displayUploadProductType.
     */
    @java.lang.Override public int getDisplayUploadProductTypeValue() {
      return displayUploadProductType_;
    }
    /**
     * <pre>
     * The product type of this ad. See comments on the enum for details.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
     * @param value The enum numeric value on the wire for displayUploadProductType to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayUploadProductTypeValue(int value) {
      displayUploadProductType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The product type of this ad. See comments on the enum for details.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
     * @return The displayUploadProductType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType getDisplayUploadProductType() {
      com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType result = com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType.forNumber(displayUploadProductType_);
      return result == null ? com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The product type of this ad. See comments on the enum for details.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
     * @param value The displayUploadProductType to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayUploadProductType(com.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      displayUploadProductType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The product type of this ad. See comments on the enum for details.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayUploadProductType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      displayUploadProductType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.AdMediaBundleAsset, com.google.ads.googleads.v12.common.AdMediaBundleAsset.Builder, com.google.ads.googleads.v12.common.AdMediaBundleAssetOrBuilder> mediaBundleBuilder_;
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     * @return Whether the mediaBundle field is set.
     */
    @java.lang.Override
    public boolean hasMediaBundle() {
      return mediaAssetCase_ == 2;
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     * @return The mediaBundle.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.common.AdMediaBundleAsset getMediaBundle() {
      if (mediaBundleBuilder_ == null) {
        if (mediaAssetCase_ == 2) {
          return (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_;
        }
        return com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance();
      } else {
        if (mediaAssetCase_ == 2) {
          return mediaBundleBuilder_.getMessage();
        }
        return com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    public Builder setMediaBundle(com.google.ads.googleads.v12.common.AdMediaBundleAsset value) {
      if (mediaBundleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mediaAsset_ = value;
        onChanged();
      } else {
        mediaBundleBuilder_.setMessage(value);
      }
      mediaAssetCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    public Builder setMediaBundle(
        com.google.ads.googleads.v12.common.AdMediaBundleAsset.Builder builderForValue) {
      if (mediaBundleBuilder_ == null) {
        mediaAsset_ = builderForValue.build();
        onChanged();
      } else {
        mediaBundleBuilder_.setMessage(builderForValue.build());
      }
      mediaAssetCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    public Builder mergeMediaBundle(com.google.ads.googleads.v12.common.AdMediaBundleAsset value) {
      if (mediaBundleBuilder_ == null) {
        if (mediaAssetCase_ == 2 &&
            mediaAsset_ != com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance()) {
          mediaAsset_ = com.google.ads.googleads.v12.common.AdMediaBundleAsset.newBuilder((com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_)
              .mergeFrom(value).buildPartial();
        } else {
          mediaAsset_ = value;
        }
        onChanged();
      } else {
        if (mediaAssetCase_ == 2) {
          mediaBundleBuilder_.mergeFrom(value);
        } else {
          mediaBundleBuilder_.setMessage(value);
        }
      }
      mediaAssetCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    public Builder clearMediaBundle() {
      if (mediaBundleBuilder_ == null) {
        if (mediaAssetCase_ == 2) {
          mediaAssetCase_ = 0;
          mediaAsset_ = null;
          onChanged();
        }
      } else {
        if (mediaAssetCase_ == 2) {
          mediaAssetCase_ = 0;
          mediaAsset_ = null;
        }
        mediaBundleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    public com.google.ads.googleads.v12.common.AdMediaBundleAsset.Builder getMediaBundleBuilder() {
      return getMediaBundleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.common.AdMediaBundleAssetOrBuilder getMediaBundleOrBuilder() {
      if ((mediaAssetCase_ == 2) && (mediaBundleBuilder_ != null)) {
        return mediaBundleBuilder_.getMessageOrBuilder();
      } else {
        if (mediaAssetCase_ == 2) {
          return (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_;
        }
        return com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * A media bundle asset to be used in the ad. For information about the
     * media bundle for HTML5_UPLOAD_AD, see
     * https://support.google.com/google-ads/answer/1722096
     * Media bundles that are part of dynamic product types use a special format
     * that needs to be created through the Google Web Designer. See
     * https://support.google.com/webdesigner/answer/7543898 for more
     * information.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdMediaBundleAsset media_bundle = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.AdMediaBundleAsset, com.google.ads.googleads.v12.common.AdMediaBundleAsset.Builder, com.google.ads.googleads.v12.common.AdMediaBundleAssetOrBuilder> 
        getMediaBundleFieldBuilder() {
      if (mediaBundleBuilder_ == null) {
        if (!(mediaAssetCase_ == 2)) {
          mediaAsset_ = com.google.ads.googleads.v12.common.AdMediaBundleAsset.getDefaultInstance();
        }
        mediaBundleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.common.AdMediaBundleAsset, com.google.ads.googleads.v12.common.AdMediaBundleAsset.Builder, com.google.ads.googleads.v12.common.AdMediaBundleAssetOrBuilder>(
                (com.google.ads.googleads.v12.common.AdMediaBundleAsset) mediaAsset_,
                getParentForChildren(),
                isClean());
        mediaAsset_ = null;
      }
      mediaAssetCase_ = 2;
      onChanged();
      return mediaBundleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.DisplayUploadAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.DisplayUploadAdInfo)
  private static final com.google.ads.googleads.v12.common.DisplayUploadAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.DisplayUploadAdInfo();
  }

  public static com.google.ads.googleads.v12.common.DisplayUploadAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisplayUploadAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<DisplayUploadAdInfo>() {
    @java.lang.Override
    public DisplayUploadAdInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisplayUploadAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisplayUploadAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.DisplayUploadAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
