// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/actions_sdk.proto

package com.google.actions.sdk.v2;

public interface ListSampleProjectsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.ListSampleProjectsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The maximum number of sample projects to return. The service may return
   * fewer than this value.
   * If unspecified, at most 1000 sample projects will be returned. Values above
   * 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from a previous 'ListSampleProjects' call.
   * Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from a previous 'ListSampleProjects' call.
   * Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}