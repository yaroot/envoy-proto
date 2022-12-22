// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

/**
 * <pre>
 * Header name/value pair plus option to control append behavior.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.HeaderValueOption}
 */
public final class HeaderValueOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.HeaderValueOption)
    HeaderValueOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeaderValueOption.newBuilder() to construct.
  private HeaderValueOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeaderValueOption() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeaderValueOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderValueOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.api.v2.core.HeaderValueOption.class, io.envoyproxy.envoy.api.v2.core.HeaderValueOption.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.api.v2.core.HeaderValue header_;
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   * @return The header.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.HeaderValue getHeader() {
    return header_ == null ? io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder getHeaderOrBuilder() {
    return header_ == null ? io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
  }

  public static final int APPEND_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue append_;
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   * @return Whether the append field is set.
   */
  @java.lang.Override
  public boolean hasAppend() {
    return append_ != null;
  }
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   * @return The append.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getAppend() {
    return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
  }
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getAppendOrBuilder() {
    return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (append_ != null) {
      output.writeMessage(2, getAppend());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (append_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppend());
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
    if (!(obj instanceof io.envoyproxy.envoy.api.v2.core.HeaderValueOption)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.api.v2.core.HeaderValueOption other = (io.envoyproxy.envoy.api.v2.core.HeaderValueOption) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasAppend() != other.hasAppend()) return false;
    if (hasAppend()) {
      if (!getAppend()
          .equals(other.getAppend())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasAppend()) {
      hash = (37 * hash) + APPEND_FIELD_NUMBER;
      hash = (53 * hash) + getAppend().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.api.v2.core.HeaderValueOption prototype) {
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
   * Header name/value pair plus option to control append behavior.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.HeaderValueOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.HeaderValueOption)
      io.envoyproxy.envoy.api.v2.core.HeaderValueOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderValueOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.api.v2.core.HeaderValueOption.class, io.envoyproxy.envoy.api.v2.core.HeaderValueOption.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.api.v2.core.HeaderValueOption.newBuilder()
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
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      append_ = null;
      if (appendBuilder_ != null) {
        appendBuilder_.dispose();
        appendBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.HeaderValueOption getDefaultInstanceForType() {
      return io.envoyproxy.envoy.api.v2.core.HeaderValueOption.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.HeaderValueOption build() {
      io.envoyproxy.envoy.api.v2.core.HeaderValueOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.HeaderValueOption buildPartial() {
      io.envoyproxy.envoy.api.v2.core.HeaderValueOption result = new io.envoyproxy.envoy.api.v2.core.HeaderValueOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.api.v2.core.HeaderValueOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.append_ = appendBuilder_ == null
            ? append_
            : appendBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.api.v2.core.HeaderValueOption) {
        return mergeFrom((io.envoyproxy.envoy.api.v2.core.HeaderValueOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.api.v2.core.HeaderValueOption other) {
      if (other == io.envoyproxy.envoy.api.v2.core.HeaderValueOption.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasAppend()) {
        mergeAppend(other.getAppend());
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
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAppendFieldBuilder().getBuilder(),
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

    private io.envoyproxy.envoy.api.v2.core.HeaderValue header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.HeaderValue, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder, io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> headerBuilder_;
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     * @return The header.
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValue getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setHeader(io.envoyproxy.envoy.api.v2.core.HeaderValue value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setHeader(
        io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeHeader(io.envoyproxy.envoy.api.v2.core.HeaderValue value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          header_ != null &&
          header_ != io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.HeaderValue, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder, io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.HeaderValue, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder, io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.BoolValue append_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> appendBuilder_;
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     * @return Whether the append field is set.
     */
    public boolean hasAppend() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     * @return The append.
     */
    public com.google.protobuf.BoolValue getAppend() {
      if (appendBuilder_ == null) {
        return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
      } else {
        return appendBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder setAppend(com.google.protobuf.BoolValue value) {
      if (appendBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        append_ = value;
      } else {
        appendBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder setAppend(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (appendBuilder_ == null) {
        append_ = builderForValue.build();
      } else {
        appendBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder mergeAppend(com.google.protobuf.BoolValue value) {
      if (appendBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          append_ != null &&
          append_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getAppendBuilder().mergeFrom(value);
        } else {
          append_ = value;
        }
      } else {
        appendBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder clearAppend() {
      bitField0_ = (bitField0_ & ~0x00000002);
      append_ = null;
      if (appendBuilder_ != null) {
        appendBuilder_.dispose();
        appendBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAppendBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAppendFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAppendOrBuilder() {
      if (appendBuilder_ != null) {
        return appendBuilder_.getMessageOrBuilder();
      } else {
        return append_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : append_;
      }
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getAppendFieldBuilder() {
      if (appendBuilder_ == null) {
        appendBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getAppend(),
                getParentForChildren(),
                isClean());
        append_ = null;
      }
      return appendBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.HeaderValueOption)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.HeaderValueOption)
  private static final io.envoyproxy.envoy.api.v2.core.HeaderValueOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.api.v2.core.HeaderValueOption();
  }

  public static io.envoyproxy.envoy.api.v2.core.HeaderValueOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeaderValueOption>
      PARSER = new com.google.protobuf.AbstractParser<HeaderValueOption>() {
    @java.lang.Override
    public HeaderValueOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<HeaderValueOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeaderValueOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.HeaderValueOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

