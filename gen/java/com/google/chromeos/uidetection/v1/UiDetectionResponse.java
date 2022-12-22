// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/uidetection/v1/ui_detection.proto

package com.google.chromeos.uidetection.v1;

/**
 * <pre>
 * Response message for UI detection.
 * </pre>
 *
 * Protobuf type {@code google.chromeos.uidetection.v1.UiDetectionResponse}
 */
public final class UiDetectionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.chromeos.uidetection.v1.UiDetectionResponse)
    UiDetectionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UiDetectionResponse.newBuilder() to construct.
  private UiDetectionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UiDetectionResponse() {
    boundingBoxes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UiDetectionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_UiDetectionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_UiDetectionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chromeos.uidetection.v1.UiDetectionResponse.class, com.google.chromeos.uidetection.v1.UiDetectionResponse.Builder.class);
  }

  public static final int BOUNDING_BOXES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.chromeos.uidetection.v1.BoundingBox> boundingBoxes_;
  /**
   * <pre>
   * Locations of matching UI elements.
   * </pre>
   *
   * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.chromeos.uidetection.v1.BoundingBox> getBoundingBoxesList() {
    return boundingBoxes_;
  }
  /**
   * <pre>
   * Locations of matching UI elements.
   * </pre>
   *
   * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder> 
      getBoundingBoxesOrBuilderList() {
    return boundingBoxes_;
  }
  /**
   * <pre>
   * Locations of matching UI elements.
   * </pre>
   *
   * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
   */
  @java.lang.Override
  public int getBoundingBoxesCount() {
    return boundingBoxes_.size();
  }
  /**
   * <pre>
   * Locations of matching UI elements.
   * </pre>
   *
   * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
   */
  @java.lang.Override
  public com.google.chromeos.uidetection.v1.BoundingBox getBoundingBoxes(int index) {
    return boundingBoxes_.get(index);
  }
  /**
   * <pre>
   * Locations of matching UI elements.
   * </pre>
   *
   * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
   */
  @java.lang.Override
  public com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder getBoundingBoxesOrBuilder(
      int index) {
    return boundingBoxes_.get(index);
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
    for (int i = 0; i < boundingBoxes_.size(); i++) {
      output.writeMessage(1, boundingBoxes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < boundingBoxes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, boundingBoxes_.get(i));
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
    if (!(obj instanceof com.google.chromeos.uidetection.v1.UiDetectionResponse)) {
      return super.equals(obj);
    }
    com.google.chromeos.uidetection.v1.UiDetectionResponse other = (com.google.chromeos.uidetection.v1.UiDetectionResponse) obj;

    if (!getBoundingBoxesList()
        .equals(other.getBoundingBoxesList())) return false;
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
    if (getBoundingBoxesCount() > 0) {
      hash = (37 * hash) + BOUNDING_BOXES_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBoxesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.UiDetectionResponse parseFrom(
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
  public static Builder newBuilder(com.google.chromeos.uidetection.v1.UiDetectionResponse prototype) {
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
   * Response message for UI detection.
   * </pre>
   *
   * Protobuf type {@code google.chromeos.uidetection.v1.UiDetectionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.chromeos.uidetection.v1.UiDetectionResponse)
      com.google.chromeos.uidetection.v1.UiDetectionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_UiDetectionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_UiDetectionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chromeos.uidetection.v1.UiDetectionResponse.class, com.google.chromeos.uidetection.v1.UiDetectionResponse.Builder.class);
    }

    // Construct using com.google.chromeos.uidetection.v1.UiDetectionResponse.newBuilder()
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
      if (boundingBoxesBuilder_ == null) {
        boundingBoxes_ = java.util.Collections.emptyList();
      } else {
        boundingBoxes_ = null;
        boundingBoxesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_UiDetectionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.UiDetectionResponse getDefaultInstanceForType() {
      return com.google.chromeos.uidetection.v1.UiDetectionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.UiDetectionResponse build() {
      com.google.chromeos.uidetection.v1.UiDetectionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.UiDetectionResponse buildPartial() {
      com.google.chromeos.uidetection.v1.UiDetectionResponse result = new com.google.chromeos.uidetection.v1.UiDetectionResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.chromeos.uidetection.v1.UiDetectionResponse result) {
      if (boundingBoxesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          boundingBoxes_ = java.util.Collections.unmodifiableList(boundingBoxes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.boundingBoxes_ = boundingBoxes_;
      } else {
        result.boundingBoxes_ = boundingBoxesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.chromeos.uidetection.v1.UiDetectionResponse result) {
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
      if (other instanceof com.google.chromeos.uidetection.v1.UiDetectionResponse) {
        return mergeFrom((com.google.chromeos.uidetection.v1.UiDetectionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chromeos.uidetection.v1.UiDetectionResponse other) {
      if (other == com.google.chromeos.uidetection.v1.UiDetectionResponse.getDefaultInstance()) return this;
      if (boundingBoxesBuilder_ == null) {
        if (!other.boundingBoxes_.isEmpty()) {
          if (boundingBoxes_.isEmpty()) {
            boundingBoxes_ = other.boundingBoxes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBoundingBoxesIsMutable();
            boundingBoxes_.addAll(other.boundingBoxes_);
          }
          onChanged();
        }
      } else {
        if (!other.boundingBoxes_.isEmpty()) {
          if (boundingBoxesBuilder_.isEmpty()) {
            boundingBoxesBuilder_.dispose();
            boundingBoxesBuilder_ = null;
            boundingBoxes_ = other.boundingBoxes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            boundingBoxesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBoundingBoxesFieldBuilder() : null;
          } else {
            boundingBoxesBuilder_.addAllMessages(other.boundingBoxes_);
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
              com.google.chromeos.uidetection.v1.BoundingBox m =
                  input.readMessage(
                      com.google.chromeos.uidetection.v1.BoundingBox.parser(),
                      extensionRegistry);
              if (boundingBoxesBuilder_ == null) {
                ensureBoundingBoxesIsMutable();
                boundingBoxes_.add(m);
              } else {
                boundingBoxesBuilder_.addMessage(m);
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

    private java.util.List<com.google.chromeos.uidetection.v1.BoundingBox> boundingBoxes_ =
      java.util.Collections.emptyList();
    private void ensureBoundingBoxesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        boundingBoxes_ = new java.util.ArrayList<com.google.chromeos.uidetection.v1.BoundingBox>(boundingBoxes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.chromeos.uidetection.v1.BoundingBox, com.google.chromeos.uidetection.v1.BoundingBox.Builder, com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder> boundingBoxesBuilder_;

    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public java.util.List<com.google.chromeos.uidetection.v1.BoundingBox> getBoundingBoxesList() {
      if (boundingBoxesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(boundingBoxes_);
      } else {
        return boundingBoxesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public int getBoundingBoxesCount() {
      if (boundingBoxesBuilder_ == null) {
        return boundingBoxes_.size();
      } else {
        return boundingBoxesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public com.google.chromeos.uidetection.v1.BoundingBox getBoundingBoxes(int index) {
      if (boundingBoxesBuilder_ == null) {
        return boundingBoxes_.get(index);
      } else {
        return boundingBoxesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder setBoundingBoxes(
        int index, com.google.chromeos.uidetection.v1.BoundingBox value) {
      if (boundingBoxesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.set(index, value);
        onChanged();
      } else {
        boundingBoxesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder setBoundingBoxes(
        int index, com.google.chromeos.uidetection.v1.BoundingBox.Builder builderForValue) {
      if (boundingBoxesBuilder_ == null) {
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.set(index, builderForValue.build());
        onChanged();
      } else {
        boundingBoxesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder addBoundingBoxes(com.google.chromeos.uidetection.v1.BoundingBox value) {
      if (boundingBoxesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.add(value);
        onChanged();
      } else {
        boundingBoxesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder addBoundingBoxes(
        int index, com.google.chromeos.uidetection.v1.BoundingBox value) {
      if (boundingBoxesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.add(index, value);
        onChanged();
      } else {
        boundingBoxesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder addBoundingBoxes(
        com.google.chromeos.uidetection.v1.BoundingBox.Builder builderForValue) {
      if (boundingBoxesBuilder_ == null) {
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.add(builderForValue.build());
        onChanged();
      } else {
        boundingBoxesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder addBoundingBoxes(
        int index, com.google.chromeos.uidetection.v1.BoundingBox.Builder builderForValue) {
      if (boundingBoxesBuilder_ == null) {
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.add(index, builderForValue.build());
        onChanged();
      } else {
        boundingBoxesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder addAllBoundingBoxes(
        java.lang.Iterable<? extends com.google.chromeos.uidetection.v1.BoundingBox> values) {
      if (boundingBoxesBuilder_ == null) {
        ensureBoundingBoxesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, boundingBoxes_);
        onChanged();
      } else {
        boundingBoxesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder clearBoundingBoxes() {
      if (boundingBoxesBuilder_ == null) {
        boundingBoxes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        boundingBoxesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public Builder removeBoundingBoxes(int index) {
      if (boundingBoxesBuilder_ == null) {
        ensureBoundingBoxesIsMutable();
        boundingBoxes_.remove(index);
        onChanged();
      } else {
        boundingBoxesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public com.google.chromeos.uidetection.v1.BoundingBox.Builder getBoundingBoxesBuilder(
        int index) {
      return getBoundingBoxesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder getBoundingBoxesOrBuilder(
        int index) {
      if (boundingBoxesBuilder_ == null) {
        return boundingBoxes_.get(index);  } else {
        return boundingBoxesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public java.util.List<? extends com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder> 
         getBoundingBoxesOrBuilderList() {
      if (boundingBoxesBuilder_ != null) {
        return boundingBoxesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(boundingBoxes_);
      }
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public com.google.chromeos.uidetection.v1.BoundingBox.Builder addBoundingBoxesBuilder() {
      return getBoundingBoxesFieldBuilder().addBuilder(
          com.google.chromeos.uidetection.v1.BoundingBox.getDefaultInstance());
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public com.google.chromeos.uidetection.v1.BoundingBox.Builder addBoundingBoxesBuilder(
        int index) {
      return getBoundingBoxesFieldBuilder().addBuilder(
          index, com.google.chromeos.uidetection.v1.BoundingBox.getDefaultInstance());
    }
    /**
     * <pre>
     * Locations of matching UI elements.
     * </pre>
     *
     * <code>repeated .google.chromeos.uidetection.v1.BoundingBox bounding_boxes = 1;</code>
     */
    public java.util.List<com.google.chromeos.uidetection.v1.BoundingBox.Builder> 
         getBoundingBoxesBuilderList() {
      return getBoundingBoxesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.chromeos.uidetection.v1.BoundingBox, com.google.chromeos.uidetection.v1.BoundingBox.Builder, com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder> 
        getBoundingBoxesFieldBuilder() {
      if (boundingBoxesBuilder_ == null) {
        boundingBoxesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.chromeos.uidetection.v1.BoundingBox, com.google.chromeos.uidetection.v1.BoundingBox.Builder, com.google.chromeos.uidetection.v1.BoundingBoxOrBuilder>(
                boundingBoxes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        boundingBoxes_ = null;
      }
      return boundingBoxesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.chromeos.uidetection.v1.UiDetectionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.chromeos.uidetection.v1.UiDetectionResponse)
  private static final com.google.chromeos.uidetection.v1.UiDetectionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.chromeos.uidetection.v1.UiDetectionResponse();
  }

  public static com.google.chromeos.uidetection.v1.UiDetectionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UiDetectionResponse>
      PARSER = new com.google.protobuf.AbstractParser<UiDetectionResponse>() {
    @java.lang.Override
    public UiDetectionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UiDetectionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UiDetectionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chromeos.uidetection.v1.UiDetectionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
