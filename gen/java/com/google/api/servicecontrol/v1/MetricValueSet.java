// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/metric_value.proto

package com.google.api.servicecontrol.v1;

/**
 * <pre>
 * Represents a set of metric values in the same metric.
 * Each metric value in the set should have a unique combination of start time,
 * end time, and label values.
 * </pre>
 *
 * Protobuf type {@code google.api.servicecontrol.v1.MetricValueSet}
 */
public final class MetricValueSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicecontrol.v1.MetricValueSet)
    MetricValueSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetricValueSet.newBuilder() to construct.
  private MetricValueSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricValueSet() {
    metricName_ = "";
    metricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetricValueSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.servicecontrol.v1.MetricValueSetProto.internal_static_google_api_servicecontrol_v1_MetricValueSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicecontrol.v1.MetricValueSetProto.internal_static_google_api_servicecontrol_v1_MetricValueSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicecontrol.v1.MetricValueSet.class, com.google.api.servicecontrol.v1.MetricValueSet.Builder.class);
  }

  public static final int METRIC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metricName_ = "";
  /**
   * <pre>
   * The metric name defined in the service configuration.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   * @return The metricName.
   */
  @java.lang.Override
  public java.lang.String getMetricName() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metricName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The metric name defined in the service configuration.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   * @return The bytes for metricName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetricNameBytes() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metricName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_VALUES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.api.servicecontrol.v1.MetricValue> metricValues_;
  /**
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.servicecontrol.v1.MetricValue> getMetricValuesList() {
    return metricValues_;
  }
  /**
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.servicecontrol.v1.MetricValueOrBuilder> 
      getMetricValuesOrBuilderList() {
    return metricValues_;
  }
  /**
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public int getMetricValuesCount() {
    return metricValues_.size();
  }
  /**
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public com.google.api.servicecontrol.v1.MetricValue getMetricValues(int index) {
    return metricValues_.get(index);
  }
  /**
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public com.google.api.servicecontrol.v1.MetricValueOrBuilder getMetricValuesOrBuilder(
      int index) {
    return metricValues_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metricName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
    }
    for (int i = 0; i < metricValues_.size(); i++) {
      output.writeMessage(2, metricValues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metricName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
    }
    for (int i = 0; i < metricValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, metricValues_.get(i));
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
    if (!(obj instanceof com.google.api.servicecontrol.v1.MetricValueSet)) {
      return super.equals(obj);
    }
    com.google.api.servicecontrol.v1.MetricValueSet other = (com.google.api.servicecontrol.v1.MetricValueSet) obj;

    if (!getMetricName()
        .equals(other.getMetricName())) return false;
    if (!getMetricValuesList()
        .equals(other.getMetricValuesList())) return false;
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
    hash = (37 * hash) + METRIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMetricName().hashCode();
    if (getMetricValuesCount() > 0) {
      hash = (37 * hash) + METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getMetricValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicecontrol.v1.MetricValueSet parseFrom(
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
  public static Builder newBuilder(com.google.api.servicecontrol.v1.MetricValueSet prototype) {
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
   * Represents a set of metric values in the same metric.
   * Each metric value in the set should have a unique combination of start time,
   * end time, and label values.
   * </pre>
   *
   * Protobuf type {@code google.api.servicecontrol.v1.MetricValueSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicecontrol.v1.MetricValueSet)
      com.google.api.servicecontrol.v1.MetricValueSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicecontrol.v1.MetricValueSetProto.internal_static_google_api_servicecontrol_v1_MetricValueSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicecontrol.v1.MetricValueSetProto.internal_static_google_api_servicecontrol_v1_MetricValueSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicecontrol.v1.MetricValueSet.class, com.google.api.servicecontrol.v1.MetricValueSet.Builder.class);
    }

    // Construct using com.google.api.servicecontrol.v1.MetricValueSet.newBuilder()
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
      metricName_ = "";
      if (metricValuesBuilder_ == null) {
        metricValues_ = java.util.Collections.emptyList();
      } else {
        metricValues_ = null;
        metricValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicecontrol.v1.MetricValueSetProto.internal_static_google_api_servicecontrol_v1_MetricValueSet_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicecontrol.v1.MetricValueSet getDefaultInstanceForType() {
      return com.google.api.servicecontrol.v1.MetricValueSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicecontrol.v1.MetricValueSet build() {
      com.google.api.servicecontrol.v1.MetricValueSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicecontrol.v1.MetricValueSet buildPartial() {
      com.google.api.servicecontrol.v1.MetricValueSet result = new com.google.api.servicecontrol.v1.MetricValueSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.servicecontrol.v1.MetricValueSet result) {
      if (metricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          metricValues_ = java.util.Collections.unmodifiableList(metricValues_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.metricValues_ = metricValues_;
      } else {
        result.metricValues_ = metricValuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.servicecontrol.v1.MetricValueSet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricName_ = metricName_;
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
      if (other instanceof com.google.api.servicecontrol.v1.MetricValueSet) {
        return mergeFrom((com.google.api.servicecontrol.v1.MetricValueSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicecontrol.v1.MetricValueSet other) {
      if (other == com.google.api.servicecontrol.v1.MetricValueSet.getDefaultInstance()) return this;
      if (!other.getMetricName().isEmpty()) {
        metricName_ = other.metricName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (metricValuesBuilder_ == null) {
        if (!other.metricValues_.isEmpty()) {
          if (metricValues_.isEmpty()) {
            metricValues_ = other.metricValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMetricValuesIsMutable();
            metricValues_.addAll(other.metricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.metricValues_.isEmpty()) {
          if (metricValuesBuilder_.isEmpty()) {
            metricValuesBuilder_.dispose();
            metricValuesBuilder_ = null;
            metricValues_ = other.metricValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
            metricValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricValuesFieldBuilder() : null;
          } else {
            metricValuesBuilder_.addAllMessages(other.metricValues_);
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
              metricName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.api.servicecontrol.v1.MetricValue m =
                  input.readMessage(
                      com.google.api.servicecontrol.v1.MetricValue.parser(),
                      extensionRegistry);
              if (metricValuesBuilder_ == null) {
                ensureMetricValuesIsMutable();
                metricValues_.add(m);
              } else {
                metricValuesBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.lang.Object metricName_ = "";
    /**
     * <pre>
     * The metric name defined in the service configuration.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     * @return The metricName.
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The metric name defined in the service configuration.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     * @return The bytes for metricName.
     */
    public com.google.protobuf.ByteString
        getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The metric name defined in the service configuration.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     * @param value The metricName to set.
     * @return This builder for chaining.
     */
    public Builder setMetricName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      metricName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric name defined in the service configuration.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricName() {
      metricName_ = getDefaultInstance().getMetricName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric name defined in the service configuration.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     * @param value The bytes for metricName to set.
     * @return This builder for chaining.
     */
    public Builder setMetricNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      metricName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.api.servicecontrol.v1.MetricValue> metricValues_ =
      java.util.Collections.emptyList();
    private void ensureMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        metricValues_ = new java.util.ArrayList<com.google.api.servicecontrol.v1.MetricValue>(metricValues_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.servicecontrol.v1.MetricValue, com.google.api.servicecontrol.v1.MetricValue.Builder, com.google.api.servicecontrol.v1.MetricValueOrBuilder> metricValuesBuilder_;

    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public java.util.List<com.google.api.servicecontrol.v1.MetricValue> getMetricValuesList() {
      if (metricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metricValues_);
      } else {
        return metricValuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public int getMetricValuesCount() {
      if (metricValuesBuilder_ == null) {
        return metricValues_.size();
      } else {
        return metricValuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public com.google.api.servicecontrol.v1.MetricValue getMetricValues(int index) {
      if (metricValuesBuilder_ == null) {
        return metricValues_.get(index);
      } else {
        return metricValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder setMetricValues(
        int index, com.google.api.servicecontrol.v1.MetricValue value) {
      if (metricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricValuesIsMutable();
        metricValues_.set(index, value);
        onChanged();
      } else {
        metricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder setMetricValues(
        int index, com.google.api.servicecontrol.v1.MetricValue.Builder builderForValue) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(com.google.api.servicecontrol.v1.MetricValue value) {
      if (metricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricValuesIsMutable();
        metricValues_.add(value);
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(
        int index, com.google.api.servicecontrol.v1.MetricValue value) {
      if (metricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricValuesIsMutable();
        metricValues_.add(index, value);
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(
        com.google.api.servicecontrol.v1.MetricValue.Builder builderForValue) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.add(builderForValue.build());
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(
        int index, com.google.api.servicecontrol.v1.MetricValue.Builder builderForValue) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder addAllMetricValues(
        java.lang.Iterable<? extends com.google.api.servicecontrol.v1.MetricValue> values) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metricValues_);
        onChanged();
      } else {
        metricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder clearMetricValues() {
      if (metricValuesBuilder_ == null) {
        metricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        metricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public Builder removeMetricValues(int index) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.remove(index);
        onChanged();
      } else {
        metricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public com.google.api.servicecontrol.v1.MetricValue.Builder getMetricValuesBuilder(
        int index) {
      return getMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public com.google.api.servicecontrol.v1.MetricValueOrBuilder getMetricValuesOrBuilder(
        int index) {
      if (metricValuesBuilder_ == null) {
        return metricValues_.get(index);  } else {
        return metricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public java.util.List<? extends com.google.api.servicecontrol.v1.MetricValueOrBuilder> 
         getMetricValuesOrBuilderList() {
      if (metricValuesBuilder_ != null) {
        return metricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metricValues_);
      }
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public com.google.api.servicecontrol.v1.MetricValue.Builder addMetricValuesBuilder() {
      return getMetricValuesFieldBuilder().addBuilder(
          com.google.api.servicecontrol.v1.MetricValue.getDefaultInstance());
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public com.google.api.servicecontrol.v1.MetricValue.Builder addMetricValuesBuilder(
        int index) {
      return getMetricValuesFieldBuilder().addBuilder(
          index, com.google.api.servicecontrol.v1.MetricValue.getDefaultInstance());
    }
    /**
     * <pre>
     * The values in this metric.
     * </pre>
     *
     * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
     */
    public java.util.List<com.google.api.servicecontrol.v1.MetricValue.Builder> 
         getMetricValuesBuilderList() {
      return getMetricValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.servicecontrol.v1.MetricValue, com.google.api.servicecontrol.v1.MetricValue.Builder, com.google.api.servicecontrol.v1.MetricValueOrBuilder> 
        getMetricValuesFieldBuilder() {
      if (metricValuesBuilder_ == null) {
        metricValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.servicecontrol.v1.MetricValue, com.google.api.servicecontrol.v1.MetricValue.Builder, com.google.api.servicecontrol.v1.MetricValueOrBuilder>(
                metricValues_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        metricValues_ = null;
      }
      return metricValuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.api.servicecontrol.v1.MetricValueSet)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.MetricValueSet)
  private static final com.google.api.servicecontrol.v1.MetricValueSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicecontrol.v1.MetricValueSet();
  }

  public static com.google.api.servicecontrol.v1.MetricValueSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricValueSet>
      PARSER = new com.google.protobuf.AbstractParser<MetricValueSet>() {
    @java.lang.Override
    public MetricValueSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetricValueSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricValueSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicecontrol.v1.MetricValueSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

