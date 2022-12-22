// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/accesslog/v2/accesslog.proto

package io.envoyproxy.envoy.config.filter.accesslog.v2;

public interface AccessLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.accesslog.v2.AccessLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the access log implementation to instantiate. The name must
   * match a statically registered access log. Current built-in loggers include:
   * #. "envoy.access_loggers.file"
   * #. "envoy.access_loggers.http_grpc"
   * #. "envoy.access_loggers.tcp_grpc"
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the access log implementation to instantiate. The name must
   * match a statically registered access log. Current built-in loggers include:
   * #. "envoy.access_loggers.file"
   * #. "envoy.access_loggers.http_grpc"
   * #. "envoy.access_loggers.tcp_grpc"
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Filter which is used to determine if the access log needs to be written.
   * </pre>
   *
   * <code>.envoy.config.filter.accesslog.v2.AccessLogFilter filter = 2;</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * Filter which is used to determine if the access log needs to be written.
   * </pre>
   *
   * <code>.envoy.config.filter.accesslog.v2.AccessLogFilter filter = 2;</code>
   * @return The filter.
   */
  io.envoyproxy.envoy.config.filter.accesslog.v2.AccessLogFilter getFilter();
  /**
   * <pre>
   * Filter which is used to determine if the access log needs to be written.
   * </pre>
   *
   * <code>.envoy.config.filter.accesslog.v2.AccessLogFilter filter = 2;</code>
   */
  io.envoyproxy.envoy.config.filter.accesslog.v2.AccessLogFilterOrBuilder getFilterOrBuilder();

  /**
   * <code>.google.protobuf.Struct config = 3 [deprecated = true];</code>
   * @deprecated envoy.config.filter.accesslog.v2.AccessLog.config is deprecated.
   *     See envoy/config/filter/accesslog/v2/accesslog.proto;l=46
   * @return Whether the config field is set.
   */
  @java.lang.Deprecated boolean hasConfig();
  /**
   * <code>.google.protobuf.Struct config = 3 [deprecated = true];</code>
   * @deprecated envoy.config.filter.accesslog.v2.AccessLog.config is deprecated.
   *     See envoy/config/filter/accesslog/v2/accesslog.proto;l=46
   * @return The config.
   */
  @java.lang.Deprecated com.google.protobuf.Struct getConfig();
  /**
   * <code>.google.protobuf.Struct config = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.StructOrBuilder getConfigOrBuilder();

  /**
   * <code>.google.protobuf.Any typed_config = 4;</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 4;</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 4;</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();

  public io.envoyproxy.envoy.config.filter.accesslog.v2.AccessLog.ConfigTypeCase getConfigTypeCase();
}