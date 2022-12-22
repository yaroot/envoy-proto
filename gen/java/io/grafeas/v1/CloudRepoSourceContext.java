// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/provenance.proto

package io.grafeas.v1;

/**
 * <pre>
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
 * Source Repo.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.CloudRepoSourceContext}
 */
public final class CloudRepoSourceContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.CloudRepoSourceContext)
    CloudRepoSourceContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudRepoSourceContext.newBuilder() to construct.
  private CloudRepoSourceContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudRepoSourceContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudRepoSourceContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1.Provenance.internal_static_grafeas_v1_CloudRepoSourceContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Provenance.internal_static_grafeas_v1_CloudRepoSourceContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.CloudRepoSourceContext.class, io.grafeas.v1.CloudRepoSourceContext.Builder.class);
  }

  private int revisionCase_ = 0;
  private java.lang.Object revision_;
  public enum RevisionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REVISION_ID(2),
    ALIAS_CONTEXT(3),
    REVISION_NOT_SET(0);
    private final int value;
    private RevisionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RevisionCase valueOf(int value) {
      return forNumber(value);
    }

    public static RevisionCase forNumber(int value) {
      switch (value) {
        case 2: return REVISION_ID;
        case 3: return ALIAS_CONTEXT;
        case 0: return REVISION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RevisionCase
  getRevisionCase() {
    return RevisionCase.forNumber(
        revisionCase_);
  }

  public static final int REPO_ID_FIELD_NUMBER = 1;
  private io.grafeas.v1.RepoId repoId_;
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1.RepoId repo_id = 1;</code>
   * @return Whether the repoId field is set.
   */
  @java.lang.Override
  public boolean hasRepoId() {
    return repoId_ != null;
  }
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1.RepoId repo_id = 1;</code>
   * @return The repoId.
   */
  @java.lang.Override
  public io.grafeas.v1.RepoId getRepoId() {
    return repoId_ == null ? io.grafeas.v1.RepoId.getDefaultInstance() : repoId_;
  }
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1.RepoId repo_id = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.RepoIdOrBuilder getRepoIdOrBuilder() {
    return repoId_ == null ? io.grafeas.v1.RepoId.getDefaultInstance() : repoId_;
  }

  public static final int REVISION_ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   * @return Whether the revisionId field is set.
   */
  public boolean hasRevisionId() {
    return revisionCase_ == 2;
  }
  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   * @return The revisionId.
   */
  public java.lang.String getRevisionId() {
    java.lang.Object ref = "";
    if (revisionCase_ == 2) {
      ref = revision_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (revisionCase_ == 2) {
        revision_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   * @return The bytes for revisionId.
   */
  public com.google.protobuf.ByteString
      getRevisionIdBytes() {
    java.lang.Object ref = "";
    if (revisionCase_ == 2) {
      ref = revision_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (revisionCase_ == 2) {
        revision_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIAS_CONTEXT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
   * @return Whether the aliasContext field is set.
   */
  @java.lang.Override
  public boolean hasAliasContext() {
    return revisionCase_ == 3;
  }
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
   * @return The aliasContext.
   */
  @java.lang.Override
  public io.grafeas.v1.AliasContext getAliasContext() {
    if (revisionCase_ == 3) {
       return (io.grafeas.v1.AliasContext) revision_;
    }
    return io.grafeas.v1.AliasContext.getDefaultInstance();
  }
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.AliasContextOrBuilder getAliasContextOrBuilder() {
    if (revisionCase_ == 3) {
       return (io.grafeas.v1.AliasContext) revision_;
    }
    return io.grafeas.v1.AliasContext.getDefaultInstance();
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
    if (repoId_ != null) {
      output.writeMessage(1, getRepoId());
    }
    if (revisionCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revision_);
    }
    if (revisionCase_ == 3) {
      output.writeMessage(3, (io.grafeas.v1.AliasContext) revision_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (repoId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRepoId());
    }
    if (revisionCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revision_);
    }
    if (revisionCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (io.grafeas.v1.AliasContext) revision_);
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
    if (!(obj instanceof io.grafeas.v1.CloudRepoSourceContext)) {
      return super.equals(obj);
    }
    io.grafeas.v1.CloudRepoSourceContext other = (io.grafeas.v1.CloudRepoSourceContext) obj;

    if (hasRepoId() != other.hasRepoId()) return false;
    if (hasRepoId()) {
      if (!getRepoId()
          .equals(other.getRepoId())) return false;
    }
    if (!getRevisionCase().equals(other.getRevisionCase())) return false;
    switch (revisionCase_) {
      case 2:
        if (!getRevisionId()
            .equals(other.getRevisionId())) return false;
        break;
      case 3:
        if (!getAliasContext()
            .equals(other.getAliasContext())) return false;
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
    if (hasRepoId()) {
      hash = (37 * hash) + REPO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRepoId().hashCode();
    }
    switch (revisionCase_) {
      case 2:
        hash = (37 * hash) + REVISION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRevisionId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ALIAS_CONTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getAliasContext().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.CloudRepoSourceContext parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1.CloudRepoSourceContext prototype) {
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
   * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
   * Source Repo.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.CloudRepoSourceContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.CloudRepoSourceContext)
      io.grafeas.v1.CloudRepoSourceContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1.Provenance.internal_static_grafeas_v1_CloudRepoSourceContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Provenance.internal_static_grafeas_v1_CloudRepoSourceContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.CloudRepoSourceContext.class, io.grafeas.v1.CloudRepoSourceContext.Builder.class);
    }

    // Construct using io.grafeas.v1.CloudRepoSourceContext.newBuilder()
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
      repoId_ = null;
      if (repoIdBuilder_ != null) {
        repoIdBuilder_.dispose();
        repoIdBuilder_ = null;
      }
      if (aliasContextBuilder_ != null) {
        aliasContextBuilder_.clear();
      }
      revisionCase_ = 0;
      revision_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1.Provenance.internal_static_grafeas_v1_CloudRepoSourceContext_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.CloudRepoSourceContext getDefaultInstanceForType() {
      return io.grafeas.v1.CloudRepoSourceContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.CloudRepoSourceContext build() {
      io.grafeas.v1.CloudRepoSourceContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.CloudRepoSourceContext buildPartial() {
      io.grafeas.v1.CloudRepoSourceContext result = new io.grafeas.v1.CloudRepoSourceContext(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.CloudRepoSourceContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.repoId_ = repoIdBuilder_ == null
            ? repoId_
            : repoIdBuilder_.build();
      }
    }

    private void buildPartialOneofs(io.grafeas.v1.CloudRepoSourceContext result) {
      result.revisionCase_ = revisionCase_;
      result.revision_ = this.revision_;
      if (revisionCase_ == 3 &&
          aliasContextBuilder_ != null) {
        result.revision_ = aliasContextBuilder_.build();
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
      if (other instanceof io.grafeas.v1.CloudRepoSourceContext) {
        return mergeFrom((io.grafeas.v1.CloudRepoSourceContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.CloudRepoSourceContext other) {
      if (other == io.grafeas.v1.CloudRepoSourceContext.getDefaultInstance()) return this;
      if (other.hasRepoId()) {
        mergeRepoId(other.getRepoId());
      }
      switch (other.getRevisionCase()) {
        case REVISION_ID: {
          revisionCase_ = 2;
          revision_ = other.revision_;
          onChanged();
          break;
        }
        case ALIAS_CONTEXT: {
          mergeAliasContext(other.getAliasContext());
          break;
        }
        case REVISION_NOT_SET: {
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
              input.readMessage(
                  getRepoIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              revisionCase_ = 2;
              revision_ = s;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAliasContextFieldBuilder().getBuilder(),
                  extensionRegistry);
              revisionCase_ = 3;
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
    private int revisionCase_ = 0;
    private java.lang.Object revision_;
    public RevisionCase
        getRevisionCase() {
      return RevisionCase.forNumber(
          revisionCase_);
    }

    public Builder clearRevision() {
      revisionCase_ = 0;
      revision_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private io.grafeas.v1.RepoId repoId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1.RepoId, io.grafeas.v1.RepoId.Builder, io.grafeas.v1.RepoIdOrBuilder> repoIdBuilder_;
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     * @return Whether the repoId field is set.
     */
    public boolean hasRepoId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     * @return The repoId.
     */
    public io.grafeas.v1.RepoId getRepoId() {
      if (repoIdBuilder_ == null) {
        return repoId_ == null ? io.grafeas.v1.RepoId.getDefaultInstance() : repoId_;
      } else {
        return repoIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    public Builder setRepoId(io.grafeas.v1.RepoId value) {
      if (repoIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repoId_ = value;
      } else {
        repoIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    public Builder setRepoId(
        io.grafeas.v1.RepoId.Builder builderForValue) {
      if (repoIdBuilder_ == null) {
        repoId_ = builderForValue.build();
      } else {
        repoIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    public Builder mergeRepoId(io.grafeas.v1.RepoId value) {
      if (repoIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          repoId_ != null &&
          repoId_ != io.grafeas.v1.RepoId.getDefaultInstance()) {
          getRepoIdBuilder().mergeFrom(value);
        } else {
          repoId_ = value;
        }
      } else {
        repoIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    public Builder clearRepoId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      repoId_ = null;
      if (repoIdBuilder_ != null) {
        repoIdBuilder_.dispose();
        repoIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    public io.grafeas.v1.RepoId.Builder getRepoIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRepoIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    public io.grafeas.v1.RepoIdOrBuilder getRepoIdOrBuilder() {
      if (repoIdBuilder_ != null) {
        return repoIdBuilder_.getMessageOrBuilder();
      } else {
        return repoId_ == null ?
            io.grafeas.v1.RepoId.getDefaultInstance() : repoId_;
      }
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.grafeas.v1.RepoId repo_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1.RepoId, io.grafeas.v1.RepoId.Builder, io.grafeas.v1.RepoIdOrBuilder> 
        getRepoIdFieldBuilder() {
      if (repoIdBuilder_ == null) {
        repoIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.RepoId, io.grafeas.v1.RepoId.Builder, io.grafeas.v1.RepoIdOrBuilder>(
                getRepoId(),
                getParentForChildren(),
                isClean());
        repoId_ = null;
      }
      return repoIdBuilder_;
    }

    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     * @return Whether the revisionId field is set.
     */
    @java.lang.Override
    public boolean hasRevisionId() {
      return revisionCase_ == 2;
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     * @return The revisionId.
     */
    @java.lang.Override
    public java.lang.String getRevisionId() {
      java.lang.Object ref = "";
      if (revisionCase_ == 2) {
        ref = revision_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (revisionCase_ == 2) {
          revision_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     * @return The bytes for revisionId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRevisionIdBytes() {
      java.lang.Object ref = "";
      if (revisionCase_ == 2) {
        ref = revision_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (revisionCase_ == 2) {
          revision_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     * @param value The revisionId to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      revisionCase_ = 2;
      revision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRevisionId() {
      if (revisionCase_ == 2) {
        revisionCase_ = 0;
        revision_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     * @param value The bytes for revisionId to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      revisionCase_ = 2;
      revision_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1.AliasContext, io.grafeas.v1.AliasContext.Builder, io.grafeas.v1.AliasContextOrBuilder> aliasContextBuilder_;
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     * @return Whether the aliasContext field is set.
     */
    @java.lang.Override
    public boolean hasAliasContext() {
      return revisionCase_ == 3;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     * @return The aliasContext.
     */
    @java.lang.Override
    public io.grafeas.v1.AliasContext getAliasContext() {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 3) {
          return (io.grafeas.v1.AliasContext) revision_;
        }
        return io.grafeas.v1.AliasContext.getDefaultInstance();
      } else {
        if (revisionCase_ == 3) {
          return aliasContextBuilder_.getMessage();
        }
        return io.grafeas.v1.AliasContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    public Builder setAliasContext(io.grafeas.v1.AliasContext value) {
      if (aliasContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        revision_ = value;
        onChanged();
      } else {
        aliasContextBuilder_.setMessage(value);
      }
      revisionCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    public Builder setAliasContext(
        io.grafeas.v1.AliasContext.Builder builderForValue) {
      if (aliasContextBuilder_ == null) {
        revision_ = builderForValue.build();
        onChanged();
      } else {
        aliasContextBuilder_.setMessage(builderForValue.build());
      }
      revisionCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    public Builder mergeAliasContext(io.grafeas.v1.AliasContext value) {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 3 &&
            revision_ != io.grafeas.v1.AliasContext.getDefaultInstance()) {
          revision_ = io.grafeas.v1.AliasContext.newBuilder((io.grafeas.v1.AliasContext) revision_)
              .mergeFrom(value).buildPartial();
        } else {
          revision_ = value;
        }
        onChanged();
      } else {
        if (revisionCase_ == 3) {
          aliasContextBuilder_.mergeFrom(value);
        } else {
          aliasContextBuilder_.setMessage(value);
        }
      }
      revisionCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    public Builder clearAliasContext() {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 3) {
          revisionCase_ = 0;
          revision_ = null;
          onChanged();
        }
      } else {
        if (revisionCase_ == 3) {
          revisionCase_ = 0;
          revision_ = null;
        }
        aliasContextBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    public io.grafeas.v1.AliasContext.Builder getAliasContextBuilder() {
      return getAliasContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    @java.lang.Override
    public io.grafeas.v1.AliasContextOrBuilder getAliasContextOrBuilder() {
      if ((revisionCase_ == 3) && (aliasContextBuilder_ != null)) {
        return aliasContextBuilder_.getMessageOrBuilder();
      } else {
        if (revisionCase_ == 3) {
          return (io.grafeas.v1.AliasContext) revision_;
        }
        return io.grafeas.v1.AliasContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1.AliasContext alias_context = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1.AliasContext, io.grafeas.v1.AliasContext.Builder, io.grafeas.v1.AliasContextOrBuilder> 
        getAliasContextFieldBuilder() {
      if (aliasContextBuilder_ == null) {
        if (!(revisionCase_ == 3)) {
          revision_ = io.grafeas.v1.AliasContext.getDefaultInstance();
        }
        aliasContextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.AliasContext, io.grafeas.v1.AliasContext.Builder, io.grafeas.v1.AliasContextOrBuilder>(
                (io.grafeas.v1.AliasContext) revision_,
                getParentForChildren(),
                isClean());
        revision_ = null;
      }
      revisionCase_ = 3;
      onChanged();
      return aliasContextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:grafeas.v1.CloudRepoSourceContext)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.CloudRepoSourceContext)
  private static final io.grafeas.v1.CloudRepoSourceContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.CloudRepoSourceContext();
  }

  public static io.grafeas.v1.CloudRepoSourceContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudRepoSourceContext>
      PARSER = new com.google.protobuf.AbstractParser<CloudRepoSourceContext>() {
    @java.lang.Override
    public CloudRepoSourceContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudRepoSourceContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudRepoSourceContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.CloudRepoSourceContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

