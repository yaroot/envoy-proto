// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

/**
 * <pre>
 * Response for ListReservations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.ListReservationsResponse}
 */
public final class ListReservationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.ListReservationsResponse)
    ListReservationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListReservationsResponse.newBuilder() to construct.
  private ListReservationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListReservationsResponse() {
    reservations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListReservationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListReservationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListReservationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.ListReservationsResponse.class, com.google.cloud.pubsublite.proto.ListReservationsResponse.Builder.class);
  }

  public static final int RESERVATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.pubsublite.proto.Reservation> reservations_;
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.pubsublite.proto.Reservation> getReservationsList() {
    return reservations_;
  }
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.pubsublite.proto.ReservationOrBuilder> 
      getReservationsOrBuilderList() {
    return reservations_;
  }
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  @java.lang.Override
  public int getReservationsCount() {
    return reservations_.size();
  }
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.Reservation getReservations(int index) {
    return reservations_.get(index);
  }
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ReservationOrBuilder getReservationsOrBuilder(
      int index) {
    return reservations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < reservations_.size(); i++) {
      output.writeMessage(1, reservations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reservations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reservations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.ListReservationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.ListReservationsResponse other = (com.google.cloud.pubsublite.proto.ListReservationsResponse) obj;

    if (!getReservationsList()
        .equals(other.getReservationsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getReservationsCount() > 0) {
      hash = (37 * hash) + RESERVATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getReservationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ListReservationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.pubsublite.proto.ListReservationsResponse prototype) {
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
   * Response for ListReservations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.ListReservationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.ListReservationsResponse)
      com.google.cloud.pubsublite.proto.ListReservationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListReservationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListReservationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.ListReservationsResponse.class, com.google.cloud.pubsublite.proto.ListReservationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.ListReservationsResponse.newBuilder()
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
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
      } else {
        reservations_ = null;
        reservationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListReservationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListReservationsResponse getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.ListReservationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListReservationsResponse build() {
      com.google.cloud.pubsublite.proto.ListReservationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListReservationsResponse buildPartial() {
      com.google.cloud.pubsublite.proto.ListReservationsResponse result = new com.google.cloud.pubsublite.proto.ListReservationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.pubsublite.proto.ListReservationsResponse result) {
      if (reservationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reservations_ = java.util.Collections.unmodifiableList(reservations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reservations_ = reservations_;
      } else {
        result.reservations_ = reservationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.ListReservationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.pubsublite.proto.ListReservationsResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.ListReservationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.ListReservationsResponse other) {
      if (other == com.google.cloud.pubsublite.proto.ListReservationsResponse.getDefaultInstance()) return this;
      if (reservationsBuilder_ == null) {
        if (!other.reservations_.isEmpty()) {
          if (reservations_.isEmpty()) {
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReservationsIsMutable();
            reservations_.addAll(other.reservations_);
          }
          onChanged();
        }
      } else {
        if (!other.reservations_.isEmpty()) {
          if (reservationsBuilder_.isEmpty()) {
            reservationsBuilder_.dispose();
            reservationsBuilder_ = null;
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reservationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReservationsFieldBuilder() : null;
          } else {
            reservationsBuilder_.addAllMessages(other.reservations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              com.google.cloud.pubsublite.proto.Reservation m =
                  input.readMessage(
                      com.google.cloud.pubsublite.proto.Reservation.parser(),
                      extensionRegistry);
              if (reservationsBuilder_ == null) {
                ensureReservationsIsMutable();
                reservations_.add(m);
              } else {
                reservationsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.pubsublite.proto.Reservation> reservations_ =
      java.util.Collections.emptyList();
    private void ensureReservationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reservations_ = new java.util.ArrayList<com.google.cloud.pubsublite.proto.Reservation>(reservations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.pubsublite.proto.Reservation, com.google.cloud.pubsublite.proto.Reservation.Builder, com.google.cloud.pubsublite.proto.ReservationOrBuilder> reservationsBuilder_;

    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.Reservation> getReservationsList() {
      if (reservationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reservations_);
      } else {
        return reservationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public int getReservationsCount() {
      if (reservationsBuilder_ == null) {
        return reservations_.size();
      } else {
        return reservationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Reservation getReservations(int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);
      } else {
        return reservationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, com.google.cloud.pubsublite.proto.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.set(index, value);
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, com.google.cloud.pubsublite.proto.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.set(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder addReservations(com.google.cloud.pubsublite.proto.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, com.google.cloud.pubsublite.proto.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(index, value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        com.google.cloud.pubsublite.proto.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, com.google.cloud.pubsublite.proto.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder addAllReservations(
        java.lang.Iterable<? extends com.google.cloud.pubsublite.proto.Reservation> values) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reservations_);
        onChanged();
      } else {
        reservationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder clearReservations() {
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public Builder removeReservations(int index) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.remove(index);
        onChanged();
      } else {
        reservationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Reservation.Builder getReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.ReservationOrBuilder getReservationsOrBuilder(
        int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);  } else {
        return reservationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.pubsublite.proto.ReservationOrBuilder> 
         getReservationsOrBuilderList() {
      if (reservationsBuilder_ != null) {
        return reservationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reservations_);
      }
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Reservation.Builder addReservationsBuilder() {
      return getReservationsFieldBuilder().addBuilder(
          com.google.cloud.pubsublite.proto.Reservation.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Reservation.Builder addReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().addBuilder(
          index, com.google.cloud.pubsublite.proto.Reservation.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of reservation in the requested parent. The order of the
     * reservations is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.Reservation.Builder> 
         getReservationsBuilderList() {
      return getReservationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.pubsublite.proto.Reservation, com.google.cloud.pubsublite.proto.Reservation.Builder, com.google.cloud.pubsublite.proto.ReservationOrBuilder> 
        getReservationsFieldBuilder() {
      if (reservationsBuilder_ == null) {
        reservationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Reservation, com.google.cloud.pubsublite.proto.Reservation.Builder, com.google.cloud.pubsublite.proto.ReservationOrBuilder>(
                reservations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reservations_ = null;
      }
      return reservationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.ListReservationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ListReservationsResponse)
  private static final com.google.cloud.pubsublite.proto.ListReservationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.ListReservationsResponse();
  }

  public static com.google.cloud.pubsublite.proto.ListReservationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListReservationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListReservationsResponse>() {
    @java.lang.Override
    public ListReservationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListReservationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListReservationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ListReservationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

