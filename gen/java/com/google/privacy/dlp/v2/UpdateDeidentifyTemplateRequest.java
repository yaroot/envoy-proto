// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Request message for UpdateDeidentifyTemplate.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest}
 */
public final class UpdateDeidentifyTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)
    UpdateDeidentifyTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDeidentifyTemplateRequest.newBuilder() to construct.
  private UpdateDeidentifyTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDeidentifyTemplateRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDeidentifyTemplateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateDeidentifyTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateDeidentifyTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.class, com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. Resource name of organization and deidentify template to be updated, for
   * example `organizations/433245324/deidentifyTemplates/432452342` or
   * projects/project-id/deidentifyTemplates/432452342.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
   * Required. Resource name of organization and deidentify template to be updated, for
   * example `organizations/433245324/deidentifyTemplates/432452342` or
   * projects/project-id/deidentifyTemplates/432452342.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

  public static final int DEIDENTIFY_TEMPLATE_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.DeidentifyTemplate deidentifyTemplate_;
  /**
   * <pre>
   * New DeidentifyTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
   * @return Whether the deidentifyTemplate field is set.
   */
  @java.lang.Override
  public boolean hasDeidentifyTemplate() {
    return deidentifyTemplate_ != null;
  }
  /**
   * <pre>
   * New DeidentifyTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
   * @return The deidentifyTemplate.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplate() {
    return deidentifyTemplate_ == null ? com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
  }
  /**
   * <pre>
   * New DeidentifyTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder() {
    return deidentifyTemplate_ == null ? com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (deidentifyTemplate_ != null) {
      output.writeMessage(2, getDeidentifyTemplate());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
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
    if (deidentifyTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeidentifyTemplate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest other = (com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasDeidentifyTemplate() != other.hasDeidentifyTemplate()) return false;
    if (hasDeidentifyTemplate()) {
      if (!getDeidentifyTemplate()
          .equals(other.getDeidentifyTemplate())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasDeidentifyTemplate()) {
      hash = (37 * hash) + DEIDENTIFY_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getDeidentifyTemplate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest prototype) {
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
   * Request message for UpdateDeidentifyTemplate.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)
      com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateDeidentifyTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateDeidentifyTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.class, com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.newBuilder()
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
      deidentifyTemplate_ = null;
      if (deidentifyTemplateBuilder_ != null) {
        deidentifyTemplateBuilder_.dispose();
        deidentifyTemplateBuilder_ = null;
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
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateDeidentifyTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest build() {
      com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest buildPartial() {
      com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest result = new com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deidentifyTemplate_ = deidentifyTemplateBuilder_ == null
            ? deidentifyTemplate_
            : deidentifyTemplateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
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
      if (other instanceof com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest other) {
      if (other == com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDeidentifyTemplate()) {
        mergeDeidentifyTemplate(other.getDeidentifyTemplate());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDeidentifyTemplateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Resource name of organization and deidentify template to be updated, for
     * example `organizations/433245324/deidentifyTemplates/432452342` or
     * projects/project-id/deidentifyTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Resource name of organization and deidentify template to be updated, for
     * example `organizations/433245324/deidentifyTemplates/432452342` or
     * projects/project-id/deidentifyTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Resource name of organization and deidentify template to be updated, for
     * example `organizations/433245324/deidentifyTemplates/432452342` or
     * projects/project-id/deidentifyTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Resource name of organization and deidentify template to be updated, for
     * example `organizations/433245324/deidentifyTemplates/432452342` or
     * projects/project-id/deidentifyTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Resource name of organization and deidentify template to be updated, for
     * example `organizations/433245324/deidentifyTemplates/432452342` or
     * projects/project-id/deidentifyTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

    private com.google.privacy.dlp.v2.DeidentifyTemplate deidentifyTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.DeidentifyTemplate, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder> deidentifyTemplateBuilder_;
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     * @return Whether the deidentifyTemplate field is set.
     */
    public boolean hasDeidentifyTemplate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     * @return The deidentifyTemplate.
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplate() {
      if (deidentifyTemplateBuilder_ == null) {
        return deidentifyTemplate_ == null ? com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
      } else {
        return deidentifyTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder setDeidentifyTemplate(com.google.privacy.dlp.v2.DeidentifyTemplate value) {
      if (deidentifyTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deidentifyTemplate_ = value;
      } else {
        deidentifyTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder setDeidentifyTemplate(
        com.google.privacy.dlp.v2.DeidentifyTemplate.Builder builderForValue) {
      if (deidentifyTemplateBuilder_ == null) {
        deidentifyTemplate_ = builderForValue.build();
      } else {
        deidentifyTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder mergeDeidentifyTemplate(com.google.privacy.dlp.v2.DeidentifyTemplate value) {
      if (deidentifyTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          deidentifyTemplate_ != null &&
          deidentifyTemplate_ != com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance()) {
          getDeidentifyTemplateBuilder().mergeFrom(value);
        } else {
          deidentifyTemplate_ = value;
        }
      } else {
        deidentifyTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder clearDeidentifyTemplate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deidentifyTemplate_ = null;
      if (deidentifyTemplateBuilder_ != null) {
        deidentifyTemplateBuilder_.dispose();
        deidentifyTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplate.Builder getDeidentifyTemplateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDeidentifyTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder() {
      if (deidentifyTemplateBuilder_ != null) {
        return deidentifyTemplateBuilder_.getMessageOrBuilder();
      } else {
        return deidentifyTemplate_ == null ?
            com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
      }
    }
    /**
     * <pre>
     * New DeidentifyTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.DeidentifyTemplate, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder> 
        getDeidentifyTemplateFieldBuilder() {
      if (deidentifyTemplateBuilder_ == null) {
        deidentifyTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DeidentifyTemplate, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder>(
                getDeidentifyTemplate(),
                getParentForChildren(),
                isClean());
        deidentifyTemplate_ = null;
      }
      return deidentifyTemplateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)
  private static final com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest();
  }

  public static com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDeidentifyTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDeidentifyTemplateRequest>() {
    @java.lang.Override
    public UpdateDeidentifyTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDeidentifyTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDeidentifyTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
