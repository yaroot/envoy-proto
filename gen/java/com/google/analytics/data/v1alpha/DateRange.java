// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 * <pre>
 * A contiguous set of days: startDate, startDate + 1, ..., endDate. Requests
 * are allowed up to 4 date ranges.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.DateRange}
 */
public final class DateRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.DateRange)
    DateRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateRange.newBuilder() to construct.
  private DateRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateRange() {
    startDate_ = "";
    endDate_ = "";
    name_ = "";
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
    return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_DateRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_DateRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.DateRange.class, com.google.analytics.data.v1alpha.DateRange.Builder.class);
  }

  public static final int START_DATE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object startDate_ = "";
  /**
   * <pre>
   * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
   * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
   * accepted, and in that case, the date is inferred based on the property's
   * reporting time zone.
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
   * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
   * accepted, and in that case, the date is inferred based on the property's
   * reporting time zone.
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The bytes for startDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_DATE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object endDate_ = "";
  /**
   * <pre>
   * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
   * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
   * also accepted, and in that case, the date is inferred based on the
   * property's reporting time zone.
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The endDate.
   */
  @java.lang.Override
  public java.lang.String getEndDate() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
   * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
   * also accepted, and in that case, the date is inferred based on the
   * property's reporting time zone.
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The bytes for endDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndDateBytes() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Assigns a name to this date range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, date ranges are named by their zero based index in
   * the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Assigns a name to this date range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, date ranges are named by their zero based index in
   * the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, startDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, endDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, startDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, endDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.DateRange)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.DateRange other = (com.google.analytics.data.v1alpha.DateRange) obj;

    if (!getStartDate()
        .equals(other.getStartDate())) return false;
    if (!getEndDate()
        .equals(other.getEndDate())) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + START_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getStartDate().hashCode();
    hash = (37 * hash) + END_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getEndDate().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1alpha.DateRange parseFrom(
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
  public static Builder newBuilder(com.google.analytics.data.v1alpha.DateRange prototype) {
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
   * A contiguous set of days: startDate, startDate + 1, ..., endDate. Requests
   * are allowed up to 4 date ranges.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.DateRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.DateRange)
      com.google.analytics.data.v1alpha.DateRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_DateRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_DateRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.DateRange.class, com.google.analytics.data.v1alpha.DateRange.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.DateRange.newBuilder()
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
      startDate_ = "";
      endDate_ = "";
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_DateRange_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DateRange getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.DateRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DateRange build() {
      com.google.analytics.data.v1alpha.DateRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DateRange buildPartial() {
      com.google.analytics.data.v1alpha.DateRange result = new com.google.analytics.data.v1alpha.DateRange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.DateRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startDate_ = startDate_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endDate_ = endDate_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.google.analytics.data.v1alpha.DateRange) {
        return mergeFrom((com.google.analytics.data.v1alpha.DateRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.DateRange other) {
      if (other == com.google.analytics.data.v1alpha.DateRange.getDefaultInstance()) return this;
      if (!other.getStartDate().isEmpty()) {
        startDate_ = other.startDate_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEndDate().isEmpty()) {
        endDate_ = other.endDate_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
              startDate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              endDate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              name_ = input.readStringRequireUtf8();
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

    private java.lang.Object startDate_ = "";
    /**
     * <pre>
     * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
     * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
     * accepted, and in that case, the date is inferred based on the property's
     * reporting time zone.
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
     * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
     * accepted, and in that case, the date is inferred based on the property's
     * reporting time zone.
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
     * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
     * accepted, and in that case, the date is inferred based on the property's
     * reporting time zone.
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      startDate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
     * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
     * accepted, and in that case, the date is inferred based on the property's
     * reporting time zone.
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      startDate_ = getDefaultInstance().getStartDate();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
     * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
     * accepted, and in that case, the date is inferred based on the property's
     * reporting time zone.
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      startDate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object endDate_ = "";
    /**
     * <pre>
     * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
     * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
     * also accepted, and in that case, the date is inferred based on the
     * property's reporting time zone.
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @return The endDate.
     */
    public java.lang.String getEndDate() {
      java.lang.Object ref = endDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
     * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
     * also accepted, and in that case, the date is inferred based on the
     * property's reporting time zone.
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @return The bytes for endDate.
     */
    public com.google.protobuf.ByteString
        getEndDateBytes() {
      java.lang.Object ref = endDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
     * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
     * also accepted, and in that case, the date is inferred based on the
     * property's reporting time zone.
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @param value The endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      endDate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
     * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
     * also accepted, and in that case, the date is inferred based on the
     * property's reporting time zone.
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDate() {
      endDate_ = getDefaultInstance().getEndDate();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
     * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
     * also accepted, and in that case, the date is inferred based on the
     * property's reporting time zone.
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @param value The bytes for endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      endDate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Assigns a name to this date range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, date ranges are named by their zero based index in
     * the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Assigns a name to this date range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, date ranges are named by their zero based index in
     * the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Assigns a name to this date range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, date ranges are named by their zero based index in
     * the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assigns a name to this date range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, date ranges are named by their zero based index in
     * the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assigns a name to this date range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, date ranges are named by their zero based index in
     * the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.DateRange)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.DateRange)
  private static final com.google.analytics.data.v1alpha.DateRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.DateRange();
  }

  public static com.google.analytics.data.v1alpha.DateRange getDefaultInstance() {
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
  public com.google.analytics.data.v1alpha.DateRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

