// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/runtimeconfig/v1beta1/runtimeconfig.proto

package com.google.cloud.runtimeconfig.v1beta1;

public interface ListWaitersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.runtimeconfig.v1beta1.ListWaitersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path to the configuration for which you want to get a list of waiters.
   * The configuration must exist beforehand; the path must by in the format:
   * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The path to the configuration for which you want to get a list of waiters.
   * The configuration must exist beforehand; the path must by in the format:
   * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Specifies the number of results to return per page. If there are fewer
   * elements than the specified number, returns all elements.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
   * returned by a previous list request to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
   * returned by a previous list request to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}