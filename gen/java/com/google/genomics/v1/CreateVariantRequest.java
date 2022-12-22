// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.CreateVariantRequest}
 */
public final class CreateVariantRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.CreateVariantRequest)
    CreateVariantRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateVariantRequest.newBuilder() to construct.
  private CreateVariantRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVariantRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateVariantRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CreateVariantRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CreateVariantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.CreateVariantRequest.class, com.google.genomics.v1.CreateVariantRequest.Builder.class);
  }

  public static final int VARIANT_FIELD_NUMBER = 1;
  private com.google.genomics.v1.Variant variant_;
  /**
   * <pre>
   * The variant to be created.
   * </pre>
   *
   * <code>.google.genomics.v1.Variant variant = 1;</code>
   * @return Whether the variant field is set.
   */
  @java.lang.Override
  public boolean hasVariant() {
    return variant_ != null;
  }
  /**
   * <pre>
   * The variant to be created.
   * </pre>
   *
   * <code>.google.genomics.v1.Variant variant = 1;</code>
   * @return The variant.
   */
  @java.lang.Override
  public com.google.genomics.v1.Variant getVariant() {
    return variant_ == null ? com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
  }
  /**
   * <pre>
   * The variant to be created.
   * </pre>
   *
   * <code>.google.genomics.v1.Variant variant = 1;</code>
   */
  @java.lang.Override
  public com.google.genomics.v1.VariantOrBuilder getVariantOrBuilder() {
    return variant_ == null ? com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
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
    if (variant_ != null) {
      output.writeMessage(1, getVariant());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (variant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVariant());
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
    if (!(obj instanceof com.google.genomics.v1.CreateVariantRequest)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.CreateVariantRequest other = (com.google.genomics.v1.CreateVariantRequest) obj;

    if (hasVariant() != other.hasVariant()) return false;
    if (hasVariant()) {
      if (!getVariant()
          .equals(other.getVariant())) return false;
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
    if (hasVariant()) {
      hash = (37 * hash) + VARIANT_FIELD_NUMBER;
      hash = (53 * hash) + getVariant().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CreateVariantRequest parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.CreateVariantRequest prototype) {
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
   * Protobuf type {@code google.genomics.v1.CreateVariantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.CreateVariantRequest)
      com.google.genomics.v1.CreateVariantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CreateVariantRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CreateVariantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.CreateVariantRequest.class, com.google.genomics.v1.CreateVariantRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.CreateVariantRequest.newBuilder()
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
      variant_ = null;
      if (variantBuilder_ != null) {
        variantBuilder_.dispose();
        variantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CreateVariantRequest_descriptor;
    }

    @java.lang.Override
    public com.google.genomics.v1.CreateVariantRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.CreateVariantRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.genomics.v1.CreateVariantRequest build() {
      com.google.genomics.v1.CreateVariantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.genomics.v1.CreateVariantRequest buildPartial() {
      com.google.genomics.v1.CreateVariantRequest result = new com.google.genomics.v1.CreateVariantRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.genomics.v1.CreateVariantRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.variant_ = variantBuilder_ == null
            ? variant_
            : variantBuilder_.build();
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
      if (other instanceof com.google.genomics.v1.CreateVariantRequest) {
        return mergeFrom((com.google.genomics.v1.CreateVariantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.CreateVariantRequest other) {
      if (other == com.google.genomics.v1.CreateVariantRequest.getDefaultInstance()) return this;
      if (other.hasVariant()) {
        mergeVariant(other.getVariant());
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
                  getVariantFieldBuilder().getBuilder(),
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

    private com.google.genomics.v1.Variant variant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> variantBuilder_;
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     * @return Whether the variant field is set.
     */
    public boolean hasVariant() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     * @return The variant.
     */
    public com.google.genomics.v1.Variant getVariant() {
      if (variantBuilder_ == null) {
        return variant_ == null ? com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
      } else {
        return variantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    public Builder setVariant(com.google.genomics.v1.Variant value) {
      if (variantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        variant_ = value;
      } else {
        variantBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    public Builder setVariant(
        com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantBuilder_ == null) {
        variant_ = builderForValue.build();
      } else {
        variantBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    public Builder mergeVariant(com.google.genomics.v1.Variant value) {
      if (variantBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          variant_ != null &&
          variant_ != com.google.genomics.v1.Variant.getDefaultInstance()) {
          getVariantBuilder().mergeFrom(value);
        } else {
          variant_ = value;
        }
      } else {
        variantBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    public Builder clearVariant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      variant_ = null;
      if (variantBuilder_ != null) {
        variantBuilder_.dispose();
        variantBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    public com.google.genomics.v1.Variant.Builder getVariantBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVariantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    public com.google.genomics.v1.VariantOrBuilder getVariantOrBuilder() {
      if (variantBuilder_ != null) {
        return variantBuilder_.getMessageOrBuilder();
      } else {
        return variant_ == null ?
            com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
      }
    }
    /**
     * <pre>
     * The variant to be created.
     * </pre>
     *
     * <code>.google.genomics.v1.Variant variant = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> 
        getVariantFieldBuilder() {
      if (variantBuilder_ == null) {
        variantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder>(
                getVariant(),
                getParentForChildren(),
                isClean());
        variant_ = null;
      }
      return variantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.CreateVariantRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.CreateVariantRequest)
  private static final com.google.genomics.v1.CreateVariantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.CreateVariantRequest();
  }

  public static com.google.genomics.v1.CreateVariantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVariantRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateVariantRequest>() {
    @java.lang.Override
    public CreateVariantRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateVariantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVariantRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.genomics.v1.CreateVariantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
