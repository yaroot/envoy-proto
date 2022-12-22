// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/listener_components.proto

package io.envoyproxy.envoy.config.listener.v3;

public interface ListenerFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.listener.v3.ListenerFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the filter configuration.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the filter configuration.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Filter specific configuration which depends on the filter being
   * instantiated. See the supported filters for further documentation.
   * [#extension-category: envoy.filters.listener,envoy.filters.udp_listener]
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <pre>
   * Filter specific configuration which depends on the filter being
   * instantiated. See the supported filters for further documentation.
   * [#extension-category: envoy.filters.listener,envoy.filters.udp_listener]
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <pre>
   * Filter specific configuration which depends on the filter being
   * instantiated. See the supported filters for further documentation.
   * [#extension-category: envoy.filters.listener,envoy.filters.udp_listener]
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();

  /**
   * <pre>
   * Configuration source specifier for an extension configuration discovery
   * service. In case of a failure and without the default configuration, the
   * listener closes the connections.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ExtensionConfigSource config_discovery = 5;</code>
   * @return Whether the configDiscovery field is set.
   */
  boolean hasConfigDiscovery();
  /**
   * <pre>
   * Configuration source specifier for an extension configuration discovery
   * service. In case of a failure and without the default configuration, the
   * listener closes the connections.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ExtensionConfigSource config_discovery = 5;</code>
   * @return The configDiscovery.
   */
  io.envoyproxy.envoy.config.core.v3.ExtensionConfigSource getConfigDiscovery();
  /**
   * <pre>
   * Configuration source specifier for an extension configuration discovery
   * service. In case of a failure and without the default configuration, the
   * listener closes the connections.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ExtensionConfigSource config_discovery = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.ExtensionConfigSourceOrBuilder getConfigDiscoveryOrBuilder();

  /**
   * <pre>
   * Optional match predicate used to disable the filter. The filter is enabled when this field is empty.
   * See :ref:`ListenerFilterChainMatchPredicate &lt;envoy_v3_api_msg_config.listener.v3.ListenerFilterChainMatchPredicate&gt;`
   * for further examples.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.ListenerFilterChainMatchPredicate filter_disabled = 4;</code>
   * @return Whether the filterDisabled field is set.
   */
  boolean hasFilterDisabled();
  /**
   * <pre>
   * Optional match predicate used to disable the filter. The filter is enabled when this field is empty.
   * See :ref:`ListenerFilterChainMatchPredicate &lt;envoy_v3_api_msg_config.listener.v3.ListenerFilterChainMatchPredicate&gt;`
   * for further examples.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.ListenerFilterChainMatchPredicate filter_disabled = 4;</code>
   * @return The filterDisabled.
   */
  io.envoyproxy.envoy.config.listener.v3.ListenerFilterChainMatchPredicate getFilterDisabled();
  /**
   * <pre>
   * Optional match predicate used to disable the filter. The filter is enabled when this field is empty.
   * See :ref:`ListenerFilterChainMatchPredicate &lt;envoy_v3_api_msg_config.listener.v3.ListenerFilterChainMatchPredicate&gt;`
   * for further examples.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.ListenerFilterChainMatchPredicate filter_disabled = 4;</code>
   */
  io.envoyproxy.envoy.config.listener.v3.ListenerFilterChainMatchPredicateOrBuilder getFilterDisabledOrBuilder();

  public io.envoyproxy.envoy.config.listener.v3.ListenerFilter.ConfigTypeCase getConfigTypeCase();
}