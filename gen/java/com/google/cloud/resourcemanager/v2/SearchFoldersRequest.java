// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v2/folders.proto

package com.google.cloud.resourcemanager.v2;

/**
 * <pre>
 * The request message for searching folders.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v2.SearchFoldersRequest}
 */
public final class SearchFoldersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v2.SearchFoldersRequest)
    SearchFoldersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchFoldersRequest.newBuilder() to construct.
  private SearchFoldersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchFoldersRequest() {
    pageToken_ = "";
    query_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchFoldersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.resourcemanager.v2.FoldersProto.internal_static_google_cloud_resourcemanager_v2_SearchFoldersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v2.FoldersProto.internal_static_google_cloud_resourcemanager_v2_SearchFoldersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v2.SearchFoldersRequest.class, com.google.cloud.resourcemanager.v2.SearchFoldersRequest.Builder.class);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 1;
  private int pageSize_ = 0;
  /**
   * <pre>
   * Optional. The maximum number of folders to return in the response.
   * </pre>
   *
   * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   * <pre>
   * Optional. A pagination token returned from a previous call to `SearchFolders`
   * that indicates from where search should continue.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. A pagination token returned from a previous call to `SearchFolders`
   * that indicates from where search should continue.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object query_ = "";
  /**
   * <pre>
   * Search criteria used to select the Folders to return.
   * If no search criteria is specified then all accessible folders will be
   * returned.
   * Query expressions can be used to restrict results based upon displayName,
   * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
   * can be used along with the suffix wildcard symbol `*`.
   * The displayName field in a query expression should use escaped quotes
   * for values that include whitespace to prevent unexpected behavior.
   * Some example queries are:
   * * Query `displayName=Test*` returns Folder resources whose display name
   * starts with "Test".
   * * Query `lifecycleState=ACTIVE` returns Folder resources with
   * `lifecycleState` set to `ACTIVE`.
   * * Query `parent=folders/123` returns Folder resources that have
   * `folders/123` as a parent resource.
   * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
   * Folder resources that have `folders/123` as a parent resource.
   * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
   * display names that include both "Test" and "String".
   * </pre>
   *
   * <code>string query = 3;</code>
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Search criteria used to select the Folders to return.
   * If no search criteria is specified then all accessible folders will be
   * returned.
   * Query expressions can be used to restrict results based upon displayName,
   * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
   * can be used along with the suffix wildcard symbol `*`.
   * The displayName field in a query expression should use escaped quotes
   * for values that include whitespace to prevent unexpected behavior.
   * Some example queries are:
   * * Query `displayName=Test*` returns Folder resources whose display name
   * starts with "Test".
   * * Query `lifecycleState=ACTIVE` returns Folder resources with
   * `lifecycleState` set to `ACTIVE`.
   * * Query `parent=folders/123` returns Folder resources that have
   * `folders/123` as a parent resource.
   * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
   * Folder resources that have `folders/123` as a parent resource.
   * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
   * display names that include both "Test" and "String".
   * </pre>
   *
   * <code>string query = 3;</code>
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
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
    if (pageSize_ != 0) {
      output.writeInt32(1, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, query_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, query_);
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v2.SearchFoldersRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v2.SearchFoldersRequest other = (com.google.cloud.resourcemanager.v2.SearchFoldersRequest) obj;

    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (!getQuery()
        .equals(other.getQuery())) return false;
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.resourcemanager.v2.SearchFoldersRequest prototype) {
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
   * The request message for searching folders.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v2.SearchFoldersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v2.SearchFoldersRequest)
      com.google.cloud.resourcemanager.v2.SearchFoldersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.resourcemanager.v2.FoldersProto.internal_static_google_cloud_resourcemanager_v2_SearchFoldersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v2.FoldersProto.internal_static_google_cloud_resourcemanager_v2_SearchFoldersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v2.SearchFoldersRequest.class, com.google.cloud.resourcemanager.v2.SearchFoldersRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v2.SearchFoldersRequest.newBuilder()
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
      pageSize_ = 0;
      pageToken_ = "";
      query_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.resourcemanager.v2.FoldersProto.internal_static_google_cloud_resourcemanager_v2_SearchFoldersRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v2.SearchFoldersRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v2.SearchFoldersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v2.SearchFoldersRequest build() {
      com.google.cloud.resourcemanager.v2.SearchFoldersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v2.SearchFoldersRequest buildPartial() {
      com.google.cloud.resourcemanager.v2.SearchFoldersRequest result = new com.google.cloud.resourcemanager.v2.SearchFoldersRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v2.SearchFoldersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.query_ = query_;
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
      if (other instanceof com.google.cloud.resourcemanager.v2.SearchFoldersRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v2.SearchFoldersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v2.SearchFoldersRequest other) {
      if (other == com.google.cloud.resourcemanager.v2.SearchFoldersRequest.getDefaultInstance()) return this;
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
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
            case 8: {
              pageSize_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              pageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              query_ = input.readStringRequireUtf8();
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

    private int pageSize_ ;
    /**
     * <pre>
     * Optional. The maximum number of folders to return in the response.
     * </pre>
     *
     * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Optional. The maximum number of folders to return in the response.
     * </pre>
     *
     * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The maximum number of folders to return in the response.
     * </pre>
     *
     * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * Optional. A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where search should continue.
     * </pre>
     *
     * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where search should continue.
     * </pre>
     *
     * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where search should continue.
     * </pre>
     *
     * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where search should continue.
     * </pre>
     *
     * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where search should continue.
     * </pre>
     *
     * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     * Search criteria used to select the Folders to return.
     * If no search criteria is specified then all accessible folders will be
     * returned.
     * Query expressions can be used to restrict results based upon displayName,
     * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
     * can be used along with the suffix wildcard symbol `*`.
     * The displayName field in a query expression should use escaped quotes
     * for values that include whitespace to prevent unexpected behavior.
     * Some example queries are:
     * * Query `displayName=Test*` returns Folder resources whose display name
     * starts with "Test".
     * * Query `lifecycleState=ACTIVE` returns Folder resources with
     * `lifecycleState` set to `ACTIVE`.
     * * Query `parent=folders/123` returns Folder resources that have
     * `folders/123` as a parent resource.
     * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
     * Folder resources that have `folders/123` as a parent resource.
     * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
     * display names that include both "Test" and "String".
     * </pre>
     *
     * <code>string query = 3;</code>
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Search criteria used to select the Folders to return.
     * If no search criteria is specified then all accessible folders will be
     * returned.
     * Query expressions can be used to restrict results based upon displayName,
     * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
     * can be used along with the suffix wildcard symbol `*`.
     * The displayName field in a query expression should use escaped quotes
     * for values that include whitespace to prevent unexpected behavior.
     * Some example queries are:
     * * Query `displayName=Test*` returns Folder resources whose display name
     * starts with "Test".
     * * Query `lifecycleState=ACTIVE` returns Folder resources with
     * `lifecycleState` set to `ACTIVE`.
     * * Query `parent=folders/123` returns Folder resources that have
     * `folders/123` as a parent resource.
     * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
     * Folder resources that have `folders/123` as a parent resource.
     * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
     * display names that include both "Test" and "String".
     * </pre>
     *
     * <code>string query = 3;</code>
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Search criteria used to select the Folders to return.
     * If no search criteria is specified then all accessible folders will be
     * returned.
     * Query expressions can be used to restrict results based upon displayName,
     * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
     * can be used along with the suffix wildcard symbol `*`.
     * The displayName field in a query expression should use escaped quotes
     * for values that include whitespace to prevent unexpected behavior.
     * Some example queries are:
     * * Query `displayName=Test*` returns Folder resources whose display name
     * starts with "Test".
     * * Query `lifecycleState=ACTIVE` returns Folder resources with
     * `lifecycleState` set to `ACTIVE`.
     * * Query `parent=folders/123` returns Folder resources that have
     * `folders/123` as a parent resource.
     * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
     * Folder resources that have `folders/123` as a parent resource.
     * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
     * display names that include both "Test" and "String".
     * </pre>
     *
     * <code>string query = 3;</code>
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      query_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Search criteria used to select the Folders to return.
     * If no search criteria is specified then all accessible folders will be
     * returned.
     * Query expressions can be used to restrict results based upon displayName,
     * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
     * can be used along with the suffix wildcard symbol `*`.
     * The displayName field in a query expression should use escaped quotes
     * for values that include whitespace to prevent unexpected behavior.
     * Some example queries are:
     * * Query `displayName=Test*` returns Folder resources whose display name
     * starts with "Test".
     * * Query `lifecycleState=ACTIVE` returns Folder resources with
     * `lifecycleState` set to `ACTIVE`.
     * * Query `parent=folders/123` returns Folder resources that have
     * `folders/123` as a parent resource.
     * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
     * Folder resources that have `folders/123` as a parent resource.
     * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
     * display names that include both "Test" and "String".
     * </pre>
     *
     * <code>string query = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      query_ = getDefaultInstance().getQuery();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Search criteria used to select the Folders to return.
     * If no search criteria is specified then all accessible folders will be
     * returned.
     * Query expressions can be used to restrict results based upon displayName,
     * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
     * can be used along with the suffix wildcard symbol `*`.
     * The displayName field in a query expression should use escaped quotes
     * for values that include whitespace to prevent unexpected behavior.
     * Some example queries are:
     * * Query `displayName=Test*` returns Folder resources whose display name
     * starts with "Test".
     * * Query `lifecycleState=ACTIVE` returns Folder resources with
     * `lifecycleState` set to `ACTIVE`.
     * * Query `parent=folders/123` returns Folder resources that have
     * `folders/123` as a parent resource.
     * * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active
     * Folder resources that have `folders/123` as a parent resource.
     * * Query `displayName=&#92;&#92;"Test String&#92;&#92;"` returns Folder resources with
     * display names that include both "Test" and "String".
     * </pre>
     *
     * <code>string query = 3;</code>
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      query_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v2.SearchFoldersRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v2.SearchFoldersRequest)
  private static final com.google.cloud.resourcemanager.v2.SearchFoldersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v2.SearchFoldersRequest();
  }

  public static com.google.cloud.resourcemanager.v2.SearchFoldersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchFoldersRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchFoldersRequest>() {
    @java.lang.Override
    public SearchFoldersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchFoldersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchFoldersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v2.SearchFoldersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
