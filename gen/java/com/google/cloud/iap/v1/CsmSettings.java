// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iap/v1/service.proto

package com.google.cloud.iap.v1;

/**
 * <pre>
 * Configuration for RCToken generated for service mesh workloads protected by
 * IAP. RCToken are IAP generated JWTs that can be verified at the application.
 * The RCToken is primarily used for service mesh deployments, and can be scoped
 * to a single mesh by configuring the audience field accordingly.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.CsmSettings}
 */
public final class CsmSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.CsmSettings)
    CsmSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CsmSettings.newBuilder() to construct.
  private CsmSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CsmSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CsmSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CsmSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CsmSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.CsmSettings.class, com.google.cloud.iap.v1.CsmSettings.Builder.class);
  }

  public static final int RCTOKEN_AUD_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue rctokenAud_;
  /**
   * <pre>
   * Audience claim set in the generated RCToken. This value is not validated by
   * IAP.
   * </pre>
   *
   * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
   * @return Whether the rctokenAud field is set.
   */
  @java.lang.Override
  public boolean hasRctokenAud() {
    return rctokenAud_ != null;
  }
  /**
   * <pre>
   * Audience claim set in the generated RCToken. This value is not validated by
   * IAP.
   * </pre>
   *
   * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
   * @return The rctokenAud.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getRctokenAud() {
    return rctokenAud_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : rctokenAud_;
  }
  /**
   * <pre>
   * Audience claim set in the generated RCToken. This value is not validated by
   * IAP.
   * </pre>
   *
   * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getRctokenAudOrBuilder() {
    return rctokenAud_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : rctokenAud_;
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
    if (rctokenAud_ != null) {
      output.writeMessage(1, getRctokenAud());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rctokenAud_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRctokenAud());
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
    if (!(obj instanceof com.google.cloud.iap.v1.CsmSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.CsmSettings other = (com.google.cloud.iap.v1.CsmSettings) obj;

    if (hasRctokenAud() != other.hasRctokenAud()) return false;
    if (hasRctokenAud()) {
      if (!getRctokenAud()
          .equals(other.getRctokenAud())) return false;
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
    if (hasRctokenAud()) {
      hash = (37 * hash) + RCTOKEN_AUD_FIELD_NUMBER;
      hash = (53 * hash) + getRctokenAud().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iap.v1.CsmSettings parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iap.v1.CsmSettings prototype) {
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
   * Configuration for RCToken generated for service mesh workloads protected by
   * IAP. RCToken are IAP generated JWTs that can be verified at the application.
   * The RCToken is primarily used for service mesh deployments, and can be scoped
   * to a single mesh by configuring the audience field accordingly.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.CsmSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.CsmSettings)
      com.google.cloud.iap.v1.CsmSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CsmSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CsmSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.CsmSettings.class, com.google.cloud.iap.v1.CsmSettings.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.CsmSettings.newBuilder()
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
      rctokenAud_ = null;
      if (rctokenAudBuilder_ != null) {
        rctokenAudBuilder_.dispose();
        rctokenAudBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iap.v1.Service.internal_static_google_cloud_iap_v1_CsmSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CsmSettings getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.CsmSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CsmSettings build() {
      com.google.cloud.iap.v1.CsmSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CsmSettings buildPartial() {
      com.google.cloud.iap.v1.CsmSettings result = new com.google.cloud.iap.v1.CsmSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.CsmSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rctokenAud_ = rctokenAudBuilder_ == null
            ? rctokenAud_
            : rctokenAudBuilder_.build();
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
      if (other instanceof com.google.cloud.iap.v1.CsmSettings) {
        return mergeFrom((com.google.cloud.iap.v1.CsmSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.CsmSettings other) {
      if (other == com.google.cloud.iap.v1.CsmSettings.getDefaultInstance()) return this;
      if (other.hasRctokenAud()) {
        mergeRctokenAud(other.getRctokenAud());
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
                  getRctokenAudFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.protobuf.StringValue rctokenAud_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> rctokenAudBuilder_;
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     * @return Whether the rctokenAud field is set.
     */
    public boolean hasRctokenAud() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     * @return The rctokenAud.
     */
    public com.google.protobuf.StringValue getRctokenAud() {
      if (rctokenAudBuilder_ == null) {
        return rctokenAud_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : rctokenAud_;
      } else {
        return rctokenAudBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    public Builder setRctokenAud(com.google.protobuf.StringValue value) {
      if (rctokenAudBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rctokenAud_ = value;
      } else {
        rctokenAudBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    public Builder setRctokenAud(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (rctokenAudBuilder_ == null) {
        rctokenAud_ = builderForValue.build();
      } else {
        rctokenAudBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    public Builder mergeRctokenAud(com.google.protobuf.StringValue value) {
      if (rctokenAudBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          rctokenAud_ != null &&
          rctokenAud_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getRctokenAudBuilder().mergeFrom(value);
        } else {
          rctokenAud_ = value;
        }
      } else {
        rctokenAudBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    public Builder clearRctokenAud() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rctokenAud_ = null;
      if (rctokenAudBuilder_ != null) {
        rctokenAudBuilder_.dispose();
        rctokenAudBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getRctokenAudBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRctokenAudFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getRctokenAudOrBuilder() {
      if (rctokenAudBuilder_ != null) {
        return rctokenAudBuilder_.getMessageOrBuilder();
      } else {
        return rctokenAud_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : rctokenAud_;
      }
    }
    /**
     * <pre>
     * Audience claim set in the generated RCToken. This value is not validated by
     * IAP.
     * </pre>
     *
     * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getRctokenAudFieldBuilder() {
      if (rctokenAudBuilder_ == null) {
        rctokenAudBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getRctokenAud(),
                getParentForChildren(),
                isClean());
        rctokenAud_ = null;
      }
      return rctokenAudBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.CsmSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.CsmSettings)
  private static final com.google.cloud.iap.v1.CsmSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.CsmSettings();
  }

  public static com.google.cloud.iap.v1.CsmSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CsmSettings>
      PARSER = new com.google.protobuf.AbstractParser<CsmSettings>() {
    @java.lang.Override
    public CsmSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<CsmSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CsmSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.CsmSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
