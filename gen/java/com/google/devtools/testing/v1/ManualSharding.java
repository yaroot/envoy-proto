// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

/**
 * <pre>
 * Shards test cases into the specified groups of packages, classes, and/or
 * methods.
 * With manual sharding enabled, specifying test targets via
 * environment_variables or in InstrumentationTest is invalid.
 * </pre>
 *
 * Protobuf type {@code google.devtools.testing.v1.ManualSharding}
 */
public final class ManualSharding extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.testing.v1.ManualSharding)
    ManualShardingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManualSharding.newBuilder() to construct.
  private ManualSharding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManualSharding() {
    testTargetsForShard_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManualSharding();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_ManualSharding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_ManualSharding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.testing.v1.ManualSharding.class, com.google.devtools.testing.v1.ManualSharding.Builder.class);
  }

  public static final int TEST_TARGETS_FOR_SHARD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.testing.v1.TestTargetsForShard> testTargetsForShard_;
  /**
   * <pre>
   * Required. Group of packages, classes, and/or test methods to be run for
   * each shard. When any physical devices are selected,  the number of
   * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
   * selected, the number must be &gt;= 1 and &lt;= 500.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.testing.v1.TestTargetsForShard> getTestTargetsForShardList() {
    return testTargetsForShard_;
  }
  /**
   * <pre>
   * Required. Group of packages, classes, and/or test methods to be run for
   * each shard. When any physical devices are selected,  the number of
   * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
   * selected, the number must be &gt;= 1 and &lt;= 500.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.testing.v1.TestTargetsForShardOrBuilder> 
      getTestTargetsForShardOrBuilderList() {
    return testTargetsForShard_;
  }
  /**
   * <pre>
   * Required. Group of packages, classes, and/or test methods to be run for
   * each shard. When any physical devices are selected,  the number of
   * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
   * selected, the number must be &gt;= 1 and &lt;= 500.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
   */
  @java.lang.Override
  public int getTestTargetsForShardCount() {
    return testTargetsForShard_.size();
  }
  /**
   * <pre>
   * Required. Group of packages, classes, and/or test methods to be run for
   * each shard. When any physical devices are selected,  the number of
   * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
   * selected, the number must be &gt;= 1 and &lt;= 500.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.TestTargetsForShard getTestTargetsForShard(int index) {
    return testTargetsForShard_.get(index);
  }
  /**
   * <pre>
   * Required. Group of packages, classes, and/or test methods to be run for
   * each shard. When any physical devices are selected,  the number of
   * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
   * selected, the number must be &gt;= 1 and &lt;= 500.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.TestTargetsForShardOrBuilder getTestTargetsForShardOrBuilder(
      int index) {
    return testTargetsForShard_.get(index);
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
    for (int i = 0; i < testTargetsForShard_.size(); i++) {
      output.writeMessage(1, testTargetsForShard_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < testTargetsForShard_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, testTargetsForShard_.get(i));
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
    if (!(obj instanceof com.google.devtools.testing.v1.ManualSharding)) {
      return super.equals(obj);
    }
    com.google.devtools.testing.v1.ManualSharding other = (com.google.devtools.testing.v1.ManualSharding) obj;

    if (!getTestTargetsForShardList()
        .equals(other.getTestTargetsForShardList())) return false;
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
    if (getTestTargetsForShardCount() > 0) {
      hash = (37 * hash) + TEST_TARGETS_FOR_SHARD_FIELD_NUMBER;
      hash = (53 * hash) + getTestTargetsForShardList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.ManualSharding parseFrom(
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
  public static Builder newBuilder(com.google.devtools.testing.v1.ManualSharding prototype) {
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
   * Shards test cases into the specified groups of packages, classes, and/or
   * methods.
   * With manual sharding enabled, specifying test targets via
   * environment_variables or in InstrumentationTest is invalid.
   * </pre>
   *
   * Protobuf type {@code google.devtools.testing.v1.ManualSharding}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.testing.v1.ManualSharding)
      com.google.devtools.testing.v1.ManualShardingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_ManualSharding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_ManualSharding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.testing.v1.ManualSharding.class, com.google.devtools.testing.v1.ManualSharding.Builder.class);
    }

    // Construct using com.google.devtools.testing.v1.ManualSharding.newBuilder()
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
      if (testTargetsForShardBuilder_ == null) {
        testTargetsForShard_ = java.util.Collections.emptyList();
      } else {
        testTargetsForShard_ = null;
        testTargetsForShardBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_ManualSharding_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.ManualSharding getDefaultInstanceForType() {
      return com.google.devtools.testing.v1.ManualSharding.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.ManualSharding build() {
      com.google.devtools.testing.v1.ManualSharding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.ManualSharding buildPartial() {
      com.google.devtools.testing.v1.ManualSharding result = new com.google.devtools.testing.v1.ManualSharding(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.devtools.testing.v1.ManualSharding result) {
      if (testTargetsForShardBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          testTargetsForShard_ = java.util.Collections.unmodifiableList(testTargetsForShard_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.testTargetsForShard_ = testTargetsForShard_;
      } else {
        result.testTargetsForShard_ = testTargetsForShardBuilder_.build();
      }
    }

    private void buildPartial0(com.google.devtools.testing.v1.ManualSharding result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.devtools.testing.v1.ManualSharding) {
        return mergeFrom((com.google.devtools.testing.v1.ManualSharding)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.testing.v1.ManualSharding other) {
      if (other == com.google.devtools.testing.v1.ManualSharding.getDefaultInstance()) return this;
      if (testTargetsForShardBuilder_ == null) {
        if (!other.testTargetsForShard_.isEmpty()) {
          if (testTargetsForShard_.isEmpty()) {
            testTargetsForShard_ = other.testTargetsForShard_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTestTargetsForShardIsMutable();
            testTargetsForShard_.addAll(other.testTargetsForShard_);
          }
          onChanged();
        }
      } else {
        if (!other.testTargetsForShard_.isEmpty()) {
          if (testTargetsForShardBuilder_.isEmpty()) {
            testTargetsForShardBuilder_.dispose();
            testTargetsForShardBuilder_ = null;
            testTargetsForShard_ = other.testTargetsForShard_;
            bitField0_ = (bitField0_ & ~0x00000001);
            testTargetsForShardBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTestTargetsForShardFieldBuilder() : null;
          } else {
            testTargetsForShardBuilder_.addAllMessages(other.testTargetsForShard_);
          }
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
              com.google.devtools.testing.v1.TestTargetsForShard m =
                  input.readMessage(
                      com.google.devtools.testing.v1.TestTargetsForShard.parser(),
                      extensionRegistry);
              if (testTargetsForShardBuilder_ == null) {
                ensureTestTargetsForShardIsMutable();
                testTargetsForShard_.add(m);
              } else {
                testTargetsForShardBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.devtools.testing.v1.TestTargetsForShard> testTargetsForShard_ =
      java.util.Collections.emptyList();
    private void ensureTestTargetsForShardIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        testTargetsForShard_ = new java.util.ArrayList<com.google.devtools.testing.v1.TestTargetsForShard>(testTargetsForShard_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.testing.v1.TestTargetsForShard, com.google.devtools.testing.v1.TestTargetsForShard.Builder, com.google.devtools.testing.v1.TestTargetsForShardOrBuilder> testTargetsForShardBuilder_;

    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public java.util.List<com.google.devtools.testing.v1.TestTargetsForShard> getTestTargetsForShardList() {
      if (testTargetsForShardBuilder_ == null) {
        return java.util.Collections.unmodifiableList(testTargetsForShard_);
      } else {
        return testTargetsForShardBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public int getTestTargetsForShardCount() {
      if (testTargetsForShardBuilder_ == null) {
        return testTargetsForShard_.size();
      } else {
        return testTargetsForShardBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public com.google.devtools.testing.v1.TestTargetsForShard getTestTargetsForShard(int index) {
      if (testTargetsForShardBuilder_ == null) {
        return testTargetsForShard_.get(index);
      } else {
        return testTargetsForShardBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder setTestTargetsForShard(
        int index, com.google.devtools.testing.v1.TestTargetsForShard value) {
      if (testTargetsForShardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.set(index, value);
        onChanged();
      } else {
        testTargetsForShardBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder setTestTargetsForShard(
        int index, com.google.devtools.testing.v1.TestTargetsForShard.Builder builderForValue) {
      if (testTargetsForShardBuilder_ == null) {
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.set(index, builderForValue.build());
        onChanged();
      } else {
        testTargetsForShardBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder addTestTargetsForShard(com.google.devtools.testing.v1.TestTargetsForShard value) {
      if (testTargetsForShardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.add(value);
        onChanged();
      } else {
        testTargetsForShardBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder addTestTargetsForShard(
        int index, com.google.devtools.testing.v1.TestTargetsForShard value) {
      if (testTargetsForShardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.add(index, value);
        onChanged();
      } else {
        testTargetsForShardBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder addTestTargetsForShard(
        com.google.devtools.testing.v1.TestTargetsForShard.Builder builderForValue) {
      if (testTargetsForShardBuilder_ == null) {
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.add(builderForValue.build());
        onChanged();
      } else {
        testTargetsForShardBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder addTestTargetsForShard(
        int index, com.google.devtools.testing.v1.TestTargetsForShard.Builder builderForValue) {
      if (testTargetsForShardBuilder_ == null) {
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.add(index, builderForValue.build());
        onChanged();
      } else {
        testTargetsForShardBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder addAllTestTargetsForShard(
        java.lang.Iterable<? extends com.google.devtools.testing.v1.TestTargetsForShard> values) {
      if (testTargetsForShardBuilder_ == null) {
        ensureTestTargetsForShardIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, testTargetsForShard_);
        onChanged();
      } else {
        testTargetsForShardBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder clearTestTargetsForShard() {
      if (testTargetsForShardBuilder_ == null) {
        testTargetsForShard_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        testTargetsForShardBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public Builder removeTestTargetsForShard(int index) {
      if (testTargetsForShardBuilder_ == null) {
        ensureTestTargetsForShardIsMutable();
        testTargetsForShard_.remove(index);
        onChanged();
      } else {
        testTargetsForShardBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public com.google.devtools.testing.v1.TestTargetsForShard.Builder getTestTargetsForShardBuilder(
        int index) {
      return getTestTargetsForShardFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public com.google.devtools.testing.v1.TestTargetsForShardOrBuilder getTestTargetsForShardOrBuilder(
        int index) {
      if (testTargetsForShardBuilder_ == null) {
        return testTargetsForShard_.get(index);  } else {
        return testTargetsForShardBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.testing.v1.TestTargetsForShardOrBuilder> 
         getTestTargetsForShardOrBuilderList() {
      if (testTargetsForShardBuilder_ != null) {
        return testTargetsForShardBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(testTargetsForShard_);
      }
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public com.google.devtools.testing.v1.TestTargetsForShard.Builder addTestTargetsForShardBuilder() {
      return getTestTargetsForShardFieldBuilder().addBuilder(
          com.google.devtools.testing.v1.TestTargetsForShard.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public com.google.devtools.testing.v1.TestTargetsForShard.Builder addTestTargetsForShardBuilder(
        int index) {
      return getTestTargetsForShardFieldBuilder().addBuilder(
          index, com.google.devtools.testing.v1.TestTargetsForShard.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Group of packages, classes, and/or test methods to be run for
     * each shard. When any physical devices are selected,  the number of
     * test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are
     * selected, the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>repeated .google.devtools.testing.v1.TestTargetsForShard test_targets_for_shard = 1;</code>
     */
    public java.util.List<com.google.devtools.testing.v1.TestTargetsForShard.Builder> 
         getTestTargetsForShardBuilderList() {
      return getTestTargetsForShardFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.testing.v1.TestTargetsForShard, com.google.devtools.testing.v1.TestTargetsForShard.Builder, com.google.devtools.testing.v1.TestTargetsForShardOrBuilder> 
        getTestTargetsForShardFieldBuilder() {
      if (testTargetsForShardBuilder_ == null) {
        testTargetsForShardBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.testing.v1.TestTargetsForShard, com.google.devtools.testing.v1.TestTargetsForShard.Builder, com.google.devtools.testing.v1.TestTargetsForShardOrBuilder>(
                testTargetsForShard_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        testTargetsForShard_ = null;
      }
      return testTargetsForShardBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.testing.v1.ManualSharding)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.testing.v1.ManualSharding)
  private static final com.google.devtools.testing.v1.ManualSharding DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.testing.v1.ManualSharding();
  }

  public static com.google.devtools.testing.v1.ManualSharding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManualSharding>
      PARSER = new com.google.protobuf.AbstractParser<ManualSharding>() {
    @java.lang.Override
    public ManualSharding parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManualSharding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManualSharding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.testing.v1.ManualSharding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
