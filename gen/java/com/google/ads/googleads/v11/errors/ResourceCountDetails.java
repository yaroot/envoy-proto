// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/errors/errors.proto

package com.google.ads.googleads.v11.errors;

/**
 * <pre>
 * Error details returned when an resource count limit was exceeded.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.errors.ResourceCountDetails}
 */
public final class ResourceCountDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.errors.ResourceCountDetails)
    ResourceCountDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceCountDetails.newBuilder() to construct.
  private ResourceCountDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceCountDetails() {
    enclosingId_ = "";
    enclosingResource_ = "";
    limitType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceCountDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.errors.ErrorsProto.internal_static_google_ads_googleads_v11_errors_ResourceCountDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.errors.ErrorsProto.internal_static_google_ads_googleads_v11_errors_ResourceCountDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.errors.ResourceCountDetails.class, com.google.ads.googleads.v11.errors.ResourceCountDetails.Builder.class);
  }

  public static final int ENCLOSING_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object enclosingId_ = "";
  /**
   * <pre>
   * The ID of the resource whose limit was exceeded.
   * External customer ID if the limit is for a customer.
   * </pre>
   *
   * <code>string enclosing_id = 1;</code>
   * @return The enclosingId.
   */
  @java.lang.Override
  public java.lang.String getEnclosingId() {
    java.lang.Object ref = enclosingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      enclosingId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the resource whose limit was exceeded.
   * External customer ID if the limit is for a customer.
   * </pre>
   *
   * <code>string enclosing_id = 1;</code>
   * @return The bytes for enclosingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnclosingIdBytes() {
    java.lang.Object ref = enclosingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      enclosingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCLOSING_RESOURCE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object enclosingResource_ = "";
  /**
   * <pre>
   * The name of the resource (Customer, Campaign etc.) whose limit was
   * exceeded.
   * </pre>
   *
   * <code>string enclosing_resource = 5;</code>
   * @return The enclosingResource.
   */
  @java.lang.Override
  public java.lang.String getEnclosingResource() {
    java.lang.Object ref = enclosingResource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      enclosingResource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the resource (Customer, Campaign etc.) whose limit was
   * exceeded.
   * </pre>
   *
   * <code>string enclosing_resource = 5;</code>
   * @return The bytes for enclosingResource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnclosingResourceBytes() {
    java.lang.Object ref = enclosingResource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      enclosingResource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private int limit_ = 0;
  /**
   * <pre>
   * The limit which was exceeded.
   * </pre>
   *
   * <code>int32 limit = 2;</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
  }

  public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
  private int limitType_ = 0;
  /**
   * <pre>
   * The resource limit type which was exceeded.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
   * @return The enum numeric value on the wire for limitType.
   */
  @java.lang.Override public int getLimitTypeValue() {
    return limitType_;
  }
  /**
   * <pre>
   * The resource limit type which was exceeded.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
   * @return The limitType.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType getLimitType() {
    com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType result = com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType.forNumber(limitType_);
    return result == null ? com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType.UNRECOGNIZED : result;
  }

  public static final int EXISTING_COUNT_FIELD_NUMBER = 4;
  private int existingCount_ = 0;
  /**
   * <pre>
   * The count of existing entities.
   * </pre>
   *
   * <code>int32 existing_count = 4;</code>
   * @return The existingCount.
   */
  @java.lang.Override
  public int getExistingCount() {
    return existingCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enclosingId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, enclosingId_);
    }
    if (limit_ != 0) {
      output.writeInt32(2, limit_);
    }
    if (limitType_ != com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, limitType_);
    }
    if (existingCount_ != 0) {
      output.writeInt32(4, existingCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enclosingResource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, enclosingResource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enclosingId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, enclosingId_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, limit_);
    }
    if (limitType_ != com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, limitType_);
    }
    if (existingCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, existingCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enclosingResource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, enclosingResource_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.errors.ResourceCountDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.errors.ResourceCountDetails other = (com.google.ads.googleads.v11.errors.ResourceCountDetails) obj;

    if (!getEnclosingId()
        .equals(other.getEnclosingId())) return false;
    if (!getEnclosingResource()
        .equals(other.getEnclosingResource())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (limitType_ != other.limitType_) return false;
    if (getExistingCount()
        != other.getExistingCount()) return false;
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
    hash = (37 * hash) + ENCLOSING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEnclosingId().hashCode();
    hash = (37 * hash) + ENCLOSING_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getEnclosingResource().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + LIMIT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + limitType_;
    hash = (37 * hash) + EXISTING_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getExistingCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.ResourceCountDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.errors.ResourceCountDetails prototype) {
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
   * Error details returned when an resource count limit was exceeded.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.errors.ResourceCountDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.errors.ResourceCountDetails)
      com.google.ads.googleads.v11.errors.ResourceCountDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.errors.ErrorsProto.internal_static_google_ads_googleads_v11_errors_ResourceCountDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.errors.ErrorsProto.internal_static_google_ads_googleads_v11_errors_ResourceCountDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.errors.ResourceCountDetails.class, com.google.ads.googleads.v11.errors.ResourceCountDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.errors.ResourceCountDetails.newBuilder()
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
      enclosingId_ = "";
      enclosingResource_ = "";
      limit_ = 0;
      limitType_ = 0;
      existingCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.errors.ErrorsProto.internal_static_google_ads_googleads_v11_errors_ResourceCountDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.ResourceCountDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.errors.ResourceCountDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.ResourceCountDetails build() {
      com.google.ads.googleads.v11.errors.ResourceCountDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.ResourceCountDetails buildPartial() {
      com.google.ads.googleads.v11.errors.ResourceCountDetails result = new com.google.ads.googleads.v11.errors.ResourceCountDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.errors.ResourceCountDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enclosingId_ = enclosingId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enclosingResource_ = enclosingResource_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.limitType_ = limitType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.existingCount_ = existingCount_;
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
      if (other instanceof com.google.ads.googleads.v11.errors.ResourceCountDetails) {
        return mergeFrom((com.google.ads.googleads.v11.errors.ResourceCountDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.errors.ResourceCountDetails other) {
      if (other == com.google.ads.googleads.v11.errors.ResourceCountDetails.getDefaultInstance()) return this;
      if (!other.getEnclosingId().isEmpty()) {
        enclosingId_ = other.enclosingId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEnclosingResource().isEmpty()) {
        enclosingResource_ = other.enclosingResource_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.limitType_ != 0) {
        setLimitTypeValue(other.getLimitTypeValue());
      }
      if (other.getExistingCount() != 0) {
        setExistingCount(other.getExistingCount());
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
              enclosingId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              limit_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 16
            case 24: {
              limitType_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 24
            case 32: {
              existingCount_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 32
            case 42: {
              enclosingResource_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object enclosingId_ = "";
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @return The enclosingId.
     */
    public java.lang.String getEnclosingId() {
      java.lang.Object ref = enclosingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enclosingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @return The bytes for enclosingId.
     */
    public com.google.protobuf.ByteString
        getEnclosingIdBytes() {
      java.lang.Object ref = enclosingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        enclosingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @param value The enclosingId to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      enclosingId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnclosingId() {
      enclosingId_ = getDefaultInstance().getEnclosingId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @param value The bytes for enclosingId to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      enclosingId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object enclosingResource_ = "";
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @return The enclosingResource.
     */
    public java.lang.String getEnclosingResource() {
      java.lang.Object ref = enclosingResource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enclosingResource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @return The bytes for enclosingResource.
     */
    public com.google.protobuf.ByteString
        getEnclosingResourceBytes() {
      java.lang.Object ref = enclosingResource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        enclosingResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @param value The enclosingResource to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingResource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      enclosingResource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnclosingResource() {
      enclosingResource_ = getDefaultInstance().getEnclosingResource();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @param value The bytes for enclosingResource to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      enclosingResource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     * The limit which was exceeded.
     * </pre>
     *
     * <code>int32 limit = 2;</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * The limit which was exceeded.
     * </pre>
     *
     * <code>int32 limit = 2;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The limit which was exceeded.
     * </pre>
     *
     * <code>int32 limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000004);
      limit_ = 0;
      onChanged();
      return this;
    }

    private int limitType_ = 0;
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @return The enum numeric value on the wire for limitType.
     */
    @java.lang.Override public int getLimitTypeValue() {
      return limitType_;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @param value The enum numeric value on the wire for limitType to set.
     * @return This builder for chaining.
     */
    public Builder setLimitTypeValue(int value) {
      limitType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @return The limitType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType getLimitType() {
      com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType result = com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType.forNumber(limitType_);
      return result == null ? com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @param value The limitType to set.
     * @return This builder for chaining.
     */
    public Builder setLimitType(com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      limitType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimitType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      limitType_ = 0;
      onChanged();
      return this;
    }

    private int existingCount_ ;
    /**
     * <pre>
     * The count of existing entities.
     * </pre>
     *
     * <code>int32 existing_count = 4;</code>
     * @return The existingCount.
     */
    @java.lang.Override
    public int getExistingCount() {
      return existingCount_;
    }
    /**
     * <pre>
     * The count of existing entities.
     * </pre>
     *
     * <code>int32 existing_count = 4;</code>
     * @param value The existingCount to set.
     * @return This builder for chaining.
     */
    public Builder setExistingCount(int value) {
      
      existingCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The count of existing entities.
     * </pre>
     *
     * <code>int32 existing_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExistingCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      existingCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.errors.ResourceCountDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.errors.ResourceCountDetails)
  private static final com.google.ads.googleads.v11.errors.ResourceCountDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.errors.ResourceCountDetails();
  }

  public static com.google.ads.googleads.v11.errors.ResourceCountDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceCountDetails>
      PARSER = new com.google.protobuf.AbstractParser<ResourceCountDetails>() {
    @java.lang.Override
    public ResourceCountDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceCountDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceCountDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.errors.ResourceCountDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

