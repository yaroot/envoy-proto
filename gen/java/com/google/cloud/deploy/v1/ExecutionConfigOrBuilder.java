// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface ExecutionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.ExecutionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the usages.
   */
  java.util.List<com.google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage> getUsagesList();
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of usages.
   */
  int getUsagesCount();
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The usages at the given index.
   */
  com.google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage getUsages(int index);
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for usages.
   */
  java.util.List<java.lang.Integer>
  getUsagesValueList();
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of usages at the given index.
   */
  int getUsagesValue(int index);

  /**
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DefaultPool default_pool = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the defaultPool field is set.
   */
  boolean hasDefaultPool();
  /**
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DefaultPool default_pool = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The defaultPool.
   */
  com.google.cloud.deploy.v1.DefaultPool getDefaultPool();
  /**
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DefaultPool default_pool = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.deploy.v1.DefaultPoolOrBuilder getDefaultPoolOrBuilder();

  /**
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PrivatePool private_pool = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the privatePool field is set.
   */
  boolean hasPrivatePool();
  /**
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PrivatePool private_pool = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The privatePool.
   */
  com.google.cloud.deploy.v1.PrivatePool getPrivatePool();
  /**
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PrivatePool private_pool = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.deploy.v1.PrivatePoolOrBuilder getPrivatePoolOrBuilder();

  /**
   * <pre>
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * If this optional field is unspecified, the default Cloud Build pool will be
   * used.
   * </pre>
   *
   * <code>string worker_pool = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();
  /**
   * <pre>
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * If this optional field is unspecified, the default Cloud Build pool will be
   * used.
   * </pre>
   *
   * <code>string worker_pool = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString
      getWorkerPoolBytes();

  /**
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) is used.
   * </pre>
   *
   * <code>string service_account = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) is used.
   * </pre>
   *
   * <code>string service_account = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * Optional. Cloud Storage location in which to store execution outputs. This can
   * either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The artifactStorage.
   */
  java.lang.String getArtifactStorage();
  /**
   * <pre>
   * Optional. Cloud Storage location in which to store execution outputs. This can
   * either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for artifactStorage.
   */
  com.google.protobuf.ByteString
      getArtifactStorageBytes();

  /**
   * <pre>
   * Optional. Execution timeout for a Cloud Build Execution. This must be between 10m and
   * 24h in seconds format.
   * If unspecified, a default timeout of 1h is used.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the executionTimeout field is set.
   */
  boolean hasExecutionTimeout();
  /**
   * <pre>
   * Optional. Execution timeout for a Cloud Build Execution. This must be between 10m and
   * 24h in seconds format.
   * If unspecified, a default timeout of 1h is used.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The executionTimeout.
   */
  com.google.protobuf.Duration getExecutionTimeout();
  /**
   * <pre>
   * Optional. Execution timeout for a Cloud Build Execution. This must be between 10m and
   * 24h in seconds format.
   * If unspecified, a default timeout of 1h is used.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder();

  public com.google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentCase getExecutionEnvironmentCase();
}
