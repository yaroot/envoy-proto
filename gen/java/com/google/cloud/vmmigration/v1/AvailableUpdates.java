// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

/**
 * <pre>
 * Holds informatiom about the available versions for upgrade.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.AvailableUpdates}
 */
public final class AvailableUpdates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.AvailableUpdates)
    AvailableUpdatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AvailableUpdates.newBuilder() to construct.
  private AvailableUpdates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AvailableUpdates() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AvailableUpdates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_AvailableUpdates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_AvailableUpdates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.AvailableUpdates.class, com.google.cloud.vmmigration.v1.AvailableUpdates.Builder.class);
  }

  public static final int NEW_DEPLOYABLE_APPLIANCE_FIELD_NUMBER = 1;
  private com.google.cloud.vmmigration.v1.ApplianceVersion newDeployableAppliance_;
  /**
   * <pre>
   * The newest deployable version of the appliance.
   * The current appliance can't be updated into this version, and the owner
   * must manually deploy this OVA to a new appliance.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
   * @return Whether the newDeployableAppliance field is set.
   */
  @java.lang.Override
  public boolean hasNewDeployableAppliance() {
    return newDeployableAppliance_ != null;
  }
  /**
   * <pre>
   * The newest deployable version of the appliance.
   * The current appliance can't be updated into this version, and the owner
   * must manually deploy this OVA to a new appliance.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
   * @return The newDeployableAppliance.
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.ApplianceVersion getNewDeployableAppliance() {
    return newDeployableAppliance_ == null ? com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : newDeployableAppliance_;
  }
  /**
   * <pre>
   * The newest deployable version of the appliance.
   * The current appliance can't be updated into this version, and the owner
   * must manually deploy this OVA to a new appliance.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder getNewDeployableApplianceOrBuilder() {
    return newDeployableAppliance_ == null ? com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : newDeployableAppliance_;
  }

  public static final int IN_PLACE_UPDATE_FIELD_NUMBER = 2;
  private com.google.cloud.vmmigration.v1.ApplianceVersion inPlaceUpdate_;
  /**
   * <pre>
   * The latest version for in place update.
   * The current appliance can be updated to this version using the API or m4c
   * CLI.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
   * @return Whether the inPlaceUpdate field is set.
   */
  @java.lang.Override
  public boolean hasInPlaceUpdate() {
    return inPlaceUpdate_ != null;
  }
  /**
   * <pre>
   * The latest version for in place update.
   * The current appliance can be updated to this version using the API or m4c
   * CLI.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
   * @return The inPlaceUpdate.
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.ApplianceVersion getInPlaceUpdate() {
    return inPlaceUpdate_ == null ? com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : inPlaceUpdate_;
  }
  /**
   * <pre>
   * The latest version for in place update.
   * The current appliance can be updated to this version using the API or m4c
   * CLI.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder getInPlaceUpdateOrBuilder() {
    return inPlaceUpdate_ == null ? com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : inPlaceUpdate_;
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
    if (newDeployableAppliance_ != null) {
      output.writeMessage(1, getNewDeployableAppliance());
    }
    if (inPlaceUpdate_ != null) {
      output.writeMessage(2, getInPlaceUpdate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newDeployableAppliance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNewDeployableAppliance());
    }
    if (inPlaceUpdate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInPlaceUpdate());
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.AvailableUpdates)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.AvailableUpdates other = (com.google.cloud.vmmigration.v1.AvailableUpdates) obj;

    if (hasNewDeployableAppliance() != other.hasNewDeployableAppliance()) return false;
    if (hasNewDeployableAppliance()) {
      if (!getNewDeployableAppliance()
          .equals(other.getNewDeployableAppliance())) return false;
    }
    if (hasInPlaceUpdate() != other.hasInPlaceUpdate()) return false;
    if (hasInPlaceUpdate()) {
      if (!getInPlaceUpdate()
          .equals(other.getInPlaceUpdate())) return false;
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
    if (hasNewDeployableAppliance()) {
      hash = (37 * hash) + NEW_DEPLOYABLE_APPLIANCE_FIELD_NUMBER;
      hash = (53 * hash) + getNewDeployableAppliance().hashCode();
    }
    if (hasInPlaceUpdate()) {
      hash = (37 * hash) + IN_PLACE_UPDATE_FIELD_NUMBER;
      hash = (53 * hash) + getInPlaceUpdate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.AvailableUpdates parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmmigration.v1.AvailableUpdates prototype) {
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
   * Holds informatiom about the available versions for upgrade.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.AvailableUpdates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.AvailableUpdates)
      com.google.cloud.vmmigration.v1.AvailableUpdatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_AvailableUpdates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_AvailableUpdates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.AvailableUpdates.class, com.google.cloud.vmmigration.v1.AvailableUpdates.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.AvailableUpdates.newBuilder()
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
      newDeployableAppliance_ = null;
      if (newDeployableApplianceBuilder_ != null) {
        newDeployableApplianceBuilder_.dispose();
        newDeployableApplianceBuilder_ = null;
      }
      inPlaceUpdate_ = null;
      if (inPlaceUpdateBuilder_ != null) {
        inPlaceUpdateBuilder_.dispose();
        inPlaceUpdateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_AvailableUpdates_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.AvailableUpdates getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.AvailableUpdates.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.AvailableUpdates build() {
      com.google.cloud.vmmigration.v1.AvailableUpdates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.AvailableUpdates buildPartial() {
      com.google.cloud.vmmigration.v1.AvailableUpdates result = new com.google.cloud.vmmigration.v1.AvailableUpdates(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.AvailableUpdates result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newDeployableAppliance_ = newDeployableApplianceBuilder_ == null
            ? newDeployableAppliance_
            : newDeployableApplianceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inPlaceUpdate_ = inPlaceUpdateBuilder_ == null
            ? inPlaceUpdate_
            : inPlaceUpdateBuilder_.build();
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
      if (other instanceof com.google.cloud.vmmigration.v1.AvailableUpdates) {
        return mergeFrom((com.google.cloud.vmmigration.v1.AvailableUpdates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.AvailableUpdates other) {
      if (other == com.google.cloud.vmmigration.v1.AvailableUpdates.getDefaultInstance()) return this;
      if (other.hasNewDeployableAppliance()) {
        mergeNewDeployableAppliance(other.getNewDeployableAppliance());
      }
      if (other.hasInPlaceUpdate()) {
        mergeInPlaceUpdate(other.getInPlaceUpdate());
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
                  getNewDeployableApplianceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInPlaceUpdateFieldBuilder().getBuilder(),
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

    private com.google.cloud.vmmigration.v1.ApplianceVersion newDeployableAppliance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.ApplianceVersion, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder, com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder> newDeployableApplianceBuilder_;
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     * @return Whether the newDeployableAppliance field is set.
     */
    public boolean hasNewDeployableAppliance() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     * @return The newDeployableAppliance.
     */
    public com.google.cloud.vmmigration.v1.ApplianceVersion getNewDeployableAppliance() {
      if (newDeployableApplianceBuilder_ == null) {
        return newDeployableAppliance_ == null ? com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : newDeployableAppliance_;
      } else {
        return newDeployableApplianceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    public Builder setNewDeployableAppliance(com.google.cloud.vmmigration.v1.ApplianceVersion value) {
      if (newDeployableApplianceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newDeployableAppliance_ = value;
      } else {
        newDeployableApplianceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    public Builder setNewDeployableAppliance(
        com.google.cloud.vmmigration.v1.ApplianceVersion.Builder builderForValue) {
      if (newDeployableApplianceBuilder_ == null) {
        newDeployableAppliance_ = builderForValue.build();
      } else {
        newDeployableApplianceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    public Builder mergeNewDeployableAppliance(com.google.cloud.vmmigration.v1.ApplianceVersion value) {
      if (newDeployableApplianceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          newDeployableAppliance_ != null &&
          newDeployableAppliance_ != com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance()) {
          getNewDeployableApplianceBuilder().mergeFrom(value);
        } else {
          newDeployableAppliance_ = value;
        }
      } else {
        newDeployableApplianceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    public Builder clearNewDeployableAppliance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      newDeployableAppliance_ = null;
      if (newDeployableApplianceBuilder_ != null) {
        newDeployableApplianceBuilder_.dispose();
        newDeployableApplianceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    public com.google.cloud.vmmigration.v1.ApplianceVersion.Builder getNewDeployableApplianceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNewDeployableApplianceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    public com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder getNewDeployableApplianceOrBuilder() {
      if (newDeployableApplianceBuilder_ != null) {
        return newDeployableApplianceBuilder_.getMessageOrBuilder();
      } else {
        return newDeployableAppliance_ == null ?
            com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : newDeployableAppliance_;
      }
    }
    /**
     * <pre>
     * The newest deployable version of the appliance.
     * The current appliance can't be updated into this version, and the owner
     * must manually deploy this OVA to a new appliance.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion new_deployable_appliance = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.ApplianceVersion, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder, com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder> 
        getNewDeployableApplianceFieldBuilder() {
      if (newDeployableApplianceBuilder_ == null) {
        newDeployableApplianceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmmigration.v1.ApplianceVersion, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder, com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder>(
                getNewDeployableAppliance(),
                getParentForChildren(),
                isClean());
        newDeployableAppliance_ = null;
      }
      return newDeployableApplianceBuilder_;
    }

    private com.google.cloud.vmmigration.v1.ApplianceVersion inPlaceUpdate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.ApplianceVersion, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder, com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder> inPlaceUpdateBuilder_;
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     * @return Whether the inPlaceUpdate field is set.
     */
    public boolean hasInPlaceUpdate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     * @return The inPlaceUpdate.
     */
    public com.google.cloud.vmmigration.v1.ApplianceVersion getInPlaceUpdate() {
      if (inPlaceUpdateBuilder_ == null) {
        return inPlaceUpdate_ == null ? com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : inPlaceUpdate_;
      } else {
        return inPlaceUpdateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    public Builder setInPlaceUpdate(com.google.cloud.vmmigration.v1.ApplianceVersion value) {
      if (inPlaceUpdateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inPlaceUpdate_ = value;
      } else {
        inPlaceUpdateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    public Builder setInPlaceUpdate(
        com.google.cloud.vmmigration.v1.ApplianceVersion.Builder builderForValue) {
      if (inPlaceUpdateBuilder_ == null) {
        inPlaceUpdate_ = builderForValue.build();
      } else {
        inPlaceUpdateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    public Builder mergeInPlaceUpdate(com.google.cloud.vmmigration.v1.ApplianceVersion value) {
      if (inPlaceUpdateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          inPlaceUpdate_ != null &&
          inPlaceUpdate_ != com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance()) {
          getInPlaceUpdateBuilder().mergeFrom(value);
        } else {
          inPlaceUpdate_ = value;
        }
      } else {
        inPlaceUpdateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    public Builder clearInPlaceUpdate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inPlaceUpdate_ = null;
      if (inPlaceUpdateBuilder_ != null) {
        inPlaceUpdateBuilder_.dispose();
        inPlaceUpdateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    public com.google.cloud.vmmigration.v1.ApplianceVersion.Builder getInPlaceUpdateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInPlaceUpdateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    public com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder getInPlaceUpdateOrBuilder() {
      if (inPlaceUpdateBuilder_ != null) {
        return inPlaceUpdateBuilder_.getMessageOrBuilder();
      } else {
        return inPlaceUpdate_ == null ?
            com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance() : inPlaceUpdate_;
      }
    }
    /**
     * <pre>
     * The latest version for in place update.
     * The current appliance can be updated to this version using the API or m4c
     * CLI.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.ApplianceVersion in_place_update = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.ApplianceVersion, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder, com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder> 
        getInPlaceUpdateFieldBuilder() {
      if (inPlaceUpdateBuilder_ == null) {
        inPlaceUpdateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmmigration.v1.ApplianceVersion, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder, com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder>(
                getInPlaceUpdate(),
                getParentForChildren(),
                isClean());
        inPlaceUpdate_ = null;
      }
      return inPlaceUpdateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.AvailableUpdates)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.AvailableUpdates)
  private static final com.google.cloud.vmmigration.v1.AvailableUpdates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.AvailableUpdates();
  }

  public static com.google.cloud.vmmigration.v1.AvailableUpdates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvailableUpdates>
      PARSER = new com.google.protobuf.AbstractParser<AvailableUpdates>() {
    @java.lang.Override
    public AvailableUpdates parsePartialFrom(
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

  public static com.google.protobuf.Parser<AvailableUpdates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvailableUpdates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.AvailableUpdates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

