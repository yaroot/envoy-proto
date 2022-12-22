// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/streams_service.proto

package com.google.cloud.visionai.v1;

public interface ListStreamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ListStreamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Stream streams = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.Stream> 
      getStreamsList();
  /**
   * <pre>
   * The list of Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Stream streams = 1;</code>
   */
  com.google.cloud.visionai.v1.Stream getStreams(int index);
  /**
   * <pre>
   * The list of Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Stream streams = 1;</code>
   */
  int getStreamsCount();
  /**
   * <pre>
   * The list of Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Stream streams = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.StreamOrBuilder> 
      getStreamsOrBuilderList();
  /**
   * <pre>
   * The list of Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Stream streams = 1;</code>
   */
  com.google.cloud.visionai.v1.StreamOrBuilder getStreamsOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}