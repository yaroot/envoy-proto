// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ext_proc/v3/external_processor.proto

package io.envoyproxy.envoy.service.ext_proc.v3;

/**
 * <pre>
 * This message must be sent in response to an HttpBody message.
 * </pre>
 *
 * Protobuf type {@code envoy.service.ext_proc.v3.BodyResponse}
 */
public final class BodyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.ext_proc.v3.BodyResponse)
    BodyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BodyResponse.newBuilder() to construct.
  private BodyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BodyResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BodyResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_BodyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_BodyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.class, io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse response_;
  /**
   * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
   * @return Whether the response field is set.
   */
  @java.lang.Override
  public boolean hasResponse() {
    return response_ != null;
  }
  /**
   * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
   * @return The response.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse getResponse() {
    return response_ == null ? io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.getDefaultInstance() : response_;
  }
  /**
   * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.service.ext_proc.v3.CommonResponseOrBuilder getResponseOrBuilder() {
    return response_ == null ? io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.getDefaultInstance() : response_;
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
    if (response_ != null) {
      output.writeMessage(1, getResponse());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (response_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
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
    if (!(obj instanceof io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse other = (io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse) obj;

    if (hasResponse() != other.hasResponse()) return false;
    if (hasResponse()) {
      if (!getResponse()
          .equals(other.getResponse())) return false;
    }
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
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse prototype) {
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
   * This message must be sent in response to an HttpBody message.
   * </pre>
   *
   * Protobuf type {@code envoy.service.ext_proc.v3.BodyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.ext_proc.v3.BodyResponse)
      io.envoyproxy.envoy.service.ext_proc.v3.BodyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_BodyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_BodyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.class, io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.newBuilder()
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
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_BodyResponse_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse build() {
      io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse buildPartial() {
      io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse result = new io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.response_ = responseBuilder_ == null
            ? response_
            : responseBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse) {
        return mergeFrom((io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse other) {
      if (other == io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse.getDefaultInstance()) return this;
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
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
                  getResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse response_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse, io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.Builder, io.envoyproxy.envoy.service.ext_proc.v3.CommonResponseOrBuilder> responseBuilder_;
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     * @return The response.
     */
    public io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    public Builder setResponse(io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    public Builder setResponse(
        io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    public Builder mergeResponse(io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          response_ != null &&
          response_ != io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.getDefaultInstance()) {
          getResponseBuilder().mergeFrom(value);
        } else {
          response_ = value;
        }
      } else {
        responseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    public Builder clearResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    public io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.Builder getResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    public io.envoyproxy.envoy.service.ext_proc.v3.CommonResponseOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ?
            io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.getDefaultInstance() : response_;
      }
    }
    /**
     * <code>.envoy.service.ext_proc.v3.CommonResponse response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse, io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.Builder, io.envoyproxy.envoy.service.ext_proc.v3.CommonResponseOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse, io.envoyproxy.envoy.service.ext_proc.v3.CommonResponse.Builder, io.envoyproxy.envoy.service.ext_proc.v3.CommonResponseOrBuilder>(
                getResponse(),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.ext_proc.v3.BodyResponse)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.ext_proc.v3.BodyResponse)
  private static final io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse();
  }

  public static io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BodyResponse>
      PARSER = new com.google.protobuf.AbstractParser<BodyResponse>() {
    @java.lang.Override
    public BodyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BodyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BodyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
