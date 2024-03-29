// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql.proto

package com.google.cloud.sql.v1beta4;

public interface SqlInstancesInsertRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.SqlInstancesInsertRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID of the project to which the newly created Cloud SQL instances
   * should belong.
   * </pre>
   *
   * <code>string project = 1;</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID of the project to which the newly created Cloud SQL instances
   * should belong.
   * </pre>
   *
   * <code>string project = 1;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <code>.google.cloud.sql.v1beta4.DatabaseInstance body = 100;</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <code>.google.cloud.sql.v1beta4.DatabaseInstance body = 100;</code>
   * @return The body.
   */
  com.google.cloud.sql.v1beta4.DatabaseInstance getBody();
  /**
   * <code>.google.cloud.sql.v1beta4.DatabaseInstance body = 100;</code>
   */
  com.google.cloud.sql.v1beta4.DatabaseInstanceOrBuilder getBodyOrBuilder();
}
