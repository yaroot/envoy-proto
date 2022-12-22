// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/criteria.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Criterion for number of days prior to the stay the booking is being made.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo}
 */
public final class HotelAdvanceBookingWindowInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo)
    HotelAdvanceBookingWindowInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelAdvanceBookingWindowInfo.newBuilder() to construct.
  private HotelAdvanceBookingWindowInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelAdvanceBookingWindowInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelAdvanceBookingWindowInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_HotelAdvanceBookingWindowInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_HotelAdvanceBookingWindowInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.class, com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_DAYS_FIELD_NUMBER = 3;
  private long minDays_ = 0L;
  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 min_days = 3;</code>
   * @return Whether the minDays field is set.
   */
  @java.lang.Override
  public boolean hasMinDays() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 min_days = 3;</code>
   * @return The minDays.
   */
  @java.lang.Override
  public long getMinDays() {
    return minDays_;
  }

  public static final int MAX_DAYS_FIELD_NUMBER = 4;
  private long maxDays_ = 0L;
  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 max_days = 4;</code>
   * @return Whether the maxDays field is set.
   */
  @java.lang.Override
  public boolean hasMaxDays() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 max_days = 4;</code>
   * @return The maxDays.
   */
  @java.lang.Override
  public long getMaxDays() {
    return maxDays_;
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
      output.writeInt64(3, minDays_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(4, maxDays_);
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
        .computeInt64Size(3, minDays_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, maxDays_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo other = (com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo) obj;

    if (hasMinDays() != other.hasMinDays()) return false;
    if (hasMinDays()) {
      if (getMinDays()
          != other.getMinDays()) return false;
    }
    if (hasMaxDays() != other.hasMaxDays()) return false;
    if (hasMaxDays()) {
      if (getMaxDays()
          != other.getMaxDays()) return false;
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
    if (hasMinDays()) {
      hash = (37 * hash) + MIN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinDays());
    }
    if (hasMaxDays()) {
      hash = (37 * hash) + MAX_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxDays());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo prototype) {
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
   * Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo)
      com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_HotelAdvanceBookingWindowInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_HotelAdvanceBookingWindowInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.class, com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.newBuilder()
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
      minDays_ = 0L;
      maxDays_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_HotelAdvanceBookingWindowInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo build() {
      com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo buildPartial() {
      com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo result = new com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minDays_ = minDays_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxDays_ = maxDays_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo other) {
      if (other == com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo.getDefaultInstance()) return this;
      if (other.hasMinDays()) {
        setMinDays(other.getMinDays());
      }
      if (other.hasMaxDays()) {
        setMaxDays(other.getMaxDays());
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
            case 24: {
              minDays_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              maxDays_ = input.readInt64();
              bitField0_ |= 0x00000002;
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

    private long minDays_ ;
    /**
     * <pre>
     * Low end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 min_days = 3;</code>
     * @return Whether the minDays field is set.
     */
    @java.lang.Override
    public boolean hasMinDays() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Low end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 min_days = 3;</code>
     * @return The minDays.
     */
    @java.lang.Override
    public long getMinDays() {
      return minDays_;
    }
    /**
     * <pre>
     * Low end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 min_days = 3;</code>
     * @param value The minDays to set.
     * @return This builder for chaining.
     */
    public Builder setMinDays(long value) {
      
      minDays_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Low end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 min_days = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinDays() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minDays_ = 0L;
      onChanged();
      return this;
    }

    private long maxDays_ ;
    /**
     * <pre>
     * High end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 max_days = 4;</code>
     * @return Whether the maxDays field is set.
     */
    @java.lang.Override
    public boolean hasMaxDays() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * High end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 max_days = 4;</code>
     * @return The maxDays.
     */
    @java.lang.Override
    public long getMaxDays() {
      return maxDays_;
    }
    /**
     * <pre>
     * High end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 max_days = 4;</code>
     * @param value The maxDays to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDays(long value) {
      
      maxDays_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * High end of the number of days prior to the stay.
     * </pre>
     *
     * <code>optional int64 max_days = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDays() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxDays_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo)
  private static final com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo();
  }

  public static com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelAdvanceBookingWindowInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelAdvanceBookingWindowInfo>() {
    @java.lang.Override
    public HotelAdvanceBookingWindowInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelAdvanceBookingWindowInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelAdvanceBookingWindowInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.HotelAdvanceBookingWindowInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

