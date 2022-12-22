// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

/**
 * <pre>
 * Output configuration for asset feed destination.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1p2beta1.FeedOutputConfig}
 */
public final class FeedOutputConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1p2beta1.FeedOutputConfig)
    FeedOutputConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedOutputConfig.newBuilder() to construct.
  private FeedOutputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedOutputConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedOutputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1p2beta1.FeedOutputConfig.class, com.google.cloud.asset.v1p2beta1.FeedOutputConfig.Builder.class);
  }

  private int destinationCase_ = 0;
  private java.lang.Object destination_;
  public enum DestinationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PUBSUB_DESTINATION(1),
    DESTINATION_NOT_SET(0);
    private final int value;
    private DestinationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationCase forNumber(int value) {
      switch (value) {
        case 1: return PUBSUB_DESTINATION;
        case 0: return DESTINATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DestinationCase
  getDestinationCase() {
    return DestinationCase.forNumber(
        destinationCase_);
  }

  public static final int PUBSUB_DESTINATION_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Destination on Cloud Pubsub.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
   * @return Whether the pubsubDestination field is set.
   */
  @java.lang.Override
  public boolean hasPubsubDestination() {
    return destinationCase_ == 1;
  }
  /**
   * <pre>
   * Destination on Cloud Pubsub.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
   * @return The pubsubDestination.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.PubsubDestination getPubsubDestination() {
    if (destinationCase_ == 1) {
       return (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_;
    }
    return com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance();
  }
  /**
   * <pre>
   * Destination on Cloud Pubsub.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.PubsubDestinationOrBuilder getPubsubDestinationOrBuilder() {
    if (destinationCase_ == 1) {
       return (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_;
    }
    return com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance();
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
    if (destinationCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destinationCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_);
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
    if (!(obj instanceof com.google.cloud.asset.v1p2beta1.FeedOutputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1p2beta1.FeedOutputConfig other = (com.google.cloud.asset.v1p2beta1.FeedOutputConfig) obj;

    if (!getDestinationCase().equals(other.getDestinationCase())) return false;
    switch (destinationCase_) {
      case 1:
        if (!getPubsubDestination()
            .equals(other.getPubsubDestination())) return false;
        break;
      case 0:
      default:
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
    switch (destinationCase_) {
      case 1:
        hash = (37 * hash) + PUBSUB_DESTINATION_FIELD_NUMBER;
        hash = (53 * hash) + getPubsubDestination().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1p2beta1.FeedOutputConfig prototype) {
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
   * Output configuration for asset feed destination.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1p2beta1.FeedOutputConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1p2beta1.FeedOutputConfig)
      com.google.cloud.asset.v1p2beta1.FeedOutputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1p2beta1.FeedOutputConfig.class, com.google.cloud.asset.v1p2beta1.FeedOutputConfig.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1p2beta1.FeedOutputConfig.newBuilder()
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
      if (pubsubDestinationBuilder_ != null) {
        pubsubDestinationBuilder_.clear();
      }
      destinationCase_ = 0;
      destination_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.FeedOutputConfig getDefaultInstanceForType() {
      return com.google.cloud.asset.v1p2beta1.FeedOutputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.FeedOutputConfig build() {
      com.google.cloud.asset.v1p2beta1.FeedOutputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.FeedOutputConfig buildPartial() {
      com.google.cloud.asset.v1p2beta1.FeedOutputConfig result = new com.google.cloud.asset.v1p2beta1.FeedOutputConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1p2beta1.FeedOutputConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.asset.v1p2beta1.FeedOutputConfig result) {
      result.destinationCase_ = destinationCase_;
      result.destination_ = this.destination_;
      if (destinationCase_ == 1 &&
          pubsubDestinationBuilder_ != null) {
        result.destination_ = pubsubDestinationBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1p2beta1.FeedOutputConfig) {
        return mergeFrom((com.google.cloud.asset.v1p2beta1.FeedOutputConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1p2beta1.FeedOutputConfig other) {
      if (other == com.google.cloud.asset.v1p2beta1.FeedOutputConfig.getDefaultInstance()) return this;
      switch (other.getDestinationCase()) {
        case PUBSUB_DESTINATION: {
          mergePubsubDestination(other.getPubsubDestination());
          break;
        }
        case DESTINATION_NOT_SET: {
          break;
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
              input.readMessage(
                  getPubsubDestinationFieldBuilder().getBuilder(),
                  extensionRegistry);
              destinationCase_ = 1;
              break;
            } // case 10
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
    private int destinationCase_ = 0;
    private java.lang.Object destination_;
    public DestinationCase
        getDestinationCase() {
      return DestinationCase.forNumber(
          destinationCase_);
    }

    public Builder clearDestination() {
      destinationCase_ = 0;
      destination_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1p2beta1.PubsubDestination, com.google.cloud.asset.v1p2beta1.PubsubDestination.Builder, com.google.cloud.asset.v1p2beta1.PubsubDestinationOrBuilder> pubsubDestinationBuilder_;
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     * @return Whether the pubsubDestination field is set.
     */
    @java.lang.Override
    public boolean hasPubsubDestination() {
      return destinationCase_ == 1;
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     * @return The pubsubDestination.
     */
    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.PubsubDestination getPubsubDestination() {
      if (pubsubDestinationBuilder_ == null) {
        if (destinationCase_ == 1) {
          return (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_;
        }
        return com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance();
      } else {
        if (destinationCase_ == 1) {
          return pubsubDestinationBuilder_.getMessage();
        }
        return com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    public Builder setPubsubDestination(com.google.cloud.asset.v1p2beta1.PubsubDestination value) {
      if (pubsubDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destination_ = value;
        onChanged();
      } else {
        pubsubDestinationBuilder_.setMessage(value);
      }
      destinationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    public Builder setPubsubDestination(
        com.google.cloud.asset.v1p2beta1.PubsubDestination.Builder builderForValue) {
      if (pubsubDestinationBuilder_ == null) {
        destination_ = builderForValue.build();
        onChanged();
      } else {
        pubsubDestinationBuilder_.setMessage(builderForValue.build());
      }
      destinationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    public Builder mergePubsubDestination(com.google.cloud.asset.v1p2beta1.PubsubDestination value) {
      if (pubsubDestinationBuilder_ == null) {
        if (destinationCase_ == 1 &&
            destination_ != com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance()) {
          destination_ = com.google.cloud.asset.v1p2beta1.PubsubDestination.newBuilder((com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_)
              .mergeFrom(value).buildPartial();
        } else {
          destination_ = value;
        }
        onChanged();
      } else {
        if (destinationCase_ == 1) {
          pubsubDestinationBuilder_.mergeFrom(value);
        } else {
          pubsubDestinationBuilder_.setMessage(value);
        }
      }
      destinationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    public Builder clearPubsubDestination() {
      if (pubsubDestinationBuilder_ == null) {
        if (destinationCase_ == 1) {
          destinationCase_ = 0;
          destination_ = null;
          onChanged();
        }
      } else {
        if (destinationCase_ == 1) {
          destinationCase_ = 0;
          destination_ = null;
        }
        pubsubDestinationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    public com.google.cloud.asset.v1p2beta1.PubsubDestination.Builder getPubsubDestinationBuilder() {
      return getPubsubDestinationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.PubsubDestinationOrBuilder getPubsubDestinationOrBuilder() {
      if ((destinationCase_ == 1) && (pubsubDestinationBuilder_ != null)) {
        return pubsubDestinationBuilder_.getMessageOrBuilder();
      } else {
        if (destinationCase_ == 1) {
          return (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_;
        }
        return com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Destination on Cloud Pubsub.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1p2beta1.PubsubDestination, com.google.cloud.asset.v1p2beta1.PubsubDestination.Builder, com.google.cloud.asset.v1p2beta1.PubsubDestinationOrBuilder> 
        getPubsubDestinationFieldBuilder() {
      if (pubsubDestinationBuilder_ == null) {
        if (!(destinationCase_ == 1)) {
          destination_ = com.google.cloud.asset.v1p2beta1.PubsubDestination.getDefaultInstance();
        }
        pubsubDestinationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1p2beta1.PubsubDestination, com.google.cloud.asset.v1p2beta1.PubsubDestination.Builder, com.google.cloud.asset.v1p2beta1.PubsubDestinationOrBuilder>(
                (com.google.cloud.asset.v1p2beta1.PubsubDestination) destination_,
                getParentForChildren(),
                isClean());
        destination_ = null;
      }
      destinationCase_ = 1;
      onChanged();
      return pubsubDestinationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1p2beta1.FeedOutputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1p2beta1.FeedOutputConfig)
  private static final com.google.cloud.asset.v1p2beta1.FeedOutputConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1p2beta1.FeedOutputConfig();
  }

  public static com.google.cloud.asset.v1p2beta1.FeedOutputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedOutputConfig>
      PARSER = new com.google.protobuf.AbstractParser<FeedOutputConfig>() {
    @java.lang.Override
    public FeedOutputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeedOutputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedOutputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.FeedOutputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

