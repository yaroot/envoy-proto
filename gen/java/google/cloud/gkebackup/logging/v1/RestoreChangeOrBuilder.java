// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/logging/v1/logging.proto

package google.cloud.gkebackup.logging.v1;

public interface RestoreChangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.logging.v1.RestoreChange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full name of the Restore resource that is being modified.
   * Empty for creation.
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;
   * </pre>
   *
   * <code>string restore = 1;</code>
   * @return The restore.
   */
  java.lang.String getRestore();
  /**
   * <pre>
   * The full name of the Restore resource that is being modified.
   * Empty for creation.
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;
   * </pre>
   *
   * <code>string restore = 1;</code>
   * @return The bytes for restore.
   */
  com.google.protobuf.ByteString
      getRestoreBytes();

  /**
   * <pre>
   * Type of the change is being made.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.ChangeType change_type = 2;</code>
   * @return The enum numeric value on the wire for changeType.
   */
  int getChangeTypeValue();
  /**
   * <pre>
   * Type of the change is being made.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.ChangeType change_type = 2;</code>
   * @return The changeType.
   */
  google.cloud.gkebackup.logging.v1.ChangeType getChangeType();

  /**
   * <pre>
   * Modification details.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Modification details.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Modification details.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * The input Restore resource with the updated fields populated to update
   * the source Restore to.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.LoggedRestore input_restore = 4;</code>
   * @return Whether the inputRestore field is set.
   */
  boolean hasInputRestore();
  /**
   * <pre>
   * The input Restore resource with the updated fields populated to update
   * the source Restore to.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.LoggedRestore input_restore = 4;</code>
   * @return The inputRestore.
   */
  google.cloud.gkebackup.logging.v1.LoggedRestore getInputRestore();
  /**
   * <pre>
   * The input Restore resource with the updated fields populated to update
   * the source Restore to.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.LoggedRestore input_restore = 4;</code>
   */
  google.cloud.gkebackup.logging.v1.LoggedRestoreOrBuilder getInputRestoreOrBuilder();

  /**
   * <pre>
   * The error code and message.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error code and message.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error code and message.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}