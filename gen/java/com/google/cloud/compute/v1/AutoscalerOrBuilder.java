// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AutoscalerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Autoscaler)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicy autoscaling_policy = 221950041;</code>
   * @return Whether the autoscalingPolicy field is set.
   */
  boolean hasAutoscalingPolicy();
  /**
   * <pre>
   * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicy autoscaling_policy = 221950041;</code>
   * @return The autoscalingPolicy.
   */
  com.google.cloud.compute.v1.AutoscalingPolicy getAutoscalingPolicy();
  /**
   * <pre>
   * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicy autoscaling_policy = 221950041;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyOrBuilder getAutoscalingPolicyOrBuilder();

  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString
      getCreationTimestampBytes();

  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#autoscaler for autoscalers.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#autoscaler for autoscalers.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#autoscaler for autoscalers.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [Output Only] Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
   * </pre>
   *
   * <code>optional int32 recommended_size = 257915749;</code>
   * @return Whether the recommendedSize field is set.
   */
  boolean hasRecommendedSize();
  /**
   * <pre>
   * [Output Only] Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
   * </pre>
   *
   * <code>optional int32 recommended_size = 257915749;</code>
   * @return The recommendedSize.
   */
  int getRecommendedSize();

  /**
   * <pre>
   * [Output Only] URL of the region where the instance group resides (for autoscalers living in regional scope).
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   * <pre>
   * [Output Only] URL of the region where the instance group resides (for autoscalers living in regional scope).
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * [Output Only] URL of the region where the instance group resides (for autoscalers living in regional scope).
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * [Output Only] Status information of existing scaling schedules.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ScalingScheduleStatus&gt; scaling_schedule_status = 465950178;</code>
   */
  int getScalingScheduleStatusCount();
  /**
   * <pre>
   * [Output Only] Status information of existing scaling schedules.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ScalingScheduleStatus&gt; scaling_schedule_status = 465950178;</code>
   */
  boolean containsScalingScheduleStatus(
      java.lang.String key);
  /**
   * Use {@link #getScalingScheduleStatusMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.ScalingScheduleStatus>
  getScalingScheduleStatus();
  /**
   * <pre>
   * [Output Only] Status information of existing scaling schedules.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ScalingScheduleStatus&gt; scaling_schedule_status = 465950178;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.ScalingScheduleStatus>
  getScalingScheduleStatusMap();
  /**
   * <pre>
   * [Output Only] Status information of existing scaling schedules.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ScalingScheduleStatus&gt; scaling_schedule_status = 465950178;</code>
   */
  /* nullable */
com.google.cloud.compute.v1.ScalingScheduleStatus getScalingScheduleStatusOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.compute.v1.ScalingScheduleStatus defaultValue);
  /**
   * <pre>
   * [Output Only] Status information of existing scaling schedules.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ScalingScheduleStatus&gt; scaling_schedule_status = 465950178;</code>
   */
  com.google.cloud.compute.v1.ScalingScheduleStatus getScalingScheduleStatusOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * [Output Only] The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn't read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * [Output Only] The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn't read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * [Output Only] The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn't read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalerStatusDetails status_details = 363353845;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AutoscalerStatusDetails> 
      getStatusDetailsList();
  /**
   * <pre>
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalerStatusDetails status_details = 363353845;</code>
   */
  com.google.cloud.compute.v1.AutoscalerStatusDetails getStatusDetails(int index);
  /**
   * <pre>
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalerStatusDetails status_details = 363353845;</code>
   */
  int getStatusDetailsCount();
  /**
   * <pre>
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalerStatusDetails status_details = 363353845;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AutoscalerStatusDetailsOrBuilder> 
      getStatusDetailsOrBuilderList();
  /**
   * <pre>
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalerStatusDetails status_details = 363353845;</code>
   */
  com.google.cloud.compute.v1.AutoscalerStatusDetailsOrBuilder getStatusDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal scope).
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   * @return Whether the zone field is set.
   */
  boolean hasZone();
  /**
   * <pre>
   * [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal scope).
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal scope).
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
