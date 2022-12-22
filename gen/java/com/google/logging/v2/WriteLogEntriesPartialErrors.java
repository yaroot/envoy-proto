// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

/**
 * <pre>
 * Error details for WriteLogEntries with partial success.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.WriteLogEntriesPartialErrors}
 */
public final class WriteLogEntriesPartialErrors extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.WriteLogEntriesPartialErrors)
    WriteLogEntriesPartialErrorsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WriteLogEntriesPartialErrors.newBuilder() to construct.
  private WriteLogEntriesPartialErrors(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WriteLogEntriesPartialErrors() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WriteLogEntriesPartialErrors();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetLogEntryErrors();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.WriteLogEntriesPartialErrors.class, com.google.logging.v2.WriteLogEntriesPartialErrors.Builder.class);
  }

  public static final int LOG_ENTRY_ERRORS_FIELD_NUMBER = 1;
  private static final class LogEntryErrorsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, com.google.rpc.Status> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, com.google.rpc.Status>newDefaultInstance(
                com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.rpc.Status.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, com.google.rpc.Status> logEntryErrors_;
  private com.google.protobuf.MapField<java.lang.Integer, com.google.rpc.Status>
  internalGetLogEntryErrors() {
    if (logEntryErrors_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LogEntryErrorsDefaultEntryHolder.defaultEntry);
    }
    return logEntryErrors_;
  }
  public int getLogEntryErrorsCount() {
    return internalGetLogEntryErrors().getMap().size();
  }
  /**
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  @java.lang.Override
  public boolean containsLogEntryErrors(
      int key) {
    
    return internalGetLogEntryErrors().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLogEntryErrorsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.google.rpc.Status> getLogEntryErrors() {
    return getLogEntryErrorsMap();
  }
  /**
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, com.google.rpc.Status> getLogEntryErrorsMap() {
    return internalGetLogEntryErrors().getMap();
  }
  /**
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.rpc.Status getLogEntryErrorsOrDefault(
      int key,
      /* nullable */
