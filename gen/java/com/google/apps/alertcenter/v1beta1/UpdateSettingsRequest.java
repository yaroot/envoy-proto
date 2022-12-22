// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/alertcenter/v1beta1/alertcenter.proto

package com.google.apps.alertcenter.v1beta1;

/**
 * <pre>
 * Update the customer level settings.
 * </pre>
 *
 * Protobuf type {@code google.apps.alertcenter.v1beta1.UpdateSettingsRequest}
 */
public final class UpdateSettingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.alertcenter.v1beta1.UpdateSettingsRequest)
    UpdateSettingsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSettingsRequest.newBuilder() to construct.
  private UpdateSettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSettingsRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSettingsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_UpdateSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_UpdateSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.class, com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Optional. The unique identifier of the Google Workspace organization
   * account of the customer the alert settings are associated with.
   * Inferred from the caller identity if not provided.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The unique identifier of the Google Workspace organization
   * account of the customer the alert settings are associated with.
   * Inferred from the caller identity if not provided.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private com.google.apps.alertcenter.v1beta1.Settings settings_;
  /**
   * <pre>
   * The customer settings to update.
   * </pre>
   *
   * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <pre>
   * The customer settings to update.
   * </pre>
   *
   * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.google.apps.alertcenter.v1beta1.Settings getSettings() {
    return settings_ == null ? com.google.apps.alertcenter.v1beta1.Settings.getDefaultInstance() : settings_;
  }
  /**
   * <pre>
   * The customer settings to update.
   * </pre>
   *
   * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
   */
  @java.lang.Override
  public com.google.apps.alertcenter.v1beta1.SettingsOrBuilder getSettingsOrBuilder() {
    return settings_ == null ? com.google.apps.alertcenter.v1beta1.Settings.getDefaultInstance() : settings_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (settings_ != null) {
      output.writeMessage(2, getSettings());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSettings());
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
    if (!(obj instanceof com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest other = (com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest parseFrom(
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
  public static Builder newBuilder(com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest prototype) {
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
   * Update the customer level settings.
   * </pre>
   *
   * Protobuf type {@code google.apps.alertcenter.v1beta1.UpdateSettingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.alertcenter.v1beta1.UpdateSettingsRequest)
      com.google.apps.alertcenter.v1beta1.UpdateSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_UpdateSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_UpdateSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.class, com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.Builder.class);
    }

    // Construct using com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.newBuilder()
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
      customerId_ = "";
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_UpdateSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest getDefaultInstanceForType() {
      return com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest build() {
      com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest buildPartial() {
      com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest result = new com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.settings_ = settingsBuilder_ == null
            ? settings_
            : settingsBuilder_.build();
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
      if (other instanceof com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest) {
        return mergeFrom((com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest other) {
      if (other == com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
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
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSettingsFieldBuilder().getBuilder(),
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert settings are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert settings are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert settings are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert settings are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert settings are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.apps.alertcenter.v1beta1.Settings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.alertcenter.v1beta1.Settings, com.google.apps.alertcenter.v1beta1.Settings.Builder, com.google.apps.alertcenter.v1beta1.SettingsOrBuilder> settingsBuilder_;
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     * @return The settings.
     */
    public com.google.apps.alertcenter.v1beta1.Settings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.google.apps.alertcenter.v1beta1.Settings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    public Builder setSettings(com.google.apps.alertcenter.v1beta1.Settings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
      } else {
        settingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    public Builder setSettings(
        com.google.apps.alertcenter.v1beta1.Settings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    public Builder mergeSettings(com.google.apps.alertcenter.v1beta1.Settings value) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          settings_ != null &&
          settings_ != com.google.apps.alertcenter.v1beta1.Settings.getDefaultInstance()) {
          getSettingsBuilder().mergeFrom(value);
        } else {
          settings_ = value;
        }
      } else {
        settingsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    public Builder clearSettings() {
      bitField0_ = (bitField0_ & ~0x00000002);
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    public com.google.apps.alertcenter.v1beta1.Settings.Builder getSettingsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    public com.google.apps.alertcenter.v1beta1.SettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.google.apps.alertcenter.v1beta1.Settings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <pre>
     * The customer settings to update.
     * </pre>
     *
     * <code>.google.apps.alertcenter.v1beta1.Settings settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.alertcenter.v1beta1.Settings, com.google.apps.alertcenter.v1beta1.Settings.Builder, com.google.apps.alertcenter.v1beta1.SettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.alertcenter.v1beta1.Settings, com.google.apps.alertcenter.v1beta1.Settings.Builder, com.google.apps.alertcenter.v1beta1.SettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.apps.alertcenter.v1beta1.UpdateSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.apps.alertcenter.v1beta1.UpdateSettingsRequest)
  private static final com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest();
  }

  public static com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSettingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSettingsRequest>() {
    @java.lang.Override
    public UpdateSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.alertcenter.v1beta1.UpdateSettingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
