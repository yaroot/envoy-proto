// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

/**
 * <pre>
 * Request message for BigtableInstanceAdmin.CreateCluster.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.CreateClusterRequest}
 */
public final class CreateClusterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.CreateClusterRequest)
    CreateClusterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClusterRequest.newBuilder() to construct.
  private CreateClusterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClusterRequest() {
    parent_ = "";
    clusterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateClusterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.CreateClusterRequest.class, com.google.bigtable.admin.v2.CreateClusterRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The unique name of the instance in which to create the new cluster.
   * Values are of the form
   * `projects/{project}/instances/{instance}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The unique name of the instance in which to create the new cluster.
   * Values are of the form
   * `projects/{project}/instances/{instance}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clusterId_ = "";
  /**
   * <pre>
   * Required. The ID to be used when referring to the new cluster within its instance,
   * e.g., just `mycluster` rather than
   * `projects/myproject/instances/myinstance/clusters/mycluster`.
   * </pre>
   *
   * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clusterId.
   */
  @java.lang.Override
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to be used when referring to the new cluster within its instance,
   * e.g., just `mycluster` rather than
   * `projects/myproject/instances/myinstance/clusters/mycluster`.
   * </pre>
   *
   * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_FIELD_NUMBER = 3;
  private com.google.bigtable.admin.v2.Cluster cluster_;
  /**
   * <pre>
   * Required. The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the cluster field is set.
   */
  @java.lang.Override
  public boolean hasCluster() {
    return cluster_ != null;
  }
  /**
   * <pre>
   * Required. The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cluster.
   */
  @java.lang.Override
  public com.google.bigtable.admin.v2.Cluster getCluster() {
    return cluster_ == null ? com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
  }
  /**
   * <pre>
   * Required. The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.bigtable.admin.v2.ClusterOrBuilder getClusterOrBuilder() {
    return cluster_ == null ? com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterId_);
    }
    if (cluster_ != null) {
      output.writeMessage(3, getCluster());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterId_);
    }
    if (cluster_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCluster());
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
    if (!(obj instanceof com.google.bigtable.admin.v2.CreateClusterRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.CreateClusterRequest other = (com.google.bigtable.admin.v2.CreateClusterRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getClusterId()
        .equals(other.getClusterId())) return false;
    if (hasCluster() != other.hasCluster()) return false;
    if (hasCluster()) {
      if (!getCluster()
          .equals(other.getCluster())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    if (hasCluster()) {
      hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
      hash = (53 * hash) + getCluster().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
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
  public static Builder newBuilder(com.google.bigtable.admin.v2.CreateClusterRequest prototype) {
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
   * Request message for BigtableInstanceAdmin.CreateCluster.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.CreateClusterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.CreateClusterRequest)
      com.google.bigtable.admin.v2.CreateClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.CreateClusterRequest.class, com.google.bigtable.admin.v2.CreateClusterRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.CreateClusterRequest.newBuilder()
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
      parent_ = "";
      clusterId_ = "";
      cluster_ = null;
      if (clusterBuilder_ != null) {
        clusterBuilder_.dispose();
        clusterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.CreateClusterRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.CreateClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.CreateClusterRequest build() {
      com.google.bigtable.admin.v2.CreateClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.CreateClusterRequest buildPartial() {
      com.google.bigtable.admin.v2.CreateClusterRequest result = new com.google.bigtable.admin.v2.CreateClusterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.admin.v2.CreateClusterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clusterId_ = clusterId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cluster_ = clusterBuilder_ == null
            ? cluster_
            : clusterBuilder_.build();
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
      if (other instanceof com.google.bigtable.admin.v2.CreateClusterRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.CreateClusterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.CreateClusterRequest other) {
      if (other == com.google.bigtable.admin.v2.CreateClusterRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCluster()) {
        mergeCluster(other.getCluster());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clusterId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getClusterFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/{project}/instances/{instance}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/{project}/instances/{instance}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/{project}/instances/{instance}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/{project}/instances/{instance}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/{project}/instances/{instance}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <pre>
     * Required. The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The clusterId.
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for clusterId.
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterId() {
      clusterId_ = getDefaultInstance().getClusterId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.bigtable.admin.v2.Cluster cluster_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder> clusterBuilder_;
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the cluster field is set.
     */
    public boolean hasCluster() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The cluster.
     */
    public com.google.bigtable.admin.v2.Cluster getCluster() {
      if (clusterBuilder_ == null) {
        return cluster_ == null ? com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
      } else {
        return clusterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCluster(com.google.bigtable.admin.v2.Cluster value) {
      if (clusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cluster_ = value;
      } else {
        clusterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCluster(
        com.google.bigtable.admin.v2.Cluster.Builder builderForValue) {
      if (clusterBuilder_ == null) {
        cluster_ = builderForValue.build();
      } else {
        clusterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCluster(com.google.bigtable.admin.v2.Cluster value) {
      if (clusterBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          cluster_ != null &&
          cluster_ != com.google.bigtable.admin.v2.Cluster.getDefaultInstance()) {
          getClusterBuilder().mergeFrom(value);
        } else {
          cluster_ = value;
        }
      } else {
        clusterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCluster() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cluster_ = null;
      if (clusterBuilder_ != null) {
        clusterBuilder_.dispose();
        clusterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.bigtable.admin.v2.Cluster.Builder getClusterBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getClusterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.bigtable.admin.v2.ClusterOrBuilder getClusterOrBuilder() {
      if (clusterBuilder_ != null) {
        return clusterBuilder_.getMessageOrBuilder();
      } else {
        return cluster_ == null ?
            com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
      }
    }
    /**
     * <pre>
     * Required. The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder> 
        getClusterFieldBuilder() {
      if (clusterBuilder_ == null) {
        clusterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder>(
                getCluster(),
                getParentForChildren(),
                isClean());
        cluster_ = null;
      }
      return clusterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.CreateClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.CreateClusterRequest)
  private static final com.google.bigtable.admin.v2.CreateClusterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.CreateClusterRequest();
  }

  public static com.google.bigtable.admin.v2.CreateClusterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClusterRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateClusterRequest>() {
    @java.lang.Override
    public CreateClusterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.CreateClusterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
