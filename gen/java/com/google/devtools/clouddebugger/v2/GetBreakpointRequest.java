// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Request to get breakpoint information.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.GetBreakpointRequest}
 */
public final class GetBreakpointRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.GetBreakpointRequest)
    GetBreakpointRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBreakpointRequest.newBuilder() to construct.
  private GetBreakpointRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBreakpointRequest() {
    debuggeeId_ = "";
    breakpointId_ = "";
    clientVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBreakpointRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.GetBreakpointRequest.class, com.google.devtools.clouddebugger.v2.GetBreakpointRequest.Builder.class);
  }

  public static final int DEBUGGEE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object debuggeeId_ = "";
  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoint to get.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  @java.lang.Override
  public java.lang.String getDebuggeeId() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      debuggeeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoint to get.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDebuggeeIdBytes() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      debuggeeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BREAKPOINT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object breakpointId_ = "";
  /**
   * <pre>
   * Required. ID of the breakpoint to get.
   * </pre>
   *
   * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The breakpointId.
   */
  @java.lang.Override
  public java.lang.String getBreakpointId() {
    java.lang.Object ref = breakpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      breakpointId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. ID of the breakpoint to get.
   * </pre>
   *
   * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for breakpointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBreakpointIdBytes() {
    java.lang.Object ref = breakpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      breakpointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_VERSION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientVersion_ = "";
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientVersion.
   */
  @java.lang.Override
  public java.lang.String getClientVersion() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientVersionBytes() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(debuggeeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, debuggeeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(breakpointId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, breakpointId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, clientVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(debuggeeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, debuggeeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(breakpointId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, breakpointId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, clientVersion_);
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.GetBreakpointRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.GetBreakpointRequest other = (com.google.devtools.clouddebugger.v2.GetBreakpointRequest) obj;

    if (!getDebuggeeId()
        .equals(other.getDebuggeeId())) return false;
    if (!getBreakpointId()
        .equals(other.getBreakpointId())) return false;
    if (!getClientVersion()
        .equals(other.getClientVersion())) return false;
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
    hash = (37 * hash) + DEBUGGEE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDebuggeeId().hashCode();
    hash = (37 * hash) + BREAKPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBreakpointId().hashCode();
    hash = (37 * hash) + CLIENT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getClientVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.GetBreakpointRequest prototype) {
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
   * Request to get breakpoint information.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.GetBreakpointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.GetBreakpointRequest)
      com.google.devtools.clouddebugger.v2.GetBreakpointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.GetBreakpointRequest.class, com.google.devtools.clouddebugger.v2.GetBreakpointRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.GetBreakpointRequest.newBuilder()
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
      debuggeeId_ = "";
      breakpointId_ = "";
      clientVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.GetBreakpointRequest getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.GetBreakpointRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.GetBreakpointRequest build() {
      com.google.devtools.clouddebugger.v2.GetBreakpointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.GetBreakpointRequest buildPartial() {
      com.google.devtools.clouddebugger.v2.GetBreakpointRequest result = new com.google.devtools.clouddebugger.v2.GetBreakpointRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.clouddebugger.v2.GetBreakpointRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.debuggeeId_ = debuggeeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.breakpointId_ = breakpointId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.clientVersion_ = clientVersion_;
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
      if (other instanceof com.google.devtools.clouddebugger.v2.GetBreakpointRequest) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.GetBreakpointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.GetBreakpointRequest other) {
      if (other == com.google.devtools.clouddebugger.v2.GetBreakpointRequest.getDefaultInstance()) return this;
      if (!other.getDebuggeeId().isEmpty()) {
        debuggeeId_ = other.debuggeeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBreakpointId().isEmpty()) {
        breakpointId_ = other.breakpointId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getClientVersion().isEmpty()) {
        clientVersion_ = other.clientVersion_;
        bitField0_ |= 0x00000004;
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
              debuggeeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              breakpointId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 34: {
              clientVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private java.lang.Object debuggeeId_ = "";
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to get.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The debuggeeId.
     */
    public java.lang.String getDebuggeeId() {
      java.lang.Object ref = debuggeeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        debuggeeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to get.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for debuggeeId.
     */
    public com.google.protobuf.ByteString
        getDebuggeeIdBytes() {
      java.lang.Object ref = debuggeeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debuggeeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to get.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The debuggeeId to set.
     * @return This builder for chaining.
     */
    public Builder setDebuggeeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      debuggeeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to get.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDebuggeeId() {
      debuggeeId_ = getDefaultInstance().getDebuggeeId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to get.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for debuggeeId to set.
     * @return This builder for chaining.
     */
    public Builder setDebuggeeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      debuggeeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object breakpointId_ = "";
    /**
     * <pre>
     * Required. ID of the breakpoint to get.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The breakpointId.
     */
    public java.lang.String getBreakpointId() {
      java.lang.Object ref = breakpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        breakpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to get.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for breakpointId.
     */
    public com.google.protobuf.ByteString
        getBreakpointIdBytes() {
      java.lang.Object ref = breakpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        breakpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to get.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The breakpointId to set.
     * @return This builder for chaining.
     */
    public Builder setBreakpointId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      breakpointId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to get.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBreakpointId() {
      breakpointId_ = getDefaultInstance().getBreakpointId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to get.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for breakpointId to set.
     * @return This builder for chaining.
     */
    public Builder setBreakpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      breakpointId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object clientVersion_ = "";
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The clientVersion.
     */
    public java.lang.String getClientVersion() {
      java.lang.Object ref = clientVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for clientVersion.
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      java.lang.Object ref = clientVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientVersion() {
      clientVersion_ = getDefaultInstance().getClientVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientVersion_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.GetBreakpointRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.GetBreakpointRequest)
  private static final com.google.devtools.clouddebugger.v2.GetBreakpointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.GetBreakpointRequest();
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBreakpointRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetBreakpointRequest>() {
    @java.lang.Override
    public GetBreakpointRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBreakpointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBreakpointRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.GetBreakpointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
