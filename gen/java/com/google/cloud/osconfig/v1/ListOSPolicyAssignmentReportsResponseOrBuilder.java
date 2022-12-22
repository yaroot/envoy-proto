// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1;

public interface ListOSPolicyAssignmentReportsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport> 
      getOsPolicyAssignmentReportsList();
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentReport getOsPolicyAssignmentReports(int index);
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  int getOsPolicyAssignmentReportsCount();
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  java.util.List<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder> 
      getOsPolicyAssignmentReportsOrBuilderList();
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder getOsPolicyAssignmentReportsOrBuilder(
      int index);

  /**
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignment
   * report objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignment
   * report objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}