// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

/**
 * <pre>
 * A Cloud Storage location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1p2beta1.GcsDestination}
 */
public final class GcsDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1p2beta1.GcsDestination)
    GcsDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsDestination.newBuilder() to construct.
  private GcsDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsDestination() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsDestination();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_GcsDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_GcsDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1p2beta1.GcsDestination.class, com.google.cloud.asset.v1p2beta1.GcsDestination.Builder.class);
  }

  private int objectUriCase_ = 0;
  private java.lang.Object objectUri_;
  public enum ObjectUriCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    URI(1),
    OBJECTURI_NOT_SET(0);
    private final int value;
    private ObjectUriCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ObjectUriCase valueOf(int value) {
      return forNumber(value);
    }

    public static ObjectUriCase forNumber(int value) {
      switch (value) {
        case 1: return URI;
        case 0: return OBJECTURI_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ObjectUriCase
  getObjectUriCase() {
    return ObjectUriCase.forNumber(
        objectUriCase_);
  }

  public static final int URI_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The uri of the Cloud Storage object. It's the same uri that is used by
   * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
   * Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
   * for more information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return Whether the uri field is set.
   */
  public boolean hasUri() {
    return objectUriCase_ == 1;
  }
  /**
   * <pre>
   * The uri of the Cloud Storage object. It's the same uri that is used by
   * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
   * Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
   * for more information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  public java.lang.String getUri() {
    java.lang.Object ref = "";
    if (objectUriCase_ == 1) {
      ref = objectUri_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (objectUriCase_ == 1) {
        objectUri_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The uri of the Cloud Storage object. It's the same uri that is used by
   * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
   * Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
   * for more information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = "";
    if (objectUriCase_ == 1) {
      ref = objectUri_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (objectUriCase_ == 1) {
        objectUri_ = b;
      }
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
    if (objectUriCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (objectUriCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectUri_);
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
    if (!(obj instanceof com.google.cloud.asset.v1p2beta1.GcsDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1p2beta1.GcsDestination other = (com.google.cloud.asset.v1p2beta1.GcsDestination) obj;

    if (!getObjectUriCase().equals(other.getObjectUriCase())) return false;
    switch (objectUriCase_) {
      case 1:
        if (!getUri()
            .equals(other.getUri())) return false;
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
    switch (objectUriCase_) {
      case 1:
        hash = (37 * hash) + URI_FIELD_NUMBER;
        hash = (53 * hash) + getUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p2beta1.GcsDestination parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1p2beta1.GcsDestination prototype) {
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
   * A Cloud Storage location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1p2beta1.GcsDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1p2beta1.GcsDestination)
      com.google.cloud.asset.v1p2beta1.GcsDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_GcsDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_GcsDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1p2beta1.GcsDestination.class, com.google.cloud.asset.v1p2beta1.GcsDestination.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1p2beta1.GcsDestination.newBuilder()
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
      objectUriCase_ = 0;
      objectUri_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1p2beta1.AssetServiceProto.internal_static_google_cloud_asset_v1p2beta1_GcsDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.GcsDestination getDefaultInstanceForType() {
      return com.google.cloud.asset.v1p2beta1.GcsDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.GcsDestination build() {
      com.google.cloud.asset.v1p2beta1.GcsDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.GcsDestination buildPartial() {
      com.google.cloud.asset.v1p2beta1.GcsDestination result = new com.google.cloud.asset.v1p2beta1.GcsDestination(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1p2beta1.GcsDestination result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.asset.v1p2beta1.GcsDestination result) {
      result.objectUriCase_ = objectUriCase_;
      result.objectUri_ = this.objectUri_;
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
      if (other instanceof com.google.cloud.asset.v1p2beta1.GcsDestination) {
        return mergeFrom((com.google.cloud.asset.v1p2beta1.GcsDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1p2beta1.GcsDestination other) {
      if (other == com.google.cloud.asset.v1p2beta1.GcsDestination.getDefaultInstance()) return this;
      switch (other.getObjectUriCase()) {
        case URI: {
          objectUriCase_ = 1;
          objectUri_ = other.objectUri_;
          onChanged();
          break;
        }
        case OBJECTURI_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              objectUriCase_ = 1;
              objectUri_ = s;
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
    private int objectUriCase_ = 0;
    private java.lang.Object objectUri_;
    public ObjectUriCase
        getObjectUriCase() {
      return ObjectUriCase.forNumber(
          objectUriCase_);
    }

    public Builder clearObjectUri() {
      objectUriCase_ = 0;
      objectUri_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The uri of the Cloud Storage object. It's the same uri that is used by
     * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
     * Editing Object
     * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
     * for more information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return Whether the uri field is set.
     */
    @java.lang.Override
    public boolean hasUri() {
      return objectUriCase_ == 1;
    }
    /**
     * <pre>
     * The uri of the Cloud Storage object. It's the same uri that is used by
     * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
     * Editing Object
     * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
     * for more information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return The uri.
     */
    @java.lang.Override
    public java.lang.String getUri() {
      java.lang.Object ref = "";
      if (objectUriCase_ == 1) {
        ref = objectUri_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (objectUriCase_ == 1) {
          objectUri_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The uri of the Cloud Storage object. It's the same uri that is used by
     * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
     * Editing Object
     * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
     * for more information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return The bytes for uri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = "";
      if (objectUriCase_ == 1) {
        ref = objectUri_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (objectUriCase_ == 1) {
          objectUri_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The uri of the Cloud Storage object. It's the same uri that is used by
     * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
     * Editing Object
     * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
     * for more information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectUriCase_ = 1;
      objectUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The uri of the Cloud Storage object. It's the same uri that is used by
     * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
     * Editing Object
     * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
     * for more information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      if (objectUriCase_ == 1) {
        objectUriCase_ = 0;
        objectUri_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The uri of the Cloud Storage object. It's the same uri that is used by
     * gsutil. For example: "gs://bucket_name/object_name". See [Viewing and
     * Editing Object
     * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
     * for more information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectUriCase_ = 1;
      objectUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1p2beta1.GcsDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1p2beta1.GcsDestination)
  private static final com.google.cloud.asset.v1p2beta1.GcsDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1p2beta1.GcsDestination();
  }

  public static com.google.cloud.asset.v1p2beta1.GcsDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsDestination>
      PARSER = new com.google.protobuf.AbstractParser<GcsDestination>() {
    @java.lang.Override
    public GcsDestination parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.GcsDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

