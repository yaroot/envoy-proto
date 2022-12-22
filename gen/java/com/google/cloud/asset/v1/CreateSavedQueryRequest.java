// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 * <pre>
 * Request to create a saved query.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.CreateSavedQueryRequest}
 */
public final class CreateSavedQueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.CreateSavedQueryRequest)
    CreateSavedQueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSavedQueryRequest.newBuilder() to construct.
  private CreateSavedQueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSavedQueryRequest() {
    parent_ = "";
    savedQueryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSavedQueryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateSavedQueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateSavedQueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.CreateSavedQueryRequest.class, com.google.cloud.asset.v1.CreateSavedQueryRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The name of the project/folder/organization where this saved_query
   * should be created in. It can only be an organization number (such as
   * "organizations/123"), a folder number (such as "folders/123"), a project ID
   * (such as "projects/my-project-id")", or a project number (such as
   * "projects/12345").
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the project/folder/organization where this saved_query
   * should be created in. It can only be an organization number (such as
   * "organizations/123"), a folder number (such as "folders/123"), a project ID
   * (such as "projects/my-project-id")", or a project number (such as
   * "projects/12345").
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAVED_QUERY_FIELD_NUMBER = 2;
  private com.google.cloud.asset.v1.SavedQuery savedQuery_;
  /**
   * <pre>
   * Required. The saved_query details. The `name` field must be empty as it will be
   * generated based on the parent and saved_query_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the savedQuery field is set.
   */
  @java.lang.Override
  public boolean hasSavedQuery() {
    return savedQuery_ != null;
  }
  /**
   * <pre>
   * Required. The saved_query details. The `name` field must be empty as it will be
   * generated based on the parent and saved_query_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The savedQuery.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.SavedQuery getSavedQuery() {
    return savedQuery_ == null ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance() : savedQuery_;
  }
  /**
   * <pre>
   * Required. The saved_query details. The `name` field must be empty as it will be
   * generated based on the parent and saved_query_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueryOrBuilder() {
    return savedQuery_ == null ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance() : savedQuery_;
  }

  public static final int SAVED_QUERY_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object savedQueryId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the saved query, which must be unique in the specified
   * parent. It will become the final component of the saved query's resource
   * name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Notice that this field is required in the saved query creation, and the
   * `name` field of the `saved_query` will be ignored.
   * </pre>
   *
   * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The savedQueryId.
   */
  @java.lang.Override
  public java.lang.String getSavedQueryId() {
    java.lang.Object ref = savedQueryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      savedQueryId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the saved query, which must be unique in the specified
   * parent. It will become the final component of the saved query's resource
   * name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Notice that this field is required in the saved query creation, and the
   * `name` field of the `saved_query` will be ignored.
   * </pre>
   *
   * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for savedQueryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSavedQueryIdBytes() {
    java.lang.Object ref = savedQueryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      savedQueryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (savedQuery_ != null) {
      output.writeMessage(2, getSavedQuery());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(savedQueryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, savedQueryId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (savedQuery_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSavedQuery());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(savedQueryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, savedQueryId_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.CreateSavedQueryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.CreateSavedQueryRequest other = (com.google.cloud.asset.v1.CreateSavedQueryRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSavedQuery() != other.hasSavedQuery()) return false;
    if (hasSavedQuery()) {
      if (!getSavedQuery()
          .equals(other.getSavedQuery())) return false;
    }
    if (!getSavedQueryId()
        .equals(other.getSavedQueryId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSavedQuery()) {
      hash = (37 * hash) + SAVED_QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getSavedQuery().hashCode();
    }
    hash = (37 * hash) + SAVED_QUERY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSavedQueryId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.CreateSavedQueryRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1.CreateSavedQueryRequest prototype) {
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
   * Request to create a saved query.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.CreateSavedQueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.CreateSavedQueryRequest)
      com.google.cloud.asset.v1.CreateSavedQueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateSavedQueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateSavedQueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.CreateSavedQueryRequest.class, com.google.cloud.asset.v1.CreateSavedQueryRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.CreateSavedQueryRequest.newBuilder()
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
      parent_ = "";
      savedQuery_ = null;
      if (savedQueryBuilder_ != null) {
        savedQueryBuilder_.dispose();
        savedQueryBuilder_ = null;
      }
      savedQueryId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateSavedQueryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.CreateSavedQueryRequest getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.CreateSavedQueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.CreateSavedQueryRequest build() {
      com.google.cloud.asset.v1.CreateSavedQueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.CreateSavedQueryRequest buildPartial() {
      com.google.cloud.asset.v1.CreateSavedQueryRequest result = new com.google.cloud.asset.v1.CreateSavedQueryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.CreateSavedQueryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.savedQuery_ = savedQueryBuilder_ == null
            ? savedQuery_
            : savedQueryBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.savedQueryId_ = savedQueryId_;
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
      if (other instanceof com.google.cloud.asset.v1.CreateSavedQueryRequest) {
        return mergeFrom((com.google.cloud.asset.v1.CreateSavedQueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.CreateSavedQueryRequest other) {
      if (other == com.google.cloud.asset.v1.CreateSavedQueryRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSavedQuery()) {
        mergeSavedQuery(other.getSavedQuery());
      }
      if (!other.getSavedQueryId().isEmpty()) {
        savedQueryId_ = other.savedQueryId_;
        bitField0_ |= 0x00000004;
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSavedQueryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              savedQueryId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the project/folder/organization where this saved_query
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the project/folder/organization where this saved_query
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the project/folder/organization where this saved_query
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the project/folder/organization where this saved_query
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the project/folder/organization where this saved_query
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.asset.v1.SavedQuery savedQuery_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1.SavedQuery, com.google.cloud.asset.v1.SavedQuery.Builder, com.google.cloud.asset.v1.SavedQueryOrBuilder> savedQueryBuilder_;
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the savedQuery field is set.
     */
    public boolean hasSavedQuery() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The savedQuery.
     */
    public com.google.cloud.asset.v1.SavedQuery getSavedQuery() {
      if (savedQueryBuilder_ == null) {
        return savedQuery_ == null ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance() : savedQuery_;
      } else {
        return savedQueryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSavedQuery(com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        savedQuery_ = value;
      } else {
        savedQueryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSavedQuery(
        com.google.cloud.asset.v1.SavedQuery.Builder builderForValue) {
      if (savedQueryBuilder_ == null) {
        savedQuery_ = builderForValue.build();
      } else {
        savedQueryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSavedQuery(com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          savedQuery_ != null &&
          savedQuery_ != com.google.cloud.asset.v1.SavedQuery.getDefaultInstance()) {
          getSavedQueryBuilder().mergeFrom(value);
        } else {
          savedQuery_ = value;
        }
      } else {
        savedQueryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSavedQuery() {
      bitField0_ = (bitField0_ & ~0x00000002);
      savedQuery_ = null;
      if (savedQueryBuilder_ != null) {
        savedQueryBuilder_.dispose();
        savedQueryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.asset.v1.SavedQuery.Builder getSavedQueryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSavedQueryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueryOrBuilder() {
      if (savedQueryBuilder_ != null) {
        return savedQueryBuilder_.getMessageOrBuilder();
      } else {
        return savedQuery_ == null ?
            com.google.cloud.asset.v1.SavedQuery.getDefaultInstance() : savedQuery_;
      }
    }
    /**
     * <pre>
     * Required. The saved_query details. The `name` field must be empty as it will be
     * generated based on the parent and saved_query_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1.SavedQuery, com.google.cloud.asset.v1.SavedQuery.Builder, com.google.cloud.asset.v1.SavedQueryOrBuilder> 
        getSavedQueryFieldBuilder() {
      if (savedQueryBuilder_ == null) {
        savedQueryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.SavedQuery, com.google.cloud.asset.v1.SavedQuery.Builder, com.google.cloud.asset.v1.SavedQueryOrBuilder>(
                getSavedQuery(),
                getParentForChildren(),
                isClean());
        savedQuery_ = null;
      }
      return savedQueryBuilder_;
    }

    private java.lang.Object savedQueryId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the saved query, which must be unique in the specified
     * parent. It will become the final component of the saved query's resource
     * name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Notice that this field is required in the saved query creation, and the
     * `name` field of the `saved_query` will be ignored.
     * </pre>
     *
     * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The savedQueryId.
     */
    public java.lang.String getSavedQueryId() {
      java.lang.Object ref = savedQueryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        savedQueryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the saved query, which must be unique in the specified
     * parent. It will become the final component of the saved query's resource
     * name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Notice that this field is required in the saved query creation, and the
     * `name` field of the `saved_query` will be ignored.
     * </pre>
     *
     * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for savedQueryId.
     */
    public com.google.protobuf.ByteString
        getSavedQueryIdBytes() {
      java.lang.Object ref = savedQueryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        savedQueryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the saved query, which must be unique in the specified
     * parent. It will become the final component of the saved query's resource
     * name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Notice that this field is required in the saved query creation, and the
     * `name` field of the `saved_query` will be ignored.
     * </pre>
     *
     * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The savedQueryId to set.
     * @return This builder for chaining.
     */
    public Builder setSavedQueryId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      savedQueryId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the saved query, which must be unique in the specified
     * parent. It will become the final component of the saved query's resource
     * name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Notice that this field is required in the saved query creation, and the
     * `name` field of the `saved_query` will be ignored.
     * </pre>
     *
     * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSavedQueryId() {
      savedQueryId_ = getDefaultInstance().getSavedQueryId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the saved query, which must be unique in the specified
     * parent. It will become the final component of the saved query's resource
     * name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Notice that this field is required in the saved query creation, and the
     * `name` field of the `saved_query` will be ignored.
     * </pre>
     *
     * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for savedQueryId to set.
     * @return This builder for chaining.
     */
    public Builder setSavedQueryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      savedQueryId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.CreateSavedQueryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.CreateSavedQueryRequest)
  private static final com.google.cloud.asset.v1.CreateSavedQueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.CreateSavedQueryRequest();
  }

  public static com.google.cloud.asset.v1.CreateSavedQueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSavedQueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSavedQueryRequest>() {
    @java.lang.Override
    public CreateSavedQueryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSavedQueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSavedQueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.CreateSavedQueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
