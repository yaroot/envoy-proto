// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/type/v3/cel.proto

package com.github.xds.type.v3;

/**
 * <pre>
 * Extracts a string by evaluating a `Common Expression Language
 * &lt;https://github.com/google/cel-spec&gt;`_ (CEL) expression against the standardized set of
 * :ref:`HTTP attributes &lt;arch_overview_attributes&gt;`.
 * .. attention::
 *   Besides CEL evaluation raising an error explicitly, CEL program returning a type other than
 *   the ``string``, or not returning anything, are considered an error as well.
 * [#comment:TODO(sergiitk): When implemented, add the extension tag.]
 * </pre>
 *
 * Protobuf type {@code xds.type.v3.CelExtractString}
 */
public final class CelExtractString extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xds.type.v3.CelExtractString)
    CelExtractStringOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CelExtractString.newBuilder() to construct.
  private CelExtractString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CelExtractString() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CelExtractString();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.xds.type.v3.CelProto.internal_static_xds_type_v3_CelExtractString_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.xds.type.v3.CelProto.internal_static_xds_type_v3_CelExtractString_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.xds.type.v3.CelExtractString.class, com.github.xds.type.v3.CelExtractString.Builder.class);
  }

  public static final int EXPR_EXTRACT_FIELD_NUMBER = 1;
  private com.github.xds.type.v3.CelExpression exprExtract_;
  /**
   * <pre>
   * The CEL expression used to extract a string from the CEL environment.
   * the "subject string") that should be replaced.
   * </pre>
   *
   * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the exprExtract field is set.
   */
  @java.lang.Override
  public boolean hasExprExtract() {
    return exprExtract_ != null;
  }
  /**
   * <pre>
   * The CEL expression used to extract a string from the CEL environment.
   * the "subject string") that should be replaced.
   * </pre>
   *
   * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
   * @return The exprExtract.
   */
  @java.lang.Override
  public com.github.xds.type.v3.CelExpression getExprExtract() {
    return exprExtract_ == null ? com.github.xds.type.v3.CelExpression.getDefaultInstance() : exprExtract_;
  }
  /**
   * <pre>
   * The CEL expression used to extract a string from the CEL environment.
   * the "subject string") that should be replaced.
   * </pre>
   *
   * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.github.xds.type.v3.CelExpressionOrBuilder getExprExtractOrBuilder() {
    return exprExtract_ == null ? com.github.xds.type.v3.CelExpression.getDefaultInstance() : exprExtract_;
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue defaultValue_;
  /**
   * <pre>
   * If CEL expression evaluates to an error, this value is be returned to the caller.
   * If not set, the error is propagated to the caller.
   * </pre>
   *
   * <code>.google.protobuf.StringValue default_value = 2;</code>
   * @return Whether the defaultValue field is set.
   */
  @java.lang.Override
  public boolean hasDefaultValue() {
    return defaultValue_ != null;
  }
  /**
   * <pre>
   * If CEL expression evaluates to an error, this value is be returned to the caller.
   * If not set, the error is propagated to the caller.
   * </pre>
   *
   * <code>.google.protobuf.StringValue default_value = 2;</code>
   * @return The defaultValue.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getDefaultValue() {
    return defaultValue_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : defaultValue_;
  }
  /**
   * <pre>
   * If CEL expression evaluates to an error, this value is be returned to the caller.
   * If not set, the error is propagated to the caller.
   * </pre>
   *
   * <code>.google.protobuf.StringValue default_value = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getDefaultValueOrBuilder() {
    return defaultValue_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : defaultValue_;
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
    if (exprExtract_ != null) {
      output.writeMessage(1, getExprExtract());
    }
    if (defaultValue_ != null) {
      output.writeMessage(2, getDefaultValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (exprExtract_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExprExtract());
    }
    if (defaultValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDefaultValue());
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
    if (!(obj instanceof com.github.xds.type.v3.CelExtractString)) {
      return super.equals(obj);
    }
    com.github.xds.type.v3.CelExtractString other = (com.github.xds.type.v3.CelExtractString) obj;

    if (hasExprExtract() != other.hasExprExtract()) return false;
    if (hasExprExtract()) {
      if (!getExprExtract()
          .equals(other.getExprExtract())) return false;
    }
    if (hasDefaultValue() != other.hasDefaultValue()) return false;
    if (hasDefaultValue()) {
      if (!getDefaultValue()
          .equals(other.getDefaultValue())) return false;
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
    if (hasExprExtract()) {
      hash = (37 * hash) + EXPR_EXTRACT_FIELD_NUMBER;
      hash = (53 * hash) + getExprExtract().hashCode();
    }
    if (hasDefaultValue()) {
      hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.xds.type.v3.CelExtractString parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.xds.type.v3.CelExtractString parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.xds.type.v3.CelExtractString parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.xds.type.v3.CelExtractString parseFrom(
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
  public static Builder newBuilder(com.github.xds.type.v3.CelExtractString prototype) {
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
   * Extracts a string by evaluating a `Common Expression Language
   * &lt;https://github.com/google/cel-spec&gt;`_ (CEL) expression against the standardized set of
   * :ref:`HTTP attributes &lt;arch_overview_attributes&gt;`.
   * .. attention::
   *   Besides CEL evaluation raising an error explicitly, CEL program returning a type other than
   *   the ``string``, or not returning anything, are considered an error as well.
   * [#comment:TODO(sergiitk): When implemented, add the extension tag.]
   * </pre>
   *
   * Protobuf type {@code xds.type.v3.CelExtractString}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xds.type.v3.CelExtractString)
      com.github.xds.type.v3.CelExtractStringOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.xds.type.v3.CelProto.internal_static_xds_type_v3_CelExtractString_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.xds.type.v3.CelProto.internal_static_xds_type_v3_CelExtractString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.xds.type.v3.CelExtractString.class, com.github.xds.type.v3.CelExtractString.Builder.class);
    }

    // Construct using com.github.xds.type.v3.CelExtractString.newBuilder()
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
      exprExtract_ = null;
      if (exprExtractBuilder_ != null) {
        exprExtractBuilder_.dispose();
        exprExtractBuilder_ = null;
      }
      defaultValue_ = null;
      if (defaultValueBuilder_ != null) {
        defaultValueBuilder_.dispose();
        defaultValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.xds.type.v3.CelProto.internal_static_xds_type_v3_CelExtractString_descriptor;
    }

    @java.lang.Override
    public com.github.xds.type.v3.CelExtractString getDefaultInstanceForType() {
      return com.github.xds.type.v3.CelExtractString.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.xds.type.v3.CelExtractString build() {
      com.github.xds.type.v3.CelExtractString result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.xds.type.v3.CelExtractString buildPartial() {
      com.github.xds.type.v3.CelExtractString result = new com.github.xds.type.v3.CelExtractString(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.xds.type.v3.CelExtractString result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exprExtract_ = exprExtractBuilder_ == null
            ? exprExtract_
            : exprExtractBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.defaultValue_ = defaultValueBuilder_ == null
            ? defaultValue_
            : defaultValueBuilder_.build();
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
      if (other instanceof com.github.xds.type.v3.CelExtractString) {
        return mergeFrom((com.github.xds.type.v3.CelExtractString)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.xds.type.v3.CelExtractString other) {
      if (other == com.github.xds.type.v3.CelExtractString.getDefaultInstance()) return this;
      if (other.hasExprExtract()) {
        mergeExprExtract(other.getExprExtract());
      }
      if (other.hasDefaultValue()) {
        mergeDefaultValue(other.getDefaultValue());
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
                  getExprExtractFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDefaultValueFieldBuilder().getBuilder(),
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

    private com.github.xds.type.v3.CelExpression exprExtract_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.xds.type.v3.CelExpression, com.github.xds.type.v3.CelExpression.Builder, com.github.xds.type.v3.CelExpressionOrBuilder> exprExtractBuilder_;
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the exprExtract field is set.
     */
    public boolean hasExprExtract() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     * @return The exprExtract.
     */
    public com.github.xds.type.v3.CelExpression getExprExtract() {
      if (exprExtractBuilder_ == null) {
        return exprExtract_ == null ? com.github.xds.type.v3.CelExpression.getDefaultInstance() : exprExtract_;
      } else {
        return exprExtractBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setExprExtract(com.github.xds.type.v3.CelExpression value) {
      if (exprExtractBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exprExtract_ = value;
      } else {
        exprExtractBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setExprExtract(
        com.github.xds.type.v3.CelExpression.Builder builderForValue) {
      if (exprExtractBuilder_ == null) {
        exprExtract_ = builderForValue.build();
      } else {
        exprExtractBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeExprExtract(com.github.xds.type.v3.CelExpression value) {
      if (exprExtractBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          exprExtract_ != null &&
          exprExtract_ != com.github.xds.type.v3.CelExpression.getDefaultInstance()) {
          getExprExtractBuilder().mergeFrom(value);
        } else {
          exprExtract_ = value;
        }
      } else {
        exprExtractBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearExprExtract() {
      bitField0_ = (bitField0_ & ~0x00000001);
      exprExtract_ = null;
      if (exprExtractBuilder_ != null) {
        exprExtractBuilder_.dispose();
        exprExtractBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.v3.CelExpression.Builder getExprExtractBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExprExtractFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.v3.CelExpressionOrBuilder getExprExtractOrBuilder() {
      if (exprExtractBuilder_ != null) {
        return exprExtractBuilder_.getMessageOrBuilder();
      } else {
        return exprExtract_ == null ?
            com.github.xds.type.v3.CelExpression.getDefaultInstance() : exprExtract_;
      }
    }
    /**
     * <pre>
     * The CEL expression used to extract a string from the CEL environment.
     * the "subject string") that should be replaced.
     * </pre>
     *
     * <code>.xds.type.v3.CelExpression expr_extract = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.xds.type.v3.CelExpression, com.github.xds.type.v3.CelExpression.Builder, com.github.xds.type.v3.CelExpressionOrBuilder> 
        getExprExtractFieldBuilder() {
      if (exprExtractBuilder_ == null) {
        exprExtractBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.xds.type.v3.CelExpression, com.github.xds.type.v3.CelExpression.Builder, com.github.xds.type.v3.CelExpressionOrBuilder>(
                getExprExtract(),
                getParentForChildren(),
                isClean());
        exprExtract_ = null;
      }
      return exprExtractBuilder_;
    }

    private com.google.protobuf.StringValue defaultValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> defaultValueBuilder_;
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     * @return Whether the defaultValue field is set.
     */
    public boolean hasDefaultValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     * @return The defaultValue.
     */
    public com.google.protobuf.StringValue getDefaultValue() {
      if (defaultValueBuilder_ == null) {
        return defaultValue_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : defaultValue_;
      } else {
        return defaultValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    public Builder setDefaultValue(com.google.protobuf.StringValue value) {
      if (defaultValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultValue_ = value;
      } else {
        defaultValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    public Builder setDefaultValue(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = builderForValue.build();
      } else {
        defaultValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    public Builder mergeDefaultValue(com.google.protobuf.StringValue value) {
      if (defaultValueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          defaultValue_ != null &&
          defaultValue_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getDefaultValueBuilder().mergeFrom(value);
        } else {
          defaultValue_ = value;
        }
      } else {
        defaultValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    public Builder clearDefaultValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      defaultValue_ = null;
      if (defaultValueBuilder_ != null) {
        defaultValueBuilder_.dispose();
        defaultValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getDefaultValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDefaultValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDefaultValueOrBuilder() {
      if (defaultValueBuilder_ != null) {
        return defaultValueBuilder_.getMessageOrBuilder();
      } else {
        return defaultValue_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : defaultValue_;
      }
    }
    /**
     * <pre>
     * If CEL expression evaluates to an error, this value is be returned to the caller.
     * If not set, the error is propagated to the caller.
     * </pre>
     *
     * <code>.google.protobuf.StringValue default_value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDefaultValueFieldBuilder() {
      if (defaultValueBuilder_ == null) {
        defaultValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDefaultValue(),
                getParentForChildren(),
                isClean());
        defaultValue_ = null;
      }
      return defaultValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xds.type.v3.CelExtractString)
  }

  // @@protoc_insertion_point(class_scope:xds.type.v3.CelExtractString)
  private static final com.github.xds.type.v3.CelExtractString DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.xds.type.v3.CelExtractString();
  }

  public static com.github.xds.type.v3.CelExtractString getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CelExtractString>
      PARSER = new com.google.protobuf.AbstractParser<CelExtractString>() {
    @java.lang.Override
    public CelExtractString parsePartialFrom(
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

  public static com.google.protobuf.Parser<CelExtractString> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CelExtractString> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.xds.type.v3.CelExtractString getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
