// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_instances.proto

package com.google.cloud.sql.v1;

public interface SqlExternalSyncSettingErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1.SqlExternalSyncSettingError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Can be **sql#externalSyncSettingError** or
   * **sql#externalSyncSettingWarning**.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * Can be **sql#externalSyncSettingError** or
   * **sql#externalSyncSettingWarning**.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Identifies the specific error that occurred.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.SqlExternalSyncSettingError.SqlExternalSyncSettingErrorType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Identifies the specific error that occurred.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.SqlExternalSyncSettingError.SqlExternalSyncSettingErrorType type = 2;</code>
   * @return The type.
   */
  com.google.cloud.sql.v1.SqlExternalSyncSettingError.SqlExternalSyncSettingErrorType getType();

  /**
   * <pre>
   * Additional information about the error encountered.
   * </pre>
   *
   * <code>string detail = 3;</code>
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   * <pre>
   * Additional information about the error encountered.
   * </pre>
   *
   * <code>string detail = 3;</code>
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString
      getDetailBytes();
}