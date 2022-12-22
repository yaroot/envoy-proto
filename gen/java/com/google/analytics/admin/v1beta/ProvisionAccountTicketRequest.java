// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 * <pre>
 * Request message for ProvisionAccountTicket RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.ProvisionAccountTicketRequest}
 */
public final class ProvisionAccountTicketRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.ProvisionAccountTicketRequest)
    ProvisionAccountTicketRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProvisionAccountTicketRequest.newBuilder() to construct.
  private ProvisionAccountTicketRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProvisionAccountTicketRequest() {
    redirectUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProvisionAccountTicketRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ProvisionAccountTicketRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ProvisionAccountTicketRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.class, com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.Builder.class);
  }

  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1beta.Account account_;
  /**
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
   * @return Whether the account field is set.
   */
  @java.lang.Override
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
   * @return The account.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.Account getAccount() {
    return account_ == null ? com.google.analytics.admin.v1beta.Account.getDefaultInstance() : account_;
  }
  /**
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.AccountOrBuilder getAccountOrBuilder() {
    return account_ == null ? com.google.analytics.admin.v1beta.Account.getDefaultInstance() : account_;
  }

  public static final int REDIRECT_URI_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object redirectUri_ = "";
  /**
   * <pre>
   * Redirect URI where the user will be sent after accepting Terms of Service.
   * Must be configured in Developers Console as a Redirect URI
   * </pre>
   *
   * <code>string redirect_uri = 2;</code>
   * @return The redirectUri.
   */
  @java.lang.Override
  public java.lang.String getRedirectUri() {
    java.lang.Object ref = redirectUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      redirectUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Redirect URI where the user will be sent after accepting Terms of Service.
   * Must be configured in Developers Console as a Redirect URI
   * </pre>
   *
   * <code>string redirect_uri = 2;</code>
   * @return The bytes for redirectUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRedirectUriBytes() {
    java.lang.Object ref = redirectUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      redirectUri_ = b;
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
    if (account_ != null) {
      output.writeMessage(1, getAccount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(redirectUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, redirectUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(redirectUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, redirectUri_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest other = (com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest) obj;

    if (hasAccount() != other.hasAccount()) return false;
    if (hasAccount()) {
      if (!getAccount()
          .equals(other.getAccount())) return false;
    }
    if (!getRedirectUri()
        .equals(other.getRedirectUri())) return false;
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
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    hash = (37 * hash) + REDIRECT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getRedirectUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest prototype) {
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
   * Request message for ProvisionAccountTicket RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.ProvisionAccountTicketRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.ProvisionAccountTicketRequest)
      com.google.analytics.admin.v1beta.ProvisionAccountTicketRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ProvisionAccountTicketRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ProvisionAccountTicketRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.class, com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.newBuilder()
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
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      redirectUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ProvisionAccountTicketRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest build() {
      com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest buildPartial() {
      com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest result = new com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.account_ = accountBuilder_ == null
            ? account_
            : accountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.redirectUri_ = redirectUri_;
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
      if (other instanceof com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest) {
        return mergeFrom((com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest other) {
      if (other == com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest.getDefaultInstance()) return this;
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
      }
      if (!other.getRedirectUri().isEmpty()) {
        redirectUri_ = other.redirectUri_;
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
              input.readMessage(
                  getAccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              redirectUri_ = input.readStringRequireUtf8();
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

    private com.google.analytics.admin.v1beta.Account account_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1beta.Account, com.google.analytics.admin.v1beta.Account.Builder, com.google.analytics.admin.v1beta.AccountOrBuilder> accountBuilder_;
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     * @return Whether the account field is set.
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     * @return The account.
     */
    public com.google.analytics.admin.v1beta.Account getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.google.analytics.admin.v1beta.Account.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    public Builder setAccount(com.google.analytics.admin.v1beta.Account value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
      } else {
        accountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    public Builder setAccount(
        com.google.analytics.admin.v1beta.Account.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    public Builder mergeAccount(com.google.analytics.admin.v1beta.Account value) {
      if (accountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          account_ != null &&
          account_ != com.google.analytics.admin.v1beta.Account.getDefaultInstance()) {
          getAccountBuilder().mergeFrom(value);
        } else {
          account_ = value;
        }
      } else {
        accountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    public Builder clearAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    public com.google.analytics.admin.v1beta.Account.Builder getAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    public com.google.analytics.admin.v1beta.AccountOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.google.analytics.admin.v1beta.Account.getDefaultInstance() : account_;
      }
    }
    /**
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1beta.Account, com.google.analytics.admin.v1beta.Account.Builder, com.google.analytics.admin.v1beta.AccountOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.Account, com.google.analytics.admin.v1beta.Account.Builder, com.google.analytics.admin.v1beta.AccountOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
    }

    private java.lang.Object redirectUri_ = "";
    /**
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     * @return The redirectUri.
     */
    public java.lang.String getRedirectUri() {
      java.lang.Object ref = redirectUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        redirectUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     * @return The bytes for redirectUri.
     */
    public com.google.protobuf.ByteString
        getRedirectUriBytes() {
      java.lang.Object ref = redirectUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        redirectUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     * @param value The redirectUri to set.
     * @return This builder for chaining.
     */
    public Builder setRedirectUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      redirectUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRedirectUri() {
      redirectUri_ = getDefaultInstance().getRedirectUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     * @param value The bytes for redirectUri to set.
     * @return This builder for chaining.
     */
    public Builder setRedirectUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      redirectUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.ProvisionAccountTicketRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.ProvisionAccountTicketRequest)
  private static final com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest();
  }

  public static com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProvisionAccountTicketRequest>
      PARSER = new com.google.protobuf.AbstractParser<ProvisionAccountTicketRequest>() {
    @java.lang.Override
    public ProvisionAccountTicketRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProvisionAccountTicketRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProvisionAccountTicketRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.ProvisionAccountTicketRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

