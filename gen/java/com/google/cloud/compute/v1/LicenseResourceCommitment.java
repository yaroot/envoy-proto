// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Commitment for a particular license resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LicenseResourceCommitment}
 */
public final class LicenseResourceCommitment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LicenseResourceCommitment)
    LicenseResourceCommitmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LicenseResourceCommitment.newBuilder() to construct.
  private LicenseResourceCommitment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LicenseResourceCommitment() {
    coresPerLicense_ = "";
    license_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LicenseResourceCommitment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LicenseResourceCommitment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LicenseResourceCommitment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LicenseResourceCommitment.class, com.google.cloud.compute.v1.LicenseResourceCommitment.Builder.class);
  }

  private int bitField0_;
  public static final int AMOUNT_FIELD_NUMBER = 196759640;
  private long amount_ = 0L;
  /**
   * <pre>
   * The number of licenses purchased.
   * </pre>
   *
   * <code>optional int64 amount = 196759640;</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The number of licenses purchased.
   * </pre>
   *
   * <code>optional int64 amount = 196759640;</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
  }

  public static final int CORES_PER_LICENSE_FIELD_NUMBER = 32482324;
  @SuppressWarnings("serial")
  private volatile java.lang.Object coresPerLicense_ = "";
  /**
   * <pre>
   * Specifies the core range of the instance for which this license applies.
   * </pre>
   *
   * <code>optional string cores_per_license = 32482324;</code>
   * @return Whether the coresPerLicense field is set.
   */
  @java.lang.Override
  public boolean hasCoresPerLicense() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Specifies the core range of the instance for which this license applies.
   * </pre>
   *
   * <code>optional string cores_per_license = 32482324;</code>
   * @return The coresPerLicense.
   */
  @java.lang.Override
  public java.lang.String getCoresPerLicense() {
    java.lang.Object ref = coresPerLicense_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coresPerLicense_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the core range of the instance for which this license applies.
   * </pre>
   *
   * <code>optional string cores_per_license = 32482324;</code>
   * @return The bytes for coresPerLicense.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoresPerLicenseBytes() {
    java.lang.Object ref = coresPerLicense_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coresPerLicense_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LICENSE_FIELD_NUMBER = 166757441;
  @SuppressWarnings("serial")
  private volatile java.lang.Object license_ = "";
  /**
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>optional string license = 166757441;</code>
   * @return Whether the license field is set.
   */
  @java.lang.Override
  public boolean hasLicense() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>optional string license = 166757441;</code>
   * @return The license.
   */
  @java.lang.Override
  public java.lang.String getLicense() {
    java.lang.Object ref = license_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      license_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>optional string license = 166757441;</code>
   * @return The bytes for license.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLicenseBytes() {
    java.lang.Object ref = license_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      license_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 32482324, coresPerLicense_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 166757441, license_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(196759640, amount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(32482324, coresPerLicense_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(166757441, license_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(196759640, amount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LicenseResourceCommitment)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LicenseResourceCommitment other = (com.google.cloud.compute.v1.LicenseResourceCommitment) obj;

    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (getAmount()
          != other.getAmount()) return false;
    }
    if (hasCoresPerLicense() != other.hasCoresPerLicense()) return false;
    if (hasCoresPerLicense()) {
      if (!getCoresPerLicense()
          .equals(other.getCoresPerLicense())) return false;
    }
    if (hasLicense() != other.hasLicense()) return false;
    if (hasLicense()) {
      if (!getLicense()
          .equals(other.getLicense())) return false;
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
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAmount());
    }
    if (hasCoresPerLicense()) {
      hash = (37 * hash) + CORES_PER_LICENSE_FIELD_NUMBER;
      hash = (53 * hash) + getCoresPerLicense().hashCode();
    }
    if (hasLicense()) {
      hash = (37 * hash) + LICENSE_FIELD_NUMBER;
      hash = (53 * hash) + getLicense().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LicenseResourceCommitment parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.LicenseResourceCommitment prototype) {
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
   * Commitment for a particular license resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LicenseResourceCommitment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LicenseResourceCommitment)
      com.google.cloud.compute.v1.LicenseResourceCommitmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LicenseResourceCommitment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LicenseResourceCommitment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LicenseResourceCommitment.class, com.google.cloud.compute.v1.LicenseResourceCommitment.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LicenseResourceCommitment.newBuilder()
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
      amount_ = 0L;
      coresPerLicense_ = "";
      license_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LicenseResourceCommitment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LicenseResourceCommitment getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LicenseResourceCommitment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LicenseResourceCommitment build() {
      com.google.cloud.compute.v1.LicenseResourceCommitment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LicenseResourceCommitment buildPartial() {
      com.google.cloud.compute.v1.LicenseResourceCommitment result = new com.google.cloud.compute.v1.LicenseResourceCommitment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.LicenseResourceCommitment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amount_ = amount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coresPerLicense_ = coresPerLicense_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.license_ = license_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.LicenseResourceCommitment) {
        return mergeFrom((com.google.cloud.compute.v1.LicenseResourceCommitment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LicenseResourceCommitment other) {
      if (other == com.google.cloud.compute.v1.LicenseResourceCommitment.getDefaultInstance()) return this;
      if (other.hasAmount()) {
        setAmount(other.getAmount());
      }
      if (other.hasCoresPerLicense()) {
        coresPerLicense_ = other.coresPerLicense_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLicense()) {
        license_ = other.license_;
        bitField0_ |= 0x00000004;
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
            case 259858594: {
              coresPerLicense_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 259858594
            case 1334059530: {
              license_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 1334059530
            case 1574077120: {
              amount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 1574077120
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

    private long amount_ ;
    /**
     * <pre>
     * The number of licenses purchased.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @return Whether the amount field is set.
     */
    @java.lang.Override
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The number of licenses purchased.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * The number of licenses purchased.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of licenses purchased.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      amount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object coresPerLicense_ = "";
    /**
     * <pre>
     * Specifies the core range of the instance for which this license applies.
     * </pre>
     *
     * <code>optional string cores_per_license = 32482324;</code>
     * @return Whether the coresPerLicense field is set.
     */
    public boolean hasCoresPerLicense() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the core range of the instance for which this license applies.
     * </pre>
     *
     * <code>optional string cores_per_license = 32482324;</code>
     * @return The coresPerLicense.
     */
    public java.lang.String getCoresPerLicense() {
      java.lang.Object ref = coresPerLicense_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coresPerLicense_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the core range of the instance for which this license applies.
     * </pre>
     *
     * <code>optional string cores_per_license = 32482324;</code>
     * @return The bytes for coresPerLicense.
     */
    public com.google.protobuf.ByteString
        getCoresPerLicenseBytes() {
      java.lang.Object ref = coresPerLicense_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coresPerLicense_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the core range of the instance for which this license applies.
     * </pre>
     *
     * <code>optional string cores_per_license = 32482324;</code>
     * @param value The coresPerLicense to set.
     * @return This builder for chaining.
     */
    public Builder setCoresPerLicense(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      coresPerLicense_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the core range of the instance for which this license applies.
     * </pre>
     *
     * <code>optional string cores_per_license = 32482324;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoresPerLicense() {
      coresPerLicense_ = getDefaultInstance().getCoresPerLicense();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the core range of the instance for which this license applies.
     * </pre>
     *
     * <code>optional string cores_per_license = 32482324;</code>
     * @param value The bytes for coresPerLicense to set.
     * @return This builder for chaining.
     */
    public Builder setCoresPerLicenseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      coresPerLicense_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object license_ = "";
    /**
     * <pre>
     * Any applicable license URI.
     * </pre>
     *
     * <code>optional string license = 166757441;</code>
     * @return Whether the license field is set.
     */
    public boolean hasLicense() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Any applicable license URI.
     * </pre>
     *
     * <code>optional string license = 166757441;</code>
     * @return The license.
     */
    public java.lang.String getLicense() {
      java.lang.Object ref = license_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        license_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Any applicable license URI.
     * </pre>
     *
     * <code>optional string license = 166757441;</code>
     * @return The bytes for license.
     */
    public com.google.protobuf.ByteString
        getLicenseBytes() {
      java.lang.Object ref = license_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        license_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Any applicable license URI.
     * </pre>
     *
     * <code>optional string license = 166757441;</code>
     * @param value The license to set.
     * @return This builder for chaining.
     */
    public Builder setLicense(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      license_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any applicable license URI.
     * </pre>
     *
     * <code>optional string license = 166757441;</code>
     * @return This builder for chaining.
     */
    public Builder clearLicense() {
      license_ = getDefaultInstance().getLicense();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any applicable license URI.
     * </pre>
     *
     * <code>optional string license = 166757441;</code>
     * @param value The bytes for license to set.
     * @return This builder for chaining.
     */
    public Builder setLicenseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      license_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LicenseResourceCommitment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LicenseResourceCommitment)
  private static final com.google.cloud.compute.v1.LicenseResourceCommitment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LicenseResourceCommitment();
  }

  public static com.google.cloud.compute.v1.LicenseResourceCommitment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LicenseResourceCommitment>
      PARSER = new com.google.protobuf.AbstractParser<LicenseResourceCommitment>() {
    @java.lang.Override
    public LicenseResourceCommitment parsePartialFrom(
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

  public static com.google.protobuf.Parser<LicenseResourceCommitment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LicenseResourceCommitment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LicenseResourceCommitment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
