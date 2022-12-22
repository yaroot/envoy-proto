// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/activity/v2/action.proto

package com.google.apps.drive.activity.v2;

public interface ActionDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.activity.v2.ActionDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An object was created.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Create create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * An object was created.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Create create = 1;</code>
   * @return The create.
   */
  com.google.apps.drive.activity.v2.Create getCreate();
  /**
   * <pre>
   * An object was created.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Create create = 1;</code>
   */
  com.google.apps.drive.activity.v2.CreateOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * An object was edited.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Edit edit = 2;</code>
   * @return Whether the edit field is set.
   */
  boolean hasEdit();
  /**
   * <pre>
   * An object was edited.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Edit edit = 2;</code>
   * @return The edit.
   */
  com.google.apps.drive.activity.v2.Edit getEdit();
  /**
   * <pre>
   * An object was edited.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Edit edit = 2;</code>
   */
  com.google.apps.drive.activity.v2.EditOrBuilder getEditOrBuilder();

  /**
   * <pre>
   * An object was moved.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Move move = 3;</code>
   * @return Whether the move field is set.
   */
  boolean hasMove();
  /**
   * <pre>
   * An object was moved.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Move move = 3;</code>
   * @return The move.
   */
  com.google.apps.drive.activity.v2.Move getMove();
  /**
   * <pre>
   * An object was moved.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Move move = 3;</code>
   */
  com.google.apps.drive.activity.v2.MoveOrBuilder getMoveOrBuilder();

  /**
   * <pre>
   * An object was renamed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Rename rename = 4;</code>
   * @return Whether the rename field is set.
   */
  boolean hasRename();
  /**
   * <pre>
   * An object was renamed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Rename rename = 4;</code>
   * @return The rename.
   */
  com.google.apps.drive.activity.v2.Rename getRename();
  /**
   * <pre>
   * An object was renamed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Rename rename = 4;</code>
   */
  com.google.apps.drive.activity.v2.RenameOrBuilder getRenameOrBuilder();

  /**
   * <pre>
   * An object was deleted.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Delete delete = 5;</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <pre>
   * An object was deleted.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Delete delete = 5;</code>
   * @return The delete.
   */
  com.google.apps.drive.activity.v2.Delete getDelete();
  /**
   * <pre>
   * An object was deleted.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Delete delete = 5;</code>
   */
  com.google.apps.drive.activity.v2.DeleteOrBuilder getDeleteOrBuilder();

  /**
   * <pre>
   * A deleted object was restored.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Restore restore = 6;</code>
   * @return Whether the restore field is set.
   */
  boolean hasRestore();
  /**
   * <pre>
   * A deleted object was restored.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Restore restore = 6;</code>
   * @return The restore.
   */
  com.google.apps.drive.activity.v2.Restore getRestore();
  /**
   * <pre>
   * A deleted object was restored.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Restore restore = 6;</code>
   */
  com.google.apps.drive.activity.v2.RestoreOrBuilder getRestoreOrBuilder();

  /**
   * <pre>
   * The permission on an object was changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.PermissionChange permission_change = 7;</code>
   * @return Whether the permissionChange field is set.
   */
  boolean hasPermissionChange();
  /**
   * <pre>
   * The permission on an object was changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.PermissionChange permission_change = 7;</code>
   * @return The permissionChange.
   */
  com.google.apps.drive.activity.v2.PermissionChange getPermissionChange();
  /**
   * <pre>
   * The permission on an object was changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.PermissionChange permission_change = 7;</code>
   */
  com.google.apps.drive.activity.v2.PermissionChangeOrBuilder getPermissionChangeOrBuilder();

  /**
   * <pre>
   * A change about comments was made.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Comment comment = 8;</code>
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   * <pre>
   * A change about comments was made.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Comment comment = 8;</code>
   * @return The comment.
   */
  com.google.apps.drive.activity.v2.Comment getComment();
  /**
   * <pre>
   * A change about comments was made.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Comment comment = 8;</code>
   */
  com.google.apps.drive.activity.v2.CommentOrBuilder getCommentOrBuilder();

  /**
   * <pre>
   * A change happened in data leak prevention status.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DataLeakPreventionChange dlp_change = 9;</code>
   * @return Whether the dlpChange field is set.
   */
  boolean hasDlpChange();
  /**
   * <pre>
   * A change happened in data leak prevention status.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DataLeakPreventionChange dlp_change = 9;</code>
   * @return The dlpChange.
   */
  com.google.apps.drive.activity.v2.DataLeakPreventionChange getDlpChange();
  /**
   * <pre>
   * A change happened in data leak prevention status.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DataLeakPreventionChange dlp_change = 9;</code>
   */
  com.google.apps.drive.activity.v2.DataLeakPreventionChangeOrBuilder getDlpChangeOrBuilder();

  /**
   * <pre>
   * An object was referenced in an application outside of Drive/Docs.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.ApplicationReference reference = 12;</code>
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   * <pre>
   * An object was referenced in an application outside of Drive/Docs.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.ApplicationReference reference = 12;</code>
   * @return The reference.
   */
  com.google.apps.drive.activity.v2.ApplicationReference getReference();
  /**
   * <pre>
   * An object was referenced in an application outside of Drive/Docs.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.ApplicationReference reference = 12;</code>
   */
  com.google.apps.drive.activity.v2.ApplicationReferenceOrBuilder getReferenceOrBuilder();

  /**
   * <pre>
   * Settings were changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.SettingsChange settings_change = 13;</code>
   * @return Whether the settingsChange field is set.
   */
  boolean hasSettingsChange();
  /**
   * <pre>
   * Settings were changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.SettingsChange settings_change = 13;</code>
   * @return The settingsChange.
   */
  com.google.apps.drive.activity.v2.SettingsChange getSettingsChange();
  /**
   * <pre>
   * Settings were changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.SettingsChange settings_change = 13;</code>
   */
  com.google.apps.drive.activity.v2.SettingsChangeOrBuilder getSettingsChangeOrBuilder();

  /**
   * <pre>
   * Label was changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.AppliedLabelChange applied_label_change = 19;</code>
   * @return Whether the appliedLabelChange field is set.
   */
  boolean hasAppliedLabelChange();
  /**
   * <pre>
   * Label was changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.AppliedLabelChange applied_label_change = 19;</code>
   * @return The appliedLabelChange.
   */
  com.google.apps.drive.activity.v2.AppliedLabelChange getAppliedLabelChange();
  /**
   * <pre>
   * Label was changed.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.AppliedLabelChange applied_label_change = 19;</code>
   */
  com.google.apps.drive.activity.v2.AppliedLabelChangeOrBuilder getAppliedLabelChangeOrBuilder();

  public com.google.apps.drive.activity.v2.ActionDetail.ActionDetailCase getActionDetailCase();
}