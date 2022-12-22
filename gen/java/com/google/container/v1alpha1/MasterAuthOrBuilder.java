// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface MasterAuthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.MasterAuth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The username to use for HTTP basic authentication to the master endpoint.
   * For clusters v1.6.0 and later, you can disable basic authentication by
   * providing an empty username.
   * </pre>
   *
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * The username to use for HTTP basic authentication to the master endpoint.
   * For clusters v1.6.0 and later, you can disable basic authentication by
   * providing an empty username.
   * </pre>
   *
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * The password to use for HTTP basic authentication to the master endpoint.
   * Because the master endpoint is open to the Internet, you should create a
   * strong password.  If a password is provided for cluster creation, username
   * must be non-empty.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * The password to use for HTTP basic authentication to the master endpoint.
   * Because the master endpoint is open to the Internet, you should create a
   * strong password.  If a password is provided for cluster creation, username
   * must be non-empty.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * Configuration for client certificate authentication on the cluster.  If no
   * configuration is specified, a client certificate is issued.
   * </pre>
   *
   * <code>.google.container.v1alpha1.ClientCertificateConfig client_certificate_config = 3;</code>
   * @return Whether the clientCertificateConfig field is set.
   */
  boolean hasClientCertificateConfig();
  /**
   * <pre>
   * Configuration for client certificate authentication on the cluster.  If no
   * configuration is specified, a client certificate is issued.
   * </pre>
   *
   * <code>.google.container.v1alpha1.ClientCertificateConfig client_certificate_config = 3;</code>
   * @return The clientCertificateConfig.
   */
  com.google.container.v1alpha1.ClientCertificateConfig getClientCertificateConfig();
  /**
   * <pre>
   * Configuration for client certificate authentication on the cluster.  If no
   * configuration is specified, a client certificate is issued.
   * </pre>
   *
   * <code>.google.container.v1alpha1.ClientCertificateConfig client_certificate_config = 3;</code>
   */
  com.google.container.v1alpha1.ClientCertificateConfigOrBuilder getClientCertificateConfigOrBuilder();

  /**
   * <pre>
   * [Output only] Base64-encoded public certificate that is the root of
   * trust for the cluster.
   * </pre>
   *
   * <code>string cluster_ca_certificate = 100;</code>
   * @return The clusterCaCertificate.
   */
  java.lang.String getClusterCaCertificate();
  /**
   * <pre>
   * [Output only] Base64-encoded public certificate that is the root of
   * trust for the cluster.
   * </pre>
   *
   * <code>string cluster_ca_certificate = 100;</code>
   * @return The bytes for clusterCaCertificate.
   */
  com.google.protobuf.ByteString
      getClusterCaCertificateBytes();

  /**
   * <pre>
   * [Output only] Base64-encoded public certificate used by clients to
   * authenticate to the cluster endpoint.
   * </pre>
   *
   * <code>string client_certificate = 101;</code>
   * @return The clientCertificate.
   */
  java.lang.String getClientCertificate();
  /**
   * <pre>
   * [Output only] Base64-encoded public certificate used by clients to
   * authenticate to the cluster endpoint.
   * </pre>
   *
   * <code>string client_certificate = 101;</code>
   * @return The bytes for clientCertificate.
   */
  com.google.protobuf.ByteString
      getClientCertificateBytes();

  /**
   * <pre>
   * [Output only] Base64-encoded private key used by clients to authenticate
   * to the cluster endpoint.
   * </pre>
   *
   * <code>string client_key = 102;</code>
   * @return The clientKey.
   */
  java.lang.String getClientKey();
  /**
   * <pre>
   * [Output only] Base64-encoded private key used by clients to authenticate
   * to the cluster endpoint.
   * </pre>
   *
   * <code>string client_key = 102;</code>
   * @return The bytes for clientKey.
   */
  com.google.protobuf.ByteString
      getClientKeyBytes();
}