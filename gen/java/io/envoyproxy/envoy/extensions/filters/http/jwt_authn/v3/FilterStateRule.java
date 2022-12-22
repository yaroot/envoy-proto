// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

/**
 * <pre>
 * This message specifies Jwt requirements based on stream_info.filterState.
 * This FilterState should use ``Router::StringAccessor`` object to set a string value.
 * Other HTTP filters can use it to specify Jwt requirements dynamically.
 * Example:
 * .. code-block:: yaml
 *    name: jwt_selector
 *    requires:
 *      issuer_1:
 *        provider_name: issuer1
 *      issuer_2:
 *        provider_name: issuer2
 * If a filter set "jwt_selector" with "issuer_1" to FilterState for a request,
 * jwt_authn filter will use JwtRequirement{"provider_name": "issuer1"} to verify.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule}
 */
public final class FilterStateRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)
    FilterStateRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilterStateRule.newBuilder() to construct.
  private FilterStateRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilterStateRule() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilterStateRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_FilterStateRule_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetRequires();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_FilterStateRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The filter state name to retrieve the ``Router::StringAccessor`` object.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
   * The filter state name to retrieve the ``Router::StringAccessor`` object.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
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

  public static final int REQUIRES_FIELD_NUMBER = 3;
  private static final class RequiresDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>newDefaultInstance(
                io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_FilterStateRule_RequiresEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> requires_;
  private com.google.protobuf.MapField<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
  internalGetRequires() {
    if (requires_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RequiresDefaultEntryHolder.defaultEntry);
    }
    return requires_;
  }
  public int getRequiresCount() {
    return internalGetRequires().getMap().size();
  }
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the ``name`` field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  @java.lang.Override
  public boolean containsRequires(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetRequires().getMap().containsKey(key);
  }
  /**
   * Use {@link #getRequiresMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> getRequires() {
    return getRequiresMap();
  }
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the ``name`` field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> getRequiresMap() {
    return internalGetRequires().getMap();
  }
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the ``name`` field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  @java.lang.Override
  public /* nullable */
io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement getRequiresOrDefault(
      java.lang.String key,
      /* nullable */
io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> map =
        internalGetRequires().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the ``name`` field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement getRequiresOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> map =
        internalGetRequires().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetRequires(),
        RequiresDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> entry
         : internalGetRequires().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
      requires__ = RequiresDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, requires__);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule other = (io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!internalGetRequires().equals(
        other.internalGetRequires())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetRequires().getMap().isEmpty()) {
      hash = (37 * hash) + REQUIRES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRequires().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule prototype) {
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
   * This message specifies Jwt requirements based on stream_info.filterState.
   * This FilterState should use ``Router::StringAccessor`` object to set a string value.
   * Other HTTP filters can use it to specify Jwt requirements dynamically.
   * Example:
   * .. code-block:: yaml
   *    name: jwt_selector
   *    requires:
   *      issuer_1:
   *        provider_name: issuer1
   *      issuer_2:
   *        provider_name: issuer2
   * If a filter set "jwt_selector" with "issuer_1" to FilterState for a request,
   * jwt_authn filter will use JwtRequirement{"provider_name": "issuer1"} to verify.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_FilterStateRule_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetRequires();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableRequires();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_FilterStateRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.newBuilder()
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
      name_ = "";
      internalGetMutableRequires().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_FilterStateRule_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule build() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule result = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requires_ = internalGetRequires();
        result.requires_.makeImmutable();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableRequires().mergeFrom(
          other.internalGetRequires());
      bitField0_ |= 0x00000002;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
              requires__ = input.readMessage(
                  RequiresDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableRequires().getMutableMap().put(
                  requires__.getKey(), requires__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The filter state name to retrieve the ``Router::StringAccessor`` object.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * The filter state name to retrieve the ``Router::StringAccessor`` object.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * The filter state name to retrieve the ``Router::StringAccessor`` object.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The filter state name to retrieve the ``Router::StringAccessor`` object.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The filter state name to retrieve the ``Router::StringAccessor`` object.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> requires_;
    private com.google.protobuf.MapField<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
        internalGetRequires() {
      if (requires_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RequiresDefaultEntryHolder.defaultEntry);
      }
      return requires_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
        internalGetMutableRequires() {
      if (requires_ == null) {
        requires_ = com.google.protobuf.MapField.newMapField(
            RequiresDefaultEntryHolder.defaultEntry);
      }
      if (!requires_.isMutable()) {
        requires_ = requires_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return requires_;
    }
    public int getRequiresCount() {
      return internalGetRequires().getMap().size();
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    @java.lang.Override
    public boolean containsRequires(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetRequires().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRequiresMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> getRequires() {
      return getRequiresMap();
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> getRequiresMap() {
      return internalGetRequires().getMap();
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    @java.lang.Override
    public /* nullable */
io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement getRequiresOrDefault(
        java.lang.String key,
        /* nullable */
io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> map =
          internalGetRequires().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement getRequiresOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> map =
          internalGetRequires().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearRequires() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableRequires().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    public Builder removeRequires(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableRequires().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
        getMutableRequires() {
      bitField0_ |= 0x00000002;
      return internalGetMutableRequires().getMutableMap();
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    public Builder putRequires(
        java.lang.String key,
        io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableRequires().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * A map of string keys to requirements. The string key is the string value
     * in the FilterState with the name specified in the ``name`` field above.
     * </pre>
     *
     * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
     */
    public Builder putAllRequires(
        java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement> values) {
      internalGetMutableRequires().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)
  private static final io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterStateRule>
      PARSER = new com.google.protobuf.AbstractParser<FilterStateRule>() {
    @java.lang.Override
    public FilterStateRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilterStateRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterStateRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
