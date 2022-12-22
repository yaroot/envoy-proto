// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/user_event_service.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * Response message for `RejoinUserEvents` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.RejoinUserEventsResponse}
 */
public final class RejoinUserEventsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.RejoinUserEventsResponse)
    RejoinUserEventsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RejoinUserEventsResponse.newBuilder() to construct.
  private RejoinUserEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RejoinUserEventsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RejoinUserEventsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2beta.UserEventServiceProto.internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.UserEventServiceProto.internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.RejoinUserEventsResponse.class, com.google.cloud.retail.v2beta.RejoinUserEventsResponse.Builder.class);
  }

  public static final int REJOINED_USER_EVENTS_COUNT_FIELD_NUMBER = 1;
  private long rejoinedUserEventsCount_ = 0L;
  /**
   * <pre>
   * Number of user events that were joined with latest product catalog.
   * </pre>
   *
   * <code>int64 rejoined_user_events_count = 1;</code>
   * @return The rejoinedUserEventsCount.
   */
  @java.lang.Override
  public long getRejoinedUserEventsCount() {
    return rejoinedUserEventsCount_;
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
    if (rejoinedUserEventsCount_ != 0L) {
      output.writeInt64(1, rejoinedUserEventsCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rejoinedUserEventsCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, rejoinedUserEventsCount_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.RejoinUserEventsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.RejoinUserEventsResponse other = (com.google.cloud.retail.v2beta.RejoinUserEventsResponse) obj;

    if (getRejoinedUserEventsCount()
        != other.getRejoinedUserEventsCount()) return false;
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
    hash = (37 * hash) + REJOINED_USER_EVENTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRejoinedUserEventsCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.RejoinUserEventsResponse prototype) {
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
   * Response message for `RejoinUserEvents` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.RejoinUserEventsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.RejoinUserEventsResponse)
      com.google.cloud.retail.v2beta.RejoinUserEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.UserEventServiceProto.internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.UserEventServiceProto.internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.RejoinUserEventsResponse.class, com.google.cloud.retail.v2beta.RejoinUserEventsResponse.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.RejoinUserEventsResponse.newBuilder()
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
      rejoinedUserEventsCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.UserEventServiceProto.internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.RejoinUserEventsResponse getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.RejoinUserEventsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.RejoinUserEventsResponse build() {
      com.google.cloud.retail.v2beta.RejoinUserEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.RejoinUserEventsResponse buildPartial() {
      com.google.cloud.retail.v2beta.RejoinUserEventsResponse result = new com.google.cloud.retail.v2beta.RejoinUserEventsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2beta.RejoinUserEventsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rejoinedUserEventsCount_ = rejoinedUserEventsCount_;
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
      if (other instanceof com.google.cloud.retail.v2beta.RejoinUserEventsResponse) {
        return mergeFrom((com.google.cloud.retail.v2beta.RejoinUserEventsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.RejoinUserEventsResponse other) {
      if (other == com.google.cloud.retail.v2beta.RejoinUserEventsResponse.getDefaultInstance()) return this;
      if (other.getRejoinedUserEventsCount() != 0L) {
        setRejoinedUserEventsCount(other.getRejoinedUserEventsCount());
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
              rejoinedUserEventsCount_ = input.readInt64();
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

    private long rejoinedUserEventsCount_ ;
    /**
     * <pre>
     * Number of user events that were joined with latest product catalog.
     * </pre>
     *
     * <code>int64 rejoined_user_events_count = 1;</code>
     * @return The rejoinedUserEventsCount.
     */
    @java.lang.Override
    public long getRejoinedUserEventsCount() {
      return rejoinedUserEventsCount_;
    }
    /**
     * <pre>
     * Number of user events that were joined with latest product catalog.
     * </pre>
     *
     * <code>int64 rejoined_user_events_count = 1;</code>
     * @param value The rejoinedUserEventsCount to set.
     * @return This builder for chaining.
     */
    public Builder setRejoinedUserEventsCount(long value) {
      
      rejoinedUserEventsCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of user events that were joined with latest product catalog.
     * </pre>
     *
     * <code>int64 rejoined_user_events_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRejoinedUserEventsCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rejoinedUserEventsCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.RejoinUserEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.RejoinUserEventsResponse)
  private static final com.google.cloud.retail.v2beta.RejoinUserEventsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.RejoinUserEventsResponse();
  }

  public static com.google.cloud.retail.v2beta.RejoinUserEventsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RejoinUserEventsResponse>
      PARSER = new com.google.protobuf.AbstractParser<RejoinUserEventsResponse>() {
    @java.lang.Override
    public RejoinUserEventsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RejoinUserEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RejoinUserEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.RejoinUserEventsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

