// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto

package com.google.cloud.clouddms.logging.v1;

/**
 * <pre>
 * An Oracle connection profile.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.logging.v1.OracleConnectionProfile}
 */
public final class OracleConnectionProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.logging.v1.OracleConnectionProfile)
    OracleConnectionProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OracleConnectionProfile.newBuilder() to construct.
  private OracleConnectionProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OracleConnectionProfile() {
    connectivityType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OracleConnectionProfile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.class, com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.Builder.class);
  }

  /**
   * <pre>
   * Connectivity options used to establish a connection to the profile.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType}
   */
  public enum ConnectivityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No data defined.
     * </pre>
     *
     * <code>CONNECTIVITY_TYPE_UNSPECIFIED = 0;</code>
     */
    CONNECTIVITY_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Static Service IP connectivity.
     * </pre>
     *
     * <code>STATIC_SERVICE_IP = 1;</code>
     */
    STATIC_SERVICE_IP(1),
    /**
     * <pre>
     * Forward SSH tunnel connectivity.
     * </pre>
     *
     * <code>FORWARD_SSH_TUNNEL = 2;</code>
     */
    FORWARD_SSH_TUNNEL(2),
    /**
     * <pre>
     * Private connectivity.
     * </pre>
     *
     * <code>PRIVATE_CONNECTIVITY = 3;</code>
     */
    PRIVATE_CONNECTIVITY(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No data defined.
     * </pre>
     *
     * <code>CONNECTIVITY_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int CONNECTIVITY_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Static Service IP connectivity.
     * </pre>
     *
     * <code>STATIC_SERVICE_IP = 1;</code>
     */
    public static final int STATIC_SERVICE_IP_VALUE = 1;
    /**
     * <pre>
     * Forward SSH tunnel connectivity.
     * </pre>
     *
     * <code>FORWARD_SSH_TUNNEL = 2;</code>
     */
    public static final int FORWARD_SSH_TUNNEL_VALUE = 2;
    /**
     * <pre>
     * Private connectivity.
     * </pre>
     *
     * <code>PRIVATE_CONNECTIVITY = 3;</code>
     */
    public static final int PRIVATE_CONNECTIVITY_VALUE = 3;


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
    public static ConnectivityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConnectivityType forNumber(int value) {
      switch (value) {
        case 0: return CONNECTIVITY_TYPE_UNSPECIFIED;
        case 1: return STATIC_SERVICE_IP;
        case 2: return FORWARD_SSH_TUNNEL;
        case 3: return PRIVATE_CONNECTIVITY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConnectivityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConnectivityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConnectivityType>() {
            public ConnectivityType findValueByNumber(int number) {
              return ConnectivityType.forNumber(number);
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
      return com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConnectivityType[] VALUES = values();

    public static ConnectivityType valueOf(
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

    private ConnectivityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType)
  }

  public static final int CONNECTIVITY_TYPE_FIELD_NUMBER = 1;
  private int connectivityType_ = 0;
  /**
   * <pre>
   * Required. Type of connectivity to source database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for connectivityType.
   */
  @java.lang.Override public int getConnectivityTypeValue() {
    return connectivityType_;
  }
  /**
   * <pre>
   * Required. Type of connectivity to source database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The connectivityType.
   */
  @java.lang.Override public com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType getConnectivityType() {
    com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType result = com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType.forNumber(connectivityType_);
    return result == null ? com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType.UNRECOGNIZED : result;
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
    if (connectivityType_ != com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType.CONNECTIVITY_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, connectivityType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (connectivityType_ != com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType.CONNECTIVITY_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, connectivityType_);
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
    if (!(obj instanceof com.google.cloud.clouddms.logging.v1.OracleConnectionProfile)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.logging.v1.OracleConnectionProfile other = (com.google.cloud.clouddms.logging.v1.OracleConnectionProfile) obj;

    if (connectivityType_ != other.connectivityType_) return false;
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
    hash = (37 * hash) + CONNECTIVITY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + connectivityType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile parseFrom(
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
  public static Builder newBuilder(com.google.cloud.clouddms.logging.v1.OracleConnectionProfile prototype) {
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
   * An Oracle connection profile.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.logging.v1.OracleConnectionProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.logging.v1.OracleConnectionProfile)
      com.google.cloud.clouddms.logging.v1.OracleConnectionProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.class, com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.newBuilder()
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
      connectivityType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.clouddms.logging.v1.ClouddmsPlatformLogsProto.internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.OracleConnectionProfile getDefaultInstanceForType() {
      return com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.OracleConnectionProfile build() {
      com.google.cloud.clouddms.logging.v1.OracleConnectionProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.OracleConnectionProfile buildPartial() {
      com.google.cloud.clouddms.logging.v1.OracleConnectionProfile result = new com.google.cloud.clouddms.logging.v1.OracleConnectionProfile(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.logging.v1.OracleConnectionProfile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connectivityType_ = connectivityType_;
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
      if (other instanceof com.google.cloud.clouddms.logging.v1.OracleConnectionProfile) {
        return mergeFrom((com.google.cloud.clouddms.logging.v1.OracleConnectionProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.logging.v1.OracleConnectionProfile other) {
      if (other == com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.getDefaultInstance()) return this;
      if (other.connectivityType_ != 0) {
        setConnectivityTypeValue(other.getConnectivityTypeValue());
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
              connectivityType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int connectivityType_ = 0;
    /**
     * <pre>
     * Required. Type of connectivity to source database.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for connectivityType.
     */
    @java.lang.Override public int getConnectivityTypeValue() {
      return connectivityType_;
    }
    /**
     * <pre>
     * Required. Type of connectivity to source database.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for connectivityType to set.
     * @return This builder for chaining.
     */
    public Builder setConnectivityTypeValue(int value) {
      connectivityType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Type of connectivity to source database.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The connectivityType.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType getConnectivityType() {
      com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType result = com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType.forNumber(connectivityType_);
      return result == null ? com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. Type of connectivity to source database.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The connectivityType to set.
     * @return This builder for chaining.
     */
    public Builder setConnectivityType(com.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      connectivityType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Type of connectivity to source database.
     * </pre>
     *
     * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityType connectivity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectivityType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      connectivityType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.logging.v1.OracleConnectionProfile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.logging.v1.OracleConnectionProfile)
  private static final com.google.cloud.clouddms.logging.v1.OracleConnectionProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.logging.v1.OracleConnectionProfile();
  }

  public static com.google.cloud.clouddms.logging.v1.OracleConnectionProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleConnectionProfile>
      PARSER = new com.google.protobuf.AbstractParser<OracleConnectionProfile>() {
    @java.lang.Override
    public OracleConnectionProfile parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleConnectionProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleConnectionProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.logging.v1.OracleConnectionProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
