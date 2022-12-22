// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/keyword_plan_common.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Historical metrics options.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.HistoricalMetricsOptions}
 */
public final class HistoricalMetricsOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.HistoricalMetricsOptions)
    HistoricalMetricsOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistoricalMetricsOptions.newBuilder() to construct.
  private HistoricalMetricsOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistoricalMetricsOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistoricalMetricsOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v11_common_HistoricalMetricsOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v11_common_HistoricalMetricsOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.HistoricalMetricsOptions.class, com.google.ads.googleads.v11.common.HistoricalMetricsOptions.Builder.class);
  }

  private int bitField0_;
  public static final int YEAR_MONTH_RANGE_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v11.common.YearMonthRange yearMonthRange_;
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
   * @return Whether the yearMonthRange field is set.
   */
  @java.lang.Override
  public boolean hasYearMonthRange() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
   * @return The yearMonthRange.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.YearMonthRange getYearMonthRange() {
    return yearMonthRange_ == null ? com.google.ads.googleads.v11.common.YearMonthRange.getDefaultInstance() : yearMonthRange_;
  }
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.YearMonthRangeOrBuilder getYearMonthRangeOrBuilder() {
    return yearMonthRange_ == null ? com.google.ads.googleads.v11.common.YearMonthRange.getDefaultInstance() : yearMonthRange_;
  }

  public static final int INCLUDE_AVERAGE_CPC_FIELD_NUMBER = 2;
  private boolean includeAverageCpc_ = false;
  /**
   * <pre>
   * Indicates whether to include average cost per click value.
   * Average CPC is a legacy value that will be removed and replaced in the
   * future, and as such we are including it as an optioanl value so clients
   * only use it when strictly necessary and to better track clients that use
   * this value.
   * </pre>
   *
   * <code>bool include_average_cpc = 2;</code>
   * @return The includeAverageCpc.
   */
  @java.lang.Override
  public boolean getIncludeAverageCpc() {
    return includeAverageCpc_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getYearMonthRange());
    }
    if (includeAverageCpc_ != false) {
      output.writeBool(2, includeAverageCpc_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getYearMonthRange());
    }
    if (includeAverageCpc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeAverageCpc_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.HistoricalMetricsOptions)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.HistoricalMetricsOptions other = (com.google.ads.googleads.v11.common.HistoricalMetricsOptions) obj;

    if (hasYearMonthRange() != other.hasYearMonthRange()) return false;
    if (hasYearMonthRange()) {
      if (!getYearMonthRange()
          .equals(other.getYearMonthRange())) return false;
    }
    if (getIncludeAverageCpc()
        != other.getIncludeAverageCpc()) return false;
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
    if (hasYearMonthRange()) {
      hash = (37 * hash) + YEAR_MONTH_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getYearMonthRange().hashCode();
    }
    hash = (37 * hash) + INCLUDE_AVERAGE_CPC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeAverageCpc());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.HistoricalMetricsOptions prototype) {
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
   * Historical metrics options.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.HistoricalMetricsOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.HistoricalMetricsOptions)
      com.google.ads.googleads.v11.common.HistoricalMetricsOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v11_common_HistoricalMetricsOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v11_common_HistoricalMetricsOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.HistoricalMetricsOptions.class, com.google.ads.googleads.v11.common.HistoricalMetricsOptions.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.HistoricalMetricsOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getYearMonthRangeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      yearMonthRange_ = null;
      if (yearMonthRangeBuilder_ != null) {
        yearMonthRangeBuilder_.dispose();
        yearMonthRangeBuilder_ = null;
      }
      includeAverageCpc_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v11_common_HistoricalMetricsOptions_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.HistoricalMetricsOptions getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.HistoricalMetricsOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.HistoricalMetricsOptions build() {
      com.google.ads.googleads.v11.common.HistoricalMetricsOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.HistoricalMetricsOptions buildPartial() {
      com.google.ads.googleads.v11.common.HistoricalMetricsOptions result = new com.google.ads.googleads.v11.common.HistoricalMetricsOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.HistoricalMetricsOptions result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.yearMonthRange_ = yearMonthRangeBuilder_ == null
            ? yearMonthRange_
            : yearMonthRangeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.includeAverageCpc_ = includeAverageCpc_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v11.common.HistoricalMetricsOptions) {
        return mergeFrom((com.google.ads.googleads.v11.common.HistoricalMetricsOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.HistoricalMetricsOptions other) {
      if (other == com.google.ads.googleads.v11.common.HistoricalMetricsOptions.getDefaultInstance()) return this;
      if (other.hasYearMonthRange()) {
        mergeYearMonthRange(other.getYearMonthRange());
      }
      if (other.getIncludeAverageCpc() != false) {
        setIncludeAverageCpc(other.getIncludeAverageCpc());
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
              input.readMessage(
                  getYearMonthRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              includeAverageCpc_ = input.readBool();
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

    private com.google.ads.googleads.v11.common.YearMonthRange yearMonthRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.YearMonthRange, com.google.ads.googleads.v11.common.YearMonthRange.Builder, com.google.ads.googleads.v11.common.YearMonthRangeOrBuilder> yearMonthRangeBuilder_;
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     * @return Whether the yearMonthRange field is set.
     */
    public boolean hasYearMonthRange() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     * @return The yearMonthRange.
     */
    public com.google.ads.googleads.v11.common.YearMonthRange getYearMonthRange() {
      if (yearMonthRangeBuilder_ == null) {
        return yearMonthRange_ == null ? com.google.ads.googleads.v11.common.YearMonthRange.getDefaultInstance() : yearMonthRange_;
      } else {
        return yearMonthRangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    public Builder setYearMonthRange(com.google.ads.googleads.v11.common.YearMonthRange value) {
      if (yearMonthRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        yearMonthRange_ = value;
      } else {
        yearMonthRangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    public Builder setYearMonthRange(
        com.google.ads.googleads.v11.common.YearMonthRange.Builder builderForValue) {
      if (yearMonthRangeBuilder_ == null) {
        yearMonthRange_ = builderForValue.build();
      } else {
        yearMonthRangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    public Builder mergeYearMonthRange(com.google.ads.googleads.v11.common.YearMonthRange value) {
      if (yearMonthRangeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          yearMonthRange_ != null &&
          yearMonthRange_ != com.google.ads.googleads.v11.common.YearMonthRange.getDefaultInstance()) {
          getYearMonthRangeBuilder().mergeFrom(value);
        } else {
          yearMonthRange_ = value;
        }
      } else {
        yearMonthRangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    public Builder clearYearMonthRange() {
      bitField0_ = (bitField0_ & ~0x00000001);
      yearMonthRange_ = null;
      if (yearMonthRangeBuilder_ != null) {
        yearMonthRangeBuilder_.dispose();
        yearMonthRangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    public com.google.ads.googleads.v11.common.YearMonthRange.Builder getYearMonthRangeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getYearMonthRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    public com.google.ads.googleads.v11.common.YearMonthRangeOrBuilder getYearMonthRangeOrBuilder() {
      if (yearMonthRangeBuilder_ != null) {
        return yearMonthRangeBuilder_.getMessageOrBuilder();
      } else {
        return yearMonthRange_ == null ?
            com.google.ads.googleads.v11.common.YearMonthRange.getDefaultInstance() : yearMonthRange_;
      }
    }
    /**
     * <pre>
     * The year month range for historical metrics. If not specified the searches
     * will be returned for past 12 months.
     * Searches data is available for the past 4 years. If the search volume is
     * not available for the entire year_month_range provided, the subset of the
     * year month range for which search volume is available will be returned.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v11.common.YearMonthRange year_month_range = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.YearMonthRange, com.google.ads.googleads.v11.common.YearMonthRange.Builder, com.google.ads.googleads.v11.common.YearMonthRangeOrBuilder> 
        getYearMonthRangeFieldBuilder() {
      if (yearMonthRangeBuilder_ == null) {
        yearMonthRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.YearMonthRange, com.google.ads.googleads.v11.common.YearMonthRange.Builder, com.google.ads.googleads.v11.common.YearMonthRangeOrBuilder>(
                getYearMonthRange(),
                getParentForChildren(),
                isClean());
        yearMonthRange_ = null;
      }
      return yearMonthRangeBuilder_;
    }

    private boolean includeAverageCpc_ ;
    /**
     * <pre>
     * Indicates whether to include average cost per click value.
     * Average CPC is a legacy value that will be removed and replaced in the
     * future, and as such we are including it as an optioanl value so clients
     * only use it when strictly necessary and to better track clients that use
     * this value.
     * </pre>
     *
     * <code>bool include_average_cpc = 2;</code>
     * @return The includeAverageCpc.
     */
    @java.lang.Override
    public boolean getIncludeAverageCpc() {
      return includeAverageCpc_;
    }
    /**
     * <pre>
     * Indicates whether to include average cost per click value.
     * Average CPC is a legacy value that will be removed and replaced in the
     * future, and as such we are including it as an optioanl value so clients
     * only use it when strictly necessary and to better track clients that use
     * this value.
     * </pre>
     *
     * <code>bool include_average_cpc = 2;</code>
     * @param value The includeAverageCpc to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeAverageCpc(boolean value) {
      
      includeAverageCpc_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether to include average cost per click value.
     * Average CPC is a legacy value that will be removed and replaced in the
     * future, and as such we are including it as an optioanl value so clients
     * only use it when strictly necessary and to better track clients that use
     * this value.
     * </pre>
     *
     * <code>bool include_average_cpc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeAverageCpc() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeAverageCpc_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.HistoricalMetricsOptions)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.HistoricalMetricsOptions)
  private static final com.google.ads.googleads.v11.common.HistoricalMetricsOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.HistoricalMetricsOptions();
  }

  public static com.google.ads.googleads.v11.common.HistoricalMetricsOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistoricalMetricsOptions>
      PARSER = new com.google.protobuf.AbstractParser<HistoricalMetricsOptions>() {
    @java.lang.Override
    public HistoricalMetricsOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistoricalMetricsOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistoricalMetricsOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.HistoricalMetricsOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

