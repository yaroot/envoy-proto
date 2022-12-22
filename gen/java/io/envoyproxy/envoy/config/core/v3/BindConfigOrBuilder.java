// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/address.proto

package io.envoyproxy.envoy.config.core.v3;

public interface BindConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.BindConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The address to bind to when creating a socket.
   * </pre>
   *
   * <code>.envoy.config.core.v3.SocketAddress source_address = 1;</code>
   * @return Whether the sourceAddress field is set.
   */
  boolean hasSourceAddress();
  /**
   * <pre>
   * The address to bind to when creating a socket.
   * </pre>
   *
   * <code>.envoy.config.core.v3.SocketAddress source_address = 1;</code>
   * @return The sourceAddress.
   */
  io.envoyproxy.envoy.config.core.v3.SocketAddress getSourceAddress();
  /**
   * <pre>
   * The address to bind to when creating a socket.
   * </pre>
   *
   * <code>.envoy.config.core.v3.SocketAddress source_address = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.SocketAddressOrBuilder getSourceAddressOrBuilder();

  /**
   * <pre>
   * Whether to set the ``IP_FREEBIND`` option when creating the socket. When this
   * flag is set to true, allows the :ref:`source_address
   * &lt;envoy_v3_api_field_config.core.v3.BindConfig.source_address&gt;` to be an IP address
   * that is not configured on the system running Envoy. When this flag is set
   * to false, the option ``IP_FREEBIND`` is disabled on the socket. When this
   * flag is not set (default), the socket is not modified, i.e. the option is
   * neither enabled nor disabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue freebind = 2;</code>
   * @return Whether the freebind field is set.
   */
  boolean hasFreebind();
  /**
   * <pre>
   * Whether to set the ``IP_FREEBIND`` option when creating the socket. When this
   * flag is set to true, allows the :ref:`source_address
   * &lt;envoy_v3_api_field_config.core.v3.BindConfig.source_address&gt;` to be an IP address
   * that is not configured on the system running Envoy. When this flag is set
   * to false, the option ``IP_FREEBIND`` is disabled on the socket. When this
   * flag is not set (default), the socket is not modified, i.e. the option is
   * neither enabled nor disabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue freebind = 2;</code>
   * @return The freebind.
   */
  com.google.protobuf.BoolValue getFreebind();
  /**
   * <pre>
   * Whether to set the ``IP_FREEBIND`` option when creating the socket. When this
   * flag is set to true, allows the :ref:`source_address
   * &lt;envoy_v3_api_field_config.core.v3.BindConfig.source_address&gt;` to be an IP address
   * that is not configured on the system running Envoy. When this flag is set
   * to false, the option ``IP_FREEBIND`` is disabled on the socket. When this
   * flag is not set (default), the socket is not modified, i.e. the option is
   * neither enabled nor disabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue freebind = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getFreebindOrBuilder();

  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketOption socket_options = 3;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.SocketOption> 
      getSocketOptionsList();
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketOption socket_options = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.SocketOption getSocketOptions(int index);
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketOption socket_options = 3;</code>
   */
  int getSocketOptionsCount();
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketOption socket_options = 3;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.SocketOptionOrBuilder> 
      getSocketOptionsOrBuilderList();
  /**
   * <pre>
   * Additional socket options that may not be present in Envoy source code or
   * precompiled binaries.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketOption socket_options = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.SocketOptionOrBuilder getSocketOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * Extra source addresses appended to the address specified in the `source_address`
   * field. This enables to specify multiple source addresses. Currently, only one extra
   * address can be supported, and the extra address should have a different IP version
   * with the address in the `source_address` field. The address which has the same IP
   * version with the target host's address IP version will be used as bind address. If more
   * than one extra address specified, only the first address matched IP version will be
   * returned. If there is no same IP version address found, the address in the `source_address`
   * will be returned.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.ExtraSourceAddress extra_source_addresses = 5;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.ExtraSourceAddress> 
      getExtraSourceAddressesList();
  /**
   * <pre>
   * Extra source addresses appended to the address specified in the `source_address`
   * field. This enables to specify multiple source addresses. Currently, only one extra
   * address can be supported, and the extra address should have a different IP version
   * with the address in the `source_address` field. The address which has the same IP
   * version with the target host's address IP version will be used as bind address. If more
   * than one extra address specified, only the first address matched IP version will be
   * returned. If there is no same IP version address found, the address in the `source_address`
   * will be returned.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.ExtraSourceAddress extra_source_addresses = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.ExtraSourceAddress getExtraSourceAddresses(int index);
  /**
   * <pre>
   * Extra source addresses appended to the address specified in the `source_address`
   * field. This enables to specify multiple source addresses. Currently, only one extra
   * address can be supported, and the extra address should have a different IP version
   * with the address in the `source_address` field. The address which has the same IP
   * version with the target host's address IP version will be used as bind address. If more
   * than one extra address specified, only the first address matched IP version will be
   * returned. If there is no same IP version address found, the address in the `source_address`
   * will be returned.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.ExtraSourceAddress extra_source_addresses = 5;</code>
   */
  int getExtraSourceAddressesCount();
  /**
   * <pre>
   * Extra source addresses appended to the address specified in the `source_address`
   * field. This enables to specify multiple source addresses. Currently, only one extra
   * address can be supported, and the extra address should have a different IP version
   * with the address in the `source_address` field. The address which has the same IP
   * version with the target host's address IP version will be used as bind address. If more
   * than one extra address specified, only the first address matched IP version will be
   * returned. If there is no same IP version address found, the address in the `source_address`
   * will be returned.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.ExtraSourceAddress extra_source_addresses = 5;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.ExtraSourceAddressOrBuilder> 
      getExtraSourceAddressesOrBuilderList();
  /**
   * <pre>
   * Extra source addresses appended to the address specified in the `source_address`
   * field. This enables to specify multiple source addresses. Currently, only one extra
   * address can be supported, and the extra address should have a different IP version
   * with the address in the `source_address` field. The address which has the same IP
   * version with the target host's address IP version will be used as bind address. If more
   * than one extra address specified, only the first address matched IP version will be
   * returned. If there is no same IP version address found, the address in the `source_address`
   * will be returned.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.ExtraSourceAddress extra_source_addresses = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.ExtraSourceAddressOrBuilder getExtraSourceAddressesOrBuilder(
      int index);

  /**
   * <pre>
   * Deprecated by
   * :ref:`extra_source_addresses &lt;envoy_v3_api_field_config.core.v3.BindConfig.extra_source_addresses&gt;`
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketAddress additional_source_addresses = 4 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated java.util.List<io.envoyproxy.envoy.config.core.v3.SocketAddress> 
      getAdditionalSourceAddressesList();
  /**
   * <pre>
   * Deprecated by
   * :ref:`extra_source_addresses &lt;envoy_v3_api_field_config.core.v3.BindConfig.extra_source_addresses&gt;`
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketAddress additional_source_addresses = 4 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.config.core.v3.SocketAddress getAdditionalSourceAddresses(int index);
  /**
   * <pre>
   * Deprecated by
   * :ref:`extra_source_addresses &lt;envoy_v3_api_field_config.core.v3.BindConfig.extra_source_addresses&gt;`
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketAddress additional_source_addresses = 4 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated int getAdditionalSourceAddressesCount();
  /**
   * <pre>
   * Deprecated by
   * :ref:`extra_source_addresses &lt;envoy_v3_api_field_config.core.v3.BindConfig.extra_source_addresses&gt;`
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketAddress additional_source_addresses = 4 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated java.util.List<? extends io.envoyproxy.envoy.config.core.v3.SocketAddressOrBuilder> 
      getAdditionalSourceAddressesOrBuilderList();
  /**
   * <pre>
   * Deprecated by
   * :ref:`extra_source_addresses &lt;envoy_v3_api_field_config.core.v3.BindConfig.extra_source_addresses&gt;`
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.SocketAddress additional_source_addresses = 4 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.config.core.v3.SocketAddressOrBuilder getAdditionalSourceAddressesOrBuilder(
      int index);
}
