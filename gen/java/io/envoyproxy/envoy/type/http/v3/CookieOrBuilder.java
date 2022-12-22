// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/http/v3/cookie.proto

package io.envoyproxy.envoy.type.http.v3;

public interface CookieOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.type.http.v3.Cookie)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name that will be used to obtain cookie value from downstream HTTP request or generate
   * new cookie for downstream.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name that will be used to obtain cookie value from downstream HTTP request or generate
   * new cookie for downstream.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Duration of cookie. This will be used to set the expiry time of a new cookie when it is
   * generated. Set this to 0 to use a session cookie.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   * <pre>
   * Duration of cookie. This will be used to set the expiry time of a new cookie when it is
   * generated. Set this to 0 to use a session cookie.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2 [(.validate.rules) = { ... }</code>
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   * <pre>
   * Duration of cookie. This will be used to set the expiry time of a new cookie when it is
   * generated. Set this to 0 to use a session cookie.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();

  /**
   * <pre>
   * Path of cookie. This will be used to set the path of a new cookie when it is generated.
   * If no path is specified here, no path will be set for the cookie.
   * </pre>
   *
   * <code>string path = 3;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Path of cookie. This will be used to set the path of a new cookie when it is generated.
   * If no path is specified here, no path will be set for the cookie.
   * </pre>
   *
   * <code>string path = 3;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();
}