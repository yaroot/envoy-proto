// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/agentendpoint/v1beta/agentendpoint.proto

package com.google.cloud.osconfig.agentendpoint.v1beta;

/**
 * <pre>
 * A response message that contains the details of the task to work on.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse}
 */
public final class StartNextTaskResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse)
    StartNextTaskResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartNextTaskResponse.newBuilder() to construct.
  private StartNextTaskResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartNextTaskResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartNextTaskResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.agentendpoint.v1beta.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1beta_StartNextTaskResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.agentendpoint.v1beta.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1beta_StartNextTaskResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.class, com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.Builder.class);
  }

  public static final int TASK_FIELD_NUMBER = 1;
  private com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task task_;
  /**
   * <pre>
   * The details of the task that should be worked on.  Can be empty if there
   * is no new task to work on.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
   * @return Whether the task field is set.
   */
  @java.lang.Override
  public boolean hasTask() {
    return task_ != null;
  }
  /**
   * <pre>
   * The details of the task that should be worked on.  Can be empty if there
   * is no new task to work on.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
   * @return The task.
   */
  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task getTask() {
    return task_ == null ? com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.getDefaultInstance() : task_;
  }
  /**
   * <pre>
   * The details of the task that should be worked on.  Can be empty if there
   * is no new task to work on.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.TaskOrBuilder getTaskOrBuilder() {
    return task_ == null ? com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.getDefaultInstance() : task_;
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
    if (task_ != null) {
      output.writeMessage(1, getTask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (task_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTask());
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
    if (!(obj instanceof com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse other = (com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse) obj;

    if (hasTask() != other.hasTask()) return false;
    if (hasTask()) {
      if (!getTask()
          .equals(other.getTask())) return false;
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
    if (hasTask()) {
      hash = (37 * hash) + TASK_FIELD_NUMBER;
      hash = (53 * hash) + getTask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse prototype) {
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
   * A response message that contains the details of the task to work on.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse)
      com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.agentendpoint.v1beta.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1beta_StartNextTaskResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.agentendpoint.v1beta.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1beta_StartNextTaskResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.class, com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.newBuilder()
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
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.agentendpoint.v1beta.AgentEndpointProto.internal_static_google_cloud_osconfig_agentendpoint_v1beta_StartNextTaskResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse getDefaultInstanceForType() {
      return com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse build() {
      com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse buildPartial() {
      com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse result = new com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.task_ = taskBuilder_ == null
            ? task_
            : taskBuilder_.build();
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
      if (other instanceof com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse) {
        return mergeFrom((com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse other) {
      if (other == com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse.getDefaultInstance()) return this;
      if (other.hasTask()) {
        mergeTask(other.getTask());
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
                  getTaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task task_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task, com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.Builder, com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.TaskOrBuilder> taskBuilder_;
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     * @return Whether the task field is set.
     */
    public boolean hasTask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     * @return The task.
     */
    public com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task getTask() {
      if (taskBuilder_ == null) {
        return task_ == null ? com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.getDefaultInstance() : task_;
      } else {
        return taskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    public Builder setTask(com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task value) {
      if (taskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        task_ = value;
      } else {
        taskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    public Builder setTask(
        com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.Builder builderForValue) {
      if (taskBuilder_ == null) {
        task_ = builderForValue.build();
      } else {
        taskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    public Builder mergeTask(com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task value) {
      if (taskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          task_ != null &&
          task_ != com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.getDefaultInstance()) {
          getTaskBuilder().mergeFrom(value);
        } else {
          task_ = value;
        }
      } else {
        taskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    public Builder clearTask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    public com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.Builder getTaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    public com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.TaskOrBuilder getTaskOrBuilder() {
      if (taskBuilder_ != null) {
        return taskBuilder_.getMessageOrBuilder();
      } else {
        return task_ == null ?
            com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.getDefaultInstance() : task_;
      }
    }
    /**
     * <pre>
     * The details of the task that should be worked on.  Can be empty if there
     * is no new task to work on.
     * </pre>
     *
     * <code>.google.cloud.osconfig.agentendpoint.v1beta.Task task = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task, com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.Builder, com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.TaskOrBuilder> 
        getTaskFieldBuilder() {
      if (taskBuilder_ == null) {
        taskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task, com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.Task.Builder, com.google.cloud.osconfig.agentendpoint.v1beta.Tasks.TaskOrBuilder>(
                getTask(),
                getParentForChildren(),
                isClean());
        task_ = null;
      }
      return taskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse)
  private static final com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse();
  }

  public static com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartNextTaskResponse>
      PARSER = new com.google.protobuf.AbstractParser<StartNextTaskResponse>() {
    @java.lang.Override
    public StartNextTaskResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartNextTaskResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartNextTaskResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.agentendpoint.v1beta.StartNextTaskResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

