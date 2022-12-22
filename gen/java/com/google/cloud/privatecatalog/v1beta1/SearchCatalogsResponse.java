// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

/**
 * <pre>
 * Response message for [PrivateCatalog.SearchCatalogs][google.cloud.privatecatalog.v1beta1.PrivateCatalog.SearchCatalogs].
 * </pre>
 *
 * Protobuf type {@code google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse}
 */
public final class SearchCatalogsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse)
    SearchCatalogsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchCatalogsResponse.newBuilder() to construct.
  private SearchCatalogsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchCatalogsResponse() {
    catalogs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchCatalogsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto.internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto.internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.class, com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.Builder.class);
  }

  public static final int CATALOGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.privatecatalog.v1beta1.Catalog> catalogs_;
  /**
   * <pre>
   * The `Catalog`s computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.privatecatalog.v1beta1.Catalog> getCatalogsList() {
    return catalogs_;
  }
  /**
   * <pre>
   * The `Catalog`s computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder> 
      getCatalogsOrBuilderList() {
    return catalogs_;
  }
  /**
   * <pre>
   * The `Catalog`s computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
   */
  @java.lang.Override
  public int getCatalogsCount() {
    return catalogs_.size();
  }
  /**
   * <pre>
   * The `Catalog`s computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.Catalog getCatalogs(int index) {
    return catalogs_.get(index);
  }
  /**
   * <pre>
   * The `Catalog`s computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder getCatalogsOrBuilder(
      int index) {
    return catalogs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A pagination token returned from a previous call to SearchCatalogs that
   * indicates from where listing should continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A pagination token returned from a previous call to SearchCatalogs that
   * indicates from where listing should continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < catalogs_.size(); i++) {
      output.writeMessage(1, catalogs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < catalogs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, catalogs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse other = (com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse) obj;

    if (!getCatalogsList()
        .equals(other.getCatalogsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getCatalogsCount() > 0) {
      hash = (37 * hash) + CATALOGS_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse prototype) {
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
   * Response message for [PrivateCatalog.SearchCatalogs][google.cloud.privatecatalog.v1beta1.PrivateCatalog.SearchCatalogs].
   * </pre>
   *
   * Protobuf type {@code google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse)
      com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto.internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto.internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.class, com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.Builder.class);
    }

    // Construct using com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.newBuilder()
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
      if (catalogsBuilder_ == null) {
        catalogs_ = java.util.Collections.emptyList();
      } else {
        catalogs_ = null;
        catalogsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto.internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse getDefaultInstanceForType() {
      return com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse build() {
      com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse buildPartial() {
      com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse result = new com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse result) {
      if (catalogsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          catalogs_ = java.util.Collections.unmodifiableList(catalogs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.catalogs_ = catalogs_;
      } else {
        result.catalogs_ = catalogsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse) {
        return mergeFrom((com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse other) {
      if (other == com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse.getDefaultInstance()) return this;
      if (catalogsBuilder_ == null) {
        if (!other.catalogs_.isEmpty()) {
          if (catalogs_.isEmpty()) {
            catalogs_ = other.catalogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCatalogsIsMutable();
            catalogs_.addAll(other.catalogs_);
          }
          onChanged();
        }
      } else {
        if (!other.catalogs_.isEmpty()) {
          if (catalogsBuilder_.isEmpty()) {
            catalogsBuilder_.dispose();
            catalogsBuilder_ = null;
            catalogs_ = other.catalogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            catalogsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCatalogsFieldBuilder() : null;
          } else {
            catalogsBuilder_.addAllMessages(other.catalogs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              com.google.cloud.privatecatalog.v1beta1.Catalog m =
                  input.readMessage(
                      com.google.cloud.privatecatalog.v1beta1.Catalog.parser(),
                      extensionRegistry);
              if (catalogsBuilder_ == null) {
                ensureCatalogsIsMutable();
                catalogs_.add(m);
              } else {
                catalogsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.privatecatalog.v1beta1.Catalog> catalogs_ =
      java.util.Collections.emptyList();
    private void ensureCatalogsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        catalogs_ = new java.util.ArrayList<com.google.cloud.privatecatalog.v1beta1.Catalog>(catalogs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.privatecatalog.v1beta1.Catalog, com.google.cloud.privatecatalog.v1beta1.Catalog.Builder, com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder> catalogsBuilder_;

    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public java.util.List<com.google.cloud.privatecatalog.v1beta1.Catalog> getCatalogsList() {
      if (catalogsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(catalogs_);
      } else {
        return catalogsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public int getCatalogsCount() {
      if (catalogsBuilder_ == null) {
        return catalogs_.size();
      } else {
        return catalogsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Catalog getCatalogs(int index) {
      if (catalogsBuilder_ == null) {
        return catalogs_.get(index);
      } else {
        return catalogsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder setCatalogs(
        int index, com.google.cloud.privatecatalog.v1beta1.Catalog value) {
      if (catalogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogsIsMutable();
        catalogs_.set(index, value);
        onChanged();
      } else {
        catalogsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder setCatalogs(
        int index, com.google.cloud.privatecatalog.v1beta1.Catalog.Builder builderForValue) {
      if (catalogsBuilder_ == null) {
        ensureCatalogsIsMutable();
        catalogs_.set(index, builderForValue.build());
        onChanged();
      } else {
        catalogsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder addCatalogs(com.google.cloud.privatecatalog.v1beta1.Catalog value) {
      if (catalogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogsIsMutable();
        catalogs_.add(value);
        onChanged();
      } else {
        catalogsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder addCatalogs(
        int index, com.google.cloud.privatecatalog.v1beta1.Catalog value) {
      if (catalogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogsIsMutable();
        catalogs_.add(index, value);
        onChanged();
      } else {
        catalogsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder addCatalogs(
        com.google.cloud.privatecatalog.v1beta1.Catalog.Builder builderForValue) {
      if (catalogsBuilder_ == null) {
        ensureCatalogsIsMutable();
        catalogs_.add(builderForValue.build());
        onChanged();
      } else {
        catalogsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder addCatalogs(
        int index, com.google.cloud.privatecatalog.v1beta1.Catalog.Builder builderForValue) {
      if (catalogsBuilder_ == null) {
        ensureCatalogsIsMutable();
        catalogs_.add(index, builderForValue.build());
        onChanged();
      } else {
        catalogsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder addAllCatalogs(
        java.lang.Iterable<? extends com.google.cloud.privatecatalog.v1beta1.Catalog> values) {
      if (catalogsBuilder_ == null) {
        ensureCatalogsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, catalogs_);
        onChanged();
      } else {
        catalogsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder clearCatalogs() {
      if (catalogsBuilder_ == null) {
        catalogs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        catalogsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public Builder removeCatalogs(int index) {
      if (catalogsBuilder_ == null) {
        ensureCatalogsIsMutable();
        catalogs_.remove(index);
        onChanged();
      } else {
        catalogsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Catalog.Builder getCatalogsBuilder(
        int index) {
      return getCatalogsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder getCatalogsOrBuilder(
        int index) {
      if (catalogsBuilder_ == null) {
        return catalogs_.get(index);  } else {
        return catalogsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder> 
         getCatalogsOrBuilderList() {
      if (catalogsBuilder_ != null) {
        return catalogsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(catalogs_);
      }
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Catalog.Builder addCatalogsBuilder() {
      return getCatalogsFieldBuilder().addBuilder(
          com.google.cloud.privatecatalog.v1beta1.Catalog.getDefaultInstance());
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Catalog.Builder addCatalogsBuilder(
        int index) {
      return getCatalogsFieldBuilder().addBuilder(
          index, com.google.cloud.privatecatalog.v1beta1.Catalog.getDefaultInstance());
    }
    /**
     * <pre>
     * The `Catalog`s computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Catalog catalogs = 1;</code>
     */
    public java.util.List<com.google.cloud.privatecatalog.v1beta1.Catalog.Builder> 
         getCatalogsBuilderList() {
      return getCatalogsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.privatecatalog.v1beta1.Catalog, com.google.cloud.privatecatalog.v1beta1.Catalog.Builder, com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder> 
        getCatalogsFieldBuilder() {
      if (catalogsBuilder_ == null) {
        catalogsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.privatecatalog.v1beta1.Catalog, com.google.cloud.privatecatalog.v1beta1.Catalog.Builder, com.google.cloud.privatecatalog.v1beta1.CatalogOrBuilder>(
                catalogs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        catalogs_ = null;
      }
      return catalogsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A pagination token returned from a previous call to SearchCatalogs that
     * indicates from where listing should continue.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to SearchCatalogs that
     * indicates from where listing should continue.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to SearchCatalogs that
     * indicates from where listing should continue.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to SearchCatalogs that
     * indicates from where listing should continue.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to SearchCatalogs that
     * indicates from where listing should continue.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse)
  private static final com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse();
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchCatalogsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchCatalogsResponse>() {
    @java.lang.Override
    public SearchCatalogsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchCatalogsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchCatalogsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.SearchCatalogsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

