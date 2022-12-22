// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * Error info for running a test.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.TestError}
 */
public final class TestError extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.TestError)
    TestErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestError.newBuilder() to construct.
  private TestError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestError() {
    testCase_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.TestError.class, com.google.cloud.dialogflow.cx.v3.TestError.Builder.class);
  }

  public static final int TEST_CASE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object testCase_ = "";
  /**
   * <pre>
   * The test case resource name.
   * </pre>
   *
   * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The testCase.
   */
  @java.lang.Override
  public java.lang.String getTestCase() {
    java.lang.Object ref = testCase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testCase_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The test case resource name.
   * </pre>
   *
   * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for testCase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTestCaseBytes() {
    java.lang.Object ref = testCase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      testCase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;
  /**
   * <pre>
   * The status associated with the test.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * The status associated with the test.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * The status associated with the test.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }

  public static final int TEST_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp testTime_;
  /**
   * <pre>
   * The timestamp when the test was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 3;</code>
   * @return Whether the testTime field is set.
   */
  @java.lang.Override
  public boolean hasTestTime() {
    return testTime_ != null;
  }
  /**
   * <pre>
   * The timestamp when the test was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 3;</code>
   * @return The testTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTestTime() {
    return testTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : testTime_;
  }
  /**
   * <pre>
   * The timestamp when the test was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTestTimeOrBuilder() {
    return testTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : testTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testCase_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, testCase_);
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    if (testTime_ != null) {
      output.writeMessage(3, getTestTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testCase_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, testCase_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
    }
    if (testTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTestTime());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.TestError)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.TestError other = (com.google.cloud.dialogflow.cx.v3.TestError) obj;

    if (!getTestCase()
        .equals(other.getTestCase())) return false;
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (hasTestTime() != other.hasTestTime()) return false;
    if (hasTestTime()) {
      if (!getTestTime()
          .equals(other.getTestTime())) return false;
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
    hash = (37 * hash) + TEST_CASE_FIELD_NUMBER;
    hash = (53 * hash) + getTestCase().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasTestTime()) {
      hash = (37 * hash) + TEST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTestTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestError parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.TestError prototype) {
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
   * Error info for running a test.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.TestError}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.TestError)
      com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.TestError.class, com.google.cloud.dialogflow.cx.v3.TestError.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.TestError.newBuilder()
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
      testCase_ = "";
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      testTime_ = null;
      if (testTimeBuilder_ != null) {
        testTimeBuilder_.dispose();
        testTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestError_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.TestError getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.TestError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.TestError build() {
      com.google.cloud.dialogflow.cx.v3.TestError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.TestError buildPartial() {
      com.google.cloud.dialogflow.cx.v3.TestError result = new com.google.cloud.dialogflow.cx.v3.TestError(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.TestError result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.testCase_ = testCase_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.testTime_ = testTimeBuilder_ == null
            ? testTime_
            : testTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.TestError) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.TestError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.TestError other) {
      if (other == com.google.cloud.dialogflow.cx.v3.TestError.getDefaultInstance()) return this;
      if (!other.getTestCase().isEmpty()) {
        testCase_ = other.testCase_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasTestTime()) {
        mergeTestTime(other.getTestTime());
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
              testCase_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTestTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object testCase_ = "";
    /**
     * <pre>
     * The test case resource name.
     * </pre>
     *
     * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The testCase.
     */
    public java.lang.String getTestCase() {
      java.lang.Object ref = testCase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testCase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The test case resource name.
     * </pre>
     *
     * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for testCase.
     */
    public com.google.protobuf.ByteString
        getTestCaseBytes() {
      java.lang.Object ref = testCase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testCase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The test case resource name.
     * </pre>
     *
     * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The testCase to set.
     * @return This builder for chaining.
     */
    public Builder setTestCase(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      testCase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The test case resource name.
     * </pre>
     *
     * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTestCase() {
      testCase_ = getDefaultInstance().getTestCase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The test case resource name.
     * </pre>
     *
     * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for testCase to set.
     * @return This builder for chaining.
     */
    public Builder setTestCaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      testCase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          status_ != null &&
          status_ != com.google.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * The status associated with the test.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private com.google.protobuf.Timestamp testTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> testTimeBuilder_;
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     * @return Whether the testTime field is set.
     */
    public boolean hasTestTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     * @return The testTime.
     */
    public com.google.protobuf.Timestamp getTestTime() {
      if (testTimeBuilder_ == null) {
        return testTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : testTime_;
      } else {
        return testTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    public Builder setTestTime(com.google.protobuf.Timestamp value) {
      if (testTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testTime_ = value;
      } else {
        testTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    public Builder setTestTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (testTimeBuilder_ == null) {
        testTime_ = builderForValue.build();
      } else {
        testTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    public Builder mergeTestTime(com.google.protobuf.Timestamp value) {
      if (testTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          testTime_ != null &&
          testTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTestTimeBuilder().mergeFrom(value);
        } else {
          testTime_ = value;
        }
      } else {
        testTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    public Builder clearTestTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      testTime_ = null;
      if (testTimeBuilder_ != null) {
        testTimeBuilder_.dispose();
        testTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTestTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTestTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTestTimeOrBuilder() {
      if (testTimeBuilder_ != null) {
        return testTimeBuilder_.getMessageOrBuilder();
      } else {
        return testTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : testTime_;
      }
    }
    /**
     * <pre>
     * The timestamp when the test was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp test_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTestTimeFieldBuilder() {
      if (testTimeBuilder_ == null) {
        testTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTestTime(),
                getParentForChildren(),
                isClean());
        testTime_ = null;
      }
      return testTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.TestError)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.TestError)
  private static final com.google.cloud.dialogflow.cx.v3.TestError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.TestError();
  }

  public static com.google.cloud.dialogflow.cx.v3.TestError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestError>
      PARSER = new com.google.protobuf.AbstractParser<TestError>() {
    @java.lang.Override
    public TestError parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

