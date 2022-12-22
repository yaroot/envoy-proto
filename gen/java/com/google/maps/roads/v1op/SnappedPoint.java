// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/roads/v1op/roads.proto

package com.google.maps.roads.v1op;

/**
 * <pre>
 * A snapped point object, representing the result of snapping.
 * </pre>
 *
 * Protobuf type {@code google.maps.roads.v1op.SnappedPoint}
 */
public final class SnappedPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.roads.v1op.SnappedPoint)
    SnappedPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnappedPoint.newBuilder() to construct.
  private SnappedPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnappedPoint() {
    placeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnappedPoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.roads.v1op.RoadsProto.internal_static_google_maps_roads_v1op_SnappedPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.roads.v1op.RoadsProto.internal_static_google_maps_roads_v1op_SnappedPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.roads.v1op.SnappedPoint.class, com.google.maps.roads.v1op.SnappedPoint.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private com.google.type.LatLng location_;
  /**
   * <pre>
   * The lat,lng of the snapped location.
   * </pre>
   *
   * <code>.google.type.LatLng location = 1;</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <pre>
   * The lat,lng of the snapped location.
   * </pre>
   *
   * <code>.google.type.LatLng location = 1;</code>
   * @return The location.
   */
  @java.lang.Override
  public com.google.type.LatLng getLocation() {
    return location_ == null ? com.google.type.LatLng.getDefaultInstance() : location_;
  }
  /**
   * <pre>
   * The lat,lng of the snapped location.
   * </pre>
   *
   * <code>.google.type.LatLng location = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getLocationOrBuilder() {
    return location_ == null ? com.google.type.LatLng.getDefaultInstance() : location_;
  }

  public static final int ORIGINAL_INDEX_FIELD_NUMBER = 2;
  private com.google.protobuf.UInt32Value originalIndex_;
  /**
   * <pre>
   * The index into the original path of the equivalent pre-snapped point.
   * This allows for identification of points which have been interpolated if
   * this index is missing.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value original_index = 2;</code>
   * @return Whether the originalIndex field is set.
   */
  @java.lang.Override
  public boolean hasOriginalIndex() {
    return originalIndex_ != null;
  }
  /**
   * <pre>
   * The index into the original path of the equivalent pre-snapped point.
   * This allows for identification of points which have been interpolated if
   * this index is missing.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value original_index = 2;</code>
   * @return The originalIndex.
   */
  @java.lang.Override
  public com.google.protobuf.UInt32Value getOriginalIndex() {
    return originalIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : originalIndex_;
  }
  /**
   * <pre>
   * The index into the original path of the equivalent pre-snapped point.
   * This allows for identification of points which have been interpolated if
   * this index is missing.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value original_index = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.UInt32ValueOrBuilder getOriginalIndexOrBuilder() {
    return originalIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : originalIndex_;
  }

  public static final int PLACE_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object placeId_ = "";
  /**
   * <pre>
   * The place ID for this snapped location (road segment). These are the same
   * as are currently used by the Places API.
   * </pre>
   *
   * <code>string place_id = 3;</code>
   * @return The placeId.
   */
  @java.lang.Override
  public java.lang.String getPlaceId() {
    java.lang.Object ref = placeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      placeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The place ID for this snapped location (road segment). These are the same
   * as are currently used by the Places API.
   * </pre>
   *
   * <code>string place_id = 3;</code>
   * @return The bytes for placeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlaceIdBytes() {
    java.lang.Object ref = placeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      placeId_ = b;
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
    if (location_ != null) {
      output.writeMessage(1, getLocation());
    }
    if (originalIndex_ != null) {
      output.writeMessage(2, getOriginalIndex());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(placeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, placeId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocation());
    }
    if (originalIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOriginalIndex());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(placeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, placeId_);
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
    if (!(obj instanceof com.google.maps.roads.v1op.SnappedPoint)) {
      return super.equals(obj);
    }
    com.google.maps.roads.v1op.SnappedPoint other = (com.google.maps.roads.v1op.SnappedPoint) obj;

    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
    }
    if (hasOriginalIndex() != other.hasOriginalIndex()) return false;
    if (hasOriginalIndex()) {
      if (!getOriginalIndex()
          .equals(other.getOriginalIndex())) return false;
    }
    if (!getPlaceId()
        .equals(other.getPlaceId())) return false;
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
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    if (hasOriginalIndex()) {
      hash = (37 * hash) + ORIGINAL_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getOriginalIndex().hashCode();
    }
    hash = (37 * hash) + PLACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPlaceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.roads.v1op.SnappedPoint parseFrom(
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
  public static Builder newBuilder(com.google.maps.roads.v1op.SnappedPoint prototype) {
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
   * A snapped point object, representing the result of snapping.
   * </pre>
   *
   * Protobuf type {@code google.maps.roads.v1op.SnappedPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.roads.v1op.SnappedPoint)
      com.google.maps.roads.v1op.SnappedPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.roads.v1op.RoadsProto.internal_static_google_maps_roads_v1op_SnappedPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.roads.v1op.RoadsProto.internal_static_google_maps_roads_v1op_SnappedPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.roads.v1op.SnappedPoint.class, com.google.maps.roads.v1op.SnappedPoint.Builder.class);
    }

    // Construct using com.google.maps.roads.v1op.SnappedPoint.newBuilder()
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
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      originalIndex_ = null;
      if (originalIndexBuilder_ != null) {
        originalIndexBuilder_.dispose();
        originalIndexBuilder_ = null;
      }
      placeId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.roads.v1op.RoadsProto.internal_static_google_maps_roads_v1op_SnappedPoint_descriptor;
    }

    @java.lang.Override
    public com.google.maps.roads.v1op.SnappedPoint getDefaultInstanceForType() {
      return com.google.maps.roads.v1op.SnappedPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.roads.v1op.SnappedPoint build() {
      com.google.maps.roads.v1op.SnappedPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.roads.v1op.SnappedPoint buildPartial() {
      com.google.maps.roads.v1op.SnappedPoint result = new com.google.maps.roads.v1op.SnappedPoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.roads.v1op.SnappedPoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = locationBuilder_ == null
            ? location_
            : locationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.originalIndex_ = originalIndexBuilder_ == null
            ? originalIndex_
            : originalIndexBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.placeId_ = placeId_;
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
      if (other instanceof com.google.maps.roads.v1op.SnappedPoint) {
        return mergeFrom((com.google.maps.roads.v1op.SnappedPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.roads.v1op.SnappedPoint other) {
      if (other == com.google.maps.roads.v1op.SnappedPoint.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (other.hasOriginalIndex()) {
        mergeOriginalIndex(other.getOriginalIndex());
      }
      if (!other.getPlaceId().isEmpty()) {
        placeId_ = other.placeId_;
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
                  getLocationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOriginalIndexFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              placeId_ = input.readStringRequireUtf8();
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

    private com.google.type.LatLng location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> locationBuilder_;
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     * @return The location.
     */
    public com.google.type.LatLng getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.google.type.LatLng.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    public Builder setLocation(com.google.type.LatLng value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    public Builder setLocation(
        com.google.type.LatLng.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    public Builder mergeLocation(com.google.type.LatLng value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          location_ != null &&
          location_ != com.google.type.LatLng.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    public com.google.type.LatLng.Builder getLocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.google.type.LatLng.getDefaultInstance() : location_;
      }
    }
    /**
     * <pre>
     * The lat,lng of the snapped location.
     * </pre>
     *
     * <code>.google.type.LatLng location = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private com.google.protobuf.UInt32Value originalIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> originalIndexBuilder_;
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     * @return Whether the originalIndex field is set.
     */
    public boolean hasOriginalIndex() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     * @return The originalIndex.
     */
    public com.google.protobuf.UInt32Value getOriginalIndex() {
      if (originalIndexBuilder_ == null) {
        return originalIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : originalIndex_;
      } else {
        return originalIndexBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    public Builder setOriginalIndex(com.google.protobuf.UInt32Value value) {
      if (originalIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        originalIndex_ = value;
      } else {
        originalIndexBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    public Builder setOriginalIndex(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (originalIndexBuilder_ == null) {
        originalIndex_ = builderForValue.build();
      } else {
        originalIndexBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    public Builder mergeOriginalIndex(com.google.protobuf.UInt32Value value) {
      if (originalIndexBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          originalIndex_ != null &&
          originalIndex_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
          getOriginalIndexBuilder().mergeFrom(value);
        } else {
          originalIndex_ = value;
        }
      } else {
        originalIndexBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    public Builder clearOriginalIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      originalIndex_ = null;
      if (originalIndexBuilder_ != null) {
        originalIndexBuilder_.dispose();
        originalIndexBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getOriginalIndexBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOriginalIndexFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getOriginalIndexOrBuilder() {
      if (originalIndexBuilder_ != null) {
        return originalIndexBuilder_.getMessageOrBuilder();
      } else {
        return originalIndex_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : originalIndex_;
      }
    }
    /**
     * <pre>
     * The index into the original path of the equivalent pre-snapped point.
     * This allows for identification of points which have been interpolated if
     * this index is missing.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value original_index = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getOriginalIndexFieldBuilder() {
      if (originalIndexBuilder_ == null) {
        originalIndexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getOriginalIndex(),
                getParentForChildren(),
                isClean());
        originalIndex_ = null;
      }
      return originalIndexBuilder_;
    }

    private java.lang.Object placeId_ = "";
    /**
     * <pre>
     * The place ID for this snapped location (road segment). These are the same
     * as are currently used by the Places API.
     * </pre>
     *
     * <code>string place_id = 3;</code>
     * @return The placeId.
     */
    public java.lang.String getPlaceId() {
      java.lang.Object ref = placeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        placeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The place ID for this snapped location (road segment). These are the same
     * as are currently used by the Places API.
     * </pre>
     *
     * <code>string place_id = 3;</code>
     * @return The bytes for placeId.
     */
    public com.google.protobuf.ByteString
        getPlaceIdBytes() {
      java.lang.Object ref = placeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        placeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The place ID for this snapped location (road segment). These are the same
     * as are currently used by the Places API.
     * </pre>
     *
     * <code>string place_id = 3;</code>
     * @param value The placeId to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      placeId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The place ID for this snapped location (road segment). These are the same
     * as are currently used by the Places API.
     * </pre>
     *
     * <code>string place_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlaceId() {
      placeId_ = getDefaultInstance().getPlaceId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The place ID for this snapped location (road segment). These are the same
     * as are currently used by the Places API.
     * </pre>
     *
     * <code>string place_id = 3;</code>
     * @param value The bytes for placeId to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      placeId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.maps.roads.v1op.SnappedPoint)
  }

  // @@protoc_insertion_point(class_scope:google.maps.roads.v1op.SnappedPoint)
  private static final com.google.maps.roads.v1op.SnappedPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.roads.v1op.SnappedPoint();
  }

  public static com.google.maps.roads.v1op.SnappedPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnappedPoint>
      PARSER = new com.google.protobuf.AbstractParser<SnappedPoint>() {
    @java.lang.Override
    public SnappedPoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<SnappedPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnappedPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.roads.v1op.SnappedPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

