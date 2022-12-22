// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/common.proto

package com.google.devtools.resultstore.v2;

/**
 * <pre>
 * The timing of a particular Invocation, Action, etc. The start_time is
 * specified, stop time can be calculated by adding duration to start_time.
 * </pre>
 *
 * Protobuf type {@code google.devtools.resultstore.v2.Timing}
 */
public final class Timing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.resultstore.v2.Timing)
    TimingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Timing.newBuilder() to construct.
  private Timing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Timing() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Timing();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.resultstore.v2.CommonProto.internal_static_google_devtools_resultstore_v2_Timing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.resultstore.v2.CommonProto.internal_static_google_devtools_resultstore_v2_Timing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.resultstore.v2.Timing.class, com.google.devtools.resultstore.v2.Timing.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <pre>
   * The time the resource started running. This is in UTC Epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <pre>
   * The time the resource started running. This is in UTC Epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <pre>
   * The time the resource started running. This is in UTC Epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration duration_;
  /**
   * <pre>
   * The duration for which the resource ran.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <pre>
   * The duration for which the resource ran.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   * @return The duration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   * <pre>
   * The duration for which the resource ran.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
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
    if (startTime_ != null) {
      output.writeMessage(1, getStartTime());
    }
    if (duration_ != null) {
      output.writeMessage(2, getDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartTime());
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDuration());
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
    if (!(obj instanceof com.google.devtools.resultstore.v2.Timing)) {
      return super.equals(obj);
    }
    com.google.devtools.resultstore.v2.Timing other = (com.google.devtools.resultstore.v2.Timing) obj;

    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
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
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Timing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.Timing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.Timing parseFrom(
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
  public static Builder newBuilder(com.google.devtools.resultstore.v2.Timing prototype) {
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
   * The timing of a particular Invocation, Action, etc. The start_time is
   * specified, stop time can be calculated by adding duration to start_time.
   * </pre>
   *
   * Protobuf type {@code google.devtools.resultstore.v2.Timing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.resultstore.v2.Timing)
      com.google.devtools.resultstore.v2.TimingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.resultstore.v2.CommonProto.internal_static_google_devtools_resultstore_v2_Timing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.resultstore.v2.CommonProto.internal_static_google_devtools_resultstore_v2_Timing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.resultstore.v2.Timing.class, com.google.devtools.resultstore.v2.Timing.Builder.class);
    }

    // Construct using com.google.devtools.resultstore.v2.Timing.newBuilder()
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
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      duration_ = null;
      if (durationBuilder_ != null) {
        durationBuilder_.dispose();
        durationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.resultstore.v2.CommonProto.internal_static_google_devtools_resultstore_v2_Timing_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.Timing getDefaultInstanceForType() {
      return com.google.devtools.resultstore.v2.Timing.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.Timing build() {
      com.google.devtools.resultstore.v2.Timing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.Timing buildPartial() {
      com.google.devtools.resultstore.v2.Timing result = new com.google.devtools.resultstore.v2.Timing(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.resultstore.v2.Timing result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startTime_ = startTimeBuilder_ == null
            ? startTime_
            : startTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.duration_ = durationBuilder_ == null
            ? duration_
            : durationBuilder_.build();
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
      if (other instanceof com.google.devtools.resultstore.v2.Timing) {
        return mergeFrom((com.google.devtools.resultstore.v2.Timing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.resultstore.v2.Timing other) {
      if (other == com.google.devtools.resultstore.v2.Timing.getDefaultInstance()) return this;
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
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
                  getStartTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          startTime_ != null &&
          startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <pre>
     * The time the resource started running. This is in UTC Epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     * @return The duration.
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
      } else {
        durationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          duration_ != null &&
          duration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getDurationBuilder().mergeFrom(value);
        } else {
          duration_ = value;
        }
      } else {
        durationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      duration_ = null;
      if (durationBuilder_ != null) {
        durationBuilder_.dispose();
        durationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <pre>
     * The duration for which the resource ran.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.resultstore.v2.Timing)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.Timing)
  private static final com.google.devtools.resultstore.v2.Timing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.resultstore.v2.Timing();
  }

  public static com.google.devtools.resultstore.v2.Timing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Timing>
      PARSER = new com.google.protobuf.AbstractParser<Timing>() {
    @java.lang.Override
    public Timing parsePartialFrom(
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

  public static com.google.protobuf.Parser<Timing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Timing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.resultstore.v2.Timing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
