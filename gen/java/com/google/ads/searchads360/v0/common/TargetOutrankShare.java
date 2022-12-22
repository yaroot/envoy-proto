// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/searchads360/v0/common/bidding.proto

package com.google.ads.searchads360.v0.common;

/**
 * <pre>
 * An automated bidding strategy that sets bids based on the target fraction of
 * auctions where the advertiser should outrank a specific competitor.
 * This strategy is deprecated.
 * </pre>
 *
 * Protobuf type {@code google.ads.searchads360.v0.common.TargetOutrankShare}
 */
public final class TargetOutrankShare extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.searchads360.v0.common.TargetOutrankShare)
    TargetOutrankShareOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetOutrankShare.newBuilder() to construct.
  private TargetOutrankShare(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetOutrankShare() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetOutrankShare();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.searchads360.v0.common.BiddingProto.internal_static_google_ads_searchads360_v0_common_TargetOutrankShare_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.searchads360.v0.common.BiddingProto.internal_static_google_ads_searchads360_v0_common_TargetOutrankShare_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.searchads360.v0.common.TargetOutrankShare.class, com.google.ads.searchads360.v0.common.TargetOutrankShare.Builder.class);
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 3;
  private com.google.protobuf.Int64Value cpcBidCeilingMicros_;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_ != null;
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder() {
    return cpcBidCeilingMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
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
    if (cpcBidCeilingMicros_ != null) {
      output.writeMessage(3, getCpcBidCeilingMicros());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cpcBidCeilingMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCpcBidCeilingMicros());
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
    if (!(obj instanceof com.google.ads.searchads360.v0.common.TargetOutrankShare)) {
      return super.equals(obj);
    }
    com.google.ads.searchads360.v0.common.TargetOutrankShare other = (com.google.ads.searchads360.v0.common.TargetOutrankShare) obj;

    if (hasCpcBidCeilingMicros() != other.hasCpcBidCeilingMicros()) return false;
    if (hasCpcBidCeilingMicros()) {
      if (!getCpcBidCeilingMicros()
          .equals(other.getCpcBidCeilingMicros())) return false;
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
    if (hasCpcBidCeilingMicros()) {
      hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getCpcBidCeilingMicros().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.searchads360.v0.common.TargetOutrankShare parseFrom(
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
  public static Builder newBuilder(com.google.ads.searchads360.v0.common.TargetOutrankShare prototype) {
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
   * An automated bidding strategy that sets bids based on the target fraction of
   * auctions where the advertiser should outrank a specific competitor.
   * This strategy is deprecated.
   * </pre>
   *
   * Protobuf type {@code google.ads.searchads360.v0.common.TargetOutrankShare}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.searchads360.v0.common.TargetOutrankShare)
      com.google.ads.searchads360.v0.common.TargetOutrankShareOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.searchads360.v0.common.BiddingProto.internal_static_google_ads_searchads360_v0_common_TargetOutrankShare_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.searchads360.v0.common.BiddingProto.internal_static_google_ads_searchads360_v0_common_TargetOutrankShare_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.searchads360.v0.common.TargetOutrankShare.class, com.google.ads.searchads360.v0.common.TargetOutrankShare.Builder.class);
    }

    // Construct using com.google.ads.searchads360.v0.common.TargetOutrankShare.newBuilder()
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
      cpcBidCeilingMicros_ = null;
      if (cpcBidCeilingMicrosBuilder_ != null) {
        cpcBidCeilingMicrosBuilder_.dispose();
        cpcBidCeilingMicrosBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.searchads360.v0.common.BiddingProto.internal_static_google_ads_searchads360_v0_common_TargetOutrankShare_descriptor;
    }

    @java.lang.Override
    public com.google.ads.searchads360.v0.common.TargetOutrankShare getDefaultInstanceForType() {
      return com.google.ads.searchads360.v0.common.TargetOutrankShare.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.searchads360.v0.common.TargetOutrankShare build() {
      com.google.ads.searchads360.v0.common.TargetOutrankShare result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.searchads360.v0.common.TargetOutrankShare buildPartial() {
      com.google.ads.searchads360.v0.common.TargetOutrankShare result = new com.google.ads.searchads360.v0.common.TargetOutrankShare(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.searchads360.v0.common.TargetOutrankShare result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicrosBuilder_ == null
            ? cpcBidCeilingMicros_
            : cpcBidCeilingMicrosBuilder_.build();
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
      if (other instanceof com.google.ads.searchads360.v0.common.TargetOutrankShare) {
        return mergeFrom((com.google.ads.searchads360.v0.common.TargetOutrankShare)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.searchads360.v0.common.TargetOutrankShare other) {
      if (other == com.google.ads.searchads360.v0.common.TargetOutrankShare.getDefaultInstance()) return this;
      if (other.hasCpcBidCeilingMicros()) {
        mergeCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
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
            case 26: {
              input.readMessage(
                  getCpcBidCeilingMicrosFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.Int64Value cpcBidCeilingMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> cpcBidCeilingMicrosBuilder_;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     * @return Whether the cpcBidCeilingMicros field is set.
     */
    public boolean hasCpcBidCeilingMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     * @return The cpcBidCeilingMicros.
     */
    public com.google.protobuf.Int64Value getCpcBidCeilingMicros() {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        return cpcBidCeilingMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
      } else {
        return cpcBidCeilingMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    public Builder setCpcBidCeilingMicros(com.google.protobuf.Int64Value value) {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cpcBidCeilingMicros_ = value;
      } else {
        cpcBidCeilingMicrosBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    public Builder setCpcBidCeilingMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        cpcBidCeilingMicros_ = builderForValue.build();
      } else {
        cpcBidCeilingMicrosBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    public Builder mergeCpcBidCeilingMicros(com.google.protobuf.Int64Value value) {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          cpcBidCeilingMicros_ != null &&
          cpcBidCeilingMicros_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getCpcBidCeilingMicrosBuilder().mergeFrom(value);
        } else {
          cpcBidCeilingMicros_ = value;
        }
      } else {
        cpcBidCeilingMicrosBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    public Builder clearCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cpcBidCeilingMicros_ = null;
      if (cpcBidCeilingMicrosBuilder_ != null) {
        cpcBidCeilingMicrosBuilder_.dispose();
        cpcBidCeilingMicrosBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCpcBidCeilingMicrosBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCpcBidCeilingMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder() {
      if (cpcBidCeilingMicrosBuilder_ != null) {
        return cpcBidCeilingMicrosBuilder_.getMessageOrBuilder();
      } else {
        return cpcBidCeilingMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
      }
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCpcBidCeilingMicrosFieldBuilder() {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        cpcBidCeilingMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCpcBidCeilingMicros(),
                getParentForChildren(),
                isClean());
        cpcBidCeilingMicros_ = null;
      }
      return cpcBidCeilingMicrosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.searchads360.v0.common.TargetOutrankShare)
  }

  // @@protoc_insertion_point(class_scope:google.ads.searchads360.v0.common.TargetOutrankShare)
  private static final com.google.ads.searchads360.v0.common.TargetOutrankShare DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.searchads360.v0.common.TargetOutrankShare();
  }

  public static com.google.ads.searchads360.v0.common.TargetOutrankShare getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetOutrankShare>
      PARSER = new com.google.protobuf.AbstractParser<TargetOutrankShare>() {
    @java.lang.Override
    public TargetOutrankShare parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetOutrankShare> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetOutrankShare> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.searchads360.v0.common.TargetOutrankShare getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
