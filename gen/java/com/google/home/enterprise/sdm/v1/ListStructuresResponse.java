// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/home/enterprise/sdm/v1/smart_device_management_service.proto

package com.google.home.enterprise.sdm.v1;

/**
 * <pre>
 * Response message for SmartDeviceManagementService.ListStructures
 * </pre>
 *
 * Protobuf type {@code google.home.enterprise.sdm.v1.ListStructuresResponse}
 */
public final class ListStructuresResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.home.enterprise.sdm.v1.ListStructuresResponse)
    ListStructuresResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListStructuresResponse.newBuilder() to construct.
  private ListStructuresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListStructuresResponse() {
    structures_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListStructuresResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.home.enterprise.sdm.v1.SmartDeviceManagementServiceOuterClass.internal_static_google_home_enterprise_sdm_v1_ListStructuresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.home.enterprise.sdm.v1.SmartDeviceManagementServiceOuterClass.internal_static_google_home_enterprise_sdm_v1_ListStructuresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.home.enterprise.sdm.v1.ListStructuresResponse.class, com.google.home.enterprise.sdm.v1.ListStructuresResponse.Builder.class);
  }

  public static final int STRUCTURES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.home.enterprise.sdm.v1.Structure> structures_;
  /**
   * <pre>
   * The list of structures.
   * </pre>
   *
   * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.home.enterprise.sdm.v1.Structure> getStructuresList() {
    return structures_;
  }
  /**
   * <pre>
   * The list of structures.
   * </pre>
   *
   * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.home.enterprise.sdm.v1.StructureOrBuilder> 
      getStructuresOrBuilderList() {
    return structures_;
  }
  /**
   * <pre>
   * The list of structures.
   * </pre>
   *
   * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
   */
  @java.lang.Override
  public int getStructuresCount() {
    return structures_.size();
  }
  /**
   * <pre>
   * The list of structures.
   * </pre>
   *
   * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
   */
  @java.lang.Override
  public com.google.home.enterprise.sdm.v1.Structure getStructures(int index) {
    return structures_.get(index);
  }
  /**
   * <pre>
   * The list of structures.
   * </pre>
   *
   * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
   */
  @java.lang.Override
  public com.google.home.enterprise.sdm.v1.StructureOrBuilder getStructuresOrBuilder(
      int index) {
    return structures_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The pagination token to retrieve the next page of results.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The pagination token to retrieve the next page of results.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < structures_.size(); i++) {
      output.writeMessage(1, structures_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < structures_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, structures_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.home.enterprise.sdm.v1.ListStructuresResponse)) {
      return super.equals(obj);
    }
    com.google.home.enterprise.sdm.v1.ListStructuresResponse other = (com.google.home.enterprise.sdm.v1.ListStructuresResponse) obj;

    if (!getStructuresList()
        .equals(other.getStructuresList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getStructuresCount() > 0) {
      hash = (37 * hash) + STRUCTURES_FIELD_NUMBER;
      hash = (53 * hash) + getStructuresList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse parseFrom(
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
  public static Builder newBuilder(com.google.home.enterprise.sdm.v1.ListStructuresResponse prototype) {
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
   * Response message for SmartDeviceManagementService.ListStructures
   * </pre>
   *
   * Protobuf type {@code google.home.enterprise.sdm.v1.ListStructuresResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.home.enterprise.sdm.v1.ListStructuresResponse)
      com.google.home.enterprise.sdm.v1.ListStructuresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.home.enterprise.sdm.v1.SmartDeviceManagementServiceOuterClass.internal_static_google_home_enterprise_sdm_v1_ListStructuresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.home.enterprise.sdm.v1.SmartDeviceManagementServiceOuterClass.internal_static_google_home_enterprise_sdm_v1_ListStructuresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.home.enterprise.sdm.v1.ListStructuresResponse.class, com.google.home.enterprise.sdm.v1.ListStructuresResponse.Builder.class);
    }

    // Construct using com.google.home.enterprise.sdm.v1.ListStructuresResponse.newBuilder()
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
      if (structuresBuilder_ == null) {
        structures_ = java.util.Collections.emptyList();
      } else {
        structures_ = null;
        structuresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.home.enterprise.sdm.v1.SmartDeviceManagementServiceOuterClass.internal_static_google_home_enterprise_sdm_v1_ListStructuresResponse_descriptor;
    }

    @java.lang.Override
    public com.google.home.enterprise.sdm.v1.ListStructuresResponse getDefaultInstanceForType() {
      return com.google.home.enterprise.sdm.v1.ListStructuresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.home.enterprise.sdm.v1.ListStructuresResponse build() {
      com.google.home.enterprise.sdm.v1.ListStructuresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.home.enterprise.sdm.v1.ListStructuresResponse buildPartial() {
      com.google.home.enterprise.sdm.v1.ListStructuresResponse result = new com.google.home.enterprise.sdm.v1.ListStructuresResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.home.enterprise.sdm.v1.ListStructuresResponse result) {
      if (structuresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          structures_ = java.util.Collections.unmodifiableList(structures_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.structures_ = structures_;
      } else {
        result.structures_ = structuresBuilder_.build();
      }
    }

    private void buildPartial0(com.google.home.enterprise.sdm.v1.ListStructuresResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.home.enterprise.sdm.v1.ListStructuresResponse) {
        return mergeFrom((com.google.home.enterprise.sdm.v1.ListStructuresResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.home.enterprise.sdm.v1.ListStructuresResponse other) {
      if (other == com.google.home.enterprise.sdm.v1.ListStructuresResponse.getDefaultInstance()) return this;
      if (structuresBuilder_ == null) {
        if (!other.structures_.isEmpty()) {
          if (structures_.isEmpty()) {
            structures_ = other.structures_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStructuresIsMutable();
            structures_.addAll(other.structures_);
          }
          onChanged();
        }
      } else {
        if (!other.structures_.isEmpty()) {
          if (structuresBuilder_.isEmpty()) {
            structuresBuilder_.dispose();
            structuresBuilder_ = null;
            structures_ = other.structures_;
            bitField0_ = (bitField0_ & ~0x00000001);
            structuresBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStructuresFieldBuilder() : null;
          } else {
            structuresBuilder_.addAllMessages(other.structures_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              com.google.home.enterprise.sdm.v1.Structure m =
                  input.readMessage(
                      com.google.home.enterprise.sdm.v1.Structure.parser(),
                      extensionRegistry);
              if (structuresBuilder_ == null) {
                ensureStructuresIsMutable();
                structures_.add(m);
              } else {
                structuresBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.home.enterprise.sdm.v1.Structure> structures_ =
      java.util.Collections.emptyList();
    private void ensureStructuresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        structures_ = new java.util.ArrayList<com.google.home.enterprise.sdm.v1.Structure>(structures_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.home.enterprise.sdm.v1.Structure, com.google.home.enterprise.sdm.v1.Structure.Builder, com.google.home.enterprise.sdm.v1.StructureOrBuilder> structuresBuilder_;

    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public java.util.List<com.google.home.enterprise.sdm.v1.Structure> getStructuresList() {
      if (structuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(structures_);
      } else {
        return structuresBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public int getStructuresCount() {
      if (structuresBuilder_ == null) {
        return structures_.size();
      } else {
        return structuresBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public com.google.home.enterprise.sdm.v1.Structure getStructures(int index) {
      if (structuresBuilder_ == null) {
        return structures_.get(index);
      } else {
        return structuresBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder setStructures(
        int index, com.google.home.enterprise.sdm.v1.Structure value) {
      if (structuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStructuresIsMutable();
        structures_.set(index, value);
        onChanged();
      } else {
        structuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder setStructures(
        int index, com.google.home.enterprise.sdm.v1.Structure.Builder builderForValue) {
      if (structuresBuilder_ == null) {
        ensureStructuresIsMutable();
        structures_.set(index, builderForValue.build());
        onChanged();
      } else {
        structuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder addStructures(com.google.home.enterprise.sdm.v1.Structure value) {
      if (structuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStructuresIsMutable();
        structures_.add(value);
        onChanged();
      } else {
        structuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder addStructures(
        int index, com.google.home.enterprise.sdm.v1.Structure value) {
      if (structuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStructuresIsMutable();
        structures_.add(index, value);
        onChanged();
      } else {
        structuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder addStructures(
        com.google.home.enterprise.sdm.v1.Structure.Builder builderForValue) {
      if (structuresBuilder_ == null) {
        ensureStructuresIsMutable();
        structures_.add(builderForValue.build());
        onChanged();
      } else {
        structuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder addStructures(
        int index, com.google.home.enterprise.sdm.v1.Structure.Builder builderForValue) {
      if (structuresBuilder_ == null) {
        ensureStructuresIsMutable();
        structures_.add(index, builderForValue.build());
        onChanged();
      } else {
        structuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder addAllStructures(
        java.lang.Iterable<? extends com.google.home.enterprise.sdm.v1.Structure> values) {
      if (structuresBuilder_ == null) {
        ensureStructuresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, structures_);
        onChanged();
      } else {
        structuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder clearStructures() {
      if (structuresBuilder_ == null) {
        structures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        structuresBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public Builder removeStructures(int index) {
      if (structuresBuilder_ == null) {
        ensureStructuresIsMutable();
        structures_.remove(index);
        onChanged();
      } else {
        structuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public com.google.home.enterprise.sdm.v1.Structure.Builder getStructuresBuilder(
        int index) {
      return getStructuresFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public com.google.home.enterprise.sdm.v1.StructureOrBuilder getStructuresOrBuilder(
        int index) {
      if (structuresBuilder_ == null) {
        return structures_.get(index);  } else {
        return structuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public java.util.List<? extends com.google.home.enterprise.sdm.v1.StructureOrBuilder> 
         getStructuresOrBuilderList() {
      if (structuresBuilder_ != null) {
        return structuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(structures_);
      }
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public com.google.home.enterprise.sdm.v1.Structure.Builder addStructuresBuilder() {
      return getStructuresFieldBuilder().addBuilder(
          com.google.home.enterprise.sdm.v1.Structure.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public com.google.home.enterprise.sdm.v1.Structure.Builder addStructuresBuilder(
        int index) {
      return getStructuresFieldBuilder().addBuilder(
          index, com.google.home.enterprise.sdm.v1.Structure.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of structures.
     * </pre>
     *
     * <code>repeated .google.home.enterprise.sdm.v1.Structure structures = 1;</code>
     */
    public java.util.List<com.google.home.enterprise.sdm.v1.Structure.Builder> 
         getStructuresBuilderList() {
      return getStructuresFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.home.enterprise.sdm.v1.Structure, com.google.home.enterprise.sdm.v1.Structure.Builder, com.google.home.enterprise.sdm.v1.StructureOrBuilder> 
        getStructuresFieldBuilder() {
      if (structuresBuilder_ == null) {
        structuresBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.home.enterprise.sdm.v1.Structure, com.google.home.enterprise.sdm.v1.Structure.Builder, com.google.home.enterprise.sdm.v1.StructureOrBuilder>(
                structures_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        structures_ = null;
      }
      return structuresBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The pagination token to retrieve the next page of results.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The pagination token to retrieve the next page of results.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The pagination token to retrieve the next page of results.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The pagination token to retrieve the next page of results.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The pagination token to retrieve the next page of results.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.home.enterprise.sdm.v1.ListStructuresResponse)
  }

  // @@protoc_insertion_point(class_scope:google.home.enterprise.sdm.v1.ListStructuresResponse)
  private static final com.google.home.enterprise.sdm.v1.ListStructuresResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.home.enterprise.sdm.v1.ListStructuresResponse();
  }

  public static com.google.home.enterprise.sdm.v1.ListStructuresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStructuresResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListStructuresResponse>() {
    @java.lang.Override
    public ListStructuresResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListStructuresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStructuresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.home.enterprise.sdm.v1.ListStructuresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

