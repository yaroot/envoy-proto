// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Request message for
 * [CloudChannelService.GetChannelPartnerLink][google.cloud.channel.v1.CloudChannelService.GetChannelPartnerLink].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.GetChannelPartnerLinkRequest}
 */
public final class GetChannelPartnerLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.GetChannelPartnerLinkRequest)
    GetChannelPartnerLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetChannelPartnerLinkRequest.newBuilder() to construct.
  private GetChannelPartnerLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetChannelPartnerLinkRequest() {
    name_ = "";
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetChannelPartnerLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_GetChannelPartnerLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_GetChannelPartnerLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.class, com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The resource name of the channel partner link to retrieve.
   * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
   * where {id} is the Cloud Identity ID of the partner.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The resource name of the channel partner link to retrieve.
   * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
   * where {id} is the Cloud Identity ID of the partner.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_ = 0;
  /**
   * <pre>
   * Optional. The level of granularity the ChannelPartnerLink will display.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override public int getViewValue() {
    return view_;
  }
  /**
   * <pre>
   * Optional. The level of granularity the ChannelPartnerLink will display.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  @java.lang.Override public com.google.cloud.channel.v1.ChannelPartnerLinkView getView() {
    com.google.cloud.channel.v1.ChannelPartnerLinkView result = com.google.cloud.channel.v1.ChannelPartnerLinkView.forNumber(view_);
    return result == null ? com.google.cloud.channel.v1.ChannelPartnerLinkView.UNRECOGNIZED : result;
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
    if (view_ != com.google.cloud.channel.v1.ChannelPartnerLinkView.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, view_);
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
    if (view_ != com.google.cloud.channel.v1.ChannelPartnerLinkView.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, view_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.GetChannelPartnerLinkRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.GetChannelPartnerLinkRequest other = (com.google.cloud.channel.v1.GetChannelPartnerLinkRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (view_ != other.view_) return false;
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
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.channel.v1.GetChannelPartnerLinkRequest prototype) {
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
   * [CloudChannelService.GetChannelPartnerLink][google.cloud.channel.v1.CloudChannelService.GetChannelPartnerLink].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.GetChannelPartnerLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.GetChannelPartnerLinkRequest)
      com.google.cloud.channel.v1.GetChannelPartnerLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_GetChannelPartnerLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_GetChannelPartnerLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.class, com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.newBuilder()
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
      view_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_GetChannelPartnerLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.GetChannelPartnerLinkRequest getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.GetChannelPartnerLinkRequest build() {
      com.google.cloud.channel.v1.GetChannelPartnerLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.GetChannelPartnerLinkRequest buildPartial() {
      com.google.cloud.channel.v1.GetChannelPartnerLinkRequest result = new com.google.cloud.channel.v1.GetChannelPartnerLinkRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.GetChannelPartnerLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.view_ = view_;
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
      if (other instanceof com.google.cloud.channel.v1.GetChannelPartnerLinkRequest) {
        return mergeFrom((com.google.cloud.channel.v1.GetChannelPartnerLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.GetChannelPartnerLinkRequest other) {
      if (other == com.google.cloud.channel.v1.GetChannelPartnerLinkRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
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
            case 16: {
              view_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * Required. The resource name of the channel partner link to retrieve.
     * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
     * where {id} is the Cloud Identity ID of the partner.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the channel partner link to retrieve.
     * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
     * where {id} is the Cloud Identity ID of the partner.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the channel partner link to retrieve.
     * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
     * where {id} is the Cloud Identity ID of the partner.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the channel partner link to retrieve.
     * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
     * where {id} is the Cloud Identity ID of the partner.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the channel partner link to retrieve.
     * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
     * where {id} is the Cloud Identity ID of the partner.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private int view_ = 0;
    /**
     * <pre>
     * Optional. The level of granularity the ChannelPartnerLink will display.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override public int getViewValue() {
      return view_;
    }
    /**
     * <pre>
     * Optional. The level of granularity the ChannelPartnerLink will display.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The level of granularity the ChannelPartnerLink will display.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The view.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.ChannelPartnerLinkView getView() {
      com.google.cloud.channel.v1.ChannelPartnerLinkView result = com.google.cloud.channel.v1.ChannelPartnerLinkView.forNumber(view_);
      return result == null ? com.google.cloud.channel.v1.ChannelPartnerLinkView.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. The level of granularity the ChannelPartnerLink will display.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.cloud.channel.v1.ChannelPartnerLinkView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The level of granularity the ChannelPartnerLink will display.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000002);
      view_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.GetChannelPartnerLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.GetChannelPartnerLinkRequest)
  private static final com.google.cloud.channel.v1.GetChannelPartnerLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.GetChannelPartnerLinkRequest();
  }

  public static com.google.cloud.channel.v1.GetChannelPartnerLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetChannelPartnerLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetChannelPartnerLinkRequest>() {
    @java.lang.Override
    public GetChannelPartnerLinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetChannelPartnerLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetChannelPartnerLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.GetChannelPartnerLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

