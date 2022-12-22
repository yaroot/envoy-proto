// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/managedidentities/v1beta1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1beta1;

/**
 * <pre>
 * Response message for
 * [ResetAdminPassword][google.cloud.managedidentities.v1beta1.ResetAdminPassword]
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse}
 */
public final class ResetAdminPasswordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)
    ResetAdminPasswordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResetAdminPasswordResponse.newBuilder() to construct.
  private ResetAdminPasswordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResetAdminPasswordResponse() {
    password_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResetAdminPasswordResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1beta1_ResetAdminPasswordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1beta1_ResetAdminPasswordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.class, com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.Builder.class);
  }

  public static final int PASSWORD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object password_ = "";
  /**
   * <pre>
   * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
   * </pre>
   *
   * <code>string password = 1;</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
   * </pre>
   *
   * <code>string password = 1;</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, password_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, password_);
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
    if (!(obj instanceof com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse other = (com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse) obj;

    if (!getPassword()
        .equals(other.getPassword())) return false;
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
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse prototype) {
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
   * Response message for
   * [ResetAdminPassword][google.cloud.managedidentities.v1beta1.ResetAdminPassword]
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)
      com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1beta1_ResetAdminPasswordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1beta1_ResetAdminPasswordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.class, com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.Builder.class);
    }

    // Construct using com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.newBuilder()
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
      password_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1beta1_ResetAdminPasswordResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse getDefaultInstanceForType() {
      return com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse build() {
      com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse buildPartial() {
      com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse result = new com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.password_ = password_;
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
      if (other instanceof com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse) {
        return mergeFrom((com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse other) {
      if (other == com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse.getDefaultInstance()) return this;
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        bitField0_ |= 0x00000001;
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
              password_ = input.readStringRequireUtf8();
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

    private java.lang.Object password_ = "";
    /**
     * <pre>
     * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
     * </pre>
     *
     * <code>string password = 1;</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
     * </pre>
     *
     * <code>string password = 1;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
     * </pre>
     *
     * <code>string password = 1;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      password_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
     * </pre>
     *
     * <code>string password = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      password_ = getDefaultInstance().getPassword();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
     * </pre>
     *
     * <code>string password = 1;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      password_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)
  private static final com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse();
  }

  public static com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetAdminPasswordResponse>
      PARSER = new com.google.protobuf.AbstractParser<ResetAdminPasswordResponse>() {
    @java.lang.Override
    public ResetAdminPasswordResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResetAdminPasswordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetAdminPasswordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

