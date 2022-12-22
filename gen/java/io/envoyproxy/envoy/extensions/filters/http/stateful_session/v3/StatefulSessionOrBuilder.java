// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/stateful_session/v3/stateful_session.proto

package io.envoyproxy.envoy.extensions.filters.http.stateful_session.v3;

public interface StatefulSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.stateful_session.v3.StatefulSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specific implementation of session state. This session state will be used to store and
   * get address of the upstream host to which the session is assigned.
   * [#extension-category: envoy.http.stateful_session]
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig session_state = 1;</code>
   * @return Whether the sessionState field is set.
   */
  boolean hasSessionState();
  /**
   * <pre>
   * Specific implementation of session state. This session state will be used to store and
   * get address of the upstream host to which the session is assigned.
   * [#extension-category: envoy.http.stateful_session]
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig session_state = 1;</code>
   * @return The sessionState.
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getSessionState();
  /**
   * <pre>
   * Specific implementation of session state. This session state will be used to store and
   * get address of the upstream host to which the session is assigned.
   * [#extension-category: envoy.http.stateful_session]
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig session_state = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder getSessionStateOrBuilder();
}