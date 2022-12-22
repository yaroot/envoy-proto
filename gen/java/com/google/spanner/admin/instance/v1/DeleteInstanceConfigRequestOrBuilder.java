// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface DeleteInstanceConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.DeleteInstanceConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the instance configuration to be deleted.
   * Values are of the form
   * `projects/&lt;project&gt;/instanceConfigs/&lt;instance_config&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the instance configuration to be deleted.
   * Values are of the form
   * `projects/&lt;project&gt;/instanceConfigs/&lt;instance_config&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Used for optimistic concurrency control as a way to help prevent
   * simultaneous deletes of an instance config from overwriting each
   * other. If not empty, the API
   * only deletes the instance config when the etag provided matches the current
   * status of the requested instance config. Otherwise, deletes the instance
   * config without checking the current status of the requested instance
   * config.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Used for optimistic concurrency control as a way to help prevent
   * simultaneous deletes of an instance config from overwriting each
   * other. If not empty, the API
   * only deletes the instance config when the etag provided matches the current
   * status of the requested instance config. Otherwise, deletes the instance
   * config without checking the current status of the requested instance
   * config.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * An option to validate, but not actually execute, a request,
   * and provide the same response.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}