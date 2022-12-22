// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/version.proto

package com.google.appengine.v1beta;

/**
 * <pre>
 * Target scaling by request utilization.
 * Only applicable in the App Engine flexible environment.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1beta.RequestUtilization}
 */
public final class RequestUtilization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1beta.RequestUtilization)
    RequestUtilizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestUtilization.newBuilder() to construct.
  private RequestUtilization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestUtilization() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestUtilization();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1beta.VersionProto.internal_static_google_appengine_v1beta_RequestUtilization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1beta.VersionProto.internal_static_google_appengine_v1beta_RequestUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1beta.RequestUtilization.class, com.google.appengine.v1beta.RequestUtilization.Builder.class);
  }

  public static final int TARGET_REQUEST_COUNT_PER_SECOND_FIELD_NUMBER = 1;
  private int targetRequestCountPerSecond_ = 0;
  /**
   * <pre>
   * Target requests per second.
   * </pre>
   *
   * <code>int32 target_request_count_per_second = 1;</code>
   * @return The targetRequestCountPerSecond.
   */
  @java.lang.Override
  public int getTargetRequestCountPerSecond() {
    return targetRequestCountPerSecond_;
  }

  public static final int TARGET_CONCURRENT_REQUESTS_FIELD_NUMBER = 2;
  private int targetConcurrentRequests_ = 0;
  /**
   * <pre>
   * Target number of concurrent requests.
   * </pre>
   *
   * <code>int32 target_concurrent_requests = 2;</code>
   * @return The targetConcurrentRequests.
   */
  @java.lang.Override
  public int getTargetConcurrentRequests() {
    return targetConcurrentRequests_;
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
    if (targetRequestCountPerSecond_ != 0) {
      output.writeInt32(1, targetRequestCountPerSecond_);
    }
    if (targetConcurrentRequests_ != 0) {
      output.writeInt32(2, targetConcurrentRequests_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetRequestCountPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, targetRequestCountPerSecond_);
    }
    if (targetConcurrentRequests_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, targetConcurrentRequests_);
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
    if (!(obj instanceof com.google.appengine.v1beta.RequestUtilization)) {
      return super.equals(obj);
    }
    com.google.appengine.v1beta.RequestUtilization other = (com.google.appengine.v1beta.RequestUtilization) obj;

    if (getTargetRequestCountPerSecond()
        != other.getTargetRequestCountPerSecond()) return false;
    if (getTargetConcurrentRequests()
        != other.getTargetConcurrentRequests()) return false;
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
    hash = (37 * hash) + TARGET_REQUEST_COUNT_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetRequestCountPerSecond();
    hash = (37 * hash) + TARGET_CONCURRENT_REQUESTS_FIELD_NUMBER;
    hash = (53 * hash) + getTargetConcurrentRequests();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.RequestUtilization parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1beta.RequestUtilization prototype) {
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
   * Target scaling by request utilization.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1beta.RequestUtilization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1beta.RequestUtilization)
      com.google.appengine.v1beta.RequestUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1beta.VersionProto.internal_static_google_appengine_v1beta_RequestUtilization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1beta.VersionProto.internal_static_google_appengine_v1beta_RequestUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1beta.RequestUtilization.class, com.google.appengine.v1beta.RequestUtilization.Builder.class);
    }

    // Construct using com.google.appengine.v1beta.RequestUtilization.newBuilder()
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
      targetRequestCountPerSecond_ = 0;
      targetConcurrentRequests_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1beta.VersionProto.internal_static_google_appengine_v1beta_RequestUtilization_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.RequestUtilization getDefaultInstanceForType() {
      return com.google.appengine.v1beta.RequestUtilization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1beta.RequestUtilization build() {
      com.google.appengine.v1beta.RequestUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.RequestUtilization buildPartial() {
      com.google.appengine.v1beta.RequestUtilization result = new com.google.appengine.v1beta.RequestUtilization(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1beta.RequestUtilization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetRequestCountPerSecond_ = targetRequestCountPerSecond_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetConcurrentRequests_ = targetConcurrentRequests_;
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
      if (other instanceof com.google.appengine.v1beta.RequestUtilization) {
        return mergeFrom((com.google.appengine.v1beta.RequestUtilization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1beta.RequestUtilization other) {
      if (other == com.google.appengine.v1beta.RequestUtilization.getDefaultInstance()) return this;
      if (other.getTargetRequestCountPerSecond() != 0) {
        setTargetRequestCountPerSecond(other.getTargetRequestCountPerSecond());
      }
      if (other.getTargetConcurrentRequests() != 0) {
        setTargetConcurrentRequests(other.getTargetConcurrentRequests());
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
              targetRequestCountPerSecond_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              targetConcurrentRequests_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int targetRequestCountPerSecond_ ;
    /**
     * <pre>
     * Target requests per second.
     * </pre>
     *
     * <code>int32 target_request_count_per_second = 1;</code>
     * @return The targetRequestCountPerSecond.
     */
    @java.lang.Override
    public int getTargetRequestCountPerSecond() {
      return targetRequestCountPerSecond_;
    }
    /**
     * <pre>
     * Target requests per second.
     * </pre>
     *
     * <code>int32 target_request_count_per_second = 1;</code>
     * @param value The targetRequestCountPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setTargetRequestCountPerSecond(int value) {
      
      targetRequestCountPerSecond_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target requests per second.
     * </pre>
     *
     * <code>int32 target_request_count_per_second = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetRequestCountPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetRequestCountPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetConcurrentRequests_ ;
    /**
     * <pre>
     * Target number of concurrent requests.
     * </pre>
     *
     * <code>int32 target_concurrent_requests = 2;</code>
     * @return The targetConcurrentRequests.
     */
    @java.lang.Override
    public int getTargetConcurrentRequests() {
      return targetConcurrentRequests_;
    }
    /**
     * <pre>
     * Target number of concurrent requests.
     * </pre>
     *
     * <code>int32 target_concurrent_requests = 2;</code>
     * @param value The targetConcurrentRequests to set.
     * @return This builder for chaining.
     */
    public Builder setTargetConcurrentRequests(int value) {
      
      targetConcurrentRequests_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target number of concurrent requests.
     * </pre>
     *
     * <code>int32 target_concurrent_requests = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetConcurrentRequests() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetConcurrentRequests_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1beta.RequestUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1beta.RequestUtilization)
  private static final com.google.appengine.v1beta.RequestUtilization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1beta.RequestUtilization();
  }

  public static com.google.appengine.v1beta.RequestUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestUtilization>
      PARSER = new com.google.protobuf.AbstractParser<RequestUtilization>() {
    @java.lang.Override
    public RequestUtilization parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestUtilization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1beta.RequestUtilization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
