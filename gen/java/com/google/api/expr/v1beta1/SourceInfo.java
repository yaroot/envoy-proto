// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/source.proto

package com.google.api.expr.v1beta1;

/**
 * <pre>
 * Source information collected at parse time.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1beta1.SourceInfo}
 */
public final class SourceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1beta1.SourceInfo)
    SourceInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SourceInfo.newBuilder() to construct.
  private SourceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SourceInfo() {
    location_ = "";
    lineOffsets_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SourceInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.expr.v1beta1.SourceProto.internal_static_google_api_expr_v1beta1_SourceInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetPositions();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.expr.v1beta1.SourceProto.internal_static_google_api_expr_v1beta1_SourceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.expr.v1beta1.SourceInfo.class, com.google.api.expr.v1beta1.SourceInfo.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   * <pre>
   * The location name. All position information attached to an expression is
   * relative to this location.
   * The location could be a file, UI element, or similar. For example,
   * `acme/app/AnvilPolicy.cel`.
   * </pre>
   *
   * <code>string location = 2;</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The location name. All position information attached to an expression is
   * relative to this location.
   * The location could be a file, UI element, or similar. For example,
   * `acme/app/AnvilPolicy.cel`.
   * </pre>
   *
   * <code>string location = 2;</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_OFFSETS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList lineOffsets_;
  /**
   * <pre>
   * Monotonically increasing list of character offsets where newlines appear.
   * The line number of a given position is the index `i` where for a given
   * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
   * column may be derivd from `id_positions[id] - line_offsets[i]`.
   * </pre>
   *
   * <code>repeated int32 line_offsets = 3;</code>
   * @return A list containing the lineOffsets.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getLineOffsetsList() {
    return lineOffsets_;
  }
  /**
   * <pre>
   * Monotonically increasing list of character offsets where newlines appear.
   * The line number of a given position is the index `i` where for a given
   * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
   * column may be derivd from `id_positions[id] - line_offsets[i]`.
   * </pre>
   *
   * <code>repeated int32 line_offsets = 3;</code>
   * @return The count of lineOffsets.
   */
  public int getLineOffsetsCount() {
    return lineOffsets_.size();
  }
  /**
   * <pre>
   * Monotonically increasing list of character offsets where newlines appear.
   * The line number of a given position is the index `i` where for a given
   * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
   * column may be derivd from `id_positions[id] - line_offsets[i]`.
   * </pre>
   *
   * <code>repeated int32 line_offsets = 3;</code>
   * @param index The index of the element to return.
   * @return The lineOffsets at the given index.
   */
  public int getLineOffsets(int index) {
    return lineOffsets_.getInt(index);
  }
  private int lineOffsetsMemoizedSerializedSize = -1;

  public static final int POSITIONS_FIELD_NUMBER = 4;
  private static final class PositionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                com.google.api.expr.v1beta1.SourceProto.internal_static_google_api_expr_v1beta1_SourceInfo_PositionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> positions_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetPositions() {
    if (positions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PositionsDefaultEntryHolder.defaultEntry);
    }
    return positions_;
  }
  public int getPositionsCount() {
    return internalGetPositions().getMap().size();
  }
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4;</code>
   */
  @java.lang.Override
  public boolean containsPositions(
      int key) {
    
    return internalGetPositions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPositionsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer> getPositions() {
    return getPositionsMap();
  }
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Integer> getPositionsMap() {
    return internalGetPositions().getMap();
  }
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4;</code>
   */
  @java.lang.Override
  public int getPositionsOrDefault(
      int key,
      int defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetPositions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4;</code>
   */
  @java.lang.Override
  public int getPositionsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetPositions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (getLineOffsetsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(lineOffsetsMemoizedSerializedSize);
    }
    for (int i = 0; i < lineOffsets_.size(); i++) {
      output.writeInt32NoTag(lineOffsets_.getInt(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetPositions(),
        PositionsDefaultEntryHolder.defaultEntry,
        4);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < lineOffsets_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(lineOffsets_.getInt(i));
      }
      size += dataSize;
      if (!getLineOffsetsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      lineOffsetsMemoizedSerializedSize = dataSize;
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetPositions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      positions__ = PositionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, positions__);
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
    if (!(obj instanceof com.google.api.expr.v1beta1.SourceInfo)) {
      return super.equals(obj);
    }
    com.google.api.expr.v1beta1.SourceInfo other = (com.google.api.expr.v1beta1.SourceInfo) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (!getLineOffsetsList()
        .equals(other.getLineOffsetsList())) return false;
    if (!internalGetPositions().equals(
        other.internalGetPositions())) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    if (getLineOffsetsCount() > 0) {
      hash = (37 * hash) + LINE_OFFSETS_FIELD_NUMBER;
      hash = (53 * hash) + getLineOffsetsList().hashCode();
    }
    if (!internalGetPositions().getMap().isEmpty()) {
      hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPositions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.SourceInfo parseFrom(
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
  public static Builder newBuilder(com.google.api.expr.v1beta1.SourceInfo prototype) {
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
   * Source information collected at parse time.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1beta1.SourceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1beta1.SourceInfo)
      com.google.api.expr.v1beta1.SourceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.expr.v1beta1.SourceProto.internal_static_google_api_expr_v1beta1_SourceInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetPositions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutablePositions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.expr.v1beta1.SourceProto.internal_static_google_api_expr_v1beta1_SourceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.expr.v1beta1.SourceInfo.class, com.google.api.expr.v1beta1.SourceInfo.Builder.class);
    }

    // Construct using com.google.api.expr.v1beta1.SourceInfo.newBuilder()
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
      location_ = "";
      lineOffsets_ = emptyIntList();
      internalGetMutablePositions().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.expr.v1beta1.SourceProto.internal_static_google_api_expr_v1beta1_SourceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.SourceInfo getDefaultInstanceForType() {
      return com.google.api.expr.v1beta1.SourceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.SourceInfo build() {
      com.google.api.expr.v1beta1.SourceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.SourceInfo buildPartial() {
      com.google.api.expr.v1beta1.SourceInfo result = new com.google.api.expr.v1beta1.SourceInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.expr.v1beta1.SourceInfo result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        lineOffsets_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.lineOffsets_ = lineOffsets_;
    }

    private void buildPartial0(com.google.api.expr.v1beta1.SourceInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.positions_ = internalGetPositions();
        result.positions_.makeImmutable();
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
      if (other instanceof com.google.api.expr.v1beta1.SourceInfo) {
        return mergeFrom((com.google.api.expr.v1beta1.SourceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.expr.v1beta1.SourceInfo other) {
      if (other == com.google.api.expr.v1beta1.SourceInfo.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.lineOffsets_.isEmpty()) {
        if (lineOffsets_.isEmpty()) {
          lineOffsets_ = other.lineOffsets_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureLineOffsetsIsMutable();
          lineOffsets_.addAll(other.lineOffsets_);
        }
        onChanged();
      }
      internalGetMutablePositions().mergeFrom(
          other.internalGetPositions());
      bitField0_ |= 0x00000004;
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
            case 18: {
              location_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 24: {
              int v = input.readInt32();
              ensureLineOffsetsIsMutable();
              lineOffsets_.addInt(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureLineOffsetsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                lineOffsets_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 26
            case 34: {
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              positions__ = input.readMessage(
                  PositionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutablePositions().getMutableMap().put(
                  positions__.getKey(), positions__.getValue());
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

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * The location name. All position information attached to an expression is
     * relative to this location.
     * The location could be a file, UI element, or similar. For example,
     * `acme/app/AnvilPolicy.cel`.
     * </pre>
     *
     * <code>string location = 2;</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The location name. All position information attached to an expression is
     * relative to this location.
     * The location could be a file, UI element, or similar. For example,
     * `acme/app/AnvilPolicy.cel`.
     * </pre>
     *
     * <code>string location = 2;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The location name. All position information attached to an expression is
     * relative to this location.
     * The location could be a file, UI element, or similar. For example,
     * `acme/app/AnvilPolicy.cel`.
     * </pre>
     *
     * <code>string location = 2;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location name. All position information attached to an expression is
     * relative to this location.
     * The location could be a file, UI element, or similar. For example,
     * `acme/app/AnvilPolicy.cel`.
     * </pre>
     *
     * <code>string location = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location name. All position information attached to an expression is
     * relative to this location.
     * The location could be a file, UI element, or similar. For example,
     * `acme/app/AnvilPolicy.cel`.
     * </pre>
     *
     * <code>string location = 2;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList lineOffsets_ = emptyIntList();
    private void ensureLineOffsetsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        lineOffsets_ = mutableCopy(lineOffsets_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @return A list containing the lineOffsets.
     */
    public java.util.List<java.lang.Integer>
        getLineOffsetsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(lineOffsets_) : lineOffsets_;
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @return The count of lineOffsets.
     */
    public int getLineOffsetsCount() {
      return lineOffsets_.size();
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @param index The index of the element to return.
     * @return The lineOffsets at the given index.
     */
    public int getLineOffsets(int index) {
      return lineOffsets_.getInt(index);
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @param index The index to set the value at.
     * @param value The lineOffsets to set.
     * @return This builder for chaining.
     */
    public Builder setLineOffsets(
        int index, int value) {
      
      ensureLineOffsetsIsMutable();
      lineOffsets_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @param value The lineOffsets to add.
     * @return This builder for chaining.
     */
    public Builder addLineOffsets(int value) {
      
      ensureLineOffsetsIsMutable();
      lineOffsets_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @param values The lineOffsets to add.
     * @return This builder for chaining.
     */
    public Builder addAllLineOffsets(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureLineOffsetsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, lineOffsets_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Monotonically increasing list of character offsets where newlines appear.
     * The line number of a given position is the index `i` where for a given
     * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
     * column may be derivd from `id_positions[id] - line_offsets[i]`.
     * </pre>
     *
     * <code>repeated int32 line_offsets = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLineOffsets() {
      lineOffsets_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> positions_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
        internalGetPositions() {
      if (positions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PositionsDefaultEntryHolder.defaultEntry);
      }
      return positions_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
        internalGetMutablePositions() {
      if (positions_ == null) {
        positions_ = com.google.protobuf.MapField.newMapField(
            PositionsDefaultEntryHolder.defaultEntry);
      }
      if (!positions_.isMutable()) {
        positions_ = positions_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return positions_;
    }
    public int getPositionsCount() {
      return internalGetPositions().getMap().size();
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    @java.lang.Override
    public boolean containsPositions(
        int key) {
      
      return internalGetPositions().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPositionsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPositions() {
      return getPositionsMap();
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPositionsMap() {
      return internalGetPositions().getMap();
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    @java.lang.Override
    public int getPositionsOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPositions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    @java.lang.Override
    public int getPositionsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPositions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearPositions() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutablePositions().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    public Builder removePositions(
        int key) {
      
      internalGetMutablePositions().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
        getMutablePositions() {
      bitField0_ |= 0x00000004;
      return internalGetMutablePositions().getMutableMap();
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    public Builder putPositions(
        int key,
        int value) {
      
      
      internalGetMutablePositions().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * A map from the parse node id (e.g. `Expr.id`) to the character offset
     * within source.
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; positions = 4;</code>
     */
    public Builder putAllPositions(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      internalGetMutablePositions().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.api.expr.v1beta1.SourceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.api.expr.v1beta1.SourceInfo)
  private static final com.google.api.expr.v1beta1.SourceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.expr.v1beta1.SourceInfo();
  }

  public static com.google.api.expr.v1beta1.SourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceInfo>
      PARSER = new com.google.protobuf.AbstractParser<SourceInfo>() {
    @java.lang.Override
    public SourceInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.expr.v1beta1.SourceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
