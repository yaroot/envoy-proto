// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

package com.google.cloud.vmwareengine.v1;

/**
 * <pre>
 * Request message for [VmwareEngine.ResetNsxCredentials][google.cloud.vmwareengine.v1.VmwareEngine.ResetNsxCredentials]
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest}
 */
public final class ResetNsxCredentialsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest)
    ResetNsxCredentialsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResetNsxCredentialsRequest.newBuilder() to construct.
  private ResetNsxCredentialsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResetNsxCredentialsRequest() {
    privateCloud_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResetNsxCredentialsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_ResetNsxCredentialsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_ResetNsxCredentialsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.class, com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.Builder.class);
  }

  public static final int PRIVATE_CLOUD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object privateCloud_ = "";
  /**
   * <pre>
   * Required. The resource name of the private cloud
   * to reset credentials for.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
   * </pre>
   *
   * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The privateCloud.
   */
  @java.lang.Override
  public java.lang.String getPrivateCloud() {
    java.lang.Object ref = privateCloud_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      privateCloud_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the private cloud
   * to reset credentials for.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
   * </pre>
   *
   * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for privateCloud.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivateCloudBytes() {
    java.lang.Object ref = privateCloud_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      privateCloud_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server guarantees that a
   * request doesn't result in creation of duplicate commitments for at least 60
   * minutes.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server guarantees that a
   * request doesn't result in creation of duplicate commitments for at least 60
   * minutes.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privateCloud_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, privateCloud_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privateCloud_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, privateCloud_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestId_);
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
    if (!(obj instanceof com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest other = (com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest) obj;

    if (!getPrivateCloud()
        .equals(other.getPrivateCloud())) return false;
    if (!getRequestId()
        .equals(other.getRequestId())) return false;
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
    hash = (37 * hash) + PRIVATE_CLOUD_FIELD_NUMBER;
    hash = (53 * hash) + getPrivateCloud().hashCode();
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest prototype) {
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
   * Request message for [VmwareEngine.ResetNsxCredentials][google.cloud.vmwareengine.v1.VmwareEngine.ResetNsxCredentials]
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest)
      com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_ResetNsxCredentialsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_ResetNsxCredentialsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.class, com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.Builder.class);
    }

    // Construct using com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.newBuilder()
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
      privateCloud_ = "";
      requestId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_ResetNsxCredentialsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest getDefaultInstanceForType() {
      return com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest build() {
      com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest buildPartial() {
      com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest result = new com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privateCloud_ = privateCloud_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestId_ = requestId_;
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
      if (other instanceof com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest) {
        return mergeFrom((com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest other) {
      if (other == com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest.getDefaultInstance()) return this;
      if (!other.getPrivateCloud().isEmpty()) {
        privateCloud_ = other.privateCloud_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
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
              privateCloud_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              requestId_ = input.readStringRequireUtf8();
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

    private java.lang.Object privateCloud_ = "";
    /**
     * <pre>
     * Required. The resource name of the private cloud
     * to reset credentials for.
     * Resource names are schemeless URIs that follow the conventions in
     * https://cloud.google.com/apis/design/resource_names.
     * For example:
     * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
     * </pre>
     *
     * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The privateCloud.
     */
    public java.lang.String getPrivateCloud() {
      java.lang.Object ref = privateCloud_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        privateCloud_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the private cloud
     * to reset credentials for.
     * Resource names are schemeless URIs that follow the conventions in
     * https://cloud.google.com/apis/design/resource_names.
     * For example:
     * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
     * </pre>
     *
     * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for privateCloud.
     */
    public com.google.protobuf.ByteString
        getPrivateCloudBytes() {
      java.lang.Object ref = privateCloud_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        privateCloud_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the private cloud
     * to reset credentials for.
     * Resource names are schemeless URIs that follow the conventions in
     * https://cloud.google.com/apis/design/resource_names.
     * For example:
     * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
     * </pre>
     *
     * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The privateCloud to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateCloud(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      privateCloud_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the private cloud
     * to reset credentials for.
     * Resource names are schemeless URIs that follow the conventions in
     * https://cloud.google.com/apis/design/resource_names.
     * For example:
     * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
     * </pre>
     *
     * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivateCloud() {
      privateCloud_ = getDefaultInstance().getPrivateCloud();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the private cloud
     * to reset credentials for.
     * Resource names are schemeless URIs that follow the conventions in
     * https://cloud.google.com/apis/design/resource_names.
     * For example:
     * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud`
     * </pre>
     *
     * <code>string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for privateCloud to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateCloudBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      privateCloud_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object requestId_ = "";
    /**
     * <pre>
     * Optional. A request ID to identify requests. Specify a unique request ID
     * so that if you must retry your request, the server will know to ignore
     * the request if it has already been completed. The server guarantees that a
     * request doesn't result in creation of duplicate commitments for at least 60
     * minutes.
     * For example, consider a situation where you make an initial request and the
     * request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. A request ID to identify requests. Specify a unique request ID
     * so that if you must retry your request, the server will know to ignore
     * the request if it has already been completed. The server guarantees that a
     * request doesn't result in creation of duplicate commitments for at least 60
     * minutes.
     * For example, consider a situation where you make an initial request and the
     * request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. A request ID to identify requests. Specify a unique request ID
     * so that if you must retry your request, the server will know to ignore
     * the request if it has already been completed. The server guarantees that a
     * request doesn't result in creation of duplicate commitments for at least 60
     * minutes.
     * For example, consider a situation where you make an initial request and the
     * request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      requestId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A request ID to identify requests. Specify a unique request ID
     * so that if you must retry your request, the server will know to ignore
     * the request if it has already been completed. The server guarantees that a
     * request doesn't result in creation of duplicate commitments for at least 60
     * minutes.
     * For example, consider a situation where you make an initial request and the
     * request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A request ID to identify requests. Specify a unique request ID
     * so that if you must retry your request, the server will know to ignore
     * the request if it has already been completed. The server guarantees that a
     * request doesn't result in creation of duplicate commitments for at least 60
     * minutes.
     * For example, consider a situation where you make an initial request and the
     * request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      requestId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest)
  private static final com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest();
  }

  public static com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetNsxCredentialsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ResetNsxCredentialsRequest>() {
    @java.lang.Override
    public ResetNsxCredentialsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResetNsxCredentialsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetNsxCredentialsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.ResetNsxCredentialsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
