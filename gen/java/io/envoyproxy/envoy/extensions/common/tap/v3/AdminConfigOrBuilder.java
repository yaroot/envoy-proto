// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/common/tap/v3/common.proto

package io.envoyproxy.envoy.extensions.common.tap.v3;

public interface AdminConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.common.tap.v3.AdminConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
   * matched to the configured filter opaque ID to determine which filter to configure.
   * </pre>
   *
   * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
   * @return The configId.
   */
  java.lang.String getConfigId();
  /**
   * <pre>
   * Opaque configuration ID. When requests are made to the admin handler, the passed opaque ID is
   * matched to the configured filter opaque ID to determine which filter to configure.
   * </pre>
   *
   * <code>string config_id = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for configId.
   */
  com.google.protobuf.ByteString
      getConfigIdBytes();
}