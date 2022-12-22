// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * This reservation type allows to pre allocate specific instance configuration. Next ID: 6
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AllocationSpecificSKUReservation}
 */
public final class AllocationSpecificSKUReservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AllocationSpecificSKUReservation)
    AllocationSpecificSKUReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllocationSpecificSKUReservation.newBuilder() to construct.
  private AllocationSpecificSKUReservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllocationSpecificSKUReservation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllocationSpecificSKUReservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationSpecificSKUReservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationSpecificSKUReservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AllocationSpecificSKUReservation.class, com.google.cloud.compute.v1.AllocationSpecificSKUReservation.Builder.class);
  }

  private int bitField0_;
  public static final int ASSURED_COUNT_FIELD_NUMBER = 281197645;
  private long assuredCount_ = 0L;
  /**
   * <pre>
   * [Output Only] Indicates how many instances are actually usable currently.
   * </pre>
   *
   * <code>optional int64 assured_count = 281197645;</code>
   * @return Whether the assuredCount field is set.
   */
  @java.lang.Override
  public boolean hasAssuredCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Indicates how many instances are actually usable currently.
   * </pre>
   *
   * <code>optional int64 assured_count = 281197645;</code>
   * @return The assuredCount.
   */
  @java.lang.Override
  public long getAssuredCount() {
    return assuredCount_;
  }

  public static final int COUNT_FIELD_NUMBER = 94851343;
  private long count_ = 0L;
  /**
   * <pre>
   * Specifies the number of resources that are allocated.
   * </pre>
   *
   * <code>optional int64 count = 94851343;</code>
   * @return Whether the count field is set.
   */
  @java.lang.Override
  public boolean hasCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Specifies the number of resources that are allocated.
   * </pre>
   *
   * <code>optional int64 count = 94851343;</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
  }

  public static final int IN_USE_COUNT_FIELD_NUMBER = 493458877;
  private long inUseCount_ = 0L;
  /**
   * <pre>
   * [Output Only] Indicates how many instances are in use.
   * </pre>
   *
   * <code>optional int64 in_use_count = 493458877;</code>
   * @return Whether the inUseCount field is set.
   */
  @java.lang.Override
  public boolean hasInUseCount() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * [Output Only] Indicates how many instances are in use.
   * </pre>
   *
   * <code>optional int64 in_use_count = 493458877;</code>
   * @return The inUseCount.
   */
  @java.lang.Override
  public long getInUseCount() {
    return inUseCount_;
  }

  public static final int INSTANCE_PROPERTIES_FIELD_NUMBER = 215355165;
  private com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instanceProperties_;
  /**
   * <pre>
   * The instance properties for the reservation.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
   * @return Whether the instanceProperties field is set.
   */
  @java.lang.Override
  public boolean hasInstanceProperties() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * The instance properties for the reservation.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
   * @return The instanceProperties.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties getInstanceProperties() {
    return instanceProperties_ == null ? com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.getDefaultInstance() : instanceProperties_;
  }
  /**
   * <pre>
   * The instance properties for the reservation.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstancePropertiesOrBuilder getInstancePropertiesOrBuilder() {
    return instanceProperties_ == null ? com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.getDefaultInstance() : instanceProperties_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(94851343, count_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(215355165, getInstanceProperties());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(281197645, assuredCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(493458877, inUseCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(94851343, count_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(215355165, getInstanceProperties());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(281197645, assuredCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(493458877, inUseCount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AllocationSpecificSKUReservation)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AllocationSpecificSKUReservation other = (com.google.cloud.compute.v1.AllocationSpecificSKUReservation) obj;

    if (hasAssuredCount() != other.hasAssuredCount()) return false;
    if (hasAssuredCount()) {
      if (getAssuredCount()
          != other.getAssuredCount()) return false;
    }
    if (hasCount() != other.hasCount()) return false;
    if (hasCount()) {
      if (getCount()
          != other.getCount()) return false;
    }
    if (hasInUseCount() != other.hasInUseCount()) return false;
    if (hasInUseCount()) {
      if (getInUseCount()
          != other.getInUseCount()) return false;
    }
    if (hasInstanceProperties() != other.hasInstanceProperties()) return false;
    if (hasInstanceProperties()) {
      if (!getInstanceProperties()
          .equals(other.getInstanceProperties())) return false;
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
    if (hasAssuredCount()) {
      hash = (37 * hash) + ASSURED_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAssuredCount());
    }
    if (hasCount()) {
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCount());
    }
    if (hasInUseCount()) {
      hash = (37 * hash) + IN_USE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getInUseCount());
    }
    if (hasInstanceProperties()) {
      hash = (37 * hash) + INSTANCE_PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceProperties().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.AllocationSpecificSKUReservation prototype) {
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
   * This reservation type allows to pre allocate specific instance configuration. Next ID: 6
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AllocationSpecificSKUReservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AllocationSpecificSKUReservation)
      com.google.cloud.compute.v1.AllocationSpecificSKUReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationSpecificSKUReservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationSpecificSKUReservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AllocationSpecificSKUReservation.class, com.google.cloud.compute.v1.AllocationSpecificSKUReservation.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AllocationSpecificSKUReservation.newBuilder()
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
        getInstancePropertiesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      assuredCount_ = 0L;
      count_ = 0L;
      inUseCount_ = 0L;
      instanceProperties_ = null;
      if (instancePropertiesBuilder_ != null) {
        instancePropertiesBuilder_.dispose();
        instancePropertiesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationSpecificSKUReservation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationSpecificSKUReservation getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AllocationSpecificSKUReservation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationSpecificSKUReservation build() {
      com.google.cloud.compute.v1.AllocationSpecificSKUReservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationSpecificSKUReservation buildPartial() {
      com.google.cloud.compute.v1.AllocationSpecificSKUReservation result = new com.google.cloud.compute.v1.AllocationSpecificSKUReservation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AllocationSpecificSKUReservation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assuredCount_ = assuredCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inUseCount_ = inUseCount_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.instanceProperties_ = instancePropertiesBuilder_ == null
            ? instanceProperties_
            : instancePropertiesBuilder_.build();
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.compute.v1.AllocationSpecificSKUReservation) {
        return mergeFrom((com.google.cloud.compute.v1.AllocationSpecificSKUReservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AllocationSpecificSKUReservation other) {
      if (other == com.google.cloud.compute.v1.AllocationSpecificSKUReservation.getDefaultInstance()) return this;
      if (other.hasAssuredCount()) {
        setAssuredCount(other.getAssuredCount());
      }
      if (other.hasCount()) {
        setCount(other.getCount());
      }
      if (other.hasInUseCount()) {
        setInUseCount(other.getInUseCount());
      }
      if (other.hasInstanceProperties()) {
        mergeInstanceProperties(other.getInstanceProperties());
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
            case 758810744: {
              count_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 758810744
            case 1722841322: {
              input.readMessage(
                  getInstancePropertiesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 1722841322
            case -2045386136: {
              assuredCount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case -2045386136
            case -347296280: {
              inUseCount_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case -347296280
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

    private long assuredCount_ ;
    /**
     * <pre>
     * [Output Only] Indicates how many instances are actually usable currently.
     * </pre>
     *
     * <code>optional int64 assured_count = 281197645;</code>
     * @return Whether the assuredCount field is set.
     */
    @java.lang.Override
    public boolean hasAssuredCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Indicates how many instances are actually usable currently.
     * </pre>
     *
     * <code>optional int64 assured_count = 281197645;</code>
     * @return The assuredCount.
     */
    @java.lang.Override
    public long getAssuredCount() {
      return assuredCount_;
    }
    /**
     * <pre>
     * [Output Only] Indicates how many instances are actually usable currently.
     * </pre>
     *
     * <code>optional int64 assured_count = 281197645;</code>
     * @param value The assuredCount to set.
     * @return This builder for chaining.
     */
    public Builder setAssuredCount(long value) {
      
      assuredCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Indicates how many instances are actually usable currently.
     * </pre>
     *
     * <code>optional int64 assured_count = 281197645;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssuredCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assuredCount_ = 0L;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <pre>
     * Specifies the number of resources that are allocated.
     * </pre>
     *
     * <code>optional int64 count = 94851343;</code>
     * @return Whether the count field is set.
     */
    @java.lang.Override
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the number of resources that are allocated.
     * </pre>
     *
     * <code>optional int64 count = 94851343;</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * Specifies the number of resources that are allocated.
     * </pre>
     *
     * <code>optional int64 count = 94851343;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {
      
      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the number of resources that are allocated.
     * </pre>
     *
     * <code>optional int64 count = 94851343;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0L;
      onChanged();
      return this;
    }

    private long inUseCount_ ;
    /**
     * <pre>
     * [Output Only] Indicates how many instances are in use.
     * </pre>
     *
     * <code>optional int64 in_use_count = 493458877;</code>
     * @return Whether the inUseCount field is set.
     */
    @java.lang.Override
    public boolean hasInUseCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * [Output Only] Indicates how many instances are in use.
     * </pre>
     *
     * <code>optional int64 in_use_count = 493458877;</code>
     * @return The inUseCount.
     */
    @java.lang.Override
    public long getInUseCount() {
      return inUseCount_;
    }
    /**
     * <pre>
     * [Output Only] Indicates how many instances are in use.
     * </pre>
     *
     * <code>optional int64 in_use_count = 493458877;</code>
     * @param value The inUseCount to set.
     * @return This builder for chaining.
     */
    public Builder setInUseCount(long value) {
      
      inUseCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Indicates how many instances are in use.
     * </pre>
     *
     * <code>optional int64 in_use_count = 493458877;</code>
     * @return This builder for chaining.
     */
    public Builder clearInUseCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      inUseCount_ = 0L;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instanceProperties_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties, com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.Builder, com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstancePropertiesOrBuilder> instancePropertiesBuilder_;
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     * @return Whether the instanceProperties field is set.
     */
    public boolean hasInstanceProperties() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     * @return The instanceProperties.
     */
    public com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties getInstanceProperties() {
      if (instancePropertiesBuilder_ == null) {
        return instanceProperties_ == null ? com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.getDefaultInstance() : instanceProperties_;
      } else {
        return instancePropertiesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    public Builder setInstanceProperties(com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties value) {
      if (instancePropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instanceProperties_ = value;
      } else {
        instancePropertiesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    public Builder setInstanceProperties(
        com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.Builder builderForValue) {
      if (instancePropertiesBuilder_ == null) {
        instanceProperties_ = builderForValue.build();
      } else {
        instancePropertiesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    public Builder mergeInstanceProperties(com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties value) {
      if (instancePropertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          instanceProperties_ != null &&
          instanceProperties_ != com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.getDefaultInstance()) {
          getInstancePropertiesBuilder().mergeFrom(value);
        } else {
          instanceProperties_ = value;
        }
      } else {
        instancePropertiesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    public Builder clearInstanceProperties() {
      bitField0_ = (bitField0_ & ~0x00000008);
      instanceProperties_ = null;
      if (instancePropertiesBuilder_ != null) {
        instancePropertiesBuilder_.dispose();
        instancePropertiesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    public com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.Builder getInstancePropertiesBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getInstancePropertiesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    public com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstancePropertiesOrBuilder getInstancePropertiesOrBuilder() {
      if (instancePropertiesBuilder_ != null) {
        return instancePropertiesBuilder_.getMessageOrBuilder();
      } else {
        return instanceProperties_ == null ?
            com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.getDefaultInstance() : instanceProperties_;
      }
    }
    /**
     * <pre>
     * The instance properties for the reservation.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties instance_properties = 215355165;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties, com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.Builder, com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstancePropertiesOrBuilder> 
        getInstancePropertiesFieldBuilder() {
      if (instancePropertiesBuilder_ == null) {
        instancePropertiesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties, com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstanceProperties.Builder, com.google.cloud.compute.v1.AllocationSpecificSKUAllocationReservedInstancePropertiesOrBuilder>(
                getInstanceProperties(),
                getParentForChildren(),
                isClean());
        instanceProperties_ = null;
      }
      return instancePropertiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AllocationSpecificSKUReservation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AllocationSpecificSKUReservation)
  private static final com.google.cloud.compute.v1.AllocationSpecificSKUReservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AllocationSpecificSKUReservation();
  }

  public static com.google.cloud.compute.v1.AllocationSpecificSKUReservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocationSpecificSKUReservation>
      PARSER = new com.google.protobuf.AbstractParser<AllocationSpecificSKUReservation>() {
    @java.lang.Override
    public AllocationSpecificSKUReservation parsePartialFrom(
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

  public static com.google.protobuf.Parser<AllocationSpecificSKUReservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocationSpecificSKUReservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationSpecificSKUReservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
