// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/asset_set_types.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Business Profile location group business name filter.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter}
 */
public final class BusinessProfileBusinessNameFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter)
    BusinessProfileBusinessNameFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessProfileBusinessNameFilter.newBuilder() to construct.
  private BusinessProfileBusinessNameFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessProfileBusinessNameFilter() {
    businessName_ = "";
    filterType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BusinessProfileBusinessNameFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileBusinessNameFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileBusinessNameFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.class, com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.Builder.class);
  }

  public static final int BUSINESS_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object businessName_ = "";
  /**
   * <pre>
   * Business name string to use for filtering.
   * </pre>
   *
   * <code>string business_name = 1;</code>
   * @return The businessName.
   */
  @java.lang.Override
  public java.lang.String getBusinessName() {
    java.lang.Object ref = businessName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      businessName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Business name string to use for filtering.
   * </pre>
   *
   * <code>string business_name = 1;</code>
   * @return The bytes for businessName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBusinessNameBytes() {
    java.lang.Object ref = businessName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      businessName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_TYPE_FIELD_NUMBER = 2;
  private int filterType_ = 0;
  /**
   * <pre>
   * The type of string matching to use when filtering with business_name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
   * @return The enum numeric value on the wire for filterType.
   */
  @java.lang.Override public int getFilterTypeValue() {
    return filterType_;
  }
  /**
   * <pre>
   * The type of string matching to use when filtering with business_name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
   * @return The filterType.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType getFilterType() {
    com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType result = com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType.forNumber(filterType_);
    return result == null ? com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(businessName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, businessName_);
    }
    if (filterType_ != com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, filterType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(businessName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, businessName_);
    }
    if (filterType_ != com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, filterType_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter other = (com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter) obj;

    if (!getBusinessName()
        .equals(other.getBusinessName())) return false;
    if (filterType_ != other.filterType_) return false;
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
    hash = (37 * hash) + BUSINESS_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBusinessName().hashCode();
    hash = (37 * hash) + FILTER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + filterType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter prototype) {
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
   * Business Profile location group business name filter.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter)
      com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileBusinessNameFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileBusinessNameFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.class, com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.newBuilder()
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
      businessName_ = "";
      filterType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileBusinessNameFilter_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter build() {
      com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter buildPartial() {
      com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter result = new com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.businessName_ = businessName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filterType_ = filterType_;
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
      if (other instanceof com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter) {
        return mergeFrom((com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter other) {
      if (other == com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter.getDefaultInstance()) return this;
      if (!other.getBusinessName().isEmpty()) {
        businessName_ = other.businessName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.filterType_ != 0) {
        setFilterTypeValue(other.getFilterTypeValue());
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
              businessName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              filterType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object businessName_ = "";
    /**
     * <pre>
     * Business name string to use for filtering.
     * </pre>
     *
     * <code>string business_name = 1;</code>
     * @return The businessName.
     */
    public java.lang.String getBusinessName() {
      java.lang.Object ref = businessName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        businessName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Business name string to use for filtering.
     * </pre>
     *
     * <code>string business_name = 1;</code>
     * @return The bytes for businessName.
     */
    public com.google.protobuf.ByteString
        getBusinessNameBytes() {
      java.lang.Object ref = businessName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        businessName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Business name string to use for filtering.
     * </pre>
     *
     * <code>string business_name = 1;</code>
     * @param value The businessName to set.
     * @return This builder for chaining.
     */
    public Builder setBusinessName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      businessName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business name string to use for filtering.
     * </pre>
     *
     * <code>string business_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBusinessName() {
      businessName_ = getDefaultInstance().getBusinessName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business name string to use for filtering.
     * </pre>
     *
     * <code>string business_name = 1;</code>
     * @param value The bytes for businessName to set.
     * @return This builder for chaining.
     */
    public Builder setBusinessNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      businessName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int filterType_ = 0;
    /**
     * <pre>
     * The type of string matching to use when filtering with business_name.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
     * @return The enum numeric value on the wire for filterType.
     */
    @java.lang.Override public int getFilterTypeValue() {
      return filterType_;
    }
    /**
     * <pre>
     * The type of string matching to use when filtering with business_name.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
     * @param value The enum numeric value on the wire for filterType to set.
     * @return This builder for chaining.
     */
    public Builder setFilterTypeValue(int value) {
      filterType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of string matching to use when filtering with business_name.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
     * @return The filterType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType getFilterType() {
      com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType result = com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType.forNumber(filterType_);
      return result == null ? com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of string matching to use when filtering with business_name.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
     * @param value The filterType to set.
     * @return This builder for chaining.
     */
    public Builder setFilterType(com.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      filterType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of string matching to use when filtering with business_name.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.LocationStringFilterTypeEnum.LocationStringFilterType filter_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilterType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      filterType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter)
  private static final com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter();
  }

  public static com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessProfileBusinessNameFilter>
      PARSER = new com.google.protobuf.AbstractParser<BusinessProfileBusinessNameFilter>() {
    @java.lang.Override
    public BusinessProfileBusinessNameFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<BusinessProfileBusinessNameFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessProfileBusinessNameFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.BusinessProfileBusinessNameFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
