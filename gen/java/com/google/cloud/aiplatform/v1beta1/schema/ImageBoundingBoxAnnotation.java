// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/annotation_payload.proto

package com.google.cloud.aiplatform.v1beta1.schema;

/**
 * <pre>
 * Annotation details specific to image object detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation}
 */
public final class ImageBoundingBoxAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation)
    ImageBoundingBoxAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageBoundingBoxAnnotation.newBuilder() to construct.
  private ImageBoundingBoxAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageBoundingBoxAnnotation() {
    annotationSpecId_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageBoundingBoxAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.class, com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.Builder.class);
  }

  public static final int ANNOTATION_SPEC_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object annotationSpecId_ = "";
  /**
   * <pre>
   * The resource Id of the AnnotationSpec that this Annotation pertains to.
   * </pre>
   *
   * <code>string annotation_spec_id = 1;</code>
   * @return The annotationSpecId.
   */
  @java.lang.Override
  public java.lang.String getAnnotationSpecId() {
    java.lang.Object ref = annotationSpecId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annotationSpecId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource Id of the AnnotationSpec that this Annotation pertains to.
   * </pre>
   *
   * <code>string annotation_spec_id = 1;</code>
   * @return The bytes for annotationSpecId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAnnotationSpecIdBytes() {
    java.lang.Object ref = annotationSpecId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      annotationSpecId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   * <pre>
   * The display name of the AnnotationSpec that this Annotation pertains to.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The display name of the AnnotationSpec that this Annotation pertains to.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int X_MIN_FIELD_NUMBER = 3;
  private double xMin_ = 0D;
  /**
   * <pre>
   * The leftmost coordinate of the bounding box.
   * </pre>
   *
   * <code>double x_min = 3;</code>
   * @return The xMin.
   */
  @java.lang.Override
  public double getXMin() {
    return xMin_;
  }

  public static final int X_MAX_FIELD_NUMBER = 4;
  private double xMax_ = 0D;
  /**
   * <pre>
   * The rightmost coordinate of the bounding box.
   * </pre>
   *
   * <code>double x_max = 4;</code>
   * @return The xMax.
   */
  @java.lang.Override
  public double getXMax() {
    return xMax_;
  }

  public static final int Y_MIN_FIELD_NUMBER = 5;
  private double yMin_ = 0D;
  /**
   * <pre>
   * The topmost coordinate of the bounding box.
   * </pre>
   *
   * <code>double y_min = 5;</code>
   * @return The yMin.
   */
  @java.lang.Override
  public double getYMin() {
    return yMin_;
  }

  public static final int Y_MAX_FIELD_NUMBER = 6;
  private double yMax_ = 0D;
  /**
   * <pre>
   * The bottommost coordinate of the bounding box.
   * </pre>
   *
   * <code>double y_max = 6;</code>
   * @return The yMax.
   */
  @java.lang.Override
  public double getYMax() {
    return yMax_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, annotationSpecId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (java.lang.Double.doubleToRawLongBits(xMin_) != 0) {
      output.writeDouble(3, xMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(xMax_) != 0) {
      output.writeDouble(4, xMax_);
    }
    if (java.lang.Double.doubleToRawLongBits(yMin_) != 0) {
      output.writeDouble(5, yMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(yMax_) != 0) {
      output.writeDouble(6, yMax_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, annotationSpecId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (java.lang.Double.doubleToRawLongBits(xMin_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, xMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(xMax_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, xMax_);
    }
    if (java.lang.Double.doubleToRawLongBits(yMin_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, yMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(yMax_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, yMax_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation other = (com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation) obj;

    if (!getAnnotationSpecId()
        .equals(other.getAnnotationSpecId())) return false;
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
    if (java.lang.Double.doubleToLongBits(getXMin())
        != java.lang.Double.doubleToLongBits(
            other.getXMin())) return false;
    if (java.lang.Double.doubleToLongBits(getXMax())
        != java.lang.Double.doubleToLongBits(
            other.getXMax())) return false;
    if (java.lang.Double.doubleToLongBits(getYMin())
        != java.lang.Double.doubleToLongBits(
            other.getYMin())) return false;
    if (java.lang.Double.doubleToLongBits(getYMax())
        != java.lang.Double.doubleToLongBits(
            other.getYMax())) return false;
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
    hash = (37 * hash) + ANNOTATION_SPEC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationSpecId().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + X_MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getXMin()));
    hash = (37 * hash) + X_MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getXMax()));
    hash = (37 * hash) + Y_MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getYMin()));
    hash = (37 * hash) + Y_MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getYMax()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation prototype) {
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
   * Annotation details specific to image object detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation)
      com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.class, com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.newBuilder()
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
      annotationSpecId_ = "";
      displayName_ = "";
      xMin_ = 0D;
      xMax_ = 0D;
      yMin_ = 0D;
      yMax_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation build() {
      com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation result = new com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.annotationSpecId_ = annotationSpecId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayName_ = displayName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.xMin_ = xMin_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.xMax_ = xMax_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.yMin_ = yMin_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.yMax_ = yMax_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation.getDefaultInstance()) return this;
      if (!other.getAnnotationSpecId().isEmpty()) {
        annotationSpecId_ = other.annotationSpecId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getXMin() != 0D) {
        setXMin(other.getXMin());
      }
      if (other.getXMax() != 0D) {
        setXMax(other.getXMax());
      }
      if (other.getYMin() != 0D) {
        setYMin(other.getYMin());
      }
      if (other.getYMax() != 0D) {
        setYMax(other.getYMax());
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
              annotationSpecId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              displayName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 25: {
              xMin_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 33: {
              xMax_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
            case 41: {
              yMin_ = input.readDouble();
              bitField0_ |= 0x00000010;
              break;
            } // case 41
            case 49: {
              yMax_ = input.readDouble();
              bitField0_ |= 0x00000020;
              break;
            } // case 49
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

    private java.lang.Object annotationSpecId_ = "";
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 1;</code>
     * @return The annotationSpecId.
     */
    public java.lang.String getAnnotationSpecId() {
      java.lang.Object ref = annotationSpecId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annotationSpecId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 1;</code>
     * @return The bytes for annotationSpecId.
     */
    public com.google.protobuf.ByteString
        getAnnotationSpecIdBytes() {
      java.lang.Object ref = annotationSpecId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        annotationSpecId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 1;</code>
     * @param value The annotationSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      annotationSpecId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnotationSpecId() {
      annotationSpecId_ = getDefaultInstance().getAnnotationSpecId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 1;</code>
     * @param value The bytes for annotationSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      annotationSpecId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private double xMin_ ;
    /**
     * <pre>
     * The leftmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double x_min = 3;</code>
     * @return The xMin.
     */
    @java.lang.Override
    public double getXMin() {
      return xMin_;
    }
    /**
     * <pre>
     * The leftmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double x_min = 3;</code>
     * @param value The xMin to set.
     * @return This builder for chaining.
     */
    public Builder setXMin(double value) {
      
      xMin_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The leftmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double x_min = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearXMin() {
      bitField0_ = (bitField0_ & ~0x00000004);
      xMin_ = 0D;
      onChanged();
      return this;
    }

    private double xMax_ ;
    /**
     * <pre>
     * The rightmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double x_max = 4;</code>
     * @return The xMax.
     */
    @java.lang.Override
    public double getXMax() {
      return xMax_;
    }
    /**
     * <pre>
     * The rightmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double x_max = 4;</code>
     * @param value The xMax to set.
     * @return This builder for chaining.
     */
    public Builder setXMax(double value) {
      
      xMax_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The rightmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double x_max = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearXMax() {
      bitField0_ = (bitField0_ & ~0x00000008);
      xMax_ = 0D;
      onChanged();
      return this;
    }

    private double yMin_ ;
    /**
     * <pre>
     * The topmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double y_min = 5;</code>
     * @return The yMin.
     */
    @java.lang.Override
    public double getYMin() {
      return yMin_;
    }
    /**
     * <pre>
     * The topmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double y_min = 5;</code>
     * @param value The yMin to set.
     * @return This builder for chaining.
     */
    public Builder setYMin(double value) {
      
      yMin_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The topmost coordinate of the bounding box.
     * </pre>
     *
     * <code>double y_min = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearYMin() {
      bitField0_ = (bitField0_ & ~0x00000010);
      yMin_ = 0D;
      onChanged();
      return this;
    }

    private double yMax_ ;
    /**
     * <pre>
     * The bottommost coordinate of the bounding box.
     * </pre>
     *
     * <code>double y_max = 6;</code>
     * @return The yMax.
     */
    @java.lang.Override
    public double getYMax() {
      return yMax_;
    }
    /**
     * <pre>
     * The bottommost coordinate of the bounding box.
     * </pre>
     *
     * <code>double y_max = 6;</code>
     * @param value The yMax to set.
     * @return This builder for chaining.
     */
    public Builder setYMax(double value) {
      
      yMax_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bottommost coordinate of the bounding box.
     * </pre>
     *
     * <code>double y_max = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearYMax() {
      bitField0_ = (bitField0_ & ~0x00000020);
      yMax_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation)
  private static final com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageBoundingBoxAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<ImageBoundingBoxAnnotation>() {
    @java.lang.Override
    public ImageBoundingBoxAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageBoundingBoxAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageBoundingBoxAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.ImageBoundingBoxAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

