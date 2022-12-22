// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/storageinsights/v1/storageinsights.proto

package com.google.cloud.storageinsights.v1;

public interface ListReportDetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.storageinsights.v1.ListReportDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of ReportDetail
   * </pre>
   *
   * <code>repeated .google.cloud.storageinsights.v1.ReportDetail report_details = 1;</code>
   */
  java.util.List<com.google.cloud.storageinsights.v1.ReportDetail> 
      getReportDetailsList();
  /**
   * <pre>
   * The list of ReportDetail
   * </pre>
   *
   * <code>repeated .google.cloud.storageinsights.v1.ReportDetail report_details = 1;</code>
   */
  com.google.cloud.storageinsights.v1.ReportDetail getReportDetails(int index);
  /**
   * <pre>
   * The list of ReportDetail
   * </pre>
   *
   * <code>repeated .google.cloud.storageinsights.v1.ReportDetail report_details = 1;</code>
   */
  int getReportDetailsCount();
  /**
   * <pre>
   * The list of ReportDetail
   * </pre>
   *
   * <code>repeated .google.cloud.storageinsights.v1.ReportDetail report_details = 1;</code>
   */
  java.util.List<? extends com.google.cloud.storageinsights.v1.ReportDetailOrBuilder> 
      getReportDetailsOrBuilderList();
  /**
   * <pre>
   * The list of ReportDetail
   * </pre>
   *
   * <code>repeated .google.cloud.storageinsights.v1.ReportDetail report_details = 1;</code>
   */
  com.google.cloud.storageinsights.v1.ReportDetailOrBuilder getReportDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}