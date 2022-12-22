// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface ListTablesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListTablesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique name of the instance for which tables should be listed.
   * Values are of the form `projects/{project}/instances/{instance}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The unique name of the instance for which tables should be listed.
   * Values are of the form `projects/{project}/instances/{instance}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The view to be applied to the returned tables' fields.
   * Only NAME_ONLY view (default) and REPLICATION_VIEW are supported.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * The view to be applied to the returned tables' fields.
   * Only NAME_ONLY view (default) and REPLICATION_VIEW are supported.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   * @return The view.
   */
  com.google.bigtable.admin.v2.Table.View getView();

  /**
   * <pre>
   * Maximum number of results per page.
   * A page_size of zero lets the server choose the number of items to return.
   * A page_size which is strictly positive will return at most that many items.
   * A negative page_size will cause an error.
   * Following the first request, subsequent paginated calls are not required
   * to pass a page_size. If a page_size is set in subsequent calls, it must
   * match the page_size given in the first request.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}