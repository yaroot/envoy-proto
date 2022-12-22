// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_import_lite.proto

package com.google.protobuf;

public final class UnittestImportLite {
  private UnittestImportLite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code protobuf_unittest_import.ImportEnumLite}
   */
  public enum ImportEnumLite
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IMPORT_LITE_FOO = 7;</code>
     */
    IMPORT_LITE_FOO(7),
    /**
     * <code>IMPORT_LITE_BAR = 8;</code>
     */
    IMPORT_LITE_BAR(8),
    /**
     * <code>IMPORT_LITE_BAZ = 9;</code>
     */
    IMPORT_LITE_BAZ(9),
    ;

    /**
     * <code>IMPORT_LITE_FOO = 7;</code>
     */
    public static final int IMPORT_LITE_FOO_VALUE = 7;
    /**
     * <code>IMPORT_LITE_BAR = 8;</code>
     */
    public static final int IMPORT_LITE_BAR_VALUE = 8;
    /**
     * <code>IMPORT_LITE_BAZ = 9;</code>
     */
    public static final int IMPORT_LITE_BAZ_VALUE = 9;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ImportEnumLite valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ImportEnumLite forNumber(int value) {
      switch (value) {
        case 7: return IMPORT_LITE_FOO;
        case 8: return IMPORT_LITE_BAR;
        case 9: return IMPORT_LITE_BAZ;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ImportEnumLite>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ImportEnumLite> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImportEnumLite>() {
            public ImportEnumLite findValueByNumber(int number) {
              return ImportEnumLite.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.protobuf.UnittestImportLite.getDescriptor().getEnumTypes().get(0);
    }

    private static final ImportEnumLite[] VALUES = values();

    public static ImportEnumLite valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ImportEnumLite(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protobuf_unittest_import.ImportEnumLite)
  }

  public interface ImportMessageLiteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest_import.ImportMessageLite)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 d = 1;</code>
     * @return Whether the d field is set.
     */
    boolean hasD();
    /**
     * <code>optional int32 d = 1;</code>
     * @return The d.
     */
    int getD();
  }
  /**
   * Protobuf type {@code protobuf_unittest_import.ImportMessageLite}
   */
  public static final class ImportMessageLite extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest_import.ImportMessageLite)
      ImportMessageLiteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ImportMessageLite.newBuilder() to construct.
    private ImportMessageLite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImportMessageLite() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ImportMessageLite();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.UnittestImportLite.internal_static_protobuf_unittest_import_ImportMessageLite_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.UnittestImportLite.internal_static_protobuf_unittest_import_ImportMessageLite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.UnittestImportLite.ImportMessageLite.class, com.google.protobuf.UnittestImportLite.ImportMessageLite.Builder.class);
    }

    private int bitField0_;
    public static final int D_FIELD_NUMBER = 1;
    private int d_ = 0;
    /**
     * <code>optional int32 d = 1;</code>
     * @return Whether the d field is set.
     */
    @java.lang.Override
    public boolean hasD() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 d = 1;</code>
     * @return The d.
     */
    @java.lang.Override
    public int getD() {
      return d_;
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
        output.writeInt32(1, d_);
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
          .computeInt32Size(1, d_);
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
      if (!(obj instanceof com.google.protobuf.UnittestImportLite.ImportMessageLite)) {
        return super.equals(obj);
      }
      com.google.protobuf.UnittestImportLite.ImportMessageLite other = (com.google.protobuf.UnittestImportLite.ImportMessageLite) obj;

      if (hasD() != other.hasD()) return false;
      if (hasD()) {
        if (getD()
            != other.getD()) return false;
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
      if (hasD()) {
        hash = (37 * hash) + D_FIELD_NUMBER;
        hash = (53 * hash) + getD();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.protobuf.UnittestImportLite.ImportMessageLite parseFrom(
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
    public static Builder newBuilder(com.google.protobuf.UnittestImportLite.ImportMessageLite prototype) {
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
     * Protobuf type {@code protobuf_unittest_import.ImportMessageLite}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest_import.ImportMessageLite)
        com.google.protobuf.UnittestImportLite.ImportMessageLiteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.protobuf.UnittestImportLite.internal_static_protobuf_unittest_import_ImportMessageLite_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.protobuf.UnittestImportLite.internal_static_protobuf_unittest_import_ImportMessageLite_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.protobuf.UnittestImportLite.ImportMessageLite.class, com.google.protobuf.UnittestImportLite.ImportMessageLite.Builder.class);
      }

      // Construct using com.google.protobuf.UnittestImportLite.ImportMessageLite.newBuilder()
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
        d_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.protobuf.UnittestImportLite.internal_static_protobuf_unittest_import_ImportMessageLite_descriptor;
      }

      @java.lang.Override
      public com.google.protobuf.UnittestImportLite.ImportMessageLite getDefaultInstanceForType() {
        return com.google.protobuf.UnittestImportLite.ImportMessageLite.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.protobuf.UnittestImportLite.ImportMessageLite build() {
        com.google.protobuf.UnittestImportLite.ImportMessageLite result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.protobuf.UnittestImportLite.ImportMessageLite buildPartial() {
        com.google.protobuf.UnittestImportLite.ImportMessageLite result = new com.google.protobuf.UnittestImportLite.ImportMessageLite(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.google.protobuf.UnittestImportLite.ImportMessageLite result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.d_ = d_;
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof com.google.protobuf.UnittestImportLite.ImportMessageLite) {
          return mergeFrom((com.google.protobuf.UnittestImportLite.ImportMessageLite)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.protobuf.UnittestImportLite.ImportMessageLite other) {
        if (other == com.google.protobuf.UnittestImportLite.ImportMessageLite.getDefaultInstance()) return this;
        if (other.hasD()) {
          setD(other.getD());
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
                d_ = input.readInt32();
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

      private int d_ ;
      /**
       * <code>optional int32 d = 1;</code>
       * @return Whether the d field is set.
       */
      @java.lang.Override
      public boolean hasD() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 d = 1;</code>
       * @return The d.
       */
      @java.lang.Override
      public int getD() {
        return d_;
      }
      /**
       * <code>optional int32 d = 1;</code>
       * @param value The d to set.
       * @return This builder for chaining.
       */
      public Builder setD(int value) {
        
        d_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 d = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearD() {
        bitField0_ = (bitField0_ & ~0x00000001);
        d_ = 0;
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


      // @@protoc_insertion_point(builder_scope:protobuf_unittest_import.ImportMessageLite)
    }

    // @@protoc_insertion_point(class_scope:protobuf_unittest_import.ImportMessageLite)
    private static final com.google.protobuf.UnittestImportLite.ImportMessageLite DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.protobuf.UnittestImportLite.ImportMessageLite();
    }

    public static com.google.protobuf.UnittestImportLite.ImportMessageLite getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ImportMessageLite>
        PARSER = new com.google.protobuf.AbstractParser<ImportMessageLite>() {
      @java.lang.Override
      public ImportMessageLite parsePartialFrom(
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

    public static com.google.protobuf.Parser<ImportMessageLite> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImportMessageLite> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.UnittestImportLite.ImportMessageLite getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_import_ImportMessageLite_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_import_ImportMessageLite_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/protobuf/unittest_import_lite.p" +
      "roto\022\030protobuf_unittest_import\0321google/p" +
      "rotobuf/unittest_import_public_lite.prot" +
      "o\"\036\n\021ImportMessageLite\022\t\n\001d\030\001 \001(\005*O\n\016Imp" +
      "ortEnumLite\022\023\n\017IMPORT_LITE_FOO\020\007\022\023\n\017IMPO" +
      "RT_LITE_BAR\020\010\022\023\n\017IMPORT_LITE_BAZ\020\tB\027\n\023co" +
      "m.google.protobufH\003P\000"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.UnittestImportPublicLite.getDescriptor(),
        });
    internal_static_protobuf_unittest_import_ImportMessageLite_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_unittest_import_ImportMessageLite_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_import_ImportMessageLite_descriptor,
        new java.lang.String[] { "D", });
    com.google.protobuf.UnittestImportPublicLite.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
