// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Specification of Model explanation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExplanationSpec}
 */
public final class ExplanationSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ExplanationSpec)
    ExplanationSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExplanationSpec.newBuilder() to construct.
  private ExplanationSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExplanationSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExplanationSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto.internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto.internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ExplanationSpec.class, com.google.cloud.aiplatform.v1beta1.ExplanationSpec.Builder.class);
  }

  public static final int PARAMETERS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters_;
  /**
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the parameters field is set.
   */
  @java.lang.Override
  public boolean hasParameters() {
    return parameters_ != null;
  }
  /**
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parameters.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters() {
    return parameters_ == null ? com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance() : parameters_;
  }
  /**
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder getParametersOrBuilder() {
    return parameters_ == null ? com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance() : parameters_;
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata_;
  /**
   * <pre>
   * Optional. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * Optional. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationMetadata getMetadata() {
    return metadata_ == null ? com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Optional. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance() : metadata_;
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
    if (parameters_ != null) {
      output.writeMessage(1, getParameters());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (parameters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParameters());
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ExplanationSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ExplanationSpec other = (com.google.cloud.aiplatform.v1beta1.ExplanationSpec) obj;

    if (hasParameters() != other.hasParameters()) return false;
    if (hasParameters()) {
      if (!getParameters()
          .equals(other.getParameters())) return false;
    }
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ExplanationSpec prototype) {
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
   * Specification of Model explanation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExplanationSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ExplanationSpec)
      com.google.cloud.aiplatform.v1beta1.ExplanationSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto.internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto.internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ExplanationSpec.class, com.google.cloud.aiplatform.v1beta1.ExplanationSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ExplanationSpec.newBuilder()
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
      parameters_ = null;
      if (parametersBuilder_ != null) {
        parametersBuilder_.dispose();
        parametersBuilder_ = null;
      }
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto.internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExplanationSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExplanationSpec build() {
      com.google.cloud.aiplatform.v1beta1.ExplanationSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExplanationSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ExplanationSpec result = new com.google.cloud.aiplatform.v1beta1.ExplanationSpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ExplanationSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parameters_ = parametersBuilder_ == null
            ? parameters_
            : parametersBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ExplanationSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ExplanationSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ExplanationSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ExplanationSpec.getDefaultInstance()) return this;
      if (other.hasParameters()) {
        mergeParameters(other.getParameters());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
              input.readMessage(
                  getParametersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
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

    private com.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExplanationParameters, com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder, com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder> parametersBuilder_;
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the parameters field is set.
     */
    public boolean hasParameters() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The parameters.
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters() {
      if (parametersBuilder_ == null) {
        return parameters_ == null ? com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance() : parameters_;
      } else {
        return parametersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParameters(com.google.cloud.aiplatform.v1beta1.ExplanationParameters value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameters_ = value;
      } else {
        parametersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParameters(
        com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeParameters(com.google.cloud.aiplatform.v1beta1.ExplanationParameters value) {
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          parameters_ != null &&
          parameters_ != com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance()) {
          getParametersBuilder().mergeFrom(value);
        } else {
          parameters_ = value;
        }
      } else {
        parametersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearParameters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      parameters_ = null;
      if (parametersBuilder_ != null) {
        parametersBuilder_.dispose();
        parametersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder getParametersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder getParametersOrBuilder() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilder();
      } else {
        return parameters_ == null ?
            com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance() : parameters_;
      }
    }
    /**
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExplanationParameters, com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder, com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder> 
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExplanationParameters, com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder, com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder>(
                getParameters(),
                getParentForChildren(),
                isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
    }

    private com.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExplanationMetadata, com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The metadata.
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setMetadata(com.google.cloud.aiplatform.v1beta1.ExplanationMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setMetadata(
        com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeMetadata(com.google.cloud.aiplatform.v1beta1.ExplanationMetadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadata_ != null &&
          metadata_ != com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Optional. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExplanationMetadata, com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadata, com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ExplanationSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ExplanationSpec)
  private static final com.google.cloud.aiplatform.v1beta1.ExplanationSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ExplanationSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplanationSpec>
      PARSER = new com.google.protobuf.AbstractParser<ExplanationSpec>() {
    @java.lang.Override
    public ExplanationSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExplanationSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplanationSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
