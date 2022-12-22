// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/annotation_spec_color.proto

package com.google.cloud.aiplatform.v1beta1.schema;

/**
 * <pre>
 * An entry of mapping between color and AnnotationSpec. The mapping is used in
 * segmentation mask.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor}
 */
public final class AnnotationSpecColor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)
    AnnotationSpecColorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnnotationSpecColor.newBuilder() to construct.
  private AnnotationSpecColor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnnotationSpecColor() {
    displayName_ = "";
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnnotationSpecColor();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.class, com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.Builder.class);
  }

  public static final int COLOR_FIELD_NUMBER = 1;
  private com.google.type.Color color_;
  /**
   * <pre>
   * The color of the AnnotationSpec in a segmentation mask.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   * @return Whether the color field is set.
   */
  @java.lang.Override
  public boolean hasColor() {
    return color_ != null;
  }
  /**
   * <pre>
   * The color of the AnnotationSpec in a segmentation mask.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   * @return The color.
   */
  @java.lang.Override
  public com.google.type.Color getColor() {
    return color_ == null ? com.google.type.Color.getDefaultInstance() : color_;
  }
  /**
   * <pre>
   * The color of the AnnotationSpec in a segmentation mask.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  @java.lang.Override
  public com.google.type.ColorOrBuilder getColorOrBuilder() {
    return color_ == null ? com.google.type.Color.getDefaultInstance() : color_;
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   * <pre>
   * The display name of the AnnotationSpec represented by the color in the
   * segmentation mask.
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
   * The display name of the AnnotationSpec represented by the color in the
   * segmentation mask.
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

  public static final int ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * The ID of the AnnotationSpec represented by the color in the segmentation
   * mask.
   * </pre>
   *
   * <code>string id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the AnnotationSpec represented by the color in the segmentation
   * mask.
   * </pre>
   *
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
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
    if (color_ != null) {
      output.writeMessage(1, getColor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (color_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getColor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor other = (com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor) obj;

    if (hasColor() != other.hasColor()) return false;
    if (hasColor()) {
      if (!getColor()
          .equals(other.getColor())) return false;
    }
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
    if (!getId()
        .equals(other.getId())) return false;
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
    if (hasColor()) {
      hash = (37 * hash) + COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getColor().hashCode();
    }
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor prototype) {
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
   * An entry of mapping between color and AnnotationSpec. The mapping is used in
   * segmentation mask.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)
      com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.class, com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.newBuilder()
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
      color_ = null;
      if (colorBuilder_ != null) {
        colorBuilder_.dispose();
        colorBuilder_ = null;
      }
      displayName_ = "";
      id_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor build() {
      com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor result = new com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.color_ = colorBuilder_ == null
            ? color_
            : colorBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayName_ = displayName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.id_ = id_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.getDefaultInstance()) return this;
      if (other.hasColor()) {
        mergeColor(other.getColor());
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
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
                  getColorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              displayName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              id_ = input.readStringRequireUtf8();
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

    private com.google.type.Color color_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Color, com.google.type.Color.Builder, com.google.type.ColorOrBuilder> colorBuilder_;
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     * @return Whether the color field is set.
     */
    public boolean hasColor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     * @return The color.
     */
    public com.google.type.Color getColor() {
      if (colorBuilder_ == null) {
        return color_ == null ? com.google.type.Color.getDefaultInstance() : color_;
      } else {
        return colorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder setColor(com.google.type.Color value) {
      if (colorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        color_ = value;
      } else {
        colorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder setColor(
        com.google.type.Color.Builder builderForValue) {
      if (colorBuilder_ == null) {
        color_ = builderForValue.build();
      } else {
        colorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder mergeColor(com.google.type.Color value) {
      if (colorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          color_ != null &&
          color_ != com.google.type.Color.getDefaultInstance()) {
          getColorBuilder().mergeFrom(value);
        } else {
          color_ = value;
        }
      } else {
        colorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder clearColor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      color_ = null;
      if (colorBuilder_ != null) {
        colorBuilder_.dispose();
        colorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public com.google.type.Color.Builder getColorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getColorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public com.google.type.ColorOrBuilder getColorOrBuilder() {
      if (colorBuilder_ != null) {
        return colorBuilder_.getMessageOrBuilder();
      } else {
        return color_ == null ?
            com.google.type.Color.getDefaultInstance() : color_;
      }
    }
    /**
     * <pre>
     * The color of the AnnotationSpec in a segmentation mask.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Color, com.google.type.Color.Builder, com.google.type.ColorOrBuilder> 
        getColorFieldBuilder() {
      if (colorBuilder_ == null) {
        colorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Color, com.google.type.Color.Builder, com.google.type.ColorOrBuilder>(
                getColor(),
                getParentForChildren(),
                isClean());
        color_ = null;
      }
      return colorBuilder_;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The display name of the AnnotationSpec represented by the color in the
     * segmentation mask.
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
     * The display name of the AnnotationSpec represented by the color in the
     * segmentation mask.
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
     * The display name of the AnnotationSpec represented by the color in the
     * segmentation mask.
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
     * The display name of the AnnotationSpec represented by the color in the
     * segmentation mask.
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
     * The display name of the AnnotationSpec represented by the color in the
     * segmentation mask.
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The ID of the AnnotationSpec represented by the color in the segmentation
     * mask.
     * </pre>
     *
     * <code>string id = 3;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the AnnotationSpec represented by the color in the segmentation
     * mask.
     * </pre>
     *
     * <code>string id = 3;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the AnnotationSpec represented by the color in the segmentation
     * mask.
     * </pre>
     *
     * <code>string id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the AnnotationSpec represented by the color in the segmentation
     * mask.
     * </pre>
     *
     * <code>string id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the AnnotationSpec represented by the color in the segmentation
     * mask.
     * </pre>
     *
     * <code>string id = 3;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)
  private static final com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotationSpecColor>
      PARSER = new com.google.protobuf.AbstractParser<AnnotationSpecColor>() {
    @java.lang.Override
    public AnnotationSpecColor parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnnotationSpecColor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotationSpecColor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
