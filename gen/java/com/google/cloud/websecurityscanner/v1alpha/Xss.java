// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 * <pre>
 * Information reported for an XSS.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.Xss}
 */
public final class Xss extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.Xss)
    XssOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Xss.newBuilder() to construct.
  private Xss(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Xss() {
    stackTraces_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    errorMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Xss();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1alpha_Xss_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1alpha_Xss_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.Xss.class, com.google.cloud.websecurityscanner.v1alpha.Xss.Builder.class);
  }

  public static final int STACK_TRACES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList stackTraces_;
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @return A list containing the stackTraces.
   */
  public com.google.protobuf.ProtocolStringList
      getStackTracesList() {
    return stackTraces_;
  }
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @return The count of stackTraces.
   */
  public int getStackTracesCount() {
    return stackTraces_.size();
  }
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @param index The index of the element to return.
   * @return The stackTraces at the given index.
   */
  public java.lang.String getStackTraces(int index) {
    return stackTraces_.get(index);
  }
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the stackTraces at the given index.
   */
  public com.google.protobuf.ByteString
      getStackTracesBytes(int index) {
    return stackTraces_.getByteString(index);
  }

  public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object errorMessage_ = "";
  /**
   * <pre>
   * An error message generated by a javascript breakage.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The errorMessage.
   */
  @java.lang.Override
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An error message generated by a javascript breakage.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The bytes for errorMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
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
    for (int i = 0; i < stackTraces_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stackTraces_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
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
      for (int i = 0; i < stackTraces_.size(); i++) {
        dataSize += computeStringSizeNoTag(stackTraces_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStackTracesList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.Xss)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.Xss other = (com.google.cloud.websecurityscanner.v1alpha.Xss) obj;

    if (!getStackTracesList()
        .equals(other.getStackTracesList())) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
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
    if (getStackTracesCount() > 0) {
      hash = (37 * hash) + STACK_TRACES_FIELD_NUMBER;
      hash = (53 * hash) + getStackTracesList().hashCode();
    }
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.Xss parseFrom(
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
  public static Builder newBuilder(com.google.cloud.websecurityscanner.v1alpha.Xss prototype) {
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
   * Information reported for an XSS.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.Xss}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.Xss)
      com.google.cloud.websecurityscanner.v1alpha.XssOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1alpha_Xss_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1alpha_Xss_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.Xss.class, com.google.cloud.websecurityscanner.v1alpha.Xss.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1alpha.Xss.newBuilder()
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
      stackTraces_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      errorMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1alpha_Xss_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.Xss getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.Xss.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.Xss build() {
      com.google.cloud.websecurityscanner.v1alpha.Xss result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.Xss buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.Xss result = new com.google.cloud.websecurityscanner.v1alpha.Xss(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.websecurityscanner.v1alpha.Xss result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        stackTraces_ = stackTraces_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stackTraces_ = stackTraces_;
    }

    private void buildPartial0(com.google.cloud.websecurityscanner.v1alpha.Xss result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorMessage_ = errorMessage_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.Xss) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1alpha.Xss)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1alpha.Xss other) {
      if (other == com.google.cloud.websecurityscanner.v1alpha.Xss.getDefaultInstance()) return this;
      if (!other.stackTraces_.isEmpty()) {
        if (stackTraces_.isEmpty()) {
          stackTraces_ = other.stackTraces_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStackTracesIsMutable();
          stackTraces_.addAll(other.stackTraces_);
        }
        onChanged();
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureStackTracesIsMutable();
              stackTraces_.add(s);
              break;
            } // case 10
            case 18: {
              errorMessage_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.LazyStringList stackTraces_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStackTracesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stackTraces_ = new com.google.protobuf.LazyStringArrayList(stackTraces_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @return A list containing the stackTraces.
     */
    public com.google.protobuf.ProtocolStringList
        getStackTracesList() {
      return stackTraces_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @return The count of stackTraces.
     */
    public int getStackTracesCount() {
      return stackTraces_.size();
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @param index The index of the element to return.
     * @return The stackTraces at the given index.
     */
    public java.lang.String getStackTraces(int index) {
      return stackTraces_.get(index);
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the stackTraces at the given index.
     */
    public com.google.protobuf.ByteString
        getStackTracesBytes(int index) {
      return stackTraces_.getByteString(index);
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @param index The index to set the value at.
     * @param value The stackTraces to set.
     * @return This builder for chaining.
     */
    public Builder setStackTraces(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureStackTracesIsMutable();
      stackTraces_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @param value The stackTraces to add.
     * @return This builder for chaining.
     */
    public Builder addStackTraces(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureStackTracesIsMutable();
      stackTraces_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @param values The stackTraces to add.
     * @return This builder for chaining.
     */
    public Builder addAllStackTraces(
        java.lang.Iterable<java.lang.String> values) {
      ensureStackTracesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stackTraces_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStackTraces() {
      stackTraces_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stack traces leading to the point where the XSS occurred.
     * </pre>
     *
     * <code>repeated string stack_traces = 1;</code>
     * @param value The bytes of the stackTraces to add.
     * @return This builder for chaining.
     */
    public Builder addStackTracesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureStackTracesIsMutable();
      stackTraces_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <pre>
     * An error message generated by a javascript breakage.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @return The errorMessage.
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An error message generated by a javascript breakage.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @return The bytes for errorMessage.
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An error message generated by a javascript breakage.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @param value The errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      errorMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An error message generated by a javascript breakage.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorMessage() {
      errorMessage_ = getDefaultInstance().getErrorMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An error message generated by a javascript breakage.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @param value The bytes for errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      errorMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.Xss)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.Xss)
  private static final com.google.cloud.websecurityscanner.v1alpha.Xss DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.Xss();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.Xss getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Xss>
      PARSER = new com.google.protobuf.AbstractParser<Xss>() {
    @java.lang.Override
    public Xss parsePartialFrom(
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

  public static com.google.protobuf.Parser<Xss> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Xss> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.Xss getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

