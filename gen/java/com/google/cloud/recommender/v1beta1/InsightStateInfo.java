// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/insight.proto

package com.google.cloud.recommender.v1beta1;

/**
 * <pre>
 * Information related to insight state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.InsightStateInfo}
 */
public final class InsightStateInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.InsightStateInfo)
    InsightStateInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InsightStateInfo.newBuilder() to construct.
  private InsightStateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InsightStateInfo() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InsightStateInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.recommender.v1beta1.InsightOuterClass.internal_static_google_cloud_recommender_v1beta1_InsightStateInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetStateMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.InsightOuterClass.internal_static_google_cloud_recommender_v1beta1_InsightStateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.InsightStateInfo.class, com.google.cloud.recommender.v1beta1.InsightStateInfo.Builder.class);
  }

  /**
   * <pre>
   * Represents insight state.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recommender.v1beta1.InsightStateInfo.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified state.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * Insight is active. Content for ACTIVE insights can be updated by Google.
     * ACTIVE insights can be marked DISMISSED OR ACCEPTED.
     * </pre>
     *
     * <code>ACTIVE = 1;</code>
     */
    ACTIVE(1),
    /**
     * <pre>
     * Some action has been taken based on this insight. Insights become
     * accepted when a recommendation derived from the insight has been marked
     * CLAIMED, SUCCEEDED, or FAILED. ACTIVE insights can also be marked
     * ACCEPTED explicitly. Content for ACCEPTED insights is immutable. ACCEPTED
     * insights can only be marked ACCEPTED (which may update state metadata).
     * </pre>
     *
     * <code>ACCEPTED = 2;</code>
     */
    ACCEPTED(2),
    /**
     * <pre>
     * Insight is dismissed. Content for DISMISSED insights can be updated by
     * Google. DISMISSED insights can be marked as ACTIVE.
     * </pre>
     *
     * <code>DISMISSED = 3;</code>
     */
    DISMISSED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified state.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Insight is active. Content for ACTIVE insights can be updated by Google.
     * ACTIVE insights can be marked DISMISSED OR ACCEPTED.
     * </pre>
     *
     * <code>ACTIVE = 1;</code>
     */
    public static final int ACTIVE_VALUE = 1;
    /**
     * <pre>
     * Some action has been taken based on this insight. Insights become
     * accepted when a recommendation derived from the insight has been marked
     * CLAIMED, SUCCEEDED, or FAILED. ACTIVE insights can also be marked
     * ACCEPTED explicitly. Content for ACCEPTED insights is immutable. ACCEPTED
     * insights can only be marked ACCEPTED (which may update state metadata).
     * </pre>
     *
     * <code>ACCEPTED = 2;</code>
     */
    public static final int ACCEPTED_VALUE = 2;
    /**
     * <pre>
     * Insight is dismissed. Content for DISMISSED insights can be updated by
     * Google. DISMISSED insights can be marked as ACTIVE.
     * </pre>
     *
     * <code>DISMISSED = 3;</code>
     */
    public static final int DISMISSED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return STATE_UNSPECIFIED;
        case 1: return ACTIVE;
        case 2: return ACCEPTED;
        case 3: return DISMISSED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.recommender.v1beta1.InsightStateInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recommender.v1beta1.InsightStateInfo.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   * <pre>
   * Insight state.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Insight state.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.recommender.v1beta1.InsightStateInfo.State getState() {
    com.google.cloud.recommender.v1beta1.InsightStateInfo.State result = com.google.cloud.recommender.v1beta1.InsightStateInfo.State.forNumber(state_);
    return result == null ? com.google.cloud.recommender.v1beta1.InsightStateInfo.State.UNRECOGNIZED : result;
  }

  public static final int STATE_METADATA_FIELD_NUMBER = 2;
  private static final class StateMetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.recommender.v1beta1.InsightOuterClass.internal_static_google_cloud_recommender_v1beta1_InsightStateInfo_StateMetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> stateMetadata_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetStateMetadata() {
    if (stateMetadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StateMetadataDefaultEntryHolder.defaultEntry);
    }
    return stateMetadata_;
  }
  public int getStateMetadataCount() {
    return internalGetStateMetadata().getMap().size();
  }
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public boolean containsStateMetadata(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetStateMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStateMetadataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getStateMetadata() {
    return getStateMetadataMap();
  }
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap() {
    return internalGetStateMetadata().getMap();
  }
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getStateMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetStateMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getStateMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetStateMetadata().getMap();
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
    if (state_ != com.google.cloud.recommender.v1beta1.InsightStateInfo.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetStateMetadata(),
        StateMetadataDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloud.recommender.v1beta1.InsightStateInfo.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetStateMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      stateMetadata__ = StateMetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, stateMetadata__);
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.InsightStateInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.InsightStateInfo other = (com.google.cloud.recommender.v1beta1.InsightStateInfo) obj;

    if (state_ != other.state_) return false;
    if (!internalGetStateMetadata().equals(
        other.internalGetStateMetadata())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (!internalGetStateMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + STATE_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStateMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommender.v1beta1.InsightStateInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.recommender.v1beta1.InsightStateInfo prototype) {
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
   * Information related to insight state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.InsightStateInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.InsightStateInfo)
      com.google.cloud.recommender.v1beta1.InsightStateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.recommender.v1beta1.InsightOuterClass.internal_static_google_cloud_recommender_v1beta1_InsightStateInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetStateMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableStateMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.InsightOuterClass.internal_static_google_cloud_recommender_v1beta1_InsightStateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.InsightStateInfo.class, com.google.cloud.recommender.v1beta1.InsightStateInfo.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.InsightStateInfo.newBuilder()
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
      state_ = 0;
      internalGetMutableStateMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.InsightOuterClass.internal_static_google_cloud_recommender_v1beta1_InsightStateInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightStateInfo getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.InsightStateInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightStateInfo build() {
      com.google.cloud.recommender.v1beta1.InsightStateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightStateInfo buildPartial() {
      com.google.cloud.recommender.v1beta1.InsightStateInfo result = new com.google.cloud.recommender.v1beta1.InsightStateInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.recommender.v1beta1.InsightStateInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stateMetadata_ = internalGetStateMetadata();
        result.stateMetadata_.makeImmutable();
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
      if (other instanceof com.google.cloud.recommender.v1beta1.InsightStateInfo) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.InsightStateInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1beta1.InsightStateInfo other) {
      if (other == com.google.cloud.recommender.v1beta1.InsightStateInfo.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      internalGetMutableStateMetadata().mergeFrom(
          other.internalGetStateMetadata());
      bitField0_ |= 0x00000002;
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
            case 8: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              stateMetadata__ = input.readMessage(
                  StateMetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableStateMetadata().getMutableMap().put(
                  stateMetadata__.getKey(), stateMetadata__.getValue());
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

    private int state_ = 0;
    /**
     * <pre>
     * Insight state.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Insight state.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Insight state.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightStateInfo.State getState() {
      com.google.cloud.recommender.v1beta1.InsightStateInfo.State result = com.google.cloud.recommender.v1beta1.InsightStateInfo.State.forNumber(state_);
      return result == null ? com.google.cloud.recommender.v1beta1.InsightStateInfo.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Insight state.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.recommender.v1beta1.InsightStateInfo.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Insight state.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1beta1.InsightStateInfo.State state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> stateMetadata_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetStateMetadata() {
      if (stateMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StateMetadataDefaultEntryHolder.defaultEntry);
      }
      return stateMetadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableStateMetadata() {
      if (stateMetadata_ == null) {
        stateMetadata_ = com.google.protobuf.MapField.newMapField(
            StateMetadataDefaultEntryHolder.defaultEntry);
      }
      if (!stateMetadata_.isMutable()) {
        stateMetadata_ = stateMetadata_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return stateMetadata_;
    }
    public int getStateMetadataCount() {
      return internalGetStateMetadata().getMap().size();
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public boolean containsStateMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetStateMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStateMetadataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getStateMetadata() {
      return getStateMetadataMap();
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap() {
      return internalGetStateMetadata().getMap();
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getStateMetadataOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetStateMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getStateMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetStateMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearStateMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableStateMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder removeStateMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableStateMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableStateMetadata() {
      bitField0_ |= 0x00000002;
      return internalGetMutableStateMetadata().getMutableMap();
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder putStateMetadata(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableStateMetadata().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder putAllStateMetadata(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableStateMetadata().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.InsightStateInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.InsightStateInfo)
  private static final com.google.cloud.recommender.v1beta1.InsightStateInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.InsightStateInfo();
  }

  public static com.google.cloud.recommender.v1beta1.InsightStateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InsightStateInfo>
      PARSER = new com.google.protobuf.AbstractParser<InsightStateInfo>() {
    @java.lang.Override
    public InsightStateInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<InsightStateInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InsightStateInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.InsightStateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

