// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/environment.proto

package com.google.cloud.dialogflow.v2;

public interface CreateEnvironmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to create an environment for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to create an environment for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The environment to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Environment environment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   * <pre>
   * Required. The environment to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Environment environment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The environment.
   */
  com.google.cloud.dialogflow.v2.Environment getEnvironment();
  /**
   * <pre>
   * Required. The environment to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Environment environment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   * <pre>
   * Required. The unique id of the new environment.
   * </pre>
   *
   * <code>string environment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <pre>
   * Required. The unique id of the new environment.
   * </pre>
   *
   * <code>string environment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();
}