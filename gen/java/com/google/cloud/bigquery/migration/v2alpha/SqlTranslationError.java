// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/translation_service.proto

package com.google.cloud.bigquery.migration.v2alpha;

/**
 * <pre>
 * The detailed error object if the SQL translation job fails.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.SqlTranslationError}
 */
public final class SqlTranslationError extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.SqlTranslationError)
    SqlTranslationErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqlTranslationError.newBuilder() to construct.
  private SqlTranslationError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqlTranslationError() {
    errorType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqlTranslationError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.class, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.Builder.class);
  }

  /**
   * <pre>
   * The error type of the SQL translation job.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType}
   */
  public enum SqlTranslationErrorType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * SqlTranslationErrorType not specified.
     * </pre>
     *
     * <code>SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED = 0;</code>
     */
    SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Failed to parse the input text as a SQL query.
     * </pre>
     *
     * <code>SQL_PARSE_ERROR = 1;</code>
     */
    SQL_PARSE_ERROR(1),
    /**
     * <pre>
     * Found unsupported functions in the input SQL query that are not able to
     * translate.
     * </pre>
     *
     * <code>UNSUPPORTED_SQL_FUNCTION = 2;</code>
     */
    UNSUPPORTED_SQL_FUNCTION(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * SqlTranslationErrorType not specified.
     * </pre>
     *
     * <code>SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Failed to parse the input text as a SQL query.
     * </pre>
     *
     * <code>SQL_PARSE_ERROR = 1;</code>
     */
    public static final int SQL_PARSE_ERROR_VALUE = 1;
    /**
     * <pre>
     * Found unsupported functions in the input SQL query that are not able to
     * translate.
     * </pre>
     *
     * <code>UNSUPPORTED_SQL_FUNCTION = 2;</code>
     */
    public static final int UNSUPPORTED_SQL_FUNCTION_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SqlTranslationErrorType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SqlTranslationErrorType forNumber(int value) {
      switch (value) {
        case 0: return SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED;
        case 1: return SQL_PARSE_ERROR;
        case 2: return UNSUPPORTED_SQL_FUNCTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SqlTranslationErrorType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SqlTranslationErrorType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SqlTranslationErrorType>() {
            public SqlTranslationErrorType findValueByNumber(int number) {
              return SqlTranslationErrorType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.getDescriptor().getEnumTypes().get(0);
    }

    private static final SqlTranslationErrorType[] VALUES = values();

    public static SqlTranslationErrorType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SqlTranslationErrorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType)
  }

  public static final int ERROR_TYPE_FIELD_NUMBER = 1;
  private int errorType_ = 0;
  /**
   * <pre>
   * The type of SQL translation error.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
   * @return The enum numeric value on the wire for errorType.
   */
  @java.lang.Override public int getErrorTypeValue() {
    return errorType_;
  }
  /**
   * <pre>
   * The type of SQL translation error.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
   * @return The errorType.
   */
  @java.lang.Override public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType getErrorType() {
    com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType result = com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType.forNumber(errorType_);
    return result == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType.UNRECOGNIZED : result;
  }

  public static final int ERROR_DETAIL_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail errorDetail_;
  /**
   * <pre>
   * Specifies the details of the error, including the error message and
   * location from the source text.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
   * @return Whether the errorDetail field is set.
   */
  @java.lang.Override
  public boolean hasErrorDetail() {
    return errorDetail_ != null;
  }
  /**
   * <pre>
   * Specifies the details of the error, including the error message and
   * location from the source text.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
   * @return The errorDetail.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail getErrorDetail() {
    return errorDetail_ == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : errorDetail_;
  }
  /**
   * <pre>
   * Specifies the details of the error, including the error message and
   * location from the source text.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder getErrorDetailOrBuilder() {
    return errorDetail_ == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : errorDetail_;
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
    if (errorType_ != com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType.SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, errorType_);
    }
    if (errorDetail_ != null) {
      output.writeMessage(2, getErrorDetail());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorType_ != com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType.SQL_TRANSLATION_ERROR_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, errorType_);
    }
    if (errorDetail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getErrorDetail());
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError other = (com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError) obj;

    if (errorType_ != other.errorType_) return false;
    if (hasErrorDetail() != other.hasErrorDetail()) return false;
    if (hasErrorDetail()) {
      if (!getErrorDetail()
          .equals(other.getErrorDetail())) return false;
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
    hash = (37 * hash) + ERROR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + errorType_;
    if (hasErrorDetail()) {
      hash = (37 * hash) + ERROR_DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getErrorDetail().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError prototype) {
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
   * The detailed error object if the SQL translation job fails.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.SqlTranslationError}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.SqlTranslationError)
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.class, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.newBuilder()
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
      errorType_ = 0;
      errorDetail_ = null;
      if (errorDetailBuilder_ != null) {
        errorDetailBuilder_.dispose();
        errorDetailBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.TranslationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError build() {
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError result = new com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.errorType_ = errorType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorDetail_ = errorDetailBuilder_ == null
            ? errorDetail_
            : errorDetailBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError other) {
      if (other == com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.getDefaultInstance()) return this;
      if (other.errorType_ != 0) {
        setErrorTypeValue(other.getErrorTypeValue());
      }
      if (other.hasErrorDetail()) {
        mergeErrorDetail(other.getErrorDetail());
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
              errorType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getErrorDetailFieldBuilder().getBuilder(),
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

    private int errorType_ = 0;
    /**
     * <pre>
     * The type of SQL translation error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
     * @return The enum numeric value on the wire for errorType.
     */
    @java.lang.Override public int getErrorTypeValue() {
      return errorType_;
    }
    /**
     * <pre>
     * The type of SQL translation error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
     * @param value The enum numeric value on the wire for errorType to set.
     * @return This builder for chaining.
     */
    public Builder setErrorTypeValue(int value) {
      errorType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of SQL translation error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
     * @return The errorType.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType getErrorType() {
      com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType result = com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType.forNumber(errorType_);
      return result == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of SQL translation error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
     * @param value The errorType to set.
     * @return This builder for chaining.
     */
    public Builder setErrorType(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      errorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of SQL translation error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationError.SqlTranslationErrorType error_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      errorType_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail errorDetail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder> errorDetailBuilder_;
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     * @return Whether the errorDetail field is set.
     */
    public boolean hasErrorDetail() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     * @return The errorDetail.
     */
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail getErrorDetail() {
      if (errorDetailBuilder_ == null) {
        return errorDetail_ == null ? com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : errorDetail_;
      } else {
        return errorDetailBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    public Builder setErrorDetail(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail value) {
      if (errorDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorDetail_ = value;
      } else {
        errorDetailBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    public Builder setErrorDetail(
        com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder builderForValue) {
      if (errorDetailBuilder_ == null) {
        errorDetail_ = builderForValue.build();
      } else {
        errorDetailBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    public Builder mergeErrorDetail(com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail value) {
      if (errorDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          errorDetail_ != null &&
          errorDetail_ != com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance()) {
          getErrorDetailBuilder().mergeFrom(value);
        } else {
          errorDetail_ = value;
        }
      } else {
        errorDetailBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    public Builder clearErrorDetail() {
      bitField0_ = (bitField0_ & ~0x00000002);
      errorDetail_ = null;
      if (errorDetailBuilder_ != null) {
        errorDetailBuilder_.dispose();
        errorDetailBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder getErrorDetailBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorDetailFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder getErrorDetailOrBuilder() {
      if (errorDetailBuilder_ != null) {
        return errorDetailBuilder_.getMessageOrBuilder();
      } else {
        return errorDetail_ == null ?
            com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.getDefaultInstance() : errorDetail_;
      }
    }
    /**
     * <pre>
     * Specifies the details of the error, including the error message and
     * location from the source text.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail error_detail = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder> 
        getErrorDetailFieldBuilder() {
      if (errorDetailBuilder_ == null) {
        errorDetailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetail.Builder, com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorDetailOrBuilder>(
                getErrorDetail(),
                getParentForChildren(),
                isClean());
        errorDetail_ = null;
      }
      return errorDetailBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.SqlTranslationError)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.SqlTranslationError)
  private static final com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlTranslationError>
      PARSER = new com.google.protobuf.AbstractParser<SqlTranslationError>() {
    @java.lang.Override
    public SqlTranslationError parsePartialFrom(
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

  public static com.google.protobuf.Parser<SqlTranslationError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlTranslationError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

