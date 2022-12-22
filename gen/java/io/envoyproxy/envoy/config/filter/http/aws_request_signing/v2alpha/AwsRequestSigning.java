// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/aws_request_signing/v2alpha/aws_request_signing.proto

package io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha;

/**
 * <pre>
 * Top level configuration for the AWS request signing filter.
 * </pre>
 *
 * Protobuf type {@code envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning}
 */
public final class AwsRequestSigning extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning)
    AwsRequestSigningOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsRequestSigning.newBuilder() to construct.
  private AwsRequestSigning(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsRequestSigning() {
    serviceName_ = "";
    region_ = "";
    hostRewrite_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsRequestSigning();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigningProto.internal_static_envoy_config_filter_http_aws_request_signing_v2alpha_AwsRequestSigning_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigningProto.internal_static_envoy_config_filter_http_aws_request_signing_v2alpha_AwsRequestSigning_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.class, io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceName_ = "";
  /**
   * <pre>
   * The `service namespace
   * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
   * of the HTTP endpoint.
   * Example: s3
   * </pre>
   *
   * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The `service namespace
   * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
   * of the HTTP endpoint.
   * Example: s3
   * </pre>
   *
   * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object region_ = "";
  /**
   * <pre>
   * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
   * endpoint.
   * Example: us-west-2
   * </pre>
   *
   * <code>string region = 2 [(.validate.rules) = { ... }</code>
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
   * endpoint.
   * Example: us-west-2
   * </pre>
   *
   * <code>string region = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOST_REWRITE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostRewrite_ = "";
  /**
   * <pre>
   * Indicates that before signing headers, the host header will be swapped with
   * this value. If not set or empty, the original host header value
   * will be used and no rewrite will happen.
   * Note: this rewrite affects both signing and host header forwarding. However, this
   * option shouldn't be used with
   * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
   * value set here would be used for signing whereas the value set in the HCM would be used
   * for host header forwarding which is not the desired outcome.
   * </pre>
   *
   * <code>string host_rewrite = 3;</code>
   * @return The hostRewrite.
   */
  @java.lang.Override
  public java.lang.String getHostRewrite() {
    java.lang.Object ref = hostRewrite_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostRewrite_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Indicates that before signing headers, the host header will be swapped with
   * this value. If not set or empty, the original host header value
   * will be used and no rewrite will happen.
   * Note: this rewrite affects both signing and host header forwarding. However, this
   * option shouldn't be used with
   * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
   * value set here would be used for signing whereas the value set in the HCM would be used
   * for host header forwarding which is not the desired outcome.
   * </pre>
   *
   * <code>string host_rewrite = 3;</code>
   * @return The bytes for hostRewrite.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostRewriteBytes() {
    java.lang.Object ref = hostRewrite_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostRewrite_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostRewrite_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hostRewrite_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostRewrite_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hostRewrite_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning other = (io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning) obj;

    if (!getServiceName()
        .equals(other.getServiceName())) return false;
    if (!getRegion()
        .equals(other.getRegion())) return false;
    if (!getHostRewrite()
        .equals(other.getHostRewrite())) return false;
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
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (37 * hash) + HOST_REWRITE_FIELD_NUMBER;
    hash = (53 * hash) + getHostRewrite().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning prototype) {
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
   * Top level configuration for the AWS request signing filter.
   * </pre>
   *
   * Protobuf type {@code envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning)
      io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigningOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigningProto.internal_static_envoy_config_filter_http_aws_request_signing_v2alpha_AwsRequestSigning_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigningProto.internal_static_envoy_config_filter_http_aws_request_signing_v2alpha_AwsRequestSigning_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.class, io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.newBuilder()
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
      serviceName_ = "";
      region_ = "";
      hostRewrite_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigningProto.internal_static_envoy_config_filter_http_aws_request_signing_v2alpha_AwsRequestSigning_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning build() {
      io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning buildPartial() {
      io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning result = new io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceName_ = serviceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.region_ = region_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hostRewrite_ = hostRewrite_;
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
      if (other instanceof io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning other) {
      if (other == io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getHostRewrite().isEmpty()) {
        hostRewrite_ = other.hostRewrite_;
        bitField0_ |= 0x00000004;
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
              serviceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              region_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hostRewrite_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {
      serviceName_ = getDefaultInstance().getServiceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      region_ = getDefaultInstance().getRegion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object hostRewrite_ = "";
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @return The hostRewrite.
     */
    public java.lang.String getHostRewrite() {
      java.lang.Object ref = hostRewrite_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostRewrite_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @return The bytes for hostRewrite.
     */
    public com.google.protobuf.ByteString
        getHostRewriteBytes() {
      java.lang.Object ref = hostRewrite_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostRewrite_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @param value The hostRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setHostRewrite(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostRewrite_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostRewrite() {
      hostRewrite_ = getDefaultInstance().getHostRewrite();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_route.RouteAction.host_rewrite&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @param value The bytes for hostRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setHostRewriteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostRewrite_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning)
  private static final io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning();
  }

  public static io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsRequestSigning>
      PARSER = new com.google.protobuf.AbstractParser<AwsRequestSigning>() {
    @java.lang.Override
    public AwsRequestSigning parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsRequestSigning> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsRequestSigning> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.http.aws_request_signing.v2alpha.AwsRequestSigning getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
