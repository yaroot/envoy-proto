// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1/service_binding.proto

package com.google.cloud.networkservices.v1;

/**
 * <pre>
 * Request used by the ServiceBinding method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkservices.v1.CreateServiceBindingRequest}
 */
public final class CreateServiceBindingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkservices.v1.CreateServiceBindingRequest)
    CreateServiceBindingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateServiceBindingRequest.newBuilder() to construct.
  private CreateServiceBindingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceBindingRequest() {
    parent_ = "";
    serviceBindingId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateServiceBindingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networkservices.v1.ServiceBindingProto.internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkservices.v1.ServiceBindingProto.internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkservices.v1.CreateServiceBindingRequest.class, com.google.cloud.networkservices.v1.CreateServiceBindingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource of the ServiceBinding. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. The parent resource of the ServiceBinding. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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

  public static final int SERVICE_BINDING_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceBindingId_ = "";
  /**
   * <pre>
   * Required. Short name of the ServiceBinding resource to be created.
   * </pre>
   *
   * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The serviceBindingId.
   */
  @java.lang.Override
  public java.lang.String getServiceBindingId() {
    java.lang.Object ref = serviceBindingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceBindingId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Short name of the ServiceBinding resource to be created.
   * </pre>
   *
   * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for serviceBindingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceBindingIdBytes() {
    java.lang.Object ref = serviceBindingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceBindingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_BINDING_FIELD_NUMBER = 3;
  private com.google.cloud.networkservices.v1.ServiceBinding serviceBinding_;
  /**
   * <pre>
   * Required. ServiceBinding resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the serviceBinding field is set.
   */
  @java.lang.Override
  public boolean hasServiceBinding() {
    return serviceBinding_ != null;
  }
  /**
   * <pre>
   * Required. ServiceBinding resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The serviceBinding.
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.ServiceBinding getServiceBinding() {
    return serviceBinding_ == null ? com.google.cloud.networkservices.v1.ServiceBinding.getDefaultInstance() : serviceBinding_;
  }
  /**
   * <pre>
   * Required. ServiceBinding resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.ServiceBindingOrBuilder getServiceBindingOrBuilder() {
    return serviceBinding_ == null ? com.google.cloud.networkservices.v1.ServiceBinding.getDefaultInstance() : serviceBinding_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceBindingId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceBindingId_);
    }
    if (serviceBinding_ != null) {
      output.writeMessage(3, getServiceBinding());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceBindingId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceBindingId_);
    }
    if (serviceBinding_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getServiceBinding());
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
    if (!(obj instanceof com.google.cloud.networkservices.v1.CreateServiceBindingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networkservices.v1.CreateServiceBindingRequest other = (com.google.cloud.networkservices.v1.CreateServiceBindingRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getServiceBindingId()
        .equals(other.getServiceBindingId())) return false;
    if (hasServiceBinding() != other.hasServiceBinding()) return false;
    if (hasServiceBinding()) {
      if (!getServiceBinding()
          .equals(other.getServiceBinding())) return false;
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
    hash = (37 * hash) + SERVICE_BINDING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceBindingId().hashCode();
    if (hasServiceBinding()) {
      hash = (37 * hash) + SERVICE_BINDING_FIELD_NUMBER;
      hash = (53 * hash) + getServiceBinding().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networkservices.v1.CreateServiceBindingRequest prototype) {
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
   * Request used by the ServiceBinding method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkservices.v1.CreateServiceBindingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkservices.v1.CreateServiceBindingRequest)
      com.google.cloud.networkservices.v1.CreateServiceBindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networkservices.v1.ServiceBindingProto.internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkservices.v1.ServiceBindingProto.internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkservices.v1.CreateServiceBindingRequest.class, com.google.cloud.networkservices.v1.CreateServiceBindingRequest.Builder.class);
    }

    // Construct using com.google.cloud.networkservices.v1.CreateServiceBindingRequest.newBuilder()
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
      serviceBindingId_ = "";
      serviceBinding_ = null;
      if (serviceBindingBuilder_ != null) {
        serviceBindingBuilder_.dispose();
        serviceBindingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networkservices.v1.ServiceBindingProto.internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateServiceBindingRequest getDefaultInstanceForType() {
      return com.google.cloud.networkservices.v1.CreateServiceBindingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateServiceBindingRequest build() {
      com.google.cloud.networkservices.v1.CreateServiceBindingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateServiceBindingRequest buildPartial() {
      com.google.cloud.networkservices.v1.CreateServiceBindingRequest result = new com.google.cloud.networkservices.v1.CreateServiceBindingRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networkservices.v1.CreateServiceBindingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceBindingId_ = serviceBindingId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serviceBinding_ = serviceBindingBuilder_ == null
            ? serviceBinding_
            : serviceBindingBuilder_.build();
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
      if (other instanceof com.google.cloud.networkservices.v1.CreateServiceBindingRequest) {
        return mergeFrom((com.google.cloud.networkservices.v1.CreateServiceBindingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkservices.v1.CreateServiceBindingRequest other) {
      if (other == com.google.cloud.networkservices.v1.CreateServiceBindingRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getServiceBindingId().isEmpty()) {
        serviceBindingId_ = other.serviceBindingId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasServiceBinding()) {
        mergeServiceBinding(other.getServiceBinding());
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
              serviceBindingId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getServiceBindingFieldBuilder().getBuilder(),
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
     * Required. The parent resource of the ServiceBinding. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the ServiceBinding. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the ServiceBinding. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the ServiceBinding. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the ServiceBinding. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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

    private java.lang.Object serviceBindingId_ = "";
    /**
     * <pre>
     * Required. Short name of the ServiceBinding resource to be created.
     * </pre>
     *
     * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The serviceBindingId.
     */
    public java.lang.String getServiceBindingId() {
      java.lang.Object ref = serviceBindingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceBindingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the ServiceBinding resource to be created.
     * </pre>
     *
     * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for serviceBindingId.
     */
    public com.google.protobuf.ByteString
        getServiceBindingIdBytes() {
      java.lang.Object ref = serviceBindingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceBindingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the ServiceBinding resource to be created.
     * </pre>
     *
     * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The serviceBindingId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBindingId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceBindingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the ServiceBinding resource to be created.
     * </pre>
     *
     * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceBindingId() {
      serviceBindingId_ = getDefaultInstance().getServiceBindingId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the ServiceBinding resource to be created.
     * </pre>
     *
     * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for serviceBindingId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBindingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceBindingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.networkservices.v1.ServiceBinding serviceBinding_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networkservices.v1.ServiceBinding, com.google.cloud.networkservices.v1.ServiceBinding.Builder, com.google.cloud.networkservices.v1.ServiceBindingOrBuilder> serviceBindingBuilder_;
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the serviceBinding field is set.
     */
    public boolean hasServiceBinding() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The serviceBinding.
     */
    public com.google.cloud.networkservices.v1.ServiceBinding getServiceBinding() {
      if (serviceBindingBuilder_ == null) {
        return serviceBinding_ == null ? com.google.cloud.networkservices.v1.ServiceBinding.getDefaultInstance() : serviceBinding_;
      } else {
        return serviceBindingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setServiceBinding(com.google.cloud.networkservices.v1.ServiceBinding value) {
      if (serviceBindingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceBinding_ = value;
      } else {
        serviceBindingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setServiceBinding(
        com.google.cloud.networkservices.v1.ServiceBinding.Builder builderForValue) {
      if (serviceBindingBuilder_ == null) {
        serviceBinding_ = builderForValue.build();
      } else {
        serviceBindingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeServiceBinding(com.google.cloud.networkservices.v1.ServiceBinding value) {
      if (serviceBindingBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          serviceBinding_ != null &&
          serviceBinding_ != com.google.cloud.networkservices.v1.ServiceBinding.getDefaultInstance()) {
          getServiceBindingBuilder().mergeFrom(value);
        } else {
          serviceBinding_ = value;
        }
      } else {
        serviceBindingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearServiceBinding() {
      bitField0_ = (bitField0_ & ~0x00000004);
      serviceBinding_ = null;
      if (serviceBindingBuilder_ != null) {
        serviceBindingBuilder_.dispose();
        serviceBindingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networkservices.v1.ServiceBinding.Builder getServiceBindingBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getServiceBindingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networkservices.v1.ServiceBindingOrBuilder getServiceBindingOrBuilder() {
      if (serviceBindingBuilder_ != null) {
        return serviceBindingBuilder_.getMessageOrBuilder();
      } else {
        return serviceBinding_ == null ?
            com.google.cloud.networkservices.v1.ServiceBinding.getDefaultInstance() : serviceBinding_;
      }
    }
    /**
     * <pre>
     * Required. ServiceBinding resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networkservices.v1.ServiceBinding, com.google.cloud.networkservices.v1.ServiceBinding.Builder, com.google.cloud.networkservices.v1.ServiceBindingOrBuilder> 
        getServiceBindingFieldBuilder() {
      if (serviceBindingBuilder_ == null) {
        serviceBindingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkservices.v1.ServiceBinding, com.google.cloud.networkservices.v1.ServiceBinding.Builder, com.google.cloud.networkservices.v1.ServiceBindingOrBuilder>(
                getServiceBinding(),
                getParentForChildren(),
                isClean());
        serviceBinding_ = null;
      }
      return serviceBindingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networkservices.v1.CreateServiceBindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkservices.v1.CreateServiceBindingRequest)
  private static final com.google.cloud.networkservices.v1.CreateServiceBindingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkservices.v1.CreateServiceBindingRequest();
  }

  public static com.google.cloud.networkservices.v1.CreateServiceBindingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceBindingRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceBindingRequest>() {
    @java.lang.Override
    public CreateServiceBindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceBindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceBindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkservices.v1.CreateServiceBindingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
