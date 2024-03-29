// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * Identifies location of where either Envoy runs or where upstream hosts run.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.Locality}
 */
public final class Locality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.Locality)
    LocalityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Locality.newBuilder() to construct.
  private Locality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Locality() {
    region_ = "";
    zone_ = "";
    subZone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Locality();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_Locality_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_Locality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.Locality.class, io.envoyproxy.envoy.config.core.v3.Locality.Builder.class);
  }

  public static final int REGION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object region_ = "";
  /**
   * <pre>
   * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
   * </pre>
   *
   * <code>string region = 1;</code>
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
   * </pre>
   *
   * <code>string region = 1;</code>
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";
  /**
   * <pre>
   * Defines the local service zone where Envoy is running. Though optional, it
   * should be set if discovery service routing is used and the discovery
   * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
   * either in this message or via :option:`--service-zone`. The meaning of zone
   * is context dependent, e.g. `Availability Zone (AZ)
   * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
   * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
   * GCP, etc.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Defines the local service zone where Envoy is running. Though optional, it
   * should be set if discovery service routing is used and the discovery
   * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
   * either in this message or via :option:`--service-zone`. The meaning of zone
   * is context dependent, e.g. `Availability Zone (AZ)
   * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
   * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
   * GCP, etc.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUB_ZONE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subZone_ = "";
  /**
   * <pre>
   * When used for locality of upstream hosts, this field further splits zone
   * into smaller chunks of sub-zones so they can be load balanced
   * independently.
   * </pre>
   *
   * <code>string sub_zone = 3;</code>
   * @return The subZone.
   */
  @java.lang.Override
  public java.lang.String getSubZone() {
    java.lang.Object ref = subZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subZone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * When used for locality of upstream hosts, this field further splits zone
   * into smaller chunks of sub-zones so they can be load balanced
   * independently.
   * </pre>
   *
   * <code>string sub_zone = 3;</code>
   * @return The bytes for subZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubZoneBytes() {
    java.lang.Object ref = subZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subZone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subZone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subZone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subZone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subZone_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.Locality)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.Locality other = (io.envoyproxy.envoy.config.core.v3.Locality) obj;

    if (!getRegion()
        .equals(other.getRegion())) return false;
    if (!getZone()
        .equals(other.getZone())) return false;
    if (!getSubZone()
        .equals(other.getSubZone())) return false;
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
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + SUB_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getSubZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.Locality parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.Locality prototype) {
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
   * Identifies location of where either Envoy runs or where upstream hosts run.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.Locality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.Locality)
      io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_Locality_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_Locality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.Locality.class, io.envoyproxy.envoy.config.core.v3.Locality.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.Locality.newBuilder()
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
      region_ = "";
      zone_ = "";
      subZone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_Locality_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.Locality getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.Locality.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.Locality build() {
      io.envoyproxy.envoy.config.core.v3.Locality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.Locality buildPartial() {
      io.envoyproxy.envoy.config.core.v3.Locality result = new io.envoyproxy.envoy.config.core.v3.Locality(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.core.v3.Locality result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.region_ = region_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.zone_ = zone_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subZone_ = subZone_;
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.Locality) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.Locality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.Locality other) {
      if (other == io.envoyproxy.envoy.config.core.v3.Locality.getDefaultInstance()) return this;
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSubZone().isEmpty()) {
        subZone_ = other.subZone_;
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
              region_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              zone_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              subZone_ = input.readStringRequireUtf8();
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

    private java.lang.Object region_ = "";
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      region_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      region_ = getDefaultInstance().getRegion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_v3_api_field_config.core.v3.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      region_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_v3_api_field_config.endpoint.v3.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object subZone_ = "";
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     * @return The subZone.
     */
    public java.lang.String getSubZone() {
      java.lang.Object ref = subZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     * @return The bytes for subZone.
     */
    public com.google.protobuf.ByteString
        getSubZoneBytes() {
      java.lang.Object ref = subZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     * @param value The subZone to set.
     * @return This builder for chaining.
     */
    public Builder setSubZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subZone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubZone() {
      subZone_ = getDefaultInstance().getSubZone();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     * @param value The bytes for subZone to set.
     * @return This builder for chaining.
     */
    public Builder setSubZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subZone_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.Locality)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.Locality)
  private static final io.envoyproxy.envoy.config.core.v3.Locality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.Locality();
  }

  public static io.envoyproxy.envoy.config.core.v3.Locality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Locality>
      PARSER = new com.google.protobuf.AbstractParser<Locality>() {
    @java.lang.Override
    public Locality parsePartialFrom(
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

  public static com.google.protobuf.Parser<Locality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Locality> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.Locality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

