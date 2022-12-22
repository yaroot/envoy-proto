// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

/**
 * <pre>
 * Update asset feed request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1p2beta1.UpdateFeedRequest}
 */
public final class UpdateFeedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1p2beta1.UpdateFeedRequest)
    UpdateFeedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFeedRequest.newBuilder() to construct.
  private UpdateFeedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFeedRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFeedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.class, com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.Builder.class);
  }

  public static final int FEED_FIELD_NUMBER = 1;
  private com.google.cloud.asset.v1p2beta1.Feed feed_;
  /**
   * <pre>
   * Required. The new values of feed details. It must match an existing feed and the
   * field `name` must be in the format of:
   * projects/project_number/feeds/feed_id or
   * folders/folder_number/feeds/feed_id or
   * organizations/organization_number/feeds/feed_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the feed field is set.
   */
  @java.lang.Override
  public boolean hasFeed() {
    return feed_ != null;
  }
  /**
   * <pre>
   * Required. The new values of feed details. It must match an existing feed and the
   * field `name` must be in the format of:
   * projects/project_number/feeds/feed_id or
   * folders/folder_number/feeds/feed_id or
   * organizations/organization_number/feeds/feed_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The feed.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.Feed getFeed() {
    return feed_ == null ? com.google.cloud.asset.v1p2beta1.Feed.getDefaultInstance() : feed_;
  }
  /**
   * <pre>
   * Required. The new values of feed details. It must match an existing feed and the
   * field `name` must be in the format of:
   * projects/project_number/feeds/feed_id or
   * folders/folder_number/feeds/feed_id or
   * organizations/organization_number/feeds/feed_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.FeedOrBuilder getFeedOrBuilder() {
    return feed_ == null ? com.google.cloud.asset.v1p2beta1.Feed.getDefaultInstance() : feed_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Only updates the `feed` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Only updates the `feed` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Only updates the `feed` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
    if (feed_ != null) {
      output.writeMessage(1, getFeed());
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
    if (feed_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFeed());
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
    if (!(obj instanceof com.google.cloud.asset.v1p2beta1.UpdateFeedRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1p2beta1.UpdateFeedRequest other = (com.google.cloud.asset.v1p2beta1.UpdateFeedRequest) obj;

    if (hasFeed() != other.hasFeed()) return false;
    if (hasFeed()) {
      if (!getFeed()
          .equals(other.getFeed())) return false;
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
    if (hasFeed()) {
      hash = (37 * hash) + FEED_FIELD_NUMBER;
      hash = (53 * hash) + getFeed().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1p2beta1.UpdateFeedRequest prototype) {
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
   * Update asset feed request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1p2beta1.UpdateFeedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1p2beta1.UpdateFeedRequest)
      com.google.cloud.asset.v1p2beta1.UpdateFeedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.class, com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.newBuilder()
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
      feed_ = null;
      if (feedBuilder_ != null) {
        feedBuilder_.dispose();
        feedBuilder_ = null;
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
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.UpdateFeedRequest getDefaultInstanceForType() {
      return com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.UpdateFeedRequest build() {
      com.google.cloud.asset.v1p2beta1.UpdateFeedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.UpdateFeedRequest buildPartial() {
      com.google.cloud.asset.v1p2beta1.UpdateFeedRequest result = new com.google.cloud.asset.v1p2beta1.UpdateFeedRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1p2beta1.UpdateFeedRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.feed_ = feedBuilder_ == null
            ? feed_
            : feedBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1p2beta1.UpdateFeedRequest) {
        return mergeFrom((com.google.cloud.asset.v1p2beta1.UpdateFeedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1p2beta1.UpdateFeedRequest other) {
      if (other == com.google.cloud.asset.v1p2beta1.UpdateFeedRequest.getDefaultInstance()) return this;
      if (other.hasFeed()) {
        mergeFeed(other.getFeed());
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
                  getFeedFieldBuilder().getBuilder(),
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

    private com.google.cloud.asset.v1p2beta1.Feed feed_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1p2beta1.Feed, com.google.cloud.asset.v1p2beta1.Feed.Builder, com.google.cloud.asset.v1p2beta1.FeedOrBuilder> feedBuilder_;
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the feed field is set.
     */
    public boolean hasFeed() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The feed.
     */
    public com.google.cloud.asset.v1p2beta1.Feed getFeed() {
      if (feedBuilder_ == null) {
        return feed_ == null ? com.google.cloud.asset.v1p2beta1.Feed.getDefaultInstance() : feed_;
      } else {
        return feedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFeed(com.google.cloud.asset.v1p2beta1.Feed value) {
      if (feedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feed_ = value;
      } else {
        feedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFeed(
        com.google.cloud.asset.v1p2beta1.Feed.Builder builderForValue) {
      if (feedBuilder_ == null) {
        feed_ = builderForValue.build();
      } else {
        feedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFeed(com.google.cloud.asset.v1p2beta1.Feed value) {
      if (feedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          feed_ != null &&
          feed_ != com.google.cloud.asset.v1p2beta1.Feed.getDefaultInstance()) {
          getFeedBuilder().mergeFrom(value);
        } else {
          feed_ = value;
        }
      } else {
        feedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFeed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      feed_ = null;
      if (feedBuilder_ != null) {
        feedBuilder_.dispose();
        feedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.asset.v1p2beta1.Feed.Builder getFeedBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFeedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.asset.v1p2beta1.FeedOrBuilder getFeedOrBuilder() {
      if (feedBuilder_ != null) {
        return feedBuilder_.getMessageOrBuilder();
      } else {
        return feed_ == null ?
            com.google.cloud.asset.v1p2beta1.Feed.getDefaultInstance() : feed_;
      }
    }
    /**
     * <pre>
     * Required. The new values of feed details. It must match an existing feed and the
     * field `name` must be in the format of:
     * projects/project_number/feeds/feed_id or
     * folders/folder_number/feeds/feed_id or
     * organizations/organization_number/feeds/feed_id.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1p2beta1.Feed, com.google.cloud.asset.v1p2beta1.Feed.Builder, com.google.cloud.asset.v1p2beta1.FeedOrBuilder> 
        getFeedFieldBuilder() {
      if (feedBuilder_ == null) {
        feedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1p2beta1.Feed, com.google.cloud.asset.v1p2beta1.Feed.Builder, com.google.cloud.asset.v1p2beta1.FeedOrBuilder>(
                getFeed(),
                getParentForChildren(),
                isClean());
        feed_ = null;
      }
      return feedBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Only updates the `feed` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1p2beta1.UpdateFeedRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1p2beta1.UpdateFeedRequest)
  private static final com.google.cloud.asset.v1p2beta1.UpdateFeedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1p2beta1.UpdateFeedRequest();
  }

  public static com.google.cloud.asset.v1p2beta1.UpdateFeedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFeedRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFeedRequest>() {
    @java.lang.Override
    public UpdateFeedRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFeedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFeedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.UpdateFeedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

