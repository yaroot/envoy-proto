// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/paymentgateway/issuerswitch/v1/rules.proto

package com.google.cloud.paymentgateway.issuerswitch.v1;

/**
 * <pre>
 * Represent a single value in a rule's metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue}
 */
public final class RuleMetadataValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue)
    RuleMetadataValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuleMetadataValue.newBuilder() to construct.
  private RuleMetadataValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuleMetadataValue() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuleMetadataValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.paymentgateway.issuerswitch.v1.RulesProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_RuleMetadataValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.paymentgateway.issuerswitch.v1.RulesProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_RuleMetadataValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.class, com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ID(2),
    ACCOUNT_REFERENCE(3),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 2: return ID;
        case 3: return ACCOUNT_REFERENCE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Output only. The unique identifier for this resource.
   * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. The unique identifier for this resource.
   * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The value for string metadata.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return Whether the id field is set.
   */
  public boolean hasId() {
    return valueCase_ == 2;
  }
  /**
   * <pre>
   * The value for string metadata.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  public java.lang.String getId() {
    java.lang.Object ref = "";
    if (valueCase_ == 2) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 2) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The value for string metadata.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 2) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 2) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_REFERENCE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The value for account reference metadata.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
   * @return Whether the accountReference field is set.
   */
  @java.lang.Override
  public boolean hasAccountReference() {
    return valueCase_ == 3;
  }
  /**
   * <pre>
   * The value for account reference metadata.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
   * @return The accountReference.
   */
  @java.lang.Override
  public com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference getAccountReference() {
    if (valueCase_ == 3) {
       return (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_;
    }
    return com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance();
  }
  /**
   * <pre>
   * The value for account reference metadata.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.paymentgateway.issuerswitch.v1.AccountReferenceOrBuilder getAccountReferenceOrBuilder() {
    if (valueCase_ == 3) {
       return (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_;
    }
    return com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance();
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
    if (valueCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (valueCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_);
    }
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
    if (valueCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_);
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
    if (!(obj instanceof com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue)) {
      return super.equals(obj);
    }
    com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue other = (com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 2:
        if (!getId()
            .equals(other.getId())) return false;
        break;
      case 3:
        if (!getAccountReference()
            .equals(other.getAccountReference())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    switch (valueCase_) {
      case 2:
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ACCOUNT_REFERENCE_FIELD_NUMBER;
        hash = (53 * hash) + getAccountReference().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue parseFrom(
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
  public static Builder newBuilder(com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue prototype) {
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
   * Represent a single value in a rule's metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue)
      com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.RulesProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_RuleMetadataValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.RulesProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_RuleMetadataValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.class, com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.Builder.class);
    }

    // Construct using com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.newBuilder()
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
      if (accountReferenceBuilder_ != null) {
        accountReferenceBuilder_.clear();
      }
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.RulesProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_RuleMetadataValue_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue getDefaultInstanceForType() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue build() {
      com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue buildPartial() {
      com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue result = new com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
      if (valueCase_ == 3 &&
          accountReferenceBuilder_ != null) {
        result.value_ = accountReferenceBuilder_.build();
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
      if (other instanceof com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue) {
        return mergeFrom((com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue other) {
      if (other == com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getValueCase()) {
        case ID: {
          valueCase_ = 2;
          value_ = other.value_;
          onChanged();
          break;
        }
        case ACCOUNT_REFERENCE: {
          mergeAccountReference(other.getAccountReference());
          break;
        }
        case VALUE_NOT_SET: {
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 2;
              value_ = s;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAccountReferenceFieldBuilder().getBuilder(),
                  extensionRegistry);
              valueCase_ = 3;
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. The unique identifier for this resource.
     * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The unique identifier for this resource.
     * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The unique identifier for this resource.
     * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The unique identifier for this resource.
     * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The unique identifier for this resource.
     * Format: projects/{project}/rules/{rule}/metadata/{metadata}/values/{value}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    /**
     * <pre>
     * The value for string metadata.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return valueCase_ == 2;
    }
    /**
     * <pre>
     * The value for string metadata.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = "";
      if (valueCase_ == 2) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 2) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The value for string metadata.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 2) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 2) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The value for string metadata.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value for string metadata.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The value for string metadata.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference, com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.Builder, com.google.cloud.paymentgateway.issuerswitch.v1.AccountReferenceOrBuilder> accountReferenceBuilder_;
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     * @return Whether the accountReference field is set.
     */
    @java.lang.Override
    public boolean hasAccountReference() {
      return valueCase_ == 3;
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     * @return The accountReference.
     */
    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference getAccountReference() {
      if (accountReferenceBuilder_ == null) {
        if (valueCase_ == 3) {
          return (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_;
        }
        return com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance();
      } else {
        if (valueCase_ == 3) {
          return accountReferenceBuilder_.getMessage();
        }
        return com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    public Builder setAccountReference(com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference value) {
      if (accountReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        accountReferenceBuilder_.setMessage(value);
      }
      valueCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    public Builder setAccountReference(
        com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.Builder builderForValue) {
      if (accountReferenceBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        accountReferenceBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    public Builder mergeAccountReference(com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference value) {
      if (accountReferenceBuilder_ == null) {
        if (valueCase_ == 3 &&
            value_ != com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance()) {
          value_ = com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.newBuilder((com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_)
              .mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 3) {
          accountReferenceBuilder_.mergeFrom(value);
        } else {
          accountReferenceBuilder_.setMessage(value);
        }
      }
      valueCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    public Builder clearAccountReference() {
      if (accountReferenceBuilder_ == null) {
        if (valueCase_ == 3) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 3) {
          valueCase_ = 0;
          value_ = null;
        }
        accountReferenceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    public com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.Builder getAccountReferenceBuilder() {
      return getAccountReferenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.AccountReferenceOrBuilder getAccountReferenceOrBuilder() {
      if ((valueCase_ == 3) && (accountReferenceBuilder_ != null)) {
        return accountReferenceBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 3) {
          return (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_;
        }
        return com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The value for account reference metadata.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.AccountReference account_reference = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference, com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.Builder, com.google.cloud.paymentgateway.issuerswitch.v1.AccountReferenceOrBuilder> 
        getAccountReferenceFieldBuilder() {
      if (accountReferenceBuilder_ == null) {
        if (!(valueCase_ == 3)) {
          value_ = com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.getDefaultInstance();
        }
        accountReferenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference, com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference.Builder, com.google.cloud.paymentgateway.issuerswitch.v1.AccountReferenceOrBuilder>(
                (com.google.cloud.paymentgateway.issuerswitch.v1.AccountReference) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 3;
      onChanged();
      return accountReferenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue)
  private static final com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue();
  }

  public static com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuleMetadataValue>
      PARSER = new com.google.protobuf.AbstractParser<RuleMetadataValue>() {
    @java.lang.Override
    public RuleMetadataValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuleMetadataValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuleMetadataValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.paymentgateway.issuerswitch.v1.RuleMetadataValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
