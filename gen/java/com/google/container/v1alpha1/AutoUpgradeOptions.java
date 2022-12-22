// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

/**
 * <pre>
 * AutoUpgradeOptions defines the set of options for the user to control how
 * the Auto Upgrades will proceed.
 * </pre>
 *
 * Protobuf type {@code google.container.v1alpha1.AutoUpgradeOptions}
 */
public final class AutoUpgradeOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1alpha1.AutoUpgradeOptions)
    AutoUpgradeOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoUpgradeOptions.newBuilder() to construct.
  private AutoUpgradeOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoUpgradeOptions() {
    autoUpgradeStartTime_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoUpgradeOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_AutoUpgradeOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_AutoUpgradeOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1alpha1.AutoUpgradeOptions.class, com.google.container.v1alpha1.AutoUpgradeOptions.Builder.class);
  }

  public static final int AUTO_UPGRADE_START_TIME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object autoUpgradeStartTime_ = "";
  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the approximate start time for the upgrades, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string auto_upgrade_start_time = 1;</code>
   * @return The autoUpgradeStartTime.
   */
  @java.lang.Override
  public java.lang.String getAutoUpgradeStartTime() {
    java.lang.Object ref = autoUpgradeStartTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      autoUpgradeStartTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the approximate start time for the upgrades, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string auto_upgrade_start_time = 1;</code>
   * @return The bytes for autoUpgradeStartTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAutoUpgradeStartTimeBytes() {
    java.lang.Object ref = autoUpgradeStartTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      autoUpgradeStartTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the description of the upgrade.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the description of the upgrade.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(autoUpgradeStartTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, autoUpgradeStartTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(autoUpgradeStartTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, autoUpgradeStartTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
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
    if (!(obj instanceof com.google.container.v1alpha1.AutoUpgradeOptions)) {
      return super.equals(obj);
    }
    com.google.container.v1alpha1.AutoUpgradeOptions other = (com.google.container.v1alpha1.AutoUpgradeOptions) obj;

    if (!getAutoUpgradeStartTime()
        .equals(other.getAutoUpgradeStartTime())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
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
    hash = (37 * hash) + AUTO_UPGRADE_START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getAutoUpgradeStartTime().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.AutoUpgradeOptions parseFrom(
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
  public static Builder newBuilder(com.google.container.v1alpha1.AutoUpgradeOptions prototype) {
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
   * AutoUpgradeOptions defines the set of options for the user to control how
   * the Auto Upgrades will proceed.
   * </pre>
   *
   * Protobuf type {@code google.container.v1alpha1.AutoUpgradeOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1alpha1.AutoUpgradeOptions)
      com.google.container.v1alpha1.AutoUpgradeOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_AutoUpgradeOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_AutoUpgradeOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1alpha1.AutoUpgradeOptions.class, com.google.container.v1alpha1.AutoUpgradeOptions.Builder.class);
    }

    // Construct using com.google.container.v1alpha1.AutoUpgradeOptions.newBuilder()
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
      autoUpgradeStartTime_ = "";
      description_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_AutoUpgradeOptions_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1alpha1.AutoUpgradeOptions getDefaultInstanceForType() {
      return com.google.container.v1alpha1.AutoUpgradeOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1alpha1.AutoUpgradeOptions build() {
      com.google.container.v1alpha1.AutoUpgradeOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1alpha1.AutoUpgradeOptions buildPartial() {
      com.google.container.v1alpha1.AutoUpgradeOptions result = new com.google.container.v1alpha1.AutoUpgradeOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1alpha1.AutoUpgradeOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.autoUpgradeStartTime_ = autoUpgradeStartTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
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
      if (other instanceof com.google.container.v1alpha1.AutoUpgradeOptions) {
        return mergeFrom((com.google.container.v1alpha1.AutoUpgradeOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1alpha1.AutoUpgradeOptions other) {
      if (other == com.google.container.v1alpha1.AutoUpgradeOptions.getDefaultInstance()) return this;
      if (!other.getAutoUpgradeStartTime().isEmpty()) {
        autoUpgradeStartTime_ = other.autoUpgradeStartTime_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
              autoUpgradeStartTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
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

    private java.lang.Object autoUpgradeStartTime_ = "";
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the approximate start time for the upgrades, in
     * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * </pre>
     *
     * <code>string auto_upgrade_start_time = 1;</code>
     * @return The autoUpgradeStartTime.
     */
    public java.lang.String getAutoUpgradeStartTime() {
      java.lang.Object ref = autoUpgradeStartTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        autoUpgradeStartTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the approximate start time for the upgrades, in
     * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * </pre>
     *
     * <code>string auto_upgrade_start_time = 1;</code>
     * @return The bytes for autoUpgradeStartTime.
     */
    public com.google.protobuf.ByteString
        getAutoUpgradeStartTimeBytes() {
      java.lang.Object ref = autoUpgradeStartTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        autoUpgradeStartTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the approximate start time for the upgrades, in
     * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * </pre>
     *
     * <code>string auto_upgrade_start_time = 1;</code>
     * @param value The autoUpgradeStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setAutoUpgradeStartTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      autoUpgradeStartTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the approximate start time for the upgrades, in
     * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * </pre>
     *
     * <code>string auto_upgrade_start_time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoUpgradeStartTime() {
      autoUpgradeStartTime_ = getDefaultInstance().getAutoUpgradeStartTime();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the approximate start time for the upgrades, in
     * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * </pre>
     *
     * <code>string auto_upgrade_start_time = 1;</code>
     * @param value The bytes for autoUpgradeStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setAutoUpgradeStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      autoUpgradeStartTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the description of the upgrade.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the description of the upgrade.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the description of the upgrade.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the description of the upgrade.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] This field is set when upgrades are about to commence
     * with the description of the upgrade.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1alpha1.AutoUpgradeOptions)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1alpha1.AutoUpgradeOptions)
  private static final com.google.container.v1alpha1.AutoUpgradeOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1alpha1.AutoUpgradeOptions();
  }

  public static com.google.container.v1alpha1.AutoUpgradeOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoUpgradeOptions>
      PARSER = new com.google.protobuf.AbstractParser<AutoUpgradeOptions>() {
    @java.lang.Override
    public AutoUpgradeOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoUpgradeOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoUpgradeOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1alpha1.AutoUpgradeOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

