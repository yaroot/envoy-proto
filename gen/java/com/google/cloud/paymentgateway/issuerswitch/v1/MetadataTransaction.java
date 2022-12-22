// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/paymentgateway/issuerswitch/v1/transactions.proto

package com.google.cloud.paymentgateway.issuerswitch.v1;

/**
 * <pre>
 * A metadata API transaction processed by the issuer switch. This
 * includes UPI APIs such as List Accounts, Balance Enquiry, etc.
 * </pre>
 *
 * Protobuf type {@code google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction}
 */
public final class MetadataTransaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction)
    MetadataTransactionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetadataTransaction.newBuilder() to construct.
  private MetadataTransaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetadataTransaction() {
    name_ = "";
    originVpa_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetadataTransaction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.paymentgateway.issuerswitch.v1.TransactionsProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_MetadataTransaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.paymentgateway.issuerswitch.v1.TransactionsProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_MetadataTransaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.class, com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the metadata transaction. This uniquely identifies the
   * transaction. Format of name is
   * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * The name of the metadata transaction. This uniquely identifies the
   * transaction. Format of name is
   * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int INFO_FIELD_NUMBER = 2;
  private com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info_;
  /**
   * <pre>
   * Information about the transaction.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <pre>
   * Information about the transaction.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
   * @return The info.
   */
  @java.lang.Override
  public com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo getInfo() {
    return info_ == null ? com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.getDefaultInstance() : info_;
  }
  /**
   * <pre>
   * Information about the transaction.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfoOrBuilder getInfoOrBuilder() {
    return info_ == null ? com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.getDefaultInstance() : info_;
  }

  public static final int ORIGIN_VPA_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object originVpa_ = "";
  /**
   * <pre>
   * Output only. Virtual Payment Address (VPA) which originated the request.
   * </pre>
   *
   * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The originVpa.
   */
  @java.lang.Override
  public java.lang.String getOriginVpa() {
    java.lang.Object ref = originVpa_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      originVpa_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Virtual Payment Address (VPA) which originated the request.
   * </pre>
   *
   * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for originVpa.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginVpaBytes() {
    java.lang.Object ref = originVpa_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      originVpa_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (info_ != null) {
      output.writeMessage(2, getInfo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originVpa_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, originVpa_);
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
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInfo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originVpa_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, originVpa_);
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
    if (!(obj instanceof com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction)) {
      return super.equals(obj);
    }
    com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction other = (com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
    if (!getOriginVpa()
        .equals(other.getOriginVpa())) return false;
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
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (37 * hash) + ORIGIN_VPA_FIELD_NUMBER;
    hash = (53 * hash) + getOriginVpa().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction parseFrom(
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
  public static Builder newBuilder(com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction prototype) {
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
   * A metadata API transaction processed by the issuer switch. This
   * includes UPI APIs such as List Accounts, Balance Enquiry, etc.
   * </pre>
   *
   * Protobuf type {@code google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction)
      com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.TransactionsProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_MetadataTransaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.TransactionsProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_MetadataTransaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.class, com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.Builder.class);
    }

    // Construct using com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.newBuilder()
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
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      originVpa_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.TransactionsProto.internal_static_google_cloud_paymentgateway_issuerswitch_v1_MetadataTransaction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction getDefaultInstanceForType() {
      return com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction build() {
      com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction buildPartial() {
      com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction result = new com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.info_ = infoBuilder_ == null
            ? info_
            : infoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.originVpa_ = originVpa_;
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
      if (other instanceof com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction) {
        return mergeFrom((com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction other) {
      if (other == com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (!other.getOriginVpa().isEmpty()) {
        originVpa_ = other.originVpa_;
        bitField0_ |= 0x00000004;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              originVpa_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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
     * The name of the metadata transaction. This uniquely identifies the
     * transaction. Format of name is
     * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the metadata transaction. This uniquely identifies the
     * transaction. Format of name is
     * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the metadata transaction. This uniquely identifies the
     * transaction. Format of name is
     * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the metadata transaction. This uniquely identifies the
     * transaction. Format of name is
     * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the metadata transaction. This uniquely identifies the
     * transaction. Format of name is
     * projects/{project_id}/metadataTransaction/{metadata_transaction_id}.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo, com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.Builder, com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfoOrBuilder> infoBuilder_;
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     * @return The info.
     */
    public com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    public Builder setInfo(com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
      } else {
        infoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    public Builder setInfo(
        com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    public Builder mergeInfo(com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo value) {
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          info_ != null &&
          info_ != com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.getDefaultInstance()) {
          getInfoBuilder().mergeFrom(value);
        } else {
          info_ = value;
        }
      } else {
        infoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    public Builder clearInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    public com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.Builder getInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    public com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <pre>
     * Information about the transaction.
     * </pre>
     *
     * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo, com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.Builder, com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo, com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.Builder, com.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private java.lang.Object originVpa_ = "";
    /**
     * <pre>
     * Output only. Virtual Payment Address (VPA) which originated the request.
     * </pre>
     *
     * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The originVpa.
     */
    public java.lang.String getOriginVpa() {
      java.lang.Object ref = originVpa_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        originVpa_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Virtual Payment Address (VPA) which originated the request.
     * </pre>
     *
     * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for originVpa.
     */
    public com.google.protobuf.ByteString
        getOriginVpaBytes() {
      java.lang.Object ref = originVpa_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        originVpa_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Virtual Payment Address (VPA) which originated the request.
     * </pre>
     *
     * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The originVpa to set.
     * @return This builder for chaining.
     */
    public Builder setOriginVpa(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      originVpa_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Virtual Payment Address (VPA) which originated the request.
     * </pre>
     *
     * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginVpa() {
      originVpa_ = getDefaultInstance().getOriginVpa();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Virtual Payment Address (VPA) which originated the request.
     * </pre>
     *
     * <code>string origin_vpa = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for originVpa to set.
     * @return This builder for chaining.
     */
    public Builder setOriginVpaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      originVpa_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction)
  private static final com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction();
  }

  public static com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataTransaction>
      PARSER = new com.google.protobuf.AbstractParser<MetadataTransaction>() {
    @java.lang.Override
    public MetadataTransaction parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetadataTransaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataTransaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

