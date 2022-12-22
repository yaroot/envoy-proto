// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v2/file.proto

package io.envoyproxy.envoy.config.accesslog.v2;

public interface FileAccessLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.accesslog.v2.FileAccessLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A path to a local file to which to write the access log entries.
   * </pre>
   *
   * <code>string path = 1 [(.validate.rules) = { ... }</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * A path to a local file to which to write the access log entries.
   * </pre>
   *
   * <code>string path = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Access log :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * Envoy supports :ref:`custom access log formats &lt;config_access_log_format&gt;` as well as a
   * :ref:`default format &lt;config_access_log_default_format&gt;`.
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return Whether the format field is set.
   */
  boolean hasFormat();
  /**
   * <pre>
   * Access log :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * Envoy supports :ref:`custom access log formats &lt;config_access_log_format&gt;` as well as a
   * :ref:`default format &lt;config_access_log_default_format&gt;`.
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * Access log :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * Envoy supports :ref:`custom access log formats &lt;config_access_log_format&gt;` as well as a
   * :ref:`default format &lt;config_access_log_default_format&gt;`.
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * Access log :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`. All values
   * are rendered as strings.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_format = 3;</code>
   * @return Whether the jsonFormat field is set.
   */
  boolean hasJsonFormat();
  /**
   * <pre>
   * Access log :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`. All values
   * are rendered as strings.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_format = 3;</code>
   * @return The jsonFormat.
   */
  com.google.protobuf.Struct getJsonFormat();
  /**
   * <pre>
   * Access log :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`. All values
   * are rendered as strings.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_format = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getJsonFormatOrBuilder();

  /**
   * <pre>
   * Access log :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`. Values are
   * rendered as strings, numbers, or boolean values as appropriate. Nested JSON objects may
   * be produced by some command operators (e.g.FILTER_STATE or DYNAMIC_METADATA). See the
   * documentation for a specific command operator for details.
   * </pre>
   *
   * <code>.google.protobuf.Struct typed_json_format = 4;</code>
   * @return Whether the typedJsonFormat field is set.
   */
  boolean hasTypedJsonFormat();
  /**
   * <pre>
   * Access log :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`. Values are
   * rendered as strings, numbers, or boolean values as appropriate. Nested JSON objects may
   * be produced by some command operators (e.g.FILTER_STATE or DYNAMIC_METADATA). See the
   * documentation for a specific command operator for details.
   * </pre>
   *
   * <code>.google.protobuf.Struct typed_json_format = 4;</code>
   * @return The typedJsonFormat.
   */
  com.google.protobuf.Struct getTypedJsonFormat();
  /**
   * <pre>
   * Access log :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`. Values are
   * rendered as strings, numbers, or boolean values as appropriate. Nested JSON objects may
   * be produced by some command operators (e.g.FILTER_STATE or DYNAMIC_METADATA). See the
   * documentation for a specific command operator for details.
   * </pre>
   *
   * <code>.google.protobuf.Struct typed_json_format = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getTypedJsonFormatOrBuilder();

  public io.envoyproxy.envoy.config.accesslog.v2.FileAccessLog.AccessLogFormatCase getAccessLogFormatCase();
}