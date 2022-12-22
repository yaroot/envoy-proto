// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/logging/v1/logged_restore.proto

package google.cloud.gkebackup.logging.v1;

public interface LoggedRestoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.logging.v1.LoggedRestore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full name of the Backup resource this Restore resource used to restore
   * from. Format: projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;.
   * </pre>
   *
   * <code>string backup = 1;</code>
   * @return The backup.
   */
  java.lang.String getBackup();
  /**
   * <pre>
   * Full name of the Backup resource this Restore resource used to restore
   * from. Format: projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;.
   * </pre>
   *
   * <code>string backup = 1;</code>
   * @return The bytes for backup.
   */
  com.google.protobuf.ByteString
      getBackupBytes();

  /**
   * <pre>
   * GCP Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * GCP Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * GCP Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * GCP Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * GCP Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * User specified descriptive string for this Restore.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * User specified descriptive string for this Restore.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The current state of the Restore.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.LoggedRestore.State state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The current state of the Restore.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.LoggedRestore.State state = 4;</code>
   * @return The state.
   */
  google.cloud.gkebackup.logging.v1.LoggedRestore.State getState();

  /**
   * <pre>
   * Human-readable description of why the Restore is in its current state.
   * </pre>
   *
   * <code>string state_reason = 5;</code>
   * @return The stateReason.
   */
  java.lang.String getStateReason();
  /**
   * <pre>
   * Human-readable description of why the Restore is in its current state.
   * </pre>
   *
   * <code>string state_reason = 5;</code>
   * @return The bytes for stateReason.
   */
  com.google.protobuf.ByteString
      getStateReasonBytes();
}