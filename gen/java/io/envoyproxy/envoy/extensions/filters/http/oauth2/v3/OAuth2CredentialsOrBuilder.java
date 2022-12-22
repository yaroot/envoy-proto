// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/oauth2/v3/oauth.proto

package io.envoyproxy.envoy.extensions.filters.http.oauth2.v3;

public interface OAuth2CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The client_id to be used in the authorize calls. This value will be URL encoded when sent to the OAuth server.
   * </pre>
   *
   * <code>string client_id = 1 [(.validate.rules) = { ... }</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * The client_id to be used in the authorize calls. This value will be URL encoded when sent to the OAuth server.
   * </pre>
   *
   * <code>string client_id = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * The secret used to retrieve the access token. This value will be URL encoded when sent to the OAuth server.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig token_secret = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the tokenSecret field is set.
   */
  boolean hasTokenSecret();
  /**
   * <pre>
   * The secret used to retrieve the access token. This value will be URL encoded when sent to the OAuth server.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig token_secret = 2 [(.validate.rules) = { ... }</code>
   * @return The tokenSecret.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getTokenSecret();
  /**
   * <pre>
   * The secret used to retrieve the access token. This value will be URL encoded when sent to the OAuth server.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig token_secret = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder getTokenSecretOrBuilder();

  /**
   * <pre>
   * If present, the secret token will be a HMAC using the provided secret.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig hmac_secret = 3 [(.validate.rules) = { ... }</code>
   * @return Whether the hmacSecret field is set.
   */
  boolean hasHmacSecret();
  /**
   * <pre>
   * If present, the secret token will be a HMAC using the provided secret.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig hmac_secret = 3 [(.validate.rules) = { ... }</code>
   * @return The hmacSecret.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getHmacSecret();
  /**
   * <pre>
   * If present, the secret token will be a HMAC using the provided secret.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig hmac_secret = 3 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder getHmacSecretOrBuilder();

  /**
   * <pre>
   * The cookie names used in OAuth filters flow.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials.CookieNames cookie_names = 4;</code>
   * @return Whether the cookieNames field is set.
   */
  boolean hasCookieNames();
  /**
   * <pre>
   * The cookie names used in OAuth filters flow.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials.CookieNames cookie_names = 4;</code>
   * @return The cookieNames.
   */
  io.envoyproxy.envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials.CookieNames getCookieNames();
  /**
   * <pre>
   * The cookie names used in OAuth filters flow.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials.CookieNames cookie_names = 4;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials.CookieNamesOrBuilder getCookieNamesOrBuilder();

  public io.envoyproxy.envoy.extensions.filters.http.oauth2.v3.OAuth2Credentials.TokenFormationCase getTokenFormationCase();
}