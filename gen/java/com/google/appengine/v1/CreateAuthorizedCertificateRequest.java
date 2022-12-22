// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Request message for `AuthorizedCertificates.CreateAuthorizedCertificate`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CreateAuthorizedCertificateRequest}
 */
public final class CreateAuthorizedCertificateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CreateAuthorizedCertificateRequest)
    CreateAuthorizedCertificateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAuthorizedCertificateRequest.newBuilder() to construct.
  private CreateAuthorizedCertificateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAuthorizedCertificateRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAuthorizedCertificateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_CreateAuthorizedCertificateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_CreateAuthorizedCertificateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CreateAuthorizedCertificateRequest.class, com.google.appengine.v1.CreateAuthorizedCertificateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Name of the parent `Application` resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>string parent = 1;</code>
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
   * Name of the parent `Application` resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>string parent = 1;</code>
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

  public static final int CERTIFICATE_FIELD_NUMBER = 2;
  private com.google.appengine.v1.AuthorizedCertificate certificate_;
  /**
   * <pre>
   * SSL certificate data.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return certificate_ != null;
  }
  /**
   * <pre>
   * SSL certificate data.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.appengine.v1.AuthorizedCertificate getCertificate() {
    return certificate_ == null ? com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
  }
  /**
   * <pre>
   * SSL certificate data.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.AuthorizedCertificateOrBuilder getCertificateOrBuilder() {
    return certificate_ == null ? com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
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
    if (certificate_ != null) {
      output.writeMessage(2, getCertificate());
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
    if (certificate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCertificate());
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
    if (!(obj instanceof com.google.appengine.v1.CreateAuthorizedCertificateRequest)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CreateAuthorizedCertificateRequest other = (com.google.appengine.v1.CreateAuthorizedCertificateRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate()
          .equals(other.getCertificate())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.CreateAuthorizedCertificateRequest prototype) {
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
   * Request message for `AuthorizedCertificates.CreateAuthorizedCertificate`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CreateAuthorizedCertificateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CreateAuthorizedCertificateRequest)
      com.google.appengine.v1.CreateAuthorizedCertificateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_CreateAuthorizedCertificateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_CreateAuthorizedCertificateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CreateAuthorizedCertificateRequest.class, com.google.appengine.v1.CreateAuthorizedCertificateRequest.Builder.class);
    }

    // Construct using com.google.appengine.v1.CreateAuthorizedCertificateRequest.newBuilder()
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
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_CreateAuthorizedCertificateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateAuthorizedCertificateRequest getDefaultInstanceForType() {
      return com.google.appengine.v1.CreateAuthorizedCertificateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateAuthorizedCertificateRequest build() {
      com.google.appengine.v1.CreateAuthorizedCertificateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateAuthorizedCertificateRequest buildPartial() {
      com.google.appengine.v1.CreateAuthorizedCertificateRequest result = new com.google.appengine.v1.CreateAuthorizedCertificateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.CreateAuthorizedCertificateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certificate_ = certificateBuilder_ == null
            ? certificate_
            : certificateBuilder_.build();
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
      if (other instanceof com.google.appengine.v1.CreateAuthorizedCertificateRequest) {
        return mergeFrom((com.google.appengine.v1.CreateAuthorizedCertificateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CreateAuthorizedCertificateRequest other) {
      if (other == com.google.appengine.v1.CreateAuthorizedCertificateRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCertificate()) {
        mergeCertificate(other.getCertificate());
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
                  getCertificateFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Name of the parent `Application` resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Name of the parent `Application` resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Name of the parent `Application` resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Name of the parent `Application` resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Name of the parent `Application` resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private com.google.appengine.v1.AuthorizedCertificate certificate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.appengine.v1.AuthorizedCertificate, com.google.appengine.v1.AuthorizedCertificate.Builder, com.google.appengine.v1.AuthorizedCertificateOrBuilder> certificateBuilder_;
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     * @return The certificate.
     */
    public com.google.appengine.v1.AuthorizedCertificate getCertificate() {
      if (certificateBuilder_ == null) {
        return certificate_ == null ? com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
      } else {
        return certificateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder setCertificate(com.google.appengine.v1.AuthorizedCertificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificate_ = value;
      } else {
        certificateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder setCertificate(
        com.google.appengine.v1.AuthorizedCertificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        certificate_ = builderForValue.build();
      } else {
        certificateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder mergeCertificate(com.google.appengine.v1.AuthorizedCertificate value) {
      if (certificateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          certificate_ != null &&
          certificate_ != com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance()) {
          getCertificateBuilder().mergeFrom(value);
        } else {
          certificate_ = value;
        }
      } else {
        certificateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public com.google.appengine.v1.AuthorizedCertificate.Builder getCertificateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCertificateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public com.google.appengine.v1.AuthorizedCertificateOrBuilder getCertificateOrBuilder() {
      if (certificateBuilder_ != null) {
        return certificateBuilder_.getMessageOrBuilder();
      } else {
        return certificate_ == null ?
            com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
      }
    }
    /**
     * <pre>
     * SSL certificate data.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.appengine.v1.AuthorizedCertificate, com.google.appengine.v1.AuthorizedCertificate.Builder, com.google.appengine.v1.AuthorizedCertificateOrBuilder> 
        getCertificateFieldBuilder() {
      if (certificateBuilder_ == null) {
        certificateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.AuthorizedCertificate, com.google.appengine.v1.AuthorizedCertificate.Builder, com.google.appengine.v1.AuthorizedCertificateOrBuilder>(
                getCertificate(),
                getParentForChildren(),
                isClean());
        certificate_ = null;
      }
      return certificateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CreateAuthorizedCertificateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CreateAuthorizedCertificateRequest)
  private static final com.google.appengine.v1.CreateAuthorizedCertificateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CreateAuthorizedCertificateRequest();
  }

  public static com.google.appengine.v1.CreateAuthorizedCertificateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAuthorizedCertificateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAuthorizedCertificateRequest>() {
    @java.lang.Override
    public CreateAuthorizedCertificateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAuthorizedCertificateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAuthorizedCertificateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CreateAuthorizedCertificateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

