// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/tap/v2alpha/common.proto

package io.envoyproxy.envoy.service.tap.v2alpha;

/**
 * <pre>
 * The file per tap sink outputs a discrete file for every tapped stream.
 * </pre>
 *
 * Protobuf type {@code envoy.service.tap.v2alpha.FilePerTapSink}
 */
public final class FilePerTapSink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.tap.v2alpha.FilePerTapSink)
    FilePerTapSinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilePerTapSink.newBuilder() to construct.
  private FilePerTapSink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilePerTapSink() {
    pathPrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilePerTapSink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.tap.v2alpha.CommonProto.internal_static_envoy_service_tap_v2alpha_FilePerTapSink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.tap.v2alpha.CommonProto.internal_static_envoy_service_tap_v2alpha_FilePerTapSink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.class, io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.Builder.class);
  }

  public static final int PATH_PREFIX_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pathPrefix_ = "";
  /**
   * <pre>
   * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
   * identifier distinguishing the recorded trace for stream instances (the Envoy
   * connection ID, HTTP stream ID, etc.).
   * </pre>
   *
   * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The pathPrefix.
   */
  @java.lang.Override
  public java.lang.String getPathPrefix() {
    java.lang.Object ref = pathPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pathPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
   * identifier distinguishing the recorded trace for stream instances (the Envoy
   * connection ID, HTTP stream ID, etc.).
   * </pre>
   *
   * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for pathPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathPrefixBytes() {
    java.lang.Object ref = pathPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pathPrefix_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pathPrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pathPrefix_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pathPrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pathPrefix_);
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
    if (!(obj instanceof io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink other = (io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink) obj;

    if (!getPathPrefix()
        .equals(other.getPathPrefix())) return false;
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
    hash = (37 * hash) + PATH_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPathPrefix().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink prototype) {
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
   * The file per tap sink outputs a discrete file for every tapped stream.
   * </pre>
   *
   * Protobuf type {@code envoy.service.tap.v2alpha.FilePerTapSink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.tap.v2alpha.FilePerTapSink)
      io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.tap.v2alpha.CommonProto.internal_static_envoy_service_tap_v2alpha_FilePerTapSink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.tap.v2alpha.CommonProto.internal_static_envoy_service_tap_v2alpha_FilePerTapSink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.class, io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.newBuilder()
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
      pathPrefix_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.tap.v2alpha.CommonProto.internal_static_envoy_service_tap_v2alpha_FilePerTapSink_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink build() {
      io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink buildPartial() {
      io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink result = new io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pathPrefix_ = pathPrefix_;
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
      if (other instanceof io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink) {
        return mergeFrom((io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink other) {
      if (other == io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink.getDefaultInstance()) return this;
      if (!other.getPathPrefix().isEmpty()) {
        pathPrefix_ = other.pathPrefix_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              pathPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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
    private int bitField0_;

    private java.lang.Object pathPrefix_ = "";
    /**
     * <pre>
     * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
     * identifier distinguishing the recorded trace for stream instances (the Envoy
     * connection ID, HTTP stream ID, etc.).
     * </pre>
     *
     * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return The pathPrefix.
     */
    public java.lang.String getPathPrefix() {
      java.lang.Object ref = pathPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pathPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
     * identifier distinguishing the recorded trace for stream instances (the Envoy
     * connection ID, HTTP stream ID, etc.).
     * </pre>
     *
     * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for pathPrefix.
     */
    public com.google.protobuf.ByteString
        getPathPrefixBytes() {
      java.lang.Object ref = pathPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pathPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
     * identifier distinguishing the recorded trace for stream instances (the Envoy
     * connection ID, HTTP stream ID, etc.).
     * </pre>
     *
     * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
     * @param value The pathPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setPathPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pathPrefix_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
     * identifier distinguishing the recorded trace for stream instances (the Envoy
     * connection ID, HTTP stream ID, etc.).
     * </pre>
     *
     * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPathPrefix() {
      pathPrefix_ = getDefaultInstance().getPathPrefix();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
     * identifier distinguishing the recorded trace for stream instances (the Envoy
     * connection ID, HTTP stream ID, etc.).
     * </pre>
     *
     * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for pathPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setPathPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pathPrefix_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.tap.v2alpha.FilePerTapSink)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.tap.v2alpha.FilePerTapSink)
  private static final io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink();
  }

  public static io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilePerTapSink>
      PARSER = new com.google.protobuf.AbstractParser<FilePerTapSink>() {
    @java.lang.Override
    public FilePerTapSink parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilePerTapSink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilePerTapSink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.tap.v2alpha.FilePerTapSink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

