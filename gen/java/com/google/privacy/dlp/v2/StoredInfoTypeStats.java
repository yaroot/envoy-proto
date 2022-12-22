// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Statistics for a StoredInfoType.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.StoredInfoTypeStats}
 */
public final class StoredInfoTypeStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.StoredInfoTypeStats)
    StoredInfoTypeStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoredInfoTypeStats.newBuilder() to construct.
  private StoredInfoTypeStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoredInfoTypeStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StoredInfoTypeStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.StoredInfoTypeStats.class, com.google.privacy.dlp.v2.StoredInfoTypeStats.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LARGE_CUSTOM_DICTIONARY(1),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return LARGE_CUSTOM_DICTIONARY;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int LARGE_CUSTOM_DICTIONARY_FIELD_NUMBER = 1;
  /**
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
   * @return Whether the largeCustomDictionary field is set.
   */
  @java.lang.Override
  public boolean hasLargeCustomDictionary() {
    return typeCase_ == 1;
  }
  /**
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
   * @return The largeCustomDictionary.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.LargeCustomDictionaryStats getLargeCustomDictionary() {
    if (typeCase_ == 1) {
       return (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_;
    }
    return com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance();
  }
  /**
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.LargeCustomDictionaryStatsOrBuilder getLargeCustomDictionaryOrBuilder() {
    if (typeCase_ == 1) {
       return (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_;
    }
    return com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.StoredInfoTypeStats)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.StoredInfoTypeStats other = (com.google.privacy.dlp.v2.StoredInfoTypeStats) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getLargeCustomDictionary()
            .equals(other.getLargeCustomDictionary())) return false;
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + LARGE_CUSTOM_DICTIONARY_FIELD_NUMBER;
        hash = (53 * hash) + getLargeCustomDictionary().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeStats parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.StoredInfoTypeStats prototype) {
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
   * Statistics for a StoredInfoType.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.StoredInfoTypeStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.StoredInfoTypeStats)
      com.google.privacy.dlp.v2.StoredInfoTypeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.StoredInfoTypeStats.class, com.google.privacy.dlp.v2.StoredInfoTypeStats.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.StoredInfoTypeStats.newBuilder()
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
      if (largeCustomDictionaryBuilder_ != null) {
        largeCustomDictionaryBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeStats_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.StoredInfoTypeStats getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.StoredInfoTypeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.StoredInfoTypeStats build() {
      com.google.privacy.dlp.v2.StoredInfoTypeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.StoredInfoTypeStats buildPartial() {
      com.google.privacy.dlp.v2.StoredInfoTypeStats result = new com.google.privacy.dlp.v2.StoredInfoTypeStats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.StoredInfoTypeStats result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.StoredInfoTypeStats result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 1 &&
          largeCustomDictionaryBuilder_ != null) {
        result.type_ = largeCustomDictionaryBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.StoredInfoTypeStats) {
        return mergeFrom((com.google.privacy.dlp.v2.StoredInfoTypeStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.StoredInfoTypeStats other) {
      if (other == com.google.privacy.dlp.v2.StoredInfoTypeStats.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case LARGE_CUSTOM_DICTIONARY: {
          mergeLargeCustomDictionary(other.getLargeCustomDictionary());
          break;
        }
        case TYPE_NOT_SET: {
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
              input.readMessage(
                  getLargeCustomDictionaryFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 1;
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.LargeCustomDictionaryStats, com.google.privacy.dlp.v2.LargeCustomDictionaryStats.Builder, com.google.privacy.dlp.v2.LargeCustomDictionaryStatsOrBuilder> largeCustomDictionaryBuilder_;
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     * @return Whether the largeCustomDictionary field is set.
     */
    @java.lang.Override
    public boolean hasLargeCustomDictionary() {
      return typeCase_ == 1;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     * @return The largeCustomDictionary.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.LargeCustomDictionaryStats getLargeCustomDictionary() {
      if (largeCustomDictionaryBuilder_ == null) {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_;
        }
        return com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return largeCustomDictionaryBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    public Builder setLargeCustomDictionary(com.google.privacy.dlp.v2.LargeCustomDictionaryStats value) {
      if (largeCustomDictionaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        largeCustomDictionaryBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    public Builder setLargeCustomDictionary(
        com.google.privacy.dlp.v2.LargeCustomDictionaryStats.Builder builderForValue) {
      if (largeCustomDictionaryBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        largeCustomDictionaryBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    public Builder mergeLargeCustomDictionary(com.google.privacy.dlp.v2.LargeCustomDictionaryStats value) {
      if (largeCustomDictionaryBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance()) {
          type_ = com.google.privacy.dlp.v2.LargeCustomDictionaryStats.newBuilder((com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          largeCustomDictionaryBuilder_.mergeFrom(value);
        } else {
          largeCustomDictionaryBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    public Builder clearLargeCustomDictionary() {
      if (largeCustomDictionaryBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        largeCustomDictionaryBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    public com.google.privacy.dlp.v2.LargeCustomDictionaryStats.Builder getLargeCustomDictionaryBuilder() {
      return getLargeCustomDictionaryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.LargeCustomDictionaryStatsOrBuilder getLargeCustomDictionaryOrBuilder() {
      if ((typeCase_ == 1) && (largeCustomDictionaryBuilder_ != null)) {
        return largeCustomDictionaryBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_;
        }
        return com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.LargeCustomDictionaryStats, com.google.privacy.dlp.v2.LargeCustomDictionaryStats.Builder, com.google.privacy.dlp.v2.LargeCustomDictionaryStatsOrBuilder> 
        getLargeCustomDictionaryFieldBuilder() {
      if (largeCustomDictionaryBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = com.google.privacy.dlp.v2.LargeCustomDictionaryStats.getDefaultInstance();
        }
        largeCustomDictionaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.LargeCustomDictionaryStats, com.google.privacy.dlp.v2.LargeCustomDictionaryStats.Builder, com.google.privacy.dlp.v2.LargeCustomDictionaryStatsOrBuilder>(
                (com.google.privacy.dlp.v2.LargeCustomDictionaryStats) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();
      return largeCustomDictionaryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.StoredInfoTypeStats)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.StoredInfoTypeStats)
  private static final com.google.privacy.dlp.v2.StoredInfoTypeStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.StoredInfoTypeStats();
  }

  public static com.google.privacy.dlp.v2.StoredInfoTypeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoredInfoTypeStats>
      PARSER = new com.google.protobuf.AbstractParser<StoredInfoTypeStats>() {
    @java.lang.Override
    public StoredInfoTypeStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<StoredInfoTypeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoredInfoTypeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.StoredInfoTypeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

