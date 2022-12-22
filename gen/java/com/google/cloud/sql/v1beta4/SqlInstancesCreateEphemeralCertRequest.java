// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql.proto

package com.google.cloud.sql.v1beta4;

/**
 * Protobuf type {@code google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest}
 */
public final class SqlInstancesCreateEphemeralCertRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest)
    SqlInstancesCreateEphemeralCertRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqlInstancesCreateEphemeralCertRequest.newBuilder() to construct.
  private SqlInstancesCreateEphemeralCertRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqlInstancesCreateEphemeralCertRequest() {
    instance_ = "";
    project_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqlInstancesCreateEphemeralCertRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlServiceProto.internal_static_google_cloud_sql_v1beta4_SqlInstancesCreateEphemeralCertRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlServiceProto.internal_static_google_cloud_sql_v1beta4_SqlInstancesCreateEphemeralCertRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.class, com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.Builder.class);
  }

  public static final int INSTANCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object instance_ = "";
  /**
   * <pre>
   * Cloud SQL instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 1;</code>
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
   * Cloud SQL instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 1;</code>
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

  public static final int PROJECT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   * <pre>
   * Project ID of the Cloud SQL project.
   * </pre>
   *
   * <code>string project = 2;</code>
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
   * Project ID of the Cloud SQL project.
   * </pre>
   *
   * <code>string project = 2;</code>
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
  private com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body_;
  /**
   * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
   * @return The body.
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest getBody() {
    return body_ == null ? com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.getDefaultInstance() : body_;
  }
  /**
   * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequestOrBuilder getBodyOrBuilder() {
    return body_ == null ? com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.getDefaultInstance() : body_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, project_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, project_);
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest other = (com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest) obj;

    if (!getInstance()
        .equals(other.getInstance())) return false;
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
    hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getInstance().hashCode();
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

  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest prototype) {
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
   * Protobuf type {@code google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest)
      com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlServiceProto.internal_static_google_cloud_sql_v1beta4_SqlInstancesCreateEphemeralCertRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlServiceProto.internal_static_google_cloud_sql_v1beta4_SqlInstancesCreateEphemeralCertRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.class, com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.newBuilder()
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
      instance_ = "";
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
      return com.google.cloud.sql.v1beta4.CloudSqlServiceProto.internal_static_google_cloud_sql_v1beta4_SqlInstancesCreateEphemeralCertRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest build() {
      com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest buildPartial() {
      com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest result = new com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instance_ = instance_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
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
      if (other instanceof com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest) {
        return mergeFrom((com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest other) {
      if (other == com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest.getDefaultInstance()) return this;
      if (!other.getInstance().isEmpty()) {
        instance_ = other.instance_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000002;
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
              instance_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              project_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 802: {
              input.readMessage(
                  getBodyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private java.lang.Object instance_ = "";
    /**
     * <pre>
     * Cloud SQL instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 1;</code>
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
     * Cloud SQL instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 1;</code>
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
     * Cloud SQL instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @param value The instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstance(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      instance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cloud SQL instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstance() {
      instance_ = getDefaultInstance().getInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cloud SQL instance ID. This does not include the project ID.
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @param value The bytes for instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      instance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID of the Cloud SQL project.
     * </pre>
     *
     * <code>string project = 2;</code>
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
     * Project ID of the Cloud SQL project.
     * </pre>
     *
     * <code>string project = 2;</code>
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
     * Project ID of the Cloud SQL project.
     * </pre>
     *
     * <code>string project = 2;</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      project_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID of the Cloud SQL project.
     * </pre>
     *
     * <code>string project = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID of the Cloud SQL project.
     * </pre>
     *
     * <code>string project = 2;</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest, com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.Builder, com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequestOrBuilder> bodyBuilder_;
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     * @return Whether the body field is set.
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     * @return The body.
     */
    public com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    public Builder setBody(com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
      } else {
        bodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    public Builder setBody(
        com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    public Builder mergeBody(com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest value) {
      if (bodyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          body_ != null &&
          body_ != com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.getDefaultInstance()) {
          getBodyBuilder().mergeFrom(value);
        } else {
          body_ = value;
        }
      } else {
        bodyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    public Builder clearBody() {
      bitField0_ = (bitField0_ & ~0x00000004);
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    public com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.Builder getBodyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    public com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequestOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.getDefaultInstance() : body_;
      }
    }
    /**
     * <code>.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest body = 100;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest, com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.Builder, com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequestOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest, com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequest.Builder, com.google.cloud.sql.v1beta4.SslCertsCreateEphemeralRequestOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest)
  private static final com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest();
  }

  public static com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlInstancesCreateEphemeralCertRequest>
      PARSER = new com.google.protobuf.AbstractParser<SqlInstancesCreateEphemeralCertRequest>() {
    @java.lang.Override
    public SqlInstancesCreateEphemeralCertRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SqlInstancesCreateEphemeralCertRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlInstancesCreateEphemeralCertRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.SqlInstancesCreateEphemeralCertRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

