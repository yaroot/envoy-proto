// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/accesslog/v2/accesslog.proto

package io.envoyproxy.envoy.data.accesslog.v2;

public final class AccesslogProto {
  private AccesslogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_TCPAccessLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_TCPAccessLogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_HTTPAccessLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_HTTPAccessLogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_ConnectionProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_ConnectionProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_AccessLogCommon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_AccessLogCommon_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_AccessLogCommon_FilterStateObjectsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_AccessLogCommon_FilterStateObjectsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_ResponseFlags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_ResponseFlags_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_ResponseFlags_Unauthorized_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_ResponseFlags_Unauthorized_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_TLSProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_TLSProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_SubjectAltName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_SubjectAltName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_RequestHeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_RequestHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseHeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseTrailersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseTrailersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'envoy/data/accesslog/v2/accesslog.prot" +
      "o\022\027envoy.data.accesslog.v2\032\037envoy/api/v2" +
      "/core/address.proto\032\034envoy/api/v2/core/b" +
      "ase.proto\032\031google/protobuf/any.proto\032\036go" +
      "ogle/protobuf/duration.proto\032\037google/pro" +
      "tobuf/timestamp.proto\032\036google/protobuf/w" +
      "rappers.proto\032\035udpa/annotations/status.p" +
      "roto\032\027validate/validate.proto\"\246\001\n\021TCPAcc" +
      "essLogEntry\022C\n\021common_properties\030\001 \001(\0132(" +
      ".envoy.data.accesslog.v2.AccessLogCommon" +
      "\022L\n\025connection_properties\030\002 \001(\0132-.envoy." +
      "data.accesslog.v2.ConnectionProperties\"\207" +
      "\003\n\022HTTPAccessLogEntry\022C\n\021common_properti" +
      "es\030\001 \001(\0132(.envoy.data.accesslog.v2.Acces" +
      "sLogCommon\022Q\n\020protocol_version\030\002 \001(\01627.e" +
      "nvoy.data.accesslog.v2.HTTPAccessLogEntr" +
      "y.HTTPVersion\022?\n\007request\030\003 \001(\0132..envoy.d" +
      "ata.accesslog.v2.HTTPRequestProperties\022A" +
      "\n\010response\030\004 \001(\0132/.envoy.data.accesslog." +
      "v2.HTTPResponseProperties\"U\n\013HTTPVersion" +
      "\022\030\n\024PROTOCOL_UNSPECIFIED\020\000\022\n\n\006HTTP10\020\001\022\n" +
      "\n\006HTTP11\020\002\022\t\n\005HTTP2\020\003\022\t\n\005HTTP3\020\004\"B\n\024Conn" +
      "ectionProperties\022\026\n\016received_bytes\030\001 \001(\004" +
      "\022\022\n\nsent_bytes\030\002 \001(\004\"\260\n\n\017AccessLogCommon" +
      "\022,\n\013sample_rate\030\001 \001(\001B\027\372B\024\022\022\031\000\000\000\000\000\000\360?!\000\000" +
      "\000\000\000\000\000\000\022=\n\031downstream_remote_address\030\002 \001(" +
      "\0132\032.envoy.api.v2.core.Address\022<\n\030downstr" +
      "eam_local_address\030\003 \001(\0132\032.envoy.api.v2.c" +
      "ore.Address\022>\n\016tls_properties\030\004 \001(\0132&.en" +
      "voy.data.accesslog.v2.TLSProperties\022.\n\ns" +
      "tart_time\030\005 \001(\0132\032.google.protobuf.Timest" +
      "amp\0227\n\024time_to_last_rx_byte\030\006 \001(\0132\031.goog" +
      "le.protobuf.Duration\022A\n\036time_to_first_up" +
      "stream_tx_byte\030\007 \001(\0132\031.google.protobuf.D" +
      "uration\022@\n\035time_to_last_upstream_tx_byte" +
      "\030\010 \001(\0132\031.google.protobuf.Duration\022A\n\036tim" +
      "e_to_first_upstream_rx_byte\030\t \001(\0132\031.goog" +
      "le.protobuf.Duration\022@\n\035time_to_last_ups" +
      "tream_rx_byte\030\n \001(\0132\031.google.protobuf.Du" +
      "ration\022C\n time_to_first_downstream_tx_by" +
      "te\030\013 \001(\0132\031.google.protobuf.Duration\022B\n\037t" +
      "ime_to_last_downstream_tx_byte\030\014 \001(\0132\031.g" +
      "oogle.protobuf.Duration\022;\n\027upstream_remo" +
      "te_address\030\r \001(\0132\032.envoy.api.v2.core.Add" +
      "ress\022:\n\026upstream_local_address\030\016 \001(\0132\032.e" +
      "nvoy.api.v2.core.Address\022\030\n\020upstream_clu" +
      "ster\030\017 \001(\t\022>\n\016response_flags\030\020 \001(\0132&.env" +
      "oy.data.accesslog.v2.ResponseFlags\022-\n\010me" +
      "tadata\030\021 \001(\0132\033.envoy.api.v2.core.Metadat" +
      "a\022)\n!upstream_transport_failure_reason\030\022" +
      " \001(\t\022\022\n\nroute_name\030\023 \001(\t\022D\n downstream_d" +
      "irect_remote_address\030\024 \001(\0132\032.envoy.api.v" +
      "2.core.Address\022^\n\024filter_state_objects\030\025" +
      " \003(\0132@.envoy.data.accesslog.v2.AccessLog" +
      "Common.FilterStateObjectsEntry\032O\n\027Filter" +
      "StateObjectsEntry\022\013\n\003key\030\001 \001(\t\022#\n\005value\030" +
      "\002 \001(\0132\024.google.protobuf.Any:\0028\001\"\256\006\n\rResp" +
      "onseFlags\022 \n\030failed_local_healthcheck\030\001 " +
      "\001(\010\022\033\n\023no_healthy_upstream\030\002 \001(\010\022 \n\030upst" +
      "ream_request_timeout\030\003 \001(\010\022\023\n\013local_rese" +
      "t\030\004 \001(\010\022\035\n\025upstream_remote_reset\030\005 \001(\010\022#" +
      "\n\033upstream_connection_failure\030\006 \001(\010\022\'\n\037u" +
      "pstream_connection_termination\030\007 \001(\010\022\031\n\021" +
      "upstream_overflow\030\010 \001(\010\022\026\n\016no_route_foun" +
      "d\030\t \001(\010\022\026\n\016delay_injected\030\n \001(\010\022\026\n\016fault" +
      "_injected\030\013 \001(\010\022\024\n\014rate_limited\030\014 \001(\010\022Q\n" +
      "\024unauthorized_details\030\r \001(\01323.envoy.data" +
      ".accesslog.v2.ResponseFlags.Unauthorized" +
      "\022 \n\030rate_limit_service_error\030\016 \001(\010\022)\n!do" +
      "wnstream_connection_termination\030\017 \001(\010\022%\n" +
      "\035upstream_retry_limit_exceeded\030\020 \001(\010\022\033\n\023" +
      "stream_idle_timeout\030\021 \001(\010\022%\n\035invalid_env" +
      "oy_request_headers\030\022 \001(\010\022!\n\031downstream_p" +
      "rotocol_error\030\023 \001(\010\032\222\001\n\014Unauthorized\022J\n\006" +
      "reason\030\001 \001(\0162:.envoy.data.accesslog.v2.R" +
      "esponseFlags.Unauthorized.Reason\"6\n\006Reas" +
      "on\022\026\n\022REASON_UNSPECIFIED\020\000\022\024\n\020EXTERNAL_S" +
      "ERVICE\020\001\"\252\005\n\rTLSProperties\022F\n\013tls_versio" +
      "n\030\001 \001(\01621.envoy.data.accesslog.v2.TLSPro" +
      "perties.TLSVersion\0226\n\020tls_cipher_suite\030\002" +
      " \001(\0132\034.google.protobuf.UInt32Value\022\030\n\020tl" +
      "s_sni_hostname\030\003 \001(\t\022b\n\034local_certificat" +
      "e_properties\030\004 \001(\0132<.envoy.data.accesslo" +
      "g.v2.TLSProperties.CertificateProperties" +
      "\022a\n\033peer_certificate_properties\030\005 \001(\0132<." +
      "envoy.data.accesslog.v2.TLSProperties.Ce" +
      "rtificateProperties\022\026\n\016tls_session_id\030\006 " +
      "\001(\t\032\306\001\n\025CertificateProperties\022e\n\020subject" +
      "_alt_name\030\001 \003(\0132K.envoy.data.accesslog.v" +
      "2.TLSProperties.CertificateProperties.Su" +
      "bjectAltName\022\017\n\007subject\030\002 \001(\t\0325\n\016Subject" +
      "AltName\022\r\n\003uri\030\001 \001(\tH\000\022\r\n\003dns\030\002 \001(\tH\000B\005\n" +
      "\003san\"W\n\nTLSVersion\022\027\n\023VERSION_UNSPECIFIE" +
      "D\020\000\022\t\n\005TLSv1\020\001\022\013\n\007TLSv1_1\020\002\022\013\n\007TLSv1_2\020\003" +
      "\022\013\n\007TLSv1_3\020\004\"\356\003\n\025HTTPRequestProperties\022" +
      "B\n\016request_method\030\001 \001(\0162 .envoy.api.v2.c" +
      "ore.RequestMethodB\010\372B\005\202\001\002\020\001\022\016\n\006scheme\030\002 " +
      "\001(\t\022\021\n\tauthority\030\003 \001(\t\022*\n\004port\030\004 \001(\0132\034.g" +
      "oogle.protobuf.UInt32Value\022\014\n\004path\030\005 \001(\t" +
      "\022\022\n\nuser_agent\030\006 \001(\t\022\017\n\007referer\030\007 \001(\t\022\025\n" +
      "\rforwarded_for\030\010 \001(\t\022\022\n\nrequest_id\030\t \001(\t" +
      "\022\025\n\roriginal_path\030\n \001(\t\022\035\n\025request_heade" +
      "rs_bytes\030\013 \001(\004\022\032\n\022request_body_bytes\030\014 \001" +
      "(\004\022[\n\017request_headers\030\r \003(\0132B.envoy.data" +
      ".accesslog.v2.HTTPRequestProperties.Requ" +
      "estHeadersEntry\0325\n\023RequestHeadersEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\334\003\n\026HTTPR" +
      "esponseProperties\0223\n\rresponse_code\030\001 \001(\013" +
      "2\034.google.protobuf.UInt32Value\022\036\n\026respon" +
      "se_headers_bytes\030\002 \001(\004\022\033\n\023response_body_" +
      "bytes\030\003 \001(\004\022^\n\020response_headers\030\004 \003(\0132D." +
      "envoy.data.accesslog.v2.HTTPResponseProp" +
      "erties.ResponseHeadersEntry\022`\n\021response_" +
      "trailers\030\005 \003(\0132E.envoy.data.accesslog.v2" +
      ".HTTPResponseProperties.ResponseTrailers" +
      "Entry\022\035\n\025response_code_details\030\006 \001(\t\0326\n\024" +
      "ResponseHeadersEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\0327\n\025ResponseTrailersEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\215\001\n%io.env" +
      "oyproxy.envoy.data.accesslog.v2B\016Accessl" +
      "ogProtoP\001ZJgithub.com/envoyproxy/go-cont" +
      "rol-plane/envoy/data/accesslog/v2;access" +
      "logv2\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.core.AddressProto.getDescriptor(),
          io.envoyproxy.envoy.api.v2.core.BaseProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_data_accesslog_v2_TCPAccessLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_data_accesslog_v2_TCPAccessLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_TCPAccessLogEntry_descriptor,
        new java.lang.String[] { "CommonProperties", "ConnectionProperties", });
    internal_static_envoy_data_accesslog_v2_HTTPAccessLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_data_accesslog_v2_HTTPAccessLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_HTTPAccessLogEntry_descriptor,
        new java.lang.String[] { "CommonProperties", "ProtocolVersion", "Request", "Response", });
    internal_static_envoy_data_accesslog_v2_ConnectionProperties_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_data_accesslog_v2_ConnectionProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_ConnectionProperties_descriptor,
        new java.lang.String[] { "ReceivedBytes", "SentBytes", });
    internal_static_envoy_data_accesslog_v2_AccessLogCommon_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_data_accesslog_v2_AccessLogCommon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_AccessLogCommon_descriptor,
        new java.lang.String[] { "SampleRate", "DownstreamRemoteAddress", "DownstreamLocalAddress", "TlsProperties", "StartTime", "TimeToLastRxByte", "TimeToFirstUpstreamTxByte", "TimeToLastUpstreamTxByte", "TimeToFirstUpstreamRxByte", "TimeToLastUpstreamRxByte", "TimeToFirstDownstreamTxByte", "TimeToLastDownstreamTxByte", "UpstreamRemoteAddress", "UpstreamLocalAddress", "UpstreamCluster", "ResponseFlags", "Metadata", "UpstreamTransportFailureReason", "RouteName", "DownstreamDirectRemoteAddress", "FilterStateObjects", });
    internal_static_envoy_data_accesslog_v2_AccessLogCommon_FilterStateObjectsEntry_descriptor =
      internal_static_envoy_data_accesslog_v2_AccessLogCommon_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_accesslog_v2_AccessLogCommon_FilterStateObjectsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_AccessLogCommon_FilterStateObjectsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_data_accesslog_v2_ResponseFlags_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_data_accesslog_v2_ResponseFlags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_ResponseFlags_descriptor,
        new java.lang.String[] { "FailedLocalHealthcheck", "NoHealthyUpstream", "UpstreamRequestTimeout", "LocalReset", "UpstreamRemoteReset", "UpstreamConnectionFailure", "UpstreamConnectionTermination", "UpstreamOverflow", "NoRouteFound", "DelayInjected", "FaultInjected", "RateLimited", "UnauthorizedDetails", "RateLimitServiceError", "DownstreamConnectionTermination", "UpstreamRetryLimitExceeded", "StreamIdleTimeout", "InvalidEnvoyRequestHeaders", "DownstreamProtocolError", });
    internal_static_envoy_data_accesslog_v2_ResponseFlags_Unauthorized_descriptor =
      internal_static_envoy_data_accesslog_v2_ResponseFlags_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_accesslog_v2_ResponseFlags_Unauthorized_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_ResponseFlags_Unauthorized_descriptor,
        new java.lang.String[] { "Reason", });
    internal_static_envoy_data_accesslog_v2_TLSProperties_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_data_accesslog_v2_TLSProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_TLSProperties_descriptor,
        new java.lang.String[] { "TlsVersion", "TlsCipherSuite", "TlsSniHostname", "LocalCertificateProperties", "PeerCertificateProperties", "TlsSessionId", });
    internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_descriptor =
      internal_static_envoy_data_accesslog_v2_TLSProperties_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_descriptor,
        new java.lang.String[] { "SubjectAltName", "Subject", });
    internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_SubjectAltName_descriptor =
      internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_SubjectAltName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_TLSProperties_CertificateProperties_SubjectAltName_descriptor,
        new java.lang.String[] { "Uri", "Dns", "San", });
    internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_descriptor,
        new java.lang.String[] { "RequestMethod", "Scheme", "Authority", "Port", "Path", "UserAgent", "Referer", "ForwardedFor", "RequestId", "OriginalPath", "RequestHeadersBytes", "RequestBodyBytes", "RequestHeaders", });
    internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_RequestHeadersEntry_descriptor =
      internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_RequestHeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_HTTPRequestProperties_RequestHeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_descriptor,
        new java.lang.String[] { "ResponseCode", "ResponseHeadersBytes", "ResponseBodyBytes", "ResponseHeaders", "ResponseTrailers", "ResponseCodeDetails", });
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseHeadersEntry_descriptor =
      internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseHeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseHeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseTrailersEntry_descriptor =
      internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_descriptor.getNestedTypes().get(1);
    internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseTrailersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_accesslog_v2_HTTPResponseProperties_ResponseTrailersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.core.AddressProto.getDescriptor();
    io.envoyproxy.envoy.api.v2.core.BaseProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}