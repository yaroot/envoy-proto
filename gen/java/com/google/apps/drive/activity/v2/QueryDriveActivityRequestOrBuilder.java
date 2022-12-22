// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/activity/v2/query_drive_activity_request.proto

package com.google.apps.drive.activity.v2;

public interface QueryDriveActivityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.activity.v2.QueryDriveActivityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Return activities for this Drive item. The format is
   * `items/ITEM_ID`.
   * </pre>
   *
   * <code>string item_name = 1;</code>
   * @return Whether the itemName field is set.
   */
  boolean hasItemName();
  /**
   * <pre>
   * Return activities for this Drive item. The format is
   * `items/ITEM_ID`.
   * </pre>
   *
   * <code>string item_name = 1;</code>
   * @return The itemName.
   */
  java.lang.String getItemName();
  /**
   * <pre>
   * Return activities for this Drive item. The format is
   * `items/ITEM_ID`.
   * </pre>
   *
   * <code>string item_name = 1;</code>
   * @return The bytes for itemName.
   */
  com.google.protobuf.ByteString
      getItemNameBytes();

  /**
   * <pre>
   * Return activities for this Drive folder and all children and descendants.
   * The format is `items/ITEM_ID`.
   * </pre>
   *
   * <code>string ancestor_name = 2;</code>
   * @return Whether the ancestorName field is set.
   */
  boolean hasAncestorName();
  /**
   * <pre>
   * Return activities for this Drive folder and all children and descendants.
   * The format is `items/ITEM_ID`.
   * </pre>
   *
   * <code>string ancestor_name = 2;</code>
   * @return The ancestorName.
   */
  java.lang.String getAncestorName();
  /**
   * <pre>
   * Return activities for this Drive folder and all children and descendants.
   * The format is `items/ITEM_ID`.
   * </pre>
   *
   * <code>string ancestor_name = 2;</code>
   * @return The bytes for ancestorName.
   */
  com.google.protobuf.ByteString
      getAncestorNameBytes();

  /**
   * <pre>
   * Details on how to consolidate related actions that make up the activity. If
   * not set, then related actions are not consolidated.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.ConsolidationStrategy consolidation_strategy = 5;</code>
   * @return Whether the consolidationStrategy field is set.
   */
  boolean hasConsolidationStrategy();
  /**
   * <pre>
   * Details on how to consolidate related actions that make up the activity. If
   * not set, then related actions are not consolidated.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.ConsolidationStrategy consolidation_strategy = 5;</code>
   * @return The consolidationStrategy.
   */
  com.google.apps.drive.activity.v2.ConsolidationStrategy getConsolidationStrategy();
  /**
   * <pre>
   * Details on how to consolidate related actions that make up the activity. If
   * not set, then related actions are not consolidated.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.ConsolidationStrategy consolidation_strategy = 5;</code>
   */
  com.google.apps.drive.activity.v2.ConsolidationStrategyOrBuilder getConsolidationStrategyOrBuilder();

  /**
   * <pre>
   * The miminum number of activities desired in the response; the server will
   * attempt to return at least this quanitity. The server may also return fewer
   * activities if it has a partial response ready before the request times out.
   * If not set, a default value is used.
   * </pre>
   *
   * <code>int32 page_size = 6;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The token identifying which page of results to return. Set this to the
   * next_page_token value returned from a previous query to obtain the
   * following page of results. If not set, the first page of results will be
   * returned.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The token identifying which page of results to return. Set this to the
   * next_page_token value returned from a previous query to obtain the
   * following page of results. If not set, the first page of results will be
   * returned.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The filtering for items returned from this query request. The format of the
   * filter string is a sequence of expressions, joined by an optional "AND",
   * where each expression is of the form "field operator value".
   * Supported fields:
   *   - `time`: Uses numerical operators on date values either in
   *     terms of milliseconds since Jan 1, 1970 or in RFC 3339 format.
   *     Examples:
   *       - `time &gt; 1452409200000 AND time &lt;= 1492812924310`
   *       - `time &gt;= "2016-01-10T01:02:03-05:00"`
   *   - `detail.action_detail_case`: Uses the "has" operator (:) and
   *     either a singular value or a list of allowed action types enclosed in
   *     parentheses.
   *     Examples:
   *       - `detail.action_detail_case: RENAME`
   *       - `detail.action_detail_case:(CREATE EDIT)`
   *       - `-detail.action_detail_case:MOVE`
   * </pre>
   *
   * <code>string filter = 8;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filtering for items returned from this query request. The format of the
   * filter string is a sequence of expressions, joined by an optional "AND",
   * where each expression is of the form "field operator value".
   * Supported fields:
   *   - `time`: Uses numerical operators on date values either in
   *     terms of milliseconds since Jan 1, 1970 or in RFC 3339 format.
   *     Examples:
   *       - `time &gt; 1452409200000 AND time &lt;= 1492812924310`
   *       - `time &gt;= "2016-01-10T01:02:03-05:00"`
   *   - `detail.action_detail_case`: Uses the "has" operator (:) and
   *     either a singular value or a list of allowed action types enclosed in
   *     parentheses.
   *     Examples:
   *       - `detail.action_detail_case: RENAME`
   *       - `detail.action_detail_case:(CREATE EDIT)`
   *       - `-detail.action_detail_case:MOVE`
   * </pre>
   *
   * <code>string filter = 8;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  public com.google.apps.drive.activity.v2.QueryDriveActivityRequest.KeyCase getKeyCase();
}