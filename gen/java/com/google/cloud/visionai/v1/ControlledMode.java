// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/streaming_service.proto

package com.google.cloud.visionai.v1;

/**
 * <pre>
 * The options for receiver under the controlled mode.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.ControlledMode}
 */
public final class ControlledMode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.ControlledMode)
    ControlledModeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ControlledMode.newBuilder() to construct.
  private ControlledMode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ControlledMode() {
    fallbackStartingOffset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ControlledMode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.visionai.v1.StreamingServiceProto.internal_static_google_cloud_visionai_v1_ControlledMode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.StreamingServiceProto.internal_static_google_cloud_visionai_v1_ControlledMode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.ControlledMode.class, com.google.cloud.visionai.v1.ControlledMode.Builder.class);
  }

  private int startingOffsetCase_ = 0;
  private java.lang.Object startingOffset_;
  public enum StartingOffsetCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STARTING_LOGICAL_OFFSET(1),
    STARTINGOFFSET_NOT_SET(0);
    private final int value;
    private StartingOffsetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StartingOffsetCase valueOf(int value) {
      return forNumber(value);
    }

    public static StartingOffsetCase forNumber(int value) {
      switch (value) {
        case 1: return STARTING_LOGICAL_OFFSET;
        case 0: return STARTINGOFFSET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StartingOffsetCase
  getStartingOffsetCase() {
    return StartingOffsetCase.forNumber(
        startingOffsetCase_);
  }

  public static final int STARTING_LOGICAL_OFFSET_FIELD_NUMBER = 1;
  /**
   * <pre>
   * This can be set to the following logical starting points:
   * "begin": This will read from the earliest available message.
   * "most-recent": This will read from the latest available message.
   * "end": This will read only future messages.
   * "stored": This will resume reads one past the last committed offset.
   *           It is the only option that resumes progress; all others
   *           jump unilaterally.
   * </pre>
   *
   * <code>string starting_logical_offset = 1;</code>
   * @return Whether the startingLogicalOffset field is set.
   */
  public boolean hasStartingLogicalOffset() {
    return startingOffsetCase_ == 1;
  }
  /**
   * <pre>
   * This can be set to the following logical starting points:
   * "begin": This will read from the earliest available message.
   * "most-recent": This will read from the latest available message.
   * "end": This will read only future messages.
   * "stored": This will resume reads one past the last committed offset.
   *           It is the only option that resumes progress; all others
   *           jump unilaterally.
   * </pre>
   *
   * <code>string starting_logical_offset = 1;</code>
   * @return The startingLogicalOffset.
   */
  public java.lang.String getStartingLogicalOffset() {
    java.lang.Object ref = "";
    if (startingOffsetCase_ == 1) {
      ref = startingOffset_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (startingOffsetCase_ == 1) {
        startingOffset_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * This can be set to the following logical starting points:
   * "begin": This will read from the earliest available message.
   * "most-recent": This will read from the latest available message.
   * "end": This will read only future messages.
   * "stored": This will resume reads one past the last committed offset.
   *           It is the only option that resumes progress; all others
   *           jump unilaterally.
   * </pre>
   *
   * <code>string starting_logical_offset = 1;</code>
   * @return The bytes for startingLogicalOffset.
   */
  public com.google.protobuf.ByteString
      getStartingLogicalOffsetBytes() {
    java.lang.Object ref = "";
    if (startingOffsetCase_ == 1) {
      ref = startingOffset_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (startingOffsetCase_ == 1) {
        startingOffset_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FALLBACK_STARTING_OFFSET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fallbackStartingOffset_ = "";
  /**
   * <pre>
   * This is the logical starting point to fallback upon should the
   * specified starting offset be unavailable.
   * This can be one of the following values:
   * "begin": This will read from the earliest available message.
   * "end": This will read only future messages.
   * </pre>
   *
   * <code>string fallback_starting_offset = 2;</code>
   * @return The fallbackStartingOffset.
   */
  @java.lang.Override
  public java.lang.String getFallbackStartingOffset() {
    java.lang.Object ref = fallbackStartingOffset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fallbackStartingOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is the logical starting point to fallback upon should the
   * specified starting offset be unavailable.
   * This can be one of the following values:
   * "begin": This will read from the earliest available message.
   * "end": This will read only future messages.
   * </pre>
   *
   * <code>string fallback_starting_offset = 2;</code>
   * @return The bytes for fallbackStartingOffset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFallbackStartingOffsetBytes() {
    java.lang.Object ref = fallbackStartingOffset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fallbackStartingOffset_ = b;
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
    if (startingOffsetCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, startingOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fallbackStartingOffset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fallbackStartingOffset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startingOffsetCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, startingOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fallbackStartingOffset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fallbackStartingOffset_);
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
    if (!(obj instanceof com.google.cloud.visionai.v1.ControlledMode)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.ControlledMode other = (com.google.cloud.visionai.v1.ControlledMode) obj;

    if (!getFallbackStartingOffset()
        .equals(other.getFallbackStartingOffset())) return false;
    if (!getStartingOffsetCase().equals(other.getStartingOffsetCase())) return false;
    switch (startingOffsetCase_) {
      case 1:
        if (!getStartingLogicalOffset()
            .equals(other.getStartingLogicalOffset())) return false;
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
    hash = (37 * hash) + FALLBACK_STARTING_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getFallbackStartingOffset().hashCode();
    switch (startingOffsetCase_) {
      case 1:
        hash = (37 * hash) + STARTING_LOGICAL_OFFSET_FIELD_NUMBER;
        hash = (53 * hash) + getStartingLogicalOffset().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1.ControlledMode parseFrom(
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
  public static Builder newBuilder(com.google.cloud.visionai.v1.ControlledMode prototype) {
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
   * The options for receiver under the controlled mode.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.ControlledMode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.ControlledMode)
      com.google.cloud.visionai.v1.ControlledModeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.visionai.v1.StreamingServiceProto.internal_static_google_cloud_visionai_v1_ControlledMode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.StreamingServiceProto.internal_static_google_cloud_visionai_v1_ControlledMode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.ControlledMode.class, com.google.cloud.visionai.v1.ControlledMode.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.ControlledMode.newBuilder()
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
      fallbackStartingOffset_ = "";
      startingOffsetCase_ = 0;
      startingOffset_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.visionai.v1.StreamingServiceProto.internal_static_google_cloud_visionai_v1_ControlledMode_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ControlledMode getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.ControlledMode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ControlledMode build() {
      com.google.cloud.visionai.v1.ControlledMode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ControlledMode buildPartial() {
      com.google.cloud.visionai.v1.ControlledMode result = new com.google.cloud.visionai.v1.ControlledMode(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.ControlledMode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fallbackStartingOffset_ = fallbackStartingOffset_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.visionai.v1.ControlledMode result) {
      result.startingOffsetCase_ = startingOffsetCase_;
      result.startingOffset_ = this.startingOffset_;
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
      if (other instanceof com.google.cloud.visionai.v1.ControlledMode) {
        return mergeFrom((com.google.cloud.visionai.v1.ControlledMode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.ControlledMode other) {
      if (other == com.google.cloud.visionai.v1.ControlledMode.getDefaultInstance()) return this;
      if (!other.getFallbackStartingOffset().isEmpty()) {
        fallbackStartingOffset_ = other.fallbackStartingOffset_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getStartingOffsetCase()) {
        case STARTING_LOGICAL_OFFSET: {
          startingOffsetCase_ = 1;
          startingOffset_ = other.startingOffset_;
          onChanged();
          break;
        }
        case STARTINGOFFSET_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              startingOffsetCase_ = 1;
              startingOffset_ = s;
              break;
            } // case 10
            case 18: {
              fallbackStartingOffset_ = input.readStringRequireUtf8();
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
    private int startingOffsetCase_ = 0;
    private java.lang.Object startingOffset_;
    public StartingOffsetCase
        getStartingOffsetCase() {
      return StartingOffsetCase.forNumber(
          startingOffsetCase_);
    }

    public Builder clearStartingOffset() {
      startingOffsetCase_ = 0;
      startingOffset_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * This can be set to the following logical starting points:
     * "begin": This will read from the earliest available message.
     * "most-recent": This will read from the latest available message.
     * "end": This will read only future messages.
     * "stored": This will resume reads one past the last committed offset.
     *           It is the only option that resumes progress; all others
     *           jump unilaterally.
     * </pre>
     *
     * <code>string starting_logical_offset = 1;</code>
     * @return Whether the startingLogicalOffset field is set.
     */
    @java.lang.Override
    public boolean hasStartingLogicalOffset() {
      return startingOffsetCase_ == 1;
    }
    /**
     * <pre>
     * This can be set to the following logical starting points:
     * "begin": This will read from the earliest available message.
     * "most-recent": This will read from the latest available message.
     * "end": This will read only future messages.
     * "stored": This will resume reads one past the last committed offset.
     *           It is the only option that resumes progress; all others
     *           jump unilaterally.
     * </pre>
     *
     * <code>string starting_logical_offset = 1;</code>
     * @return The startingLogicalOffset.
     */
    @java.lang.Override
    public java.lang.String getStartingLogicalOffset() {
      java.lang.Object ref = "";
      if (startingOffsetCase_ == 1) {
        ref = startingOffset_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (startingOffsetCase_ == 1) {
          startingOffset_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This can be set to the following logical starting points:
     * "begin": This will read from the earliest available message.
     * "most-recent": This will read from the latest available message.
     * "end": This will read only future messages.
     * "stored": This will resume reads one past the last committed offset.
     *           It is the only option that resumes progress; all others
     *           jump unilaterally.
     * </pre>
     *
     * <code>string starting_logical_offset = 1;</code>
     * @return The bytes for startingLogicalOffset.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStartingLogicalOffsetBytes() {
      java.lang.Object ref = "";
      if (startingOffsetCase_ == 1) {
        ref = startingOffset_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (startingOffsetCase_ == 1) {
          startingOffset_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This can be set to the following logical starting points:
     * "begin": This will read from the earliest available message.
     * "most-recent": This will read from the latest available message.
     * "end": This will read only future messages.
     * "stored": This will resume reads one past the last committed offset.
     *           It is the only option that resumes progress; all others
     *           jump unilaterally.
     * </pre>
     *
     * <code>string starting_logical_offset = 1;</code>
     * @param value The startingLogicalOffset to set.
     * @return This builder for chaining.
     */
    public Builder setStartingLogicalOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      startingOffsetCase_ = 1;
      startingOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This can be set to the following logical starting points:
     * "begin": This will read from the earliest available message.
     * "most-recent": This will read from the latest available message.
     * "end": This will read only future messages.
     * "stored": This will resume reads one past the last committed offset.
     *           It is the only option that resumes progress; all others
     *           jump unilaterally.
     * </pre>
     *
     * <code>string starting_logical_offset = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartingLogicalOffset() {
      if (startingOffsetCase_ == 1) {
        startingOffsetCase_ = 0;
        startingOffset_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This can be set to the following logical starting points:
     * "begin": This will read from the earliest available message.
     * "most-recent": This will read from the latest available message.
     * "end": This will read only future messages.
     * "stored": This will resume reads one past the last committed offset.
     *           It is the only option that resumes progress; all others
     *           jump unilaterally.
     * </pre>
     *
     * <code>string starting_logical_offset = 1;</code>
     * @param value The bytes for startingLogicalOffset to set.
     * @return This builder for chaining.
     */
    public Builder setStartingLogicalOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      startingOffsetCase_ = 1;
      startingOffset_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fallbackStartingOffset_ = "";
    /**
     * <pre>
     * This is the logical starting point to fallback upon should the
     * specified starting offset be unavailable.
     * This can be one of the following values:
     * "begin": This will read from the earliest available message.
     * "end": This will read only future messages.
     * </pre>
     *
     * <code>string fallback_starting_offset = 2;</code>
     * @return The fallbackStartingOffset.
     */
    public java.lang.String getFallbackStartingOffset() {
      java.lang.Object ref = fallbackStartingOffset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fallbackStartingOffset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is the logical starting point to fallback upon should the
     * specified starting offset be unavailable.
     * This can be one of the following values:
     * "begin": This will read from the earliest available message.
     * "end": This will read only future messages.
     * </pre>
     *
     * <code>string fallback_starting_offset = 2;</code>
     * @return The bytes for fallbackStartingOffset.
     */
    public com.google.protobuf.ByteString
        getFallbackStartingOffsetBytes() {
      java.lang.Object ref = fallbackStartingOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fallbackStartingOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is the logical starting point to fallback upon should the
     * specified starting offset be unavailable.
     * This can be one of the following values:
     * "begin": This will read from the earliest available message.
     * "end": This will read only future messages.
     * </pre>
     *
     * <code>string fallback_starting_offset = 2;</code>
     * @param value The fallbackStartingOffset to set.
     * @return This builder for chaining.
     */
    public Builder setFallbackStartingOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fallbackStartingOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the logical starting point to fallback upon should the
     * specified starting offset be unavailable.
     * This can be one of the following values:
     * "begin": This will read from the earliest available message.
     * "end": This will read only future messages.
     * </pre>
     *
     * <code>string fallback_starting_offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFallbackStartingOffset() {
      fallbackStartingOffset_ = getDefaultInstance().getFallbackStartingOffset();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the logical starting point to fallback upon should the
     * specified starting offset be unavailable.
     * This can be one of the following values:
     * "begin": This will read from the earliest available message.
     * "end": This will read only future messages.
     * </pre>
     *
     * <code>string fallback_starting_offset = 2;</code>
     * @param value The bytes for fallbackStartingOffset to set.
     * @return This builder for chaining.
     */
    public Builder setFallbackStartingOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fallbackStartingOffset_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.ControlledMode)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.ControlledMode)
  private static final com.google.cloud.visionai.v1.ControlledMode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.ControlledMode();
  }

  public static com.google.cloud.visionai.v1.ControlledMode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ControlledMode>
      PARSER = new com.google.protobuf.AbstractParser<ControlledMode>() {
    @java.lang.Override
    public ControlledMode parsePartialFrom(
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

  public static com.google.protobuf.Parser<ControlledMode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControlledMode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.ControlledMode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
