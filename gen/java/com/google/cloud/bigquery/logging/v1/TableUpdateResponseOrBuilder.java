// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

public interface TableUpdateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.logging.v1.TableUpdateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Final state of the updated table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * Final state of the updated table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   * @return The resource.
   */
  com.google.cloud.bigquery.logging.v1.Table getResource();
  /**
   * <pre>
   * Final state of the updated table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   */
  com.google.cloud.bigquery.logging.v1.TableOrBuilder getResourceOrBuilder();
}