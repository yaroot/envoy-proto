// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

public interface DenyMaintenancePeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.DenyMaintenancePeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * "deny maintenance period" start date. If the year of the start date is
   * empty, the year of the end date also must be empty. In this case, it means
   * the deny maintenance period recurs every year. The date is in format
   * yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * "deny maintenance period" start date. If the year of the start date is
   * empty, the year of the end date also must be empty. In this case, it means
   * the deny maintenance period recurs every year. The date is in format
   * yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * "deny maintenance period" end date. If the year of the end date is empty,
   * the year of the start date also must be empty. In this case, it means the
   * deny maintenance period recurs every year. The date is in format yyyy-mm-dd
   * i.e., 2020-11-01, or mm-dd, i.e., 11-01
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * "deny maintenance period" end date. If the year of the end date is empty,
   * the year of the start date also must be empty. In this case, it means the
   * deny maintenance period recurs every year. The date is in format yyyy-mm-dd
   * i.e., 2020-11-01, or mm-dd, i.e., 11-01
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * Time in UTC when the "deny maintenance period" starts on start_date and
   * ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
   * </pre>
   *
   * <code>string time = 3;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <pre>
   * Time in UTC when the "deny maintenance period" starts on start_date and
   * ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
   * </pre>
   *
   * <code>string time = 3;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();
}