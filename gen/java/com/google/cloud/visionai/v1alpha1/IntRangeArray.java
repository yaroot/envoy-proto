// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/warehouse.proto

package com.google.cloud.visionai.v1alpha1;

/**
 * <pre>
 * A list of integer range values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1alpha1.IntRangeArray}
 */
public final class IntRangeArray extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1alpha1.IntRangeArray)
    IntRangeArrayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntRangeArray.newBuilder() to construct.
  private IntRangeArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntRangeArray() {
    intRanges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntRangeArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.visionai.v1alpha1.WarehouseProto.internal_static_google_cloud_visionai_v1alpha1_IntRangeArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1alpha1.WarehouseProto.internal_static_google_cloud_visionai_v1alpha1_IntRangeArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1alpha1.IntRangeArray.class, com.google.cloud.visionai.v1alpha1.IntRangeArray.Builder.class);
  }

  public static final int INT_RANGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.visionai.v1alpha1.IntRange> intRanges_;
  /**
   * <pre>
   * Int range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.visionai.v1alpha1.IntRange> getIntRangesList() {
    return intRanges_;
  }
  /**
   * <pre>
   * Int range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder> 
      getIntRangesOrBuilderList() {
    return intRanges_;
  }
  /**
   * <pre>
   * Int range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
   */
  @java.lang.Override
  public int getIntRangesCount() {
    return intRanges_.size();
  }
  /**
   * <pre>
   * Int range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1alpha1.IntRange getIntRanges(int index) {
    return intRanges_.get(index);
  }
  /**
   * <pre>
   * Int range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder getIntRangesOrBuilder(
      int index) {
    return intRanges_.get(index);
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
    for (int i = 0; i < intRanges_.size(); i++) {
      output.writeMessage(1, intRanges_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < intRanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, intRanges_.get(i));
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
    if (!(obj instanceof com.google.cloud.visionai.v1alpha1.IntRangeArray)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1alpha1.IntRangeArray other = (com.google.cloud.visionai.v1alpha1.IntRangeArray) obj;

    if (!getIntRangesList()
        .equals(other.getIntRangesList())) return false;
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
    if (getIntRangesCount() > 0) {
      hash = (37 * hash) + INT_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getIntRangesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1alpha1.IntRangeArray parseFrom(
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
  public static Builder newBuilder(com.google.cloud.visionai.v1alpha1.IntRangeArray prototype) {
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
   * A list of integer range values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1alpha1.IntRangeArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1alpha1.IntRangeArray)
      com.google.cloud.visionai.v1alpha1.IntRangeArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.visionai.v1alpha1.WarehouseProto.internal_static_google_cloud_visionai_v1alpha1_IntRangeArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1alpha1.WarehouseProto.internal_static_google_cloud_visionai_v1alpha1_IntRangeArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1alpha1.IntRangeArray.class, com.google.cloud.visionai.v1alpha1.IntRangeArray.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1alpha1.IntRangeArray.newBuilder()
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
      if (intRangesBuilder_ == null) {
        intRanges_ = java.util.Collections.emptyList();
      } else {
        intRanges_ = null;
        intRangesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.visionai.v1alpha1.WarehouseProto.internal_static_google_cloud_visionai_v1alpha1_IntRangeArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1alpha1.IntRangeArray getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1alpha1.IntRangeArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1alpha1.IntRangeArray build() {
      com.google.cloud.visionai.v1alpha1.IntRangeArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1alpha1.IntRangeArray buildPartial() {
      com.google.cloud.visionai.v1alpha1.IntRangeArray result = new com.google.cloud.visionai.v1alpha1.IntRangeArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.visionai.v1alpha1.IntRangeArray result) {
      if (intRangesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          intRanges_ = java.util.Collections.unmodifiableList(intRanges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.intRanges_ = intRanges_;
      } else {
        result.intRanges_ = intRangesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.visionai.v1alpha1.IntRangeArray result) {
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
      if (other instanceof com.google.cloud.visionai.v1alpha1.IntRangeArray) {
        return mergeFrom((com.google.cloud.visionai.v1alpha1.IntRangeArray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1alpha1.IntRangeArray other) {
      if (other == com.google.cloud.visionai.v1alpha1.IntRangeArray.getDefaultInstance()) return this;
      if (intRangesBuilder_ == null) {
        if (!other.intRanges_.isEmpty()) {
          if (intRanges_.isEmpty()) {
            intRanges_ = other.intRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIntRangesIsMutable();
            intRanges_.addAll(other.intRanges_);
          }
          onChanged();
        }
      } else {
        if (!other.intRanges_.isEmpty()) {
          if (intRangesBuilder_.isEmpty()) {
            intRangesBuilder_.dispose();
            intRangesBuilder_ = null;
            intRanges_ = other.intRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            intRangesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIntRangesFieldBuilder() : null;
          } else {
            intRangesBuilder_.addAllMessages(other.intRanges_);
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
              com.google.cloud.visionai.v1alpha1.IntRange m =
                  input.readMessage(
                      com.google.cloud.visionai.v1alpha1.IntRange.parser(),
                      extensionRegistry);
              if (intRangesBuilder_ == null) {
                ensureIntRangesIsMutable();
                intRanges_.add(m);
              } else {
                intRangesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.visionai.v1alpha1.IntRange> intRanges_ =
      java.util.Collections.emptyList();
    private void ensureIntRangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        intRanges_ = new java.util.ArrayList<com.google.cloud.visionai.v1alpha1.IntRange>(intRanges_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.visionai.v1alpha1.IntRange, com.google.cloud.visionai.v1alpha1.IntRange.Builder, com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder> intRangesBuilder_;

    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1alpha1.IntRange> getIntRangesList() {
      if (intRangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(intRanges_);
      } else {
        return intRangesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public int getIntRangesCount() {
      if (intRangesBuilder_ == null) {
        return intRanges_.size();
      } else {
        return intRangesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.IntRange getIntRanges(int index) {
      if (intRangesBuilder_ == null) {
        return intRanges_.get(index);
      } else {
        return intRangesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder setIntRanges(
        int index, com.google.cloud.visionai.v1alpha1.IntRange value) {
      if (intRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntRangesIsMutable();
        intRanges_.set(index, value);
        onChanged();
      } else {
        intRangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder setIntRanges(
        int index, com.google.cloud.visionai.v1alpha1.IntRange.Builder builderForValue) {
      if (intRangesBuilder_ == null) {
        ensureIntRangesIsMutable();
        intRanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        intRangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder addIntRanges(com.google.cloud.visionai.v1alpha1.IntRange value) {
      if (intRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntRangesIsMutable();
        intRanges_.add(value);
        onChanged();
      } else {
        intRangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder addIntRanges(
        int index, com.google.cloud.visionai.v1alpha1.IntRange value) {
      if (intRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntRangesIsMutable();
        intRanges_.add(index, value);
        onChanged();
      } else {
        intRangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder addIntRanges(
        com.google.cloud.visionai.v1alpha1.IntRange.Builder builderForValue) {
      if (intRangesBuilder_ == null) {
        ensureIntRangesIsMutable();
        intRanges_.add(builderForValue.build());
        onChanged();
      } else {
        intRangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder addIntRanges(
        int index, com.google.cloud.visionai.v1alpha1.IntRange.Builder builderForValue) {
      if (intRangesBuilder_ == null) {
        ensureIntRangesIsMutable();
        intRanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        intRangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder addAllIntRanges(
        java.lang.Iterable<? extends com.google.cloud.visionai.v1alpha1.IntRange> values) {
      if (intRangesBuilder_ == null) {
        ensureIntRangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, intRanges_);
        onChanged();
      } else {
        intRangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder clearIntRanges() {
      if (intRangesBuilder_ == null) {
        intRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        intRangesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public Builder removeIntRanges(int index) {
      if (intRangesBuilder_ == null) {
        ensureIntRangesIsMutable();
        intRanges_.remove(index);
        onChanged();
      } else {
        intRangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.IntRange.Builder getIntRangesBuilder(
        int index) {
      return getIntRangesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder getIntRangesOrBuilder(
        int index) {
      if (intRangesBuilder_ == null) {
        return intRanges_.get(index);  } else {
        return intRangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder> 
         getIntRangesOrBuilderList() {
      if (intRangesBuilder_ != null) {
        return intRangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(intRanges_);
      }
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.IntRange.Builder addIntRangesBuilder() {
      return getIntRangesFieldBuilder().addBuilder(
          com.google.cloud.visionai.v1alpha1.IntRange.getDefaultInstance());
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1alpha1.IntRange.Builder addIntRangesBuilder(
        int index) {
      return getIntRangesFieldBuilder().addBuilder(
          index, com.google.cloud.visionai.v1alpha1.IntRange.getDefaultInstance());
    }
    /**
     * <pre>
     * Int range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1alpha1.IntRange int_ranges = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1alpha1.IntRange.Builder> 
         getIntRangesBuilderList() {
      return getIntRangesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.visionai.v1alpha1.IntRange, com.google.cloud.visionai.v1alpha1.IntRange.Builder, com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder> 
        getIntRangesFieldBuilder() {
      if (intRangesBuilder_ == null) {
        intRangesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1alpha1.IntRange, com.google.cloud.visionai.v1alpha1.IntRange.Builder, com.google.cloud.visionai.v1alpha1.IntRangeOrBuilder>(
                intRanges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        intRanges_ = null;
      }
      return intRangesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1alpha1.IntRangeArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1alpha1.IntRangeArray)
  private static final com.google.cloud.visionai.v1alpha1.IntRangeArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1alpha1.IntRangeArray();
  }

  public static com.google.cloud.visionai.v1alpha1.IntRangeArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntRangeArray>
      PARSER = new com.google.protobuf.AbstractParser<IntRangeArray>() {
    @java.lang.Override
    public IntRangeArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntRangeArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntRangeArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1alpha1.IntRangeArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
