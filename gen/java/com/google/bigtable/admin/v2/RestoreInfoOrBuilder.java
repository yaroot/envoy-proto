// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface RestoreInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.RestoreInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the restore source.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.RestoreSourceType source_type = 1;</code>
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();
  /**
   * <pre>
   * The type of the restore source.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.RestoreSourceType source_type = 1;</code>
   * @return The sourceType.
   */
  com.google.bigtable.admin.v2.RestoreSourceType getSourceType();

  /**
   * <pre>
   * Information about the backup used to restore the table. The backup
   * may no longer exist.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.BackupInfo backup_info = 2;</code>
   * @return Whether the backupInfo field is set.
   */
  boolean hasBackupInfo();
  /**
   * <pre>
   * Information about the backup used to restore the table. The backup
   * may no longer exist.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.BackupInfo backup_info = 2;</code>
   * @return The backupInfo.
   */
  com.google.bigtable.admin.v2.BackupInfo getBackupInfo();
  /**
   * <pre>
   * Information about the backup used to restore the table. The backup
   * may no longer exist.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.BackupInfo backup_info = 2;</code>
   */
  com.google.bigtable.admin.v2.BackupInfoOrBuilder getBackupInfoOrBuilder();

  public com.google.bigtable.admin.v2.RestoreInfo.SourceInfoCase getSourceInfoCase();
}