// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/label_permission.proto

package com.google.apps.drive.labels.v2beta;

public interface LabelPermissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.labels.v2beta.LabelPermission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Person resource name.
   * </pre>
   *
   * <code>string person = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the person field is set.
   */
  boolean hasPerson();
  /**
   * <pre>
   * Person resource name.
   * </pre>
   *
   * <code>string person = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The person.
   */
  java.lang.String getPerson();
  /**
   * <pre>
   * Person resource name.
   * </pre>
   *
   * <code>string person = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for person.
   */
  com.google.protobuf.ByteString
      getPersonBytes();

  /**
   * <pre>
   * Group resource name.
   * </pre>
   *
   * <code>string group = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <pre>
   * Group resource name.
   * </pre>
   *
   * <code>string group = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   * <pre>
   * Group resource name.
   * </pre>
   *
   * <code>string group = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString
      getGroupBytes();

  /**
   * <pre>
   * Audience to grant a role to. The magic value of `audiences/default` may
   * be used to apply the role to the default audience in the context of the
   * organization that owns the Label.
   * </pre>
   *
   * <code>string audience = 5;</code>
   * @return Whether the audience field is set.
   */
  boolean hasAudience();
  /**
   * <pre>
   * Audience to grant a role to. The magic value of `audiences/default` may
   * be used to apply the role to the default audience in the context of the
   * organization that owns the Label.
   * </pre>
   *
   * <code>string audience = 5;</code>
   * @return The audience.
   */
  java.lang.String getAudience();
  /**
   * <pre>
   * Audience to grant a role to. The magic value of `audiences/default` may
   * be used to apply the role to the default audience in the context of the
   * organization that owns the Label.
   * </pre>
   *
   * <code>string audience = 5;</code>
   * @return The bytes for audience.
   */
  com.google.protobuf.ByteString
      getAudienceBytes();

  /**
   * <pre>
   * Resource name of this permission.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of this permission.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Specifies the email address for a user or group pricinpal. Not populated
   * for audience principals. User and Group permissions may only be inserted
   * using email address. On update requests, if email address is specified,
   * no principal should be specified.
   * </pre>
   *
   * <code>string email = 2;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * Specifies the email address for a user or group pricinpal. Not populated
   * for audience principals. User and Group permissions may only be inserted
   * using email address. On update requests, if email address is specified,
   * no principal should be specified.
   * </pre>
   *
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * The role the principal should have.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.LabelPermission.LabelRole role = 6;</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <pre>
   * The role the principal should have.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.LabelPermission.LabelRole role = 6;</code>
   * @return The role.
   */
  com.google.apps.drive.labels.v2beta.LabelPermission.LabelRole getRole();

  public com.google.apps.drive.labels.v2beta.LabelPermission.PrincipalCase getPrincipalCase();
}
