// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The response message for [Environments.ListTestCaseResults][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse}
 */
public final class ListContinuousTestResultsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)
    ListContinuousTestResultsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListContinuousTestResultsResponse.newBuilder() to construct.
  private ListContinuousTestResultsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListContinuousTestResultsResponse() {
    continuousTestResults_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListContinuousTestResultsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListContinuousTestResultsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListContinuousTestResultsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.Builder.class);
  }

  public static final int CONTINUOUS_TEST_RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult> continuousTestResults_;
  /**
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult> getContinuousTestResultsList() {
    return continuousTestResults_;
  }
  /**
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder> 
      getContinuousTestResultsOrBuilderList() {
    return continuousTestResults_;
  }
  /**
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
   */
  @java.lang.Override
  public int getContinuousTestResultsCount() {
    return continuousTestResults_.size();
  }
  /**
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult getContinuousTestResults(int index) {
    return continuousTestResults_.get(index);
  }
  /**
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder getContinuousTestResultsOrBuilder(
      int index) {
    return continuousTestResults_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < continuousTestResults_.size(); i++) {
      output.writeMessage(1, continuousTestResults_.get(i));
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
    for (int i = 0; i < continuousTestResults_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, continuousTestResults_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse other = (com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse) obj;

    if (!getContinuousTestResultsList()
        .equals(other.getContinuousTestResultsList())) return false;
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
    if (getContinuousTestResultsCount() > 0) {
      hash = (37 * hash) + CONTINUOUS_TEST_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getContinuousTestResultsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse prototype) {
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
   * The response message for [Environments.ListTestCaseResults][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListContinuousTestResultsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListContinuousTestResultsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.newBuilder()
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
      if (continuousTestResultsBuilder_ == null) {
        continuousTestResults_ = java.util.Collections.emptyList();
      } else {
        continuousTestResults_ = null;
        continuousTestResultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListContinuousTestResultsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse result = new com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse result) {
      if (continuousTestResultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          continuousTestResults_ = java.util.Collections.unmodifiableList(continuousTestResults_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.continuousTestResults_ = continuousTestResults_;
      } else {
        result.continuousTestResults_ = continuousTestResultsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse.getDefaultInstance()) return this;
      if (continuousTestResultsBuilder_ == null) {
        if (!other.continuousTestResults_.isEmpty()) {
          if (continuousTestResults_.isEmpty()) {
            continuousTestResults_ = other.continuousTestResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContinuousTestResultsIsMutable();
            continuousTestResults_.addAll(other.continuousTestResults_);
          }
          onChanged();
        }
      } else {
        if (!other.continuousTestResults_.isEmpty()) {
          if (continuousTestResultsBuilder_.isEmpty()) {
            continuousTestResultsBuilder_.dispose();
            continuousTestResultsBuilder_ = null;
            continuousTestResults_ = other.continuousTestResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
            continuousTestResultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContinuousTestResultsFieldBuilder() : null;
          } else {
            continuousTestResultsBuilder_.addAllMessages(other.continuousTestResults_);
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
              com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.parser(),
                      extensionRegistry);
              if (continuousTestResultsBuilder_ == null) {
                ensureContinuousTestResultsIsMutable();
                continuousTestResults_.add(m);
              } else {
                continuousTestResultsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult> continuousTestResults_ =
      java.util.Collections.emptyList();
    private void ensureContinuousTestResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        continuousTestResults_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult>(continuousTestResults_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder> continuousTestResultsBuilder_;

    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult> getContinuousTestResultsList() {
      if (continuousTestResultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(continuousTestResults_);
      } else {
        return continuousTestResultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public int getContinuousTestResultsCount() {
      if (continuousTestResultsBuilder_ == null) {
        return continuousTestResults_.size();
      } else {
        return continuousTestResultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult getContinuousTestResults(int index) {
      if (continuousTestResultsBuilder_ == null) {
        return continuousTestResults_.get(index);
      } else {
        return continuousTestResultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder setContinuousTestResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult value) {
      if (continuousTestResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.set(index, value);
        onChanged();
      } else {
        continuousTestResultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder setContinuousTestResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder builderForValue) {
      if (continuousTestResultsBuilder_ == null) {
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.set(index, builderForValue.build());
        onChanged();
      } else {
        continuousTestResultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder addContinuousTestResults(com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult value) {
      if (continuousTestResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.add(value);
        onChanged();
      } else {
        continuousTestResultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder addContinuousTestResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult value) {
      if (continuousTestResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.add(index, value);
        onChanged();
      } else {
        continuousTestResultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder addContinuousTestResults(
        com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder builderForValue) {
      if (continuousTestResultsBuilder_ == null) {
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.add(builderForValue.build());
        onChanged();
      } else {
        continuousTestResultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder addContinuousTestResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder builderForValue) {
      if (continuousTestResultsBuilder_ == null) {
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.add(index, builderForValue.build());
        onChanged();
      } else {
        continuousTestResultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder addAllContinuousTestResults(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult> values) {
      if (continuousTestResultsBuilder_ == null) {
        ensureContinuousTestResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, continuousTestResults_);
        onChanged();
      } else {
        continuousTestResultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder clearContinuousTestResults() {
      if (continuousTestResultsBuilder_ == null) {
        continuousTestResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        continuousTestResultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public Builder removeContinuousTestResults(int index) {
      if (continuousTestResultsBuilder_ == null) {
        ensureContinuousTestResultsIsMutable();
        continuousTestResults_.remove(index);
        onChanged();
      } else {
        continuousTestResultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder getContinuousTestResultsBuilder(
        int index) {
      return getContinuousTestResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder getContinuousTestResultsOrBuilder(
        int index) {
      if (continuousTestResultsBuilder_ == null) {
        return continuousTestResults_.get(index);  } else {
        return continuousTestResultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder> 
         getContinuousTestResultsOrBuilderList() {
      if (continuousTestResultsBuilder_ != null) {
        return continuousTestResultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(continuousTestResults_);
      }
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder addContinuousTestResultsBuilder() {
      return getContinuousTestResultsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder addContinuousTestResultsBuilder(
        int index) {
      return getContinuousTestResultsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of continuous test results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder> 
         getContinuousTestResultsBuilderList() {
      return getContinuousTestResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder> 
        getContinuousTestResultsFieldBuilder() {
      if (continuousTestResultsBuilder_ == null) {
        continuousTestResultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult.Builder, com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder>(
                continuousTestResults_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        continuousTestResults_ = null;
      }
      return continuousTestResultsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListContinuousTestResultsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListContinuousTestResultsResponse>() {
    @java.lang.Override
    public ListContinuousTestResultsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListContinuousTestResultsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListContinuousTestResultsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

