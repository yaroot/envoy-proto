// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/agentendpoint/v1/agentendpoint.proto

package com.google.cloud.osconfig.agentendpoint.v1;

/**
 * <pre>
 * A request message to receive task notifications.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest}
 */
public final class ReceiveTaskNotificationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest)
    ReceiveTaskNotificationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReceiveTaskNotificationRequest.newBuilder() to construct.
  private ReceiveTaskNotificationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReceiveTaskNotificationRequest() {
    instanceIdToken_ = "";
    agentVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReceiveTaskNotificationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReceiveTaskNotificationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReceiveTaskNotificationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.class, com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.Builder.class);
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

  public static final int AGENT_VERSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentVersion_ = "";
  /**
   * <pre>
   * Required. The version of the agent making the request.
   * </pre>
   *
   * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The agentVersion.
   */
  @java.lang.Override
  public java.lang.String getAgentVersion() {
    java.lang.Object ref = agentVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The version of the agent making the request.
   * </pre>
   *
   * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for agentVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentVersionBytes() {
    java.lang.Object ref = agentVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceIdToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceIdToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agentVersion_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agentVersion_);
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
    if (!(obj instanceof com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest other = (com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest) obj;

    if (!getInstanceIdToken()
        .equals(other.getInstanceIdToken())) return false;
    if (!getAgentVersion()
        .equals(other.getAgentVersion())) return false;
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
    hash = (37 * hash) + AGENT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getAgentVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest prototype) {
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
   * A request message to receive task notifications.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest)
      com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReceiveTaskNotificationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReceiveTaskNotificationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.class, com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.newBuilder()
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
      agentVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.agentendpoint.v1.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1_ReceiveTaskNotificationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest getDefaultInstanceForType() {
      return com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest build() {
      com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest buildPartial() {
      com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest result = new com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceIdToken_ = instanceIdToken_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentVersion_ = agentVersion_;
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
      if (other instanceof com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest) {
        return mergeFrom((com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest other) {
      if (other == com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest.getDefaultInstance()) return this;
      if (!other.getInstanceIdToken().isEmpty()) {
        instanceIdToken_ = other.instanceIdToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAgentVersion().isEmpty()) {
        agentVersion_ = other.agentVersion_;
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
              instanceIdToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              agentVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object agentVersion_ = "";
    /**
     * <pre>
     * Required. The version of the agent making the request.
     * </pre>
     *
     * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The agentVersion.
     */
    public java.lang.String getAgentVersion() {
      java.lang.Object ref = agentVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The version of the agent making the request.
     * </pre>
     *
     * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for agentVersion.
     */
    public com.google.protobuf.ByteString
        getAgentVersionBytes() {
      java.lang.Object ref = agentVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The version of the agent making the request.
     * </pre>
     *
     * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The agentVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAgentVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The version of the agent making the request.
     * </pre>
     *
     * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentVersion() {
      agentVersion_ = getDefaultInstance().getAgentVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The version of the agent making the request.
     * </pre>
     *
     * <code>string agent_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for agentVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAgentVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest)
  private static final com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest();
  }

  public static com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReceiveTaskNotificationRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReceiveTaskNotificationRequest>() {
    @java.lang.Override
    public ReceiveTaskNotificationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReceiveTaskNotificationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReceiveTaskNotificationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

