// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1/budget_model.proto

package com.google.cloud.billing.budgets.v1;

/**
 * <pre>
 * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.budgets.v1.CustomPeriod}
 */
public final class CustomPeriod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.budgets.v1.CustomPeriod)
    CustomPeriodOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomPeriod.newBuilder() to construct.
  private CustomPeriod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomPeriod() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomPeriod();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.billing.budgets.v1.BudgetModelProto.internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.budgets.v1.BudgetModelProto.internal_static_google_cloud_billing_budgets_v1_CustomPeriod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.budgets.v1.CustomPeriod.class, com.google.cloud.billing.budgets.v1.CustomPeriod.Builder.class);
  }

  public static final int START_DATE_FIELD_NUMBER = 1;
  private com.google.type.Date startDate_;
  /**
   * <pre>
   * Required. The start date must be after January 1, 2017.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the startDate field is set.
   */
  @java.lang.Override
  public boolean hasStartDate() {
    return startDate_ != null;
  }
  /**
   * <pre>
   * Required. The start date must be after January 1, 2017.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The startDate.
   */
  @java.lang.Override
  public com.google.type.Date getStartDate() {
    return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
  }
  /**
   * <pre>
   * Required. The start date must be after January 1, 2017.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.type.DateOrBuilder getStartDateOrBuilder() {
    return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
  }

  public static final int END_DATE_FIELD_NUMBER = 2;
  private com.google.type.Date endDate_;
  /**
   * <pre>
   * Optional. The end date of the time period. Budgets with elapsed end date
   * won't be processed. If unset, specifies to track all usage incurred since
   * the start_date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the endDate field is set.
   */
  @java.lang.Override
  public boolean hasEndDate() {
    return endDate_ != null;
  }
  /**
   * <pre>
   * Optional. The end date of the time period. Budgets with elapsed end date
   * won't be processed. If unset, specifies to track all usage incurred since
   * the start_date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The endDate.
   */
  @java.lang.Override
  public com.google.type.Date getEndDate() {
    return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
  }
  /**
   * <pre>
   * Optional. The end date of the time period. Budgets with elapsed end date
   * won't be processed. If unset, specifies to track all usage incurred since
   * the start_date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.type.DateOrBuilder getEndDateOrBuilder() {
    return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
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
    if (startDate_ != null) {
      output.writeMessage(1, getStartDate());
    }
    if (endDate_ != null) {
      output.writeMessage(2, getEndDate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartDate());
    }
    if (endDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndDate());
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
    if (!(obj instanceof com.google.cloud.billing.budgets.v1.CustomPeriod)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.budgets.v1.CustomPeriod other = (com.google.cloud.billing.budgets.v1.CustomPeriod) obj;

    if (hasStartDate() != other.hasStartDate()) return false;
    if (hasStartDate()) {
      if (!getStartDate()
          .equals(other.getStartDate())) return false;
    }
    if (hasEndDate() != other.hasEndDate()) return false;
    if (hasEndDate()) {
      if (!getEndDate()
          .equals(other.getEndDate())) return false;
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
    if (hasStartDate()) {
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getStartDate().hashCode();
    }
    if (hasEndDate()) {
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getEndDate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.budgets.v1.CustomPeriod parseFrom(
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
  public static Builder newBuilder(com.google.cloud.billing.budgets.v1.CustomPeriod prototype) {
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
   * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.budgets.v1.CustomPeriod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.budgets.v1.CustomPeriod)
      com.google.cloud.billing.budgets.v1.CustomPeriodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.billing.budgets.v1.BudgetModelProto.internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.budgets.v1.BudgetModelProto.internal_static_google_cloud_billing_budgets_v1_CustomPeriod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.budgets.v1.CustomPeriod.class, com.google.cloud.billing.budgets.v1.CustomPeriod.Builder.class);
    }

    // Construct using com.google.cloud.billing.budgets.v1.CustomPeriod.newBuilder()
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
      startDate_ = null;
      if (startDateBuilder_ != null) {
        startDateBuilder_.dispose();
        startDateBuilder_ = null;
      }
      endDate_ = null;
      if (endDateBuilder_ != null) {
        endDateBuilder_.dispose();
        endDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.billing.budgets.v1.BudgetModelProto.internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.CustomPeriod getDefaultInstanceForType() {
      return com.google.cloud.billing.budgets.v1.CustomPeriod.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.CustomPeriod build() {
      com.google.cloud.billing.budgets.v1.CustomPeriod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.CustomPeriod buildPartial() {
      com.google.cloud.billing.budgets.v1.CustomPeriod result = new com.google.cloud.billing.budgets.v1.CustomPeriod(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.billing.budgets.v1.CustomPeriod result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startDate_ = startDateBuilder_ == null
            ? startDate_
            : startDateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endDate_ = endDateBuilder_ == null
            ? endDate_
            : endDateBuilder_.build();
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
      if (other instanceof com.google.cloud.billing.budgets.v1.CustomPeriod) {
        return mergeFrom((com.google.cloud.billing.budgets.v1.CustomPeriod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.budgets.v1.CustomPeriod other) {
      if (other == com.google.cloud.billing.budgets.v1.CustomPeriod.getDefaultInstance()) return this;
      if (other.hasStartDate()) {
        mergeStartDate(other.getStartDate());
      }
      if (other.hasEndDate()) {
        mergeEndDate(other.getEndDate());
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
                  getStartDateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndDateFieldBuilder().getBuilder(),
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

    private com.google.type.Date startDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> startDateBuilder_;
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the startDate field is set.
     */
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The startDate.
     */
    public com.google.type.Date getStartDate() {
      if (startDateBuilder_ == null) {
        return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
      } else {
        return startDateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setStartDate(com.google.type.Date value) {
      if (startDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startDate_ = value;
      } else {
        startDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setStartDate(
        com.google.type.Date.Builder builderForValue) {
      if (startDateBuilder_ == null) {
        startDate_ = builderForValue.build();
      } else {
        startDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeStartDate(com.google.type.Date value) {
      if (startDateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          startDate_ != null &&
          startDate_ != com.google.type.Date.getDefaultInstance()) {
          getStartDateBuilder().mergeFrom(value);
        } else {
          startDate_ = value;
        }
      } else {
        startDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startDate_ = null;
      if (startDateBuilder_ != null) {
        startDateBuilder_.dispose();
        startDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.type.Date.Builder getStartDateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartDateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.type.DateOrBuilder getStartDateOrBuilder() {
      if (startDateBuilder_ != null) {
        return startDateBuilder_.getMessageOrBuilder();
      } else {
        return startDate_ == null ?
            com.google.type.Date.getDefaultInstance() : startDate_;
      }
    }
    /**
     * <pre>
     * Required. The start date must be after January 1, 2017.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> 
        getStartDateFieldBuilder() {
      if (startDateBuilder_ == null) {
        startDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getStartDate(),
                getParentForChildren(),
                isClean());
        startDate_ = null;
      }
      return startDateBuilder_;
    }

    private com.google.type.Date endDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> endDateBuilder_;
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the endDate field is set.
     */
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The endDate.
     */
    public com.google.type.Date getEndDate() {
      if (endDateBuilder_ == null) {
        return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
      } else {
        return endDateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setEndDate(com.google.type.Date value) {
      if (endDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endDate_ = value;
      } else {
        endDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setEndDate(
        com.google.type.Date.Builder builderForValue) {
      if (endDateBuilder_ == null) {
        endDate_ = builderForValue.build();
      } else {
        endDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeEndDate(com.google.type.Date value) {
      if (endDateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          endDate_ != null &&
          endDate_ != com.google.type.Date.getDefaultInstance()) {
          getEndDateBuilder().mergeFrom(value);
        } else {
          endDate_ = value;
        }
      } else {
        endDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearEndDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endDate_ = null;
      if (endDateBuilder_ != null) {
        endDateBuilder_.dispose();
        endDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.type.Date.Builder getEndDateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndDateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.type.DateOrBuilder getEndDateOrBuilder() {
      if (endDateBuilder_ != null) {
        return endDateBuilder_.getMessageOrBuilder();
      } else {
        return endDate_ == null ?
            com.google.type.Date.getDefaultInstance() : endDate_;
      }
    }
    /**
     * <pre>
     * Optional. The end date of the time period. Budgets with elapsed end date
     * won't be processed. If unset, specifies to track all usage incurred since
     * the start_date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> 
        getEndDateFieldBuilder() {
      if (endDateBuilder_ == null) {
        endDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getEndDate(),
                getParentForChildren(),
                isClean());
        endDate_ = null;
      }
      return endDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.billing.budgets.v1.CustomPeriod)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.budgets.v1.CustomPeriod)
  private static final com.google.cloud.billing.budgets.v1.CustomPeriod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.budgets.v1.CustomPeriod();
  }

  public static com.google.cloud.billing.budgets.v1.CustomPeriod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomPeriod>
      PARSER = new com.google.protobuf.AbstractParser<CustomPeriod>() {
    @java.lang.Override
    public CustomPeriod parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomPeriod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomPeriod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.budgets.v1.CustomPeriod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

