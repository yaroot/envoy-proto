// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/file_system_buffer/v3/file_system_buffer.proto

package io.envoyproxy.envoy.extensions.filters.http.file_system_buffer.v3;

public interface FileSystemBufferFilterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.file_system_buffer.v3.FileSystemBufferFilterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A configuration for an AsyncFileManager.
   * If unset in route, vhost and listener, and the behavior is not ``bypass``
   * in both directions, an Internal Server Error response will be sent.
   * </pre>
   *
   * <code>.envoy.extensions.common.async_files.v3.AsyncFileManagerConfig manager_config = 1;</code>
   * @return Whether the managerConfig field is set.
   */
  boolean hasManagerConfig();
  /**
   * <pre>
   * A configuration for an AsyncFileManager.
   * If unset in route, vhost and listener, and the behavior is not ``bypass``
   * in both directions, an Internal Server Error response will be sent.
   * </pre>
   *
   * <code>.envoy.extensions.common.async_files.v3.AsyncFileManagerConfig manager_config = 1;</code>
   * @return The managerConfig.
   */
  io.envoyproxy.envoy.extensions.common.async_files.v3.AsyncFileManagerConfig getManagerConfig();
  /**
   * <pre>
   * A configuration for an AsyncFileManager.
   * If unset in route, vhost and listener, and the behavior is not ``bypass``
   * in both directions, an Internal Server Error response will be sent.
   * </pre>
   *
   * <code>.envoy.extensions.common.async_files.v3.AsyncFileManagerConfig manager_config = 1;</code>
   */
  io.envoyproxy.envoy.extensions.common.async_files.v3.AsyncFileManagerConfigOrBuilder getManagerConfigOrBuilder();

  /**
   * <pre>
   * An optional path to which the unlinked files should be written - this may
   * determine which physical storage device will be used.
   * If unset in route, vhost and listener, will use the environment variable
   * ``TMPDIR``, or, if that's also unset, will use ``/tmp``.
   * </pre>
   *
   * <code>.google.protobuf.StringValue storage_buffer_path = 2;</code>
   * @return Whether the storageBufferPath field is set.
   */
  boolean hasStorageBufferPath();
  /**
   * <pre>
   * An optional path to which the unlinked files should be written - this may
   * determine which physical storage device will be used.
   * If unset in route, vhost and listener, will use the environment variable
   * ``TMPDIR``, or, if that's also unset, will use ``/tmp``.
   * </pre>
   *
   * <code>.google.protobuf.StringValue storage_buffer_path = 2;</code>
   * @return The storageBufferPath.
   */
  com.google.protobuf.StringValue getStorageBufferPath();
  /**
   * <pre>
   * An optional path to which the unlinked files should be written - this may
   * determine which physical storage device will be used.
   * If unset in route, vhost and listener, will use the environment variable
   * ``TMPDIR``, or, if that's also unset, will use ``/tmp``.
   * </pre>
   *
   * <code>.google.protobuf.StringValue storage_buffer_path = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStorageBufferPathOrBuilder();

  /**
   * <pre>
   * Optional configuration for how to buffer (or not) requests.
   * If unset in route, vhost and listener, ``StreamConfig`` default values will be used
   * (with behavior ``stream_when_possible``)
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig request = 3;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Optional configuration for how to buffer (or not) requests.
   * If unset in route, vhost and listener, ``StreamConfig`` default values will be used
   * (with behavior ``stream_when_possible``)
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig request = 3;</code>
   * @return The request.
   */
  io.envoyproxy.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig getRequest();
  /**
   * <pre>
   * Optional configuration for how to buffer (or not) requests.
   * If unset in route, vhost and listener, ``StreamConfig`` default values will be used
   * (with behavior ``stream_when_possible``)
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig request = 3;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfigOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * Optional configuration for how to buffer (or not) responses.
   * If unset in route, vhost and listener, ``StreamConfig`` default values will be used
   * (with behavior ``stream_when_possible``)
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig response = 4;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <pre>
   * Optional configuration for how to buffer (or not) responses.
   * If unset in route, vhost and listener, ``StreamConfig`` default values will be used
   * (with behavior ``stream_when_possible``)
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig response = 4;</code>
   * @return The response.
   */
  io.envoyproxy.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig getResponse();
  /**
   * <pre>
   * Optional configuration for how to buffer (or not) responses.
   * If unset in route, vhost and listener, ``StreamConfig`` default values will be used
   * (with behavior ``stream_when_possible``)
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfig response = 4;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.file_system_buffer.v3.StreamConfigOrBuilder getResponseOrBuilder();
}