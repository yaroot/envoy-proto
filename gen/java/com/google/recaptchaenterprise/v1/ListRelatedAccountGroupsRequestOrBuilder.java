// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface ListRelatedAccountGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project to list related account groups from, in
   * the format "projects/{project}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the project to list related account groups from, in
   * the format "projects/{project}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of groups to return. The service might return
   * fewer than this value. If unspecified, at most 50 groups are returned. The
   * maximum value is 1000; values above 1000 are coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from a previous `ListRelatedAccountGroups`
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * `ListRelatedAccountGroups` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from a previous `ListRelatedAccountGroups`
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * `ListRelatedAccountGroups` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
