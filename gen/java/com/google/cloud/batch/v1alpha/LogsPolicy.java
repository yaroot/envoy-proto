// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

/**
 * <pre>
 * LogsPolicy describes how outputs from a Job's Tasks (stdout/stderr) will be
 * preserved.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1alpha.LogsPolicy}
 */
public final class LogsPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1alpha.LogsPolicy)
    LogsPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogsPolicy.newBuilder() to construct.
  private LogsPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogsPolicy() {
    destination_ = 0;
    logsPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogsPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.batch.v1alpha.JobProto.internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1alpha.JobProto.internal_static_google_cloud_batch_v1alpha_LogsPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1alpha.LogsPolicy.class, com.google.cloud.batch.v1alpha.LogsPolicy.Builder.class);
  }

  /**
   * <pre>
   * The destination (if any) for logs.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.batch.v1alpha.LogsPolicy.Destination}
   */
  public enum Destination
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Logs are not preserved.
     * </pre>
     *
     * <code>DESTINATION_UNSPECIFIED = 0;</code>
     */
    DESTINATION_UNSPECIFIED(0),
    /**
     * <pre>
     * Logs are streamed to Cloud Logging.
     * </pre>
     *
     * <code>CLOUD_LOGGING = 1;</code>
     */
    CLOUD_LOGGING(1),
    /**
     * <pre>
     * Logs are saved to a file path.
     * </pre>
     *
     * <code>PATH = 2;</code>
     */
    PATH(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Logs are not preserved.
     * </pre>
     *
     * <code>DESTINATION_UNSPECIFIED = 0;</code>
     */
    public static final int DESTINATION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Logs are streamed to Cloud Logging.
     * </pre>
     *
     * <code>CLOUD_LOGGING = 1;</code>
     */
    public static final int CLOUD_LOGGING_VALUE = 1;
    /**
     * <pre>
     * Logs are saved to a file path.
     * </pre>
     *
     * <code>PATH = 2;</code>
     */
    public static final int PATH_VALUE = 2;


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
    public static Destination valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Destination forNumber(int value) {
      switch (value) {
        case 0: return DESTINATION_UNSPECIFIED;
        case 1: return CLOUD_LOGGING;
        case 2: return PATH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Destination>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Destination> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Destination>() {
            public Destination findValueByNumber(int number) {
              return Destination.forNumber(number);
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
      return com.google.cloud.batch.v1alpha.LogsPolicy.getDescriptor().getEnumTypes().get(0);
    }

    private static final Destination[] VALUES = values();

    public static Destination valueOf(
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

    private Destination(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.batch.v1alpha.LogsPolicy.Destination)
  }

  public static final int DESTINATION_FIELD_NUMBER = 1;
  private int destination_ = 0;
  /**
   * <pre>
   * Where logs should be saved.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
   * @return The enum numeric value on the wire for destination.
   */
  @java.lang.Override public int getDestinationValue() {
    return destination_;
  }
  /**
   * <pre>
   * Where logs should be saved.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
   * @return The destination.
   */
  @java.lang.Override public com.google.cloud.batch.v1alpha.LogsPolicy.Destination getDestination() {
    com.google.cloud.batch.v1alpha.LogsPolicy.Destination result = com.google.cloud.batch.v1alpha.LogsPolicy.Destination.forNumber(destination_);
    return result == null ? com.google.cloud.batch.v1alpha.LogsPolicy.Destination.UNRECOGNIZED : result;
  }

  public static final int LOGS_PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object logsPath_ = "";
  /**
   * <pre>
   * The path to which logs are saved when the destination = PATH. This can be a
   * local file path on the VM, or under the mount point of a Persistent Disk or
   * Filestore, or a Cloud Storage path.
   * </pre>
   *
   * <code>string logs_path = 2;</code>
   * @return The logsPath.
   */
  @java.lang.Override
  public java.lang.String getLogsPath() {
    java.lang.Object ref = logsPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logsPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The path to which logs are saved when the destination = PATH. This can be a
   * local file path on the VM, or under the mount point of a Persistent Disk or
   * Filestore, or a Cloud Storage path.
   * </pre>
   *
   * <code>string logs_path = 2;</code>
   * @return The bytes for logsPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogsPathBytes() {
    java.lang.Object ref = logsPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logsPath_ = b;
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
    if (destination_ != com.google.cloud.batch.v1alpha.LogsPolicy.Destination.DESTINATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, destination_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logsPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, logsPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destination_ != com.google.cloud.batch.v1alpha.LogsPolicy.Destination.DESTINATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, destination_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logsPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, logsPath_);
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
    if (!(obj instanceof com.google.cloud.batch.v1alpha.LogsPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1alpha.LogsPolicy other = (com.google.cloud.batch.v1alpha.LogsPolicy) obj;

    if (destination_ != other.destination_) return false;
    if (!getLogsPath()
        .equals(other.getLogsPath())) return false;
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
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + destination_;
    hash = (37 * hash) + LOGS_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getLogsPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.batch.v1alpha.LogsPolicy parseFrom(
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
  public static Builder newBuilder(com.google.cloud.batch.v1alpha.LogsPolicy prototype) {
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
   * LogsPolicy describes how outputs from a Job's Tasks (stdout/stderr) will be
   * preserved.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1alpha.LogsPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1alpha.LogsPolicy)
      com.google.cloud.batch.v1alpha.LogsPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.batch.v1alpha.JobProto.internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1alpha.JobProto.internal_static_google_cloud_batch_v1alpha_LogsPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1alpha.LogsPolicy.class, com.google.cloud.batch.v1alpha.LogsPolicy.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1alpha.LogsPolicy.newBuilder()
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
      destination_ = 0;
      logsPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.batch.v1alpha.JobProto.internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.LogsPolicy getDefaultInstanceForType() {
      return com.google.cloud.batch.v1alpha.LogsPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.LogsPolicy build() {
      com.google.cloud.batch.v1alpha.LogsPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.LogsPolicy buildPartial() {
      com.google.cloud.batch.v1alpha.LogsPolicy result = new com.google.cloud.batch.v1alpha.LogsPolicy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.batch.v1alpha.LogsPolicy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.destination_ = destination_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.logsPath_ = logsPath_;
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
      if (other instanceof com.google.cloud.batch.v1alpha.LogsPolicy) {
        return mergeFrom((com.google.cloud.batch.v1alpha.LogsPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1alpha.LogsPolicy other) {
      if (other == com.google.cloud.batch.v1alpha.LogsPolicy.getDefaultInstance()) return this;
      if (other.destination_ != 0) {
        setDestinationValue(other.getDestinationValue());
      }
      if (!other.getLogsPath().isEmpty()) {
        logsPath_ = other.logsPath_;
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
            case 8: {
              destination_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              logsPath_ = input.readStringRequireUtf8();
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

    private int destination_ = 0;
    /**
     * <pre>
     * Where logs should be saved.
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
     * @return The enum numeric value on the wire for destination.
     */
    @java.lang.Override public int getDestinationValue() {
      return destination_;
    }
    /**
     * <pre>
     * Where logs should be saved.
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
     * @param value The enum numeric value on the wire for destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationValue(int value) {
      destination_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Where logs should be saved.
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
     * @return The destination.
     */
    @java.lang.Override
    public com.google.cloud.batch.v1alpha.LogsPolicy.Destination getDestination() {
      com.google.cloud.batch.v1alpha.LogsPolicy.Destination result = com.google.cloud.batch.v1alpha.LogsPolicy.Destination.forNumber(destination_);
      return result == null ? com.google.cloud.batch.v1alpha.LogsPolicy.Destination.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Where logs should be saved.
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
     * @param value The destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestination(com.google.cloud.batch.v1alpha.LogsPolicy.Destination value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      destination_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Where logs should be saved.
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestination() {
      bitField0_ = (bitField0_ & ~0x00000001);
      destination_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object logsPath_ = "";
    /**
     * <pre>
     * The path to which logs are saved when the destination = PATH. This can be a
     * local file path on the VM, or under the mount point of a Persistent Disk or
     * Filestore, or a Cloud Storage path.
     * </pre>
     *
     * <code>string logs_path = 2;</code>
     * @return The logsPath.
     */
    public java.lang.String getLogsPath() {
      java.lang.Object ref = logsPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logsPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The path to which logs are saved when the destination = PATH. This can be a
     * local file path on the VM, or under the mount point of a Persistent Disk or
     * Filestore, or a Cloud Storage path.
     * </pre>
     *
     * <code>string logs_path = 2;</code>
     * @return The bytes for logsPath.
     */
    public com.google.protobuf.ByteString
        getLogsPathBytes() {
      java.lang.Object ref = logsPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logsPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The path to which logs are saved when the destination = PATH. This can be a
     * local file path on the VM, or under the mount point of a Persistent Disk or
     * Filestore, or a Cloud Storage path.
     * </pre>
     *
     * <code>string logs_path = 2;</code>
     * @param value The logsPath to set.
     * @return This builder for chaining.
     */
    public Builder setLogsPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      logsPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path to which logs are saved when the destination = PATH. This can be a
     * local file path on the VM, or under the mount point of a Persistent Disk or
     * Filestore, or a Cloud Storage path.
     * </pre>
     *
     * <code>string logs_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogsPath() {
      logsPath_ = getDefaultInstance().getLogsPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path to which logs are saved when the destination = PATH. This can be a
     * local file path on the VM, or under the mount point of a Persistent Disk or
     * Filestore, or a Cloud Storage path.
     * </pre>
     *
     * <code>string logs_path = 2;</code>
     * @param value The bytes for logsPath to set.
     * @return This builder for chaining.
     */
    public Builder setLogsPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      logsPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1alpha.LogsPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1alpha.LogsPolicy)
  private static final com.google.cloud.batch.v1alpha.LogsPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1alpha.LogsPolicy();
  }

  public static com.google.cloud.batch.v1alpha.LogsPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogsPolicy>
      PARSER = new com.google.protobuf.AbstractParser<LogsPolicy>() {
    @java.lang.Override
    public LogsPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogsPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogsPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1alpha.LogsPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

