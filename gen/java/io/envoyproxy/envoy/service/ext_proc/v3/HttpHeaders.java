// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ext_proc/v3/external_processor.proto

package io.envoyproxy.envoy.service.ext_proc.v3;

/**
 * <pre>
 * This message is sent to the external server when the HTTP request and responses
 * are first received.
 * </pre>
 *
 * Protobuf type {@code envoy.service.ext_proc.v3.HttpHeaders}
 */
public final class HttpHeaders extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.ext_proc.v3.HttpHeaders)
    HttpHeadersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpHeaders.newBuilder() to construct.
  private HttpHeaders(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpHeaders() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpHeaders();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpHeaders_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAttributes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpHeaders_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.class, io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.Builder.class);
  }

  public static final int HEADERS_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.HeaderMap headers_;
  /**
   * <pre>
   * The HTTP request headers. All header keys will be
   * lower-cased, because HTTP header keys are case-insensitive.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
   * @return Whether the headers field is set.
   */
  @java.lang.Override
  public boolean hasHeaders() {
    return headers_ != null;
  }
  /**
   * <pre>
   * The HTTP request headers. All header keys will be
   * lower-cased, because HTTP header keys are case-insensitive.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
   * @return The headers.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HeaderMap getHeaders() {
    return headers_ == null ? io.envoyproxy.envoy.config.core.v3.HeaderMap.getDefaultInstance() : headers_;
  }
  /**
   * <pre>
   * The HTTP request headers. All header keys will be
   * lower-cased, because HTTP header keys are case-insensitive.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HeaderMapOrBuilder getHeadersOrBuilder() {
    return headers_ == null ? io.envoyproxy.envoy.config.core.v3.HeaderMap.getDefaultInstance() : headers_;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private static final class AttributesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.Struct> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.Struct>newDefaultInstance(
                io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpHeaders_AttributesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.protobuf.Struct.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.Struct> attributes_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Struct>
  internalGetAttributes() {
    if (attributes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AttributesDefaultEntryHolder.defaultEntry);
    }
    return attributes_;
  }
  public int getAttributesCount() {
    return internalGetAttributes().getMap().size();
  }
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The values of properties selected by the ``request_attributes``
   * or ``response_attributes`` list in the configuration. Each entry
   * in the list is populated
   * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
   * supported across Envoy.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
   */
  @java.lang.Override
  public boolean containsAttributes(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetAttributes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.Struct> getAttributes() {
    return getAttributesMap();
  }
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The values of properties selected by the ``request_attributes``
   * or ``response_attributes`` list in the configuration. Each entry
   * in the list is populated
   * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
   * supported across Envoy.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.protobuf.Struct> getAttributesMap() {
    return internalGetAttributes().getMap();
  }
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The values of properties selected by the ``request_attributes``
   * or ``response_attributes`` list in the configuration. Each entry
   * in the list is populated
   * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
   * supported across Envoy.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.protobuf.Struct getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Struct defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
        internalGetAttributes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The values of properties selected by the ``request_attributes``
   * or ``response_attributes`` list in the configuration. Each entry
   * in the list is populated
   * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
   * supported across Envoy.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Struct getAttributesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
        internalGetAttributes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int END_OF_STREAM_FIELD_NUMBER = 3;
  private boolean endOfStream_ = false;
  /**
   * <pre>
   * If true, then there is no message body associated with this
   * request or response.
   * </pre>
   *
   * <code>bool end_of_stream = 3;</code>
   * @return The endOfStream.
   */
  @java.lang.Override
  public boolean getEndOfStream() {
    return endOfStream_;
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
    if (headers_ != null) {
      output.writeMessage(1, getHeaders());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAttributes(),
        AttributesDefaultEntryHolder.defaultEntry,
        2);
    if (endOfStream_ != false) {
      output.writeBool(3, endOfStream_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (headers_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeaders());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Struct> entry
         : internalGetAttributes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Struct>
      attributes__ = AttributesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, attributes__);
    }
    if (endOfStream_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, endOfStream_);
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
    if (!(obj instanceof io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders other = (io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders) obj;

    if (hasHeaders() != other.hasHeaders()) return false;
    if (hasHeaders()) {
      if (!getHeaders()
          .equals(other.getHeaders())) return false;
    }
    if (!internalGetAttributes().equals(
        other.internalGetAttributes())) return false;
    if (getEndOfStream()
        != other.getEndOfStream()) return false;
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
    if (hasHeaders()) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeaders().hashCode();
    }
    if (!internalGetAttributes().getMap().isEmpty()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAttributes().hashCode();
    }
    hash = (37 * hash) + END_OF_STREAM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEndOfStream());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders prototype) {
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
   * This message is sent to the external server when the HTTP request and responses
   * are first received.
   * </pre>
   *
   * Protobuf type {@code envoy.service.ext_proc.v3.HttpHeaders}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.ext_proc.v3.HttpHeaders)
      io.envoyproxy.envoy.service.ext_proc.v3.HttpHeadersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpHeaders_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpHeaders_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.class, io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.newBuilder()
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
      headers_ = null;
      if (headersBuilder_ != null) {
        headersBuilder_.dispose();
        headersBuilder_ = null;
      }
      internalGetMutableAttributes().clear();
      endOfStream_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.ext_proc.v3.ExternalProcessorProto.internal_static_envoy_service_ext_proc_v3_HttpHeaders_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders build() {
      io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders buildPartial() {
      io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders result = new io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headers_ = headersBuilder_ == null
            ? headers_
            : headersBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attributes_ = internalGetAttributes();
        result.attributes_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endOfStream_ = endOfStream_;
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
      if (other instanceof io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders) {
        return mergeFrom((io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders other) {
      if (other == io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders.getDefaultInstance()) return this;
      if (other.hasHeaders()) {
        mergeHeaders(other.getHeaders());
      }
      internalGetMutableAttributes().mergeFrom(
          other.internalGetAttributes());
      bitField0_ |= 0x00000002;
      if (other.getEndOfStream() != false) {
        setEndOfStream(other.getEndOfStream());
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
                  getHeadersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Struct>
              attributes__ = input.readMessage(
                  AttributesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableAttributes().getMutableMap().put(
                  attributes__.getKey(), attributes__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              endOfStream_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private io.envoyproxy.envoy.config.core.v3.HeaderMap headers_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.HeaderMap, io.envoyproxy.envoy.config.core.v3.HeaderMap.Builder, io.envoyproxy.envoy.config.core.v3.HeaderMapOrBuilder> headersBuilder_;
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     * @return Whether the headers field is set.
     */
    public boolean hasHeaders() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     * @return The headers.
     */
    public io.envoyproxy.envoy.config.core.v3.HeaderMap getHeaders() {
      if (headersBuilder_ == null) {
        return headers_ == null ? io.envoyproxy.envoy.config.core.v3.HeaderMap.getDefaultInstance() : headers_;
      } else {
        return headersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    public Builder setHeaders(io.envoyproxy.envoy.config.core.v3.HeaderMap value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        headers_ = value;
      } else {
        headersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    public Builder setHeaders(
        io.envoyproxy.envoy.config.core.v3.HeaderMap.Builder builderForValue) {
      if (headersBuilder_ == null) {
        headers_ = builderForValue.build();
      } else {
        headersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    public Builder mergeHeaders(io.envoyproxy.envoy.config.core.v3.HeaderMap value) {
      if (headersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          headers_ != null &&
          headers_ != io.envoyproxy.envoy.config.core.v3.HeaderMap.getDefaultInstance()) {
          getHeadersBuilder().mergeFrom(value);
        } else {
          headers_ = value;
        }
      } else {
        headersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    public Builder clearHeaders() {
      bitField0_ = (bitField0_ & ~0x00000001);
      headers_ = null;
      if (headersBuilder_ != null) {
        headersBuilder_.dispose();
        headersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.HeaderMap.Builder getHeadersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeadersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.HeaderMapOrBuilder getHeadersOrBuilder() {
      if (headersBuilder_ != null) {
        return headersBuilder_.getMessageOrBuilder();
      } else {
        return headers_ == null ?
            io.envoyproxy.envoy.config.core.v3.HeaderMap.getDefaultInstance() : headers_;
      }
    }
    /**
     * <pre>
     * The HTTP request headers. All header keys will be
     * lower-cased, because HTTP header keys are case-insensitive.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderMap headers = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.HeaderMap, io.envoyproxy.envoy.config.core.v3.HeaderMap.Builder, io.envoyproxy.envoy.config.core.v3.HeaderMapOrBuilder> 
        getHeadersFieldBuilder() {
      if (headersBuilder_ == null) {
        headersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.HeaderMap, io.envoyproxy.envoy.config.core.v3.HeaderMap.Builder, io.envoyproxy.envoy.config.core.v3.HeaderMapOrBuilder>(
                getHeaders(),
                getParentForChildren(),
                isClean());
        headers_ = null;
      }
      return headersBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.Struct> attributes_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Struct>
        internalGetAttributes() {
      if (attributes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      return attributes_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Struct>
        internalGetMutableAttributes() {
      if (attributes_ == null) {
        attributes_ = com.google.protobuf.MapField.newMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      if (!attributes_.isMutable()) {
        attributes_ = attributes_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return attributes_;
    }
    public int getAttributesCount() {
      return internalGetAttributes().getMap().size();
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    @java.lang.Override
    public boolean containsAttributes(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetAttributes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAttributesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Struct> getAttributes() {
      return getAttributesMap();
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.Struct> getAttributesMap() {
      return internalGetAttributes().getMap();
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.protobuf.Struct getAttributesOrDefault(
        java.lang.String key,
        /* nullable */
com.google.protobuf.Struct defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
          internalGetAttributes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Struct getAttributesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
          internalGetAttributes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearAttributes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableAttributes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    public Builder removeAttributes(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableAttributes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Struct>
        getMutableAttributes() {
      bitField0_ |= 0x00000002;
      return internalGetMutableAttributes().getMutableMap();
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    public Builder putAttributes(
        java.lang.String key,
        com.google.protobuf.Struct value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableAttributes().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * [#not-implemented-hide:]
     * The values of properties selected by the ``request_attributes``
     * or ``response_attributes`` list in the configuration. Each entry
     * in the list is populated
     * from the standard :ref:`attributes &lt;arch_overview_attributes&gt;`
     * supported across Envoy.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; attributes = 2;</code>
     */
    public Builder putAllAttributes(
        java.util.Map<java.lang.String, com.google.protobuf.Struct> values) {
      internalGetMutableAttributes().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    private boolean endOfStream_ ;
    /**
     * <pre>
     * If true, then there is no message body associated with this
     * request or response.
     * </pre>
     *
     * <code>bool end_of_stream = 3;</code>
     * @return The endOfStream.
     */
    @java.lang.Override
    public boolean getEndOfStream() {
      return endOfStream_;
    }
    /**
     * <pre>
     * If true, then there is no message body associated with this
     * request or response.
     * </pre>
     *
     * <code>bool end_of_stream = 3;</code>
     * @param value The endOfStream to set.
     * @return This builder for chaining.
     */
    public Builder setEndOfStream(boolean value) {
      
      endOfStream_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, then there is no message body associated with this
     * request or response.
     * </pre>
     *
     * <code>bool end_of_stream = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndOfStream() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endOfStream_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.ext_proc.v3.HttpHeaders)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.ext_proc.v3.HttpHeaders)
  private static final io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders();
  }

  public static io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpHeaders>
      PARSER = new com.google.protobuf.AbstractParser<HttpHeaders>() {
    @java.lang.Override
    public HttpHeaders parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpHeaders> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpHeaders> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.ext_proc.v3.HttpHeaders getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
