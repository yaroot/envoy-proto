// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * The infoType details for this column.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.InfoTypeSummary}
 */
public final class InfoTypeSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.InfoTypeSummary)
    InfoTypeSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InfoTypeSummary.newBuilder() to construct.
  private InfoTypeSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InfoTypeSummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InfoTypeSummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.InfoTypeSummary.class, com.google.privacy.dlp.v2.InfoTypeSummary.Builder.class);
  }

  public static final int INFO_TYPE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.InfoType infoType_;
  /**
   * <pre>
   * The infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   * @return Whether the infoType field is set.
   */
  @java.lang.Override
  public boolean hasInfoType() {
    return infoType_ != null;
  }
  /**
   * <pre>
   * The infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   * @return The infoType.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoType getInfoType() {
    return infoType_ == null ? com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
  }
  /**
   * <pre>
   * The infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder() {
    return infoType_ == null ? com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
  }

  public static final int ESTIMATED_PREVALENCE_FIELD_NUMBER = 2;
  private int estimatedPrevalence_ = 0;
  /**
   * <pre>
   * Not populated for predicted infotypes.
   * </pre>
   *
   * <code>int32 estimated_prevalence = 2 [deprecated = true];</code>
   * @deprecated google.privacy.dlp.v2.InfoTypeSummary.estimated_prevalence is deprecated.
   *     See google/privacy/dlp/v2/dlp.proto;l=5324
   * @return The estimatedPrevalence.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getEstimatedPrevalence() {
    return estimatedPrevalence_;
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
    if (infoType_ != null) {
      output.writeMessage(1, getInfoType());
    }
    if (estimatedPrevalence_ != 0) {
      output.writeInt32(2, estimatedPrevalence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (infoType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfoType());
    }
    if (estimatedPrevalence_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, estimatedPrevalence_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.InfoTypeSummary)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.InfoTypeSummary other = (com.google.privacy.dlp.v2.InfoTypeSummary) obj;

    if (hasInfoType() != other.hasInfoType()) return false;
    if (hasInfoType()) {
      if (!getInfoType()
          .equals(other.getInfoType())) return false;
    }
    if (getEstimatedPrevalence()
        != other.getEstimatedPrevalence()) return false;
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
    if (hasInfoType()) {
      hash = (37 * hash) + INFO_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getInfoType().hashCode();
    }
    hash = (37 * hash) + ESTIMATED_PREVALENCE_FIELD_NUMBER;
    hash = (53 * hash) + getEstimatedPrevalence();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InfoTypeSummary parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.InfoTypeSummary prototype) {
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
   * The infoType details for this column.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.InfoTypeSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.InfoTypeSummary)
      com.google.privacy.dlp.v2.InfoTypeSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.InfoTypeSummary.class, com.google.privacy.dlp.v2.InfoTypeSummary.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.InfoTypeSummary.newBuilder()
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
      infoType_ = null;
      if (infoTypeBuilder_ != null) {
        infoTypeBuilder_.dispose();
        infoTypeBuilder_ = null;
      }
      estimatedPrevalence_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeSummary_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoTypeSummary getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.InfoTypeSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoTypeSummary build() {
      com.google.privacy.dlp.v2.InfoTypeSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoTypeSummary buildPartial() {
      com.google.privacy.dlp.v2.InfoTypeSummary result = new com.google.privacy.dlp.v2.InfoTypeSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.InfoTypeSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.infoType_ = infoTypeBuilder_ == null
            ? infoType_
            : infoTypeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.estimatedPrevalence_ = estimatedPrevalence_;
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
      if (other instanceof com.google.privacy.dlp.v2.InfoTypeSummary) {
        return mergeFrom((com.google.privacy.dlp.v2.InfoTypeSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.InfoTypeSummary other) {
      if (other == com.google.privacy.dlp.v2.InfoTypeSummary.getDefaultInstance()) return this;
      if (other.hasInfoType()) {
        mergeInfoType(other.getInfoType());
      }
      if (other.getEstimatedPrevalence() != 0) {
        setEstimatedPrevalence(other.getEstimatedPrevalence());
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
                  getInfoTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              estimatedPrevalence_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.privacy.dlp.v2.InfoType infoType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InfoType, com.google.privacy.dlp.v2.InfoType.Builder, com.google.privacy.dlp.v2.InfoTypeOrBuilder> infoTypeBuilder_;
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     * @return Whether the infoType field is set.
     */
    public boolean hasInfoType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     * @return The infoType.
     */
    public com.google.privacy.dlp.v2.InfoType getInfoType() {
      if (infoTypeBuilder_ == null) {
        return infoType_ == null ? com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
      } else {
        return infoTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder setInfoType(com.google.privacy.dlp.v2.InfoType value) {
      if (infoTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        infoType_ = value;
      } else {
        infoTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder setInfoType(
        com.google.privacy.dlp.v2.InfoType.Builder builderForValue) {
      if (infoTypeBuilder_ == null) {
        infoType_ = builderForValue.build();
      } else {
        infoTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder mergeInfoType(com.google.privacy.dlp.v2.InfoType value) {
      if (infoTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          infoType_ != null &&
          infoType_ != com.google.privacy.dlp.v2.InfoType.getDefaultInstance()) {
          getInfoTypeBuilder().mergeFrom(value);
        } else {
          infoType_ = value;
        }
      } else {
        infoTypeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder clearInfoType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      infoType_ = null;
      if (infoTypeBuilder_ != null) {
        infoTypeBuilder_.dispose();
        infoTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2.InfoType.Builder getInfoTypeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInfoTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder() {
      if (infoTypeBuilder_ != null) {
        return infoTypeBuilder_.getMessageOrBuilder();
      } else {
        return infoType_ == null ?
            com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
      }
    }
    /**
     * <pre>
     * The infoType.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InfoType, com.google.privacy.dlp.v2.InfoType.Builder, com.google.privacy.dlp.v2.InfoTypeOrBuilder> 
        getInfoTypeFieldBuilder() {
      if (infoTypeBuilder_ == null) {
        infoTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InfoType, com.google.privacy.dlp.v2.InfoType.Builder, com.google.privacy.dlp.v2.InfoTypeOrBuilder>(
                getInfoType(),
                getParentForChildren(),
                isClean());
        infoType_ = null;
      }
      return infoTypeBuilder_;
    }

    private int estimatedPrevalence_ ;
    /**
     * <pre>
     * Not populated for predicted infotypes.
     * </pre>
     *
     * <code>int32 estimated_prevalence = 2 [deprecated = true];</code>
     * @deprecated google.privacy.dlp.v2.InfoTypeSummary.estimated_prevalence is deprecated.
     *     See google/privacy/dlp/v2/dlp.proto;l=5324
     * @return The estimatedPrevalence.
     */
    @java.lang.Override
    @java.lang.Deprecated public int getEstimatedPrevalence() {
      return estimatedPrevalence_;
    }
    /**
     * <pre>
     * Not populated for predicted infotypes.
     * </pre>
     *
     * <code>int32 estimated_prevalence = 2 [deprecated = true];</code>
     * @deprecated google.privacy.dlp.v2.InfoTypeSummary.estimated_prevalence is deprecated.
     *     See google/privacy/dlp/v2/dlp.proto;l=5324
     * @param value The estimatedPrevalence to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setEstimatedPrevalence(int value) {
      
      estimatedPrevalence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Not populated for predicted infotypes.
     * </pre>
     *
     * <code>int32 estimated_prevalence = 2 [deprecated = true];</code>
     * @deprecated google.privacy.dlp.v2.InfoTypeSummary.estimated_prevalence is deprecated.
     *     See google/privacy/dlp/v2/dlp.proto;l=5324
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearEstimatedPrevalence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      estimatedPrevalence_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.InfoTypeSummary)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.InfoTypeSummary)
  private static final com.google.privacy.dlp.v2.InfoTypeSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.InfoTypeSummary();
  }

  public static com.google.privacy.dlp.v2.InfoTypeSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoTypeSummary>
      PARSER = new com.google.protobuf.AbstractParser<InfoTypeSummary>() {
    @java.lang.Override
    public InfoTypeSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<InfoTypeSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoTypeSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoTypeSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
