// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1p1beta1;

/**
 * <pre>
 * Message sent by the client for the `CreateCustomClass` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.CreateCustomClassRequest}
 */
public final class CreateCustomClassRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.CreateCustomClassRequest)
    CreateCustomClassRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomClassRequest.newBuilder() to construct.
  private CreateCustomClassRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomClassRequest() {
    parent_ = "";
    customClassId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCustomClassRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.class, com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource where this custom class will be created. Format:
   * `projects/{project}/locations/{location}/customClasses`
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
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
   * Required. The parent resource where this custom class will be created. Format:
   * `projects/{project}/locations/{location}/customClasses`
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
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

  public static final int CUSTOM_CLASS_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customClassId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the custom class, which will become the final
   * component of the custom class' resource name.
   * This value should restrict to letters, numbers, and hyphens, with the first
   * character a letter, the last a letter or a number, and be 4-63 characters.
   * </pre>
   *
   * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customClassId.
   */
  @java.lang.Override
  public java.lang.String getCustomClassId() {
    java.lang.Object ref = customClassId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customClassId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the custom class, which will become the final
   * component of the custom class' resource name.
   * This value should restrict to letters, numbers, and hyphens, with the first
   * character a letter, the last a letter or a number, and be 4-63 characters.
   * </pre>
   *
   * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customClassId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomClassIdBytes() {
    java.lang.Object ref = customClassId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customClassId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOM_CLASS_FIELD_NUMBER = 3;
  private com.google.cloud.speech.v1p1beta1.CustomClass customClass_;
  /**
   * <pre>
   * Required. The custom class to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customClass field is set.
   */
  @java.lang.Override
  public boolean hasCustomClass() {
    return customClass_ != null;
  }
  /**
   * <pre>
   * Required. The custom class to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customClass.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.CustomClass getCustomClass() {
    return customClass_ == null ? com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
  }
  /**
   * <pre>
   * Required. The custom class to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder getCustomClassOrBuilder() {
    return customClass_ == null ? com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customClassId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customClassId_);
    }
    if (customClass_ != null) {
      output.writeMessage(3, getCustomClass());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customClassId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customClassId_);
    }
    if (customClass_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCustomClass());
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
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest other = (com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getCustomClassId()
        .equals(other.getCustomClassId())) return false;
    if (hasCustomClass() != other.hasCustomClass()) return false;
    if (hasCustomClass()) {
      if (!getCustomClass()
          .equals(other.getCustomClass())) return false;
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
    hash = (37 * hash) + CUSTOM_CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomClassId().hashCode();
    if (hasCustomClass()) {
      hash = (37 * hash) + CUSTOM_CLASS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomClass().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest prototype) {
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
   * Message sent by the client for the `CreateCustomClass` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.CreateCustomClassRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.CreateCustomClassRequest)
      com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.class, com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.newBuilder()
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
      customClassId_ = "";
      customClass_ = null;
      if (customClassBuilder_ != null) {
        customClassBuilder_.dispose();
        customClassBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest build() {
      com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest buildPartial() {
      com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest result = new com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customClassId_ = customClassId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.customClass_ = customClassBuilder_ == null
            ? customClass_
            : customClassBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest other) {
      if (other == com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCustomClassId().isEmpty()) {
        customClassId_ = other.customClassId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCustomClass()) {
        mergeCustomClass(other.getCustomClass());
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
              customClassId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCustomClassFieldBuilder().getBuilder(),
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
     * Required. The parent resource where this custom class will be created. Format:
     * `projects/{project}/locations/{location}/customClasses`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
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
     * Required. The parent resource where this custom class will be created. Format:
     * `projects/{project}/locations/{location}/customClasses`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
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
     * Required. The parent resource where this custom class will be created. Format:
     * `projects/{project}/locations/{location}/customClasses`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
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
     * Required. The parent resource where this custom class will be created. Format:
     * `projects/{project}/locations/{location}/customClasses`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
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
     * Required. The parent resource where this custom class will be created. Format:
     * `projects/{project}/locations/{location}/customClasses`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
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

    private java.lang.Object customClassId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the custom class, which will become the final
     * component of the custom class' resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customClassId.
     */
    public java.lang.String getCustomClassId() {
      java.lang.Object ref = customClassId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customClassId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the custom class, which will become the final
     * component of the custom class' resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customClassId.
     */
    public com.google.protobuf.ByteString
        getCustomClassIdBytes() {
      java.lang.Object ref = customClassId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customClassId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the custom class, which will become the final
     * component of the custom class' resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customClassId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customClassId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the custom class, which will become the final
     * component of the custom class' resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomClassId() {
      customClassId_ = getDefaultInstance().getCustomClassId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the custom class, which will become the final
     * component of the custom class' resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customClassId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customClassId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.speech.v1p1beta1.CustomClass customClass_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v1p1beta1.CustomClass, com.google.cloud.speech.v1p1beta1.CustomClass.Builder, com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder> customClassBuilder_;
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the customClass field is set.
     */
    public boolean hasCustomClass() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customClass.
     */
    public com.google.cloud.speech.v1p1beta1.CustomClass getCustomClass() {
      if (customClassBuilder_ == null) {
        return customClass_ == null ? com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
      } else {
        return customClassBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomClass(com.google.cloud.speech.v1p1beta1.CustomClass value) {
      if (customClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customClass_ = value;
      } else {
        customClassBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomClass(
        com.google.cloud.speech.v1p1beta1.CustomClass.Builder builderForValue) {
      if (customClassBuilder_ == null) {
        customClass_ = builderForValue.build();
      } else {
        customClassBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCustomClass(com.google.cloud.speech.v1p1beta1.CustomClass value) {
      if (customClassBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          customClass_ != null &&
          customClass_ != com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance()) {
          getCustomClassBuilder().mergeFrom(value);
        } else {
          customClass_ = value;
        }
      } else {
        customClassBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCustomClass() {
      bitField0_ = (bitField0_ & ~0x00000004);
      customClass_ = null;
      if (customClassBuilder_ != null) {
        customClassBuilder_.dispose();
        customClassBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v1p1beta1.CustomClass.Builder getCustomClassBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCustomClassFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder getCustomClassOrBuilder() {
      if (customClassBuilder_ != null) {
        return customClassBuilder_.getMessageOrBuilder();
      } else {
        return customClass_ == null ?
            com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
      }
    }
    /**
     * <pre>
     * Required. The custom class to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v1p1beta1.CustomClass, com.google.cloud.speech.v1p1beta1.CustomClass.Builder, com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder> 
        getCustomClassFieldBuilder() {
      if (customClassBuilder_ == null) {
        customClassBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1p1beta1.CustomClass, com.google.cloud.speech.v1p1beta1.CustomClass.Builder, com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder>(
                getCustomClass(),
                getParentForChildren(),
                isClean());
        customClass_ = null;
      }
      return customClassBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.CreateCustomClassRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.CreateCustomClassRequest)
  private static final com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest();
  }

  public static com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomClassRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomClassRequest>() {
    @java.lang.Override
    public CreateCustomClassRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomClassRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomClassRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

