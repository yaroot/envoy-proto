// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/route/route_components.proto

package io.envoyproxy.envoy.api.v2.route;

public interface DirectResponseActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.route.DirectResponseAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the HTTP response status to be returned.
   * </pre>
   *
   * <code>uint32 status = 1 [(.validate.rules) = { ... }</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * Specifies the content of the response body. If this setting is omitted,
   * no body is included in the generated response.
   * .. note::
   *   Headers can be specified using *response_headers_to_add* in the enclosing
   *   :ref:`envoy_api_msg_route.Route`, :ref:`envoy_api_msg_RouteConfiguration` or
   *   :ref:`envoy_api_msg_route.VirtualHost`.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource body = 2;</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <pre>
   * Specifies the content of the response body. If this setting is omitted,
   * no body is included in the generated response.
   * .. note::
   *   Headers can be specified using *response_headers_to_add* in the enclosing
   *   :ref:`envoy_api_msg_route.Route`, :ref:`envoy_api_msg_RouteConfiguration` or
   *   :ref:`envoy_api_msg_route.VirtualHost`.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource body = 2;</code>
   * @return The body.
   */
  io.envoyproxy.envoy.api.v2.core.DataSource getBody();
  /**
   * <pre>
   * Specifies the content of the response body. If this setting is omitted,
   * no body is included in the generated response.
   * .. note::
   *   Headers can be specified using *response_headers_to_add* in the enclosing
   *   :ref:`envoy_api_msg_route.Route`, :ref:`envoy_api_msg_RouteConfiguration` or
   *   :ref:`envoy_api_msg_route.VirtualHost`.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource body = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder getBodyOrBuilder();
}
