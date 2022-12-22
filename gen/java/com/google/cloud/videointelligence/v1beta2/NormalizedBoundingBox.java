// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta2;

/**
 * <pre>
 * Normalized bounding box.
 * The normalized vertex coordinates are relative to the original image.
 * Range: [0, 1].
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta2.NormalizedBoundingBox}
 */
public final class NormalizedBoundingBox extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta2.NormalizedBoundingBox)
    NormalizedBoundingBoxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NormalizedBoundingBox.newBuilder() to construct.
  private NormalizedBoundingBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NormalizedBoundingBox() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NormalizedBoundingBox();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta2_NormalizedBoundingBox_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta2_NormalizedBoundingBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.class, com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.Builder.class);
  }

  public static final int LEFT_FIELD_NUMBER = 1;
  private float left_ = 0F;
  /**
   * <pre>
   * Left X coordinate.
   * </pre>
   *
   * <code>float left = 1;</code>
   * @return The left.
   */
  @java.lang.Override
  public float getLeft() {
    return left_;
  }

  public static final int TOP_FIELD_NUMBER = 2;
  private float top_ = 0F;
  /**
   * <pre>
   * Top Y coordinate.
   * </pre>
   *
   * <code>float top = 2;</code>
   * @return The top.
   */
  @java.lang.Override
  public float getTop() {
    return top_;
  }

  public static final int RIGHT_FIELD_NUMBER = 3;
  private float right_ = 0F;
  /**
   * <pre>
   * Right X coordinate.
   * </pre>
   *
   * <code>float right = 3;</code>
   * @return The right.
   */
  @java.lang.Override
  public float getRight() {
    return right_;
  }

  public static final int BOTTOM_FIELD_NUMBER = 4;
  private float bottom_ = 0F;
  /**
   * <pre>
   * Bottom Y coordinate.
   * </pre>
   *
   * <code>float bottom = 4;</code>
   * @return The bottom.
   */
  @java.lang.Override
  public float getBottom() {
    return bottom_;
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
    if (java.lang.Float.floatToRawIntBits(left_) != 0) {
      output.writeFloat(1, left_);
    }
    if (java.lang.Float.floatToRawIntBits(top_) != 0) {
      output.writeFloat(2, top_);
    }
    if (java.lang.Float.floatToRawIntBits(right_) != 0) {
      output.writeFloat(3, right_);
    }
    if (java.lang.Float.floatToRawIntBits(bottom_) != 0) {
      output.writeFloat(4, bottom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(left_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, left_);
    }
    if (java.lang.Float.floatToRawIntBits(top_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, top_);
    }
    if (java.lang.Float.floatToRawIntBits(right_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, right_);
    }
    if (java.lang.Float.floatToRawIntBits(bottom_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, bottom_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox other = (com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox) obj;

    if (java.lang.Float.floatToIntBits(getLeft())
        != java.lang.Float.floatToIntBits(
            other.getLeft())) return false;
    if (java.lang.Float.floatToIntBits(getTop())
        != java.lang.Float.floatToIntBits(
            other.getTop())) return false;
    if (java.lang.Float.floatToIntBits(getRight())
        != java.lang.Float.floatToIntBits(
            other.getRight())) return false;
    if (java.lang.Float.floatToIntBits(getBottom())
        != java.lang.Float.floatToIntBits(
            other.getBottom())) return false;
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
    hash = (37 * hash) + LEFT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLeft());
    hash = (37 * hash) + TOP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTop());
    hash = (37 * hash) + RIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRight());
    hash = (37 * hash) + BOTTOM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBottom());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox prototype) {
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
   * Normalized bounding box.
   * The normalized vertex coordinates are relative to the original image.
   * Range: [0, 1].
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta2.NormalizedBoundingBox}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta2.NormalizedBoundingBox)
      com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta2_NormalizedBoundingBox_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta2_NormalizedBoundingBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.class, com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.newBuilder()
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
      left_ = 0F;
      top_ = 0F;
      right_ = 0F;
      bottom_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta2_NormalizedBoundingBox_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox build() {
      com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox buildPartial() {
      com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox result = new com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.left_ = left_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.top_ = top_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.right_ = right_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.bottom_ = bottom_;
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
      if (other instanceof com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox other) {
      if (other == com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox.getDefaultInstance()) return this;
      if (other.getLeft() != 0F) {
        setLeft(other.getLeft());
      }
      if (other.getTop() != 0F) {
        setTop(other.getTop());
      }
      if (other.getRight() != 0F) {
        setRight(other.getRight());
      }
      if (other.getBottom() != 0F) {
        setBottom(other.getBottom());
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
            case 13: {
              left_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
            case 21: {
              top_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 29: {
              right_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 37: {
              bottom_ = input.readFloat();
              bitField0_ |= 0x00000008;
              break;
            } // case 37
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

    private float left_ ;
    /**
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>float left = 1;</code>
     * @return The left.
     */
    @java.lang.Override
    public float getLeft() {
      return left_;
    }
    /**
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>float left = 1;</code>
     * @param value The left to set.
     * @return This builder for chaining.
     */
    public Builder setLeft(float value) {
      
      left_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>float left = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeft() {
      bitField0_ = (bitField0_ & ~0x00000001);
      left_ = 0F;
      onChanged();
      return this;
    }

    private float top_ ;
    /**
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>float top = 2;</code>
     * @return The top.
     */
    @java.lang.Override
    public float getTop() {
      return top_;
    }
    /**
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>float top = 2;</code>
     * @param value The top to set.
     * @return This builder for chaining.
     */
    public Builder setTop(float value) {
      
      top_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>float top = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTop() {
      bitField0_ = (bitField0_ & ~0x00000002);
      top_ = 0F;
      onChanged();
      return this;
    }

    private float right_ ;
    /**
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>float right = 3;</code>
     * @return The right.
     */
    @java.lang.Override
    public float getRight() {
      return right_;
    }
    /**
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>float right = 3;</code>
     * @param value The right to set.
     * @return This builder for chaining.
     */
    public Builder setRight(float value) {
      
      right_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>float right = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      right_ = 0F;
      onChanged();
      return this;
    }

    private float bottom_ ;
    /**
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>float bottom = 4;</code>
     * @return The bottom.
     */
    @java.lang.Override
    public float getBottom() {
      return bottom_;
    }
    /**
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>float bottom = 4;</code>
     * @param value The bottom to set.
     * @return This builder for chaining.
     */
    public Builder setBottom(float value) {
      
      bottom_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>float bottom = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBottom() {
      bitField0_ = (bitField0_ & ~0x00000008);
      bottom_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta2.NormalizedBoundingBox)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta2.NormalizedBoundingBox)
  private static final com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox();
  }

  public static com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedBoundingBox>
      PARSER = new com.google.protobuf.AbstractParser<NormalizedBoundingBox>() {
    @java.lang.Override
    public NormalizedBoundingBox parsePartialFrom(
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

  public static com.google.protobuf.Parser<NormalizedBoundingBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedBoundingBox> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
