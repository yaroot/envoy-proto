// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/common.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public interface CertificateProviderPluginInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.transport_sockets.tls.v3.CertificateProviderPluginInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provider instance name. If not present, defaults to "default".
   * Instance names should generally be defined not in terms of the underlying provider
   * implementation (e.g., "file_watcher") but rather in terms of the function of the
   * certificates (e.g., "foo_deployment_identity").
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   * @return The instanceName.
   */
  java.lang.String getInstanceName();
  /**
   * <pre>
   * Provider instance name. If not present, defaults to "default".
   * Instance names should generally be defined not in terms of the underlying provider
   * implementation (e.g., "file_watcher") but rather in terms of the function of the
   * certificates (e.g., "foo_deployment_identity").
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   * @return The bytes for instanceName.
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <pre>
   * Opaque name used to specify certificate instances or types. For example, "ROOTCA" to specify
   * a root-certificate (validation context) or "example.com" to specify a certificate for a
   * particular domain. Not all provider instances will actually use this field, so the value
   * defaults to the empty string.
   * </pre>
   *
   * <code>string certificate_name = 2;</code>
   * @return The certificateName.
   */
  java.lang.String getCertificateName();
  /**
   * <pre>
   * Opaque name used to specify certificate instances or types. For example, "ROOTCA" to specify
   * a root-certificate (validation context) or "example.com" to specify a certificate for a
   * particular domain. Not all provider instances will actually use this field, so the value
   * defaults to the empty string.
   * </pre>
   *
   * <code>string certificate_name = 2;</code>
   * @return The bytes for certificateName.
   */
  com.google.protobuf.ByteString
      getCertificateNameBytes();
}