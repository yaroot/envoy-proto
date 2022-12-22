// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/actions_sdk.proto

package com.google.actions.sdk.v2;

/**
 * <pre>
 * RPC response for EncryptSecret.
 * </pre>
 *
 * Protobuf type {@code google.actions.sdk.v2.EncryptSecretResponse}
 */
public final class EncryptSecretResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.sdk.v2.EncryptSecretResponse)
    EncryptSecretResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncryptSecretResponse.newBuilder() to construct.
  private EncryptSecretResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncryptSecretResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncryptSecretResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.sdk.v2.ActionsSdkProto.internal_static_google_actions_sdk_v2_EncryptSecretResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.sdk.v2.ActionsSdkProto.internal_static_google_actions_sdk_v2_EncryptSecretResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.sdk.v2.EncryptSecretResponse.class, com.google.actions.sdk.v2.EncryptSecretResponse.Builder.class);
  }

  public static final int ACCOUNT_LINKING_SECRET_FIELD_NUMBER = 1;
  private com.google.actions.sdk.v2.AccountLinkingSecret accountLinkingSecret_;
  /**
   * <pre>
   * Contains the encrypted account linking client secret and the key version
   * used to encrypt the secret.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
   * @return Whether the accountLinkingSecret field is set.
   */
  @java.lang.Override
  public boolean hasAccountLinkingSecret() {
    return accountLinkingSecret_ != null;
  }
  /**
   * <pre>
   * Contains the encrypted account linking client secret and the key version
   * used to encrypt the secret.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
   * @return The accountLinkingSecret.
   */
  @java.lang.Override
  public com.google.actions.sdk.v2.AccountLinkingSecret getAccountLinkingSecret() {
    return accountLinkingSecret_ == null ? com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance() : accountLinkingSecret_;
  }
  /**
   * <pre>
   * Contains the encrypted account linking client secret and the key version
   * used to encrypt the secret.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
   */
  @java.lang.Override
  public com.google.actions.sdk.v2.AccountLinkingSecretOrBuilder getAccountLinkingSecretOrBuilder() {
    return accountLinkingSecret_ == null ? com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance() : accountLinkingSecret_;
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
    if (accountLinkingSecret_ != null) {
      output.writeMessage(1, getAccountLinkingSecret());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountLinkingSecret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccountLinkingSecret());
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
    if (!(obj instanceof com.google.actions.sdk.v2.EncryptSecretResponse)) {
      return super.equals(obj);
    }
    com.google.actions.sdk.v2.EncryptSecretResponse other = (com.google.actions.sdk.v2.EncryptSecretResponse) obj;

    if (hasAccountLinkingSecret() != other.hasAccountLinkingSecret()) return false;
    if (hasAccountLinkingSecret()) {
      if (!getAccountLinkingSecret()
          .equals(other.getAccountLinkingSecret())) return false;
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
    if (hasAccountLinkingSecret()) {
      hash = (37 * hash) + ACCOUNT_LINKING_SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getAccountLinkingSecret().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.EncryptSecretResponse parseFrom(
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
  public static Builder newBuilder(com.google.actions.sdk.v2.EncryptSecretResponse prototype) {
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
   * RPC response for EncryptSecret.
   * </pre>
   *
   * Protobuf type {@code google.actions.sdk.v2.EncryptSecretResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.sdk.v2.EncryptSecretResponse)
      com.google.actions.sdk.v2.EncryptSecretResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.ActionsSdkProto.internal_static_google_actions_sdk_v2_EncryptSecretResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.sdk.v2.ActionsSdkProto.internal_static_google_actions_sdk_v2_EncryptSecretResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.sdk.v2.EncryptSecretResponse.class, com.google.actions.sdk.v2.EncryptSecretResponse.Builder.class);
    }

    // Construct using com.google.actions.sdk.v2.EncryptSecretResponse.newBuilder()
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
      accountLinkingSecret_ = null;
      if (accountLinkingSecretBuilder_ != null) {
        accountLinkingSecretBuilder_.dispose();
        accountLinkingSecretBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.sdk.v2.ActionsSdkProto.internal_static_google_actions_sdk_v2_EncryptSecretResponse_descriptor;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.EncryptSecretResponse getDefaultInstanceForType() {
      return com.google.actions.sdk.v2.EncryptSecretResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.EncryptSecretResponse build() {
      com.google.actions.sdk.v2.EncryptSecretResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.EncryptSecretResponse buildPartial() {
      com.google.actions.sdk.v2.EncryptSecretResponse result = new com.google.actions.sdk.v2.EncryptSecretResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.actions.sdk.v2.EncryptSecretResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accountLinkingSecret_ = accountLinkingSecretBuilder_ == null
            ? accountLinkingSecret_
            : accountLinkingSecretBuilder_.build();
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
      if (other instanceof com.google.actions.sdk.v2.EncryptSecretResponse) {
        return mergeFrom((com.google.actions.sdk.v2.EncryptSecretResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.sdk.v2.EncryptSecretResponse other) {
      if (other == com.google.actions.sdk.v2.EncryptSecretResponse.getDefaultInstance()) return this;
      if (other.hasAccountLinkingSecret()) {
        mergeAccountLinkingSecret(other.getAccountLinkingSecret());
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
                  getAccountLinkingSecretFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.actions.sdk.v2.AccountLinkingSecret accountLinkingSecret_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.actions.sdk.v2.AccountLinkingSecret, com.google.actions.sdk.v2.AccountLinkingSecret.Builder, com.google.actions.sdk.v2.AccountLinkingSecretOrBuilder> accountLinkingSecretBuilder_;
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     * @return Whether the accountLinkingSecret field is set.
     */
    public boolean hasAccountLinkingSecret() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     * @return The accountLinkingSecret.
     */
    public com.google.actions.sdk.v2.AccountLinkingSecret getAccountLinkingSecret() {
      if (accountLinkingSecretBuilder_ == null) {
        return accountLinkingSecret_ == null ? com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance() : accountLinkingSecret_;
      } else {
        return accountLinkingSecretBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    public Builder setAccountLinkingSecret(com.google.actions.sdk.v2.AccountLinkingSecret value) {
      if (accountLinkingSecretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accountLinkingSecret_ = value;
      } else {
        accountLinkingSecretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    public Builder setAccountLinkingSecret(
        com.google.actions.sdk.v2.AccountLinkingSecret.Builder builderForValue) {
      if (accountLinkingSecretBuilder_ == null) {
        accountLinkingSecret_ = builderForValue.build();
      } else {
        accountLinkingSecretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    public Builder mergeAccountLinkingSecret(com.google.actions.sdk.v2.AccountLinkingSecret value) {
      if (accountLinkingSecretBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          accountLinkingSecret_ != null &&
          accountLinkingSecret_ != com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance()) {
          getAccountLinkingSecretBuilder().mergeFrom(value);
        } else {
          accountLinkingSecret_ = value;
        }
      } else {
        accountLinkingSecretBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    public Builder clearAccountLinkingSecret() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accountLinkingSecret_ = null;
      if (accountLinkingSecretBuilder_ != null) {
        accountLinkingSecretBuilder_.dispose();
        accountLinkingSecretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    public com.google.actions.sdk.v2.AccountLinkingSecret.Builder getAccountLinkingSecretBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccountLinkingSecretFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    public com.google.actions.sdk.v2.AccountLinkingSecretOrBuilder getAccountLinkingSecretOrBuilder() {
      if (accountLinkingSecretBuilder_ != null) {
        return accountLinkingSecretBuilder_.getMessageOrBuilder();
      } else {
        return accountLinkingSecret_ == null ?
            com.google.actions.sdk.v2.AccountLinkingSecret.getDefaultInstance() : accountLinkingSecret_;
      }
    }
    /**
     * <pre>
     * Contains the encrypted account linking client secret and the key version
     * used to encrypt the secret.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.AccountLinkingSecret account_linking_secret = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.actions.sdk.v2.AccountLinkingSecret, com.google.actions.sdk.v2.AccountLinkingSecret.Builder, com.google.actions.sdk.v2.AccountLinkingSecretOrBuilder> 
        getAccountLinkingSecretFieldBuilder() {
      if (accountLinkingSecretBuilder_ == null) {
        accountLinkingSecretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.actions.sdk.v2.AccountLinkingSecret, com.google.actions.sdk.v2.AccountLinkingSecret.Builder, com.google.actions.sdk.v2.AccountLinkingSecretOrBuilder>(
                getAccountLinkingSecret(),
                getParentForChildren(),
                isClean());
        accountLinkingSecret_ = null;
      }
      return accountLinkingSecretBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.actions.sdk.v2.EncryptSecretResponse)
  }

  // @@protoc_insertion_point(class_scope:google.actions.sdk.v2.EncryptSecretResponse)
  private static final com.google.actions.sdk.v2.EncryptSecretResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.sdk.v2.EncryptSecretResponse();
  }

  public static com.google.actions.sdk.v2.EncryptSecretResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptSecretResponse>
      PARSER = new com.google.protobuf.AbstractParser<EncryptSecretResponse>() {
    @java.lang.Override
    public EncryptSecretResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<EncryptSecretResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptSecretResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.sdk.v2.EncryptSecretResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
