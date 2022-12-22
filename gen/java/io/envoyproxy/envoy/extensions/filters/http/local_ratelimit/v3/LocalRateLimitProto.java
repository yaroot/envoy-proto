// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/local_ratelimit/v3/local_rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.http.local_ratelimit.v3;

public final class LocalRateLimitProto {
  private LocalRateLimitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_local_ratelimit_v3_LocalRateLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_local_ratelimit_v3_LocalRateLimit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGenvoy/extensions/filters/http/local_ra" +
      "telimit/v3/local_rate_limit.proto\0220envoy" +
      ".extensions.filters.http.local_ratelimit" +
      ".v3\032\037envoy/config/core/v3/base.proto\0324en" +
      "voy/extensions/common/ratelimit/v3/ratel" +
      "imit.proto\032\037envoy/type/v3/http_status.pr" +
      "oto\032 envoy/type/v3/token_bucket.proto\032\035u" +
      "dpa/annotations/status.proto\032\027validate/v" +
      "alidate.proto\"\304\006\n\016LocalRateLimit\022\034\n\013stat" +
      "_prefix\030\001 \001(\tB\007\372B\004r\002\020\001\022)\n\006status\030\002 \001(\0132\031" +
      ".envoy.type.v3.HttpStatus\0220\n\014token_bucke" +
      "t\030\003 \001(\0132\032.envoy.type.v3.TokenBucket\022F\n\016f" +
      "ilter_enabled\030\004 \001(\0132..envoy.config.core." +
      "v3.RuntimeFractionalPercent\022G\n\017filter_en" +
      "forced\030\005 \001(\0132..envoy.config.core.v3.Runt" +
      "imeFractionalPercent\022c\n(request_headers_" +
      "to_add_when_not_enforced\030\n \003(\0132\'.envoy.c" +
      "onfig.core.v3.HeaderValueOptionB\010\372B\005\222\001\002\020" +
      "\n\022R\n\027response_headers_to_add\030\006 \003(\0132\'.env" +
      "oy.config.core.v3.HeaderValueOptionB\010\372B\005" +
      "\222\001\002\020\n\022S\n\013descriptors\030\010 \003(\0132>.envoy.exten" +
      "sions.common.ratelimit.v3.LocalRateLimit" +
      "Descriptor\022\026\n\005stage\030\t \001(\rB\007\372B\004*\002\030\n\0222\n*lo" +
      "cal_rate_limit_per_downstream_connection" +
      "\030\013 \001(\010\022o\n\032enable_x_ratelimit_headers\030\014 \001" +
      "(\0162A.envoy.extensions.common.ratelimit.v" +
      "3.XRateLimitHeadersRFCVersionB\010\372B\005\202\001\002\020\001\022" +
      "[\n\016vh_rate_limits\030\r \001(\01629.envoy.extensio" +
      "ns.common.ratelimit.v3.VhRateLimitsOptio" +
      "nsB\010\372B\005\202\001\002\020\001B\312\001\n>io.envoyproxy.envoy.ext" +
      "ensions.filters.http.local_ratelimit.v3B" +
      "\023LocalRateLimitProtoP\001Zigithub.com/envoy" +
      "proxy/go-control-plane/envoy/extensions/" +
      "filters/http/local_ratelimit/v3;local_ra" +
      "telimitv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.common.ratelimit.v3.RatelimitProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.TokenBucketProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_local_ratelimit_v3_LocalRateLimit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_local_ratelimit_v3_LocalRateLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_local_ratelimit_v3_LocalRateLimit_descriptor,
        new java.lang.String[] { "StatPrefix", "Status", "TokenBucket", "FilterEnabled", "FilterEnforced", "RequestHeadersToAddWhenNotEnforced", "ResponseHeadersToAdd", "Descriptors", "Stage", "LocalRateLimitPerDownstreamConnection", "EnableXRatelimitHeaders", "VhRateLimits", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.extensions.common.ratelimit.v3.RatelimitProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.TokenBucketProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}