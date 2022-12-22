// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * All data that is specifically relevant to only network endpoint groups of type PRIVATE_SERVICE_CONNECT.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupPscData}
 */
public final class NetworkEndpointGroupPscData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupPscData)
    NetworkEndpointGroupPscDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupPscData.newBuilder() to construct.
  private NetworkEndpointGroupPscData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkEndpointGroupPscData() {
    consumerPscAddress_ = "";
    pscConnectionStatus_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupPscData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupPscData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupPscData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupPscData.class, com.google.cloud.compute.v1.NetworkEndpointGroupPscData.Builder.class);
  }

  /**
   * <pre>
   * [Output Only] The connection status of the PSC Forwarding Rule.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.NetworkEndpointGroupPscData.PscConnectionStatus}
   */
  public enum PscConnectionStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PSC_CONNECTION_STATUS = 0;</code>
     */
    UNDEFINED_PSC_CONNECTION_STATUS(0),
    /**
     * <pre>
     * The connection has been accepted by the producer.
     * </pre>
     *
     * <code>ACCEPTED = 246714279;</code>
     */
    ACCEPTED(246714279),
    /**
     * <pre>
     * The connection has been closed by the producer and will not serve traffic going forward.
     * </pre>
     *
     * <code>CLOSED = 380163436;</code>
     */
    CLOSED(380163436),
    /**
     * <pre>
     * The connection has been accepted by the producer, but the producer needs to take further action before the forwarding rule can serve traffic.
     * </pre>
     *
     * <code>NEEDS_ATTENTION = 344491452;</code>
     */
    NEEDS_ATTENTION(344491452),
    /**
     * <pre>
     * The connection is pending acceptance by the producer.
     * </pre>
     *
     * <code>PENDING = 35394935;</code>
     */
    PENDING(35394935),
    /**
     * <pre>
     * The connection has been rejected by the producer.
     * </pre>
     *
     * <code>REJECTED = 174130302;</code>
     */
    REJECTED(174130302),
    /**
     * <code>STATUS_UNSPECIFIED = 42133066;</code>
     */
    STATUS_UNSPECIFIED(42133066),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PSC_CONNECTION_STATUS = 0;</code>
     */
    public static final int UNDEFINED_PSC_CONNECTION_STATUS_VALUE = 0;
    /**
     * <pre>
     * The connection has been accepted by the producer.
     * </pre>
     *
     * <code>ACCEPTED = 246714279;</code>
     */
    public static final int ACCEPTED_VALUE = 246714279;
    /**
     * <pre>
     * The connection has been closed by the producer and will not serve traffic going forward.
     * </pre>
     *
     * <code>CLOSED = 380163436;</code>
     */
    public static final int CLOSED_VALUE = 380163436;
    /**
     * <pre>
     * The connection has been accepted by the producer, but the producer needs to take further action before the forwarding rule can serve traffic.
     * </pre>
     *
     * <code>NEEDS_ATTENTION = 344491452;</code>
     */
    public static final int NEEDS_ATTENTION_VALUE = 344491452;
    /**
     * <pre>
     * The connection is pending acceptance by the producer.
     * </pre>
     *
     * <code>PENDING = 35394935;</code>
     */
    public static final int PENDING_VALUE = 35394935;
    /**
     * <pre>
     * The connection has been rejected by the producer.
     * </pre>
     *
     * <code>REJECTED = 174130302;</code>
     */
    public static final int REJECTED_VALUE = 174130302;
    /**
     * <code>STATUS_UNSPECIFIED = 42133066;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 42133066;


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
    public static PscConnectionStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PscConnectionStatus forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_PSC_CONNECTION_STATUS;
        case 246714279: return ACCEPTED;
        case 380163436: return CLOSED;
        case 344491452: return NEEDS_ATTENTION;
        case 35394935: return PENDING;
        case 174130302: return REJECTED;
        case 42133066: return STATUS_UNSPECIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PscConnectionStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PscConnectionStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PscConnectionStatus>() {
            public PscConnectionStatus findValueByNumber(int number) {
              return PscConnectionStatus.forNumber(number);
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
      return com.google.cloud.compute.v1.NetworkEndpointGroupPscData.getDescriptor().getEnumTypes().get(0);
    }

    private static final PscConnectionStatus[] VALUES = values();

    public static PscConnectionStatus valueOf(
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

    private PscConnectionStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.NetworkEndpointGroupPscData.PscConnectionStatus)
  }

  private int bitField0_;
  public static final int CONSUMER_PSC_ADDRESS_FIELD_NUMBER = 452646572;
  @SuppressWarnings("serial")
  private volatile java.lang.Object consumerPscAddress_ = "";
  /**
   * <pre>
   * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
   * </pre>
   *
   * <code>optional string consumer_psc_address = 452646572;</code>
   * @return Whether the consumerPscAddress field is set.
   */
  @java.lang.Override
  public boolean hasConsumerPscAddress() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
   * </pre>
   *
   * <code>optional string consumer_psc_address = 452646572;</code>
   * @return The consumerPscAddress.
   */
  @java.lang.Override
  public java.lang.String getConsumerPscAddress() {
    java.lang.Object ref = consumerPscAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consumerPscAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
   * </pre>
   *
   * <code>optional string consumer_psc_address = 452646572;</code>
   * @return The bytes for consumerPscAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConsumerPscAddressBytes() {
    java.lang.Object ref = consumerPscAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consumerPscAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PSC_CONNECTION_ID_FIELD_NUMBER = 292082397;
  private long pscConnectionId_ = 0L;
  /**
   * <pre>
   * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
   * </pre>
   *
   * <code>optional uint64 psc_connection_id = 292082397;</code>
   * @return Whether the pscConnectionId field is set.
   */
  @java.lang.Override
  public boolean hasPscConnectionId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
   * </pre>
   *
   * <code>optional uint64 psc_connection_id = 292082397;</code>
   * @return The pscConnectionId.
   */
  @java.lang.Override
  public long getPscConnectionId() {
    return pscConnectionId_;
  }

  public static final int PSC_CONNECTION_STATUS_FIELD_NUMBER = 184149172;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pscConnectionStatus_ = "";
  /**
   * <pre>
   * [Output Only] The connection status of the PSC Forwarding Rule.
   * Check the PscConnectionStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string psc_connection_status = 184149172;</code>
   * @return Whether the pscConnectionStatus field is set.
   */
  @java.lang.Override
  public boolean hasPscConnectionStatus() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * [Output Only] The connection status of the PSC Forwarding Rule.
   * Check the PscConnectionStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string psc_connection_status = 184149172;</code>
   * @return The pscConnectionStatus.
   */
  @java.lang.Override
  public java.lang.String getPscConnectionStatus() {
    java.lang.Object ref = pscConnectionStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pscConnectionStatus_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] The connection status of the PSC Forwarding Rule.
   * Check the PscConnectionStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string psc_connection_status = 184149172;</code>
   * @return The bytes for pscConnectionStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPscConnectionStatusBytes() {
    java.lang.Object ref = pscConnectionStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pscConnectionStatus_ = b;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 184149172, pscConnectionStatus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(292082397, pscConnectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 452646572, consumerPscAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(184149172, pscConnectionStatus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(292082397, pscConnectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(452646572, consumerPscAddress_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupPscData)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupPscData other = (com.google.cloud.compute.v1.NetworkEndpointGroupPscData) obj;

    if (hasConsumerPscAddress() != other.hasConsumerPscAddress()) return false;
    if (hasConsumerPscAddress()) {
      if (!getConsumerPscAddress()
          .equals(other.getConsumerPscAddress())) return false;
    }
    if (hasPscConnectionId() != other.hasPscConnectionId()) return false;
    if (hasPscConnectionId()) {
      if (getPscConnectionId()
          != other.getPscConnectionId()) return false;
    }
    if (hasPscConnectionStatus() != other.hasPscConnectionStatus()) return false;
    if (hasPscConnectionStatus()) {
      if (!getPscConnectionStatus()
          .equals(other.getPscConnectionStatus())) return false;
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
    if (hasConsumerPscAddress()) {
      hash = (37 * hash) + CONSUMER_PSC_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getConsumerPscAddress().hashCode();
    }
    if (hasPscConnectionId()) {
      hash = (37 * hash) + PSC_CONNECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPscConnectionId());
    }
    if (hasPscConnectionStatus()) {
      hash = (37 * hash) + PSC_CONNECTION_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getPscConnectionStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NetworkEndpointGroupPscData prototype) {
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
   * All data that is specifically relevant to only network endpoint groups of type PRIVATE_SERVICE_CONNECT.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupPscData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupPscData)
      com.google.cloud.compute.v1.NetworkEndpointGroupPscDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupPscData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupPscData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupPscData.class, com.google.cloud.compute.v1.NetworkEndpointGroupPscData.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworkEndpointGroupPscData.newBuilder()
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
      consumerPscAddress_ = "";
      pscConnectionId_ = 0L;
      pscConnectionStatus_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupPscData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupPscData getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupPscData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupPscData build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupPscData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupPscData buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupPscData result = new com.google.cloud.compute.v1.NetworkEndpointGroupPscData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NetworkEndpointGroupPscData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.consumerPscAddress_ = consumerPscAddress_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pscConnectionId_ = pscConnectionId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pscConnectionStatus_ = pscConnectionStatus_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.NetworkEndpointGroupPscData) {
        return mergeFrom((com.google.cloud.compute.v1.NetworkEndpointGroupPscData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworkEndpointGroupPscData other) {
      if (other == com.google.cloud.compute.v1.NetworkEndpointGroupPscData.getDefaultInstance()) return this;
      if (other.hasConsumerPscAddress()) {
        consumerPscAddress_ = other.consumerPscAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPscConnectionId()) {
        setPscConnectionId(other.getPscConnectionId());
      }
      if (other.hasPscConnectionStatus()) {
        pscConnectionStatus_ = other.pscConnectionStatus_;
        bitField0_ |= 0x00000004;
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
            case 1473193378: {
              pscConnectionStatus_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 1473193378
            case -1958308120: {
              pscConnectionId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case -1958308120
            case -673794718: {
              consumerPscAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -673794718
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

    private java.lang.Object consumerPscAddress_ = "";
    /**
     * <pre>
     * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
     * </pre>
     *
     * <code>optional string consumer_psc_address = 452646572;</code>
     * @return Whether the consumerPscAddress field is set.
     */
    public boolean hasConsumerPscAddress() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
     * </pre>
     *
     * <code>optional string consumer_psc_address = 452646572;</code>
     * @return The consumerPscAddress.
     */
    public java.lang.String getConsumerPscAddress() {
      java.lang.Object ref = consumerPscAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumerPscAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
     * </pre>
     *
     * <code>optional string consumer_psc_address = 452646572;</code>
     * @return The bytes for consumerPscAddress.
     */
    public com.google.protobuf.ByteString
        getConsumerPscAddressBytes() {
      java.lang.Object ref = consumerPscAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumerPscAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
     * </pre>
     *
     * <code>optional string consumer_psc_address = 452646572;</code>
     * @param value The consumerPscAddress to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerPscAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      consumerPscAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
     * </pre>
     *
     * <code>optional string consumer_psc_address = 452646572;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumerPscAddress() {
      consumerPscAddress_ = getDefaultInstance().getConsumerPscAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
     * </pre>
     *
     * <code>optional string consumer_psc_address = 452646572;</code>
     * @param value The bytes for consumerPscAddress to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerPscAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      consumerPscAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long pscConnectionId_ ;
    /**
     * <pre>
     * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @return Whether the pscConnectionId field is set.
     */
    @java.lang.Override
    public boolean hasPscConnectionId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @return The pscConnectionId.
     */
    @java.lang.Override
    public long getPscConnectionId() {
      return pscConnectionId_;
    }
    /**
     * <pre>
     * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @param value The pscConnectionId to set.
     * @return This builder for chaining.
     */
    public Builder setPscConnectionId(long value) {
      
      pscConnectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @return This builder for chaining.
     */
    public Builder clearPscConnectionId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pscConnectionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object pscConnectionStatus_ = "";
    /**
     * <pre>
     * [Output Only] The connection status of the PSC Forwarding Rule.
     * Check the PscConnectionStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string psc_connection_status = 184149172;</code>
     * @return Whether the pscConnectionStatus field is set.
     */
    public boolean hasPscConnectionStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * [Output Only] The connection status of the PSC Forwarding Rule.
     * Check the PscConnectionStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string psc_connection_status = 184149172;</code>
     * @return The pscConnectionStatus.
     */
    public java.lang.String getPscConnectionStatus() {
      java.lang.Object ref = pscConnectionStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pscConnectionStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] The connection status of the PSC Forwarding Rule.
     * Check the PscConnectionStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string psc_connection_status = 184149172;</code>
     * @return The bytes for pscConnectionStatus.
     */
    public com.google.protobuf.ByteString
        getPscConnectionStatusBytes() {
      java.lang.Object ref = pscConnectionStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pscConnectionStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] The connection status of the PSC Forwarding Rule.
     * Check the PscConnectionStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string psc_connection_status = 184149172;</code>
     * @param value The pscConnectionStatus to set.
     * @return This builder for chaining.
     */
    public Builder setPscConnectionStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pscConnectionStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The connection status of the PSC Forwarding Rule.
     * Check the PscConnectionStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string psc_connection_status = 184149172;</code>
     * @return This builder for chaining.
     */
    public Builder clearPscConnectionStatus() {
      pscConnectionStatus_ = getDefaultInstance().getPscConnectionStatus();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The connection status of the PSC Forwarding Rule.
     * Check the PscConnectionStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string psc_connection_status = 184149172;</code>
     * @param value The bytes for pscConnectionStatus to set.
     * @return This builder for chaining.
     */
    public Builder setPscConnectionStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pscConnectionStatus_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupPscData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupPscData)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupPscData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkEndpointGroupPscData();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupPscData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupPscData>
      PARSER = new com.google.protobuf.AbstractParser<NetworkEndpointGroupPscData>() {
    @java.lang.Override
    public NetworkEndpointGroupPscData parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkEndpointGroupPscData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupPscData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupPscData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
