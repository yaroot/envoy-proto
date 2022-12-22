// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/asset_set_error.proto

package com.google.ads.googleads.v12.errors;

/**
 * <pre>
 * Container for enum describing possible asset set errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.errors.AssetSetErrorEnum}
 */
public final class AssetSetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.errors.AssetSetErrorEnum)
    AssetSetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetSetErrorEnum.newBuilder() to construct.
  private AssetSetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetSetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetSetErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.errors.AssetSetErrorProto.internal_static_google_ads_googleads_v12_errors_AssetSetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.errors.AssetSetErrorProto.internal_static_google_ads_googleads_v12_errors_AssetSetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.errors.AssetSetErrorEnum.class, com.google.ads.googleads.v12.errors.AssetSetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset set errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.errors.AssetSetErrorEnum.AssetSetError}
   */
  public enum AssetSetError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The asset set name matches that of another enabled asset set.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_SET_NAME = 2;</code>
     */
    DUPLICATE_ASSET_SET_NAME(2),
    /**
     * <pre>
     * The type of AssetSet.asset_set_source does not match the type of
     * AssetSet.location_set.source in its parent AssetSet.
     * </pre>
     *
     * <code>INVALID_PARENT_ASSET_SET_TYPE = 3;</code>
     */
    INVALID_PARENT_ASSET_SET_TYPE(3),
    /**
     * <pre>
     * The asset set source doesn't match its parent AssetSet's data.
     * </pre>
     *
     * <code>ASSET_SET_SOURCE_INCOMPATIBLE_WITH_PARENT_ASSET_SET = 4;</code>
     */
    ASSET_SET_SOURCE_INCOMPATIBLE_WITH_PARENT_ASSET_SET(4),
    /**
     * <pre>
     * This AssetSet type cannot be linked to CustomerAssetSet.
     * </pre>
     *
     * <code>ASSET_SET_TYPE_CANNOT_BE_LINKED_TO_CUSTOMER = 5;</code>
     */
    ASSET_SET_TYPE_CANNOT_BE_LINKED_TO_CUSTOMER(5),
    /**
     * <pre>
     * The chain id(s) in ChainSet of a LOCATION_SYNC typed AssetSet is invalid.
     * </pre>
     *
     * <code>INVALID_CHAIN_IDS = 6;</code>
     */
    INVALID_CHAIN_IDS(6),
    /**
     * <pre>
     * The relationship type in ChainSet of a LOCATION_SYNC typed AssetSet is
     * not supported.
     * </pre>
     *
     * <code>LOCATION_SYNC_ASSET_SET_DOES_NOT_SUPPORT_RELATIONSHIP_TYPE = 7;</code>
     */
    LOCATION_SYNC_ASSET_SET_DOES_NOT_SUPPORT_RELATIONSHIP_TYPE(7),
    /**
     * <pre>
     * There is more than one enabled LocationSync typed AssetSet under one
     * customer.
     * </pre>
     *
     * <code>NOT_UNIQUE_ENABLED_LOCATION_SYNC_TYPED_ASSET_SET = 8;</code>
     */
    NOT_UNIQUE_ENABLED_LOCATION_SYNC_TYPED_ASSET_SET(8),
    /**
     * <pre>
     * The place id(s) in a LocationSync typed AssetSet is invalid and can't be
     * decoded.
     * </pre>
     *
     * <code>INVALID_PLACE_IDS = 9;</code>
     */
    INVALID_PLACE_IDS(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The asset set name matches that of another enabled asset set.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_SET_NAME = 2;</code>
     */
    public static final int DUPLICATE_ASSET_SET_NAME_VALUE = 2;
    /**
     * <pre>
     * The type of AssetSet.asset_set_source does not match the type of
     * AssetSet.location_set.source in its parent AssetSet.
     * </pre>
     *
     * <code>INVALID_PARENT_ASSET_SET_TYPE = 3;</code>
     */
    public static final int INVALID_PARENT_ASSET_SET_TYPE_VALUE = 3;
    /**
     * <pre>
     * The asset set source doesn't match its parent AssetSet's data.
     * </pre>
     *
     * <code>ASSET_SET_SOURCE_INCOMPATIBLE_WITH_PARENT_ASSET_SET = 4;</code>
     */
    public static final int ASSET_SET_SOURCE_INCOMPATIBLE_WITH_PARENT_ASSET_SET_VALUE = 4;
    /**
     * <pre>
     * This AssetSet type cannot be linked to CustomerAssetSet.
     * </pre>
     *
     * <code>ASSET_SET_TYPE_CANNOT_BE_LINKED_TO_CUSTOMER = 5;</code>
     */
    public static final int ASSET_SET_TYPE_CANNOT_BE_LINKED_TO_CUSTOMER_VALUE = 5;
    /**
     * <pre>
     * The chain id(s) in ChainSet of a LOCATION_SYNC typed AssetSet is invalid.
     * </pre>
     *
     * <code>INVALID_CHAIN_IDS = 6;</code>
     */
    public static final int INVALID_CHAIN_IDS_VALUE = 6;
    /**
     * <pre>
     * The relationship type in ChainSet of a LOCATION_SYNC typed AssetSet is
     * not supported.
     * </pre>
     *
     * <code>LOCATION_SYNC_ASSET_SET_DOES_NOT_SUPPORT_RELATIONSHIP_TYPE = 7;</code>
     */
    public static final int LOCATION_SYNC_ASSET_SET_DOES_NOT_SUPPORT_RELATIONSHIP_TYPE_VALUE = 7;
    /**
     * <pre>
     * There is more than one enabled LocationSync typed AssetSet under one
     * customer.
     * </pre>
     *
     * <code>NOT_UNIQUE_ENABLED_LOCATION_SYNC_TYPED_ASSET_SET = 8;</code>
     */
    public static final int NOT_UNIQUE_ENABLED_LOCATION_SYNC_TYPED_ASSET_SET_VALUE = 8;
    /**
     * <pre>
     * The place id(s) in a LocationSync typed AssetSet is invalid and can't be
     * decoded.
     * </pre>
     *
     * <code>INVALID_PLACE_IDS = 9;</code>
     */
    public static final int INVALID_PLACE_IDS_VALUE = 9;


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
    public static AssetSetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetSetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_ASSET_SET_NAME;
        case 3: return INVALID_PARENT_ASSET_SET_TYPE;
        case 4: return ASSET_SET_SOURCE_INCOMPATIBLE_WITH_PARENT_ASSET_SET;
        case 5: return ASSET_SET_TYPE_CANNOT_BE_LINKED_TO_CUSTOMER;
        case 6: return INVALID_CHAIN_IDS;
        case 7: return LOCATION_SYNC_ASSET_SET_DOES_NOT_SUPPORT_RELATIONSHIP_TYPE;
        case 8: return NOT_UNIQUE_ENABLED_LOCATION_SYNC_TYPED_ASSET_SET;
        case 9: return INVALID_PLACE_IDS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetSetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetSetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetSetError>() {
            public AssetSetError findValueByNumber(int number) {
              return AssetSetError.forNumber(number);
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
      return com.google.ads.googleads.v12.errors.AssetSetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetSetError[] VALUES = values();

    public static AssetSetError valueOf(
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

    private AssetSetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.errors.AssetSetErrorEnum.AssetSetError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.errors.AssetSetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.errors.AssetSetErrorEnum other = (com.google.ads.googleads.v12.errors.AssetSetErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.errors.AssetSetErrorEnum prototype) {
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
   * Container for enum describing possible asset set errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.errors.AssetSetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.errors.AssetSetErrorEnum)
      com.google.ads.googleads.v12.errors.AssetSetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.AssetSetErrorProto.internal_static_google_ads_googleads_v12_errors_AssetSetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.errors.AssetSetErrorProto.internal_static_google_ads_googleads_v12_errors_AssetSetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.errors.AssetSetErrorEnum.class, com.google.ads.googleads.v12.errors.AssetSetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.errors.AssetSetErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.errors.AssetSetErrorProto.internal_static_google_ads_googleads_v12_errors_AssetSetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.AssetSetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.errors.AssetSetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.AssetSetErrorEnum build() {
      com.google.ads.googleads.v12.errors.AssetSetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.AssetSetErrorEnum buildPartial() {
      com.google.ads.googleads.v12.errors.AssetSetErrorEnum result = new com.google.ads.googleads.v12.errors.AssetSetErrorEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v12.errors.AssetSetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.errors.AssetSetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.errors.AssetSetErrorEnum other) {
      if (other == com.google.ads.googleads.v12.errors.AssetSetErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.errors.AssetSetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.errors.AssetSetErrorEnum)
  private static final com.google.ads.googleads.v12.errors.AssetSetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.errors.AssetSetErrorEnum();
  }

  public static com.google.ads.googleads.v12.errors.AssetSetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetSetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetSetErrorEnum>() {
    @java.lang.Override
    public AssetSetErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetSetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetSetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.errors.AssetSetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
