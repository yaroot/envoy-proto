// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/eval.proto

package com.google.api.expr.v1alpha1;

/**
 * <pre>
 * A set of expressions for which the value is unknown.
 * The unknowns included depend on the context. See `ExprValue.unknown`.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1alpha1.UnknownSet}
 */
public final class UnknownSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1alpha1.UnknownSet)
    UnknownSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnknownSet.newBuilder() to construct.
  private UnknownSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnknownSet() {
    exprs_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnknownSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.expr.v1alpha1.EvalProto.internal_static_google_api_expr_v1alpha1_UnknownSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.expr.v1alpha1.EvalProto.internal_static_google_api_expr_v1alpha1_UnknownSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.expr.v1alpha1.UnknownSet.class, com.google.api.expr.v1alpha1.UnknownSet.Builder.class);
  }

  public static final int EXPRS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList exprs_;
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1;</code>
   * @return A list containing the exprs.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getExprsList() {
    return exprs_;
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1;</code>
   * @return The count of exprs.
   */
  public int getExprsCount() {
    return exprs_.size();
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1;</code>
   * @param index The index of the element to return.
   * @return The exprs at the given index.
   */
  public long getExprs(int index) {
    return exprs_.getLong(index);
  }
  private int exprsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getExprsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(exprsMemoizedSerializedSize);
    }
    for (int i = 0; i < exprs_.size(); i++) {
      output.writeInt64NoTag(exprs_.getLong(i));
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
      for (int i = 0; i < exprs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(exprs_.getLong(i));
      }
      size += dataSize;
      if (!getExprsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      exprsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.api.expr.v1alpha1.UnknownSet)) {
      return super.equals(obj);
    }
    com.google.api.expr.v1alpha1.UnknownSet other = (com.google.api.expr.v1alpha1.UnknownSet) obj;

    if (!getExprsList()
        .equals(other.getExprsList())) return false;
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
    if (getExprsCount() > 0) {
      hash = (37 * hash) + EXPRS_FIELD_NUMBER;
      hash = (53 * hash) + getExprsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
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
  public static Builder newBuilder(com.google.api.expr.v1alpha1.UnknownSet prototype) {
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
   * A set of expressions for which the value is unknown.
   * The unknowns included depend on the context. See `ExprValue.unknown`.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1alpha1.UnknownSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1alpha1.UnknownSet)
      com.google.api.expr.v1alpha1.UnknownSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.expr.v1alpha1.EvalProto.internal_static_google_api_expr_v1alpha1_UnknownSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.expr.v1alpha1.EvalProto.internal_static_google_api_expr_v1alpha1_UnknownSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.expr.v1alpha1.UnknownSet.class, com.google.api.expr.v1alpha1.UnknownSet.Builder.class);
    }

    // Construct using com.google.api.expr.v1alpha1.UnknownSet.newBuilder()
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
      exprs_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.expr.v1alpha1.EvalProto.internal_static_google_api_expr_v1alpha1_UnknownSet_descriptor;
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.UnknownSet getDefaultInstanceForType() {
      return com.google.api.expr.v1alpha1.UnknownSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.UnknownSet build() {
      com.google.api.expr.v1alpha1.UnknownSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.UnknownSet buildPartial() {
      com.google.api.expr.v1alpha1.UnknownSet result = new com.google.api.expr.v1alpha1.UnknownSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.expr.v1alpha1.UnknownSet result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        exprs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.exprs_ = exprs_;
    }

    private void buildPartial0(com.google.api.expr.v1alpha1.UnknownSet result) {
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
      if (other instanceof com.google.api.expr.v1alpha1.UnknownSet) {
        return mergeFrom((com.google.api.expr.v1alpha1.UnknownSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.expr.v1alpha1.UnknownSet other) {
      if (other == com.google.api.expr.v1alpha1.UnknownSet.getDefaultInstance()) return this;
      if (!other.exprs_.isEmpty()) {
        if (exprs_.isEmpty()) {
          exprs_ = other.exprs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureExprsIsMutable();
          exprs_.addAll(other.exprs_);
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
            case 8: {
              long v = input.readInt64();
              ensureExprsIsMutable();
              exprs_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureExprsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                exprs_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList exprs_ = emptyLongList();
    private void ensureExprsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exprs_ = mutableCopy(exprs_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @return A list containing the exprs.
     */
    public java.util.List<java.lang.Long>
        getExprsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(exprs_) : exprs_;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @return The count of exprs.
     */
    public int getExprsCount() {
      return exprs_.size();
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @param index The index of the element to return.
     * @return The exprs at the given index.
     */
    public long getExprs(int index) {
      return exprs_.getLong(index);
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @param index The index to set the value at.
     * @param value The exprs to set.
     * @return This builder for chaining.
     */
    public Builder setExprs(
        int index, long value) {
      
      ensureExprsIsMutable();
      exprs_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @param value The exprs to add.
     * @return This builder for chaining.
     */
    public Builder addExprs(long value) {
      
      ensureExprsIsMutable();
      exprs_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @param values The exprs to add.
     * @return This builder for chaining.
     */
    public Builder addAllExprs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureExprsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, exprs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExprs() {
      exprs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:google.api.expr.v1alpha1.UnknownSet)
  }

  // @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.UnknownSet)
  private static final com.google.api.expr.v1alpha1.UnknownSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.expr.v1alpha1.UnknownSet();
  }

  public static com.google.api.expr.v1alpha1.UnknownSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnknownSet>
      PARSER = new com.google.protobuf.AbstractParser<UnknownSet>() {
    @java.lang.Override
    public UnknownSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnknownSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnknownSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.expr.v1alpha1.UnknownSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

