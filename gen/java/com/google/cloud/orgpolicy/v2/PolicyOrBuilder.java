// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

public interface PolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Policy. Must be one of the following
   * forms, where constraint_name is the name of the constraint which this
   * Policy configures:
   * * `projects/{project_number}/policies/{constraint_name}`
   * * `folders/{folder_id}/policies/{constraint_name}`
   * * `organizations/{organization_id}/policies/{constraint_name}`
   * For example, "projects/123/policies/compute.disableSerialPortAccess".
   * Note: `projects/{project_id}/policies/{constraint_name}` is also an
   * acceptable name for API requests, but responses will return the name using
   * the equivalent project number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name of the Policy. Must be one of the following
   * forms, where constraint_name is the name of the constraint which this
   * Policy configures:
   * * `projects/{project_number}/policies/{constraint_name}`
   * * `folders/{folder_id}/policies/{constraint_name}`
   * * `organizations/{organization_id}/policies/{constraint_name}`
   * For example, "projects/123/policies/compute.disableSerialPortAccess".
   * Note: `projects/{project_id}/policies/{constraint_name}` is also an
   * acceptable name for API requests, but responses will return the name using
   * the equivalent project number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Basic information about the Organization Policy.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * Basic information about the Organization Policy.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   * @return The spec.
   */
  com.google.cloud.orgpolicy.v2.PolicySpec getSpec();
  /**
   * <pre>
   * Basic information about the Organization Policy.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   */
  com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.AlternatePolicySpec alternate = 3 [deprecated = true];</code>
   * @deprecated google.cloud.orgpolicy.v2.Policy.alternate is deprecated.
   *     See google/cloud/orgpolicy/v2/orgpolicy.proto;l=217
   * @return Whether the alternate field is set.
   */
  @java.lang.Deprecated boolean hasAlternate();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.AlternatePolicySpec alternate = 3 [deprecated = true];</code>
   * @deprecated google.cloud.orgpolicy.v2.Policy.alternate is deprecated.
   *     See google/cloud/orgpolicy/v2/orgpolicy.proto;l=217
   * @return The alternate.
   */
  @java.lang.Deprecated com.google.cloud.orgpolicy.v2.AlternatePolicySpec getAlternate();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.AlternatePolicySpec alternate = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.orgpolicy.v2.AlternatePolicySpecOrBuilder getAlternateOrBuilder();
}