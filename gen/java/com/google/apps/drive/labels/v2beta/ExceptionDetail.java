// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/exception_detail.proto

package com.google.apps.drive.labels.v2beta;

/**
 * <pre>
 * Normalized internal-only message that identifies the exact exception that
 * caused the error on the server.
 * </pre>
 *
 * Protobuf type {@code google.apps.drive.labels.v2beta.ExceptionDetail}
 */
public final class ExceptionDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.drive.labels.v2beta.ExceptionDetail)
    ExceptionDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExceptionDetail.newBuilder() to construct.
  private ExceptionDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExceptionDetail() {
    errorType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExceptionDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.drive.labels.v2beta.ExceptionDetailProto.internal_static_google_apps_drive_labels_v2beta_ExceptionDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.drive.labels.v2beta.ExceptionDetailProto.internal_static_google_apps_drive_labels_v2beta_ExceptionDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.drive.labels.v2beta.ExceptionDetail.class, com.google.apps.drive.labels.v2beta.ExceptionDetail.Builder.class);
  }

  public static final int ERROR_TYPE_FIELD_NUMBER = 1;
  private int errorType_ = 0;
  /**
   * <pre>
   * The type of exception that occurred.
   * required
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
   * @return The enum numeric value on the wire for errorType.
   */
  @java.lang.Override public int getErrorTypeValue() {
    return errorType_;
  }
  /**
   * <pre>
   * The type of exception that occurred.
   * required
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
   * @return The errorType.
   */
  @java.lang.Override public com.google.apps.drive.labels.v2beta.ExceptionType getErrorType() {
    com.google.apps.drive.labels.v2beta.ExceptionType result = com.google.apps.drive.labels.v2beta.ExceptionType.forNumber(errorType_);
    return result == null ? com.google.apps.drive.labels.v2beta.ExceptionType.UNRECOGNIZED : result;
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
    if (errorType_ != com.google.apps.drive.labels.v2beta.ExceptionType.EXCEPTION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, errorType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorType_ != com.google.apps.drive.labels.v2beta.ExceptionType.EXCEPTION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, errorType_);
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
    if (!(obj instanceof com.google.apps.drive.labels.v2beta.ExceptionDetail)) {
      return super.equals(obj);
    }
    com.google.apps.drive.labels.v2beta.ExceptionDetail other = (com.google.apps.drive.labels.v2beta.ExceptionDetail) obj;

    if (errorType_ != other.errorType_) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.ExceptionDetail parseFrom(
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
  public static Builder newBuilder(com.google.apps.drive.labels.v2beta.ExceptionDetail prototype) {
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
   * Normalized internal-only message that identifies the exact exception that
   * caused the error on the server.
   * </pre>
   *
   * Protobuf type {@code google.apps.drive.labels.v2beta.ExceptionDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.drive.labels.v2beta.ExceptionDetail)
      com.google.apps.drive.labels.v2beta.ExceptionDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.drive.labels.v2beta.ExceptionDetailProto.internal_static_google_apps_drive_labels_v2beta_ExceptionDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.drive.labels.v2beta.ExceptionDetailProto.internal_static_google_apps_drive_labels_v2beta_ExceptionDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.drive.labels.v2beta.ExceptionDetail.class, com.google.apps.drive.labels.v2beta.ExceptionDetail.Builder.class);
    }

    // Construct using com.google.apps.drive.labels.v2beta.ExceptionDetail.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.drive.labels.v2beta.ExceptionDetailProto.internal_static_google_apps_drive_labels_v2beta_ExceptionDetail_descriptor;
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.ExceptionDetail getDefaultInstanceForType() {
      return com.google.apps.drive.labels.v2beta.ExceptionDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.ExceptionDetail build() {
      com.google.apps.drive.labels.v2beta.ExceptionDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.ExceptionDetail buildPartial() {
      com.google.apps.drive.labels.v2beta.ExceptionDetail result = new com.google.apps.drive.labels.v2beta.ExceptionDetail(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.drive.labels.v2beta.ExceptionDetail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.errorType_ = errorType_;
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
      if (other instanceof com.google.apps.drive.labels.v2beta.ExceptionDetail) {
        return mergeFrom((com.google.apps.drive.labels.v2beta.ExceptionDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.drive.labels.v2beta.ExceptionDetail other) {
      if (other == com.google.apps.drive.labels.v2beta.ExceptionDetail.getDefaultInstance()) return this;
      if (other.errorType_ != 0) {
        setErrorTypeValue(other.getErrorTypeValue());
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
     * The type of exception that occurred.
     * required
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
     * @return The enum numeric value on the wire for errorType.
     */
    @java.lang.Override public int getErrorTypeValue() {
      return errorType_;
    }
    /**
     * <pre>
     * The type of exception that occurred.
     * required
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
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
     * The type of exception that occurred.
     * required
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
     * @return The errorType.
     */
    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.ExceptionType getErrorType() {
      com.google.apps.drive.labels.v2beta.ExceptionType result = com.google.apps.drive.labels.v2beta.ExceptionType.forNumber(errorType_);
      return result == null ? com.google.apps.drive.labels.v2beta.ExceptionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of exception that occurred.
     * required
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
     * @param value The errorType to set.
     * @return This builder for chaining.
     */
    public Builder setErrorType(com.google.apps.drive.labels.v2beta.ExceptionType value) {
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
     * The type of exception that occurred.
     * required
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ExceptionType error_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      errorType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.apps.drive.labels.v2beta.ExceptionDetail)
  }

  // @@protoc_insertion_point(class_scope:google.apps.drive.labels.v2beta.ExceptionDetail)
  private static final com.google.apps.drive.labels.v2beta.ExceptionDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.drive.labels.v2beta.ExceptionDetail();
  }

  public static com.google.apps.drive.labels.v2beta.ExceptionDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExceptionDetail>
      PARSER = new com.google.protobuf.AbstractParser<ExceptionDetail>() {
    @java.lang.Override
    public ExceptionDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExceptionDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExceptionDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.drive.labels.v2beta.ExceptionDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
