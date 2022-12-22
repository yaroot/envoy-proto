// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto

package com.google.cloud.clouddms.logging.v1;

public interface MySqlConnectionProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.logging.v1.MySqlConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The database version.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.MySqlConnectionProfile.Version version = 1;</code>
   * @return The enum numeric value on the wire for version.
   */
  int getVersionValue();
  /**
   * <pre>
   * The database version.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.MySqlConnectionProfile.Version version = 1;</code>
   * @return The version.
   */
  com.google.cloud.clouddms.logging.v1.MySqlConnectionProfile.Version getVersion();

  /**
   * <pre>
   * The Cloud SQL id for a Cloud SQL instance.
   * </pre>
   *
   * <code>string cloud_sql_id = 2;</code>
   * @return The cloudSqlId.
   */
  java.lang.String getCloudSqlId();
  /**
   * <pre>
   * The Cloud SQL id for a Cloud SQL instance.
   * </pre>
   *
   * <code>string cloud_sql_id = 2;</code>
   * @return The bytes for cloudSqlId.
   */
  com.google.protobuf.ByteString
      getCloudSqlIdBytes();
}