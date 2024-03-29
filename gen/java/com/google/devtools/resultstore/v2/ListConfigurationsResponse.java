// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_download.proto

package com.google.devtools.resultstore.v2;

/**
 * <pre>
 * Response from calling ListConfigurations
 * </pre>
 *
 * Protobuf type {@code google.devtools.resultstore.v2.ListConfigurationsResponse}
 */
public final class ListConfigurationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.resultstore.v2.ListConfigurationsResponse)
    ListConfigurationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConfigurationsResponse.newBuilder() to construct.
  private ListConfigurationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConfigurationsResponse() {
    configurations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConfigurationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_ListConfigurationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_ListConfigurationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.resultstore.v2.ListConfigurationsResponse.class, com.google.devtools.resultstore.v2.ListConfigurationsResponse.Builder.class);
  }

  public static final int CONFIGURATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.resultstore.v2.Configuration> configurations_;
  /**
   * <pre>
   * Configurations matching the request invocation,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.resultstore.v2.Configuration> getConfigurationsList() {
    return configurations_;
  }
  /**
   * <pre>
   * Configurations matching the request invocation,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.resultstore.v2.ConfigurationOrBuilder> 
      getConfigurationsOrBuilderList() {
    return configurations_;
  }
  /**
   * <pre>
   * Configurations matching the request invocation,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
   */
  @java.lang.Override
  public int getConfigurationsCount() {
    return configurations_.size();
  }
  /**
   * <pre>
   * Configurations matching the request invocation,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.Configuration getConfigurations(int index) {
    return configurations_.get(index);
  }
  /**
   * <pre>
   * Configurations matching the request invocation,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.resultstore.v2.ConfigurationOrBuilder getConfigurationsOrBuilder(
      int index) {
    return configurations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < configurations_.size(); i++) {
      output.writeMessage(1, configurations_.get(i));
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
    for (int i = 0; i < configurations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, configurations_.get(i));
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
    if (!(obj instanceof com.google.devtools.resultstore.v2.ListConfigurationsResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.resultstore.v2.ListConfigurationsResponse other = (com.google.devtools.resultstore.v2.ListConfigurationsResponse) obj;

    if (!getConfigurationsList()
        .equals(other.getConfigurationsList())) return false;
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
    if (getConfigurationsCount() > 0) {
      hash = (37 * hash) + CONFIGURATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConfigurationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.devtools.resultstore.v2.ListConfigurationsResponse prototype) {
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
   * Response from calling ListConfigurations
   * </pre>
   *
   * Protobuf type {@code google.devtools.resultstore.v2.ListConfigurationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.resultstore.v2.ListConfigurationsResponse)
      com.google.devtools.resultstore.v2.ListConfigurationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_ListConfigurationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_ListConfigurationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.resultstore.v2.ListConfigurationsResponse.class, com.google.devtools.resultstore.v2.ListConfigurationsResponse.Builder.class);
    }

    // Construct using com.google.devtools.resultstore.v2.ListConfigurationsResponse.newBuilder()
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
      if (configurationsBuilder_ == null) {
        configurations_ = java.util.Collections.emptyList();
      } else {
        configurations_ = null;
        configurationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.resultstore.v2.ResultStoreDownloadProto.internal_static_google_devtools_resultstore_v2_ListConfigurationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.ListConfigurationsResponse getDefaultInstanceForType() {
      return com.google.devtools.resultstore.v2.ListConfigurationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.ListConfigurationsResponse build() {
      com.google.devtools.resultstore.v2.ListConfigurationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.resultstore.v2.ListConfigurationsResponse buildPartial() {
      com.google.devtools.resultstore.v2.ListConfigurationsResponse result = new com.google.devtools.resultstore.v2.ListConfigurationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.devtools.resultstore.v2.ListConfigurationsResponse result) {
      if (configurationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          configurations_ = java.util.Collections.unmodifiableList(configurations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.configurations_ = configurations_;
      } else {
        result.configurations_ = configurationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.devtools.resultstore.v2.ListConfigurationsResponse result) {
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
      if (other instanceof com.google.devtools.resultstore.v2.ListConfigurationsResponse) {
        return mergeFrom((com.google.devtools.resultstore.v2.ListConfigurationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.resultstore.v2.ListConfigurationsResponse other) {
      if (other == com.google.devtools.resultstore.v2.ListConfigurationsResponse.getDefaultInstance()) return this;
      if (configurationsBuilder_ == null) {
        if (!other.configurations_.isEmpty()) {
          if (configurations_.isEmpty()) {
            configurations_ = other.configurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfigurationsIsMutable();
            configurations_.addAll(other.configurations_);
          }
          onChanged();
        }
      } else {
        if (!other.configurations_.isEmpty()) {
          if (configurationsBuilder_.isEmpty()) {
            configurationsBuilder_.dispose();
            configurationsBuilder_ = null;
            configurations_ = other.configurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            configurationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConfigurationsFieldBuilder() : null;
          } else {
            configurationsBuilder_.addAllMessages(other.configurations_);
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
              com.google.devtools.resultstore.v2.Configuration m =
                  input.readMessage(
                      com.google.devtools.resultstore.v2.Configuration.parser(),
                      extensionRegistry);
              if (configurationsBuilder_ == null) {
                ensureConfigurationsIsMutable();
                configurations_.add(m);
              } else {
                configurationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.devtools.resultstore.v2.Configuration> configurations_ =
      java.util.Collections.emptyList();
    private void ensureConfigurationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        configurations_ = new java.util.ArrayList<com.google.devtools.resultstore.v2.Configuration>(configurations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.resultstore.v2.Configuration, com.google.devtools.resultstore.v2.Configuration.Builder, com.google.devtools.resultstore.v2.ConfigurationOrBuilder> configurationsBuilder_;

    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public java.util.List<com.google.devtools.resultstore.v2.Configuration> getConfigurationsList() {
      if (configurationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(configurations_);
      } else {
        return configurationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public int getConfigurationsCount() {
      if (configurationsBuilder_ == null) {
        return configurations_.size();
      } else {
        return configurationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Configuration getConfigurations(int index) {
      if (configurationsBuilder_ == null) {
        return configurations_.get(index);
      } else {
        return configurationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder setConfigurations(
        int index, com.google.devtools.resultstore.v2.Configuration value) {
      if (configurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationsIsMutable();
        configurations_.set(index, value);
        onChanged();
      } else {
        configurationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder setConfigurations(
        int index, com.google.devtools.resultstore.v2.Configuration.Builder builderForValue) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.set(index, builderForValue.build());
        onChanged();
      } else {
        configurationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder addConfigurations(com.google.devtools.resultstore.v2.Configuration value) {
      if (configurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationsIsMutable();
        configurations_.add(value);
        onChanged();
      } else {
        configurationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder addConfigurations(
        int index, com.google.devtools.resultstore.v2.Configuration value) {
      if (configurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationsIsMutable();
        configurations_.add(index, value);
        onChanged();
      } else {
        configurationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder addConfigurations(
        com.google.devtools.resultstore.v2.Configuration.Builder builderForValue) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.add(builderForValue.build());
        onChanged();
      } else {
        configurationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder addConfigurations(
        int index, com.google.devtools.resultstore.v2.Configuration.Builder builderForValue) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.add(index, builderForValue.build());
        onChanged();
      } else {
        configurationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder addAllConfigurations(
        java.lang.Iterable<? extends com.google.devtools.resultstore.v2.Configuration> values) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, configurations_);
        onChanged();
      } else {
        configurationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder clearConfigurations() {
      if (configurationsBuilder_ == null) {
        configurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        configurationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public Builder removeConfigurations(int index) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.remove(index);
        onChanged();
      } else {
        configurationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Configuration.Builder getConfigurationsBuilder(
        int index) {
      return getConfigurationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.ConfigurationOrBuilder getConfigurationsOrBuilder(
        int index) {
      if (configurationsBuilder_ == null) {
        return configurations_.get(index);  } else {
        return configurationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.resultstore.v2.ConfigurationOrBuilder> 
         getConfigurationsOrBuilderList() {
      if (configurationsBuilder_ != null) {
        return configurationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(configurations_);
      }
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Configuration.Builder addConfigurationsBuilder() {
      return getConfigurationsFieldBuilder().addBuilder(
          com.google.devtools.resultstore.v2.Configuration.getDefaultInstance());
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public com.google.devtools.resultstore.v2.Configuration.Builder addConfigurationsBuilder(
        int index) {
      return getConfigurationsFieldBuilder().addBuilder(
          index, com.google.devtools.resultstore.v2.Configuration.getDefaultInstance());
    }
    /**
     * <pre>
     * Configurations matching the request invocation,
     * possibly capped at request.page_size or a server limit.
     * </pre>
     *
     * <code>repeated .google.devtools.resultstore.v2.Configuration configurations = 1;</code>
     */
    public java.util.List<com.google.devtools.resultstore.v2.Configuration.Builder> 
         getConfigurationsBuilderList() {
      return getConfigurationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.resultstore.v2.Configuration, com.google.devtools.resultstore.v2.Configuration.Builder, com.google.devtools.resultstore.v2.ConfigurationOrBuilder> 
        getConfigurationsFieldBuilder() {
      if (configurationsBuilder_ == null) {
        configurationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.resultstore.v2.Configuration, com.google.devtools.resultstore.v2.Configuration.Builder, com.google.devtools.resultstore.v2.ConfigurationOrBuilder>(
                configurations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        configurations_ = null;
      }
      return configurationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.devtools.resultstore.v2.ListConfigurationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.ListConfigurationsResponse)
  private static final com.google.devtools.resultstore.v2.ListConfigurationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.resultstore.v2.ListConfigurationsResponse();
  }

  public static com.google.devtools.resultstore.v2.ListConfigurationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConfigurationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListConfigurationsResponse>() {
    @java.lang.Override
    public ListConfigurationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConfigurationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConfigurationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.resultstore.v2.ListConfigurationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

