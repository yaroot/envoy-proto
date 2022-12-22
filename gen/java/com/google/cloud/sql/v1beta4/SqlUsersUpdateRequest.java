// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_users.proto

package com.google.cloud.sql.v1beta4;

/**
 * Protobuf type {@code google.cloud.sql.v1beta4.SqlUsersUpdateRequest}
 */
public final class SqlUsersUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.SqlUsersUpdateRequest)
    SqlUsersUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqlUsersUpdateRequest.newBuilder() to construct.
  private SqlUsersUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqlUsersUpdateRequest() {
    host_ = "";
    instance_ = "";
    name_ = "";
    project_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqlUsersUpdateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlUsersProto.internal_static_google_cloud_sql_v1beta4_SqlUsersUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlUsersProto.internal_static_google_cloud_sql_v1beta4_SqlUsersUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.class, com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.Builder.class);
  }

  public static final int HOST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object host_ = "";
  /**
   * <pre>
   * Optional. Host of the user in the instance.
   * </pre>
   *
   * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The host.
   */
  @java.lang.Override
  public java.lang.String getHost() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Host of the user in the instance.
   * </pre>
   *
   * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for host.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostBytes() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object instance_ = "";
  /**
   * <pre>
   * Database instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 2;</code>
   * @return The instance.
   */
  @java.lang.Override
  public java.lang.String getInstance() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Database instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 2;</code>
   * @return The bytes for instance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceBytes() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Name of the user in the instance.
   * </pre>
   *
   * <code>string name = 3;</code>
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
   * Name of the user in the instance.
   * </pre>
   *
   * <code>string name = 3;</code>
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

  public static final int PROJECT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   * <pre>
   * Project ID of the project that contains the instance.
   * </pre>
   *
   * <code>string project = 4;</code>
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID of the project that contains the instance.
   * </pre>
   *
   * <code>string project = 4;</code>
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 100;
  private com.google.cloud.sql.v1beta4.User body_;
  /**
   * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
   * @return The body.
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.User getBody() {
    return body_ == null ? com.google.cloud.sql.v1beta4.User.getDefaultInstance() : body_;
  }
  /**
   * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.UserOrBuilder getBodyOrBuilder() {
    return body_ == null ? com.google.cloud.sql.v1beta4.User.getDefaultInstance() : body_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, project_);
    }
    if (body_ != null) {
      output.writeMessage(100, getBody());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, project_);
    }
    if (body_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, getBody());
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest other = (com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest) obj;

    if (!getHost()
        .equals(other.getHost())) return false;
    if (!getInstance()
        .equals(other.getInstance())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getProject()
        .equals(other.getProject())) return false;
    if (hasBody() != other.hasBody()) return false;
    if (hasBody()) {
      if (!getBody()
          .equals(other.getBody())) return false;
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
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getInstance().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest prototype) {
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
   * Protobuf type {@code google.cloud.sql.v1beta4.SqlUsersUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.SqlUsersUpdateRequest)
      com.google.cloud.sql.v1beta4.SqlUsersUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlUsersProto.internal_static_google_cloud_sql_v1beta4_SqlUsersUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlUsersProto.internal_static_google_cloud_sql_v1beta4_SqlUsersUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.class, com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.newBuilder()
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
      host_ = "";
      instance_ = "";
      name_ = "";
      project_ = "";
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlUsersProto.internal_static_google_cloud_sql_v1beta4_SqlUsersUpdateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest build() {
      com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest buildPartial() {
      com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest result = new com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.host_ = host_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instance_ = instance_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.body_ = bodyBuilder_ == null
            ? body_
            : bodyBuilder_.build();
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
      if (other instanceof com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest) {
        return mergeFrom((com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest other) {
      if (other == com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest.getDefaultInstance()) return this;
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInstance().isEmpty()) {
        instance_ = other.instance_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.hasBody()) {
        mergeBody(other.getBody());
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
              host_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              instance_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              project_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 802: {
              input.readMessage(
                  getBodyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 802
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

    private java.lang.Object host_ = "";
    /**
     * <pre>
     * Optional. Host of the user in the instance.
     * </pre>
     *
     * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The host.
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Host of the user in the instance.
     * </pre>
     *
     * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Host of the user in the instance.
     * </pre>
     *
     * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The host to set.
     * @return This builder for chaining.
     */
    public Builder setHost(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      host_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Host of the user in the instance.
     * </pre>
     *
     * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearHost() {
      host_ = getDefaultInstance().getHost();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Host of the user in the instance.
     * </pre>
     *
     * <code>string host = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for host to set.
     * @return This builder for chaining.
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      host_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object instance_ = "";
    /**
     * <pre>
     * Database instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 2;</code>
     * @return The instance.
     */
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Database instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 2;</code>
     * @return The bytes for instance.
     */
    public com.google.protobuf.ByteString
        getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Database instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 2;</code>
     * @param value The instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstance(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      instance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Database instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstance() {
      instance_ = getDefaultInstance().getInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Database instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 2;</code>
     * @param value The bytes for instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      instance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the user in the instance.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Name of the user in the instance.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Name of the user in the instance.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the user in the instance.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the user in the instance.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID of the project that contains the instance.
     * </pre>
     *
     * <code>string project = 4;</code>
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID of the project that contains the instance.
     * </pre>
     *
     * <code>string project = 4;</code>
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID of the project that contains the instance.
     * </pre>
     *
     * <code>string project = 4;</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      project_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID of the project that contains the instance.
     * </pre>
     *
     * <code>string project = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID of the project that contains the instance.
     * </pre>
     *
     * <code>string project = 4;</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private com.google.cloud.sql.v1beta4.User body_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.User, com.google.cloud.sql.v1beta4.User.Builder, com.google.cloud.sql.v1beta4.UserOrBuilder> bodyBuilder_;
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     * @return Whether the body field is set.
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     * @return The body.
     */
    public com.google.cloud.sql.v1beta4.User getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? com.google.cloud.sql.v1beta4.User.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    public Builder setBody(com.google.cloud.sql.v1beta4.User value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
      } else {
        bodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    public Builder setBody(
        com.google.cloud.sql.v1beta4.User.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    public Builder mergeBody(com.google.cloud.sql.v1beta4.User value) {
      if (bodyBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          body_ != null &&
          body_ != com.google.cloud.sql.v1beta4.User.getDefaultInstance()) {
          getBodyBuilder().mergeFrom(value);
        } else {
          body_ = value;
        }
      } else {
        bodyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    public Builder clearBody() {
      bitField0_ = (bitField0_ & ~0x00000010);
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    public com.google.cloud.sql.v1beta4.User.Builder getBodyBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    public com.google.cloud.sql.v1beta4.UserOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            com.google.cloud.sql.v1beta4.User.getDefaultInstance() : body_;
      }
    }
    /**
     * <code>.google.cloud.sql.v1beta4.User body = 100;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.User, com.google.cloud.sql.v1beta4.User.Builder, com.google.cloud.sql.v1beta4.UserOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.sql.v1beta4.User, com.google.cloud.sql.v1beta4.User.Builder, com.google.cloud.sql.v1beta4.UserOrBuilder>(
                getBody(),
                getParentForChildren(),
                isClean());
        body_ = null;
      }
      return bodyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.SqlUsersUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlUsersUpdateRequest)
  private static final com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest();
  }

  public static com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlUsersUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<SqlUsersUpdateRequest>() {
    @java.lang.Override
    public SqlUsersUpdateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SqlUsersUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlUsersUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.SqlUsersUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
