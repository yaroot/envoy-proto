// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/core/v2alpha/health_check_event.proto

package io.envoyproxy.envoy.data.core.v2alpha;

/**
 * Protobuf type {@code envoy.data.core.v2alpha.HealthCheckFailure}
 */
public final class HealthCheckFailure extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.data.core.v2alpha.HealthCheckFailure)
    HealthCheckFailureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HealthCheckFailure.newBuilder() to construct.
  private HealthCheckFailure(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthCheckFailure() {
    failureType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HealthCheckFailure();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.data.core.v2alpha.HealthCheckEventProto.internal_static_envoy_data_core_v2alpha_HealthCheckFailure_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.data.core.v2alpha.HealthCheckEventProto.internal_static_envoy_data_core_v2alpha_HealthCheckFailure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.class, io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.Builder.class);
  }

  public static final int FAILURE_TYPE_FIELD_NUMBER = 1;
  private int failureType_ = 0;
  /**
   * <pre>
   * The type of failure that caused this event.
   * </pre>
   *
   * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for failureType.
   */
  @java.lang.Override public int getFailureTypeValue() {
    return failureType_;
  }
  /**
   * <pre>
   * The type of failure that caused this event.
   * </pre>
   *
   * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
   * @return The failureType.
   */
  @java.lang.Override public io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType getFailureType() {
    io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType result = io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType.forNumber(failureType_);
    return result == null ? io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType.UNRECOGNIZED : result;
  }

  public static final int FIRST_CHECK_FIELD_NUMBER = 2;
  private boolean firstCheck_ = false;
  /**
   * <pre>
   * Whether this event is the result of the first ever health check on a host.
   * </pre>
   *
   * <code>bool first_check = 2;</code>
   * @return The firstCheck.
   */
  @java.lang.Override
  public boolean getFirstCheck() {
    return firstCheck_;
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
    if (failureType_ != io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType.ACTIVE.getNumber()) {
      output.writeEnum(1, failureType_);
    }
    if (firstCheck_ != false) {
      output.writeBool(2, firstCheck_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (failureType_ != io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType.ACTIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, failureType_);
    }
    if (firstCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, firstCheck_);
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
    if (!(obj instanceof io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure other = (io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure) obj;

    if (failureType_ != other.failureType_) return false;
    if (getFirstCheck()
        != other.getFirstCheck()) return false;
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
    hash = (37 * hash) + FAILURE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + failureType_;
    hash = (37 * hash) + FIRST_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFirstCheck());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure prototype) {
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
   * Protobuf type {@code envoy.data.core.v2alpha.HealthCheckFailure}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.data.core.v2alpha.HealthCheckFailure)
      io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.data.core.v2alpha.HealthCheckEventProto.internal_static_envoy_data_core_v2alpha_HealthCheckFailure_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.data.core.v2alpha.HealthCheckEventProto.internal_static_envoy_data_core_v2alpha_HealthCheckFailure_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.class, io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.newBuilder()
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
      failureType_ = 0;
      firstCheck_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.data.core.v2alpha.HealthCheckEventProto.internal_static_envoy_data_core_v2alpha_HealthCheckFailure_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure getDefaultInstanceForType() {
      return io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure build() {
      io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure buildPartial() {
      io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure result = new io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.failureType_ = failureType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.firstCheck_ = firstCheck_;
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
      if (other instanceof io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure) {
        return mergeFrom((io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure other) {
      if (other == io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure.getDefaultInstance()) return this;
      if (other.failureType_ != 0) {
        setFailureTypeValue(other.getFailureTypeValue());
      }
      if (other.getFirstCheck() != false) {
        setFirstCheck(other.getFirstCheck());
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
              failureType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              firstCheck_ = input.readBool();
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

    private int failureType_ = 0;
    /**
     * <pre>
     * The type of failure that caused this event.
     * </pre>
     *
     * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for failureType.
     */
    @java.lang.Override public int getFailureTypeValue() {
      return failureType_;
    }
    /**
     * <pre>
     * The type of failure that caused this event.
     * </pre>
     *
     * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for failureType to set.
     * @return This builder for chaining.
     */
    public Builder setFailureTypeValue(int value) {
      failureType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of failure that caused this event.
     * </pre>
     *
     * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @return The failureType.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType getFailureType() {
      io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType result = io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType.forNumber(failureType_);
      return result == null ? io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of failure that caused this event.
     * </pre>
     *
     * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @param value The failureType to set.
     * @return This builder for chaining.
     */
    public Builder setFailureType(io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      failureType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of failure that caused this event.
     * </pre>
     *
     * <code>.envoy.data.core.v2alpha.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      failureType_ = 0;
      onChanged();
      return this;
    }

    private boolean firstCheck_ ;
    /**
     * <pre>
     * Whether this event is the result of the first ever health check on a host.
     * </pre>
     *
     * <code>bool first_check = 2;</code>
     * @return The firstCheck.
     */
    @java.lang.Override
    public boolean getFirstCheck() {
      return firstCheck_;
    }
    /**
     * <pre>
     * Whether this event is the result of the first ever health check on a host.
     * </pre>
     *
     * <code>bool first_check = 2;</code>
     * @param value The firstCheck to set.
     * @return This builder for chaining.
     */
    public Builder setFirstCheck(boolean value) {
      
      firstCheck_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether this event is the result of the first ever health check on a host.
     * </pre>
     *
     * <code>bool first_check = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstCheck() {
      bitField0_ = (bitField0_ & ~0x00000002);
      firstCheck_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.data.core.v2alpha.HealthCheckFailure)
  }

  // @@protoc_insertion_point(class_scope:envoy.data.core.v2alpha.HealthCheckFailure)
  private static final io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure();
  }

  public static io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthCheckFailure>
      PARSER = new com.google.protobuf.AbstractParser<HealthCheckFailure>() {
    @java.lang.Override
    public HealthCheckFailure parsePartialFrom(
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

  public static com.google.protobuf.Parser<HealthCheckFailure> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthCheckFailure> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.data.core.v2alpha.HealthCheckFailure getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

