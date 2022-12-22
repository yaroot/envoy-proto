// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataqna/v1alpha/question_service.proto

package com.google.cloud.dataqna.v1alpha;

/**
 * <pre>
 * Request to create a question resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataqna.v1alpha.CreateQuestionRequest}
 */
public final class CreateQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataqna.v1alpha.CreateQuestionRequest)
    CreateQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateQuestionRequest.newBuilder() to construct.
  private CreateQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateQuestionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateQuestionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataqna.v1alpha.QuestionServiceProto.internal_static_google_cloud_dataqna_v1alpha_CreateQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataqna.v1alpha.QuestionServiceProto.internal_static_google_cloud_dataqna_v1alpha_CreateQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.class, com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The name of the project this data source reference belongs to.
   * Example: `projects/foo/locations/bar`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the project this data source reference belongs to.
   * Example: `projects/foo/locations/bar`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUESTION_FIELD_NUMBER = 2;
  private com.google.cloud.dataqna.v1alpha.Question question_;
  /**
   * <pre>
   * Required. The question to create.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the question field is set.
   */
  @java.lang.Override
  public boolean hasQuestion() {
    return question_ != null;
  }
  /**
   * <pre>
   * Required. The question to create.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The question.
   */
  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.Question getQuestion() {
    return question_ == null ? com.google.cloud.dataqna.v1alpha.Question.getDefaultInstance() : question_;
  }
  /**
   * <pre>
   * Required. The question to create.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.QuestionOrBuilder getQuestionOrBuilder() {
    return question_ == null ? com.google.cloud.dataqna.v1alpha.Question.getDefaultInstance() : question_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (question_ != null) {
      output.writeMessage(2, getQuestion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (question_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuestion());
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
    if (!(obj instanceof com.google.cloud.dataqna.v1alpha.CreateQuestionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataqna.v1alpha.CreateQuestionRequest other = (com.google.cloud.dataqna.v1alpha.CreateQuestionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasQuestion() != other.hasQuestion()) return false;
    if (hasQuestion()) {
      if (!getQuestion()
          .equals(other.getQuestion())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasQuestion()) {
      hash = (37 * hash) + QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getQuestion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataqna.v1alpha.CreateQuestionRequest prototype) {
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
   * Request to create a question resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataqna.v1alpha.CreateQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataqna.v1alpha.CreateQuestionRequest)
      com.google.cloud.dataqna.v1alpha.CreateQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataqna.v1alpha.QuestionServiceProto.internal_static_google_cloud_dataqna_v1alpha_CreateQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataqna.v1alpha.QuestionServiceProto.internal_static_google_cloud_dataqna_v1alpha_CreateQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.class, com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.newBuilder()
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
      parent_ = "";
      question_ = null;
      if (questionBuilder_ != null) {
        questionBuilder_.dispose();
        questionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataqna.v1alpha.QuestionServiceProto.internal_static_google_cloud_dataqna_v1alpha_CreateQuestionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataqna.v1alpha.CreateQuestionRequest getDefaultInstanceForType() {
      return com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataqna.v1alpha.CreateQuestionRequest build() {
      com.google.cloud.dataqna.v1alpha.CreateQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataqna.v1alpha.CreateQuestionRequest buildPartial() {
      com.google.cloud.dataqna.v1alpha.CreateQuestionRequest result = new com.google.cloud.dataqna.v1alpha.CreateQuestionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataqna.v1alpha.CreateQuestionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.question_ = questionBuilder_ == null
            ? question_
            : questionBuilder_.build();
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
      if (other instanceof com.google.cloud.dataqna.v1alpha.CreateQuestionRequest) {
        return mergeFrom((com.google.cloud.dataqna.v1alpha.CreateQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataqna.v1alpha.CreateQuestionRequest other) {
      if (other == com.google.cloud.dataqna.v1alpha.CreateQuestionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasQuestion()) {
        mergeQuestion(other.getQuestion());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getQuestionFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the project this data source reference belongs to.
     * Example: `projects/foo/locations/bar`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the project this data source reference belongs to.
     * Example: `projects/foo/locations/bar`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the project this data source reference belongs to.
     * Example: `projects/foo/locations/bar`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the project this data source reference belongs to.
     * Example: `projects/foo/locations/bar`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the project this data source reference belongs to.
     * Example: `projects/foo/locations/bar`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dataqna.v1alpha.Question question_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataqna.v1alpha.Question, com.google.cloud.dataqna.v1alpha.Question.Builder, com.google.cloud.dataqna.v1alpha.QuestionOrBuilder> questionBuilder_;
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the question field is set.
     */
    public boolean hasQuestion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The question.
     */
    public com.google.cloud.dataqna.v1alpha.Question getQuestion() {
      if (questionBuilder_ == null) {
        return question_ == null ? com.google.cloud.dataqna.v1alpha.Question.getDefaultInstance() : question_;
      } else {
        return questionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQuestion(com.google.cloud.dataqna.v1alpha.Question value) {
      if (questionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        question_ = value;
      } else {
        questionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQuestion(
        com.google.cloud.dataqna.v1alpha.Question.Builder builderForValue) {
      if (questionBuilder_ == null) {
        question_ = builderForValue.build();
      } else {
        questionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeQuestion(com.google.cloud.dataqna.v1alpha.Question value) {
      if (questionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          question_ != null &&
          question_ != com.google.cloud.dataqna.v1alpha.Question.getDefaultInstance()) {
          getQuestionBuilder().mergeFrom(value);
        } else {
          question_ = value;
        }
      } else {
        questionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearQuestion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      question_ = null;
      if (questionBuilder_ != null) {
        questionBuilder_.dispose();
        questionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataqna.v1alpha.Question.Builder getQuestionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getQuestionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataqna.v1alpha.QuestionOrBuilder getQuestionOrBuilder() {
      if (questionBuilder_ != null) {
        return questionBuilder_.getMessageOrBuilder();
      } else {
        return question_ == null ?
            com.google.cloud.dataqna.v1alpha.Question.getDefaultInstance() : question_;
      }
    }
    /**
     * <pre>
     * Required. The question to create.
     * </pre>
     *
     * <code>.google.cloud.dataqna.v1alpha.Question question = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataqna.v1alpha.Question, com.google.cloud.dataqna.v1alpha.Question.Builder, com.google.cloud.dataqna.v1alpha.QuestionOrBuilder> 
        getQuestionFieldBuilder() {
      if (questionBuilder_ == null) {
        questionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataqna.v1alpha.Question, com.google.cloud.dataqna.v1alpha.Question.Builder, com.google.cloud.dataqna.v1alpha.QuestionOrBuilder>(
                getQuestion(),
                getParentForChildren(),
                isClean());
        question_ = null;
      }
      return questionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataqna.v1alpha.CreateQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataqna.v1alpha.CreateQuestionRequest)
  private static final com.google.cloud.dataqna.v1alpha.CreateQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataqna.v1alpha.CreateQuestionRequest();
  }

  public static com.google.cloud.dataqna.v1alpha.CreateQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateQuestionRequest>() {
    @java.lang.Override
    public CreateQuestionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataqna.v1alpha.CreateQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

