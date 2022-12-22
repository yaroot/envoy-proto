// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

/**
 * <pre>
 * Authentication method for Amazon Web Services (AWS) that uses Google owned
 * AWS IAM user's access key to assume into customer's AWS IAM Role.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.connection.v1.AwsCrossAccountRole}
 */
public final class AwsCrossAccountRole extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.connection.v1.AwsCrossAccountRole)
    AwsCrossAccountRoleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsCrossAccountRole.newBuilder() to construct.
  private AwsCrossAccountRole(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsCrossAccountRole() {
    iamRoleId_ = "";
    iamUserId_ = "";
    externalId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsCrossAccountRole();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.class, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder.class);
  }

  public static final int IAM_ROLE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iamRoleId_ = "";
  /**
   * <pre>
   * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
   * Connection.
   * </pre>
   *
   * <code>string iam_role_id = 1;</code>
   * @return The iamRoleId.
   */
  @java.lang.Override
  public java.lang.String getIamRoleId() {
    java.lang.Object ref = iamRoleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iamRoleId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
   * Connection.
   * </pre>
   *
   * <code>string iam_role_id = 1;</code>
   * @return The bytes for iamRoleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIamRoleIdBytes() {
    java.lang.Object ref = iamRoleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iamRoleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IAM_USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iamUserId_ = "";
  /**
   * <pre>
   * Output only. Google-owned AWS IAM User for a Connection.
   * </pre>
   *
   * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The iamUserId.
   */
  @java.lang.Override
  public java.lang.String getIamUserId() {
    java.lang.Object ref = iamUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iamUserId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Google-owned AWS IAM User for a Connection.
   * </pre>
   *
   * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for iamUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIamUserIdBytes() {
    java.lang.Object ref = iamUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iamUserId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNAL_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object externalId_ = "";
  /**
   * <pre>
   * Output only. A Google-generated id for representing Connection’s identity in AWS.
   * External Id is also used for preventing the Confused Deputy Problem. See
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The externalId.
   */
  @java.lang.Override
  public java.lang.String getExternalId() {
    java.lang.Object ref = externalId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. A Google-generated id for representing Connection’s identity in AWS.
   * External Id is also used for preventing the Confused Deputy Problem. See
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for externalId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalIdBytes() {
    java.lang.Object ref = externalId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      externalId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iamRoleId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iamRoleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iamUserId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, iamUserId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, externalId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iamRoleId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iamRoleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iamUserId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, iamUserId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, externalId_);
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
    if (!(obj instanceof com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole other = (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) obj;

    if (!getIamRoleId()
        .equals(other.getIamRoleId())) return false;
    if (!getIamUserId()
        .equals(other.getIamUserId())) return false;
    if (!getExternalId()
        .equals(other.getExternalId())) return false;
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
    hash = (37 * hash) + IAM_ROLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIamRoleId().hashCode();
    hash = (37 * hash) + IAM_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIamUserId().hashCode();
    hash = (37 * hash) + EXTERNAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExternalId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole prototype) {
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
   * Authentication method for Amazon Web Services (AWS) that uses Google owned
   * AWS IAM user's access key to assume into customer's AWS IAM Role.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.connection.v1.AwsCrossAccountRole}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.connection.v1.AwsCrossAccountRole)
      com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.class, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.newBuilder()
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
      iamRoleId_ = "";
      iamUserId_ = "";
      externalId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole getDefaultInstanceForType() {
      return com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole build() {
      com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole buildPartial() {
      com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole result = new com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.iamRoleId_ = iamRoleId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.iamUserId_ = iamUserId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.externalId_ = externalId_;
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
      if (other instanceof com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) {
        return mergeFrom((com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole other) {
      if (other == com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance()) return this;
      if (!other.getIamRoleId().isEmpty()) {
        iamRoleId_ = other.iamRoleId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getIamUserId().isEmpty()) {
        iamUserId_ = other.iamUserId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getExternalId().isEmpty()) {
        externalId_ = other.externalId_;
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
              iamRoleId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              iamUserId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              externalId_ = input.readStringRequireUtf8();
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

    private java.lang.Object iamRoleId_ = "";
    /**
     * <pre>
     * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
     * Connection.
     * </pre>
     *
     * <code>string iam_role_id = 1;</code>
     * @return The iamRoleId.
     */
    public java.lang.String getIamRoleId() {
      java.lang.Object ref = iamRoleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iamRoleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
     * Connection.
     * </pre>
     *
     * <code>string iam_role_id = 1;</code>
     * @return The bytes for iamRoleId.
     */
    public com.google.protobuf.ByteString
        getIamRoleIdBytes() {
      java.lang.Object ref = iamRoleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iamRoleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
     * Connection.
     * </pre>
     *
     * <code>string iam_role_id = 1;</code>
     * @param value The iamRoleId to set.
     * @return This builder for chaining.
     */
    public Builder setIamRoleId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iamRoleId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
     * Connection.
     * </pre>
     *
     * <code>string iam_role_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIamRoleId() {
      iamRoleId_ = getDefaultInstance().getIamRoleId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
     * Connection.
     * </pre>
     *
     * <code>string iam_role_id = 1;</code>
     * @param value The bytes for iamRoleId to set.
     * @return This builder for chaining.
     */
    public Builder setIamRoleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iamRoleId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object iamUserId_ = "";
    /**
     * <pre>
     * Output only. Google-owned AWS IAM User for a Connection.
     * </pre>
     *
     * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The iamUserId.
     */
    public java.lang.String getIamUserId() {
      java.lang.Object ref = iamUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iamUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Google-owned AWS IAM User for a Connection.
     * </pre>
     *
     * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for iamUserId.
     */
    public com.google.protobuf.ByteString
        getIamUserIdBytes() {
      java.lang.Object ref = iamUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iamUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Google-owned AWS IAM User for a Connection.
     * </pre>
     *
     * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The iamUserId to set.
     * @return This builder for chaining.
     */
    public Builder setIamUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iamUserId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Google-owned AWS IAM User for a Connection.
     * </pre>
     *
     * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearIamUserId() {
      iamUserId_ = getDefaultInstance().getIamUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Google-owned AWS IAM User for a Connection.
     * </pre>
     *
     * <code>string iam_user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for iamUserId to set.
     * @return This builder for chaining.
     */
    public Builder setIamUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iamUserId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object externalId_ = "";
    /**
     * <pre>
     * Output only. A Google-generated id for representing Connection’s identity in AWS.
     * External Id is also used for preventing the Confused Deputy Problem. See
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The externalId.
     */
    public java.lang.String getExternalId() {
      java.lang.Object ref = externalId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. A Google-generated id for representing Connection’s identity in AWS.
     * External Id is also used for preventing the Confused Deputy Problem. See
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for externalId.
     */
    public com.google.protobuf.ByteString
        getExternalIdBytes() {
      java.lang.Object ref = externalId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. A Google-generated id for representing Connection’s identity in AWS.
     * External Id is also used for preventing the Confused Deputy Problem. See
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      externalId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A Google-generated id for representing Connection’s identity in AWS.
     * External Id is also used for preventing the Confused Deputy Problem. See
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalId() {
      externalId_ = getDefaultInstance().getExternalId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A Google-generated id for representing Connection’s identity in AWS.
     * External Id is also used for preventing the Confused Deputy Problem. See
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      externalId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.connection.v1.AwsCrossAccountRole)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.connection.v1.AwsCrossAccountRole)
  private static final com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole();
  }

  public static com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsCrossAccountRole>
      PARSER = new com.google.protobuf.AbstractParser<AwsCrossAccountRole>() {
    @java.lang.Override
    public AwsCrossAccountRole parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsCrossAccountRole> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsCrossAccountRole> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

