// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.data.accesslog.v3;

public interface TLSPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.data.accesslog.v3.TLSProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of TLS that was negotiated.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.TLSVersion tls_version = 1;</code>
   * @return The enum numeric value on the wire for tlsVersion.
   */
  int getTlsVersionValue();
  /**
   * <pre>
   * Version of TLS that was negotiated.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.TLSVersion tls_version = 1;</code>
   * @return The tlsVersion.
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSProperties.TLSVersion getTlsVersion();

  /**
   * <pre>
   * TLS cipher suite negotiated during handshake. The value is a
   * four-digit hex code defined by the IANA TLS Cipher Suite Registry
   * (e.g. ``009C`` for ``TLS_RSA_WITH_AES_128_GCM_SHA256``).
   * Here it is expressed as an integer.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tls_cipher_suite = 2;</code>
   * @return Whether the tlsCipherSuite field is set.
   */
  boolean hasTlsCipherSuite();
  /**
   * <pre>
   * TLS cipher suite negotiated during handshake. The value is a
   * four-digit hex code defined by the IANA TLS Cipher Suite Registry
   * (e.g. ``009C`` for ``TLS_RSA_WITH_AES_128_GCM_SHA256``).
   * Here it is expressed as an integer.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tls_cipher_suite = 2;</code>
   * @return The tlsCipherSuite.
   */
  com.google.protobuf.UInt32Value getTlsCipherSuite();
  /**
   * <pre>
   * TLS cipher suite negotiated during handshake. The value is a
   * four-digit hex code defined by the IANA TLS Cipher Suite Registry
   * (e.g. ``009C`` for ``TLS_RSA_WITH_AES_128_GCM_SHA256``).
   * Here it is expressed as an integer.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tls_cipher_suite = 2;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getTlsCipherSuiteOrBuilder();

  /**
   * <pre>
   * SNI hostname from handshake.
   * </pre>
   *
   * <code>string tls_sni_hostname = 3;</code>
   * @return The tlsSniHostname.
   */
  java.lang.String getTlsSniHostname();
  /**
   * <pre>
   * SNI hostname from handshake.
   * </pre>
   *
   * <code>string tls_sni_hostname = 3;</code>
   * @return The bytes for tlsSniHostname.
   */
  com.google.protobuf.ByteString
      getTlsSniHostnameBytes();

  /**
   * <pre>
   * Properties of the local certificate used to negotiate TLS.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.CertificateProperties local_certificate_properties = 4;</code>
   * @return Whether the localCertificateProperties field is set.
   */
  boolean hasLocalCertificateProperties();
  /**
   * <pre>
   * Properties of the local certificate used to negotiate TLS.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.CertificateProperties local_certificate_properties = 4;</code>
   * @return The localCertificateProperties.
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSProperties.CertificateProperties getLocalCertificateProperties();
  /**
   * <pre>
   * Properties of the local certificate used to negotiate TLS.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.CertificateProperties local_certificate_properties = 4;</code>
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSProperties.CertificatePropertiesOrBuilder getLocalCertificatePropertiesOrBuilder();

  /**
   * <pre>
   * Properties of the peer certificate used to negotiate TLS.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.CertificateProperties peer_certificate_properties = 5;</code>
   * @return Whether the peerCertificateProperties field is set.
   */
  boolean hasPeerCertificateProperties();
  /**
   * <pre>
   * Properties of the peer certificate used to negotiate TLS.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.CertificateProperties peer_certificate_properties = 5;</code>
   * @return The peerCertificateProperties.
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSProperties.CertificateProperties getPeerCertificateProperties();
  /**
   * <pre>
   * Properties of the peer certificate used to negotiate TLS.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.TLSProperties.CertificateProperties peer_certificate_properties = 5;</code>
   */
  io.envoyproxy.envoy.data.accesslog.v3.TLSProperties.CertificatePropertiesOrBuilder getPeerCertificatePropertiesOrBuilder();

  /**
   * <pre>
   * The TLS session ID.
   * </pre>
   *
   * <code>string tls_session_id = 6;</code>
   * @return The tlsSessionId.
   */
  java.lang.String getTlsSessionId();
  /**
   * <pre>
   * The TLS session ID.
   * </pre>
   *
   * <code>string tls_session_id = 6;</code>
   * @return The bytes for tlsSessionId.
   */
  com.google.protobuf.ByteString
      getTlsSessionIdBytes();

  /**
   * <pre>
   * The ``JA3`` fingerprint when ``JA3`` fingerprinting is enabled.
   * </pre>
   *
   * <code>string ja3_fingerprint = 7;</code>
   * @return The ja3Fingerprint.
   */
  java.lang.String getJa3Fingerprint();
  /**
   * <pre>
   * The ``JA3`` fingerprint when ``JA3`` fingerprinting is enabled.
   * </pre>
   *
   * <code>string ja3_fingerprint = 7;</code>
   * @return The bytes for ja3Fingerprint.
   */
  com.google.protobuf.ByteString
      getJa3FingerprintBytes();
}
