// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1/resources.proto

package com.google.cloud.security.privateca.v1;

/**
 * <pre>
 * A [PublicKey][google.cloud.security.privateca.v1.PublicKey] describes a public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1.PublicKey}
 */
public final class PublicKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1.PublicKey)
    PublicKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicKey.newBuilder() to construct.
  private PublicKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicKey() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    format_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublicKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_PublicKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_PublicKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1.PublicKey.class, com.google.cloud.security.privateca.v1.PublicKey.Builder.class);
  }

  /**
   * <pre>
   * Types of public keys formats that are supported. Currently, only `PEM`
   * format is supported.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.security.privateca.v1.PublicKey.KeyFormat}
   */
  public enum KeyFormat
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default unspecified value.
     * </pre>
     *
     * <code>KEY_FORMAT_UNSPECIFIED = 0;</code>
     */
    KEY_FORMAT_UNSPECIFIED(0),
    /**
     * <pre>
     * The key is PEM-encoded as defined in [RFC
     * 7468](https://tools.ietf.org/html/rfc7468). It can be any of the
     * following: a PEM-encoded PKCS#1/RFC 3447 RSAPublicKey
     * structure, an RFC 5280
     * [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1)
     * or a PEM-encoded X.509 certificate signing request (CSR). If a
     * [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1)
     * is specified, it can contain a A PEM-encoded PKCS#1/RFC 3447 RSAPublicKey
     * or a NIST P-256/secp256r1/prime256v1 or P-384 key. If a CSR is specified,
     * it will used solely for the purpose of extracting the public key. When
     * generated by the service, it will always be an RFC 5280
     * [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1)
     * structure containing an algorithm identifier and a key.
     * </pre>
     *
     * <code>PEM = 1;</code>
     */
    PEM(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default unspecified value.
     * </pre>
     *
     * <code>KEY_FORMAT_UNSPECIFIED = 0;</code>
     */
    public static final int KEY_FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The key is PEM-encoded as defined in [RFC
     * 7468](https://tools.ietf.org/html/rfc7468). It can be any of the
     * following: a PEM-encoded PKCS#1/RFC 3447 RSAPublicKey
     * structure, an RFC 5280
     * [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1)
     * or a PEM-encoded X.509 certificate signing request (CSR). If a
     * [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1)
     * is specified, it can contain a A PEM-encoded PKCS#1/RFC 3447 RSAPublicKey
     * or a NIST P-256/secp256r1/prime256v1 or P-384 key. If a CSR is specified,
     * it will used solely for the purpose of extracting the public key. When
     * generated by the service, it will always be an RFC 5280
     * [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1)
     * structure containing an algorithm identifier and a key.
     * </pre>
     *
     * <code>PEM = 1;</code>
     */
    public static final int PEM_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KeyFormat valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KeyFormat forNumber(int value) {
      switch (value) {
        case 0: return KEY_FORMAT_UNSPECIFIED;
        case 1: return PEM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KeyFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KeyFormat> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KeyFormat>() {
            public KeyFormat findValueByNumber(int number) {
              return KeyFormat.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.security.privateca.v1.PublicKey.getDescriptor().getEnumTypes().get(0);
    }

    private static final KeyFormat[] VALUES = values();

    public static KeyFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private KeyFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.security.privateca.v1.PublicKey.KeyFormat)
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Required. A public key. The padding and encoding
   * must match with the `KeyFormat` value specified for the `format` field.
   * </pre>
   *
   * <code>bytes key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int FORMAT_FIELD_NUMBER = 2;
  private int format_ = 0;
  /**
   * <pre>
   * Required. The format of the public key.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for format.
   */
  @java.lang.Override public int getFormatValue() {
    return format_;
  }
  /**
   * <pre>
   * Required. The format of the public key.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The format.
   */
  @java.lang.Override public com.google.cloud.security.privateca.v1.PublicKey.KeyFormat getFormat() {
    com.google.cloud.security.privateca.v1.PublicKey.KeyFormat result = com.google.cloud.security.privateca.v1.PublicKey.KeyFormat.forNumber(format_);
    return result == null ? com.google.cloud.security.privateca.v1.PublicKey.KeyFormat.UNRECOGNIZED : result;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (format_ != com.google.cloud.security.privateca.v1.PublicKey.KeyFormat.KEY_FORMAT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, format_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (format_ != com.google.cloud.security.privateca.v1.PublicKey.KeyFormat.KEY_FORMAT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, format_);
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
    if (!(obj instanceof com.google.cloud.security.privateca.v1.PublicKey)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1.PublicKey other = (com.google.cloud.security.privateca.v1.PublicKey) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (format_ != other.format_) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.security.privateca.v1.PublicKey parseFrom(
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
  public static Builder newBuilder(com.google.cloud.security.privateca.v1.PublicKey prototype) {
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
   * A [PublicKey][google.cloud.security.privateca.v1.PublicKey] describes a public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1.PublicKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1.PublicKey)
      com.google.cloud.security.privateca.v1.PublicKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_PublicKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_PublicKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1.PublicKey.class, com.google.cloud.security.privateca.v1.PublicKey.Builder.class);
    }

    // Construct using com.google.cloud.security.privateca.v1.PublicKey.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;
      format_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.internal_static_google_cloud_security_privateca_v1_PublicKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.PublicKey getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1.PublicKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.PublicKey build() {
      com.google.cloud.security.privateca.v1.PublicKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.PublicKey buildPartial() {
      com.google.cloud.security.privateca.v1.PublicKey result = new com.google.cloud.security.privateca.v1.PublicKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.security.privateca.v1.PublicKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.format_ = format_;
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
      if (other instanceof com.google.cloud.security.privateca.v1.PublicKey) {
        return mergeFrom((com.google.cloud.security.privateca.v1.PublicKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.security.privateca.v1.PublicKey other) {
      if (other == com.google.cloud.security.privateca.v1.PublicKey.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
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
              key_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              format_ = input.readEnum();
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

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Required. A public key. The padding and encoding
     * must match with the `KeyFormat` value specified for the `format` field.
     * </pre>
     *
     * <code>bytes key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * Required. A public key. The padding and encoding
     * must match with the `KeyFormat` value specified for the `format` field.
     * </pre>
     *
     * <code>bytes key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A public key. The padding and encoding
     * must match with the `KeyFormat` value specified for the `format` field.
     * </pre>
     *
     * <code>bytes key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private int format_ = 0;
    /**
     * <pre>
     * Required. The format of the public key.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for format.
     */
    @java.lang.Override public int getFormatValue() {
      return format_;
    }
    /**
     * <pre>
     * Required. The format of the public key.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The format of the public key.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The format.
     */
    @java.lang.Override
    public com.google.cloud.security.privateca.v1.PublicKey.KeyFormat getFormat() {
      com.google.cloud.security.privateca.v1.PublicKey.KeyFormat result = com.google.cloud.security.privateca.v1.PublicKey.KeyFormat.forNumber(format_);
      return result == null ? com.google.cloud.security.privateca.v1.PublicKey.KeyFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The format of the public key.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(com.google.cloud.security.privateca.v1.PublicKey.KeyFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The format of the public key.
     * </pre>
     *
     * <code>.google.cloud.security.privateca.v1.PublicKey.KeyFormat format = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      bitField0_ = (bitField0_ & ~0x00000002);
      format_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1.PublicKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1.PublicKey)
  private static final com.google.cloud.security.privateca.v1.PublicKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.privateca.v1.PublicKey();
  }

  public static com.google.cloud.security.privateca.v1.PublicKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKey>
      PARSER = new com.google.protobuf.AbstractParser<PublicKey>() {
    @java.lang.Override
    public PublicKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublicKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1.PublicKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

