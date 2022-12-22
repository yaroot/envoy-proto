// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

public interface JobGetQueryResultsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Total number of results in query results.
   * </pre>
   *
   * <code>uint64 total_results = 1;</code>
   * @return The totalResults.
   */
  long getTotalResults();

  /**
   * <pre>
   * The job that was created to run the query.
   * It completed if `job.status.state` is `DONE`.
   * It failed if `job.status.errorResult` is also present.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Job job = 2;</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   * The job that was created to run the query.
   * It completed if `job.status.state` is `DONE`.
   * It failed if `job.status.errorResult` is also present.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Job job = 2;</code>
   * @return The job.
   */
  com.google.cloud.bigquery.logging.v1.Job getJob();
  /**
   * <pre>
   * The job that was created to run the query.
   * It completed if `job.status.state` is `DONE`.
   * It failed if `job.status.errorResult` is also present.
   * </pre>
   *
   * <code>.google.cloud.bigquery.logging.v1.Job job = 2;</code>
   */
  com.google.cloud.bigquery.logging.v1.JobOrBuilder getJobOrBuilder();
}