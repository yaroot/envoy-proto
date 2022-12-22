// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/firestore.proto

package com.google.firestore.v1beta1;

public interface RollbackRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.RollbackRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString
      getDatabaseBytes();

  /**
   * <pre>
   * Required. The transaction to roll back.
   * </pre>
   *
   * <code>bytes transaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();
}