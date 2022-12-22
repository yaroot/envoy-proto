// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

/**
 * <pre>
 * Table update response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.logging.v1.TableUpdateResponse}
 */
public final class TableUpdateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.logging.v1.TableUpdateResponse)
    TableUpdateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableUpdateResponse.newBuilder() to construct.
  private TableUpdateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableUpdateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableUpdateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.logging.v1.TableUpdateResponse.class, com.google.cloud.bigquery.logging.v1.TableUpdateResponse.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.logging.v1.Table resource_;
  /**
   * <pre>
   * Final state of the updated table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * Final state of the updated table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.logging.v1.Table getResource() {
    return resource_ == null ? com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * Final state of the updated table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.logging.v1.TableOrBuilder getResourceOrBuilder() {
    return resource_ == null ? com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResource());
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
    if (!(obj instanceof com.google.cloud.bigquery.logging.v1.TableUpdateResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.logging.v1.TableUpdateResponse other = (com.google.cloud.bigquery.logging.v1.TableUpdateResponse) obj;

    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
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
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.logging.v1.TableUpdateResponse prototype) {
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
   * Table update response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.logging.v1.TableUpdateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.logging.v1.TableUpdateResponse)
      com.google.cloud.bigquery.logging.v1.TableUpdateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.logging.v1.TableUpdateResponse.class, com.google.cloud.bigquery.logging.v1.TableUpdateResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.logging.v1.TableUpdateResponse.newBuilder()
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
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.logging.v1.TableUpdateResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.logging.v1.TableUpdateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.logging.v1.TableUpdateResponse build() {
      com.google.cloud.bigquery.logging.v1.TableUpdateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.logging.v1.TableUpdateResponse buildPartial() {
      com.google.cloud.bigquery.logging.v1.TableUpdateResponse result = new com.google.cloud.bigquery.logging.v1.TableUpdateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.logging.v1.TableUpdateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resource_ = resourceBuilder_ == null
            ? resource_
            : resourceBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.logging.v1.TableUpdateResponse) {
        return mergeFrom((com.google.cloud.bigquery.logging.v1.TableUpdateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.logging.v1.TableUpdateResponse other) {
      if (other == com.google.cloud.bigquery.logging.v1.TableUpdateResponse.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
                  getResourceFieldBuilder().getBuilder(),
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

    private com.google.cloud.bigquery.logging.v1.Table resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.Table, com.google.cloud.bigquery.logging.v1.Table.Builder, com.google.cloud.bigquery.logging.v1.TableOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     * @return The resource.
     */
    public com.google.cloud.bigquery.logging.v1.Table getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder setResource(com.google.cloud.bigquery.logging.v1.Table value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder setResource(
        com.google.cloud.bigquery.logging.v1.Table.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder mergeResource(com.google.cloud.bigquery.logging.v1.Table value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          resource_ != null &&
          resource_ != com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public com.google.cloud.bigquery.logging.v1.Table.Builder getResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public com.google.cloud.bigquery.logging.v1.TableOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
      }
    }
    /**
     * <pre>
     * Final state of the updated table.
     * </pre>
     *
     * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.Table, com.google.cloud.bigquery.logging.v1.Table.Builder, com.google.cloud.bigquery.logging.v1.TableOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.logging.v1.Table, com.google.cloud.bigquery.logging.v1.Table.Builder, com.google.cloud.bigquery.logging.v1.TableOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.logging.v1.TableUpdateResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.logging.v1.TableUpdateResponse)
  private static final com.google.cloud.bigquery.logging.v1.TableUpdateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.logging.v1.TableUpdateResponse();
  }

  public static com.google.cloud.bigquery.logging.v1.TableUpdateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableUpdateResponse>
      PARSER = new com.google.protobuf.AbstractParser<TableUpdateResponse>() {
    @java.lang.Override
    public TableUpdateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableUpdateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableUpdateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.logging.v1.TableUpdateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
