// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * BuildVersion combines SemVer version of extension with free-form build information
 * (i.e. 'alpha', 'private-build') as a set of strings.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.BuildVersion}
 */
public final class BuildVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.BuildVersion)
    BuildVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildVersion.newBuilder() to construct.
  private BuildVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildVersion() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_BuildVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_BuildVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.BuildVersion.class, io.envoyproxy.envoy.config.core.v3.BuildVersion.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.type.v3.SemanticVersion version_;
  /**
   * <pre>
   * SemVer version of extension.
   * </pre>
   *
   * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * SemVer version of extension.
   * </pre>
   *
   * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.SemanticVersion getVersion() {
    return version_ == null ? io.envoyproxy.envoy.type.v3.SemanticVersion.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * SemVer version of extension.
   * </pre>
   *
   * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.SemanticVersionOrBuilder getVersionOrBuilder() {
    return version_ == null ? io.envoyproxy.envoy.type.v3.SemanticVersion.getDefaultInstance() : version_;
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct metadata_;
  /**
   * <pre>
   * Free-form build information.
   * Envoy defines several well known keys in the source/common/version/version.h file
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * Free-form build information.
   * Envoy defines several well known keys in the source/common/version/version.h file
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 2;</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getMetadata() {
    return metadata_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Free-form build information.
   * Envoy defines several well known keys in the source/common/version/version.h file
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadata_;
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
    if (version_ != null) {
      output.writeMessage(1, getVersion());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVersion());
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.BuildVersion)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.BuildVersion other = (io.envoyproxy.envoy.config.core.v3.BuildVersion) obj;

    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.BuildVersion parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.BuildVersion prototype) {
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
   * BuildVersion combines SemVer version of extension with free-form build information
   * (i.e. 'alpha', 'private-build') as a set of strings.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.BuildVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.BuildVersion)
      io.envoyproxy.envoy.config.core.v3.BuildVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_BuildVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_BuildVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.BuildVersion.class, io.envoyproxy.envoy.config.core.v3.BuildVersion.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.BuildVersion.newBuilder()
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
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_BuildVersion_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.BuildVersion getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.BuildVersion.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.BuildVersion build() {
      io.envoyproxy.envoy.config.core.v3.BuildVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.BuildVersion buildPartial() {
      io.envoyproxy.envoy.config.core.v3.BuildVersion result = new io.envoyproxy.envoy.config.core.v3.BuildVersion(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.config.core.v3.BuildVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = versionBuilder_ == null
            ? version_
            : versionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.BuildVersion) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.BuildVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.BuildVersion other) {
      if (other == io.envoyproxy.envoy.config.core.v3.BuildVersion.getDefaultInstance()) return this;
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
                  getVersionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.type.v3.SemanticVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.SemanticVersion, io.envoyproxy.envoy.type.v3.SemanticVersion.Builder, io.envoyproxy.envoy.type.v3.SemanticVersionOrBuilder> versionBuilder_;
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     * @return The version.
     */
    public io.envoyproxy.envoy.type.v3.SemanticVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? io.envoyproxy.envoy.type.v3.SemanticVersion.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    public Builder setVersion(io.envoyproxy.envoy.type.v3.SemanticVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    public Builder setVersion(
        io.envoyproxy.envoy.type.v3.SemanticVersion.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    public Builder mergeVersion(io.envoyproxy.envoy.type.v3.SemanticVersion value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          version_ != null &&
          version_ != io.envoyproxy.envoy.type.v3.SemanticVersion.getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    public io.envoyproxy.envoy.type.v3.SemanticVersion.Builder getVersionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    public io.envoyproxy.envoy.type.v3.SemanticVersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            io.envoyproxy.envoy.type.v3.SemanticVersion.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * SemVer version of extension.
     * </pre>
     *
     * <code>.envoy.type.v3.SemanticVersion version = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.SemanticVersion, io.envoyproxy.envoy.type.v3.SemanticVersion.Builder, io.envoyproxy.envoy.type.v3.SemanticVersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.v3.SemanticVersion, io.envoyproxy.envoy.type.v3.SemanticVersion.Builder, io.envoyproxy.envoy.type.v3.SemanticVersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private com.google.protobuf.Struct metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     * @return The metadata.
     */
    public com.google.protobuf.Struct getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    public Builder setMetadata(com.google.protobuf.Struct value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    public Builder setMetadata(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    public Builder mergeMetadata(com.google.protobuf.Struct value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadata_ != null &&
          metadata_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Free-form build information.
     * Envoy defines several well known keys in the source/common/version/version.h file
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.BuildVersion)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.BuildVersion)
  private static final io.envoyproxy.envoy.config.core.v3.BuildVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.BuildVersion();
  }

  public static io.envoyproxy.envoy.config.core.v3.BuildVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildVersion>
      PARSER = new com.google.protobuf.AbstractParser<BuildVersion>() {
    @java.lang.Override
    public BuildVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.BuildVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
