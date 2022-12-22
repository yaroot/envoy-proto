// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/number.proto

package io.envoyproxy.envoy.type.matcher;

/**
 * <pre>
 * Specifies the way to match a double value.
 * </pre>
 *
 * Protobuf type {@code envoy.type.matcher.DoubleMatcher}
 */
public final class DoubleMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.matcher.DoubleMatcher)
    DoubleMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DoubleMatcher.newBuilder() to construct.
  private DoubleMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DoubleMatcher() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DoubleMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.type.matcher.NumberProto.internal_static_envoy_type_matcher_DoubleMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.type.matcher.NumberProto.internal_static_envoy_type_matcher_DoubleMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.type.matcher.DoubleMatcher.class, io.envoyproxy.envoy.type.matcher.DoubleMatcher.Builder.class);
  }

  private int matchPatternCase_ = 0;
  private java.lang.Object matchPattern_;
  public enum MatchPatternCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RANGE(1),
    EXACT(2),
    MATCHPATTERN_NOT_SET(0);
    private final int value;
    private MatchPatternCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MatchPatternCase valueOf(int value) {
      return forNumber(value);
    }

    public static MatchPatternCase forNumber(int value) {
      switch (value) {
        case 1: return RANGE;
        case 2: return EXACT;
        case 0: return MATCHPATTERN_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MatchPatternCase
  getMatchPatternCase() {
    return MatchPatternCase.forNumber(
        matchPatternCase_);
  }

  public static final int RANGE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * If specified, the input double value must be in the range specified here.
   * Note: The range is using half-open interval semantics [start, end).
   * </pre>
   *
   * <code>.envoy.type.DoubleRange range = 1;</code>
   * @return Whether the range field is set.
   */
  @java.lang.Override
  public boolean hasRange() {
    return matchPatternCase_ == 1;
  }
  /**
   * <pre>
   * If specified, the input double value must be in the range specified here.
   * Note: The range is using half-open interval semantics [start, end).
   * </pre>
   *
   * <code>.envoy.type.DoubleRange range = 1;</code>
   * @return The range.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.DoubleRange getRange() {
    if (matchPatternCase_ == 1) {
       return (io.envoyproxy.envoy.type.DoubleRange) matchPattern_;
    }
    return io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance();
  }
  /**
   * <pre>
   * If specified, the input double value must be in the range specified here.
   * Note: The range is using half-open interval semantics [start, end).
   * </pre>
   *
   * <code>.envoy.type.DoubleRange range = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.DoubleRangeOrBuilder getRangeOrBuilder() {
    if (matchPatternCase_ == 1) {
       return (io.envoyproxy.envoy.type.DoubleRange) matchPattern_;
    }
    return io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance();
  }

  public static final int EXACT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * If specified, the input double value must be equal to the value specified here.
   * </pre>
   *
   * <code>double exact = 2;</code>
   * @return Whether the exact field is set.
   */
  @java.lang.Override
  public boolean hasExact() {
    return matchPatternCase_ == 2;
  }
  /**
   * <pre>
   * If specified, the input double value must be equal to the value specified here.
   * </pre>
   *
   * <code>double exact = 2;</code>
   * @return The exact.
   */
  @java.lang.Override
  public double getExact() {
    if (matchPatternCase_ == 2) {
      return (java.lang.Double) matchPattern_;
    }
    return 0D;
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
    if (matchPatternCase_ == 1) {
      output.writeMessage(1, (io.envoyproxy.envoy.type.DoubleRange) matchPattern_);
    }
    if (matchPatternCase_ == 2) {
      output.writeDouble(
          2, (double)((java.lang.Double) matchPattern_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (matchPatternCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.envoyproxy.envoy.type.DoubleRange) matchPattern_);
    }
    if (matchPatternCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((java.lang.Double) matchPattern_));
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
    if (!(obj instanceof io.envoyproxy.envoy.type.matcher.DoubleMatcher)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.type.matcher.DoubleMatcher other = (io.envoyproxy.envoy.type.matcher.DoubleMatcher) obj;

    if (!getMatchPatternCase().equals(other.getMatchPatternCase())) return false;
    switch (matchPatternCase_) {
      case 1:
        if (!getRange()
            .equals(other.getRange())) return false;
        break;
      case 2:
        if (java.lang.Double.doubleToLongBits(getExact())
            != java.lang.Double.doubleToLongBits(
                other.getExact())) return false;
        break;
      case 0:
      default:
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
    switch (matchPatternCase_) {
      case 1:
        hash = (37 * hash) + RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getRange().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EXACT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getExact()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.type.matcher.DoubleMatcher prototype) {
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
   * Specifies the way to match a double value.
   * </pre>
   *
   * Protobuf type {@code envoy.type.matcher.DoubleMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.matcher.DoubleMatcher)
      io.envoyproxy.envoy.type.matcher.DoubleMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.matcher.NumberProto.internal_static_envoy_type_matcher_DoubleMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.type.matcher.NumberProto.internal_static_envoy_type_matcher_DoubleMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.type.matcher.DoubleMatcher.class, io.envoyproxy.envoy.type.matcher.DoubleMatcher.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.type.matcher.DoubleMatcher.newBuilder()
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
      if (rangeBuilder_ != null) {
        rangeBuilder_.clear();
      }
      matchPatternCase_ = 0;
      matchPattern_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.type.matcher.NumberProto.internal_static_envoy_type_matcher_DoubleMatcher_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.DoubleMatcher getDefaultInstanceForType() {
      return io.envoyproxy.envoy.type.matcher.DoubleMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.DoubleMatcher build() {
      io.envoyproxy.envoy.type.matcher.DoubleMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.DoubleMatcher buildPartial() {
      io.envoyproxy.envoy.type.matcher.DoubleMatcher result = new io.envoyproxy.envoy.type.matcher.DoubleMatcher(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.type.matcher.DoubleMatcher result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(io.envoyproxy.envoy.type.matcher.DoubleMatcher result) {
      result.matchPatternCase_ = matchPatternCase_;
      result.matchPattern_ = this.matchPattern_;
      if (matchPatternCase_ == 1 &&
          rangeBuilder_ != null) {
        result.matchPattern_ = rangeBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.type.matcher.DoubleMatcher) {
        return mergeFrom((io.envoyproxy.envoy.type.matcher.DoubleMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.type.matcher.DoubleMatcher other) {
      if (other == io.envoyproxy.envoy.type.matcher.DoubleMatcher.getDefaultInstance()) return this;
      switch (other.getMatchPatternCase()) {
        case RANGE: {
          mergeRange(other.getRange());
          break;
        }
        case EXACT: {
          setExact(other.getExact());
          break;
        }
        case MATCHPATTERN_NOT_SET: {
          break;
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
              input.readMessage(
                  getRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              matchPatternCase_ = 1;
              break;
            } // case 10
            case 17: {
              matchPattern_ = input.readDouble();
              matchPatternCase_ = 2;
              break;
            } // case 17
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
    private int matchPatternCase_ = 0;
    private java.lang.Object matchPattern_;
    public MatchPatternCase
        getMatchPatternCase() {
      return MatchPatternCase.forNumber(
          matchPatternCase_);
    }

    public Builder clearMatchPattern() {
      matchPatternCase_ = 0;
      matchPattern_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.DoubleRange, io.envoyproxy.envoy.type.DoubleRange.Builder, io.envoyproxy.envoy.type.DoubleRangeOrBuilder> rangeBuilder_;
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     * @return Whether the range field is set.
     */
    @java.lang.Override
    public boolean hasRange() {
      return matchPatternCase_ == 1;
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     * @return The range.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.DoubleRange getRange() {
      if (rangeBuilder_ == null) {
        if (matchPatternCase_ == 1) {
          return (io.envoyproxy.envoy.type.DoubleRange) matchPattern_;
        }
        return io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance();
      } else {
        if (matchPatternCase_ == 1) {
          return rangeBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    public Builder setRange(io.envoyproxy.envoy.type.DoubleRange value) {
      if (rangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        matchPattern_ = value;
        onChanged();
      } else {
        rangeBuilder_.setMessage(value);
      }
      matchPatternCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    public Builder setRange(
        io.envoyproxy.envoy.type.DoubleRange.Builder builderForValue) {
      if (rangeBuilder_ == null) {
        matchPattern_ = builderForValue.build();
        onChanged();
      } else {
        rangeBuilder_.setMessage(builderForValue.build());
      }
      matchPatternCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    public Builder mergeRange(io.envoyproxy.envoy.type.DoubleRange value) {
      if (rangeBuilder_ == null) {
        if (matchPatternCase_ == 1 &&
            matchPattern_ != io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance()) {
          matchPattern_ = io.envoyproxy.envoy.type.DoubleRange.newBuilder((io.envoyproxy.envoy.type.DoubleRange) matchPattern_)
              .mergeFrom(value).buildPartial();
        } else {
          matchPattern_ = value;
        }
        onChanged();
      } else {
        if (matchPatternCase_ == 1) {
          rangeBuilder_.mergeFrom(value);
        } else {
          rangeBuilder_.setMessage(value);
        }
      }
      matchPatternCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    public Builder clearRange() {
      if (rangeBuilder_ == null) {
        if (matchPatternCase_ == 1) {
          matchPatternCase_ = 0;
          matchPattern_ = null;
          onChanged();
        }
      } else {
        if (matchPatternCase_ == 1) {
          matchPatternCase_ = 0;
          matchPattern_ = null;
        }
        rangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    public io.envoyproxy.envoy.type.DoubleRange.Builder getRangeBuilder() {
      return getRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.DoubleRangeOrBuilder getRangeOrBuilder() {
      if ((matchPatternCase_ == 1) && (rangeBuilder_ != null)) {
        return rangeBuilder_.getMessageOrBuilder();
      } else {
        if (matchPatternCase_ == 1) {
          return (io.envoyproxy.envoy.type.DoubleRange) matchPattern_;
        }
        return io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If specified, the input double value must be in the range specified here.
     * Note: The range is using half-open interval semantics [start, end).
     * </pre>
     *
     * <code>.envoy.type.DoubleRange range = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.DoubleRange, io.envoyproxy.envoy.type.DoubleRange.Builder, io.envoyproxy.envoy.type.DoubleRangeOrBuilder> 
        getRangeFieldBuilder() {
      if (rangeBuilder_ == null) {
        if (!(matchPatternCase_ == 1)) {
          matchPattern_ = io.envoyproxy.envoy.type.DoubleRange.getDefaultInstance();
        }
        rangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.DoubleRange, io.envoyproxy.envoy.type.DoubleRange.Builder, io.envoyproxy.envoy.type.DoubleRangeOrBuilder>(
                (io.envoyproxy.envoy.type.DoubleRange) matchPattern_,
                getParentForChildren(),
                isClean());
        matchPattern_ = null;
      }
      matchPatternCase_ = 1;
      onChanged();
      return rangeBuilder_;
    }

    /**
     * <pre>
     * If specified, the input double value must be equal to the value specified here.
     * </pre>
     *
     * <code>double exact = 2;</code>
     * @return Whether the exact field is set.
     */
    public boolean hasExact() {
      return matchPatternCase_ == 2;
    }
    /**
     * <pre>
     * If specified, the input double value must be equal to the value specified here.
     * </pre>
     *
     * <code>double exact = 2;</code>
     * @return The exact.
     */
    public double getExact() {
      if (matchPatternCase_ == 2) {
        return (java.lang.Double) matchPattern_;
      }
      return 0D;
    }
    /**
     * <pre>
     * If specified, the input double value must be equal to the value specified here.
     * </pre>
     *
     * <code>double exact = 2;</code>
     * @param value The exact to set.
     * @return This builder for chaining.
     */
    public Builder setExact(double value) {
      
      matchPatternCase_ = 2;
      matchPattern_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If specified, the input double value must be equal to the value specified here.
     * </pre>
     *
     * <code>double exact = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExact() {
      if (matchPatternCase_ == 2) {
        matchPatternCase_ = 0;
        matchPattern_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:envoy.type.matcher.DoubleMatcher)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.matcher.DoubleMatcher)
  private static final io.envoyproxy.envoy.type.matcher.DoubleMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.type.matcher.DoubleMatcher();
  }

  public static io.envoyproxy.envoy.type.matcher.DoubleMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoubleMatcher>
      PARSER = new com.google.protobuf.AbstractParser<DoubleMatcher>() {
    @java.lang.Override
    public DoubleMatcher parsePartialFrom(
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

  public static com.google.protobuf.Parser<DoubleMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.DoubleMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

