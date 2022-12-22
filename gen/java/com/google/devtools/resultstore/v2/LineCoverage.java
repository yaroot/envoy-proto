// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/coverage.proto

package com.google.devtools.resultstore.v2;

/**
 * <pre>
 * Describes line coverage for a file
 * </pre>
 *
 * Protobuf type {@code google.devtools.resultstore.v2.LineCoverage}
 */
public final class LineCoverage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.resultstore.v2.LineCoverage)
    LineCoverageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LineCoverage.newBuilder() to construct.
  private LineCoverage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LineCoverage() {
    instrumentedLines_ = com.google.protobuf.ByteString.EMPTY;
    executedLines_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LineCoverage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.resultstore.v2.CoverageProto.internal_static_google_devtools_resultstore_v2_LineCoverage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.resultstore.v2.CoverageProto.internal_static_google_devtools_resultstore_v2_LineCoverage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.resultstore.v2.LineCoverage.class, com.google.devtools.resultstore.v2.LineCoverage.Builder.class);
  }

  public static final int INSTRUMENTED_LINES_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString instrumentedLines_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Which source lines in the file represent the start of a statement that was
   * instrumented to detect whether it was executed by the test.
   * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
   * number by 8 to get index into byte array. Mod line number by 8 to get bit
   * number (0 = LSB, 7 = MSB).
   * A 1 denotes the line was instrumented.
   * A 0 denotes the line was not instrumented.
   * </pre>
   *
   * <code>bytes instrumented_lines = 1;</code>
   * @return The instrumentedLines.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstrumentedLines() {
    return instrumentedLines_;
  }

  public static final int EXECUTED_LINES_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString executedLines_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Which of the instrumented source lines were executed by the test. Should
   * include lines that were not instrumented.
   * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
   * number by 8 to get index into byte array. Mod line number by 8 to get bit
   * number (0 = LSB, 7 = MSB).
   * A 1 denotes the line was executed.
   * A 0 denotes the line was not executed.
   * </pre>
   *
   * <code>bytes executed_lines = 2;</code>
   * @return The executedLines.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExecutedLines() {
    return executedLines_;
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
    if (!instrumentedLines_.isEmpty()) {
      output.writeBytes(1, instrumentedLines_);
    }
    if (!executedLines_.isEmpty()) {
      output.writeBytes(2, executedLines_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!instrumentedLines_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, instrumentedLines_);
    }
    if (!executedLines_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, executedLines_);
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
    if (!(obj instanceof com.google.devtools.resultstore.v2.LineCoverage)) {
      return super.equals(obj);
    }
    com.google.devtools.resultstore.v2.LineCoverage other = (com.google.devtools.resultstore.v2.LineCoverage) obj;

    if (!getInstrumentedLines()
        .equals(other.getInstrumentedLines())) return false;
    if (!getExecutedLines()
        .equals(other.getExecutedLines())) return false;
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
    hash = (37 * hash) + INSTRUMENTED_LINES_FIELD_NUMBER;
    hash = (53 * hash) + getInstrumentedLines().hashCode();
    hash = (37 * hash) + EXECUTED_LINES_FIELD_NUMBER;
    hash = (53 * hash) + getExecutedLines().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.LineCoverage parseFrom(
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
  public static Builder newBuilder(com.google.devtools.resultstore.v2.LineCoverage prototype) {
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
   * Describes line coverage for a file
   * </pre>
   *
   * Protobuf type {@code google.devtools.resultstore.v2.LineCoverage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.resultstore.v2.LineCoverage)
      com.google.devtools.resultstore.v2.LineCoverageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.resultstore.v2.CoverageProto.internal_static_google_devtools_resultstore_v2_LineCoverage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.resultstore.v2.CoverageProto.internal_static_google_devtools_resultstore_v2_LineCoverage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.resultstore.v2.LineCoverage.class, com.google.devtools.resultstore.v2.LineCoverage.Builder.class);
    }

    // Construct using com.google.devtools.resultstore.v2.LineCoverage.newBuilder()
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
      instrumentedLines_ = com.google.protobuf.ByteString.EMPTY;
      executedLines_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.resultstore.v2.CoverageProto.internal_static_google_devtools_resultstore_v2_LineCoverage_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.LineCoverage getDefaultInstanceForType() {
      return com.google.devtools.resultstore.v2.LineCoverage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.LineCoverage build() {
      com.google.devtools.resultstore.v2.LineCoverage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.LineCoverage buildPartial() {
      com.google.devtools.resultstore.v2.LineCoverage result = new com.google.devtools.resultstore.v2.LineCoverage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.resultstore.v2.LineCoverage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instrumentedLines_ = instrumentedLines_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.executedLines_ = executedLines_;
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
      if (other instanceof com.google.devtools.resultstore.v2.LineCoverage) {
        return mergeFrom((com.google.devtools.resultstore.v2.LineCoverage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.resultstore.v2.LineCoverage other) {
      if (other == com.google.devtools.resultstore.v2.LineCoverage.getDefaultInstance()) return this;
      if (other.getInstrumentedLines() != com.google.protobuf.ByteString.EMPTY) {
        setInstrumentedLines(other.getInstrumentedLines());
      }
      if (other.getExecutedLines() != com.google.protobuf.ByteString.EMPTY) {
        setExecutedLines(other.getExecutedLines());
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
              instrumentedLines_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              executedLines_ = input.readBytes();
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

    private com.google.protobuf.ByteString instrumentedLines_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Which source lines in the file represent the start of a statement that was
     * instrumented to detect whether it was executed by the test.
     * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
     * number by 8 to get index into byte array. Mod line number by 8 to get bit
     * number (0 = LSB, 7 = MSB).
     * A 1 denotes the line was instrumented.
     * A 0 denotes the line was not instrumented.
     * </pre>
     *
     * <code>bytes instrumented_lines = 1;</code>
     * @return The instrumentedLines.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getInstrumentedLines() {
      return instrumentedLines_;
    }
    /**
     * <pre>
     * Which source lines in the file represent the start of a statement that was
     * instrumented to detect whether it was executed by the test.
     * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
     * number by 8 to get index into byte array. Mod line number by 8 to get bit
     * number (0 = LSB, 7 = MSB).
     * A 1 denotes the line was instrumented.
     * A 0 denotes the line was not instrumented.
     * </pre>
     *
     * <code>bytes instrumented_lines = 1;</code>
     * @param value The instrumentedLines to set.
     * @return This builder for chaining.
     */
    public Builder setInstrumentedLines(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      instrumentedLines_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Which source lines in the file represent the start of a statement that was
     * instrumented to detect whether it was executed by the test.
     * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
     * number by 8 to get index into byte array. Mod line number by 8 to get bit
     * number (0 = LSB, 7 = MSB).
     * A 1 denotes the line was instrumented.
     * A 0 denotes the line was not instrumented.
     * </pre>
     *
     * <code>bytes instrumented_lines = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstrumentedLines() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instrumentedLines_ = getDefaultInstance().getInstrumentedLines();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString executedLines_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Which of the instrumented source lines were executed by the test. Should
     * include lines that were not instrumented.
     * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
     * number by 8 to get index into byte array. Mod line number by 8 to get bit
     * number (0 = LSB, 7 = MSB).
     * A 1 denotes the line was executed.
     * A 0 denotes the line was not executed.
     * </pre>
     *
     * <code>bytes executed_lines = 2;</code>
     * @return The executedLines.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getExecutedLines() {
      return executedLines_;
    }
    /**
     * <pre>
     * Which of the instrumented source lines were executed by the test. Should
     * include lines that were not instrumented.
     * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
     * number by 8 to get index into byte array. Mod line number by 8 to get bit
     * number (0 = LSB, 7 = MSB).
     * A 1 denotes the line was executed.
     * A 0 denotes the line was not executed.
     * </pre>
     *
     * <code>bytes executed_lines = 2;</code>
     * @param value The executedLines to set.
     * @return This builder for chaining.
     */
    public Builder setExecutedLines(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      executedLines_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Which of the instrumented source lines were executed by the test. Should
     * include lines that were not instrumented.
     * This is a bitfield where i-th bit corresponds to the i-th line. Divide line
     * number by 8 to get index into byte array. Mod line number by 8 to get bit
     * number (0 = LSB, 7 = MSB).
     * A 1 denotes the line was executed.
     * A 0 denotes the line was not executed.
     * </pre>
     *
     * <code>bytes executed_lines = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutedLines() {
      bitField0_ = (bitField0_ & ~0x00000002);
      executedLines_ = getDefaultInstance().getExecutedLines();
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


    // @@protoc_insertion_point(builder_scope:google.devtools.resultstore.v2.LineCoverage)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.LineCoverage)
  private static final com.google.devtools.resultstore.v2.LineCoverage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.resultstore.v2.LineCoverage();
  }

  public static com.google.devtools.resultstore.v2.LineCoverage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LineCoverage>
      PARSER = new com.google.protobuf.AbstractParser<LineCoverage>() {
    @java.lang.Override
    public LineCoverage parsePartialFrom(
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

  public static com.google.protobuf.Parser<LineCoverage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LineCoverage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.resultstore.v2.LineCoverage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

