// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

/**
 * <pre>
 * Request for restricting list of available resources in Workload environment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest}
 */
public final class RestrictAllowedResourcesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)
    RestrictAllowedResourcesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RestrictAllowedResourcesRequest.newBuilder() to construct.
  private RestrictAllowedResourcesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RestrictAllowedResourcesRequest() {
    name_ = "";
    restrictionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RestrictAllowedResourcesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_RestrictAllowedResourcesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_RestrictAllowedResourcesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.class, com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.Builder.class);
  }

  /**
   * <pre>
   * The type of restriction.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType}
   */
  public enum RestrictionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown restriction type.
     * </pre>
     *
     * <code>RESTRICTION_TYPE_UNSPECIFIED = 0;</code>
     */
    RESTRICTION_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Allow the use all of all gcp products, irrespective of the compliance
     * posture. This effectively removes gcp.restrictServiceUsage OrgPolicy
     * on the AssuredWorkloads Folder.
     * </pre>
     *
     * <code>ALLOW_ALL_GCP_RESOURCES = 1;</code>
     */
    ALLOW_ALL_GCP_RESOURCES(1),
    /**
     * <pre>
     * Based on Workload's compliance regime, allowed list changes.
     * See - https://cloud.google.com/assured-workloads/docs/supported-products
     * for the list of supported resources.
     * </pre>
     *
     * <code>ALLOW_COMPLIANT_RESOURCES = 2;</code>
     */
    ALLOW_COMPLIANT_RESOURCES(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unknown restriction type.
     * </pre>
     *
     * <code>RESTRICTION_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int RESTRICTION_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Allow the use all of all gcp products, irrespective of the compliance
     * posture. This effectively removes gcp.restrictServiceUsage OrgPolicy
     * on the AssuredWorkloads Folder.
     * </pre>
     *
     * <code>ALLOW_ALL_GCP_RESOURCES = 1;</code>
     */
    public static final int ALLOW_ALL_GCP_RESOURCES_VALUE = 1;
    /**
     * <pre>
     * Based on Workload's compliance regime, allowed list changes.
     * See - https://cloud.google.com/assured-workloads/docs/supported-products
     * for the list of supported resources.
     * </pre>
     *
     * <code>ALLOW_COMPLIANT_RESOURCES = 2;</code>
     */
    public static final int ALLOW_COMPLIANT_RESOURCES_VALUE = 2;


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
    public static RestrictionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RestrictionType forNumber(int value) {
      switch (value) {
        case 0: return RESTRICTION_TYPE_UNSPECIFIED;
        case 1: return ALLOW_ALL_GCP_RESOURCES;
        case 2: return ALLOW_COMPLIANT_RESOURCES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RestrictionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RestrictionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RestrictionType>() {
            public RestrictionType findValueByNumber(int number) {
              return RestrictionType.forNumber(number);
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
      return com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final RestrictionType[] VALUES = values();

    public static RestrictionType valueOf(
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

    private RestrictionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The resource name of the Workload. This is the workloads's
   * relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the Workload. This is the workloads's
   * relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESTRICTION_TYPE_FIELD_NUMBER = 2;
  private int restrictionType_ = 0;
  /**
   * <pre>
   * Required. The type of restriction for using gcp products in the Workload environment.
   * </pre>
   *
   * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for restrictionType.
   */
  @java.lang.Override public int getRestrictionTypeValue() {
    return restrictionType_;
  }
  /**
   * <pre>
   * Required. The type of restriction for using gcp products in the Workload environment.
   * </pre>
   *
   * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The restrictionType.
   */
  @java.lang.Override public com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType getRestrictionType() {
    com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType result = com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType.forNumber(restrictionType_);
    return result == null ? com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (restrictionType_ != com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType.RESTRICTION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, restrictionType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (restrictionType_ != com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType.RESTRICTION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, restrictionType_);
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
    if (!(obj instanceof com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest other = (com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (restrictionType_ != other.restrictionType_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RESTRICTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + restrictionType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest prototype) {
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
   * Request for restricting list of available resources in Workload environment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)
      com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_RestrictAllowedResourcesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_RestrictAllowedResourcesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.class, com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.Builder.class);
    }

    // Construct using com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.newBuilder()
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
      name_ = "";
      restrictionType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1_RestrictAllowedResourcesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest getDefaultInstanceForType() {
      return com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest build() {
      com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest buildPartial() {
      com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest result = new com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.restrictionType_ = restrictionType_;
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
      if (other instanceof com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest) {
        return mergeFrom((com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest other) {
      if (other == com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.restrictionType_ != 0) {
        setRestrictionTypeValue(other.getRestrictionTypeValue());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              restrictionType_ = input.readEnum();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource name of the Workload. This is the workloads's
     * relative path in the API, formatted as
     * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
     * For example,
     * "organizations/123/locations/us-east1/workloads/assured-workload-1".
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Workload. This is the workloads's
     * relative path in the API, formatted as
     * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
     * For example,
     * "organizations/123/locations/us-east1/workloads/assured-workload-1".
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Workload. This is the workloads's
     * relative path in the API, formatted as
     * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
     * For example,
     * "organizations/123/locations/us-east1/workloads/assured-workload-1".
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Workload. This is the workloads's
     * relative path in the API, formatted as
     * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
     * For example,
     * "organizations/123/locations/us-east1/workloads/assured-workload-1".
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Workload. This is the workloads's
     * relative path in the API, formatted as
     * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
     * For example,
     * "organizations/123/locations/us-east1/workloads/assured-workload-1".
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int restrictionType_ = 0;
    /**
     * <pre>
     * Required. The type of restriction for using gcp products in the Workload environment.
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for restrictionType.
     */
    @java.lang.Override public int getRestrictionTypeValue() {
      return restrictionType_;
    }
    /**
     * <pre>
     * Required. The type of restriction for using gcp products in the Workload environment.
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for restrictionType to set.
     * @return This builder for chaining.
     */
    public Builder setRestrictionTypeValue(int value) {
      restrictionType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of restriction for using gcp products in the Workload environment.
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The restrictionType.
     */
    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType getRestrictionType() {
      com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType result = com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType.forNumber(restrictionType_);
      return result == null ? com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The type of restriction for using gcp products in the Workload environment.
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The restrictionType to set.
     * @return This builder for chaining.
     */
    public Builder setRestrictionType(com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      restrictionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of restriction for using gcp products in the Workload environment.
     * </pre>
     *
     * <code>.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearRestrictionType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      restrictionType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)
  private static final com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest();
  }

  public static com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestrictAllowedResourcesRequest>
      PARSER = new com.google.protobuf.AbstractParser<RestrictAllowedResourcesRequest>() {
    @java.lang.Override
    public RestrictAllowedResourcesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RestrictAllowedResourcesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestrictAllowedResourcesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
