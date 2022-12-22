// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/batch_job_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * Response message for [BatchJobService.AddBatchJobOperations][google.ads.googleads.v11.services.BatchJobService.AddBatchJobOperations].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.AddBatchJobOperationsResponse}
 */
public final class AddBatchJobOperationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.AddBatchJobOperationsResponse)
    AddBatchJobOperationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddBatchJobOperationsResponse.newBuilder() to construct.
  private AddBatchJobOperationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddBatchJobOperationsResponse() {
    nextSequenceToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddBatchJobOperationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_AddBatchJobOperationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_AddBatchJobOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.class, com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.Builder.class);
  }

  public static final int TOTAL_OPERATIONS_FIELD_NUMBER = 1;
  private long totalOperations_ = 0L;
  /**
   * <pre>
   * The total number of operations added so far for this batch job.
   * </pre>
   *
   * <code>int64 total_operations = 1;</code>
   * @return The totalOperations.
   */
  @java.lang.Override
  public long getTotalOperations() {
    return totalOperations_;
  }

  public static final int NEXT_SEQUENCE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextSequenceToken_ = "";
  /**
   * <pre>
   * The sequence token to be used when calling AddBatchJobOperations again if
   * more operations need to be added. The next AddBatchJobOperations request
   * must set the sequence_token field to the value of this field.
   * </pre>
   *
   * <code>string next_sequence_token = 2;</code>
   * @return The nextSequenceToken.
   */
  @java.lang.Override
  public java.lang.String getNextSequenceToken() {
    java.lang.Object ref = nextSequenceToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextSequenceToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The sequence token to be used when calling AddBatchJobOperations again if
   * more operations need to be added. The next AddBatchJobOperations request
   * must set the sequence_token field to the value of this field.
   * </pre>
   *
   * <code>string next_sequence_token = 2;</code>
   * @return The bytes for nextSequenceToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextSequenceTokenBytes() {
    java.lang.Object ref = nextSequenceToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextSequenceToken_ = b;
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
    if (totalOperations_ != 0L) {
      output.writeInt64(1, totalOperations_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextSequenceToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextSequenceToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalOperations_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, totalOperations_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextSequenceToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextSequenceToken_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse other = (com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse) obj;

    if (getTotalOperations()
        != other.getTotalOperations()) return false;
    if (!getNextSequenceToken()
        .equals(other.getNextSequenceToken())) return false;
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
    hash = (37 * hash) + TOTAL_OPERATIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalOperations());
    hash = (37 * hash) + NEXT_SEQUENCE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextSequenceToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse prototype) {
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
   * Response message for [BatchJobService.AddBatchJobOperations][google.ads.googleads.v11.services.BatchJobService.AddBatchJobOperations].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.AddBatchJobOperationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.AddBatchJobOperationsResponse)
      com.google.ads.googleads.v11.services.AddBatchJobOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_AddBatchJobOperationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_AddBatchJobOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.class, com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.newBuilder()
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
      totalOperations_ = 0L;
      nextSequenceToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_AddBatchJobOperationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse build() {
      com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse buildPartial() {
      com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse result = new com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalOperations_ = totalOperations_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextSequenceToken_ = nextSequenceToken_;
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
      if (other instanceof com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse) {
        return mergeFrom((com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse other) {
      if (other == com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse.getDefaultInstance()) return this;
      if (other.getTotalOperations() != 0L) {
        setTotalOperations(other.getTotalOperations());
      }
      if (!other.getNextSequenceToken().isEmpty()) {
        nextSequenceToken_ = other.nextSequenceToken_;
        bitField0_ |= 0x00000002;
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
            case 8: {
              totalOperations_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              nextSequenceToken_ = input.readStringRequireUtf8();
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

    private long totalOperations_ ;
    /**
     * <pre>
     * The total number of operations added so far for this batch job.
     * </pre>
     *
     * <code>int64 total_operations = 1;</code>
     * @return The totalOperations.
     */
    @java.lang.Override
    public long getTotalOperations() {
      return totalOperations_;
    }
    /**
     * <pre>
     * The total number of operations added so far for this batch job.
     * </pre>
     *
     * <code>int64 total_operations = 1;</code>
     * @param value The totalOperations to set.
     * @return This builder for chaining.
     */
    public Builder setTotalOperations(long value) {
      
      totalOperations_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of operations added so far for this batch job.
     * </pre>
     *
     * <code>int64 total_operations = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalOperations() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalOperations_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object nextSequenceToken_ = "";
    /**
     * <pre>
     * The sequence token to be used when calling AddBatchJobOperations again if
     * more operations need to be added. The next AddBatchJobOperations request
     * must set the sequence_token field to the value of this field.
     * </pre>
     *
     * <code>string next_sequence_token = 2;</code>
     * @return The nextSequenceToken.
     */
    public java.lang.String getNextSequenceToken() {
      java.lang.Object ref = nextSequenceToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextSequenceToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The sequence token to be used when calling AddBatchJobOperations again if
     * more operations need to be added. The next AddBatchJobOperations request
     * must set the sequence_token field to the value of this field.
     * </pre>
     *
     * <code>string next_sequence_token = 2;</code>
     * @return The bytes for nextSequenceToken.
     */
    public com.google.protobuf.ByteString
        getNextSequenceTokenBytes() {
      java.lang.Object ref = nextSequenceToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextSequenceToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The sequence token to be used when calling AddBatchJobOperations again if
     * more operations need to be added. The next AddBatchJobOperations request
     * must set the sequence_token field to the value of this field.
     * </pre>
     *
     * <code>string next_sequence_token = 2;</code>
     * @param value The nextSequenceToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextSequenceToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextSequenceToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence token to be used when calling AddBatchJobOperations again if
     * more operations need to be added. The next AddBatchJobOperations request
     * must set the sequence_token field to the value of this field.
     * </pre>
     *
     * <code>string next_sequence_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextSequenceToken() {
      nextSequenceToken_ = getDefaultInstance().getNextSequenceToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence token to be used when calling AddBatchJobOperations again if
     * more operations need to be added. The next AddBatchJobOperations request
     * must set the sequence_token field to the value of this field.
     * </pre>
     *
     * <code>string next_sequence_token = 2;</code>
     * @param value The bytes for nextSequenceToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextSequenceTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextSequenceToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.AddBatchJobOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.AddBatchJobOperationsResponse)
  private static final com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse();
  }

  public static com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddBatchJobOperationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddBatchJobOperationsResponse>() {
    @java.lang.Override
    public AddBatchJobOperationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddBatchJobOperationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddBatchJobOperationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.AddBatchJobOperationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

