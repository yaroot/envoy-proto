// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firebase/fcm/connection/v1alpha1/connection_api.proto

package com.google.firebase.fcm.connection.v1alpha1;

/**
 * <pre>
 * Response sent to the connected client from FCM.
 * </pre>
 *
 * Protobuf type {@code google.firebase.fcm.connection.v1alpha1.DownstreamResponse}
 */
public final class DownstreamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firebase.fcm.connection.v1alpha1.DownstreamResponse)
    DownstreamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownstreamResponse.newBuilder() to construct.
  private DownstreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownstreamResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownstreamResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_DownstreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_DownstreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.class, com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.Builder.class);
  }

  private int responseTypeCase_ = 0;
  private java.lang.Object responseType_;
  public enum ResponseTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MESSAGE(1),
    RESPONSETYPE_NOT_SET(0);
    private final int value;
    private ResponseTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResponseTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResponseTypeCase forNumber(int value) {
      switch (value) {
        case 1: return MESSAGE;
        case 0: return RESPONSETYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResponseTypeCase
  getResponseTypeCase() {
    return ResponseTypeCase.forNumber(
        responseTypeCase_);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Message sent to FCM via the [Send
   * API](https://firebase.google.com/docs/cloud-messaging/send-message)
   * targeting this client.
   * </pre>
   *
   * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return responseTypeCase_ == 1;
  }
  /**
   * <pre>
   * Message sent to FCM via the [Send
   * API](https://firebase.google.com/docs/cloud-messaging/send-message)
   * targeting this client.
   * </pre>
   *
   * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public com.google.firebase.fcm.connection.v1alpha1.Message getMessage() {
    if (responseTypeCase_ == 1) {
       return (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_;
    }
    return com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance();
  }
  /**
   * <pre>
   * Message sent to FCM via the [Send
   * API](https://firebase.google.com/docs/cloud-messaging/send-message)
   * targeting this client.
   * </pre>
   *
   * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
   */
  @java.lang.Override
  public com.google.firebase.fcm.connection.v1alpha1.MessageOrBuilder getMessageOrBuilder() {
    if (responseTypeCase_ == 1) {
       return (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_;
    }
    return com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance();
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
    if (responseTypeCase_ == 1) {
      output.writeMessage(1, (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_);
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
    if (!(obj instanceof com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse)) {
      return super.equals(obj);
    }
    com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse other = (com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse) obj;

    if (!getResponseTypeCase().equals(other.getResponseTypeCase())) return false;
    switch (responseTypeCase_) {
      case 1:
        if (!getMessage()
            .equals(other.getMessage())) return false;
        break;
      case 0:
      default:
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
    switch (responseTypeCase_) {
      case 1:
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse parseFrom(
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
  public static Builder newBuilder(com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse prototype) {
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
   * Response sent to the connected client from FCM.
   * </pre>
   *
   * Protobuf type {@code google.firebase.fcm.connection.v1alpha1.DownstreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firebase.fcm.connection.v1alpha1.DownstreamResponse)
      com.google.firebase.fcm.connection.v1alpha1.DownstreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_DownstreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_DownstreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.class, com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.Builder.class);
    }

    // Construct using com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.newBuilder()
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
      if (messageBuilder_ != null) {
        messageBuilder_.clear();
      }
      responseTypeCase_ = 0;
      responseType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_DownstreamResponse_descriptor;
    }

    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse getDefaultInstanceForType() {
      return com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse build() {
      com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse buildPartial() {
      com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse result = new com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse result) {
      result.responseTypeCase_ = responseTypeCase_;
      result.responseType_ = this.responseType_;
      if (responseTypeCase_ == 1 &&
          messageBuilder_ != null) {
        result.responseType_ = messageBuilder_.build();
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
      if (other instanceof com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse) {
        return mergeFrom((com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse other) {
      if (other == com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.getDefaultInstance()) return this;
      switch (other.getResponseTypeCase()) {
        case MESSAGE: {
          mergeMessage(other.getMessage());
          break;
        }
        case RESPONSETYPE_NOT_SET: {
          break;
        }
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
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              responseTypeCase_ = 1;
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
    private int responseTypeCase_ = 0;
    private java.lang.Object responseType_;
    public ResponseTypeCase
        getResponseTypeCase() {
      return ResponseTypeCase.forNumber(
          responseTypeCase_);
    }

    public Builder clearResponseType() {
      responseTypeCase_ = 0;
      responseType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.firebase.fcm.connection.v1alpha1.Message, com.google.firebase.fcm.connection.v1alpha1.Message.Builder, com.google.firebase.fcm.connection.v1alpha1.MessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     * @return Whether the message field is set.
     */
    @java.lang.Override
    public boolean hasMessage() {
      return responseTypeCase_ == 1;
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     * @return The message.
     */
    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.Message getMessage() {
      if (messageBuilder_ == null) {
        if (responseTypeCase_ == 1) {
          return (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_;
        }
        return com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance();
      } else {
        if (responseTypeCase_ == 1) {
          return messageBuilder_.getMessage();
        }
        return com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    public Builder setMessage(com.google.firebase.fcm.connection.v1alpha1.Message value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseType_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }
      responseTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    public Builder setMessage(
        com.google.firebase.fcm.connection.v1alpha1.Message.Builder builderForValue) {
      if (messageBuilder_ == null) {
        responseType_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      responseTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    public Builder mergeMessage(com.google.firebase.fcm.connection.v1alpha1.Message value) {
      if (messageBuilder_ == null) {
        if (responseTypeCase_ == 1 &&
            responseType_ != com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance()) {
          responseType_ = com.google.firebase.fcm.connection.v1alpha1.Message.newBuilder((com.google.firebase.fcm.connection.v1alpha1.Message) responseType_)
              .mergeFrom(value).buildPartial();
        } else {
          responseType_ = value;
        }
        onChanged();
      } else {
        if (responseTypeCase_ == 1) {
          messageBuilder_.mergeFrom(value);
        } else {
          messageBuilder_.setMessage(value);
        }
      }
      responseTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        if (responseTypeCase_ == 1) {
          responseTypeCase_ = 0;
          responseType_ = null;
          onChanged();
        }
      } else {
        if (responseTypeCase_ == 1) {
          responseTypeCase_ = 0;
          responseType_ = null;
        }
        messageBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    public com.google.firebase.fcm.connection.v1alpha1.Message.Builder getMessageBuilder() {
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.MessageOrBuilder getMessageOrBuilder() {
      if ((responseTypeCase_ == 1) && (messageBuilder_ != null)) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        if (responseTypeCase_ == 1) {
          return (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_;
        }
        return com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Message sent to FCM via the [Send
     * API](https://firebase.google.com/docs/cloud-messaging/send-message)
     * targeting this client.
     * </pre>
     *
     * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.firebase.fcm.connection.v1alpha1.Message, com.google.firebase.fcm.connection.v1alpha1.Message.Builder, com.google.firebase.fcm.connection.v1alpha1.MessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        if (!(responseTypeCase_ == 1)) {
          responseType_ = com.google.firebase.fcm.connection.v1alpha1.Message.getDefaultInstance();
        }
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.firebase.fcm.connection.v1alpha1.Message, com.google.firebase.fcm.connection.v1alpha1.Message.Builder, com.google.firebase.fcm.connection.v1alpha1.MessageOrBuilder>(
                (com.google.firebase.fcm.connection.v1alpha1.Message) responseType_,
                getParentForChildren(),
                isClean());
        responseType_ = null;
      }
      responseTypeCase_ = 1;
      onChanged();
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.firebase.fcm.connection.v1alpha1.DownstreamResponse)
  }

  // @@protoc_insertion_point(class_scope:google.firebase.fcm.connection.v1alpha1.DownstreamResponse)
  private static final com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse();
  }

  public static com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownstreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<DownstreamResponse>() {
    @java.lang.Override
    public DownstreamResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DownstreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownstreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
