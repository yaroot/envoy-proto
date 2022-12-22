// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A schedule for disks where the schedueled operations are performed.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule}
 */
public final class ResourcePolicySnapshotSchedulePolicySchedule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)
    ResourcePolicySnapshotSchedulePolicyScheduleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourcePolicySnapshotSchedulePolicySchedule.newBuilder() to construct.
  private ResourcePolicySnapshotSchedulePolicySchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourcePolicySnapshotSchedulePolicySchedule() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourcePolicySnapshotSchedulePolicySchedule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicySchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicySchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.class, com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.Builder.class);
  }

  private int bitField0_;
  public static final int DAILY_SCHEDULE_FIELD_NUMBER = 86159869;
  private com.google.cloud.compute.v1.ResourcePolicyDailyCycle dailySchedule_;
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
   * @return Whether the dailySchedule field is set.
   */
  @java.lang.Override
  public boolean hasDailySchedule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
   * @return The dailySchedule.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyDailyCycle getDailySchedule() {
    return dailySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyDailyCycle.getDefaultInstance() : dailySchedule_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyDailyCycleOrBuilder getDailyScheduleOrBuilder() {
    return dailySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyDailyCycle.getDefaultInstance() : dailySchedule_;
  }

  public static final int HOURLY_SCHEDULE_FIELD_NUMBER = 38328485;
  private com.google.cloud.compute.v1.ResourcePolicyHourlyCycle hourlySchedule_;
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
   * @return Whether the hourlySchedule field is set.
   */
  @java.lang.Override
  public boolean hasHourlySchedule() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
   * @return The hourlySchedule.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle getHourlySchedule() {
    return hourlySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance() : hourlySchedule_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder getHourlyScheduleOrBuilder() {
    return hourlySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance() : hourlySchedule_;
  }

  public static final int WEEKLY_SCHEDULE_FIELD_NUMBER = 359548053;
  private com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle weeklySchedule_;
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
   * @return Whether the weeklySchedule field is set.
   */
  @java.lang.Override
  public boolean hasWeeklySchedule() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
   * @return The weeklySchedule.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle getWeeklySchedule() {
    return weeklySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance() : weeklySchedule_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder getWeeklyScheduleOrBuilder() {
    return weeklySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance() : weeklySchedule_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(38328485, getHourlySchedule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(86159869, getDailySchedule());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(359548053, getWeeklySchedule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(38328485, getHourlySchedule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(86159869, getDailySchedule());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(359548053, getWeeklySchedule());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule other = (com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule) obj;

    if (hasDailySchedule() != other.hasDailySchedule()) return false;
    if (hasDailySchedule()) {
      if (!getDailySchedule()
          .equals(other.getDailySchedule())) return false;
    }
    if (hasHourlySchedule() != other.hasHourlySchedule()) return false;
    if (hasHourlySchedule()) {
      if (!getHourlySchedule()
          .equals(other.getHourlySchedule())) return false;
    }
    if (hasWeeklySchedule() != other.hasWeeklySchedule()) return false;
    if (hasWeeklySchedule()) {
      if (!getWeeklySchedule()
          .equals(other.getWeeklySchedule())) return false;
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
    if (hasDailySchedule()) {
      hash = (37 * hash) + DAILY_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getDailySchedule().hashCode();
    }
    if (hasHourlySchedule()) {
      hash = (37 * hash) + HOURLY_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getHourlySchedule().hashCode();
    }
    if (hasWeeklySchedule()) {
      hash = (37 * hash) + WEEKLY_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getWeeklySchedule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule prototype) {
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
   * A schedule for disks where the schedueled operations are performed.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicySchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicySchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.class, com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDailyScheduleFieldBuilder();
        getHourlyScheduleFieldBuilder();
        getWeeklyScheduleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dailySchedule_ = null;
      if (dailyScheduleBuilder_ != null) {
        dailyScheduleBuilder_.dispose();
        dailyScheduleBuilder_ = null;
      }
      hourlySchedule_ = null;
      if (hourlyScheduleBuilder_ != null) {
        hourlyScheduleBuilder_.dispose();
        hourlyScheduleBuilder_ = null;
      }
      weeklySchedule_ = null;
      if (weeklyScheduleBuilder_ != null) {
        weeklyScheduleBuilder_.dispose();
        weeklyScheduleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicySchedule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule build() {
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule buildPartial() {
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule result = new com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dailySchedule_ = dailyScheduleBuilder_ == null
            ? dailySchedule_
            : dailyScheduleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hourlySchedule_ = hourlyScheduleBuilder_ == null
            ? hourlySchedule_
            : hourlyScheduleBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.weeklySchedule_ = weeklyScheduleBuilder_ == null
            ? weeklySchedule_
            : weeklyScheduleBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule) {
        return mergeFrom((com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule other) {
      if (other == com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule.getDefaultInstance()) return this;
      if (other.hasDailySchedule()) {
        mergeDailySchedule(other.getDailySchedule());
      }
      if (other.hasHourlySchedule()) {
        mergeHourlySchedule(other.getHourlySchedule());
      }
      if (other.hasWeeklySchedule()) {
        mergeWeeklySchedule(other.getWeeklySchedule());
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
            case 306627882: {
              input.readMessage(
                  getHourlyScheduleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 306627882
            case 689278954: {
              input.readMessage(
                  getDailyScheduleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 689278954
            case -1418582870: {
              input.readMessage(
                  getWeeklyScheduleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case -1418582870
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

    private com.google.cloud.compute.v1.ResourcePolicyDailyCycle dailySchedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyDailyCycle, com.google.cloud.compute.v1.ResourcePolicyDailyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyDailyCycleOrBuilder> dailyScheduleBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     * @return Whether the dailySchedule field is set.
     */
    public boolean hasDailySchedule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     * @return The dailySchedule.
     */
    public com.google.cloud.compute.v1.ResourcePolicyDailyCycle getDailySchedule() {
      if (dailyScheduleBuilder_ == null) {
        return dailySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyDailyCycle.getDefaultInstance() : dailySchedule_;
      } else {
        return dailyScheduleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    public Builder setDailySchedule(com.google.cloud.compute.v1.ResourcePolicyDailyCycle value) {
      if (dailyScheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dailySchedule_ = value;
      } else {
        dailyScheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    public Builder setDailySchedule(
        com.google.cloud.compute.v1.ResourcePolicyDailyCycle.Builder builderForValue) {
      if (dailyScheduleBuilder_ == null) {
        dailySchedule_ = builderForValue.build();
      } else {
        dailyScheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    public Builder mergeDailySchedule(com.google.cloud.compute.v1.ResourcePolicyDailyCycle value) {
      if (dailyScheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dailySchedule_ != null &&
          dailySchedule_ != com.google.cloud.compute.v1.ResourcePolicyDailyCycle.getDefaultInstance()) {
          getDailyScheduleBuilder().mergeFrom(value);
        } else {
          dailySchedule_ = value;
        }
      } else {
        dailyScheduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    public Builder clearDailySchedule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dailySchedule_ = null;
      if (dailyScheduleBuilder_ != null) {
        dailyScheduleBuilder_.dispose();
        dailyScheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyDailyCycle.Builder getDailyScheduleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDailyScheduleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyDailyCycleOrBuilder getDailyScheduleOrBuilder() {
      if (dailyScheduleBuilder_ != null) {
        return dailyScheduleBuilder_.getMessageOrBuilder();
      } else {
        return dailySchedule_ == null ?
            com.google.cloud.compute.v1.ResourcePolicyDailyCycle.getDefaultInstance() : dailySchedule_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyDailyCycle, com.google.cloud.compute.v1.ResourcePolicyDailyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyDailyCycleOrBuilder> 
        getDailyScheduleFieldBuilder() {
      if (dailyScheduleBuilder_ == null) {
        dailyScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ResourcePolicyDailyCycle, com.google.cloud.compute.v1.ResourcePolicyDailyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyDailyCycleOrBuilder>(
                getDailySchedule(),
                getParentForChildren(),
                isClean());
        dailySchedule_ = null;
      }
      return dailyScheduleBuilder_;
    }

    private com.google.cloud.compute.v1.ResourcePolicyHourlyCycle hourlySchedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyHourlyCycle, com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder> hourlyScheduleBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     * @return Whether the hourlySchedule field is set.
     */
    public boolean hasHourlySchedule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     * @return The hourlySchedule.
     */
    public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle getHourlySchedule() {
      if (hourlyScheduleBuilder_ == null) {
        return hourlySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance() : hourlySchedule_;
      } else {
        return hourlyScheduleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    public Builder setHourlySchedule(com.google.cloud.compute.v1.ResourcePolicyHourlyCycle value) {
      if (hourlyScheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hourlySchedule_ = value;
      } else {
        hourlyScheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    public Builder setHourlySchedule(
        com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder builderForValue) {
      if (hourlyScheduleBuilder_ == null) {
        hourlySchedule_ = builderForValue.build();
      } else {
        hourlyScheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    public Builder mergeHourlySchedule(com.google.cloud.compute.v1.ResourcePolicyHourlyCycle value) {
      if (hourlyScheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          hourlySchedule_ != null &&
          hourlySchedule_ != com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance()) {
          getHourlyScheduleBuilder().mergeFrom(value);
        } else {
          hourlySchedule_ = value;
        }
      } else {
        hourlyScheduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    public Builder clearHourlySchedule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hourlySchedule_ = null;
      if (hourlyScheduleBuilder_ != null) {
        hourlyScheduleBuilder_.dispose();
        hourlyScheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder getHourlyScheduleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHourlyScheduleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder getHourlyScheduleOrBuilder() {
      if (hourlyScheduleBuilder_ != null) {
        return hourlyScheduleBuilder_.getMessageOrBuilder();
      } else {
        return hourlySchedule_ == null ?
            com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance() : hourlySchedule_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyHourlyCycle, com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder> 
        getHourlyScheduleFieldBuilder() {
      if (hourlyScheduleBuilder_ == null) {
        hourlyScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ResourcePolicyHourlyCycle, com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder>(
                getHourlySchedule(),
                getParentForChildren(),
                isClean());
        hourlySchedule_ = null;
      }
      return hourlyScheduleBuilder_;
    }

    private com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle weeklySchedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder> weeklyScheduleBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     * @return Whether the weeklySchedule field is set.
     */
    public boolean hasWeeklySchedule() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     * @return The weeklySchedule.
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle getWeeklySchedule() {
      if (weeklyScheduleBuilder_ == null) {
        return weeklySchedule_ == null ? com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance() : weeklySchedule_;
      } else {
        return weeklyScheduleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    public Builder setWeeklySchedule(com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle value) {
      if (weeklyScheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        weeklySchedule_ = value;
      } else {
        weeklyScheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    public Builder setWeeklySchedule(
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder builderForValue) {
      if (weeklyScheduleBuilder_ == null) {
        weeklySchedule_ = builderForValue.build();
      } else {
        weeklyScheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    public Builder mergeWeeklySchedule(com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle value) {
      if (weeklyScheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          weeklySchedule_ != null &&
          weeklySchedule_ != com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance()) {
          getWeeklyScheduleBuilder().mergeFrom(value);
        } else {
          weeklySchedule_ = value;
        }
      } else {
        weeklyScheduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    public Builder clearWeeklySchedule() {
      bitField0_ = (bitField0_ & ~0x00000004);
      weeklySchedule_ = null;
      if (weeklyScheduleBuilder_ != null) {
        weeklyScheduleBuilder_.dispose();
        weeklyScheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder getWeeklyScheduleBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getWeeklyScheduleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder getWeeklyScheduleOrBuilder() {
      if (weeklyScheduleBuilder_ != null) {
        return weeklyScheduleBuilder_.getMessageOrBuilder();
      } else {
        return weeklySchedule_ == null ?
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance() : weeklySchedule_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder> 
        getWeeklyScheduleFieldBuilder() {
      if (weeklyScheduleBuilder_ == null) {
        weeklyScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder>(
                getWeeklySchedule(),
                getParentForChildren(),
                isClean());
        weeklySchedule_ = null;
      }
      return weeklyScheduleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)
  private static final com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule();
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourcePolicySnapshotSchedulePolicySchedule>
      PARSER = new com.google.protobuf.AbstractParser<ResourcePolicySnapshotSchedulePolicySchedule>() {
    @java.lang.Override
    public ResourcePolicySnapshotSchedulePolicySchedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourcePolicySnapshotSchedulePolicySchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcePolicySnapshotSchedulePolicySchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

