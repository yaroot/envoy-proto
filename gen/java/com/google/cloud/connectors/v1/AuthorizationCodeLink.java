// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/connectors/v1/common.proto

package com.google.cloud.connectors.v1;

/**
 * <pre>
 * This configuration captures the details required to render an authorization
 * link for the OAuth Authorization Code Flow.
 * </pre>
 *
 * Protobuf type {@code google.cloud.connectors.v1.AuthorizationCodeLink}
 */
public final class AuthorizationCodeLink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.connectors.v1.AuthorizationCodeLink)
    AuthorizationCodeLinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthorizationCodeLink.newBuilder() to construct.
  private AuthorizationCodeLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthorizationCodeLink() {
    uri_ = "";
    scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    clientId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthorizationCodeLink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.connectors.v1.CommonProto.internal_static_google_cloud_connectors_v1_AuthorizationCodeLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.connectors.v1.CommonProto.internal_static_google_cloud_connectors_v1_AuthorizationCodeLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.connectors.v1.AuthorizationCodeLink.class, com.google.cloud.connectors.v1.AuthorizationCodeLink.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * The base URI the user must click to trigger the authorization code login
   * flow.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The base URI the user must click to trigger the authorization code login
   * flow.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList scopes_;
  /**
   * <pre>
   * The scopes for which the user will authorize GCP Connectors on the
   * connector data source.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return A list containing the scopes.
   */
  public com.google.protobuf.ProtocolStringList
      getScopesList() {
    return scopes_;
  }
  /**
   * <pre>
   * The scopes for which the user will authorize GCP Connectors on the
   * connector data source.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return The count of scopes.
   */
  public int getScopesCount() {
    return scopes_.size();
  }
  /**
   * <pre>
   * The scopes for which the user will authorize GCP Connectors on the
   * connector data source.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  public java.lang.String getScopes(int index) {
    return scopes_.get(index);
  }
  /**
   * <pre>
   * The scopes for which the user will authorize GCP Connectors on the
   * connector data source.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  public com.google.protobuf.ByteString
      getScopesBytes(int index) {
    return scopes_.getByteString(index);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <pre>
   * The client ID assigned to the GCP Connectors OAuth app for the connector
   * data source.
   * </pre>
   *
   * <code>string client_id = 3;</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The client ID assigned to the GCP Connectors OAuth app for the connector
   * data source.
   * </pre>
   *
   * <code>string client_id = 3;</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLE_PKCE_FIELD_NUMBER = 4;
  private boolean enablePkce_ = false;
  /**
   * <pre>
   * Whether to enable PKCE for the auth code flow.
   * </pre>
   *
   * <code>bool enable_pkce = 4;</code>
   * @return The enablePkce.
   */
  @java.lang.Override
  public boolean getEnablePkce() {
    return enablePkce_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    for (int i = 0; i < scopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scopes_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clientId_);
    }
    if (enablePkce_ != false) {
      output.writeBool(4, enablePkce_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < scopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(scopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopesList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clientId_);
    }
    if (enablePkce_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enablePkce_);
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
    if (!(obj instanceof com.google.cloud.connectors.v1.AuthorizationCodeLink)) {
      return super.equals(obj);
    }
    com.google.cloud.connectors.v1.AuthorizationCodeLink other = (com.google.cloud.connectors.v1.AuthorizationCodeLink) obj;

    if (!getUri()
        .equals(other.getUri())) return false;
    if (!getScopesList()
        .equals(other.getScopesList())) return false;
    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (getEnablePkce()
        != other.getEnablePkce()) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (getScopesCount() > 0) {
      hash = (37 * hash) + SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getScopesList().hashCode();
    }
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + ENABLE_PKCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnablePkce());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.AuthorizationCodeLink parseFrom(
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
  public static Builder newBuilder(com.google.cloud.connectors.v1.AuthorizationCodeLink prototype) {
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
   * This configuration captures the details required to render an authorization
   * link for the OAuth Authorization Code Flow.
   * </pre>
   *
   * Protobuf type {@code google.cloud.connectors.v1.AuthorizationCodeLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.connectors.v1.AuthorizationCodeLink)
      com.google.cloud.connectors.v1.AuthorizationCodeLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.connectors.v1.CommonProto.internal_static_google_cloud_connectors_v1_AuthorizationCodeLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.connectors.v1.CommonProto.internal_static_google_cloud_connectors_v1_AuthorizationCodeLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.connectors.v1.AuthorizationCodeLink.class, com.google.cloud.connectors.v1.AuthorizationCodeLink.Builder.class);
    }

    // Construct using com.google.cloud.connectors.v1.AuthorizationCodeLink.newBuilder()
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
      uri_ = "";
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      clientId_ = "";
      enablePkce_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.connectors.v1.CommonProto.internal_static_google_cloud_connectors_v1_AuthorizationCodeLink_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.AuthorizationCodeLink getDefaultInstanceForType() {
      return com.google.cloud.connectors.v1.AuthorizationCodeLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.AuthorizationCodeLink build() {
      com.google.cloud.connectors.v1.AuthorizationCodeLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.AuthorizationCodeLink buildPartial() {
      com.google.cloud.connectors.v1.AuthorizationCodeLink result = new com.google.cloud.connectors.v1.AuthorizationCodeLink(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.connectors.v1.AuthorizationCodeLink result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        scopes_ = scopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.scopes_ = scopes_;
    }

    private void buildPartial0(com.google.cloud.connectors.v1.AuthorizationCodeLink result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.enablePkce_ = enablePkce_;
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
      if (other instanceof com.google.cloud.connectors.v1.AuthorizationCodeLink) {
        return mergeFrom((com.google.cloud.connectors.v1.AuthorizationCodeLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.connectors.v1.AuthorizationCodeLink other) {
      if (other == com.google.cloud.connectors.v1.AuthorizationCodeLink.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.scopes_.isEmpty()) {
        if (scopes_.isEmpty()) {
          scopes_ = other.scopes_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureScopesIsMutable();
          scopes_.addAll(other.scopes_);
        }
        onChanged();
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getEnablePkce() != false) {
        setEnablePkce(other.getEnablePkce());
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
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureScopesIsMutable();
              scopes_.add(s);
              break;
            } // case 18
            case 26: {
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              enablePkce_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * The base URI the user must click to trigger the authorization code login
     * flow.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The base URI the user must click to trigger the authorization code login
     * flow.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The base URI the user must click to trigger the authorization code login
     * flow.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The base URI the user must click to trigger the authorization code login
     * flow.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The base URI the user must click to trigger the authorization code login
     * flow.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureScopesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        scopes_ = new com.google.protobuf.LazyStringArrayList(scopes_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return A list containing the scopes.
     */
    public com.google.protobuf.ProtocolStringList
        getScopesList() {
      return scopes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return The count of scopes.
     */
    public int getScopesCount() {
      return scopes_.size();
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index of the element to return.
     * @return The scopes at the given index.
     */
    public java.lang.String getScopes(int index) {
      return scopes_.get(index);
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the scopes at the given index.
     */
    public com.google.protobuf.ByteString
        getScopesBytes(int index) {
      return scopes_.getByteString(index);
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index to set the value at.
     * @param value The scopes to set.
     * @return This builder for chaining.
     */
    public Builder setScopes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopesIsMutable();
      scopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param value The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param values The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScopes() {
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scopes for which the user will authorize GCP Connectors on the
     * connector data source.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param value The bytes of the scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * The client ID assigned to the GCP Connectors OAuth app for the connector
     * data source.
     * </pre>
     *
     * <code>string client_id = 3;</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The client ID assigned to the GCP Connectors OAuth app for the connector
     * data source.
     * </pre>
     *
     * <code>string client_id = 3;</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The client ID assigned to the GCP Connectors OAuth app for the connector
     * data source.
     * </pre>
     *
     * <code>string client_id = 3;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client ID assigned to the GCP Connectors OAuth app for the connector
     * data source.
     * </pre>
     *
     * <code>string client_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client ID assigned to the GCP Connectors OAuth app for the connector
     * data source.
     * </pre>
     *
     * <code>string client_id = 3;</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean enablePkce_ ;
    /**
     * <pre>
     * Whether to enable PKCE for the auth code flow.
     * </pre>
     *
     * <code>bool enable_pkce = 4;</code>
     * @return The enablePkce.
     */
    @java.lang.Override
    public boolean getEnablePkce() {
      return enablePkce_;
    }
    /**
     * <pre>
     * Whether to enable PKCE for the auth code flow.
     * </pre>
     *
     * <code>bool enable_pkce = 4;</code>
     * @param value The enablePkce to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePkce(boolean value) {
      
      enablePkce_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to enable PKCE for the auth code flow.
     * </pre>
     *
     * <code>bool enable_pkce = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnablePkce() {
      bitField0_ = (bitField0_ & ~0x00000008);
      enablePkce_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.connectors.v1.AuthorizationCodeLink)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.connectors.v1.AuthorizationCodeLink)
  private static final com.google.cloud.connectors.v1.AuthorizationCodeLink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.connectors.v1.AuthorizationCodeLink();
  }

  public static com.google.cloud.connectors.v1.AuthorizationCodeLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizationCodeLink>
      PARSER = new com.google.protobuf.AbstractParser<AuthorizationCodeLink>() {
    @java.lang.Override
    public AuthorizationCodeLink parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthorizationCodeLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizationCodeLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.connectors.v1.AuthorizationCodeLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
