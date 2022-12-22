// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface PhaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Phase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The ID of the Phase.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The ID of the Phase.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. Current state of the Phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Phase.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. Current state of the Phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Phase.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.deploy.v1.Phase.State getState();

  /**
   * <pre>
   * Output only. Deployment job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeploymentJobs deployment_jobs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deploymentJobs field is set.
   */
  boolean hasDeploymentJobs();
  /**
   * <pre>
   * Output only. Deployment job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeploymentJobs deployment_jobs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deploymentJobs.
   */
  com.google.cloud.deploy.v1.DeploymentJobs getDeploymentJobs();
  /**
   * <pre>
   * Output only. Deployment job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeploymentJobs deployment_jobs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.DeploymentJobsOrBuilder getDeploymentJobsOrBuilder();

  public com.google.cloud.deploy.v1.Phase.JobsCase getJobsCase();
}