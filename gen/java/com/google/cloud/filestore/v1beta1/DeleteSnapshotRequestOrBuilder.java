// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

public interface DeleteSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.DeleteSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The snapshot resource name, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The snapshot resource name, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}