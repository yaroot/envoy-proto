// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 * <pre>
 * Request message for CreateFirebaseLink RPC
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.CreateFirebaseLinkRequest}
 */
public final class CreateFirebaseLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.CreateFirebaseLinkRequest)
    CreateFirebaseLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFirebaseLinkRequest.newBuilder() to construct.
  private CreateFirebaseLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFirebaseLinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFirebaseLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_CreateFirebaseLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_CreateFirebaseLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.class, com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Format: properties/{property_id}
   * Example: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
   * Required. Format: properties/{property_id}
   * Example: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

  public static final int FIREBASE_LINK_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1beta.FirebaseLink firebaseLink_;
  /**
   * <pre>
   * Required. The Firebase link to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the firebaseLink field is set.
   */
  @java.lang.Override
  public boolean hasFirebaseLink() {
    return firebaseLink_ != null;
  }
  /**
   * <pre>
   * Required. The Firebase link to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The firebaseLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.FirebaseLink getFirebaseLink() {
    return firebaseLink_ == null ? com.google.analytics.admin.v1beta.FirebaseLink.getDefaultInstance() : firebaseLink_;
  }
  /**
   * <pre>
   * Required. The Firebase link to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder getFirebaseLinkOrBuilder() {
    return firebaseLink_ == null ? com.google.analytics.admin.v1beta.FirebaseLink.getDefaultInstance() : firebaseLink_;
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
    if (firebaseLink_ != null) {
      output.writeMessage(2, getFirebaseLink());
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
    if (firebaseLink_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFirebaseLink());
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest other = (com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasFirebaseLink() != other.hasFirebaseLink()) return false;
    if (hasFirebaseLink()) {
      if (!getFirebaseLink()
          .equals(other.getFirebaseLink())) return false;
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
    if (hasFirebaseLink()) {
      hash = (37 * hash) + FIREBASE_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getFirebaseLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest prototype) {
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
   * Request message for CreateFirebaseLink RPC
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.CreateFirebaseLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.CreateFirebaseLinkRequest)
      com.google.analytics.admin.v1beta.CreateFirebaseLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_CreateFirebaseLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_CreateFirebaseLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.class, com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.newBuilder()
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
      firebaseLink_ = null;
      if (firebaseLinkBuilder_ != null) {
        firebaseLinkBuilder_.dispose();
        firebaseLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_CreateFirebaseLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest build() {
      com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest buildPartial() {
      com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest result = new com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.firebaseLink_ = firebaseLinkBuilder_ == null
            ? firebaseLink_
            : firebaseLinkBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest other) {
      if (other == com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFirebaseLink()) {
        mergeFirebaseLink(other.getFirebaseLink());
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
                  getFirebaseLinkFieldBuilder().getBuilder(),
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
     * Required. Format: properties/{property_id}
     * Example: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Format: properties/{property_id}
     * Example: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Format: properties/{property_id}
     * Example: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Format: properties/{property_id}
     * Example: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. Format: properties/{property_id}
     * Example: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

    private com.google.analytics.admin.v1beta.FirebaseLink firebaseLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1beta.FirebaseLink, com.google.analytics.admin.v1beta.FirebaseLink.Builder, com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder> firebaseLinkBuilder_;
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the firebaseLink field is set.
     */
    public boolean hasFirebaseLink() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The firebaseLink.
     */
    public com.google.analytics.admin.v1beta.FirebaseLink getFirebaseLink() {
      if (firebaseLinkBuilder_ == null) {
        return firebaseLink_ == null ? com.google.analytics.admin.v1beta.FirebaseLink.getDefaultInstance() : firebaseLink_;
      } else {
        return firebaseLinkBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFirebaseLink(com.google.analytics.admin.v1beta.FirebaseLink value) {
      if (firebaseLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        firebaseLink_ = value;
      } else {
        firebaseLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFirebaseLink(
        com.google.analytics.admin.v1beta.FirebaseLink.Builder builderForValue) {
      if (firebaseLinkBuilder_ == null) {
        firebaseLink_ = builderForValue.build();
      } else {
        firebaseLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFirebaseLink(com.google.analytics.admin.v1beta.FirebaseLink value) {
      if (firebaseLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          firebaseLink_ != null &&
          firebaseLink_ != com.google.analytics.admin.v1beta.FirebaseLink.getDefaultInstance()) {
          getFirebaseLinkBuilder().mergeFrom(value);
        } else {
          firebaseLink_ = value;
        }
      } else {
        firebaseLinkBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFirebaseLink() {
      bitField0_ = (bitField0_ & ~0x00000002);
      firebaseLink_ = null;
      if (firebaseLinkBuilder_ != null) {
        firebaseLinkBuilder_.dispose();
        firebaseLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1beta.FirebaseLink.Builder getFirebaseLinkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFirebaseLinkFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder getFirebaseLinkOrBuilder() {
      if (firebaseLinkBuilder_ != null) {
        return firebaseLinkBuilder_.getMessageOrBuilder();
      } else {
        return firebaseLink_ == null ?
            com.google.analytics.admin.v1beta.FirebaseLink.getDefaultInstance() : firebaseLink_;
      }
    }
    /**
     * <pre>
     * Required. The Firebase link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.FirebaseLink firebase_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1beta.FirebaseLink, com.google.analytics.admin.v1beta.FirebaseLink.Builder, com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder> 
        getFirebaseLinkFieldBuilder() {
      if (firebaseLinkBuilder_ == null) {
        firebaseLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.FirebaseLink, com.google.analytics.admin.v1beta.FirebaseLink.Builder, com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder>(
                getFirebaseLink(),
                getParentForChildren(),
                isClean());
        firebaseLink_ = null;
      }
      return firebaseLinkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.CreateFirebaseLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.CreateFirebaseLinkRequest)
  private static final com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest();
  }

  public static com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFirebaseLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFirebaseLinkRequest>() {
    @java.lang.Override
    public CreateFirebaseLinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFirebaseLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFirebaseLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.CreateFirebaseLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

