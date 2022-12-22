// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/auth/secret.proto

package io.envoyproxy.envoy.api.v2.auth;

public interface GenericSecretOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.auth.GenericSecret)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Secret of generic type and is available to filters.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource secret = 1 [(.udpa.annotations.sensitive) = true];</code>
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   * <pre>
   * Secret of generic type and is available to filters.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource secret = 1 [(.udpa.annotations.sensitive) = true];</code>
   * @return The secret.
   */
  io.envoyproxy.envoy.api.v2.core.DataSource getSecret();
  /**
   * <pre>
   * Secret of generic type and is available to filters.
   * </pre>
   *
   * <code>.envoy.api.v2.core.DataSource secret = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  io.envoyproxy.envoy.api.v2.core.DataSourceOrBuilder getSecretOrBuilder();
}