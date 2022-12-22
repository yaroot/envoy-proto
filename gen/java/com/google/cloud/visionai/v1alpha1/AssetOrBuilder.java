// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/warehouse.proto

package com.google.cloud.visionai.v1alpha1;

public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1alpha1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the asset.
   * Form:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the asset.
   * Form:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The duration for which all media assets, associated metadata, and search
   * documents can exist. If not set, then it will using the default ttl in the
   * parent corpus resource.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2;</code>
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   * <pre>
   * The duration for which all media assets, associated metadata, and search
   * documents can exist. If not set, then it will using the default ttl in the
   * parent corpus resource.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2;</code>
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   * <pre>
   * The duration for which all media assets, associated metadata, and search
   * documents can exist. If not set, then it will using the default ttl in the
   * parent corpus resource.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();
}