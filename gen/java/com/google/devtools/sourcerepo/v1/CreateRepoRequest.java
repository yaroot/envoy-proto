// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/sourcerepo/v1/sourcerepo.proto

package com.google.devtools.sourcerepo.v1;

/**
 * <pre>
 * Request for CreateRepo
 * </pre>
 *
 * Protobuf type {@code google.devtools.sourcerepo.v1.CreateRepoRequest}
 */
public final class CreateRepoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.sourcerepo.v1.CreateRepoRequest)
    CreateRepoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRepoRequest.newBuilder() to construct.
  private CreateRepoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRepoRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRepoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.sourcerepo.v1.SourceRepoProto.internal_static_google_devtools_sourcerepo_v1_CreateRepoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.sourcerepo.v1.SourceRepoProto.internal_static_google_devtools_sourcerepo_v1_CreateRepoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.sourcerepo.v1.CreateRepoRequest.class, com.google.devtools.sourcerepo.v1.CreateRepoRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The project in which to create the repo. Values are of the form
   * `projects/&lt;project&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
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
   * The project in which to create the repo. Values are of the form
   * `projects/&lt;project&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
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

  public static final int REPO_FIELD_NUMBER = 2;
  private com.google.devtools.sourcerepo.v1.Repo repo_;
  /**
   * <pre>
   * The repo to create.  Only name should be set; setting other fields
   * is an error.  The project in the name should match the parent field.
   * </pre>
   *
   * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
   * @return Whether the repo field is set.
   */
  @java.lang.Override
  public boolean hasRepo() {
    return repo_ != null;
  }
  /**
   * <pre>
   * The repo to create.  Only name should be set; setting other fields
   * is an error.  The project in the name should match the parent field.
   * </pre>
   *
   * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
   * @return The repo.
   */
  @java.lang.Override
  public com.google.devtools.sourcerepo.v1.Repo getRepo() {
    return repo_ == null ? com.google.devtools.sourcerepo.v1.Repo.getDefaultInstance() : repo_;
  }
  /**
   * <pre>
   * The repo to create.  Only name should be set; setting other fields
   * is an error.  The project in the name should match the parent field.
   * </pre>
   *
   * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.sourcerepo.v1.RepoOrBuilder getRepoOrBuilder() {
    return repo_ == null ? com.google.devtools.sourcerepo.v1.Repo.getDefaultInstance() : repo_;
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
    if (repo_ != null) {
      output.writeMessage(2, getRepo());
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
    if (repo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRepo());
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
    if (!(obj instanceof com.google.devtools.sourcerepo.v1.CreateRepoRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.sourcerepo.v1.CreateRepoRequest other = (com.google.devtools.sourcerepo.v1.CreateRepoRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasRepo() != other.hasRepo()) return false;
    if (hasRepo()) {
      if (!getRepo()
          .equals(other.getRepo())) return false;
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
    if (hasRepo()) {
      hash = (37 * hash) + REPO_FIELD_NUMBER;
      hash = (53 * hash) + getRepo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.sourcerepo.v1.CreateRepoRequest prototype) {
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
   * Request for CreateRepo
   * </pre>
   *
   * Protobuf type {@code google.devtools.sourcerepo.v1.CreateRepoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.sourcerepo.v1.CreateRepoRequest)
      com.google.devtools.sourcerepo.v1.CreateRepoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.sourcerepo.v1.SourceRepoProto.internal_static_google_devtools_sourcerepo_v1_CreateRepoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.sourcerepo.v1.SourceRepoProto.internal_static_google_devtools_sourcerepo_v1_CreateRepoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.sourcerepo.v1.CreateRepoRequest.class, com.google.devtools.sourcerepo.v1.CreateRepoRequest.Builder.class);
    }

    // Construct using com.google.devtools.sourcerepo.v1.CreateRepoRequest.newBuilder()
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
      repo_ = null;
      if (repoBuilder_ != null) {
        repoBuilder_.dispose();
        repoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.sourcerepo.v1.SourceRepoProto.internal_static_google_devtools_sourcerepo_v1_CreateRepoRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.sourcerepo.v1.CreateRepoRequest getDefaultInstanceForType() {
      return com.google.devtools.sourcerepo.v1.CreateRepoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.sourcerepo.v1.CreateRepoRequest build() {
      com.google.devtools.sourcerepo.v1.CreateRepoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.sourcerepo.v1.CreateRepoRequest buildPartial() {
      com.google.devtools.sourcerepo.v1.CreateRepoRequest result = new com.google.devtools.sourcerepo.v1.CreateRepoRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.sourcerepo.v1.CreateRepoRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.repo_ = repoBuilder_ == null
            ? repo_
            : repoBuilder_.build();
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
      if (other instanceof com.google.devtools.sourcerepo.v1.CreateRepoRequest) {
        return mergeFrom((com.google.devtools.sourcerepo.v1.CreateRepoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.sourcerepo.v1.CreateRepoRequest other) {
      if (other == com.google.devtools.sourcerepo.v1.CreateRepoRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRepo()) {
        mergeRepo(other.getRepo());
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
                  getRepoFieldBuilder().getBuilder(),
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
     * The project in which to create the repo. Values are of the form
     * `projects/&lt;project&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project in which to create the repo. Values are of the form
     * `projects/&lt;project&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project in which to create the repo. Values are of the form
     * `projects/&lt;project&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project in which to create the repo. Values are of the form
     * `projects/&lt;project&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project in which to create the repo. Values are of the form
     * `projects/&lt;project&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private com.google.devtools.sourcerepo.v1.Repo repo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.sourcerepo.v1.Repo, com.google.devtools.sourcerepo.v1.Repo.Builder, com.google.devtools.sourcerepo.v1.RepoOrBuilder> repoBuilder_;
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     * @return Whether the repo field is set.
     */
    public boolean hasRepo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     * @return The repo.
     */
    public com.google.devtools.sourcerepo.v1.Repo getRepo() {
      if (repoBuilder_ == null) {
        return repo_ == null ? com.google.devtools.sourcerepo.v1.Repo.getDefaultInstance() : repo_;
      } else {
        return repoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    public Builder setRepo(com.google.devtools.sourcerepo.v1.Repo value) {
      if (repoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repo_ = value;
      } else {
        repoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    public Builder setRepo(
        com.google.devtools.sourcerepo.v1.Repo.Builder builderForValue) {
      if (repoBuilder_ == null) {
        repo_ = builderForValue.build();
      } else {
        repoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    public Builder mergeRepo(com.google.devtools.sourcerepo.v1.Repo value) {
      if (repoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          repo_ != null &&
          repo_ != com.google.devtools.sourcerepo.v1.Repo.getDefaultInstance()) {
          getRepoBuilder().mergeFrom(value);
        } else {
          repo_ = value;
        }
      } else {
        repoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    public Builder clearRepo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      repo_ = null;
      if (repoBuilder_ != null) {
        repoBuilder_.dispose();
        repoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    public com.google.devtools.sourcerepo.v1.Repo.Builder getRepoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRepoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    public com.google.devtools.sourcerepo.v1.RepoOrBuilder getRepoOrBuilder() {
      if (repoBuilder_ != null) {
        return repoBuilder_.getMessageOrBuilder();
      } else {
        return repo_ == null ?
            com.google.devtools.sourcerepo.v1.Repo.getDefaultInstance() : repo_;
      }
    }
    /**
     * <pre>
     * The repo to create.  Only name should be set; setting other fields
     * is an error.  The project in the name should match the parent field.
     * </pre>
     *
     * <code>.google.devtools.sourcerepo.v1.Repo repo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.sourcerepo.v1.Repo, com.google.devtools.sourcerepo.v1.Repo.Builder, com.google.devtools.sourcerepo.v1.RepoOrBuilder> 
        getRepoFieldBuilder() {
      if (repoBuilder_ == null) {
        repoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.sourcerepo.v1.Repo, com.google.devtools.sourcerepo.v1.Repo.Builder, com.google.devtools.sourcerepo.v1.RepoOrBuilder>(
                getRepo(),
                getParentForChildren(),
                isClean());
        repo_ = null;
      }
      return repoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.sourcerepo.v1.CreateRepoRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.sourcerepo.v1.CreateRepoRequest)
  private static final com.google.devtools.sourcerepo.v1.CreateRepoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.sourcerepo.v1.CreateRepoRequest();
  }

  public static com.google.devtools.sourcerepo.v1.CreateRepoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRepoRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRepoRequest>() {
    @java.lang.Override
    public CreateRepoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRepoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRepoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.sourcerepo.v1.CreateRepoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
