// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface CancelOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.CancelOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation resides.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation resides.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The server-assigned `name` of the operation.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string operation_id = 3;</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * The server-assigned `name` of the operation.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string operation_id = 3;</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * The name (project, location, operation id) of the operation to cancel.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;operations/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, operation id) of the operation to cancel.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;operations/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}