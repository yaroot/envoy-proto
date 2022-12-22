// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/workflows/executions/v1/executions.proto

package com.google.cloud.workflows.executions.v1;

public interface GetExecutionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workflows.executions.v1.GetExecutionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the execution to be retrieved.
   * Format:
   * projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the execution to be retrieved.
   * Format:
   * projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. A view defining which fields should be filled in the returned execution.
   * The API will default to the FULL view.
   * </pre>
   *
   * <code>.google.cloud.workflows.executions.v1.ExecutionView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. A view defining which fields should be filled in the returned execution.
   * The API will default to the FULL view.
   * </pre>
   *
   * <code>.google.cloud.workflows.executions.v1.ExecutionView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.cloud.workflows.executions.v1.ExecutionView getView();
}