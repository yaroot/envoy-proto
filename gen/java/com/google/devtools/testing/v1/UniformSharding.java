// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

/**
 * <pre>
 * Uniformly shards test cases given a total number of shards.
 * For Instrumentation test, it will be translated to "-e numShard" "-e
 * shardIndex" AndroidJUnitRunner arguments. With uniform sharding enabled,
 * specifying these sharding arguments via environment_variables is invalid.
 * </pre>
 *
 * Protobuf type {@code google.devtools.testing.v1.UniformSharding}
 */
public final class UniformSharding extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.testing.v1.UniformSharding)
    UniformShardingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UniformSharding.newBuilder() to construct.
  private UniformSharding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UniformSharding() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UniformSharding();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_UniformSharding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_UniformSharding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.testing.v1.UniformSharding.class, com.google.devtools.testing.v1.UniformSharding.Builder.class);
  }

  public static final int NUM_SHARDS_FIELD_NUMBER = 1;
  private int numShards_ = 0;
  /**
   * <pre>
   * Required. Total number of shards. When any physical devices are selected,
   * the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected,
   * the number must be &gt;= 1 and &lt;= 500.
   * </pre>
   *
   * <code>int32 num_shards = 1;</code>
   * @return The numShards.
   */
  @java.lang.Override
  public int getNumShards() {
    return numShards_;
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
    if (numShards_ != 0) {
      output.writeInt32(1, numShards_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numShards_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numShards_);
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
    if (!(obj instanceof com.google.devtools.testing.v1.UniformSharding)) {
      return super.equals(obj);
    }
    com.google.devtools.testing.v1.UniformSharding other = (com.google.devtools.testing.v1.UniformSharding) obj;

    if (getNumShards()
        != other.getNumShards()) return false;
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
    hash = (37 * hash) + NUM_SHARDS_FIELD_NUMBER;
    hash = (53 * hash) + getNumShards();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.UniformSharding parseFrom(
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
  public static Builder newBuilder(com.google.devtools.testing.v1.UniformSharding prototype) {
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
   * Uniformly shards test cases given a total number of shards.
   * For Instrumentation test, it will be translated to "-e numShard" "-e
   * shardIndex" AndroidJUnitRunner arguments. With uniform sharding enabled,
   * specifying these sharding arguments via environment_variables is invalid.
   * </pre>
   *
   * Protobuf type {@code google.devtools.testing.v1.UniformSharding}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.testing.v1.UniformSharding)
      com.google.devtools.testing.v1.UniformShardingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_UniformSharding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_UniformSharding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.testing.v1.UniformSharding.class, com.google.devtools.testing.v1.UniformSharding.Builder.class);
    }

    // Construct using com.google.devtools.testing.v1.UniformSharding.newBuilder()
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
      numShards_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_UniformSharding_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.UniformSharding getDefaultInstanceForType() {
      return com.google.devtools.testing.v1.UniformSharding.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.UniformSharding build() {
      com.google.devtools.testing.v1.UniformSharding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.UniformSharding buildPartial() {
      com.google.devtools.testing.v1.UniformSharding result = new com.google.devtools.testing.v1.UniformSharding(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.testing.v1.UniformSharding result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numShards_ = numShards_;
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
      if (other instanceof com.google.devtools.testing.v1.UniformSharding) {
        return mergeFrom((com.google.devtools.testing.v1.UniformSharding)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.testing.v1.UniformSharding other) {
      if (other == com.google.devtools.testing.v1.UniformSharding.getDefaultInstance()) return this;
      if (other.getNumShards() != 0) {
        setNumShards(other.getNumShards());
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
              numShards_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int numShards_ ;
    /**
     * <pre>
     * Required. Total number of shards. When any physical devices are selected,
     * the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected,
     * the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>int32 num_shards = 1;</code>
     * @return The numShards.
     */
    @java.lang.Override
    public int getNumShards() {
      return numShards_;
    }
    /**
     * <pre>
     * Required. Total number of shards. When any physical devices are selected,
     * the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected,
     * the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>int32 num_shards = 1;</code>
     * @param value The numShards to set.
     * @return This builder for chaining.
     */
    public Builder setNumShards(int value) {
      
      numShards_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Total number of shards. When any physical devices are selected,
     * the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected,
     * the number must be &gt;= 1 and &lt;= 500.
     * </pre>
     *
     * <code>int32 num_shards = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumShards() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numShards_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.testing.v1.UniformSharding)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.testing.v1.UniformSharding)
  private static final com.google.devtools.testing.v1.UniformSharding DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.testing.v1.UniformSharding();
  }

  public static com.google.devtools.testing.v1.UniformSharding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UniformSharding>
      PARSER = new com.google.protobuf.AbstractParser<UniformSharding>() {
    @java.lang.Override
    public UniformSharding parsePartialFrom(
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

  public static com.google.protobuf.Parser<UniformSharding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UniformSharding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.testing.v1.UniformSharding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

