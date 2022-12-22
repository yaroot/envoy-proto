// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql.proto

package com.google.cloud.sql.v1beta4;

public interface SqlBackupRunsDeleteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.SqlBackupRunsDeleteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the backup run to delete. To find a backup run ID, use the
   * [list](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/backupRuns/list)
   * method.
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Cloud SQL instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 2;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Cloud SQL instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 2;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * Project ID of the project that contains the instance.
   * </pre>
   *
   * <code>string project = 3;</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID of the project that contains the instance.
   * </pre>
   *
   * <code>string project = 3;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}