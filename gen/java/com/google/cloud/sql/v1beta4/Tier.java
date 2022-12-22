// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_tiers.proto

package com.google.cloud.sql.v1beta4;

/**
 * <pre>
 * A Google Cloud SQL service tier resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1beta4.Tier}
 */
public final class Tier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.Tier)
    TierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Tier.newBuilder() to construct.
  private Tier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Tier() {
    tier_ = "";
    kind_ = "";
    region_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Tier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_Tier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_Tier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.Tier.class, com.google.cloud.sql.v1beta4.Tier.Builder.class);
  }

  public static final int TIER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tier_ = "";
  /**
   * <pre>
   * An identifier for the machine type, for example, `db-custom-1-3840`. For
   * related information, see [Pricing](/sql/pricing).
   * </pre>
   *
   * <code>string tier = 1;</code>
   * @return The tier.
   */
  @java.lang.Override
  public java.lang.String getTier() {
    java.lang.Object ref = tier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tier_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An identifier for the machine type, for example, `db-custom-1-3840`. For
   * related information, see [Pricing](/sql/pricing).
   * </pre>
   *
   * <code>string tier = 1;</code>
   * @return The bytes for tier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTierBytes() {
    java.lang.Object ref = tier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RAM_FIELD_NUMBER = 2;
  private long rAM_ = 0L;
  /**
   * <pre>
   * The maximum RAM usage of this tier in bytes.
   * </pre>
   *
   * <code>int64 RAM = 2;</code>
   * @return The rAM.
   */
  @java.lang.Override
  public long getRAM() {
    return rAM_;
  }

  public static final int KIND_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * This is always `sql#tier`.
   * </pre>
   *
   * <code>string kind = 3;</code>
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is always `sql#tier`.
   * </pre>
   *
   * <code>string kind = 3;</code>
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISK_QUOTA_FIELD_NUMBER = 4;
  private long diskQuota_ = 0L;
  /**
   * <pre>
   * The maximum disk size of this tier in bytes.
   * </pre>
   *
   * <code>int64 Disk_Quota = 4;</code>
   * @return The diskQuota.
   */
  @java.lang.Override
  public long getDiskQuota() {
    return diskQuota_;
  }

  public static final int REGION_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList region_;
  /**
   * <pre>
   * The applicable regions for this tier.
   * </pre>
   *
   * <code>repeated string region = 5;</code>
   * @return A list containing the region.
   */
  public com.google.protobuf.ProtocolStringList
      getRegionList() {
    return region_;
  }
  /**
   * <pre>
   * The applicable regions for this tier.
   * </pre>
   *
   * <code>repeated string region = 5;</code>
   * @return The count of region.
   */
  public int getRegionCount() {
    return region_.size();
  }
  /**
   * <pre>
   * The applicable regions for this tier.
   * </pre>
   *
   * <code>repeated string region = 5;</code>
   * @param index The index of the element to return.
   * @return The region at the given index.
   */
  public java.lang.String getRegion(int index) {
    return region_.get(index);
  }
  /**
   * <pre>
   * The applicable regions for this tier.
   * </pre>
   *
   * <code>repeated string region = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the region at the given index.
   */
  public com.google.protobuf.ByteString
      getRegionBytes(int index) {
    return region_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tier_);
    }
    if (rAM_ != 0L) {
      output.writeInt64(2, rAM_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kind_);
    }
    if (diskQuota_ != 0L) {
      output.writeInt64(4, diskQuota_);
    }
    for (int i = 0; i < region_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, region_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tier_);
    }
    if (rAM_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, rAM_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kind_);
    }
    if (diskQuota_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, diskQuota_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < region_.size(); i++) {
        dataSize += computeStringSizeNoTag(region_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRegionList().size();
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.Tier)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.Tier other = (com.google.cloud.sql.v1beta4.Tier) obj;

    if (!getTier()
        .equals(other.getTier())) return false;
    if (getRAM()
        != other.getRAM()) return false;
    if (!getKind()
        .equals(other.getKind())) return false;
    if (getDiskQuota()
        != other.getDiskQuota()) return false;
    if (!getRegionList()
        .equals(other.getRegionList())) return false;
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
    hash = (37 * hash) + TIER_FIELD_NUMBER;
    hash = (53 * hash) + getTier().hashCode();
    hash = (37 * hash) + RAM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRAM());
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (37 * hash) + DISK_QUOTA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDiskQuota());
    if (getRegionCount() > 0) {
      hash = (37 * hash) + REGION_FIELD_NUMBER;
      hash = (53 * hash) + getRegionList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.Tier parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.Tier prototype) {
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
   * A Google Cloud SQL service tier resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1beta4.Tier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.Tier)
      com.google.cloud.sql.v1beta4.TierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_Tier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_Tier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.Tier.class, com.google.cloud.sql.v1beta4.Tier.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.Tier.newBuilder()
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
      tier_ = "";
      rAM_ = 0L;
      kind_ = "";
      diskQuota_ = 0L;
      region_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_Tier_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.Tier getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.Tier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.Tier build() {
      com.google.cloud.sql.v1beta4.Tier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.Tier buildPartial() {
      com.google.cloud.sql.v1beta4.Tier result = new com.google.cloud.sql.v1beta4.Tier(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.sql.v1beta4.Tier result) {
      if (((bitField0_ & 0x00000010) != 0)) {
        region_ = region_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.region_ = region_;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.Tier result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tier_ = tier_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rAM_ = rAM_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.diskQuota_ = diskQuota_;
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
      if (other instanceof com.google.cloud.sql.v1beta4.Tier) {
        return mergeFrom((com.google.cloud.sql.v1beta4.Tier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.Tier other) {
      if (other == com.google.cloud.sql.v1beta4.Tier.getDefaultInstance()) return this;
      if (!other.getTier().isEmpty()) {
        tier_ = other.tier_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRAM() != 0L) {
        setRAM(other.getRAM());
      }
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getDiskQuota() != 0L) {
        setDiskQuota(other.getDiskQuota());
      }
      if (!other.region_.isEmpty()) {
        if (region_.isEmpty()) {
          region_ = other.region_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureRegionIsMutable();
          region_.addAll(other.region_);
        }
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
              tier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              rAM_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              kind_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              diskQuota_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureRegionIsMutable();
              region_.add(s);
              break;
            } // case 42
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

    private java.lang.Object tier_ = "";
    /**
     * <pre>
     * An identifier for the machine type, for example, `db-custom-1-3840`. For
     * related information, see [Pricing](/sql/pricing).
     * </pre>
     *
     * <code>string tier = 1;</code>
     * @return The tier.
     */
    public java.lang.String getTier() {
      java.lang.Object ref = tier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An identifier for the machine type, for example, `db-custom-1-3840`. For
     * related information, see [Pricing](/sql/pricing).
     * </pre>
     *
     * <code>string tier = 1;</code>
     * @return The bytes for tier.
     */
    public com.google.protobuf.ByteString
        getTierBytes() {
      java.lang.Object ref = tier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An identifier for the machine type, for example, `db-custom-1-3840`. For
     * related information, see [Pricing](/sql/pricing).
     * </pre>
     *
     * <code>string tier = 1;</code>
     * @param value The tier to set.
     * @return This builder for chaining.
     */
    public Builder setTier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An identifier for the machine type, for example, `db-custom-1-3840`. For
     * related information, see [Pricing](/sql/pricing).
     * </pre>
     *
     * <code>string tier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTier() {
      tier_ = getDefaultInstance().getTier();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An identifier for the machine type, for example, `db-custom-1-3840`. For
     * related information, see [Pricing](/sql/pricing).
     * </pre>
     *
     * <code>string tier = 1;</code>
     * @param value The bytes for tier to set.
     * @return This builder for chaining.
     */
    public Builder setTierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long rAM_ ;
    /**
     * <pre>
     * The maximum RAM usage of this tier in bytes.
     * </pre>
     *
     * <code>int64 RAM = 2;</code>
     * @return The rAM.
     */
    @java.lang.Override
    public long getRAM() {
      return rAM_;
    }
    /**
     * <pre>
     * The maximum RAM usage of this tier in bytes.
     * </pre>
     *
     * <code>int64 RAM = 2;</code>
     * @param value The rAM to set.
     * @return This builder for chaining.
     */
    public Builder setRAM(long value) {
      
      rAM_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum RAM usage of this tier in bytes.
     * </pre>
     *
     * <code>int64 RAM = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRAM() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rAM_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * This is always `sql#tier`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is always `sql#tier`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is always `sql#tier`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      kind_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always `sql#tier`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always `sql#tier`.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long diskQuota_ ;
    /**
     * <pre>
     * The maximum disk size of this tier in bytes.
     * </pre>
     *
     * <code>int64 Disk_Quota = 4;</code>
     * @return The diskQuota.
     */
    @java.lang.Override
    public long getDiskQuota() {
      return diskQuota_;
    }
    /**
     * <pre>
     * The maximum disk size of this tier in bytes.
     * </pre>
     *
     * <code>int64 Disk_Quota = 4;</code>
     * @param value The diskQuota to set.
     * @return This builder for chaining.
     */
    public Builder setDiskQuota(long value) {
      
      diskQuota_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum disk size of this tier in bytes.
     * </pre>
     *
     * <code>int64 Disk_Quota = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiskQuota() {
      bitField0_ = (bitField0_ & ~0x00000008);
      diskQuota_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList region_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRegionIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        region_ = new com.google.protobuf.LazyStringArrayList(region_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @return A list containing the region.
     */
    public com.google.protobuf.ProtocolStringList
        getRegionList() {
      return region_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @return The count of region.
     */
    public int getRegionCount() {
      return region_.size();
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @param index The index of the element to return.
     * @return The region at the given index.
     */
    public java.lang.String getRegion(int index) {
      return region_.get(index);
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the region at the given index.
     */
    public com.google.protobuf.ByteString
        getRegionBytes(int index) {
      return region_.getByteString(index);
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @param index The index to set the value at.
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRegionIsMutable();
      region_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @param value The region to add.
     * @return This builder for chaining.
     */
    public Builder addRegion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRegionIsMutable();
      region_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @param values The region to add.
     * @return This builder for chaining.
     */
    public Builder addAllRegion(
        java.lang.Iterable<java.lang.String> values) {
      ensureRegionIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, region_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      region_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The applicable regions for this tier.
     * </pre>
     *
     * <code>repeated string region = 5;</code>
     * @param value The bytes of the region to add.
     * @return This builder for chaining.
     */
    public Builder addRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureRegionIsMutable();
      region_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.Tier)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.Tier)
  private static final com.google.cloud.sql.v1beta4.Tier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.Tier();
  }

  public static com.google.cloud.sql.v1beta4.Tier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Tier>
      PARSER = new com.google.protobuf.AbstractParser<Tier>() {
    @java.lang.Override
    public Tier parsePartialFrom(
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

  public static com.google.protobuf.Parser<Tier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Tier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.Tier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
