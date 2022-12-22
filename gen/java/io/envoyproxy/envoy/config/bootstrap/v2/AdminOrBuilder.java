// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/bootstrap/v2/bootstrap.proto

package io.envoyproxy.envoy.config.bootstrap.v2;

public interface AdminOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.bootstrap.v2.Admin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path to write the access log for the administration server. If no
   * access log is desired specify ‘/dev/null’. This is only required if
   * :ref:`address &lt;envoy_api_field_config.bootstrap.v2.Admin.address&gt;` is set.
   * </pre>
   *
   * <code>string access_log_path = 1;</code>
   * @return The accessLogPath.
   */
  java.lang.String getAccessLogPath();
  /**
   * <pre>
   * The path to write the access log for the administration server. If no
   * access log is desired specify ‘/dev/null’. This is only required if
   * :ref:`address &lt;envoy_api_field_config.bootstrap.v2.Admin.address&gt;` is set.
   * </pre>
   *
   * <code>string access_log_path = 1;</code>
   * @return The bytes for accessLogPath.
   */
  com.google.protobuf.ByteString
      getAccessLogPathBytes();

  /**
   * <pre>
   * The cpu profiler output path for the administration server. If no profile
   * path is specified, the default is ‘/var/log/envoy/envoy.prof’.
   * </pre>
   *
   * <code>string profile_path = 2;</code>
   * @return The profilePath.
   */
  java.lang.String getProfilePath();
  /**
   * <pre>
   * The cpu profiler output path for the administration server. If no profile
   * path is specified, the default is ‘/var/log/envoy/envoy.prof’.
   * </pre>
   *
   * <code>string profile_path = 2;</code>
   * @return The bytes for profilePath.
   */
  com.google.protobuf.ByteString
      getProfilePathBytes();

  /**
   * <pre>
   * The TCP address that the administration server will listen on.
   * If not specified, Envoy will not start an administration server.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * The TCP address that the administration server will listen on.
   * If not specified, Envoy will not start an administration server.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address address = 3;</code>
   * @return The address.
   */
  io.envoyproxy.envoy.api.v2.core.Address getAddress();
  /**
   * <pre>
   * The TCP address that the administration server will listen on.
   * If not specified, Envoy will not start an administration server.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address address = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.core.AddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.SocketOption socket_options = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.core.SocketOption> 
      getSocketOptionsList();
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.SocketOption socket_options = 4;</code>
   */
  io.envoyproxy.envoy.api.v2.core.SocketOption getSocketOptions(int index);
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.SocketOption socket_options = 4;</code>
   */
  int getSocketOptionsCount();
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.SocketOption socket_options = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.core.SocketOptionOrBuilder> 
      getSocketOptionsOrBuilderList();
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.SocketOption socket_options = 4;</code>
   */
  io.envoyproxy.envoy.api.v2.core.SocketOptionOrBuilder getSocketOptionsOrBuilder(
      int index);
}