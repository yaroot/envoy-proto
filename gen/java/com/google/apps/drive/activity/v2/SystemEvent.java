// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/activity/v2/actor.proto

package com.google.apps.drive.activity.v2;

/**
 * <pre>
 * Event triggered by system operations instead of end users.
 * </pre>
 *
 * Protobuf type {@code google.apps.drive.activity.v2.SystemEvent}
 */
public final class SystemEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.drive.activity.v2.SystemEvent)
    SystemEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SystemEvent.newBuilder() to construct.
  private SystemEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SystemEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SystemEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.drive.activity.v2.ActorProto.internal_static_google_apps_drive_activity_v2_SystemEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.drive.activity.v2.ActorProto.internal_static_google_apps_drive_activity_v2_SystemEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.drive.activity.v2.SystemEvent.class, com.google.apps.drive.activity.v2.SystemEvent.Builder.class);
  }

  /**
   * <pre>
   * The types of system events that may trigger activity.
   * </pre>
   *
   * Protobuf enum {@code google.apps.drive.activity.v2.SystemEvent.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The event type is unspecified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * The event is a consequence of a user account being deleted.
     * </pre>
     *
     * <code>USER_DELETION = 1;</code>
     */
    USER_DELETION(1),
    /**
     * <pre>
     * The event is due to the system automatically purging trash.
     * </pre>
     *
     * <code>TRASH_AUTO_PURGE = 2;</code>
     */
    TRASH_AUTO_PURGE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The event type is unspecified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The event is a consequence of a user account being deleted.
     * </pre>
     *
     * <code>USER_DELETION = 1;</code>
     */
    public static final int USER_DELETION_VALUE = 1;
    /**
     * <pre>
     * The event is due to the system automatically purging trash.
     * </pre>
     *
     * <code>TRASH_AUTO_PURGE = 2;</code>
     */
    public static final int TRASH_AUTO_PURGE_VALUE = 2;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return TYPE_UNSPECIFIED;
        case 1: return USER_DELETION;
        case 2: return TRASH_AUTO_PURGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return com.google.apps.drive.activity.v2.SystemEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.apps.drive.activity.v2.SystemEvent.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * The type of the system event that may triggered activity.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of the system event that may triggered activity.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.apps.drive.activity.v2.SystemEvent.Type getType() {
    com.google.apps.drive.activity.v2.SystemEvent.Type result = com.google.apps.drive.activity.v2.SystemEvent.Type.forNumber(type_);
    return result == null ? com.google.apps.drive.activity.v2.SystemEvent.Type.UNRECOGNIZED : result;
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
    if (type_ != com.google.apps.drive.activity.v2.SystemEvent.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.apps.drive.activity.v2.SystemEvent.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
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
    if (!(obj instanceof com.google.apps.drive.activity.v2.SystemEvent)) {
      return super.equals(obj);
    }
    com.google.apps.drive.activity.v2.SystemEvent other = (com.google.apps.drive.activity.v2.SystemEvent) obj;

    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.drive.activity.v2.SystemEvent parseFrom(
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
  public static Builder newBuilder(com.google.apps.drive.activity.v2.SystemEvent prototype) {
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
   * Event triggered by system operations instead of end users.
   * </pre>
   *
   * Protobuf type {@code google.apps.drive.activity.v2.SystemEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.drive.activity.v2.SystemEvent)
      com.google.apps.drive.activity.v2.SystemEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.drive.activity.v2.ActorProto.internal_static_google_apps_drive_activity_v2_SystemEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.drive.activity.v2.ActorProto.internal_static_google_apps_drive_activity_v2_SystemEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.drive.activity.v2.SystemEvent.class, com.google.apps.drive.activity.v2.SystemEvent.Builder.class);
    }

    // Construct using com.google.apps.drive.activity.v2.SystemEvent.newBuilder()
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
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.drive.activity.v2.ActorProto.internal_static_google_apps_drive_activity_v2_SystemEvent_descriptor;
    }

    @java.lang.Override
    public com.google.apps.drive.activity.v2.SystemEvent getDefaultInstanceForType() {
      return com.google.apps.drive.activity.v2.SystemEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.drive.activity.v2.SystemEvent build() {
      com.google.apps.drive.activity.v2.SystemEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.drive.activity.v2.SystemEvent buildPartial() {
      com.google.apps.drive.activity.v2.SystemEvent result = new com.google.apps.drive.activity.v2.SystemEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.drive.activity.v2.SystemEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
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
      if (other instanceof com.google.apps.drive.activity.v2.SystemEvent) {
        return mergeFrom((com.google.apps.drive.activity.v2.SystemEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.drive.activity.v2.SystemEvent other) {
      if (other == com.google.apps.drive.activity.v2.SystemEvent.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int type_ = 0;
    /**
     * <pre>
     * The type of the system event that may triggered activity.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of the system event that may triggered activity.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the system event that may triggered activity.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.apps.drive.activity.v2.SystemEvent.Type getType() {
      com.google.apps.drive.activity.v2.SystemEvent.Type result = com.google.apps.drive.activity.v2.SystemEvent.Type.forNumber(type_);
      return result == null ? com.google.apps.drive.activity.v2.SystemEvent.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the system event that may triggered activity.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.apps.drive.activity.v2.SystemEvent.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the system event that may triggered activity.
     * </pre>
     *
     * <code>.google.apps.drive.activity.v2.SystemEvent.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.apps.drive.activity.v2.SystemEvent)
  }

  // @@protoc_insertion_point(class_scope:google.apps.drive.activity.v2.SystemEvent)
  private static final com.google.apps.drive.activity.v2.SystemEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.drive.activity.v2.SystemEvent();
  }

  public static com.google.apps.drive.activity.v2.SystemEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SystemEvent>
      PARSER = new com.google.protobuf.AbstractParser<SystemEvent>() {
    @java.lang.Override
    public SystemEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SystemEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SystemEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.drive.activity.v2.SystemEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

