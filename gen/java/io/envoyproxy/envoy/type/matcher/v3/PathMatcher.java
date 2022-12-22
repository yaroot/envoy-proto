// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/v3/path.proto

package io.envoyproxy.envoy.type.matcher.v3;

/**
 * <pre>
 * Specifies the way to match a path on HTTP request.
 * </pre>
 *
 * Protobuf type {@code envoy.type.matcher.v3.PathMatcher}
 */
public final class PathMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.matcher.v3.PathMatcher)
    PathMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PathMatcher.newBuilder() to construct.
  private PathMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PathMatcher() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PathMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.type.matcher.v3.PathProto.internal_static_envoy_type_matcher_v3_PathMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.type.matcher.v3.PathProto.internal_static_envoy_type_matcher_v3_PathMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.type.matcher.v3.PathMatcher.class, io.envoyproxy.envoy.type.matcher.v3.PathMatcher.Builder.class);
  }

  private int ruleCase_ = 0;
  private java.lang.Object rule_;
  public enum RuleCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PATH(1),
    RULE_NOT_SET(0);
    private final int value;
    private RuleCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RuleCase valueOf(int value) {
      return forNumber(value);
    }

    public static RuleCase forNumber(int value) {
      switch (value) {
        case 1: return PATH;
        case 0: return RULE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RuleCase
  getRuleCase() {
    return RuleCase.forNumber(
        ruleCase_);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The ``path`` must match the URL path portion of the :path header. The query and fragment
   * string (if present) are removed in the URL path portion.
   * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the path field is set.
   */
  @java.lang.Override
  public boolean hasPath() {
    return ruleCase_ == 1;
  }
  /**
   * <pre>
   * The ``path`` must match the URL path portion of the :path header. The query and fragment
   * string (if present) are removed in the URL path portion.
   * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
   * @return The path.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.StringMatcher getPath() {
    if (ruleCase_ == 1) {
       return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_;
    }
    return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
  }
  /**
   * <pre>
   * The ``path`` must match the URL path portion of the :path header. The query and fragment
   * string (if present) are removed in the URL path portion.
   * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getPathOrBuilder() {
    if (ruleCase_ == 1) {
       return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_;
    }
    return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
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
    if (ruleCase_ == 1) {
      output.writeMessage(1, (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruleCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_);
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
    if (!(obj instanceof io.envoyproxy.envoy.type.matcher.v3.PathMatcher)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.type.matcher.v3.PathMatcher other = (io.envoyproxy.envoy.type.matcher.v3.PathMatcher) obj;

    if (!getRuleCase().equals(other.getRuleCase())) return false;
    switch (ruleCase_) {
      case 1:
        if (!getPath()
            .equals(other.getPath())) return false;
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
    switch (ruleCase_) {
      case 1:
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.type.matcher.v3.PathMatcher prototype) {
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
   * Specifies the way to match a path on HTTP request.
   * </pre>
   *
   * Protobuf type {@code envoy.type.matcher.v3.PathMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.matcher.v3.PathMatcher)
      io.envoyproxy.envoy.type.matcher.v3.PathMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.matcher.v3.PathProto.internal_static_envoy_type_matcher_v3_PathMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.type.matcher.v3.PathProto.internal_static_envoy_type_matcher_v3_PathMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.type.matcher.v3.PathMatcher.class, io.envoyproxy.envoy.type.matcher.v3.PathMatcher.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.type.matcher.v3.PathMatcher.newBuilder()
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
      if (pathBuilder_ != null) {
        pathBuilder_.clear();
      }
      ruleCase_ = 0;
      rule_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.type.matcher.v3.PathProto.internal_static_envoy_type_matcher_v3_PathMatcher_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.PathMatcher getDefaultInstanceForType() {
      return io.envoyproxy.envoy.type.matcher.v3.PathMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.PathMatcher build() {
      io.envoyproxy.envoy.type.matcher.v3.PathMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.PathMatcher buildPartial() {
      io.envoyproxy.envoy.type.matcher.v3.PathMatcher result = new io.envoyproxy.envoy.type.matcher.v3.PathMatcher(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.type.matcher.v3.PathMatcher result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(io.envoyproxy.envoy.type.matcher.v3.PathMatcher result) {
      result.ruleCase_ = ruleCase_;
      result.rule_ = this.rule_;
      if (ruleCase_ == 1 &&
          pathBuilder_ != null) {
        result.rule_ = pathBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.type.matcher.v3.PathMatcher) {
        return mergeFrom((io.envoyproxy.envoy.type.matcher.v3.PathMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.type.matcher.v3.PathMatcher other) {
      if (other == io.envoyproxy.envoy.type.matcher.v3.PathMatcher.getDefaultInstance()) return this;
      switch (other.getRuleCase()) {
        case PATH: {
          mergePath(other.getPath());
          break;
        }
        case RULE_NOT_SET: {
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
                  getPathFieldBuilder().getBuilder(),
                  extensionRegistry);
              ruleCase_ = 1;
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
    private int ruleCase_ = 0;
    private java.lang.Object rule_;
    public RuleCase
        getRuleCase() {
      return RuleCase.forNumber(
          ruleCase_);
    }

    public Builder clearRule() {
      ruleCase_ = 0;
      rule_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> pathBuilder_;
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the path field is set.
     */
    @java.lang.Override
    public boolean hasPath() {
      return ruleCase_ == 1;
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     * @return The path.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcher getPath() {
      if (pathBuilder_ == null) {
        if (ruleCase_ == 1) {
          return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_;
        }
        return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
      } else {
        if (ruleCase_ == 1) {
          return pathBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setPath(io.envoyproxy.envoy.type.matcher.v3.StringMatcher value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
        onChanged();
      } else {
        pathBuilder_.setMessage(value);
      }
      ruleCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setPath(
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder builderForValue) {
      if (pathBuilder_ == null) {
        rule_ = builderForValue.build();
        onChanged();
      } else {
        pathBuilder_.setMessage(builderForValue.build());
      }
      ruleCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergePath(io.envoyproxy.envoy.type.matcher.v3.StringMatcher value) {
      if (pathBuilder_ == null) {
        if (ruleCase_ == 1 &&
            rule_ != io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance()) {
          rule_ = io.envoyproxy.envoy.type.matcher.v3.StringMatcher.newBuilder((io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_)
              .mergeFrom(value).buildPartial();
        } else {
          rule_ = value;
        }
        onChanged();
      } else {
        if (ruleCase_ == 1) {
          pathBuilder_.mergeFrom(value);
        } else {
          pathBuilder_.setMessage(value);
        }
      }
      ruleCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearPath() {
      if (pathBuilder_ == null) {
        if (ruleCase_ == 1) {
          ruleCase_ = 0;
          rule_ = null;
          onChanged();
        }
      } else {
        if (ruleCase_ == 1) {
          ruleCase_ = 0;
          rule_ = null;
        }
        pathBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder getPathBuilder() {
      return getPathFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getPathOrBuilder() {
      if ((ruleCase_ == 1) && (pathBuilder_ != null)) {
        return pathBuilder_.getMessageOrBuilder();
      } else {
        if (ruleCase_ == 1) {
          return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_;
        }
        return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The ``path`` must match the URL path portion of the :path header. The query and fragment
     * string (if present) are removed in the URL path portion.
     * For example, the path ``/data`` will match the ``:path`` header ``/data#fragment?param=value``.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher path = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> 
        getPathFieldBuilder() {
      if (pathBuilder_ == null) {
        if (!(ruleCase_ == 1)) {
          rule_ = io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
        }
        pathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder>(
                (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) rule_,
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      ruleCase_ = 1;
      onChanged();
      return pathBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.type.matcher.v3.PathMatcher)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.matcher.v3.PathMatcher)
  private static final io.envoyproxy.envoy.type.matcher.v3.PathMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.type.matcher.v3.PathMatcher();
  }

  public static io.envoyproxy.envoy.type.matcher.v3.PathMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PathMatcher>
      PARSER = new com.google.protobuf.AbstractParser<PathMatcher>() {
    @java.lang.Override
    public PathMatcher parsePartialFrom(
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

  public static com.google.protobuf.Parser<PathMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PathMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.PathMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

