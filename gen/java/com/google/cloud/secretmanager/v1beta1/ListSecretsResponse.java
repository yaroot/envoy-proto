// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secrets/v1beta1/service.proto

package com.google.cloud.secretmanager.v1beta1;

/**
 * <pre>
 * Response message for [SecretManagerService.ListSecrets][google.cloud.secrets.v1beta1.SecretManagerService.ListSecrets].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secrets.v1beta1.ListSecretsResponse}
 */
public final class ListSecretsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.secrets.v1beta1.ListSecretsResponse)
    ListSecretsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSecretsResponse.newBuilder() to construct.
  private ListSecretsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSecretsResponse() {
    secrets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSecretsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.class, com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.Builder.class);
  }

  public static final int SECRETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.secretmanager.v1beta1.Secret> secrets_;
  /**
   * <pre>
   * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
   * first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.secretmanager.v1beta1.Secret> getSecretsList() {
    return secrets_;
  }
  /**
   * <pre>
   * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
   * first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.secretmanager.v1beta1.SecretOrBuilder> 
      getSecretsOrBuilderList() {
    return secrets_;
  }
  /**
   * <pre>
   * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
   * first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
   */
  @java.lang.Override
  public int getSecretsCount() {
    return secrets_.size();
  }
  /**
   * <pre>
   * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
   * first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta1.Secret getSecrets(int index) {
    return secrets_.get(index);
  }
  /**
   * <pre>
   * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
   * first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta1.SecretOrBuilder getSecretsOrBuilder(
      int index) {
    return secrets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve the next page of results. Pass this value in
   * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve the next page of results. Pass this value in
   * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_ = 0;
  /**
   * <pre>
   * The total number of [Secrets][google.cloud.secrets.v1beta1.Secret].
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
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
    for (int i = 0; i < secrets_.size(); i++) {
      output.writeMessage(1, secrets_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < secrets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, secrets_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.google.cloud.secretmanager.v1beta1.ListSecretsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1beta1.ListSecretsResponse other = (com.google.cloud.secretmanager.v1beta1.ListSecretsResponse) obj;

    if (!getSecretsList()
        .equals(other.getSecretsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
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
    if (getSecretsCount() > 0) {
      hash = (37 * hash) + SECRETS_FIELD_NUMBER;
      hash = (53 * hash) + getSecretsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.secretmanager.v1beta1.ListSecretsResponse prototype) {
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
   * Response message for [SecretManagerService.ListSecrets][google.cloud.secrets.v1beta1.SecretManagerService.ListSecrets].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secrets.v1beta1.ListSecretsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secrets.v1beta1.ListSecretsResponse)
      com.google.cloud.secretmanager.v1beta1.ListSecretsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.class, com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.newBuilder()
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
      if (secretsBuilder_ == null) {
        secrets_ = java.util.Collections.emptyList();
      } else {
        secrets_ = null;
        secretsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      totalSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.secretmanager.v1beta1.ServiceProto.internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta1.ListSecretsResponse getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta1.ListSecretsResponse build() {
      com.google.cloud.secretmanager.v1beta1.ListSecretsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta1.ListSecretsResponse buildPartial() {
      com.google.cloud.secretmanager.v1beta1.ListSecretsResponse result = new com.google.cloud.secretmanager.v1beta1.ListSecretsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.secretmanager.v1beta1.ListSecretsResponse result) {
      if (secretsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          secrets_ = java.util.Collections.unmodifiableList(secrets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.secrets_ = secrets_;
      } else {
        result.secrets_ = secretsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.secretmanager.v1beta1.ListSecretsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalSize_ = totalSize_;
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
      if (other instanceof com.google.cloud.secretmanager.v1beta1.ListSecretsResponse) {
        return mergeFrom((com.google.cloud.secretmanager.v1beta1.ListSecretsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1beta1.ListSecretsResponse other) {
      if (other == com.google.cloud.secretmanager.v1beta1.ListSecretsResponse.getDefaultInstance()) return this;
      if (secretsBuilder_ == null) {
        if (!other.secrets_.isEmpty()) {
          if (secrets_.isEmpty()) {
            secrets_ = other.secrets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSecretsIsMutable();
            secrets_.addAll(other.secrets_);
          }
          onChanged();
        }
      } else {
        if (!other.secrets_.isEmpty()) {
          if (secretsBuilder_.isEmpty()) {
            secretsBuilder_.dispose();
            secretsBuilder_ = null;
            secrets_ = other.secrets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            secretsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSecretsFieldBuilder() : null;
          } else {
            secretsBuilder_.addAllMessages(other.secrets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
              com.google.cloud.secretmanager.v1beta1.Secret m =
                  input.readMessage(
                      com.google.cloud.secretmanager.v1beta1.Secret.parser(),
                      extensionRegistry);
              if (secretsBuilder_ == null) {
                ensureSecretsIsMutable();
                secrets_.add(m);
              } else {
                secretsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              totalSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.util.List<com.google.cloud.secretmanager.v1beta1.Secret> secrets_ =
      java.util.Collections.emptyList();
    private void ensureSecretsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        secrets_ = new java.util.ArrayList<com.google.cloud.secretmanager.v1beta1.Secret>(secrets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.secretmanager.v1beta1.Secret, com.google.cloud.secretmanager.v1beta1.Secret.Builder, com.google.cloud.secretmanager.v1beta1.SecretOrBuilder> secretsBuilder_;

    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public java.util.List<com.google.cloud.secretmanager.v1beta1.Secret> getSecretsList() {
      if (secretsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(secrets_);
      } else {
        return secretsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public int getSecretsCount() {
      if (secretsBuilder_ == null) {
        return secrets_.size();
      } else {
        return secretsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public com.google.cloud.secretmanager.v1beta1.Secret getSecrets(int index) {
      if (secretsBuilder_ == null) {
        return secrets_.get(index);
      } else {
        return secretsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder setSecrets(
        int index, com.google.cloud.secretmanager.v1beta1.Secret value) {
      if (secretsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecretsIsMutable();
        secrets_.set(index, value);
        onChanged();
      } else {
        secretsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder setSecrets(
        int index, com.google.cloud.secretmanager.v1beta1.Secret.Builder builderForValue) {
      if (secretsBuilder_ == null) {
        ensureSecretsIsMutable();
        secrets_.set(index, builderForValue.build());
        onChanged();
      } else {
        secretsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder addSecrets(com.google.cloud.secretmanager.v1beta1.Secret value) {
      if (secretsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecretsIsMutable();
        secrets_.add(value);
        onChanged();
      } else {
        secretsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder addSecrets(
        int index, com.google.cloud.secretmanager.v1beta1.Secret value) {
      if (secretsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecretsIsMutable();
        secrets_.add(index, value);
        onChanged();
      } else {
        secretsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder addSecrets(
        com.google.cloud.secretmanager.v1beta1.Secret.Builder builderForValue) {
      if (secretsBuilder_ == null) {
        ensureSecretsIsMutable();
        secrets_.add(builderForValue.build());
        onChanged();
      } else {
        secretsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder addSecrets(
        int index, com.google.cloud.secretmanager.v1beta1.Secret.Builder builderForValue) {
      if (secretsBuilder_ == null) {
        ensureSecretsIsMutable();
        secrets_.add(index, builderForValue.build());
        onChanged();
      } else {
        secretsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder addAllSecrets(
        java.lang.Iterable<? extends com.google.cloud.secretmanager.v1beta1.Secret> values) {
      if (secretsBuilder_ == null) {
        ensureSecretsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, secrets_);
        onChanged();
      } else {
        secretsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder clearSecrets() {
      if (secretsBuilder_ == null) {
        secrets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        secretsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public Builder removeSecrets(int index) {
      if (secretsBuilder_ == null) {
        ensureSecretsIsMutable();
        secrets_.remove(index);
        onChanged();
      } else {
        secretsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public com.google.cloud.secretmanager.v1beta1.Secret.Builder getSecretsBuilder(
        int index) {
      return getSecretsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public com.google.cloud.secretmanager.v1beta1.SecretOrBuilder getSecretsOrBuilder(
        int index) {
      if (secretsBuilder_ == null) {
        return secrets_.get(index);  } else {
        return secretsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.secretmanager.v1beta1.SecretOrBuilder> 
         getSecretsOrBuilderList() {
      if (secretsBuilder_ != null) {
        return secretsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(secrets_);
      }
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public com.google.cloud.secretmanager.v1beta1.Secret.Builder addSecretsBuilder() {
      return getSecretsFieldBuilder().addBuilder(
          com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public com.google.cloud.secretmanager.v1beta1.Secret.Builder addSecretsBuilder(
        int index) {
      return getSecretsFieldBuilder().addBuilder(
          index, com.google.cloud.secretmanager.v1beta1.Secret.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [Secrets][google.cloud.secrets.v1beta1.Secret] sorted in reverse by create_time (newest
     * first).
     * </pre>
     *
     * <code>repeated .google.cloud.secrets.v1beta1.Secret secrets = 1;</code>
     */
    public java.util.List<com.google.cloud.secretmanager.v1beta1.Secret.Builder> 
         getSecretsBuilderList() {
      return getSecretsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.secretmanager.v1beta1.Secret, com.google.cloud.secretmanager.v1beta1.Secret.Builder, com.google.cloud.secretmanager.v1beta1.SecretOrBuilder> 
        getSecretsFieldBuilder() {
      if (secretsBuilder_ == null) {
        secretsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.secretmanager.v1beta1.Secret, com.google.cloud.secretmanager.v1beta1.Secret.Builder, com.google.cloud.secretmanager.v1beta1.SecretOrBuilder>(
                secrets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        secrets_ = null;
      }
      return secretsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve the next page of results. Pass this value in
     * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results. Pass this value in
     * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results. Pass this value in
     * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results. Pass this value in
     * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results. Pass this value in
     * [ListSecretsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretsRequest.page_token] to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int totalSize_ ;
    /**
     * <pre>
     * The total number of [Secrets][google.cloud.secrets.v1beta1.Secret].
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * The total number of [Secrets][google.cloud.secrets.v1beta1.Secret].
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {
      
      totalSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of [Secrets][google.cloud.secrets.v1beta1.Secret].
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.secrets.v1beta1.ListSecretsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secrets.v1beta1.ListSecretsResponse)
  private static final com.google.cloud.secretmanager.v1beta1.ListSecretsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1beta1.ListSecretsResponse();
  }

  public static com.google.cloud.secretmanager.v1beta1.ListSecretsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSecretsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSecretsResponse>() {
    @java.lang.Override
    public ListSecretsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSecretsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSecretsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta1.ListSecretsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

