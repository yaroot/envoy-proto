// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/overload/v3/overload.proto

package io.envoyproxy.envoy.config.overload.v3;

public interface ResourceMonitorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.overload.v3.ResourceMonitor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the resource monitor to instantiate. Must match a registered
   * resource monitor type.
   * See the :ref:`extensions listed in typed_config below &lt;extension_category_envoy.resource_monitors&gt;` for the default list of available resource monitor.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the resource monitor to instantiate. Must match a registered
   * resource monitor type.
   * See the :ref:`extensions listed in typed_config below &lt;extension_category_envoy.resource_monitors&gt;` for the default list of available resource monitor.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();

  public io.envoyproxy.envoy.config.overload.v3.ResourceMonitor.ConfigTypeCase getConfigTypeCase();
}