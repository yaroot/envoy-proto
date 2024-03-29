// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/requests.proto

package com.google.apps.drive.labels.v2beta;

public interface BatchDeleteLabelPermissionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.labels.v2beta.BatchDeleteLabelPermissionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The request message specifying the resources to update.
   * </pre>
   *
   * <code>repeated .google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest> 
      getRequestsList();
  /**
   * <pre>
   * Required. The request message specifying the resources to update.
   * </pre>
   *
   * <code>repeated .google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest getRequests(int index);
  /**
   * <pre>
   * Required. The request message specifying the resources to update.
   * </pre>
   *
   * <code>repeated .google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * Required. The request message specifying the resources to update.
   * </pre>
   *
   * <code>repeated .google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.apps.drive.labels.v2beta.DeleteLabelPermissionRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * Required. The request message specifying the resources to update.
   * </pre>
   *
   * <code>repeated .google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.apps.drive.labels.v2beta.DeleteLabelPermissionRequestOrBuilder getRequestsOrBuilder(
      int index);

  /**
   * <pre>
   * Set to `true` in order to use the user's admin credentials. The server
   * will verify the user is an admin for the Label before allowing access.
   * If this is set, the use_admin_access field in the
   * DeleteLabelPermissionRequest messages must either be empty or match this
   * field.
   * </pre>
   *
   * <code>bool use_admin_access = 2;</code>
   * @return The useAdminAccess.
   */
  boolean getUseAdminAccess();

  /**
   * <pre>
   * Required. The parent Label resource name shared by all permissions being
   * deleted. Format: labels/{label} If this is set, the parent field in the
   * UpdateLabelPermissionRequest messages must either be empty or match this
   * field.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent Label resource name shared by all permissions being
   * deleted. Format: labels/{label} If this is set, the parent field in the
   * UpdateLabelPermissionRequest messages must either be empty or match this
   * field.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
