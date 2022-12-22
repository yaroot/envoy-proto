// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/label_limits.proto

package com.google.apps.drive.labels.v2beta;

/**
 * <pre>
 * Limits for Field.Type.USER.
 * </pre>
 *
 * Protobuf type {@code google.apps.drive.labels.v2beta.UserLimits}
 */
public final class UserLimits extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.drive.labels.v2beta.UserLimits)
    UserLimitsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserLimits.newBuilder() to construct.
  private UserLimits(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserLimits() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserLimits();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.drive.labels.v2beta.LabelLimitsProto.internal_static_google_apps_drive_labels_v2beta_UserLimits_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.drive.labels.v2beta.LabelLimitsProto.internal_static_google_apps_drive_labels_v2beta_UserLimits_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.drive.labels.v2beta.UserLimits.class, com.google.apps.drive.labels.v2beta.UserLimits.Builder.class);
  }

  public static final int LIST_LIMITS_FIELD_NUMBER = 1;
  private com.google.apps.drive.labels.v2beta.ListLimits listLimits_;
  /**
   * <pre>
   * Limits for list-variant of a Field type.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
   * @return Whether the listLimits field is set.
   */
  @java.lang.Override
  public boolean hasListLimits() {
    return listLimits_ != null;
  }
  /**
   * <pre>
   * Limits for list-variant of a Field type.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
   * @return The listLimits.
   */
  @java.lang.Override
  public com.google.apps.drive.labels.v2beta.ListLimits getListLimits() {
    return listLimits_ == null ? com.google.apps.drive.labels.v2beta.ListLimits.getDefaultInstance() : listLimits_;
  }
  /**
   * <pre>
   * Limits for list-variant of a Field type.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.drive.labels.v2beta.ListLimitsOrBuilder getListLimitsOrBuilder() {
    return listLimits_ == null ? com.google.apps.drive.labels.v2beta.ListLimits.getDefaultInstance() : listLimits_;
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
    if (listLimits_ != null) {
      output.writeMessage(1, getListLimits());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (listLimits_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getListLimits());
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
    if (!(obj instanceof com.google.apps.drive.labels.v2beta.UserLimits)) {
      return super.equals(obj);
    }
    com.google.apps.drive.labels.v2beta.UserLimits other = (com.google.apps.drive.labels.v2beta.UserLimits) obj;

    if (hasListLimits() != other.hasListLimits()) return false;
    if (hasListLimits()) {
      if (!getListLimits()
          .equals(other.getListLimits())) return false;
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
    if (hasListLimits()) {
      hash = (37 * hash) + LIST_LIMITS_FIELD_NUMBER;
      hash = (53 * hash) + getListLimits().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.UserLimits parseFrom(
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
  public static Builder newBuilder(com.google.apps.drive.labels.v2beta.UserLimits prototype) {
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
   * Limits for Field.Type.USER.
   * </pre>
   *
   * Protobuf type {@code google.apps.drive.labels.v2beta.UserLimits}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.drive.labels.v2beta.UserLimits)
      com.google.apps.drive.labels.v2beta.UserLimitsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.drive.labels.v2beta.LabelLimitsProto.internal_static_google_apps_drive_labels_v2beta_UserLimits_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.drive.labels.v2beta.LabelLimitsProto.internal_static_google_apps_drive_labels_v2beta_UserLimits_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.drive.labels.v2beta.UserLimits.class, com.google.apps.drive.labels.v2beta.UserLimits.Builder.class);
    }

    // Construct using com.google.apps.drive.labels.v2beta.UserLimits.newBuilder()
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
      listLimits_ = null;
      if (listLimitsBuilder_ != null) {
        listLimitsBuilder_.dispose();
        listLimitsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.drive.labels.v2beta.LabelLimitsProto.internal_static_google_apps_drive_labels_v2beta_UserLimits_descriptor;
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.UserLimits getDefaultInstanceForType() {
      return com.google.apps.drive.labels.v2beta.UserLimits.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.UserLimits build() {
      com.google.apps.drive.labels.v2beta.UserLimits result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.UserLimits buildPartial() {
      com.google.apps.drive.labels.v2beta.UserLimits result = new com.google.apps.drive.labels.v2beta.UserLimits(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.drive.labels.v2beta.UserLimits result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.listLimits_ = listLimitsBuilder_ == null
            ? listLimits_
            : listLimitsBuilder_.build();
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
      if (other instanceof com.google.apps.drive.labels.v2beta.UserLimits) {
        return mergeFrom((com.google.apps.drive.labels.v2beta.UserLimits)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.drive.labels.v2beta.UserLimits other) {
      if (other == com.google.apps.drive.labels.v2beta.UserLimits.getDefaultInstance()) return this;
      if (other.hasListLimits()) {
        mergeListLimits(other.getListLimits());
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
                  getListLimitsFieldBuilder().getBuilder(),
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

    private com.google.apps.drive.labels.v2beta.ListLimits listLimits_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.drive.labels.v2beta.ListLimits, com.google.apps.drive.labels.v2beta.ListLimits.Builder, com.google.apps.drive.labels.v2beta.ListLimitsOrBuilder> listLimitsBuilder_;
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     * @return Whether the listLimits field is set.
     */
    public boolean hasListLimits() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     * @return The listLimits.
     */
    public com.google.apps.drive.labels.v2beta.ListLimits getListLimits() {
      if (listLimitsBuilder_ == null) {
        return listLimits_ == null ? com.google.apps.drive.labels.v2beta.ListLimits.getDefaultInstance() : listLimits_;
      } else {
        return listLimitsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    public Builder setListLimits(com.google.apps.drive.labels.v2beta.ListLimits value) {
      if (listLimitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        listLimits_ = value;
      } else {
        listLimitsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    public Builder setListLimits(
        com.google.apps.drive.labels.v2beta.ListLimits.Builder builderForValue) {
      if (listLimitsBuilder_ == null) {
        listLimits_ = builderForValue.build();
      } else {
        listLimitsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    public Builder mergeListLimits(com.google.apps.drive.labels.v2beta.ListLimits value) {
      if (listLimitsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          listLimits_ != null &&
          listLimits_ != com.google.apps.drive.labels.v2beta.ListLimits.getDefaultInstance()) {
          getListLimitsBuilder().mergeFrom(value);
        } else {
          listLimits_ = value;
        }
      } else {
        listLimitsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    public Builder clearListLimits() {
      bitField0_ = (bitField0_ & ~0x00000001);
      listLimits_ = null;
      if (listLimitsBuilder_ != null) {
        listLimitsBuilder_.dispose();
        listLimitsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    public com.google.apps.drive.labels.v2beta.ListLimits.Builder getListLimitsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getListLimitsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    public com.google.apps.drive.labels.v2beta.ListLimitsOrBuilder getListLimitsOrBuilder() {
      if (listLimitsBuilder_ != null) {
        return listLimitsBuilder_.getMessageOrBuilder();
      } else {
        return listLimits_ == null ?
            com.google.apps.drive.labels.v2beta.ListLimits.getDefaultInstance() : listLimits_;
      }
    }
    /**
     * <pre>
     * Limits for list-variant of a Field type.
     * </pre>
     *
     * <code>.google.apps.drive.labels.v2beta.ListLimits list_limits = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.drive.labels.v2beta.ListLimits, com.google.apps.drive.labels.v2beta.ListLimits.Builder, com.google.apps.drive.labels.v2beta.ListLimitsOrBuilder> 
        getListLimitsFieldBuilder() {
      if (listLimitsBuilder_ == null) {
        listLimitsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.drive.labels.v2beta.ListLimits, com.google.apps.drive.labels.v2beta.ListLimits.Builder, com.google.apps.drive.labels.v2beta.ListLimitsOrBuilder>(
                getListLimits(),
                getParentForChildren(),
                isClean());
        listLimits_ = null;
      }
      return listLimitsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.apps.drive.labels.v2beta.UserLimits)
  }

  // @@protoc_insertion_point(class_scope:google.apps.drive.labels.v2beta.UserLimits)
  private static final com.google.apps.drive.labels.v2beta.UserLimits DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.drive.labels.v2beta.UserLimits();
  }

  public static com.google.apps.drive.labels.v2beta.UserLimits getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserLimits>
      PARSER = new com.google.protobuf.AbstractParser<UserLimits>() {
    @java.lang.Override
    public UserLimits parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserLimits> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserLimits> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.drive.labels.v2beta.UserLimits getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
