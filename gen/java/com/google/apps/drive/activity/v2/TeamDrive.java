// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/activity/v2/target.proto

package com.google.apps.drive.activity.v2;

/**
 * <pre>
 * This item is deprecated; please see `Drive` instead.
 * </pre>
 *
 * Protobuf type {@code google.apps.drive.activity.v2.TeamDrive}
 */
@java.lang.Deprecated public final class TeamDrive extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.drive.activity.v2.TeamDrive)
    TeamDriveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TeamDrive.newBuilder() to construct.
  private TeamDrive(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TeamDrive() {
    name_ = "";
    title_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TeamDrive();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.drive.activity.v2.TargetProto.internal_static_google_apps_drive_activity_v2_TeamDrive_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.drive.activity.v2.TargetProto.internal_static_google_apps_drive_activity_v2_TeamDrive_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.drive.activity.v2.TeamDrive.class, com.google.apps.drive.activity.v2.TeamDrive.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * This field is deprecated; please see `Drive.name` instead.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * This field is deprecated; please see `Drive.name` instead.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * This field is deprecated; please see `Drive.title` instead.
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This field is deprecated; please see `Drive.title` instead.
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOT_FIELD_NUMBER = 3;
  private com.google.apps.drive.activity.v2.DriveItem root_;
  /**
   * <pre>
   * This field is deprecated; please see `Drive.root` instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
   * @return Whether the root field is set.
   */
  @java.lang.Override
  public boolean hasRoot() {
    return root_ != null;
  }
  /**
   * <pre>
   * This field is deprecated; please see `Drive.root` instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
   * @return The root.
   */
  @java.lang.Override
  public com.google.apps.drive.activity.v2.DriveItem getRoot() {
    return root_ == null ? com.google.apps.drive.activity.v2.DriveItem.getDefaultInstance() : root_;
  }
  /**
   * <pre>
   * This field is deprecated; please see `Drive.root` instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
   */
  @java.lang.Override
  public com.google.apps.drive.activity.v2.DriveItemOrBuilder getRootOrBuilder() {
    return root_ == null ? com.google.apps.drive.activity.v2.DriveItem.getDefaultInstance() : root_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (root_ != null) {
      output.writeMessage(3, getRoot());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (root_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRoot());
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
    if (!(obj instanceof com.google.apps.drive.activity.v2.TeamDrive)) {
      return super.equals(obj);
    }
    com.google.apps.drive.activity.v2.TeamDrive other = (com.google.apps.drive.activity.v2.TeamDrive) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (hasRoot() != other.hasRoot()) return false;
    if (hasRoot()) {
      if (!getRoot()
          .equals(other.getRoot())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (hasRoot()) {
      hash = (37 * hash) + ROOT_FIELD_NUMBER;
      hash = (53 * hash) + getRoot().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.activity.v2.TeamDrive parseFrom(
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
  public static Builder newBuilder(com.google.apps.drive.activity.v2.TeamDrive prototype) {
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
   * This item is deprecated; please see `Drive` instead.
   * </pre>
   *
   * Protobuf type {@code google.apps.drive.activity.v2.TeamDrive}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.drive.activity.v2.TeamDrive)
      com.google.apps.drive.activity.v2.TeamDriveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.drive.activity.v2.TargetProto.internal_static_google_apps_drive_activity_v2_TeamDrive_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.drive.activity.v2.TargetProto.internal_static_google_apps_drive_activity_v2_TeamDrive_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.drive.activity.v2.TeamDrive.class, com.google.apps.drive.activity.v2.TeamDrive.Builder.class);
    }

    // Construct using com.google.apps.drive.activity.v2.TeamDrive.newBuilder()
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
      title_ = "";
      root_ = null;
      if (rootBuilder_ != null) {
        rootBuilder_.dispose();
        rootBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.drive.activity.v2.TargetProto.internal_static_google_apps_drive_activity_v2_TeamDrive_descriptor;
    }

    @java.lang.Override
    public com.google.apps.drive.activity.v2.TeamDrive getDefaultInstanceForType() {
      return com.google.apps.drive.activity.v2.TeamDrive.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.drive.activity.v2.TeamDrive build() {
      com.google.apps.drive.activity.v2.TeamDrive result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.drive.activity.v2.TeamDrive buildPartial() {
      com.google.apps.drive.activity.v2.TeamDrive result = new com.google.apps.drive.activity.v2.TeamDrive(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.drive.activity.v2.TeamDrive result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.root_ = rootBuilder_ == null
            ? root_
            : rootBuilder_.build();
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
      if (other instanceof com.google.apps.drive.activity.v2.TeamDrive) {
        return mergeFrom((com.google.apps.drive.activity.v2.TeamDrive)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.drive.activity.v2.TeamDrive other) {
      if (other == com.google.apps.drive.activity.v2.TeamDrive.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRoot()) {
        mergeRoot(other.getRoot());
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRootFieldBuilder().getBuilder(),
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
     * This field is deprecated; please see `Drive.name` instead.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * This field is deprecated; please see `Drive.name` instead.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * This field is deprecated; please see `Drive.name` instead.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * This field is deprecated; please see `Drive.name` instead.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * This field is deprecated; please see `Drive.name` instead.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * This field is deprecated; please see `Drive.title` instead.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.title` instead.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.title` instead.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.title` instead.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.title` instead.
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.apps.drive.activity.v2.DriveItem root_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.drive.activity.v2.DriveItem, com.google.apps.drive.activity.v2.DriveItem.Builder, com.google.apps.drive.activity.v2.DriveItemOrBuilder> rootBuilder_;
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     * @return Whether the root field is set.
     */
    public boolean hasRoot() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     * @return The root.
     */
    public com.google.apps.drive.activity.v2.DriveItem getRoot() {
      if (rootBuilder_ == null) {
        return root_ == null ? com.google.apps.drive.activity.v2.DriveItem.getDefaultInstance() : root_;
      } else {
        return rootBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    public Builder setRoot(com.google.apps.drive.activity.v2.DriveItem value) {
      if (rootBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        root_ = value;
      } else {
        rootBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    public Builder setRoot(
        com.google.apps.drive.activity.v2.DriveItem.Builder builderForValue) {
      if (rootBuilder_ == null) {
        root_ = builderForValue.build();
      } else {
        rootBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    public Builder mergeRoot(com.google.apps.drive.activity.v2.DriveItem value) {
      if (rootBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          root_ != null &&
          root_ != com.google.apps.drive.activity.v2.DriveItem.getDefaultInstance()) {
          getRootBuilder().mergeFrom(value);
        } else {
          root_ = value;
        }
      } else {
        rootBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    public Builder clearRoot() {
      bitField0_ = (bitField0_ & ~0x00000004);
      root_ = null;
      if (rootBuilder_ != null) {
        rootBuilder_.dispose();
        rootBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    public com.google.apps.drive.activity.v2.DriveItem.Builder getRootBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRootFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    public com.google.apps.drive.activity.v2.DriveItemOrBuilder getRootOrBuilder() {
      if (rootBuilder_ != null) {
        return rootBuilder_.getMessageOrBuilder();
      } else {
        return root_ == null ?
            com.google.apps.drive.activity.v2.DriveItem.getDefaultInstance() : root_;
      }
    }
    /**
     * <pre>
     * This field is deprecated; please see `Drive.root` instead.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.DriveItem root = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.drive.activity.v2.DriveItem, com.google.apps.drive.activity.v2.DriveItem.Builder, com.google.apps.drive.activity.v2.DriveItemOrBuilder> 
        getRootFieldBuilder() {
      if (rootBuilder_ == null) {
        rootBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.drive.activity.v2.DriveItem, com.google.apps.drive.activity.v2.DriveItem.Builder, com.google.apps.drive.activity.v2.DriveItemOrBuilder>(
                getRoot(),
                getParentForChildren(),
                isClean());
        root_ = null;
      }
      return rootBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.apps.drive.activity.v2.TeamDrive)
  }

  // @@protoc_insertion_point(class_scope:google.apps.drive.activity.v2.TeamDrive)
  private static final com.google.apps.drive.activity.v2.TeamDrive DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.drive.activity.v2.TeamDrive();
  }

  public static com.google.apps.drive.activity.v2.TeamDrive getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TeamDrive>
      PARSER = new com.google.protobuf.AbstractParser<TeamDrive>() {
    @java.lang.Override
    public TeamDrive parsePartialFrom(
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

  public static com.google.protobuf.Parser<TeamDrive> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TeamDrive> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.drive.activity.v2.TeamDrive getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
