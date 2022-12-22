// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/cloudsetup/logging/v1/complete_deployment.proto

package com.google.cloud.cloudsetup.logging.v1;

/**
 * <pre>
 * This message is used when the CompleteDeploymentEvent has a value.
 * </pre>
 *
 * Protobuf type {@code google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult}
 */
public final class CompleteDeploymentResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult)
    CompleteDeploymentResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteDeploymentResult.newBuilder() to construct.
  private CompleteDeploymentResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteDeploymentResult() {
    deployment_ = "";
    preview_ = "";
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteDeploymentResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentProto.internal_static_google_cloud_cloudsetup_logging_v1_CompleteDeploymentResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentProto.internal_static_google_cloud_cloudsetup_logging_v1_CompleteDeploymentResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.class, com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.Builder.class);
  }

  public static final int DEPLOYMENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deployment_ = "";
  /**
   * <pre>
   * This is the Deployment that completed.
   * Format is projects/{project}/locations/{location}/deployments/{name}.
   * </pre>
   *
   * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The deployment.
   */
  @java.lang.Override
  public java.lang.String getDeployment() {
    java.lang.Object ref = deployment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is the Deployment that completed.
   * Format is projects/{project}/locations/{location}/deployments/{name}.
   * </pre>
   *
   * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for deployment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeploymentBytes() {
    java.lang.Object ref = deployment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIEW_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object preview_ = "";
  /**
   * <pre>
   * This is the Preview that completed.
   * Format is projects/{project}/locations/{location}/previews/{preview}
   * </pre>
   *
   * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The preview.
   */
  @java.lang.Override
  public java.lang.String getPreview() {
    java.lang.Object ref = preview_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preview_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is the Preview that completed.
   * Format is projects/{project}/locations/{location}/previews/{preview}
   * </pre>
   *
   * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for preview.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreviewBytes() {
    java.lang.Object ref = preview_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preview_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * The message that is returned when a deployment completes. This **can** be
   * an error message if the `Deployment` `state` is `FAILED`.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The message that is returned when a deployment completes. This **can** be
   * an error message if the `Deployment` `state` is `FAILED`.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deployment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(preview_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, preview_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deployment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(preview_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, preview_);
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
    if (!(obj instanceof com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult)) {
      return super.equals(obj);
    }
    com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult other = (com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult) obj;

    if (!getDeployment()
        .equals(other.getDeployment())) return false;
    if (!getPreview()
        .equals(other.getPreview())) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
    hash = (53 * hash) + getDeployment().hashCode();
    hash = (37 * hash) + PREVIEW_FIELD_NUMBER;
    hash = (53 * hash) + getPreview().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult prototype) {
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
   * This message is used when the CompleteDeploymentEvent has a value.
   * </pre>
   *
   * Protobuf type {@code google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult)
      com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentProto.internal_static_google_cloud_cloudsetup_logging_v1_CompleteDeploymentResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentProto.internal_static_google_cloud_cloudsetup_logging_v1_CompleteDeploymentResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.class, com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.Builder.class);
    }

    // Construct using com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.newBuilder()
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
      deployment_ = "";
      preview_ = "";
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentProto.internal_static_google_cloud_cloudsetup_logging_v1_CompleteDeploymentResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult getDefaultInstanceForType() {
      return com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult build() {
      com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult buildPartial() {
      com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult result = new com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deployment_ = deployment_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.preview_ = preview_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
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
      if (other instanceof com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult) {
        return mergeFrom((com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult other) {
      if (other == com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult.getDefaultInstance()) return this;
      if (!other.getDeployment().isEmpty()) {
        deployment_ = other.deployment_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPreview().isEmpty()) {
        preview_ = other.preview_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
              deployment_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 18
            case 26: {
              preview_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object deployment_ = "";
    /**
     * <pre>
     * This is the Deployment that completed.
     * Format is projects/{project}/locations/{location}/deployments/{name}.
     * </pre>
     *
     * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The deployment.
     */
    public java.lang.String getDeployment() {
      java.lang.Object ref = deployment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is the Deployment that completed.
     * Format is projects/{project}/locations/{location}/deployments/{name}.
     * </pre>
     *
     * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for deployment.
     */
    public com.google.protobuf.ByteString
        getDeploymentBytes() {
      java.lang.Object ref = deployment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is the Deployment that completed.
     * Format is projects/{project}/locations/{location}/deployments/{name}.
     * </pre>
     *
     * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The deployment to set.
     * @return This builder for chaining.
     */
    public Builder setDeployment(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deployment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the Deployment that completed.
     * Format is projects/{project}/locations/{location}/deployments/{name}.
     * </pre>
     *
     * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployment() {
      deployment_ = getDefaultInstance().getDeployment();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the Deployment that completed.
     * Format is projects/{project}/locations/{location}/deployments/{name}.
     * </pre>
     *
     * <code>string deployment = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for deployment to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deployment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object preview_ = "";
    /**
     * <pre>
     * This is the Preview that completed.
     * Format is projects/{project}/locations/{location}/previews/{preview}
     * </pre>
     *
     * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return The preview.
     */
    public java.lang.String getPreview() {
      java.lang.Object ref = preview_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preview_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is the Preview that completed.
     * Format is projects/{project}/locations/{location}/previews/{preview}
     * </pre>
     *
     * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for preview.
     */
    public com.google.protobuf.ByteString
        getPreviewBytes() {
      java.lang.Object ref = preview_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preview_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is the Preview that completed.
     * Format is projects/{project}/locations/{location}/previews/{preview}
     * </pre>
     *
     * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
     * @param value The preview to set.
     * @return This builder for chaining.
     */
    public Builder setPreview(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      preview_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the Preview that completed.
     * Format is projects/{project}/locations/{location}/previews/{preview}
     * </pre>
     *
     * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPreview() {
      preview_ = getDefaultInstance().getPreview();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the Preview that completed.
     * Format is projects/{project}/locations/{location}/previews/{preview}
     * </pre>
     *
     * <code>string preview = 3 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for preview to set.
     * @return This builder for chaining.
     */
    public Builder setPreviewBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      preview_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The message that is returned when a deployment completes. This **can** be
     * an error message if the `Deployment` `state` is `FAILED`.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The message that is returned when a deployment completes. This **can** be
     * an error message if the `Deployment` `state` is `FAILED`.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The message that is returned when a deployment completes. This **can** be
     * an error message if the `Deployment` `state` is `FAILED`.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message that is returned when a deployment completes. This **can** be
     * an error message if the `Deployment` `state` is `FAILED`.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message that is returned when a deployment completes. This **can** be
     * an error message if the `Deployment` `state` is `FAILED`.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult)
  private static final com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult();
  }

  public static com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteDeploymentResult>
      PARSER = new com.google.protobuf.AbstractParser<CompleteDeploymentResult>() {
    @java.lang.Override
    public CompleteDeploymentResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompleteDeploymentResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteDeploymentResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.cloudsetup.logging.v1.CompleteDeploymentResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
