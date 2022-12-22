// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/retry/previous_hosts/v2/previous_hosts.proto

package io.envoyproxy.envoy.config.retry.previous_hosts.v2;

/**
 * Protobuf type {@code envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate}
 */
public final class PreviousHostsPredicate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate)
    PreviousHostsPredicateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreviousHostsPredicate.newBuilder() to construct.
  private PreviousHostsPredicate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreviousHostsPredicate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PreviousHostsPredicate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsProto.internal_static_envoy_config_retry_previous_hosts_v2_PreviousHostsPredicate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsProto.internal_static_envoy_config_retry_previous_hosts_v2_PreviousHostsPredicate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.class, io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate other = (io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate prototype) {
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
   * Protobuf type {@code envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate)
      io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsProto.internal_static_envoy_config_retry_previous_hosts_v2_PreviousHostsPredicate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsProto.internal_static_envoy_config_retry_previous_hosts_v2_PreviousHostsPredicate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.class, io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsProto.internal_static_envoy_config_retry_previous_hosts_v2_PreviousHostsPredicate_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate build() {
      io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate buildPartial() {
      io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate result = new io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate(this);
      onBuilt();
      return result;
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
      if (other instanceof io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate) {
        return mergeFrom((io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate other) {
      if (other == io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate)
  private static final io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate();
  }

  public static io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviousHostsPredicate>
      PARSER = new com.google.protobuf.AbstractParser<PreviousHostsPredicate>() {
    @java.lang.Override
    public PreviousHostsPredicate parsePartialFrom(
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

  public static com.google.protobuf.Parser<PreviousHostsPredicate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviousHostsPredicate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.retry.previous_hosts.v2.PreviousHostsPredicate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

