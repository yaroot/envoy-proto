// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/uidetection/v1/ui_detection.proto

package com.google.chromeos.uidetection.v1;

/**
 * <pre>
 * Detection type for word detection.
 * </pre>
 *
 * Protobuf type {@code google.chromeos.uidetection.v1.WordDetectionRequest}
 */
public final class WordDetectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.chromeos.uidetection.v1.WordDetectionRequest)
    WordDetectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WordDetectionRequest.newBuilder() to construct.
  private WordDetectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WordDetectionRequest() {
    word_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WordDetectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_WordDetectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_WordDetectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chromeos.uidetection.v1.WordDetectionRequest.class, com.google.chromeos.uidetection.v1.WordDetectionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int WORD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object word_ = "";
  /**
   * <pre>
   * Required. The word to locate in the image.
   * </pre>
   *
   * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The word.
   */
  @java.lang.Override
  public java.lang.String getWord() {
    java.lang.Object ref = word_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      word_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The word to locate in the image.
   * </pre>
   *
   * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for word.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWordBytes() {
    java.lang.Object ref = word_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      word_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGEX_MODE_FIELD_NUMBER = 2;
  private boolean regexMode_ = false;
  /**
   * <pre>
   * Indicating whether the query string is a regex or not.
   * </pre>
   *
   * <code>bool regex_mode = 2;</code>
   * @return The regexMode.
   */
  @java.lang.Override
  public boolean getRegexMode() {
    return regexMode_;
  }

  public static final int DISABLE_APPROX_MATCH_FIELD_NUMBER = 3;
  private boolean disableApproxMatch_ = false;
  /**
   * <pre>
   * Indicating whether the detection is an approximate match.
   * </pre>
   *
   * <code>bool disable_approx_match = 3;</code>
   * @return The disableApproxMatch.
   */
  @java.lang.Override
  public boolean getDisableApproxMatch() {
    return disableApproxMatch_;
  }

  public static final int MAX_EDIT_DISTANCE_FIELD_NUMBER = 4;
  private int maxEditDistance_ = 0;
  /**
   * <pre>
   * Levenshtein distance threshold.
   * Applicable only if regex_mode is False.
   * </pre>
   *
   * <code>optional int32 max_edit_distance = 4;</code>
   * @return Whether the maxEditDistance field is set.
   */
  @java.lang.Override
  public boolean hasMaxEditDistance() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Levenshtein distance threshold.
   * Applicable only if regex_mode is False.
   * </pre>
   *
   * <code>optional int32 max_edit_distance = 4;</code>
   * @return The maxEditDistance.
   */
  @java.lang.Override
  public int getMaxEditDistance() {
    return maxEditDistance_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, word_);
    }
    if (regexMode_ != false) {
      output.writeBool(2, regexMode_);
    }
    if (disableApproxMatch_ != false) {
      output.writeBool(3, disableApproxMatch_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(4, maxEditDistance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, word_);
    }
    if (regexMode_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, regexMode_);
    }
    if (disableApproxMatch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, disableApproxMatch_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxEditDistance_);
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
    if (!(obj instanceof com.google.chromeos.uidetection.v1.WordDetectionRequest)) {
      return super.equals(obj);
    }
    com.google.chromeos.uidetection.v1.WordDetectionRequest other = (com.google.chromeos.uidetection.v1.WordDetectionRequest) obj;

    if (!getWord()
        .equals(other.getWord())) return false;
    if (getRegexMode()
        != other.getRegexMode()) return false;
    if (getDisableApproxMatch()
        != other.getDisableApproxMatch()) return false;
    if (hasMaxEditDistance() != other.hasMaxEditDistance()) return false;
    if (hasMaxEditDistance()) {
      if (getMaxEditDistance()
          != other.getMaxEditDistance()) return false;
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
    hash = (37 * hash) + WORD_FIELD_NUMBER;
    hash = (53 * hash) + getWord().hashCode();
    hash = (37 * hash) + REGEX_MODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRegexMode());
    hash = (37 * hash) + DISABLE_APPROX_MATCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableApproxMatch());
    if (hasMaxEditDistance()) {
      hash = (37 * hash) + MAX_EDIT_DISTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxEditDistance();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.WordDetectionRequest parseFrom(
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
  public static Builder newBuilder(com.google.chromeos.uidetection.v1.WordDetectionRequest prototype) {
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
   * Detection type for word detection.
   * </pre>
   *
   * Protobuf type {@code google.chromeos.uidetection.v1.WordDetectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.chromeos.uidetection.v1.WordDetectionRequest)
      com.google.chromeos.uidetection.v1.WordDetectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_WordDetectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_WordDetectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chromeos.uidetection.v1.WordDetectionRequest.class, com.google.chromeos.uidetection.v1.WordDetectionRequest.Builder.class);
    }

    // Construct using com.google.chromeos.uidetection.v1.WordDetectionRequest.newBuilder()
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
      word_ = "";
      regexMode_ = false;
      disableApproxMatch_ = false;
      maxEditDistance_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_WordDetectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.WordDetectionRequest getDefaultInstanceForType() {
      return com.google.chromeos.uidetection.v1.WordDetectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.WordDetectionRequest build() {
      com.google.chromeos.uidetection.v1.WordDetectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.WordDetectionRequest buildPartial() {
      com.google.chromeos.uidetection.v1.WordDetectionRequest result = new com.google.chromeos.uidetection.v1.WordDetectionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chromeos.uidetection.v1.WordDetectionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.word_ = word_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.regexMode_ = regexMode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.disableApproxMatch_ = disableApproxMatch_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxEditDistance_ = maxEditDistance_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.chromeos.uidetection.v1.WordDetectionRequest) {
        return mergeFrom((com.google.chromeos.uidetection.v1.WordDetectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chromeos.uidetection.v1.WordDetectionRequest other) {
      if (other == com.google.chromeos.uidetection.v1.WordDetectionRequest.getDefaultInstance()) return this;
      if (!other.getWord().isEmpty()) {
        word_ = other.word_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRegexMode() != false) {
        setRegexMode(other.getRegexMode());
      }
      if (other.getDisableApproxMatch() != false) {
        setDisableApproxMatch(other.getDisableApproxMatch());
      }
      if (other.hasMaxEditDistance()) {
        setMaxEditDistance(other.getMaxEditDistance());
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
              word_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              regexMode_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              disableApproxMatch_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              maxEditDistance_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object word_ = "";
    /**
     * <pre>
     * Required. The word to locate in the image.
     * </pre>
     *
     * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The word.
     */
    public java.lang.String getWord() {
      java.lang.Object ref = word_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        word_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The word to locate in the image.
     * </pre>
     *
     * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for word.
     */
    public com.google.protobuf.ByteString
        getWordBytes() {
      java.lang.Object ref = word_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        word_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The word to locate in the image.
     * </pre>
     *
     * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The word to set.
     * @return This builder for chaining.
     */
    public Builder setWord(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      word_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The word to locate in the image.
     * </pre>
     *
     * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearWord() {
      word_ = getDefaultInstance().getWord();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The word to locate in the image.
     * </pre>
     *
     * <code>string word = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for word to set.
     * @return This builder for chaining.
     */
    public Builder setWordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      word_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean regexMode_ ;
    /**
     * <pre>
     * Indicating whether the query string is a regex or not.
     * </pre>
     *
     * <code>bool regex_mode = 2;</code>
     * @return The regexMode.
     */
    @java.lang.Override
    public boolean getRegexMode() {
      return regexMode_;
    }
    /**
     * <pre>
     * Indicating whether the query string is a regex or not.
     * </pre>
     *
     * <code>bool regex_mode = 2;</code>
     * @param value The regexMode to set.
     * @return This builder for chaining.
     */
    public Builder setRegexMode(boolean value) {
      
      regexMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicating whether the query string is a regex or not.
     * </pre>
     *
     * <code>bool regex_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegexMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      regexMode_ = false;
      onChanged();
      return this;
    }

    private boolean disableApproxMatch_ ;
    /**
     * <pre>
     * Indicating whether the detection is an approximate match.
     * </pre>
     *
     * <code>bool disable_approx_match = 3;</code>
     * @return The disableApproxMatch.
     */
    @java.lang.Override
    public boolean getDisableApproxMatch() {
      return disableApproxMatch_;
    }
    /**
     * <pre>
     * Indicating whether the detection is an approximate match.
     * </pre>
     *
     * <code>bool disable_approx_match = 3;</code>
     * @param value The disableApproxMatch to set.
     * @return This builder for chaining.
     */
    public Builder setDisableApproxMatch(boolean value) {
      
      disableApproxMatch_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicating whether the detection is an approximate match.
     * </pre>
     *
     * <code>bool disable_approx_match = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableApproxMatch() {
      bitField0_ = (bitField0_ & ~0x00000004);
      disableApproxMatch_ = false;
      onChanged();
      return this;
    }

    private int maxEditDistance_ ;
    /**
     * <pre>
     * Levenshtein distance threshold.
     * Applicable only if regex_mode is False.
     * </pre>
     *
     * <code>optional int32 max_edit_distance = 4;</code>
     * @return Whether the maxEditDistance field is set.
     */
    @java.lang.Override
    public boolean hasMaxEditDistance() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Levenshtein distance threshold.
     * Applicable only if regex_mode is False.
     * </pre>
     *
     * <code>optional int32 max_edit_distance = 4;</code>
     * @return The maxEditDistance.
     */
    @java.lang.Override
    public int getMaxEditDistance() {
      return maxEditDistance_;
    }
    /**
     * <pre>
     * Levenshtein distance threshold.
     * Applicable only if regex_mode is False.
     * </pre>
     *
     * <code>optional int32 max_edit_distance = 4;</code>
     * @param value The maxEditDistance to set.
     * @return This builder for chaining.
     */
    public Builder setMaxEditDistance(int value) {
      
      maxEditDistance_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Levenshtein distance threshold.
     * Applicable only if regex_mode is False.
     * </pre>
     *
     * <code>optional int32 max_edit_distance = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxEditDistance() {
      bitField0_ = (bitField0_ & ~0x00000008);
      maxEditDistance_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.chromeos.uidetection.v1.WordDetectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.chromeos.uidetection.v1.WordDetectionRequest)
  private static final com.google.chromeos.uidetection.v1.WordDetectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.chromeos.uidetection.v1.WordDetectionRequest();
  }

  public static com.google.chromeos.uidetection.v1.WordDetectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WordDetectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<WordDetectionRequest>() {
    @java.lang.Override
    public WordDetectionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<WordDetectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WordDetectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chromeos.uidetection.v1.WordDetectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
