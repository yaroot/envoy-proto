// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

public interface GetTestMatrixRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.GetTestMatrixRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cloud project that owns the test matrix.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Cloud project that owns the test matrix.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Unique test matrix id which was assigned by the service.
   * </pre>
   *
   * <code>string test_matrix_id = 2;</code>
   * @return The testMatrixId.
   */
  java.lang.String getTestMatrixId();
  /**
   * <pre>
   * Unique test matrix id which was assigned by the service.
   * </pre>
   *
   * <code>string test_matrix_id = 2;</code>
   * @return The bytes for testMatrixId.
   */
  com.google.protobuf.ByteString
      getTestMatrixIdBytes();
}