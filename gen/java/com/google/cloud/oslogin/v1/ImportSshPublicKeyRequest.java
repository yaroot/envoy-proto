// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

/**
 * <pre>
 * A request message for importing an SSH public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oslogin.v1.ImportSshPublicKeyRequest}
 */
public final class ImportSshPublicKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
    ImportSshPublicKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportSshPublicKeyRequest.newBuilder() to construct.
  private ImportSshPublicKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportSshPublicKeyRequest() {
    parent_ = "";
    projectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportSshPublicKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.class, com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSH_PUBLIC_KEY_FIELD_NUMBER = 2;
  private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
  /**
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the sshPublicKey field is set.
   */
  @java.lang.Override
  public boolean hasSshPublicKey() {
    return sshPublicKey_ != null;
  }
  /**
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sshPublicKey.
   */
  @java.lang.Override
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
    return sshPublicKey_ == null ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
  }
  /**
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder() {
    return sshPublicKey_ == null ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (sshPublicKey_ != null) {
      output.writeMessage(2, getSshPublicKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, projectId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (sshPublicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSshPublicKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, projectId_);
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
    if (!(obj instanceof com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest other = (com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSshPublicKey() != other.hasSshPublicKey()) return false;
    if (hasSshPublicKey()) {
      if (!getSshPublicKey()
          .equals(other.getSshPublicKey())) return false;
    }
    if (!getProjectId()
        .equals(other.getProjectId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSshPublicKey()) {
      hash = (37 * hash) + SSH_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getSshPublicKey().hashCode();
    }
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest prototype) {
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
   * A request message for importing an SSH public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oslogin.v1.ImportSshPublicKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.class, com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.newBuilder()
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
      parent_ = "";
      sshPublicKey_ = null;
      if (sshPublicKeyBuilder_ != null) {
        sshPublicKeyBuilder_.dispose();
        sshPublicKeyBuilder_ = null;
      }
      projectId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest build() {
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest buildPartial() {
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest result = new com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sshPublicKey_ = sshPublicKeyBuilder_ == null
            ? sshPublicKey_
            : sshPublicKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.projectId_ = projectId_;
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
      if (other instanceof com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) {
        return mergeFrom((com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest other) {
      if (other == com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSshPublicKey()) {
        mergeSshPublicKey(other.getSshPublicKey());
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSshPublicKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              projectId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder> sshPublicKeyBuilder_;
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the sshPublicKey field is set.
     */
    public boolean hasSshPublicKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The sshPublicKey.
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
      if (sshPublicKeyBuilder_ == null) {
        return sshPublicKey_ == null ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
      } else {
        return sshPublicKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setSshPublicKey(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sshPublicKey_ = value;
      } else {
        sshPublicKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder builderForValue) {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = builderForValue.build();
      } else {
        sshPublicKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeSshPublicKey(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          sshPublicKey_ != null &&
          sshPublicKey_ != com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()) {
          getSshPublicKeyBuilder().mergeFrom(value);
        } else {
          sshPublicKey_ = value;
        }
      } else {
        sshPublicKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearSshPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sshPublicKey_ = null;
      if (sshPublicKeyBuilder_ != null) {
        sshPublicKeyBuilder_.dispose();
        sshPublicKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder getSshPublicKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSshPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder() {
      if (sshPublicKeyBuilder_ != null) {
        return sshPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return sshPublicKey_ == null ?
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
      }
    }
    /**
     * <pre>
     * Optional. The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder> 
        getSshPublicKeyFieldBuilder() {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>(
                getSshPublicKey(),
                getParentForChildren(),
                isClean());
        sshPublicKey_ = null;
      }
      return sshPublicKeyBuilder_;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
  private static final com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest();
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportSshPublicKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportSshPublicKeyRequest>() {
    @java.lang.Override
    public ImportSshPublicKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportSshPublicKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportSshPublicKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

