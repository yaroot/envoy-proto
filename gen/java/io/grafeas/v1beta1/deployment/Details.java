// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

package io.grafeas.v1beta1.deployment;

/**
 * <pre>
 * Details of a deployment occurrence.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.deployment.Details}
 */
public final class Details extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.deployment.Details)
    DetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Details.newBuilder() to construct.
  private Details(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Details() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Details();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Details_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Details_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.deployment.Details.class, io.grafeas.v1beta1.deployment.Details.Builder.class);
  }

  public static final int DEPLOYMENT_FIELD_NUMBER = 1;
  private io.grafeas.v1beta1.deployment.Deployment deployment_;
  /**
   * <pre>
   * Required. Deployment history for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
   * @return Whether the deployment field is set.
   */
  @java.lang.Override
  public boolean hasDeployment() {
    return deployment_ != null;
  }
  /**
   * <pre>
   * Required. Deployment history for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
   * @return The deployment.
   */
  @java.lang.Override
  public io.grafeas.v1beta1.deployment.Deployment getDeployment() {
    return deployment_ == null ? io.grafeas.v1beta1.deployment.Deployment.getDefaultInstance() : deployment_;
  }
  /**
   * <pre>
   * Required. Deployment history for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1beta1.deployment.DeploymentOrBuilder getDeploymentOrBuilder() {
    return deployment_ == null ? io.grafeas.v1beta1.deployment.Deployment.getDefaultInstance() : deployment_;
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
    if (deployment_ != null) {
      output.writeMessage(1, getDeployment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deployment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeployment());
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
    if (!(obj instanceof io.grafeas.v1beta1.deployment.Details)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.deployment.Details other = (io.grafeas.v1beta1.deployment.Details) obj;

    if (hasDeployment() != other.hasDeployment()) return false;
    if (hasDeployment()) {
      if (!getDeployment()
          .equals(other.getDeployment())) return false;
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
    if (hasDeployment()) {
      hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDeployment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Details parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.deployment.Details parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.deployment.Details parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1beta1.deployment.Details prototype) {
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
   * Details of a deployment occurrence.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.deployment.Details}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.deployment.Details)
      io.grafeas.v1beta1.deployment.DetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Details_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Details_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.deployment.Details.class, io.grafeas.v1beta1.deployment.Details.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.deployment.Details.newBuilder()
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
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Details_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Details getDefaultInstanceForType() {
      return io.grafeas.v1beta1.deployment.Details.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Details build() {
      io.grafeas.v1beta1.deployment.Details result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Details buildPartial() {
      io.grafeas.v1beta1.deployment.Details result = new io.grafeas.v1beta1.deployment.Details(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1beta1.deployment.Details result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deployment_ = deploymentBuilder_ == null
            ? deployment_
            : deploymentBuilder_.build();
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
      if (other instanceof io.grafeas.v1beta1.deployment.Details) {
        return mergeFrom((io.grafeas.v1beta1.deployment.Details)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.deployment.Details other) {
      if (other == io.grafeas.v1beta1.deployment.Details.getDefaultInstance()) return this;
      if (other.hasDeployment()) {
        mergeDeployment(other.getDeployment());
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
                  getDeploymentFieldBuilder().getBuilder(),
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

    private io.grafeas.v1beta1.deployment.Deployment deployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.deployment.Deployment, io.grafeas.v1beta1.deployment.Deployment.Builder, io.grafeas.v1beta1.deployment.DeploymentOrBuilder> deploymentBuilder_;
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     * @return Whether the deployment field is set.
     */
    public boolean hasDeployment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     * @return The deployment.
     */
    public io.grafeas.v1beta1.deployment.Deployment getDeployment() {
      if (deploymentBuilder_ == null) {
        return deployment_ == null ? io.grafeas.v1beta1.deployment.Deployment.getDefaultInstance() : deployment_;
      } else {
        return deploymentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    public Builder setDeployment(io.grafeas.v1beta1.deployment.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployment_ = value;
      } else {
        deploymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    public Builder setDeployment(
        io.grafeas.v1beta1.deployment.Deployment.Builder builderForValue) {
      if (deploymentBuilder_ == null) {
        deployment_ = builderForValue.build();
      } else {
        deploymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    public Builder mergeDeployment(io.grafeas.v1beta1.deployment.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deployment_ != null &&
          deployment_ != io.grafeas.v1beta1.deployment.Deployment.getDefaultInstance()) {
          getDeploymentBuilder().mergeFrom(value);
        } else {
          deployment_ = value;
        }
      } else {
        deploymentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    public Builder clearDeployment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    public io.grafeas.v1beta1.deployment.Deployment.Builder getDeploymentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    public io.grafeas.v1beta1.deployment.DeploymentOrBuilder getDeploymentOrBuilder() {
      if (deploymentBuilder_ != null) {
        return deploymentBuilder_.getMessageOrBuilder();
      } else {
        return deployment_ == null ?
            io.grafeas.v1beta1.deployment.Deployment.getDefaultInstance() : deployment_;
      }
    }
    /**
     * <pre>
     * Required. Deployment history for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.deployment.Deployment, io.grafeas.v1beta1.deployment.Deployment.Builder, io.grafeas.v1beta1.deployment.DeploymentOrBuilder> 
        getDeploymentFieldBuilder() {
      if (deploymentBuilder_ == null) {
        deploymentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.deployment.Deployment, io.grafeas.v1beta1.deployment.Deployment.Builder, io.grafeas.v1beta1.deployment.DeploymentOrBuilder>(
                getDeployment(),
                getParentForChildren(),
                isClean());
        deployment_ = null;
      }
      return deploymentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.deployment.Details)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.deployment.Details)
  private static final io.grafeas.v1beta1.deployment.Details DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.deployment.Details();
  }

  public static io.grafeas.v1beta1.deployment.Details getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Details>
      PARSER = new com.google.protobuf.AbstractParser<Details>() {
    @java.lang.Override
    public Details parsePartialFrom(
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

  public static com.google.protobuf.Parser<Details> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Details> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.deployment.Details getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

