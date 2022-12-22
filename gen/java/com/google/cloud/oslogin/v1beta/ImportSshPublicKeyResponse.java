// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1beta/oslogin.proto

package com.google.cloud.oslogin.v1beta;

/**
 * <pre>
 * A response message for importing an SSH public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse}
 */
public final class ImportSshPublicKeyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse)
    ImportSshPublicKeyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportSshPublicKeyResponse.newBuilder() to construct.
  private ImportSshPublicKeyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportSshPublicKeyResponse() {
    details_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportSshPublicKeyResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.oslogin.v1beta.OsLoginProto.internal_static_google_cloud_oslogin_v1beta_ImportSshPublicKeyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oslogin.v1beta.OsLoginProto.internal_static_google_cloud_oslogin_v1beta_ImportSshPublicKeyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.class, com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.Builder.class);
  }

  public static final int LOGIN_PROFILE_FIELD_NUMBER = 1;
  private com.google.cloud.oslogin.v1beta.LoginProfile loginProfile_;
  /**
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
   * @return Whether the loginProfile field is set.
   */
  @java.lang.Override
  public boolean hasLoginProfile() {
    return loginProfile_ != null;
  }
  /**
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
   * @return The loginProfile.
   */
  @java.lang.Override
  public com.google.cloud.oslogin.v1beta.LoginProfile getLoginProfile() {
    return loginProfile_ == null ? com.google.cloud.oslogin.v1beta.LoginProfile.getDefaultInstance() : loginProfile_;
  }
  /**
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.oslogin.v1beta.LoginProfileOrBuilder getLoginProfileOrBuilder() {
    return loginProfile_ == null ? com.google.cloud.oslogin.v1beta.LoginProfile.getDefaultInstance() : loginProfile_;
  }

  public static final int DETAILS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object details_ = "";
  /**
   * <pre>
   * Detailed information about import results.
   * </pre>
   *
   * <code>string details = 2;</code>
   * @return The details.
   */
  @java.lang.Override
  public java.lang.String getDetails() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      details_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Detailed information about import results.
   * </pre>
   *
   * <code>string details = 2;</code>
   * @return The bytes for details.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetailsBytes() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      details_ = b;
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
    if (loginProfile_ != null) {
      output.writeMessage(1, getLoginProfile());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(details_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, details_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loginProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLoginProfile());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(details_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, details_);
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
    if (!(obj instanceof com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse other = (com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse) obj;

    if (hasLoginProfile() != other.hasLoginProfile()) return false;
    if (hasLoginProfile()) {
      if (!getLoginProfile()
          .equals(other.getLoginProfile())) return false;
    }
    if (!getDetails()
        .equals(other.getDetails())) return false;
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
    if (hasLoginProfile()) {
      hash = (37 * hash) + LOGIN_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getLoginProfile().hashCode();
    }
    hash = (37 * hash) + DETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getDetails().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse prototype) {
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
   * A response message for importing an SSH public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse)
      com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.oslogin.v1beta.OsLoginProto.internal_static_google_cloud_oslogin_v1beta_ImportSshPublicKeyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oslogin.v1beta.OsLoginProto.internal_static_google_cloud_oslogin_v1beta_ImportSshPublicKeyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.class, com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.Builder.class);
    }

    // Construct using com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.newBuilder()
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
      loginProfile_ = null;
      if (loginProfileBuilder_ != null) {
        loginProfileBuilder_.dispose();
        loginProfileBuilder_ = null;
      }
      details_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.oslogin.v1beta.OsLoginProto.internal_static_google_cloud_oslogin_v1beta_ImportSshPublicKeyResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse getDefaultInstanceForType() {
      return com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse build() {
      com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse buildPartial() {
      com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse result = new com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.loginProfile_ = loginProfileBuilder_ == null
            ? loginProfile_
            : loginProfileBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.details_ = details_;
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
      if (other instanceof com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse) {
        return mergeFrom((com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse other) {
      if (other == com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse.getDefaultInstance()) return this;
      if (other.hasLoginProfile()) {
        mergeLoginProfile(other.getLoginProfile());
      }
      if (!other.getDetails().isEmpty()) {
        details_ = other.details_;
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
            case 10: {
              input.readMessage(
                  getLoginProfileFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              details_ = input.readStringRequireUtf8();
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

    private com.google.cloud.oslogin.v1beta.LoginProfile loginProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.oslogin.v1beta.LoginProfile, com.google.cloud.oslogin.v1beta.LoginProfile.Builder, com.google.cloud.oslogin.v1beta.LoginProfileOrBuilder> loginProfileBuilder_;
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     * @return Whether the loginProfile field is set.
     */
    public boolean hasLoginProfile() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     * @return The loginProfile.
     */
    public com.google.cloud.oslogin.v1beta.LoginProfile getLoginProfile() {
      if (loginProfileBuilder_ == null) {
        return loginProfile_ == null ? com.google.cloud.oslogin.v1beta.LoginProfile.getDefaultInstance() : loginProfile_;
      } else {
        return loginProfileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    public Builder setLoginProfile(com.google.cloud.oslogin.v1beta.LoginProfile value) {
      if (loginProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loginProfile_ = value;
      } else {
        loginProfileBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    public Builder setLoginProfile(
        com.google.cloud.oslogin.v1beta.LoginProfile.Builder builderForValue) {
      if (loginProfileBuilder_ == null) {
        loginProfile_ = builderForValue.build();
      } else {
        loginProfileBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    public Builder mergeLoginProfile(com.google.cloud.oslogin.v1beta.LoginProfile value) {
      if (loginProfileBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          loginProfile_ != null &&
          loginProfile_ != com.google.cloud.oslogin.v1beta.LoginProfile.getDefaultInstance()) {
          getLoginProfileBuilder().mergeFrom(value);
        } else {
          loginProfile_ = value;
        }
      } else {
        loginProfileBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    public Builder clearLoginProfile() {
      bitField0_ = (bitField0_ & ~0x00000001);
      loginProfile_ = null;
      if (loginProfileBuilder_ != null) {
        loginProfileBuilder_.dispose();
        loginProfileBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    public com.google.cloud.oslogin.v1beta.LoginProfile.Builder getLoginProfileBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLoginProfileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    public com.google.cloud.oslogin.v1beta.LoginProfileOrBuilder getLoginProfileOrBuilder() {
      if (loginProfileBuilder_ != null) {
        return loginProfileBuilder_.getMessageOrBuilder();
      } else {
        return loginProfile_ == null ?
            com.google.cloud.oslogin.v1beta.LoginProfile.getDefaultInstance() : loginProfile_;
      }
    }
    /**
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1beta.LoginProfile login_profile = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.oslogin.v1beta.LoginProfile, com.google.cloud.oslogin.v1beta.LoginProfile.Builder, com.google.cloud.oslogin.v1beta.LoginProfileOrBuilder> 
        getLoginProfileFieldBuilder() {
      if (loginProfileBuilder_ == null) {
        loginProfileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.v1beta.LoginProfile, com.google.cloud.oslogin.v1beta.LoginProfile.Builder, com.google.cloud.oslogin.v1beta.LoginProfileOrBuilder>(
                getLoginProfile(),
                getParentForChildren(),
                isClean());
        loginProfile_ = null;
      }
      return loginProfileBuilder_;
    }

    private java.lang.Object details_ = "";
    /**
     * <pre>
     * Detailed information about import results.
     * </pre>
     *
     * <code>string details = 2;</code>
     * @return The details.
     */
    public java.lang.String getDetails() {
      java.lang.Object ref = details_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        details_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Detailed information about import results.
     * </pre>
     *
     * <code>string details = 2;</code>
     * @return The bytes for details.
     */
    public com.google.protobuf.ByteString
        getDetailsBytes() {
      java.lang.Object ref = details_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        details_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Detailed information about import results.
     * </pre>
     *
     * <code>string details = 2;</code>
     * @param value The details to set.
     * @return This builder for chaining.
     */
    public Builder setDetails(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      details_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed information about import results.
     * </pre>
     *
     * <code>string details = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetails() {
      details_ = getDefaultInstance().getDetails();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed information about import results.
     * </pre>
     *
     * <code>string details = 2;</code>
     * @param value The bytes for details to set.
     * @return This builder for chaining.
     */
    public Builder setDetailsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      details_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse)
  private static final com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse();
  }

  public static com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportSshPublicKeyResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImportSshPublicKeyResponse>() {
    @java.lang.Override
    public ImportSshPublicKeyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportSshPublicKeyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportSshPublicKeyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oslogin.v1beta.ImportSshPublicKeyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

