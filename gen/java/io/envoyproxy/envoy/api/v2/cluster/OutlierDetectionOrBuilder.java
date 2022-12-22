// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/cluster/outlier_detection.proto

package io.envoyproxy.envoy.api.v2.cluster;

public interface OutlierDetectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.cluster.OutlierDetection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of consecutive server-side error responses (for HTTP traffic,
   * 5xx responses; for TCP traffic, connection failures; for Redis, failure to
   * respond PONG; etc.) before a consecutive 5xx ejection occurs. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_5xx = 1;</code>
   * @return Whether the consecutive5xx field is set.
   */
  boolean hasConsecutive5Xx();
  /**
   * <pre>
   * The number of consecutive server-side error responses (for HTTP traffic,
   * 5xx responses; for TCP traffic, connection failures; for Redis, failure to
   * respond PONG; etc.) before a consecutive 5xx ejection occurs. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_5xx = 1;</code>
   * @return The consecutive5xx.
   */
  com.google.protobuf.UInt32Value getConsecutive5Xx();
  /**
   * <pre>
   * The number of consecutive server-side error responses (for HTTP traffic,
   * 5xx responses; for TCP traffic, connection failures; for Redis, failure to
   * respond PONG; etc.) before a consecutive 5xx ejection occurs. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_5xx = 1;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConsecutive5XxOrBuilder();

  /**
   * <pre>
   * The time interval between ejection analysis sweeps. This can result in
   * both new ejections as well as hosts being returned to service. Defaults
   * to 10000ms or 10s.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   * <pre>
   * The time interval between ejection analysis sweeps. This can result in
   * both new ejections as well as hosts being returned to service. Defaults
   * to 10000ms or 10s.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2 [(.validate.rules) = { ... }</code>
   * @return The interval.
   */
  com.google.protobuf.Duration getInterval();
  /**
   * <pre>
   * The time interval between ejection analysis sweeps. This can result in
   * both new ejections as well as hosts being returned to service. Defaults
   * to 10000ms or 10s.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalOrBuilder();

  /**
   * <pre>
   * The base time that a host is ejected for. The real time is equal to the
   * base time multiplied by the number of times the host has been ejected.
   * Defaults to 30000ms or 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration base_ejection_time = 3 [(.validate.rules) = { ... }</code>
   * @return Whether the baseEjectionTime field is set.
   */
  boolean hasBaseEjectionTime();
  /**
   * <pre>
   * The base time that a host is ejected for. The real time is equal to the
   * base time multiplied by the number of times the host has been ejected.
   * Defaults to 30000ms or 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration base_ejection_time = 3 [(.validate.rules) = { ... }</code>
   * @return The baseEjectionTime.
   */
  com.google.protobuf.Duration getBaseEjectionTime();
  /**
   * <pre>
   * The base time that a host is ejected for. The real time is equal to the
   * base time multiplied by the number of times the host has been ejected.
   * Defaults to 30000ms or 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration base_ejection_time = 3 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getBaseEjectionTimeOrBuilder();

  /**
   * <pre>
   * The maximum % of an upstream cluster that can be ejected due to outlier
   * detection. Defaults to 10% but will eject at least one host regardless of the value.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_ejection_percent = 4 [(.validate.rules) = { ... }</code>
   * @return Whether the maxEjectionPercent field is set.
   */
  boolean hasMaxEjectionPercent();
  /**
   * <pre>
   * The maximum % of an upstream cluster that can be ejected due to outlier
   * detection. Defaults to 10% but will eject at least one host regardless of the value.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_ejection_percent = 4 [(.validate.rules) = { ... }</code>
   * @return The maxEjectionPercent.
   */
  com.google.protobuf.UInt32Value getMaxEjectionPercent();
  /**
   * <pre>
   * The maximum % of an upstream cluster that can be ejected due to outlier
   * detection. Defaults to 10% but will eject at least one host regardless of the value.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_ejection_percent = 4 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getMaxEjectionPercentOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive 5xx. This setting can be used to disable
   * ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_5xx = 5 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingConsecutive5xx field is set.
   */
  boolean hasEnforcingConsecutive5Xx();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive 5xx. This setting can be used to disable
   * ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_5xx = 5 [(.validate.rules) = { ... }</code>
   * @return The enforcingConsecutive5xx.
   */
  com.google.protobuf.UInt32Value getEnforcingConsecutive5Xx();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive 5xx. This setting can be used to disable
   * ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_5xx = 5 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingConsecutive5XxOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through success rate statistics. This setting can be used to
   * disable ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_success_rate = 6 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingSuccessRate field is set.
   */
  boolean hasEnforcingSuccessRate();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through success rate statistics. This setting can be used to
   * disable ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_success_rate = 6 [(.validate.rules) = { ... }</code>
   * @return The enforcingSuccessRate.
   */
  com.google.protobuf.UInt32Value getEnforcingSuccessRate();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through success rate statistics. This setting can be used to
   * disable ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_success_rate = 6 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingSuccessRateOrBuilder();

  /**
   * <pre>
   * The number of hosts in a cluster that must have enough request volume to
   * detect success rate outliers. If the number of hosts is less than this
   * setting, outlier detection via success rate statistics is not performed
   * for any host in the cluster. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_minimum_hosts = 7;</code>
   * @return Whether the successRateMinimumHosts field is set.
   */
  boolean hasSuccessRateMinimumHosts();
  /**
   * <pre>
   * The number of hosts in a cluster that must have enough request volume to
   * detect success rate outliers. If the number of hosts is less than this
   * setting, outlier detection via success rate statistics is not performed
   * for any host in the cluster. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_minimum_hosts = 7;</code>
   * @return The successRateMinimumHosts.
   */
  com.google.protobuf.UInt32Value getSuccessRateMinimumHosts();
  /**
   * <pre>
   * The number of hosts in a cluster that must have enough request volume to
   * detect success rate outliers. If the number of hosts is less than this
   * setting, outlier detection via success rate statistics is not performed
   * for any host in the cluster. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_minimum_hosts = 7;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getSuccessRateMinimumHostsOrBuilder();

  /**
   * <pre>
   * The minimum number of total requests that must be collected in one
   * interval (as defined by the interval duration above) to include this host
   * in success rate based outlier detection. If the volume is lower than this
   * setting, outlier detection via success rate statistics is not performed
   * for that host. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_request_volume = 8;</code>
   * @return Whether the successRateRequestVolume field is set.
   */
  boolean hasSuccessRateRequestVolume();
  /**
   * <pre>
   * The minimum number of total requests that must be collected in one
   * interval (as defined by the interval duration above) to include this host
   * in success rate based outlier detection. If the volume is lower than this
   * setting, outlier detection via success rate statistics is not performed
   * for that host. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_request_volume = 8;</code>
   * @return The successRateRequestVolume.
   */
  com.google.protobuf.UInt32Value getSuccessRateRequestVolume();
  /**
   * <pre>
   * The minimum number of total requests that must be collected in one
   * interval (as defined by the interval duration above) to include this host
   * in success rate based outlier detection. If the volume is lower than this
   * setting, outlier detection via success rate statistics is not performed
   * for that host. Defaults to 100.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_request_volume = 8;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getSuccessRateRequestVolumeOrBuilder();

  /**
   * <pre>
   * This factor is used to determine the ejection threshold for success rate
   * outlier ejection. The ejection threshold is the difference between the
   * mean success rate, and the product of this factor and the standard
   * deviation of the mean success rate: mean - (stdev *
   * success_rate_stdev_factor). This factor is divided by a thousand to get a
   * double. That is, if the desired factor is 1.9, the runtime value should
   * be 1900. Defaults to 1900.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_stdev_factor = 9;</code>
   * @return Whether the successRateStdevFactor field is set.
   */
  boolean hasSuccessRateStdevFactor();
  /**
   * <pre>
   * This factor is used to determine the ejection threshold for success rate
   * outlier ejection. The ejection threshold is the difference between the
   * mean success rate, and the product of this factor and the standard
   * deviation of the mean success rate: mean - (stdev *
   * success_rate_stdev_factor). This factor is divided by a thousand to get a
   * double. That is, if the desired factor is 1.9, the runtime value should
   * be 1900. Defaults to 1900.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_stdev_factor = 9;</code>
   * @return The successRateStdevFactor.
   */
  com.google.protobuf.UInt32Value getSuccessRateStdevFactor();
  /**
   * <pre>
   * This factor is used to determine the ejection threshold for success rate
   * outlier ejection. The ejection threshold is the difference between the
   * mean success rate, and the product of this factor and the standard
   * deviation of the mean success rate: mean - (stdev *
   * success_rate_stdev_factor). This factor is divided by a thousand to get a
   * double. That is, if the desired factor is 1.9, the runtime value should
   * be 1900. Defaults to 1900.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value success_rate_stdev_factor = 9;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getSuccessRateStdevFactorOrBuilder();

  /**
   * <pre>
   * The number of consecutive gateway failures (502, 503, 504 status codes)
   * before a consecutive gateway failure ejection occurs. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_gateway_failure = 10;</code>
   * @return Whether the consecutiveGatewayFailure field is set.
   */
  boolean hasConsecutiveGatewayFailure();
  /**
   * <pre>
   * The number of consecutive gateway failures (502, 503, 504 status codes)
   * before a consecutive gateway failure ejection occurs. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_gateway_failure = 10;</code>
   * @return The consecutiveGatewayFailure.
   */
  com.google.protobuf.UInt32Value getConsecutiveGatewayFailure();
  /**
   * <pre>
   * The number of consecutive gateway failures (502, 503, 504 status codes)
   * before a consecutive gateway failure ejection occurs. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_gateway_failure = 10;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConsecutiveGatewayFailureOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive gateway failures. This setting can be
   * used to disable ejection or to ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_gateway_failure = 11 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingConsecutiveGatewayFailure field is set.
   */
  boolean hasEnforcingConsecutiveGatewayFailure();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive gateway failures. This setting can be
   * used to disable ejection or to ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_gateway_failure = 11 [(.validate.rules) = { ... }</code>
   * @return The enforcingConsecutiveGatewayFailure.
   */
  com.google.protobuf.UInt32Value getEnforcingConsecutiveGatewayFailure();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive gateway failures. This setting can be
   * used to disable ejection or to ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_gateway_failure = 11 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingConsecutiveGatewayFailureOrBuilder();

  /**
   * <pre>
   * Determines whether to distinguish local origin failures from external errors. If set to true
   * the following configuration parameters are taken into account:
   * :ref:`consecutive_local_origin_failure&lt;envoy_api_field_cluster.OutlierDetection.consecutive_local_origin_failure&gt;`,
   * :ref:`enforcing_consecutive_local_origin_failure&lt;envoy_api_field_cluster.OutlierDetection.enforcing_consecutive_local_origin_failure&gt;`
   * and
   * :ref:`enforcing_local_origin_success_rate&lt;envoy_api_field_cluster.OutlierDetection.enforcing_local_origin_success_rate&gt;`.
   * Defaults to false.
   * </pre>
   *
   * <code>bool split_external_local_origin_errors = 12;</code>
   * @return The splitExternalLocalOriginErrors.
   */
  boolean getSplitExternalLocalOriginErrors();

  /**
   * <pre>
   * The number of consecutive locally originated failures before ejection
   * occurs. Defaults to 5. Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_local_origin_failure = 13;</code>
   * @return Whether the consecutiveLocalOriginFailure field is set.
   */
  boolean hasConsecutiveLocalOriginFailure();
  /**
   * <pre>
   * The number of consecutive locally originated failures before ejection
   * occurs. Defaults to 5. Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_local_origin_failure = 13;</code>
   * @return The consecutiveLocalOriginFailure.
   */
  com.google.protobuf.UInt32Value getConsecutiveLocalOriginFailure();
  /**
   * <pre>
   * The number of consecutive locally originated failures before ejection
   * occurs. Defaults to 5. Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_local_origin_failure = 13;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConsecutiveLocalOriginFailureOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive locally originated failures. This setting can be
   * used to disable ejection or to ramp it up slowly. Defaults to 100.
   * Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_local_origin_failure = 14 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingConsecutiveLocalOriginFailure field is set.
   */
  boolean hasEnforcingConsecutiveLocalOriginFailure();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive locally originated failures. This setting can be
   * used to disable ejection or to ramp it up slowly. Defaults to 100.
   * Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_local_origin_failure = 14 [(.validate.rules) = { ... }</code>
   * @return The enforcingConsecutiveLocalOriginFailure.
   */
  com.google.protobuf.UInt32Value getEnforcingConsecutiveLocalOriginFailure();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through consecutive locally originated failures. This setting can be
   * used to disable ejection or to ramp it up slowly. Defaults to 100.
   * Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_consecutive_local_origin_failure = 14 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingConsecutiveLocalOriginFailureOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through success rate statistics for locally originated errors.
   * This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
   * Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_local_origin_success_rate = 15 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingLocalOriginSuccessRate field is set.
   */
  boolean hasEnforcingLocalOriginSuccessRate();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through success rate statistics for locally originated errors.
   * This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
   * Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_local_origin_success_rate = 15 [(.validate.rules) = { ... }</code>
   * @return The enforcingLocalOriginSuccessRate.
   */
  com.google.protobuf.UInt32Value getEnforcingLocalOriginSuccessRate();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status
   * is detected through success rate statistics for locally originated errors.
   * This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
   * Parameter takes effect only when
   * :ref:`split_external_local_origin_errors&lt;envoy_api_field_cluster.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to true.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_local_origin_success_rate = 15 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingLocalOriginSuccessRateOrBuilder();

  /**
   * <pre>
   * The failure percentage to use when determining failure percentage-based outlier detection. If
   * the failure percentage of a given host is greater than or equal to this value, it will be
   * ejected. Defaults to 85.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_threshold = 16 [(.validate.rules) = { ... }</code>
   * @return Whether the failurePercentageThreshold field is set.
   */
  boolean hasFailurePercentageThreshold();
  /**
   * <pre>
   * The failure percentage to use when determining failure percentage-based outlier detection. If
   * the failure percentage of a given host is greater than or equal to this value, it will be
   * ejected. Defaults to 85.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_threshold = 16 [(.validate.rules) = { ... }</code>
   * @return The failurePercentageThreshold.
   */
  com.google.protobuf.UInt32Value getFailurePercentageThreshold();
  /**
   * <pre>
   * The failure percentage to use when determining failure percentage-based outlier detection. If
   * the failure percentage of a given host is greater than or equal to this value, it will be
   * ejected. Defaults to 85.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_threshold = 16 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getFailurePercentageThresholdOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status is detected through
   * failure percentage statistics. This setting can be used to disable ejection or to ramp it up
   * slowly. Defaults to 0.
   * [#next-major-version: setting this without setting failure_percentage_threshold should be
   * invalid in v4.]
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_failure_percentage = 17 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingFailurePercentage field is set.
   */
  boolean hasEnforcingFailurePercentage();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status is detected through
   * failure percentage statistics. This setting can be used to disable ejection or to ramp it up
   * slowly. Defaults to 0.
   * [#next-major-version: setting this without setting failure_percentage_threshold should be
   * invalid in v4.]
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_failure_percentage = 17 [(.validate.rules) = { ... }</code>
   * @return The enforcingFailurePercentage.
   */
  com.google.protobuf.UInt32Value getEnforcingFailurePercentage();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status is detected through
   * failure percentage statistics. This setting can be used to disable ejection or to ramp it up
   * slowly. Defaults to 0.
   * [#next-major-version: setting this without setting failure_percentage_threshold should be
   * invalid in v4.]
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_failure_percentage = 17 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingFailurePercentageOrBuilder();

  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status is detected through
   * local-origin failure percentage statistics. This setting can be used to disable ejection or to
   * ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_failure_percentage_local_origin = 18 [(.validate.rules) = { ... }</code>
   * @return Whether the enforcingFailurePercentageLocalOrigin field is set.
   */
  boolean hasEnforcingFailurePercentageLocalOrigin();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status is detected through
   * local-origin failure percentage statistics. This setting can be used to disable ejection or to
   * ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_failure_percentage_local_origin = 18 [(.validate.rules) = { ... }</code>
   * @return The enforcingFailurePercentageLocalOrigin.
   */
  com.google.protobuf.UInt32Value getEnforcingFailurePercentageLocalOrigin();
  /**
   * <pre>
   * The % chance that a host will be actually ejected when an outlier status is detected through
   * local-origin failure percentage statistics. This setting can be used to disable ejection or to
   * ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value enforcing_failure_percentage_local_origin = 18 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEnforcingFailurePercentageLocalOriginOrBuilder();

  /**
   * <pre>
   * The minimum number of hosts in a cluster in order to perform failure percentage-based ejection.
   * If the total number of hosts in the cluster is less than this value, failure percentage-based
   * ejection will not be performed. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_minimum_hosts = 19;</code>
   * @return Whether the failurePercentageMinimumHosts field is set.
   */
  boolean hasFailurePercentageMinimumHosts();
  /**
   * <pre>
   * The minimum number of hosts in a cluster in order to perform failure percentage-based ejection.
   * If the total number of hosts in the cluster is less than this value, failure percentage-based
   * ejection will not be performed. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_minimum_hosts = 19;</code>
   * @return The failurePercentageMinimumHosts.
   */
  com.google.protobuf.UInt32Value getFailurePercentageMinimumHosts();
  /**
   * <pre>
   * The minimum number of hosts in a cluster in order to perform failure percentage-based ejection.
   * If the total number of hosts in the cluster is less than this value, failure percentage-based
   * ejection will not be performed. Defaults to 5.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_minimum_hosts = 19;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getFailurePercentageMinimumHostsOrBuilder();

  /**
   * <pre>
   * The minimum number of total requests that must be collected in one interval (as defined by the
   * interval duration above) to perform failure percentage-based ejection for this host. If the
   * volume is lower than this setting, failure percentage-based ejection will not be performed for
   * this host. Defaults to 50.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_request_volume = 20;</code>
   * @return Whether the failurePercentageRequestVolume field is set.
   */
  boolean hasFailurePercentageRequestVolume();
  /**
   * <pre>
   * The minimum number of total requests that must be collected in one interval (as defined by the
   * interval duration above) to perform failure percentage-based ejection for this host. If the
   * volume is lower than this setting, failure percentage-based ejection will not be performed for
   * this host. Defaults to 50.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_request_volume = 20;</code>
   * @return The failurePercentageRequestVolume.
   */
  com.google.protobuf.UInt32Value getFailurePercentageRequestVolume();
  /**
   * <pre>
   * The minimum number of total requests that must be collected in one interval (as defined by the
   * interval duration above) to perform failure percentage-based ejection for this host. If the
   * volume is lower than this setting, failure percentage-based ejection will not be performed for
   * this host. Defaults to 50.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value failure_percentage_request_volume = 20;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getFailurePercentageRequestVolumeOrBuilder();
}
