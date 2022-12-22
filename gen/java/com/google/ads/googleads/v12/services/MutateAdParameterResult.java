// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/ad_parameter_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * The result for the ad parameter mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.MutateAdParameterResult}
 */
public final class MutateAdParameterResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.MutateAdParameterResult)
    MutateAdParameterResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAdParameterResult.newBuilder() to construct.
  private MutateAdParameterResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAdParameterResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAdParameterResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.AdParameterServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdParameterResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.AdParameterServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdParameterResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.MutateAdParameterResult.class, com.google.ads.googleads.v12.services.MutateAdParameterResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AD_PARAMETER_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.resources.AdParameter adParameter_;
  /**
   * <pre>
   * The mutated AdParameter with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
   * @return Whether the adParameter field is set.
   */
  @java.lang.Override
  public boolean hasAdParameter() {
    return adParameter_ != null;
  }
  /**
   * <pre>
   * The mutated AdParameter with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
   * @return The adParameter.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.AdParameter getAdParameter() {
    return adParameter_ == null ? com.google.ads.googleads.v12.resources.AdParameter.getDefaultInstance() : adParameter_;
  }
  /**
   * <pre>
   * The mutated AdParameter with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.AdParameterOrBuilder getAdParameterOrBuilder() {
    return adParameter_ == null ? com.google.ads.googleads.v12.resources.AdParameter.getDefaultInstance() : adParameter_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (adParameter_ != null) {
      output.writeMessage(2, getAdParameter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (adParameter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdParameter());
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.MutateAdParameterResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.MutateAdParameterResult other = (com.google.ads.googleads.v12.services.MutateAdParameterResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAdParameter() != other.hasAdParameter()) return false;
    if (hasAdParameter()) {
      if (!getAdParameter()
          .equals(other.getAdParameter())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasAdParameter()) {
      hash = (37 * hash) + AD_PARAMETER_FIELD_NUMBER;
      hash = (53 * hash) + getAdParameter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateAdParameterResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.MutateAdParameterResult prototype) {
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
   * The result for the ad parameter mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.MutateAdParameterResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.MutateAdParameterResult)
      com.google.ads.googleads.v12.services.MutateAdParameterResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.AdParameterServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdParameterResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.AdParameterServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdParameterResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.MutateAdParameterResult.class, com.google.ads.googleads.v12.services.MutateAdParameterResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.MutateAdParameterResult.newBuilder()
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
      resourceName_ = "";
      adParameter_ = null;
      if (adParameterBuilder_ != null) {
        adParameterBuilder_.dispose();
        adParameterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.AdParameterServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdParameterResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateAdParameterResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.MutateAdParameterResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateAdParameterResult build() {
      com.google.ads.googleads.v12.services.MutateAdParameterResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateAdParameterResult buildPartial() {
      com.google.ads.googleads.v12.services.MutateAdParameterResult result = new com.google.ads.googleads.v12.services.MutateAdParameterResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.MutateAdParameterResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adParameter_ = adParameterBuilder_ == null
            ? adParameter_
            : adParameterBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.MutateAdParameterResult) {
        return mergeFrom((com.google.ads.googleads.v12.services.MutateAdParameterResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.MutateAdParameterResult other) {
      if (other == com.google.ads.googleads.v12.services.MutateAdParameterResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdParameter()) {
        mergeAdParameter(other.getAdParameter());
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
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAdParameterFieldBuilder().getBuilder(),
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.resources.AdParameter adParameter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.resources.AdParameter, com.google.ads.googleads.v12.resources.AdParameter.Builder, com.google.ads.googleads.v12.resources.AdParameterOrBuilder> adParameterBuilder_;
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     * @return Whether the adParameter field is set.
     */
    public boolean hasAdParameter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     * @return The adParameter.
     */
    public com.google.ads.googleads.v12.resources.AdParameter getAdParameter() {
      if (adParameterBuilder_ == null) {
        return adParameter_ == null ? com.google.ads.googleads.v12.resources.AdParameter.getDefaultInstance() : adParameter_;
      } else {
        return adParameterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    public Builder setAdParameter(com.google.ads.googleads.v12.resources.AdParameter value) {
      if (adParameterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adParameter_ = value;
      } else {
        adParameterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    public Builder setAdParameter(
        com.google.ads.googleads.v12.resources.AdParameter.Builder builderForValue) {
      if (adParameterBuilder_ == null) {
        adParameter_ = builderForValue.build();
      } else {
        adParameterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    public Builder mergeAdParameter(com.google.ads.googleads.v12.resources.AdParameter value) {
      if (adParameterBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          adParameter_ != null &&
          adParameter_ != com.google.ads.googleads.v12.resources.AdParameter.getDefaultInstance()) {
          getAdParameterBuilder().mergeFrom(value);
        } else {
          adParameter_ = value;
        }
      } else {
        adParameterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    public Builder clearAdParameter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adParameter_ = null;
      if (adParameterBuilder_ != null) {
        adParameterBuilder_.dispose();
        adParameterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    public com.google.ads.googleads.v12.resources.AdParameter.Builder getAdParameterBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdParameterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    public com.google.ads.googleads.v12.resources.AdParameterOrBuilder getAdParameterOrBuilder() {
      if (adParameterBuilder_ != null) {
        return adParameterBuilder_.getMessageOrBuilder();
      } else {
        return adParameter_ == null ?
            com.google.ads.googleads.v12.resources.AdParameter.getDefaultInstance() : adParameter_;
      }
    }
    /**
     * <pre>
     * The mutated AdParameter with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdParameter ad_parameter = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.resources.AdParameter, com.google.ads.googleads.v12.resources.AdParameter.Builder, com.google.ads.googleads.v12.resources.AdParameterOrBuilder> 
        getAdParameterFieldBuilder() {
      if (adParameterBuilder_ == null) {
        adParameterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.resources.AdParameter, com.google.ads.googleads.v12.resources.AdParameter.Builder, com.google.ads.googleads.v12.resources.AdParameterOrBuilder>(
                getAdParameter(),
                getParentForChildren(),
                isClean());
        adParameter_ = null;
      }
      return adParameterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.MutateAdParameterResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.MutateAdParameterResult)
  private static final com.google.ads.googleads.v12.services.MutateAdParameterResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.MutateAdParameterResult();
  }

  public static com.google.ads.googleads.v12.services.MutateAdParameterResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAdParameterResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAdParameterResult>() {
    @java.lang.Override
    public MutateAdParameterResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateAdParameterResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAdParameterResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateAdParameterResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
