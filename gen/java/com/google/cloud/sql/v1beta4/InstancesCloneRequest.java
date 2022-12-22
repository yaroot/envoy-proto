// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

/**
 * <pre>
 * Database instance clone request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.sql.v1beta4.InstancesCloneRequest}
 */
public final class InstancesCloneRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.sql.v1beta4.InstancesCloneRequest)
    InstancesCloneRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstancesCloneRequest.newBuilder() to construct.
  private InstancesCloneRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstancesCloneRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstancesCloneRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesCloneRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesCloneRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.sql.v1beta4.InstancesCloneRequest.class, com.google.cloud.sql.v1beta4.InstancesCloneRequest.Builder.class);
  }

  public static final int CLONE_CONTEXT_FIELD_NUMBER = 1;
  private com.google.cloud.sql.v1beta4.CloneContext cloneContext_;
  /**
   * <pre>
   * Contains details about the clone operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
   * @return Whether the cloneContext field is set.
   */
  @java.lang.Override
  public boolean hasCloneContext() {
    return cloneContext_ != null;
  }
  /**
   * <pre>
   * Contains details about the clone operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
   * @return The cloneContext.
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.CloneContext getCloneContext() {
    return cloneContext_ == null ? com.google.cloud.sql.v1beta4.CloneContext.getDefaultInstance() : cloneContext_;
  }
  /**
   * <pre>
   * Contains details about the clone operation.
   * </pre>
   *
   * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.sql.v1beta4.CloneContextOrBuilder getCloneContextOrBuilder() {
    return cloneContext_ == null ? com.google.cloud.sql.v1beta4.CloneContext.getDefaultInstance() : cloneContext_;
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
    if (cloneContext_ != null) {
      output.writeMessage(1, getCloneContext());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cloneContext_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCloneContext());
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
    if (!(obj instanceof com.google.cloud.sql.v1beta4.InstancesCloneRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.sql.v1beta4.InstancesCloneRequest other = (com.google.cloud.sql.v1beta4.InstancesCloneRequest) obj;

    if (hasCloneContext() != other.hasCloneContext()) return false;
    if (hasCloneContext()) {
      if (!getCloneContext()
          .equals(other.getCloneContext())) return false;
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
    if (hasCloneContext()) {
      hash = (37 * hash) + CLONE_CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getCloneContext().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.sql.v1beta4.InstancesCloneRequest prototype) {
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
   * Database instance clone request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.sql.v1beta4.InstancesCloneRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.sql.v1beta4.InstancesCloneRequest)
      com.google.cloud.sql.v1beta4.InstancesCloneRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesCloneRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesCloneRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.sql.v1beta4.InstancesCloneRequest.class, com.google.cloud.sql.v1beta4.InstancesCloneRequest.Builder.class);
    }

    // Construct using com.google.cloud.sql.v1beta4.InstancesCloneRequest.newBuilder()
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
      cloneContext_ = null;
      if (cloneContextBuilder_ != null) {
        cloneContextBuilder_.dispose();
        cloneContextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.internal_static_google_cloud_sql_v1beta4_InstancesCloneRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.InstancesCloneRequest getDefaultInstanceForType() {
      return com.google.cloud.sql.v1beta4.InstancesCloneRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.InstancesCloneRequest build() {
      com.google.cloud.sql.v1beta4.InstancesCloneRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.sql.v1beta4.InstancesCloneRequest buildPartial() {
      com.google.cloud.sql.v1beta4.InstancesCloneRequest result = new com.google.cloud.sql.v1beta4.InstancesCloneRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.sql.v1beta4.InstancesCloneRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloneContext_ = cloneContextBuilder_ == null
            ? cloneContext_
            : cloneContextBuilder_.build();
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
      if (other instanceof com.google.cloud.sql.v1beta4.InstancesCloneRequest) {
        return mergeFrom((com.google.cloud.sql.v1beta4.InstancesCloneRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.sql.v1beta4.InstancesCloneRequest other) {
      if (other == com.google.cloud.sql.v1beta4.InstancesCloneRequest.getDefaultInstance()) return this;
      if (other.hasCloneContext()) {
        mergeCloneContext(other.getCloneContext());
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
              input.readMessage(
                  getCloneContextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.cloud.sql.v1beta4.CloneContext cloneContext_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.CloneContext, com.google.cloud.sql.v1beta4.CloneContext.Builder, com.google.cloud.sql.v1beta4.CloneContextOrBuilder> cloneContextBuilder_;
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     * @return Whether the cloneContext field is set.
     */
    public boolean hasCloneContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     * @return The cloneContext.
     */
    public com.google.cloud.sql.v1beta4.CloneContext getCloneContext() {
      if (cloneContextBuilder_ == null) {
        return cloneContext_ == null ? com.google.cloud.sql.v1beta4.CloneContext.getDefaultInstance() : cloneContext_;
      } else {
        return cloneContextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    public Builder setCloneContext(com.google.cloud.sql.v1beta4.CloneContext value) {
      if (cloneContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cloneContext_ = value;
      } else {
        cloneContextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    public Builder setCloneContext(
        com.google.cloud.sql.v1beta4.CloneContext.Builder builderForValue) {
      if (cloneContextBuilder_ == null) {
        cloneContext_ = builderForValue.build();
      } else {
        cloneContextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    public Builder mergeCloneContext(com.google.cloud.sql.v1beta4.CloneContext value) {
      if (cloneContextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          cloneContext_ != null &&
          cloneContext_ != com.google.cloud.sql.v1beta4.CloneContext.getDefaultInstance()) {
          getCloneContextBuilder().mergeFrom(value);
        } else {
          cloneContext_ = value;
        }
      } else {
        cloneContextBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    public Builder clearCloneContext() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cloneContext_ = null;
      if (cloneContextBuilder_ != null) {
        cloneContextBuilder_.dispose();
        cloneContextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    public com.google.cloud.sql.v1beta4.CloneContext.Builder getCloneContextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCloneContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    public com.google.cloud.sql.v1beta4.CloneContextOrBuilder getCloneContextOrBuilder() {
      if (cloneContextBuilder_ != null) {
        return cloneContextBuilder_.getMessageOrBuilder();
      } else {
        return cloneContext_ == null ?
            com.google.cloud.sql.v1beta4.CloneContext.getDefaultInstance() : cloneContext_;
      }
    }
    /**
     * <pre>
     * Contains details about the clone operation.
     * </pre>
     *
     * <code>.google.cloud.sql.v1beta4.CloneContext clone_context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.sql.v1beta4.CloneContext, com.google.cloud.sql.v1beta4.CloneContext.Builder, com.google.cloud.sql.v1beta4.CloneContextOrBuilder> 
        getCloneContextFieldBuilder() {
      if (cloneContextBuilder_ == null) {
        cloneContextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.sql.v1beta4.CloneContext, com.google.cloud.sql.v1beta4.CloneContext.Builder, com.google.cloud.sql.v1beta4.CloneContextOrBuilder>(
                getCloneContext(),
                getParentForChildren(),
                isClean());
        cloneContext_ = null;
      }
      return cloneContextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.sql.v1beta4.InstancesCloneRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.InstancesCloneRequest)
  private static final com.google.cloud.sql.v1beta4.InstancesCloneRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.sql.v1beta4.InstancesCloneRequest();
  }

  public static com.google.cloud.sql.v1beta4.InstancesCloneRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesCloneRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstancesCloneRequest>() {
    @java.lang.Override
    public InstancesCloneRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesCloneRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesCloneRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.sql.v1beta4.InstancesCloneRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

