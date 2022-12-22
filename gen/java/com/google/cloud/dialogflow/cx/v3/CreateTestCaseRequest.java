// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The request message for [TestCases.CreateTestCase][google.cloud.dialogflow.cx.v3.TestCases.CreateTestCase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.CreateTestCaseRequest}
 */
public final class CreateTestCaseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.CreateTestCaseRequest)
    CreateTestCaseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTestCaseRequest.newBuilder() to construct.
  private CreateTestCaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTestCaseRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTestCaseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_CreateTestCaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_CreateTestCaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.class, com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The agent to create the test case for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The agent to create the test case for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEST_CASE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3.TestCase testCase_;
  /**
   * <pre>
   * Required. The test case to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the testCase field is set.
   */
  @java.lang.Override
  public boolean hasTestCase() {
    return testCase_ != null;
  }
  /**
   * <pre>
   * Required. The test case to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The testCase.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestCase getTestCase() {
    return testCase_ == null ? com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
  }
  /**
   * <pre>
   * Required. The test case to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder getTestCaseOrBuilder() {
    return testCase_ == null ? com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (testCase_ != null) {
      output.writeMessage(2, getTestCase());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (testCase_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTestCase());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest other = (com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasTestCase() != other.hasTestCase()) return false;
    if (hasTestCase()) {
      if (!getTestCase()
          .equals(other.getTestCase())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasTestCase()) {
      hash = (37 * hash) + TEST_CASE_FIELD_NUMBER;
      hash = (53 * hash) + getTestCase().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest prototype) {
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
   * The request message for [TestCases.CreateTestCase][google.cloud.dialogflow.cx.v3.TestCases.CreateTestCase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.CreateTestCaseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.CreateTestCaseRequest)
      com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_CreateTestCaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_CreateTestCaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.class, com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.newBuilder()
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
      parent_ = "";
      testCase_ = null;
      if (testCaseBuilder_ != null) {
        testCaseBuilder_.dispose();
        testCaseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_CreateTestCaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest build() {
      com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest result = new com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.testCase_ = testCaseBuilder_ == null
            ? testCase_
            : testCaseBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTestCase()) {
        mergeTestCase(other.getTestCase());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTestCaseFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The agent to create the test case for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The agent to create the test case for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The agent to create the test case for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The agent to create the test case for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The agent to create the test case for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3.TestCase testCase_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestCase, com.google.cloud.dialogflow.cx.v3.TestCase.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder> testCaseBuilder_;
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the testCase field is set.
     */
    public boolean hasTestCase() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The testCase.
     */
    public com.google.cloud.dialogflow.cx.v3.TestCase getTestCase() {
      if (testCaseBuilder_ == null) {
        return testCase_ == null ? com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
      } else {
        return testCaseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTestCase(com.google.cloud.dialogflow.cx.v3.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testCase_ = value;
      } else {
        testCaseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTestCase(
        com.google.cloud.dialogflow.cx.v3.TestCase.Builder builderForValue) {
      if (testCaseBuilder_ == null) {
        testCase_ = builderForValue.build();
      } else {
        testCaseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTestCase(com.google.cloud.dialogflow.cx.v3.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          testCase_ != null &&
          testCase_ != com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance()) {
          getTestCaseBuilder().mergeFrom(value);
        } else {
          testCase_ = value;
        }
      } else {
        testCaseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTestCase() {
      bitField0_ = (bitField0_ & ~0x00000002);
      testCase_ = null;
      if (testCaseBuilder_ != null) {
        testCaseBuilder_.dispose();
        testCaseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestCase.Builder getTestCaseBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTestCaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder getTestCaseOrBuilder() {
      if (testCaseBuilder_ != null) {
        return testCaseBuilder_.getMessageOrBuilder();
      } else {
        return testCase_ == null ?
            com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
      }
    }
    /**
     * <pre>
     * Required. The test case to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestCase, com.google.cloud.dialogflow.cx.v3.TestCase.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder> 
        getTestCaseFieldBuilder() {
      if (testCaseBuilder_ == null) {
        testCaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.TestCase, com.google.cloud.dialogflow.cx.v3.TestCase.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder>(
                getTestCase(),
                getParentForChildren(),
                isClean());
        testCase_ = null;
      }
      return testCaseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.CreateTestCaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.CreateTestCaseRequest)
  private static final com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTestCaseRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTestCaseRequest>() {
    @java.lang.Override
    public CreateTestCaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTestCaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTestCaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.CreateTestCaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

