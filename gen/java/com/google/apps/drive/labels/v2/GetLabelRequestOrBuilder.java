// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2/requests.proto

package com.google.apps.drive.labels.v2;

public interface GetLabelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.labels.v2.GetLabelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Label resource name.
   * May be any of:
   * * `labels/{id}` (equivalent to labels/{id}&#64;latest)
   * * `labels/{id}&#64;latest`
   * * `labels/{id}&#64;published`
   * * `labels/{id}&#64;{revision_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Label resource name.
   * May be any of:
   * * `labels/{id}` (equivalent to labels/{id}&#64;latest)
   * * `labels/{id}&#64;latest`
   * * `labels/{id}&#64;published`
   * * `labels/{id}&#64;{revision_id}`
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
   * verifies that the user is an admin for the label before allowing access.
   * </pre>
   *
   * <code>bool use_admin_access = 2;</code>
   * @return The useAdminAccess.
   */
  boolean getUseAdminAccess();

  /**
   * <pre>
   * The BCP-47 language code to use for evaluating localized field labels.
   * When not specified, values in the default configured language are used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The BCP-47 language code to use for evaluating localized field labels.
   * When not specified, values in the default configured language are used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * When specified, only certain fields belonging to the indicated view are
   * returned.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2.LabelView view = 4;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * When specified, only certain fields belonging to the indicated view are
   * returned.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2.LabelView view = 4;</code>
   * @return The view.
   */
  com.google.apps.drive.labels.v2.LabelView getView();
}