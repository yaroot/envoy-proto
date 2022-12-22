// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/translation_service.proto

package com.google.cloud.bigquery.migration.v2alpha;

/**
 * <pre>
 * The detailed warning object if the SQL translation job is completed but not
 * semantically correct.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning}
 */
public final class SqlTranslationWarning extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning)
    SqlTranslationWarningOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqlTranslationWarning.newBuilder() to construct.
  private SqlTranslationWarning(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqlTranslationWarning() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqlTranslationWarning();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.class, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.Builder.class);
  }

  public static final int WARNING_DETAIL_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warningDetail_;
  /**
   * <pre>
   * Specifies the details of the warning, including the warning message and
   * location from the source text.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
   * @return Whether the warningDetail field is set.
   */
  @java.lang.Override
  public boolean hasWarningDetail() {
    return warningDetail_ != null;
  }
  /**
   * <pre>
   * Specifies the details of the warning, including the warning message and
   * location from the source text.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
   * @return The warningDetail.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail getWarningDetail() {
    return warningDetail_ == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : warningDetail_;
  }
  /**
   * <pre>
   * Specifies the details of the warning, including the warning message and
   * location from the source text.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder getWarningDetailOrBuilder() {
    return warningDetail_ == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : warningDetail_;
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
    if (warningDetail_ != null) {
      output.writeMessage(1, getWarningDetail());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (warningDetail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWarningDetail());
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning other = (com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning) obj;

    if (hasWarningDetail() != other.hasWarningDetail()) return false;
    if (hasWarningDetail()) {
      if (!getWarningDetail()
          .equals(other.getWarningDetail())) return false;
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
    if (hasWarningDetail()) {
      hash = (37 * hash) + WARNING_DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getWarningDetail().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning prototype) {
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
   * The detailed warning object if the SQL translation job is completed but not
   * semantically correct.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning)
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarningOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.class, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.newBuilder()
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
      warningDetail_ = null;
      if (warningDetailBuilder_ != null) {
        warningDetailBuilder_.dispose();
        warningDetailBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning build() {
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning result = new com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.warningDetail_ = warningDetailBuilder_ == null
            ? warningDetail_
            : warningDetailBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning other) {
      if (other == com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning.getDefaultInstance()) return this;
      if (other.hasWarningDetail()) {
        mergeWarningDetail(other.getWarningDetail());
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
                  getWarningDetailFieldBuilder().getBuilder(),
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

    private com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warningDetail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder> warningDetailBuilder_;
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     * @return Whether the warningDetail field is set.
     */
    public boolean hasWarningDetail() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     * @return The warningDetail.
     */
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail getWarningDetail() {
      if (warningDetailBuilder_ == null) {
        return warningDetail_ == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : warningDetail_;
      } else {
        return warningDetailBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    public Builder setWarningDetail(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail value) {
      if (warningDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warningDetail_ = value;
      } else {
        warningDetailBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    public Builder setWarningDetail(
        com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder builderForValue) {
      if (warningDetailBuilder_ == null) {
        warningDetail_ = builderForValue.build();
      } else {
        warningDetailBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    public Builder mergeWarningDetail(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail value) {
      if (warningDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          warningDetail_ != null &&
          warningDetail_ != com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance()) {
          getWarningDetailBuilder().mergeFrom(value);
        } else {
          warningDetail_ = value;
        }
      } else {
        warningDetailBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    public Builder clearWarningDetail() {
      bitField0_ = (bitField0_ & ~0x00000001);
      warningDetail_ = null;
      if (warningDetailBuilder_ != null) {
        warningDetailBuilder_.dispose();
        warningDetailBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder getWarningDetailBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWarningDetailFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder getWarningDetailOrBuilder() {
      if (warningDetailBuilder_ != null) {
        return warningDetailBuilder_.getMessageOrBuilder();
      } else {
        return warningDetail_ == null ?
            com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : warningDetail_;
      }
    }
    /**
     * <pre>
     * Specifies the details of the warning, including the warning message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail warning_detail = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder> 
        getWarningDetailFieldBuilder() {
      if (warningDetailBuilder_ == null) {
        warningDetailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder>(
                getWarningDetail(),
                getParentForChildren(),
                isClean());
        warningDetail_ = null;
      }
      return warningDetailBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning)
  private static final com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlTranslationWarning>
      PARSER = new com.google.protobuf.AbstractParser<SqlTranslationWarning>() {
    @java.lang.Override
    public SqlTranslationWarning parsePartialFrom(
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

  public static com.google.protobuf.Parser<SqlTranslationWarning> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlTranslationWarning> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

