// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/app_yaml.proto

package com.google.appengine.v1beta;

/**
 * <pre>
 * Uses Google Cloud Endpoints to handle requests.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1beta.ApiEndpointHandler}
 */
public final class ApiEndpointHandler extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1beta.ApiEndpointHandler)
    ApiEndpointHandlerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiEndpointHandler.newBuilder() to construct.
  private ApiEndpointHandler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiEndpointHandler() {
    scriptPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiEndpointHandler();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1beta.AppYamlProto.internal_static_google_appengine_v1beta_ApiEndpointHandler_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1beta.AppYamlProto.internal_static_google_appengine_v1beta_ApiEndpointHandler_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1beta.ApiEndpointHandler.class, com.google.appengine.v1beta.ApiEndpointHandler.Builder.class);
  }

  public static final int SCRIPT_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scriptPath_ = "";
  /**
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script_path = 1;</code>
   * @return The scriptPath.
   */
  @java.lang.Override
  public java.lang.String getScriptPath() {
    java.lang.Object ref = scriptPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scriptPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script_path = 1;</code>
   * @return The bytes for scriptPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScriptPathBytes() {
    java.lang.Object ref = scriptPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scriptPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scriptPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scriptPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scriptPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scriptPath_);
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
    if (!(obj instanceof com.google.appengine.v1beta.ApiEndpointHandler)) {
      return super.equals(obj);
    }
    com.google.appengine.v1beta.ApiEndpointHandler other = (com.google.appengine.v1beta.ApiEndpointHandler) obj;

    if (!getScriptPath()
        .equals(other.getScriptPath())) return false;
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
    hash = (37 * hash) + SCRIPT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getScriptPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1beta.ApiEndpointHandler parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1beta.ApiEndpointHandler prototype) {
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
   * Uses Google Cloud Endpoints to handle requests.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1beta.ApiEndpointHandler}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1beta.ApiEndpointHandler)
      com.google.appengine.v1beta.ApiEndpointHandlerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1beta.AppYamlProto.internal_static_google_appengine_v1beta_ApiEndpointHandler_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1beta.AppYamlProto.internal_static_google_appengine_v1beta_ApiEndpointHandler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1beta.ApiEndpointHandler.class, com.google.appengine.v1beta.ApiEndpointHandler.Builder.class);
    }

    // Construct using com.google.appengine.v1beta.ApiEndpointHandler.newBuilder()
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
      scriptPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1beta.AppYamlProto.internal_static_google_appengine_v1beta_ApiEndpointHandler_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.ApiEndpointHandler getDefaultInstanceForType() {
      return com.google.appengine.v1beta.ApiEndpointHandler.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1beta.ApiEndpointHandler build() {
      com.google.appengine.v1beta.ApiEndpointHandler result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1beta.ApiEndpointHandler buildPartial() {
      com.google.appengine.v1beta.ApiEndpointHandler result = new com.google.appengine.v1beta.ApiEndpointHandler(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1beta.ApiEndpointHandler result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scriptPath_ = scriptPath_;
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
      if (other instanceof com.google.appengine.v1beta.ApiEndpointHandler) {
        return mergeFrom((com.google.appengine.v1beta.ApiEndpointHandler)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1beta.ApiEndpointHandler other) {
      if (other == com.google.appengine.v1beta.ApiEndpointHandler.getDefaultInstance()) return this;
      if (!other.getScriptPath().isEmpty()) {
        scriptPath_ = other.scriptPath_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              scriptPath_ = input.readStringRequireUtf8();
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

    private java.lang.Object scriptPath_ = "";
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     * @return The scriptPath.
     */
    public java.lang.String getScriptPath() {
      java.lang.Object ref = scriptPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scriptPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     * @return The bytes for scriptPath.
     */
    public com.google.protobuf.ByteString
        getScriptPathBytes() {
      java.lang.Object ref = scriptPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     * @param value The scriptPath to set.
     * @return This builder for chaining.
     */
    public Builder setScriptPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scriptPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScriptPath() {
      scriptPath_ = getDefaultInstance().getScriptPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     * @param value The bytes for scriptPath to set.
     * @return This builder for chaining.
     */
    public Builder setScriptPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scriptPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1beta.ApiEndpointHandler)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1beta.ApiEndpointHandler)
  private static final com.google.appengine.v1beta.ApiEndpointHandler DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1beta.ApiEndpointHandler();
  }

  public static com.google.appengine.v1beta.ApiEndpointHandler getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiEndpointHandler>
      PARSER = new com.google.protobuf.AbstractParser<ApiEndpointHandler>() {
    @java.lang.Override
    public ApiEndpointHandler parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApiEndpointHandler> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiEndpointHandler> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1beta.ApiEndpointHandler getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
