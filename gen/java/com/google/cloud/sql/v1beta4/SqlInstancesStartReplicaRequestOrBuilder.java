// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql.proto

package com.google.cloud.sql.v1beta4;

public interface SqlInstancesStartReplicaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.SqlInstancesStartReplicaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cloud SQL read replica instance name.
   * </pre>
   *
   * <code>string instance = 1;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Cloud SQL read replica instance name.
   * </pre>
   *
   * <code>string instance = 1;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * ID of the project that contains the read replica.
   * </pre>
   *
   * <code>string project = 2;</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * ID of the project that contains the read replica.
   * </pre>
   *
   * <code>string project = 2;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}