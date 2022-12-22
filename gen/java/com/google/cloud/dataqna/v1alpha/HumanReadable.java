// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataqna/v1alpha/question.proto

package com.google.cloud.dataqna.v1alpha;

/**
 * <pre>
 * Human readable interpretation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataqna.v1alpha.HumanReadable}
 */
public final class HumanReadable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataqna.v1alpha.HumanReadable)
    HumanReadableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HumanReadable.newBuilder() to construct.
  private HumanReadable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HumanReadable() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HumanReadable();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataqna.v1alpha.QuestionProto.internal_static_google_cloud_dataqna_v1alpha_HumanReadable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataqna.v1alpha.QuestionProto.internal_static_google_cloud_dataqna_v1alpha_HumanReadable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataqna.v1alpha.HumanReadable.class, com.google.cloud.dataqna.v1alpha.HumanReadable.Builder.class);
  }

  public static final int GENERATED_INTERPRETATION_FIELD_NUMBER = 1;
  private com.google.cloud.dataqna.v1alpha.AnnotatedString generatedInterpretation_;
  /**
   * <pre>
   * Generated query explaining the interpretation.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
   * @return Whether the generatedInterpretation field is set.
   */
  @java.lang.Override
  public boolean hasGeneratedInterpretation() {
    return generatedInterpretation_ != null;
  }
  /**
   * <pre>
   * Generated query explaining the interpretation.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
   * @return The generatedInterpretation.
   */
  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.AnnotatedString getGeneratedInterpretation() {
    return generatedInterpretation_ == null ? com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : generatedInterpretation_;
  }
  /**
   * <pre>
   * Generated query explaining the interpretation.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder getGeneratedInterpretationOrBuilder() {
    return generatedInterpretation_ == null ? com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : generatedInterpretation_;
  }

  public static final int ORIGINAL_QUESTION_FIELD_NUMBER = 2;
  private com.google.cloud.dataqna.v1alpha.AnnotatedString originalQuestion_;
  /**
   * <pre>
   * Annotations on the original query.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
   * @return Whether the originalQuestion field is set.
   */
  @java.lang.Override
  public boolean hasOriginalQuestion() {
    return originalQuestion_ != null;
  }
  /**
   * <pre>
   * Annotations on the original query.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
   * @return The originalQuestion.
   */
  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.AnnotatedString getOriginalQuestion() {
    return originalQuestion_ == null ? com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : originalQuestion_;
  }
  /**
   * <pre>
   * Annotations on the original query.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder getOriginalQuestionOrBuilder() {
    return originalQuestion_ == null ? com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : originalQuestion_;
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
    if (generatedInterpretation_ != null) {
      output.writeMessage(1, getGeneratedInterpretation());
    }
    if (originalQuestion_ != null) {
      output.writeMessage(2, getOriginalQuestion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (generatedInterpretation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGeneratedInterpretation());
    }
    if (originalQuestion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOriginalQuestion());
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
    if (!(obj instanceof com.google.cloud.dataqna.v1alpha.HumanReadable)) {
      return super.equals(obj);
    }
    com.google.cloud.dataqna.v1alpha.HumanReadable other = (com.google.cloud.dataqna.v1alpha.HumanReadable) obj;

    if (hasGeneratedInterpretation() != other.hasGeneratedInterpretation()) return false;
    if (hasGeneratedInterpretation()) {
      if (!getGeneratedInterpretation()
          .equals(other.getGeneratedInterpretation())) return false;
    }
    if (hasOriginalQuestion() != other.hasOriginalQuestion()) return false;
    if (hasOriginalQuestion()) {
      if (!getOriginalQuestion()
          .equals(other.getOriginalQuestion())) return false;
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
    if (hasGeneratedInterpretation()) {
      hash = (37 * hash) + GENERATED_INTERPRETATION_FIELD_NUMBER;
      hash = (53 * hash) + getGeneratedInterpretation().hashCode();
    }
    if (hasOriginalQuestion()) {
      hash = (37 * hash) + ORIGINAL_QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getOriginalQuestion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataqna.v1alpha.HumanReadable parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataqna.v1alpha.HumanReadable prototype) {
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
   * Human readable interpretation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataqna.v1alpha.HumanReadable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataqna.v1alpha.HumanReadable)
      com.google.cloud.dataqna.v1alpha.HumanReadableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataqna.v1alpha.QuestionProto.internal_static_google_cloud_dataqna_v1alpha_HumanReadable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataqna.v1alpha.QuestionProto.internal_static_google_cloud_dataqna_v1alpha_HumanReadable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataqna.v1alpha.HumanReadable.class, com.google.cloud.dataqna.v1alpha.HumanReadable.Builder.class);
    }

    // Construct using com.google.cloud.dataqna.v1alpha.HumanReadable.newBuilder()
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
      generatedInterpretation_ = null;
      if (generatedInterpretationBuilder_ != null) {
        generatedInterpretationBuilder_.dispose();
        generatedInterpretationBuilder_ = null;
      }
      originalQuestion_ = null;
      if (originalQuestionBuilder_ != null) {
        originalQuestionBuilder_.dispose();
        originalQuestionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataqna.v1alpha.QuestionProto.internal_static_google_cloud_dataqna_v1alpha_HumanReadable_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataqna.v1alpha.HumanReadable getDefaultInstanceForType() {
      return com.google.cloud.dataqna.v1alpha.HumanReadable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataqna.v1alpha.HumanReadable build() {
      com.google.cloud.dataqna.v1alpha.HumanReadable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataqna.v1alpha.HumanReadable buildPartial() {
      com.google.cloud.dataqna.v1alpha.HumanReadable result = new com.google.cloud.dataqna.v1alpha.HumanReadable(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataqna.v1alpha.HumanReadable result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.generatedInterpretation_ = generatedInterpretationBuilder_ == null
            ? generatedInterpretation_
            : generatedInterpretationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.originalQuestion_ = originalQuestionBuilder_ == null
            ? originalQuestion_
            : originalQuestionBuilder_.build();
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
      if (other instanceof com.google.cloud.dataqna.v1alpha.HumanReadable) {
        return mergeFrom((com.google.cloud.dataqna.v1alpha.HumanReadable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataqna.v1alpha.HumanReadable other) {
      if (other == com.google.cloud.dataqna.v1alpha.HumanReadable.getDefaultInstance()) return this;
      if (other.hasGeneratedInterpretation()) {
        mergeGeneratedInterpretation(other.getGeneratedInterpretation());
      }
      if (other.hasOriginalQuestion()) {
        mergeOriginalQuestion(other.getOriginalQuestion());
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
                  getGeneratedInterpretationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOriginalQuestionFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.cloud.dataqna.v1alpha.AnnotatedString generatedInterpretation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataqna.v1alpha.AnnotatedString, com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder, com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder> generatedInterpretationBuilder_;
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     * @return Whether the generatedInterpretation field is set.
     */
    public boolean hasGeneratedInterpretation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     * @return The generatedInterpretation.
     */
    public com.google.cloud.dataqna.v1alpha.AnnotatedString getGeneratedInterpretation() {
      if (generatedInterpretationBuilder_ == null) {
        return generatedInterpretation_ == null ? com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : generatedInterpretation_;
      } else {
        return generatedInterpretationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    public Builder setGeneratedInterpretation(com.google.cloud.dataqna.v1alpha.AnnotatedString value) {
      if (generatedInterpretationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        generatedInterpretation_ = value;
      } else {
        generatedInterpretationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    public Builder setGeneratedInterpretation(
        com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder builderForValue) {
      if (generatedInterpretationBuilder_ == null) {
        generatedInterpretation_ = builderForValue.build();
      } else {
        generatedInterpretationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    public Builder mergeGeneratedInterpretation(com.google.cloud.dataqna.v1alpha.AnnotatedString value) {
      if (generatedInterpretationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          generatedInterpretation_ != null &&
          generatedInterpretation_ != com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance()) {
          getGeneratedInterpretationBuilder().mergeFrom(value);
        } else {
          generatedInterpretation_ = value;
        }
      } else {
        generatedInterpretationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    public Builder clearGeneratedInterpretation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      generatedInterpretation_ = null;
      if (generatedInterpretationBuilder_ != null) {
        generatedInterpretationBuilder_.dispose();
        generatedInterpretationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    public com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder getGeneratedInterpretationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGeneratedInterpretationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    public com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder getGeneratedInterpretationOrBuilder() {
      if (generatedInterpretationBuilder_ != null) {
        return generatedInterpretationBuilder_.getMessageOrBuilder();
      } else {
        return generatedInterpretation_ == null ?
            com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : generatedInterpretation_;
      }
    }
    /**
     * <pre>
     * Generated query explaining the interpretation.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString generated_interpretation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataqna.v1alpha.AnnotatedString, com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder, com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder> 
        getGeneratedInterpretationFieldBuilder() {
      if (generatedInterpretationBuilder_ == null) {
        generatedInterpretationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataqna.v1alpha.AnnotatedString, com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder, com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder>(
                getGeneratedInterpretation(),
                getParentForChildren(),
                isClean());
        generatedInterpretation_ = null;
      }
      return generatedInterpretationBuilder_;
    }

    private com.google.cloud.dataqna.v1alpha.AnnotatedString originalQuestion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataqna.v1alpha.AnnotatedString, com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder, com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder> originalQuestionBuilder_;
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     * @return Whether the originalQuestion field is set.
     */
    public boolean hasOriginalQuestion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     * @return The originalQuestion.
     */
    public com.google.cloud.dataqna.v1alpha.AnnotatedString getOriginalQuestion() {
      if (originalQuestionBuilder_ == null) {
        return originalQuestion_ == null ? com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : originalQuestion_;
      } else {
        return originalQuestionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    public Builder setOriginalQuestion(com.google.cloud.dataqna.v1alpha.AnnotatedString value) {
      if (originalQuestionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        originalQuestion_ = value;
      } else {
        originalQuestionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    public Builder setOriginalQuestion(
        com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder builderForValue) {
      if (originalQuestionBuilder_ == null) {
        originalQuestion_ = builderForValue.build();
      } else {
        originalQuestionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    public Builder mergeOriginalQuestion(com.google.cloud.dataqna.v1alpha.AnnotatedString value) {
      if (originalQuestionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          originalQuestion_ != null &&
          originalQuestion_ != com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance()) {
          getOriginalQuestionBuilder().mergeFrom(value);
        } else {
          originalQuestion_ = value;
        }
      } else {
        originalQuestionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    public Builder clearOriginalQuestion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      originalQuestion_ = null;
      if (originalQuestionBuilder_ != null) {
        originalQuestionBuilder_.dispose();
        originalQuestionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    public com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder getOriginalQuestionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOriginalQuestionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    public com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder getOriginalQuestionOrBuilder() {
      if (originalQuestionBuilder_ != null) {
        return originalQuestionBuilder_.getMessageOrBuilder();
      } else {
        return originalQuestion_ == null ?
            com.google.cloud.dataqna.v1alpha.AnnotatedString.getDefaultInstance() : originalQuestion_;
      }
    }
    /**
     * <pre>
     * Annotations on the original query.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.AnnotatedString original_question = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataqna.v1alpha.AnnotatedString, com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder, com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder> 
        getOriginalQuestionFieldBuilder() {
      if (originalQuestionBuilder_ == null) {
        originalQuestionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataqna.v1alpha.AnnotatedString, com.google.cloud.dataqna.v1alpha.AnnotatedString.Builder, com.google.cloud.dataqna.v1alpha.AnnotatedStringOrBuilder>(
                getOriginalQuestion(),
                getParentForChildren(),
                isClean());
        originalQuestion_ = null;
      }
      return originalQuestionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataqna.v1alpha.HumanReadable)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataqna.v1alpha.HumanReadable)
  private static final com.google.cloud.dataqna.v1alpha.HumanReadable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataqna.v1alpha.HumanReadable();
  }

  public static com.google.cloud.dataqna.v1alpha.HumanReadable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HumanReadable>
      PARSER = new com.google.protobuf.AbstractParser<HumanReadable>() {
    @java.lang.Override
    public HumanReadable parsePartialFrom(
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

  public static com.google.protobuf.Parser<HumanReadable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HumanReadable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.HumanReadable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

