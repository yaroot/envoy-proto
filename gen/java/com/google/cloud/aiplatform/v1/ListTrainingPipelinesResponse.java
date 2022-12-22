// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/pipeline_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for [PipelineService.ListTrainingPipelines][google.cloud.aiplatform.v1.PipelineService.ListTrainingPipelines]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListTrainingPipelinesResponse}
 */
public final class ListTrainingPipelinesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListTrainingPipelinesResponse)
    ListTrainingPipelinesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTrainingPipelinesResponse.newBuilder() to construct.
  private ListTrainingPipelinesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTrainingPipelinesResponse() {
    trainingPipelines_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTrainingPipelinesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.PipelineServiceProto.internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.PipelineServiceProto.internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.class, com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.Builder.class);
  }

  public static final int TRAINING_PIPELINES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.TrainingPipeline> trainingPipelines_;
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.TrainingPipeline> getTrainingPipelinesList() {
    return trainingPipelines_;
  }
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder> 
      getTrainingPipelinesOrBuilderList() {
    return trainingPipelines_;
  }
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
   */
  @java.lang.Override
  public int getTrainingPipelinesCount() {
    return trainingPipelines_.size();
  }
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TrainingPipeline getTrainingPipelines(int index) {
    return trainingPipelines_.get(index);
  }
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder getTrainingPipelinesOrBuilder(
      int index) {
    return trainingPipelines_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < trainingPipelines_.size(); i++) {
      output.writeMessage(1, trainingPipelines_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < trainingPipelines_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, trainingPipelines_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse other = (com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse) obj;

    if (!getTrainingPipelinesList()
        .equals(other.getTrainingPipelinesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getTrainingPipelinesCount() > 0) {
      hash = (37 * hash) + TRAINING_PIPELINES_FIELD_NUMBER;
      hash = (53 * hash) + getTrainingPipelinesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse prototype) {
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
   * Response message for [PipelineService.ListTrainingPipelines][google.cloud.aiplatform.v1.PipelineService.ListTrainingPipelines]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListTrainingPipelinesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListTrainingPipelinesResponse)
      com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.PipelineServiceProto.internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.PipelineServiceProto.internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.class, com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.newBuilder()
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
      if (trainingPipelinesBuilder_ == null) {
        trainingPipelines_ = java.util.Collections.emptyList();
      } else {
        trainingPipelines_ = null;
        trainingPipelinesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.PipelineServiceProto.internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse build() {
      com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse result = new com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse result) {
      if (trainingPipelinesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          trainingPipelines_ = java.util.Collections.unmodifiableList(trainingPipelines_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.trainingPipelines_ = trainingPipelines_;
      } else {
        result.trainingPipelines_ = trainingPipelinesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse.getDefaultInstance()) return this;
      if (trainingPipelinesBuilder_ == null) {
        if (!other.trainingPipelines_.isEmpty()) {
          if (trainingPipelines_.isEmpty()) {
            trainingPipelines_ = other.trainingPipelines_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTrainingPipelinesIsMutable();
            trainingPipelines_.addAll(other.trainingPipelines_);
          }
          onChanged();
        }
      } else {
        if (!other.trainingPipelines_.isEmpty()) {
          if (trainingPipelinesBuilder_.isEmpty()) {
            trainingPipelinesBuilder_.dispose();
            trainingPipelinesBuilder_ = null;
            trainingPipelines_ = other.trainingPipelines_;
            bitField0_ = (bitField0_ & ~0x00000001);
            trainingPipelinesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTrainingPipelinesFieldBuilder() : null;
          } else {
            trainingPipelinesBuilder_.addAllMessages(other.trainingPipelines_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              com.google.cloud.aiplatform.v1.TrainingPipeline m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.TrainingPipeline.parser(),
                      extensionRegistry);
              if (trainingPipelinesBuilder_ == null) {
                ensureTrainingPipelinesIsMutable();
                trainingPipelines_.add(m);
              } else {
                trainingPipelinesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.aiplatform.v1.TrainingPipeline> trainingPipelines_ =
      java.util.Collections.emptyList();
    private void ensureTrainingPipelinesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trainingPipelines_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.TrainingPipeline>(trainingPipelines_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TrainingPipeline, com.google.cloud.aiplatform.v1.TrainingPipeline.Builder, com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder> trainingPipelinesBuilder_;

    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.TrainingPipeline> getTrainingPipelinesList() {
      if (trainingPipelinesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trainingPipelines_);
      } else {
        return trainingPipelinesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public int getTrainingPipelinesCount() {
      if (trainingPipelinesBuilder_ == null) {
        return trainingPipelines_.size();
      } else {
        return trainingPipelinesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TrainingPipeline getTrainingPipelines(int index) {
      if (trainingPipelinesBuilder_ == null) {
        return trainingPipelines_.get(index);
      } else {
        return trainingPipelinesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder setTrainingPipelines(
        int index, com.google.cloud.aiplatform.v1.TrainingPipeline value) {
      if (trainingPipelinesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.set(index, value);
        onChanged();
      } else {
        trainingPipelinesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder setTrainingPipelines(
        int index, com.google.cloud.aiplatform.v1.TrainingPipeline.Builder builderForValue) {
      if (trainingPipelinesBuilder_ == null) {
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.set(index, builderForValue.build());
        onChanged();
      } else {
        trainingPipelinesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder addTrainingPipelines(com.google.cloud.aiplatform.v1.TrainingPipeline value) {
      if (trainingPipelinesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.add(value);
        onChanged();
      } else {
        trainingPipelinesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder addTrainingPipelines(
        int index, com.google.cloud.aiplatform.v1.TrainingPipeline value) {
      if (trainingPipelinesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.add(index, value);
        onChanged();
      } else {
        trainingPipelinesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder addTrainingPipelines(
        com.google.cloud.aiplatform.v1.TrainingPipeline.Builder builderForValue) {
      if (trainingPipelinesBuilder_ == null) {
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.add(builderForValue.build());
        onChanged();
      } else {
        trainingPipelinesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder addTrainingPipelines(
        int index, com.google.cloud.aiplatform.v1.TrainingPipeline.Builder builderForValue) {
      if (trainingPipelinesBuilder_ == null) {
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.add(index, builderForValue.build());
        onChanged();
      } else {
        trainingPipelinesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder addAllTrainingPipelines(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.TrainingPipeline> values) {
      if (trainingPipelinesBuilder_ == null) {
        ensureTrainingPipelinesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, trainingPipelines_);
        onChanged();
      } else {
        trainingPipelinesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder clearTrainingPipelines() {
      if (trainingPipelinesBuilder_ == null) {
        trainingPipelines_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        trainingPipelinesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public Builder removeTrainingPipelines(int index) {
      if (trainingPipelinesBuilder_ == null) {
        ensureTrainingPipelinesIsMutable();
        trainingPipelines_.remove(index);
        onChanged();
      } else {
        trainingPipelinesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TrainingPipeline.Builder getTrainingPipelinesBuilder(
        int index) {
      return getTrainingPipelinesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder getTrainingPipelinesOrBuilder(
        int index) {
      if (trainingPipelinesBuilder_ == null) {
        return trainingPipelines_.get(index);  } else {
        return trainingPipelinesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder> 
         getTrainingPipelinesOrBuilderList() {
      if (trainingPipelinesBuilder_ != null) {
        return trainingPipelinesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trainingPipelines_);
      }
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TrainingPipeline.Builder addTrainingPipelinesBuilder() {
      return getTrainingPipelinesFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1.TrainingPipeline.getDefaultInstance());
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TrainingPipeline.Builder addTrainingPipelinesBuilder(
        int index) {
      return getTrainingPipelinesFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1.TrainingPipeline.getDefaultInstance());
    }
    /**
     * <pre>
     * List of TrainingPipelines in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TrainingPipeline training_pipelines = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.TrainingPipeline.Builder> 
         getTrainingPipelinesBuilderList() {
      return getTrainingPipelinesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TrainingPipeline, com.google.cloud.aiplatform.v1.TrainingPipeline.Builder, com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder> 
        getTrainingPipelinesFieldBuilder() {
      if (trainingPipelinesBuilder_ == null) {
        trainingPipelinesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TrainingPipeline, com.google.cloud.aiplatform.v1.TrainingPipeline.Builder, com.google.cloud.aiplatform.v1.TrainingPipelineOrBuilder>(
                trainingPipelines_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        trainingPipelines_ = null;
      }
      return trainingPipelinesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1.ListTrainingPipelinesRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListTrainingPipelinesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListTrainingPipelinesResponse)
  private static final com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTrainingPipelinesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTrainingPipelinesResponse>() {
    @java.lang.Override
    public ListTrainingPipelinesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTrainingPipelinesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTrainingPipelinesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListTrainingPipelinesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

