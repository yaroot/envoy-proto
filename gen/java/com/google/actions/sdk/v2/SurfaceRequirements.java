// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/surface.proto

package com.google.actions.sdk.v2;

/**
 * <pre>
 * Contains a set of requirements that the client surface must support to invoke
 * Actions in your project.
 * </pre>
 *
 * Protobuf type {@code google.actions.sdk.v2.SurfaceRequirements}
 */
public final class SurfaceRequirements extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.actions.sdk.v2.SurfaceRequirements)
    SurfaceRequirementsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SurfaceRequirements.newBuilder() to construct.
  private SurfaceRequirements(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SurfaceRequirements() {
    minimumRequirements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SurfaceRequirements();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.actions.sdk.v2.SurfaceProto.internal_static_google_actions_sdk_v2_SurfaceRequirements_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.actions.sdk.v2.SurfaceProto.internal_static_google_actions_sdk_v2_SurfaceRequirements_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.actions.sdk.v2.SurfaceRequirements.class, com.google.actions.sdk.v2.SurfaceRequirements.Builder.class);
  }

  public static final int MINIMUM_REQUIREMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.actions.sdk.v2.CapabilityRequirement> minimumRequirements_;
  /**
   * <pre>
   * The minimum set of capabilities needed to invoke the Actions in your
   * project. If the surface is missing any of these, the Action will not be
   * triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.actions.sdk.v2.CapabilityRequirement> getMinimumRequirementsList() {
    return minimumRequirements_;
  }
  /**
   * <pre>
   * The minimum set of capabilities needed to invoke the Actions in your
   * project. If the surface is missing any of these, the Action will not be
   * triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.actions.sdk.v2.CapabilityRequirementOrBuilder> 
      getMinimumRequirementsOrBuilderList() {
    return minimumRequirements_;
  }
  /**
   * <pre>
   * The minimum set of capabilities needed to invoke the Actions in your
   * project. If the surface is missing any of these, the Action will not be
   * triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
   */
  @java.lang.Override
  public int getMinimumRequirementsCount() {
    return minimumRequirements_.size();
  }
  /**
   * <pre>
   * The minimum set of capabilities needed to invoke the Actions in your
   * project. If the surface is missing any of these, the Action will not be
   * triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
   */
  @java.lang.Override
  public com.google.actions.sdk.v2.CapabilityRequirement getMinimumRequirements(int index) {
    return minimumRequirements_.get(index);
  }
  /**
   * <pre>
   * The minimum set of capabilities needed to invoke the Actions in your
   * project. If the surface is missing any of these, the Action will not be
   * triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
   */
  @java.lang.Override
  public com.google.actions.sdk.v2.CapabilityRequirementOrBuilder getMinimumRequirementsOrBuilder(
      int index) {
    return minimumRequirements_.get(index);
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
    for (int i = 0; i < minimumRequirements_.size(); i++) {
      output.writeMessage(1, minimumRequirements_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < minimumRequirements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, minimumRequirements_.get(i));
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
    if (!(obj instanceof com.google.actions.sdk.v2.SurfaceRequirements)) {
      return super.equals(obj);
    }
    com.google.actions.sdk.v2.SurfaceRequirements other = (com.google.actions.sdk.v2.SurfaceRequirements) obj;

    if (!getMinimumRequirementsList()
        .equals(other.getMinimumRequirementsList())) return false;
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
    if (getMinimumRequirementsCount() > 0) {
      hash = (37 * hash) + MINIMUM_REQUIREMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumRequirementsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.actions.sdk.v2.SurfaceRequirements parseFrom(
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
  public static Builder newBuilder(com.google.actions.sdk.v2.SurfaceRequirements prototype) {
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
   * Contains a set of requirements that the client surface must support to invoke
   * Actions in your project.
   * </pre>
   *
   * Protobuf type {@code google.actions.sdk.v2.SurfaceRequirements}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.actions.sdk.v2.SurfaceRequirements)
      com.google.actions.sdk.v2.SurfaceRequirementsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.actions.sdk.v2.SurfaceProto.internal_static_google_actions_sdk_v2_SurfaceRequirements_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.actions.sdk.v2.SurfaceProto.internal_static_google_actions_sdk_v2_SurfaceRequirements_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.actions.sdk.v2.SurfaceRequirements.class, com.google.actions.sdk.v2.SurfaceRequirements.Builder.class);
    }

    // Construct using com.google.actions.sdk.v2.SurfaceRequirements.newBuilder()
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
      if (minimumRequirementsBuilder_ == null) {
        minimumRequirements_ = java.util.Collections.emptyList();
      } else {
        minimumRequirements_ = null;
        minimumRequirementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.actions.sdk.v2.SurfaceProto.internal_static_google_actions_sdk_v2_SurfaceRequirements_descriptor;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.SurfaceRequirements getDefaultInstanceForType() {
      return com.google.actions.sdk.v2.SurfaceRequirements.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.SurfaceRequirements build() {
      com.google.actions.sdk.v2.SurfaceRequirements result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.actions.sdk.v2.SurfaceRequirements buildPartial() {
      com.google.actions.sdk.v2.SurfaceRequirements result = new com.google.actions.sdk.v2.SurfaceRequirements(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.actions.sdk.v2.SurfaceRequirements result) {
      if (minimumRequirementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          minimumRequirements_ = java.util.Collections.unmodifiableList(minimumRequirements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.minimumRequirements_ = minimumRequirements_;
      } else {
        result.minimumRequirements_ = minimumRequirementsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.actions.sdk.v2.SurfaceRequirements result) {
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
      if (other instanceof com.google.actions.sdk.v2.SurfaceRequirements) {
        return mergeFrom((com.google.actions.sdk.v2.SurfaceRequirements)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.actions.sdk.v2.SurfaceRequirements other) {
      if (other == com.google.actions.sdk.v2.SurfaceRequirements.getDefaultInstance()) return this;
      if (minimumRequirementsBuilder_ == null) {
        if (!other.minimumRequirements_.isEmpty()) {
          if (minimumRequirements_.isEmpty()) {
            minimumRequirements_ = other.minimumRequirements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMinimumRequirementsIsMutable();
            minimumRequirements_.addAll(other.minimumRequirements_);
          }
          onChanged();
        }
      } else {
        if (!other.minimumRequirements_.isEmpty()) {
          if (minimumRequirementsBuilder_.isEmpty()) {
            minimumRequirementsBuilder_.dispose();
            minimumRequirementsBuilder_ = null;
            minimumRequirements_ = other.minimumRequirements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            minimumRequirementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMinimumRequirementsFieldBuilder() : null;
          } else {
            minimumRequirementsBuilder_.addAllMessages(other.minimumRequirements_);
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
              com.google.actions.sdk.v2.CapabilityRequirement m =
                  input.readMessage(
                      com.google.actions.sdk.v2.CapabilityRequirement.parser(),
                      extensionRegistry);
              if (minimumRequirementsBuilder_ == null) {
                ensureMinimumRequirementsIsMutable();
                minimumRequirements_.add(m);
              } else {
                minimumRequirementsBuilder_.addMessage(m);
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

    private java.util.List<com.google.actions.sdk.v2.CapabilityRequirement> minimumRequirements_ =
      java.util.Collections.emptyList();
    private void ensureMinimumRequirementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        minimumRequirements_ = new java.util.ArrayList<com.google.actions.sdk.v2.CapabilityRequirement>(minimumRequirements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.actions.sdk.v2.CapabilityRequirement, com.google.actions.sdk.v2.CapabilityRequirement.Builder, com.google.actions.sdk.v2.CapabilityRequirementOrBuilder> minimumRequirementsBuilder_;

    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public java.util.List<com.google.actions.sdk.v2.CapabilityRequirement> getMinimumRequirementsList() {
      if (minimumRequirementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(minimumRequirements_);
      } else {
        return minimumRequirementsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public int getMinimumRequirementsCount() {
      if (minimumRequirementsBuilder_ == null) {
        return minimumRequirements_.size();
      } else {
        return minimumRequirementsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public com.google.actions.sdk.v2.CapabilityRequirement getMinimumRequirements(int index) {
      if (minimumRequirementsBuilder_ == null) {
        return minimumRequirements_.get(index);
      } else {
        return minimumRequirementsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder setMinimumRequirements(
        int index, com.google.actions.sdk.v2.CapabilityRequirement value) {
      if (minimumRequirementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.set(index, value);
        onChanged();
      } else {
        minimumRequirementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder setMinimumRequirements(
        int index, com.google.actions.sdk.v2.CapabilityRequirement.Builder builderForValue) {
      if (minimumRequirementsBuilder_ == null) {
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.set(index, builderForValue.build());
        onChanged();
      } else {
        minimumRequirementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder addMinimumRequirements(com.google.actions.sdk.v2.CapabilityRequirement value) {
      if (minimumRequirementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.add(value);
        onChanged();
      } else {
        minimumRequirementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder addMinimumRequirements(
        int index, com.google.actions.sdk.v2.CapabilityRequirement value) {
      if (minimumRequirementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.add(index, value);
        onChanged();
      } else {
        minimumRequirementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder addMinimumRequirements(
        com.google.actions.sdk.v2.CapabilityRequirement.Builder builderForValue) {
      if (minimumRequirementsBuilder_ == null) {
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.add(builderForValue.build());
        onChanged();
      } else {
        minimumRequirementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder addMinimumRequirements(
        int index, com.google.actions.sdk.v2.CapabilityRequirement.Builder builderForValue) {
      if (minimumRequirementsBuilder_ == null) {
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.add(index, builderForValue.build());
        onChanged();
      } else {
        minimumRequirementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder addAllMinimumRequirements(
        java.lang.Iterable<? extends com.google.actions.sdk.v2.CapabilityRequirement> values) {
      if (minimumRequirementsBuilder_ == null) {
        ensureMinimumRequirementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, minimumRequirements_);
        onChanged();
      } else {
        minimumRequirementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder clearMinimumRequirements() {
      if (minimumRequirementsBuilder_ == null) {
        minimumRequirements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        minimumRequirementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public Builder removeMinimumRequirements(int index) {
      if (minimumRequirementsBuilder_ == null) {
        ensureMinimumRequirementsIsMutable();
        minimumRequirements_.remove(index);
        onChanged();
      } else {
        minimumRequirementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public com.google.actions.sdk.v2.CapabilityRequirement.Builder getMinimumRequirementsBuilder(
        int index) {
      return getMinimumRequirementsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public com.google.actions.sdk.v2.CapabilityRequirementOrBuilder getMinimumRequirementsOrBuilder(
        int index) {
      if (minimumRequirementsBuilder_ == null) {
        return minimumRequirements_.get(index);  } else {
        return minimumRequirementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public java.util.List<? extends com.google.actions.sdk.v2.CapabilityRequirementOrBuilder> 
         getMinimumRequirementsOrBuilderList() {
      if (minimumRequirementsBuilder_ != null) {
        return minimumRequirementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(minimumRequirements_);
      }
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public com.google.actions.sdk.v2.CapabilityRequirement.Builder addMinimumRequirementsBuilder() {
      return getMinimumRequirementsFieldBuilder().addBuilder(
          com.google.actions.sdk.v2.CapabilityRequirement.getDefaultInstance());
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public com.google.actions.sdk.v2.CapabilityRequirement.Builder addMinimumRequirementsBuilder(
        int index) {
      return getMinimumRequirementsFieldBuilder().addBuilder(
          index, com.google.actions.sdk.v2.CapabilityRequirement.getDefaultInstance());
    }
    /**
     * <pre>
     * The minimum set of capabilities needed to invoke the Actions in your
     * project. If the surface is missing any of these, the Action will not be
     * triggered.
     * </pre>
     *
     * <code>repeated .google.actions.sdk.v2.CapabilityRequirement minimum_requirements = 1;</code>
     */
    public java.util.List<com.google.actions.sdk.v2.CapabilityRequirement.Builder> 
         getMinimumRequirementsBuilderList() {
      return getMinimumRequirementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.actions.sdk.v2.CapabilityRequirement, com.google.actions.sdk.v2.CapabilityRequirement.Builder, com.google.actions.sdk.v2.CapabilityRequirementOrBuilder> 
        getMinimumRequirementsFieldBuilder() {
      if (minimumRequirementsBuilder_ == null) {
        minimumRequirementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.actions.sdk.v2.CapabilityRequirement, com.google.actions.sdk.v2.CapabilityRequirement.Builder, com.google.actions.sdk.v2.CapabilityRequirementOrBuilder>(
                minimumRequirements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        minimumRequirements_ = null;
      }
      return minimumRequirementsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.actions.sdk.v2.SurfaceRequirements)
  }

  // @@protoc_insertion_point(class_scope:google.actions.sdk.v2.SurfaceRequirements)
  private static final com.google.actions.sdk.v2.SurfaceRequirements DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.actions.sdk.v2.SurfaceRequirements();
  }

  public static com.google.actions.sdk.v2.SurfaceRequirements getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SurfaceRequirements>
      PARSER = new com.google.protobuf.AbstractParser<SurfaceRequirements>() {
    @java.lang.Override
    public SurfaceRequirements parsePartialFrom(
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

  public static com.google.protobuf.Parser<SurfaceRequirements> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SurfaceRequirements> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.actions.sdk.v2.SurfaceRequirements getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
