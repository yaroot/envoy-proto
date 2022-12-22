// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

public interface GetEntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.GetEntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the entity:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}.`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the entity:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}.`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Used to select the subset of entity information to return.
   * Defaults to `BASIC`.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.GetEntityRequest.EntityView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. Used to select the subset of entity information to return.
   * Defaults to `BASIC`.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.GetEntityRequest.EntityView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.cloud.dataplex.v1.GetEntityRequest.EntityView getView();
}