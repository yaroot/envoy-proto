// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/logging/error_log.proto

package com.google.cloud.retail.logging;

/**
 * <pre>
 * HTTP request data that is related to a reported error.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.logging.HttpRequestContext}
 */
public final class HttpRequestContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.logging.HttpRequestContext)
    HttpRequestContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpRequestContext.newBuilder() to construct.
  private HttpRequestContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpRequestContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpRequestContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.logging.ErrorLogProto.internal_static_google_cloud_retail_logging_HttpRequestContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.logging.ErrorLogProto.internal_static_google_cloud_retail_logging_HttpRequestContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.logging.HttpRequestContext.class, com.google.cloud.retail.logging.HttpRequestContext.Builder.class);
  }

  public static final int RESPONSE_STATUS_CODE_FIELD_NUMBER = 1;
  private int responseStatusCode_ = 0;
  /**
   * <pre>
   * The HTTP response status code for the request.
   * </pre>
   *
   * <code>int32 response_status_code = 1;</code>
   * @return The responseStatusCode.
   */
  @java.lang.Override
  public int getResponseStatusCode() {
    return responseStatusCode_;
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
    if (responseStatusCode_ != 0) {
      output.writeInt32(1, responseStatusCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseStatusCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, responseStatusCode_);
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
    if (!(obj instanceof com.google.cloud.retail.logging.HttpRequestContext)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.logging.HttpRequestContext other = (com.google.cloud.retail.logging.HttpRequestContext) obj;

    if (getResponseStatusCode()
        != other.getResponseStatusCode()) return false;
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
    hash = (37 * hash) + RESPONSE_STATUS_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseStatusCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.logging.HttpRequestContext parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.logging.HttpRequestContext prototype) {
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
   * HTTP request data that is related to a reported error.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.logging.HttpRequestContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.logging.HttpRequestContext)
      com.google.cloud.retail.logging.HttpRequestContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.logging.ErrorLogProto.internal_static_google_cloud_retail_logging_HttpRequestContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.logging.ErrorLogProto.internal_static_google_cloud_retail_logging_HttpRequestContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.logging.HttpRequestContext.class, com.google.cloud.retail.logging.HttpRequestContext.Builder.class);
    }

    // Construct using com.google.cloud.retail.logging.HttpRequestContext.newBuilder()
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
      responseStatusCode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.logging.ErrorLogProto.internal_static_google_cloud_retail_logging_HttpRequestContext_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.logging.HttpRequestContext getDefaultInstanceForType() {
      return com.google.cloud.retail.logging.HttpRequestContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.logging.HttpRequestContext build() {
      com.google.cloud.retail.logging.HttpRequestContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.logging.HttpRequestContext buildPartial() {
      com.google.cloud.retail.logging.HttpRequestContext result = new com.google.cloud.retail.logging.HttpRequestContext(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.logging.HttpRequestContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.responseStatusCode_ = responseStatusCode_;
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
      if (other instanceof com.google.cloud.retail.logging.HttpRequestContext) {
        return mergeFrom((com.google.cloud.retail.logging.HttpRequestContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.logging.HttpRequestContext other) {
      if (other == com.google.cloud.retail.logging.HttpRequestContext.getDefaultInstance()) return this;
      if (other.getResponseStatusCode() != 0) {
        setResponseStatusCode(other.getResponseStatusCode());
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
              responseStatusCode_ = input.readInt32();
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

    private int responseStatusCode_ ;
    /**
     * <pre>
     * The HTTP response status code for the request.
     * </pre>
     *
     * <code>int32 response_status_code = 1;</code>
     * @return The responseStatusCode.
     */
    @java.lang.Override
    public int getResponseStatusCode() {
      return responseStatusCode_;
    }
    /**
     * <pre>
     * The HTTP response status code for the request.
     * </pre>
     *
     * <code>int32 response_status_code = 1;</code>
     * @param value The responseStatusCode to set.
     * @return This builder for chaining.
     */
    public Builder setResponseStatusCode(int value) {
      
      responseStatusCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP response status code for the request.
     * </pre>
     *
     * <code>int32 response_status_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseStatusCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      responseStatusCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.logging.HttpRequestContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.logging.HttpRequestContext)
  private static final com.google.cloud.retail.logging.HttpRequestContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.logging.HttpRequestContext();
  }

  public static com.google.cloud.retail.logging.HttpRequestContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpRequestContext>
      PARSER = new com.google.protobuf.AbstractParser<HttpRequestContext>() {
    @java.lang.Override
    public HttpRequestContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpRequestContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpRequestContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.logging.HttpRequestContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

