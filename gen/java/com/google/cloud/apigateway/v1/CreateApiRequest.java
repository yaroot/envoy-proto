// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigateway/v1/apigateway.proto

package com.google.cloud.apigateway.v1;

/**
 * <pre>
 * Request message for ApiGatewayService.CreateApi
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigateway.v1.CreateApiRequest}
 */
public final class CreateApiRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigateway.v1.CreateApiRequest)
    CreateApiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateApiRequest.newBuilder() to construct.
  private CreateApiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateApiRequest() {
    parent_ = "";
    apiId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateApiRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_CreateApiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_CreateApiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigateway.v1.CreateApiRequest.class, com.google.cloud.apigateway.v1.CreateApiRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Parent resource of the API, of the form:
   * `projects/&#42;&#47;locations/global`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
   * Required. Parent resource of the API, of the form:
   * `projects/&#42;&#47;locations/global`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

  public static final int API_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object apiId_ = "";
  /**
   * <pre>
   * Required. Identifier to assign to the API. Must be unique within scope of
   * the parent resource.
   * </pre>
   *
   * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The apiId.
   */
  @java.lang.Override
  public java.lang.String getApiId() {
    java.lang.Object ref = apiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Identifier to assign to the API. Must be unique within scope of
   * the parent resource.
   * </pre>
   *
   * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for apiId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApiIdBytes() {
    java.lang.Object ref = apiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int API_FIELD_NUMBER = 3;
  private com.google.cloud.apigateway.v1.Api api_;
  /**
   * <pre>
   * Required. API resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the api field is set.
   */
  @java.lang.Override
  public boolean hasApi() {
    return api_ != null;
  }
  /**
   * <pre>
   * Required. API resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The api.
   */
  @java.lang.Override
  public com.google.cloud.apigateway.v1.Api getApi() {
    return api_ == null ? com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
  }
  /**
   * <pre>
   * Required. API resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apigateway.v1.ApiOrBuilder getApiOrBuilder() {
    return api_ == null ? com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiId_);
    }
    if (api_ != null) {
      output.writeMessage(3, getApi());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, apiId_);
    }
    if (api_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getApi());
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
    if (!(obj instanceof com.google.cloud.apigateway.v1.CreateApiRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigateway.v1.CreateApiRequest other = (com.google.cloud.apigateway.v1.CreateApiRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getApiId()
        .equals(other.getApiId())) return false;
    if (hasApi() != other.hasApi()) return false;
    if (hasApi()) {
      if (!getApi()
          .equals(other.getApi())) return false;
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
    hash = (37 * hash) + API_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApiId().hashCode();
    if (hasApi()) {
      hash = (37 * hash) + API_FIELD_NUMBER;
      hash = (53 * hash) + getApi().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigateway.v1.CreateApiRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.apigateway.v1.CreateApiRequest prototype) {
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
   * Request message for ApiGatewayService.CreateApi
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigateway.v1.CreateApiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigateway.v1.CreateApiRequest)
      com.google.cloud.apigateway.v1.CreateApiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_CreateApiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_CreateApiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigateway.v1.CreateApiRequest.class, com.google.cloud.apigateway.v1.CreateApiRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigateway.v1.CreateApiRequest.newBuilder()
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
      apiId_ = "";
      api_ = null;
      if (apiBuilder_ != null) {
        apiBuilder_.dispose();
        apiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_CreateApiRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.CreateApiRequest getDefaultInstanceForType() {
      return com.google.cloud.apigateway.v1.CreateApiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.CreateApiRequest build() {
      com.google.cloud.apigateway.v1.CreateApiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.CreateApiRequest buildPartial() {
      com.google.cloud.apigateway.v1.CreateApiRequest result = new com.google.cloud.apigateway.v1.CreateApiRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apigateway.v1.CreateApiRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.apiId_ = apiId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.api_ = apiBuilder_ == null
            ? api_
            : apiBuilder_.build();
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
      if (other instanceof com.google.cloud.apigateway.v1.CreateApiRequest) {
        return mergeFrom((com.google.cloud.apigateway.v1.CreateApiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigateway.v1.CreateApiRequest other) {
      if (other == com.google.cloud.apigateway.v1.CreateApiRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getApiId().isEmpty()) {
        apiId_ = other.apiId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasApi()) {
        mergeApi(other.getApi());
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
              apiId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getApiFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Parent resource of the API, of the form:
     * `projects/&#42;&#47;locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Parent resource of the API, of the form:
     * `projects/&#42;&#47;locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Parent resource of the API, of the form:
     * `projects/&#42;&#47;locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Parent resource of the API, of the form:
     * `projects/&#42;&#47;locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Parent resource of the API, of the form:
     * `projects/&#42;&#47;locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object apiId_ = "";
    /**
     * <pre>
     * Required. Identifier to assign to the API. Must be unique within scope of
     * the parent resource.
     * </pre>
     *
     * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The apiId.
     */
    public java.lang.String getApiId() {
      java.lang.Object ref = apiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Identifier to assign to the API. Must be unique within scope of
     * the parent resource.
     * </pre>
     *
     * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for apiId.
     */
    public com.google.protobuf.ByteString
        getApiIdBytes() {
      java.lang.Object ref = apiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Identifier to assign to the API. Must be unique within scope of
     * the parent resource.
     * </pre>
     *
     * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The apiId to set.
     * @return This builder for chaining.
     */
    public Builder setApiId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      apiId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Identifier to assign to the API. Must be unique within scope of
     * the parent resource.
     * </pre>
     *
     * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearApiId() {
      apiId_ = getDefaultInstance().getApiId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Identifier to assign to the API. Must be unique within scope of
     * the parent resource.
     * </pre>
     *
     * <code>string api_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for apiId to set.
     * @return This builder for chaining.
     */
    public Builder setApiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      apiId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.apigateway.v1.Api api_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigateway.v1.Api, com.google.cloud.apigateway.v1.Api.Builder, com.google.cloud.apigateway.v1.ApiOrBuilder> apiBuilder_;
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the api field is set.
     */
    public boolean hasApi() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The api.
     */
    public com.google.cloud.apigateway.v1.Api getApi() {
      if (apiBuilder_ == null) {
        return api_ == null ? com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
      } else {
        return apiBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApi(com.google.cloud.apigateway.v1.Api value) {
      if (apiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        api_ = value;
      } else {
        apiBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApi(
        com.google.cloud.apigateway.v1.Api.Builder builderForValue) {
      if (apiBuilder_ == null) {
        api_ = builderForValue.build();
      } else {
        apiBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeApi(com.google.cloud.apigateway.v1.Api value) {
      if (apiBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          api_ != null &&
          api_ != com.google.cloud.apigateway.v1.Api.getDefaultInstance()) {
          getApiBuilder().mergeFrom(value);
        } else {
          api_ = value;
        }
      } else {
        apiBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearApi() {
      bitField0_ = (bitField0_ & ~0x00000004);
      api_ = null;
      if (apiBuilder_ != null) {
        apiBuilder_.dispose();
        apiBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigateway.v1.Api.Builder getApiBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getApiFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigateway.v1.ApiOrBuilder getApiOrBuilder() {
      if (apiBuilder_ != null) {
        return apiBuilder_.getMessageOrBuilder();
      } else {
        return api_ == null ?
            com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
      }
    }
    /**
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigateway.v1.Api, com.google.cloud.apigateway.v1.Api.Builder, com.google.cloud.apigateway.v1.ApiOrBuilder> 
        getApiFieldBuilder() {
      if (apiBuilder_ == null) {
        apiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigateway.v1.Api, com.google.cloud.apigateway.v1.Api.Builder, com.google.cloud.apigateway.v1.ApiOrBuilder>(
                getApi(),
                getParentForChildren(),
                isClean());
        api_ = null;
      }
      return apiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.apigateway.v1.CreateApiRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigateway.v1.CreateApiRequest)
  private static final com.google.cloud.apigateway.v1.CreateApiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigateway.v1.CreateApiRequest();
  }

  public static com.google.cloud.apigateway.v1.CreateApiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApiRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateApiRequest>() {
    @java.lang.Override
    public CreateApiRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateApiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateApiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigateway.v1.CreateApiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

