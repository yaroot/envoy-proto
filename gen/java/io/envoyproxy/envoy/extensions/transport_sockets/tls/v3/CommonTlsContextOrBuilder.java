// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/tls.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public interface CommonTlsContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.transport_sockets.tls.v3.CommonTlsContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TLS protocol versions, cipher suites etc.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsParameters tls_params = 1;</code>
   * @return Whether the tlsParams field is set.
   */
  boolean hasTlsParams();
  /**
   * <pre>
   * TLS protocol versions, cipher suites etc.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsParameters tls_params = 1;</code>
   * @return The tlsParams.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsParameters getTlsParams();
  /**
   * <pre>
   * TLS protocol versions, cipher suites etc.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsParameters tls_params = 1;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsParametersOrBuilder getTlsParamsOrBuilder();

  /**
   * <pre>
   * Only a single TLS certificate is supported in client contexts. In server contexts,
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates and support SNI-based selection.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.TlsCertificate tls_certificates = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsCertificate> 
      getTlsCertificatesList();
  /**
   * <pre>
   * Only a single TLS certificate is supported in client contexts. In server contexts,
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates and support SNI-based selection.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.TlsCertificate tls_certificates = 2;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsCertificate getTlsCertificates(int index);
  /**
   * <pre>
   * Only a single TLS certificate is supported in client contexts. In server contexts,
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates and support SNI-based selection.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.TlsCertificate tls_certificates = 2;</code>
   */
  int getTlsCertificatesCount();
  /**
   * <pre>
   * Only a single TLS certificate is supported in client contexts. In server contexts,
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates and support SNI-based selection.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.TlsCertificate tls_certificates = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsCertificateOrBuilder> 
      getTlsCertificatesOrBuilderList();
  /**
   * <pre>
   * Only a single TLS certificate is supported in client contexts. In server contexts,
   * :ref:`Multiple TLS certificates &lt;arch_overview_ssl_cert_select&gt;` can be associated with the
   * same context to allow both RSA and ECDSA certificates and support SNI-based selection.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.TlsCertificate tls_certificates = 2;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsCertificateOrBuilder getTlsCertificatesOrBuilder(
      int index);

  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * The same number and types of certificates as :ref:`tls_certificates &lt;envoy_v3_api_field_extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificates&gt;`
   * are valid in the the certificates fetched through this setting.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig> 
      getTlsCertificateSdsSecretConfigsList();
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * The same number and types of certificates as :ref:`tls_certificates &lt;envoy_v3_api_field_extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificates&gt;`
   * are valid in the the certificates fetched through this setting.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getTlsCertificateSdsSecretConfigs(int index);
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * The same number and types of certificates as :ref:`tls_certificates &lt;envoy_v3_api_field_extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificates&gt;`
   * are valid in the the certificates fetched through this setting.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  int getTlsCertificateSdsSecretConfigsCount();
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * The same number and types of certificates as :ref:`tls_certificates &lt;envoy_v3_api_field_extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificates&gt;`
   * are valid in the the certificates fetched through this setting.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder> 
      getTlsCertificateSdsSecretConfigsOrBuilderList();
  /**
   * <pre>
   * Configs for fetching TLS certificates via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * The same number and types of certificates as :ref:`tls_certificates &lt;envoy_v3_api_field_extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificates&gt;`
   * are valid in the the certificates fetched through this setting.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#next-major-version: These mutually exclusive fields should ideally be in a oneof, but it's
   * not legal to put a repeated field in a oneof. In the next major version, we should rework
   * this to avoid this problem.]
   * </pre>
   *
   * <code>repeated .envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig tls_certificate_sds_secret_configs = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder getTlsCertificateSdsSecretConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Certificate provider instance for fetching TLS certs.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateProviderPluginInstance tls_certificate_provider_instance = 14;</code>
   * @return Whether the tlsCertificateProviderInstance field is set.
   */
  boolean hasTlsCertificateProviderInstance();
  /**
   * <pre>
   * Certificate provider instance for fetching TLS certs.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateProviderPluginInstance tls_certificate_provider_instance = 14;</code>
   * @return The tlsCertificateProviderInstance.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CertificateProviderPluginInstance getTlsCertificateProviderInstance();
  /**
   * <pre>
   * Certificate provider instance for fetching TLS certs.
   * Only one of ``tls_certificates``, ``tls_certificate_sds_secret_configs``,
   * and ``tls_certificate_provider_instance`` may be used.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateProviderPluginInstance tls_certificate_provider_instance = 14;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CertificateProviderPluginInstanceOrBuilder getTlsCertificateProviderInstanceOrBuilder();

  /**
   * <pre>
   * Certificate provider for fetching TLS certificates.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider tls_certificate_certificate_provider = 9 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificate_certificate_provider is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=268
   * @return Whether the tlsCertificateCertificateProvider field is set.
   */
  @java.lang.Deprecated boolean hasTlsCertificateCertificateProvider();
  /**
   * <pre>
   * Certificate provider for fetching TLS certificates.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider tls_certificate_certificate_provider = 9 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificate_certificate_provider is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=268
   * @return The tlsCertificateCertificateProvider.
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider getTlsCertificateCertificateProvider();
  /**
   * <pre>
   * Certificate provider for fetching TLS certificates.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider tls_certificate_certificate_provider = 9 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderOrBuilder getTlsCertificateCertificateProviderOrBuilder();

  /**
   * <pre>
   * Certificate provider instance for fetching TLS certificates.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance tls_certificate_certificate_provider_instance = 11 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificate_certificate_provider_instance is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=273
   * @return Whether the tlsCertificateCertificateProviderInstance field is set.
   */
  @java.lang.Deprecated boolean hasTlsCertificateCertificateProviderInstance();
  /**
   * <pre>
   * Certificate provider instance for fetching TLS certificates.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance tls_certificate_certificate_provider_instance = 11 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.tls_certificate_certificate_provider_instance is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=273
   * @return The tlsCertificateCertificateProviderInstance.
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance getTlsCertificateCertificateProviderInstance();
  /**
   * <pre>
   * Certificate provider instance for fetching TLS certificates.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance tls_certificate_certificate_provider_instance = 11 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstanceOrBuilder getTlsCertificateCertificateProviderInstanceOrBuilder();

  /**
   * <pre>
   * How to validate peer certificates.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext validation_context = 3;</code>
   * @return Whether the validationContext field is set.
   */
  boolean hasValidationContext();
  /**
   * <pre>
   * How to validate peer certificates.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext validation_context = 3;</code>
   * @return The validationContext.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext getValidationContext();
  /**
   * <pre>
   * How to validate peer certificates.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext validation_context = 3;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContextOrBuilder getValidationContextOrBuilder();

  /**
   * <pre>
   * Config for fetching validation context via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig validation_context_sds_secret_config = 7;</code>
   * @return Whether the validationContextSdsSecretConfig field is set.
   */
  boolean hasValidationContextSdsSecretConfig();
  /**
   * <pre>
   * Config for fetching validation context via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig validation_context_sds_secret_config = 7;</code>
   * @return The validationContextSdsSecretConfig.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getValidationContextSdsSecretConfig();
  /**
   * <pre>
   * Config for fetching validation context via SDS API. Note SDS API allows certificates to be
   * fetched/refreshed over the network asynchronously with respect to the TLS handshake.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig validation_context_sds_secret_config = 7;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder getValidationContextSdsSecretConfigOrBuilder();

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
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CombinedCertificateValidationContext combined_validation_context = 8;</code>
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
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CombinedCertificateValidationContext combined_validation_context = 8;</code>
   * @return The combinedValidationContext.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CombinedCertificateValidationContext getCombinedValidationContext();
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
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CombinedCertificateValidationContext combined_validation_context = 8;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CombinedCertificateValidationContextOrBuilder getCombinedValidationContextOrBuilder();

  /**
   * <pre>
   * Certificate provider for fetching validation context.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider validation_context_certificate_provider = 10 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.validation_context_certificate_provider is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=295
   * @return Whether the validationContextCertificateProvider field is set.
   */
  @java.lang.Deprecated boolean hasValidationContextCertificateProvider();
  /**
   * <pre>
   * Certificate provider for fetching validation context.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider validation_context_certificate_provider = 10 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.validation_context_certificate_provider is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=295
   * @return The validationContextCertificateProvider.
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider getValidationContextCertificateProvider();
  /**
   * <pre>
   * Certificate provider for fetching validation context.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProvider validation_context_certificate_provider = 10 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderOrBuilder getValidationContextCertificateProviderOrBuilder();

  /**
   * <pre>
   * Certificate provider instance for fetching validation context.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance validation_context_certificate_provider_instance = 12 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.validation_context_certificate_provider_instance is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=300
   * @return Whether the validationContextCertificateProviderInstance field is set.
   */
  @java.lang.Deprecated boolean hasValidationContextCertificateProviderInstance();
  /**
   * <pre>
   * Certificate provider instance for fetching validation context.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance validation_context_certificate_provider_instance = 12 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.validation_context_certificate_provider_instance is deprecated.
   *     See envoy/extensions/transport_sockets/tls/v3/tls.proto;l=300
   * @return The validationContextCertificateProviderInstance.
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance getValidationContextCertificateProviderInstance();
  /**
   * <pre>
   * Certificate provider instance for fetching validation context.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstance validation_context_certificate_provider_instance = 12 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.CertificateProviderInstanceOrBuilder getValidationContextCertificateProviderInstanceOrBuilder();

  /**
   * <pre>
   * Supplies the list of ALPN protocols that the listener should expose. In
   * practice this is likely to be set to one of two values (see the
   * :ref:`codec_type
   * &lt;envoy_v3_api_field_extensions.filters.network.http_connection_manager.v3.HttpConnectionManager.codec_type&gt;`
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
   * &lt;envoy_v3_api_field_extensions.filters.network.http_connection_manager.v3.HttpConnectionManager.codec_type&gt;`
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
   * &lt;envoy_v3_api_field_extensions.filters.network.http_connection_manager.v3.HttpConnectionManager.codec_type&gt;`
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
   * &lt;envoy_v3_api_field_extensions.filters.network.http_connection_manager.v3.HttpConnectionManager.codec_type&gt;`
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

  /**
   * <pre>
   * Custom TLS handshaker. If empty, defaults to native TLS handshaking
   * behavior.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig custom_handshaker = 13;</code>
   * @return Whether the customHandshaker field is set.
   */
  boolean hasCustomHandshaker();
  /**
   * <pre>
   * Custom TLS handshaker. If empty, defaults to native TLS handshaking
   * behavior.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig custom_handshaker = 13;</code>
   * @return The customHandshaker.
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getCustomHandshaker();
  /**
   * <pre>
   * Custom TLS handshaker. If empty, defaults to native TLS handshaking
   * behavior.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig custom_handshaker = 13;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder getCustomHandshakerOrBuilder();

  /**
   * <pre>
   * TLS key log configuration
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsKeyLog key_log = 15;</code>
   * @return Whether the keyLog field is set.
   */
  boolean hasKeyLog();
  /**
   * <pre>
   * TLS key log configuration
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsKeyLog key_log = 15;</code>
   * @return The keyLog.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsKeyLog getKeyLog();
  /**
   * <pre>
   * TLS key log configuration
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsKeyLog key_log = 15;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsKeyLogOrBuilder getKeyLogOrBuilder();

  public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext.ValidationContextTypeCase getValidationContextTypeCase();
}