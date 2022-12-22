// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/udp_listener_config.proto

package io.envoyproxy.envoy.config.listener.v3;

public interface UdpListenerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.listener.v3.UdpListenerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * UDP socket configuration for the listener. The default for
   * :ref:`prefer_gro &lt;envoy_v3_api_field_config.core.v3.UdpSocketConfig.prefer_gro&gt;` is false for
   * listener sockets. If receiving a large amount of datagrams from a small number of sources, it
   * may be worthwhile to enable this option after performance testing.
   * </pre>
   *
   * <code>.envoy.config.core.v3.UdpSocketConfig downstream_socket_config = 5;</code>
   * @return Whether the downstreamSocketConfig field is set.
   */
  boolean hasDownstreamSocketConfig();
  /**
   * <pre>
   * UDP socket configuration for the listener. The default for
   * :ref:`prefer_gro &lt;envoy_v3_api_field_config.core.v3.UdpSocketConfig.prefer_gro&gt;` is false for
   * listener sockets. If receiving a large amount of datagrams from a small number of sources, it
   * may be worthwhile to enable this option after performance testing.
   * </pre>
   *
   * <code>.envoy.config.core.v3.UdpSocketConfig downstream_socket_config = 5;</code>
   * @return The downstreamSocketConfig.
   */
  io.envoyproxy.envoy.config.core.v3.UdpSocketConfig getDownstreamSocketConfig();
  /**
   * <pre>
   * UDP socket configuration for the listener. The default for
   * :ref:`prefer_gro &lt;envoy_v3_api_field_config.core.v3.UdpSocketConfig.prefer_gro&gt;` is false for
   * listener sockets. If receiving a large amount of datagrams from a small number of sources, it
   * may be worthwhile to enable this option after performance testing.
   * </pre>
   *
   * <code>.envoy.config.core.v3.UdpSocketConfig downstream_socket_config = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.UdpSocketConfigOrBuilder getDownstreamSocketConfigOrBuilder();

  /**
   * <pre>
   * Configuration for QUIC protocol. If empty, QUIC will not be enabled on this listener. Set
   * to the default object to enable QUIC without modifying any additional options.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.QuicProtocolOptions quic_options = 7;</code>
   * @return Whether the quicOptions field is set.
   */
  boolean hasQuicOptions();
  /**
   * <pre>
   * Configuration for QUIC protocol. If empty, QUIC will not be enabled on this listener. Set
   * to the default object to enable QUIC without modifying any additional options.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.QuicProtocolOptions quic_options = 7;</code>
   * @return The quicOptions.
   */
  io.envoyproxy.envoy.config.listener.v3.QuicProtocolOptions getQuicOptions();
  /**
   * <pre>
   * Configuration for QUIC protocol. If empty, QUIC will not be enabled on this listener. Set
   * to the default object to enable QUIC without modifying any additional options.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.QuicProtocolOptions quic_options = 7;</code>
   */
  io.envoyproxy.envoy.config.listener.v3.QuicProtocolOptionsOrBuilder getQuicOptionsOrBuilder();

  /**
   * <pre>
   * Configuration for the UDP packet writer. If empty, HTTP/3 will use GSO if available
   * (:ref:`UdpDefaultWriterFactory &lt;envoy_v3_api_msg_extensions.udp_packet_writer.v3.UdpGsoBatchWriterFactory&gt;`)
   * or the default kernel sendmsg if not,
   * (:ref:`UdpDefaultWriterFactory &lt;envoy_v3_api_msg_extensions.udp_packet_writer.v3.UdpDefaultWriterFactory&gt;`)
   * and raw UDP will use kernel sendmsg.
   * [#extension-category: envoy.udp_packet_writer]
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig udp_packet_packet_writer_config = 8;</code>
   * @return Whether the udpPacketPacketWriterConfig field is set.
   */
  boolean hasUdpPacketPacketWriterConfig();
  /**
   * <pre>
   * Configuration for the UDP packet writer. If empty, HTTP/3 will use GSO if available
   * (:ref:`UdpDefaultWriterFactory &lt;envoy_v3_api_msg_extensions.udp_packet_writer.v3.UdpGsoBatchWriterFactory&gt;`)
   * or the default kernel sendmsg if not,
   * (:ref:`UdpDefaultWriterFactory &lt;envoy_v3_api_msg_extensions.udp_packet_writer.v3.UdpDefaultWriterFactory&gt;`)
   * and raw UDP will use kernel sendmsg.
   * [#extension-category: envoy.udp_packet_writer]
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig udp_packet_packet_writer_config = 8;</code>
   * @return The udpPacketPacketWriterConfig.
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getUdpPacketPacketWriterConfig();
  /**
   * <pre>
   * Configuration for the UDP packet writer. If empty, HTTP/3 will use GSO if available
   * (:ref:`UdpDefaultWriterFactory &lt;envoy_v3_api_msg_extensions.udp_packet_writer.v3.UdpGsoBatchWriterFactory&gt;`)
   * or the default kernel sendmsg if not,
   * (:ref:`UdpDefaultWriterFactory &lt;envoy_v3_api_msg_extensions.udp_packet_writer.v3.UdpDefaultWriterFactory&gt;`)
   * and raw UDP will use kernel sendmsg.
   * [#extension-category: envoy.udp_packet_writer]
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig udp_packet_packet_writer_config = 8;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder getUdpPacketPacketWriterConfigOrBuilder();
}