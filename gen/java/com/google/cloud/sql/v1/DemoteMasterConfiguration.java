// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_resources.proto

package com.google.cloud.sql.v1;

/**
 * <pre>
 * Read-replica configuration for connecting to the on-premises primary
 * instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1.DemoteMasterConfiguration}
 */
public final class DemoteMasterConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1.DemoteMasterConfiguration)
    DemoteMasterConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DemoteMasterConfiguration.newBuilder() to construct.
  private DemoteMasterConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DemoteMasterConfiguration() {
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DemoteMasterConfiguration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_DemoteMasterConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_DemoteMasterConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1.DemoteMasterConfiguration.class, com.google.cloud.sql.v1.DemoteMasterConfiguration.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * This is always **sql#demoteMasterConfiguration**.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is always **sql#demoteMasterConfiguration**.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MYSQL_REPLICA_CONFIGURATION_FIELD_NUMBER = 2;
  private com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysqlReplicaConfiguration_;
  /**
   * <pre>
   * MySQL specific configuration when replicating from a MySQL on-premises
   * primary instance. Replication configuration information such as the
   * username, password, certificates, and keys are not stored in the instance
   * metadata. The configuration information is used only to set up the
   * replication connection and is stored by MySQL in a file named
   * **master.info** in the data directory.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
   * @return Whether the mysqlReplicaConfiguration field is set.
   */
  @java.lang.Override
  public boolean hasMysqlReplicaConfiguration() {
    return mysqlReplicaConfiguration_ != null;
  }
  /**
   * <pre>
   * MySQL specific configuration when replicating from a MySQL on-premises
   * primary instance. Replication configuration information such as the
   * username, password, certificates, and keys are not stored in the instance
   * metadata. The configuration information is used only to set up the
   * replication connection and is stored by MySQL in a file named
   * **master.info** in the data directory.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
   * @return The mysqlReplicaConfiguration.
   */
  @java.lang.Override
  public com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration getMysqlReplicaConfiguration() {
    return mysqlReplicaConfiguration_ == null ? com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.getDefaultInstance() : mysqlReplicaConfiguration_;
  }
  /**
   * <pre>
   * MySQL specific configuration when replicating from a MySQL on-premises
   * primary instance. Replication configuration information such as the
   * username, password, certificates, and keys are not stored in the instance
   * metadata. The configuration information is used only to set up the
   * replication connection and is stored by MySQL in a file named
   * **master.info** in the data directory.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfigurationOrBuilder getMysqlReplicaConfigurationOrBuilder() {
    return mysqlReplicaConfiguration_ == null ? com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.getDefaultInstance() : mysqlReplicaConfiguration_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (mysqlReplicaConfiguration_ != null) {
      output.writeMessage(2, getMysqlReplicaConfiguration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (mysqlReplicaConfiguration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMysqlReplicaConfiguration());
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
    if (!(obj instanceof com.google.cloud.sql.v1.DemoteMasterConfiguration)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1.DemoteMasterConfiguration other = (com.google.cloud.sql.v1.DemoteMasterConfiguration) obj;

    if (!getKind()
        .equals(other.getKind())) return false;
    if (hasMysqlReplicaConfiguration() != other.hasMysqlReplicaConfiguration()) return false;
    if (hasMysqlReplicaConfiguration()) {
      if (!getMysqlReplicaConfiguration()
          .equals(other.getMysqlReplicaConfiguration())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    if (hasMysqlReplicaConfiguration()) {
      hash = (37 * hash) + MYSQL_REPLICA_CONFIGURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMysqlReplicaConfiguration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1.DemoteMasterConfiguration parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1.DemoteMasterConfiguration prototype) {
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
   * Read-replica configuration for connecting to the on-premises primary
   * instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1.DemoteMasterConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1.DemoteMasterConfiguration)
      com.google.cloud.sql.v1.DemoteMasterConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_DemoteMasterConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_DemoteMasterConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1.DemoteMasterConfiguration.class, com.google.cloud.sql.v1.DemoteMasterConfiguration.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1.DemoteMasterConfiguration.newBuilder()
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
      kind_ = "";
      mysqlReplicaConfiguration_ = null;
      if (mysqlReplicaConfigurationBuilder_ != null) {
        mysqlReplicaConfigurationBuilder_.dispose();
        mysqlReplicaConfigurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1_DemoteMasterConfiguration_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.DemoteMasterConfiguration getDefaultInstanceForType() {
      return com.google.cloud.sql.v1.DemoteMasterConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.DemoteMasterConfiguration build() {
      com.google.cloud.sql.v1.DemoteMasterConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1.DemoteMasterConfiguration buildPartial() {
      com.google.cloud.sql.v1.DemoteMasterConfiguration result = new com.google.cloud.sql.v1.DemoteMasterConfiguration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1.DemoteMasterConfiguration result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mysqlReplicaConfiguration_ = mysqlReplicaConfigurationBuilder_ == null
            ? mysqlReplicaConfiguration_
            : mysqlReplicaConfigurationBuilder_.build();
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
      if (other instanceof com.google.cloud.sql.v1.DemoteMasterConfiguration) {
        return mergeFrom((com.google.cloud.sql.v1.DemoteMasterConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1.DemoteMasterConfiguration other) {
      if (other == com.google.cloud.sql.v1.DemoteMasterConfiguration.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMysqlReplicaConfiguration()) {
        mergeMysqlReplicaConfiguration(other.getMysqlReplicaConfiguration());
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
              kind_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMysqlReplicaConfigurationFieldBuilder().getBuilder(),
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

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * This is always **sql#demoteMasterConfiguration**.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is always **sql#demoteMasterConfiguration**.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is always **sql#demoteMasterConfiguration**.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always **sql#demoteMasterConfiguration**.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is always **sql#demoteMasterConfiguration**.
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysqlReplicaConfiguration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration, com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.Builder, com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfigurationOrBuilder> mysqlReplicaConfigurationBuilder_;
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     * @return Whether the mysqlReplicaConfiguration field is set.
     */
    public boolean hasMysqlReplicaConfiguration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     * @return The mysqlReplicaConfiguration.
     */
    public com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration getMysqlReplicaConfiguration() {
      if (mysqlReplicaConfigurationBuilder_ == null) {
        return mysqlReplicaConfiguration_ == null ? com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.getDefaultInstance() : mysqlReplicaConfiguration_;
      } else {
        return mysqlReplicaConfigurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    public Builder setMysqlReplicaConfiguration(com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration value) {
      if (mysqlReplicaConfigurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mysqlReplicaConfiguration_ = value;
      } else {
        mysqlReplicaConfigurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    public Builder setMysqlReplicaConfiguration(
        com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.Builder builderForValue) {
      if (mysqlReplicaConfigurationBuilder_ == null) {
        mysqlReplicaConfiguration_ = builderForValue.build();
      } else {
        mysqlReplicaConfigurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    public Builder mergeMysqlReplicaConfiguration(com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration value) {
      if (mysqlReplicaConfigurationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          mysqlReplicaConfiguration_ != null &&
          mysqlReplicaConfiguration_ != com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.getDefaultInstance()) {
          getMysqlReplicaConfigurationBuilder().mergeFrom(value);
        } else {
          mysqlReplicaConfiguration_ = value;
        }
      } else {
        mysqlReplicaConfigurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    public Builder clearMysqlReplicaConfiguration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mysqlReplicaConfiguration_ = null;
      if (mysqlReplicaConfigurationBuilder_ != null) {
        mysqlReplicaConfigurationBuilder_.dispose();
        mysqlReplicaConfigurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    public com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.Builder getMysqlReplicaConfigurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMysqlReplicaConfigurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    public com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfigurationOrBuilder getMysqlReplicaConfigurationOrBuilder() {
      if (mysqlReplicaConfigurationBuilder_ != null) {
        return mysqlReplicaConfigurationBuilder_.getMessageOrBuilder();
      } else {
        return mysqlReplicaConfiguration_ == null ?
            com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.getDefaultInstance() : mysqlReplicaConfiguration_;
      }
    }
    /**
     * <pre>
     * MySQL specific configuration when replicating from a MySQL on-premises
     * primary instance. Replication configuration information such as the
     * username, password, certificates, and keys are not stored in the instance
     * metadata. The configuration information is used only to set up the
     * replication connection and is stored by MySQL in a file named
     * **master.info** in the data directory.
     * </pre>
     *
     * <code>.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration mysql_replica_configuration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration, com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.Builder, com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfigurationOrBuilder> 
        getMysqlReplicaConfigurationFieldBuilder() {
      if (mysqlReplicaConfigurationBuilder_ == null) {
        mysqlReplicaConfigurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration, com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfiguration.Builder, com.google.cloud.sql.v1.DemoteMasterMySqlReplicaConfigurationOrBuilder>(
                getMysqlReplicaConfiguration(),
                getParentForChildren(),
                isClean());
        mysqlReplicaConfiguration_ = null;
      }
      return mysqlReplicaConfigurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1.DemoteMasterConfiguration)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1.DemoteMasterConfiguration)
  private static final com.google.cloud.sql.v1.DemoteMasterConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1.DemoteMasterConfiguration();
  }

  public static com.google.cloud.sql.v1.DemoteMasterConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DemoteMasterConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<DemoteMasterConfiguration>() {
    @java.lang.Override
    public DemoteMasterConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<DemoteMasterConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DemoteMasterConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1.DemoteMasterConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

