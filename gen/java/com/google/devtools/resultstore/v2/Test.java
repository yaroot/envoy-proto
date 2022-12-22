// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/test_suite.proto

package com.google.devtools.resultstore.v2;

/**
 * <pre>
 * The result of running a test case or test suite. JUnit3 TestDecorators are
 * represented as a TestSuite with a single test.
 * </pre>
 *
 * Protobuf type {@code google.devtools.resultstore.v2.Test}
 */
public final class Test extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.resultstore.v2.Test)
    TestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Test.newBuilder() to construct.
  private Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Test() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Test();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.resultstore.v2.TestSuiteProto.internal_static_google_devtools_resultstore_v2_Test_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.resultstore.v2.TestSuiteProto.internal_static_google_devtools_resultstore_v2_Test_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.resultstore.v2.Test.class, com.google.devtools.resultstore.v2.Test.Builder.class);
  }

  private int testTypeCase_ = 0;
  private java.lang.Object testType_;
  public enum TestTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEST_CASE(1),
    TEST_SUITE(2),
    TESTTYPE_NOT_SET(0);
    private final int value;
    private TestTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TestTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TestTypeCase forNumber(int value) {
      switch (value) {
        case 1: return TEST_CASE;
        case 2: return TEST_SUITE;
        case 0: return TESTTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TestTypeCase
  getTestTypeCase() {
    return TestTypeCase.forNumber(
        testTypeCase_);
  }

  public static final int TEST_CASE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * When this contains just a single TestCase
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
   * @return Whether the testCase field is set.
   */
  @java.lang.Override
  public boolean hasTestCase() {
    return testTypeCase_ == 1;
  }
  /**
   * <pre>
   * When this contains just a single TestCase
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
   * @return The testCase.
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.TestCase getTestCase() {
    if (testTypeCase_ == 1) {
       return (com.google.devtools.resultstore.v2.TestCase) testType_;
    }
    return com.google.devtools.resultstore.v2.TestCase.getDefaultInstance();
  }
  /**
   * <pre>
   * When this contains just a single TestCase
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.TestCaseOrBuilder getTestCaseOrBuilder() {
    if (testTypeCase_ == 1) {
       return (com.google.devtools.resultstore.v2.TestCase) testType_;
    }
    return com.google.devtools.resultstore.v2.TestCase.getDefaultInstance();
  }

  public static final int TEST_SUITE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * When this contains a TestSuite of test cases.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
   * @return Whether the testSuite field is set.
   */
  @java.lang.Override
  public boolean hasTestSuite() {
    return testTypeCase_ == 2;
  }
  /**
   * <pre>
   * When this contains a TestSuite of test cases.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
   * @return The testSuite.
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.TestSuite getTestSuite() {
    if (testTypeCase_ == 2) {
       return (com.google.devtools.resultstore.v2.TestSuite) testType_;
    }
    return com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance();
  }
  /**
   * <pre>
   * When this contains a TestSuite of test cases.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.TestSuiteOrBuilder getTestSuiteOrBuilder() {
    if (testTypeCase_ == 2) {
       return (com.google.devtools.resultstore.v2.TestSuite) testType_;
    }
    return com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance();
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
    if (testTypeCase_ == 1) {
      output.writeMessage(1, (com.google.devtools.resultstore.v2.TestCase) testType_);
    }
    if (testTypeCase_ == 2) {
      output.writeMessage(2, (com.google.devtools.resultstore.v2.TestSuite) testType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (testTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.devtools.resultstore.v2.TestCase) testType_);
    }
    if (testTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.devtools.resultstore.v2.TestSuite) testType_);
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
    if (!(obj instanceof com.google.devtools.resultstore.v2.Test)) {
      return super.equals(obj);
    }
    com.google.devtools.resultstore.v2.Test other = (com.google.devtools.resultstore.v2.Test) obj;

    if (!getTestTypeCase().equals(other.getTestTypeCase())) return false;
    switch (testTypeCase_) {
      case 1:
        if (!getTestCase()
            .equals(other.getTestCase())) return false;
        break;
      case 2:
        if (!getTestSuite()
            .equals(other.getTestSuite())) return false;
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
    switch (testTypeCase_) {
      case 1:
        hash = (37 * hash) + TEST_CASE_FIELD_NUMBER;
        hash = (53 * hash) + getTestCase().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TEST_SUITE_FIELD_NUMBER;
        hash = (53 * hash) + getTestSuite().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.resultstore.v2.Test parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Test parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.Test parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.Test parseFrom(
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
  public static Builder newBuilder(com.google.devtools.resultstore.v2.Test prototype) {
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
   * The result of running a test case or test suite. JUnit3 TestDecorators are
   * represented as a TestSuite with a single test.
   * </pre>
   *
   * Protobuf type {@code google.devtools.resultstore.v2.Test}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.resultstore.v2.Test)
      com.google.devtools.resultstore.v2.TestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.resultstore.v2.TestSuiteProto.internal_static_google_devtools_resultstore_v2_Test_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.resultstore.v2.TestSuiteProto.internal_static_google_devtools_resultstore_v2_Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.resultstore.v2.Test.class, com.google.devtools.resultstore.v2.Test.Builder.class);
    }

    // Construct using com.google.devtools.resultstore.v2.Test.newBuilder()
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
      if (testCaseBuilder_ != null) {
        testCaseBuilder_.clear();
      }
      if (testSuiteBuilder_ != null) {
        testSuiteBuilder_.clear();
      }
      testTypeCase_ = 0;
      testType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.resultstore.v2.TestSuiteProto.internal_static_google_devtools_resultstore_v2_Test_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.Test getDefaultInstanceForType() {
      return com.google.devtools.resultstore.v2.Test.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.Test build() {
      com.google.devtools.resultstore.v2.Test result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.Test buildPartial() {
      com.google.devtools.resultstore.v2.Test result = new com.google.devtools.resultstore.v2.Test(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.resultstore.v2.Test result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.devtools.resultstore.v2.Test result) {
      result.testTypeCase_ = testTypeCase_;
      result.testType_ = this.testType_;
      if (testTypeCase_ == 1 &&
          testCaseBuilder_ != null) {
        result.testType_ = testCaseBuilder_.build();
      }
      if (testTypeCase_ == 2 &&
          testSuiteBuilder_ != null) {
        result.testType_ = testSuiteBuilder_.build();
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
      if (other instanceof com.google.devtools.resultstore.v2.Test) {
        return mergeFrom((com.google.devtools.resultstore.v2.Test)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.resultstore.v2.Test other) {
      if (other == com.google.devtools.resultstore.v2.Test.getDefaultInstance()) return this;
      switch (other.getTestTypeCase()) {
        case TEST_CASE: {
          mergeTestCase(other.getTestCase());
          break;
        }
        case TEST_SUITE: {
          mergeTestSuite(other.getTestSuite());
          break;
        }
        case TESTTYPE_NOT_SET: {
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
                  getTestCaseFieldBuilder().getBuilder(),
                  extensionRegistry);
              testTypeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTestSuiteFieldBuilder().getBuilder(),
                  extensionRegistry);
              testTypeCase_ = 2;
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
    private int testTypeCase_ = 0;
    private java.lang.Object testType_;
    public TestTypeCase
        getTestTypeCase() {
      return TestTypeCase.forNumber(
          testTypeCase_);
    }

    public Builder clearTestType() {
      testTypeCase_ = 0;
      testType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.resultstore.v2.TestCase, com.google.devtools.resultstore.v2.TestCase.Builder, com.google.devtools.resultstore.v2.TestCaseOrBuilder> testCaseBuilder_;
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     * @return Whether the testCase field is set.
     */
    @java.lang.Override
    public boolean hasTestCase() {
      return testTypeCase_ == 1;
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     * @return The testCase.
     */
    @java.lang.Override
    public com.google.devtools.resultstore.v2.TestCase getTestCase() {
      if (testCaseBuilder_ == null) {
        if (testTypeCase_ == 1) {
          return (com.google.devtools.resultstore.v2.TestCase) testType_;
        }
        return com.google.devtools.resultstore.v2.TestCase.getDefaultInstance();
      } else {
        if (testTypeCase_ == 1) {
          return testCaseBuilder_.getMessage();
        }
        return com.google.devtools.resultstore.v2.TestCase.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    public Builder setTestCase(com.google.devtools.resultstore.v2.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testType_ = value;
        onChanged();
      } else {
        testCaseBuilder_.setMessage(value);
      }
      testTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    public Builder setTestCase(
        com.google.devtools.resultstore.v2.TestCase.Builder builderForValue) {
      if (testCaseBuilder_ == null) {
        testType_ = builderForValue.build();
        onChanged();
      } else {
        testCaseBuilder_.setMessage(builderForValue.build());
      }
      testTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    public Builder mergeTestCase(com.google.devtools.resultstore.v2.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (testTypeCase_ == 1 &&
            testType_ != com.google.devtools.resultstore.v2.TestCase.getDefaultInstance()) {
          testType_ = com.google.devtools.resultstore.v2.TestCase.newBuilder((com.google.devtools.resultstore.v2.TestCase) testType_)
              .mergeFrom(value).buildPartial();
        } else {
          testType_ = value;
        }
        onChanged();
      } else {
        if (testTypeCase_ == 1) {
          testCaseBuilder_.mergeFrom(value);
        } else {
          testCaseBuilder_.setMessage(value);
        }
      }
      testTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    public Builder clearTestCase() {
      if (testCaseBuilder_ == null) {
        if (testTypeCase_ == 1) {
          testTypeCase_ = 0;
          testType_ = null;
          onChanged();
        }
      } else {
        if (testTypeCase_ == 1) {
          testTypeCase_ = 0;
          testType_ = null;
        }
        testCaseBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    public com.google.devtools.resultstore.v2.TestCase.Builder getTestCaseBuilder() {
      return getTestCaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    @java.lang.Override
    public com.google.devtools.resultstore.v2.TestCaseOrBuilder getTestCaseOrBuilder() {
      if ((testTypeCase_ == 1) && (testCaseBuilder_ != null)) {
        return testCaseBuilder_.getMessageOrBuilder();
      } else {
        if (testTypeCase_ == 1) {
          return (com.google.devtools.resultstore.v2.TestCase) testType_;
        }
        return com.google.devtools.resultstore.v2.TestCase.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * When this contains just a single TestCase
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestCase test_case = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.resultstore.v2.TestCase, com.google.devtools.resultstore.v2.TestCase.Builder, com.google.devtools.resultstore.v2.TestCaseOrBuilder> 
        getTestCaseFieldBuilder() {
      if (testCaseBuilder_ == null) {
        if (!(testTypeCase_ == 1)) {
          testType_ = com.google.devtools.resultstore.v2.TestCase.getDefaultInstance();
        }
        testCaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.resultstore.v2.TestCase, com.google.devtools.resultstore.v2.TestCase.Builder, com.google.devtools.resultstore.v2.TestCaseOrBuilder>(
                (com.google.devtools.resultstore.v2.TestCase) testType_,
                getParentForChildren(),
                isClean());
        testType_ = null;
      }
      testTypeCase_ = 1;
      onChanged();
      return testCaseBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.resultstore.v2.TestSuite, com.google.devtools.resultstore.v2.TestSuite.Builder, com.google.devtools.resultstore.v2.TestSuiteOrBuilder> testSuiteBuilder_;
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     * @return Whether the testSuite field is set.
     */
    @java.lang.Override
    public boolean hasTestSuite() {
      return testTypeCase_ == 2;
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     * @return The testSuite.
     */
    @java.lang.Override
    public com.google.devtools.resultstore.v2.TestSuite getTestSuite() {
      if (testSuiteBuilder_ == null) {
        if (testTypeCase_ == 2) {
          return (com.google.devtools.resultstore.v2.TestSuite) testType_;
        }
        return com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance();
      } else {
        if (testTypeCase_ == 2) {
          return testSuiteBuilder_.getMessage();
        }
        return com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    public Builder setTestSuite(com.google.devtools.resultstore.v2.TestSuite value) {
      if (testSuiteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testType_ = value;
        onChanged();
      } else {
        testSuiteBuilder_.setMessage(value);
      }
      testTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    public Builder setTestSuite(
        com.google.devtools.resultstore.v2.TestSuite.Builder builderForValue) {
      if (testSuiteBuilder_ == null) {
        testType_ = builderForValue.build();
        onChanged();
      } else {
        testSuiteBuilder_.setMessage(builderForValue.build());
      }
      testTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    public Builder mergeTestSuite(com.google.devtools.resultstore.v2.TestSuite value) {
      if (testSuiteBuilder_ == null) {
        if (testTypeCase_ == 2 &&
            testType_ != com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance()) {
          testType_ = com.google.devtools.resultstore.v2.TestSuite.newBuilder((com.google.devtools.resultstore.v2.TestSuite) testType_)
              .mergeFrom(value).buildPartial();
        } else {
          testType_ = value;
        }
        onChanged();
      } else {
        if (testTypeCase_ == 2) {
          testSuiteBuilder_.mergeFrom(value);
        } else {
          testSuiteBuilder_.setMessage(value);
        }
      }
      testTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    public Builder clearTestSuite() {
      if (testSuiteBuilder_ == null) {
        if (testTypeCase_ == 2) {
          testTypeCase_ = 0;
          testType_ = null;
          onChanged();
        }
      } else {
        if (testTypeCase_ == 2) {
          testTypeCase_ = 0;
          testType_ = null;
        }
        testSuiteBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    public com.google.devtools.resultstore.v2.TestSuite.Builder getTestSuiteBuilder() {
      return getTestSuiteFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    @java.lang.Override
    public com.google.devtools.resultstore.v2.TestSuiteOrBuilder getTestSuiteOrBuilder() {
      if ((testTypeCase_ == 2) && (testSuiteBuilder_ != null)) {
        return testSuiteBuilder_.getMessageOrBuilder();
      } else {
        if (testTypeCase_ == 2) {
          return (com.google.devtools.resultstore.v2.TestSuite) testType_;
        }
        return com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * When this contains a TestSuite of test cases.
     * </pre>
     *
     * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.resultstore.v2.TestSuite, com.google.devtools.resultstore.v2.TestSuite.Builder, com.google.devtools.resultstore.v2.TestSuiteOrBuilder> 
        getTestSuiteFieldBuilder() {
      if (testSuiteBuilder_ == null) {
        if (!(testTypeCase_ == 2)) {
          testType_ = com.google.devtools.resultstore.v2.TestSuite.getDefaultInstance();
        }
        testSuiteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.resultstore.v2.TestSuite, com.google.devtools.resultstore.v2.TestSuite.Builder, com.google.devtools.resultstore.v2.TestSuiteOrBuilder>(
                (com.google.devtools.resultstore.v2.TestSuite) testType_,
                getParentForChildren(),
                isClean());
        testType_ = null;
      }
      testTypeCase_ = 2;
      onChanged();
      return testSuiteBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.resultstore.v2.Test)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.Test)
  private static final com.google.devtools.resultstore.v2.Test DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.resultstore.v2.Test();
  }

  public static com.google.devtools.resultstore.v2.Test getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Test>
      PARSER = new com.google.protobuf.AbstractParser<Test>() {
    @java.lang.Override
    public Test parsePartialFrom(
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

  public static com.google.protobuf.Parser<Test> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Test> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.resultstore.v2.Test getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
