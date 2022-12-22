// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/playablelocations/v3/sample/resources.proto

package com.google.maps.playablelocations.v3.sample;

/**
 * <pre>
 * A list of PlayableLocation objects that satisfies a single Criterion.
 * </pre>
 *
 * Protobuf type {@code google.maps.playablelocations.v3.sample.PlayableLocationList}
 */
public final class PlayableLocationList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.playablelocations.v3.sample.PlayableLocationList)
    PlayableLocationListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayableLocationList.newBuilder() to construct.
  private PlayableLocationList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayableLocationList() {
    locations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayableLocationList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_PlayableLocationList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_PlayableLocationList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.playablelocations.v3.sample.PlayableLocationList.class, com.google.maps.playablelocations.v3.sample.PlayableLocationList.Builder.class);
  }

  public static final int LOCATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.maps.playablelocations.v3.sample.PlayableLocation> locations_;
  /**
   * <pre>
   * A list of playable locations for this game object type.
   * </pre>
   *
   * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.maps.playablelocations.v3.sample.PlayableLocation> getLocationsList() {
    return locations_;
  }
  /**
   * <pre>
   * A list of playable locations for this game object type.
   * </pre>
   *
   * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder> 
      getLocationsOrBuilderList() {
    return locations_;
  }
  /**
   * <pre>
   * A list of playable locations for this game object type.
   * </pre>
   *
   * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
   */
  @java.lang.Override
  public int getLocationsCount() {
    return locations_.size();
  }
  /**
   * <pre>
   * A list of playable locations for this game object type.
   * </pre>
   *
   * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
   */
  @java.lang.Override
  public com.google.maps.playablelocations.v3.sample.PlayableLocation getLocations(int index) {
    return locations_.get(index);
  }
  /**
   * <pre>
   * A list of playable locations for this game object type.
   * </pre>
   *
   * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
   */
  @java.lang.Override
  public com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder getLocationsOrBuilder(
      int index) {
    return locations_.get(index);
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
    for (int i = 0; i < locations_.size(); i++) {
      output.writeMessage(1, locations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < locations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, locations_.get(i));
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
    if (!(obj instanceof com.google.maps.playablelocations.v3.sample.PlayableLocationList)) {
      return super.equals(obj);
    }
    com.google.maps.playablelocations.v3.sample.PlayableLocationList other = (com.google.maps.playablelocations.v3.sample.PlayableLocationList) obj;

    if (!getLocationsList()
        .equals(other.getLocationsList())) return false;
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
    if (getLocationsCount() > 0) {
      hash = (37 * hash) + LOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getLocationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList parseFrom(
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
  public static Builder newBuilder(com.google.maps.playablelocations.v3.sample.PlayableLocationList prototype) {
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
   * A list of PlayableLocation objects that satisfies a single Criterion.
   * </pre>
   *
   * Protobuf type {@code google.maps.playablelocations.v3.sample.PlayableLocationList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.playablelocations.v3.sample.PlayableLocationList)
      com.google.maps.playablelocations.v3.sample.PlayableLocationListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_PlayableLocationList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_PlayableLocationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.playablelocations.v3.sample.PlayableLocationList.class, com.google.maps.playablelocations.v3.sample.PlayableLocationList.Builder.class);
    }

    // Construct using com.google.maps.playablelocations.v3.sample.PlayableLocationList.newBuilder()
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
      if (locationsBuilder_ == null) {
        locations_ = java.util.Collections.emptyList();
      } else {
        locations_ = null;
        locationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.playablelocations.v3.sample.ResourcesProto.internal_static_google_maps_playablelocations_v3_sample_PlayableLocationList_descriptor;
    }

    @java.lang.Override
    public com.google.maps.playablelocations.v3.sample.PlayableLocationList getDefaultInstanceForType() {
      return com.google.maps.playablelocations.v3.sample.PlayableLocationList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.playablelocations.v3.sample.PlayableLocationList build() {
      com.google.maps.playablelocations.v3.sample.PlayableLocationList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.playablelocations.v3.sample.PlayableLocationList buildPartial() {
      com.google.maps.playablelocations.v3.sample.PlayableLocationList result = new com.google.maps.playablelocations.v3.sample.PlayableLocationList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.maps.playablelocations.v3.sample.PlayableLocationList result) {
      if (locationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          locations_ = java.util.Collections.unmodifiableList(locations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.locations_ = locations_;
      } else {
        result.locations_ = locationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.maps.playablelocations.v3.sample.PlayableLocationList result) {
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
      if (other instanceof com.google.maps.playablelocations.v3.sample.PlayableLocationList) {
        return mergeFrom((com.google.maps.playablelocations.v3.sample.PlayableLocationList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.playablelocations.v3.sample.PlayableLocationList other) {
      if (other == com.google.maps.playablelocations.v3.sample.PlayableLocationList.getDefaultInstance()) return this;
      if (locationsBuilder_ == null) {
        if (!other.locations_.isEmpty()) {
          if (locations_.isEmpty()) {
            locations_ = other.locations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocationsIsMutable();
            locations_.addAll(other.locations_);
          }
          onChanged();
        }
      } else {
        if (!other.locations_.isEmpty()) {
          if (locationsBuilder_.isEmpty()) {
            locationsBuilder_.dispose();
            locationsBuilder_ = null;
            locations_ = other.locations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            locationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocationsFieldBuilder() : null;
          } else {
            locationsBuilder_.addAllMessages(other.locations_);
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
              com.google.maps.playablelocations.v3.sample.PlayableLocation m =
                  input.readMessage(
                      com.google.maps.playablelocations.v3.sample.PlayableLocation.parser(),
                      extensionRegistry);
              if (locationsBuilder_ == null) {
                ensureLocationsIsMutable();
                locations_.add(m);
              } else {
                locationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.maps.playablelocations.v3.sample.PlayableLocation> locations_ =
      java.util.Collections.emptyList();
    private void ensureLocationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locations_ = new java.util.ArrayList<com.google.maps.playablelocations.v3.sample.PlayableLocation>(locations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.maps.playablelocations.v3.sample.PlayableLocation, com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder, com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder> locationsBuilder_;

    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public java.util.List<com.google.maps.playablelocations.v3.sample.PlayableLocation> getLocationsList() {
      if (locationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locations_);
      } else {
        return locationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public int getLocationsCount() {
      if (locationsBuilder_ == null) {
        return locations_.size();
      } else {
        return locationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public com.google.maps.playablelocations.v3.sample.PlayableLocation getLocations(int index) {
      if (locationsBuilder_ == null) {
        return locations_.get(index);
      } else {
        return locationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder setLocations(
        int index, com.google.maps.playablelocations.v3.sample.PlayableLocation value) {
      if (locationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationsIsMutable();
        locations_.set(index, value);
        onChanged();
      } else {
        locationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder setLocations(
        int index, com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder builderForValue) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.set(index, builderForValue.build());
        onChanged();
      } else {
        locationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder addLocations(com.google.maps.playablelocations.v3.sample.PlayableLocation value) {
      if (locationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationsIsMutable();
        locations_.add(value);
        onChanged();
      } else {
        locationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder addLocations(
        int index, com.google.maps.playablelocations.v3.sample.PlayableLocation value) {
      if (locationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationsIsMutable();
        locations_.add(index, value);
        onChanged();
      } else {
        locationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder addLocations(
        com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder builderForValue) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.add(builderForValue.build());
        onChanged();
      } else {
        locationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder addLocations(
        int index, com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder builderForValue) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.add(index, builderForValue.build());
        onChanged();
      } else {
        locationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder addAllLocations(
        java.lang.Iterable<? extends com.google.maps.playablelocations.v3.sample.PlayableLocation> values) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, locations_);
        onChanged();
      } else {
        locationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder clearLocations() {
      if (locationsBuilder_ == null) {
        locations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        locationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public Builder removeLocations(int index) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.remove(index);
        onChanged();
      } else {
        locationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder getLocationsBuilder(
        int index) {
      return getLocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder getLocationsOrBuilder(
        int index) {
      if (locationsBuilder_ == null) {
        return locations_.get(index);  } else {
        return locationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public java.util.List<? extends com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder> 
         getLocationsOrBuilderList() {
      if (locationsBuilder_ != null) {
        return locationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locations_);
      }
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder addLocationsBuilder() {
      return getLocationsFieldBuilder().addBuilder(
          com.google.maps.playablelocations.v3.sample.PlayableLocation.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder addLocationsBuilder(
        int index) {
      return getLocationsFieldBuilder().addBuilder(
          index, com.google.maps.playablelocations.v3.sample.PlayableLocation.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of playable locations for this game object type.
     * </pre>
     *
     * <code>repeated .google.maps.playablelocations.v3.sample.PlayableLocation locations = 1;</code>
     */
    public java.util.List<com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder> 
         getLocationsBuilderList() {
      return getLocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.maps.playablelocations.v3.sample.PlayableLocation, com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder, com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder> 
        getLocationsFieldBuilder() {
      if (locationsBuilder_ == null) {
        locationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.maps.playablelocations.v3.sample.PlayableLocation, com.google.maps.playablelocations.v3.sample.PlayableLocation.Builder, com.google.maps.playablelocations.v3.sample.PlayableLocationOrBuilder>(
                locations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        locations_ = null;
      }
      return locationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.maps.playablelocations.v3.sample.PlayableLocationList)
  }

  // @@protoc_insertion_point(class_scope:google.maps.playablelocations.v3.sample.PlayableLocationList)
  private static final com.google.maps.playablelocations.v3.sample.PlayableLocationList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.playablelocations.v3.sample.PlayableLocationList();
  }

  public static com.google.maps.playablelocations.v3.sample.PlayableLocationList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayableLocationList>
      PARSER = new com.google.protobuf.AbstractParser<PlayableLocationList>() {
    @java.lang.Override
    public PlayableLocationList parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayableLocationList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayableLocationList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.playablelocations.v3.sample.PlayableLocationList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
