// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/endpointsapis/v1/workspace.proto

package com.google.example.endpointsapis.v1;

public interface ListWorkspacesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.example.endpointsapis.v1.ListWorkspacesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent used for listing. It should have the format of
   * `projects/{number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent used for listing. It should have the format of
   * `projects/{number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The page size for list pagination.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The page token for list pagination.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The page token for list pagination.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}