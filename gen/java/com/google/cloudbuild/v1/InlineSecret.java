// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 * <pre>
 * Pairs a set of secret environment variables mapped to encrypted
 * values with the Cloud KMS key to use to decrypt the value.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.InlineSecret}
 */
public final class InlineSecret extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.InlineSecret)
    InlineSecretOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InlineSecret.newBuilder() to construct.
  private InlineSecret(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InlineSecret() {
    kmsKeyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InlineSecret();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_InlineSecret_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetEnvMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_InlineSecret_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.InlineSecret.class, com.google.cloudbuild.v1.InlineSecret.Builder.class);
  }

  public static final int KMS_KEY_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kmsKeyName_ = "";
  /**
   * <pre>
   * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
   * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The kmsKeyName.
   */
  @java.lang.Override
  public java.lang.String getKmsKeyName() {
    java.lang.Object ref = kmsKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKeyName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
   * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for kmsKeyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKmsKeyNameBytes() {
    java.lang.Object ref = kmsKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kmsKeyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENV_MAP_FIELD_NUMBER = 2;
  private static final class EnvMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_InlineSecret_EnvMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.ByteString> envMap_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
  internalGetEnvMap() {
    if (envMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          EnvMapDefaultEntryHolder.defaultEntry);
    }
    return envMap_;
  }
  public int getEnvMapCount() {
    return internalGetEnvMap().getMap().size();
  }
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  @java.lang.Override
  public boolean containsEnvMap(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetEnvMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getEnvMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEnvMap() {
    return getEnvMapMap();
  }
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEnvMapMap() {
    return internalGetEnvMap().getMap();
  }
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.protobuf.ByteString getEnvMapOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.ByteString defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetEnvMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnvMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetEnvMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kmsKeyName_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetEnvMap(),
        EnvMapDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kmsKeyName_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ByteString> entry
         : internalGetEnvMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
      envMap__ = EnvMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, envMap__);
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
    if (!(obj instanceof com.google.cloudbuild.v1.InlineSecret)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.InlineSecret other = (com.google.cloudbuild.v1.InlineSecret) obj;

    if (!getKmsKeyName()
        .equals(other.getKmsKeyName())) return false;
    if (!internalGetEnvMap().equals(
        other.internalGetEnvMap())) return false;
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
    hash = (37 * hash) + KMS_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKeyName().hashCode();
    if (!internalGetEnvMap().getMap().isEmpty()) {
      hash = (37 * hash) + ENV_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetEnvMap().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.InlineSecret parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.InlineSecret prototype) {
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
   * Pairs a set of secret environment variables mapped to encrypted
   * values with the Cloud KMS key to use to decrypt the value.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.InlineSecret}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.InlineSecret)
      com.google.cloudbuild.v1.InlineSecretOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_InlineSecret_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetEnvMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableEnvMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_InlineSecret_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.InlineSecret.class, com.google.cloudbuild.v1.InlineSecret.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.InlineSecret.newBuilder()
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
      kmsKeyName_ = "";
      internalGetMutableEnvMap().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_InlineSecret_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.InlineSecret getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.InlineSecret.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.InlineSecret build() {
      com.google.cloudbuild.v1.InlineSecret result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.InlineSecret buildPartial() {
      com.google.cloudbuild.v1.InlineSecret result = new com.google.cloudbuild.v1.InlineSecret(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.InlineSecret result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kmsKeyName_ = kmsKeyName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.envMap_ = internalGetEnvMap();
        result.envMap_.makeImmutable();
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
      if (other instanceof com.google.cloudbuild.v1.InlineSecret) {
        return mergeFrom((com.google.cloudbuild.v1.InlineSecret)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.InlineSecret other) {
      if (other == com.google.cloudbuild.v1.InlineSecret.getDefaultInstance()) return this;
      if (!other.getKmsKeyName().isEmpty()) {
        kmsKeyName_ = other.kmsKeyName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableEnvMap().mergeFrom(
          other.internalGetEnvMap());
      bitField0_ |= 0x00000002;
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
              kmsKeyName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
              envMap__ = input.readMessage(
                  EnvMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableEnvMap().getMutableMap().put(
                  envMap__.getKey(), envMap__.getValue());
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

    private java.lang.Object kmsKeyName_ = "";
    /**
     * <pre>
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
     * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The kmsKeyName.
     */
    public java.lang.String getKmsKeyName() {
      java.lang.Object ref = kmsKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
     * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for kmsKeyName.
     */
    public com.google.protobuf.ByteString
        getKmsKeyNameBytes() {
      java.lang.Object ref = kmsKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kmsKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
     * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      kmsKeyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
     * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyName() {
      kmsKeyName_ = getDefaultInstance().getKmsKeyName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
     * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      kmsKeyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.ByteString> envMap_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
        internalGetEnvMap() {
      if (envMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            EnvMapDefaultEntryHolder.defaultEntry);
      }
      return envMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
        internalGetMutableEnvMap() {
      if (envMap_ == null) {
        envMap_ = com.google.protobuf.MapField.newMapField(
            EnvMapDefaultEntryHolder.defaultEntry);
      }
      if (!envMap_.isMutable()) {
        envMap_ = envMap_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return envMap_;
    }
    public int getEnvMapCount() {
      return internalGetEnvMap().getMap().size();
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    @java.lang.Override
    public boolean containsEnvMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetEnvMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getEnvMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEnvMap() {
      return getEnvMapMap();
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEnvMapMap() {
      return internalGetEnvMap().getMap();
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.protobuf.ByteString getEnvMapOrDefault(
        java.lang.String key,
        /* nullable */
com.google.protobuf.ByteString defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetEnvMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEnvMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetEnvMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearEnvMap() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableEnvMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    public Builder removeEnvMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableEnvMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString>
        getMutableEnvMap() {
      bitField0_ |= 0x00000002;
      return internalGetMutableEnvMap().getMutableMap();
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    public Builder putEnvMap(
        java.lang.String key,
        com.google.protobuf.ByteString value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableEnvMap().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; env_map = 2;</code>
     */
    public Builder putAllEnvMap(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      internalGetMutableEnvMap().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.InlineSecret)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.InlineSecret)
  private static final com.google.cloudbuild.v1.InlineSecret DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.InlineSecret();
  }

  public static com.google.cloudbuild.v1.InlineSecret getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InlineSecret>
      PARSER = new com.google.protobuf.AbstractParser<InlineSecret>() {
    @java.lang.Override
    public InlineSecret parsePartialFrom(
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

  public static com.google.protobuf.Parser<InlineSecret> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InlineSecret> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.InlineSecret getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

