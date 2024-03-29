// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_resources.proto

package com.google.cloud.sql.v1;

public interface InsightsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1.InsightsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether Query Insights feature is enabled.
   * </pre>
   *
   * <code>bool query_insights_enabled = 1;</code>
   * @return The queryInsightsEnabled.
   */
  boolean getQueryInsightsEnabled();

  /**
   * <pre>
   * Whether Query Insights will record client address when enabled.
   * </pre>
   *
   * <code>bool record_client_address = 2;</code>
   * @return The recordClientAddress.
   */
  boolean getRecordClientAddress();

  /**
   * <pre>
   * Whether Query Insights will record application tags from query when
   * enabled.
   * </pre>
   *
   * <code>bool record_application_tags = 3;</code>
   * @return The recordApplicationTags.
   */
  boolean getRecordApplicationTags();

  /**
   * <pre>
   * Maximum query length stored in bytes. Default value: 1024 bytes.
   * Range: 256-4500 bytes. Query length more than this field value will be
   * truncated to this value. When unset, query length will be the default
   * value. Changing query length will restart the database.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value query_string_length = 4;</code>
   * @return Whether the queryStringLength field is set.
   */
  boolean hasQueryStringLength();
  /**
   * <pre>
   * Maximum query length stored in bytes. Default value: 1024 bytes.
   * Range: 256-4500 bytes. Query length more than this field value will be
   * truncated to this value. When unset, query length will be the default
   * value. Changing query length will restart the database.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value query_string_length = 4;</code>
   * @return The queryStringLength.
   */
  com.google.protobuf.Int32Value getQueryStringLength();
  /**
   * <pre>
   * Maximum query length stored in bytes. Default value: 1024 bytes.
   * Range: 256-4500 bytes. Query length more than this field value will be
   * truncated to this value. When unset, query length will be the default
   * value. Changing query length will restart the database.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value query_string_length = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getQueryStringLengthOrBuilder();

  /**
   * <pre>
   * Number of query execution plans captured by Insights per minute
   * for all queries combined. Default is 5.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value query_plans_per_minute = 5;</code>
   * @return Whether the queryPlansPerMinute field is set.
   */
  boolean hasQueryPlansPerMinute();
  /**
   * <pre>
   * Number of query execution plans captured by Insights per minute
   * for all queries combined. Default is 5.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value query_plans_per_minute = 5;</code>
   * @return The queryPlansPerMinute.
   */
  com.google.protobuf.Int32Value getQueryPlansPerMinute();
  /**
   * <pre>
   * Number of query execution plans captured by Insights per minute
   * for all queries combined. Default is 5.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value query_plans_per_minute = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getQueryPlansPerMinuteOrBuilder();
}
