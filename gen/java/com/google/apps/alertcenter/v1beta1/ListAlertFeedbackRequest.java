// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/alertcenter/v1beta1/alertcenter.proto

package com.google.apps.alertcenter.v1beta1;

/**
 * <pre>
 * An alert feedback listing request.
 * </pre>
 *
 * Protobuf type {@code google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest}
 */
public final class ListAlertFeedbackRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest)
    ListAlertFeedbackRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAlertFeedbackRequest.newBuilder() to construct.
  private ListAlertFeedbackRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAlertFeedbackRequest() {
    customerId_ = "";
    alertId_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAlertFeedbackRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_ListAlertFeedbackRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_ListAlertFeedbackRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.class, com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Optional. The unique identifier of the Google Workspace organization
   * account of the customer the alert feedback are associated with.
   * Inferred from the caller identity if not provided.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The unique identifier of the Google Workspace organization
   * account of the customer the alert feedback are associated with.
   * Inferred from the caller identity if not provided.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALERT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alertId_ = "";
  /**
   * <pre>
   * Required. The alert identifier.
   * The "-" wildcard could be used to represent all alerts.
   * </pre>
   *
   * <code>string alert_id = 2;</code>
   * @return The alertId.
   */
  @java.lang.Override
  public java.lang.String getAlertId() {
    java.lang.Object ref = alertId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alertId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The alert identifier.
   * The "-" wildcard could be used to represent all alerts.
   * </pre>
   *
   * <code>string alert_id = 2;</code>
   * @return The bytes for alertId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlertIdBytes() {
    java.lang.Object ref = alertId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alertId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   * <pre>
   * Optional. A query string for filtering alert feedback results.
   * For more details, see [Query
   * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
   * query filter
   * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
   * </pre>
   *
   * <code>string filter = 3;</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. A query string for filtering alert feedback results.
   * For more details, see [Query
   * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
   * query filter
   * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
   * </pre>
   *
   * <code>string filter = 3;</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alertId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alertId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alertId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alertId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
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
    if (!(obj instanceof com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest)) {
      return super.equals(obj);
    }
    com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest other = (com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getAlertId()
        .equals(other.getAlertId())) return false;
    if (!getFilter()
        .equals(other.getFilter())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + ALERT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAlertId().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest parseFrom(
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
  public static Builder newBuilder(com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest prototype) {
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
   * An alert feedback listing request.
   * </pre>
   *
   * Protobuf type {@code google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest)
      com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_ListAlertFeedbackRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_ListAlertFeedbackRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.class, com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.Builder.class);
    }

    // Construct using com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.newBuilder()
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
      customerId_ = "";
      alertId_ = "";
      filter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.alertcenter.v1beta1.AlertCenterProto.internal_static_google_apps_alertcenter_v1beta1_ListAlertFeedbackRequest_descriptor;
    }

    @java.lang.Override
    public com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest getDefaultInstanceForType() {
      return com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest build() {
      com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest buildPartial() {
      com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest result = new com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.alertId_ = alertId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.filter_ = filter_;
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
      if (other instanceof com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest) {
        return mergeFrom((com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest other) {
      if (other == com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAlertId().isEmpty()) {
        alertId_ = other.alertId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
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
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              alertId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              filter_ = input.readStringRequireUtf8();
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert feedback are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert feedback are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert feedback are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert feedback are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The unique identifier of the Google Workspace organization
     * account of the customer the alert feedback are associated with.
     * Inferred from the caller identity if not provided.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object alertId_ = "";
    /**
     * <pre>
     * Required. The alert identifier.
     * The "-" wildcard could be used to represent all alerts.
     * </pre>
     *
     * <code>string alert_id = 2;</code>
     * @return The alertId.
     */
    public java.lang.String getAlertId() {
      java.lang.Object ref = alertId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alertId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The alert identifier.
     * The "-" wildcard could be used to represent all alerts.
     * </pre>
     *
     * <code>string alert_id = 2;</code>
     * @return The bytes for alertId.
     */
    public com.google.protobuf.ByteString
        getAlertIdBytes() {
      java.lang.Object ref = alertId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alertId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The alert identifier.
     * The "-" wildcard could be used to represent all alerts.
     * </pre>
     *
     * <code>string alert_id = 2;</code>
     * @param value The alertId to set.
     * @return This builder for chaining.
     */
    public Builder setAlertId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alertId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The alert identifier.
     * The "-" wildcard could be used to represent all alerts.
     * </pre>
     *
     * <code>string alert_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlertId() {
      alertId_ = getDefaultInstance().getAlertId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The alert identifier.
     * The "-" wildcard could be used to represent all alerts.
     * </pre>
     *
     * <code>string alert_id = 2;</code>
     * @param value The bytes for alertId to set.
     * @return This builder for chaining.
     */
    public Builder setAlertIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alertId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * Optional. A query string for filtering alert feedback results.
     * For more details, see [Query
     * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
     * query filter
     * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. A query string for filtering alert feedback results.
     * For more details, see [Query
     * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
     * query filter
     * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. A query string for filtering alert feedback results.
     * For more details, see [Query
     * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
     * query filter
     * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      filter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A query string for filtering alert feedback results.
     * For more details, see [Query
     * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
     * query filter
     * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A query string for filtering alert feedback results.
     * For more details, see [Query
     * filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported
     * query filter
     * fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      filter_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest)
  }

  // @@protoc_insertion_point(class_scope:google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest)
  private static final com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest();
  }

  public static com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAlertFeedbackRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListAlertFeedbackRequest>() {
    @java.lang.Override
    public ListAlertFeedbackRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAlertFeedbackRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAlertFeedbackRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
