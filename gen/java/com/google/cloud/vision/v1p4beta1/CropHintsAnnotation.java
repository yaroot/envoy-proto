// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 * <pre>
 * Set of crop hints that are used to generate new crops when serving images.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.CropHintsAnnotation}
 */
public final class CropHintsAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.CropHintsAnnotation)
    CropHintsAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CropHintsAnnotation.newBuilder() to construct.
  private CropHintsAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CropHintsAnnotation() {
    cropHints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CropHintsAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_CropHintsAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_CropHintsAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.class, com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.Builder.class);
  }

  public static final int CROP_HINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.vision.v1p4beta1.CropHint> cropHints_;
  /**
   * <pre>
   * Crop hint results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vision.v1p4beta1.CropHint> getCropHintsList() {
    return cropHints_;
  }
  /**
   * <pre>
   * Crop hint results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vision.v1p4beta1.CropHintOrBuilder> 
      getCropHintsOrBuilderList() {
    return cropHints_;
  }
  /**
   * <pre>
   * Crop hint results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
   */
  @java.lang.Override
  public int getCropHintsCount() {
    return cropHints_.size();
  }
  /**
   * <pre>
   * Crop hint results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.CropHint getCropHints(int index) {
    return cropHints_.get(index);
  }
  /**
   * <pre>
   * Crop hint results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.CropHintOrBuilder getCropHintsOrBuilder(
      int index) {
    return cropHints_.get(index);
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
    for (int i = 0; i < cropHints_.size(); i++) {
      output.writeMessage(1, cropHints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cropHints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cropHints_.get(i));
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.CropHintsAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.CropHintsAnnotation other = (com.google.cloud.vision.v1p4beta1.CropHintsAnnotation) obj;

    if (!getCropHintsList()
        .equals(other.getCropHintsList())) return false;
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
    if (getCropHintsCount() > 0) {
      hash = (37 * hash) + CROP_HINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCropHintsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1p4beta1.CropHintsAnnotation prototype) {
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
   * Set of crop hints that are used to generate new crops when serving images.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.CropHintsAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.CropHintsAnnotation)
      com.google.cloud.vision.v1p4beta1.CropHintsAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_CropHintsAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_CropHintsAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.class, com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.newBuilder()
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
      if (cropHintsBuilder_ == null) {
        cropHints_ = java.util.Collections.emptyList();
      } else {
        cropHints_ = null;
        cropHintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_CropHintsAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.CropHintsAnnotation getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.CropHintsAnnotation build() {
      com.google.cloud.vision.v1p4beta1.CropHintsAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.CropHintsAnnotation buildPartial() {
      com.google.cloud.vision.v1p4beta1.CropHintsAnnotation result = new com.google.cloud.vision.v1p4beta1.CropHintsAnnotation(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.vision.v1p4beta1.CropHintsAnnotation result) {
      if (cropHintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cropHints_ = java.util.Collections.unmodifiableList(cropHints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cropHints_ = cropHints_;
      } else {
        result.cropHints_ = cropHintsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.vision.v1p4beta1.CropHintsAnnotation result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.CropHintsAnnotation) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.CropHintsAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.CropHintsAnnotation other) {
      if (other == com.google.cloud.vision.v1p4beta1.CropHintsAnnotation.getDefaultInstance()) return this;
      if (cropHintsBuilder_ == null) {
        if (!other.cropHints_.isEmpty()) {
          if (cropHints_.isEmpty()) {
            cropHints_ = other.cropHints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCropHintsIsMutable();
            cropHints_.addAll(other.cropHints_);
          }
          onChanged();
        }
      } else {
        if (!other.cropHints_.isEmpty()) {
          if (cropHintsBuilder_.isEmpty()) {
            cropHintsBuilder_.dispose();
            cropHintsBuilder_ = null;
            cropHints_ = other.cropHints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cropHintsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCropHintsFieldBuilder() : null;
          } else {
            cropHintsBuilder_.addAllMessages(other.cropHints_);
          }
        }
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
              com.google.cloud.vision.v1p4beta1.CropHint m =
                  input.readMessage(
                      com.google.cloud.vision.v1p4beta1.CropHint.parser(),
                      extensionRegistry);
              if (cropHintsBuilder_ == null) {
                ensureCropHintsIsMutable();
                cropHints_.add(m);
              } else {
                cropHintsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.vision.v1p4beta1.CropHint> cropHints_ =
      java.util.Collections.emptyList();
    private void ensureCropHintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cropHints_ = new java.util.ArrayList<com.google.cloud.vision.v1p4beta1.CropHint>(cropHints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1p4beta1.CropHint, com.google.cloud.vision.v1p4beta1.CropHint.Builder, com.google.cloud.vision.v1p4beta1.CropHintOrBuilder> cropHintsBuilder_;

    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p4beta1.CropHint> getCropHintsList() {
      if (cropHintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cropHints_);
      } else {
        return cropHintsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public int getCropHintsCount() {
      if (cropHintsBuilder_ == null) {
        return cropHints_.size();
      } else {
        return cropHintsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.CropHint getCropHints(int index) {
      if (cropHintsBuilder_ == null) {
        return cropHints_.get(index);
      } else {
        return cropHintsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder setCropHints(
        int index, com.google.cloud.vision.v1p4beta1.CropHint value) {
      if (cropHintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCropHintsIsMutable();
        cropHints_.set(index, value);
        onChanged();
      } else {
        cropHintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder setCropHints(
        int index, com.google.cloud.vision.v1p4beta1.CropHint.Builder builderForValue) {
      if (cropHintsBuilder_ == null) {
        ensureCropHintsIsMutable();
        cropHints_.set(index, builderForValue.build());
        onChanged();
      } else {
        cropHintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder addCropHints(com.google.cloud.vision.v1p4beta1.CropHint value) {
      if (cropHintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCropHintsIsMutable();
        cropHints_.add(value);
        onChanged();
      } else {
        cropHintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder addCropHints(
        int index, com.google.cloud.vision.v1p4beta1.CropHint value) {
      if (cropHintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCropHintsIsMutable();
        cropHints_.add(index, value);
        onChanged();
      } else {
        cropHintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder addCropHints(
        com.google.cloud.vision.v1p4beta1.CropHint.Builder builderForValue) {
      if (cropHintsBuilder_ == null) {
        ensureCropHintsIsMutable();
        cropHints_.add(builderForValue.build());
        onChanged();
      } else {
        cropHintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder addCropHints(
        int index, com.google.cloud.vision.v1p4beta1.CropHint.Builder builderForValue) {
      if (cropHintsBuilder_ == null) {
        ensureCropHintsIsMutable();
        cropHints_.add(index, builderForValue.build());
        onChanged();
      } else {
        cropHintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder addAllCropHints(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p4beta1.CropHint> values) {
      if (cropHintsBuilder_ == null) {
        ensureCropHintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cropHints_);
        onChanged();
      } else {
        cropHintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder clearCropHints() {
      if (cropHintsBuilder_ == null) {
        cropHints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cropHintsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public Builder removeCropHints(int index) {
      if (cropHintsBuilder_ == null) {
        ensureCropHintsIsMutable();
        cropHints_.remove(index);
        onChanged();
      } else {
        cropHintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.CropHint.Builder getCropHintsBuilder(
        int index) {
      return getCropHintsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.CropHintOrBuilder getCropHintsOrBuilder(
        int index) {
      if (cropHintsBuilder_ == null) {
        return cropHints_.get(index);  } else {
        return cropHintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1p4beta1.CropHintOrBuilder> 
         getCropHintsOrBuilderList() {
      if (cropHintsBuilder_ != null) {
        return cropHintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cropHints_);
      }
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.CropHint.Builder addCropHintsBuilder() {
      return getCropHintsFieldBuilder().addBuilder(
          com.google.cloud.vision.v1p4beta1.CropHint.getDefaultInstance());
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.CropHint.Builder addCropHintsBuilder(
        int index) {
      return getCropHintsFieldBuilder().addBuilder(
          index, com.google.cloud.vision.v1p4beta1.CropHint.getDefaultInstance());
    }
    /**
     * <pre>
     * Crop hint results.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.CropHint crop_hints = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p4beta1.CropHint.Builder> 
         getCropHintsBuilderList() {
      return getCropHintsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1p4beta1.CropHint, com.google.cloud.vision.v1p4beta1.CropHint.Builder, com.google.cloud.vision.v1p4beta1.CropHintOrBuilder> 
        getCropHintsFieldBuilder() {
      if (cropHintsBuilder_ == null) {
        cropHintsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.CropHint, com.google.cloud.vision.v1p4beta1.CropHint.Builder, com.google.cloud.vision.v1p4beta1.CropHintOrBuilder>(
                cropHints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cropHints_ = null;
      }
      return cropHintsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.CropHintsAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.CropHintsAnnotation)
  private static final com.google.cloud.vision.v1p4beta1.CropHintsAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.CropHintsAnnotation();
  }

  public static com.google.cloud.vision.v1p4beta1.CropHintsAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CropHintsAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<CropHintsAnnotation>() {
    @java.lang.Override
    public CropHintsAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<CropHintsAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CropHintsAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.CropHintsAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

