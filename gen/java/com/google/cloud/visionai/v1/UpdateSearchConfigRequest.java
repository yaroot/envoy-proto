// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/warehouse.proto

package com.google.cloud.visionai.v1;

/**
 * <pre>
 * Request message for UpdateSearchConfig.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.UpdateSearchConfigRequest}
 */
public final class UpdateSearchConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.UpdateSearchConfigRequest)
    UpdateSearchConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSearchConfigRequest.newBuilder() to construct.
  private UpdateSearchConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSearchConfigRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSearchConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto.internal_static_google_cloud_visionai_v1_UpdateSearchConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto.internal_static_google_cloud_visionai_v1_UpdateSearchConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.UpdateSearchConfigRequest.class, com.google.cloud.visionai.v1.UpdateSearchConfigRequest.Builder.class);
  }

  public static final int SEARCH_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.visionai.v1.SearchConfig searchConfig_;
  /**
   * <pre>
   * Required. The search configuration to update.
   * The search configuration's `name` field is used to identify the resource to
   * be updated. Format:
   * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the searchConfig field is set.
   */
  @java.lang.Override
  public boolean hasSearchConfig() {
    return searchConfig_ != null;
  }
  /**
   * <pre>
   * Required. The search configuration to update.
   * The search configuration's `name` field is used to identify the resource to
   * be updated. Format:
   * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The searchConfig.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchConfig getSearchConfig() {
    return searchConfig_ == null ? com.google.cloud.visionai.v1.SearchConfig.getDefaultInstance() : searchConfig_;
  }
  /**
   * <pre>
   * Required. The search configuration to update.
   * The search configuration's `name` field is used to identify the resource to
   * be updated. Format:
   * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchConfigOrBuilder getSearchConfigOrBuilder() {
    return searchConfig_ == null ? com.google.cloud.visionai.v1.SearchConfig.getDefaultInstance() : searchConfig_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to be updated. If left unset, all field paths will be
   * updated/overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to be updated. If left unset, all field paths will be
   * updated/overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to be updated. If left unset, all field paths will be
   * updated/overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (searchConfig_ != null) {
      output.writeMessage(1, getSearchConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (searchConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSearchConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.UpdateSearchConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.UpdateSearchConfigRequest other = (com.google.cloud.visionai.v1.UpdateSearchConfigRequest) obj;

    if (hasSearchConfig() != other.hasSearchConfig()) return false;
    if (hasSearchConfig()) {
      if (!getSearchConfig()
          .equals(other.getSearchConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasSearchConfig()) {
      hash = (37 * hash) + SEARCH_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSearchConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.visionai.v1.UpdateSearchConfigRequest prototype) {
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
   * Request message for UpdateSearchConfig.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.UpdateSearchConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.UpdateSearchConfigRequest)
      com.google.cloud.visionai.v1.UpdateSearchConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto.internal_static_google_cloud_visionai_v1_UpdateSearchConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto.internal_static_google_cloud_visionai_v1_UpdateSearchConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.UpdateSearchConfigRequest.class, com.google.cloud.visionai.v1.UpdateSearchConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.UpdateSearchConfigRequest.newBuilder()
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
      searchConfig_ = null;
      if (searchConfigBuilder_ != null) {
        searchConfigBuilder_.dispose();
        searchConfigBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto.internal_static_google_cloud_visionai_v1_UpdateSearchConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateSearchConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.UpdateSearchConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateSearchConfigRequest build() {
      com.google.cloud.visionai.v1.UpdateSearchConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateSearchConfigRequest buildPartial() {
      com.google.cloud.visionai.v1.UpdateSearchConfigRequest result = new com.google.cloud.visionai.v1.UpdateSearchConfigRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.UpdateSearchConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.searchConfig_ = searchConfigBuilder_ == null
            ? searchConfig_
            : searchConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.UpdateSearchConfigRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.UpdateSearchConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.UpdateSearchConfigRequest other) {
      if (other == com.google.cloud.visionai.v1.UpdateSearchConfigRequest.getDefaultInstance()) return this;
      if (other.hasSearchConfig()) {
        mergeSearchConfig(other.getSearchConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getSearchConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.visionai.v1.SearchConfig searchConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.visionai.v1.SearchConfig, com.google.cloud.visionai.v1.SearchConfig.Builder, com.google.cloud.visionai.v1.SearchConfigOrBuilder> searchConfigBuilder_;
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the searchConfig field is set.
     */
    public boolean hasSearchConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The searchConfig.
     */
    public com.google.cloud.visionai.v1.SearchConfig getSearchConfig() {
      if (searchConfigBuilder_ == null) {
        return searchConfig_ == null ? com.google.cloud.visionai.v1.SearchConfig.getDefaultInstance() : searchConfig_;
      } else {
        return searchConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSearchConfig(com.google.cloud.visionai.v1.SearchConfig value) {
      if (searchConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchConfig_ = value;
      } else {
        searchConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSearchConfig(
        com.google.cloud.visionai.v1.SearchConfig.Builder builderForValue) {
      if (searchConfigBuilder_ == null) {
        searchConfig_ = builderForValue.build();
      } else {
        searchConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSearchConfig(com.google.cloud.visionai.v1.SearchConfig value) {
      if (searchConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          searchConfig_ != null &&
          searchConfig_ != com.google.cloud.visionai.v1.SearchConfig.getDefaultInstance()) {
          getSearchConfigBuilder().mergeFrom(value);
        } else {
          searchConfig_ = value;
        }
      } else {
        searchConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSearchConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      searchConfig_ = null;
      if (searchConfigBuilder_ != null) {
        searchConfigBuilder_.dispose();
        searchConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.visionai.v1.SearchConfig.Builder getSearchConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSearchConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.visionai.v1.SearchConfigOrBuilder getSearchConfigOrBuilder() {
      if (searchConfigBuilder_ != null) {
        return searchConfigBuilder_.getMessageOrBuilder();
      } else {
        return searchConfig_ == null ?
            com.google.cloud.visionai.v1.SearchConfig.getDefaultInstance() : searchConfig_;
      }
    }
    /**
     * <pre>
     * Required. The search configuration to update.
     * The search configuration's `name` field is used to identify the resource to
     * be updated. Format:
     * projects/{project_number}/locations/{location}/corpora/{corpus}/searchConfigs/{search_config}
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.SearchConfig search_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.visionai.v1.SearchConfig, com.google.cloud.visionai.v1.SearchConfig.Builder, com.google.cloud.visionai.v1.SearchConfigOrBuilder> 
        getSearchConfigFieldBuilder() {
      if (searchConfigBuilder_ == null) {
        searchConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.SearchConfig, com.google.cloud.visionai.v1.SearchConfig.Builder, com.google.cloud.visionai.v1.SearchConfigOrBuilder>(
                getSearchConfig(),
                getParentForChildren(),
                isClean());
        searchConfig_ = null;
      }
      return searchConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The list of fields to be updated. If left unset, all field paths will be
     * updated/overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.UpdateSearchConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.UpdateSearchConfigRequest)
  private static final com.google.cloud.visionai.v1.UpdateSearchConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.UpdateSearchConfigRequest();
  }

  public static com.google.cloud.visionai.v1.UpdateSearchConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSearchConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSearchConfigRequest>() {
    @java.lang.Override
    public UpdateSearchConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSearchConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSearchConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.UpdateSearchConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
