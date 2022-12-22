// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * Agent Assist Smart Reply data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.SmartReplyData}
 */
public final class SmartReplyData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.SmartReplyData)
    SmartReplyDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmartReplyData.newBuilder() to construct.
  private SmartReplyData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmartReplyData() {
    reply_ = "";
    queryRecord_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmartReplyData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_SmartReplyData_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_SmartReplyData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.SmartReplyData.class, com.google.cloud.contactcenterinsights.v1.SmartReplyData.Builder.class);
  }

  public static final int REPLY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reply_ = "";
  /**
   * <pre>
   * The content of the reply.
   * </pre>
   *
   * <code>string reply = 1;</code>
   * @return The reply.
   */
  @java.lang.Override
  public java.lang.String getReply() {
    java.lang.Object ref = reply_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reply_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The content of the reply.
   * </pre>
   *
   * <code>string reply = 1;</code>
   * @return The bytes for reply.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReplyBytes() {
    java.lang.Object ref = reply_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reply_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 2;
  private double confidenceScore_ = 0D;
  /**
   * <pre>
   * The system's confidence score that this reply is a good match for this
   * conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely
   * certain).
   * </pre>
   *
   * <code>double confidence_score = 2;</code>
   * @return The confidenceScore.
   */
  @java.lang.Override
  public double getConfidenceScore() {
    return confidenceScore_;
  }

  public static final int METADATA_FIELD_NUMBER = 3;
  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_SmartReplyData_MetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> metadata_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }
  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   * <pre>
   * Map that contains metadata about the Smart Reply and the document from
   * which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public boolean containsMetadata(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   * <pre>
   * Map that contains metadata about the Smart Reply and the document from
   * which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   * <pre>
   * Map that contains metadata about the Smart Reply and the document from
   * which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map that contains metadata about the Smart Reply and the document from
   * which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public java.lang.String getMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int QUERY_RECORD_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object queryRecord_ = "";
  /**
   * <pre>
   * The name of the answer record.
   * Format:
   * projects/{project}/locations/{location}/answerRecords/{answer_record}
   * </pre>
   *
   * <code>string query_record = 4;</code>
   * @return The queryRecord.
   */
  @java.lang.Override
  public java.lang.String getQueryRecord() {
    java.lang.Object ref = queryRecord_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryRecord_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the answer record.
   * Format:
   * projects/{project}/locations/{location}/answerRecords/{answer_record}
   * </pre>
   *
   * <code>string query_record = 4;</code>
   * @return The bytes for queryRecord.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryRecordBytes() {
    java.lang.Object ref = queryRecord_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queryRecord_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reply_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reply_);
    }
    if (java.lang.Double.doubleToRawLongBits(confidenceScore_) != 0) {
      output.writeDouble(2, confidenceScore_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMetadata(),
        MetadataDefaultEntryHolder.defaultEntry,
        3);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryRecord_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, queryRecord_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reply_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reply_);
    }
    if (java.lang.Double.doubleToRawLongBits(confidenceScore_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, confidenceScore_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      metadata__ = MetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, metadata__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryRecord_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, queryRecord_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.SmartReplyData)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.SmartReplyData other = (com.google.cloud.contactcenterinsights.v1.SmartReplyData) obj;

    if (!getReply()
        .equals(other.getReply())) return false;
    if (java.lang.Double.doubleToLongBits(getConfidenceScore())
        != java.lang.Double.doubleToLongBits(
            other.getConfidenceScore())) return false;
    if (!internalGetMetadata().equals(
        other.internalGetMetadata())) return false;
    if (!getQueryRecord()
        .equals(other.getQueryRecord())) return false;
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
    hash = (37 * hash) + REPLY_FIELD_NUMBER;
    hash = (53 * hash) + getReply().hashCode();
    hash = (37 * hash) + CONFIDENCE_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getConfidenceScore()));
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    hash = (37 * hash) + QUERY_RECORD_FIELD_NUMBER;
    hash = (53 * hash) + getQueryRecord().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.SmartReplyData prototype) {
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
   * Agent Assist Smart Reply data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.SmartReplyData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.SmartReplyData)
      com.google.cloud.contactcenterinsights.v1.SmartReplyDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_SmartReplyData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_SmartReplyData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.SmartReplyData.class, com.google.cloud.contactcenterinsights.v1.SmartReplyData.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.SmartReplyData.newBuilder()
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
      reply_ = "";
      confidenceScore_ = 0D;
      internalGetMutableMetadata().clear();
      queryRecord_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_SmartReplyData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.SmartReplyData getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.SmartReplyData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.SmartReplyData build() {
      com.google.cloud.contactcenterinsights.v1.SmartReplyData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.SmartReplyData buildPartial() {
      com.google.cloud.contactcenterinsights.v1.SmartReplyData result = new com.google.cloud.contactcenterinsights.v1.SmartReplyData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.SmartReplyData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reply_ = reply_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.confidenceScore_ = confidenceScore_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadata_ = internalGetMetadata();
        result.metadata_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.queryRecord_ = queryRecord_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.SmartReplyData) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.SmartReplyData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.SmartReplyData other) {
      if (other == com.google.cloud.contactcenterinsights.v1.SmartReplyData.getDefaultInstance()) return this;
      if (!other.getReply().isEmpty()) {
        reply_ = other.reply_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getConfidenceScore() != 0D) {
        setConfidenceScore(other.getConfidenceScore());
      }
      internalGetMutableMetadata().mergeFrom(
          other.internalGetMetadata());
      bitField0_ |= 0x00000004;
      if (!other.getQueryRecord().isEmpty()) {
        queryRecord_ = other.queryRecord_;
        bitField0_ |= 0x00000008;
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
              reply_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              confidenceScore_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              metadata__ = input.readMessage(
                  MetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableMetadata().getMutableMap().put(
                  metadata__.getKey(), metadata__.getValue());
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              queryRecord_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object reply_ = "";
    /**
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     * @return The reply.
     */
    public java.lang.String getReply() {
      java.lang.Object ref = reply_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reply_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     * @return The bytes for reply.
     */
    public com.google.protobuf.ByteString
        getReplyBytes() {
      java.lang.Object ref = reply_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reply_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     * @param value The reply to set.
     * @return This builder for chaining.
     */
    public Builder setReply(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reply_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReply() {
      reply_ = getDefaultInstance().getReply();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     * @param value The bytes for reply to set.
     * @return This builder for chaining.
     */
    public Builder setReplyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reply_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double confidenceScore_ ;
    /**
     * <pre>
     * The system's confidence score that this reply is a good match for this
     * conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely
     * certain).
     * </pre>
     *
     * <code>double confidence_score = 2;</code>
     * @return The confidenceScore.
     */
    @java.lang.Override
    public double getConfidenceScore() {
      return confidenceScore_;
    }
    /**
     * <pre>
     * The system's confidence score that this reply is a good match for this
     * conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely
     * certain).
     * </pre>
     *
     * <code>double confidence_score = 2;</code>
     * @param value The confidenceScore to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceScore(double value) {
      
      confidenceScore_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The system's confidence score that this reply is a good match for this
     * conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely
     * certain).
     * </pre>
     *
     * <code>double confidence_score = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidenceScore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      confidenceScore_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> metadata_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMetadata() {
      if (metadata_ == null) {
        metadata_ = com.google.protobuf.MapField.newMapField(
            MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return metadata_;
    }
    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public boolean containsMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMetadataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getMetadataOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    public Builder removeMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableMetadata() {
      bitField0_ |= 0x00000004;
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    public Builder putMetadata(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableMetadata().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Map that contains metadata about the Smart Reply and the document from
     * which it originates.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    public Builder putAllMetadata(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
      return this;
    }

    private java.lang.Object queryRecord_ = "";
    /**
     * <pre>
     * The name of the answer record.
     * Format:
     * projects/{project}/locations/{location}/answerRecords/{answer_record}
     * </pre>
     *
     * <code>string query_record = 4;</code>
     * @return The queryRecord.
     */
    public java.lang.String getQueryRecord() {
      java.lang.Object ref = queryRecord_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryRecord_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the answer record.
     * Format:
     * projects/{project}/locations/{location}/answerRecords/{answer_record}
     * </pre>
     *
     * <code>string query_record = 4;</code>
     * @return The bytes for queryRecord.
     */
    public com.google.protobuf.ByteString
        getQueryRecordBytes() {
      java.lang.Object ref = queryRecord_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryRecord_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the answer record.
     * Format:
     * projects/{project}/locations/{location}/answerRecords/{answer_record}
     * </pre>
     *
     * <code>string query_record = 4;</code>
     * @param value The queryRecord to set.
     * @return This builder for chaining.
     */
    public Builder setQueryRecord(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      queryRecord_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the answer record.
     * Format:
     * projects/{project}/locations/{location}/answerRecords/{answer_record}
     * </pre>
     *
     * <code>string query_record = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryRecord() {
      queryRecord_ = getDefaultInstance().getQueryRecord();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the answer record.
     * Format:
     * projects/{project}/locations/{location}/answerRecords/{answer_record}
     * </pre>
     *
     * <code>string query_record = 4;</code>
     * @param value The bytes for queryRecord to set.
     * @return This builder for chaining.
     */
    public Builder setQueryRecordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      queryRecord_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.SmartReplyData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.SmartReplyData)
  private static final com.google.cloud.contactcenterinsights.v1.SmartReplyData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.SmartReplyData();
  }

  public static com.google.cloud.contactcenterinsights.v1.SmartReplyData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartReplyData>
      PARSER = new com.google.protobuf.AbstractParser<SmartReplyData>() {
    @java.lang.Override
    public SmartReplyData parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmartReplyData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartReplyData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.SmartReplyData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

