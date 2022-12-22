// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/event_logs.proto

package com.google.actions.sdk.v2;

/**
 * <pre>
 * Event triggered by destination scene returned from webhook:
 * https://developers.google.com/assistant/conversational/webhooks#transition_scenes
 * </pre>
 *
 * Protobuf type {@code google.actions.sdk.v2.WebhookInitiatedTransition}
 */
public final class WebhookInitiatedTransition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.sdk.v2.WebhookInitiatedTransition)
    WebhookInitiatedTransitionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebhookInitiatedTransition.newBuilder() to construct.
  private WebhookInitiatedTransition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebhookInitiatedTransition() {
    nextSceneId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebhookInitiatedTransition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.sdk.v2.EventLogsProto.internal_static_google_actions_sdk_v2_WebhookInitiatedTransition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.sdk.v2.EventLogsProto.internal_static_google_actions_sdk_v2_WebhookInitiatedTransition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.sdk.v2.WebhookInitiatedTransition.class, com.google.actions.sdk.v2.WebhookInitiatedTransition.Builder.class);
  }

  public static final int NEXT_SCENE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextSceneId_ = "";
  /**
   * <pre>
   * ID of the scene the transition is leading to.
   * </pre>
   *
   * <code>string next_scene_id = 1;</code>
   * @return The nextSceneId.
   */
  @java.lang.Override
  public java.lang.String getNextSceneId() {
    java.lang.Object ref = nextSceneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextSceneId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the scene the transition is leading to.
   * </pre>
   *
   * <code>string next_scene_id = 1;</code>
   * @return The bytes for nextSceneId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextSceneIdBytes() {
    java.lang.Object ref = nextSceneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextSceneId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextSceneId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextSceneId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextSceneId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextSceneId_);
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
    if (!(obj instanceof com.google.actions.sdk.v2.WebhookInitiatedTransition)) {
      return super.equals(obj);
    }
    com.google.actions.sdk.v2.WebhookInitiatedTransition other = (com.google.actions.sdk.v2.WebhookInitiatedTransition) obj;

    if (!getNextSceneId()
        .equals(other.getNextSceneId())) return false;
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
    hash = (37 * hash) + NEXT_SCENE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNextSceneId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.WebhookInitiatedTransition parseFrom(
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
  public static Builder newBuilder(com.google.actions.sdk.v2.WebhookInitiatedTransition prototype) {
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
   * Event triggered by destination scene returned from webhook:
   * https://developers.google.com/assistant/conversational/webhooks#transition_scenes
   * </pre>
   *
   * Protobuf type {@code google.actions.sdk.v2.WebhookInitiatedTransition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.sdk.v2.WebhookInitiatedTransition)
      com.google.actions.sdk.v2.WebhookInitiatedTransitionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.EventLogsProto.internal_static_google_actions_sdk_v2_WebhookInitiatedTransition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.sdk.v2.EventLogsProto.internal_static_google_actions_sdk_v2_WebhookInitiatedTransition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.sdk.v2.WebhookInitiatedTransition.class, com.google.actions.sdk.v2.WebhookInitiatedTransition.Builder.class);
    }

    // Construct using com.google.actions.sdk.v2.WebhookInitiatedTransition.newBuilder()
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
      nextSceneId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.sdk.v2.EventLogsProto.internal_static_google_actions_sdk_v2_WebhookInitiatedTransition_descriptor;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.WebhookInitiatedTransition getDefaultInstanceForType() {
      return com.google.actions.sdk.v2.WebhookInitiatedTransition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.WebhookInitiatedTransition build() {
      com.google.actions.sdk.v2.WebhookInitiatedTransition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.WebhookInitiatedTransition buildPartial() {
      com.google.actions.sdk.v2.WebhookInitiatedTransition result = new com.google.actions.sdk.v2.WebhookInitiatedTransition(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.actions.sdk.v2.WebhookInitiatedTransition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextSceneId_ = nextSceneId_;
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
      if (other instanceof com.google.actions.sdk.v2.WebhookInitiatedTransition) {
        return mergeFrom((com.google.actions.sdk.v2.WebhookInitiatedTransition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.sdk.v2.WebhookInitiatedTransition other) {
      if (other == com.google.actions.sdk.v2.WebhookInitiatedTransition.getDefaultInstance()) return this;
      if (!other.getNextSceneId().isEmpty()) {
        nextSceneId_ = other.nextSceneId_;
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
              nextSceneId_ = input.readStringRequireUtf8();
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

    private java.lang.Object nextSceneId_ = "";
    /**
     * <pre>
     * ID of the scene the transition is leading to.
     * </pre>
     *
     * <code>string next_scene_id = 1;</code>
     * @return The nextSceneId.
     */
    public java.lang.String getNextSceneId() {
      java.lang.Object ref = nextSceneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextSceneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the scene the transition is leading to.
     * </pre>
     *
     * <code>string next_scene_id = 1;</code>
     * @return The bytes for nextSceneId.
     */
    public com.google.protobuf.ByteString
        getNextSceneIdBytes() {
      java.lang.Object ref = nextSceneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextSceneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the scene the transition is leading to.
     * </pre>
     *
     * <code>string next_scene_id = 1;</code>
     * @param value The nextSceneId to set.
     * @return This builder for chaining.
     */
    public Builder setNextSceneId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextSceneId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the scene the transition is leading to.
     * </pre>
     *
     * <code>string next_scene_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextSceneId() {
      nextSceneId_ = getDefaultInstance().getNextSceneId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the scene the transition is leading to.
     * </pre>
     *
     * <code>string next_scene_id = 1;</code>
     * @param value The bytes for nextSceneId to set.
     * @return This builder for chaining.
     */
    public Builder setNextSceneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextSceneId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.actions.sdk.v2.WebhookInitiatedTransition)
  }

  // @@protoc_insertion_point(class_scope:google.actions.sdk.v2.WebhookInitiatedTransition)
  private static final com.google.actions.sdk.v2.WebhookInitiatedTransition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.sdk.v2.WebhookInitiatedTransition();
  }

  public static com.google.actions.sdk.v2.WebhookInitiatedTransition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebhookInitiatedTransition>
      PARSER = new com.google.protobuf.AbstractParser<WebhookInitiatedTransition>() {
    @java.lang.Override
    public WebhookInitiatedTransition parsePartialFrom(
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

  public static com.google.protobuf.Parser<WebhookInitiatedTransition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebhookInitiatedTransition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.sdk.v2.WebhookInitiatedTransition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
