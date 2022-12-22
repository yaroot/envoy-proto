// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

/**
 * <pre>
 * One delta entry for Binding. Each individual change (only one member in each
 * entry) to a binding will be a separate entry.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.BindingDelta}
 */
public final class BindingDelta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.BindingDelta)
    BindingDeltaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BindingDelta.newBuilder() to construct.
  private BindingDelta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BindingDelta() {
    action_ = 0;
    role_ = "";
    member_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BindingDelta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_BindingDelta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_BindingDelta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v1.BindingDelta.class, com.google.iam.v1.BindingDelta.Builder.class);
  }

  /**
   * <pre>
   * The type of action performed on a Binding in a policy.
   * </pre>
   *
   * Protobuf enum {@code google.iam.v1.BindingDelta.Action}
   */
  public enum Action
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>ACTION_UNSPECIFIED = 0;</code>
     */
    ACTION_UNSPECIFIED(0),
    /**
     * <pre>
     * Addition of a Binding.
     * </pre>
     *
     * <code>ADD = 1;</code>
     */
    ADD(1),
    /**
     * <pre>
     * Removal of a Binding.
     * </pre>
     *
     * <code>REMOVE = 2;</code>
     */
    REMOVE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>ACTION_UNSPECIFIED = 0;</code>
     */
    public static final int ACTION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Addition of a Binding.
     * </pre>
     *
     * <code>ADD = 1;</code>
     */
    public static final int ADD_VALUE = 1;
    /**
     * <pre>
     * Removal of a Binding.
     * </pre>
     *
     * <code>REMOVE = 2;</code>
     */
    public static final int REMOVE_VALUE = 2;


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
    public static Action valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Action forNumber(int value) {
      switch (value) {
        case 0: return ACTION_UNSPECIFIED;
        case 1: return ADD;
        case 2: return REMOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Action>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Action> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Action>() {
            public Action findValueByNumber(int number) {
              return Action.forNumber(number);
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
      return com.google.iam.v1.BindingDelta.getDescriptor().getEnumTypes().get(0);
    }

    private static final Action[] VALUES = values();

    public static Action valueOf(
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

    private Action(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.iam.v1.BindingDelta.Action)
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_ = 0;
  /**
   * <pre>
   * The action that was performed on a Binding.
   * Required
   * </pre>
   *
   * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <pre>
   * The action that was performed on a Binding.
   * Required
   * </pre>
   *
   * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
   * @return The action.
   */
  @java.lang.Override public com.google.iam.v1.BindingDelta.Action getAction() {
    com.google.iam.v1.BindingDelta.Action result = com.google.iam.v1.BindingDelta.Action.forNumber(action_);
    return result == null ? com.google.iam.v1.BindingDelta.Action.UNRECOGNIZED : result;
  }

  public static final int ROLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object role_ = "";
  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>string role = 2;</code>
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>string role = 2;</code>
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMBER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object member_ = "";
  /**
   * <pre>
   * A single identity requesting access for a Cloud Platform resource.
   * Follows the same format of Binding.members.
   * Required
   * </pre>
   *
   * <code>string member = 3;</code>
   * @return The member.
   */
  @java.lang.Override
  public java.lang.String getMember() {
    java.lang.Object ref = member_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      member_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A single identity requesting access for a Cloud Platform resource.
   * Follows the same format of Binding.members.
   * Required
   * </pre>
   *
   * <code>string member = 3;</code>
   * @return The bytes for member.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemberBytes() {
    java.lang.Object ref = member_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      member_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONDITION_FIELD_NUMBER = 4;
  private com.google.type.Expr condition_;
  /**
   * <pre>
   * The condition that is associated with this binding.
   * </pre>
   *
   * <code>.google.type.Expr condition = 4;</code>
   * @return Whether the condition field is set.
   */
  @java.lang.Override
  public boolean hasCondition() {
    return condition_ != null;
  }
  /**
   * <pre>
   * The condition that is associated with this binding.
   * </pre>
   *
   * <code>.google.type.Expr condition = 4;</code>
   * @return The condition.
   */
  @java.lang.Override
  public com.google.type.Expr getCondition() {
    return condition_ == null ? com.google.type.Expr.getDefaultInstance() : condition_;
  }
  /**
   * <pre>
   * The condition that is associated with this binding.
   * </pre>
   *
   * <code>.google.type.Expr condition = 4;</code>
   */
  @java.lang.Override
  public com.google.type.ExprOrBuilder getConditionOrBuilder() {
    return condition_ == null ? com.google.type.Expr.getDefaultInstance() : condition_;
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
    if (action_ != com.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, role_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(member_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, member_);
    }
    if (condition_ != null) {
      output.writeMessage(4, getCondition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != com.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, role_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(member_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, member_);
    }
    if (condition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCondition());
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
    if (!(obj instanceof com.google.iam.v1.BindingDelta)) {
      return super.equals(obj);
    }
    com.google.iam.v1.BindingDelta other = (com.google.iam.v1.BindingDelta) obj;

    if (action_ != other.action_) return false;
    if (!getRole()
        .equals(other.getRole())) return false;
    if (!getMember()
        .equals(other.getMember())) return false;
    if (hasCondition() != other.hasCondition()) return false;
    if (hasCondition()) {
      if (!getCondition()
          .equals(other.getCondition())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    hash = (37 * hash) + MEMBER_FIELD_NUMBER;
    hash = (53 * hash) + getMember().hashCode();
    if (hasCondition()) {
      hash = (37 * hash) + CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getCondition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v1.BindingDelta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.BindingDelta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.BindingDelta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.BindingDelta parseFrom(
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
  public static Builder newBuilder(com.google.iam.v1.BindingDelta prototype) {
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
   * One delta entry for Binding. Each individual change (only one member in each
   * entry) to a binding will be a separate entry.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.BindingDelta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.BindingDelta)
      com.google.iam.v1.BindingDeltaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_BindingDelta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_BindingDelta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v1.BindingDelta.class, com.google.iam.v1.BindingDelta.Builder.class);
    }

    // Construct using com.google.iam.v1.BindingDelta.newBuilder()
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
      action_ = 0;
      role_ = "";
      member_ = "";
      condition_ = null;
      if (conditionBuilder_ != null) {
        conditionBuilder_.dispose();
        conditionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_BindingDelta_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v1.BindingDelta getDefaultInstanceForType() {
      return com.google.iam.v1.BindingDelta.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v1.BindingDelta build() {
      com.google.iam.v1.BindingDelta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v1.BindingDelta buildPartial() {
      com.google.iam.v1.BindingDelta result = new com.google.iam.v1.BindingDelta(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.v1.BindingDelta result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.role_ = role_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.member_ = member_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.condition_ = conditionBuilder_ == null
            ? condition_
            : conditionBuilder_.build();
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
      if (other instanceof com.google.iam.v1.BindingDelta) {
        return mergeFrom((com.google.iam.v1.BindingDelta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v1.BindingDelta other) {
      if (other == com.google.iam.v1.BindingDelta.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMember().isEmpty()) {
        member_ = other.member_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasCondition()) {
        mergeCondition(other.getCondition());
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
              action_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              role_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              member_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getConditionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int action_ = 0;
    /**
     * <pre>
     * The action that was performed on a Binding.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <pre>
     * The action that was performed on a Binding.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action that was performed on a Binding.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
     * @return The action.
     */
    @java.lang.Override
    public com.google.iam.v1.BindingDelta.Action getAction() {
      com.google.iam.v1.BindingDelta.Action result = com.google.iam.v1.BindingDelta.Action.forNumber(action_);
      return result == null ? com.google.iam.v1.BindingDelta.Action.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The action that was performed on a Binding.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.google.iam.v1.BindingDelta.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action that was performed on a Binding.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.BindingDelta.Action action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object role_ = "";
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 2;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      role_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      role_ = getDefaultInstance().getRole();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 2;</code>
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      role_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object member_ = "";
    /**
     * <pre>
     * A single identity requesting access for a Cloud Platform resource.
     * Follows the same format of Binding.members.
     * Required
     * </pre>
     *
     * <code>string member = 3;</code>
     * @return The member.
     */
    public java.lang.String getMember() {
      java.lang.Object ref = member_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        member_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A single identity requesting access for a Cloud Platform resource.
     * Follows the same format of Binding.members.
     * Required
     * </pre>
     *
     * <code>string member = 3;</code>
     * @return The bytes for member.
     */
    public com.google.protobuf.ByteString
        getMemberBytes() {
      java.lang.Object ref = member_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        member_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A single identity requesting access for a Cloud Platform resource.
     * Follows the same format of Binding.members.
     * Required
     * </pre>
     *
     * <code>string member = 3;</code>
     * @param value The member to set.
     * @return This builder for chaining.
     */
    public Builder setMember(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      member_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A single identity requesting access for a Cloud Platform resource.
     * Follows the same format of Binding.members.
     * Required
     * </pre>
     *
     * <code>string member = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMember() {
      member_ = getDefaultInstance().getMember();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A single identity requesting access for a Cloud Platform resource.
     * Follows the same format of Binding.members.
     * Required
     * </pre>
     *
     * <code>string member = 3;</code>
     * @param value The bytes for member to set.
     * @return This builder for chaining.
     */
    public Builder setMemberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      member_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.type.Expr condition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder> conditionBuilder_;
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     * @return Whether the condition field is set.
     */
    public boolean hasCondition() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     * @return The condition.
     */
    public com.google.type.Expr getCondition() {
      if (conditionBuilder_ == null) {
        return condition_ == null ? com.google.type.Expr.getDefaultInstance() : condition_;
      } else {
        return conditionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    public Builder setCondition(com.google.type.Expr value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        condition_ = value;
      } else {
        conditionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    public Builder setCondition(
        com.google.type.Expr.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        condition_ = builderForValue.build();
      } else {
        conditionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    public Builder mergeCondition(com.google.type.Expr value) {
      if (conditionBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          condition_ != null &&
          condition_ != com.google.type.Expr.getDefaultInstance()) {
          getConditionBuilder().mergeFrom(value);
        } else {
          condition_ = value;
        }
      } else {
        conditionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    public Builder clearCondition() {
      bitField0_ = (bitField0_ & ~0x00000008);
      condition_ = null;
      if (conditionBuilder_ != null) {
        conditionBuilder_.dispose();
        conditionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    public com.google.type.Expr.Builder getConditionBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getConditionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    public com.google.type.ExprOrBuilder getConditionOrBuilder() {
      if (conditionBuilder_ != null) {
        return conditionBuilder_.getMessageOrBuilder();
      } else {
        return condition_ == null ?
            com.google.type.Expr.getDefaultInstance() : condition_;
      }
    }
    /**
     * <pre>
     * The condition that is associated with this binding.
     * </pre>
     *
     * <code>.google.type.Expr condition = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder> 
        getConditionFieldBuilder() {
      if (conditionBuilder_ == null) {
        conditionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder>(
                getCondition(),
                getParentForChildren(),
                isClean());
        condition_ = null;
      }
      return conditionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.iam.v1.BindingDelta)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.BindingDelta)
  private static final com.google.iam.v1.BindingDelta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.v1.BindingDelta();
  }

  public static com.google.iam.v1.BindingDelta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BindingDelta>
      PARSER = new com.google.protobuf.AbstractParser<BindingDelta>() {
    @java.lang.Override
    public BindingDelta parsePartialFrom(
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

  public static com.google.protobuf.Parser<BindingDelta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BindingDelta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v1.BindingDelta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

