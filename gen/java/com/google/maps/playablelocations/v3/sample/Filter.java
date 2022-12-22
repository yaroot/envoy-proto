// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/playablelocations/v3/sample/resources.proto

package com.google.maps.playablelocations.v3.sample;

/**
 * <pre>
 * Specifies the filters to use when searching for playable locations.
 * </pre>
 *
 * Protobuf type {@code google.maps.playablelocations.v3.sample.Filter}
 */
public final class Filter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.playablelocations.v3.sample.Filter)
    FilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Filter.newBuilder() to construct.
  private Filter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Filter() {
    includedTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Filter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_Filter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_Filter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.playablelocations.v3.sample.Filter.class, com.google.maps.playablelocations.v3.sample.Filter.Builder.class);
  }

  public static final int MAX_LOCATION_COUNT_FIELD_NUMBER = 1;
  private int maxLocationCount_ = 0;
  /**
   * <pre>
   * Specifies the maximum number of playable locations to return. This value
   * must not be greater than 1000. The default value is 100.
   * Only the top-ranking playable locations are returned.
   * </pre>
   *
   * <code>int32 max_location_count = 1;</code>
   * @return The maxLocationCount.
   */
  @java.lang.Override
  public int getMaxLocationCount() {
    return maxLocationCount_;
  }

  public static final int SPACING_FIELD_NUMBER = 2;
  private com.google.maps.playablelocations.v3.sample.SpacingOptions spacing_;
  /**
   * <pre>
   * A set of options that control the spacing between playable locations. By
   * default the minimum distance between locations is 200m.
   * </pre>
   *
   * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
   * @return Whether the spacing field is set.
   */
  @java.lang.Override
  public boolean hasSpacing() {
    return spacing_ != null;
  }
  /**
   * <pre>
   * A set of options that control the spacing between playable locations. By
   * default the minimum distance between locations is 200m.
   * </pre>
   *
   * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
   * @return The spacing.
   */
  @java.lang.Override
  public com.google.maps.playablelocations.v3.sample.SpacingOptions getSpacing() {
    return spacing_ == null ? com.google.maps.playablelocations.v3.sample.SpacingOptions.getDefaultInstance() : spacing_;
  }
  /**
   * <pre>
   * A set of options that control the spacing between playable locations. By
   * default the minimum distance between locations is 200m.
   * </pre>
   *
   * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
   */
  @java.lang.Override
  public com.google.maps.playablelocations.v3.sample.SpacingOptionsOrBuilder getSpacingOrBuilder() {
    return spacing_ == null ? com.google.maps.playablelocations.v3.sample.SpacingOptions.getDefaultInstance() : spacing_;
  }

  public static final int INCLUDED_TYPES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList includedTypes_;
  /**
   * <pre>
   * Restricts the set of playable locations to just the
   * [types](/maps/tt/games/types) that you want.
   * </pre>
   *
   * <code>repeated string included_types = 3;</code>
   * @return A list containing the includedTypes.
   */
  public com.google.protobuf.ProtocolStringList
      getIncludedTypesList() {
    return includedTypes_;
  }
  /**
   * <pre>
   * Restricts the set of playable locations to just the
   * [types](/maps/tt/games/types) that you want.
   * </pre>
   *
   * <code>repeated string included_types = 3;</code>
   * @return The count of includedTypes.
   */
  public int getIncludedTypesCount() {
    return includedTypes_.size();
  }
  /**
   * <pre>
   * Restricts the set of playable locations to just the
   * [types](/maps/tt/games/types) that you want.
   * </pre>
   *
   * <code>repeated string included_types = 3;</code>
   * @param index The index of the element to return.
   * @return The includedTypes at the given index.
   */
  public java.lang.String getIncludedTypes(int index) {
    return includedTypes_.get(index);
  }
  /**
   * <pre>
   * Restricts the set of playable locations to just the
   * [types](/maps/tt/games/types) that you want.
   * </pre>
   *
   * <code>repeated string included_types = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the includedTypes at the given index.
   */
  public com.google.protobuf.ByteString
      getIncludedTypesBytes(int index) {
    return includedTypes_.getByteString(index);
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
    if (maxLocationCount_ != 0) {
      output.writeInt32(1, maxLocationCount_);
    }
    if (spacing_ != null) {
      output.writeMessage(2, getSpacing());
    }
    for (int i = 0; i < includedTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, includedTypes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxLocationCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, maxLocationCount_);
    }
    if (spacing_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSpacing());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < includedTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(includedTypes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIncludedTypesList().size();
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
    if (!(obj instanceof com.google.maps.playablelocations.v3.sample.Filter)) {
      return super.equals(obj);
    }
    com.google.maps.playablelocations.v3.sample.Filter other = (com.google.maps.playablelocations.v3.sample.Filter) obj;

    if (getMaxLocationCount()
        != other.getMaxLocationCount()) return false;
    if (hasSpacing() != other.hasSpacing()) return false;
    if (hasSpacing()) {
      if (!getSpacing()
          .equals(other.getSpacing())) return false;
    }
    if (!getIncludedTypesList()
        .equals(other.getIncludedTypesList())) return false;
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
    hash = (37 * hash) + MAX_LOCATION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxLocationCount();
    if (hasSpacing()) {
      hash = (37 * hash) + SPACING_FIELD_NUMBER;
      hash = (53 * hash) + getSpacing().hashCode();
    }
    if (getIncludedTypesCount() > 0) {
      hash = (37 * hash) + INCLUDED_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getIncludedTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.playablelocations.v3.sample.Filter parseFrom(
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
  public static Builder newBuilder(com.google.maps.playablelocations.v3.sample.Filter prototype) {
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
   * Specifies the filters to use when searching for playable locations.
   * </pre>
   *
   * Protobuf type {@code google.maps.playablelocations.v3.sample.Filter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.playablelocations.v3.sample.Filter)
      com.google.maps.playablelocations.v3.sample.FilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_Filter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_Filter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.playablelocations.v3.sample.Filter.class, com.google.maps.playablelocations.v3.sample.Filter.Builder.class);
    }

    // Construct using com.google.maps.playablelocations.v3.sample.Filter.newBuilder()
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
      maxLocationCount_ = 0;
      spacing_ = null;
      if (spacingBuilder_ != null) {
        spacingBuilder_.dispose();
        spacingBuilder_ = null;
      }
      includedTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_Filter_descriptor;
    }

    @java.lang.Override
    public com.google.maps.playablelocations.v3.sample.Filter getDefaultInstanceForType() {
      return com.google.maps.playablelocations.v3.sample.Filter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.playablelocations.v3.sample.Filter build() {
      com.google.maps.playablelocations.v3.sample.Filter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.playablelocations.v3.sample.Filter buildPartial() {
      com.google.maps.playablelocations.v3.sample.Filter result = new com.google.maps.playablelocations.v3.sample.Filter(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.maps.playablelocations.v3.sample.Filter result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        includedTypes_ = includedTypes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.includedTypes_ = includedTypes_;
    }

    private void buildPartial0(com.google.maps.playablelocations.v3.sample.Filter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxLocationCount_ = maxLocationCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.spacing_ = spacingBuilder_ == null
            ? spacing_
            : spacingBuilder_.build();
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
      if (other instanceof com.google.maps.playablelocations.v3.sample.Filter) {
        return mergeFrom((com.google.maps.playablelocations.v3.sample.Filter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.playablelocations.v3.sample.Filter other) {
      if (other == com.google.maps.playablelocations.v3.sample.Filter.getDefaultInstance()) return this;
      if (other.getMaxLocationCount() != 0) {
        setMaxLocationCount(other.getMaxLocationCount());
      }
      if (other.hasSpacing()) {
        mergeSpacing(other.getSpacing());
      }
      if (!other.includedTypes_.isEmpty()) {
        if (includedTypes_.isEmpty()) {
          includedTypes_ = other.includedTypes_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureIncludedTypesIsMutable();
          includedTypes_.addAll(other.includedTypes_);
        }
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
            case 8: {
              maxLocationCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getSpacingFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureIncludedTypesIsMutable();
              includedTypes_.add(s);
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

    private int maxLocationCount_ ;
    /**
     * <pre>
     * Specifies the maximum number of playable locations to return. This value
     * must not be greater than 1000. The default value is 100.
     * Only the top-ranking playable locations are returned.
     * </pre>
     *
     * <code>int32 max_location_count = 1;</code>
     * @return The maxLocationCount.
     */
    @java.lang.Override
    public int getMaxLocationCount() {
      return maxLocationCount_;
    }
    /**
     * <pre>
     * Specifies the maximum number of playable locations to return. This value
     * must not be greater than 1000. The default value is 100.
     * Only the top-ranking playable locations are returned.
     * </pre>
     *
     * <code>int32 max_location_count = 1;</code>
     * @param value The maxLocationCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxLocationCount(int value) {
      
      maxLocationCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the maximum number of playable locations to return. This value
     * must not be greater than 1000. The default value is 100.
     * Only the top-ranking playable locations are returned.
     * </pre>
     *
     * <code>int32 max_location_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxLocationCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxLocationCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.maps.playablelocations.v3.sample.SpacingOptions spacing_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.maps.playablelocations.v3.sample.SpacingOptions, com.google.maps.playablelocations.v3.sample.SpacingOptions.Builder, com.google.maps.playablelocations.v3.sample.SpacingOptionsOrBuilder> spacingBuilder_;
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     * @return Whether the spacing field is set.
     */
    public boolean hasSpacing() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     * @return The spacing.
     */
    public com.google.maps.playablelocations.v3.sample.SpacingOptions getSpacing() {
      if (spacingBuilder_ == null) {
        return spacing_ == null ? com.google.maps.playablelocations.v3.sample.SpacingOptions.getDefaultInstance() : spacing_;
      } else {
        return spacingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    public Builder setSpacing(com.google.maps.playablelocations.v3.sample.SpacingOptions value) {
      if (spacingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spacing_ = value;
      } else {
        spacingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    public Builder setSpacing(
        com.google.maps.playablelocations.v3.sample.SpacingOptions.Builder builderForValue) {
      if (spacingBuilder_ == null) {
        spacing_ = builderForValue.build();
      } else {
        spacingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    public Builder mergeSpacing(com.google.maps.playablelocations.v3.sample.SpacingOptions value) {
      if (spacingBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          spacing_ != null &&
          spacing_ != com.google.maps.playablelocations.v3.sample.SpacingOptions.getDefaultInstance()) {
          getSpacingBuilder().mergeFrom(value);
        } else {
          spacing_ = value;
        }
      } else {
        spacingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    public Builder clearSpacing() {
      bitField0_ = (bitField0_ & ~0x00000002);
      spacing_ = null;
      if (spacingBuilder_ != null) {
        spacingBuilder_.dispose();
        spacingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    public com.google.maps.playablelocations.v3.sample.SpacingOptions.Builder getSpacingBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSpacingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    public com.google.maps.playablelocations.v3.sample.SpacingOptionsOrBuilder getSpacingOrBuilder() {
      if (spacingBuilder_ != null) {
        return spacingBuilder_.getMessageOrBuilder();
      } else {
        return spacing_ == null ?
            com.google.maps.playablelocations.v3.sample.SpacingOptions.getDefaultInstance() : spacing_;
      }
    }
    /**
     * <pre>
     * A set of options that control the spacing between playable locations. By
     * default the minimum distance between locations is 200m.
     * </pre>
     *
     * <code>.google.maps.playablelocations.v3.sample.SpacingOptions spacing = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.maps.playablelocations.v3.sample.SpacingOptions, com.google.maps.playablelocations.v3.sample.SpacingOptions.Builder, com.google.maps.playablelocations.v3.sample.SpacingOptionsOrBuilder> 
        getSpacingFieldBuilder() {
      if (spacingBuilder_ == null) {
        spacingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.playablelocations.v3.sample.SpacingOptions, com.google.maps.playablelocations.v3.sample.SpacingOptions.Builder, com.google.maps.playablelocations.v3.sample.SpacingOptionsOrBuilder>(
                getSpacing(),
                getParentForChildren(),
                isClean());
        spacing_ = null;
      }
      return spacingBuilder_;
    }

    private com.google.protobuf.LazyStringList includedTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIncludedTypesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        includedTypes_ = new com.google.protobuf.LazyStringArrayList(includedTypes_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @return A list containing the includedTypes.
     */
    public com.google.protobuf.ProtocolStringList
        getIncludedTypesList() {
      return includedTypes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @return The count of includedTypes.
     */
    public int getIncludedTypesCount() {
      return includedTypes_.size();
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @param index The index of the element to return.
     * @return The includedTypes at the given index.
     */
    public java.lang.String getIncludedTypes(int index) {
      return includedTypes_.get(index);
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the includedTypes at the given index.
     */
    public com.google.protobuf.ByteString
        getIncludedTypesBytes(int index) {
      return includedTypes_.getByteString(index);
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @param index The index to set the value at.
     * @param value The includedTypes to set.
     * @return This builder for chaining.
     */
    public Builder setIncludedTypes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIncludedTypesIsMutable();
      includedTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @param value The includedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addIncludedTypes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIncludedTypesIsMutable();
      includedTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @param values The includedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllIncludedTypes(
        java.lang.Iterable<java.lang.String> values) {
      ensureIncludedTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, includedTypes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludedTypes() {
      includedTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts the set of playable locations to just the
     * [types](/maps/tt/games/types) that you want.
     * </pre>
     *
     * <code>repeated string included_types = 3;</code>
     * @param value The bytes of the includedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addIncludedTypesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureIncludedTypesIsMutable();
      includedTypes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.maps.playablelocations.v3.sample.Filter)
  }

  // @@protoc_insertion_point(class_scope:google.maps.playablelocations.v3.sample.Filter)
  private static final com.google.maps.playablelocations.v3.sample.Filter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.playablelocations.v3.sample.Filter();
  }

  public static com.google.maps.playablelocations.v3.sample.Filter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Filter>
      PARSER = new com.google.protobuf.AbstractParser<Filter>() {
    @java.lang.Override
    public Filter parsePartialFrom(
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

  public static com.google.protobuf.Parser<Filter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Filter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.playablelocations.v3.sample.Filter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

