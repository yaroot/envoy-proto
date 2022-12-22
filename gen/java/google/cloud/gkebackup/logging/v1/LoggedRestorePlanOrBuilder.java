// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/logging/v1/logged_restore_plan.proto

package google.cloud.gkebackup.logging.v1;

public interface LoggedRestorePlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.logging.v1.LoggedRestorePlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User specified descriptive string for this RestorePlan.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * User specified descriptive string for this RestorePlan.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The BackupPlan from which Backups may be used as the source
   * for Restores created via this RestorePlan.
   * Format: projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;.
   * </pre>
   *
   * <code>string backup_plan = 2;</code>
   * @return The backupPlan.
   */
  java.lang.String getBackupPlan();
  /**
   * <pre>
   * The BackupPlan from which Backups may be used as the source
   * for Restores created via this RestorePlan.
   * Format: projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;.
   * </pre>
   *
   * <code>string backup_plan = 2;</code>
   * @return The bytes for backupPlan.
   */
  com.google.protobuf.ByteString
      getBackupPlanBytes();

  /**
   * <pre>
   * The target cluster into which Restores created via this RestorePlan
   * will restore data. NOTE: the cluster's region must be the same as the
   * RestorePlan.
   * Possible formats:
   *   1. projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;
   *   2. projects/&#42;&#47;zones/&#42;&#47;clusters/&#42;
   * </pre>
   *
   * <code>string cluster = 3;</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <pre>
   * The target cluster into which Restores created via this RestorePlan
   * will restore data. NOTE: the cluster's region must be the same as the
   * RestorePlan.
   * Possible formats:
   *   1. projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;
   *   2. projects/&#42;&#47;zones/&#42;&#47;clusters/&#42;
   * </pre>
   *
   * <code>string cluster = 3;</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * Configuration of Restores created via this RestorePlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.RestoreConfig restore_config = 4;</code>
   * @return Whether the restoreConfig field is set.
   */
  boolean hasRestoreConfig();
  /**
   * <pre>
   * Configuration of Restores created via this RestorePlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.RestoreConfig restore_config = 4;</code>
   * @return The restoreConfig.
   */
  google.cloud.gkebackup.logging.v1.RestoreConfig getRestoreConfig();
  /**
   * <pre>
   * Configuration of Restores created via this RestorePlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.logging.v1.RestoreConfig restore_config = 4;</code>
   */
  google.cloud.gkebackup.logging.v1.RestoreConfigOrBuilder getRestoreConfigOrBuilder();

  /**
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
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
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}