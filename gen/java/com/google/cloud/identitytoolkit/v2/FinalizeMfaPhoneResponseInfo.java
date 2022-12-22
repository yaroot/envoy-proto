// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/identitytoolkit/v2/mfa_info.proto

package com.google.cloud.identitytoolkit.v2;

/**
 * <pre>
 * Phone Verification info for a FinalizeMfa response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo}
 */
public final class FinalizeMfaPhoneResponseInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo)
    FinalizeMfaPhoneResponseInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FinalizeMfaPhoneResponseInfo.newBuilder() to construct.
  private FinalizeMfaPhoneResponseInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FinalizeMfaPhoneResponseInfo() {
    androidVerificationProof_ = "";
    phoneNumber_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FinalizeMfaPhoneResponseInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.identitytoolkit.v2.MfaInfo.internal_static_google_cloud_identitytoolkit_v2_FinalizeMfaPhoneResponseInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.identitytoolkit.v2.MfaInfo.internal_static_google_cloud_identitytoolkit_v2_FinalizeMfaPhoneResponseInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.class, com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.Builder.class);
  }

  public static final int ANDROID_VERIFICATION_PROOF_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object androidVerificationProof_ = "";
  /**
   * <pre>
   * Android only. Long-lived replacement for valid code tied to android device.
   * </pre>
   *
   * <code>string android_verification_proof = 1;</code>
   * @return The androidVerificationProof.
   */
  @java.lang.Override
  public java.lang.String getAndroidVerificationProof() {
    java.lang.Object ref = androidVerificationProof_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      androidVerificationProof_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Android only. Long-lived replacement for valid code tied to android device.
   * </pre>
   *
   * <code>string android_verification_proof = 1;</code>
   * @return The bytes for androidVerificationProof.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAndroidVerificationProofBytes() {
    java.lang.Object ref = androidVerificationProof_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      androidVerificationProof_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANDROID_VERIFICATION_PROOF_EXPIRE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp androidVerificationProofExpireTime_;
  /**
   * <pre>
   * Android only. Expiration time of verification proof in seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
   * @return Whether the androidVerificationProofExpireTime field is set.
   */
  @java.lang.Override
  public boolean hasAndroidVerificationProofExpireTime() {
    return androidVerificationProofExpireTime_ != null;
  }
  /**
   * <pre>
   * Android only. Expiration time of verification proof in seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
   * @return The androidVerificationProofExpireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAndroidVerificationProofExpireTime() {
    return androidVerificationProofExpireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : androidVerificationProofExpireTime_;
  }
  /**
   * <pre>
   * Android only. Expiration time of verification proof in seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAndroidVerificationProofExpireTimeOrBuilder() {
    return androidVerificationProofExpireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : androidVerificationProofExpireTime_;
  }

  public static final int PHONE_NUMBER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object phoneNumber_ = "";
  /**
   * <pre>
   * For Android verification proof.
   * </pre>
   *
   * <code>string phone_number = 3;</code>
   * @return The phoneNumber.
   */
  @java.lang.Override
  public java.lang.String getPhoneNumber() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * For Android verification proof.
   * </pre>
   *
   * <code>string phone_number = 3;</code>
   * @return The bytes for phoneNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneNumberBytes() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneNumber_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(androidVerificationProof_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, androidVerificationProof_);
    }
    if (androidVerificationProofExpireTime_ != null) {
      output.writeMessage(2, getAndroidVerificationProofExpireTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, phoneNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(androidVerificationProof_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, androidVerificationProof_);
    }
    if (androidVerificationProofExpireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAndroidVerificationProofExpireTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, phoneNumber_);
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
    if (!(obj instanceof com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo other = (com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo) obj;

    if (!getAndroidVerificationProof()
        .equals(other.getAndroidVerificationProof())) return false;
    if (hasAndroidVerificationProofExpireTime() != other.hasAndroidVerificationProofExpireTime()) return false;
    if (hasAndroidVerificationProofExpireTime()) {
      if (!getAndroidVerificationProofExpireTime()
          .equals(other.getAndroidVerificationProofExpireTime())) return false;
    }
    if (!getPhoneNumber()
        .equals(other.getPhoneNumber())) return false;
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
    hash = (37 * hash) + ANDROID_VERIFICATION_PROOF_FIELD_NUMBER;
    hash = (53 * hash) + getAndroidVerificationProof().hashCode();
    if (hasAndroidVerificationProofExpireTime()) {
      hash = (37 * hash) + ANDROID_VERIFICATION_PROOF_EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getAndroidVerificationProofExpireTime().hashCode();
    }
    hash = (37 * hash) + PHONE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneNumber().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo prototype) {
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
   * Phone Verification info for a FinalizeMfa response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo)
      com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.identitytoolkit.v2.MfaInfo.internal_static_google_cloud_identitytoolkit_v2_FinalizeMfaPhoneResponseInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.identitytoolkit.v2.MfaInfo.internal_static_google_cloud_identitytoolkit_v2_FinalizeMfaPhoneResponseInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.class, com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.Builder.class);
    }

    // Construct using com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.newBuilder()
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
      androidVerificationProof_ = "";
      androidVerificationProofExpireTime_ = null;
      if (androidVerificationProofExpireTimeBuilder_ != null) {
        androidVerificationProofExpireTimeBuilder_.dispose();
        androidVerificationProofExpireTimeBuilder_ = null;
      }
      phoneNumber_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.identitytoolkit.v2.MfaInfo.internal_static_google_cloud_identitytoolkit_v2_FinalizeMfaPhoneResponseInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo getDefaultInstanceForType() {
      return com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo build() {
      com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo buildPartial() {
      com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo result = new com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.androidVerificationProof_ = androidVerificationProof_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.androidVerificationProofExpireTime_ = androidVerificationProofExpireTimeBuilder_ == null
            ? androidVerificationProofExpireTime_
            : androidVerificationProofExpireTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.phoneNumber_ = phoneNumber_;
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
      if (other instanceof com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo) {
        return mergeFrom((com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo other) {
      if (other == com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo.getDefaultInstance()) return this;
      if (!other.getAndroidVerificationProof().isEmpty()) {
        androidVerificationProof_ = other.androidVerificationProof_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAndroidVerificationProofExpireTime()) {
        mergeAndroidVerificationProofExpireTime(other.getAndroidVerificationProofExpireTime());
      }
      if (!other.getPhoneNumber().isEmpty()) {
        phoneNumber_ = other.phoneNumber_;
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
            case 10: {
              androidVerificationProof_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAndroidVerificationProofExpireTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              phoneNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private java.lang.Object androidVerificationProof_ = "";
    /**
     * <pre>
     * Android only. Long-lived replacement for valid code tied to android device.
     * </pre>
     *
     * <code>string android_verification_proof = 1;</code>
     * @return The androidVerificationProof.
     */
    public java.lang.String getAndroidVerificationProof() {
      java.lang.Object ref = androidVerificationProof_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        androidVerificationProof_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Android only. Long-lived replacement for valid code tied to android device.
     * </pre>
     *
     * <code>string android_verification_proof = 1;</code>
     * @return The bytes for androidVerificationProof.
     */
    public com.google.protobuf.ByteString
        getAndroidVerificationProofBytes() {
      java.lang.Object ref = androidVerificationProof_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        androidVerificationProof_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Android only. Long-lived replacement for valid code tied to android device.
     * </pre>
     *
     * <code>string android_verification_proof = 1;</code>
     * @param value The androidVerificationProof to set.
     * @return This builder for chaining.
     */
    public Builder setAndroidVerificationProof(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      androidVerificationProof_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android only. Long-lived replacement for valid code tied to android device.
     * </pre>
     *
     * <code>string android_verification_proof = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAndroidVerificationProof() {
      androidVerificationProof_ = getDefaultInstance().getAndroidVerificationProof();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android only. Long-lived replacement for valid code tied to android device.
     * </pre>
     *
     * <code>string android_verification_proof = 1;</code>
     * @param value The bytes for androidVerificationProof to set.
     * @return This builder for chaining.
     */
    public Builder setAndroidVerificationProofBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      androidVerificationProof_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp androidVerificationProofExpireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> androidVerificationProofExpireTimeBuilder_;
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     * @return Whether the androidVerificationProofExpireTime field is set.
     */
    public boolean hasAndroidVerificationProofExpireTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     * @return The androidVerificationProofExpireTime.
     */
    public com.google.protobuf.Timestamp getAndroidVerificationProofExpireTime() {
      if (androidVerificationProofExpireTimeBuilder_ == null) {
        return androidVerificationProofExpireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : androidVerificationProofExpireTime_;
      } else {
        return androidVerificationProofExpireTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    public Builder setAndroidVerificationProofExpireTime(com.google.protobuf.Timestamp value) {
      if (androidVerificationProofExpireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        androidVerificationProofExpireTime_ = value;
      } else {
        androidVerificationProofExpireTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    public Builder setAndroidVerificationProofExpireTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (androidVerificationProofExpireTimeBuilder_ == null) {
        androidVerificationProofExpireTime_ = builderForValue.build();
      } else {
        androidVerificationProofExpireTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    public Builder mergeAndroidVerificationProofExpireTime(com.google.protobuf.Timestamp value) {
      if (androidVerificationProofExpireTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          androidVerificationProofExpireTime_ != null &&
          androidVerificationProofExpireTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getAndroidVerificationProofExpireTimeBuilder().mergeFrom(value);
        } else {
          androidVerificationProofExpireTime_ = value;
        }
      } else {
        androidVerificationProofExpireTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    public Builder clearAndroidVerificationProofExpireTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      androidVerificationProofExpireTime_ = null;
      if (androidVerificationProofExpireTimeBuilder_ != null) {
        androidVerificationProofExpireTimeBuilder_.dispose();
        androidVerificationProofExpireTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getAndroidVerificationProofExpireTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAndroidVerificationProofExpireTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getAndroidVerificationProofExpireTimeOrBuilder() {
      if (androidVerificationProofExpireTimeBuilder_ != null) {
        return androidVerificationProofExpireTimeBuilder_.getMessageOrBuilder();
      } else {
        return androidVerificationProofExpireTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : androidVerificationProofExpireTime_;
      }
    }
    /**
     * <pre>
     * Android only. Expiration time of verification proof in seconds.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp android_verification_proof_expire_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getAndroidVerificationProofExpireTimeFieldBuilder() {
      if (androidVerificationProofExpireTimeBuilder_ == null) {
        androidVerificationProofExpireTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getAndroidVerificationProofExpireTime(),
                getParentForChildren(),
                isClean());
        androidVerificationProofExpireTime_ = null;
      }
      return androidVerificationProofExpireTimeBuilder_;
    }

    private java.lang.Object phoneNumber_ = "";
    /**
     * <pre>
     * For Android verification proof.
     * </pre>
     *
     * <code>string phone_number = 3;</code>
     * @return The phoneNumber.
     */
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * For Android verification proof.
     * </pre>
     *
     * <code>string phone_number = 3;</code>
     * @return The bytes for phoneNumber.
     */
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * For Android verification proof.
     * </pre>
     *
     * <code>string phone_number = 3;</code>
     * @param value The phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      phoneNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For Android verification proof.
     * </pre>
     *
     * <code>string phone_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneNumber() {
      phoneNumber_ = getDefaultInstance().getPhoneNumber();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For Android verification proof.
     * </pre>
     *
     * <code>string phone_number = 3;</code>
     * @param value The bytes for phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      phoneNumber_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo)
  private static final com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo();
  }

  public static com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FinalizeMfaPhoneResponseInfo>
      PARSER = new com.google.protobuf.AbstractParser<FinalizeMfaPhoneResponseInfo>() {
    @java.lang.Override
    public FinalizeMfaPhoneResponseInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<FinalizeMfaPhoneResponseInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FinalizeMfaPhoneResponseInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneResponseInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
