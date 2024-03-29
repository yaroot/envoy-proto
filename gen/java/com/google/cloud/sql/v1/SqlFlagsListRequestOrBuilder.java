// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_flags.proto

package com.google.cloud.sql.v1;

public interface SqlFlagsListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1.SqlFlagsListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Database type and version you want to retrieve flags for. By default, this
   * method returns flags for all database types and versions.
   * </pre>
   *
   * <code>string database_version = 1;</code>
   * @return The databaseVersion.
   */
  java.lang.String getDatabaseVersion();
  /**
   * <pre>
   * Database type and version you want to retrieve flags for. By default, this
   * method returns flags for all database types and versions.
   * </pre>
   *
   * <code>string database_version = 1;</code>
   * @return The bytes for databaseVersion.
   */
  com.google.protobuf.ByteString
      getDatabaseVersionBytes();
}
