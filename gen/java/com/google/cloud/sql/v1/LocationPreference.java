// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_resources.proto

package com.google.cloud.sql.v1;

/**
 * <pre>
 * Preferred location. This specifies where a Cloud SQL instance is located.
 * Note that if the preferred location is not available, the instance will be
 * located as close as possible within the region. Only one location may be
 * specified.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1.LocationPreference}
 */
public final class LocationPreference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1.LocationPreference)
    LocationPreferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocationPreference.newBuilder() to construct.
  private LocationPreference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationPreference() {
    followGaeApplication_ = "";
    zone_ = "";
    secondaryZone_ = "";
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocationPreference();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_LocationPreference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_LocationPreference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1.LocationPreference.class, com.google.cloud.sql.v1.LocationPreference.Builder.class);
  }

  public static final int FOLLOW_GAE_APPLICATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object followGaeApplication_ = "";
  /**
   * <pre>
   * The App Engine application to follow, it must be in the same region as the
   * Cloud SQL instance.
   * </pre>
   *
   * <code>string follow_gae_application = 1 [deprecated = true];</code>
   * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
   *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
   * @return The followGaeApplication.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getFollowGaeApplication() {
    java.lang.Object ref = followGaeApplication_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      followGaeApplication_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The App Engine application to follow, it must be in the same region as the
   * Cloud SQL instance.
   * </pre>
   *
   * <code>string follow_gae_application = 1 [deprecated = true];</code>
   * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
   *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
   * @return The bytes for followGaeApplication.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getFollowGaeApplicationBytes() {
    java.lang.Object ref = followGaeApplication_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      followGaeApplication_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";
  /**
   * <pre>
   * The preferred Compute Engine zone (for example: us-central1-a,
   * us-central1-b, etc.).
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The preferred Compute Engine zone (for example: us-central1-a,
   * us-central1-b, etc.).
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECONDARY_ZONE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object secondaryZone_ = "";
  /**
   * <pre>
   * The preferred Compute Engine zone for the secondary/failover
   * (for example: us-central1-a, us-central1-b, etc.).
   * Reserved for future use.
   * </pre>
   *
   * <code>string secondary_zone = 4;</code>
   * @return The secondaryZone.
   */
  @java.lang.Override
  public java.lang.String getSecondaryZone() {
    java.lang.Object ref = secondaryZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secondaryZone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The preferred Compute Engine zone for the secondary/failover
   * (for example: us-central1-a, us-central1-b, etc.).
   * Reserved for future use.
   * </pre>
   *
   * <code>string secondary_zone = 4;</code>
   * @return The bytes for secondaryZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecondaryZoneBytes() {
    java.lang.Object ref = secondaryZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secondaryZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KIND_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * This is always **sql#locationPreference**.
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
   * This is always **sql#locationPreference**.
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(followGaeApplication_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, followGaeApplication_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondaryZone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, secondaryZone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(followGaeApplication_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, followGaeApplication_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondaryZone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, secondaryZone_);
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
    if (!(obj instanceof com.google.cloud.sql.v1.LocationPreference)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1.LocationPreference other = (com.google.cloud.sql.v1.LocationPreference) obj;

    if (!getFollowGaeApplication()
        .equals(other.getFollowGaeApplication())) return false;
    if (!getZone()
        .equals(other.getZone())) return false;
    if (!getSecondaryZone()
        .equals(other.getSecondaryZone())) return false;
    if (!getKind()
        .equals(other.getKind())) return false;
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
    hash = (37 * hash) + FOLLOW_GAE_APPLICATION_FIELD_NUMBER;
    hash = (53 * hash) + getFollowGaeApplication().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + SECONDARY_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getSecondaryZone().hashCode();
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.LocationPreference parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1.LocationPreference prototype) {
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
   * Preferred location. This specifies where a Cloud SQL instance is located.
   * Note that if the preferred location is not available, the instance will be
   * located as close as possible within the region. Only one location may be
   * specified.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1.LocationPreference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1.LocationPreference)
      com.google.cloud.sql.v1.LocationPreferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_LocationPreference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_LocationPreference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1.LocationPreference.class, com.google.cloud.sql.v1.LocationPreference.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1.LocationPreference.newBuilder()
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
      followGaeApplication_ = "";
      zone_ = "";
      secondaryZone_ = "";
      kind_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_LocationPreference_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.LocationPreference getDefaultInstanceForType() {
      return com.google.cloud.sql.v1.LocationPreference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.LocationPreference build() {
      com.google.cloud.sql.v1.LocationPreference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.LocationPreference buildPartial() {
      com.google.cloud.sql.v1.LocationPreference result = new com.google.cloud.sql.v1.LocationPreference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1.LocationPreference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.followGaeApplication_ = followGaeApplication_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.zone_ = zone_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.secondaryZone_ = secondaryZone_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.kind_ = kind_;
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
      if (other instanceof com.google.cloud.sql.v1.LocationPreference) {
        return mergeFrom((com.google.cloud.sql.v1.LocationPreference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1.LocationPreference other) {
      if (other == com.google.cloud.sql.v1.LocationPreference.getDefaultInstance()) return this;
      if (!other.getFollowGaeApplication().isEmpty()) {
        followGaeApplication_ = other.followGaeApplication_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSecondaryZone().isEmpty()) {
        secondaryZone_ = other.secondaryZone_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000008;
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
              followGaeApplication_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              zone_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              kind_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 26
            case 34: {
              secondaryZone_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private java.lang.Object followGaeApplication_ = "";
    /**
     * <pre>
     * The App Engine application to follow, it must be in the same region as the
     * Cloud SQL instance.
     * </pre>
     *
     * <code>string follow_gae_application = 1 [deprecated = true];</code>
     * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
     *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
     * @return The followGaeApplication.
     */
    @java.lang.Deprecated public java.lang.String getFollowGaeApplication() {
      java.lang.Object ref = followGaeApplication_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        followGaeApplication_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The App Engine application to follow, it must be in the same region as the
     * Cloud SQL instance.
     * </pre>
     *
     * <code>string follow_gae_application = 1 [deprecated = true];</code>
     * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
     *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
     * @return The bytes for followGaeApplication.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getFollowGaeApplicationBytes() {
      java.lang.Object ref = followGaeApplication_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        followGaeApplication_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The App Engine application to follow, it must be in the same region as the
     * Cloud SQL instance.
     * </pre>
     *
     * <code>string follow_gae_application = 1 [deprecated = true];</code>
     * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
     *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
     * @param value The followGaeApplication to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setFollowGaeApplication(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      followGaeApplication_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The App Engine application to follow, it must be in the same region as the
     * Cloud SQL instance.
     * </pre>
     *
     * <code>string follow_gae_application = 1 [deprecated = true];</code>
     * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
     *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearFollowGaeApplication() {
      followGaeApplication_ = getDefaultInstance().getFollowGaeApplication();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The App Engine application to follow, it must be in the same region as the
     * Cloud SQL instance.
     * </pre>
     *
     * <code>string follow_gae_application = 1 [deprecated = true];</code>
     * @deprecated google.cloud.sql.v1.LocationPreference.follow_gae_application is deprecated.
     *     See google/cloud/sql/v1/cloud_sql_resources.proto;l=468
     * @param value The bytes for followGaeApplication to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setFollowGaeApplicationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      followGaeApplication_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * The preferred Compute Engine zone (for example: us-central1-a,
     * us-central1-b, etc.).
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The preferred Compute Engine zone (for example: us-central1-a,
     * us-central1-b, etc.).
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The preferred Compute Engine zone (for example: us-central1-a,
     * us-central1-b, etc.).
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferred Compute Engine zone (for example: us-central1-a,
     * us-central1-b, etc.).
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferred Compute Engine zone (for example: us-central1-a,
     * us-central1-b, etc.).
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object secondaryZone_ = "";
    /**
     * <pre>
     * The preferred Compute Engine zone for the secondary/failover
     * (for example: us-central1-a, us-central1-b, etc.).
     * Reserved for future use.
     * </pre>
     *
     * <code>string secondary_zone = 4;</code>
     * @return The secondaryZone.
     */
    public java.lang.String getSecondaryZone() {
      java.lang.Object ref = secondaryZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secondaryZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The preferred Compute Engine zone for the secondary/failover
     * (for example: us-central1-a, us-central1-b, etc.).
     * Reserved for future use.
     * </pre>
     *
     * <code>string secondary_zone = 4;</code>
     * @return The bytes for secondaryZone.
     */
    public com.google.protobuf.ByteString
        getSecondaryZoneBytes() {
      java.lang.Object ref = secondaryZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secondaryZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The preferred Compute Engine zone for the secondary/failover
     * (for example: us-central1-a, us-central1-b, etc.).
     * Reserved for future use.
     * </pre>
     *
     * <code>string secondary_zone = 4;</code>
     * @param value The secondaryZone to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      secondaryZone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferred Compute Engine zone for the secondary/failover
     * (for example: us-central1-a, us-central1-b, etc.).
     * Reserved for future use.
     * </pre>
     *
     * <code>string secondary_zone = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondaryZone() {
      secondaryZone_ = getDefaultInstance().getSecondaryZone();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferred Compute Engine zone for the secondary/failover
     * (for example: us-central1-a, us-central1-b, etc.).
     * Reserved for future use.
     * </pre>
     *
     * <code>string secondary_zone = 4;</code>
     * @param value The bytes for secondaryZone to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      secondaryZone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * This is always **sql#locationPreference**.
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
     * This is always **sql#locationPreference**.
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
     * This is always **sql#locationPreference**.
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
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always **sql#locationPreference**.
     * </pre>
     *
     * <code>string kind = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always **sql#locationPreference**.
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
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1.LocationPreference)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1.LocationPreference)
  private static final com.google.cloud.sql.v1.LocationPreference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1.LocationPreference();
  }

  public static com.google.cloud.sql.v1.LocationPreference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationPreference>
      PARSER = new com.google.protobuf.AbstractParser<LocationPreference>() {
    @java.lang.Override
    public LocationPreference parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationPreference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationPreference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1.LocationPreference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
