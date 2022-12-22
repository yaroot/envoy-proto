// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1;

public interface ListScanRunsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.ListScanRunsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1.ScanRun> 
      getScanRunsList();
  /**
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1.ScanRun getScanRuns(int index);
  /**
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  int getScanRunsCount();
  /**
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder> 
      getScanRunsOrBuilderList();
  /**
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder getScanRunsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}