// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v2alpha/certs.proto

package io.envoyproxy.envoy.admin.v2alpha;

/**
 * <pre>
 * Proto representation of certificate details. Admin endpoint uses this wrapper for `/certs` to
 * display certificate information. See :ref:`/certs &lt;operations_admin_interface_certs&gt;` for more
 * information.
 * </pre>
 *
 * Protobuf type {@code envoy.admin.v2alpha.Certificates}
 */
public final class Certificates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.admin.v2alpha.Certificates)
    CertificatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Certificates.newBuilder() to construct.
  private Certificates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Certificates() {
    certificates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Certificates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.admin.v2alpha.CertsProto.internal_static_envoy_admin_v2alpha_Certificates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.admin.v2alpha.CertsProto.internal_static_envoy_admin_v2alpha_Certificates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.admin.v2alpha.Certificates.class, io.envoyproxy.envoy.admin.v2alpha.Certificates.Builder.class);
  }

  public static final int CERTIFICATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.envoyproxy.envoy.admin.v2alpha.Certificate> certificates_;
  /**
   * <pre>
   * List of certificates known to an Envoy.
   * </pre>
   *
   * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.admin.v2alpha.Certificate> getCertificatesList() {
    return certificates_;
  }
  /**
   * <pre>
   * List of certificates known to an Envoy.
   * </pre>
   *
   * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder> 
      getCertificatesOrBuilderList() {
    return certificates_;
  }
  /**
   * <pre>
   * List of certificates known to an Envoy.
   * </pre>
   *
   * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
   */
  @java.lang.Override
  public int getCertificatesCount() {
    return certificates_.size();
  }
  /**
   * <pre>
   * List of certificates known to an Envoy.
   * </pre>
   *
   * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.admin.v2alpha.Certificate getCertificates(int index) {
    return certificates_.get(index);
  }
  /**
   * <pre>
   * List of certificates known to an Envoy.
   * </pre>
   *
   * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder getCertificatesOrBuilder(
      int index) {
    return certificates_.get(index);
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
    for (int i = 0; i < certificates_.size(); i++) {
      output.writeMessage(1, certificates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < certificates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, certificates_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.admin.v2alpha.Certificates)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.admin.v2alpha.Certificates other = (io.envoyproxy.envoy.admin.v2alpha.Certificates) obj;

    if (!getCertificatesList()
        .equals(other.getCertificatesList())) return false;
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
    if (getCertificatesCount() > 0) {
      hash = (37 * hash) + CERTIFICATES_FIELD_NUMBER;
      hash = (53 * hash) + getCertificatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v2alpha.Certificates parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.admin.v2alpha.Certificates prototype) {
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
   * Proto representation of certificate details. Admin endpoint uses this wrapper for `/certs` to
   * display certificate information. See :ref:`/certs &lt;operations_admin_interface_certs&gt;` for more
   * information.
   * </pre>
   *
   * Protobuf type {@code envoy.admin.v2alpha.Certificates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.admin.v2alpha.Certificates)
      io.envoyproxy.envoy.admin.v2alpha.CertificatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.admin.v2alpha.CertsProto.internal_static_envoy_admin_v2alpha_Certificates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.admin.v2alpha.CertsProto.internal_static_envoy_admin_v2alpha_Certificates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.admin.v2alpha.Certificates.class, io.envoyproxy.envoy.admin.v2alpha.Certificates.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.admin.v2alpha.Certificates.newBuilder()
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
      if (certificatesBuilder_ == null) {
        certificates_ = java.util.Collections.emptyList();
      } else {
        certificates_ = null;
        certificatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.admin.v2alpha.CertsProto.internal_static_envoy_admin_v2alpha_Certificates_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v2alpha.Certificates getDefaultInstanceForType() {
      return io.envoyproxy.envoy.admin.v2alpha.Certificates.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v2alpha.Certificates build() {
      io.envoyproxy.envoy.admin.v2alpha.Certificates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v2alpha.Certificates buildPartial() {
      io.envoyproxy.envoy.admin.v2alpha.Certificates result = new io.envoyproxy.envoy.admin.v2alpha.Certificates(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.envoyproxy.envoy.admin.v2alpha.Certificates result) {
      if (certificatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          certificates_ = java.util.Collections.unmodifiableList(certificates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.certificates_ = certificates_;
      } else {
        result.certificates_ = certificatesBuilder_.build();
      }
    }

    private void buildPartial0(io.envoyproxy.envoy.admin.v2alpha.Certificates result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof io.envoyproxy.envoy.admin.v2alpha.Certificates) {
        return mergeFrom((io.envoyproxy.envoy.admin.v2alpha.Certificates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.admin.v2alpha.Certificates other) {
      if (other == io.envoyproxy.envoy.admin.v2alpha.Certificates.getDefaultInstance()) return this;
      if (certificatesBuilder_ == null) {
        if (!other.certificates_.isEmpty()) {
          if (certificates_.isEmpty()) {
            certificates_ = other.certificates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCertificatesIsMutable();
            certificates_.addAll(other.certificates_);
          }
          onChanged();
        }
      } else {
        if (!other.certificates_.isEmpty()) {
          if (certificatesBuilder_.isEmpty()) {
            certificatesBuilder_.dispose();
            certificatesBuilder_ = null;
            certificates_ = other.certificates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            certificatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCertificatesFieldBuilder() : null;
          } else {
            certificatesBuilder_.addAllMessages(other.certificates_);
          }
        }
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
              io.envoyproxy.envoy.admin.v2alpha.Certificate m =
                  input.readMessage(
                      io.envoyproxy.envoy.admin.v2alpha.Certificate.parser(),
                      extensionRegistry);
              if (certificatesBuilder_ == null) {
                ensureCertificatesIsMutable();
                certificates_.add(m);
              } else {
                certificatesBuilder_.addMessage(m);
              }
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

    private java.util.List<io.envoyproxy.envoy.admin.v2alpha.Certificate> certificates_ =
      java.util.Collections.emptyList();
    private void ensureCertificatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        certificates_ = new java.util.ArrayList<io.envoyproxy.envoy.admin.v2alpha.Certificate>(certificates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.admin.v2alpha.Certificate, io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder, io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder> certificatesBuilder_;

    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public java.util.List<io.envoyproxy.envoy.admin.v2alpha.Certificate> getCertificatesList() {
      if (certificatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(certificates_);
      } else {
        return certificatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public int getCertificatesCount() {
      if (certificatesBuilder_ == null) {
        return certificates_.size();
      } else {
        return certificatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public io.envoyproxy.envoy.admin.v2alpha.Certificate getCertificates(int index) {
      if (certificatesBuilder_ == null) {
        return certificates_.get(index);
      } else {
        return certificatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder setCertificates(
        int index, io.envoyproxy.envoy.admin.v2alpha.Certificate value) {
      if (certificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificatesIsMutable();
        certificates_.set(index, value);
        onChanged();
      } else {
        certificatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder setCertificates(
        int index, io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder builderForValue) {
      if (certificatesBuilder_ == null) {
        ensureCertificatesIsMutable();
        certificates_.set(index, builderForValue.build());
        onChanged();
      } else {
        certificatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder addCertificates(io.envoyproxy.envoy.admin.v2alpha.Certificate value) {
      if (certificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificatesIsMutable();
        certificates_.add(value);
        onChanged();
      } else {
        certificatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder addCertificates(
        int index, io.envoyproxy.envoy.admin.v2alpha.Certificate value) {
      if (certificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificatesIsMutable();
        certificates_.add(index, value);
        onChanged();
      } else {
        certificatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder addCertificates(
        io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder builderForValue) {
      if (certificatesBuilder_ == null) {
        ensureCertificatesIsMutable();
        certificates_.add(builderForValue.build());
        onChanged();
      } else {
        certificatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder addCertificates(
        int index, io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder builderForValue) {
      if (certificatesBuilder_ == null) {
        ensureCertificatesIsMutable();
        certificates_.add(index, builderForValue.build());
        onChanged();
      } else {
        certificatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder addAllCertificates(
        java.lang.Iterable<? extends io.envoyproxy.envoy.admin.v2alpha.Certificate> values) {
      if (certificatesBuilder_ == null) {
        ensureCertificatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, certificates_);
        onChanged();
      } else {
        certificatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder clearCertificates() {
      if (certificatesBuilder_ == null) {
        certificates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        certificatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public Builder removeCertificates(int index) {
      if (certificatesBuilder_ == null) {
        ensureCertificatesIsMutable();
        certificates_.remove(index);
        onChanged();
      } else {
        certificatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder getCertificatesBuilder(
        int index) {
      return getCertificatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder getCertificatesOrBuilder(
        int index) {
      if (certificatesBuilder_ == null) {
        return certificates_.get(index);  } else {
        return certificatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder> 
         getCertificatesOrBuilderList() {
      if (certificatesBuilder_ != null) {
        return certificatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(certificates_);
      }
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder addCertificatesBuilder() {
      return getCertificatesFieldBuilder().addBuilder(
          io.envoyproxy.envoy.admin.v2alpha.Certificate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder addCertificatesBuilder(
        int index) {
      return getCertificatesFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.admin.v2alpha.Certificate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of certificates known to an Envoy.
     * </pre>
     *
     * <code>repeated .envoy.admin.v2alpha.Certificate certificates = 1;</code>
     */
    public java.util.List<io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder> 
         getCertificatesBuilderList() {
      return getCertificatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.admin.v2alpha.Certificate, io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder, io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder> 
        getCertificatesFieldBuilder() {
      if (certificatesBuilder_ == null) {
        certificatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.admin.v2alpha.Certificate, io.envoyproxy.envoy.admin.v2alpha.Certificate.Builder, io.envoyproxy.envoy.admin.v2alpha.CertificateOrBuilder>(
                certificates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        certificates_ = null;
      }
      return certificatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.admin.v2alpha.Certificates)
  }

  // @@protoc_insertion_point(class_scope:envoy.admin.v2alpha.Certificates)
  private static final io.envoyproxy.envoy.admin.v2alpha.Certificates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.admin.v2alpha.Certificates();
  }

  public static io.envoyproxy.envoy.admin.v2alpha.Certificates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Certificates>
      PARSER = new com.google.protobuf.AbstractParser<Certificates>() {
    @java.lang.Override
    public Certificates parsePartialFrom(
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

  public static com.google.protobuf.Parser<Certificates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Certificates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.admin.v2alpha.Certificates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

