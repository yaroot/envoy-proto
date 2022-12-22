// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/integrations/v1alpha/value_type.proto

package com.google.cloud.integrations.v1alpha;

/**
 * <pre>
 * This message only contains a field of string array.
 * </pre>
 *
 * Protobuf type {@code google.cloud.integrations.v1alpha.StringParameterArray}
 */
public final class StringParameterArray extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.integrations.v1alpha.StringParameterArray)
    StringParameterArrayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StringParameterArray.newBuilder() to construct.
  private StringParameterArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StringParameterArray() {
    stringValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StringParameterArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.integrations.v1alpha.ValueTypeProto.internal_static_google_cloud_integrations_v1alpha_StringParameterArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.integrations.v1alpha.ValueTypeProto.internal_static_google_cloud_integrations_v1alpha_StringParameterArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.integrations.v1alpha.StringParameterArray.class, com.google.cloud.integrations.v1alpha.StringParameterArray.Builder.class);
  }

  public static final int STRING_VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList stringValues_;
  /**
   * <pre>
   * String array.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   * @return A list containing the stringValues.
   */
  public com.google.protobuf.ProtocolStringList
      getStringValuesList() {
    return stringValues_;
  }
  /**
   * <pre>
   * String array.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   * @return The count of stringValues.
   */
  public int getStringValuesCount() {
    return stringValues_.size();
  }
  /**
   * <pre>
   * String array.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   * @param index The index of the element to return.
   * @return The stringValues at the given index.
   */
  public java.lang.String getStringValues(int index) {
    return stringValues_.get(index);
  }
  /**
   * <pre>
   * String array.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the stringValues at the given index.
   */
  public com.google.protobuf.ByteString
      getStringValuesBytes(int index) {
    return stringValues_.getByteString(index);
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
    for (int i = 0; i < stringValues_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stringValues_.getRaw(i));
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
      for (int i = 0; i < stringValues_.size(); i++) {
        dataSize += computeStringSizeNoTag(stringValues_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStringValuesList().size();
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
    if (!(obj instanceof com.google.cloud.integrations.v1alpha.StringParameterArray)) {
      return super.equals(obj);
    }
    com.google.cloud.integrations.v1alpha.StringParameterArray other = (com.google.cloud.integrations.v1alpha.StringParameterArray) obj;

    if (!getStringValuesList()
        .equals(other.getStringValuesList())) return false;
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
    if (getStringValuesCount() > 0) {
      hash = (37 * hash) + STRING_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getStringValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.integrations.v1alpha.StringParameterArray parseFrom(
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
  public static Builder newBuilder(com.google.cloud.integrations.v1alpha.StringParameterArray prototype) {
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
   * This message only contains a field of string array.
   * </pre>
   *
   * Protobuf type {@code google.cloud.integrations.v1alpha.StringParameterArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.integrations.v1alpha.StringParameterArray)
      com.google.cloud.integrations.v1alpha.StringParameterArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.integrations.v1alpha.ValueTypeProto.internal_static_google_cloud_integrations_v1alpha_StringParameterArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.integrations.v1alpha.ValueTypeProto.internal_static_google_cloud_integrations_v1alpha_StringParameterArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.integrations.v1alpha.StringParameterArray.class, com.google.cloud.integrations.v1alpha.StringParameterArray.Builder.class);
    }

    // Construct using com.google.cloud.integrations.v1alpha.StringParameterArray.newBuilder()
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
      stringValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.integrations.v1alpha.ValueTypeProto.internal_static_google_cloud_integrations_v1alpha_StringParameterArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.integrations.v1alpha.StringParameterArray getDefaultInstanceForType() {
      return com.google.cloud.integrations.v1alpha.StringParameterArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.integrations.v1alpha.StringParameterArray build() {
      com.google.cloud.integrations.v1alpha.StringParameterArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.integrations.v1alpha.StringParameterArray buildPartial() {
      com.google.cloud.integrations.v1alpha.StringParameterArray result = new com.google.cloud.integrations.v1alpha.StringParameterArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.integrations.v1alpha.StringParameterArray result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        stringValues_ = stringValues_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stringValues_ = stringValues_;
    }

    private void buildPartial0(com.google.cloud.integrations.v1alpha.StringParameterArray result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.integrations.v1alpha.StringParameterArray) {
        return mergeFrom((com.google.cloud.integrations.v1alpha.StringParameterArray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.integrations.v1alpha.StringParameterArray other) {
      if (other == com.google.cloud.integrations.v1alpha.StringParameterArray.getDefaultInstance()) return this;
      if (!other.stringValues_.isEmpty()) {
        if (stringValues_.isEmpty()) {
          stringValues_ = other.stringValues_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStringValuesIsMutable();
          stringValues_.addAll(other.stringValues_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureStringValuesIsMutable();
              stringValues_.add(s);
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

    private com.google.protobuf.LazyStringList stringValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStringValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stringValues_ = new com.google.protobuf.LazyStringArrayList(stringValues_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @return A list containing the stringValues.
     */
    public com.google.protobuf.ProtocolStringList
        getStringValuesList() {
      return stringValues_.getUnmodifiableView();
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @return The count of stringValues.
     */
    public int getStringValuesCount() {
      return stringValues_.size();
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @param index The index of the element to return.
     * @return The stringValues at the given index.
     */
    public java.lang.String getStringValues(int index) {
      return stringValues_.get(index);
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the stringValues at the given index.
     */
    public com.google.protobuf.ByteString
        getStringValuesBytes(int index) {
      return stringValues_.getByteString(index);
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @param index The index to set the value at.
     * @param value The stringValues to set.
     * @return This builder for chaining.
     */
    public Builder setStringValues(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureStringValuesIsMutable();
      stringValues_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @param value The stringValues to add.
     * @return This builder for chaining.
     */
    public Builder addStringValues(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureStringValuesIsMutable();
      stringValues_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @param values The stringValues to add.
     * @return This builder for chaining.
     */
    public Builder addAllStringValues(
        java.lang.Iterable<java.lang.String> values) {
      ensureStringValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stringValues_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValues() {
      stringValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String array.
     * </pre>
     *
     * <code>repeated string string_values = 1;</code>
     * @param value The bytes of the stringValues to add.
     * @return This builder for chaining.
     */
    public Builder addStringValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureStringValuesIsMutable();
      stringValues_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.integrations.v1alpha.StringParameterArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.integrations.v1alpha.StringParameterArray)
  private static final com.google.cloud.integrations.v1alpha.StringParameterArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.integrations.v1alpha.StringParameterArray();
  }

  public static com.google.cloud.integrations.v1alpha.StringParameterArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringParameterArray>
      PARSER = new com.google.protobuf.AbstractParser<StringParameterArray>() {
    @java.lang.Override
    public StringParameterArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<StringParameterArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringParameterArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.integrations.v1alpha.StringParameterArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

