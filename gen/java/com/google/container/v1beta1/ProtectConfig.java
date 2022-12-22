// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * ProtectConfig defines the flags needed to enable/disable features for the
 * Protect API.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.ProtectConfig}
 */
public final class ProtectConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.ProtectConfig)
    ProtectConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProtectConfig.newBuilder() to construct.
  private ProtectConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtectConfig() {
    workloadVulnerabilityMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProtectConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_ProtectConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_ProtectConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.ProtectConfig.class, com.google.container.v1beta1.ProtectConfig.Builder.class);
  }

  /**
   * <pre>
   * WorkloadVulnerabilityMode defines mode to perform vulnerability scanning.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode}
   */
  public enum WorkloadVulnerabilityMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value not specified.
     * </pre>
     *
     * <code>WORKLOAD_VULNERABILITY_MODE_UNSPECIFIED = 0;</code>
     */
    WORKLOAD_VULNERABILITY_MODE_UNSPECIFIED(0),
    /**
     * <pre>
     * Disables Workload Vulnerability Scanning feature on the cluster.
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    DISABLED(1),
    /**
     * <pre>
     * Applies basic vulnerability scanning settings for cluster workloads.
     * </pre>
     *
     * <code>BASIC = 2;</code>
     */
    BASIC(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value not specified.
     * </pre>
     *
     * <code>WORKLOAD_VULNERABILITY_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int WORKLOAD_VULNERABILITY_MODE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Disables Workload Vulnerability Scanning feature on the cluster.
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    public static final int DISABLED_VALUE = 1;
    /**
     * <pre>
     * Applies basic vulnerability scanning settings for cluster workloads.
     * </pre>
     *
     * <code>BASIC = 2;</code>
     */
    public static final int BASIC_VALUE = 2;


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
    public static WorkloadVulnerabilityMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WorkloadVulnerabilityMode forNumber(int value) {
      switch (value) {
        case 0: return WORKLOAD_VULNERABILITY_MODE_UNSPECIFIED;
        case 1: return DISABLED;
        case 2: return BASIC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WorkloadVulnerabilityMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WorkloadVulnerabilityMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WorkloadVulnerabilityMode>() {
            public WorkloadVulnerabilityMode findValueByNumber(int number) {
              return WorkloadVulnerabilityMode.forNumber(number);
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
      return com.google.container.v1beta1.ProtectConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final WorkloadVulnerabilityMode[] VALUES = values();

    public static WorkloadVulnerabilityMode valueOf(
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

    private WorkloadVulnerabilityMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode)
  }

  private int bitField0_;
  public static final int WORKLOAD_CONFIG_FIELD_NUMBER = 1;
  private com.google.container.v1beta1.WorkloadConfig workloadConfig_;
  /**
   * <pre>
   * WorkloadConfig defines which actions are enabled for a cluster's workload
   * configurations.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
   * @return Whether the workloadConfig field is set.
   */
  @java.lang.Override
  public boolean hasWorkloadConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * WorkloadConfig defines which actions are enabled for a cluster's workload
   * configurations.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
   * @return The workloadConfig.
   */
  @java.lang.Override
  public com.google.container.v1beta1.WorkloadConfig getWorkloadConfig() {
    return workloadConfig_ == null ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance() : workloadConfig_;
  }
  /**
   * <pre>
   * WorkloadConfig defines which actions are enabled for a cluster's workload
   * configurations.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.WorkloadConfigOrBuilder getWorkloadConfigOrBuilder() {
    return workloadConfig_ == null ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance() : workloadConfig_;
  }

  public static final int WORKLOAD_VULNERABILITY_MODE_FIELD_NUMBER = 2;
  private int workloadVulnerabilityMode_ = 0;
  /**
   * <pre>
   * Sets which mode to use for Protect workload vulnerability scanning feature.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
   * @return Whether the workloadVulnerabilityMode field is set.
   */
  @java.lang.Override public boolean hasWorkloadVulnerabilityMode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Sets which mode to use for Protect workload vulnerability scanning feature.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
   * @return The enum numeric value on the wire for workloadVulnerabilityMode.
   */
  @java.lang.Override public int getWorkloadVulnerabilityModeValue() {
    return workloadVulnerabilityMode_;
  }
  /**
   * <pre>
   * Sets which mode to use for Protect workload vulnerability scanning feature.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
   * @return The workloadVulnerabilityMode.
   */
  @java.lang.Override public com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode getWorkloadVulnerabilityMode() {
    com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode result = com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode.forNumber(workloadVulnerabilityMode_);
    return result == null ? com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode.UNRECOGNIZED : result;
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
      output.writeMessage(1, getWorkloadConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, workloadVulnerabilityMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkloadConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, workloadVulnerabilityMode_);
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
    if (!(obj instanceof com.google.container.v1beta1.ProtectConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.ProtectConfig other = (com.google.container.v1beta1.ProtectConfig) obj;

    if (hasWorkloadConfig() != other.hasWorkloadConfig()) return false;
    if (hasWorkloadConfig()) {
      if (!getWorkloadConfig()
          .equals(other.getWorkloadConfig())) return false;
    }
    if (hasWorkloadVulnerabilityMode() != other.hasWorkloadVulnerabilityMode()) return false;
    if (hasWorkloadVulnerabilityMode()) {
      if (workloadVulnerabilityMode_ != other.workloadVulnerabilityMode_) return false;
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
    if (hasWorkloadConfig()) {
      hash = (37 * hash) + WORKLOAD_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getWorkloadConfig().hashCode();
    }
    if (hasWorkloadVulnerabilityMode()) {
      hash = (37 * hash) + WORKLOAD_VULNERABILITY_MODE_FIELD_NUMBER;
      hash = (53 * hash) + workloadVulnerabilityMode_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.ProtectConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.ProtectConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.ProtectConfig parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.ProtectConfig prototype) {
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
   * ProtectConfig defines the flags needed to enable/disable features for the
   * Protect API.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.ProtectConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.ProtectConfig)
      com.google.container.v1beta1.ProtectConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_ProtectConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_ProtectConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.ProtectConfig.class, com.google.container.v1beta1.ProtectConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.ProtectConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getWorkloadConfigFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      workloadConfig_ = null;
      if (workloadConfigBuilder_ != null) {
        workloadConfigBuilder_.dispose();
        workloadConfigBuilder_ = null;
      }
      workloadVulnerabilityMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_ProtectConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.ProtectConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig build() {
      com.google.container.v1beta1.ProtectConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig buildPartial() {
      com.google.container.v1beta1.ProtectConfig result = new com.google.container.v1beta1.ProtectConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.ProtectConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workloadConfig_ = workloadConfigBuilder_ == null
            ? workloadConfig_
            : workloadConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.workloadVulnerabilityMode_ = workloadVulnerabilityMode_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.container.v1beta1.ProtectConfig) {
        return mergeFrom((com.google.container.v1beta1.ProtectConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.ProtectConfig other) {
      if (other == com.google.container.v1beta1.ProtectConfig.getDefaultInstance()) return this;
      if (other.hasWorkloadConfig()) {
        mergeWorkloadConfig(other.getWorkloadConfig());
      }
      if (other.hasWorkloadVulnerabilityMode()) {
        setWorkloadVulnerabilityMode(other.getWorkloadVulnerabilityMode());
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
                  getWorkloadConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              workloadVulnerabilityMode_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.container.v1beta1.WorkloadConfig workloadConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.WorkloadConfig, com.google.container.v1beta1.WorkloadConfig.Builder, com.google.container.v1beta1.WorkloadConfigOrBuilder> workloadConfigBuilder_;
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     * @return Whether the workloadConfig field is set.
     */
    public boolean hasWorkloadConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     * @return The workloadConfig.
     */
    public com.google.container.v1beta1.WorkloadConfig getWorkloadConfig() {
      if (workloadConfigBuilder_ == null) {
        return workloadConfig_ == null ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance() : workloadConfig_;
      } else {
        return workloadConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder setWorkloadConfig(com.google.container.v1beta1.WorkloadConfig value) {
      if (workloadConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workloadConfig_ = value;
      } else {
        workloadConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder setWorkloadConfig(
        com.google.container.v1beta1.WorkloadConfig.Builder builderForValue) {
      if (workloadConfigBuilder_ == null) {
        workloadConfig_ = builderForValue.build();
      } else {
        workloadConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder mergeWorkloadConfig(com.google.container.v1beta1.WorkloadConfig value) {
      if (workloadConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          workloadConfig_ != null &&
          workloadConfig_ != com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()) {
          getWorkloadConfigBuilder().mergeFrom(value);
        } else {
          workloadConfig_ = value;
        }
      } else {
        workloadConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder clearWorkloadConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      workloadConfig_ = null;
      if (workloadConfigBuilder_ != null) {
        workloadConfigBuilder_.dispose();
        workloadConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public com.google.container.v1beta1.WorkloadConfig.Builder getWorkloadConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkloadConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public com.google.container.v1beta1.WorkloadConfigOrBuilder getWorkloadConfigOrBuilder() {
      if (workloadConfigBuilder_ != null) {
        return workloadConfigBuilder_.getMessageOrBuilder();
      } else {
        return workloadConfig_ == null ?
            com.google.container.v1beta1.WorkloadConfig.getDefaultInstance() : workloadConfig_;
      }
    }
    /**
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.WorkloadConfig, com.google.container.v1beta1.WorkloadConfig.Builder, com.google.container.v1beta1.WorkloadConfigOrBuilder> 
        getWorkloadConfigFieldBuilder() {
      if (workloadConfigBuilder_ == null) {
        workloadConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.WorkloadConfig, com.google.container.v1beta1.WorkloadConfig.Builder, com.google.container.v1beta1.WorkloadConfigOrBuilder>(
                getWorkloadConfig(),
                getParentForChildren(),
                isClean());
        workloadConfig_ = null;
      }
      return workloadConfigBuilder_;
    }

    private int workloadVulnerabilityMode_ = 0;
    /**
     * <pre>
     * Sets which mode to use for Protect workload vulnerability scanning feature.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
     * @return Whether the workloadVulnerabilityMode field is set.
     */
    @java.lang.Override public boolean hasWorkloadVulnerabilityMode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Sets which mode to use for Protect workload vulnerability scanning feature.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
     * @return The enum numeric value on the wire for workloadVulnerabilityMode.
     */
    @java.lang.Override public int getWorkloadVulnerabilityModeValue() {
      return workloadVulnerabilityMode_;
    }
    /**
     * <pre>
     * Sets which mode to use for Protect workload vulnerability scanning feature.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
     * @param value The enum numeric value on the wire for workloadVulnerabilityMode to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadVulnerabilityModeValue(int value) {
      workloadVulnerabilityMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sets which mode to use for Protect workload vulnerability scanning feature.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
     * @return The workloadVulnerabilityMode.
     */
    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode getWorkloadVulnerabilityMode() {
      com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode result = com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode.forNumber(workloadVulnerabilityMode_);
      return result == null ? com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Sets which mode to use for Protect workload vulnerability scanning feature.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
     * @param value The workloadVulnerabilityMode to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadVulnerabilityMode(com.google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      workloadVulnerabilityMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sets which mode to use for Protect workload vulnerability scanning feature.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.ProtectConfig.WorkloadVulnerabilityMode workload_vulnerability_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkloadVulnerabilityMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      workloadVulnerabilityMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.ProtectConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.ProtectConfig)
  private static final com.google.container.v1beta1.ProtectConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.ProtectConfig();
  }

  public static com.google.container.v1beta1.ProtectConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtectConfig>
      PARSER = new com.google.protobuf.AbstractParser<ProtectConfig>() {
    @java.lang.Override
    public ProtectConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProtectConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtectConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.ProtectConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

