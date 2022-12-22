// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

public interface ListViolationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.ListViolationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Violations under a Workload.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1.Violation violations = 1;</code>
   */
  java.util.List<com.google.cloud.assuredworkloads.v1.Violation> 
      getViolationsList();
  /**
   * <pre>
   * List of Violations under a Workload.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1.Violation violations = 1;</code>
   */
  com.google.cloud.assuredworkloads.v1.Violation getViolations(int index);
  /**
   * <pre>
   * List of Violations under a Workload.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1.Violation violations = 1;</code>
   */
  int getViolationsCount();
  /**
   * <pre>
   * List of Violations under a Workload.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1.Violation violations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.assuredworkloads.v1.ViolationOrBuilder> 
      getViolationsOrBuilderList();
  /**
   * <pre>
   * List of Violations under a Workload.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1.Violation violations = 1;</code>
   */
  com.google.cloud.assuredworkloads.v1.ViolationOrBuilder getViolationsOrBuilder(
      int index);

  /**
   * <pre>
   * The next page token. Returns empty if reached the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next page token. Returns empty if reached the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}