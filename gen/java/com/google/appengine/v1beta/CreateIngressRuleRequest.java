// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/appengine.proto

package com.google.appengine.v1beta;

/**
 * <pre>
 * Request message for `Firewall.CreateIngressRule`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1beta.CreateIngressRuleRequest}
 */
public final class CreateIngressRuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1beta.CreateIngressRuleRequest)
    CreateIngressRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateIngressRuleRequest.newBuilder() to construct.
  private CreateIngressRuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateIngressRuleRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateIngressRuleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1beta.AppengineProto.internal_static_google_appengine_v1beta_CreateIngressRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1beta.AppengineProto.internal_static_google_appengine_v1beta_CreateIngressRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1beta.CreateIngressRuleRequest.class, com.google.appengine.v1beta.CreateIngressRuleRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Name of the parent Firewall collection in which to create a new rule.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the parent Firewall collection in which to create a new rule.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_FIELD_NUMBER = 2;
  private com.google.appengine.v1beta.firewall.FirewallRule rule_;
  /**
   * <pre>
   * A FirewallRule containing the new resource.
   * The user may optionally provide a position at which the new rule will be
   * placed. The positions define a sequential list starting at 1. If a rule
   * already exists at the given position, rules greater than the provided
   * position will be moved forward by one.
   * If no position is provided, the server will place the rule as the second to
   * last rule in the sequence before the required default allow-all or deny-all
   * rule.
   * </pre>
   *
   * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return rule_ != null;
  }
  /**
   * <pre>
   * A FirewallRule containing the new resource.
   * The user may optionally provide a position at which the new rule will be
   * placed. The positions define a sequential list starting at 1. If a rule
   * already exists at the given position, rules greater than the provided
   * position will be moved forward by one.
   * If no position is provided, the server will place the rule as the second to
   * last rule in the sequence before the required default allow-all or deny-all
   * rule.
   * </pre>
   *
   * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
   * @return The rule.
   */
  @java.lang.Override
  public com.google.appengine.v1beta.firewall.FirewallRule getRule() {
    return rule_ == null ? com.google.appengine.v1beta.firewall.FirewallRule.getDefaultInstance() : rule_;
  }
  /**
   * <pre>
   * A FirewallRule containing the new resource.
   * The user may optionally provide a position at which the new rule will be
   * placed. The positions define a sequential list starting at 1. If a rule
   * already exists at the given position, rules greater than the provided
   * position will be moved forward by one.
   * If no position is provided, the server will place the rule as the second to
   * last rule in the sequence before the required default allow-all or deny-all
   * rule.
   * </pre>
   *
   * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder getRuleOrBuilder() {
    return rule_ == null ? com.google.appengine.v1beta.firewall.FirewallRule.getDefaultInstance() : rule_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (rule_ != null) {
      output.writeMessage(2, getRule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (rule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRule());
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
    if (!(obj instanceof com.google.appengine.v1beta.CreateIngressRuleRequest)) {
      return super.equals(obj);
    }
    com.google.appengine.v1beta.CreateIngressRuleRequest other = (com.google.appengine.v1beta.CreateIngressRuleRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule()
          .equals(other.getRule())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.CreateIngressRuleRequest parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1beta.CreateIngressRuleRequest prototype) {
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
   * Request message for `Firewall.CreateIngressRule`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1beta.CreateIngressRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1beta.CreateIngressRuleRequest)
      com.google.appengine.v1beta.CreateIngressRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1beta.AppengineProto.internal_static_google_appengine_v1beta_CreateIngressRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1beta.AppengineProto.internal_static_google_appengine_v1beta_CreateIngressRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1beta.CreateIngressRuleRequest.class, com.google.appengine.v1beta.CreateIngressRuleRequest.Builder.class);
    }

    // Construct using com.google.appengine.v1beta.CreateIngressRuleRequest.newBuilder()
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
      parent_ = "";
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1beta.AppengineProto.internal_static_google_appengine_v1beta_CreateIngressRuleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.CreateIngressRuleRequest getDefaultInstanceForType() {
      return com.google.appengine.v1beta.CreateIngressRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1beta.CreateIngressRuleRequest build() {
      com.google.appengine.v1beta.CreateIngressRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.CreateIngressRuleRequest buildPartial() {
      com.google.appengine.v1beta.CreateIngressRuleRequest result = new com.google.appengine.v1beta.CreateIngressRuleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1beta.CreateIngressRuleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rule_ = ruleBuilder_ == null
            ? rule_
            : ruleBuilder_.build();
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
      if (other instanceof com.google.appengine.v1beta.CreateIngressRuleRequest) {
        return mergeFrom((com.google.appengine.v1beta.CreateIngressRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1beta.CreateIngressRuleRequest other) {
      if (other == com.google.appengine.v1beta.CreateIngressRuleRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRule()) {
        mergeRule(other.getRule());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Name of the parent Firewall collection in which to create a new rule.
     * Example: `apps/myapp/firewall/ingressRules`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the parent Firewall collection in which to create a new rule.
     * Example: `apps/myapp/firewall/ingressRules`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the parent Firewall collection in which to create a new rule.
     * Example: `apps/myapp/firewall/ingressRules`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the parent Firewall collection in which to create a new rule.
     * Example: `apps/myapp/firewall/ingressRules`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the parent Firewall collection in which to create a new rule.
     * Example: `apps/myapp/firewall/ingressRules`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.appengine.v1beta.firewall.FirewallRule rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.appengine.v1beta.firewall.FirewallRule, com.google.appengine.v1beta.firewall.FirewallRule.Builder, com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder> ruleBuilder_;
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     * @return The rule.
     */
    public com.google.appengine.v1beta.firewall.FirewallRule getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null ? com.google.appengine.v1beta.firewall.FirewallRule.getDefaultInstance() : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    public Builder setRule(com.google.appengine.v1beta.firewall.FirewallRule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
      } else {
        ruleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    public Builder setRule(
        com.google.appengine.v1beta.firewall.FirewallRule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    public Builder mergeRule(com.google.appengine.v1beta.firewall.FirewallRule value) {
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          rule_ != null &&
          rule_ != com.google.appengine.v1beta.firewall.FirewallRule.getDefaultInstance()) {
          getRuleBuilder().mergeFrom(value);
        } else {
          rule_ = value;
        }
      } else {
        ruleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    public Builder clearRule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    public com.google.appengine.v1beta.firewall.FirewallRule.Builder getRuleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    public com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null ?
            com.google.appengine.v1beta.firewall.FirewallRule.getDefaultInstance() : rule_;
      }
    }
    /**
     * <pre>
     * A FirewallRule containing the new resource.
     * The user may optionally provide a position at which the new rule will be
     * placed. The positions define a sequential list starting at 1. If a rule
     * already exists at the given position, rules greater than the provided
     * position will be moved forward by one.
     * If no position is provided, the server will place the rule as the second to
     * last rule in the sequence before the required default allow-all or deny-all
     * rule.
     * </pre>
     *
     * <code>.google.appengine.v1beta.FirewallRule rule = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.appengine.v1beta.firewall.FirewallRule, com.google.appengine.v1beta.firewall.FirewallRule.Builder, com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1beta.firewall.FirewallRule, com.google.appengine.v1beta.firewall.FirewallRule.Builder, com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder>(
                getRule(),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1beta.CreateIngressRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1beta.CreateIngressRuleRequest)
  private static final com.google.appengine.v1beta.CreateIngressRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1beta.CreateIngressRuleRequest();
  }

  public static com.google.appengine.v1beta.CreateIngressRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateIngressRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateIngressRuleRequest>() {
    @java.lang.Override
    public CreateIngressRuleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateIngressRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateIngressRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1beta.CreateIngressRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

