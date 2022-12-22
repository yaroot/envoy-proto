// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/type/date_range.proto

package com.google.actions.type;

/**
 * <pre>
 * Represents a range based on whole or partial calendar dates, e.g. the
 * duration of a hotel reservation or the Common Era. This can represent:
 * * A range between full dates, e.g. the duration of a hotel reservation
 * * A range between years, e.g. a historical era
 * * A range between year/month dates, e.g. the duration of a job on a resume
 * * A range beginning in a year, e.g. the Common Era
 * * A range ending on a specific date, e.g. the period of time before an event
 * While [google.type.Date][google.type.Date] allows zero years, DateRange does not. Year must
 * always be non-zero.
 * End cannot be chronologically before start. For example, if start has year
 * 2000, end cannot have year 1999.
 * When both set, start and end must have exactly the same precision. That is,
 * they must have the same fields populated with non-zero values. For example,
 * if start specifies only year and month, then end must also specify only year
 * and month (but not day).
 * The date range is inclusive. That is, the dates specified by start and end
 * are part of the date range. For example, the date January 1, 2000 falls
 * within any date with start or end equal to January 1, 2000. When determining
 * whether a date is inside a date range, the date should only be compared to
 * start and end when those values are set.
 * When a date and date range are specified to different degrees of precision,
 * the rules for evaluating whether that date is inside the date range are as
 * follows:
 *  * When comparing the date to the start of the date range, unspecified months
 *    should be replaced with 1, and unspecified days should be replaced with 1.
 *    For example, the year 2000 is within the date range with start equal to
 *    January 1, 2000 and no end. And the date January 1, 2000 is within the
 *    date range with start equal to the year 2000 and no end.
 *  * When comparing the date to the end of the date range, unspecified months
 *    should be replaced with 12, and unspecified days should be replaced with
 *    the last valid day for the month/year. For example, the year 2000 is
 *    within the date range with start equal to January 1, 1999 and end equal to
 *    December 31, 2000. And the date December 31, 2001 is within the date range
 *    with start equal to the year 2000 and end equal to the year 2001.
 * The semantics of start and end are the same as those of [google.type.Date][google.type.Date],
 * except that year must always be non-zero in DateRange.
 * </pre>
 *
 * Protobuf type {@code google.actions.type.DateRange}
 */
