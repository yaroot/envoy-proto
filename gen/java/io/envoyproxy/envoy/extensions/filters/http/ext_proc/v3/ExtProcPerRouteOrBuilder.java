// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ext_proc/v3/ext_proc.proto

package io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3;

public interface ExtProcPerRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ext_proc.v3.ExtProcPerRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Disable the filter for this particular vhost or route.
   * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
   * </pre>
   *
   * <code>bool disabled = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   * <pre>
   * Disable the filter for this particular vhost or route.
   * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
   * </pre>
   *
   * <code>bool disabled = 1 [(.validate.rules) = { ... }</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * Override aspects of the configuration for this route. A set of
   * overrides in a more specific configuration will override a "disabled"
   * flag set in a less-specific one.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ExtProcOverrides overrides = 2;</code>
   * @return Whether the overrides field is set.
   */
  boolean hasOverrides();
  /**
   * <pre>
   * Override aspects of the configuration for this route. A set of
   * overrides in a more specific configuration will override a "disabled"
   * flag set in a less-specific one.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ExtProcOverrides overrides = 2;</code>
   * @return The overrides.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ExtProcOverrides getOverrides();
  /**
   * <pre>
   * Override aspects of the configuration for this route. A set of
   * overrides in a more specific configuration will override a "disabled"
   * flag set in a less-specific one.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ExtProcOverrides overrides = 2;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ExtProcOverridesOrBuilder getOverridesOrBuilder();

  public io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ExtProcPerRoute.OverrideCase getOverrideCase();
}