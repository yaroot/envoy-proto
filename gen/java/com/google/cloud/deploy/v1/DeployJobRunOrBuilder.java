// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface DeployJobRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.DeployJobRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the Cloud Build `Build` object that is used to deploy.
   * Format is projects/{project}/locations/{location}/builds/{build}.
   * </pre>
   *
   * <code>string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   * <pre>
   * Output only. The resource name of the Cloud Build `Build` object that is used to deploy.
   * Format is projects/{project}/locations/{location}/builds/{build}.
   * </pre>
   *
   * <code>string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString
      getBuildBytes();

  /**
   * <pre>
   * Output only. The reason the deploy failed. This will always be unspecified while the
   * deploy is in progress or if it succeeded.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for failureCause.
   */
  int getFailureCauseValue();
  /**
   * <pre>
   * Output only. The reason the deploy failed. This will always be unspecified while the
   * deploy is in progress or if it succeeded.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failureCause.
   */
  com.google.cloud.deploy.v1.DeployJobRun.FailureCause getFailureCause();

  /**
   * <pre>
   * Output only. Additional information about the deploy failure, if available.
   * </pre>
   *
   * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failureMessage.
   */
  java.lang.String getFailureMessage();
  /**
   * <pre>
   * Output only. Additional information about the deploy failure, if available.
   * </pre>
   *
   * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for failureMessage.
   */
  com.google.protobuf.ByteString
      getFailureMessageBytes();

  /**
   * <pre>
   * Output only. Metadata containing information about the deploy job run.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJobRunMetadata metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Output only. Metadata containing information about the deploy job run.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJobRunMetadata metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The metadata.
   */
  com.google.cloud.deploy.v1.DeployJobRunMetadata getMetadata();
  /**
   * <pre>
   * Output only. Metadata containing information about the deploy job run.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJobRunMetadata metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.DeployJobRunMetadataOrBuilder getMetadataOrBuilder();
}