// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/auth/tls.proto

package io.envoyproxy.envoy.api.v2.auth;

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
    internal_static_envoy_api_v2_auth_UpstreamTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_UpstreamTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_DownstreamTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_DownstreamTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_CommonTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033envoy/api/v2/auth/tls.proto\022\021envoy.api" +
      ".v2.auth\032\036envoy/api/v2/auth/common.proto" +
      "\032\036envoy/api/v2/auth/secret.proto\032\036google" +
      "/protobuf/duration.proto\032\036google/protobu" +
      "f/wrappers.proto\032\036udpa/annotations/migra" +
      "te.proto\032\035udpa/annotations/status.proto\032" +
      "\027validate/validate.proto\"\301\001\n\022UpstreamTls" +
      "Context\022?\n\022common_tls_context\030\001 \001(\0132#.en" +
      "voy.api.v2.auth.CommonTlsContext\022\025\n\003sni\030" +
      "\002 \001(\tB\010\372B\005r\003(\377\001\022\033\n\023allow_renegotiation\030\003" +
      " \001(\010\0226\n\020max_session_keys\030\004 \001(\0132\034.google." +
      "protobuf.UInt32Value\"\367\003\n\024DownstreamTlsCo" +
      "ntext\022?\n\022common_tls_context\030\001 \001(\0132#.envo" +
      "y.api.v2.auth.CommonTlsContext\022>\n\032requir" +
      "e_client_certificate\030\002 \001(\0132\032.google.prot" +
      "obuf.BoolValue\022/\n\013require_sni\030\003 \001(\0132\032.go" +
      "ogle.protobuf.BoolValue\022F\n\023session_ticke" +
      "t_keys\030\004 \001(\0132\'.envoy.api.v2.auth.TlsSess" +
      "ionTicketKeysH\000\022S\n%session_ticket_keys_s" +
      "ds_secret_config\030\005 \001(\0132\".envoy.api.v2.au" +
      "th.SdsSecretConfigH\000\022.\n$disable_stateles" +
      "s_session_resumption\030\007 \001(\010H\000\022D\n\017session_" +
      "timeout\030\006 \001(\0132\031.google.protobuf.Duration" +
      "B\020\372B\r\252\001\n\032\006\010\200\200\200\200\0202\000B\032\n\030session_ticket_key" +
      "s_type\"\220\006\n\020CommonTlsContext\0224\n\ntls_param" +
      "s\030\001 \001(\0132 .envoy.api.v2.auth.TlsParameter" +
      "s\022;\n\020tls_certificates\030\002 \003(\0132!.envoy.api." +
      "v2.auth.TlsCertificate\022X\n\"tls_certificat" +
      "e_sds_secret_configs\030\006 \003(\0132\".envoy.api.v" +
      "2.auth.SdsSecretConfigB\010\372B\005\222\001\002\020\001\022M\n\022vali" +
      "dation_context\030\003 \001(\0132/.envoy.api.v2.auth" +
      ".CertificateValidationContextH\000\022R\n$valid" +
      "ation_context_sds_secret_config\030\007 \001(\0132\"." +
      "envoy.api.v2.auth.SdsSecretConfigH\000\022o\n\033c" +
      "ombined_validation_context\030\010 \001(\0132H.envoy" +
      ".api.v2.auth.CommonTlsContext.CombinedCe" +
      "rtificateValidationContextH\000\022\026\n\016alpn_pro" +
      "tocols\030\004 \003(\t\032\341\001\n$CombinedCertificateVali" +
      "dationContext\022]\n\032default_validation_cont" +
      "ext\030\001 \001(\0132/.envoy.api.v2.auth.Certificat" +
      "eValidationContextB\010\372B\005\212\001\002\020\001\022Z\n$validati" +
      "on_context_sds_secret_config\030\002 \001(\0132\".env" +
      "oy.api.v2.auth.SdsSecretConfigB\010\372B\005\212\001\002\020\001" +
      "B\031\n\027validation_context_typeJ\004\010\005\020\006B\240\001\n\037io" +
      ".envoyproxy.envoy.api.v2.authB\010TlsProtoP" +
      "\001Z8github.com/envoyproxy/go-control-plan" +
      "e/envoy/api/v2/auth\362\230\376\217\005+\022)envoy.extensi" +
      "ons.transport_sockets.tls.v3\272\200\310\321\006\002\020\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.auth.CommonProto.getDescriptor(),
          io.envoyproxy.envoy.api.v2.auth.SecretProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_api_v2_auth_UpstreamTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_auth_UpstreamTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_UpstreamTlsContext_descriptor,
        new java.lang.String[] { "CommonTlsContext", "Sni", "AllowRenegotiation", "MaxSessionKeys", });
    internal_static_envoy_api_v2_auth_DownstreamTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_auth_DownstreamTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_DownstreamTlsContext_descriptor,
        new java.lang.String[] { "CommonTlsContext", "RequireClientCertificate", "RequireSni", "SessionTicketKeys", "SessionTicketKeysSdsSecretConfig", "DisableStatelessSessionResumption", "SessionTimeout", "SessionTicketKeysType", });
    internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_auth_CommonTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor,
        new java.lang.String[] { "TlsParams", "TlsCertificates", "TlsCertificateSdsSecretConfigs", "ValidationContext", "ValidationContextSdsSecretConfig", "CombinedValidationContext", "AlpnProtocols", "ValidationContextType", });
    internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_descriptor =
      internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_descriptor,
        new java.lang.String[] { "DefaultValidationContext", "ValidationContextSdsSecretConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.auth.CommonProto.getDescriptor();
    io.envoyproxy.envoy.api.v2.auth.SecretProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}