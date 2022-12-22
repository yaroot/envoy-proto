// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/requests.proto

package com.google.apps.drive.labels.v2beta;

public interface DeleteLabelPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.labels.v2beta.DeleteLabelPermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Label Permission resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Label Permission resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Set to `true` in order to use the user's admin credentials. The server
   * will verify the user is an admin for the Label before allowing access.
   * </pre>
   *
   * <code>bool use_admin_access = 2;</code>
   * @return The useAdminAccess.
   */
  boolean getUseAdminAccess();
}