// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/connectors/v1/connection.proto

package com.google.cloud.connectors.v1;

/**
 * <pre>
 * Metadata of connection schema.
 * </pre>
 *
 * Protobuf type {@code google.cloud.connectors.v1.ConnectionSchemaMetadata}
 */
public final class ConnectionSchemaMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.connectors.v1.ConnectionSchemaMetadata)
    ConnectionSchemaMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectionSchemaMetadata.newBuilder() to construct.
  private ConnectionSchemaMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectionSchemaMetadata() {
    entities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    actions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectionSchemaMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_ConnectionSchemaMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_ConnectionSchemaMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.connectors.v1.ConnectionSchemaMetadata.class, com.google.cloud.connectors.v1.ConnectionSchemaMetadata.Builder.class);
  }

  public static final int ENTITIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList entities_;
  /**
   * <pre>
   * Output only. List of entity names.
   * </pre>
   *
   * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the entities.
   */
  public com.google.protobuf.ProtocolStringList
      getEntitiesList() {
    return entities_;
  }
  /**
   * <pre>
   * Output only. List of entity names.
   * </pre>
   *
   * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of entities.
   */
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   * <pre>
   * Output only. List of entity names.
   * </pre>
   *
   * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The entities at the given index.
   */
  public java.lang.String getEntities(int index) {
    return entities_.get(index);
  }
  /**
   * <pre>
   * Output only. List of entity names.
   * </pre>
   *
   * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entities at the given index.
   */
  public com.google.protobuf.ByteString
      getEntitiesBytes(int index) {
    return entities_.getByteString(index);
  }

  public static final int ACTIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList actions_;
  /**
   * <pre>
   * Output only. List of actions.
   * </pre>
   *
   * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the actions.
   */
  public com.google.protobuf.ProtocolStringList
      getActionsList() {
    return actions_;
  }
  /**
   * <pre>
   * Output only. List of actions.
   * </pre>
   *
   * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of actions.
   */
  public int getActionsCount() {
    return actions_.size();
  }
  /**
   * <pre>
   * Output only. List of actions.
   * </pre>
   *
   * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The actions at the given index.
   */
  public java.lang.String getActions(int index) {
    return actions_.get(index);
  }
  /**
   * <pre>
   * Output only. List of actions.
   * </pre>
   *
   * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the actions at the given index.
   */
  public com.google.protobuf.ByteString
      getActionsBytes(int index) {
    return actions_.getByteString(index);
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
    for (int i = 0; i < entities_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entities_.getRaw(i));
    }
    for (int i = 0; i < actions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actions_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < entities_.size(); i++) {
        dataSize += computeStringSizeNoTag(entities_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntitiesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < actions_.size(); i++) {
        dataSize += computeStringSizeNoTag(actions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getActionsList().size();
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
    if (!(obj instanceof com.google.cloud.connectors.v1.ConnectionSchemaMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.connectors.v1.ConnectionSchemaMetadata other = (com.google.cloud.connectors.v1.ConnectionSchemaMetadata) obj;

    if (!getEntitiesList()
        .equals(other.getEntitiesList())) return false;
    if (!getActionsList()
        .equals(other.getActionsList())) return false;
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
    if (getEntitiesCount() > 0) {
      hash = (37 * hash) + ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntitiesList().hashCode();
    }
    if (getActionsCount() > 0) {
      hash = (37 * hash) + ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.connectors.v1.ConnectionSchemaMetadata prototype) {
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
   * Metadata of connection schema.
   * </pre>
   *
   * Protobuf type {@code google.cloud.connectors.v1.ConnectionSchemaMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.connectors.v1.ConnectionSchemaMetadata)
      com.google.cloud.connectors.v1.ConnectionSchemaMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_ConnectionSchemaMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_ConnectionSchemaMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.connectors.v1.ConnectionSchemaMetadata.class, com.google.cloud.connectors.v1.ConnectionSchemaMetadata.Builder.class);
    }

    // Construct using com.google.cloud.connectors.v1.ConnectionSchemaMetadata.newBuilder()
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
      entities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      actions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.connectors.v1.ConnectionProto.internal_static_google_cloud_connectors_v1_ConnectionSchemaMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.ConnectionSchemaMetadata getDefaultInstanceForType() {
      return com.google.cloud.connectors.v1.ConnectionSchemaMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.ConnectionSchemaMetadata build() {
      com.google.cloud.connectors.v1.ConnectionSchemaMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.connectors.v1.ConnectionSchemaMetadata buildPartial() {
      com.google.cloud.connectors.v1.ConnectionSchemaMetadata result = new com.google.cloud.connectors.v1.ConnectionSchemaMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.connectors.v1.ConnectionSchemaMetadata result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        entities_ = entities_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.entities_ = entities_;
      if (((bitField0_ & 0x00000002) != 0)) {
        actions_ = actions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.actions_ = actions_;
    }

    private void buildPartial0(com.google.cloud.connectors.v1.ConnectionSchemaMetadata result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.connectors.v1.ConnectionSchemaMetadata) {
        return mergeFrom((com.google.cloud.connectors.v1.ConnectionSchemaMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.connectors.v1.ConnectionSchemaMetadata other) {
      if (other == com.google.cloud.connectors.v1.ConnectionSchemaMetadata.getDefaultInstance()) return this;
      if (!other.entities_.isEmpty()) {
        if (entities_.isEmpty()) {
          entities_ = other.entities_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEntitiesIsMutable();
          entities_.addAll(other.entities_);
        }
        onChanged();
      }
      if (!other.actions_.isEmpty()) {
        if (actions_.isEmpty()) {
          actions_ = other.actions_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureActionsIsMutable();
          actions_.addAll(other.actions_);
        }
        onChanged();
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureEntitiesIsMutable();
              entities_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureActionsIsMutable();
              actions_.add(s);
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

    private com.google.protobuf.LazyStringList entities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entities_ = new com.google.protobuf.LazyStringArrayList(entities_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return A list containing the entities.
     */
    public com.google.protobuf.ProtocolStringList
        getEntitiesList() {
      return entities_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The count of entities.
     */
    public int getEntitiesCount() {
      return entities_.size();
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the element to return.
     * @return The entities at the given index.
     */
    public java.lang.String getEntities(int index) {
      return entities_.get(index);
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the value to return.
     * @return The bytes of the entities at the given index.
     */
    public com.google.protobuf.ByteString
        getEntitiesBytes(int index) {
      return entities_.getByteString(index);
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index to set the value at.
     * @param value The entities to set.
     * @return This builder for chaining.
     */
    public Builder setEntities(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntitiesIsMutable();
      entities_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The entities to add.
     * @return This builder for chaining.
     */
    public Builder addEntities(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntitiesIsMutable();
      entities_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param values The entities to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntities(
        java.lang.Iterable<java.lang.String> values) {
      ensureEntitiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, entities_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntities() {
      entities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of entity names.
     * </pre>
     *
     * <code>repeated string entities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes of the entities to add.
     * @return This builder for chaining.
     */
    public Builder addEntitiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEntitiesIsMutable();
      entities_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList actions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureActionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        actions_ = new com.google.protobuf.LazyStringArrayList(actions_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return A list containing the actions.
     */
    public com.google.protobuf.ProtocolStringList
        getActionsList() {
      return actions_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The count of actions.
     */
    public int getActionsCount() {
      return actions_.size();
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the element to return.
     * @return The actions at the given index.
     */
    public java.lang.String getActions(int index) {
      return actions_.get(index);
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the value to return.
     * @return The bytes of the actions at the given index.
     */
    public com.google.protobuf.ByteString
        getActionsBytes(int index) {
      return actions_.getByteString(index);
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index to set the value at.
     * @param value The actions to set.
     * @return This builder for chaining.
     */
    public Builder setActions(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureActionsIsMutable();
      actions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The actions to add.
     * @return This builder for chaining.
     */
    public Builder addActions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureActionsIsMutable();
      actions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param values The actions to add.
     * @return This builder for chaining.
     */
    public Builder addAllActions(
        java.lang.Iterable<java.lang.String> values) {
      ensureActionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, actions_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearActions() {
      actions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of actions.
     * </pre>
     *
     * <code>repeated string actions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes of the actions to add.
     * @return This builder for chaining.
     */
    public Builder addActionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureActionsIsMutable();
      actions_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.connectors.v1.ConnectionSchemaMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.connectors.v1.ConnectionSchemaMetadata)
  private static final com.google.cloud.connectors.v1.ConnectionSchemaMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.connectors.v1.ConnectionSchemaMetadata();
  }

  public static com.google.cloud.connectors.v1.ConnectionSchemaMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectionSchemaMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ConnectionSchemaMetadata>() {
    @java.lang.Override
    public ConnectionSchemaMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectionSchemaMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionSchemaMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.connectors.v1.ConnectionSchemaMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
