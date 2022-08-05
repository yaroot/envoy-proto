// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_lazy_dependencies_custom_option.proto

package protobuf_unittest.lazy_imports;

public final class UnittestLazyImportsCustomOptionProto {
  private UnittestLazyImportsCustomOptionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.lazyEnumOption);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LazyMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.lazy_imports.LazyMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 a = 1;</code>
     * @return Whether the a field is set.
     */
    boolean hasA();
    /**
     * <code>optional int32 a = 1;</code>
     * @return The a.
     */
    int getA();
  }
  /**
   * Protobuf type {@code protobuf_unittest.lazy_imports.LazyMessage}
   */
  public static final class LazyMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.lazy_imports.LazyMessage)
      LazyMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LazyMessage.newBuilder() to construct.
    private LazyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LazyMessage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LazyMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LazyMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              a_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.internal_static_protobuf_unittest_lazy_imports_LazyMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.internal_static_protobuf_unittest_lazy_imports_LazyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.class, protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.Builder.class);
    }

    private int bitField0_;
    public static final int A_FIELD_NUMBER = 1;
    private int a_;
    /**
     * <code>optional int32 a = 1;</code>
     * @return Whether the a field is set.
     */
    @java.lang.Override
    public boolean hasA() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 a = 1;</code>
     * @return The a.
     */
    @java.lang.Override
    public int getA() {
      return a_;
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
        output.writeInt32(1, a_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, a_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage)) {
        return super.equals(obj);
      }
      protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage other = (protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage) obj;

      if (hasA() != other.hasA()) return false;
      if (hasA()) {
        if (getA()
            != other.getA()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasA()) {
        hash = (37 * hash) + A_FIELD_NUMBER;
        hash = (53 * hash) + getA();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parseFrom(
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
    public static Builder newBuilder(protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage prototype) {
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
     * Protobuf type {@code protobuf_unittest.lazy_imports.LazyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.lazy_imports.LazyMessage)
        protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.internal_static_protobuf_unittest_lazy_imports_LazyMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.internal_static_protobuf_unittest_lazy_imports_LazyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.class, protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.Builder.class);
      }

      // Construct using protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        a_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.internal_static_protobuf_unittest_lazy_imports_LazyMessage_descriptor;
      }

      @java.lang.Override
      public protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage getDefaultInstanceForType() {
        return protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.getDefaultInstance();
      }

      @java.lang.Override
      public protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage build() {
        protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage buildPartial() {
        protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage result = new protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.a_ = a_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage) {
          return mergeFrom((protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage other) {
        if (other == protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage.getDefaultInstance()) return this;
        if (other.hasA()) {
          setA(other.getA());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int a_ ;
      /**
       * <code>optional int32 a = 1;</code>
       * @return Whether the a field is set.
       */
      @java.lang.Override
      public boolean hasA() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 a = 1;</code>
       * @return The a.
       */
      @java.lang.Override
      public int getA() {
        return a_;
      }
      /**
       * <code>optional int32 a = 1;</code>
       * @param value The a to set.
       * @return This builder for chaining.
       */
      public Builder setA(int value) {
        bitField0_ |= 0x00000001;
        a_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 a = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearA() {
        bitField0_ = (bitField0_ & ~0x00000001);
        a_ = 0;
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


      // @@protoc_insertion_point(builder_scope:protobuf_unittest.lazy_imports.LazyMessage)
    }

    // @@protoc_insertion_point(class_scope:protobuf_unittest.lazy_imports.LazyMessage)
    private static final protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage();
    }

    public static protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LazyMessage>
        PARSER = new com.google.protobuf.AbstractParser<LazyMessage>() {
      @java.lang.Override
      public LazyMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LazyMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LazyMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LazyMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public protobuf_unittest.lazy_imports.UnittestLazyImportsCustomOptionProto.LazyMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int LAZY_ENUM_OPTION_FIELD_NUMBER = 138596335;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      protobuf_unittest.lazy_imports.UnittestLazyImportsEnumProto.LazyEnum> lazyEnumOption = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        protobuf_unittest.lazy_imports.UnittestLazyImportsEnumProto.LazyEnum.class,
        null);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_lazy_imports_LazyMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_lazy_imports_LazyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/protobuf/unittest_lazy_dependen" +
      "cies_custom_option.proto\022\036protobuf_unitt" +
      "est.lazy_imports\0325google/protobuf/unitte" +
      "st_lazy_dependencies_enum.proto\032 google/" +
      "protobuf/descriptor.proto\"\030\n\013LazyMessage" +
      "\022\t\n\001a\030\001 \001(\005:s\n\020lazy_enum_option\022\037.google" +
      ".protobuf.MessageOptions\030\357\237\213B \001(\0162(.prot" +
      "obuf_unittest.lazy_imports.LazyEnum:\013LAZ" +
      "Y_ENUM_1B4B$UnittestLazyImportsCustomOpt" +
      "ionProtoH\001\200\001\001\210\001\001\220\001\001\370\001\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          protobuf_unittest.lazy_imports.UnittestLazyImportsEnumProto.getDescriptor(),
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_protobuf_unittest_lazy_imports_LazyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_unittest_lazy_imports_LazyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_lazy_imports_LazyMessage_descriptor,
        new java.lang.String[] { "A", });
    lazyEnumOption.internalInit(descriptor.getExtensions().get(0));
    protobuf_unittest.lazy_imports.UnittestLazyImportsEnumProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
