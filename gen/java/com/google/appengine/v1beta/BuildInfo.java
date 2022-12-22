// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/deploy.proto

package com.google.appengine.v1beta;

/**
 * <pre>
 * Google Cloud Build information.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1beta.BuildInfo}
 */
public final class BuildInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1beta.BuildInfo)
    BuildInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildInfo.newBuilder() to construct.
  private BuildInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildInfo() {
    cloudBuildId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1beta.DeployProto.internal_static_google_appengine_v1beta_BuildInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1beta.DeployProto.internal_static_google_appengine_v1beta_BuildInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1beta.BuildInfo.class, com.google.appengine.v1beta.BuildInfo.Builder.class);
  }

  public static final int CLOUD_BUILD_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cloudBuildId_ = "";
  /**
   * <pre>
   * The Google Cloud Build id.
   * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
   * </pre>
   *
   * <code>string cloud_build_id = 1;</code>
   * @return The cloudBuildId.
   */
  @java.lang.Override
  public java.lang.String getCloudBuildId() {
    java.lang.Object ref = cloudBuildId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cloudBuildId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Cloud Build id.
   * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
   * </pre>
   *
   * <code>string cloud_build_id = 1;</code>
   * @return The bytes for cloudBuildId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCloudBuildIdBytes() {
    java.lang.Object ref = cloudBuildId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cloudBuildId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudBuildId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cloudBuildId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudBuildId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cloudBuildId_);
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
    if (!(obj instanceof com.google.appengine.v1beta.BuildInfo)) {
      return super.equals(obj);
    }
    com.google.appengine.v1beta.BuildInfo other = (com.google.appengine.v1beta.BuildInfo) obj;

    if (!getCloudBuildId()
        .equals(other.getCloudBuildId())) return false;
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
    hash = (37 * hash) + CLOUD_BUILD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCloudBuildId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.BuildInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.BuildInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.BuildInfo parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1beta.BuildInfo prototype) {
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
   * Google Cloud Build information.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1beta.BuildInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1beta.BuildInfo)
      com.google.appengine.v1beta.BuildInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1beta.DeployProto.internal_static_google_appengine_v1beta_BuildInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1beta.DeployProto.internal_static_google_appengine_v1beta_BuildInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1beta.BuildInfo.class, com.google.appengine.v1beta.BuildInfo.Builder.class);
    }

    // Construct using com.google.appengine.v1beta.BuildInfo.newBuilder()
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
      cloudBuildId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1beta.DeployProto.internal_static_google_appengine_v1beta_BuildInfo_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.BuildInfo getDefaultInstanceForType() {
      return com.google.appengine.v1beta.BuildInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1beta.BuildInfo build() {
      com.google.appengine.v1beta.BuildInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.BuildInfo buildPartial() {
      com.google.appengine.v1beta.BuildInfo result = new com.google.appengine.v1beta.BuildInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1beta.BuildInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloudBuildId_ = cloudBuildId_;
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
      if (other instanceof com.google.appengine.v1beta.BuildInfo) {
        return mergeFrom((com.google.appengine.v1beta.BuildInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1beta.BuildInfo other) {
      if (other == com.google.appengine.v1beta.BuildInfo.getDefaultInstance()) return this;
      if (!other.getCloudBuildId().isEmpty()) {
        cloudBuildId_ = other.cloudBuildId_;
        bitField0_ |= 0x00000001;
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
              cloudBuildId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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
    private int bitField0_;

    private java.lang.Object cloudBuildId_ = "";
    /**
     * <pre>
     * The Google Cloud Build id.
     * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @return The cloudBuildId.
     */
    public java.lang.String getCloudBuildId() {
      java.lang.Object ref = cloudBuildId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cloudBuildId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Build id.
     * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @return The bytes for cloudBuildId.
     */
    public com.google.protobuf.ByteString
        getCloudBuildIdBytes() {
      java.lang.Object ref = cloudBuildId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cloudBuildId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Build id.
     * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @param value The cloudBuildId to set.
     * @return This builder for chaining.
     */
    public Builder setCloudBuildId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cloudBuildId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Build id.
     * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCloudBuildId() {
      cloudBuildId_ = getDefaultInstance().getCloudBuildId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Build id.
     * Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @param value The bytes for cloudBuildId to set.
     * @return This builder for chaining.
     */
    public Builder setCloudBuildIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cloudBuildId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1beta.BuildInfo)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1beta.BuildInfo)
  private static final com.google.appengine.v1beta.BuildInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1beta.BuildInfo();
  }

  public static com.google.appengine.v1beta.BuildInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildInfo>
      PARSER = new com.google.protobuf.AbstractParser<BuildInfo>() {
    @java.lang.Override
    public BuildInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1beta.BuildInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

