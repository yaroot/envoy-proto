// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * MySQL database.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.MysqlDatabase}
 */
public final class MysqlDatabase extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.MysqlDatabase)
    MysqlDatabaseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MysqlDatabase.newBuilder() to construct.
  private MysqlDatabase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MysqlDatabase() {
    database_ = "";
    mysqlTables_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MysqlDatabase();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlDatabase_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlDatabase_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.MysqlDatabase.class, com.google.cloud.datastream.v1.MysqlDatabase.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object database_ = "";
  /**
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 1;</code>
   * @return The database.
   */
  @java.lang.Override
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 1;</code>
   * @return The bytes for database.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MYSQL_TABLES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datastream.v1.MysqlTable> mysqlTables_;
  /**
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1.MysqlTable> getMysqlTablesList() {
    return mysqlTables_;
  }
  /**
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1.MysqlTableOrBuilder> 
      getMysqlTablesOrBuilderList() {
    return mysqlTables_;
  }
  /**
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  @java.lang.Override
  public int getMysqlTablesCount() {
    return mysqlTables_.size();
  }
  /**
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlTable getMysqlTables(int index) {
    return mysqlTables_.get(index);
  }
  /**
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlTableOrBuilder getMysqlTablesOrBuilder(
      int index) {
    return mysqlTables_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    for (int i = 0; i < mysqlTables_.size(); i++) {
      output.writeMessage(2, mysqlTables_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    for (int i = 0; i < mysqlTables_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, mysqlTables_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1.MysqlDatabase)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.MysqlDatabase other = (com.google.cloud.datastream.v1.MysqlDatabase) obj;

    if (!getDatabase()
        .equals(other.getDatabase())) return false;
    if (!getMysqlTablesList()
        .equals(other.getMysqlTablesList())) return false;
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
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    if (getMysqlTablesCount() > 0) {
      hash = (37 * hash) + MYSQL_TABLES_FIELD_NUMBER;
      hash = (53 * hash) + getMysqlTablesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlDatabase parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.MysqlDatabase prototype) {
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
   * MySQL database.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.MysqlDatabase}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.MysqlDatabase)
      com.google.cloud.datastream.v1.MysqlDatabaseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlDatabase_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlDatabase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.MysqlDatabase.class, com.google.cloud.datastream.v1.MysqlDatabase.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.MysqlDatabase.newBuilder()
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
      database_ = "";
      if (mysqlTablesBuilder_ == null) {
        mysqlTables_ = java.util.Collections.emptyList();
      } else {
        mysqlTables_ = null;
        mysqlTablesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlDatabase_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlDatabase getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.MysqlDatabase.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlDatabase build() {
      com.google.cloud.datastream.v1.MysqlDatabase result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlDatabase buildPartial() {
      com.google.cloud.datastream.v1.MysqlDatabase result = new com.google.cloud.datastream.v1.MysqlDatabase(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datastream.v1.MysqlDatabase result) {
      if (mysqlTablesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          mysqlTables_ = java.util.Collections.unmodifiableList(mysqlTables_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.mysqlTables_ = mysqlTables_;
      } else {
        result.mysqlTables_ = mysqlTablesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datastream.v1.MysqlDatabase result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.database_ = database_;
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
      if (other instanceof com.google.cloud.datastream.v1.MysqlDatabase) {
        return mergeFrom((com.google.cloud.datastream.v1.MysqlDatabase)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.MysqlDatabase other) {
      if (other == com.google.cloud.datastream.v1.MysqlDatabase.getDefaultInstance()) return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (mysqlTablesBuilder_ == null) {
        if (!other.mysqlTables_.isEmpty()) {
          if (mysqlTables_.isEmpty()) {
            mysqlTables_ = other.mysqlTables_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMysqlTablesIsMutable();
            mysqlTables_.addAll(other.mysqlTables_);
          }
          onChanged();
        }
      } else {
        if (!other.mysqlTables_.isEmpty()) {
          if (mysqlTablesBuilder_.isEmpty()) {
            mysqlTablesBuilder_.dispose();
            mysqlTablesBuilder_ = null;
            mysqlTables_ = other.mysqlTables_;
            bitField0_ = (bitField0_ & ~0x00000002);
            mysqlTablesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMysqlTablesFieldBuilder() : null;
          } else {
            mysqlTablesBuilder_.addAllMessages(other.mysqlTables_);
          }
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
              database_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.datastream.v1.MysqlTable m =
                  input.readMessage(
                      com.google.cloud.datastream.v1.MysqlTable.parser(),
                      extensionRegistry);
              if (mysqlTablesBuilder_ == null) {
                ensureMysqlTablesIsMutable();
                mysqlTables_.add(m);
              } else {
                mysqlTablesBuilder_.addMessage(m);
              }
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

    private java.lang.Object database_ = "";
    /**
     * <pre>
     * Database name.
     * </pre>
     *
     * <code>string database = 1;</code>
     * @return The database.
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Database name.
     * </pre>
     *
     * <code>string database = 1;</code>
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString
        getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Database name.
     * </pre>
     *
     * <code>string database = 1;</code>
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      database_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Database name.
     * </pre>
     *
     * <code>string database = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {
      database_ = getDefaultInstance().getDatabase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Database name.
     * </pre>
     *
     * <code>string database = 1;</code>
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      database_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.datastream.v1.MysqlTable> mysqlTables_ =
      java.util.Collections.emptyList();
    private void ensureMysqlTablesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        mysqlTables_ = new java.util.ArrayList<com.google.cloud.datastream.v1.MysqlTable>(mysqlTables_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlTable, com.google.cloud.datastream.v1.MysqlTable.Builder, com.google.cloud.datastream.v1.MysqlTableOrBuilder> mysqlTablesBuilder_;

    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.MysqlTable> getMysqlTablesList() {
      if (mysqlTablesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mysqlTables_);
      } else {
        return mysqlTablesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public int getMysqlTablesCount() {
      if (mysqlTablesBuilder_ == null) {
        return mysqlTables_.size();
      } else {
        return mysqlTablesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlTable getMysqlTables(int index) {
      if (mysqlTablesBuilder_ == null) {
        return mysqlTables_.get(index);
      } else {
        return mysqlTablesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder setMysqlTables(
        int index, com.google.cloud.datastream.v1.MysqlTable value) {
      if (mysqlTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlTablesIsMutable();
        mysqlTables_.set(index, value);
        onChanged();
      } else {
        mysqlTablesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder setMysqlTables(
        int index, com.google.cloud.datastream.v1.MysqlTable.Builder builderForValue) {
      if (mysqlTablesBuilder_ == null) {
        ensureMysqlTablesIsMutable();
        mysqlTables_.set(index, builderForValue.build());
        onChanged();
      } else {
        mysqlTablesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder addMysqlTables(com.google.cloud.datastream.v1.MysqlTable value) {
      if (mysqlTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlTablesIsMutable();
        mysqlTables_.add(value);
        onChanged();
      } else {
        mysqlTablesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder addMysqlTables(
        int index, com.google.cloud.datastream.v1.MysqlTable value) {
      if (mysqlTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlTablesIsMutable();
        mysqlTables_.add(index, value);
        onChanged();
      } else {
        mysqlTablesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder addMysqlTables(
        com.google.cloud.datastream.v1.MysqlTable.Builder builderForValue) {
      if (mysqlTablesBuilder_ == null) {
        ensureMysqlTablesIsMutable();
        mysqlTables_.add(builderForValue.build());
        onChanged();
      } else {
        mysqlTablesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder addMysqlTables(
        int index, com.google.cloud.datastream.v1.MysqlTable.Builder builderForValue) {
      if (mysqlTablesBuilder_ == null) {
        ensureMysqlTablesIsMutable();
        mysqlTables_.add(index, builderForValue.build());
        onChanged();
      } else {
        mysqlTablesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder addAllMysqlTables(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1.MysqlTable> values) {
      if (mysqlTablesBuilder_ == null) {
        ensureMysqlTablesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mysqlTables_);
        onChanged();
      } else {
        mysqlTablesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder clearMysqlTables() {
      if (mysqlTablesBuilder_ == null) {
        mysqlTables_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        mysqlTablesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public Builder removeMysqlTables(int index) {
      if (mysqlTablesBuilder_ == null) {
        ensureMysqlTablesIsMutable();
        mysqlTables_.remove(index);
        onChanged();
      } else {
        mysqlTablesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlTable.Builder getMysqlTablesBuilder(
        int index) {
      return getMysqlTablesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlTableOrBuilder getMysqlTablesOrBuilder(
        int index) {
      if (mysqlTablesBuilder_ == null) {
        return mysqlTables_.get(index);  } else {
        return mysqlTablesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1.MysqlTableOrBuilder> 
         getMysqlTablesOrBuilderList() {
      if (mysqlTablesBuilder_ != null) {
        return mysqlTablesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mysqlTables_);
      }
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlTable.Builder addMysqlTablesBuilder() {
      return getMysqlTablesFieldBuilder().addBuilder(
          com.google.cloud.datastream.v1.MysqlTable.getDefaultInstance());
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlTable.Builder addMysqlTablesBuilder(
        int index) {
      return getMysqlTablesFieldBuilder().addBuilder(
          index, com.google.cloud.datastream.v1.MysqlTable.getDefaultInstance());
    }
    /**
     * <pre>
     * Tables in the database.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.MysqlTable.Builder> 
         getMysqlTablesBuilderList() {
      return getMysqlTablesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlTable, com.google.cloud.datastream.v1.MysqlTable.Builder, com.google.cloud.datastream.v1.MysqlTableOrBuilder> 
        getMysqlTablesFieldBuilder() {
      if (mysqlTablesBuilder_ == null) {
        mysqlTablesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.MysqlTable, com.google.cloud.datastream.v1.MysqlTable.Builder, com.google.cloud.datastream.v1.MysqlTableOrBuilder>(
                mysqlTables_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        mysqlTables_ = null;
      }
      return mysqlTablesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.MysqlDatabase)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.MysqlDatabase)
  private static final com.google.cloud.datastream.v1.MysqlDatabase DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.MysqlDatabase();
  }

  public static com.google.cloud.datastream.v1.MysqlDatabase getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlDatabase>
      PARSER = new com.google.protobuf.AbstractParser<MysqlDatabase>() {
    @java.lang.Override
    public MysqlDatabase parsePartialFrom(
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

  public static com.google.protobuf.Parser<MysqlDatabase> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlDatabase> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlDatabase getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

