// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/auth/tls.proto

package io.envoyproxy.envoy.api.v2.auth;

public interface CommonTlsContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.auth.CommonTlsContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TLS protocol versions, cipher suites etc.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.TlsParameters tls_params = 1;</code>
   * @return Whether the tlsParams field is set.
   */
  boolean hasTlsParams();
  /**
   * <pre>
   * TLS protocol versions, cipher suites etc.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.TlsParameters tls_params = 1;</code>
   * @return The tlsParams.
   */
  io.envoyproxy.envoy.api.v2.auth.TlsParameters getTlsParams();
  /**
   * <pre>
   * TLS protocol versions, cipher suites etc.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.TlsParameters tls_params = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.auth.TlsParametersOrBuilder getTlsParamsOrBuilder();

  /**
   * <pre>
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates.
   * Only a single TLS certificate is supported in client contexts. In server contexts, the first
   * RSA certificate is used for clients that only support RSA and the first ECDSA certificate is
   * used for clients that support ECDSA.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.TlsCertificate tls_certificates = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.auth.TlsCertificate> 
      getTlsCertificatesList();
  /**
   * <pre>
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates.
   * Only a single TLS certificate is supported in client contexts. In server contexts, the first
   * RSA certificate is used for clients that only support RSA and the first ECDSA certificate is
   * used for clients that support ECDSA.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.TlsCertificate tls_certificates = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.auth.TlsCertificate getTlsCertificates(int index);
  /**
   * <pre>
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates.
   * Only a single TLS certificate is supported in client contexts. In server contexts, the first
   * RSA certificate is used for clients that only support RSA and the first ECDSA certificate is
   * used for clients that support ECDSA.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.TlsCertificate tls_certificates = 2;</code>
   */
  int getTlsCertificatesCount();
  /**
   * <pre>
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates.
   * Only a single TLS certificate is supported in client contexts. In server contexts, the first
   * RSA certificate is used for clients that only support RSA and the first ECDSA certificate is
   * used for clients that support ECDSA.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.TlsCertificate tls_certificates = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.auth.TlsCertificateOrBuilder> 
      getTlsCertificatesOrBuilderList();
  /**
   * <pre>
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates.
   * Only a single TLS certificate is supported in client contexts. In server contexts, the first
   * RSA certificate is used for clients that only support RSA and the first ECDSA certificate is
   * used for clients that support ECDSA.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.TlsCertificate tls_certificates = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.auth.TlsCertificateOrBuilder getTlsCertificatesOrBuilder(
      int index);

  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.auth.SdsSecretConfig> 
      getTlsCertificateSdsSecretConfigsList();
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.auth.SdsSecretConfig getTlsCertificateSdsSecretConfigs(int index);
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  int getTlsCertificateSdsSecretConfigsCount();
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.auth.SdsSecretConfigOrBuilder> 
      getTlsCertificateSdsSecretConfigsOrBuilderList();
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.auth.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.auth.SdsSecretConfigOrBuilder getTlsCertificateSdsSecretConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * How to validate peer certificates.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.CertificateValidationContext validation_context = 3;</code>
   * @return Whether the validationContext field is set.
   */
  boolean hasValidationContext();
  /**
   * <pre>
   * How to validate peer certificates.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.CertificateValidationContext validation_context = 3;</code>
   * @return The validationContext.
   */
  io.envoyproxy.envoy.api.v2.auth.CertificateValidationContext getValidationContext();
  /**
   * <pre>
   * How to validate peer certificates.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.CertificateValidationContext validation_context = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.auth.CertificateValidationContextOrBuilder getValidationContextOrBuilder();

  /**
   * <pre>
   * Config for fetching validation context via SDS API.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.SdsSecretConfig validation_context_sds_secret_config = 7;</code>
   * @return Whether the validationContextSdsSecretConfig field is set.
   */
  boolean hasValidationContextSdsSecretConfig();
  /**
   * <pre>
   * Config for fetching validation context via SDS API.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.SdsSecretConfig validation_context_sds_secret_config = 7;</code>
   * @return The validationContextSdsSecretConfig.
   */
  io.envoyproxy.envoy.api.v2.auth.SdsSecretConfig getValidationContextSdsSecretConfig();
  /**
   * <pre>
   * Config for fetching validation context via SDS API.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.SdsSecretConfig validation_context_sds_secret_config = 7;</code>
   */
  io.envoyproxy.envoy.api.v2.auth.SdsSecretConfigOrBuilder getValidationContextSdsSecretConfigOrBuilder();

  /**
   * <pre>
   * Combined certificate validation context holds a default CertificateValidationContext
   * and SDS config. When SDS server returns dynamic CertificateValidationContext, both dynamic
   * and default CertificateValidationContext are merged into a new CertificateValidationContext
   * for validation. This merge is done by Message::MergeFrom(), so dynamic
   * CertificateValidationContext overwrites singular fields in default
   * CertificateValidationContext, and concatenates repeated fields to default
   * CertificateValidationContext, and logical OR is applied to boolean fields.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.CommonTlsContext.CombinedCertificateValidationContext combined_validation_context = 8;</code>
   * @return Whether the combinedValidationContext field is set.
   */
  boolean hasCombinedValidationContext();
  /**
   * <pre>
   * Combined certificate validation context holds a default CertificateValidationContext
   * and SDS config. When SDS server returns dynamic CertificateValidationContext, both dynamic
   * and default CertificateValidationContext are merged into a new CertificateValidationContext
   * for validation. This merge is done by Message::MergeFrom(), so dynamic
   * CertificateValidationContext overwrites singular fields in default
   * CertificateValidationContext, and concatenates repeated fields to default
   * CertificateValidationContext, and logical OR is applied to boolean fields.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.CommonTlsContext.CombinedCertificateValidationContext combined_validation_context = 8;</code>
   * @return The combinedValidationContext.
   */
  io.envoyproxy.envoy.api.v2.auth.CommonTlsContext.CombinedCertificateValidationContext getCombinedValidationContext();
  /**
   * <pre>
   * Combined certificate validation context holds a default CertificateValidationContext
   * and SDS config. When SDS server returns dynamic CertificateValidationContext, both dynamic
   * and default CertificateValidationContext are merged into a new CertificateValidationContext
   * for validation. This merge is done by Message::MergeFrom(), so dynamic
   * CertificateValidationContext overwrites singular fields in default
   * CertificateValidationContext, and concatenates repeated fields to default
   * CertificateValidationContext, and logical OR is applied to boolean fields.
   * </pre>
   *
   * <code>.envoy.api.v2.auth.CommonTlsContext.CombinedCertificateValidationContext combined_validation_context = 8;</code>
   */
  io.envoyproxy.envoy.api.v2.auth.CommonTlsContext.CombinedCertificateValidationContextOrBuilder getCombinedValidationContextOrBuilder();

  /**
   * <pre>
   * Supplies the list of ALPN protocols that the listener should expose. In
   * practice this is likely to be set to one of two values (see the
   * :ref:`codec_type
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.codec_type&gt;`
   * parameter in the HTTP connection manager for more information):
   * * "h2,http/1.1" If the listener is going to support both HTTP/2 and HTTP/1.1.
   * * "http/1.1" If the listener is only going to support HTTP/1.1.
   * There is no default for this parameter. If empty, Envoy will not expose ALPN.
   * </pre>
   *
   * <code>repeated string alpn_protocols = 4;</code>
   * @return A list containing the alpnProtocols.
   */
  java.util.List<java.lang.String>
      getAlpnProtocolsList();
  /**
   * <pre>
   * Supplies the list of ALPN protocols that the listener should expose. In
   * practice this is likely to be set to one of two values (see the
   * :ref:`codec_type
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.codec_type&gt;`
   * parameter in the HTTP connection manager for more information):
   * * "h2,http/1.1" If the listener is going to support both HTTP/2 and HTTP/1.1.
   * * "http/1.1" If the listener is only going to support HTTP/1.1.
   * There is no default for this parameter. If empty, Envoy will not expose ALPN.
   * </pre>
   *
   * <code>repeated string alpn_protocols = 4;</code>
   * @return The count of alpnProtocols.
   */
  int getAlpnProtocolsCount();
  /**
   * <pre>
   * Supplies the list of ALPN protocols that the listener should expose. In
   * practice this is likely to be set to one of two values (see the
   * :ref:`codec_type
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.codec_type&gt;`
   * parameter in the HTTP connection manager for more information):
   * * "h2,http/1.1" If the listener is going to support both HTTP/2 and HTTP/1.1.
   * * "http/1.1" If the listener is only going to support HTTP/1.1.
   * There is no default for this parameter. If empty, Envoy will not expose ALPN.
   * </pre>
   *
   * <code>repeated string alpn_protocols = 4;</code>
   * @param index The index of the element to return.
   * @return The alpnProtocols at the given index.
   */
  java.lang.String getAlpnProtocols(int index);
  /**
   * <pre>
   * Supplies the list of ALPN protocols that the listener should expose. In
   * practice this is likely to be set to one of two values (see the
   * :ref:`codec_type
   * &lt;envoy_api_field_config.filter.network.http_connection_manager.v2.HttpConnectionManager.codec_type&gt;`
   * parameter in the HTTP connection manager for more information):
   * * "h2,http/1.1" If the listener is going to support both HTTP/2 and HTTP/1.1.
   * * "http/1.1" If the listener is only going to support HTTP/1.1.
   * There is no default for this parameter. If empty, Envoy will not expose ALPN.
   * </pre>
   *
   * <code>repeated string alpn_protocols = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the alpnProtocols at the given index.
   */
  com.google.protobuf.ByteString
      getAlpnProtocolsBytes(int index);

  public io.envoyproxy.envoy.api.v2.auth.CommonTlsContext.ValidationContextTypeCase getValidationContextTypeCase();
}