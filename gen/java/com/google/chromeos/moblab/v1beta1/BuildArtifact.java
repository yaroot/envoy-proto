// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/moblab/v1beta1/resources.proto

package com.google.chromeos.moblab.v1beta1;

/**
 * <pre>
 * Resource that represents a build artifact stored in Google Cloud Storage for
 * the given build target, model, build version and bucket.
 * </pre>
 *
 * Protobuf type {@code google.chromeos.moblab.v1beta1.BuildArtifact}
 */
public final class BuildArtifact extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.chromeos.moblab.v1beta1.BuildArtifact)
    BuildArtifactOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildArtifact.newBuilder() to construct.
  private BuildArtifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildArtifact() {
    name_ = "";
    build_ = "";
    bucket_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildArtifact();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.chromeos.moblab.v1beta1.ResourcesProto.internal_static_google_chromeos_moblab_v1beta1_BuildArtifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chromeos.moblab.v1beta1.ResourcesProto.internal_static_google_chromeos_moblab_v1beta1_BuildArtifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chromeos.moblab.v1beta1.BuildArtifact.class, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The resource name of the build artifact.
   * Format:
   * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
   * Example:
   * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the build artifact.
   * Format:
   * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
   * Example:
   * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object build_ = "";
  /**
   * <pre>
   * The build metadata of the build artifact.
   * </pre>
   *
   * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The build.
   */
  @java.lang.Override
  public java.lang.String getBuild() {
    java.lang.Object ref = build_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      build_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The build metadata of the build artifact.
   * </pre>
   *
   * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for build.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBuildBytes() {
    java.lang.Object ref = build_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      build_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUCKET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bucket_ = "";
  /**
   * <pre>
   * The bucket that stores the build artifact.
   * </pre>
   *
   * <code>string bucket = 3;</code>
   * @return The bucket.
   */
  @java.lang.Override
  public java.lang.String getBucket() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The bucket that stores the build artifact.
   * </pre>
   *
   * <code>string bucket = 3;</code>
   * @return The bytes for bucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketBytes() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <pre>
   * The path of the build artifact in the bucket.
   * </pre>
   *
   * <code>string path = 4;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The path of the build artifact in the bucket.
   * </pre>
   *
   * <code>string path = 4;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_COUNT_FIELD_NUMBER = 5;
  private int objectCount_ = 0;
  /**
   * <pre>
   * The number of objects in the build artifact folder. The object number can
   * be used to calculated the stage progress by comparing the source build
   * artifact with the destination build artifact.
   * </pre>
   *
   * <code>uint32 object_count = 5;</code>
   * @return The objectCount.
   */
  @java.lang.Override
  public int getObjectCount() {
    return objectCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(build_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, build_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, path_);
    }
    if (objectCount_ != 0) {
      output.writeUInt32(5, objectCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(build_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, build_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, path_);
    }
    if (objectCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, objectCount_);
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
    if (!(obj instanceof com.google.chromeos.moblab.v1beta1.BuildArtifact)) {
      return super.equals(obj);
    }
    com.google.chromeos.moblab.v1beta1.BuildArtifact other = (com.google.chromeos.moblab.v1beta1.BuildArtifact) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getBuild()
        .equals(other.getBuild())) return false;
    if (!getBucket()
        .equals(other.getBucket())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
    if (getObjectCount()
        != other.getObjectCount()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + BUILD_FIELD_NUMBER;
    hash = (53 * hash) + getBuild().hashCode();
    hash = (37 * hash) + BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getBucket().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + OBJECT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getObjectCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.moblab.v1beta1.BuildArtifact parseFrom(
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
  public static Builder newBuilder(com.google.chromeos.moblab.v1beta1.BuildArtifact prototype) {
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
   * Resource that represents a build artifact stored in Google Cloud Storage for
   * the given build target, model, build version and bucket.
   * </pre>
   *
   * Protobuf type {@code google.chromeos.moblab.v1beta1.BuildArtifact}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.chromeos.moblab.v1beta1.BuildArtifact)
      com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.chromeos.moblab.v1beta1.ResourcesProto.internal_static_google_chromeos_moblab_v1beta1_BuildArtifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chromeos.moblab.v1beta1.ResourcesProto.internal_static_google_chromeos_moblab_v1beta1_BuildArtifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chromeos.moblab.v1beta1.BuildArtifact.class, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder.class);
    }

    // Construct using com.google.chromeos.moblab.v1beta1.BuildArtifact.newBuilder()
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
      name_ = "";
      build_ = "";
      bucket_ = "";
      path_ = "";
      objectCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.chromeos.moblab.v1beta1.ResourcesProto.internal_static_google_chromeos_moblab_v1beta1_BuildArtifact_descriptor;
    }

    @java.lang.Override
    public com.google.chromeos.moblab.v1beta1.BuildArtifact getDefaultInstanceForType() {
      return com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chromeos.moblab.v1beta1.BuildArtifact build() {
      com.google.chromeos.moblab.v1beta1.BuildArtifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chromeos.moblab.v1beta1.BuildArtifact buildPartial() {
      com.google.chromeos.moblab.v1beta1.BuildArtifact result = new com.google.chromeos.moblab.v1beta1.BuildArtifact(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chromeos.moblab.v1beta1.BuildArtifact result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.build_ = build_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bucket_ = bucket_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.objectCount_ = objectCount_;
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
      if (other instanceof com.google.chromeos.moblab.v1beta1.BuildArtifact) {
        return mergeFrom((com.google.chromeos.moblab.v1beta1.BuildArtifact)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chromeos.moblab.v1beta1.BuildArtifact other) {
      if (other == com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBuild().isEmpty()) {
        build_ = other.build_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getObjectCount() != 0) {
        setObjectCount(other.getObjectCount());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              build_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              bucket_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              path_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              objectCount_ = input.readUInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name of the build artifact.
     * Format:
     * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
     * Example:
     * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the build artifact.
     * Format:
     * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
     * Example:
     * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the build artifact.
     * Format:
     * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
     * Example:
     * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the build artifact.
     * Format:
     * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
     * Example:
     * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the build artifact.
     * Format:
     * buildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}
     * Example:
     * buildTargets/octopus/models/bobba/builds/1234.0.0/artifacts/chromeos-moblab-peng-staging
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object build_ = "";
    /**
     * <pre>
     * The build metadata of the build artifact.
     * </pre>
     *
     * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The build.
     */
    public java.lang.String getBuild() {
      java.lang.Object ref = build_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        build_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The build metadata of the build artifact.
     * </pre>
     *
     * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for build.
     */
    public com.google.protobuf.ByteString
        getBuildBytes() {
      java.lang.Object ref = build_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        build_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The build metadata of the build artifact.
     * </pre>
     *
     * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The build to set.
     * @return This builder for chaining.
     */
    public Builder setBuild(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      build_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The build metadata of the build artifact.
     * </pre>
     *
     * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBuild() {
      build_ = getDefaultInstance().getBuild();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The build metadata of the build artifact.
     * </pre>
     *
     * <code>string build = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for build to set.
     * @return This builder for chaining.
     */
    public Builder setBuildBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      build_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object bucket_ = "";
    /**
     * <pre>
     * The bucket that stores the build artifact.
     * </pre>
     *
     * <code>string bucket = 3;</code>
     * @return The bucket.
     */
    public java.lang.String getBucket() {
      java.lang.Object ref = bucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The bucket that stores the build artifact.
     * </pre>
     *
     * <code>string bucket = 3;</code>
     * @return The bytes for bucket.
     */
    public com.google.protobuf.ByteString
        getBucketBytes() {
      java.lang.Object ref = bucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The bucket that stores the build artifact.
     * </pre>
     *
     * <code>string bucket = 3;</code>
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bucket_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bucket that stores the build artifact.
     * </pre>
     *
     * <code>string bucket = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBucket() {
      bucket_ = getDefaultInstance().getBucket();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bucket that stores the build artifact.
     * </pre>
     *
     * <code>string bucket = 3;</code>
     * @param value The bytes for bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bucket_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * The path of the build artifact in the bucket.
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The path of the build artifact in the bucket.
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The path of the build artifact in the bucket.
     * </pre>
     *
     * <code>string path = 4;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path of the build artifact in the bucket.
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path of the build artifact in the bucket.
     * </pre>
     *
     * <code>string path = 4;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      path_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int objectCount_ ;
    /**
     * <pre>
     * The number of objects in the build artifact folder. The object number can
     * be used to calculated the stage progress by comparing the source build
     * artifact with the destination build artifact.
     * </pre>
     *
     * <code>uint32 object_count = 5;</code>
     * @return The objectCount.
     */
    @java.lang.Override
    public int getObjectCount() {
      return objectCount_;
    }
    /**
     * <pre>
     * The number of objects in the build artifact folder. The object number can
     * be used to calculated the stage progress by comparing the source build
     * artifact with the destination build artifact.
     * </pre>
     *
     * <code>uint32 object_count = 5;</code>
     * @param value The objectCount to set.
     * @return This builder for chaining.
     */
    public Builder setObjectCount(int value) {
      
      objectCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of objects in the build artifact folder. The object number can
     * be used to calculated the stage progress by comparing the source build
     * artifact with the destination build artifact.
     * </pre>
     *
     * <code>uint32 object_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      objectCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.chromeos.moblab.v1beta1.BuildArtifact)
  }

  // @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.BuildArtifact)
  private static final com.google.chromeos.moblab.v1beta1.BuildArtifact DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.chromeos.moblab.v1beta1.BuildArtifact();
  }

  public static com.google.chromeos.moblab.v1beta1.BuildArtifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildArtifact>
      PARSER = new com.google.protobuf.AbstractParser<BuildArtifact>() {
    @java.lang.Override
    public BuildArtifact parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildArtifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildArtifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chromeos.moblab.v1beta1.BuildArtifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
