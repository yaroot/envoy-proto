// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Message defining a field of a BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.BigQueryField}
 */
public final class BigQueryField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.BigQueryField)
    BigQueryFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BigQueryField.newBuilder() to construct.
  private BigQueryField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BigQueryField() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BigQueryField();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_BigQueryField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_BigQueryField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.BigQueryField.class, com.google.privacy.dlp.v2.BigQueryField.Builder.class);
  }

  public static final int TABLE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.BigQueryTable table_;
  /**
   * <pre>
   * Source table of the field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return table_ != null;
  }
  /**
   * <pre>
   * Source table of the field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   * @return The table.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryTable getTable() {
    return table_ == null ? com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance() : table_;
  }
  /**
   * <pre>
   * Source table of the field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder() {
    return table_ == null ? com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance() : table_;
  }

  public static final int FIELD_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.FieldId field_;
  /**
   * <pre>
   * Designated field in the BigQuery table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   * @return Whether the field field is set.
   */
  @java.lang.Override
  public boolean hasField() {
    return field_ != null;
  }
  /**
   * <pre>
   * Designated field in the BigQuery table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   * @return The field.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.FieldId getField() {
    return field_ == null ? com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : field_;
  }
  /**
   * <pre>
   * Designated field in the BigQuery table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldOrBuilder() {
    return field_ == null ? com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : field_;
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
    if (table_ != null) {
      output.writeMessage(1, getTable());
    }
    if (field_ != null) {
      output.writeMessage(2, getField());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (table_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTable());
    }
    if (field_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getField());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.BigQueryField)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.BigQueryField other = (com.google.privacy.dlp.v2.BigQueryField) obj;

    if (hasTable() != other.hasTable()) return false;
    if (hasTable()) {
      if (!getTable()
          .equals(other.getTable())) return false;
    }
    if (hasField() != other.hasField()) return false;
    if (hasField()) {
      if (!getField()
          .equals(other.getField())) return false;
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
    if (hasTable()) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTable().hashCode();
    }
    if (hasField()) {
      hash = (37 * hash) + FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getField().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.BigQueryField parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.BigQueryField prototype) {
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
   * Message defining a field of a BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.BigQueryField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.BigQueryField)
      com.google.privacy.dlp.v2.BigQueryFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_BigQueryField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_BigQueryField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.BigQueryField.class, com.google.privacy.dlp.v2.BigQueryField.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.BigQueryField.newBuilder()
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
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      field_ = null;
      if (fieldBuilder_ != null) {
        fieldBuilder_.dispose();
        fieldBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_BigQueryField_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryField getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.BigQueryField.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryField build() {
      com.google.privacy.dlp.v2.BigQueryField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryField buildPartial() {
      com.google.privacy.dlp.v2.BigQueryField result = new com.google.privacy.dlp.v2.BigQueryField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.BigQueryField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.table_ = tableBuilder_ == null
            ? table_
            : tableBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.field_ = fieldBuilder_ == null
            ? field_
            : fieldBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.BigQueryField) {
        return mergeFrom((com.google.privacy.dlp.v2.BigQueryField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.BigQueryField other) {
      if (other == com.google.privacy.dlp.v2.BigQueryField.getDefaultInstance()) return this;
      if (other.hasTable()) {
        mergeTable(other.getTable());
      }
      if (other.hasField()) {
        mergeField(other.getField());
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
                  getTableFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFieldFieldBuilder().getBuilder(),
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

    private com.google.privacy.dlp.v2.BigQueryTable table_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.BigQueryTable, com.google.privacy.dlp.v2.BigQueryTable.Builder, com.google.privacy.dlp.v2.BigQueryTableOrBuilder> tableBuilder_;
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     * @return Whether the table field is set.
     */
    public boolean hasTable() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     * @return The table.
     */
    public com.google.privacy.dlp.v2.BigQueryTable getTable() {
      if (tableBuilder_ == null) {
        return table_ == null ? com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance() : table_;
      } else {
        return tableBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder setTable(com.google.privacy.dlp.v2.BigQueryTable value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        table_ = value;
      } else {
        tableBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder setTable(
        com.google.privacy.dlp.v2.BigQueryTable.Builder builderForValue) {
      if (tableBuilder_ == null) {
        table_ = builderForValue.build();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder mergeTable(com.google.privacy.dlp.v2.BigQueryTable value) {
      if (tableBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          table_ != null &&
          table_ != com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance()) {
          getTableBuilder().mergeFrom(value);
        } else {
          table_ = value;
        }
      } else {
        tableBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder clearTable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public com.google.privacy.dlp.v2.BigQueryTable.Builder getTableBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTableFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder() {
      if (tableBuilder_ != null) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        return table_ == null ?
            com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance() : table_;
      }
    }
    /**
     * <pre>
     * Source table of the field.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.BigQueryTable, com.google.privacy.dlp.v2.BigQueryTable.Builder, com.google.privacy.dlp.v2.BigQueryTableOrBuilder> 
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        tableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryTable, com.google.privacy.dlp.v2.BigQueryTable.Builder, com.google.privacy.dlp.v2.BigQueryTableOrBuilder>(
                getTable(),
                getParentForChildren(),
                isClean());
        table_ = null;
      }
      return tableBuilder_;
    }

    private com.google.privacy.dlp.v2.FieldId field_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.FieldId, com.google.privacy.dlp.v2.FieldId.Builder, com.google.privacy.dlp.v2.FieldIdOrBuilder> fieldBuilder_;
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     * @return Whether the field field is set.
     */
    public boolean hasField() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     * @return The field.
     */
    public com.google.privacy.dlp.v2.FieldId getField() {
      if (fieldBuilder_ == null) {
        return field_ == null ? com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : field_;
      } else {
        return fieldBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    public Builder setField(com.google.privacy.dlp.v2.FieldId value) {
      if (fieldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        field_ = value;
      } else {
        fieldBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    public Builder setField(
        com.google.privacy.dlp.v2.FieldId.Builder builderForValue) {
      if (fieldBuilder_ == null) {
        field_ = builderForValue.build();
      } else {
        fieldBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    public Builder mergeField(com.google.privacy.dlp.v2.FieldId value) {
      if (fieldBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          field_ != null &&
          field_ != com.google.privacy.dlp.v2.FieldId.getDefaultInstance()) {
          getFieldBuilder().mergeFrom(value);
        } else {
          field_ = value;
        }
      } else {
        fieldBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    public Builder clearField() {
      bitField0_ = (bitField0_ & ~0x00000002);
      field_ = null;
      if (fieldBuilder_ != null) {
        fieldBuilder_.dispose();
        fieldBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    public com.google.privacy.dlp.v2.FieldId.Builder getFieldBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFieldFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    public com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldOrBuilder() {
      if (fieldBuilder_ != null) {
        return fieldBuilder_.getMessageOrBuilder();
      } else {
        return field_ == null ?
            com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : field_;
      }
    }
    /**
     * <pre>
     * Designated field in the BigQuery table.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.FieldId, com.google.privacy.dlp.v2.FieldId.Builder, com.google.privacy.dlp.v2.FieldIdOrBuilder> 
        getFieldFieldBuilder() {
      if (fieldBuilder_ == null) {
        fieldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.FieldId, com.google.privacy.dlp.v2.FieldId.Builder, com.google.privacy.dlp.v2.FieldIdOrBuilder>(
                getField(),
                getParentForChildren(),
                isClean());
        field_ = null;
      }
      return fieldBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.BigQueryField)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.BigQueryField)
  private static final com.google.privacy.dlp.v2.BigQueryField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.BigQueryField();
  }

  public static com.google.privacy.dlp.v2.BigQueryField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryField>
      PARSER = new com.google.protobuf.AbstractParser<BigQueryField>() {
    @java.lang.Override
    public BigQueryField parsePartialFrom(
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

  public static com.google.protobuf.Parser<BigQueryField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
