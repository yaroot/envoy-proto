// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/topic_stats.proto

package com.google.cloud.pubsublite.proto;

/**
 * <pre>
 * Compute the corresponding cursor for a publish or event time in a topic
 * partition.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.ComputeTimeCursorRequest}
 */
public final class ComputeTimeCursorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.ComputeTimeCursorRequest)
    ComputeTimeCursorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ComputeTimeCursorRequest.newBuilder() to construct.
  private ComputeTimeCursorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ComputeTimeCursorRequest() {
    topic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ComputeTimeCursorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.pubsublite.proto.TopicStatsProto.internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.TopicStatsProto.internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.class, com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object topic_ = "";
  /**
   * <pre>
   * Required. The topic for which we should compute the cursor.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The topic for which we should compute the cursor.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTITION_FIELD_NUMBER = 2;
  private long partition_ = 0L;
  /**
   * <pre>
   * Required. The partition for which we should compute the cursor.
   * </pre>
   *
   * <code>int64 partition = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The partition.
   */
  @java.lang.Override
  public long getPartition() {
    return partition_;
  }

  public static final int TARGET_FIELD_NUMBER = 3;
  private com.google.cloud.pubsublite.proto.TimeTarget target_;
  /**
   * <pre>
   * Required. The target publish or event time. Specifying a future time will return an
   * unset cursor.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the target field is set.
   */
  @java.lang.Override
  public boolean hasTarget() {
    return target_ != null;
  }
  /**
   * <pre>
   * Required. The target publish or event time. Specifying a future time will return an
   * unset cursor.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The target.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.TimeTarget getTarget() {
    return target_ == null ? com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance() : target_;
  }
  /**
   * <pre>
   * Required. The target publish or event time. Specifying a future time will return an
   * unset cursor.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.TimeTargetOrBuilder getTargetOrBuilder() {
    return target_ == null ? com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance() : target_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (partition_ != 0L) {
      output.writeInt64(2, partition_);
    }
    if (target_ != null) {
      output.writeMessage(3, getTarget());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (partition_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, partition_);
    }
    if (target_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTarget());
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest other = (com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest) obj;

    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (getPartition()
        != other.getPartition()) return false;
    if (hasTarget() != other.hasTarget()) return false;
    if (hasTarget()) {
      if (!getTarget()
          .equals(other.getTarget())) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + PARTITION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPartition());
    if (hasTarget()) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest prototype) {
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
   * Compute the corresponding cursor for a publish or event time in a topic
   * partition.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.ComputeTimeCursorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.ComputeTimeCursorRequest)
      com.google.cloud.pubsublite.proto.ComputeTimeCursorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.pubsublite.proto.TopicStatsProto.internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.TopicStatsProto.internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.class, com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.newBuilder()
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
      topic_ = "";
      partition_ = 0L;
      target_ = null;
      if (targetBuilder_ != null) {
        targetBuilder_.dispose();
        targetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.TopicStatsProto.internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest build() {
      com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest buildPartial() {
      com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest result = new com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topic_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.partition_ = partition_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.target_ = targetBuilder_ == null
            ? target_
            : targetBuilder_.build();
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
      if (other instanceof com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest other) {
      if (other == com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPartition() != 0L) {
        setPartition(other.getPartition());
      }
      if (other.hasTarget()) {
        mergeTarget(other.getTarget());
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
              topic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              partition_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getTargetFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object topic_ = "";
    /**
     * <pre>
     * Required. The topic for which we should compute the cursor.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The topic for which we should compute the cursor.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The topic for which we should compute the cursor.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The topic for which we should compute the cursor.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      topic_ = getDefaultInstance().getTopic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The topic for which we should compute the cursor.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long partition_ ;
    /**
     * <pre>
     * Required. The partition for which we should compute the cursor.
     * </pre>
     *
     * <code>int64 partition = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The partition.
     */
    @java.lang.Override
    public long getPartition() {
      return partition_;
    }
    /**
     * <pre>
     * Required. The partition for which we should compute the cursor.
     * </pre>
     *
     * <code>int64 partition = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The partition to set.
     * @return This builder for chaining.
     */
    public Builder setPartition(long value) {
      
      partition_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The partition for which we should compute the cursor.
     * </pre>
     *
     * <code>int64 partition = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      partition_ = 0L;
      onChanged();
      return this;
    }

    private com.google.cloud.pubsublite.proto.TimeTarget target_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.pubsublite.proto.TimeTarget, com.google.cloud.pubsublite.proto.TimeTarget.Builder, com.google.cloud.pubsublite.proto.TimeTargetOrBuilder> targetBuilder_;
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the target field is set.
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The target.
     */
    public com.google.cloud.pubsublite.proto.TimeTarget getTarget() {
      if (targetBuilder_ == null) {
        return target_ == null ? com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance() : target_;
      } else {
        return targetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTarget(com.google.cloud.pubsublite.proto.TimeTarget value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
      } else {
        targetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTarget(
        com.google.cloud.pubsublite.proto.TimeTarget.Builder builderForValue) {
      if (targetBuilder_ == null) {
        target_ = builderForValue.build();
      } else {
        targetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTarget(com.google.cloud.pubsublite.proto.TimeTarget value) {
      if (targetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          target_ != null &&
          target_ != com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance()) {
          getTargetBuilder().mergeFrom(value);
        } else {
          target_ = value;
        }
      } else {
        targetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTarget() {
      bitField0_ = (bitField0_ & ~0x00000004);
      target_ = null;
      if (targetBuilder_ != null) {
        targetBuilder_.dispose();
        targetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.pubsublite.proto.TimeTarget.Builder getTargetBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTargetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.pubsublite.proto.TimeTargetOrBuilder getTargetOrBuilder() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilder();
      } else {
        return target_ == null ?
            com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance() : target_;
      }
    }
    /**
     * <pre>
     * Required. The target publish or event time. Specifying a future time will return an
     * unset cursor.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.TimeTarget target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.pubsublite.proto.TimeTarget, com.google.cloud.pubsublite.proto.TimeTarget.Builder, com.google.cloud.pubsublite.proto.TimeTargetOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.TimeTarget, com.google.cloud.pubsublite.proto.TimeTarget.Builder, com.google.cloud.pubsublite.proto.TimeTargetOrBuilder>(
                getTarget(),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.ComputeTimeCursorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeTimeCursorRequest)
  private static final com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest();
  }

  public static com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeTimeCursorRequest>
      PARSER = new com.google.protobuf.AbstractParser<ComputeTimeCursorRequest>() {
    @java.lang.Override
    public ComputeTimeCursorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComputeTimeCursorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeTimeCursorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

