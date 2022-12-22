// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/agentendpoint/v1/agentendpoint.proto

package com.google.cloud.osconfig.agentendpoint.v1;

/**
 * <pre>
 * The request message for having the agent report inventory.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest}
 */
public final class ReportInventoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest)
    ReportInventoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportInventoryRequest.newBuilder() to construct.
  private ReportInventoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportInventoryRequest() {
    instanceIdToken_ = "";
    inventoryChecksum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportInventoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReportInventoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReportInventoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.class, com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.Builder.class);
  }

  public static final int INSTANCE_ID_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceIdToken_ = "";
  /**
   * <pre>
   * Required. This is the Compute Engine instance identity token described in
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
   * </pre>
   *
   * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceIdToken.
   */
  @java.lang.Override
  public java.lang.String getInstanceIdToken() {
    java.lang.Object ref = instanceIdToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceIdToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. This is the Compute Engine instance identity token described in
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
   * </pre>
   *
   * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceIdToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceIdTokenBytes() {
    java.lang.Object ref = instanceIdToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceIdToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVENTORY_CHECKSUM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inventoryChecksum_ = "";
  /**
   * <pre>
   * Required. This is a client created checksum that should be generated based on the
   * contents of the reported inventory.  This will be used by the service to
   * determine if it has the latest version of inventory.
   * </pre>
   *
   * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inventoryChecksum.
   */
  @java.lang.Override
  public java.lang.String getInventoryChecksum() {
    java.lang.Object ref = inventoryChecksum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inventoryChecksum_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. This is a client created checksum that should be generated based on the
   * contents of the reported inventory.  This will be used by the service to
   * determine if it has the latest version of inventory.
   * </pre>
   *
   * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for inventoryChecksum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInventoryChecksumBytes() {
    java.lang.Object ref = inventoryChecksum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inventoryChecksum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVENTORY_FIELD_NUMBER = 3;
  private com.google.cloud.osconfig.agentendpoint.v1.Inventory inventory_;
  /**
   * <pre>
   * Optional. This is the details of the inventory.  Should only be provided if the
   * inventory has changed since the last report, or if instructed by the
   * service to provide full inventory.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the inventory field is set.
   */
  @java.lang.Override
  public boolean hasInventory() {
    return inventory_ != null;
  }
  /**
   * <pre>
   * Optional. This is the details of the inventory.  Should only be provided if the
   * inventory has changed since the last report, or if instructed by the
   * service to provide full inventory.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The inventory.
   */
  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1.Inventory getInventory() {
    return inventory_ == null ? com.google.cloud.osconfig.agentendpoint.v1.Inventory.getDefaultInstance() : inventory_;
  }
  /**
   * <pre>
   * Optional. This is the details of the inventory.  Should only be provided if the
   * inventory has changed since the last report, or if instructed by the
   * service to provide full inventory.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1.InventoryOrBuilder getInventoryOrBuilder() {
    return inventory_ == null ? com.google.cloud.osconfig.agentendpoint.v1.Inventory.getDefaultInstance() : inventory_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceIdToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceIdToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inventoryChecksum_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, inventoryChecksum_);
    }
    if (inventory_ != null) {
      output.writeMessage(3, getInventory());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceIdToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceIdToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inventoryChecksum_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, inventoryChecksum_);
    }
    if (inventory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInventory());
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
    if (!(obj instanceof com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest other = (com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest) obj;

    if (!getInstanceIdToken()
        .equals(other.getInstanceIdToken())) return false;
    if (!getInventoryChecksum()
        .equals(other.getInventoryChecksum())) return false;
    if (hasInventory() != other.hasInventory()) return false;
    if (hasInventory()) {
      if (!getInventory()
          .equals(other.getInventory())) return false;
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
    hash = (37 * hash) + INSTANCE_ID_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceIdToken().hashCode();
    hash = (37 * hash) + INVENTORY_CHECKSUM_FIELD_NUMBER;
    hash = (53 * hash) + getInventoryChecksum().hashCode();
    if (hasInventory()) {
      hash = (37 * hash) + INVENTORY_FIELD_NUMBER;
      hash = (53 * hash) + getInventory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest prototype) {
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
   * The request message for having the agent report inventory.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest)
      com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReportInventoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReportInventoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.class, com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.newBuilder()
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
      instanceIdToken_ = "";
      inventoryChecksum_ = "";
      inventory_ = null;
      if (inventoryBuilder_ != null) {
        inventoryBuilder_.dispose();
        inventoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReportInventoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest getDefaultInstanceForType() {
      return com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest build() {
      com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest buildPartial() {
      com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest result = new com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceIdToken_ = instanceIdToken_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inventoryChecksum_ = inventoryChecksum_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inventory_ = inventoryBuilder_ == null
            ? inventory_
            : inventoryBuilder_.build();
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
      if (other instanceof com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest) {
        return mergeFrom((com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest other) {
      if (other == com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest.getDefaultInstance()) return this;
      if (!other.getInstanceIdToken().isEmpty()) {
        instanceIdToken_ = other.instanceIdToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInventoryChecksum().isEmpty()) {
        inventoryChecksum_ = other.inventoryChecksum_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasInventory()) {
        mergeInventory(other.getInventory());
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
              instanceIdToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              inventoryChecksum_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getInventoryFieldBuilder().getBuilder(),
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

    private java.lang.Object instanceIdToken_ = "";
    /**
     * <pre>
     * Required. This is the Compute Engine instance identity token described in
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
     * </pre>
     *
     * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The instanceIdToken.
     */
    public java.lang.String getInstanceIdToken() {
      java.lang.Object ref = instanceIdToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceIdToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. This is the Compute Engine instance identity token described in
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
     * </pre>
     *
     * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for instanceIdToken.
     */
    public com.google.protobuf.ByteString
        getInstanceIdTokenBytes() {
      java.lang.Object ref = instanceIdToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceIdToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. This is the Compute Engine instance identity token described in
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
     * </pre>
     *
     * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The instanceIdToken to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      instanceIdToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. This is the Compute Engine instance identity token described in
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
     * </pre>
     *
     * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceIdToken() {
      instanceIdToken_ = getDefaultInstance().getInstanceIdToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. This is the Compute Engine instance identity token described in
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * where the audience is 'osconfig.googleapis.com' and the format is 'full'.
     * </pre>
     *
     * <code>string instance_id_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for instanceIdToken to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      instanceIdToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object inventoryChecksum_ = "";
    /**
     * <pre>
     * Required. This is a client created checksum that should be generated based on the
     * contents of the reported inventory.  This will be used by the service to
     * determine if it has the latest version of inventory.
     * </pre>
     *
     * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The inventoryChecksum.
     */
    public java.lang.String getInventoryChecksum() {
      java.lang.Object ref = inventoryChecksum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inventoryChecksum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. This is a client created checksum that should be generated based on the
     * contents of the reported inventory.  This will be used by the service to
     * determine if it has the latest version of inventory.
     * </pre>
     *
     * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for inventoryChecksum.
     */
    public com.google.protobuf.ByteString
        getInventoryChecksumBytes() {
      java.lang.Object ref = inventoryChecksum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inventoryChecksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. This is a client created checksum that should be generated based on the
     * contents of the reported inventory.  This will be used by the service to
     * determine if it has the latest version of inventory.
     * </pre>
     *
     * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The inventoryChecksum to set.
     * @return This builder for chaining.
     */
    public Builder setInventoryChecksum(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inventoryChecksum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. This is a client created checksum that should be generated based on the
     * contents of the reported inventory.  This will be used by the service to
     * determine if it has the latest version of inventory.
     * </pre>
     *
     * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearInventoryChecksum() {
      inventoryChecksum_ = getDefaultInstance().getInventoryChecksum();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. This is a client created checksum that should be generated based on the
     * contents of the reported inventory.  This will be used by the service to
     * determine if it has the latest version of inventory.
     * </pre>
     *
     * <code>string inventory_checksum = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for inventoryChecksum to set.
     * @return This builder for chaining.
     */
    public Builder setInventoryChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inventoryChecksum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.osconfig.agentendpoint.v1.Inventory inventory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.osconfig.agentendpoint.v1.Inventory, com.google.cloud.osconfig.agentendpoint.v1.Inventory.Builder, com.google.cloud.osconfig.agentendpoint.v1.InventoryOrBuilder> inventoryBuilder_;
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the inventory field is set.
     */
    public boolean hasInventory() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The inventory.
     */
    public com.google.cloud.osconfig.agentendpoint.v1.Inventory getInventory() {
      if (inventoryBuilder_ == null) {
        return inventory_ == null ? com.google.cloud.osconfig.agentendpoint.v1.Inventory.getDefaultInstance() : inventory_;
      } else {
        return inventoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setInventory(com.google.cloud.osconfig.agentendpoint.v1.Inventory value) {
      if (inventoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inventory_ = value;
      } else {
        inventoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setInventory(
        com.google.cloud.osconfig.agentendpoint.v1.Inventory.Builder builderForValue) {
      if (inventoryBuilder_ == null) {
        inventory_ = builderForValue.build();
      } else {
        inventoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeInventory(com.google.cloud.osconfig.agentendpoint.v1.Inventory value) {
      if (inventoryBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          inventory_ != null &&
          inventory_ != com.google.cloud.osconfig.agentendpoint.v1.Inventory.getDefaultInstance()) {
          getInventoryBuilder().mergeFrom(value);
        } else {
          inventory_ = value;
        }
      } else {
        inventoryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearInventory() {
      bitField0_ = (bitField0_ & ~0x00000004);
      inventory_ = null;
      if (inventoryBuilder_ != null) {
        inventoryBuilder_.dispose();
        inventoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.osconfig.agentendpoint.v1.Inventory.Builder getInventoryBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getInventoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.osconfig.agentendpoint.v1.InventoryOrBuilder getInventoryOrBuilder() {
      if (inventoryBuilder_ != null) {
        return inventoryBuilder_.getMessageOrBuilder();
      } else {
        return inventory_ == null ?
            com.google.cloud.osconfig.agentendpoint.v1.Inventory.getDefaultInstance() : inventory_;
      }
    }
    /**
     * <pre>
     * Optional. This is the details of the inventory.  Should only be provided if the
     * inventory has changed since the last report, or if instructed by the
     * service to provide full inventory.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1.Inventory inventory = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.osconfig.agentendpoint.v1.Inventory, com.google.cloud.osconfig.agentendpoint.v1.Inventory.Builder, com.google.cloud.osconfig.agentendpoint.v1.InventoryOrBuilder> 
        getInventoryFieldBuilder() {
      if (inventoryBuilder_ == null) {
        inventoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.osconfig.agentendpoint.v1.Inventory, com.google.cloud.osconfig.agentendpoint.v1.Inventory.Builder, com.google.cloud.osconfig.agentendpoint.v1.InventoryOrBuilder>(
                getInventory(),
                getParentForChildren(),
                isClean());
        inventory_ = null;
      }
      return inventoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest)
  private static final com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest();
  }

  public static com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportInventoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReportInventoryRequest>() {
    @java.lang.Override
    public ReportInventoryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReportInventoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportInventoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
