// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Details information about an error encountered during job execution or
 * the results of an unsuccessful activation of the JobTrigger.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.Error}
 */
public final class Error extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.Error)
    ErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Error.newBuilder() to construct.
  private Error(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Error() {
    timestamps_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Error();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Error_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Error_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.Error.class, com.google.privacy.dlp.v2.Error.Builder.class);
  }

  public static final int DETAILS_FIELD_NUMBER = 1;
  private com.google.rpc.Status details_;
  /**
   * <pre>
   * Detailed error codes and messages.
   * </pre>
   *
   * <code>.google.rpc.Status details = 1;</code>
   * @return Whether the details field is set.
   */
  @java.lang.Override
  public boolean hasDetails() {
    return details_ != null;
  }
  /**
   * <pre>
   * Detailed error codes and messages.
   * </pre>
   *
   * <code>.google.rpc.Status details = 1;</code>
   * @return The details.
   */
  @java.lang.Override
  public com.google.rpc.Status getDetails() {
    return details_ == null ? com.google.rpc.Status.getDefaultInstance() : details_;
  }
  /**
   * <pre>
   * Detailed error codes and messages.
   * </pre>
   *
   * <code>.google.rpc.Status details = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getDetailsOrBuilder() {
    return details_ == null ? com.google.rpc.Status.getDefaultInstance() : details_;
  }

  public static final int TIMESTAMPS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Timestamp> timestamps_;
  /**
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Timestamp> getTimestampsList() {
    return timestamps_;
  }
  /**
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.TimestampOrBuilder> 
      getTimestampsOrBuilderList() {
    return timestamps_;
  }
  /**
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  @java.lang.Override
  public int getTimestampsCount() {
    return timestamps_.size();
  }
  /**
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamps(int index) {
    return timestamps_.get(index);
  }
  /**
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampsOrBuilder(
      int index) {
    return timestamps_.get(index);
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
    if (details_ != null) {
      output.writeMessage(1, getDetails());
    }
    for (int i = 0; i < timestamps_.size(); i++) {
      output.writeMessage(2, timestamps_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (details_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDetails());
    }
    for (int i = 0; i < timestamps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, timestamps_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.Error)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.Error other = (com.google.privacy.dlp.v2.Error) obj;

    if (hasDetails() != other.hasDetails()) return false;
    if (hasDetails()) {
      if (!getDetails()
          .equals(other.getDetails())) return false;
    }
    if (!getTimestampsList()
        .equals(other.getTimestampsList())) return false;
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
    if (hasDetails()) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetails().hashCode();
    }
    if (getTimestampsCount() > 0) {
      hash = (37 * hash) + TIMESTAMPS_FIELD_NUMBER;
      hash = (53 * hash) + getTimestampsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.Error parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.Error parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.Error prototype) {
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
   * Details information about an error encountered during job execution or
   * the results of an unsuccessful activation of the JobTrigger.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.Error)
      com.google.privacy.dlp.v2.ErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Error_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.Error.class, com.google.privacy.dlp.v2.Error.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.Error.newBuilder()
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
      details_ = null;
      if (detailsBuilder_ != null) {
        detailsBuilder_.dispose();
        detailsBuilder_ = null;
      }
      if (timestampsBuilder_ == null) {
        timestamps_ = java.util.Collections.emptyList();
      } else {
        timestamps_ = null;
        timestampsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Error_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Error getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.Error.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Error build() {
      com.google.privacy.dlp.v2.Error result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Error buildPartial() {
      com.google.privacy.dlp.v2.Error result = new com.google.privacy.dlp.v2.Error(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.privacy.dlp.v2.Error result) {
      if (timestampsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          timestamps_ = java.util.Collections.unmodifiableList(timestamps_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.timestamps_ = timestamps_;
      } else {
        result.timestamps_ = timestampsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.privacy.dlp.v2.Error result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.details_ = detailsBuilder_ == null
            ? details_
            : detailsBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.Error) {
        return mergeFrom((com.google.privacy.dlp.v2.Error)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.Error other) {
      if (other == com.google.privacy.dlp.v2.Error.getDefaultInstance()) return this;
      if (other.hasDetails()) {
        mergeDetails(other.getDetails());
      }
      if (timestampsBuilder_ == null) {
        if (!other.timestamps_.isEmpty()) {
          if (timestamps_.isEmpty()) {
            timestamps_ = other.timestamps_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTimestampsIsMutable();
            timestamps_.addAll(other.timestamps_);
          }
          onChanged();
        }
      } else {
        if (!other.timestamps_.isEmpty()) {
          if (timestampsBuilder_.isEmpty()) {
            timestampsBuilder_.dispose();
            timestampsBuilder_ = null;
            timestamps_ = other.timestamps_;
            bitField0_ = (bitField0_ & ~0x00000002);
            timestampsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTimestampsFieldBuilder() : null;
          } else {
            timestampsBuilder_.addAllMessages(other.timestamps_);
          }
        }
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
                  getDetailsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.Timestamp m =
                  input.readMessage(
                      com.google.protobuf.Timestamp.parser(),
                      extensionRegistry);
              if (timestampsBuilder_ == null) {
                ensureTimestampsIsMutable();
                timestamps_.add(m);
              } else {
                timestampsBuilder_.addMessage(m);
              }
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

    private com.google.rpc.Status details_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> detailsBuilder_;
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     * @return Whether the details field is set.
     */
    public boolean hasDetails() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     * @return The details.
     */
    public com.google.rpc.Status getDetails() {
      if (detailsBuilder_ == null) {
        return details_ == null ? com.google.rpc.Status.getDefaultInstance() : details_;
      } else {
        return detailsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    public Builder setDetails(com.google.rpc.Status value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
      } else {
        detailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    public Builder setDetails(
        com.google.rpc.Status.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        details_ = builderForValue.build();
      } else {
        detailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    public Builder mergeDetails(com.google.rpc.Status value) {
      if (detailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          details_ != null &&
          details_ != com.google.rpc.Status.getDefaultInstance()) {
          getDetailsBuilder().mergeFrom(value);
        } else {
          details_ = value;
        }
      } else {
        detailsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    public Builder clearDetails() {
      bitField0_ = (bitField0_ & ~0x00000001);
      details_ = null;
      if (detailsBuilder_ != null) {
        detailsBuilder_.dispose();
        detailsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    public com.google.rpc.Status.Builder getDetailsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getDetailsOrBuilder() {
      if (detailsBuilder_ != null) {
        return detailsBuilder_.getMessageOrBuilder();
      } else {
        return details_ == null ?
            com.google.rpc.Status.getDefaultInstance() : details_;
      }
    }
    /**
     * <pre>
     * Detailed error codes and messages.
     * </pre>
     *
     * <code>.google.rpc.Status details = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getDetailsFieldBuilder() {
      if (detailsBuilder_ == null) {
        detailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getDetails(),
                getParentForChildren(),
                isClean());
        details_ = null;
      }
      return detailsBuilder_;
    }

    private java.util.List<com.google.protobuf.Timestamp> timestamps_ =
      java.util.Collections.emptyList();
    private void ensureTimestampsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        timestamps_ = new java.util.ArrayList<com.google.protobuf.Timestamp>(timestamps_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampsBuilder_;

    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public java.util.List<com.google.protobuf.Timestamp> getTimestampsList() {
      if (timestampsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(timestamps_);
      } else {
        return timestampsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public int getTimestampsCount() {
      if (timestampsBuilder_ == null) {
        return timestamps_.size();
      } else {
        return timestampsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public com.google.protobuf.Timestamp getTimestamps(int index) {
      if (timestampsBuilder_ == null) {
        return timestamps_.get(index);
      } else {
        return timestampsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder setTimestamps(
        int index, com.google.protobuf.Timestamp value) {
      if (timestampsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimestampsIsMutable();
        timestamps_.set(index, value);
        onChanged();
      } else {
        timestampsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder setTimestamps(
        int index, com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampsBuilder_ == null) {
        ensureTimestampsIsMutable();
        timestamps_.set(index, builderForValue.build());
        onChanged();
      } else {
        timestampsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder addTimestamps(com.google.protobuf.Timestamp value) {
      if (timestampsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimestampsIsMutable();
        timestamps_.add(value);
        onChanged();
      } else {
        timestampsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder addTimestamps(
        int index, com.google.protobuf.Timestamp value) {
      if (timestampsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimestampsIsMutable();
        timestamps_.add(index, value);
        onChanged();
      } else {
        timestampsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder addTimestamps(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampsBuilder_ == null) {
        ensureTimestampsIsMutable();
        timestamps_.add(builderForValue.build());
        onChanged();
      } else {
        timestampsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder addTimestamps(
        int index, com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampsBuilder_ == null) {
        ensureTimestampsIsMutable();
        timestamps_.add(index, builderForValue.build());
        onChanged();
      } else {
        timestampsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder addAllTimestamps(
        java.lang.Iterable<? extends com.google.protobuf.Timestamp> values) {
      if (timestampsBuilder_ == null) {
        ensureTimestampsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, timestamps_);
        onChanged();
      } else {
        timestampsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder clearTimestamps() {
      if (timestampsBuilder_ == null) {
        timestamps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        timestampsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public Builder removeTimestamps(int index) {
      if (timestampsBuilder_ == null) {
        ensureTimestampsIsMutable();
        timestamps_.remove(index);
        onChanged();
      } else {
        timestampsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampsBuilder(
        int index) {
      return getTimestampsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampsOrBuilder(
        int index) {
      if (timestampsBuilder_ == null) {
        return timestamps_.get(index);  } else {
        return timestampsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.TimestampOrBuilder> 
         getTimestampsOrBuilderList() {
      if (timestampsBuilder_ != null) {
        return timestampsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(timestamps_);
      }
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder addTimestampsBuilder() {
      return getTimestampsFieldBuilder().addBuilder(
          com.google.protobuf.Timestamp.getDefaultInstance());
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder addTimestampsBuilder(
        int index) {
      return getTimestampsFieldBuilder().addBuilder(
          index, com.google.protobuf.Timestamp.getDefaultInstance());
    }
    /**
     * <pre>
     * The times the error occurred.
     * </pre>
     *
     * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    public java.util.List<com.google.protobuf.Timestamp.Builder> 
         getTimestampsBuilderList() {
      return getTimestampsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampsFieldBuilder() {
      if (timestampsBuilder_ == null) {
        timestampsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                timestamps_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        timestamps_ = null;
      }
      return timestampsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.Error)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.Error)
  private static final com.google.privacy.dlp.v2.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.Error();
  }

  public static com.google.privacy.dlp.v2.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Error>
      PARSER = new com.google.protobuf.AbstractParser<Error>() {
    @java.lang.Override
    public Error parsePartialFrom(
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

  public static com.google.protobuf.Parser<Error> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Error> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.Error getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

