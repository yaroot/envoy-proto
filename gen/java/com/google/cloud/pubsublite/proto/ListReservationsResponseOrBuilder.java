// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

public interface ListReservationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.ListReservationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  java.util.List<com.google.cloud.pubsublite.proto.Reservation> 
      getReservationsList();
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  com.google.cloud.pubsublite.proto.Reservation getReservations(int index);
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  int getReservationsCount();
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.pubsublite.proto.ReservationOrBuilder> 
      getReservationsOrBuilderList();
  /**
   * <pre>
   * The list of reservation in the requested parent. The order of the
   * reservations is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Reservation reservations = 1;</code>
   */
  com.google.cloud.pubsublite.proto.ReservationOrBuilder getReservationsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}