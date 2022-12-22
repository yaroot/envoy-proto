// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/thrift_proxy/v2alpha1/thrift_proxy.proto

package io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1;

public interface ThriftProtocolOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.network.thrift_proxy.v2alpha1.ThriftProtocolOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Supplies the type of transport that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_config.filter.network.thrift_proxy.v2alpha1.TransportType.AUTO_TRANSPORT&gt;`,
   * which is the default, causes the proxy to use the same transport as the downstream connection.
   * </pre>
   *
   * <code>.envoy.config.filter.network.thrift_proxy.v2alpha1.TransportType transport = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for transport.
   */
  int getTransportValue();
  /**
   * <pre>
   * Supplies the type of transport that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_config.filter.network.thrift_proxy.v2alpha1.TransportType.AUTO_TRANSPORT&gt;`,
   * which is the default, causes the proxy to use the same transport as the downstream connection.
   * </pre>
   *
   * <code>.envoy.config.filter.network.thrift_proxy.v2alpha1.TransportType transport = 1 [(.validate.rules) = { ... }</code>
   * @return The transport.
   */
  io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.TransportType getTransport();

  /**
   * <pre>
   * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_config.filter.network.thrift_proxy.v2alpha1.ProtocolType.AUTO_PROTOCOL&gt;`,
   * which is the default, causes the proxy to use the same protocol as the downstream connection.
   * </pre>
   *
   * <code>.envoy.config.filter.network.thrift_proxy.v2alpha1.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for protocol.
   */
  int getProtocolValue();
  /**
   * <pre>
   * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_config.filter.network.thrift_proxy.v2alpha1.ProtocolType.AUTO_PROTOCOL&gt;`,
   * which is the default, causes the proxy to use the same protocol as the downstream connection.
   * </pre>
   *
   * <code>.envoy.config.filter.network.thrift_proxy.v2alpha1.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
   * @return The protocol.
   */
  io.envoyproxy.envoy.config.filter.network.thrift_proxy.v2alpha1.ProtocolType getProtocol();
}