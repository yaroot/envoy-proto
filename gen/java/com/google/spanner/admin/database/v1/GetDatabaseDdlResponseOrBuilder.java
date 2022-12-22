// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public interface GetDatabaseDdlResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   * @return A list containing the statements.
   */
  java.util.List<java.lang.String>
      getStatementsList();
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   * @return The count of statements.
   */
  int getStatementsCount();
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   * @param index The index of the element to return.
   * @return The statements at the given index.
   */
  java.lang.String getStatements(int index);
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the statements at the given index.
   */
  com.google.protobuf.ByteString
      getStatementsBytes(int index);
}