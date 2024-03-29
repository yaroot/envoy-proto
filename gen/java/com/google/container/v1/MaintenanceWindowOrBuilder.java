// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface MaintenanceWindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.MaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   * @return Whether the dailyMaintenanceWindow field is set.
   */
  boolean hasDailyMaintenanceWindow();
  /**
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   * @return The dailyMaintenanceWindow.
   */
  com.google.container.v1.DailyMaintenanceWindow getDailyMaintenanceWindow();
  /**
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   */
  com.google.container.v1.DailyMaintenanceWindowOrBuilder getDailyMaintenanceWindowOrBuilder();

  /**
   * <pre>
   * RecurringWindow specifies some number of recurring time periods for
   * maintenance to occur. The time windows may be overlapping. If no
   * maintenance windows are set, maintenance can occur at any time.
   * </pre>
   *
   * <code>.google.container.v1.RecurringTimeWindow recurring_window = 3;</code>
   * @return Whether the recurringWindow field is set.
   */
  boolean hasRecurringWindow();
  /**
   * <pre>
   * RecurringWindow specifies some number of recurring time periods for
   * maintenance to occur. The time windows may be overlapping. If no
   * maintenance windows are set, maintenance can occur at any time.
   * </pre>
   *
   * <code>.google.container.v1.RecurringTimeWindow recurring_window = 3;</code>
   * @return The recurringWindow.
   */
  com.google.container.v1.RecurringTimeWindow getRecurringWindow();
  /**
   * <pre>
   * RecurringWindow specifies some number of recurring time periods for
   * maintenance to occur. The time windows may be overlapping. If no
   * maintenance windows are set, maintenance can occur at any time.
   * </pre>
   *
   * <code>.google.container.v1.RecurringTimeWindow recurring_window = 3;</code>
   */
  com.google.container.v1.RecurringTimeWindowOrBuilder getRecurringWindowOrBuilder();

  /**
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1.TimeWindow&gt; maintenance_exclusions = 4;</code>
   */
  int getMaintenanceExclusionsCount();
  /**
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1.TimeWindow&gt; maintenance_exclusions = 4;</code>
   */
  boolean containsMaintenanceExclusions(
      java.lang.String key);
  /**
   * Use {@link #getMaintenanceExclusionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.container.v1.TimeWindow>
  getMaintenanceExclusions();
  /**
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1.TimeWindow&gt; maintenance_exclusions = 4;</code>
   */
  java.util.Map<java.lang.String, com.google.container.v1.TimeWindow>
  getMaintenanceExclusionsMap();
  /**
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1.TimeWindow&gt; maintenance_exclusions = 4;</code>
   */
  /* nullable */
com.google.container.v1.TimeWindow getMaintenanceExclusionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.container.v1.TimeWindow defaultValue);
  /**
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1.TimeWindow&gt; maintenance_exclusions = 4;</code>
   */
  com.google.container.v1.TimeWindow getMaintenanceExclusionsOrThrow(
      java.lang.String key);

  public com.google.container.v1.MaintenanceWindow.PolicyCase getPolicyCase();
}
