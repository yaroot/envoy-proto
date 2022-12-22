// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface DeployJobRunMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.DeployJobRunMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a `DeployJobRun`.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a `DeployJobRun`.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The cloudRun.
   */
  com.google.cloud.deploy.v1.CloudRunMetadata getCloudRun();
  /**
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a `DeployJobRun`.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder getCloudRunOrBuilder();
}