public final class DateRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.type.DateRange)
    DateRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateRange.newBuilder() to construct.
  private DateRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateRange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DateRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.type.DateRangeProto.internal_static_google_actions_type_DateRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.type.DateRangeProto.internal_static_google_actions_type_DateRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.type.DateRange.class, com.google.actions.type.DateRange.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private com.google.type.Date start_;
  /**
   * <pre>
   * Date at which the date range begins. If unset, the date range has no
   * beginning bound.
   * </pre>
   *
   * <code>.google.type.Date start = 1;</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return start_ != null;
  }
  /**
   * <pre>
   * Date at which the date range begins. If unset, the date range has no
   * beginning bound.
   * </pre>
   *
   * <code>.google.type.Date start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public com.google.type.Date getStart() {
    return start_ == null ? com.google.type.Date.getDefaultInstance() : start_;
  }
  /**
   * <pre>
   * Date at which the date range begins. If unset, the date range has no
   * beginning bound.
   * </pre>
   *
   * <code>.google.type.Date start = 1;</code>
   */
  @java.lang.Override
  public com.google.type.DateOrBuilder getStartOrBuilder() {
    return start_ == null ? com.google.type.Date.getDefaultInstance() : start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private com.google.type.Date end_;
  /**
   * <pre>
   * Date at which the date range ends. If unset, the date range has no ending
   * bound.
   * </pre>
   *
   * <code>.google.type.Date end = 2;</code>
   * @return Whether the end field is set.
   */
  @java.lang.Override
  public boolean hasEnd() {
    return end_ != null;
  }
  /**
   * <pre>
   * Date at which the date range ends. If unset, the date range has no ending
   * bound.
   * </pre>
   *
   * <code>.google.type.Date end = 2;</code>
   * @return The end.
   */
  @java.lang.Override
  public com.google.type.Date getEnd() {
    return end_ == null ? com.google.type.Date.getDefaultInstance() : end_;
  }
  /**
   * <pre>
   * Date at which the date range ends. If unset, the date range has no ending
   * bound.
   * </pre>
   *
   * <code>.google.type.Date end = 2;</code>
   */
  @java.lang.Override
  public com.google.type.DateOrBuilder getEndOrBuilder() {
    return end_ == null ? com.google.type.Date.getDefaultInstance() : end_;
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
    if (start_ != null) {
      output.writeMessage(1, getStart());
    }
    if (end_ != null) {
      output.writeMessage(2, getEnd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStart());
    }
    if (end_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEnd());
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
    if (!(obj instanceof com.google.actions.type.DateRange)) {
      return super.equals(obj);
    }
    com.google.actions.type.DateRange other = (com.google.actions.type.DateRange) obj;

    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasEnd() != other.hasEnd()) return false;
    if (hasEnd()) {
      if (!getEnd()
          .equals(other.getEnd())) return false;
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
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.type.DateRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.type.DateRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.type.DateRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.type.DateRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.type.DateRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.type.DateRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.type.DateRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.type.DateRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.type.DateRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.type.DateRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.type.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.type.DateRange parseFrom(
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
  public static Builder newBuilder(com.google.actions.type.DateRange prototype) {
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
   * Represents a range based on whole or partial calendar dates, e.g. the
   * duration of a hotel reservation or the Common Era. This can represent:
   * * A range between full dates, e.g. the duration of a hotel reservation
   * * A range between years, e.g. a historical era
   * * A range between year/month dates, e.g. the duration of a job on a resume
   * * A range beginning in a year, e.g. the Common Era
   * * A range ending on a specific date, e.g. the period of time before an event
   * While [google.type.Date][google.type.Date] allows zero years, DateRange does not. Year must
   * always be non-zero.
   * End cannot be chronologically before start. For example, if start has year
   * 2000, end cannot have year 1999.
   * When both set, start and end must have exactly the same precision. That is,
   * they must have the same fields populated with non-zero values. For example,
   * if start specifies only year and month, then end must also specify only year
   * and month (but not day).
   * The date range is inclusive. That is, the dates specified by start and end
   * are part of the date range. For example, the date January 1, 2000 falls
   * within any date with start or end equal to January 1, 2000. When determining
   * whether a date is inside a date range, the date should only be compared to
   * start and end when those values are set.
   * When a date and date range are specified to different degrees of precision,
   * the rules for evaluating whether that date is inside the date range are as
   * follows:
   *  * When comparing the date to the start of the date range, unspecified months
   *    should be replaced with 1, and unspecified days should be replaced with 1.
   *    For example, the year 2000 is within the date range with start equal to
   *    January 1, 2000 and no end. And the date January 1, 2000 is within the
   *    date range with start equal to the year 2000 and no end.
   *  * When comparing the date to the end of the date range, unspecified months
   *    should be replaced with 12, and unspecified days should be replaced with
   *    the last valid day for the month/year. For example, the year 2000 is
   *    within the date range with start equal to January 1, 1999 and end equal to
   *    December 31, 2000. And the date December 31, 2001 is within the date range
   *    with start equal to the year 2000 and end equal to the year 2001.
   * The semantics of start and end are the same as those of [google.type.Date][google.type.Date],
   * except that year must always be non-zero in DateRange.
   * </pre>
   *
   * Protobuf type {@code google.actions.type.DateRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.type.DateRange)
      com.google.actions.type.DateRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.type.DateRangeProto.internal_static_google_actions_type_DateRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.type.DateRangeProto.internal_static_google_actions_type_DateRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.type.DateRange.class, com.google.actions.type.DateRange.Builder.class);
    }

    // Construct using com.google.actions.type.DateRange.newBuilder()
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
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.type.DateRangeProto.internal_static_google_actions_type_DateRange_descriptor;
    }

    @java.lang.Override
    public com.google.actions.type.DateRange getDefaultInstanceForType() {
      return com.google.actions.type.DateRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.type.DateRange build() {
      com.google.actions.type.DateRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.type.DateRange buildPartial() {
      com.google.actions.type.DateRange result = new com.google.actions.type.DateRange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.actions.type.DateRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = startBuilder_ == null
            ? start_
            : startBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = endBuilder_ == null
            ? end_
            : endBuilder_.build();
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
      if (other instanceof com.google.actions.type.DateRange) {
        return mergeFrom((com.google.actions.type.DateRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.type.DateRange other) {
      if (other == com.google.actions.type.DateRange.getDefaultInstance()) return this;
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
                  getStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndFieldBuilder().getBuilder(),
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

    private com.google.type.Date start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> startBuilder_;
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     * @return The start.
     */
    public com.google.type.Date getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? com.google.type.Date.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    public Builder setStart(com.google.type.Date value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
      } else {
        startBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    public Builder setStart(
        com.google.type.Date.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    public Builder mergeStart(com.google.type.Date value) {
      if (startBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          start_ != null &&
          start_ != com.google.type.Date.getDefaultInstance()) {
          getStartBuilder().mergeFrom(value);
        } else {
          start_ = value;
        }
      } else {
        startBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    public com.google.type.Date.Builder getStartBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    public com.google.type.DateOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            com.google.type.Date.getDefaultInstance() : start_;
      }
    }
    /**
     * <pre>
     * Date at which the date range begins. If unset, the date range has no
     * beginning bound.
     * </pre>
     *
     * <code>.google.type.Date start = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private com.google.type.Date end_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> endBuilder_;
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     * @return Whether the end field is set.
     */
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     * @return The end.
     */
    public com.google.type.Date getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? com.google.type.Date.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    public Builder setEnd(com.google.type.Date value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
      } else {
        endBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    public Builder setEnd(
        com.google.type.Date.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    public Builder mergeEnd(com.google.type.Date value) {
      if (endBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          end_ != null &&
          end_ != com.google.type.Date.getDefaultInstance()) {
          getEndBuilder().mergeFrom(value);
        } else {
          end_ = value;
        }
      } else {
        endBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    public com.google.type.Date.Builder getEndBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    public com.google.type.DateOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ?
            com.google.type.Date.getDefaultInstance() : end_;
      }
    }
    /**
     * <pre>
     * Date at which the date range ends. If unset, the date range has no ending
     * bound.
     * </pre>
     *
     * <code>.google.type.Date end = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder> 
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getEnd(),
                getParentForChildren(),
                isClean());
        end_ = null;
      }
      return endBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.actions.type.DateRange)
  }

  // @@protoc_insertion_point(class_scope:google.actions.type.DateRange)
  private static final com.google.actions.type.DateRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.type.DateRange();
  }

  public static com.google.actions.type.DateRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateRange>
      PARSER = new com.google.protobuf.AbstractParser<DateRange>() {
    @java.lang.Override
    public DateRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<DateRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.type.DateRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

