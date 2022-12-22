// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

/**
 * <pre>
 * Response message for the InitializeHub method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1alpha2.InitializeHubResponse}
 */
public final class InitializeHubResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1alpha2.InitializeHubResponse)
    InitializeHubResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InitializeHubResponse.newBuilder() to construct.
  private InitializeHubResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitializeHubResponse() {
    serviceIdentity_ = "";
    workloadIdentityPool_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InitializeHubResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.v1alpha2.MembershipProto.internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1alpha2.MembershipProto.internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.class, com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.Builder.class);
  }

  public static final int SERVICE_IDENTITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceIdentity_ = "";
  /**
   * <pre>
   * Name of the Hub default service identity, in the format:
   *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
   * The service account has `roles/gkehub.serviceAgent` in the Hub project.
   * </pre>
   *
   * <code>string service_identity = 1;</code>
   * @return The serviceIdentity.
   */
  @java.lang.Override
  public java.lang.String getServiceIdentity() {
    java.lang.Object ref = serviceIdentity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceIdentity_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the Hub default service identity, in the format:
   *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
   * The service account has `roles/gkehub.serviceAgent` in the Hub project.
   * </pre>
   *
   * <code>string service_identity = 1;</code>
   * @return The bytes for serviceIdentity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceIdentityBytes() {
    java.lang.Object ref = serviceIdentity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceIdentity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKLOAD_IDENTITY_POOL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object workloadIdentityPool_ = "";
  /**
   * <pre>
   * The Workload Identity Pool used for Workload Identity-enabled clusters
   * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
   * </pre>
   *
   * <code>string workload_identity_pool = 2;</code>
   * @return The workloadIdentityPool.
   */
  @java.lang.Override
  public java.lang.String getWorkloadIdentityPool() {
    java.lang.Object ref = workloadIdentityPool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workloadIdentityPool_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Workload Identity Pool used for Workload Identity-enabled clusters
   * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
   * </pre>
   *
   * <code>string workload_identity_pool = 2;</code>
   * @return The bytes for workloadIdentityPool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkloadIdentityPoolBytes() {
    java.lang.Object ref = workloadIdentityPool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workloadIdentityPool_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceIdentity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceIdentity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadIdentityPool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workloadIdentityPool_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceIdentity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceIdentity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadIdentityPool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workloadIdentityPool_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1alpha2.InitializeHubResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1alpha2.InitializeHubResponse other = (com.google.cloud.gkehub.v1alpha2.InitializeHubResponse) obj;

    if (!getServiceIdentity()
        .equals(other.getServiceIdentity())) return false;
    if (!getWorkloadIdentityPool()
        .equals(other.getWorkloadIdentityPool())) return false;
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
    hash = (37 * hash) + SERVICE_IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getServiceIdentity().hashCode();
    hash = (37 * hash) + WORKLOAD_IDENTITY_POOL_FIELD_NUMBER;
    hash = (53 * hash) + getWorkloadIdentityPool().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1alpha2.InitializeHubResponse prototype) {
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
   * Response message for the InitializeHub method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1alpha2.InitializeHubResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1alpha2.InitializeHubResponse)
      com.google.cloud.gkehub.v1alpha2.InitializeHubResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto.internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto.internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.class, com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.newBuilder()
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
      serviceIdentity_ = "";
      workloadIdentityPool_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto.internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.InitializeHubResponse getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.InitializeHubResponse build() {
      com.google.cloud.gkehub.v1alpha2.InitializeHubResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.InitializeHubResponse buildPartial() {
      com.google.cloud.gkehub.v1alpha2.InitializeHubResponse result = new com.google.cloud.gkehub.v1alpha2.InitializeHubResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1alpha2.InitializeHubResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceIdentity_ = serviceIdentity_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.workloadIdentityPool_ = workloadIdentityPool_;
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
      if (other instanceof com.google.cloud.gkehub.v1alpha2.InitializeHubResponse) {
        return mergeFrom((com.google.cloud.gkehub.v1alpha2.InitializeHubResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1alpha2.InitializeHubResponse other) {
      if (other == com.google.cloud.gkehub.v1alpha2.InitializeHubResponse.getDefaultInstance()) return this;
      if (!other.getServiceIdentity().isEmpty()) {
        serviceIdentity_ = other.serviceIdentity_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWorkloadIdentityPool().isEmpty()) {
        workloadIdentityPool_ = other.workloadIdentityPool_;
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
              serviceIdentity_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              workloadIdentityPool_ = input.readStringRequireUtf8();
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

    private java.lang.Object serviceIdentity_ = "";
    /**
     * <pre>
     * Name of the Hub default service identity, in the format:
     *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
     * The service account has `roles/gkehub.serviceAgent` in the Hub project.
     * </pre>
     *
     * <code>string service_identity = 1;</code>
     * @return The serviceIdentity.
     */
    public java.lang.String getServiceIdentity() {
      java.lang.Object ref = serviceIdentity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceIdentity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the Hub default service identity, in the format:
     *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
     * The service account has `roles/gkehub.serviceAgent` in the Hub project.
     * </pre>
     *
     * <code>string service_identity = 1;</code>
     * @return The bytes for serviceIdentity.
     */
    public com.google.protobuf.ByteString
        getServiceIdentityBytes() {
      java.lang.Object ref = serviceIdentity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceIdentity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the Hub default service identity, in the format:
     *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
     * The service account has `roles/gkehub.serviceAgent` in the Hub project.
     * </pre>
     *
     * <code>string service_identity = 1;</code>
     * @param value The serviceIdentity to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIdentity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceIdentity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the Hub default service identity, in the format:
     *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
     * The service account has `roles/gkehub.serviceAgent` in the Hub project.
     * </pre>
     *
     * <code>string service_identity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceIdentity() {
      serviceIdentity_ = getDefaultInstance().getServiceIdentity();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the Hub default service identity, in the format:
     *     service-&lt;project-number&gt;&#64;gcp-sa-gkehub.iam.gserviceaccount.com
     * The service account has `roles/gkehub.serviceAgent` in the Hub project.
     * </pre>
     *
     * <code>string service_identity = 1;</code>
     * @param value The bytes for serviceIdentity to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIdentityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceIdentity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object workloadIdentityPool_ = "";
    /**
     * <pre>
     * The Workload Identity Pool used for Workload Identity-enabled clusters
     * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
     * </pre>
     *
     * <code>string workload_identity_pool = 2;</code>
     * @return The workloadIdentityPool.
     */
    public java.lang.String getWorkloadIdentityPool() {
      java.lang.Object ref = workloadIdentityPool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workloadIdentityPool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Workload Identity Pool used for Workload Identity-enabled clusters
     * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
     * </pre>
     *
     * <code>string workload_identity_pool = 2;</code>
     * @return The bytes for workloadIdentityPool.
     */
    public com.google.protobuf.ByteString
        getWorkloadIdentityPoolBytes() {
      java.lang.Object ref = workloadIdentityPool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workloadIdentityPool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Workload Identity Pool used for Workload Identity-enabled clusters
     * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
     * </pre>
     *
     * <code>string workload_identity_pool = 2;</code>
     * @param value The workloadIdentityPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadIdentityPool(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      workloadIdentityPool_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Workload Identity Pool used for Workload Identity-enabled clusters
     * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
     * </pre>
     *
     * <code>string workload_identity_pool = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkloadIdentityPool() {
      workloadIdentityPool_ = getDefaultInstance().getWorkloadIdentityPool();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Workload Identity Pool used for Workload Identity-enabled clusters
     * registered with this Hub. Format: `&lt;project-id&gt;.hub.id.goog`
     * </pre>
     *
     * <code>string workload_identity_pool = 2;</code>
     * @param value The bytes for workloadIdentityPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadIdentityPoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      workloadIdentityPool_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1alpha2.InitializeHubResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha2.InitializeHubResponse)
  private static final com.google.cloud.gkehub.v1alpha2.InitializeHubResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1alpha2.InitializeHubResponse();
  }

  public static com.google.cloud.gkehub.v1alpha2.InitializeHubResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitializeHubResponse>
      PARSER = new com.google.protobuf.AbstractParser<InitializeHubResponse>() {
    @java.lang.Override
    public InitializeHubResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitializeHubResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitializeHubResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.InitializeHubResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