com.google.rpc.Status defaultValue) {
    
    java.util.Map<java.lang.Integer, com.google.rpc.Status> map =
        internalGetLogEntryErrors().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getLogEntryErrorsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, com.google.rpc.Status> map =
        internalGetLogEntryErrors().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetLogEntryErrors(),
        LogEntryErrorsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, com.google.rpc.Status> entry
         : internalGetLogEntryErrors().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, com.google.rpc.Status>
      logEntryErrors__ = LogEntryErrorsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, logEntryErrors__);
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
    if (!(obj instanceof com.google.logging.v2.WriteLogEntriesPartialErrors)) {
      return super.equals(obj);
    }
    com.google.logging.v2.WriteLogEntriesPartialErrors other = (com.google.logging.v2.WriteLogEntriesPartialErrors) obj;

    if (!internalGetLogEntryErrors().equals(
        other.internalGetLogEntryErrors())) return false;
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
    if (!internalGetLogEntryErrors().getMap().isEmpty()) {
      hash = (37 * hash) + LOG_ENTRY_ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLogEntryErrors().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.WriteLogEntriesPartialErrors parseFrom(
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
  public static Builder newBuilder(com.google.logging.v2.WriteLogEntriesPartialErrors prototype) {
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
   * Error details for WriteLogEntries with partial success.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.WriteLogEntriesPartialErrors}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.WriteLogEntriesPartialErrors)
      com.google.logging.v2.WriteLogEntriesPartialErrorsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetLogEntryErrors();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLogEntryErrors();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.WriteLogEntriesPartialErrors.class, com.google.logging.v2.WriteLogEntriesPartialErrors.Builder.class);
    }

    // Construct using com.google.logging.v2.WriteLogEntriesPartialErrors.newBuilder()
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
      internalGetMutableLogEntryErrors().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.WriteLogEntriesPartialErrors getDefaultInstanceForType() {
      return com.google.logging.v2.WriteLogEntriesPartialErrors.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.WriteLogEntriesPartialErrors build() {
      com.google.logging.v2.WriteLogEntriesPartialErrors result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.WriteLogEntriesPartialErrors buildPartial() {
      com.google.logging.v2.WriteLogEntriesPartialErrors result = new com.google.logging.v2.WriteLogEntriesPartialErrors(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.WriteLogEntriesPartialErrors result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.logEntryErrors_ = internalGetLogEntryErrors();
        result.logEntryErrors_.makeImmutable();
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
      if (other instanceof com.google.logging.v2.WriteLogEntriesPartialErrors) {
        return mergeFrom((com.google.logging.v2.WriteLogEntriesPartialErrors)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.WriteLogEntriesPartialErrors other) {
      if (other == com.google.logging.v2.WriteLogEntriesPartialErrors.getDefaultInstance()) return this;
      internalGetMutableLogEntryErrors().mergeFrom(
          other.internalGetLogEntryErrors());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.Integer, com.google.rpc.Status>
              logEntryErrors__ = input.readMessage(
                  LogEntryErrorsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableLogEntryErrors().getMutableMap().put(
                  logEntryErrors__.getKey(), logEntryErrors__.getValue());
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.MapField<
        java.lang.Integer, com.google.rpc.Status> logEntryErrors_;
    private com.google.protobuf.MapField<java.lang.Integer, com.google.rpc.Status>
        internalGetLogEntryErrors() {
      if (logEntryErrors_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LogEntryErrorsDefaultEntryHolder.defaultEntry);
      }
      return logEntryErrors_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, com.google.rpc.Status>
        internalGetMutableLogEntryErrors() {
      if (logEntryErrors_ == null) {
        logEntryErrors_ = com.google.protobuf.MapField.newMapField(
            LogEntryErrorsDefaultEntryHolder.defaultEntry);
      }
      if (!logEntryErrors_.isMutable()) {
        logEntryErrors_ = logEntryErrors_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return logEntryErrors_;
    }
    public int getLogEntryErrorsCount() {
      return internalGetLogEntryErrors().getMap().size();
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    @java.lang.Override
    public boolean containsLogEntryErrors(
        int key) {
      
      return internalGetLogEntryErrors().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLogEntryErrorsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.google.rpc.Status> getLogEntryErrors() {
      return getLogEntryErrorsMap();
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, com.google.rpc.Status> getLogEntryErrorsMap() {
      return internalGetLogEntryErrors().getMap();
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.rpc.Status getLogEntryErrorsOrDefault(
        int key,
        /* nullable */
com.google.rpc.Status defaultValue) {
      
      java.util.Map<java.lang.Integer, com.google.rpc.Status> map =
          internalGetLogEntryErrors().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    @java.lang.Override
    public com.google.rpc.Status getLogEntryErrorsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, com.google.rpc.Status> map =
          internalGetLogEntryErrors().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearLogEntryErrors() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableLogEntryErrors().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    public Builder removeLogEntryErrors(
        int key) {
      
      internalGetMutableLogEntryErrors().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.google.rpc.Status>
        getMutableLogEntryErrors() {
      bitField0_ |= 0x00000001;
      return internalGetMutableLogEntryErrors().getMutableMap();
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    public Builder putLogEntryErrors(
        int key,
        com.google.rpc.Status value) {
      
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableLogEntryErrors().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * When `WriteLogEntriesRequest.partial_success` is true, records the error
     * status for entries that were not written due to a permanent error, keyed
     * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
     * Failed requests for which no entries are written will not include
     * per-entry errors.
     * </pre>
     *
     * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
     */
    public Builder putAllLogEntryErrors(
        java.util.Map<java.lang.Integer, com.google.rpc.Status> values) {
      internalGetMutableLogEntryErrors().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.logging.v2.WriteLogEntriesPartialErrors)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.WriteLogEntriesPartialErrors)
  private static final com.google.logging.v2.WriteLogEntriesPartialErrors DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.WriteLogEntriesPartialErrors();
  }

  public static com.google.logging.v2.WriteLogEntriesPartialErrors getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteLogEntriesPartialErrors>
      PARSER = new com.google.protobuf.AbstractParser<WriteLogEntriesPartialErrors>() {
    @java.lang.Override
    public WriteLogEntriesPartialErrors parsePartialFrom(
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

  public static com.google.protobuf.Parser<WriteLogEntriesPartialErrors> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteLogEntriesPartialErrors> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.WriteLogEntriesPartialErrors getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

