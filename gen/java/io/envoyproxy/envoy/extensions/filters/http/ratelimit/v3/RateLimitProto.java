// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3;

public final class RateLimitProto {
  private RateLimitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_SourceCluster_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_SourceCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_DestinationCluster_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_DestinationCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RequestHeaders_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RequestHeaders_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RemoteAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RemoteAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_GenericKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_GenericKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_HeaderValueMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_HeaderValueMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_MetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_MetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_DynamicMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_DynamicMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;envoy/extensions/filters/http/ratelimi" +
      "t/v3/rate_limit.proto\022*envoy.extensions." +
      "filters.http.ratelimit.v3\032\037envoy/config/" +
      "core/v3/base.proto\032$envoy/config/core/v3" +
      "/extension.proto\032#envoy/config/ratelimit" +
      "/v3/rls.proto\032,envoy/config/route/v3/rou" +
      "te_components.proto\032%envoy/type/metadata" +
      "/v3/metadata.proto\032\037envoy/type/v3/http_s" +
      "tatus.proto\032\036google/protobuf/duration.pr" +
      "oto\032\035udpa/annotations/status.proto\032!udpa" +
      "/annotations/versioning.proto\032\027validate/" +
      "validate.proto\"\361\005\n\tRateLimit\022\027\n\006domain\030\001" +
      " \001(\tB\007\372B\004r\002\020\001\022\026\n\005stage\030\002 \001(\rB\007\372B\004*\002\030\n\0227\n" +
      "\014request_type\030\003 \001(\tB!\372B\036r\034R\010internalR\010ex" +
      "ternalR\004bothR\000\022*\n\007timeout\030\004 \001(\0132\031.google" +
      ".protobuf.Duration\022\031\n\021failure_mode_deny\030" +
      "\005 \001(\010\022*\n\"rate_limited_as_resource_exhaus" +
      "ted\030\006 \001(\010\022W\n\022rate_limit_service\030\007 \001(\01321." +
      "envoy.config.ratelimit.v3.RateLimitServi" +
      "ceConfigB\010\372B\005\212\001\002\020\001\022\177\n\032enable_x_ratelimit" +
      "_headers\030\010 \001(\0162Q.envoy.extensions.filter" +
      "s.http.ratelimit.v3.RateLimit.XRateLimit" +
      "HeadersRFCVersionB\010\372B\005\202\001\002\020\001\022*\n\"disable_x" +
      "_envoy_ratelimited_header\030\t \001(\010\0226\n\023rate_" +
      "limited_status\030\n \001(\0132\031.envoy.type.v3.Htt" +
      "pStatus\022R\n\027response_headers_to_add\030\013 \003(\013" +
      "2\'.envoy.config.core.v3.HeaderValueOptio" +
      "nB\010\372B\005\222\001\002\020\n\"<\n\033XRateLimitHeadersRFCVersi" +
      "on\022\007\n\003OFF\020\000\022\024\n\020DRAFT_VERSION_03\020\001:7\232\305\210\0362" +
      "\n0envoy.config.filter.http.rate_limit.v2" +
      ".RateLimit\"\336\017\n\017RateLimitConfig\022\026\n\005stage\030" +
      "\001 \001(\rB\007\372B\004*\002\030\n\022\023\n\013disable_key\030\002 \001(\t\022]\n\007a" +
      "ctions\030\003 \003(\0132B.envoy.extensions.filters." +
      "http.ratelimit.v3.RateLimitConfig.Action" +
      "B\010\372B\005\222\001\002\010\001\022S\n\005limit\030\004 \001(\0132D.envoy.extens" +
      "ions.filters.http.ratelimit.v3.RateLimit" +
      "Config.Override\032\367\013\n\006Action\022j\n\016source_clu" +
      "ster\030\001 \001(\0132P.envoy.extensions.filters.ht" +
      "tp.ratelimit.v3.RateLimitConfig.Action.S" +
      "ourceClusterH\000\022t\n\023destination_cluster\030\002 " +
      "\001(\0132U.envoy.extensions.filters.http.rate" +
      "limit.v3.RateLimitConfig.Action.Destinat" +
      "ionClusterH\000\022l\n\017request_headers\030\003 \001(\0132Q." +
      "envoy.extensions.filters.http.ratelimit." +
      "v3.RateLimitConfig.Action.RequestHeaders" +
      "H\000\022j\n\016remote_address\030\004 \001(\0132P.envoy.exten" +
      "sions.filters.http.ratelimit.v3.RateLimi" +
      "tConfig.Action.RemoteAddressH\000\022d\n\013generi" +
      "c_key\030\005 \001(\0132M.envoy.extensions.filters.h" +
      "ttp.ratelimit.v3.RateLimitConfig.Action." +
      "GenericKeyH\000\022q\n\022header_value_match\030\006 \001(\013" +
      "2S.envoy.extensions.filters.http.ratelim" +
      "it.v3.RateLimitConfig.Action.HeaderValue" +
      "MatchH\000\022_\n\010metadata\030\010 \001(\0132K.envoy.extens" +
      "ions.filters.http.ratelimit.v3.RateLimit" +
      "Config.Action.MetaDataH\000\022?\n\textension\030\t " +
      "\001(\0132*.envoy.config.core.v3.TypedExtensio" +
      "nConfigH\000\032\017\n\rSourceCluster\032\024\n\022Destinatio" +
      "nCluster\032m\n\016RequestHeaders\022\"\n\013header_nam" +
      "e\030\001 \001(\tB\r\372B\nr\010\020\001\300\001\001\310\001\000\022\037\n\016descriptor_key" +
      "\030\002 \001(\tB\007\372B\004r\002\020\001\022\026\n\016skip_if_absent\030\003 \001(\010\032" +
      "\017\n\rRemoteAddress\032G\n\nGenericKey\022!\n\020descri" +
      "ptor_value\030\001 \001(\tB\007\372B\004r\002\020\001\022\026\n\016descriptor_" +
      "key\030\002 \001(\t\032\214\001\n\020HeaderValueMatch\022!\n\020descri" +
      "ptor_value\030\001 \001(\tB\007\372B\004r\002\020\001\022\024\n\014expect_matc" +
      "h\030\002 \001(\010\022?\n\007headers\030\003 \003(\0132$.envoy.config." +
      "route.v3.HeaderMatcherB\010\372B\005\222\001\002\010\001\032\235\002\n\010Met" +
      "aData\022\037\n\016descriptor_key\030\001 \001(\tB\007\372B\004r\002\020\001\022C" +
      "\n\014metadata_key\030\002 \001(\0132#.envoy.type.metada" +
      "ta.v3.MetadataKeyB\010\372B\005\212\001\002\020\001\022\025\n\rdefault_v" +
      "alue\030\003 \001(\t\022l\n\006source\030\004 \001(\0162R.envoy.exten" +
      "sions.filters.http.ratelimit.v3.RateLimi" +
      "tConfig.Action.MetaData.SourceB\010\372B\005\202\001\002\020\001" +
      "\"&\n\006Source\022\013\n\007DYNAMIC\020\000\022\017\n\013ROUTE_ENTRY\020\001" +
      "B\027\n\020action_specifier\022\003\370B\001\032\357\001\n\010Override\022p" +
      "\n\020dynamic_metadata\030\001 \001(\0132T.envoy.extensi" +
      "ons.filters.http.ratelimit.v3.RateLimitC" +
      "onfig.Override.DynamicMetadataH\000\032V\n\017Dyna" +
      "micMetadata\022C\n\014metadata_key\030\001 \001(\0132#.envo" +
      "y.type.metadata.v3.MetadataKeyB\010\372B\005\212\001\002\020\001" +
      "B\031\n\022override_specifier\022\003\370B\001\"\346\003\n\021RateLimi" +
      "tPerRoute\022s\n\016vh_rate_limits\030\001 \001(\0162Q.envo" +
      "y.extensions.filters.http.ratelimit.v3.R" +
      "ateLimitPerRoute.VhRateLimitsOptionsB\010\372B" +
      "\005\202\001\002\020\001\022p\n\017override_option\030\002 \001(\0162M.envoy." +
      "extensions.filters.http.ratelimit.v3.Rat" +
      "eLimitPerRoute.OverrideOptionsB\010\372B\005\202\001\002\020\001" +
      "\022P\n\013rate_limits\030\003 \003(\0132;.envoy.extensions" +
      ".filters.http.ratelimit.v3.RateLimitConf" +
      "ig\"<\n\023VhRateLimitsOptions\022\014\n\010OVERRIDE\020\000\022" +
      "\013\n\007INCLUDE\020\001\022\n\n\006IGNORE\020\002\"Z\n\017OverrideOpti" +
      "ons\022\013\n\007DEFAULT\020\000\022\023\n\017OVERRIDE_POLICY\020\001\022\022\n" +
      "\016INCLUDE_POLICY\020\002\022\021\n\rIGNORE_POLICY\020\003B\263\001\n" +
      "8io.envoyproxy.envoy.extensions.filters." +
      "http.ratelimit.v3B\016RateLimitProtoP\001Z]git" +
      "hub.com/envoyproxy/go-control-plane/envo" +
      "y/extensions/filters/http/ratelimit/v3;r" +
      "atelimitv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor(),
          io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.getDescriptor(),
          io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor(),
          io.envoyproxy.envoy.type.metadata.v3.MetadataProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_descriptor,
        new java.lang.String[] { "Domain", "Stage", "RequestType", "Timeout", "FailureModeDeny", "RateLimitedAsResourceExhausted", "RateLimitService", "EnableXRatelimitHeaders", "DisableXEnvoyRatelimitedHeader", "RateLimitedStatus", "ResponseHeadersToAdd", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_descriptor,
        new java.lang.String[] { "Stage", "DisableKey", "Actions", "Limit", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_descriptor.getNestedTypes().get(0);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor,
        new java.lang.String[] { "SourceCluster", "DestinationCluster", "RequestHeaders", "RemoteAddress", "GenericKey", "HeaderValueMatch", "Metadata", "Extension", "ActionSpecifier", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_SourceCluster_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(0);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_SourceCluster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_SourceCluster_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_DestinationCluster_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(1);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_DestinationCluster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_DestinationCluster_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RequestHeaders_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(2);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RequestHeaders_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RequestHeaders_descriptor,
        new java.lang.String[] { "HeaderName", "DescriptorKey", "SkipIfAbsent", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RemoteAddress_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(3);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RemoteAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_RemoteAddress_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_GenericKey_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(4);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_GenericKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_GenericKey_descriptor,
        new java.lang.String[] { "DescriptorValue", "DescriptorKey", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_HeaderValueMatch_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(5);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_HeaderValueMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_HeaderValueMatch_descriptor,
        new java.lang.String[] { "DescriptorValue", "ExpectMatch", "Headers", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_MetaData_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_descriptor.getNestedTypes().get(6);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_MetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Action_MetaData_descriptor,
        new java.lang.String[] { "DescriptorKey", "MetadataKey", "DefaultValue", "Source", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_descriptor.getNestedTypes().get(1);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_descriptor,
        new java.lang.String[] { "DynamicMetadata", "OverrideSpecifier", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_DynamicMetadata_descriptor =
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_descriptor.getNestedTypes().get(0);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_DynamicMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitConfig_Override_DynamicMetadata_descriptor,
        new java.lang.String[] { "MetadataKey", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor,
        new java.lang.String[] { "VhRateLimits", "OverrideOption", "RateLimits", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor();
    io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.getDescriptor();
    io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor();
    io.envoyproxy.envoy.type.metadata.v3.MetadataProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}