// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/compliance.proto

package io.grafeas.v1;

/**
 * <pre>
 * Details about files that caused a compliance check to fail.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.NonCompliantFile}
 */
public final class NonCompliantFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.NonCompliantFile)
    NonCompliantFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NonCompliantFile.newBuilder() to construct.
  private NonCompliantFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NonCompliantFile() {
    path_ = "";
    displayCommand_ = "";
    reason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NonCompliantFile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1.Compliance.internal_static_grafeas_v1_NonCompliantFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Compliance.internal_static_grafeas_v1_NonCompliantFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.NonCompliantFile.class, io.grafeas.v1.NonCompliantFile.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <pre>
   * Empty if `display_command` is set.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Empty if `display_command` is set.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_COMMAND_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayCommand_ = "";
  /**
   * <pre>
   * Command to display the non-compliant files.
   * </pre>
   *
   * <code>string display_command = 2;</code>
   * @return The displayCommand.
   */
  @java.lang.Override
  public java.lang.String getDisplayCommand() {
    java.lang.Object ref = displayCommand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayCommand_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Command to display the non-compliant files.
   * </pre>
   *
   * <code>string display_command = 2;</code>
   * @return The bytes for displayCommand.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayCommandBytes() {
    java.lang.Object ref = displayCommand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayCommand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REASON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reason_ = "";
  /**
   * <pre>
   * Explains why a file is non compliant for a CIS check.
   * </pre>
   *
   * <code>string reason = 3;</code>
   * @return The reason.
   */
  @java.lang.Override
  public java.lang.String getReason() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reason_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Explains why a file is non compliant for a CIS check.
   * </pre>
   *
   * <code>string reason = 3;</code>
   * @return The bytes for reason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReasonBytes() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reason_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayCommand_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayCommand_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayCommand_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayCommand_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reason_);
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
    if (!(obj instanceof io.grafeas.v1.NonCompliantFile)) {
      return super.equals(obj);
    }
    io.grafeas.v1.NonCompliantFile other = (io.grafeas.v1.NonCompliantFile) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (!getDisplayCommand()
        .equals(other.getDisplayCommand())) return false;
    if (!getReason()
        .equals(other.getReason())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + DISPLAY_COMMAND_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayCommand().hashCode();
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + getReason().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.NonCompliantFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.NonCompliantFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.NonCompliantFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.NonCompliantFile parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1.NonCompliantFile prototype) {
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
   * Details about files that caused a compliance check to fail.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.NonCompliantFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.NonCompliantFile)
      io.grafeas.v1.NonCompliantFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1.Compliance.internal_static_grafeas_v1_NonCompliantFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Compliance.internal_static_grafeas_v1_NonCompliantFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.NonCompliantFile.class, io.grafeas.v1.NonCompliantFile.Builder.class);
    }

    // Construct using io.grafeas.v1.NonCompliantFile.newBuilder()
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
      path_ = "";
      displayCommand_ = "";
      reason_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1.Compliance.internal_static_grafeas_v1_NonCompliantFile_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.NonCompliantFile getDefaultInstanceForType() {
      return io.grafeas.v1.NonCompliantFile.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.NonCompliantFile build() {
      io.grafeas.v1.NonCompliantFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.NonCompliantFile buildPartial() {
      io.grafeas.v1.NonCompliantFile result = new io.grafeas.v1.NonCompliantFile(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.NonCompliantFile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayCommand_ = displayCommand_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reason_ = reason_;
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
      if (other instanceof io.grafeas.v1.NonCompliantFile) {
        return mergeFrom((io.grafeas.v1.NonCompliantFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.NonCompliantFile other) {
      if (other == io.grafeas.v1.NonCompliantFile.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDisplayCommand().isEmpty()) {
        displayCommand_ = other.displayCommand_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getReason().isEmpty()) {
        reason_ = other.reason_;
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
              path_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              displayCommand_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              reason_ = input.readStringRequireUtf8();
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

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Empty if `display_command` is set.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Empty if `display_command` is set.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Empty if `display_command` is set.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Empty if `display_command` is set.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Empty if `display_command` is set.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object displayCommand_ = "";
    /**
     * <pre>
     * Command to display the non-compliant files.
     * </pre>
     *
     * <code>string display_command = 2;</code>
     * @return The displayCommand.
     */
    public java.lang.String getDisplayCommand() {
      java.lang.Object ref = displayCommand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayCommand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Command to display the non-compliant files.
     * </pre>
     *
     * <code>string display_command = 2;</code>
     * @return The bytes for displayCommand.
     */
    public com.google.protobuf.ByteString
        getDisplayCommandBytes() {
      java.lang.Object ref = displayCommand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayCommand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Command to display the non-compliant files.
     * </pre>
     *
     * <code>string display_command = 2;</code>
     * @param value The displayCommand to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayCommand(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayCommand_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Command to display the non-compliant files.
     * </pre>
     *
     * <code>string display_command = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayCommand() {
      displayCommand_ = getDefaultInstance().getDisplayCommand();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Command to display the non-compliant files.
     * </pre>
     *
     * <code>string display_command = 2;</code>
     * @param value The bytes for displayCommand to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayCommandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayCommand_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object reason_ = "";
    /**
     * <pre>
     * Explains why a file is non compliant for a CIS check.
     * </pre>
     *
     * <code>string reason = 3;</code>
     * @return The reason.
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Explains why a file is non compliant for a CIS check.
     * </pre>
     *
     * <code>string reason = 3;</code>
     * @return The bytes for reason.
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Explains why a file is non compliant for a CIS check.
     * </pre>
     *
     * <code>string reason = 3;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reason_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Explains why a file is non compliant for a CIS check.
     * </pre>
     *
     * <code>string reason = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      reason_ = getDefaultInstance().getReason();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Explains why a file is non compliant for a CIS check.
     * </pre>
     *
     * <code>string reason = 3;</code>
     * @param value The bytes for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reason_ = value;
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


    // @@protoc_insertion_point(builder_scope:grafeas.v1.NonCompliantFile)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.NonCompliantFile)
  private static final io.grafeas.v1.NonCompliantFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.NonCompliantFile();
  }

  public static io.grafeas.v1.NonCompliantFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NonCompliantFile>
      PARSER = new com.google.protobuf.AbstractParser<NonCompliantFile>() {
    @java.lang.Override
    public NonCompliantFile parsePartialFrom(
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

  public static com.google.protobuf.Parser<NonCompliantFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NonCompliantFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.NonCompliantFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

