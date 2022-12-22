// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/repricing.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Represents the various repricing conditions you can use for a conditional
 * override.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.RepricingCondition}
 */
public final class RepricingCondition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.RepricingCondition)
    RepricingConditionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepricingCondition.newBuilder() to construct.
  private RepricingCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepricingCondition() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepricingCondition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.RepricingProto.internal_static_google_cloud_channel_v1_RepricingCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.RepricingProto.internal_static_google_cloud_channel_v1_RepricingCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.RepricingCondition.class, com.google.cloud.channel.v1.RepricingCondition.Builder.class);
  }

  private int conditionCase_ = 0;
  private java.lang.Object condition_;
  public enum ConditionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SKU_GROUP_CONDITION(1),
    CONDITION_NOT_SET(0);
    private final int value;
    private ConditionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConditionCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConditionCase forNumber(int value) {
      switch (value) {
        case 1: return SKU_GROUP_CONDITION;
        case 0: return CONDITION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConditionCase
  getConditionCase() {
    return ConditionCase.forNumber(
        conditionCase_);
  }

  public static final int SKU_GROUP_CONDITION_FIELD_NUMBER = 1;
  /**
   * <pre>
   * SKU Group condition for override.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
   * @return Whether the skuGroupCondition field is set.
   */
  @java.lang.Override
  public boolean hasSkuGroupCondition() {
    return conditionCase_ == 1;
  }
  /**
   * <pre>
   * SKU Group condition for override.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
   * @return The skuGroupCondition.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuGroupCondition getSkuGroupCondition() {
    if (conditionCase_ == 1) {
       return (com.google.cloud.channel.v1.SkuGroupCondition) condition_;
    }
    return com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
  }
  /**
   * <pre>
   * SKU Group condition for override.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuGroupConditionOrBuilder getSkuGroupConditionOrBuilder() {
    if (conditionCase_ == 1) {
       return (com.google.cloud.channel.v1.SkuGroupCondition) condition_;
    }
    return com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
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
    if (conditionCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.channel.v1.SkuGroupCondition) condition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conditionCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.channel.v1.SkuGroupCondition) condition_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.RepricingCondition)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.RepricingCondition other = (com.google.cloud.channel.v1.RepricingCondition) obj;

    if (!getConditionCase().equals(other.getConditionCase())) return false;
    switch (conditionCase_) {
      case 1:
        if (!getSkuGroupCondition()
            .equals(other.getSkuGroupCondition())) return false;
        break;
      case 0:
      default:
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
    switch (conditionCase_) {
      case 1:
        hash = (37 * hash) + SKU_GROUP_CONDITION_FIELD_NUMBER;
        hash = (53 * hash) + getSkuGroupCondition().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.RepricingCondition parseFrom(
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
  public static Builder newBuilder(com.google.cloud.channel.v1.RepricingCondition prototype) {
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
   * Represents the various repricing conditions you can use for a conditional
   * override.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.RepricingCondition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.RepricingCondition)
      com.google.cloud.channel.v1.RepricingConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.RepricingProto.internal_static_google_cloud_channel_v1_RepricingCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.RepricingProto.internal_static_google_cloud_channel_v1_RepricingCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.RepricingCondition.class, com.google.cloud.channel.v1.RepricingCondition.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.RepricingCondition.newBuilder()
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
      if (skuGroupConditionBuilder_ != null) {
        skuGroupConditionBuilder_.clear();
      }
      conditionCase_ = 0;
      condition_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.RepricingProto.internal_static_google_cloud_channel_v1_RepricingCondition_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.RepricingCondition getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.RepricingCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.RepricingCondition build() {
      com.google.cloud.channel.v1.RepricingCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.RepricingCondition buildPartial() {
      com.google.cloud.channel.v1.RepricingCondition result = new com.google.cloud.channel.v1.RepricingCondition(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.RepricingCondition result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.channel.v1.RepricingCondition result) {
      result.conditionCase_ = conditionCase_;
      result.condition_ = this.condition_;
      if (conditionCase_ == 1 &&
          skuGroupConditionBuilder_ != null) {
        result.condition_ = skuGroupConditionBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.RepricingCondition) {
        return mergeFrom((com.google.cloud.channel.v1.RepricingCondition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.RepricingCondition other) {
      if (other == com.google.cloud.channel.v1.RepricingCondition.getDefaultInstance()) return this;
      switch (other.getConditionCase()) {
        case SKU_GROUP_CONDITION: {
          mergeSkuGroupCondition(other.getSkuGroupCondition());
          break;
        }
        case CONDITION_NOT_SET: {
          break;
        }
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
                  getSkuGroupConditionFieldBuilder().getBuilder(),
                  extensionRegistry);
              conditionCase_ = 1;
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
    private int conditionCase_ = 0;
    private java.lang.Object condition_;
    public ConditionCase
        getConditionCase() {
      return ConditionCase.forNumber(
          conditionCase_);
    }

    public Builder clearCondition() {
      conditionCase_ = 0;
      condition_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.SkuGroupCondition, com.google.cloud.channel.v1.SkuGroupCondition.Builder, com.google.cloud.channel.v1.SkuGroupConditionOrBuilder> skuGroupConditionBuilder_;
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     * @return Whether the skuGroupCondition field is set.
     */
    @java.lang.Override
    public boolean hasSkuGroupCondition() {
      return conditionCase_ == 1;
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     * @return The skuGroupCondition.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.SkuGroupCondition getSkuGroupCondition() {
      if (skuGroupConditionBuilder_ == null) {
        if (conditionCase_ == 1) {
          return (com.google.cloud.channel.v1.SkuGroupCondition) condition_;
        }
        return com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
      } else {
        if (conditionCase_ == 1) {
          return skuGroupConditionBuilder_.getMessage();
        }
        return com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    public Builder setSkuGroupCondition(com.google.cloud.channel.v1.SkuGroupCondition value) {
      if (skuGroupConditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        condition_ = value;
        onChanged();
      } else {
        skuGroupConditionBuilder_.setMessage(value);
      }
      conditionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    public Builder setSkuGroupCondition(
        com.google.cloud.channel.v1.SkuGroupCondition.Builder builderForValue) {
      if (skuGroupConditionBuilder_ == null) {
        condition_ = builderForValue.build();
        onChanged();
      } else {
        skuGroupConditionBuilder_.setMessage(builderForValue.build());
      }
      conditionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    public Builder mergeSkuGroupCondition(com.google.cloud.channel.v1.SkuGroupCondition value) {
      if (skuGroupConditionBuilder_ == null) {
        if (conditionCase_ == 1 &&
            condition_ != com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance()) {
          condition_ = com.google.cloud.channel.v1.SkuGroupCondition.newBuilder((com.google.cloud.channel.v1.SkuGroupCondition) condition_)
              .mergeFrom(value).buildPartial();
        } else {
          condition_ = value;
        }
        onChanged();
      } else {
        if (conditionCase_ == 1) {
          skuGroupConditionBuilder_.mergeFrom(value);
        } else {
          skuGroupConditionBuilder_.setMessage(value);
        }
      }
      conditionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    public Builder clearSkuGroupCondition() {
      if (skuGroupConditionBuilder_ == null) {
        if (conditionCase_ == 1) {
          conditionCase_ = 0;
          condition_ = null;
          onChanged();
        }
      } else {
        if (conditionCase_ == 1) {
          conditionCase_ = 0;
          condition_ = null;
        }
        skuGroupConditionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuGroupCondition.Builder getSkuGroupConditionBuilder() {
      return getSkuGroupConditionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.SkuGroupConditionOrBuilder getSkuGroupConditionOrBuilder() {
      if ((conditionCase_ == 1) && (skuGroupConditionBuilder_ != null)) {
        return skuGroupConditionBuilder_.getMessageOrBuilder();
      } else {
        if (conditionCase_ == 1) {
          return (com.google.cloud.channel.v1.SkuGroupCondition) condition_;
        }
        return com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * SKU Group condition for override.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.SkuGroupCondition sku_group_condition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.SkuGroupCondition, com.google.cloud.channel.v1.SkuGroupCondition.Builder, com.google.cloud.channel.v1.SkuGroupConditionOrBuilder> 
        getSkuGroupConditionFieldBuilder() {
      if (skuGroupConditionBuilder_ == null) {
        if (!(conditionCase_ == 1)) {
          condition_ = com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
        }
        skuGroupConditionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.SkuGroupCondition, com.google.cloud.channel.v1.SkuGroupCondition.Builder, com.google.cloud.channel.v1.SkuGroupConditionOrBuilder>(
                (com.google.cloud.channel.v1.SkuGroupCondition) condition_,
                getParentForChildren(),
                isClean());
        condition_ = null;
      }
      conditionCase_ = 1;
      onChanged();
      return skuGroupConditionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.RepricingCondition)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.RepricingCondition)
  private static final com.google.cloud.channel.v1.RepricingCondition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.RepricingCondition();
  }

  public static com.google.cloud.channel.v1.RepricingCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepricingCondition>
      PARSER = new com.google.protobuf.AbstractParser<RepricingCondition>() {
    @java.lang.Override
    public RepricingCondition parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepricingCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepricingCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.RepricingCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
