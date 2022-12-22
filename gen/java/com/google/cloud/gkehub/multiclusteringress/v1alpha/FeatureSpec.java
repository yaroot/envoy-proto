// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/multiclusteringress/multiclusteringress.proto

package com.google.cloud.gkehub.multiclusteringress.v1alpha;

/**
 * <pre>
 * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress
 * feature.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec}
 */
public final class FeatureSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)
    FeatureSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureSpec.newBuilder() to construct.
  private FeatureSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureSpec() {
    configMembership_ = "";
    billing_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto.internal_static_google_cloud_gkehub_multiclusteringress_v1alpha_FeatureSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto.internal_static_google_cloud_gkehub_multiclusteringress_v1alpha_FeatureSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.class, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder.class);
  }

  public static final int CONFIG_MEMBERSHIP_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object configMembership_ = "";
  /**
   * <pre>
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
   * Example: `projects/foo-proj/locations/global/memberships/bar`
   * </pre>
   *
   * <code>string config_membership = 1;</code>
   * @return The configMembership.
   */
  @java.lang.Override
  public java.lang.String getConfigMembership() {
    java.lang.Object ref = configMembership_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      configMembership_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
   * Example: `projects/foo-proj/locations/global/memberships/bar`
   * </pre>
   *
   * <code>string config_membership = 1;</code>
   * @return The bytes for configMembership.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfigMembershipBytes() {
    java.lang.Object ref = configMembership_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      configMembership_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLING_FIELD_NUMBER = 2;
  private int billing_ = 0;
  /**
   * <pre>
   * Customer's billing structure
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
   * @return The enum numeric value on the wire for billing.
   */
  @java.lang.Override public int getBillingValue() {
    return billing_;
  }
  /**
   * <pre>
   * Customer's billing structure
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
   * @return The billing.
   */
  @java.lang.Override public com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing getBilling() {
    com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing result = com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing.forNumber(billing_);
    return result == null ? com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configMembership_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, configMembership_);
    }
    if (billing_ != com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing.BILLING_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, billing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configMembership_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, configMembership_);
    }
    if (billing_ != com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing.BILLING_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, billing_);
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
    if (!(obj instanceof com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec other = (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) obj;

    if (!getConfigMembership()
        .equals(other.getConfigMembership())) return false;
    if (billing_ != other.billing_) return false;
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
    hash = (37 * hash) + CONFIG_MEMBERSHIP_FIELD_NUMBER;
    hash = (53 * hash) + getConfigMembership().hashCode();
    hash = (37 * hash) + BILLING_FIELD_NUMBER;
    hash = (53 * hash) + billing_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec prototype) {
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
   * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress
   * feature.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)
      com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto.internal_static_google_cloud_gkehub_multiclusteringress_v1alpha_FeatureSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto.internal_static_google_cloud_gkehub_multiclusteringress_v1alpha_FeatureSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.class, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.newBuilder()
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
      configMembership_ = "";
      billing_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto.internal_static_google_cloud_gkehub_multiclusteringress_v1alpha_FeatureSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec getDefaultInstanceForType() {
      return com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec build() {
      com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec buildPartial() {
      com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec result = new com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.configMembership_ = configMembership_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.billing_ = billing_;
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
      if (other instanceof com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) {
        return mergeFrom((com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec other) {
      if (other == com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance()) return this;
      if (!other.getConfigMembership().isEmpty()) {
        configMembership_ = other.configMembership_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.billing_ != 0) {
        setBillingValue(other.getBillingValue());
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
              configMembership_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              billing_ = input.readEnum();
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

    private java.lang.Object configMembership_ = "";
    /**
     * <pre>
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
     * Example: `projects/foo-proj/locations/global/memberships/bar`
     * </pre>
     *
     * <code>string config_membership = 1;</code>
     * @return The configMembership.
     */
    public java.lang.String getConfigMembership() {
      java.lang.Object ref = configMembership_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        configMembership_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
     * Example: `projects/foo-proj/locations/global/memberships/bar`
     * </pre>
     *
     * <code>string config_membership = 1;</code>
     * @return The bytes for configMembership.
     */
    public com.google.protobuf.ByteString
        getConfigMembershipBytes() {
      java.lang.Object ref = configMembership_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        configMembership_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
     * Example: `projects/foo-proj/locations/global/memberships/bar`
     * </pre>
     *
     * <code>string config_membership = 1;</code>
     * @param value The configMembership to set.
     * @return This builder for chaining.
     */
    public Builder setConfigMembership(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      configMembership_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
     * Example: `projects/foo-proj/locations/global/memberships/bar`
     * </pre>
     *
     * <code>string config_membership = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigMembership() {
      configMembership_ = getDefaultInstance().getConfigMembership();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
     * Example: `projects/foo-proj/locations/global/memberships/bar`
     * </pre>
     *
     * <code>string config_membership = 1;</code>
     * @param value The bytes for configMembership to set.
     * @return This builder for chaining.
     */
    public Builder setConfigMembershipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      configMembership_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int billing_ = 0;
    /**
     * <pre>
     * Customer's billing structure
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
     * @return The enum numeric value on the wire for billing.
     */
    @java.lang.Override public int getBillingValue() {
      return billing_;
    }
    /**
     * <pre>
     * Customer's billing structure
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
     * @param value The enum numeric value on the wire for billing to set.
     * @return This builder for chaining.
     */
    public Builder setBillingValue(int value) {
      billing_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Customer's billing structure
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
     * @return The billing.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing getBilling() {
      com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing result = com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing.forNumber(billing_);
      return result == null ? com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Customer's billing structure
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
     * @param value The billing to set.
     * @return This builder for chaining.
     */
    public Builder setBilling(com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      billing_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Customer's billing structure
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBilling() {
      bitField0_ = (bitField0_ & ~0x00000002);
      billing_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)
  private static final com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec();
  }

  public static com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureSpec>
      PARSER = new com.google.protobuf.AbstractParser<FeatureSpec>() {
    @java.lang.Override
    public FeatureSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
