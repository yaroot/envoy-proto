// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/conversation/prompt/content/image.proto

package com.google.actions.sdk.v2.conversation;

/**
 * <pre>
 * An image displayed in the card.
 * </pre>
 *
 * Protobuf type {@code google.actions.sdk.v2.conversation.Image}
 */
public final class Image extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.sdk.v2.conversation.Image)
    ImageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Image.newBuilder() to construct.
  private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Image() {
    url_ = "";
    alt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Image();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.sdk.v2.conversation.ImageProto.internal_static_google_actions_sdk_v2_conversation_Image_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.sdk.v2.conversation.ImageProto.internal_static_google_actions_sdk_v2_conversation_Image_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.sdk.v2.conversation.Image.class, com.google.actions.sdk.v2.conversation.Image.Builder.class);
  }

  /**
   * <pre>
   * Possible image display options for affecting the presentation of the image.
   * This should be used for when the image's aspect ratio does not match the
   * image container's aspect ratio.
   * </pre>
   *
   * Protobuf enum {@code google.actions.sdk.v2.conversation.Image.ImageFill}
   */
  public enum ImageFill
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified image fill.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Fill the gaps between the image and the image container with gray bars.
     * </pre>
     *
     * <code>GRAY = 1;</code>
     */
    GRAY(1),
    /**
     * <pre>
     * Fill the gaps between the image and the image container with white bars.
     * </pre>
     *
     * <code>WHITE = 2;</code>
     */
    WHITE(2),
    /**
     * <pre>
     * Image is scaled such that the image width and height match or exceed the
     * container dimensions. This may crop the top and bottom of the image if
     * the scaled image height is greater than the container height, or crop the
     * left and right of the image if the scaled image width is greater than the
     * container width. This is similar to "Zoom Mode" on a widescreen TV when
     * playing a 4:3 video.
     * </pre>
     *
     * <code>CROPPED = 3;</code>
     */
    CROPPED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified image fill.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Fill the gaps between the image and the image container with gray bars.
     * </pre>
     *
     * <code>GRAY = 1;</code>
     */
    public static final int GRAY_VALUE = 1;
    /**
     * <pre>
     * Fill the gaps between the image and the image container with white bars.
     * </pre>
     *
     * <code>WHITE = 2;</code>
     */
    public static final int WHITE_VALUE = 2;
    /**
     * <pre>
     * Image is scaled such that the image width and height match or exceed the
     * container dimensions. This may crop the top and bottom of the image if
     * the scaled image height is greater than the container height, or crop the
     * left and right of the image if the scaled image width is greater than the
     * container width. This is similar to "Zoom Mode" on a widescreen TV when
     * playing a 4:3 video.
     * </pre>
     *
     * <code>CROPPED = 3;</code>
     */
    public static final int CROPPED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ImageFill valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ImageFill forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return GRAY;
        case 2: return WHITE;
        case 3: return CROPPED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ImageFill>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ImageFill> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImageFill>() {
            public ImageFill findValueByNumber(int number) {
              return ImageFill.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.conversation.Image.getDescriptor().getEnumTypes().get(0);
    }

    private static final ImageFill[] VALUES = values();

    public static ImageFill valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ImageFill(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.actions.sdk.v2.conversation.Image.ImageFill)
  }

  public static final int URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * The source url of the image. Images can be JPG, PNG and GIF (animated and
   * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The source url of the image. Images can be JPG, PNG and GIF (animated and
   * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alt_ = "";
  /**
   * <pre>
   * A text description of the image to be used for accessibility, e.g. screen
   * readers.
   * Required.
   * </pre>
   *
   * <code>string alt = 2;</code>
   * @return The alt.
   */
  @java.lang.Override
  public java.lang.String getAlt() {
    java.lang.Object ref = alt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alt_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A text description of the image to be used for accessibility, e.g. screen
   * readers.
   * Required.
   * </pre>
   *
   * <code>string alt = 2;</code>
   * @return The bytes for alt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAltBytes() {
    java.lang.Object ref = alt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private int height_ = 0;
  /**
   * <pre>
   * The height of the image in pixels.
   * Optional.
   * </pre>
   *
   * <code>int32 height = 3;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int WIDTH_FIELD_NUMBER = 4;
  private int width_ = 0;
  /**
   * <pre>
   * The width of the image in pixels.
   * Optional.
   * </pre>
   *
   * <code>int32 width = 4;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alt_);
    }
    if (height_ != 0) {
      output.writeInt32(3, height_);
    }
    if (width_ != 0) {
      output.writeInt32(4, width_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alt_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, height_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, width_);
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
    if (!(obj instanceof com.google.actions.sdk.v2.conversation.Image)) {
      return super.equals(obj);
    }
    com.google.actions.sdk.v2.conversation.Image other = (com.google.actions.sdk.v2.conversation.Image) obj;

    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getAlt()
        .equals(other.getAlt())) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getWidth()
        != other.getWidth()) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + ALT_FIELD_NUMBER;
    hash = (53 * hash) + getAlt().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.conversation.Image parseFrom(
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
  public static Builder newBuilder(com.google.actions.sdk.v2.conversation.Image prototype) {
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
   * An image displayed in the card.
   * </pre>
   *
   * Protobuf type {@code google.actions.sdk.v2.conversation.Image}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.sdk.v2.conversation.Image)
      com.google.actions.sdk.v2.conversation.ImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.conversation.ImageProto.internal_static_google_actions_sdk_v2_conversation_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.sdk.v2.conversation.ImageProto.internal_static_google_actions_sdk_v2_conversation_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.sdk.v2.conversation.Image.class, com.google.actions.sdk.v2.conversation.Image.Builder.class);
    }

    // Construct using com.google.actions.sdk.v2.conversation.Image.newBuilder()
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
      url_ = "";
      alt_ = "";
      height_ = 0;
      width_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.sdk.v2.conversation.ImageProto.internal_static_google_actions_sdk_v2_conversation_Image_descriptor;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.conversation.Image getDefaultInstanceForType() {
      return com.google.actions.sdk.v2.conversation.Image.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.conversation.Image build() {
      com.google.actions.sdk.v2.conversation.Image result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.conversation.Image buildPartial() {
      com.google.actions.sdk.v2.conversation.Image result = new com.google.actions.sdk.v2.conversation.Image(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.actions.sdk.v2.conversation.Image result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.alt_ = alt_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.width_ = width_;
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
      if (other instanceof com.google.actions.sdk.v2.conversation.Image) {
        return mergeFrom((com.google.actions.sdk.v2.conversation.Image)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.sdk.v2.conversation.Image other) {
      if (other == com.google.actions.sdk.v2.conversation.Image.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAlt().isEmpty()) {
        alt_ = other.alt_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
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
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              alt_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              height_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              width_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * The source url of the image. Images can be JPG, PNG and GIF (animated and
     * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The source url of the image. Images can be JPG, PNG and GIF (animated and
     * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The source url of the image. Images can be JPG, PNG and GIF (animated and
     * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source url of the image. Images can be JPG, PNG and GIF (animated and
     * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source url of the image. Images can be JPG, PNG and GIF (animated and
     * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object alt_ = "";
    /**
     * <pre>
     * A text description of the image to be used for accessibility, e.g. screen
     * readers.
     * Required.
     * </pre>
     *
     * <code>string alt = 2;</code>
     * @return The alt.
     */
    public java.lang.String getAlt() {
      java.lang.Object ref = alt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A text description of the image to be used for accessibility, e.g. screen
     * readers.
     * Required.
     * </pre>
     *
     * <code>string alt = 2;</code>
     * @return The bytes for alt.
     */
    public com.google.protobuf.ByteString
        getAltBytes() {
      java.lang.Object ref = alt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A text description of the image to be used for accessibility, e.g. screen
     * readers.
     * Required.
     * </pre>
     *
     * <code>string alt = 2;</code>
     * @param value The alt to set.
     * @return This builder for chaining.
     */
    public Builder setAlt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alt_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A text description of the image to be used for accessibility, e.g. screen
     * readers.
     * Required.
     * </pre>
     *
     * <code>string alt = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlt() {
      alt_ = getDefaultInstance().getAlt();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A text description of the image to be used for accessibility, e.g. screen
     * readers.
     * Required.
     * </pre>
     *
     * <code>string alt = 2;</code>
     * @param value The bytes for alt to set.
     * @return This builder for chaining.
     */
    public Builder setAltBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alt_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     * The height of the image in pixels.
     * Optional.
     * </pre>
     *
     * <code>int32 height = 3;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     * The height of the image in pixels.
     * Optional.
     * </pre>
     *
     * <code>int32 height = 3;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The height of the image in pixels.
     * Optional.
     * </pre>
     *
     * <code>int32 height = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      height_ = 0;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <pre>
     * The width of the image in pixels.
     * Optional.
     * </pre>
     *
     * <code>int32 width = 4;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     * The width of the image in pixels.
     * Optional.
     * </pre>
     *
     * <code>int32 width = 4;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The width of the image in pixels.
     * Optional.
     * </pre>
     *
     * <code>int32 width = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000008);
      width_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.actions.sdk.v2.conversation.Image)
  }

  // @@protoc_insertion_point(class_scope:google.actions.sdk.v2.conversation.Image)
  private static final com.google.actions.sdk.v2.conversation.Image DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.sdk.v2.conversation.Image();
  }

  public static com.google.actions.sdk.v2.conversation.Image getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Image>
      PARSER = new com.google.protobuf.AbstractParser<Image>() {
    @java.lang.Override
    public Image parsePartialFrom(
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

  public static com.google.protobuf.Parser<Image> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Image> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.sdk.v2.conversation.Image getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

