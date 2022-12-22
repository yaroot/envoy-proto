// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/tap/v2alpha/common.proto

package io.envoyproxy.envoy.service.tap.v2alpha;

public interface FilePerTapSinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.tap.v2alpha.FilePerTapSink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
   * identifier distinguishing the recorded trace for stream instances (the Envoy
   * connection ID, HTTP stream ID, etc.).
   * </pre>
   *
   * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The pathPrefix.
   */
  java.lang.String getPathPrefix();
  /**
   * <pre>
   * Path prefix. The output file will be of the form &lt;path_prefix&gt;_&lt;id&gt;.pb, where &lt;id&gt; is an
   * identifier distinguishing the recorded trace for stream instances (the Envoy
   * connection ID, HTTP stream ID, etc.).
   * </pre>
   *
   * <code>string path_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for pathPrefix.
   */
  com.google.protobuf.ByteString
      getPathPrefixBytes();
}