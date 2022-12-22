// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firebase/fcm/connection/v1alpha1/connection_api.proto

package com.google.firebase.fcm.connection.v1alpha1;

/**
 * <pre>
 * Acknowledgement to indicate a client successfully received an FCM message.
 * If a message is not acked, FCM will continously resend the message until
 * it expires. Duplicate delivery in this case is working as intended.
 * </pre>
 *
 * Protobuf type {@code google.firebase.fcm.connection.v1alpha1.Ack}
 */
public final class Ack extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firebase.fcm.connection.v1alpha1.Ack)
    AckOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Ack.newBuilder() to construct.
  private Ack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Ack() {
    messageId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Ack();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_Ack_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_Ack_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firebase.fcm.connection.v1alpha1.Ack.class, com.google.firebase.fcm.connection.v1alpha1.Ack.Builder.class);
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object messageId_ = "";
  /**
   * <pre>
   * Id of message being acknowledged
   * </pre>
   *
   * <code>string message_id = 1;</code>
   * @return The messageId.
   */
  @java.lang.Override
  public java.lang.String getMessageId() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Id of message being acknowledged
   * </pre>
   *
   * <code>string message_id = 1;</code>
   * @return The bytes for messageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageIdBytes() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageId_);
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
    if (!(obj instanceof com.google.firebase.fcm.connection.v1alpha1.Ack)) {
      return super.equals(obj);
    }
    com.google.firebase.fcm.connection.v1alpha1.Ack other = (com.google.firebase.fcm.connection.v1alpha1.Ack) obj;

    if (!getMessageId()
        .equals(other.getMessageId())) return false;
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
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMessageId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firebase.fcm.connection.v1alpha1.Ack parseFrom(
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
  public static Builder newBuilder(com.google.firebase.fcm.connection.v1alpha1.Ack prototype) {
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
   * Acknowledgement to indicate a client successfully received an FCM message.
   * If a message is not acked, FCM will continously resend the message until
   * it expires. Duplicate delivery in this case is working as intended.
   * </pre>
   *
   * Protobuf type {@code google.firebase.fcm.connection.v1alpha1.Ack}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firebase.fcm.connection.v1alpha1.Ack)
      com.google.firebase.fcm.connection.v1alpha1.AckOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_Ack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_Ack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firebase.fcm.connection.v1alpha1.Ack.class, com.google.firebase.fcm.connection.v1alpha1.Ack.Builder.class);
    }

    // Construct using com.google.firebase.fcm.connection.v1alpha1.Ack.newBuilder()
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
      messageId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firebase.fcm.connection.v1alpha1.ConnectionApiOuterClass.internal_static_google_firebase_fcm_connection_v1alpha1_Ack_descriptor;
    }

    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.Ack getDefaultInstanceForType() {
      return com.google.firebase.fcm.connection.v1alpha1.Ack.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.Ack build() {
      com.google.firebase.fcm.connection.v1alpha1.Ack result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firebase.fcm.connection.v1alpha1.Ack buildPartial() {
      com.google.firebase.fcm.connection.v1alpha1.Ack result = new com.google.firebase.fcm.connection.v1alpha1.Ack(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firebase.fcm.connection.v1alpha1.Ack result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.messageId_ = messageId_;
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
      if (other instanceof com.google.firebase.fcm.connection.v1alpha1.Ack) {
        return mergeFrom((com.google.firebase.fcm.connection.v1alpha1.Ack)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firebase.fcm.connection.v1alpha1.Ack other) {
      if (other == com.google.firebase.fcm.connection.v1alpha1.Ack.getDefaultInstance()) return this;
      if (!other.getMessageId().isEmpty()) {
        messageId_ = other.messageId_;
        bitField0_ |= 0x00000001;
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
              messageId_ = input.readStringRequireUtf8();
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

    private java.lang.Object messageId_ = "";
    /**
     * <pre>
     * Id of message being acknowledged
     * </pre>
     *
     * <code>string message_id = 1;</code>
     * @return The messageId.
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Id of message being acknowledged
     * </pre>
     *
     * <code>string message_id = 1;</code>
     * @return The bytes for messageId.
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Id of message being acknowledged
     * </pre>
     *
     * <code>string message_id = 1;</code>
     * @param value The messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      messageId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of message being acknowledged
     * </pre>
     *
     * <code>string message_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageId() {
      messageId_ = getDefaultInstance().getMessageId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of message being acknowledged
     * </pre>
     *
     * <code>string message_id = 1;</code>
     * @param value The bytes for messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      messageId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.firebase.fcm.connection.v1alpha1.Ack)
  }

  // @@protoc_insertion_point(class_scope:google.firebase.fcm.connection.v1alpha1.Ack)
  private static final com.google.firebase.fcm.connection.v1alpha1.Ack DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firebase.fcm.connection.v1alpha1.Ack();
  }

  public static com.google.firebase.fcm.connection.v1alpha1.Ack getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Ack>
      PARSER = new com.google.protobuf.AbstractParser<Ack>() {
    @java.lang.Override
    public Ack parsePartialFrom(
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

  public static com.google.protobuf.Parser<Ack> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Ack> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firebase.fcm.connection.v1alpha1.Ack getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
