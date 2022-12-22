// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/jwt_authn/v2alpha/config.proto

package io.envoyproxy.envoy.config.filter.http.jwt_authn.v2alpha;

public interface RemoteJwksOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.http.jwt_authn.v2alpha.RemoteJwks)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HTTP URI to fetch the JWKS. For example:
   * .. code-block:: yaml
   *    http_uri:
   *      uri: https://www.googleapis.com/oauth2/v1/certs
   *      cluster: jwt.www.googleapis.com|443
   * </pre>
   *
   * <code>.envoy.api.v2.core.HttpUri http_uri = 1;</code>
   * @return Whether the httpUri field is set.
   */
  boolean hasHttpUri();
  /**
   * <pre>
   * The HTTP URI to fetch the JWKS. For example:
   * .. code-block:: yaml
   *    http_uri:
   *      uri: https://www.googleapis.com/oauth2/v1/certs
   *      cluster: jwt.www.googleapis.com|443
   * </pre>
   *
   * <code>.envoy.api.v2.core.HttpUri http_uri = 1;</code>
   * @return The httpUri.
   */
  io.envoyproxy.envoy.api.v2.core.HttpUri getHttpUri();
  /**
   * <pre>
   * The HTTP URI to fetch the JWKS. For example:
   * .. code-block:: yaml
   *    http_uri:
   *      uri: https://www.googleapis.com/oauth2/v1/certs
   *      cluster: jwt.www.googleapis.com|443
   * </pre>
   *
   * <code>.envoy.api.v2.core.HttpUri http_uri = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.core.HttpUriOrBuilder getHttpUriOrBuilder();

  /**
   * <pre>
   * Duration after which the cached JWKS should be expired. If not specified, default cache
   * duration is 5 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cache_duration = 2;</code>
   * @return Whether the cacheDuration field is set.
   */
  boolean hasCacheDuration();
  /**
   * <pre>
   * Duration after which the cached JWKS should be expired. If not specified, default cache
   * duration is 5 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cache_duration = 2;</code>
   * @return The cacheDuration.
   */
  com.google.protobuf.Duration getCacheDuration();
  /**
   * <pre>
   * Duration after which the cached JWKS should be expired. If not specified, default cache
   * duration is 5 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cache_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getCacheDurationOrBuilder();
}