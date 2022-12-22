// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/vehicles.proto

package google.maps.fleetengine.v1;

/**
 * <pre>
 * Traffic conditions along the expected vehicle route.
 * </pre>
 *
 * Protobuf type {@code maps.fleetengine.v1.TrafficPolylineData}
 */
public final class TrafficPolylineData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maps.fleetengine.v1.TrafficPolylineData)
    TrafficPolylineDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrafficPolylineData.newBuilder() to construct.
  private TrafficPolylineData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrafficPolylineData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrafficPolylineData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return google.maps.fleetengine.v1.Vehicles.internal_static_maps_fleetengine_v1_TrafficPolylineData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.maps.fleetengine.v1.Vehicles.internal_static_maps_fleetengine_v1_TrafficPolylineData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.maps.fleetengine.v1.TrafficPolylineData.class, google.maps.fleetengine.v1.TrafficPolylineData.Builder.class);
  }

  public static final int TRAFFIC_RENDERING_FIELD_NUMBER = 1;
  private google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering trafficRendering_;
  /**
   * <pre>
   * A polyline rendering of how fast traffic is for all regions along
   * one stretch of a customer ride.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
   * @return Whether the trafficRendering field is set.
   */
  @java.lang.Override
  public boolean hasTrafficRendering() {
    return trafficRendering_ != null;
  }
  /**
   * <pre>
   * A polyline rendering of how fast traffic is for all regions along
   * one stretch of a customer ride.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
   * @return The trafficRendering.
   */
  @java.lang.Override
  public google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering getTrafficRendering() {
    return trafficRendering_ == null ? google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.getDefaultInstance() : trafficRendering_;
  }
  /**
   * <pre>
   * A polyline rendering of how fast traffic is for all regions along
   * one stretch of a customer ride.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
   */
  @java.lang.Override
  public google.maps.fleetengine.v1.VisualTrafficReportPolylineRenderingOrBuilder getTrafficRenderingOrBuilder() {
    return trafficRendering_ == null ? google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.getDefaultInstance() : trafficRendering_;
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
    if (trafficRendering_ != null) {
      output.writeMessage(1, getTrafficRendering());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trafficRendering_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTrafficRendering());
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
    if (!(obj instanceof google.maps.fleetengine.v1.TrafficPolylineData)) {
      return super.equals(obj);
    }
    google.maps.fleetengine.v1.TrafficPolylineData other = (google.maps.fleetengine.v1.TrafficPolylineData) obj;

    if (hasTrafficRendering() != other.hasTrafficRendering()) return false;
    if (hasTrafficRendering()) {
      if (!getTrafficRendering()
          .equals(other.getTrafficRendering())) return false;
    }
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
    if (hasTrafficRendering()) {
      hash = (37 * hash) + TRAFFIC_RENDERING_FIELD_NUMBER;
      hash = (53 * hash) + getTrafficRendering().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.maps.fleetengine.v1.TrafficPolylineData parseFrom(
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
  public static Builder newBuilder(google.maps.fleetengine.v1.TrafficPolylineData prototype) {
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
   * Traffic conditions along the expected vehicle route.
   * </pre>
   *
   * Protobuf type {@code maps.fleetengine.v1.TrafficPolylineData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maps.fleetengine.v1.TrafficPolylineData)
      google.maps.fleetengine.v1.TrafficPolylineDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.maps.fleetengine.v1.Vehicles.internal_static_maps_fleetengine_v1_TrafficPolylineData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.maps.fleetengine.v1.Vehicles.internal_static_maps_fleetengine_v1_TrafficPolylineData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.maps.fleetengine.v1.TrafficPolylineData.class, google.maps.fleetengine.v1.TrafficPolylineData.Builder.class);
    }

    // Construct using google.maps.fleetengine.v1.TrafficPolylineData.newBuilder()
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
      trafficRendering_ = null;
      if (trafficRenderingBuilder_ != null) {
        trafficRenderingBuilder_.dispose();
        trafficRenderingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return google.maps.fleetengine.v1.Vehicles.internal_static_maps_fleetengine_v1_TrafficPolylineData_descriptor;
    }

    @java.lang.Override
    public google.maps.fleetengine.v1.TrafficPolylineData getDefaultInstanceForType() {
      return google.maps.fleetengine.v1.TrafficPolylineData.getDefaultInstance();
    }

    @java.lang.Override
    public google.maps.fleetengine.v1.TrafficPolylineData build() {
      google.maps.fleetengine.v1.TrafficPolylineData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.maps.fleetengine.v1.TrafficPolylineData buildPartial() {
      google.maps.fleetengine.v1.TrafficPolylineData result = new google.maps.fleetengine.v1.TrafficPolylineData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(google.maps.fleetengine.v1.TrafficPolylineData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trafficRendering_ = trafficRenderingBuilder_ == null
            ? trafficRendering_
            : trafficRenderingBuilder_.build();
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
      if (other instanceof google.maps.fleetengine.v1.TrafficPolylineData) {
        return mergeFrom((google.maps.fleetengine.v1.TrafficPolylineData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.maps.fleetengine.v1.TrafficPolylineData other) {
      if (other == google.maps.fleetengine.v1.TrafficPolylineData.getDefaultInstance()) return this;
      if (other.hasTrafficRendering()) {
        mergeTrafficRendering(other.getTrafficRendering());
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
                  getTrafficRenderingFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering trafficRendering_;
    private com.google.protobuf.SingleFieldBuilderV3<
        google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering, google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.Builder, google.maps.fleetengine.v1.VisualTrafficReportPolylineRenderingOrBuilder> trafficRenderingBuilder_;
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     * @return Whether the trafficRendering field is set.
     */
    public boolean hasTrafficRendering() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     * @return The trafficRendering.
     */
    public google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering getTrafficRendering() {
      if (trafficRenderingBuilder_ == null) {
        return trafficRendering_ == null ? google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.getDefaultInstance() : trafficRendering_;
      } else {
        return trafficRenderingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    public Builder setTrafficRendering(google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering value) {
      if (trafficRenderingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trafficRendering_ = value;
      } else {
        trafficRenderingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    public Builder setTrafficRendering(
        google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.Builder builderForValue) {
      if (trafficRenderingBuilder_ == null) {
        trafficRendering_ = builderForValue.build();
      } else {
        trafficRenderingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    public Builder mergeTrafficRendering(google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering value) {
      if (trafficRenderingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          trafficRendering_ != null &&
          trafficRendering_ != google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.getDefaultInstance()) {
          getTrafficRenderingBuilder().mergeFrom(value);
        } else {
          trafficRendering_ = value;
        }
      } else {
        trafficRenderingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    public Builder clearTrafficRendering() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trafficRendering_ = null;
      if (trafficRenderingBuilder_ != null) {
        trafficRenderingBuilder_.dispose();
        trafficRenderingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    public google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.Builder getTrafficRenderingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTrafficRenderingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    public google.maps.fleetengine.v1.VisualTrafficReportPolylineRenderingOrBuilder getTrafficRenderingOrBuilder() {
      if (trafficRenderingBuilder_ != null) {
        return trafficRenderingBuilder_.getMessageOrBuilder();
      } else {
        return trafficRendering_ == null ?
            google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.getDefaultInstance() : trafficRendering_;
      }
    }
    /**
     * <pre>
     * A polyline rendering of how fast traffic is for all regions along
     * one stretch of a customer ride.
     * </pre>
     *
     * <code>.maps.fleetengine.v1.VisualTrafficReportPolylineRendering traffic_rendering = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering, google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.Builder, google.maps.fleetengine.v1.VisualTrafficReportPolylineRenderingOrBuilder> 
        getTrafficRenderingFieldBuilder() {
      if (trafficRenderingBuilder_ == null) {
        trafficRenderingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering, google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.Builder, google.maps.fleetengine.v1.VisualTrafficReportPolylineRenderingOrBuilder>(
                getTrafficRendering(),
                getParentForChildren(),
                isClean());
        trafficRendering_ = null;
      }
      return trafficRenderingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maps.fleetengine.v1.TrafficPolylineData)
  }

  // @@protoc_insertion_point(class_scope:maps.fleetengine.v1.TrafficPolylineData)
  private static final google.maps.fleetengine.v1.TrafficPolylineData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new google.maps.fleetengine.v1.TrafficPolylineData();
  }

  public static google.maps.fleetengine.v1.TrafficPolylineData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficPolylineData>
      PARSER = new com.google.protobuf.AbstractParser<TrafficPolylineData>() {
    @java.lang.Override
    public TrafficPolylineData parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrafficPolylineData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficPolylineData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.maps.fleetengine.v1.TrafficPolylineData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
