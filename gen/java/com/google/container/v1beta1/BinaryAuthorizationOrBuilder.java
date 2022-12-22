// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface BinaryAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.BinaryAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This field is deprecated. Leave this unset and instead configure
   * BinaryAuthorization using evaluation_mode. If evaluation_mode is set to
   * anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
   * </pre>
   *
   * <code>bool enabled = 1 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.BinaryAuthorization.enabled is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=1481
   * @return The enabled.
   */
  @java.lang.Deprecated boolean getEnabled();

  /**
   * <pre>
   * Mode of operation for binauthz policy evaluation. If unspecified, defaults
   * to DISABLED.
   * </pre>
   *
   * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
   * @return The enum numeric value on the wire for evaluationMode.
   */
  int getEvaluationModeValue();
  /**
   * <pre>
   * Mode of operation for binauthz policy evaluation. If unspecified, defaults
   * to DISABLED.
   * </pre>
   *
   * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
   * @return The evaluationMode.
   */
  com.google.container.v1beta1.BinaryAuthorization.EvaluationMode getEvaluationMode();
}