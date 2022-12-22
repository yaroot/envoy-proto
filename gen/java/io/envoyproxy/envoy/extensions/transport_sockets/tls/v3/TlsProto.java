// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/tls.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public final class TlsProto {
  private TlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_UpstreamTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_UpstreamTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_DownstreamTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_DownstreamTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsKeyLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_TlsKeyLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProvider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProviderInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProviderInstance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CombinedCertificateValidationContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CombinedCertificateValidationContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3envoy/extensions/transport_sockets/tls" +
      "/v3/tls.proto\022)envoy.extensions.transpor" +
      "t_sockets.tls.v3\032\"envoy/config/core/v3/a" +
      "ddress.proto\032$envoy/config/core/v3/exten" +
      "sion.proto\0326envoy/extensions/transport_s" +
      "ockets/tls/v3/common.proto\0326envoy/extens" +
      "ions/transport_sockets/tls/v3/secret.pro" +
      "to\032\036google/protobuf/duration.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032#envoy/annota" +
      "tions/deprecation.proto\032\035udpa/annotation" +
      "s/status.proto\032!udpa/annotations/version" +
      "ing.proto\032\027validate/validate.proto\"\206\002\n\022U" +
      "pstreamTlsContext\022W\n\022common_tls_context\030" +
      "\001 \001(\0132;.envoy.extensions.transport_socke" +
      "ts.tls.v3.CommonTlsContext\022\025\n\003sni\030\002 \001(\tB" +
      "\010\372B\005r\003(\377\001\022\033\n\023allow_renegotiation\030\003 \001(\010\0226" +
      "\n\020max_session_keys\030\004 \001(\0132\034.google.protob" +
      "uf.UInt32Value:+\232\305\210\036&\n$envoy.api.v2.auth" +
      ".UpstreamTlsContext\"\373\006\n\024DownstreamTlsCon" +
      "text\022W\n\022common_tls_context\030\001 \001(\0132;.envoy" +
      ".extensions.transport_sockets.tls.v3.Com" +
      "monTlsContext\022>\n\032require_client_certific" +
      "ate\030\002 \001(\0132\032.google.protobuf.BoolValue\022/\n" +
      "\013require_sni\030\003 \001(\0132\032.google.protobuf.Boo" +
      "lValue\022^\n\023session_ticket_keys\030\004 \001(\0132?.en" +
      "voy.extensions.transport_sockets.tls.v3." +
      "TlsSessionTicketKeysH\000\022k\n%session_ticket" +
      "_keys_sds_secret_config\030\005 \001(\0132:.envoy.ex" +
      "tensions.transport_sockets.tls.v3.SdsSec" +
      "retConfigH\000\022.\n$disable_stateless_session" +
      "_resumption\030\007 \001(\010H\000\022D\n\017session_timeout\030\006" +
      " \001(\0132\031.google.protobuf.DurationB\020\372B\r\252\001\n\032" +
      "\006\010\200\200\200\200\0202\000\022v\n\022ocsp_staple_policy\030\010 \001(\0162P." +
      "envoy.extensions.transport_sockets.tls.v" +
      "3.DownstreamTlsContext.OcspStaplePolicyB" +
      "\010\372B\005\202\001\002\020\001\022C\n\037full_scan_certs_on_sni_mism" +
      "atch\030\t \001(\0132\032.google.protobuf.BoolValue\"N" +
      "\n\020OcspStaplePolicy\022\024\n\020LENIENT_STAPLING\020\000" +
      "\022\023\n\017STRICT_STAPLING\020\001\022\017\n\013MUST_STAPLE\020\002:-" +
      "\232\305\210\036(\n&envoy.api.v2.auth.DownstreamTlsCo" +
      "ntextB\032\n\030session_ticket_keys_type\"\237\001\n\tTl" +
      "sKeyLog\022\025\n\004path\030\001 \001(\tB\007\372B\004r\002\020\001\022<\n\023local_" +
      "address_range\030\002 \003(\0132\037.envoy.config.core." +
      "v3.CidrRange\022=\n\024remote_address_range\030\003 \003" +
      "(\0132\037.envoy.config.core.v3.CidrRange\"\265\023\n\020" +
      "CommonTlsContext\022L\n\ntls_params\030\001 \001(\01328.e" +
      "nvoy.extensions.transport_sockets.tls.v3" +
      ".TlsParameters\022S\n\020tls_certificates\030\002 \003(\013" +
      "29.envoy.extensions.transport_sockets.tl" +
      "s.v3.TlsCertificate\022p\n\"tls_certificate_s" +
      "ds_secret_configs\030\006 \003(\0132:.envoy.extensio" +
      "ns.transport_sockets.tls.v3.SdsSecretCon" +
      "figB\010\372B\005\222\001\002\020\002\022w\n!tls_certificate_provide" +
      "r_instance\030\016 \001(\0132L.envoy.extensions.tran" +
      "sport_sockets.tls.v3.CertificateProvider" +
      "PluginInstance\022\212\001\n$tls_certificate_certi" +
      "ficate_provider\030\t \001(\0132O.envoy.extensions" +
      ".transport_sockets.tls.v3.CommonTlsConte" +
      "xt.CertificateProviderB\013\030\001\222\307\206\330\004\0033.0\022\233\001\n-" +
      "tls_certificate_certificate_provider_ins" +
      "tance\030\013 \001(\0132W.envoy.extensions.transport" +
      "_sockets.tls.v3.CommonTlsContext.Certifi" +
      "cateProviderInstanceB\013\030\001\222\307\206\330\004\0033.0\022e\n\022val" +
      "idation_context\030\003 \001(\0132G.envoy.extensions" +
      ".transport_sockets.tls.v3.CertificateVal" +
      "idationContextH\000\022j\n$validation_context_s" +
      "ds_secret_config\030\007 \001(\0132:.envoy.extension" +
      "s.transport_sockets.tls.v3.SdsSecretConf" +
      "igH\000\022\207\001\n\033combined_validation_context\030\010 \001" +
      "(\0132`.envoy.extensions.transport_sockets." +
      "tls.v3.CommonTlsContext.CombinedCertific" +
      "ateValidationContextH\000\022\217\001\n\'validation_co" +
      "ntext_certificate_provider\030\n \001(\0132O.envoy" +
      ".extensions.transport_sockets.tls.v3.Com" +
      "monTlsContext.CertificateProviderB\013\030\001\222\307\206" +
      "\330\004\0033.0H\000\022\240\001\n0validation_context_certific" +
      "ate_provider_instance\030\014 \001(\0132W.envoy.exte" +
      "nsions.transport_sockets.tls.v3.CommonTl" +
      "sContext.CertificateProviderInstanceB\013\030\001" +
      "\222\307\206\330\004\0033.0H\000\022\026\n\016alpn_protocols\030\004 \003(\t\022E\n\021c" +
      "ustom_handshaker\030\r \001(\0132*.envoy.config.co" +
      "re.v3.TypedExtensionConfig\022E\n\007key_log\030\017 " +
      "\001(\01324.envoy.extensions.transport_sockets" +
      ".tls.v3.TlsKeyLog\032\177\n\023CertificateProvider" +
      "\022\025\n\004name\030\001 \001(\tB\007\372B\004r\002\020\001\022B\n\014typed_config\030" +
      "\002 \001(\0132*.envoy.config.core.v3.TypedExtens" +
      "ionConfigH\000B\r\n\006config\022\003\370B\001\032N\n\033Certificat" +
      "eProviderInstance\022\025\n\rinstance_name\030\001 \001(\t" +
      "\022\030\n\020certificate_name\030\002 \001(\t\032\222\005\n$CombinedC" +
      "ertificateValidationContext\022u\n\032default_v" +
      "alidation_context\030\001 \001(\0132G.envoy.extensio" +
      "ns.transport_sockets.tls.v3.CertificateV" +
      "alidationContextB\010\372B\005\212\001\002\020\001\022r\n$validation" +
      "_context_sds_secret_config\030\002 \001(\0132:.envoy" +
      ".extensions.transport_sockets.tls.v3.Sds" +
      "SecretConfigB\010\372B\005\212\001\002\020\001\022\215\001\n\'validation_co" +
      "ntext_certificate_provider\030\003 \001(\0132O.envoy" +
      ".extensions.transport_sockets.tls.v3.Com" +
      "monTlsContext.CertificateProviderB\013\030\001\222\307\206" +
      "\330\004\0033.0\022\236\001\n0validation_context_certificat" +
      "e_provider_instance\030\004 \001(\0132W.envoy.extens" +
      "ions.transport_sockets.tls.v3.CommonTlsC" +
      "ontext.CertificateProviderInstanceB\013\030\001\222\307" +
      "\206\330\004\0033.0:N\232\305\210\036I\nGenvoy.api.v2.auth.Common" +
      "TlsContext.CombinedCertificateValidation" +
      "Context:)\232\305\210\036$\n\"envoy.api.v2.auth.Common" +
      "TlsContextB\031\n\027validation_context_typeJ\004\010" +
      "\005\020\006B\245\001\n7io.envoyproxy.envoy.extensions.t" +
      "ransport_sockets.tls.v3B\010TlsProtoP\001ZVgit" +
      "hub.com/envoyproxy/go-control-plane/envo" +
      "y/extensions/transport_sockets/tls/v3;tl" +
      "sv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          envoy.annotations.Deprecation.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_transport_sockets_tls_v3_UpstreamTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_transport_sockets_tls_v3_UpstreamTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_UpstreamTlsContext_descriptor,
        new java.lang.String[] { "CommonTlsContext", "Sni", "AllowRenegotiation", "MaxSessionKeys", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_DownstreamTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_transport_sockets_tls_v3_DownstreamTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_DownstreamTlsContext_descriptor,
        new java.lang.String[] { "CommonTlsContext", "RequireClientCertificate", "RequireSni", "SessionTicketKeys", "SessionTicketKeysSdsSecretConfig", "DisableStatelessSessionResumption", "SessionTimeout", "OcspStaplePolicy", "FullScanCertsOnSniMismatch", "SessionTicketKeysType", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsKeyLog_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsKeyLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_TlsKeyLog_descriptor,
        new java.lang.String[] { "Path", "LocalAddressRange", "RemoteAddressRange", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_descriptor,
        new java.lang.String[] { "TlsParams", "TlsCertificates", "TlsCertificateSdsSecretConfigs", "TlsCertificateProviderInstance", "TlsCertificateCertificateProvider", "TlsCertificateCertificateProviderInstance", "ValidationContext", "ValidationContextSdsSecretConfig", "CombinedValidationContext", "ValidationContextCertificateProvider", "ValidationContextCertificateProviderInstance", "AlpnProtocols", "CustomHandshaker", "KeyLog", "ValidationContextType", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProvider_descriptor =
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_descriptor.getNestedTypes().get(0);
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProvider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProvider_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", "Config", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProviderInstance_descriptor =
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_descriptor.getNestedTypes().get(1);
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProviderInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CertificateProviderInstance_descriptor,
        new java.lang.String[] { "InstanceName", "CertificateName", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CombinedCertificateValidationContext_descriptor =
      internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_descriptor.getNestedTypes().get(2);
    internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CombinedCertificateValidationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_CommonTlsContext_CombinedCertificateValidationContext_descriptor,
        new java.lang.String[] { "DefaultValidationContext", "ValidationContextSdsSecretConfig", "ValidationContextCertificateProvider", "ValidationContextCertificateProviderInstance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(envoy.annotations.Deprecation.deprecatedAtMinorVersion);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor();
    io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonProto.getDescriptor();
    io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    envoy.annotations.Deprecation.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}