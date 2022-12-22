// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_level.proto

package com.google.identity.accesscontextmanager.v1;

/**
 * <pre>
 * `CustomLevel` is an `AccessLevel` using the Cloud Common Expression Language
 * to represent the necessary conditions for the level to apply to a request.
 * See CEL spec at: https://github.com/google/cel-spec
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.CustomLevel}
 */
public final class CustomLevel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.CustomLevel)
    CustomLevelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomLevel.newBuilder() to construct.
  private CustomLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomLevel() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomLevel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessLevelProto.internal_static_google_identity_accesscontextmanager_v1_CustomLevel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessLevelProto.internal_static_google_identity_accesscontextmanager_v1_CustomLevel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.CustomLevel.class, com.google.identity.accesscontextmanager.v1.CustomLevel.Builder.class);
  }

  public static final int EXPR_FIELD_NUMBER = 1;
  private com.google.type.Expr expr_;
  /**
   * <pre>
   * Required. A Cloud CEL expression evaluating to a boolean.
   * </pre>
   *
   * <code>.google.type.Expr expr = 1;</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return expr_ != null;
  }
  /**
   * <pre>
   * Required. A Cloud CEL expression evaluating to a boolean.
   * </pre>
   *
   * <code>.google.type.Expr expr = 1;</code>
   * @return The expr.
   */
  @java.lang.Override
  public com.google.type.Expr getExpr() {
    return expr_ == null ? com.google.type.Expr.getDefaultInstance() : expr_;
  }
  /**
   * <pre>
   * Required. A Cloud CEL expression evaluating to a boolean.
   * </pre>
   *
   * <code>.google.type.Expr expr = 1;</code>
   */
  @java.lang.Override
  public com.google.type.ExprOrBuilder getExprOrBuilder() {
    return expr_ == null ? com.google.type.Expr.getDefaultInstance() : expr_;
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
    if (expr_ != null) {
      output.writeMessage(1, getExpr());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (expr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExpr());
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.CustomLevel)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.CustomLevel other = (com.google.identity.accesscontextmanager.v1.CustomLevel) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
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
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.CustomLevel parseFrom(
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
  public static Builder newBuilder(com.google.identity.accesscontextmanager.v1.CustomLevel prototype) {
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
   * `CustomLevel` is an `AccessLevel` using the Cloud Common Expression Language
   * to represent the necessary conditions for the level to apply to a request.
   * See CEL spec at: https://github.com/google/cel-spec
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.CustomLevel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.CustomLevel)
      com.google.identity.accesscontextmanager.v1.CustomLevelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessLevelProto.internal_static_google_identity_accesscontextmanager_v1_CustomLevel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessLevelProto.internal_static_google_identity_accesscontextmanager_v1_CustomLevel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.CustomLevel.class, com.google.identity.accesscontextmanager.v1.CustomLevel.Builder.class);
    }

    // Construct using com.google.identity.accesscontextmanager.v1.CustomLevel.newBuilder()
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
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessLevelProto.internal_static_google_identity_accesscontextmanager_v1_CustomLevel_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CustomLevel getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.CustomLevel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CustomLevel build() {
      com.google.identity.accesscontextmanager.v1.CustomLevel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CustomLevel buildPartial() {
      com.google.identity.accesscontextmanager.v1.CustomLevel result = new com.google.identity.accesscontextmanager.v1.CustomLevel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.identity.accesscontextmanager.v1.CustomLevel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expr_ = exprBuilder_ == null
            ? expr_
            : exprBuilder_.build();
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.CustomLevel) {
        return mergeFrom((com.google.identity.accesscontextmanager.v1.CustomLevel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.identity.accesscontextmanager.v1.CustomLevel other) {
      if (other == com.google.identity.accesscontextmanager.v1.CustomLevel.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
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
                  getExprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.type.Expr expr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder> exprBuilder_;
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     * @return The expr.
     */
    public com.google.type.Expr getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? com.google.type.Expr.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    public Builder setExpr(com.google.type.Expr value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
      } else {
        exprBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    public Builder setExpr(
        com.google.type.Expr.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    public Builder mergeExpr(com.google.type.Expr value) {
      if (exprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          expr_ != null &&
          expr_ != com.google.type.Expr.getDefaultInstance()) {
          getExprBuilder().mergeFrom(value);
        } else {
          expr_ = value;
        }
      } else {
        exprBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    public Builder clearExpr() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    public com.google.type.Expr.Builder getExprBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    public com.google.type.ExprOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            com.google.type.Expr.getDefaultInstance() : expr_;
      }
    }
    /**
     * <pre>
     * Required. A Cloud CEL expression evaluating to a boolean.
     * </pre>
     *
     * <code>.google.type.Expr expr = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.CustomLevel)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.CustomLevel)
  private static final com.google.identity.accesscontextmanager.v1.CustomLevel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.CustomLevel();
  }

  public static com.google.identity.accesscontextmanager.v1.CustomLevel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomLevel>
      PARSER = new com.google.protobuf.AbstractParser<CustomLevel>() {
    @java.lang.Override
    public CustomLevel parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomLevel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomLevel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.CustomLevel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
