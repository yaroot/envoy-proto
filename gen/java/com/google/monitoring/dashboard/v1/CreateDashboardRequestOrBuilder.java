// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/dashboards_service.proto

package com.google.monitoring.dashboard.v1;

public interface CreateDashboardRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.CreateDashboardRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project on which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project on which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dashboard field is set.
   */
  boolean hasDashboard();
  /**
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dashboard.
   */
  com.google.monitoring.dashboard.v1.Dashboard getDashboard();
  /**
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.dashboard.v1.DashboardOrBuilder getDashboardOrBuilder();

  /**
   * <pre>
   * If set, validate the request and preview the review, but do not actually
   * save it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}