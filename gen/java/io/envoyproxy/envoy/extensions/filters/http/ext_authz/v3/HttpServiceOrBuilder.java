// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ext_authz/v3/ext_authz.proto

package io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3;

public interface HttpServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ext_authz.v3.HttpService)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sets the HTTP server URI which the authorization requests must be sent to.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HttpUri server_uri = 1;</code>
   * @return Whether the serverUri field is set.
   */
  boolean hasServerUri();
  /**
   * <pre>
   * Sets the HTTP server URI which the authorization requests must be sent to.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HttpUri server_uri = 1;</code>
   * @return The serverUri.
   */
  io.envoyproxy.envoy.config.core.v3.HttpUri getServerUri();
  /**
   * <pre>
   * Sets the HTTP server URI which the authorization requests must be sent to.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HttpUri server_uri = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HttpUriOrBuilder getServerUriOrBuilder();

  /**
   * <pre>
   * Sets a prefix to the value of authorization request header ``Path``.
   * </pre>
   *
   * <code>string path_prefix = 2;</code>
   * @return The pathPrefix.
   */
  java.lang.String getPathPrefix();
  /**
   * <pre>
   * Sets a prefix to the value of authorization request header ``Path``.
   * </pre>
   *
   * <code>string path_prefix = 2;</code>
   * @return The bytes for pathPrefix.
   */
  com.google.protobuf.ByteString
      getPathPrefixBytes();

  /**
   * <pre>
   * Settings used for controlling authorization request metadata.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.AuthorizationRequest authorization_request = 7;</code>
   * @return Whether the authorizationRequest field is set.
   */
  boolean hasAuthorizationRequest();
  /**
   * <pre>
   * Settings used for controlling authorization request metadata.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.AuthorizationRequest authorization_request = 7;</code>
   * @return The authorizationRequest.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.AuthorizationRequest getAuthorizationRequest();
  /**
   * <pre>
   * Settings used for controlling authorization request metadata.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.AuthorizationRequest authorization_request = 7;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.AuthorizationRequestOrBuilder getAuthorizationRequestOrBuilder();

  /**
   * <pre>
   * Settings used for controlling authorization response metadata.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.AuthorizationResponse authorization_response = 8;</code>
   * @return Whether the authorizationResponse field is set.
   */
  boolean hasAuthorizationResponse();
  /**
   * <pre>
   * Settings used for controlling authorization response metadata.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.AuthorizationResponse authorization_response = 8;</code>
   * @return The authorizationResponse.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.AuthorizationResponse getAuthorizationResponse();
  /**
   * <pre>
   * Settings used for controlling authorization response metadata.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.AuthorizationResponse authorization_response = 8;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.AuthorizationResponseOrBuilder getAuthorizationResponseOrBuilder();
}