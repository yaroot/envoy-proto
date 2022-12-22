// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/uidetection/v1/ui_detection.proto

package com.google.chromeos.uidetection.v1;

/**
 * <pre>
 * Detection type for text block detection.
 * </pre>
 *
 * Protobuf type {@code google.chromeos.uidetection.v1.TextBlockDetectionRequest}
 */
public final class TextBlockDetectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.chromeos.uidetection.v1.TextBlockDetectionRequest)
    TextBlockDetectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextBlockDetectionRequest.newBuilder() to construct.
  private TextBlockDetectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextBlockDetectionRequest() {
    words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextBlockDetectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_TextBlockDetectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_TextBlockDetectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.class, com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int WORDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList words_;
  /**
   * <pre>
   * Required. The text block consisting a list of words to locate in the image.
   * </pre>
   *
   * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the words.
   */
  public com.google.protobuf.ProtocolStringList
      getWordsList() {
    return words_;
  }
  /**
   * <pre>
   * Required. The text block consisting a list of words to locate in the image.
   * </pre>
   *
   * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of words.
   */
  public int getWordsCount() {
    return words_.size();
  }
  /**
   * <pre>
   * Required. The text block consisting a list of words to locate in the image.
   * </pre>
   *
   * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The words at the given index.
   */
  public java.lang.String getWords(int index) {
    return words_.get(index);
  }
  /**
   * <pre>
   * Required. The text block consisting a list of words to locate in the image.
   * </pre>
   *
   * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the words at the given index.
   */
  public com.google.protobuf.ByteString
      getWordsBytes(int index) {
    return words_.getByteString(index);
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
    for (int i = 0; i < words_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, words_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < words_.size(); i++) {
        dataSize += computeStringSizeNoTag(words_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWordsList().size();
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
    if (!(obj instanceof com.google.chromeos.uidetection.v1.TextBlockDetectionRequest)) {
      return super.equals(obj);
    }
    com.google.chromeos.uidetection.v1.TextBlockDetectionRequest other = (com.google.chromeos.uidetection.v1.TextBlockDetectionRequest) obj;

    if (!getWordsList()
        .equals(other.getWordsList())) return false;
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
    if (getWordsCount() > 0) {
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWordsList().hashCode();
    }
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

  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest parseFrom(
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
  public static Builder newBuilder(com.google.chromeos.uidetection.v1.TextBlockDetectionRequest prototype) {
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
   * Detection type for text block detection.
   * </pre>
   *
   * Protobuf type {@code google.chromeos.uidetection.v1.TextBlockDetectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.chromeos.uidetection.v1.TextBlockDetectionRequest)
      com.google.chromeos.uidetection.v1.TextBlockDetectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_TextBlockDetectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_TextBlockDetectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.class, com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.Builder.class);
    }

    // Construct using com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.newBuilder()
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
      words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      regexMode_ = false;
      disableApproxMatch_ = false;
      maxEditDistance_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.chromeos.uidetection.v1.UiDetectionProto.internal_static_google_chromeos_uidetection_v1_TextBlockDetectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.TextBlockDetectionRequest getDefaultInstanceForType() {
      return com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.TextBlockDetectionRequest build() {
      com.google.chromeos.uidetection.v1.TextBlockDetectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chromeos.uidetection.v1.TextBlockDetectionRequest buildPartial() {
      com.google.chromeos.uidetection.v1.TextBlockDetectionRequest result = new com.google.chromeos.uidetection.v1.TextBlockDetectionRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.chromeos.uidetection.v1.TextBlockDetectionRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        words_ = words_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.words_ = words_;
    }

    private void buildPartial0(com.google.chromeos.uidetection.v1.TextBlockDetectionRequest result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.chromeos.uidetection.v1.TextBlockDetectionRequest) {
        return mergeFrom((com.google.chromeos.uidetection.v1.TextBlockDetectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chromeos.uidetection.v1.TextBlockDetectionRequest other) {
      if (other == com.google.chromeos.uidetection.v1.TextBlockDetectionRequest.getDefaultInstance()) return this;
      if (!other.words_.isEmpty()) {
        if (words_.isEmpty()) {
          words_ = other.words_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWordsIsMutable();
          words_.addAll(other.words_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureWordsIsMutable();
              words_.add(s);
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

    private com.google.protobuf.LazyStringList words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        words_ = new com.google.protobuf.LazyStringArrayList(words_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the words.
     */
    public com.google.protobuf.ProtocolStringList
        getWordsList() {
      return words_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of words.
     */
    public int getWordsCount() {
      return words_.size();
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The words at the given index.
     */
    public java.lang.String getWords(int index) {
      return words_.get(index);
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the words at the given index.
     */
    public com.google.protobuf.ByteString
        getWordsBytes(int index) {
      return words_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The words to set.
     * @return This builder for chaining.
     */
    public Builder setWords(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureWordsIsMutable();
      words_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The words to add.
     * @return This builder for chaining.
     */
    public Builder addWords(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureWordsIsMutable();
      words_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The words to add.
     * @return This builder for chaining.
     */
    public Builder addAllWords(
        java.lang.Iterable<java.lang.String> values) {
      ensureWordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, words_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearWords() {
      words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The text block consisting a list of words to locate in the image.
     * </pre>
     *
     * <code>repeated string words = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the words to add.
     * @return This builder for chaining.
     */
    public Builder addWordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureWordsIsMutable();
      words_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.chromeos.uidetection.v1.TextBlockDetectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.chromeos.uidetection.v1.TextBlockDetectionRequest)
  private static final com.google.chromeos.uidetection.v1.TextBlockDetectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.chromeos.uidetection.v1.TextBlockDetectionRequest();
  }

  public static com.google.chromeos.uidetection.v1.TextBlockDetectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextBlockDetectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<TextBlockDetectionRequest>() {
    @java.lang.Override
    public TextBlockDetectionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextBlockDetectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextBlockDetectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chromeos.uidetection.v1.TextBlockDetectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

