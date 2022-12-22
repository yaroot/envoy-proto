// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

package com.google.cloud.websecurityscanner.v1;

/**
 * <pre>
 * ! Information about a vulnerability with an HTML.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1.Form}
 */
public final class Form extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1.Form)
    FormOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Form.newBuilder() to construct.
  private Form(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Form() {
    actionUri_ = "";
    fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Form();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Form_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Form_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1.Form.class, com.google.cloud.websecurityscanner.v1.Form.Builder.class);
  }

  public static final int ACTION_URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object actionUri_ = "";
  /**
   * <pre>
   * ! The URI where to send the form when it's submitted.
   * </pre>
   *
   * <code>string action_uri = 1;</code>
   * @return The actionUri.
   */
  @java.lang.Override
  public java.lang.String getActionUri() {
    java.lang.Object ref = actionUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ! The URI where to send the form when it's submitted.
   * </pre>
   *
   * <code>string action_uri = 1;</code>
   * @return The bytes for actionUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionUriBytes() {
    java.lang.Object ref = actionUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList fields_;
  /**
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @return A list containing the fields.
   */
  public com.google.protobuf.ProtocolStringList
      getFieldsList() {
    return fields_;
  }
  /**
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @return The count of fields.
   */
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  public java.lang.String getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fields at the given index.
   */
  public com.google.protobuf.ByteString
      getFieldsBytes(int index) {
    return fields_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionUri_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fields_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, actionUri_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fields_.size(); i++) {
        dataSize += computeStringSizeNoTag(fields_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldsList().size();
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1.Form)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1.Form other = (com.google.cloud.websecurityscanner.v1.Form) obj;

    if (!getActionUri()
        .equals(other.getActionUri())) return false;
    if (!getFieldsList()
        .equals(other.getFieldsList())) return false;
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
    hash = (37 * hash) + ACTION_URI_FIELD_NUMBER;
    hash = (53 * hash) + getActionUri().hashCode();
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1.Form parseFrom(
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
  public static Builder newBuilder(com.google.cloud.websecurityscanner.v1.Form prototype) {
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
   * ! Information about a vulnerability with an HTML.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1.Form}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1.Form)
      com.google.cloud.websecurityscanner.v1.FormOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Form_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Form_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1.Form.class, com.google.cloud.websecurityscanner.v1.Form.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1.Form.newBuilder()
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
      actionUri_ = "";
      fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Form_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Form getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1.Form.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Form build() {
      com.google.cloud.websecurityscanner.v1.Form result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Form buildPartial() {
      com.google.cloud.websecurityscanner.v1.Form result = new com.google.cloud.websecurityscanner.v1.Form(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.websecurityscanner.v1.Form result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        fields_ = fields_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.fields_ = fields_;
    }

    private void buildPartial0(com.google.cloud.websecurityscanner.v1.Form result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.actionUri_ = actionUri_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1.Form) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1.Form)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1.Form other) {
      if (other == com.google.cloud.websecurityscanner.v1.Form.getDefaultInstance()) return this;
      if (!other.getActionUri().isEmpty()) {
        actionUri_ = other.actionUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.fields_.isEmpty()) {
        if (fields_.isEmpty()) {
          fields_ = other.fields_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFieldsIsMutable();
          fields_.addAll(other.fields_);
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
            case 10: {
              actionUri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureFieldsIsMutable();
              fields_.add(s);
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

    private java.lang.Object actionUri_ = "";
    /**
     * <pre>
     * ! The URI where to send the form when it's submitted.
     * </pre>
     *
     * <code>string action_uri = 1;</code>
     * @return The actionUri.
     */
    public java.lang.String getActionUri() {
      java.lang.Object ref = actionUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ! The URI where to send the form when it's submitted.
     * </pre>
     *
     * <code>string action_uri = 1;</code>
     * @return The bytes for actionUri.
     */
    public com.google.protobuf.ByteString
        getActionUriBytes() {
      java.lang.Object ref = actionUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ! The URI where to send the form when it's submitted.
     * </pre>
     *
     * <code>string action_uri = 1;</code>
     * @param value The actionUri to set.
     * @return This builder for chaining.
     */
    public Builder setActionUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      actionUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ! The URI where to send the form when it's submitted.
     * </pre>
     *
     * <code>string action_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionUri() {
      actionUri_ = getDefaultInstance().getActionUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ! The URI where to send the form when it's submitted.
     * </pre>
     *
     * <code>string action_uri = 1;</code>
     * @param value The bytes for actionUri to set.
     * @return This builder for chaining.
     */
    public Builder setActionUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      actionUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fields_ = new com.google.protobuf.LazyStringArrayList(fields_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @return A list containing the fields.
     */
    public com.google.protobuf.ProtocolStringList
        getFieldsList() {
      return fields_.getUnmodifiableView();
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @return The count of fields.
     */
    public int getFieldsCount() {
      return fields_.size();
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @param index The index of the element to return.
     * @return The fields at the given index.
     */
    public java.lang.String getFields(int index) {
      return fields_.get(index);
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the fields at the given index.
     */
    public com.google.protobuf.ByteString
        getFieldsBytes(int index) {
      return fields_.getByteString(index);
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @param index The index to set the value at.
     * @param value The fields to set.
     * @return This builder for chaining.
     */
    public Builder setFields(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldsIsMutable();
      fields_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @param value The fields to add.
     * @return This builder for chaining.
     */
    public Builder addFields(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldsIsMutable();
      fields_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @param values The fields to add.
     * @return This builder for chaining.
     */
    public Builder addAllFields(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fields_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFields() {
      fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ! The names of form fields related to the vulnerability.
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     * @param value The bytes of the fields to add.
     * @return This builder for chaining.
     */
    public Builder addFieldsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFieldsIsMutable();
      fields_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1.Form)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.Form)
  private static final com.google.cloud.websecurityscanner.v1.Form DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1.Form();
  }

  public static com.google.cloud.websecurityscanner.v1.Form getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Form>
      PARSER = new com.google.protobuf.AbstractParser<Form>() {
    @java.lang.Override
    public Form parsePartialFrom(
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

  public static com.google.protobuf.Parser<Form> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Form> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1.Form getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

