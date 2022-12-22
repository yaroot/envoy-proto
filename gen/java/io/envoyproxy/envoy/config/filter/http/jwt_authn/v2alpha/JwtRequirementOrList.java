// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/jwt_authn/v2alpha/config.proto

package io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha;

/**
 * <pre>
 * This message specifies a list of RequiredProvider.
 * Their results are OR-ed; if any one of them passes, the result is passed
 * </pre>
 *
 * Protobuf type {@code envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList}
 */
public final class JwtRequirementOrList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList)
    JwtRequirementOrListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JwtRequirementOrList.newBuilder() to construct.
  private JwtRequirementOrList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JwtRequirementOrList() {
    requirements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JwtRequirementOrList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_jwt_authn_v2alpha_JwtRequirementOrList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_jwt_authn_v2alpha_JwtRequirementOrList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.class, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.Builder.class);
  }

  public static final int REQUIREMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement> requirements_;
  /**
   * <pre>
   * Specify a list of JwtRequirement.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement> getRequirementsList() {
    return requirements_;
  }
  /**
   * <pre>
   * Specify a list of JwtRequirement.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder> 
      getRequirementsOrBuilderList() {
    return requirements_;
  }
  /**
   * <pre>
   * Specify a list of JwtRequirement.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public int getRequirementsCount() {
    return requirements_.size();
  }
  /**
   * <pre>
   * Specify a list of JwtRequirement.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement getRequirements(int index) {
    return requirements_.get(index);
  }
  /**
   * <pre>
   * Specify a list of JwtRequirement.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder getRequirementsOrBuilder(
      int index) {
    return requirements_.get(index);
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
    for (int i = 0; i < requirements_.size(); i++) {
      output.writeMessage(1, requirements_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < requirements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, requirements_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList other = (io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList) obj;

    if (!getRequirementsList()
        .equals(other.getRequirementsList())) return false;
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
    if (getRequirementsCount() > 0) {
      hash = (37 * hash) + REQUIREMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequirementsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList prototype) {
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
   * This message specifies a list of RequiredProvider.
   * Their results are OR-ed; if any one of them passes, the result is passed
   * </pre>
   *
   * Protobuf type {@code envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList)
      io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_jwt_authn_v2alpha_JwtRequirementOrList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_jwt_authn_v2alpha_JwtRequirementOrList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.class, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.newBuilder()
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
      if (requirementsBuilder_ == null) {
        requirements_ = java.util.Collections.emptyList();
      } else {
        requirements_ = null;
        requirementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.ConfigProto.internal_static_envoy_config_filter_http_jwt_authn_v2alpha_JwtRequirementOrList_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList build() {
      io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList buildPartial() {
      io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList result = new io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList result) {
      if (requirementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requirements_ = java.util.Collections.unmodifiableList(requirements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requirements_ = requirements_;
      } else {
        result.requirements_ = requirementsBuilder_.build();
      }
    }

    private void buildPartial0(io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList) {
        return mergeFrom((io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList other) {
      if (other == io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList.getDefaultInstance()) return this;
      if (requirementsBuilder_ == null) {
        if (!other.requirements_.isEmpty()) {
          if (requirements_.isEmpty()) {
            requirements_ = other.requirements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequirementsIsMutable();
            requirements_.addAll(other.requirements_);
          }
          onChanged();
        }
      } else {
        if (!other.requirements_.isEmpty()) {
          if (requirementsBuilder_.isEmpty()) {
            requirementsBuilder_.dispose();
            requirementsBuilder_ = null;
            requirements_ = other.requirements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requirementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequirementsFieldBuilder() : null;
          } else {
            requirementsBuilder_.addAllMessages(other.requirements_);
          }
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
              io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement m =
                  input.readMessage(
                      io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.parser(),
                      extensionRegistry);
              if (requirementsBuilder_ == null) {
                ensureRequirementsIsMutable();
                requirements_.add(m);
              } else {
                requirementsBuilder_.addMessage(m);
              }
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

    private java.util.List<io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement> requirements_ =
      java.util.Collections.emptyList();
    private void ensureRequirementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requirements_ = new java.util.ArrayList<io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement>(requirements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder> requirementsBuilder_;

    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement> getRequirementsList() {
      if (requirementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requirements_);
      } else {
        return requirementsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public int getRequirementsCount() {
      if (requirementsBuilder_ == null) {
        return requirements_.size();
      } else {
        return requirementsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement getRequirements(int index) {
      if (requirementsBuilder_ == null) {
        return requirements_.get(index);
      } else {
        return requirementsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setRequirements(
        int index, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement value) {
      if (requirementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequirementsIsMutable();
        requirements_.set(index, value);
        onChanged();
      } else {
        requirementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setRequirements(
        int index, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder builderForValue) {
      if (requirementsBuilder_ == null) {
        ensureRequirementsIsMutable();
        requirements_.set(index, builderForValue.build());
        onChanged();
      } else {
        requirementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addRequirements(io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement value) {
      if (requirementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequirementsIsMutable();
        requirements_.add(value);
        onChanged();
      } else {
        requirementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addRequirements(
        int index, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement value) {
      if (requirementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequirementsIsMutable();
        requirements_.add(index, value);
        onChanged();
      } else {
        requirementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addRequirements(
        io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder builderForValue) {
      if (requirementsBuilder_ == null) {
        ensureRequirementsIsMutable();
        requirements_.add(builderForValue.build());
        onChanged();
      } else {
        requirementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addRequirements(
        int index, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder builderForValue) {
      if (requirementsBuilder_ == null) {
        ensureRequirementsIsMutable();
        requirements_.add(index, builderForValue.build());
        onChanged();
      } else {
        requirementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addAllRequirements(
        java.lang.Iterable<? extends io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement> values) {
      if (requirementsBuilder_ == null) {
        ensureRequirementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requirements_);
        onChanged();
      } else {
        requirementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearRequirements() {
      if (requirementsBuilder_ == null) {
        requirements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requirementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder removeRequirements(int index) {
      if (requirementsBuilder_ == null) {
        ensureRequirementsIsMutable();
        requirements_.remove(index);
        onChanged();
      } else {
        requirementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder getRequirementsBuilder(
        int index) {
      return getRequirementsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder getRequirementsOrBuilder(
        int index) {
      if (requirementsBuilder_ == null) {
        return requirements_.get(index);  } else {
        return requirementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder> 
         getRequirementsOrBuilderList() {
      if (requirementsBuilder_ != null) {
        return requirementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requirements_);
      }
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder addRequirementsBuilder() {
      return getRequirementsFieldBuilder().addBuilder(
          io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.getDefaultInstance());
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder addRequirementsBuilder(
        int index) {
      return getRequirementsFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.getDefaultInstance());
    }
    /**
     * <pre>
     * Specify a list of JwtRequirement.
     * </pre>
     *
     * <code>repeated .envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement requirements = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder> 
         getRequirementsBuilderList() {
      return getRequirementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder> 
        getRequirementsFieldBuilder() {
      if (requirementsBuilder_ == null) {
        requirementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirement.Builder, io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrBuilder>(
                requirements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        requirements_ = null;
      }
      return requirementsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList)
  private static final io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList();
  }

  public static io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JwtRequirementOrList>
      PARSER = new com.google.protobuf.AbstractParser<JwtRequirementOrList>() {
    @java.lang.Override
    public JwtRequirementOrList parsePartialFrom(
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

  public static com.google.protobuf.Parser<JwtRequirementOrList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JwtRequirementOrList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha.JwtRequirementOrList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

