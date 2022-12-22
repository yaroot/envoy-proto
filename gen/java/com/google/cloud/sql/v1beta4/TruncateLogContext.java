// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

/**
 * <pre>
 * Database Instance truncate log context.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1beta4.TruncateLogContext}
 */
public final class TruncateLogContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.TruncateLogContext)
    TruncateLogContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TruncateLogContext.newBuilder() to construct.
  private TruncateLogContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TruncateLogContext() {
    kind_ = "";
    logType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TruncateLogContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_TruncateLogContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_TruncateLogContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.TruncateLogContext.class, com.google.cloud.sql.v1beta4.TruncateLogContext.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * This is always `sql#truncateLogContext`.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is always `sql#truncateLogContext`.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOG_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object logType_ = "";
  /**
   * <pre>
   * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
   * `MYSQL_SLOW_TABLE`.
   * </pre>
   *
   * <code>string log_type = 2;</code>
   * @return The logType.
   */
  @java.lang.Override
  public java.lang.String getLogType() {
    java.lang.Object ref = logType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
   * `MYSQL_SLOW_TABLE`.
   * </pre>
   *
   * <code>string log_type = 2;</code>
   * @return The bytes for logType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogTypeBytes() {
    java.lang.Object ref = logType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, logType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, logType_);
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.TruncateLogContext)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.TruncateLogContext other = (com.google.cloud.sql.v1beta4.TruncateLogContext) obj;

    if (!getKind()
        .equals(other.getKind())) return false;
    if (!getLogType()
        .equals(other.getLogType())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (37 * hash) + LOG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getLogType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.TruncateLogContext parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.TruncateLogContext prototype) {
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
   * Database Instance truncate log context.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1beta4.TruncateLogContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.TruncateLogContext)
      com.google.cloud.sql.v1beta4.TruncateLogContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_TruncateLogContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_TruncateLogContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.TruncateLogContext.class, com.google.cloud.sql.v1beta4.TruncateLogContext.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.TruncateLogContext.newBuilder()
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
      kind_ = "";
      logType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_TruncateLogContext_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.TruncateLogContext getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.TruncateLogContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.TruncateLogContext build() {
      com.google.cloud.sql.v1beta4.TruncateLogContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.TruncateLogContext buildPartial() {
      com.google.cloud.sql.v1beta4.TruncateLogContext result = new com.google.cloud.sql.v1beta4.TruncateLogContext(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.TruncateLogContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.logType_ = logType_;
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
      if (other instanceof com.google.cloud.sql.v1beta4.TruncateLogContext) {
        return mergeFrom((com.google.cloud.sql.v1beta4.TruncateLogContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.TruncateLogContext other) {
      if (other == com.google.cloud.sql.v1beta4.TruncateLogContext.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLogType().isEmpty()) {
        logType_ = other.logType_;
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
            case 10: {
              kind_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              logType_ = input.readStringRequireUtf8();
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

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * This is always `sql#truncateLogContext`.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is always `sql#truncateLogContext`.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is always `sql#truncateLogContext`.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always `sql#truncateLogContext`.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always `sql#truncateLogContext`.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object logType_ = "";
    /**
     * <pre>
     * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
     * `MYSQL_SLOW_TABLE`.
     * </pre>
     *
     * <code>string log_type = 2;</code>
     * @return The logType.
     */
    public java.lang.String getLogType() {
      java.lang.Object ref = logType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
     * `MYSQL_SLOW_TABLE`.
     * </pre>
     *
     * <code>string log_type = 2;</code>
     * @return The bytes for logType.
     */
    public com.google.protobuf.ByteString
        getLogTypeBytes() {
      java.lang.Object ref = logType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
     * `MYSQL_SLOW_TABLE`.
     * </pre>
     *
     * <code>string log_type = 2;</code>
     * @param value The logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      logType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
     * `MYSQL_SLOW_TABLE`.
     * </pre>
     *
     * <code>string log_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogType() {
      logType_ = getDefaultInstance().getLogType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of log to truncate. Valid values are `MYSQL_GENERAL_TABLE` and
     * `MYSQL_SLOW_TABLE`.
     * </pre>
     *
     * <code>string log_type = 2;</code>
     * @param value The bytes for logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      logType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.TruncateLogContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.TruncateLogContext)
  private static final com.google.cloud.sql.v1beta4.TruncateLogContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.TruncateLogContext();
  }

  public static com.google.cloud.sql.v1beta4.TruncateLogContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TruncateLogContext>
      PARSER = new com.google.protobuf.AbstractParser<TruncateLogContext>() {
    @java.lang.Override
    public TruncateLogContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<TruncateLogContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TruncateLogContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.TruncateLogContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

