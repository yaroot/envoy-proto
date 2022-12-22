// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/market/v2/services.proto

package com.google.ccc.hosted.marketplace.v2;

/**
 * Protobuf type {@code ccc.hosted.marketplace.v2.LicenseNotificationListRequest}
 */
public final class LicenseNotificationListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ccc.hosted.marketplace.v2.LicenseNotificationListRequest)
    LicenseNotificationListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LicenseNotificationListRequest.newBuilder() to construct.
  private LicenseNotificationListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LicenseNotificationListRequest() {
    applicationId_ = "";
    startToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LicenseNotificationListRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ccc.hosted.marketplace.v2.ServiceProto.internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ccc.hosted.marketplace.v2.ServiceProto.internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.class, com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.Builder.class);
  }

  public static final int APPLICATION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object applicationId_ = "";
  /**
   * <pre>
   * Application Id
   * </pre>
   *
   * <code>string application_id = 1;</code>
   * @return The applicationId.
   */
  @java.lang.Override
  public java.lang.String getApplicationId() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Application Id
   * </pre>
   *
   * <code>string application_id = 1;</code>
   * @return The bytes for applicationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationIdBytes() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_RESULTS_FIELD_NUMBER = 2;
  private int maxResults_ = 0;
  /**
   * <code>uint32 max_results = 2;</code>
   * @return The maxResults.
   */
  @java.lang.Override
  public int getMaxResults() {
    return maxResults_;
  }

  public static final int START_TOKEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object startToken_ = "";
  /**
   * <code>string start_token = 3;</code>
   * @return The startToken.
   */
  @java.lang.Override
  public java.lang.String getStartToken() {
    java.lang.Object ref = startToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startToken_ = s;
      return s;
    }
  }
  /**
   * <code>string start_token = 3;</code>
   * @return The bytes for startToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTokenBytes() {
    java.lang.Object ref = startToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_ = 0L;
  /**
   * <pre>
   * Timestamp in milliseconds since epoch
   * </pre>
   *
   * <code>uint64 timestamp = 4;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, applicationId_);
    }
    if (maxResults_ != 0) {
      output.writeUInt32(2, maxResults_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, startToken_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(4, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, applicationId_);
    }
    if (maxResults_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, maxResults_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, startToken_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, timestamp_);
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
    if (!(obj instanceof com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest)) {
      return super.equals(obj);
    }
    com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest other = (com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest) obj;

    if (!getApplicationId()
        .equals(other.getApplicationId())) return false;
    if (getMaxResults()
        != other.getMaxResults()) return false;
    if (!getStartToken()
        .equals(other.getStartToken())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + APPLICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationId().hashCode();
    hash = (37 * hash) + MAX_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxResults();
    hash = (37 * hash) + START_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getStartToken().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest parseFrom(
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
  public static Builder newBuilder(com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest prototype) {
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
   * Protobuf type {@code ccc.hosted.marketplace.v2.LicenseNotificationListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ccc.hosted.marketplace.v2.LicenseNotificationListRequest)
      com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ccc.hosted.marketplace.v2.ServiceProto.internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ccc.hosted.marketplace.v2.ServiceProto.internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.class, com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.Builder.class);
    }

    // Construct using com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.newBuilder()
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
      applicationId_ = "";
      maxResults_ = 0;
      startToken_ = "";
      timestamp_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ccc.hosted.marketplace.v2.ServiceProto.internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest getDefaultInstanceForType() {
      return com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest build() {
      com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest buildPartial() {
      com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest result = new com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.applicationId_ = applicationId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxResults_ = maxResults_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startToken_ = startToken_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.timestamp_ = timestamp_;
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
      if (other instanceof com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest) {
        return mergeFrom((com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest other) {
      if (other == com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest.getDefaultInstance()) return this;
      if (!other.getApplicationId().isEmpty()) {
        applicationId_ = other.applicationId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMaxResults() != 0) {
        setMaxResults(other.getMaxResults());
      }
      if (!other.getStartToken().isEmpty()) {
        startToken_ = other.startToken_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              applicationId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              maxResults_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              startToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object applicationId_ = "";
    /**
     * <pre>
     * Application Id
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @return The applicationId.
     */
    public java.lang.String getApplicationId() {
      java.lang.Object ref = applicationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Application Id
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @return The bytes for applicationId.
     */
    public com.google.protobuf.ByteString
        getApplicationIdBytes() {
      java.lang.Object ref = applicationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Application Id
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @param value The applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      applicationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Application Id
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationId() {
      applicationId_ = getDefaultInstance().getApplicationId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Application Id
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @param value The bytes for applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      applicationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int maxResults_ ;
    /**
     * <code>uint32 max_results = 2;</code>
     * @return The maxResults.
     */
    @java.lang.Override
    public int getMaxResults() {
      return maxResults_;
    }
    /**
     * <code>uint32 max_results = 2;</code>
     * @param value The maxResults to set.
     * @return This builder for chaining.
     */
    public Builder setMaxResults(int value) {
      
      maxResults_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_results = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxResults() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxResults_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object startToken_ = "";
    /**
     * <code>string start_token = 3;</code>
     * @return The startToken.
     */
    public java.lang.String getStartToken() {
      java.lang.Object ref = startToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string start_token = 3;</code>
     * @return The bytes for startToken.
     */
    public com.google.protobuf.ByteString
        getStartTokenBytes() {
      java.lang.Object ref = startToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string start_token = 3;</code>
     * @param value The startToken to set.
     * @return This builder for chaining.
     */
    public Builder setStartToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      startToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string start_token = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartToken() {
      startToken_ = getDefaultInstance().getStartToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string start_token = 3;</code>
     * @param value The bytes for startToken to set.
     * @return This builder for chaining.
     */
    public Builder setStartTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      startToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * Timestamp in milliseconds since epoch
     * </pre>
     *
     * <code>uint64 timestamp = 4;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * Timestamp in milliseconds since epoch
     * </pre>
     *
     * <code>uint64 timestamp = 4;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp in milliseconds since epoch
     * </pre>
     *
     * <code>uint64 timestamp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000008);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ccc.hosted.marketplace.v2.LicenseNotificationListRequest)
  }

  // @@protoc_insertion_point(class_scope:ccc.hosted.marketplace.v2.LicenseNotificationListRequest)
  private static final com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest();
  }

  public static com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LicenseNotificationListRequest>
      PARSER = new com.google.protobuf.AbstractParser<LicenseNotificationListRequest>() {
    @java.lang.Override
    public LicenseNotificationListRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LicenseNotificationListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LicenseNotificationListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ccc.hosted.marketplace.v2.LicenseNotificationListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
