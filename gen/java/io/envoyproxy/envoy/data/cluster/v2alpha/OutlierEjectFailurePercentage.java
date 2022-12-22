// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/cluster/v2alpha/outlier_detection_event.proto

package io.envoyproxy.envoy.data.cluster.v2alpha;

/**
 * Protobuf type {@code envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage}
 */
public final class OutlierEjectFailurePercentage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage)
    OutlierEjectFailurePercentageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OutlierEjectFailurePercentage.newBuilder() to construct.
  private OutlierEjectFailurePercentage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OutlierEjectFailurePercentage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OutlierEjectFailurePercentage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.data.cluster.v2alpha.OutlierDetectionEventProto.internal_static_envoy_data_cluster_v2alpha_OutlierEjectFailurePercentage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.data.cluster.v2alpha.OutlierDetectionEventProto.internal_static_envoy_data_cluster_v2alpha_OutlierEjectFailurePercentage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.class, io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.Builder.class);
  }

  public static final int HOST_SUCCESS_RATE_FIELD_NUMBER = 1;
  private int hostSuccessRate_ = 0;
  /**
   * <pre>
   * Host's success rate at the time of the ejection event on a 0-100 range.
   * </pre>
   *
   * <code>uint32 host_success_rate = 1 [(.validate.rules) = { ... }</code>
   * @return The hostSuccessRate.
   */
  @java.lang.Override
  public int getHostSuccessRate() {
    return hostSuccessRate_;
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
    if (hostSuccessRate_ != 0) {
      output.writeUInt32(1, hostSuccessRate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hostSuccessRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, hostSuccessRate_);
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
    if (!(obj instanceof io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage other = (io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage) obj;

    if (getHostSuccessRate()
        != other.getHostSuccessRate()) return false;
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
    hash = (37 * hash) + HOST_SUCCESS_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getHostSuccessRate();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage prototype) {
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
   * Protobuf type {@code envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage)
      io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.data.cluster.v2alpha.OutlierDetectionEventProto.internal_static_envoy_data_cluster_v2alpha_OutlierEjectFailurePercentage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.data.cluster.v2alpha.OutlierDetectionEventProto.internal_static_envoy_data_cluster_v2alpha_OutlierEjectFailurePercentage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.class, io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.newBuilder()
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
      hostSuccessRate_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.data.cluster.v2alpha.OutlierDetectionEventProto.internal_static_envoy_data_cluster_v2alpha_OutlierEjectFailurePercentage_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage getDefaultInstanceForType() {
      return io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage build() {
      io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage buildPartial() {
      io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage result = new io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostSuccessRate_ = hostSuccessRate_;
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
      if (other instanceof io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage) {
        return mergeFrom((io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage other) {
      if (other == io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage.getDefaultInstance()) return this;
      if (other.getHostSuccessRate() != 0) {
        setHostSuccessRate(other.getHostSuccessRate());
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
              hostSuccessRate_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int hostSuccessRate_ ;
    /**
     * <pre>
     * Host's success rate at the time of the ejection event on a 0-100 range.
     * </pre>
     *
     * <code>uint32 host_success_rate = 1 [(.validate.rules) = { ... }</code>
     * @return The hostSuccessRate.
     */
    @java.lang.Override
    public int getHostSuccessRate() {
      return hostSuccessRate_;
    }
    /**
     * <pre>
     * Host's success rate at the time of the ejection event on a 0-100 range.
     * </pre>
     *
     * <code>uint32 host_success_rate = 1 [(.validate.rules) = { ... }</code>
     * @param value The hostSuccessRate to set.
     * @return This builder for chaining.
     */
    public Builder setHostSuccessRate(int value) {
      
      hostSuccessRate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host's success rate at the time of the ejection event on a 0-100 range.
     * </pre>
     *
     * <code>uint32 host_success_rate = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearHostSuccessRate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hostSuccessRate_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage)
  }

  // @@protoc_insertion_point(class_scope:envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage)
  private static final io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage();
  }

  public static io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutlierEjectFailurePercentage>
      PARSER = new com.google.protobuf.AbstractParser<OutlierEjectFailurePercentage>() {
    @java.lang.Override
    public OutlierEjectFailurePercentage parsePartialFrom(
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

  public static com.google.protobuf.Parser<OutlierEjectFailurePercentage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutlierEjectFailurePercentage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.data.cluster.v2alpha.OutlierEjectFailurePercentage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
