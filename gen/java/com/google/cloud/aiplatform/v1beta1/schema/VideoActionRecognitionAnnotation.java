// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/annotation_payload.proto

package com.google.cloud.aiplatform.v1beta1.schema;

/**
 * <pre>
 * Annotation details specific to video action recognition.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation}
 */
public final class VideoActionRecognitionAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation)
    VideoActionRecognitionAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoActionRecognitionAnnotation.newBuilder() to construct.
  private VideoActionRecognitionAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoActionRecognitionAnnotation() {
    annotationSpecId_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoActionRecognitionAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.class, com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.Builder.class);
  }

  public static final int TIME_SEGMENT_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.schema.TimeSegment timeSegment_;
  /**
   * <pre>
   * This Annotation applies to the time period represented by the TimeSegment.
   * If it's not set, the Annotation applies to the whole video.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
   * @return Whether the timeSegment field is set.
   */
  @java.lang.Override
  public boolean hasTimeSegment() {
    return timeSegment_ != null;
  }
  /**
   * <pre>
   * This Annotation applies to the time period represented by the TimeSegment.
   * If it's not set, the Annotation applies to the whole video.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
   * @return The timeSegment.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.TimeSegment getTimeSegment() {
    return timeSegment_ == null ? com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.getDefaultInstance() : timeSegment_;
  }
  /**
   * <pre>
   * This Annotation applies to the time period represented by the TimeSegment.
   * If it's not set, the Annotation applies to the whole video.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.TimeSegmentOrBuilder getTimeSegmentOrBuilder() {
    return timeSegment_ == null ? com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.getDefaultInstance() : timeSegment_;
  }

  public static final int ANNOTATION_SPEC_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object annotationSpecId_ = "";
  /**
   * <pre>
   * The resource Id of the AnnotationSpec that this Annotation pertains to.
   * </pre>
   *
   * <code>string annotation_spec_id = 2;</code>
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
   * <code>string annotation_spec_id = 2;</code>
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

  public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   * <pre>
   * The display name of the AnnotationSpec that this Annotation pertains to.
   * </pre>
   *
   * <code>string display_name = 3;</code>
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
   * <code>string display_name = 3;</code>
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
    if (timeSegment_ != null) {
      output.writeMessage(1, getTimeSegment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, annotationSpecId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, displayName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeSegment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimeSegment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, annotationSpecId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, displayName_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation other = (com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation) obj;

    if (hasTimeSegment() != other.hasTimeSegment()) return false;
    if (hasTimeSegment()) {
      if (!getTimeSegment()
          .equals(other.getTimeSegment())) return false;
    }
    if (!getAnnotationSpecId()
        .equals(other.getAnnotationSpecId())) return false;
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
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
    if (hasTimeSegment()) {
      hash = (37 * hash) + TIME_SEGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSegment().hashCode();
    }
    hash = (37 * hash) + ANNOTATION_SPEC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationSpecId().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation prototype) {
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
   * Annotation details specific to video action recognition.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation)
      com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.class, com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.newBuilder()
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
      timeSegment_ = null;
      if (timeSegmentBuilder_ != null) {
        timeSegmentBuilder_.dispose();
        timeSegmentBuilder_ = null;
      }
      annotationSpecId_ = "";
      displayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationPayloadProto.internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation build() {
      com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation result = new com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeSegment_ = timeSegmentBuilder_ == null
            ? timeSegment_
            : timeSegmentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.annotationSpecId_ = annotationSpecId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayName_ = displayName_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation.getDefaultInstance()) return this;
      if (other.hasTimeSegment()) {
        mergeTimeSegment(other.getTimeSegment());
      }
      if (!other.getAnnotationSpecId().isEmpty()) {
        annotationSpecId_ = other.annotationSpecId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
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
              input.readMessage(
                  getTimeSegmentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              annotationSpecId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              displayName_ = input.readStringRequireUtf8();
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

    private com.google.cloud.aiplatform.v1beta1.schema.TimeSegment timeSegment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.schema.TimeSegment, com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.Builder, com.google.cloud.aiplatform.v1beta1.schema.TimeSegmentOrBuilder> timeSegmentBuilder_;
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     * @return Whether the timeSegment field is set.
     */
    public boolean hasTimeSegment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     * @return The timeSegment.
     */
    public com.google.cloud.aiplatform.v1beta1.schema.TimeSegment getTimeSegment() {
      if (timeSegmentBuilder_ == null) {
        return timeSegment_ == null ? com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.getDefaultInstance() : timeSegment_;
      } else {
        return timeSegmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    public Builder setTimeSegment(com.google.cloud.aiplatform.v1beta1.schema.TimeSegment value) {
      if (timeSegmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSegment_ = value;
      } else {
        timeSegmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    public Builder setTimeSegment(
        com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.Builder builderForValue) {
      if (timeSegmentBuilder_ == null) {
        timeSegment_ = builderForValue.build();
      } else {
        timeSegmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    public Builder mergeTimeSegment(com.google.cloud.aiplatform.v1beta1.schema.TimeSegment value) {
      if (timeSegmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timeSegment_ != null &&
          timeSegment_ != com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.getDefaultInstance()) {
          getTimeSegmentBuilder().mergeFrom(value);
        } else {
          timeSegment_ = value;
        }
      } else {
        timeSegmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    public Builder clearTimeSegment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeSegment_ = null;
      if (timeSegmentBuilder_ != null) {
        timeSegmentBuilder_.dispose();
        timeSegmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.Builder getTimeSegmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeSegmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.schema.TimeSegmentOrBuilder getTimeSegmentOrBuilder() {
      if (timeSegmentBuilder_ != null) {
        return timeSegmentBuilder_.getMessageOrBuilder();
      } else {
        return timeSegment_ == null ?
            com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.getDefaultInstance() : timeSegment_;
      }
    }
    /**
     * <pre>
     * This Annotation applies to the time period represented by the TimeSegment.
     * If it's not set, the Annotation applies to the whole video.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.TimeSegment time_segment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.schema.TimeSegment, com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.Builder, com.google.cloud.aiplatform.v1beta1.schema.TimeSegmentOrBuilder> 
        getTimeSegmentFieldBuilder() {
      if (timeSegmentBuilder_ == null) {
        timeSegmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.schema.TimeSegment, com.google.cloud.aiplatform.v1beta1.schema.TimeSegment.Builder, com.google.cloud.aiplatform.v1beta1.schema.TimeSegmentOrBuilder>(
                getTimeSegment(),
                getParentForChildren(),
                isClean());
        timeSegment_ = null;
      }
      return timeSegmentBuilder_;
    }

    private java.lang.Object annotationSpecId_ = "";
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 2;</code>
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
     * <code>string annotation_spec_id = 2;</code>
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
     * <code>string annotation_spec_id = 2;</code>
     * @param value The annotationSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      annotationSpecId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnotationSpecId() {
      annotationSpecId_ = getDefaultInstance().getAnnotationSpecId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource Id of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string annotation_spec_id = 2;</code>
     * @param value The bytes for annotationSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      annotationSpecId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 3;</code>
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
     * <code>string display_name = 3;</code>
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
     * <code>string display_name = 3;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display name of the AnnotationSpec that this Annotation pertains to.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayName_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation)
  private static final com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoActionRecognitionAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<VideoActionRecognitionAnnotation>() {
    @java.lang.Override
    public VideoActionRecognitionAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoActionRecognitionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoActionRecognitionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.VideoActionRecognitionAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

