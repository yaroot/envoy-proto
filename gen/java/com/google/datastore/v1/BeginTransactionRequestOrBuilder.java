// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

public interface BeginTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.BeginTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The ID of the database against which to make the request.
   * '(default)' is not allowed; please use empty string '' to refer the default
   * database.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   * @return The databaseId.
   */
  java.lang.String getDatabaseId();
  /**
   * <pre>
   * The ID of the database against which to make the request.
   * '(default)' is not allowed; please use empty string '' to refer the default
   * database.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   * @return The bytes for databaseId.
   */
  com.google.protobuf.ByteString
      getDatabaseIdBytes();

  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   * @return Whether the transactionOptions field is set.
   */
  boolean hasTransactionOptions();
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   * @return The transactionOptions.
   */
  com.google.datastore.v1.TransactionOptions getTransactionOptions();
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   */
  com.google.datastore.v1.TransactionOptionsOrBuilder getTransactionOptionsOrBuilder();
}