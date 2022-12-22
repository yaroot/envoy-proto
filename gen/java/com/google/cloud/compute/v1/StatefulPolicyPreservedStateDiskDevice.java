// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice}
 */
public final class StatefulPolicyPreservedStateDiskDevice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)
    StatefulPolicyPreservedStateDiskDeviceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatefulPolicyPreservedStateDiskDevice.newBuilder() to construct.
  private StatefulPolicyPreservedStateDiskDevice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatefulPolicyPreservedStateDiskDevice() {
    autoDelete_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatefulPolicyPreservedStateDiskDevice();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedStateDiskDevice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedStateDiskDevice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.class, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.Builder.class);
  }

  /**
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.AutoDelete}
   */
  public enum AutoDelete
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_AUTO_DELETE = 0;</code>
     */
    UNDEFINED_AUTO_DELETE(0),
    /**
     * <code>NEVER = 74175084;</code>
     */
    NEVER(74175084),
    /**
     * <code>ON_PERMANENT_INSTANCE_DELETION = 95727719;</code>
     */
    ON_PERMANENT_INSTANCE_DELETION(95727719),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_AUTO_DELETE = 0;</code>
     */
    public static final int UNDEFINED_AUTO_DELETE_VALUE = 0;
    /**
     * <code>NEVER = 74175084;</code>
     */
    public static final int NEVER_VALUE = 74175084;
    /**
     * <code>ON_PERMANENT_INSTANCE_DELETION = 95727719;</code>
     */
    public static final int ON_PERMANENT_INSTANCE_DELETION_VALUE = 95727719;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AutoDelete valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AutoDelete forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_AUTO_DELETE;
        case 74175084: return NEVER;
        case 95727719: return ON_PERMANENT_INSTANCE_DELETION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AutoDelete>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AutoDelete> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AutoDelete>() {
            public AutoDelete findValueByNumber(int number) {
              return AutoDelete.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.getDescriptor().getEnumTypes().get(0);
    }

    private static final AutoDelete[] VALUES = values();

    public static AutoDelete valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AutoDelete(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.AutoDelete)
  }

  private int bitField0_;
  public static final int AUTO_DELETE_FIELD_NUMBER = 464761403;
  @SuppressWarnings("serial")
  private volatile java.lang.Object autoDelete_ = "";
  /**
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   * @return Whether the autoDelete field is set.
   */
  @java.lang.Override
  public boolean hasAutoDelete() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   * @return The autoDelete.
   */
  @java.lang.Override
  public java.lang.String getAutoDelete() {
    java.lang.Object ref = autoDelete_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      autoDelete_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   * @return The bytes for autoDelete.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAutoDeleteBytes() {
    java.lang.Object ref = autoDelete_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      autoDelete_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 464761403, autoDelete_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(464761403, autoDelete_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice other = (com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice) obj;

    if (hasAutoDelete() != other.hasAutoDelete()) return false;
    if (hasAutoDelete()) {
      if (!getAutoDelete()
          .equals(other.getAutoDelete())) return false;
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
    if (hasAutoDelete()) {
      hash = (37 * hash) + AUTO_DELETE_FIELD_NUMBER;
      hash = (53 * hash) + getAutoDelete().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDeviceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedStateDiskDevice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedStateDiskDevice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.class, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.newBuilder()
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
      autoDelete_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedStateDiskDevice_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice build() {
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice buildPartial() {
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice result = new com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.autoDelete_ = autoDelete_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice) {
        return mergeFrom((com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice other) {
      if (other == com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.getDefaultInstance()) return this;
      if (other.hasAutoDelete()) {
        autoDelete_ = other.autoDelete_;
        bitField0_ |= 0x00000001;
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
            case -576876070: {
              autoDelete_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -576876070
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

    private java.lang.Object autoDelete_ = "";
    /**
     * <pre>
     * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return Whether the autoDelete field is set.
     */
    public boolean hasAutoDelete() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return The autoDelete.
     */
    public java.lang.String getAutoDelete() {
      java.lang.Object ref = autoDelete_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        autoDelete_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return The bytes for autoDelete.
     */
    public com.google.protobuf.ByteString
        getAutoDeleteBytes() {
      java.lang.Object ref = autoDelete_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        autoDelete_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @param value The autoDelete to set.
     * @return This builder for chaining.
     */
    public Builder setAutoDelete(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      autoDelete_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoDelete() {
      autoDelete_ = getDefaultInstance().getAutoDelete();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @param value The bytes for autoDelete to set.
     * @return This builder for chaining.
     */
    public Builder setAutoDeleteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      autoDelete_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)
  private static final com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice();
  }

  public static com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatefulPolicyPreservedStateDiskDevice>
      PARSER = new com.google.protobuf.AbstractParser<StatefulPolicyPreservedStateDiskDevice>() {
    @java.lang.Override
    public StatefulPolicyPreservedStateDiskDevice parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatefulPolicyPreservedStateDiskDevice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatefulPolicyPreservedStateDiskDevice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
