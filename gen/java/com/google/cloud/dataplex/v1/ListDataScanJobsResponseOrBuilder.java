// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public interface ListDataScanJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListDataScanJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.DataScanJob> 
      getDataScanJobsList();
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataScanJob getDataScanJobs(int index);
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  int getDataScanJobsCount();
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.DataScanJobOrBuilder> 
      getDataScanJobsOrBuilderList();
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataScanJobOrBuilder getDataScanJobsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}