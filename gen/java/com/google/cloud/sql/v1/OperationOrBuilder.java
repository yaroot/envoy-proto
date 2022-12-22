// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_resources.proto

package com.google.cloud.sql.v1;

public interface OperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is always **sql#operation**.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * This is always **sql#operation**.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <code>string target_link = 2;</code>
   * @return The targetLink.
   */
  java.lang.String getTargetLink();
  /**
   * <code>string target_link = 2;</code>
   * @return The bytes for targetLink.
   */
  com.google.protobuf.ByteString
      getTargetLinkBytes();

  /**
   * <pre>
   * The status of an operation. Valid values are:
   * *  **PENDING**
   * *  **RUNNING**
   * *  **DONE**
   * *  **SQL_OPERATION_STATUS_UNSPECIFIED**
   * </pre>
   *
   * <code>.google.cloud.sql.v1.Operation.SqlOperationStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of an operation. Valid values are:
   * *  **PENDING**
   * *  **RUNNING**
   * *  **DONE**
   * *  **SQL_OPERATION_STATUS_UNSPECIFIED**
   * </pre>
   *
   * <code>.google.cloud.sql.v1.Operation.SqlOperationStatus status = 3;</code>
   * @return The status.
   */
  com.google.cloud.sql.v1.Operation.SqlOperationStatus getStatus();

  /**
   * <pre>
   * The email address of the user who initiated this operation.
   * </pre>
   *
   * <code>string user = 4;</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <pre>
   * The email address of the user who initiated this operation.
   * </pre>
   *
   * <code>string user = 4;</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <pre>
   * The time this operation was enqueued in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp insert_time = 5;</code>
   * @return Whether the insertTime field is set.
   */
  boolean hasInsertTime();
  /**
   * <pre>
   * The time this operation was enqueued in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp insert_time = 5;</code>
   * @return The insertTime.
   */
  com.google.protobuf.Timestamp getInsertTime();
  /**
   * <pre>
   * The time this operation was enqueued in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp insert_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInsertTimeOrBuilder();

  /**
   * <pre>
   * The time this operation actually started in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The time this operation actually started in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * The time this operation actually started in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * The time this operation finished in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The time this operation finished in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The time this operation finished in UTC timezone in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * **2012-11-15T16:19:00.094Z**.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * If errors occurred during processing of this operation, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.OperationErrors error = 8;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * If errors occurred during processing of this operation, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.OperationErrors error = 8;</code>
   * @return The error.
   */
  com.google.cloud.sql.v1.OperationErrors getError();
  /**
   * <pre>
   * If errors occurred during processing of this operation, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.OperationErrors error = 8;</code>
   */
  com.google.cloud.sql.v1.OperationErrorsOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The type of the operation. Valid values are:
   * *  **CREATE**
   * *  **DELETE**
   * *  **UPDATE**
   * *  **RESTART**
   * *  **IMPORT**
   * *  **EXPORT**
   * *  **BACKUP_VOLUME**
   * *  **RESTORE_VOLUME**
   * *  **CREATE_USER**
   * *  **DELETE_USER**
   * *  **CREATE_DATABASE**
   * *  **DELETE_DATABASE**
   * </pre>
   *
   * <code>.google.cloud.sql.v1.Operation.SqlOperationType operation_type = 9;</code>
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();
  /**
   * <pre>
   * The type of the operation. Valid values are:
   * *  **CREATE**
   * *  **DELETE**
   * *  **UPDATE**
   * *  **RESTART**
   * *  **IMPORT**
   * *  **EXPORT**
   * *  **BACKUP_VOLUME**
   * *  **RESTORE_VOLUME**
   * *  **CREATE_USER**
   * *  **DELETE_USER**
   * *  **CREATE_DATABASE**
   * *  **DELETE_DATABASE**
   * </pre>
   *
   * <code>.google.cloud.sql.v1.Operation.SqlOperationType operation_type = 9;</code>
   * @return The operationType.
   */
  com.google.cloud.sql.v1.Operation.SqlOperationType getOperationType();

  /**
   * <pre>
   * The context for import operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.ImportContext import_context = 10;</code>
   * @return Whether the importContext field is set.
   */
  boolean hasImportContext();
  /**
   * <pre>
   * The context for import operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.ImportContext import_context = 10;</code>
   * @return The importContext.
   */
  com.google.cloud.sql.v1.ImportContext getImportContext();
  /**
   * <pre>
   * The context for import operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.ImportContext import_context = 10;</code>
   */
  com.google.cloud.sql.v1.ImportContextOrBuilder getImportContextOrBuilder();

  /**
   * <pre>
   * The context for export operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.ExportContext export_context = 11;</code>
   * @return Whether the exportContext field is set.
   */
  boolean hasExportContext();
  /**
   * <pre>
   * The context for export operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.ExportContext export_context = 11;</code>
   * @return The exportContext.
   */
  com.google.cloud.sql.v1.ExportContext getExportContext();
  /**
   * <pre>
   * The context for export operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.ExportContext export_context = 11;</code>
   */
  com.google.cloud.sql.v1.ExportContextOrBuilder getExportContextOrBuilder();

  /**
   * <pre>
   * The context for backup operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.BackupContext backup_context = 17;</code>
   * @return Whether the backupContext field is set.
   */
  boolean hasBackupContext();
  /**
   * <pre>
   * The context for backup operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.BackupContext backup_context = 17;</code>
   * @return The backupContext.
   */
  com.google.cloud.sql.v1.BackupContext getBackupContext();
  /**
   * <pre>
   * The context for backup operation, if applicable.
   * </pre>
   *
   * <code>.google.cloud.sql.v1.BackupContext backup_context = 17;</code>
   */
  com.google.cloud.sql.v1.BackupContextOrBuilder getBackupContextOrBuilder();

  /**
   * <pre>
   * An identifier that uniquely identifies the operation. You can use this
   * identifier to retrieve the Operations resource that has information about
   * the operation.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * An identifier that uniquely identifies the operation. You can use this
   * identifier to retrieve the Operations resource that has information about
   * the operation.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Name of the database instance related to this operation.
   * </pre>
   *
   * <code>string target_id = 13;</code>
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   * <pre>
   * Name of the database instance related to this operation.
   * </pre>
   *
   * <code>string target_id = 13;</code>
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString
      getTargetIdBytes();

  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string self_link = 14;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string self_link = 14;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * The project ID of the target instance related to this operation.
   * </pre>
   *
   * <code>string target_project = 15;</code>
   * @return The targetProject.
   */
  java.lang.String getTargetProject();
  /**
   * <pre>
   * The project ID of the target instance related to this operation.
   * </pre>
   *
   * <code>string target_project = 15;</code>
   * @return The bytes for targetProject.
   */
  com.google.protobuf.ByteString
      getTargetProjectBytes();
}