// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/http/original_ip_detection/custom_header/v3/custom_header.proto

package io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3;

/**
 * <pre>
 * This extension allows for the original downstream remote IP to be detected
 * by reading the value from a configured header name. If the value is successfully parsed
 * as an IP, it'll be treated as the effective downstream remote address and seen as such
 * by all filters. See :ref:`original_ip_detection_extensions
 * &lt;envoy_v3_api_field_extensions.filters.network.http_connection_manager.v3.HttpConnectionManager.original_ip_detection_extensions&gt;`
 * for an overview of how extensions operate and what happens when an extension fails
 * to detect the remote IP.
 * [#extension: envoy.http.original_ip_detection.custom_header]
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig}
 */
public final class CustomHeaderConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig)
    CustomHeaderConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomHeaderConfig.newBuilder() to construct.
  private CustomHeaderConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomHeaderConfig() {
    headerName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomHeaderConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderProto.internal_static_envoy_extensions_http_original_ip_detection_custom_header_v3_CustomHeaderConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderProto.internal_static_envoy_extensions_http_original_ip_detection_custom_header_v3_CustomHeaderConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.class, io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.Builder.class);
  }

  public static final int HEADER_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object headerName_ = "";
  /**
   * <pre>
   * The header name containing the original downstream remote address, if present.
   * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
   * </pre>
   *
   * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
   * @return The headerName.
   */
  @java.lang.Override
  public java.lang.String getHeaderName() {
    java.lang.Object ref = headerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      headerName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The header name containing the original downstream remote address, if present.
   * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
   * </pre>
   *
   * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for headerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHeaderNameBytes() {
    java.lang.Object ref = headerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      headerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOW_EXTENSION_TO_SET_ADDRESS_AS_TRUSTED_FIELD_NUMBER = 2;
  private boolean allowExtensionToSetAddressAsTrusted_ = false;
  /**
   * <pre>
   * If set to true, the extension could decide that the detected address should be treated as
   * trusted by the HCM. If the address is considered :ref:`trusted&lt;config_http_conn_man_headers_x-forwarded-for_trusted_client_address&gt;`,
   * it might be used as input to determine if the request is internal (among other things).
   * </pre>
   *
   * <code>bool allow_extension_to_set_address_as_trusted = 2;</code>
   * @return The allowExtensionToSetAddressAsTrusted.
   */
  @java.lang.Override
  public boolean getAllowExtensionToSetAddressAsTrusted() {
    return allowExtensionToSetAddressAsTrusted_;
  }

  public static final int REJECT_WITH_STATUS_FIELD_NUMBER = 3;
  private io.envoyproxy.envoy.type.v3.HttpStatus rejectWithStatus_;
  /**
   * <pre>
   * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
   * .. note::
   *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
   * @return Whether the rejectWithStatus field is set.
   */
  @java.lang.Override
  public boolean hasRejectWithStatus() {
    return rejectWithStatus_ != null;
  }
  /**
   * <pre>
   * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
   * .. note::
   *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
   * @return The rejectWithStatus.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.HttpStatus getRejectWithStatus() {
    return rejectWithStatus_ == null ? io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance() : rejectWithStatus_;
  }
  /**
   * <pre>
   * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
   * .. note::
   *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder getRejectWithStatusOrBuilder() {
    return rejectWithStatus_ == null ? io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance() : rejectWithStatus_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(headerName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, headerName_);
    }
    if (allowExtensionToSetAddressAsTrusted_ != false) {
      output.writeBool(2, allowExtensionToSetAddressAsTrusted_);
    }
    if (rejectWithStatus_ != null) {
      output.writeMessage(3, getRejectWithStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(headerName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, headerName_);
    }
    if (allowExtensionToSetAddressAsTrusted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, allowExtensionToSetAddressAsTrusted_);
    }
    if (rejectWithStatus_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRejectWithStatus());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig other = (io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig) obj;

    if (!getHeaderName()
        .equals(other.getHeaderName())) return false;
    if (getAllowExtensionToSetAddressAsTrusted()
        != other.getAllowExtensionToSetAddressAsTrusted()) return false;
    if (hasRejectWithStatus() != other.hasRejectWithStatus()) return false;
    if (hasRejectWithStatus()) {
      if (!getRejectWithStatus()
          .equals(other.getRejectWithStatus())) return false;
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
    hash = (37 * hash) + HEADER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHeaderName().hashCode();
    hash = (37 * hash) + ALLOW_EXTENSION_TO_SET_ADDRESS_AS_TRUSTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowExtensionToSetAddressAsTrusted());
    if (hasRejectWithStatus()) {
      hash = (37 * hash) + REJECT_WITH_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getRejectWithStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig prototype) {
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
   * This extension allows for the original downstream remote IP to be detected
   * by reading the value from a configured header name. If the value is successfully parsed
   * as an IP, it'll be treated as the effective downstream remote address and seen as such
   * by all filters. See :ref:`original_ip_detection_extensions
   * &lt;envoy_v3_api_field_extensions.filters.network.http_connection_manager.v3.HttpConnectionManager.original_ip_detection_extensions&gt;`
   * for an overview of how extensions operate and what happens when an extension fails
   * to detect the remote IP.
   * [#extension: envoy.http.original_ip_detection.custom_header]
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig)
      io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderProto.internal_static_envoy_extensions_http_original_ip_detection_custom_header_v3_CustomHeaderConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderProto.internal_static_envoy_extensions_http_original_ip_detection_custom_header_v3_CustomHeaderConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.class, io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.newBuilder()
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
      headerName_ = "";
      allowExtensionToSetAddressAsTrusted_ = false;
      rejectWithStatus_ = null;
      if (rejectWithStatusBuilder_ != null) {
        rejectWithStatusBuilder_.dispose();
        rejectWithStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderProto.internal_static_envoy_extensions_http_original_ip_detection_custom_header_v3_CustomHeaderConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig build() {
      io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig buildPartial() {
      io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig result = new io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headerName_ = headerName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allowExtensionToSetAddressAsTrusted_ = allowExtensionToSetAddressAsTrusted_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rejectWithStatus_ = rejectWithStatusBuilder_ == null
            ? rejectWithStatus_
            : rejectWithStatusBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig) {
        return mergeFrom((io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig other) {
      if (other == io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig.getDefaultInstance()) return this;
      if (!other.getHeaderName().isEmpty()) {
        headerName_ = other.headerName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAllowExtensionToSetAddressAsTrusted() != false) {
        setAllowExtensionToSetAddressAsTrusted(other.getAllowExtensionToSetAddressAsTrusted());
      }
      if (other.hasRejectWithStatus()) {
        mergeRejectWithStatus(other.getRejectWithStatus());
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
              headerName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              allowExtensionToSetAddressAsTrusted_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getRejectWithStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private java.lang.Object headerName_ = "";
    /**
     * <pre>
     * The header name containing the original downstream remote address, if present.
     * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
     * </pre>
     *
     * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
     * @return The headerName.
     */
    public java.lang.String getHeaderName() {
      java.lang.Object ref = headerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The header name containing the original downstream remote address, if present.
     * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
     * </pre>
     *
     * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for headerName.
     */
    public com.google.protobuf.ByteString
        getHeaderNameBytes() {
      java.lang.Object ref = headerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        headerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The header name containing the original downstream remote address, if present.
     * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
     * </pre>
     *
     * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The headerName to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      headerName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The header name containing the original downstream remote address, if present.
     * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
     * </pre>
     *
     * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearHeaderName() {
      headerName_ = getDefaultInstance().getHeaderName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The header name containing the original downstream remote address, if present.
     * Note: in the case of a multi-valued header, only the first value is tried and the rest are ignored.
     * </pre>
     *
     * <code>string header_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for headerName to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      headerName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean allowExtensionToSetAddressAsTrusted_ ;
    /**
     * <pre>
     * If set to true, the extension could decide that the detected address should be treated as
     * trusted by the HCM. If the address is considered :ref:`trusted&lt;config_http_conn_man_headers_x-forwarded-for_trusted_client_address&gt;`,
     * it might be used as input to determine if the request is internal (among other things).
     * </pre>
     *
     * <code>bool allow_extension_to_set_address_as_trusted = 2;</code>
     * @return The allowExtensionToSetAddressAsTrusted.
     */
    @java.lang.Override
    public boolean getAllowExtensionToSetAddressAsTrusted() {
      return allowExtensionToSetAddressAsTrusted_;
    }
    /**
     * <pre>
     * If set to true, the extension could decide that the detected address should be treated as
     * trusted by the HCM. If the address is considered :ref:`trusted&lt;config_http_conn_man_headers_x-forwarded-for_trusted_client_address&gt;`,
     * it might be used as input to determine if the request is internal (among other things).
     * </pre>
     *
     * <code>bool allow_extension_to_set_address_as_trusted = 2;</code>
     * @param value The allowExtensionToSetAddressAsTrusted to set.
     * @return This builder for chaining.
     */
    public Builder setAllowExtensionToSetAddressAsTrusted(boolean value) {
      
      allowExtensionToSetAddressAsTrusted_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, the extension could decide that the detected address should be treated as
     * trusted by the HCM. If the address is considered :ref:`trusted&lt;config_http_conn_man_headers_x-forwarded-for_trusted_client_address&gt;`,
     * it might be used as input to determine if the request is internal (among other things).
     * </pre>
     *
     * <code>bool allow_extension_to_set_address_as_trusted = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowExtensionToSetAddressAsTrusted() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allowExtensionToSetAddressAsTrusted_ = false;
      onChanged();
      return this;
    }

    private io.envoyproxy.envoy.type.v3.HttpStatus rejectWithStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.HttpStatus, io.envoyproxy.envoy.type.v3.HttpStatus.Builder, io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder> rejectWithStatusBuilder_;
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     * @return Whether the rejectWithStatus field is set.
     */
    public boolean hasRejectWithStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     * @return The rejectWithStatus.
     */
    public io.envoyproxy.envoy.type.v3.HttpStatus getRejectWithStatus() {
      if (rejectWithStatusBuilder_ == null) {
        return rejectWithStatus_ == null ? io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance() : rejectWithStatus_;
      } else {
        return rejectWithStatusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    public Builder setRejectWithStatus(io.envoyproxy.envoy.type.v3.HttpStatus value) {
      if (rejectWithStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rejectWithStatus_ = value;
      } else {
        rejectWithStatusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    public Builder setRejectWithStatus(
        io.envoyproxy.envoy.type.v3.HttpStatus.Builder builderForValue) {
      if (rejectWithStatusBuilder_ == null) {
        rejectWithStatus_ = builderForValue.build();
      } else {
        rejectWithStatusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    public Builder mergeRejectWithStatus(io.envoyproxy.envoy.type.v3.HttpStatus value) {
      if (rejectWithStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          rejectWithStatus_ != null &&
          rejectWithStatus_ != io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance()) {
          getRejectWithStatusBuilder().mergeFrom(value);
        } else {
          rejectWithStatus_ = value;
        }
      } else {
        rejectWithStatusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    public Builder clearRejectWithStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rejectWithStatus_ = null;
      if (rejectWithStatusBuilder_ != null) {
        rejectWithStatusBuilder_.dispose();
        rejectWithStatusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    public io.envoyproxy.envoy.type.v3.HttpStatus.Builder getRejectWithStatusBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRejectWithStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    public io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder getRejectWithStatusOrBuilder() {
      if (rejectWithStatusBuilder_ != null) {
        return rejectWithStatusBuilder_.getMessageOrBuilder();
      } else {
        return rejectWithStatus_ == null ?
            io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance() : rejectWithStatus_;
      }
    }
    /**
     * <pre>
     * If this is set, the request will be rejected when detection fails using it as the HTTP response status.
     * .. note::
     *   If this is set to &lt; 400 or &gt; 511, the default status 403 will be used instead.
     * </pre>
     *
     * <code>.envoy.type.v3.HttpStatus reject_with_status = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.HttpStatus, io.envoyproxy.envoy.type.v3.HttpStatus.Builder, io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder> 
        getRejectWithStatusFieldBuilder() {
      if (rejectWithStatusBuilder_ == null) {
        rejectWithStatusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.v3.HttpStatus, io.envoyproxy.envoy.type.v3.HttpStatus.Builder, io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder>(
                getRejectWithStatus(),
                getParentForChildren(),
                isClean());
        rejectWithStatus_ = null;
      }
      return rejectWithStatusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig)
  private static final io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig();
  }

  public static io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomHeaderConfig>
      PARSER = new com.google.protobuf.AbstractParser<CustomHeaderConfig>() {
    @java.lang.Override
    public CustomHeaderConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomHeaderConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomHeaderConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.http.original_ip_detection.custom_header.v3.CustomHeaderConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
