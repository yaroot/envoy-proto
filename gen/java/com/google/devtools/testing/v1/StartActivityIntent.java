// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

/**
 * <pre>
 * A starting intent specified by an action, uri, and categories.
 * </pre>
 *
 * Protobuf type {@code google.devtools.testing.v1.StartActivityIntent}
 */
public final class StartActivityIntent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.testing.v1.StartActivityIntent)
    StartActivityIntentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartActivityIntent.newBuilder() to construct.
  private StartActivityIntent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartActivityIntent() {
    action_ = "";
    uri_ = "";
    categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartActivityIntent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_StartActivityIntent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_StartActivityIntent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.testing.v1.StartActivityIntent.class, com.google.devtools.testing.v1.StartActivityIntent.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object action_ = "";
  /**
   * <pre>
   * Action name.
   * Required for START_ACTIVITY.
   * </pre>
   *
   * <code>string action = 2;</code>
   * @return The action.
   */
  @java.lang.Override
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Action name.
   * Required for START_ACTIVITY.
   * </pre>
   *
   * <code>string action = 2;</code>
   * @return The bytes for action.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * URI for the action.
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URI for the action.
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORIES_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList categories_;
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @return A list containing the categories.
   */
  public com.google.protobuf.ProtocolStringList
      getCategoriesList() {
    return categories_;
  }
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @return The count of categories.
   */
  public int getCategoriesCount() {
    return categories_.size();
  }
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @param index The index of the element to return.
   * @return The categories at the given index.
   */
  public java.lang.String getCategories(int index) {
    return categories_.get(index);
  }
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the categories at the given index.
   */
  public com.google.protobuf.ByteString
      getCategoriesBytes(int index) {
    return categories_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    for (int i = 0; i < categories_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, categories_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < categories_.size(); i++) {
        dataSize += computeStringSizeNoTag(categories_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCategoriesList().size();
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
    if (!(obj instanceof com.google.devtools.testing.v1.StartActivityIntent)) {
      return super.equals(obj);
    }
    com.google.devtools.testing.v1.StartActivityIntent other = (com.google.devtools.testing.v1.StartActivityIntent) obj;

    if (!getAction()
        .equals(other.getAction())) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
    if (!getCategoriesList()
        .equals(other.getCategoriesList())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (getCategoriesCount() > 0) {
      hash = (37 * hash) + CATEGORIES_FIELD_NUMBER;
      hash = (53 * hash) + getCategoriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.StartActivityIntent parseFrom(
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
  public static Builder newBuilder(com.google.devtools.testing.v1.StartActivityIntent prototype) {
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
   * A starting intent specified by an action, uri, and categories.
   * </pre>
   *
   * Protobuf type {@code google.devtools.testing.v1.StartActivityIntent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.testing.v1.StartActivityIntent)
      com.google.devtools.testing.v1.StartActivityIntentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_StartActivityIntent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_StartActivityIntent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.testing.v1.StartActivityIntent.class, com.google.devtools.testing.v1.StartActivityIntent.Builder.class);
    }

    // Construct using com.google.devtools.testing.v1.StartActivityIntent.newBuilder()
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
      action_ = "";
      uri_ = "";
      categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_StartActivityIntent_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.StartActivityIntent getDefaultInstanceForType() {
      return com.google.devtools.testing.v1.StartActivityIntent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.StartActivityIntent build() {
      com.google.devtools.testing.v1.StartActivityIntent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.StartActivityIntent buildPartial() {
      com.google.devtools.testing.v1.StartActivityIntent result = new com.google.devtools.testing.v1.StartActivityIntent(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.devtools.testing.v1.StartActivityIntent result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        categories_ = categories_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.categories_ = categories_;
    }

    private void buildPartial0(com.google.devtools.testing.v1.StartActivityIntent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.uri_ = uri_;
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
      if (other instanceof com.google.devtools.testing.v1.StartActivityIntent) {
        return mergeFrom((com.google.devtools.testing.v1.StartActivityIntent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.testing.v1.StartActivityIntent other) {
      if (other == com.google.devtools.testing.v1.StartActivityIntent.getDefaultInstance()) return this;
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.categories_.isEmpty()) {
        if (categories_.isEmpty()) {
          categories_ = other.categories_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureCategoriesIsMutable();
          categories_.addAll(other.categories_);
        }
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
            case 18: {
              action_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureCategoriesIsMutable();
              categories_.add(s);
              break;
            } // case 34
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

    private java.lang.Object action_ = "";
    /**
     * <pre>
     * Action name.
     * Required for START_ACTIVITY.
     * </pre>
     *
     * <code>string action = 2;</code>
     * @return The action.
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Action name.
     * Required for START_ACTIVITY.
     * </pre>
     *
     * <code>string action = 2;</code>
     * @return The bytes for action.
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Action name.
     * Required for START_ACTIVITY.
     * </pre>
     *
     * <code>string action = 2;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action name.
     * Required for START_ACTIVITY.
     * </pre>
     *
     * <code>string action = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      action_ = getDefaultInstance().getAction();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action name.
     * Required for START_ACTIVITY.
     * </pre>
     *
     * <code>string action = 2;</code>
     * @param value The bytes for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * URI for the action.
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URI for the action.
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URI for the action.
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI for the action.
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI for the action.
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCategoriesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        categories_ = new com.google.protobuf.LazyStringArrayList(categories_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @return A list containing the categories.
     */
    public com.google.protobuf.ProtocolStringList
        getCategoriesList() {
      return categories_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @return The count of categories.
     */
    public int getCategoriesCount() {
      return categories_.size();
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @param index The index of the element to return.
     * @return The categories at the given index.
     */
    public java.lang.String getCategories(int index) {
      return categories_.get(index);
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the categories at the given index.
     */
    public com.google.protobuf.ByteString
        getCategoriesBytes(int index) {
      return categories_.getByteString(index);
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @param index The index to set the value at.
     * @param value The categories to set.
     * @return This builder for chaining.
     */
    public Builder setCategories(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCategoriesIsMutable();
      categories_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @param value The categories to add.
     * @return This builder for chaining.
     */
    public Builder addCategories(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCategoriesIsMutable();
      categories_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @param values The categories to add.
     * @return This builder for chaining.
     */
    public Builder addAllCategories(
        java.lang.Iterable<java.lang.String> values) {
      ensureCategoriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, categories_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategories() {
      categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Intent categories to set on the intent.
     * </pre>
     *
     * <code>repeated string categories = 4;</code>
     * @param value The bytes of the categories to add.
     * @return This builder for chaining.
     */
    public Builder addCategoriesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureCategoriesIsMutable();
      categories_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.devtools.testing.v1.StartActivityIntent)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.testing.v1.StartActivityIntent)
  private static final com.google.devtools.testing.v1.StartActivityIntent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.testing.v1.StartActivityIntent();
  }

  public static com.google.devtools.testing.v1.StartActivityIntent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartActivityIntent>
      PARSER = new com.google.protobuf.AbstractParser<StartActivityIntent>() {
    @java.lang.Override
    public StartActivityIntent parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartActivityIntent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartActivityIntent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.testing.v1.StartActivityIntent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

