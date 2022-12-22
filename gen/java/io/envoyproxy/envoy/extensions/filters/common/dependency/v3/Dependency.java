// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/common/dependency/v3/dependency.proto

package io.envoyproxy.envoy.extensions.filters.common.dependency.v3;

/**
 * <pre>
 * Dependency specification and string identifier.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.common.dependency.v3.Dependency}
 */
public final class Dependency extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.common.dependency.v3.Dependency)
    DependencyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Dependency.newBuilder() to construct.
  private Dependency(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Dependency() {
    type_ = 0;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Dependency();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.DependencyProto.internal_static_envoy_extensions_filters_common_dependency_v3_Dependency_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.DependencyProto.internal_static_envoy_extensions_filters_common_dependency_v3_Dependency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.class, io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.Builder.class);
  }

  /**
   * Protobuf enum {@code envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType}
   */
  public enum DependencyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HEADER = 0;</code>
     */
    HEADER(0),
    /**
     * <code>FILTER_STATE_KEY = 1;</code>
     */
    FILTER_STATE_KEY(1),
    /**
     * <code>DYNAMIC_METADATA = 2;</code>
     */
    DYNAMIC_METADATA(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HEADER = 0;</code>
     */
    public static final int HEADER_VALUE = 0;
    /**
     * <code>FILTER_STATE_KEY = 1;</code>
     */
    public static final int FILTER_STATE_KEY_VALUE = 1;
    /**
     * <code>DYNAMIC_METADATA = 2;</code>
     */
    public static final int DYNAMIC_METADATA_VALUE = 2;


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
    public static DependencyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DependencyType forNumber(int value) {
      switch (value) {
        case 0: return HEADER;
        case 1: return FILTER_STATE_KEY;
        case 2: return DYNAMIC_METADATA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DependencyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DependencyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DependencyType>() {
            public DependencyType findValueByNumber(int number) {
              return DependencyType.forNumber(number);
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
      return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.getDescriptor().getEnumTypes().get(0);
    }

    private static final DependencyType[] VALUES = values();

    public static DependencyType valueOf(
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

    private DependencyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * The kind of dependency.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The kind of dependency.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType getType() {
    io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType result = io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType.forNumber(type_);
    return result == null ? io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The string identifier for the dependency.
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The string identifier for the dependency.
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
    if (type_ != io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType.HEADER.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType.HEADER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency other = (io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency) obj;

    if (type_ != other.type_) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency prototype) {
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
   * Dependency specification and string identifier.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.common.dependency.v3.Dependency}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.common.dependency.v3.Dependency)
      io.envoyproxy.envoy.extensions.filters.common.dependency.v3.DependencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.DependencyProto.internal_static_envoy_extensions_filters_common_dependency_v3_Dependency_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.DependencyProto.internal_static_envoy_extensions_filters_common_dependency_v3_Dependency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.class, io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.newBuilder()
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
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.DependencyProto.internal_static_envoy_extensions_filters_common_dependency_v3_Dependency_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency build() {
      io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency buildPartial() {
      io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency result = new io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency other) {
      if (other == io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
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

    private int type_ = 0;
    /**
     * <pre>
     * The kind of dependency.
     * </pre>
     *
     * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The kind of dependency.
     * </pre>
     *
     * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
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
     * The kind of dependency.
     * </pre>
     *
     * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType getType() {
      io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType result = io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType.forNumber(type_);
      return result == null ? io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The kind of dependency.
     * </pre>
     *
     * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType value) {
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
     * The kind of dependency.
     * </pre>
     *
     * <code>.envoy.extensions.filters.common.dependency.v3.Dependency.DependencyType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The string identifier for the dependency.
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The string identifier for the dependency.
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The string identifier for the dependency.
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The string identifier for the dependency.
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The string identifier for the dependency.
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.common.dependency.v3.Dependency)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.common.dependency.v3.Dependency)
  private static final io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency();
  }

  public static io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dependency>
      PARSER = new com.google.protobuf.AbstractParser<Dependency>() {
    @java.lang.Override
    public Dependency parsePartialFrom(
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

  public static com.google.protobuf.Parser<Dependency> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dependency> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.common.dependency.v3.Dependency getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
