// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/annotations.proto

package com.google.cloud.visionai.v1alpha1;

/**
 * <pre>
 * A wrapper of repeated StreamAnnotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1alpha1.StreamAnnotations}
 */
public final class StreamAnnotations extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1alpha1.StreamAnnotations)
    StreamAnnotationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamAnnotations.newBuilder() to construct.
  private StreamAnnotations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamAnnotations() {
    streamAnnotations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamAnnotations();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.visionai.v1alpha1.AnnotationsProto.internal_static_google_cloud_visionai_v1alpha1_StreamAnnotations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1alpha1.AnnotationsProto.internal_static_google_cloud_visionai_v1alpha1_StreamAnnotations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1alpha1.StreamAnnotations.class, com.google.cloud.visionai.v1alpha1.StreamAnnotations.Builder.class);
  }

  public static final int STREAM_ANNOTATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.visionai.v1alpha1.StreamAnnotation> streamAnnotations_;
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.visionai.v1alpha1.StreamAnnotation> getStreamAnnotationsList() {
    return streamAnnotations_;
  }
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder> 
      getStreamAnnotationsOrBuilderList() {
    return streamAnnotations_;
  }
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
   */
  @java.lang.Override
  public int getStreamAnnotationsCount() {
    return streamAnnotations_.size();
  }
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1alpha1.StreamAnnotation getStreamAnnotations(int index) {
    return streamAnnotations_.get(index);
  }
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder getStreamAnnotationsOrBuilder(
      int index) {
    return streamAnnotations_.get(index);
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
    for (int i = 0; i < streamAnnotations_.size(); i++) {
      output.writeMessage(1, streamAnnotations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < streamAnnotations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, streamAnnotations_.get(i));
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
    if (!(obj instanceof com.google.cloud.visionai.v1alpha1.StreamAnnotations)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1alpha1.StreamAnnotations other = (com.google.cloud.visionai.v1alpha1.StreamAnnotations) obj;

    if (!getStreamAnnotationsList()
        .equals(other.getStreamAnnotationsList())) return false;
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
    if (getStreamAnnotationsCount() > 0) {
      hash = (37 * hash) + STREAM_ANNOTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getStreamAnnotationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations parseFrom(
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
  public static Builder newBuilder(com.google.cloud.visionai.v1alpha1.StreamAnnotations prototype) {
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
   * A wrapper of repeated StreamAnnotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1alpha1.StreamAnnotations}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1alpha1.StreamAnnotations)
      com.google.cloud.visionai.v1alpha1.StreamAnnotationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.visionai.v1alpha1.AnnotationsProto.internal_static_google_cloud_visionai_v1alpha1_StreamAnnotations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1alpha1.AnnotationsProto.internal_static_google_cloud_visionai_v1alpha1_StreamAnnotations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1alpha1.StreamAnnotations.class, com.google.cloud.visionai.v1alpha1.StreamAnnotations.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1alpha1.StreamAnnotations.newBuilder()
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
      if (streamAnnotationsBuilder_ == null) {
        streamAnnotations_ = java.util.Collections.emptyList();
      } else {
        streamAnnotations_ = null;
        streamAnnotationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.visionai.v1alpha1.AnnotationsProto.internal_static_google_cloud_visionai_v1alpha1_StreamAnnotations_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1alpha1.StreamAnnotations getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1alpha1.StreamAnnotations.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1alpha1.StreamAnnotations build() {
      com.google.cloud.visionai.v1alpha1.StreamAnnotations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1alpha1.StreamAnnotations buildPartial() {
      com.google.cloud.visionai.v1alpha1.StreamAnnotations result = new com.google.cloud.visionai.v1alpha1.StreamAnnotations(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.visionai.v1alpha1.StreamAnnotations result) {
      if (streamAnnotationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          streamAnnotations_ = java.util.Collections.unmodifiableList(streamAnnotations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.streamAnnotations_ = streamAnnotations_;
      } else {
        result.streamAnnotations_ = streamAnnotationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.visionai.v1alpha1.StreamAnnotations result) {
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
      if (other instanceof com.google.cloud.visionai.v1alpha1.StreamAnnotations) {
        return mergeFrom((com.google.cloud.visionai.v1alpha1.StreamAnnotations)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1alpha1.StreamAnnotations other) {
      if (other == com.google.cloud.visionai.v1alpha1.StreamAnnotations.getDefaultInstance()) return this;
      if (streamAnnotationsBuilder_ == null) {
        if (!other.streamAnnotations_.isEmpty()) {
          if (streamAnnotations_.isEmpty()) {
            streamAnnotations_ = other.streamAnnotations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStreamAnnotationsIsMutable();
            streamAnnotations_.addAll(other.streamAnnotations_);
          }
          onChanged();
        }
      } else {
        if (!other.streamAnnotations_.isEmpty()) {
          if (streamAnnotationsBuilder_.isEmpty()) {
            streamAnnotationsBuilder_.dispose();
            streamAnnotationsBuilder_ = null;
            streamAnnotations_ = other.streamAnnotations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            streamAnnotationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStreamAnnotationsFieldBuilder() : null;
          } else {
            streamAnnotationsBuilder_.addAllMessages(other.streamAnnotations_);
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
              com.google.cloud.visionai.v1alpha1.StreamAnnotation m =
                  input.readMessage(
                      com.google.cloud.visionai.v1alpha1.StreamAnnotation.parser(),
                      extensionRegistry);
              if (streamAnnotationsBuilder_ == null) {
                ensureStreamAnnotationsIsMutable();
                streamAnnotations_.add(m);
              } else {
                streamAnnotationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.visionai.v1alpha1.StreamAnnotation> streamAnnotations_ =
      java.util.Collections.emptyList();
    private void ensureStreamAnnotationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        streamAnnotations_ = new java.util.ArrayList<com.google.cloud.visionai.v1alpha1.StreamAnnotation>(streamAnnotations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.visionai.v1alpha1.StreamAnnotation, com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder, com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder> streamAnnotationsBuilder_;

    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1alpha1.StreamAnnotation> getStreamAnnotationsList() {
      if (streamAnnotationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(streamAnnotations_);
      } else {
        return streamAnnotationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public int getStreamAnnotationsCount() {
      if (streamAnnotationsBuilder_ == null) {
        return streamAnnotations_.size();
      } else {
        return streamAnnotationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.StreamAnnotation getStreamAnnotations(int index) {
      if (streamAnnotationsBuilder_ == null) {
        return streamAnnotations_.get(index);
      } else {
        return streamAnnotationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder setStreamAnnotations(
        int index, com.google.cloud.visionai.v1alpha1.StreamAnnotation value) {
      if (streamAnnotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.set(index, value);
        onChanged();
      } else {
        streamAnnotationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder setStreamAnnotations(
        int index, com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder builderForValue) {
      if (streamAnnotationsBuilder_ == null) {
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.set(index, builderForValue.build());
        onChanged();
      } else {
        streamAnnotationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder addStreamAnnotations(com.google.cloud.visionai.v1alpha1.StreamAnnotation value) {
      if (streamAnnotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.add(value);
        onChanged();
      } else {
        streamAnnotationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder addStreamAnnotations(
        int index, com.google.cloud.visionai.v1alpha1.StreamAnnotation value) {
      if (streamAnnotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.add(index, value);
        onChanged();
      } else {
        streamAnnotationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder addStreamAnnotations(
        com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder builderForValue) {
      if (streamAnnotationsBuilder_ == null) {
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.add(builderForValue.build());
        onChanged();
      } else {
        streamAnnotationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder addStreamAnnotations(
        int index, com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder builderForValue) {
      if (streamAnnotationsBuilder_ == null) {
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.add(index, builderForValue.build());
        onChanged();
      } else {
        streamAnnotationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder addAllStreamAnnotations(
        java.lang.Iterable<? extends com.google.cloud.visionai.v1alpha1.StreamAnnotation> values) {
      if (streamAnnotationsBuilder_ == null) {
        ensureStreamAnnotationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, streamAnnotations_);
        onChanged();
      } else {
        streamAnnotationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder clearStreamAnnotations() {
      if (streamAnnotationsBuilder_ == null) {
        streamAnnotations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        streamAnnotationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public Builder removeStreamAnnotations(int index) {
      if (streamAnnotationsBuilder_ == null) {
        ensureStreamAnnotationsIsMutable();
        streamAnnotations_.remove(index);
        onChanged();
      } else {
        streamAnnotationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder getStreamAnnotationsBuilder(
        int index) {
      return getStreamAnnotationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder getStreamAnnotationsOrBuilder(
        int index) {
      if (streamAnnotationsBuilder_ == null) {
        return streamAnnotations_.get(index);  } else {
        return streamAnnotationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder> 
         getStreamAnnotationsOrBuilderList() {
      if (streamAnnotationsBuilder_ != null) {
        return streamAnnotationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(streamAnnotations_);
      }
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder addStreamAnnotationsBuilder() {
      return getStreamAnnotationsFieldBuilder().addBuilder(
          com.google.cloud.visionai.v1alpha1.StreamAnnotation.getDefaultInstance());
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder addStreamAnnotationsBuilder(
        int index) {
      return getStreamAnnotationsFieldBuilder().addBuilder(
          index, com.google.cloud.visionai.v1alpha1.StreamAnnotation.getDefaultInstance());
    }
    /**
     * <pre>
     * Multiple annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.StreamAnnotation stream_annotations = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder> 
         getStreamAnnotationsBuilderList() {
      return getStreamAnnotationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.visionai.v1alpha1.StreamAnnotation, com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder, com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder> 
        getStreamAnnotationsFieldBuilder() {
      if (streamAnnotationsBuilder_ == null) {
        streamAnnotationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1alpha1.StreamAnnotation, com.google.cloud.visionai.v1alpha1.StreamAnnotation.Builder, com.google.cloud.visionai.v1alpha1.StreamAnnotationOrBuilder>(
                streamAnnotations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        streamAnnotations_ = null;
      }
      return streamAnnotationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1alpha1.StreamAnnotations)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1alpha1.StreamAnnotations)
  private static final com.google.cloud.visionai.v1alpha1.StreamAnnotations DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1alpha1.StreamAnnotations();
  }

  public static com.google.cloud.visionai.v1alpha1.StreamAnnotations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamAnnotations>
      PARSER = new com.google.protobuf.AbstractParser<StreamAnnotations>() {
    @java.lang.Override
    public StreamAnnotations parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamAnnotations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamAnnotations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1alpha1.StreamAnnotations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
