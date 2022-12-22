// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iap/v1/service.proto

package com.google.cloud.iap.v1;

/**
 * <pre>
 * OAuth brand data.
 * NOTE: Only contains a portion of the data that describes a brand.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.Brand}
 */
public final class Brand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.Brand)
    BrandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Brand.newBuilder() to construct.
  private Brand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Brand() {
    name_ = "";
    supportEmail_ = "";
    applicationTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Brand();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_Brand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_Brand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.Brand.class, com.google.cloud.iap.v1.Brand.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Output only. Identifier of the brand.
   * NOTE: GCP project number achieves the same brand identification purpose as
   * only one brand per project can be created.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. Identifier of the brand.
   * NOTE: GCP project number achieves the same brand identification purpose as
   * only one brand per project can be created.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int SUPPORT_EMAIL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object supportEmail_ = "";
  /**
   * <pre>
   * Support email displayed on the OAuth consent screen.
   * </pre>
   *
   * <code>string support_email = 2;</code>
   * @return The supportEmail.
   */
  @java.lang.Override
  public java.lang.String getSupportEmail() {
    java.lang.Object ref = supportEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      supportEmail_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Support email displayed on the OAuth consent screen.
   * </pre>
   *
   * <code>string support_email = 2;</code>
   * @return The bytes for supportEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSupportEmailBytes() {
    java.lang.Object ref = supportEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      supportEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATION_TITLE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object applicationTitle_ = "";
  /**
   * <pre>
   * Application name displayed on OAuth consent screen.
   * </pre>
   *
   * <code>string application_title = 3;</code>
   * @return The applicationTitle.
   */
  @java.lang.Override
  public java.lang.String getApplicationTitle() {
    java.lang.Object ref = applicationTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Application name displayed on OAuth consent screen.
   * </pre>
   *
   * <code>string application_title = 3;</code>
   * @return The bytes for applicationTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationTitleBytes() {
    java.lang.Object ref = applicationTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORG_INTERNAL_ONLY_FIELD_NUMBER = 4;
  private boolean orgInternalOnly_ = false;
  /**
   * <pre>
   * Output only. Whether the brand is only intended for usage inside the
   * G Suite organization only.
   * </pre>
   *
   * <code>bool org_internal_only = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The orgInternalOnly.
   */
  @java.lang.Override
  public boolean getOrgInternalOnly() {
    return orgInternalOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(supportEmail_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, supportEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, applicationTitle_);
    }
    if (orgInternalOnly_ != false) {
      output.writeBool(4, orgInternalOnly_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(supportEmail_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, supportEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, applicationTitle_);
    }
    if (orgInternalOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, orgInternalOnly_);
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
    if (!(obj instanceof com.google.cloud.iap.v1.Brand)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.Brand other = (com.google.cloud.iap.v1.Brand) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getSupportEmail()
        .equals(other.getSupportEmail())) return false;
    if (!getApplicationTitle()
        .equals(other.getApplicationTitle())) return false;
    if (getOrgInternalOnly()
        != other.getOrgInternalOnly()) return false;
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
    hash = (37 * hash) + SUPPORT_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getSupportEmail().hashCode();
    hash = (37 * hash) + APPLICATION_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationTitle().hashCode();
    hash = (37 * hash) + ORG_INTERNAL_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOrgInternalOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.Brand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.Brand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.Brand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.Brand parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iap.v1.Brand prototype) {
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
   * OAuth brand data.
   * NOTE: Only contains a portion of the data that describes a brand.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.Brand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.Brand)
      com.google.cloud.iap.v1.BrandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_Brand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_Brand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.Brand.class, com.google.cloud.iap.v1.Brand.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.Brand.newBuilder()
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
      supportEmail_ = "";
      applicationTitle_ = "";
      orgInternalOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_Brand_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.Brand getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.Brand.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.Brand build() {
      com.google.cloud.iap.v1.Brand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.Brand buildPartial() {
      com.google.cloud.iap.v1.Brand result = new com.google.cloud.iap.v1.Brand(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.Brand result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.supportEmail_ = supportEmail_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.applicationTitle_ = applicationTitle_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.orgInternalOnly_ = orgInternalOnly_;
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
      if (other instanceof com.google.cloud.iap.v1.Brand) {
        return mergeFrom((com.google.cloud.iap.v1.Brand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.Brand other) {
      if (other == com.google.cloud.iap.v1.Brand.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSupportEmail().isEmpty()) {
        supportEmail_ = other.supportEmail_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getApplicationTitle().isEmpty()) {
        applicationTitle_ = other.applicationTitle_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getOrgInternalOnly() != false) {
        setOrgInternalOnly(other.getOrgInternalOnly());
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
            case 18: {
              supportEmail_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              applicationTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              orgInternalOnly_ = input.readBool();
              bitField0_ |= 0x00000008;
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. Identifier of the brand.
     * NOTE: GCP project number achieves the same brand identification purpose as
     * only one brand per project can be created.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Identifier of the brand.
     * NOTE: GCP project number achieves the same brand identification purpose as
     * only one brand per project can be created.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Identifier of the brand.
     * NOTE: GCP project number achieves the same brand identification purpose as
     * only one brand per project can be created.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Identifier of the brand.
     * NOTE: GCP project number achieves the same brand identification purpose as
     * only one brand per project can be created.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Identifier of the brand.
     * NOTE: GCP project number achieves the same brand identification purpose as
     * only one brand per project can be created.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private java.lang.Object supportEmail_ = "";
    /**
     * <pre>
     * Support email displayed on the OAuth consent screen.
     * </pre>
     *
     * <code>string support_email = 2;</code>
     * @return The supportEmail.
     */
    public java.lang.String getSupportEmail() {
      java.lang.Object ref = supportEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        supportEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Support email displayed on the OAuth consent screen.
     * </pre>
     *
     * <code>string support_email = 2;</code>
     * @return The bytes for supportEmail.
     */
    public com.google.protobuf.ByteString
        getSupportEmailBytes() {
      java.lang.Object ref = supportEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        supportEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Support email displayed on the OAuth consent screen.
     * </pre>
     *
     * <code>string support_email = 2;</code>
     * @param value The supportEmail to set.
     * @return This builder for chaining.
     */
    public Builder setSupportEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      supportEmail_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Support email displayed on the OAuth consent screen.
     * </pre>
     *
     * <code>string support_email = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSupportEmail() {
      supportEmail_ = getDefaultInstance().getSupportEmail();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Support email displayed on the OAuth consent screen.
     * </pre>
     *
     * <code>string support_email = 2;</code>
     * @param value The bytes for supportEmail to set.
     * @return This builder for chaining.
     */
    public Builder setSupportEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      supportEmail_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object applicationTitle_ = "";
    /**
     * <pre>
     * Application name displayed on OAuth consent screen.
     * </pre>
     *
     * <code>string application_title = 3;</code>
     * @return The applicationTitle.
     */
    public java.lang.String getApplicationTitle() {
      java.lang.Object ref = applicationTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Application name displayed on OAuth consent screen.
     * </pre>
     *
     * <code>string application_title = 3;</code>
     * @return The bytes for applicationTitle.
     */
    public com.google.protobuf.ByteString
        getApplicationTitleBytes() {
      java.lang.Object ref = applicationTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Application name displayed on OAuth consent screen.
     * </pre>
     *
     * <code>string application_title = 3;</code>
     * @param value The applicationTitle to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      applicationTitle_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Application name displayed on OAuth consent screen.
     * </pre>
     *
     * <code>string application_title = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationTitle() {
      applicationTitle_ = getDefaultInstance().getApplicationTitle();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Application name displayed on OAuth consent screen.
     * </pre>
     *
     * <code>string application_title = 3;</code>
     * @param value The bytes for applicationTitle to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      applicationTitle_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean orgInternalOnly_ ;
    /**
     * <pre>
     * Output only. Whether the brand is only intended for usage inside the
     * G Suite organization only.
     * </pre>
     *
     * <code>bool org_internal_only = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The orgInternalOnly.
     */
    @java.lang.Override
    public boolean getOrgInternalOnly() {
      return orgInternalOnly_;
    }
    /**
     * <pre>
     * Output only. Whether the brand is only intended for usage inside the
     * G Suite organization only.
     * </pre>
     *
     * <code>bool org_internal_only = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The orgInternalOnly to set.
     * @return This builder for chaining.
     */
    public Builder setOrgInternalOnly(boolean value) {
      
      orgInternalOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Whether the brand is only intended for usage inside the
     * G Suite organization only.
     * </pre>
     *
     * <code>bool org_internal_only = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgInternalOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      orgInternalOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.Brand)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.Brand)
  private static final com.google.cloud.iap.v1.Brand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.Brand();
  }

  public static com.google.cloud.iap.v1.Brand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Brand>
      PARSER = new com.google.protobuf.AbstractParser<Brand>() {
    @java.lang.Override
    public Brand parsePartialFrom(
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

  public static com.google.protobuf.Parser<Brand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Brand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.Brand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
