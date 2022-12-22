// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Request message for
 * [UpdatePolicyTag][google.cloud.datacatalog.v1.PolicyTagManager.UpdatePolicyTag].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.UpdatePolicyTagRequest}
 */
public final class UpdatePolicyTagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.UpdatePolicyTagRequest)
    UpdatePolicyTagRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePolicyTagRequest.newBuilder() to construct.
  private UpdatePolicyTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePolicyTagRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePolicyTagRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.class, com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.Builder.class);
  }

  public static final int POLICY_TAG_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.PolicyTag policyTag_;
  /**
   * <pre>
   * The policy tag to update. You can update only its description, display
   * name, and parent policy tag fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
   * @return Whether the policyTag field is set.
   */
  @java.lang.Override
  public boolean hasPolicyTag() {
    return policyTag_ != null;
  }
  /**
   * <pre>
   * The policy tag to update. You can update only its description, display
   * name, and parent policy tag fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
   * @return The policyTag.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.PolicyTag getPolicyTag() {
    return policyTag_ == null ? com.google.cloud.datacatalog.v1.PolicyTag.getDefaultInstance() : policyTag_;
  }
  /**
   * <pre>
   * The policy tag to update. You can update only its description, display
   * name, and parent policy tag fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.PolicyTagOrBuilder getPolicyTagOrBuilder() {
    return policyTag_ == null ? com.google.cloud.datacatalog.v1.PolicyTag.getDefaultInstance() : policyTag_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Specifies the fields to update.
   * You can update only display name, description, and parent policy tag.
   * If not set, defaults to all updatable fields.
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Specifies the fields to update.
   * You can update only display name, description, and parent policy tag.
   * If not set, defaults to all updatable fields.
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Specifies the fields to update.
   * You can update only display name, description, and parent policy tag.
   * If not set, defaults to all updatable fields.
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
    if (policyTag_ != null) {
      output.writeMessage(1, getPolicyTag());
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
    if (policyTag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPolicyTag());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest other = (com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest) obj;

    if (hasPolicyTag() != other.hasPolicyTag()) return false;
    if (hasPolicyTag()) {
      if (!getPolicyTag()
          .equals(other.getPolicyTag())) return false;
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
    if (hasPolicyTag()) {
      hash = (37 * hash) + POLICY_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyTag().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest prototype) {
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
   * Request message for
   * [UpdatePolicyTag][google.cloud.datacatalog.v1.PolicyTagManager.UpdatePolicyTag].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.UpdatePolicyTagRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.UpdatePolicyTagRequest)
      com.google.cloud.datacatalog.v1.UpdatePolicyTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.class, com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.newBuilder()
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
      policyTag_ = null;
      if (policyTagBuilder_ != null) {
        policyTagBuilder_.dispose();
        policyTagBuilder_ = null;
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
      return com.google.cloud.datacatalog.v1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest build() {
      com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest buildPartial() {
      com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest result = new com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.policyTag_ = policyTagBuilder_ == null
            ? policyTag_
            : policyTagBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest other) {
      if (other == com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest.getDefaultInstance()) return this;
      if (other.hasPolicyTag()) {
        mergePolicyTag(other.getPolicyTag());
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
                  getPolicyTagFieldBuilder().getBuilder(),
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

    private com.google.cloud.datacatalog.v1.PolicyTag policyTag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.PolicyTag, com.google.cloud.datacatalog.v1.PolicyTag.Builder, com.google.cloud.datacatalog.v1.PolicyTagOrBuilder> policyTagBuilder_;
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     * @return Whether the policyTag field is set.
     */
    public boolean hasPolicyTag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     * @return The policyTag.
     */
    public com.google.cloud.datacatalog.v1.PolicyTag getPolicyTag() {
      if (policyTagBuilder_ == null) {
        return policyTag_ == null ? com.google.cloud.datacatalog.v1.PolicyTag.getDefaultInstance() : policyTag_;
      } else {
        return policyTagBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    public Builder setPolicyTag(com.google.cloud.datacatalog.v1.PolicyTag value) {
      if (policyTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyTag_ = value;
      } else {
        policyTagBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    public Builder setPolicyTag(
        com.google.cloud.datacatalog.v1.PolicyTag.Builder builderForValue) {
      if (policyTagBuilder_ == null) {
        policyTag_ = builderForValue.build();
      } else {
        policyTagBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    public Builder mergePolicyTag(com.google.cloud.datacatalog.v1.PolicyTag value) {
      if (policyTagBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          policyTag_ != null &&
          policyTag_ != com.google.cloud.datacatalog.v1.PolicyTag.getDefaultInstance()) {
          getPolicyTagBuilder().mergeFrom(value);
        } else {
          policyTag_ = value;
        }
      } else {
        policyTagBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    public Builder clearPolicyTag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policyTag_ = null;
      if (policyTagBuilder_ != null) {
        policyTagBuilder_.dispose();
        policyTagBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.PolicyTag.Builder getPolicyTagBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPolicyTagFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.PolicyTagOrBuilder getPolicyTagOrBuilder() {
      if (policyTagBuilder_ != null) {
        return policyTagBuilder_.getMessageOrBuilder();
      } else {
        return policyTag_ == null ?
            com.google.cloud.datacatalog.v1.PolicyTag.getDefaultInstance() : policyTag_;
      }
    }
    /**
     * <pre>
     * The policy tag to update. You can update only its description, display
     * name, and parent policy tag fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.PolicyTag, com.google.cloud.datacatalog.v1.PolicyTag.Builder, com.google.cloud.datacatalog.v1.PolicyTagOrBuilder> 
        getPolicyTagFieldBuilder() {
      if (policyTagBuilder_ == null) {
        policyTagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.PolicyTag, com.google.cloud.datacatalog.v1.PolicyTag.Builder, com.google.cloud.datacatalog.v1.PolicyTagOrBuilder>(
                getPolicyTag(),
                getParentForChildren(),
                isClean());
        policyTag_ = null;
      }
      return policyTagBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Specifies the fields to update.
     * You can update only display name, description, and parent policy tag.
     * If not set, defaults to all updatable fields.
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.UpdatePolicyTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.UpdatePolicyTagRequest)
  private static final com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest();
  }

  public static com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePolicyTagRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePolicyTagRequest>() {
    @java.lang.Override
    public UpdatePolicyTagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePolicyTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePolicyTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UpdatePolicyTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
