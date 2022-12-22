// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/batch.proto

package com.google.cloud.batch.v1alpha;

public interface CreateJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.CreateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource name where the Job will be created.
   * Pattern: "projects/{project}/locations/{location}"
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource name where the Job will be created.
   * Pattern: "projects/{project}/locations/{location}"
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * ID used to uniquely identify the Job within its parent scope.
   * This field should contain at most 63 characters and must start with
   * lowercase characters.
   * Only lowercase characters, numbers and '-' are accepted.
   * The '-' character cannot be the first or the last one.
   * A system generated ID will be used if the field is not set.
   * The job.name field in the request will be ignored and the created resource
   * name of the Job will be "{parent}/jobs/{job_id}".
   * </pre>
   *
   * <code>string job_id = 2;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * ID used to uniquely identify the Job within its parent scope.
   * This field should contain at most 63 characters and must start with
   * lowercase characters.
   * Only lowercase characters, numbers and '-' are accepted.
   * The '-' character cannot be the first or the last one.
   * A system generated ID will be used if the field is not set.
   * The job.name field in the request will be ignored and the created resource
   * name of the Job will be "{parent}/jobs/{job_id}".
   * </pre>
   *
   * <code>string job_id = 2;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * Required. The Job to create.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Job job = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   * Required. The Job to create.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Job job = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The job.
   */
  com.google.cloud.batch.v1alpha.Job getJob();
  /**
   * <pre>
   * Required. The Job to create.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Job job = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.batch.v1alpha.JobOrBuilder getJobOrBuilder();

  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
