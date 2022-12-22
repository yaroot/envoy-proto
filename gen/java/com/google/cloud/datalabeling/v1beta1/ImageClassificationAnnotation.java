// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Image classification annotation definition.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation}
 */
public final class ImageClassificationAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation)
    ImageClassificationAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageClassificationAnnotation.newBuilder() to construct.
  private ImageClassificationAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageClassificationAnnotation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageClassificationAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.class, com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.Builder.class);
  }

  public static final int ANNOTATION_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.datalabeling.v1beta1.AnnotationSpec annotationSpec_;
  /**
   * <pre>
   * Label of image.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   * @return Whether the annotationSpec field is set.
   */
  @java.lang.Override
  public boolean hasAnnotationSpec() {
    return annotationSpec_ != null;
  }
  /**
   * <pre>
   * Label of image.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   * @return The annotationSpec.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec() {
    return annotationSpec_ == null ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance() : annotationSpec_;
  }
  /**
   * <pre>
   * Label of image.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder() {
    return annotationSpec_ == null ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance() : annotationSpec_;
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
    if (annotationSpec_ != null) {
      output.writeMessage(1, getAnnotationSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (annotationSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAnnotationSpec());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation other = (com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation) obj;

    if (hasAnnotationSpec() != other.hasAnnotationSpec()) return false;
    if (hasAnnotationSpec()) {
      if (!getAnnotationSpec()
          .equals(other.getAnnotationSpec())) return false;
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
    if (hasAnnotationSpec()) {
      hash = (37 * hash) + ANNOTATION_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation prototype) {
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
   * Image classification annotation definition.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation)
      com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.class, com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.newBuilder()
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
      annotationSpec_ = null;
      if (annotationSpecBuilder_ != null) {
        annotationSpecBuilder_.dispose();
        annotationSpecBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation build() {
      com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation result = new com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.annotationSpec_ = annotationSpecBuilder_ == null
            ? annotationSpec_
            : annotationSpecBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation other) {
      if (other == com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation.getDefaultInstance()) return this;
      if (other.hasAnnotationSpec()) {
        mergeAnnotationSpec(other.getAnnotationSpec());
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
                  getAnnotationSpecFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.cloud.datalabeling.v1beta1.AnnotationSpec annotationSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.AnnotationSpec, com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder, com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder> annotationSpecBuilder_;
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     * @return Whether the annotationSpec field is set.
     */
    public boolean hasAnnotationSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     * @return The annotationSpec.
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec() {
      if (annotationSpecBuilder_ == null) {
        return annotationSpec_ == null ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance() : annotationSpec_;
      } else {
        return annotationSpecBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder setAnnotationSpec(com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (annotationSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotationSpec_ = value;
      } else {
        annotationSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder setAnnotationSpec(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder builderForValue) {
      if (annotationSpecBuilder_ == null) {
        annotationSpec_ = builderForValue.build();
      } else {
        annotationSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder mergeAnnotationSpec(com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (annotationSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          annotationSpec_ != null &&
          annotationSpec_ != com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()) {
          getAnnotationSpecBuilder().mergeFrom(value);
        } else {
          annotationSpec_ = value;
        }
      } else {
        annotationSpecBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder clearAnnotationSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      annotationSpec_ = null;
      if (annotationSpecBuilder_ != null) {
        annotationSpecBuilder_.dispose();
        annotationSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder getAnnotationSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAnnotationSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder() {
      if (annotationSpecBuilder_ != null) {
        return annotationSpecBuilder_.getMessageOrBuilder();
      } else {
        return annotationSpec_ == null ?
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance() : annotationSpec_;
      }
    }
    /**
     * <pre>
     * Label of image.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.AnnotationSpec, com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder, com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder> 
        getAnnotationSpecFieldBuilder() {
      if (annotationSpecBuilder_ == null) {
        annotationSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec, com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder, com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>(
                getAnnotationSpec(),
                getParentForChildren(),
                isClean());
        annotationSpec_ = null;
      }
      return annotationSpecBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation)
  private static final com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation();
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageClassificationAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<ImageClassificationAnnotation>() {
    @java.lang.Override
    public ImageClassificationAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageClassificationAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageClassificationAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

