// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * An error associated with a query in the time series query language format.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.QueryError}
 */
public final class QueryError extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.QueryError)
    QueryErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryError.newBuilder() to construct.
  private QueryError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryError() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.MetricProto.internal_static_google_monitoring_v3_QueryError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricProto.internal_static_google_monitoring_v3_QueryError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.QueryError.class, com.google.monitoring.v3.QueryError.Builder.class);
  }

  public static final int LOCATOR_FIELD_NUMBER = 1;
  private com.google.monitoring.v3.TextLocator locator_;
  /**
   * <pre>
   * The location of the time series query language text that this error applies
   * to.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
   * @return Whether the locator field is set.
   */
  @java.lang.Override
  public boolean hasLocator() {
    return locator_ != null;
  }
  /**
   * <pre>
   * The location of the time series query language text that this error applies
   * to.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
   * @return The locator.
   */
  @java.lang.Override
  public com.google.monitoring.v3.TextLocator getLocator() {
    return locator_ == null ? com.google.monitoring.v3.TextLocator.getDefaultInstance() : locator_;
  }
  /**
   * <pre>
   * The location of the time series query language text that this error applies
   * to.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.TextLocatorOrBuilder getLocatorOrBuilder() {
    return locator_ == null ? com.google.monitoring.v3.TextLocator.getDefaultInstance() : locator_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * The error message.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The error message.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (locator_ != null) {
      output.writeMessage(1, getLocator());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (locator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocator());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof com.google.monitoring.v3.QueryError)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.QueryError other = (com.google.monitoring.v3.QueryError) obj;

    if (hasLocator() != other.hasLocator()) return false;
    if (hasLocator()) {
      if (!getLocator()
          .equals(other.getLocator())) return false;
    }
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    if (hasLocator()) {
      hash = (37 * hash) + LOCATOR_FIELD_NUMBER;
      hash = (53 * hash) + getLocator().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.QueryError parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.QueryError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.QueryError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.QueryError parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.QueryError prototype) {
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
   * An error associated with a query in the time series query language format.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.QueryError}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.QueryError)
      com.google.monitoring.v3.QueryErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.MetricProto.internal_static_google_monitoring_v3_QueryError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricProto.internal_static_google_monitoring_v3_QueryError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.QueryError.class, com.google.monitoring.v3.QueryError.Builder.class);
    }

    // Construct using com.google.monitoring.v3.QueryError.newBuilder()
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
      locator_ = null;
      if (locatorBuilder_ != null) {
        locatorBuilder_.dispose();
        locatorBuilder_ = null;
      }
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.MetricProto.internal_static_google_monitoring_v3_QueryError_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.QueryError getDefaultInstanceForType() {
      return com.google.monitoring.v3.QueryError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.QueryError build() {
      com.google.monitoring.v3.QueryError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.QueryError buildPartial() {
      com.google.monitoring.v3.QueryError result = new com.google.monitoring.v3.QueryError(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.QueryError result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.locator_ = locatorBuilder_ == null
            ? locator_
            : locatorBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
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
      if (other instanceof com.google.monitoring.v3.QueryError) {
        return mergeFrom((com.google.monitoring.v3.QueryError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.QueryError other) {
      if (other == com.google.monitoring.v3.QueryError.getDefaultInstance()) return this;
      if (other.hasLocator()) {
        mergeLocator(other.getLocator());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
              input.readMessage(
                  getLocatorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              message_ = input.readStringRequireUtf8();
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

    private com.google.monitoring.v3.TextLocator locator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.TextLocator, com.google.monitoring.v3.TextLocator.Builder, com.google.monitoring.v3.TextLocatorOrBuilder> locatorBuilder_;
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     * @return Whether the locator field is set.
     */
    public boolean hasLocator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     * @return The locator.
     */
    public com.google.monitoring.v3.TextLocator getLocator() {
      if (locatorBuilder_ == null) {
        return locator_ == null ? com.google.monitoring.v3.TextLocator.getDefaultInstance() : locator_;
      } else {
        return locatorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    public Builder setLocator(com.google.monitoring.v3.TextLocator value) {
      if (locatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locator_ = value;
      } else {
        locatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    public Builder setLocator(
        com.google.monitoring.v3.TextLocator.Builder builderForValue) {
      if (locatorBuilder_ == null) {
        locator_ = builderForValue.build();
      } else {
        locatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    public Builder mergeLocator(com.google.monitoring.v3.TextLocator value) {
      if (locatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          locator_ != null &&
          locator_ != com.google.monitoring.v3.TextLocator.getDefaultInstance()) {
          getLocatorBuilder().mergeFrom(value);
        } else {
          locator_ = value;
        }
      } else {
        locatorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    public Builder clearLocator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      locator_ = null;
      if (locatorBuilder_ != null) {
        locatorBuilder_.dispose();
        locatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    public com.google.monitoring.v3.TextLocator.Builder getLocatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocatorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    public com.google.monitoring.v3.TextLocatorOrBuilder getLocatorOrBuilder() {
      if (locatorBuilder_ != null) {
        return locatorBuilder_.getMessageOrBuilder();
      } else {
        return locator_ == null ?
            com.google.monitoring.v3.TextLocator.getDefaultInstance() : locator_;
      }
    }
    /**
     * <pre>
     * The location of the time series query language text that this error applies
     * to.
     * </pre>
     *
     * <code>.google.monitoring.v3.TextLocator locator = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.TextLocator, com.google.monitoring.v3.TextLocator.Builder, com.google.monitoring.v3.TextLocatorOrBuilder> 
        getLocatorFieldBuilder() {
      if (locatorBuilder_ == null) {
        locatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TextLocator, com.google.monitoring.v3.TextLocator.Builder, com.google.monitoring.v3.TextLocatorOrBuilder>(
                getLocator(),
                getParentForChildren(),
                isClean());
        locator_ = null;
      }
      return locatorBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.QueryError)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.QueryError)
  private static final com.google.monitoring.v3.QueryError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.QueryError();
  }

  public static com.google.monitoring.v3.QueryError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryError>
      PARSER = new com.google.protobuf.AbstractParser<QueryError>() {
    @java.lang.Override
    public QueryError parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.QueryError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
