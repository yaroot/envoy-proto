// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/resource.proto

package com.github.xds.core.v3;

/**
 * <pre>
 * xDS resource wrapper. This encapsulates a xDS resource when appearing in an
 * xDS transport discovery response or when accessed as a filesystem object.
 * </pre>
 *
 * Protobuf type {@code xds.core.v3.Resource}
 */
public final class Resource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xds.core.v3.Resource)
    ResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Resource.newBuilder() to construct.
  private Resource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Resource() {
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Resource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.xds.core.v3.ResourceProto.internal_static_xds_core_v3_Resource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.xds.core.v3.ResourceProto.internal_static_xds_core_v3_Resource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.xds.core.v3.Resource.class, com.github.xds.core.v3.Resource.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.github.xds.core.v3.ResourceName name_;
  /**
   * <pre>
   * Resource name. This may be omitted for filesystem resources.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceName name = 1;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <pre>
   * Resource name. This may be omitted for filesystem resources.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceName name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public com.github.xds.core.v3.ResourceName getName() {
    return name_ == null ? com.github.xds.core.v3.ResourceName.getDefaultInstance() : name_;
  }
  /**
   * <pre>
   * Resource name. This may be omitted for filesystem resources.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceName name = 1;</code>
   */
  @java.lang.Override
  public com.github.xds.core.v3.ResourceNameOrBuilder getNameOrBuilder() {
    return name_ == null ? com.github.xds.core.v3.ResourceName.getDefaultInstance() : name_;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   * <pre>
   * The resource's logical version. It is illegal to have the same named xDS
   * resource name at a given version with different resource payloads.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource's logical version. It is illegal to have the same named xDS
   * resource name at a given version with different resource payloads.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.google.protobuf.Any resource_;
  /**
   * <pre>
   * The resource payload, including type URL.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * The resource payload, including type URL.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.google.protobuf.Any getResource() {
    return resource_ == null ? com.google.protobuf.Any.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * The resource payload, including type URL.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getResourceOrBuilder() {
    return resource_ == null ? com.google.protobuf.Any.getDefaultInstance() : resource_;
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
    if (name_ != null) {
      output.writeMessage(1, getName());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (resource_ != null) {
      output.writeMessage(3, getResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getName());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResource());
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
    if (!(obj instanceof com.github.xds.core.v3.Resource)) {
      return super.equals(obj);
    }
    com.github.xds.core.v3.Resource other = (com.github.xds.core.v3.Resource) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.xds.core.v3.Resource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.core.v3.Resource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.core.v3.Resource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.xds.core.v3.Resource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.xds.core.v3.Resource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.xds.core.v3.Resource parseFrom(
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
  public static Builder newBuilder(com.github.xds.core.v3.Resource prototype) {
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
   * xDS resource wrapper. This encapsulates a xDS resource when appearing in an
   * xDS transport discovery response or when accessed as a filesystem object.
   * </pre>
   *
   * Protobuf type {@code xds.core.v3.Resource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xds.core.v3.Resource)
      com.github.xds.core.v3.ResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.xds.core.v3.ResourceProto.internal_static_xds_core_v3_Resource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.xds.core.v3.ResourceProto.internal_static_xds_core_v3_Resource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.xds.core.v3.Resource.class, com.github.xds.core.v3.Resource.Builder.class);
    }

    // Construct using com.github.xds.core.v3.Resource.newBuilder()
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
      name_ = null;
      if (nameBuilder_ != null) {
        nameBuilder_.dispose();
        nameBuilder_ = null;
      }
      version_ = "";
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.xds.core.v3.ResourceProto.internal_static_xds_core_v3_Resource_descriptor;
    }

    @java.lang.Override
    public com.github.xds.core.v3.Resource getDefaultInstanceForType() {
      return com.github.xds.core.v3.Resource.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.xds.core.v3.Resource build() {
      com.github.xds.core.v3.Resource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.xds.core.v3.Resource buildPartial() {
      com.github.xds.core.v3.Resource result = new com.github.xds.core.v3.Resource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.xds.core.v3.Resource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = nameBuilder_ == null
            ? name_
            : nameBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resourceBuilder_ == null
            ? resource_
            : resourceBuilder_.build();
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
      if (other instanceof com.github.xds.core.v3.Resource) {
        return mergeFrom((com.github.xds.core.v3.Resource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.xds.core.v3.Resource other) {
      if (other == com.github.xds.core.v3.Resource.getDefaultInstance()) return this;
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
                  getNameFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              version_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.github.xds.core.v3.ResourceName name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.xds.core.v3.ResourceName, com.github.xds.core.v3.ResourceName.Builder, com.github.xds.core.v3.ResourceNameOrBuilder> nameBuilder_;
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     * @return The name.
     */
    public com.github.xds.core.v3.ResourceName getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.github.xds.core.v3.ResourceName.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    public Builder setName(com.github.xds.core.v3.ResourceName value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
      } else {
        nameBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    public Builder setName(
        com.github.xds.core.v3.ResourceName.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    public Builder mergeName(com.github.xds.core.v3.ResourceName value) {
      if (nameBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          name_ != null &&
          name_ != com.github.xds.core.v3.ResourceName.getDefaultInstance()) {
          getNameBuilder().mergeFrom(value);
        } else {
          name_ = value;
        }
      } else {
        nameBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = null;
      if (nameBuilder_ != null) {
        nameBuilder_.dispose();
        nameBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    public com.github.xds.core.v3.ResourceName.Builder getNameBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    public com.github.xds.core.v3.ResourceNameOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.github.xds.core.v3.ResourceName.getDefaultInstance() : name_;
      }
    }
    /**
     * <pre>
     * Resource name. This may be omitted for filesystem resources.
     * </pre>
     *
     * <code>.xds.core.v3.ResourceName name = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.xds.core.v3.ResourceName, com.github.xds.core.v3.ResourceName.Builder, com.github.xds.core.v3.ResourceNameOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.xds.core.v3.ResourceName, com.github.xds.core.v3.ResourceName.Builder, com.github.xds.core.v3.ResourceNameOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * The resource's logical version. It is illegal to have the same named xDS
     * resource name at a given version with different resource payloads.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource's logical version. It is illegal to have the same named xDS
     * resource name at a given version with different resource payloads.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource's logical version. It is illegal to have the same named xDS
     * resource name at a given version with different resource payloads.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource's logical version. It is illegal to have the same named xDS
     * resource name at a given version with different resource payloads.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource's logical version. It is illegal to have the same named xDS
     * resource name at a given version with different resource payloads.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     * @return The resource.
     */
    public com.google.protobuf.Any getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.protobuf.Any.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    public Builder setResource(com.google.protobuf.Any value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    public Builder setResource(
        com.google.protobuf.Any.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    public Builder mergeResource(com.google.protobuf.Any value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          resource_ != null &&
          resource_ != com.google.protobuf.Any.getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    public com.google.protobuf.Any.Builder getResourceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : resource_;
      }
    }
    /**
     * <pre>
     * The resource payload, including type URL.
     * </pre>
     *
     * <code>.google.protobuf.Any resource = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xds.core.v3.Resource)
  }

  // @@protoc_insertion_point(class_scope:xds.core.v3.Resource)
  private static final com.github.xds.core.v3.Resource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.xds.core.v3.Resource();
  }

  public static com.github.xds.core.v3.Resource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resource>
      PARSER = new com.google.protobuf.AbstractParser<Resource>() {
    @java.lang.Override
    public Resource parsePartialFrom(
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

  public static com.google.protobuf.Parser<Resource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.xds.core.v3.Resource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
