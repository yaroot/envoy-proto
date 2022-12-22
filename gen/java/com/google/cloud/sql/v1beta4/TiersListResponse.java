// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_tiers.proto

package com.google.cloud.sql.v1beta4;

/**
 * <pre>
 * Tiers list response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1beta4.TiersListResponse}
 */
public final class TiersListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.TiersListResponse)
    TiersListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TiersListResponse.newBuilder() to construct.
  private TiersListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TiersListResponse() {
    kind_ = "";
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TiersListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_TiersListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_TiersListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.TiersListResponse.class, com.google.cloud.sql.v1beta4.TiersListResponse.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * This is always `sql#tiersList`.
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
   * This is always `sql#tiersList`.
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

  public static final int ITEMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.sql.v1beta4.Tier> items_;
  /**
   * <pre>
   * List of tiers.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.sql.v1beta4.Tier> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * List of tiers.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.sql.v1beta4.TierOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * List of tiers.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * List of tiers.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.Tier getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * List of tiers.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.TierOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
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
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.TiersListResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.TiersListResponse other = (com.google.cloud.sql.v1beta4.TiersListResponse) obj;

    if (!getKind()
        .equals(other.getKind())) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.TiersListResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.TiersListResponse prototype) {
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
   * Tiers list response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1beta4.TiersListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.TiersListResponse)
      com.google.cloud.sql.v1beta4.TiersListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_TiersListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_TiersListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.TiersListResponse.class, com.google.cloud.sql.v1beta4.TiersListResponse.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.TiersListResponse.newBuilder()
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
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlTiersProto.internal_static_google_cloud_sql_v1beta4_TiersListResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.TiersListResponse getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.TiersListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.TiersListResponse build() {
      com.google.cloud.sql.v1beta4.TiersListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.TiersListResponse buildPartial() {
      com.google.cloud.sql.v1beta4.TiersListResponse result = new com.google.cloud.sql.v1beta4.TiersListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.sql.v1beta4.TiersListResponse result) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.TiersListResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
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
      if (other instanceof com.google.cloud.sql.v1beta4.TiersListResponse) {
        return mergeFrom((com.google.cloud.sql.v1beta4.TiersListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.TiersListResponse other) {
      if (other == com.google.cloud.sql.v1beta4.TiersListResponse.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
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
              kind_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.sql.v1beta4.Tier m =
                  input.readMessage(
                      com.google.cloud.sql.v1beta4.Tier.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
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

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * This is always `sql#tiersList`.
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
     * This is always `sql#tiersList`.
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
     * This is always `sql#tiersList`.
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
     * This is always `sql#tiersList`.
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
     * This is always `sql#tiersList`.
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

    private java.util.List<com.google.cloud.sql.v1beta4.Tier> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        items_ = new java.util.ArrayList<com.google.cloud.sql.v1beta4.Tier>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.sql.v1beta4.Tier, com.google.cloud.sql.v1beta4.Tier.Builder, com.google.cloud.sql.v1beta4.TierOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public java.util.List<com.google.cloud.sql.v1beta4.Tier> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public com.google.cloud.sql.v1beta4.Tier getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder setItems(
        int index, com.google.cloud.sql.v1beta4.Tier value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder setItems(
        int index, com.google.cloud.sql.v1beta4.Tier.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder addItems(com.google.cloud.sql.v1beta4.Tier value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder addItems(
        int index, com.google.cloud.sql.v1beta4.Tier value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder addItems(
        com.google.cloud.sql.v1beta4.Tier.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder addItems(
        int index, com.google.cloud.sql.v1beta4.Tier.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.google.cloud.sql.v1beta4.Tier> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public com.google.cloud.sql.v1beta4.Tier.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public com.google.cloud.sql.v1beta4.TierOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.sql.v1beta4.TierOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public com.google.cloud.sql.v1beta4.Tier.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.google.cloud.sql.v1beta4.Tier.getDefaultInstance());
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public com.google.cloud.sql.v1beta4.Tier.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.google.cloud.sql.v1beta4.Tier.getDefaultInstance());
    }
    /**
     * <pre>
     * List of tiers.
     * </pre>
     *
     * <code>repeated .google.cloud.sql.v1beta4.Tier items = 2;</code>
     */
    public java.util.List<com.google.cloud.sql.v1beta4.Tier.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.sql.v1beta4.Tier, com.google.cloud.sql.v1beta4.Tier.Builder, com.google.cloud.sql.v1beta4.TierOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.sql.v1beta4.Tier, com.google.cloud.sql.v1beta4.Tier.Builder, com.google.cloud.sql.v1beta4.TierOrBuilder>(
                items_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.TiersListResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.TiersListResponse)
  private static final com.google.cloud.sql.v1beta4.TiersListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.TiersListResponse();
  }

  public static com.google.cloud.sql.v1beta4.TiersListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TiersListResponse>
      PARSER = new com.google.protobuf.AbstractParser<TiersListResponse>() {
    @java.lang.Override
    public TiersListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TiersListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TiersListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.TiersListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
