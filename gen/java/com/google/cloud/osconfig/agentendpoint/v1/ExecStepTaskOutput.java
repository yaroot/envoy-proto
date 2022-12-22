// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/agentendpoint/v1/tasks.proto

package com.google.cloud.osconfig.agentendpoint.v1;

/**
 * <pre>
 * Information reported from the agent about the exec step execution.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput}
 */
public final class ExecStepTaskOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)
    ExecStepTaskOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecStepTaskOutput.newBuilder() to construct.
  private ExecStepTaskOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecStepTaskOutput() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecStepTaskOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.agentendpoint.v1.Tasks.internal_static_google_cloud_osconfig_agentendpoint_v1_ExecStepTaskOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.agentendpoint.v1.Tasks.internal_static_google_cloud_osconfig_agentendpoint_v1_ExecStepTaskOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.class, com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.Builder.class);
  }

  /**
   * <pre>
   * The final states of exec steps.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified is invalid.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * The exec step completed normally.
     * </pre>
     *
     * <code>COMPLETED = 1;</code>
     */
    COMPLETED(1),
    /**
     * <pre>
     * The exec step was terminated because it took too long.
     * </pre>
     *
     * <code>TIMED_OUT = 2;</code>
     */
    TIMED_OUT(2),
    /**
     * <pre>
     * The exec step task was cancelled before it started.
     * </pre>
     *
     * <code>CANCELLED = 3;</code>
     */
    CANCELLED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified is invalid.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The exec step completed normally.
     * </pre>
     *
     * <code>COMPLETED = 1;</code>
     */
    public static final int COMPLETED_VALUE = 1;
    /**
     * <pre>
     * The exec step was terminated because it took too long.
     * </pre>
     *
     * <code>TIMED_OUT = 2;</code>
     */
    public static final int TIMED_OUT_VALUE = 2;
    /**
     * <pre>
     * The exec step task was cancelled before it started.
     * </pre>
     *
     * <code>CANCELLED = 3;</code>
     */
    public static final int CANCELLED_VALUE = 3;


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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return STATE_UNSPECIFIED;
        case 1: return COMPLETED;
        case 2: return TIMED_OUT;
        case 3: return CANCELLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
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
      return com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
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

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   * <pre>
   * Required. The final state of the exec step.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Required. The final state of the exec step.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State getState() {
    com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State result = com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State.forNumber(state_);
    return result == null ? com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State.UNRECOGNIZED : result;
  }

  public static final int EXIT_CODE_FIELD_NUMBER = 2;
  private int exitCode_ = 0;
  /**
   * <pre>
   * Required. The exit code received from the script which ran as part of the exec step.
   * </pre>
   *
   * <code>int32 exit_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The exitCode.
   */
  @java.lang.Override
  public int getExitCode() {
    return exitCode_;
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
    if (state_ != com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (exitCode_ != 0) {
      output.writeInt32(2, exitCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    if (exitCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, exitCode_);
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
    if (!(obj instanceof com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput other = (com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput) obj;

    if (state_ != other.state_) return false;
    if (getExitCode()
        != other.getExitCode()) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + EXIT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getExitCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput parseFrom(
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
  public static Builder newBuilder(com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput prototype) {
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
   * Information reported from the agent about the exec step execution.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)
      com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.agentendpoint.v1.Tasks.internal_static_google_cloud_osconfig_agentendpoint_v1_ExecStepTaskOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.agentendpoint.v1.Tasks.internal_static_google_cloud_osconfig_agentendpoint_v1_ExecStepTaskOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.class, com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.newBuilder()
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
      state_ = 0;
      exitCode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.agentendpoint.v1.Tasks.internal_static_google_cloud_osconfig_agentendpoint_v1_ExecStepTaskOutput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput getDefaultInstanceForType() {
      return com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput build() {
      com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput buildPartial() {
      com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput result = new com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exitCode_ = exitCode_;
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
      if (other instanceof com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput) {
        return mergeFrom((com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput other) {
      if (other == com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getExitCode() != 0) {
        setExitCode(other.getExitCode());
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
              state_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              exitCode_ = input.readInt32();
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

    private int state_ = 0;
    /**
     * <pre>
     * Required. The final state of the exec step.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Required. The final state of the exec step.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The final state of the exec step.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State getState() {
      com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State result = com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State.forNumber(state_);
      return result == null ? com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The final state of the exec step.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The final state of the exec step.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State state = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private int exitCode_ ;
    /**
     * <pre>
     * Required. The exit code received from the script which ran as part of the exec step.
     * </pre>
     *
     * <code>int32 exit_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The exitCode.
     */
    @java.lang.Override
    public int getExitCode() {
      return exitCode_;
    }
    /**
     * <pre>
     * Required. The exit code received from the script which ran as part of the exec step.
     * </pre>
     *
     * <code>int32 exit_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The exitCode to set.
     * @return This builder for chaining.
     */
    public Builder setExitCode(int value) {
      
      exitCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The exit code received from the script which ran as part of the exec step.
     * </pre>
     *
     * <code>int32 exit_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearExitCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      exitCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)
  private static final com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput();
  }

  public static com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecStepTaskOutput>
      PARSER = new com.google.protobuf.AbstractParser<ExecStepTaskOutput>() {
    @java.lang.Override
    public ExecStepTaskOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExecStepTaskOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecStepTaskOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
