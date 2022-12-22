// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/edgecontainer/v1/resources.proto

package com.google.cloud.edgecontainer.v1;

public interface FleetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.Fleet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Fleet host project where this cluster will be registered.
   * Project names are formatted as
   * `projects/&lt;project-number&gt;`.
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Required. The name of the Fleet host project where this cluster will be registered.
   * Project names are formatted as
   * `projects/&lt;project-number&gt;`.
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Output only. The name of the managed Hub Membership resource associated to this cluster.
   * Membership names are formatted as
   * `projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;`.
   * </pre>
   *
   * <code>string membership = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The membership.
   */
  java.lang.String getMembership();
  /**
   * <pre>
   * Output only. The name of the managed Hub Membership resource associated to this cluster.
   * Membership names are formatted as
   * `projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;`.
   * </pre>
   *
   * <code>string membership = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for membership.
   */
  com.google.protobuf.ByteString
      getMembershipBytes();
}