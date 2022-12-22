// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1beta2/pubsub.proto

package com.google.pubsub.v1beta2;

/**
 * <pre>
 * Request for the Acknowledge method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1beta2.AcknowledgeRequest}
 */
public final class AcknowledgeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1beta2.AcknowledgeRequest)
    AcknowledgeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcknowledgeRequest.newBuilder() to construct.
  private AcknowledgeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcknowledgeRequest() {
    subscription_ = "";
    ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcknowledgeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1beta2.PubsubProto.internal_static_google_pubsub_v1beta2_AcknowledgeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1beta2.PubsubProto.internal_static_google_pubsub_v1beta2_AcknowledgeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1beta2.AcknowledgeRequest.class, com.google.pubsub.v1beta2.AcknowledgeRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subscription_ = "";
  /**
   * <pre>
   * The subscription whose message is being acknowledged.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The subscription whose message is being acknowledged.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACK_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList ackIds_;
  /**
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the Pull response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   * @return A list containing the ackIds.
   */
  public com.google.protobuf.ProtocolStringList
      getAckIdsList() {
    return ackIds_;
  }
  /**
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the Pull response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   * @return The count of ackIds.
   */
  public int getAckIdsCount() {
    return ackIds_.size();
  }
  /**
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the Pull response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The ackIds at the given index.
   */
  public java.lang.String getAckIds(int index) {
    return ackIds_.get(index);
  }
  /**
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the Pull response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ackIds at the given index.
   */
  public com.google.protobuf.ByteString
      getAckIdsBytes(int index) {
    return ackIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    for (int i = 0; i < ackIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ackIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ackIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(ackIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAckIdsList().size();
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
    if (!(obj instanceof com.google.pubsub.v1beta2.AcknowledgeRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1beta2.AcknowledgeRequest other = (com.google.pubsub.v1beta2.AcknowledgeRequest) obj;

    if (!getSubscription()
        .equals(other.getSubscription())) return false;
    if (!getAckIdsList()
        .equals(other.getAckIdsList())) return false;
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
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    if (getAckIdsCount() > 0) {
      hash = (37 * hash) + ACK_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAckIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1beta2.AcknowledgeRequest parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1beta2.AcknowledgeRequest prototype) {
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
   * Request for the Acknowledge method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1beta2.AcknowledgeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1beta2.AcknowledgeRequest)
      com.google.pubsub.v1beta2.AcknowledgeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1beta2.PubsubProto.internal_static_google_pubsub_v1beta2_AcknowledgeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1beta2.PubsubProto.internal_static_google_pubsub_v1beta2_AcknowledgeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1beta2.AcknowledgeRequest.class, com.google.pubsub.v1beta2.AcknowledgeRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1beta2.AcknowledgeRequest.newBuilder()
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
      subscription_ = "";
      ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1beta2.PubsubProto.internal_static_google_pubsub_v1beta2_AcknowledgeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1beta2.AcknowledgeRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1beta2.AcknowledgeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1beta2.AcknowledgeRequest build() {
      com.google.pubsub.v1beta2.AcknowledgeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1beta2.AcknowledgeRequest buildPartial() {
      com.google.pubsub.v1beta2.AcknowledgeRequest result = new com.google.pubsub.v1beta2.AcknowledgeRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.pubsub.v1beta2.AcknowledgeRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        ackIds_ = ackIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.ackIds_ = ackIds_;
    }

    private void buildPartial0(com.google.pubsub.v1beta2.AcknowledgeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscription_;
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
      if (other instanceof com.google.pubsub.v1beta2.AcknowledgeRequest) {
        return mergeFrom((com.google.pubsub.v1beta2.AcknowledgeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1beta2.AcknowledgeRequest other) {
      if (other == com.google.pubsub.v1beta2.AcknowledgeRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.ackIds_.isEmpty()) {
        if (ackIds_.isEmpty()) {
          ackIds_ = other.ackIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAckIdsIsMutable();
          ackIds_.addAll(other.ackIds_);
        }
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
            case 10: {
              subscription_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAckIdsIsMutable();
              ackIds_.add(s);
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

    private java.lang.Object subscription_ = "";
    /**
     * <pre>
     * The subscription whose message is being acknowledged.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The subscription whose message is being acknowledged.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString
        getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The subscription whose message is being acknowledged.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subscription whose message is being acknowledged.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      subscription_ = getDefaultInstance().getSubscription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subscription whose message is being acknowledged.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAckIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        ackIds_ = new com.google.protobuf.LazyStringArrayList(ackIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @return A list containing the ackIds.
     */
    public com.google.protobuf.ProtocolStringList
        getAckIdsList() {
      return ackIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @return The count of ackIds.
     */
    public int getAckIdsCount() {
      return ackIds_.size();
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The ackIds at the given index.
     */
    public java.lang.String getAckIds(int index) {
      return ackIds_.get(index);
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the ackIds at the given index.
     */
    public com.google.protobuf.ByteString
        getAckIdsBytes(int index) {
      return ackIds_.getByteString(index);
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The ackIds to set.
     * @return This builder for chaining.
     */
    public Builder setAckIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAckIdsIsMutable();
      ackIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @param value The ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAckIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAckIdsIsMutable();
      ackIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @param values The ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAckIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAckIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ackIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAckIds() {
      ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the Pull response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     * @param value The bytes of the ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAckIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAckIdsIsMutable();
      ackIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1beta2.AcknowledgeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1beta2.AcknowledgeRequest)
  private static final com.google.pubsub.v1beta2.AcknowledgeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1beta2.AcknowledgeRequest();
  }

  public static com.google.pubsub.v1beta2.AcknowledgeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgeRequest>
      PARSER = new com.google.protobuf.AbstractParser<AcknowledgeRequest>() {
    @java.lang.Override
    public AcknowledgeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcknowledgeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1beta2.AcknowledgeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

