// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/requests.proto

package com.google.apps.drive.labels.v2beta;

/**
 * <pre>
 * Provides control over how write requests are executed. When not specified,
 * the last write wins.
 * </pre>
 *
 * Protobuf type {@code google.apps.drive.labels.v2beta.WriteControl}
 */
public final class WriteControl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.drive.labels.v2beta.WriteControl)
    WriteControlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WriteControl.newBuilder() to construct.
  private WriteControl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WriteControl() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WriteControl();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.drive.labels.v2beta.RequestsProto.internal_static_google_apps_drive_labels_v2beta_WriteControl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.drive.labels.v2beta.RequestsProto.internal_static_google_apps_drive_labels_v2beta_WriteControl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.drive.labels.v2beta.WriteControl.class, com.google.apps.drive.labels.v2beta.WriteControl.Builder.class);
  }

  private int controlCase_ = 0;
  private java.lang.Object control_;
  public enum ControlCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REQUIRED_REVISION_ID(1),
    CONTROL_NOT_SET(0);
    private final int value;
    private ControlCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ControlCase valueOf(int value) {
      return forNumber(value);
    }

    public static ControlCase forNumber(int value) {
      switch (value) {
        case 1: return REQUIRED_REVISION_ID;
        case 0: return CONTROL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ControlCase
  getControlCase() {
    return ControlCase.forNumber(
        controlCase_);
  }

  public static final int REQUIRED_REVISION_ID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
   * label that the write request will be applied to. If this is not the
   * latest revision of the label, the request will not be processed and will
   * return a 400 Bad Request error.
   * </pre>
   *
   * <code>string required_revision_id = 1;</code>
   * @return Whether the requiredRevisionId field is set.
   */
  public boolean hasRequiredRevisionId() {
    return controlCase_ == 1;
  }
  /**
   * <pre>
   * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
   * label that the write request will be applied to. If this is not the
   * latest revision of the label, the request will not be processed and will
   * return a 400 Bad Request error.
   * </pre>
   *
   * <code>string required_revision_id = 1;</code>
   * @return The requiredRevisionId.
   */
  public java.lang.String getRequiredRevisionId() {
    java.lang.Object ref = "";
    if (controlCase_ == 1) {
      ref = control_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (controlCase_ == 1) {
        control_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
   * label that the write request will be applied to. If this is not the
   * latest revision of the label, the request will not be processed and will
   * return a 400 Bad Request error.
   * </pre>
   *
   * <code>string required_revision_id = 1;</code>
   * @return The bytes for requiredRevisionId.
   */
  public com.google.protobuf.ByteString
      getRequiredRevisionIdBytes() {
    java.lang.Object ref = "";
    if (controlCase_ == 1) {
      ref = control_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (controlCase_ == 1) {
        control_ = b;
      }
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
    if (controlCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, control_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controlCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, control_);
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
    if (!(obj instanceof com.google.apps.drive.labels.v2beta.WriteControl)) {
      return super.equals(obj);
    }
    com.google.apps.drive.labels.v2beta.WriteControl other = (com.google.apps.drive.labels.v2beta.WriteControl) obj;

    if (!getControlCase().equals(other.getControlCase())) return false;
    switch (controlCase_) {
      case 1:
        if (!getRequiredRevisionId()
            .equals(other.getRequiredRevisionId())) return false;
        break;
      case 0:
      default:
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
    switch (controlCase_) {
      case 1:
        hash = (37 * hash) + REQUIRED_REVISION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRequiredRevisionId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.labels.v2beta.WriteControl parseFrom(
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
  public static Builder newBuilder(com.google.apps.drive.labels.v2beta.WriteControl prototype) {
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
   * Provides control over how write requests are executed. When not specified,
   * the last write wins.
   * </pre>
   *
   * Protobuf type {@code google.apps.drive.labels.v2beta.WriteControl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.drive.labels.v2beta.WriteControl)
      com.google.apps.drive.labels.v2beta.WriteControlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.drive.labels.v2beta.RequestsProto.internal_static_google_apps_drive_labels_v2beta_WriteControl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.drive.labels.v2beta.RequestsProto.internal_static_google_apps_drive_labels_v2beta_WriteControl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.drive.labels.v2beta.WriteControl.class, com.google.apps.drive.labels.v2beta.WriteControl.Builder.class);
    }

    // Construct using com.google.apps.drive.labels.v2beta.WriteControl.newBuilder()
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
      controlCase_ = 0;
      control_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.drive.labels.v2beta.RequestsProto.internal_static_google_apps_drive_labels_v2beta_WriteControl_descriptor;
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.WriteControl getDefaultInstanceForType() {
      return com.google.apps.drive.labels.v2beta.WriteControl.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.WriteControl build() {
      com.google.apps.drive.labels.v2beta.WriteControl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.drive.labels.v2beta.WriteControl buildPartial() {
      com.google.apps.drive.labels.v2beta.WriteControl result = new com.google.apps.drive.labels.v2beta.WriteControl(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.drive.labels.v2beta.WriteControl result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.apps.drive.labels.v2beta.WriteControl result) {
      result.controlCase_ = controlCase_;
      result.control_ = this.control_;
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
      if (other instanceof com.google.apps.drive.labels.v2beta.WriteControl) {
        return mergeFrom((com.google.apps.drive.labels.v2beta.WriteControl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.drive.labels.v2beta.WriteControl other) {
      if (other == com.google.apps.drive.labels.v2beta.WriteControl.getDefaultInstance()) return this;
      switch (other.getControlCase()) {
        case REQUIRED_REVISION_ID: {
          controlCase_ = 1;
          control_ = other.control_;
          onChanged();
          break;
        }
        case CONTROL_NOT_SET: {
          break;
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              controlCase_ = 1;
              control_ = s;
              break;
            } // case 10
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
    private int controlCase_ = 0;
    private java.lang.Object control_;
    public ControlCase
        getControlCase() {
      return ControlCase.forNumber(
          controlCase_);
    }

    public Builder clearControl() {
      controlCase_ = 0;
      control_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
     * label that the write request will be applied to. If this is not the
     * latest revision of the label, the request will not be processed and will
     * return a 400 Bad Request error.
     * </pre>
     *
     * <code>string required_revision_id = 1;</code>
     * @return Whether the requiredRevisionId field is set.
     */
    @java.lang.Override
    public boolean hasRequiredRevisionId() {
      return controlCase_ == 1;
    }
    /**
     * <pre>
     * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
     * label that the write request will be applied to. If this is not the
     * latest revision of the label, the request will not be processed and will
     * return a 400 Bad Request error.
     * </pre>
     *
     * <code>string required_revision_id = 1;</code>
     * @return The requiredRevisionId.
     */
    @java.lang.Override
    public java.lang.String getRequiredRevisionId() {
      java.lang.Object ref = "";
      if (controlCase_ == 1) {
        ref = control_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (controlCase_ == 1) {
          control_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
     * label that the write request will be applied to. If this is not the
     * latest revision of the label, the request will not be processed and will
     * return a 400 Bad Request error.
     * </pre>
     *
     * <code>string required_revision_id = 1;</code>
     * @return The bytes for requiredRevisionId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRequiredRevisionIdBytes() {
      java.lang.Object ref = "";
      if (controlCase_ == 1) {
        ref = control_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (controlCase_ == 1) {
          control_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
     * label that the write request will be applied to. If this is not the
     * latest revision of the label, the request will not be processed and will
     * return a 400 Bad Request error.
     * </pre>
     *
     * <code>string required_revision_id = 1;</code>
     * @param value The requiredRevisionId to set.
     * @return This builder for chaining.
     */
    public Builder setRequiredRevisionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      controlCase_ = 1;
      control_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
     * label that the write request will be applied to. If this is not the
     * latest revision of the label, the request will not be processed and will
     * return a 400 Bad Request error.
     * </pre>
     *
     * <code>string required_revision_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequiredRevisionId() {
      if (controlCase_ == 1) {
        controlCase_ = 0;
        control_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The [revision_id][google.apps.drive.labels.v1.Label.revision_id] of the
     * label that the write request will be applied to. If this is not the
     * latest revision of the label, the request will not be processed and will
     * return a 400 Bad Request error.
     * </pre>
     *
     * <code>string required_revision_id = 1;</code>
     * @param value The bytes for requiredRevisionId to set.
     * @return This builder for chaining.
     */
    public Builder setRequiredRevisionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      controlCase_ = 1;
      control_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.apps.drive.labels.v2beta.WriteControl)
  }

  // @@protoc_insertion_point(class_scope:google.apps.drive.labels.v2beta.WriteControl)
  private static final com.google.apps.drive.labels.v2beta.WriteControl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.drive.labels.v2beta.WriteControl();
  }

  public static com.google.apps.drive.labels.v2beta.WriteControl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteControl>
      PARSER = new com.google.protobuf.AbstractParser<WriteControl>() {
    @java.lang.Override
    public WriteControl parsePartialFrom(
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

  public static com.google.protobuf.Parser<WriteControl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteControl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.drive.labels.v2beta.WriteControl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
