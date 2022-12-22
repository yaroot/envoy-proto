// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto

package com.google.cloud.clouddms.logging.v1;

/**
 * <pre>
 * An PostgreSQL connection profile.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile}
 */
public final class PostgreSqlConnectionProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile)
    PostgreSqlConnectionProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostgreSqlConnectionProfile.newBuilder() to construct.
  private PostgreSqlConnectionProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostgreSqlConnectionProfile() {
    version_ = 0;
    cloudSqlId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostgreSqlConnectionProfile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.class, com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Builder.class);
  }

  /**
   * <pre>
   * The PostgreSQL database version.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version}
   */
  public enum Version
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified version.
     * </pre>
     *
     * <code>VERSION_UNSPECIFIED = 0;</code>
     */
    VERSION_UNSPECIFIED(0),
    /**
     * <pre>
     * PostgreSQL 9.6.
     * </pre>
     *
     * <code>V9_6 = 1;</code>
     */
    V9_6(1),
    /**
     * <pre>
     * PostgreSQL 11.
     * </pre>
     *
     * <code>V11 = 2;</code>
     */
    V11(2),
    /**
     * <pre>
     * PostgreSQL 10.
     * </pre>
     *
     * <code>V10 = 3;</code>
     */
    V10(3),
    /**
     * <pre>
     * PostgreSQL 12.
     * </pre>
     *
     * <code>V12 = 4;</code>
     */
    V12(4),
    /**
     * <pre>
     * PostgreSQL 13.
     * </pre>
     *
     * <code>V13 = 5;</code>
     */
    V13(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified version.
     * </pre>
     *
     * <code>VERSION_UNSPECIFIED = 0;</code>
     */
    public static final int VERSION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * PostgreSQL 9.6.
     * </pre>
     *
     * <code>V9_6 = 1;</code>
     */
    public static final int V9_6_VALUE = 1;
    /**
     * <pre>
     * PostgreSQL 11.
     * </pre>
     *
     * <code>V11 = 2;</code>
     */
    public static final int V11_VALUE = 2;
    /**
     * <pre>
     * PostgreSQL 10.
     * </pre>
     *
     * <code>V10 = 3;</code>
     */
    public static final int V10_VALUE = 3;
    /**
     * <pre>
     * PostgreSQL 12.
     * </pre>
     *
     * <code>V12 = 4;</code>
     */
    public static final int V12_VALUE = 4;
    /**
     * <pre>
     * PostgreSQL 13.
     * </pre>
     *
     * <code>V13 = 5;</code>
     */
    public static final int V13_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Version valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Version forNumber(int value) {
      switch (value) {
        case 0: return VERSION_UNSPECIFIED;
        case 1: return V9_6;
        case 2: return V11;
        case 3: return V10;
        case 4: return V12;
        case 5: return V13;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Version>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Version> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Version>() {
            public Version findValueByNumber(int number) {
              return Version.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.getDescriptor().getEnumTypes().get(0);
    }

    private static final Version[] VALUES = values();

    public static Version valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Version(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version)
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_ = 0;
  /**
   * <pre>
   * The database version.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
   * @return The enum numeric value on the wire for version.
   */
  @java.lang.Override public int getVersionValue() {
    return version_;
  }
  /**
   * <pre>
   * The database version.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
   * @return The version.
   */
  @java.lang.Override public com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version getVersion() {
    com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version result = com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version.forNumber(version_);
    return result == null ? com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version.UNRECOGNIZED : result;
  }

  public static final int CLOUD_SQL_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cloudSqlId_ = "";
  /**
   * <pre>
   * The Cloud SQL id for a Cloud SQL instance.
   * </pre>
   *
   * <code>string cloud_sql_id = 2;</code>
   * @return The cloudSqlId.
   */
  @java.lang.Override
  public java.lang.String getCloudSqlId() {
    java.lang.Object ref = cloudSqlId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cloudSqlId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Cloud SQL id for a Cloud SQL instance.
   * </pre>
   *
   * <code>string cloud_sql_id = 2;</code>
   * @return The bytes for cloudSqlId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCloudSqlIdBytes() {
    java.lang.Object ref = cloudSqlId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cloudSqlId_ = b;
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
    if (version_ != com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version.VERSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudSqlId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cloudSqlId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version.VERSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudSqlId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cloudSqlId_);
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
    if (!(obj instanceof com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile other = (com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile) obj;

    if (version_ != other.version_) return false;
    if (!getCloudSqlId()
        .equals(other.getCloudSqlId())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + version_;
    hash = (37 * hash) + CLOUD_SQL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCloudSqlId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile parseFrom(
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
  public static Builder newBuilder(com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile prototype) {
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
   * An PostgreSQL connection profile.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile)
      com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.class, com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.newBuilder()
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
      version_ = 0;
      cloudSqlId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile getDefaultInstanceForType() {
      return com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile build() {
      com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile buildPartial() {
      com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile result = new com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cloudSqlId_ = cloudSqlId_;
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
      if (other instanceof com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile) {
        return mergeFrom((com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile other) {
      if (other == com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.getDefaultInstance()) return this;
      if (other.version_ != 0) {
        setVersionValue(other.getVersionValue());
      }
      if (!other.getCloudSqlId().isEmpty()) {
        cloudSqlId_ = other.cloudSqlId_;
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
            case 8: {
              version_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              cloudSqlId_ = input.readStringRequireUtf8();
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

    private int version_ = 0;
    /**
     * <pre>
     * The database version.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
     * @return The enum numeric value on the wire for version.
     */
    @java.lang.Override public int getVersionValue() {
      return version_;
    }
    /**
     * <pre>
     * The database version.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
     * @param value The enum numeric value on the wire for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionValue(int value) {
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The database version.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version getVersion() {
      com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version result = com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version.forNumber(version_);
      return result == null ? com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The database version.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      version_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The database version.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cloudSqlId_ = "";
    /**
     * <pre>
     * The Cloud SQL id for a Cloud SQL instance.
     * </pre>
     *
     * <code>string cloud_sql_id = 2;</code>
     * @return The cloudSqlId.
     */
    public java.lang.String getCloudSqlId() {
      java.lang.Object ref = cloudSqlId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cloudSqlId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Cloud SQL id for a Cloud SQL instance.
     * </pre>
     *
     * <code>string cloud_sql_id = 2;</code>
     * @return The bytes for cloudSqlId.
     */
    public com.google.protobuf.ByteString
        getCloudSqlIdBytes() {
      java.lang.Object ref = cloudSqlId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cloudSqlId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Cloud SQL id for a Cloud SQL instance.
     * </pre>
     *
     * <code>string cloud_sql_id = 2;</code>
     * @param value The cloudSqlId to set.
     * @return This builder for chaining.
     */
    public Builder setCloudSqlId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cloudSqlId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud SQL id for a Cloud SQL instance.
     * </pre>
     *
     * <code>string cloud_sql_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCloudSqlId() {
      cloudSqlId_ = getDefaultInstance().getCloudSqlId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud SQL id for a Cloud SQL instance.
     * </pre>
     *
     * <code>string cloud_sql_id = 2;</code>
     * @param value The bytes for cloudSqlId to set.
     * @return This builder for chaining.
     */
    public Builder setCloudSqlIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cloudSqlId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile)
  private static final com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile();
  }

  public static com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostgreSqlConnectionProfile>
      PARSER = new com.google.protobuf.AbstractParser<PostgreSqlConnectionProfile>() {
    @java.lang.Override
    public PostgreSqlConnectionProfile parsePartialFrom(
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

  public static com.google.protobuf.Parser<PostgreSqlConnectionProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostgreSqlConnectionProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
