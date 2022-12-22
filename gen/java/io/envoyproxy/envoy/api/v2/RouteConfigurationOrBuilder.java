// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/route.proto

package io.envoyproxy.envoy.api.v2;

public interface RouteConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.RouteConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the route configuration. For example, it might match
   * :ref:`route_config_name
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.Rds.route_config_name&gt;` in
   * :ref:`envoy_api_msg_config.filter.network.http_connection_manager.v2.Rds`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the route configuration. For example, it might match
   * :ref:`route_config_name
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.Rds.route_config_name&gt;` in
   * :ref:`envoy_api_msg_config.filter.network.http_connection_manager.v2.Rds`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * An array of virtual hosts that make up the route table.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.VirtualHost virtual_hosts = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.route.VirtualHost> 
      getVirtualHostsList();
  /**
   * <pre>
   * An array of virtual hosts that make up the route table.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.VirtualHost virtual_hosts = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.route.VirtualHost getVirtualHosts(int index);
  /**
   * <pre>
   * An array of virtual hosts that make up the route table.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.VirtualHost virtual_hosts = 2;</code>
   */
  int getVirtualHostsCount();
  /**
   * <pre>
   * An array of virtual hosts that make up the route table.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.VirtualHost virtual_hosts = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.route.VirtualHostOrBuilder> 
      getVirtualHostsOrBuilderList();
  /**
   * <pre>
   * An array of virtual hosts that make up the route table.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.VirtualHost virtual_hosts = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.route.VirtualHostOrBuilder getVirtualHostsOrBuilder(
      int index);

  /**
   * <pre>
   * An array of virtual hosts will be dynamically loaded via the VHDS API.
   * Both *virtual_hosts* and *vhds* fields will be used when present. *virtual_hosts* can be used
   * for a base routing table or for infrequently changing virtual hosts. *vhds* is used for
   * on-demand discovery of virtual hosts. The contents of these two fields will be merged to
   * generate a routing table for a given RouteConfiguration, with *vhds* derived configuration
   * taking precedence.
   * </pre>
   *
   * <code>.envoy.api.v2.Vhds vhds = 9;</code>
   * @return Whether the vhds field is set.
   */
  boolean hasVhds();
  /**
   * <pre>
   * An array of virtual hosts will be dynamically loaded via the VHDS API.
   * Both *virtual_hosts* and *vhds* fields will be used when present. *virtual_hosts* can be used
   * for a base routing table or for infrequently changing virtual hosts. *vhds* is used for
   * on-demand discovery of virtual hosts. The contents of these two fields will be merged to
   * generate a routing table for a given RouteConfiguration, with *vhds* derived configuration
   * taking precedence.
   * </pre>
   *
   * <code>.envoy.api.v2.Vhds vhds = 9;</code>
   * @return The vhds.
   */
  io.envoyproxy.envoy.api.v2.Vhds getVhds();
  /**
   * <pre>
   * An array of virtual hosts will be dynamically loaded via the VHDS API.
   * Both *virtual_hosts* and *vhds* fields will be used when present. *virtual_hosts* can be used
   * for a base routing table or for infrequently changing virtual hosts. *vhds* is used for
   * on-demand discovery of virtual hosts. The contents of these two fields will be merged to
   * generate a routing table for a given RouteConfiguration, with *vhds* derived configuration
   * taking precedence.
   * </pre>
   *
   * <code>.envoy.api.v2.Vhds vhds = 9;</code>
   */
  io.envoyproxy.envoy.api.v2.VhdsOrBuilder getVhdsOrBuilder();

  /**
   * <pre>
   * Optionally specifies a list of HTTP headers that the connection manager
   * will consider to be internal only. If they are found on external requests they will be cleaned
   * prior to filter invocation. See :ref:`config_http_conn_man_headers_x-envoy-internal` for more
   * information.
   * </pre>
   *
   * <code>repeated string internal_only_headers = 3 [(.validate.rules) = { ... }</code>
   * @return A list containing the internalOnlyHeaders.
   */
  java.util.List<java.lang.String>
      getInternalOnlyHeadersList();
  /**
   * <pre>
   * Optionally specifies a list of HTTP headers that the connection manager
   * will consider to be internal only. If they are found on external requests they will be cleaned
   * prior to filter invocation. See :ref:`config_http_conn_man_headers_x-envoy-internal` for more
   * information.
   * </pre>
   *
   * <code>repeated string internal_only_headers = 3 [(.validate.rules) = { ... }</code>
   * @return The count of internalOnlyHeaders.
   */
  int getInternalOnlyHeadersCount();
  /**
   * <pre>
   * Optionally specifies a list of HTTP headers that the connection manager
   * will consider to be internal only. If they are found on external requests they will be cleaned
   * prior to filter invocation. See :ref:`config_http_conn_man_headers_x-envoy-internal` for more
   * information.
   * </pre>
   *
   * <code>repeated string internal_only_headers = 3 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The internalOnlyHeaders at the given index.
   */
  java.lang.String getInternalOnlyHeaders(int index);
  /**
   * <pre>
   * Optionally specifies a list of HTTP headers that the connection manager
   * will consider to be internal only. If they are found on external requests they will be cleaned
   * prior to filter invocation. See :ref:`config_http_conn_man_headers_x-envoy-internal` for more
   * information.
   * </pre>
   *
   * <code>repeated string internal_only_headers = 3 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the internalOnlyHeaders at the given index.
   */
  com.google.protobuf.ByteString
      getInternalOnlyHeadersBytes(int index);

  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each response that
   * the connection manager encodes. Headers specified at this level are applied
   * after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption response_headers_to_add = 4 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValueOption> 
      getResponseHeadersToAddList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each response that
   * the connection manager encodes. Headers specified at this level are applied
   * after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption response_headers_to_add = 4 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValueOption getResponseHeadersToAdd(int index);
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each response that
   * the connection manager encodes. Headers specified at this level are applied
   * after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption response_headers_to_add = 4 [(.validate.rules) = { ... }</code>
   */
  int getResponseHeadersToAddCount();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each response that
   * the connection manager encodes. Headers specified at this level are applied
   * after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption response_headers_to_add = 4 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.core.HeaderValueOptionOrBuilder> 
      getResponseHeadersToAddOrBuilderList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each response that
   * the connection manager encodes. Headers specified at this level are applied
   * after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption response_headers_to_add = 4 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValueOptionOrBuilder getResponseHeadersToAddOrBuilder(
      int index);

  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each response
   * that the connection manager encodes.
   * </pre>
   *
   * <code>repeated string response_headers_to_remove = 5 [(.validate.rules) = { ... }</code>
   * @return A list containing the responseHeadersToRemove.
   */
  java.util.List<java.lang.String>
      getResponseHeadersToRemoveList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each response
   * that the connection manager encodes.
   * </pre>
   *
   * <code>repeated string response_headers_to_remove = 5 [(.validate.rules) = { ... }</code>
   * @return The count of responseHeadersToRemove.
   */
  int getResponseHeadersToRemoveCount();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each response
   * that the connection manager encodes.
   * </pre>
   *
   * <code>repeated string response_headers_to_remove = 5 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The responseHeadersToRemove at the given index.
   */
  java.lang.String getResponseHeadersToRemove(int index);
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each response
   * that the connection manager encodes.
   * </pre>
   *
   * <code>repeated string response_headers_to_remove = 5 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the responseHeadersToRemove at the given index.
   */
  com.google.protobuf.ByteString
      getResponseHeadersToRemoveBytes(int index);

  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request
   * routed by the HTTP connection manager. Headers specified at this level are
   * applied after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption request_headers_to_add = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValueOption> 
      getRequestHeadersToAddList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request
   * routed by the HTTP connection manager. Headers specified at this level are
   * applied after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption request_headers_to_add = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValueOption getRequestHeadersToAdd(int index);
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request
   * routed by the HTTP connection manager. Headers specified at this level are
   * applied after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption request_headers_to_add = 6 [(.validate.rules) = { ... }</code>
   */
  int getRequestHeadersToAddCount();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request
   * routed by the HTTP connection manager. Headers specified at this level are
   * applied after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption request_headers_to_add = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.core.HeaderValueOptionOrBuilder> 
      getRequestHeadersToAddOrBuilderList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request
   * routed by the HTTP connection manager. Headers specified at this level are
   * applied after headers from any enclosed :ref:`envoy_api_msg_route.VirtualHost` or
   * :ref:`envoy_api_msg_route.RouteAction`. For more information, including details on
   * header value syntax, see the documentation on :ref:`custom request headers
   * &lt;config_http_conn_man_headers_custom_request_headers&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValueOption request_headers_to_add = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValueOptionOrBuilder getRequestHeadersToAddOrBuilder(
      int index);

  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each request
   * routed by the HTTP connection manager.
   * </pre>
   *
   * <code>repeated string request_headers_to_remove = 8 [(.validate.rules) = { ... }</code>
   * @return A list containing the requestHeadersToRemove.
   */
  java.util.List<java.lang.String>
      getRequestHeadersToRemoveList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each request
   * routed by the HTTP connection manager.
   * </pre>
   *
   * <code>repeated string request_headers_to_remove = 8 [(.validate.rules) = { ... }</code>
   * @return The count of requestHeadersToRemove.
   */
  int getRequestHeadersToRemoveCount();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each request
   * routed by the HTTP connection manager.
   * </pre>
   *
   * <code>repeated string request_headers_to_remove = 8 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The requestHeadersToRemove at the given index.
   */
  java.lang.String getRequestHeadersToRemove(int index);
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be removed from each request
   * routed by the HTTP connection manager.
   * </pre>
   *
   * <code>repeated string request_headers_to_remove = 8 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the requestHeadersToRemove at the given index.
   */
  com.google.protobuf.ByteString
      getRequestHeadersToRemoveBytes(int index);

  /**
   * <pre>
   * By default, headers that should be added/removed are evaluated from most to least specific:
   * * route level
   * * virtual host level
   * * connection manager level
   * To allow setting overrides at the route or virtual host level, this order can be reversed
   * by setting this option to true. Defaults to false.
   * [#next-major-version: In the v3 API, this will default to true.]
   * </pre>
   *
   * <code>bool most_specific_header_mutations_wins = 10;</code>
   * @return The mostSpecificHeaderMutationsWins.
   */
  boolean getMostSpecificHeaderMutationsWins();

  /**
   * <pre>
   * An optional boolean that specifies whether the clusters that the route
   * table refers to will be validated by the cluster manager. If set to true
   * and a route refers to a non-existent cluster, the route table will not
   * load. If set to false and a route refers to a non-existent cluster, the
   * route table will load and the router filter will return a 404 if the route
   * is selected at runtime. This setting defaults to true if the route table
   * is statically defined via the :ref:`route_config
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.route_config&gt;`
   * option. This setting default to false if the route table is loaded dynamically via the
   * :ref:`rds
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.rds&gt;`
   * option. Users may wish to override the default behavior in certain cases (for example when
   * using CDS with a static route table).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue validate_clusters = 7;</code>
   * @return Whether the validateClusters field is set.
   */
  boolean hasValidateClusters();
  /**
   * <pre>
   * An optional boolean that specifies whether the clusters that the route
   * table refers to will be validated by the cluster manager. If set to true
   * and a route refers to a non-existent cluster, the route table will not
   * load. If set to false and a route refers to a non-existent cluster, the
   * route table will load and the router filter will return a 404 if the route
   * is selected at runtime. This setting defaults to true if the route table
   * is statically defined via the :ref:`route_config
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.route_config&gt;`
   * option. This setting default to false if the route table is loaded dynamically via the
   * :ref:`rds
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.rds&gt;`
   * option. Users may wish to override the default behavior in certain cases (for example when
   * using CDS with a static route table).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue validate_clusters = 7;</code>
   * @return The validateClusters.
   */
  com.google.protobuf.BoolValue getValidateClusters();
  /**
   * <pre>
   * An optional boolean that specifies whether the clusters that the route
   * table refers to will be validated by the cluster manager. If set to true
   * and a route refers to a non-existent cluster, the route table will not
   * load. If set to false and a route refers to a non-existent cluster, the
   * route table will load and the router filter will return a 404 if the route
   * is selected at runtime. This setting defaults to true if the route table
   * is statically defined via the :ref:`route_config
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.route_config&gt;`
   * option. This setting default to false if the route table is loaded dynamically via the
   * :ref:`rds
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.rds&gt;`
   * option. Users may wish to override the default behavior in certain cases (for example when
   * using CDS with a static route table).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue validate_clusters = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getValidateClustersOrBuilder();
}