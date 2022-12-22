// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/thrift_proxy/v3/route.proto

package io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3;

public interface RouteMatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.thrift_proxy.v3.RouteMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If specified, the route must exactly match the request method name. As a special case, an
   * empty string matches any request method name.
   * </pre>
   *
   * <code>string method_name = 1;</code>
   * @return Whether the methodName field is set.
   */
  boolean hasMethodName();
  /**
   * <pre>
   * If specified, the route must exactly match the request method name. As a special case, an
   * empty string matches any request method name.
   * </pre>
   *
   * <code>string method_name = 1;</code>
   * @return The methodName.
   */
  java.lang.String getMethodName();
  /**
   * <pre>
   * If specified, the route must exactly match the request method name. As a special case, an
   * empty string matches any request method name.
   * </pre>
   *
   * <code>string method_name = 1;</code>
   * @return The bytes for methodName.
   */
  com.google.protobuf.ByteString
      getMethodNameBytes();

  /**
   * <pre>
   * If specified, the route must have the service name as the request method name prefix. As a
   * special case, an empty string matches any service name. Only relevant when service
   * multiplexing.
   * </pre>
   *
   * <code>string service_name = 2;</code>
   * @return Whether the serviceName field is set.
   */
  boolean hasServiceName();
  /**
   * <pre>
   * If specified, the route must have the service name as the request method name prefix. As a
   * special case, an empty string matches any service name. Only relevant when service
   * multiplexing.
   * </pre>
   *
   * <code>string service_name = 2;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * If specified, the route must have the service name as the request method name prefix. As a
   * special case, an empty string matches any service name. Only relevant when service
   * multiplexing.
   * </pre>
   *
   * <code>string service_name = 2;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * Inverts whatever matching is done in the :ref:`method_name
   * &lt;envoy_v3_api_field_extensions.filters.network.thrift_proxy.v3.RouteMatch.method_name&gt;` or
   * :ref:`service_name
   * &lt;envoy_v3_api_field_extensions.filters.network.thrift_proxy.v3.RouteMatch.service_name&gt;` fields.
   * Cannot be combined with wildcard matching as that would result in routes never being matched.
   * .. note::
   *   This does not invert matching done as part of the :ref:`headers field
   *   &lt;envoy_v3_api_field_extensions.filters.network.thrift_proxy.v3.RouteMatch.headers&gt;` field. To
   *   invert header matching, see :ref:`invert_match
   *   &lt;envoy_v3_api_field_config.route.v3.HeaderMatcher.invert_match&gt;`.
   * </pre>
   *
   * <code>bool invert = 3;</code>
   * @return The invert.
   */
  boolean getInvert();

  /**
   * <pre>
   * Specifies a set of headers that the route should match on. The router will check the request’s
   * headers against all the specified headers in the route config. A match will happen if all the
   * headers in the route are present in the request with the same values (or based on presence if
   * the value field is not in the config). Note that this only applies for Thrift transports and/or
   * protocols that support headers.
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.route.v3.HeaderMatcher> 
      getHeadersList();
  /**
   * <pre>
   * Specifies a set of headers that the route should match on. The router will check the request’s
   * headers against all the specified headers in the route config. A match will happen if all the
   * headers in the route are present in the request with the same values (or based on presence if
   * the value field is not in the config). Note that this only applies for Thrift transports and/or
   * protocols that support headers.
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  io.envoyproxy.envoy.config.route.v3.HeaderMatcher getHeaders(int index);
  /**
   * <pre>
   * Specifies a set of headers that the route should match on. The router will check the request’s
   * headers against all the specified headers in the route config. A match will happen if all the
   * headers in the route are present in the request with the same values (or based on presence if
   * the value field is not in the config). Note that this only applies for Thrift transports and/or
   * protocols that support headers.
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * Specifies a set of headers that the route should match on. The router will check the request’s
   * headers against all the specified headers in the route config. A match will happen if all the
   * headers in the route are present in the request with the same values (or based on presence if
   * the value field is not in the config). Note that this only applies for Thrift transports and/or
   * protocols that support headers.
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.route.v3.HeaderMatcherOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <pre>
   * Specifies a set of headers that the route should match on. The router will check the request’s
   * headers against all the specified headers in the route config. A match will happen if all the
   * headers in the route are present in the request with the same values (or based on presence if
   * the value field is not in the config). Note that this only applies for Thrift transports and/or
   * protocols that support headers.
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  io.envoyproxy.envoy.config.route.v3.HeaderMatcherOrBuilder getHeadersOrBuilder(
      int index);

  public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.RouteMatch.MatchSpecifierCase getMatchSpecifierCase();
}