// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/type/free_text_type.proto

package com.google.actions.sdk.v2.interactionmodel.type;

/**
 * <pre>
 * Type that matches any text if surrounding words context is close to provided
 * training examples.
 * </pre>
 *
 * Protobuf type {@code google.actions.sdk.v2.interactionmodel.type.FreeTextType}
 */
public final class FreeTextType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.sdk.v2.interactionmodel.type.FreeTextType)
    FreeTextTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FreeTextType.newBuilder() to construct.
  private FreeTextType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FreeTextType() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FreeTextType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.internal_static_google_actions_sdk_v2_interactionmodel_type_FreeTextType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.internal_static_google_actions_sdk_v2_interactionmodel_type_FreeTextType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.class, com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.Builder.class);
  }

  public static final int DISPLAY_FIELD_NUMBER = 2;
  private com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display_;
  /**
   * <pre>
   * Optional. Elements that will be displayed on the canvas once an entity is extracted
   * from a query. Only relevant for canvas enabled apps.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the display field is set.
   */
  @java.lang.Override
  public boolean hasDisplay() {
    return display_ != null;
  }
  /**
   * <pre>
   * Optional. Elements that will be displayed on the canvas once an entity is extracted
   * from a query. Only relevant for canvas enabled apps.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The display.
   */
  @java.lang.Override
  public com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay getDisplay() {
    return display_ == null ? com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.getDefaultInstance() : display_;
  }
  /**
   * <pre>
   * Optional. Elements that will be displayed on the canvas once an entity is extracted
   * from a query. Only relevant for canvas enabled apps.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.actions.sdk.v2.interactionmodel.type.EntityDisplayOrBuilder getDisplayOrBuilder() {
    return display_ == null ? com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.getDefaultInstance() : display_;
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
    if (display_ != null) {
      output.writeMessage(2, getDisplay());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (display_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDisplay());
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
    if (!(obj instanceof com.google.actions.sdk.v2.interactionmodel.type.FreeTextType)) {
      return super.equals(obj);
    }
    com.google.actions.sdk.v2.interactionmodel.type.FreeTextType other = (com.google.actions.sdk.v2.interactionmodel.type.FreeTextType) obj;

    if (hasDisplay() != other.hasDisplay()) return false;
    if (hasDisplay()) {
      if (!getDisplay()
          .equals(other.getDisplay())) return false;
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
    if (hasDisplay()) {
      hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getDisplay().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType parseFrom(
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
  public static Builder newBuilder(com.google.actions.sdk.v2.interactionmodel.type.FreeTextType prototype) {
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
   * Type that matches any text if surrounding words context is close to provided
   * training examples.
   * </pre>
   *
   * Protobuf type {@code google.actions.sdk.v2.interactionmodel.type.FreeTextType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.sdk.v2.interactionmodel.type.FreeTextType)
      com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.internal_static_google_actions_sdk_v2_interactionmodel_type_FreeTextType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.internal_static_google_actions_sdk_v2_interactionmodel_type_FreeTextType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.class, com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.Builder.class);
    }

    // Construct using com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.newBuilder()
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
      display_ = null;
      if (displayBuilder_ != null) {
        displayBuilder_.dispose();
        displayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.internal_static_google_actions_sdk_v2_interactionmodel_type_FreeTextType_descriptor;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.interactionmodel.type.FreeTextType getDefaultInstanceForType() {
      return com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.interactionmodel.type.FreeTextType build() {
      com.google.actions.sdk.v2.interactionmodel.type.FreeTextType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.interactionmodel.type.FreeTextType buildPartial() {
      com.google.actions.sdk.v2.interactionmodel.type.FreeTextType result = new com.google.actions.sdk.v2.interactionmodel.type.FreeTextType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.actions.sdk.v2.interactionmodel.type.FreeTextType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.display_ = displayBuilder_ == null
            ? display_
            : displayBuilder_.build();
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
      if (other instanceof com.google.actions.sdk.v2.interactionmodel.type.FreeTextType) {
        return mergeFrom((com.google.actions.sdk.v2.interactionmodel.type.FreeTextType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.sdk.v2.interactionmodel.type.FreeTextType other) {
      if (other == com.google.actions.sdk.v2.interactionmodel.type.FreeTextType.getDefaultInstance()) return this;
      if (other.hasDisplay()) {
        mergeDisplay(other.getDisplay());
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
              input.readMessage(
                  getDisplayFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay, com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.Builder, com.google.actions.sdk.v2.interactionmodel.type.EntityDisplayOrBuilder> displayBuilder_;
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the display field is set.
     */
    public boolean hasDisplay() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The display.
     */
    public com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay getDisplay() {
      if (displayBuilder_ == null) {
        return display_ == null ? com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.getDefaultInstance() : display_;
      } else {
        return displayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setDisplay(com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay value) {
      if (displayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        display_ = value;
      } else {
        displayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setDisplay(
        com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.Builder builderForValue) {
      if (displayBuilder_ == null) {
        display_ = builderForValue.build();
      } else {
        displayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeDisplay(com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay value) {
      if (displayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          display_ != null &&
          display_ != com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.getDefaultInstance()) {
          getDisplayBuilder().mergeFrom(value);
        } else {
          display_ = value;
        }
      } else {
        displayBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearDisplay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      display_ = null;
      if (displayBuilder_ != null) {
        displayBuilder_.dispose();
        displayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.Builder getDisplayBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDisplayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.actions.sdk.v2.interactionmodel.type.EntityDisplayOrBuilder getDisplayOrBuilder() {
      if (displayBuilder_ != null) {
        return displayBuilder_.getMessageOrBuilder();
      } else {
        return display_ == null ?
            com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.getDefaultInstance() : display_;
      }
    }
    /**
     * <pre>
     * Optional. Elements that will be displayed on the canvas once an entity is extracted
     * from a query. Only relevant for canvas enabled apps.
     * </pre>
     *
     * <code>.google.actions.sdk.v2.interactionmodel.type.EntityDisplay display = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay, com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.Builder, com.google.actions.sdk.v2.interactionmodel.type.EntityDisplayOrBuilder> 
        getDisplayFieldBuilder() {
      if (displayBuilder_ == null) {
        displayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay, com.google.actions.sdk.v2.interactionmodel.type.EntityDisplay.Builder, com.google.actions.sdk.v2.interactionmodel.type.EntityDisplayOrBuilder>(
                getDisplay(),
                getParentForChildren(),
                isClean());
        display_ = null;
      }
      return displayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.actions.sdk.v2.interactionmodel.type.FreeTextType)
  }

  // @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.type.FreeTextType)
  private static final com.google.actions.sdk.v2.interactionmodel.type.FreeTextType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.sdk.v2.interactionmodel.type.FreeTextType();
  }

  public static com.google.actions.sdk.v2.interactionmodel.type.FreeTextType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FreeTextType>
      PARSER = new com.google.protobuf.AbstractParser<FreeTextType>() {
    @java.lang.Override
    public FreeTextType parsePartialFrom(
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

  public static com.google.protobuf.Parser<FreeTextType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FreeTextType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.sdk.v2.interactionmodel.type.FreeTextType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
