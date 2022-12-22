// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.data.accesslog.v3;

public interface AccessLogCommonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.data.accesslog.v3.AccessLogCommon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [#not-implemented-hide:]
   * This field indicates the rate at which this log entry was sampled.
   * Valid range is (0.0, 1.0].
   * </pre>
   *
   * <code>double sample_rate = 1 [(.validate.rules) = { ... }</code>
   * @return The sampleRate.
   */
  double getSampleRate();

  /**
   * <pre>
   * This field is the remote/origin address on which the request from the user was received.
   * Note: This may not be the physical peer. E.g, if the remote address is inferred from for
   * example the x-forwarder-for header, proxy protocol, etc.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_remote_address = 2;</code>
   * @return Whether the downstreamRemoteAddress field is set.
   */
  boolean hasDownstreamRemoteAddress();
  /**
   * <pre>
   * This field is the remote/origin address on which the request from the user was received.
   * Note: This may not be the physical peer. E.g, if the remote address is inferred from for
   * example the x-forwarder-for header, proxy protocol, etc.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_remote_address = 2;</code>
   * @return The downstreamRemoteAddress.
   */
  io.envoyproxy.envoy.config.core.v3.Address getDownstreamRemoteAddress();
  /**
   * <pre>
   * This field is the remote/origin address on which the request from the user was received.
   * Note: This may not be the physical peer. E.g, if the remote address is inferred from for
   * example the x-forwarder-for header, proxy protocol, etc.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_remote_address = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getDownstreamRemoteAddressOrBuilder();

  /**
   * <pre>
   * This field is the local/destination address on which the request from the user was received.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_local_address = 3;</code>
   * @return Whether the downstreamLocalAddress field is set.
   */
  boolean hasDownstreamLocalAddress();
  /**
   * <pre>
   * This field is the local/destination address on which the request from the user was received.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_local_address = 3;</code>
   * @return The downstreamLocalAddress.
   */
  io.envoyproxy.envoy.config.core.v3.Address getDownstreamLocalAddress();
  /**
   * <pre>
   * This field is the local/destination address on which the request from the user was received.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_local_address = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getDownstreamLocalAddressOrBuilder();

  /**
   * <pre>
   * If the connection is secure,S this field will contain TLS properties.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties tls_properties = 4;</code>
   * @return Whether the tlsProperties field is set.
   */
  boolean hasTlsProperties();
  /**
   * <pre>
   * If the connection is secure,S this field will contain TLS properties.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties tls_properties = 4;</code>
   * @return The tlsProperties.
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSProperties getTlsProperties();
  /**
   * <pre>
   * If the connection is secure,S this field will contain TLS properties.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties tls_properties = 4;</code>
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSPropertiesOrBuilder getTlsPropertiesOrBuilder();

  /**
   * <pre>
   * The time that Envoy started servicing this request. This is effectively the time that the first
   * downstream byte is received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The time that Envoy started servicing this request. This is effectively the time that the first
   * downstream byte is received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * The time that Envoy started servicing this request. This is effectively the time that the first
   * downstream byte is received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the last
   * downstream byte received (i.e. time it takes to receive a request).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_rx_byte = 6;</code>
   * @return Whether the timeToLastRxByte field is set.
   */
  boolean hasTimeToLastRxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last
   * downstream byte received (i.e. time it takes to receive a request).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_rx_byte = 6;</code>
   * @return The timeToLastRxByte.
   */
  com.google.protobuf.Duration getTimeToLastRxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last
   * downstream byte received (i.e. time it takes to receive a request).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_rx_byte = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToLastRxByteOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the first upstream byte sent. There may
   * by considerable delta between ``time_to_last_rx_byte`` and this value due to filters.
   * Additionally, the same caveats apply as documented in ``time_to_last_downstream_tx_byte`` about
   * not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_upstream_tx_byte = 7;</code>
   * @return Whether the timeToFirstUpstreamTxByte field is set.
   */
  boolean hasTimeToFirstUpstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the first upstream byte sent. There may
   * by considerable delta between ``time_to_last_rx_byte`` and this value due to filters.
   * Additionally, the same caveats apply as documented in ``time_to_last_downstream_tx_byte`` about
   * not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_upstream_tx_byte = 7;</code>
   * @return The timeToFirstUpstreamTxByte.
   */
  com.google.protobuf.Duration getTimeToFirstUpstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the first upstream byte sent. There may
   * by considerable delta between ``time_to_last_rx_byte`` and this value due to filters.
   * Additionally, the same caveats apply as documented in ``time_to_last_downstream_tx_byte`` about
   * not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_upstream_tx_byte = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToFirstUpstreamTxByteOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the last upstream byte sent. There may
   * by considerable delta between ``time_to_last_rx_byte`` and this value due to filters.
   * Additionally, the same caveats apply as documented in ``time_to_last_downstream_tx_byte`` about
   * not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_upstream_tx_byte = 8;</code>
   * @return Whether the timeToLastUpstreamTxByte field is set.
   */
  boolean hasTimeToLastUpstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last upstream byte sent. There may
   * by considerable delta between ``time_to_last_rx_byte`` and this value due to filters.
   * Additionally, the same caveats apply as documented in ``time_to_last_downstream_tx_byte`` about
   * not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_upstream_tx_byte = 8;</code>
   * @return The timeToLastUpstreamTxByte.
   */
  com.google.protobuf.Duration getTimeToLastUpstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last upstream byte sent. There may
   * by considerable delta between ``time_to_last_rx_byte`` and this value due to filters.
   * Additionally, the same caveats apply as documented in ``time_to_last_downstream_tx_byte`` about
   * not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_upstream_tx_byte = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToLastUpstreamTxByteOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the first upstream
   * byte received (i.e. time it takes to start receiving a response).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_upstream_rx_byte = 9;</code>
   * @return Whether the timeToFirstUpstreamRxByte field is set.
   */
  boolean hasTimeToFirstUpstreamRxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the first upstream
   * byte received (i.e. time it takes to start receiving a response).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_upstream_rx_byte = 9;</code>
   * @return The timeToFirstUpstreamRxByte.
   */
  com.google.protobuf.Duration getTimeToFirstUpstreamRxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the first upstream
   * byte received (i.e. time it takes to start receiving a response).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_upstream_rx_byte = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToFirstUpstreamRxByteOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the last upstream
   * byte received (i.e. time it takes to receive a complete response).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_upstream_rx_byte = 10;</code>
   * @return Whether the timeToLastUpstreamRxByte field is set.
   */
  boolean hasTimeToLastUpstreamRxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last upstream
   * byte received (i.e. time it takes to receive a complete response).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_upstream_rx_byte = 10;</code>
   * @return The timeToLastUpstreamRxByte.
   */
  com.google.protobuf.Duration getTimeToLastUpstreamRxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last upstream
   * byte received (i.e. time it takes to receive a complete response).
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_upstream_rx_byte = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToLastUpstreamRxByteOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the first downstream byte sent.
   * There may be a considerable delta between the ``time_to_first_upstream_rx_byte`` and this field
   * due to filters. Additionally, the same caveats apply as documented in
   * ``time_to_last_downstream_tx_byte`` about not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_downstream_tx_byte = 11;</code>
   * @return Whether the timeToFirstDownstreamTxByte field is set.
   */
  boolean hasTimeToFirstDownstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the first downstream byte sent.
   * There may be a considerable delta between the ``time_to_first_upstream_rx_byte`` and this field
   * due to filters. Additionally, the same caveats apply as documented in
   * ``time_to_last_downstream_tx_byte`` about not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_downstream_tx_byte = 11;</code>
   * @return The timeToFirstDownstreamTxByte.
   */
  com.google.protobuf.Duration getTimeToFirstDownstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the first downstream byte sent.
   * There may be a considerable delta between the ``time_to_first_upstream_rx_byte`` and this field
   * due to filters. Additionally, the same caveats apply as documented in
   * ``time_to_last_downstream_tx_byte`` about not accounting for kernel socket buffer time, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_first_downstream_tx_byte = 11;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToFirstDownstreamTxByteOrBuilder();

  /**
   * <pre>
   * Interval between the first downstream byte received and the last downstream byte sent.
   * Depending on protocol, buffering, windowing, filters, etc. there may be a considerable delta
   * between ``time_to_last_upstream_rx_byte`` and this field. Note also that this is an approximate
   * time. In the current implementation it does not include kernel socket buffer time. In the
   * current implementation it also does not include send window buffering inside the HTTP/2 codec.
   * In the future it is likely that work will be done to make this duration more accurate.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_downstream_tx_byte = 12;</code>
   * @return Whether the timeToLastDownstreamTxByte field is set.
   */
  boolean hasTimeToLastDownstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last downstream byte sent.
   * Depending on protocol, buffering, windowing, filters, etc. there may be a considerable delta
   * between ``time_to_last_upstream_rx_byte`` and this field. Note also that this is an approximate
   * time. In the current implementation it does not include kernel socket buffer time. In the
   * current implementation it also does not include send window buffering inside the HTTP/2 codec.
   * In the future it is likely that work will be done to make this duration more accurate.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_downstream_tx_byte = 12;</code>
   * @return The timeToLastDownstreamTxByte.
   */
  com.google.protobuf.Duration getTimeToLastDownstreamTxByte();
  /**
   * <pre>
   * Interval between the first downstream byte received and the last downstream byte sent.
   * Depending on protocol, buffering, windowing, filters, etc. there may be a considerable delta
   * between ``time_to_last_upstream_rx_byte`` and this field. Note also that this is an approximate
   * time. In the current implementation it does not include kernel socket buffer time. In the
   * current implementation it also does not include send window buffering inside the HTTP/2 codec.
   * In the future it is likely that work will be done to make this duration more accurate.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_to_last_downstream_tx_byte = 12;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeToLastDownstreamTxByteOrBuilder();

  /**
   * <pre>
   * The upstream remote/destination address that handles this exchange. This does not include
   * retries.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address upstream_remote_address = 13;</code>
   * @return Whether the upstreamRemoteAddress field is set.
   */
  boolean hasUpstreamRemoteAddress();
  /**
   * <pre>
   * The upstream remote/destination address that handles this exchange. This does not include
   * retries.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address upstream_remote_address = 13;</code>
   * @return The upstreamRemoteAddress.
   */
  io.envoyproxy.envoy.config.core.v3.Address getUpstreamRemoteAddress();
  /**
   * <pre>
   * The upstream remote/destination address that handles this exchange. This does not include
   * retries.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address upstream_remote_address = 13;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getUpstreamRemoteAddressOrBuilder();

  /**
   * <pre>
   * The upstream local/origin address that handles this exchange. This does not include retries.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address upstream_local_address = 14;</code>
   * @return Whether the upstreamLocalAddress field is set.
   */
  boolean hasUpstreamLocalAddress();
  /**
   * <pre>
   * The upstream local/origin address that handles this exchange. This does not include retries.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address upstream_local_address = 14;</code>
   * @return The upstreamLocalAddress.
   */
  io.envoyproxy.envoy.config.core.v3.Address getUpstreamLocalAddress();
  /**
   * <pre>
   * The upstream local/origin address that handles this exchange. This does not include retries.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address upstream_local_address = 14;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getUpstreamLocalAddressOrBuilder();

  /**
   * <pre>
   * The upstream cluster that ``upstream_remote_address`` belongs to.
   * </pre>
   *
   * <code>string upstream_cluster = 15;</code>
   * @return The upstreamCluster.
   */
  java.lang.String getUpstreamCluster();
  /**
   * <pre>
   * The upstream cluster that ``upstream_remote_address`` belongs to.
   * </pre>
   *
   * <code>string upstream_cluster = 15;</code>
   * @return The bytes for upstreamCluster.
   */
  com.google.protobuf.ByteString
      getUpstreamClusterBytes();

  /**
   * <pre>
   * Flags indicating occurrences during request/response processing.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.ResponseFlags response_flags = 16;</code>
   * @return Whether the responseFlags field is set.
   */
  boolean hasResponseFlags();
  /**
   * <pre>
   * Flags indicating occurrences during request/response processing.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.ResponseFlags response_flags = 16;</code>
   * @return The responseFlags.
   */
  io.envoyproxy.envoy.data.accesslog.v3.ResponseFlags getResponseFlags();
  /**
   * <pre>
   * Flags indicating occurrences during request/response processing.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.ResponseFlags response_flags = 16;</code>
   */
  io.envoyproxy.envoy.data.accesslog.v3.ResponseFlagsOrBuilder getResponseFlagsOrBuilder();

  /**
   * <pre>
   * All metadata encountered during request processing, including endpoint
   * selection.
   * This can be used to associate IDs attached to the various configurations
   * used to process this request with the access log entry. For example, a
   * route created from a higher level forwarding rule with some ID can place
   * that ID in this field and cross reference later. It can also be used to
   * determine if a canary endpoint was used or not.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata = 17;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * All metadata encountered during request processing, including endpoint
   * selection.
   * This can be used to associate IDs attached to the various configurations
   * used to process this request with the access log entry. For example, a
   * route created from a higher level forwarding rule with some ID can place
   * that ID in this field and cross reference later. It can also be used to
   * determine if a canary endpoint was used or not.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata = 17;</code>
   * @return The metadata.
   */
  io.envoyproxy.envoy.config.core.v3.Metadata getMetadata();
  /**
   * <pre>
   * All metadata encountered during request processing, including endpoint
   * selection.
   * This can be used to associate IDs attached to the various configurations
   * used to process this request with the access log entry. For example, a
   * route created from a higher level forwarding rule with some ID can place
   * that ID in this field and cross reference later. It can also be used to
   * determine if a canary endpoint was used or not.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata = 17;</code>
   */
  io.envoyproxy.envoy.config.core.v3.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * If upstream connection failed due to transport socket (e.g. TLS handshake), provides the
   * failure reason from the transport socket. The format of this field depends on the configured
   * upstream transport socket. Common TLS failures are in
   * :ref:`TLS trouble shooting &lt;arch_overview_ssl_trouble_shooting&gt;`.
   * </pre>
   *
   * <code>string upstream_transport_failure_reason = 18;</code>
   * @return The upstreamTransportFailureReason.
   */
  java.lang.String getUpstreamTransportFailureReason();
  /**
   * <pre>
   * If upstream connection failed due to transport socket (e.g. TLS handshake), provides the
   * failure reason from the transport socket. The format of this field depends on the configured
   * upstream transport socket. Common TLS failures are in
   * :ref:`TLS trouble shooting &lt;arch_overview_ssl_trouble_shooting&gt;`.
   * </pre>
   *
   * <code>string upstream_transport_failure_reason = 18;</code>
   * @return The bytes for upstreamTransportFailureReason.
   */
  com.google.protobuf.ByteString
      getUpstreamTransportFailureReasonBytes();

  /**
   * <pre>
   * The name of the route
   * </pre>
   *
   * <code>string route_name = 19;</code>
   * @return The routeName.
   */
  java.lang.String getRouteName();
  /**
   * <pre>
   * The name of the route
   * </pre>
   *
   * <code>string route_name = 19;</code>
   * @return The bytes for routeName.
   */
  com.google.protobuf.ByteString
      getRouteNameBytes();

  /**
   * <pre>
   * This field is the downstream direct remote address on which the request from the user was
   * received. Note: This is always the physical peer, even if the remote address is inferred from
   * for example the x-forwarder-for header, proxy protocol, etc.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_direct_remote_address = 20;</code>
   * @return Whether the downstreamDirectRemoteAddress field is set.
   */
  boolean hasDownstreamDirectRemoteAddress();
  /**
   * <pre>
   * This field is the downstream direct remote address on which the request from the user was
   * received. Note: This is always the physical peer, even if the remote address is inferred from
   * for example the x-forwarder-for header, proxy protocol, etc.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_direct_remote_address = 20;</code>
   * @return The downstreamDirectRemoteAddress.
   */
  io.envoyproxy.envoy.config.core.v3.Address getDownstreamDirectRemoteAddress();
  /**
   * <pre>
   * This field is the downstream direct remote address on which the request from the user was
   * received. Note: This is always the physical peer, even if the remote address is inferred from
   * for example the x-forwarder-for header, proxy protocol, etc.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address downstream_direct_remote_address = 20;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getDownstreamDirectRemoteAddressOrBuilder();

  /**
   * <pre>
   * Map of filter state in stream info that have been configured to be logged. If the filter
   * state serialized to any message other than ``google.protobuf.Any`` it will be packed into
   * ``google.protobuf.Any``.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Any&gt; filter_state_objects = 21;</code>
   */
  int getFilterStateObjectsCount();
  /**
   * <pre>
   * Map of filter state in stream info that have been configured to be logged. If the filter
   * state serialized to any message other than ``google.protobuf.Any`` it will be packed into
   * ``google.protobuf.Any``.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Any&gt; filter_state_objects = 21;</code>
   */
  boolean containsFilterStateObjects(
      java.lang.String key);
  /**
   * Use {@link #getFilterStateObjectsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Any>
  getFilterStateObjects();
  /**
   * <pre>
   * Map of filter state in stream info that have been configured to be logged. If the filter
   * state serialized to any message other than ``google.protobuf.Any`` it will be packed into
   * ``google.protobuf.Any``.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Any&gt; filter_state_objects = 21;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Any>
  getFilterStateObjectsMap();
  /**
   * <pre>
   * Map of filter state in stream info that have been configured to be logged. If the filter
   * state serialized to any message other than ``google.protobuf.Any`` it will be packed into
   * ``google.protobuf.Any``.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Any&gt; filter_state_objects = 21;</code>
   */
  /* nullable */
com.google.protobuf.Any getFilterStateObjectsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Any defaultValue);
  /**
   * <pre>
   * Map of filter state in stream info that have been configured to be logged. If the filter
   * state serialized to any message other than ``google.protobuf.Any`` it will be packed into
   * ``google.protobuf.Any``.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Any&gt; filter_state_objects = 21;</code>
   */
  com.google.protobuf.Any getFilterStateObjectsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * A list of custom tags, which annotate logs with additional information.
   * To configure this value, users should configure
   * :ref:`custom_tags &lt;envoy_v3_api_field_extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.custom_tags&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_tags = 22;</code>
   */
  int getCustomTagsCount();
  /**
   * <pre>
   * A list of custom tags, which annotate logs with additional information.
   * To configure this value, users should configure
   * :ref:`custom_tags &lt;envoy_v3_api_field_extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.custom_tags&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_tags = 22;</code>
   */
  boolean containsCustomTags(
      java.lang.String key);
  /**
   * Use {@link #getCustomTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCustomTags();
  /**
   * <pre>
   * A list of custom tags, which annotate logs with additional information.
   * To configure this value, users should configure
   * :ref:`custom_tags &lt;envoy_v3_api_field_extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.custom_tags&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_tags = 22;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCustomTagsMap();
  /**
   * <pre>
   * A list of custom tags, which annotate logs with additional information.
   * To configure this value, users should configure
   * :ref:`custom_tags &lt;envoy_v3_api_field_extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.custom_tags&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_tags = 22;</code>
   */
  /* nullable */
java.lang.String getCustomTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A list of custom tags, which annotate logs with additional information.
   * To configure this value, users should configure
   * :ref:`custom_tags &lt;envoy_v3_api_field_extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfig.custom_tags&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_tags = 22;</code>
   */
  java.lang.String getCustomTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * For HTTP: Total duration in milliseconds of the request from the start time to the last byte out.
   * For TCP: Total duration in milliseconds of the downstream connection.
   * This is the total duration of the request (i.e., when the request's ActiveStream is destroyed)
   * and may be longer than ``time_to_last_downstream_tx_byte``.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 23;</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <pre>
   * For HTTP: Total duration in milliseconds of the request from the start time to the last byte out.
   * For TCP: Total duration in milliseconds of the downstream connection.
   * This is the total duration of the request (i.e., when the request's ActiveStream is destroyed)
   * and may be longer than ``time_to_last_downstream_tx_byte``.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 23;</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <pre>
   * For HTTP: Total duration in milliseconds of the request from the start time to the last byte out.
   * For TCP: Total duration in milliseconds of the downstream connection.
   * This is the total duration of the request (i.e., when the request's ActiveStream is destroyed)
   * and may be longer than ``time_to_last_downstream_tx_byte``.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 23;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   * <pre>
   * For HTTP: Number of times the request is attempted upstream. Note that the field is omitted when the request was never attempted upstream.
   * For TCP: Number of times the connection request is attempted upstream. Note that the field is omitted when the connect request was never attempted upstream.
   * </pre>
   *
   * <code>uint32 upstream_request_attempt_count = 24;</code>
   * @return The upstreamRequestAttemptCount.
   */
  int getUpstreamRequestAttemptCount();

  /**
   * <pre>
   * Connection termination details may provide additional information about why the connection was terminated by Envoy for L4 reasons.
   * </pre>
   *
   * <code>string connection_termination_details = 25;</code>
   * @return The connectionTerminationDetails.
   */
  java.lang.String getConnectionTerminationDetails();
  /**
   * <pre>
   * Connection termination details may provide additional information about why the connection was terminated by Envoy for L4 reasons.
   * </pre>
   *
   * <code>string connection_termination_details = 25;</code>
   * @return The bytes for connectionTerminationDetails.
   */
  com.google.protobuf.ByteString
      getConnectionTerminationDetailsBytes();

  /**
   * <pre>
   * Optional unique id of stream (TCP connection, long-live HTTP2 stream, HTTP request) for logging and tracing.
   * This could be any format string that could be used to identify one stream.
   * </pre>
   *
   * <code>string stream_id = 26;</code>
   * @return The streamId.
   */
  java.lang.String getStreamId();
  /**
   * <pre>
   * Optional unique id of stream (TCP connection, long-live HTTP2 stream, HTTP request) for logging and tracing.
   * This could be any format string that could be used to identify one stream.
   * </pre>
   *
   * <code>string stream_id = 26;</code>
   * @return The bytes for streamId.
   */
  com.google.protobuf.ByteString
      getStreamIdBytes();

  /**
   * <pre>
   * If this log entry is final log entry that flushed after the stream completed or
   * intermediate log entry that flushed periodically during the stream.
   * There may be multiple intermediate log entries and only one final log entry for each
   * long-live stream (TCP connection, long-live HTTP2 stream).
   * And if it is necessary, unique ID or identifier can be added to the log entry
   * :ref:`stream_id &lt;envoy_v3_api_field_data.accesslog.v3.AccessLogCommon.stream_id&gt;` to
   * correlate all these intermediate log entries and final log entry.
   * </pre>
   *
   * <code>bool intermediate_log_entry = 27;</code>
   * @return The intermediateLogEntry.
   */
  boolean getIntermediateLogEntry();
}