// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/account_linking_secret.proto

package com.google.actions.sdk.v2;

/**
 * <pre>
 * Information about the encrypted OAuth client secret used in account linking
 * flows (for AUTH_CODE grant type).
 * </pre>
 *
 * Protobuf type {@code google.actions.sdk.v2.AccountLinkingSecret}
 */
public final class AccountLinkingSecret extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.sdk.v2.AccountLinkingSecret)
    AccountLinkingSecretOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountLinkingSecret.newBuilder() to construct.
  private AccountLinkingSecret(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountLinkingSecret() {
    encryptedClientSecret_ = com.google.protobuf.ByteString.EMPTY;
    encryptionKeyVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountLinkingSecret();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.sdk.v2.AccountLinkingSecretProto.internal_static_google_actions_sdk_v2_AccountLinkingSecret_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.sdk.v2.AccountLinkingSecretProto.internal_static_google_actions_sdk_v2_AccountLinkingSecret_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.sdk.v2.AccountLinkingSecret.class, com.google.actions.sdk.v2.AccountLinkingSecret.Builder.class);
  }

  public static final int ENCRYPTED_CLIENT_SECRET_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString encryptedClientSecret_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Encrypted account linking client secret ciphertext.
   * </pre>
   *
   * <code>bytes encrypted_client_secret = 1;</code>
   * @return The encryptedClientSecret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEncryptedClientSecret() {
    return encryptedClientSecret_;
  }

  public static final int ENCRYPTION_KEY_VERSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object encryptionKeyVersion_ = "";
  /**
   * <pre>
   * The version of the crypto key used to encrypt the account linking client
   * secret.
   * Note that this field is ignored in push, preview, and version creation
   * flows.
   * </pre>
   *
   * <code>string encryption_key_version = 2;</code>
   * @return The encryptionKeyVersion.
   */
  @java.lang.Override
  public java.lang.String getEncryptionKeyVersion() {
    java.lang.Object ref = encryptionKeyVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encryptionKeyVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The version of the crypto key used to encrypt the account linking client
   * secret.
   * Note that this field is ignored in push, preview, and version creation
   * flows.
   * </pre>
   *
   * <code>string encryption_key_version = 2;</code>
   * @return The bytes for encryptionKeyVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncryptionKeyVersionBytes() {
    java.lang.Object ref = encryptionKeyVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encryptionKeyVersion_ = b;
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
    if (!encryptedClientSecret_.isEmpty()) {
      output.writeBytes(1, encryptedClientSecret_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encryptionKeyVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, encryptionKeyVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!encryptedClientSecret_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, encryptedClientSecret_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encryptionKeyVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, encryptionKeyVersion_);
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
    if (!(obj instanceof com.google.actions.sdk.v2.AccountLinkingSecret)) {
      return super.equals(obj);
    }
    com.google.actions.sdk.v2.AccountLinkingSecret other = (com.google.actions.sdk.v2.AccountLinkingSecret) obj;

    if (!getEncryptedClientSecret()
        .equals(other.getEncryptedClientSecret())) return false;
    if (!getEncryptionKeyVersion()
        .equals(other.getEncryptionKeyVersion())) return false;
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
    hash = (37 * hash) + ENCRYPTED_CLIENT_SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptedClientSecret().hashCode();
    hash = (37 * hash) + ENCRYPTION_KEY_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptionKeyVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.AccountLinkingSecret parseFrom(
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
  public static Builder newBuilder(com.google.actions.sdk.v2.AccountLinkingSecret prototype) {
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
   * Information about the encrypted OAuth client secret used in account linking
   * flows (for AUTH_CODE grant type).
   * </pre>
   *
   * Protobuf type {@code google.actions.sdk.v2.AccountLinkingSecret}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.sdk.v2.AccountLinkingSecret)
      com.google.actions.sdk.v2.AccountLinkingSecretOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.AccountLinkingSecretProto.internal_static_google_actions_sdk_v2_AccountLinkingSecret_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.sdk.v2.AccountLinkingSecretProto.internal_static_google_actions_sdk_v2_AccountLinkingSecret_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.sdk.v2.AccountLinkingSecret.class, com.google.actions.sdk.v2.AccountLinkingSecret.Builder.class);
    }

    // Construct using com.google.actions.sdk.v2.AccountLinkingSecret.newBuilder()
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
      encryptedClientSecret_ = com.google.protobuf.ByteString.EMPTY;
      encryptionKeyVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.sdk.v2.AccountLinkingSecretProto.internal_static_google_actions_sdk_v2_AccountLinkingSecret_descriptor;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.AccountLinkingSecret getDefaultInstanceForType() {
      return com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.AccountLinkingSecret build() {
      com.google.actions.sdk.v2.AccountLinkingSecret result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.AccountLinkingSecret buildPartial() {
      com.google.actions.sdk.v2.AccountLinkingSecret result = new com.google.actions.sdk.v2.AccountLinkingSecret(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.actions.sdk.v2.AccountLinkingSecret result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encryptedClientSecret_ = encryptedClientSecret_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.encryptionKeyVersion_ = encryptionKeyVersion_;
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
      if (other instanceof com.google.actions.sdk.v2.AccountLinkingSecret) {
        return mergeFrom((com.google.actions.sdk.v2.AccountLinkingSecret)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.sdk.v2.AccountLinkingSecret other) {
      if (other == com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance()) return this;
      if (other.getEncryptedClientSecret() != com.google.protobuf.ByteString.EMPTY) {
        setEncryptedClientSecret(other.getEncryptedClientSecret());
      }
      if (!other.getEncryptionKeyVersion().isEmpty()) {
        encryptionKeyVersion_ = other.encryptionKeyVersion_;
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
              encryptedClientSecret_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              encryptionKeyVersion_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.ByteString encryptedClientSecret_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Encrypted account linking client secret ciphertext.
     * </pre>
     *
     * <code>bytes encrypted_client_secret = 1;</code>
     * @return The encryptedClientSecret.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEncryptedClientSecret() {
      return encryptedClientSecret_;
    }
    /**
     * <pre>
     * Encrypted account linking client secret ciphertext.
     * </pre>
     *
     * <code>bytes encrypted_client_secret = 1;</code>
     * @param value The encryptedClientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptedClientSecret(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      encryptedClientSecret_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Encrypted account linking client secret ciphertext.
     * </pre>
     *
     * <code>bytes encrypted_client_secret = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptedClientSecret() {
      bitField0_ = (bitField0_ & ~0x00000001);
      encryptedClientSecret_ = getDefaultInstance().getEncryptedClientSecret();
      onChanged();
      return this;
    }

    private java.lang.Object encryptionKeyVersion_ = "";
    /**
     * <pre>
     * The version of the crypto key used to encrypt the account linking client
     * secret.
     * Note that this field is ignored in push, preview, and version creation
     * flows.
     * </pre>
     *
     * <code>string encryption_key_version = 2;</code>
     * @return The encryptionKeyVersion.
     */
    public java.lang.String getEncryptionKeyVersion() {
      java.lang.Object ref = encryptionKeyVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encryptionKeyVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The version of the crypto key used to encrypt the account linking client
     * secret.
     * Note that this field is ignored in push, preview, and version creation
     * flows.
     * </pre>
     *
     * <code>string encryption_key_version = 2;</code>
     * @return The bytes for encryptionKeyVersion.
     */
    public com.google.protobuf.ByteString
        getEncryptionKeyVersionBytes() {
      java.lang.Object ref = encryptionKeyVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encryptionKeyVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The version of the crypto key used to encrypt the account linking client
     * secret.
     * Note that this field is ignored in push, preview, and version creation
     * flows.
     * </pre>
     *
     * <code>string encryption_key_version = 2;</code>
     * @param value The encryptionKeyVersion to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionKeyVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      encryptionKeyVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of the crypto key used to encrypt the account linking client
     * secret.
     * Note that this field is ignored in push, preview, and version creation
     * flows.
     * </pre>
     *
     * <code>string encryption_key_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptionKeyVersion() {
      encryptionKeyVersion_ = getDefaultInstance().getEncryptionKeyVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of the crypto key used to encrypt the account linking client
     * secret.
     * Note that this field is ignored in push, preview, and version creation
     * flows.
     * </pre>
     *
     * <code>string encryption_key_version = 2;</code>
     * @param value The bytes for encryptionKeyVersion to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionKeyVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      encryptionKeyVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.actions.sdk.v2.AccountLinkingSecret)
  }

  // @@protoc_insertion_point(class_scope:google.actions.sdk.v2.AccountLinkingSecret)
  private static final com.google.actions.sdk.v2.AccountLinkingSecret DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.sdk.v2.AccountLinkingSecret();
  }

  public static com.google.actions.sdk.v2.AccountLinkingSecret getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountLinkingSecret>
      PARSER = new com.google.protobuf.AbstractParser<AccountLinkingSecret>() {
    @java.lang.Override
    public AccountLinkingSecret parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountLinkingSecret> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountLinkingSecret> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.sdk.v2.AccountLinkingSecret getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
