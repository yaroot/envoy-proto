// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha1/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha1;

/**
 * <pre>
 * The audio containing the assistant's response to the query. Sequential chunks
 * of audio data are received in sequential `ConverseResponse` messages.
 * </pre>
 *
 * Protobuf type {@code google.assistant.embedded.v1alpha1.AudioOut}
 */
public final class AudioOut extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.assistant.embedded.v1alpha1.AudioOut)
    AudioOutOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudioOut.newBuilder() to construct.
  private AudioOut(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudioOut() {
    audioData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudioOut();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioOut_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioOut_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.assistant.embedded.v1alpha1.AudioOut.class, com.google.assistant.embedded.v1alpha1.AudioOut.Builder.class);
  }

  public static final int AUDIO_DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString audioData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * *Output-only* The audio data containing the assistant's response to the
   * query. Sequential chunks of audio data are received in sequential
   * `ConverseResponse` messages.
   * </pre>
   *
   * <code>bytes audio_data = 1;</code>
   * @return The audioData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioData() {
    return audioData_;
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
    if (!audioData_.isEmpty()) {
      output.writeBytes(1, audioData_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!audioData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, audioData_);
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
    if (!(obj instanceof com.google.assistant.embedded.v1alpha1.AudioOut)) {
      return super.equals(obj);
    }
    com.google.assistant.embedded.v1alpha1.AudioOut other = (com.google.assistant.embedded.v1alpha1.AudioOut) obj;

    if (!getAudioData()
        .equals(other.getAudioData())) return false;
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
    hash = (37 * hash) + AUDIO_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getAudioData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha1.AudioOut parseFrom(
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
  public static Builder newBuilder(com.google.assistant.embedded.v1alpha1.AudioOut prototype) {
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
   * The audio containing the assistant's response to the query. Sequential chunks
   * of audio data are received in sequential `ConverseResponse` messages.
   * </pre>
   *
   * Protobuf type {@code google.assistant.embedded.v1alpha1.AudioOut}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.assistant.embedded.v1alpha1.AudioOut)
      com.google.assistant.embedded.v1alpha1.AudioOutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioOut_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioOut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.assistant.embedded.v1alpha1.AudioOut.class, com.google.assistant.embedded.v1alpha1.AudioOut.Builder.class);
    }

    // Construct using com.google.assistant.embedded.v1alpha1.AudioOut.newBuilder()
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
      audioData_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioOut_descriptor;
    }

    @java.lang.Override
    public com.google.assistant.embedded.v1alpha1.AudioOut getDefaultInstanceForType() {
      return com.google.assistant.embedded.v1alpha1.AudioOut.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.assistant.embedded.v1alpha1.AudioOut build() {
      com.google.assistant.embedded.v1alpha1.AudioOut result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.assistant.embedded.v1alpha1.AudioOut buildPartial() {
      com.google.assistant.embedded.v1alpha1.AudioOut result = new com.google.assistant.embedded.v1alpha1.AudioOut(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.assistant.embedded.v1alpha1.AudioOut result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.audioData_ = audioData_;
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
      if (other instanceof com.google.assistant.embedded.v1alpha1.AudioOut) {
        return mergeFrom((com.google.assistant.embedded.v1alpha1.AudioOut)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.assistant.embedded.v1alpha1.AudioOut other) {
      if (other == com.google.assistant.embedded.v1alpha1.AudioOut.getDefaultInstance()) return this;
      if (other.getAudioData() != com.google.protobuf.ByteString.EMPTY) {
        setAudioData(other.getAudioData());
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
              audioData_ = input.readBytes();
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

    private com.google.protobuf.ByteString audioData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * *Output-only* The audio data containing the assistant's response to the
     * query. Sequential chunks of audio data are received in sequential
     * `ConverseResponse` messages.
     * </pre>
     *
     * <code>bytes audio_data = 1;</code>
     * @return The audioData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAudioData() {
      return audioData_;
    }
    /**
     * <pre>
     * *Output-only* The audio data containing the assistant's response to the
     * query. Sequential chunks of audio data are received in sequential
     * `ConverseResponse` messages.
     * </pre>
     *
     * <code>bytes audio_data = 1;</code>
     * @param value The audioData to set.
     * @return This builder for chaining.
     */
    public Builder setAudioData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      audioData_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Output-only* The audio data containing the assistant's response to the
     * query. Sequential chunks of audio data are received in sequential
     * `ConverseResponse` messages.
     * </pre>
     *
     * <code>bytes audio_data = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      audioData_ = getDefaultInstance().getAudioData();
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


    // @@protoc_insertion_point(builder_scope:google.assistant.embedded.v1alpha1.AudioOut)
  }

  // @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.AudioOut)
  private static final com.google.assistant.embedded.v1alpha1.AudioOut DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.assistant.embedded.v1alpha1.AudioOut();
  }

  public static com.google.assistant.embedded.v1alpha1.AudioOut getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudioOut>
      PARSER = new com.google.protobuf.AbstractParser<AudioOut>() {
    @java.lang.Override
    public AudioOut parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudioOut> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudioOut> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.assistant.embedded.v1alpha1.AudioOut getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

