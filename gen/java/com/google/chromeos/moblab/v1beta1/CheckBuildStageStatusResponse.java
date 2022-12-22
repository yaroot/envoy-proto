// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/moblab/v1beta1/build_service.proto

package com.google.chromeos.moblab.v1beta1;

/**
 * <pre>
 * Response message for checking the stage status of a build artifact.
 * </pre>
 *
 * Protobuf type {@code google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse}
 */
public final class CheckBuildStageStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse)
    CheckBuildStageStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckBuildStageStatusResponse.newBuilder() to construct.
  private CheckBuildStageStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckBuildStageStatusResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckBuildStageStatusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.chromeos.moblab.v1beta1.BuildServiceProto.internal_static_google_chromeos_moblab_v1beta1_CheckBuildStageStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chromeos.moblab.v1beta1.BuildServiceProto.internal_static_google_chromeos_moblab_v1beta1_CheckBuildStageStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.class, com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.Builder.class);
  }

  public static final int IS_BUILD_STAGED_FIELD_NUMBER = 1;
  private boolean isBuildStaged_ = false;
  /**
   * <pre>
   * The status to represent if the build is staged or not.
   * </pre>
   *
   * <code>bool is_build_staged = 1;</code>
   * @return The isBuildStaged.
   */
  @java.lang.Override
  public boolean getIsBuildStaged() {
    return isBuildStaged_;
  }

  public static final int STAGED_BUILD_ARTIFACT_FIELD_NUMBER = 2;
  private com.google.chromeos.moblab.v1beta1.BuildArtifact stagedBuildArtifact_;
  /**
   * <pre>
   * The staged build artifact in the destination bucket.
   * </pre>
   *
   * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
   * @return Whether the stagedBuildArtifact field is set.
   */
  @java.lang.Override
  public boolean hasStagedBuildArtifact() {
    return stagedBuildArtifact_ != null;
  }
  /**
   * <pre>
   * The staged build artifact in the destination bucket.
   * </pre>
   *
   * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
   * @return The stagedBuildArtifact.
   */
  @java.lang.Override
  public com.google.chromeos.moblab.v1beta1.BuildArtifact getStagedBuildArtifact() {
    return stagedBuildArtifact_ == null ? com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : stagedBuildArtifact_;
  }
  /**
   * <pre>
   * The staged build artifact in the destination bucket.
   * </pre>
   *
   * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
   */
  @java.lang.Override
  public com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder getStagedBuildArtifactOrBuilder() {
    return stagedBuildArtifact_ == null ? com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : stagedBuildArtifact_;
  }

  public static final int SOURCE_BUILD_ARTIFACT_FIELD_NUMBER = 3;
  private com.google.chromeos.moblab.v1beta1.BuildArtifact sourceBuildArtifact_;
  /**
   * <pre>
   * The source build artifact in the source bucket.
   * </pre>
   *
   * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
   * @return Whether the sourceBuildArtifact field is set.
   */
  @java.lang.Override
  public boolean hasSourceBuildArtifact() {
    return sourceBuildArtifact_ != null;
  }
  /**
   * <pre>
   * The source build artifact in the source bucket.
   * </pre>
   *
   * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
   * @return The sourceBuildArtifact.
   */
  @java.lang.Override
  public com.google.chromeos.moblab.v1beta1.BuildArtifact getSourceBuildArtifact() {
    return sourceBuildArtifact_ == null ? com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : sourceBuildArtifact_;
  }
  /**
   * <pre>
   * The source build artifact in the source bucket.
   * </pre>
   *
   * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
   */
  @java.lang.Override
  public com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder getSourceBuildArtifactOrBuilder() {
    return sourceBuildArtifact_ == null ? com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : sourceBuildArtifact_;
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
    if (isBuildStaged_ != false) {
      output.writeBool(1, isBuildStaged_);
    }
    if (stagedBuildArtifact_ != null) {
      output.writeMessage(2, getStagedBuildArtifact());
    }
    if (sourceBuildArtifact_ != null) {
      output.writeMessage(3, getSourceBuildArtifact());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isBuildStaged_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isBuildStaged_);
    }
    if (stagedBuildArtifact_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStagedBuildArtifact());
    }
    if (sourceBuildArtifact_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSourceBuildArtifact());
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
    if (!(obj instanceof com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse)) {
      return super.equals(obj);
    }
    com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse other = (com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse) obj;

    if (getIsBuildStaged()
        != other.getIsBuildStaged()) return false;
    if (hasStagedBuildArtifact() != other.hasStagedBuildArtifact()) return false;
    if (hasStagedBuildArtifact()) {
      if (!getStagedBuildArtifact()
          .equals(other.getStagedBuildArtifact())) return false;
    }
    if (hasSourceBuildArtifact() != other.hasSourceBuildArtifact()) return false;
    if (hasSourceBuildArtifact()) {
      if (!getSourceBuildArtifact()
          .equals(other.getSourceBuildArtifact())) return false;
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
    hash = (37 * hash) + IS_BUILD_STAGED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsBuildStaged());
    if (hasStagedBuildArtifact()) {
      hash = (37 * hash) + STAGED_BUILD_ARTIFACT_FIELD_NUMBER;
      hash = (53 * hash) + getStagedBuildArtifact().hashCode();
    }
    if (hasSourceBuildArtifact()) {
      hash = (37 * hash) + SOURCE_BUILD_ARTIFACT_FIELD_NUMBER;
      hash = (53 * hash) + getSourceBuildArtifact().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse parseFrom(
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
  public static Builder newBuilder(com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse prototype) {
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
   * Response message for checking the stage status of a build artifact.
   * </pre>
   *
   * Protobuf type {@code google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse)
      com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.chromeos.moblab.v1beta1.BuildServiceProto.internal_static_google_chromeos_moblab_v1beta1_CheckBuildStageStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chromeos.moblab.v1beta1.BuildServiceProto.internal_static_google_chromeos_moblab_v1beta1_CheckBuildStageStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.class, com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.Builder.class);
    }

    // Construct using com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.newBuilder()
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
      isBuildStaged_ = false;
      stagedBuildArtifact_ = null;
      if (stagedBuildArtifactBuilder_ != null) {
        stagedBuildArtifactBuilder_.dispose();
        stagedBuildArtifactBuilder_ = null;
      }
      sourceBuildArtifact_ = null;
      if (sourceBuildArtifactBuilder_ != null) {
        sourceBuildArtifactBuilder_.dispose();
        sourceBuildArtifactBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.chromeos.moblab.v1beta1.BuildServiceProto.internal_static_google_chromeos_moblab_v1beta1_CheckBuildStageStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse getDefaultInstanceForType() {
      return com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse build() {
      com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse buildPartial() {
      com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse result = new com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isBuildStaged_ = isBuildStaged_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stagedBuildArtifact_ = stagedBuildArtifactBuilder_ == null
            ? stagedBuildArtifact_
            : stagedBuildArtifactBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sourceBuildArtifact_ = sourceBuildArtifactBuilder_ == null
            ? sourceBuildArtifact_
            : sourceBuildArtifactBuilder_.build();
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
      if (other instanceof com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse) {
        return mergeFrom((com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse other) {
      if (other == com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse.getDefaultInstance()) return this;
      if (other.getIsBuildStaged() != false) {
        setIsBuildStaged(other.getIsBuildStaged());
      }
      if (other.hasStagedBuildArtifact()) {
        mergeStagedBuildArtifact(other.getStagedBuildArtifact());
      }
      if (other.hasSourceBuildArtifact()) {
        mergeSourceBuildArtifact(other.getSourceBuildArtifact());
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
              isBuildStaged_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStagedBuildArtifactFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSourceBuildArtifactFieldBuilder().getBuilder(),
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

    private boolean isBuildStaged_ ;
    /**
     * <pre>
     * The status to represent if the build is staged or not.
     * </pre>
     *
     * <code>bool is_build_staged = 1;</code>
     * @return The isBuildStaged.
     */
    @java.lang.Override
    public boolean getIsBuildStaged() {
      return isBuildStaged_;
    }
    /**
     * <pre>
     * The status to represent if the build is staged or not.
     * </pre>
     *
     * <code>bool is_build_staged = 1;</code>
     * @param value The isBuildStaged to set.
     * @return This builder for chaining.
     */
    public Builder setIsBuildStaged(boolean value) {
      
      isBuildStaged_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status to represent if the build is staged or not.
     * </pre>
     *
     * <code>bool is_build_staged = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsBuildStaged() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isBuildStaged_ = false;
      onChanged();
      return this;
    }

    private com.google.chromeos.moblab.v1beta1.BuildArtifact stagedBuildArtifact_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.chromeos.moblab.v1beta1.BuildArtifact, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder, com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder> stagedBuildArtifactBuilder_;
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     * @return Whether the stagedBuildArtifact field is set.
     */
    public boolean hasStagedBuildArtifact() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     * @return The stagedBuildArtifact.
     */
    public com.google.chromeos.moblab.v1beta1.BuildArtifact getStagedBuildArtifact() {
      if (stagedBuildArtifactBuilder_ == null) {
        return stagedBuildArtifact_ == null ? com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : stagedBuildArtifact_;
      } else {
        return stagedBuildArtifactBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    public Builder setStagedBuildArtifact(com.google.chromeos.moblab.v1beta1.BuildArtifact value) {
      if (stagedBuildArtifactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stagedBuildArtifact_ = value;
      } else {
        stagedBuildArtifactBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    public Builder setStagedBuildArtifact(
        com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder builderForValue) {
      if (stagedBuildArtifactBuilder_ == null) {
        stagedBuildArtifact_ = builderForValue.build();
      } else {
        stagedBuildArtifactBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    public Builder mergeStagedBuildArtifact(com.google.chromeos.moblab.v1beta1.BuildArtifact value) {
      if (stagedBuildArtifactBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          stagedBuildArtifact_ != null &&
          stagedBuildArtifact_ != com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance()) {
          getStagedBuildArtifactBuilder().mergeFrom(value);
        } else {
          stagedBuildArtifact_ = value;
        }
      } else {
        stagedBuildArtifactBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    public Builder clearStagedBuildArtifact() {
      bitField0_ = (bitField0_ & ~0x00000002);
      stagedBuildArtifact_ = null;
      if (stagedBuildArtifactBuilder_ != null) {
        stagedBuildArtifactBuilder_.dispose();
        stagedBuildArtifactBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    public com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder getStagedBuildArtifactBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStagedBuildArtifactFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    public com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder getStagedBuildArtifactOrBuilder() {
      if (stagedBuildArtifactBuilder_ != null) {
        return stagedBuildArtifactBuilder_.getMessageOrBuilder();
      } else {
        return stagedBuildArtifact_ == null ?
            com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : stagedBuildArtifact_;
      }
    }
    /**
     * <pre>
     * The staged build artifact in the destination bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact staged_build_artifact = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.chromeos.moblab.v1beta1.BuildArtifact, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder, com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder> 
        getStagedBuildArtifactFieldBuilder() {
      if (stagedBuildArtifactBuilder_ == null) {
        stagedBuildArtifactBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.chromeos.moblab.v1beta1.BuildArtifact, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder, com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder>(
                getStagedBuildArtifact(),
                getParentForChildren(),
                isClean());
        stagedBuildArtifact_ = null;
      }
      return stagedBuildArtifactBuilder_;
    }

    private com.google.chromeos.moblab.v1beta1.BuildArtifact sourceBuildArtifact_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.chromeos.moblab.v1beta1.BuildArtifact, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder, com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder> sourceBuildArtifactBuilder_;
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     * @return Whether the sourceBuildArtifact field is set.
     */
    public boolean hasSourceBuildArtifact() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     * @return The sourceBuildArtifact.
     */
    public com.google.chromeos.moblab.v1beta1.BuildArtifact getSourceBuildArtifact() {
      if (sourceBuildArtifactBuilder_ == null) {
        return sourceBuildArtifact_ == null ? com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : sourceBuildArtifact_;
      } else {
        return sourceBuildArtifactBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    public Builder setSourceBuildArtifact(com.google.chromeos.moblab.v1beta1.BuildArtifact value) {
      if (sourceBuildArtifactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceBuildArtifact_ = value;
      } else {
        sourceBuildArtifactBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    public Builder setSourceBuildArtifact(
        com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder builderForValue) {
      if (sourceBuildArtifactBuilder_ == null) {
        sourceBuildArtifact_ = builderForValue.build();
      } else {
        sourceBuildArtifactBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    public Builder mergeSourceBuildArtifact(com.google.chromeos.moblab.v1beta1.BuildArtifact value) {
      if (sourceBuildArtifactBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          sourceBuildArtifact_ != null &&
          sourceBuildArtifact_ != com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance()) {
          getSourceBuildArtifactBuilder().mergeFrom(value);
        } else {
          sourceBuildArtifact_ = value;
        }
      } else {
        sourceBuildArtifactBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    public Builder clearSourceBuildArtifact() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sourceBuildArtifact_ = null;
      if (sourceBuildArtifactBuilder_ != null) {
        sourceBuildArtifactBuilder_.dispose();
        sourceBuildArtifactBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    public com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder getSourceBuildArtifactBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSourceBuildArtifactFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    public com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder getSourceBuildArtifactOrBuilder() {
      if (sourceBuildArtifactBuilder_ != null) {
        return sourceBuildArtifactBuilder_.getMessageOrBuilder();
      } else {
        return sourceBuildArtifact_ == null ?
            com.google.chromeos.moblab.v1beta1.BuildArtifact.getDefaultInstance() : sourceBuildArtifact_;
      }
    }
    /**
     * <pre>
     * The source build artifact in the source bucket.
     * </pre>
     *
     * <code>.google.chromeos.moblab.v1beta1.BuildArtifact source_build_artifact = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.chromeos.moblab.v1beta1.BuildArtifact, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder, com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder> 
        getSourceBuildArtifactFieldBuilder() {
      if (sourceBuildArtifactBuilder_ == null) {
        sourceBuildArtifactBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.chromeos.moblab.v1beta1.BuildArtifact, com.google.chromeos.moblab.v1beta1.BuildArtifact.Builder, com.google.chromeos.moblab.v1beta1.BuildArtifactOrBuilder>(
                getSourceBuildArtifact(),
                getParentForChildren(),
                isClean());
        sourceBuildArtifact_ = null;
      }
      return sourceBuildArtifactBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse)
  private static final com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse();
  }

  public static com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckBuildStageStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckBuildStageStatusResponse>() {
    @java.lang.Override
    public CheckBuildStageStatusResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckBuildStageStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckBuildStageStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chromeos.moblab.v1beta1.CheckBuildStageStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
