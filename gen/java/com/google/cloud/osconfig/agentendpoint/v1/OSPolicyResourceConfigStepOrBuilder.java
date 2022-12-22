// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/agentendpoint/v1/config_common.proto

package com.google.cloud.osconfig.agentendpoint.v1;

public interface OSPolicyResourceConfigStepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration step type.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Configuration step type.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep.Type type = 1;</code>
   * @return The type.
   */
  com.google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep.Type getType();

  /**
   * <pre>
   * Outcome of the configuration step.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep.Outcome outcome = 2;</code>
   * @return The enum numeric value on the wire for outcome.
   */
  int getOutcomeValue();
  /**
   * <pre>
   * Outcome of the configuration step.
   * </pre>
   *
   * <code>.google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep.Outcome outcome = 2;</code>
   * @return The outcome.
   */
  com.google.cloud.osconfig.agentendpoint.v1.OSPolicyResourceConfigStep.Outcome getOutcome();

  /**
   * <pre>
   * An error message recorded during the execution of this step.
   * Only populated when outcome is FAILED.
   * </pre>
   *
   * <code>string error_message = 3;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * An error message recorded during the execution of this step.
   * Only populated when outcome is FAILED.
   * </pre>
   *
   * <code>string error_message = 3;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}