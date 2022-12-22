// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/percent.proto

package io.envoyproxy.envoy.type.v3;

/**
 * <pre>
 * A fractional percentage is used in cases in which for performance reasons performing floating
 * point to integer conversions during randomness calculations is undesirable. The message includes
 * both a numerator and denominator that together determine the final fractional value.
 * * **Example**: 1/100 = 1%.
 * * **Example**: 3/10000 = 0.03%.
 * </pre>
 *
 * Protobuf type {@code envoy.type.v3.FractionalPercent}
 */
public final class FractionalPercent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.v3.FractionalPercent)
    FractionalPercentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FractionalPercent.newBuilder() to construct.
  private FractionalPercent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FractionalPercent() {
    denominator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FractionalPercent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.type.v3.PercentProto.internal_static_envoy_type_v3_FractionalPercent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.type.v3.PercentProto.internal_static_envoy_type_v3_FractionalPercent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.type.v3.FractionalPercent.class, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder.class);
  }

  /**
   * <pre>
   * Fraction percentages support several fixed denominator values.
   * </pre>
   *
   * Protobuf enum {@code envoy.type.v3.FractionalPercent.DenominatorType}
   */
  public enum DenominatorType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 100.
     * **Example**: 1/100 = 1%.
     * </pre>
     *
     * <code>HUNDRED = 0;</code>
     */
    HUNDRED(0),
    /**
     * <pre>
     * 10,000.
     * **Example**: 1/10000 = 0.01%.
     * </pre>
     *
     * <code>TEN_THOUSAND = 1;</code>
     */
    TEN_THOUSAND(1),
    /**
     * <pre>
     * 1,000,000.
     * **Example**: 1/1000000 = 0.0001%.
     * </pre>
     *
     * <code>MILLION = 2;</code>
     */
    MILLION(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 100.
     * **Example**: 1/100 = 1%.
     * </pre>
     *
     * <code>HUNDRED = 0;</code>
     */
    public static final int HUNDRED_VALUE = 0;
    /**
     * <pre>
     * 10,000.
     * **Example**: 1/10000 = 0.01%.
     * </pre>
     *
     * <code>TEN_THOUSAND = 1;</code>
     */
    public static final int TEN_THOUSAND_VALUE = 1;
    /**
     * <pre>
     * 1,000,000.
     * **Example**: 1/1000000 = 0.0001%.
     * </pre>
     *
     * <code>MILLION = 2;</code>
     */
    public static final int MILLION_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DenominatorType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DenominatorType forNumber(int value) {
      switch (value) {
        case 0: return HUNDRED;
        case 1: return TEN_THOUSAND;
        case 2: return MILLION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DenominatorType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DenominatorType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DenominatorType>() {
            public DenominatorType findValueByNumber(int number) {
              return DenominatorType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.v3.FractionalPercent.getDescriptor().getEnumTypes().get(0);
    }

    private static final DenominatorType[] VALUES = values();

    public static DenominatorType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DenominatorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.type.v3.FractionalPercent.DenominatorType)
  }

  public static final int NUMERATOR_FIELD_NUMBER = 1;
  private int numerator_ = 0;
  /**
   * <pre>
   * Specifies the numerator. Defaults to 0.
   * </pre>
   *
   * <code>uint32 numerator = 1;</code>
   * @return The numerator.
   */
  @java.lang.Override
  public int getNumerator() {
    return numerator_;
  }

  public static final int DENOMINATOR_FIELD_NUMBER = 2;
  private int denominator_ = 0;
  /**
   * <pre>
   * Specifies the denominator. If the denominator specified is less than the numerator, the final
   * fractional percentage is capped at 1 (100%).
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for denominator.
   */
  @java.lang.Override public int getDenominatorValue() {
    return denominator_;
  }
  /**
   * <pre>
   * Specifies the denominator. If the denominator specified is less than the numerator, the final
   * fractional percentage is capped at 1 (100%).
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
   * @return The denominator.
   */
  @java.lang.Override public io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType getDenominator() {
    io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType result = io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType.forNumber(denominator_);
    return result == null ? io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType.UNRECOGNIZED : result;
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
    if (numerator_ != 0) {
      output.writeUInt32(1, numerator_);
    }
    if (denominator_ != io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType.HUNDRED.getNumber()) {
      output.writeEnum(2, denominator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numerator_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, numerator_);
    }
    if (denominator_ != io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType.HUNDRED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, denominator_);
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
    if (!(obj instanceof io.envoyproxy.envoy.type.v3.FractionalPercent)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.type.v3.FractionalPercent other = (io.envoyproxy.envoy.type.v3.FractionalPercent) obj;

    if (getNumerator()
        != other.getNumerator()) return false;
    if (denominator_ != other.denominator_) return false;
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
    hash = (37 * hash) + NUMERATOR_FIELD_NUMBER;
    hash = (53 * hash) + getNumerator();
    hash = (37 * hash) + DENOMINATOR_FIELD_NUMBER;
    hash = (53 * hash) + denominator_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.FractionalPercent parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.type.v3.FractionalPercent prototype) {
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
   * A fractional percentage is used in cases in which for performance reasons performing floating
   * point to integer conversions during randomness calculations is undesirable. The message includes
   * both a numerator and denominator that together determine the final fractional value.
   * * **Example**: 1/100 = 1%.
   * * **Example**: 3/10000 = 0.03%.
   * </pre>
   *
   * Protobuf type {@code envoy.type.v3.FractionalPercent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.v3.FractionalPercent)
      io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.v3.PercentProto.internal_static_envoy_type_v3_FractionalPercent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.type.v3.PercentProto.internal_static_envoy_type_v3_FractionalPercent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.type.v3.FractionalPercent.class, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.type.v3.FractionalPercent.newBuilder()
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
      numerator_ = 0;
      denominator_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.type.v3.PercentProto.internal_static_envoy_type_v3_FractionalPercent_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.FractionalPercent getDefaultInstanceForType() {
      return io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.FractionalPercent build() {
      io.envoyproxy.envoy.type.v3.FractionalPercent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.FractionalPercent buildPartial() {
      io.envoyproxy.envoy.type.v3.FractionalPercent result = new io.envoyproxy.envoy.type.v3.FractionalPercent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.type.v3.FractionalPercent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numerator_ = numerator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denominator_ = denominator_;
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
      if (other instanceof io.envoyproxy.envoy.type.v3.FractionalPercent) {
        return mergeFrom((io.envoyproxy.envoy.type.v3.FractionalPercent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.type.v3.FractionalPercent other) {
      if (other == io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance()) return this;
      if (other.getNumerator() != 0) {
        setNumerator(other.getNumerator());
      }
      if (other.denominator_ != 0) {
        setDenominatorValue(other.getDenominatorValue());
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
              numerator_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              denominator_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int numerator_ ;
    /**
     * <pre>
     * Specifies the numerator. Defaults to 0.
     * </pre>
     *
     * <code>uint32 numerator = 1;</code>
     * @return The numerator.
     */
    @java.lang.Override
    public int getNumerator() {
      return numerator_;
    }
    /**
     * <pre>
     * Specifies the numerator. Defaults to 0.
     * </pre>
     *
     * <code>uint32 numerator = 1;</code>
     * @param value The numerator to set.
     * @return This builder for chaining.
     */
    public Builder setNumerator(int value) {
      
      numerator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the numerator. Defaults to 0.
     * </pre>
     *
     * <code>uint32 numerator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumerator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numerator_ = 0;
      onChanged();
      return this;
    }

    private int denominator_ = 0;
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for denominator.
     */
    @java.lang.Override public int getDenominatorValue() {
      return denominator_;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for denominator to set.
     * @return This builder for chaining.
     */
    public Builder setDenominatorValue(int value) {
      denominator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     * @return The denominator.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType getDenominator() {
      io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType result = io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType.forNumber(denominator_);
      return result == null ? io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     * @param value The denominator to set.
     * @return This builder for chaining.
     */
    public Builder setDenominator(io.envoyproxy.envoy.type.v3.FractionalPercent.DenominatorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      denominator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDenominator() {
      bitField0_ = (bitField0_ & ~0x00000002);
      denominator_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.type.v3.FractionalPercent)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.v3.FractionalPercent)
  private static final io.envoyproxy.envoy.type.v3.FractionalPercent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.type.v3.FractionalPercent();
  }

  public static io.envoyproxy.envoy.type.v3.FractionalPercent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FractionalPercent>
      PARSER = new com.google.protobuf.AbstractParser<FractionalPercent>() {
    @java.lang.Override
    public FractionalPercent parsePartialFrom(
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

  public static com.google.protobuf.Parser<FractionalPercent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FractionalPercent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.FractionalPercent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
