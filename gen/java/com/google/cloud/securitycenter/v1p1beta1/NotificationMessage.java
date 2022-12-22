// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/notification_message.proto

package com.google.cloud.securitycenter.v1p1beta1;

/**
 * <pre>
 * Security Command Center's Notification
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.NotificationMessage}
 */
public final class NotificationMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1p1beta1.NotificationMessage)
    NotificationMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotificationMessage.newBuilder() to construct.
  private NotificationMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotificationMessage() {
    notificationConfigName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NotificationMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1p1beta1.NotificationMessageOuterClass.internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1p1beta1.NotificationMessageOuterClass.internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.class, com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.Builder.class);
  }

  private int eventCase_ = 0;
  private java.lang.Object event_;
  public enum EventCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FINDING(2),
    EVENT_NOT_SET(0);
    private final int value;
    private EventCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventCase valueOf(int value) {
      return forNumber(value);
    }

    public static EventCase forNumber(int value) {
      switch (value) {
        case 2: return FINDING;
        case 0: return EVENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EventCase
  getEventCase() {
    return EventCase.forNumber(
        eventCase_);
  }

  public static final int NOTIFICATION_CONFIG_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notificationConfigName_ = "";
  /**
   * <pre>
   * Name of the notification config that generated current notification.
   * </pre>
   *
   * <code>string notification_config_name = 1;</code>
   * @return The notificationConfigName.
   */
  @java.lang.Override
  public java.lang.String getNotificationConfigName() {
    java.lang.Object ref = notificationConfigName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notificationConfigName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the notification config that generated current notification.
   * </pre>
   *
   * <code>string notification_config_name = 1;</code>
   * @return The bytes for notificationConfigName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotificationConfigNameBytes() {
    java.lang.Object ref = notificationConfigName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notificationConfigName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINDING_FIELD_NUMBER = 2;
  /**
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
   * @return Whether the finding field is set.
   */
  @java.lang.Override
  public boolean hasFinding() {
    return eventCase_ == 2;
  }
  /**
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
   * @return The finding.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.Finding getFinding() {
    if (eventCase_ == 2) {
       return (com.google.cloud.securitycenter.v1p1beta1.Finding) event_;
    }
    return com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance();
  }
  /**
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder getFindingOrBuilder() {
    if (eventCase_ == 2) {
       return (com.google.cloud.securitycenter.v1p1beta1.Finding) event_;
    }
    return com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance();
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.securitycenter.v1p1beta1.Resource resource_;
  /**
   * <pre>
   * The Cloud resource tied to the notification.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * The Cloud resource tied to the notification.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.Resource getResource() {
    return resource_ == null ? com.google.cloud.securitycenter.v1p1beta1.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * The Cloud resource tied to the notification.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.ResourceOrBuilder getResourceOrBuilder() {
    return resource_ == null ? com.google.cloud.securitycenter.v1p1beta1.Resource.getDefaultInstance() : resource_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notificationConfigName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notificationConfigName_);
    }
    if (eventCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.securitycenter.v1p1beta1.Finding) event_);
    }
    if (resource_ != null) {
      output.writeMessage(3, getResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notificationConfigName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, notificationConfigName_);
    }
    if (eventCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.securitycenter.v1p1beta1.Finding) event_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResource());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1p1beta1.NotificationMessage)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1p1beta1.NotificationMessage other = (com.google.cloud.securitycenter.v1p1beta1.NotificationMessage) obj;

    if (!getNotificationConfigName()
        .equals(other.getNotificationConfigName())) return false;
    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
    }
    if (!getEventCase().equals(other.getEventCase())) return false;
    switch (eventCase_) {
      case 2:
        if (!getFinding()
            .equals(other.getFinding())) return false;
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
    hash = (37 * hash) + NOTIFICATION_CONFIG_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationConfigName().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    switch (eventCase_) {
      case 2:
        hash = (37 * hash) + FINDING_FIELD_NUMBER;
        hash = (53 * hash) + getFinding().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1p1beta1.NotificationMessage prototype) {
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
   * Security Command Center's Notification
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.NotificationMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1p1beta1.NotificationMessage)
      com.google.cloud.securitycenter.v1p1beta1.NotificationMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1p1beta1.NotificationMessageOuterClass.internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1p1beta1.NotificationMessageOuterClass.internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.class, com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.newBuilder()
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
      notificationConfigName_ = "";
      if (findingBuilder_ != null) {
        findingBuilder_.clear();
      }
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      eventCase_ = 0;
      event_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1p1beta1.NotificationMessageOuterClass.internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.NotificationMessage getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.NotificationMessage build() {
      com.google.cloud.securitycenter.v1p1beta1.NotificationMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.NotificationMessage buildPartial() {
      com.google.cloud.securitycenter.v1p1beta1.NotificationMessage result = new com.google.cloud.securitycenter.v1p1beta1.NotificationMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1p1beta1.NotificationMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.notificationConfigName_ = notificationConfigName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resourceBuilder_ == null
            ? resource_
            : resourceBuilder_.build();
      }
    }

    private void buildPartialOneofs(com.google.cloud.securitycenter.v1p1beta1.NotificationMessage result) {
      result.eventCase_ = eventCase_;
      result.event_ = this.event_;
      if (eventCase_ == 2 &&
          findingBuilder_ != null) {
        result.event_ = findingBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1p1beta1.NotificationMessage) {
        return mergeFrom((com.google.cloud.securitycenter.v1p1beta1.NotificationMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1p1beta1.NotificationMessage other) {
      if (other == com.google.cloud.securitycenter.v1p1beta1.NotificationMessage.getDefaultInstance()) return this;
      if (!other.getNotificationConfigName().isEmpty()) {
        notificationConfigName_ = other.notificationConfigName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      switch (other.getEventCase()) {
        case FINDING: {
          mergeFinding(other.getFinding());
          break;
        }
        case EVENT_NOT_SET: {
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
              notificationConfigName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFindingFieldBuilder().getBuilder(),
                  extensionRegistry);
              eventCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
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
    private int eventCase_ = 0;
    private java.lang.Object event_;
    public EventCase
        getEventCase() {
      return EventCase.forNumber(
          eventCase_);
    }

    public Builder clearEvent() {
      eventCase_ = 0;
      event_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object notificationConfigName_ = "";
    /**
     * <pre>
     * Name of the notification config that generated current notification.
     * </pre>
     *
     * <code>string notification_config_name = 1;</code>
     * @return The notificationConfigName.
     */
    public java.lang.String getNotificationConfigName() {
      java.lang.Object ref = notificationConfigName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notificationConfigName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the notification config that generated current notification.
     * </pre>
     *
     * <code>string notification_config_name = 1;</code>
     * @return The bytes for notificationConfigName.
     */
    public com.google.protobuf.ByteString
        getNotificationConfigNameBytes() {
      java.lang.Object ref = notificationConfigName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notificationConfigName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the notification config that generated current notification.
     * </pre>
     *
     * <code>string notification_config_name = 1;</code>
     * @param value The notificationConfigName to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationConfigName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notificationConfigName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the notification config that generated current notification.
     * </pre>
     *
     * <code>string notification_config_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotificationConfigName() {
      notificationConfigName_ = getDefaultInstance().getNotificationConfigName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the notification config that generated current notification.
     * </pre>
     *
     * <code>string notification_config_name = 1;</code>
     * @param value The bytes for notificationConfigName to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationConfigNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notificationConfigName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.Finding, com.google.cloud.securitycenter.v1p1beta1.Finding.Builder, com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder> findingBuilder_;
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     * @return Whether the finding field is set.
     */
    @java.lang.Override
    public boolean hasFinding() {
      return eventCase_ == 2;
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     * @return The finding.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.Finding getFinding() {
      if (findingBuilder_ == null) {
        if (eventCase_ == 2) {
          return (com.google.cloud.securitycenter.v1p1beta1.Finding) event_;
        }
        return com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance();
      } else {
        if (eventCase_ == 2) {
          return findingBuilder_.getMessage();
        }
        return com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    public Builder setFinding(com.google.cloud.securitycenter.v1p1beta1.Finding value) {
      if (findingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        findingBuilder_.setMessage(value);
      }
      eventCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    public Builder setFinding(
        com.google.cloud.securitycenter.v1p1beta1.Finding.Builder builderForValue) {
      if (findingBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        findingBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    public Builder mergeFinding(com.google.cloud.securitycenter.v1p1beta1.Finding value) {
      if (findingBuilder_ == null) {
        if (eventCase_ == 2 &&
            event_ != com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance()) {
          event_ = com.google.cloud.securitycenter.v1p1beta1.Finding.newBuilder((com.google.cloud.securitycenter.v1p1beta1.Finding) event_)
              .mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 2) {
          findingBuilder_.mergeFrom(value);
        } else {
          findingBuilder_.setMessage(value);
        }
      }
      eventCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    public Builder clearFinding() {
      if (findingBuilder_ == null) {
        if (eventCase_ == 2) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 2) {
          eventCase_ = 0;
          event_ = null;
        }
        findingBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.Finding.Builder getFindingBuilder() {
      return getFindingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder getFindingOrBuilder() {
      if ((eventCase_ == 2) && (findingBuilder_ != null)) {
        return findingBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 2) {
          return (com.google.cloud.securitycenter.v1p1beta1.Finding) event_;
        }
        return com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If it's a Finding based notification config, this field will be
     * populated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.Finding, com.google.cloud.securitycenter.v1p1beta1.Finding.Builder, com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder> 
        getFindingFieldBuilder() {
      if (findingBuilder_ == null) {
        if (!(eventCase_ == 2)) {
          event_ = com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance();
        }
        findingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1p1beta1.Finding, com.google.cloud.securitycenter.v1p1beta1.Finding.Builder, com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder>(
                (com.google.cloud.securitycenter.v1p1beta1.Finding) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 2;
      onChanged();
      return findingBuilder_;
    }

    private com.google.cloud.securitycenter.v1p1beta1.Resource resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.Resource, com.google.cloud.securitycenter.v1p1beta1.Resource.Builder, com.google.cloud.securitycenter.v1p1beta1.ResourceOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     * @return The resource.
     */
    public com.google.cloud.securitycenter.v1p1beta1.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.cloud.securitycenter.v1p1beta1.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    public Builder setResource(com.google.cloud.securitycenter.v1p1beta1.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    public Builder setResource(
        com.google.cloud.securitycenter.v1p1beta1.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    public Builder mergeResource(com.google.cloud.securitycenter.v1p1beta1.Resource value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          resource_ != null &&
          resource_ != com.google.cloud.securitycenter.v1p1beta1.Resource.getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.Resource.Builder getResourceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.google.cloud.securitycenter.v1p1beta1.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <pre>
     * The Cloud resource tied to the notification.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Resource resource = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.Resource, com.google.cloud.securitycenter.v1p1beta1.Resource.Builder, com.google.cloud.securitycenter.v1p1beta1.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1p1beta1.Resource, com.google.cloud.securitycenter.v1p1beta1.Resource.Builder, com.google.cloud.securitycenter.v1p1beta1.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1p1beta1.NotificationMessage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1p1beta1.NotificationMessage)
  private static final com.google.cloud.securitycenter.v1p1beta1.NotificationMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1p1beta1.NotificationMessage();
  }

  public static com.google.cloud.securitycenter.v1p1beta1.NotificationMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificationMessage>
      PARSER = new com.google.protobuf.AbstractParser<NotificationMessage>() {
    @java.lang.Override
    public NotificationMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<NotificationMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificationMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.NotificationMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

