// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Pseudonymization method that generates surrogates via cryptographic hashing.
 * Uses SHA-256.
 * The key size must be either 32 or 64 bytes.
 * Outputs a base64 encoded representation of the hashed output
 * (for example, L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=).
 * Currently, only string and integer values can be hashed.
 * See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.CryptoHashConfig}
 */
public final class CryptoHashConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.CryptoHashConfig)
    CryptoHashConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CryptoHashConfig.newBuilder() to construct.
  private CryptoHashConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CryptoHashConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CryptoHashConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_CryptoHashConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_CryptoHashConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.CryptoHashConfig.class, com.google.privacy.dlp.v2.CryptoHashConfig.Builder.class);
  }

  public static final int CRYPTO_KEY_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.CryptoKey cryptoKey_;
  /**
   * <pre>
   * The key used by the hash function.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   * @return Whether the cryptoKey field is set.
   */
  @java.lang.Override
  public boolean hasCryptoKey() {
    return cryptoKey_ != null;
  }
  /**
   * <pre>
   * The key used by the hash function.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   * @return The cryptoKey.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CryptoKey getCryptoKey() {
    return cryptoKey_ == null ? com.google.privacy.dlp.v2.CryptoKey.getDefaultInstance() : cryptoKey_;
  }
  /**
   * <pre>
   * The key used by the hash function.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CryptoKeyOrBuilder getCryptoKeyOrBuilder() {
    return cryptoKey_ == null ? com.google.privacy.dlp.v2.CryptoKey.getDefaultInstance() : cryptoKey_;
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
    if (cryptoKey_ != null) {
      output.writeMessage(1, getCryptoKey());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cryptoKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCryptoKey());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.CryptoHashConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.CryptoHashConfig other = (com.google.privacy.dlp.v2.CryptoHashConfig) obj;

    if (hasCryptoKey() != other.hasCryptoKey()) return false;
    if (hasCryptoKey()) {
      if (!getCryptoKey()
          .equals(other.getCryptoKey())) return false;
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
    if (hasCryptoKey()) {
      hash = (37 * hash) + CRYPTO_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.CryptoHashConfig parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.CryptoHashConfig prototype) {
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
   * Pseudonymization method that generates surrogates via cryptographic hashing.
   * Uses SHA-256.
   * The key size must be either 32 or 64 bytes.
   * Outputs a base64 encoded representation of the hashed output
   * (for example, L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=).
   * Currently, only string and integer values can be hashed.
   * See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.CryptoHashConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.CryptoHashConfig)
      com.google.privacy.dlp.v2.CryptoHashConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_CryptoHashConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_CryptoHashConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.CryptoHashConfig.class, com.google.privacy.dlp.v2.CryptoHashConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.CryptoHashConfig.newBuilder()
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
      cryptoKey_ = null;
      if (cryptoKeyBuilder_ != null) {
        cryptoKeyBuilder_.dispose();
        cryptoKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_CryptoHashConfig_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CryptoHashConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.CryptoHashConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CryptoHashConfig build() {
      com.google.privacy.dlp.v2.CryptoHashConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CryptoHashConfig buildPartial() {
      com.google.privacy.dlp.v2.CryptoHashConfig result = new com.google.privacy.dlp.v2.CryptoHashConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.CryptoHashConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cryptoKey_ = cryptoKeyBuilder_ == null
            ? cryptoKey_
            : cryptoKeyBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.CryptoHashConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.CryptoHashConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.CryptoHashConfig other) {
      if (other == com.google.privacy.dlp.v2.CryptoHashConfig.getDefaultInstance()) return this;
      if (other.hasCryptoKey()) {
        mergeCryptoKey(other.getCryptoKey());
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
                  getCryptoKeyFieldBuilder().getBuilder(),
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

    private com.google.privacy.dlp.v2.CryptoKey cryptoKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.CryptoKey, com.google.privacy.dlp.v2.CryptoKey.Builder, com.google.privacy.dlp.v2.CryptoKeyOrBuilder> cryptoKeyBuilder_;
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     * @return Whether the cryptoKey field is set.
     */
    public boolean hasCryptoKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     * @return The cryptoKey.
     */
    public com.google.privacy.dlp.v2.CryptoKey getCryptoKey() {
      if (cryptoKeyBuilder_ == null) {
        return cryptoKey_ == null ? com.google.privacy.dlp.v2.CryptoKey.getDefaultInstance() : cryptoKey_;
      } else {
        return cryptoKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    public Builder setCryptoKey(com.google.privacy.dlp.v2.CryptoKey value) {
      if (cryptoKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cryptoKey_ = value;
      } else {
        cryptoKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    public Builder setCryptoKey(
        com.google.privacy.dlp.v2.CryptoKey.Builder builderForValue) {
      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = builderForValue.build();
      } else {
        cryptoKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    public Builder mergeCryptoKey(com.google.privacy.dlp.v2.CryptoKey value) {
      if (cryptoKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          cryptoKey_ != null &&
          cryptoKey_ != com.google.privacy.dlp.v2.CryptoKey.getDefaultInstance()) {
          getCryptoKeyBuilder().mergeFrom(value);
        } else {
          cryptoKey_ = value;
        }
      } else {
        cryptoKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    public Builder clearCryptoKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cryptoKey_ = null;
      if (cryptoKeyBuilder_ != null) {
        cryptoKeyBuilder_.dispose();
        cryptoKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.CryptoKey.Builder getCryptoKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCryptoKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.CryptoKeyOrBuilder getCryptoKeyOrBuilder() {
      if (cryptoKeyBuilder_ != null) {
        return cryptoKeyBuilder_.getMessageOrBuilder();
      } else {
        return cryptoKey_ == null ?
            com.google.privacy.dlp.v2.CryptoKey.getDefaultInstance() : cryptoKey_;
      }
    }
    /**
     * <pre>
     * The key used by the hash function.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.CryptoKey, com.google.privacy.dlp.v2.CryptoKey.Builder, com.google.privacy.dlp.v2.CryptoKeyOrBuilder> 
        getCryptoKeyFieldBuilder() {
      if (cryptoKeyBuilder_ == null) {
        cryptoKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.CryptoKey, com.google.privacy.dlp.v2.CryptoKey.Builder, com.google.privacy.dlp.v2.CryptoKeyOrBuilder>(
                getCryptoKey(),
                getParentForChildren(),
                isClean());
        cryptoKey_ = null;
      }
      return cryptoKeyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.CryptoHashConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.CryptoHashConfig)
  private static final com.google.privacy.dlp.v2.CryptoHashConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.CryptoHashConfig();
  }

  public static com.google.privacy.dlp.v2.CryptoHashConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CryptoHashConfig>
      PARSER = new com.google.protobuf.AbstractParser<CryptoHashConfig>() {
    @java.lang.Override
    public CryptoHashConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CryptoHashConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CryptoHashConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.CryptoHashConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

