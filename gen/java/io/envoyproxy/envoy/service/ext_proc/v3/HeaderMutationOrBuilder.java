// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ext_proc/v3/external_processor.proto

package io.envoyproxy.envoy.service.ext_proc.v3;

public interface HeaderMutationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.ext_proc.v3.HeaderMutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Add or replace HTTP headers. Attempts to set the value of
   * any ``x-envoy`` header, and attempts to set the ``:method``,
   * ``:authority``, ``:scheme``, or ``host`` headers will be ignored.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption set_headers = 1;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.HeaderValueOption> 
      getSetHeadersList();
  /**
   * <pre>
   * Add or replace HTTP headers. Attempts to set the value of
   * any ``x-envoy`` header, and attempts to set the ``:method``,
   * ``:authority``, ``:scheme``, or ``host`` headers will be ignored.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption set_headers = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOption getSetHeaders(int index);
  /**
   * <pre>
   * Add or replace HTTP headers. Attempts to set the value of
   * any ``x-envoy`` header, and attempts to set the ``:method``,
   * ``:authority``, ``:scheme``, or ``host`` headers will be ignored.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption set_headers = 1;</code>
   */
  int getSetHeadersCount();
  /**
   * <pre>
   * Add or replace HTTP headers. Attempts to set the value of
   * any ``x-envoy`` header, and attempts to set the ``:method``,
   * ``:authority``, ``:scheme``, or ``host`` headers will be ignored.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption set_headers = 1;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.HeaderValueOptionOrBuilder> 
      getSetHeadersOrBuilderList();
  /**
   * <pre>
   * Add or replace HTTP headers. Attempts to set the value of
   * any ``x-envoy`` header, and attempts to set the ``:method``,
   * ``:authority``, ``:scheme``, or ``host`` headers will be ignored.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption set_headers = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOptionOrBuilder getSetHeadersOrBuilder(
      int index);

  /**
   * <pre>
   * Remove these HTTP headers. Attempts to remove system headers --
   * any header starting with ``:``, plus ``host`` -- will be ignored.
   * </pre>
   *
   * <code>repeated string remove_headers = 2;</code>
   * @return A list containing the removeHeaders.
   */
  java.util.List<java.lang.String>
      getRemoveHeadersList();
  /**
   * <pre>
   * Remove these HTTP headers. Attempts to remove system headers --
   * any header starting with ``:``, plus ``host`` -- will be ignored.
   * </pre>
   *
   * <code>repeated string remove_headers = 2;</code>
   * @return The count of removeHeaders.
   */
  int getRemoveHeadersCount();
  /**
   * <pre>
   * Remove these HTTP headers. Attempts to remove system headers --
   * any header starting with ``:``, plus ``host`` -- will be ignored.
   * </pre>
   *
   * <code>repeated string remove_headers = 2;</code>
   * @param index The index of the element to return.
   * @return The removeHeaders at the given index.
   */
  java.lang.String getRemoveHeaders(int index);
  /**
   * <pre>
   * Remove these HTTP headers. Attempts to remove system headers --
   * any header starting with ``:``, plus ``host`` -- will be ignored.
   * </pre>
   *
   * <code>repeated string remove_headers = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the removeHeaders at the given index.
   */
  com.google.protobuf.ByteString
      getRemoveHeadersBytes(int index);
}