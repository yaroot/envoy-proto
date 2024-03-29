// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ext_proc/v3/external_processor.proto

package io.envoyproxy.envoy.service.ext_proc.v3;

/**
 * <pre>
 * This message contains the message body that Envoy sends to the external server.
 * </pre>
 *
 * Protobuf type {@code envoy.service.ext_proc.v3.HttpBody}
 */
public final class HttpBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.ext_proc.v3.HttpBody)
    HttpBodyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpBody.newBuilder() to construct.
  private HttpBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpBody() {
    body_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpBody();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpBody_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.class, io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.Builder.class);
  }

  public static final int BODY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes body = 1;</code>
   * @return The body.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBody() {
    return body_;
  }

  public static final int END_OF_STREAM_FIELD_NUMBER = 2;
  private boolean endOfStream_ = false;
  /**
   * <code>bool end_of_stream = 2;</code>
   * @return The endOfStream.
   */
  @java.lang.Override
  public boolean getEndOfStream() {
    return endOfStream_;
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
    if (!body_.isEmpty()) {
      output.writeBytes(1, body_);
    }
    if (endOfStream_ != false) {
      output.writeBool(2, endOfStream_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!body_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, body_);
    }
    if (endOfStream_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, endOfStream_);
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
    if (!(obj instanceof io.envoyproxy.envoy.service.ext_proc.v3.HttpBody)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.ext_proc.v3.HttpBody other = (io.envoyproxy.envoy.service.ext_proc.v3.HttpBody) obj;

    if (!getBody()
        .equals(other.getBody())) return false;
    if (getEndOfStream()
        != other.getEndOfStream()) return false;
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
    hash = (37 * hash) + BODY_FIELD_NUMBER;
    hash = (53 * hash) + getBody().hashCode();
    hash = (37 * hash) + END_OF_STREAM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEndOfStream());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.ext_proc.v3.HttpBody prototype) {
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
   * This message contains the message body that Envoy sends to the external server.
   * </pre>
   *
   * Protobuf type {@code envoy.service.ext_proc.v3.HttpBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.ext_proc.v3.HttpBody)
      io.envoyproxy.envoy.service.ext_proc.v3.HttpBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpBody_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.class, io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.newBuilder()
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
      body_ = com.google.protobuf.ByteString.EMPTY;
      endOfStream_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpBody_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.HttpBody getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.HttpBody build() {
      io.envoyproxy.envoy.service.ext_proc.v3.HttpBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.HttpBody buildPartial() {
      io.envoyproxy.envoy.service.ext_proc.v3.HttpBody result = new io.envoyproxy.envoy.service.ext_proc.v3.HttpBody(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.service.ext_proc.v3.HttpBody result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.body_ = body_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endOfStream_ = endOfStream_;
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
      if (other instanceof io.envoyproxy.envoy.service.ext_proc.v3.HttpBody) {
        return mergeFrom((io.envoyproxy.envoy.service.ext_proc.v3.HttpBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.ext_proc.v3.HttpBody other) {
      if (other == io.envoyproxy.envoy.service.ext_proc.v3.HttpBody.getDefaultInstance()) return this;
      if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
        setBody(other.getBody());
      }
      if (other.getEndOfStream() != false) {
        setEndOfStream(other.getEndOfStream());
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
              body_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              endOfStream_ = input.readBool();
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

    private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes body = 1;</code>
     * @return The body.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }
    /**
     * <code>bytes body = 1;</code>
     * @param value The body to set.
     * @return This builder for chaining.
     */
    public Builder setBody(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      body_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes body = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBody() {
      bitField0_ = (bitField0_ & ~0x00000001);
      body_ = getDefaultInstance().getBody();
      onChanged();
      return this;
    }

    private boolean endOfStream_ ;
    /**
     * <code>bool end_of_stream = 2;</code>
     * @return The endOfStream.
     */
    @java.lang.Override
    public boolean getEndOfStream() {
      return endOfStream_;
    }
    /**
     * <code>bool end_of_stream = 2;</code>
     * @param value The endOfStream to set.
     * @return This builder for chaining.
     */
    public Builder setEndOfStream(boolean value) {
      
      endOfStream_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool end_of_stream = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndOfStream() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endOfStream_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.ext_proc.v3.HttpBody)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.ext_proc.v3.HttpBody)
  private static final io.envoyproxy.envoy.service.ext_proc.v3.HttpBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.ext_proc.v3.HttpBody();
  }

  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpBody>
      PARSER = new com.google.protobuf.AbstractParser<HttpBody>() {
    @java.lang.Override
    public HttpBody parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpBody> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.ext_proc.v3.HttpBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

