// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Configuration for a Cloud Function network endpoint group (NEG). The function must be provided explicitly or in the URL mask. Note: Cloud Function must be in the same project and located in the same region as the Serverless NEG.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupCloudFunction}
 */
public final class NetworkEndpointGroupCloudFunction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)
    NetworkEndpointGroupCloudFunctionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupCloudFunction.newBuilder() to construct.
  private NetworkEndpointGroupCloudFunction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkEndpointGroupCloudFunction() {
    function_ = "";
    urlMask_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupCloudFunction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupCloudFunction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupCloudFunction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.class, com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.Builder.class);
  }

  private int bitField0_;
  public static final int FUNCTION_FIELD_NUMBER = 307196888;
  @SuppressWarnings("serial")
  private volatile java.lang.Object function_ = "";
  /**
   * <pre>
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
   * </pre>
   *
   * <code>optional string function = 307196888;</code>
   * @return Whether the function field is set.
   */
  @java.lang.Override
  public boolean hasFunction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
   * </pre>
   *
   * <code>optional string function = 307196888;</code>
   * @return The function.
   */
  @java.lang.Override
  public java.lang.String getFunction() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      function_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
   * </pre>
   *
   * <code>optional string function = 307196888;</code>
   * @return The bytes for function.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFunctionBytes() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      function_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_MASK_FIELD_NUMBER = 103352252;
  @SuppressWarnings("serial")
  private volatile java.lang.Object urlMask_ = "";
  /**
   * <pre>
   * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   * @return Whether the urlMask field is set.
   */
  @java.lang.Override
  public boolean hasUrlMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   * @return The urlMask.
   */
  @java.lang.Override
  public java.lang.String getUrlMask() {
    java.lang.Object ref = urlMask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      urlMask_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   * @return The bytes for urlMask.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlMaskBytes() {
    java.lang.Object ref = urlMask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      urlMask_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 103352252, urlMask_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 307196888, function_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(103352252, urlMask_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(307196888, function_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction other = (com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction) obj;

    if (hasFunction() != other.hasFunction()) return false;
    if (hasFunction()) {
      if (!getFunction()
          .equals(other.getFunction())) return false;
    }
    if (hasUrlMask() != other.hasUrlMask()) return false;
    if (hasUrlMask()) {
      if (!getUrlMask()
          .equals(other.getUrlMask())) return false;
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
    if (hasFunction()) {
      hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
      hash = (53 * hash) + getFunction().hashCode();
    }
    if (hasUrlMask()) {
      hash = (37 * hash) + URL_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUrlMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction prototype) {
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
   * Configuration for a Cloud Function network endpoint group (NEG). The function must be provided explicitly or in the URL mask. Note: Cloud Function must be in the same project and located in the same region as the Serverless NEG.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupCloudFunction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)
      com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunctionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupCloudFunction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupCloudFunction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.class, com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.newBuilder()
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
      function_ = "";
      urlMask_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupCloudFunction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction result = new com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.function_ = function_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.urlMask_ = urlMask_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction) {
        return mergeFrom((com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction other) {
      if (other == com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction.getDefaultInstance()) return this;
      if (other.hasFunction()) {
        function_ = other.function_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUrlMask()) {
        urlMask_ = other.urlMask_;
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
            case 826818018: {
              urlMask_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 826818018
            case -1837392190: {
              function_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -1837392190
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

    private java.lang.Object function_ = "";
    /**
     * <pre>
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * </pre>
     *
     * <code>optional string function = 307196888;</code>
     * @return Whether the function field is set.
     */
    public boolean hasFunction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * </pre>
     *
     * <code>optional string function = 307196888;</code>
     * @return The function.
     */
    public java.lang.String getFunction() {
      java.lang.Object ref = function_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        function_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * </pre>
     *
     * <code>optional string function = 307196888;</code>
     * @return The bytes for function.
     */
    public com.google.protobuf.ByteString
        getFunctionBytes() {
      java.lang.Object ref = function_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        function_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * </pre>
     *
     * <code>optional string function = 307196888;</code>
     * @param value The function to set.
     * @return This builder for chaining.
     */
    public Builder setFunction(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      function_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * </pre>
     *
     * <code>optional string function = 307196888;</code>
     * @return This builder for chaining.
     */
    public Builder clearFunction() {
      function_ = getDefaultInstance().getFunction();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * </pre>
     *
     * <code>optional string function = 307196888;</code>
     * @param value The bytes for function to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      function_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object urlMask_ = "";
    /**
     * <pre>
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * </pre>
     *
     * <code>optional string url_mask = 103352252;</code>
     * @return Whether the urlMask field is set.
     */
    public boolean hasUrlMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * </pre>
     *
     * <code>optional string url_mask = 103352252;</code>
     * @return The urlMask.
     */
    public java.lang.String getUrlMask() {
      java.lang.Object ref = urlMask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        urlMask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * </pre>
     *
     * <code>optional string url_mask = 103352252;</code>
     * @return The bytes for urlMask.
     */
    public com.google.protobuf.ByteString
        getUrlMaskBytes() {
      java.lang.Object ref = urlMask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        urlMask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * </pre>
     *
     * <code>optional string url_mask = 103352252;</code>
     * @param value The urlMask to set.
     * @return This builder for chaining.
     */
    public Builder setUrlMask(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      urlMask_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * </pre>
     *
     * <code>optional string url_mask = 103352252;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrlMask() {
      urlMask_ = getDefaultInstance().getUrlMask();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * </pre>
     *
     * <code>optional string url_mask = 103352252;</code>
     * @param value The bytes for urlMask to set.
     * @return This builder for chaining.
     */
    public Builder setUrlMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      urlMask_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupCloudFunction>
      PARSER = new com.google.protobuf.AbstractParser<NetworkEndpointGroupCloudFunction>() {
    @java.lang.Override
    public NetworkEndpointGroupCloudFunction parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkEndpointGroupCloudFunction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupCloudFunction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
