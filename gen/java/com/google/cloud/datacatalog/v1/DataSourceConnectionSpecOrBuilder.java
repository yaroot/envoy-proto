// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface DataSourceConnectionSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DataSourceConnectionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Fields specific to BigQuery connections.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec bigquery_connection_spec = 1;</code>
   * @return Whether the bigqueryConnectionSpec field is set.
   */
  boolean hasBigqueryConnectionSpec();
  /**
   * <pre>
   * Output only. Fields specific to BigQuery connections.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec bigquery_connection_spec = 1;</code>
   * @return The bigqueryConnectionSpec.
   */
  com.google.cloud.datacatalog.v1.BigQueryConnectionSpec getBigqueryConnectionSpec();
  /**
   * <pre>
   * Output only. Fields specific to BigQuery connections.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec bigquery_connection_spec = 1;</code>
   */
  com.google.cloud.datacatalog.v1.BigQueryConnectionSpecOrBuilder getBigqueryConnectionSpecOrBuilder();
}