// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secrets/v1beta1/service.proto

package com.google.cloud.secretmanager.v1beta1;

/**
 * <pre>
 * Request message for [SecretManagerService.UpdateSecret][google.cloud.secrets.v1beta1.SecretManagerService.UpdateSecret].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secrets.v1beta1.UpdateSecretRequest}
 */
public final class UpdateSecretRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.secrets.v1beta1.UpdateSecretRequest)
    UpdateSecretRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSecretRequest.newBuilder() to construct.
  private UpdateSecretRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSecretRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSecretRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.class, com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.Builder.class);
  }

  public static final int SECRET_FIELD_NUMBER = 1;
  private com.google.cloud.secretmanager.v1beta1.Secret secret_;
  /**
   * <pre>
   * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
   * </pre>
   *
   * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the secret field is set.
   */
  @java.lang.Override
  public boolean hasSecret() {
    return secret_ != null;
  }
  /**
   * <pre>
   * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
   * </pre>
   *
   * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The secret.
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta1.Secret getSecret() {
    return secret_ == null ? com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance() : secret_;
  }
  /**
   * <pre>
   * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
   * </pre>
   *
   * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta1.SecretOrBuilder getSecretOrBuilder() {
    return secret_ == null ? com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance() : secret_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (secret_ != null) {
      output.writeMessage(1, getSecret());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (secret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSecret());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest other = (com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest) obj;

    if (hasSecret() != other.hasSecret()) return false;
    if (hasSecret()) {
      if (!getSecret()
          .equals(other.getSecret())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasSecret()) {
      hash = (37 * hash) + SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getSecret().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest prototype) {
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
   * Request message for [SecretManagerService.UpdateSecret][google.cloud.secrets.v1beta1.SecretManagerService.UpdateSecret].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secrets.v1beta1.UpdateSecretRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secrets.v1beta1.UpdateSecretRequest)
      com.google.cloud.secretmanager.v1beta1.UpdateSecretRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.class, com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.newBuilder()
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
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest build() {
      com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest buildPartial() {
      com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest result = new com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.secret_ = secretBuilder_ == null
            ? secret_
            : secretBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest) {
        return mergeFrom((com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest other) {
      if (other == com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest.getDefaultInstance()) return this;
      if (other.hasSecret()) {
        mergeSecret(other.getSecret());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getSecretFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.cloud.secretmanager.v1beta1.Secret secret_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.secretmanager.v1beta1.Secret, com.google.cloud.secretmanager.v1beta1.Secret.Builder, com.google.cloud.secretmanager.v1beta1.SecretOrBuilder> secretBuilder_;
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the secret field is set.
     */
    public boolean hasSecret() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The secret.
     */
    public com.google.cloud.secretmanager.v1beta1.Secret getSecret() {
      if (secretBuilder_ == null) {
        return secret_ == null ? com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance() : secret_;
      } else {
        return secretBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecret(com.google.cloud.secretmanager.v1beta1.Secret value) {
      if (secretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secret_ = value;
      } else {
        secretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecret(
        com.google.cloud.secretmanager.v1beta1.Secret.Builder builderForValue) {
      if (secretBuilder_ == null) {
        secret_ = builderForValue.build();
      } else {
        secretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSecret(com.google.cloud.secretmanager.v1beta1.Secret value) {
      if (secretBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          secret_ != null &&
          secret_ != com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance()) {
          getSecretBuilder().mergeFrom(value);
        } else {
          secret_ = value;
        }
      } else {
        secretBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSecret() {
      bitField0_ = (bitField0_ & ~0x00000001);
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.secretmanager.v1beta1.Secret.Builder getSecretBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSecretFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.secretmanager.v1beta1.SecretOrBuilder getSecretOrBuilder() {
      if (secretBuilder_ != null) {
        return secretBuilder_.getMessageOrBuilder();
      } else {
        return secret_ == null ?
            com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance() : secret_;
      }
    }
    /**
     * <pre>
     * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
     * </pre>
     *
     * <code>.google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.secretmanager.v1beta1.Secret, com.google.cloud.secretmanager.v1beta1.Secret.Builder, com.google.cloud.secretmanager.v1beta1.SecretOrBuilder> 
        getSecretFieldBuilder() {
      if (secretBuilder_ == null) {
        secretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1beta1.Secret, com.google.cloud.secretmanager.v1beta1.Secret.Builder, com.google.cloud.secretmanager.v1beta1.SecretOrBuilder>(
                getSecret(),
                getParentForChildren(),
                isClean());
        secret_ = null;
      }
      return secretBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. Specifies the fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.secrets.v1beta1.UpdateSecretRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secrets.v1beta1.UpdateSecretRequest)
  private static final com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest();
  }

  public static com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSecretRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSecretRequest>() {
    @java.lang.Override
    public UpdateSecretRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSecretRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSecretRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta1.UpdateSecretRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
