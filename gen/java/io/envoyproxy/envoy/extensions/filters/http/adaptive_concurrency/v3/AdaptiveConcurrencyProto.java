// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/adaptive_concurrency/v3/adaptive_concurrency.proto

package io.envoyproxy.envoy.extensions.filters.http.adaptive_concurrency.v3;

public final class AdaptiveConcurrencyProto {
  private AdaptiveConcurrencyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_ConcurrencyLimitCalculationParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_ConcurrencyLimitCalculationParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_MinimumRTTCalculationParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_MinimumRTTCalculationParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_AdaptiveConcurrency_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_AdaptiveConcurrency_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPenvoy/extensions/filters/http/adaptive" +
      "_concurrency/v3/adaptive_concurrency.pro" +
      "to\0225envoy.extensions.filters.http.adapti" +
      "ve_concurrency.v3\032\037envoy/config/core/v3/" +
      "base.proto\032\037envoy/type/v3/http_status.pr" +
      "oto\032\033envoy/type/v3/percent.proto\032\036google" +
      "/protobuf/duration.proto\032\036google/protobu" +
      "f/wrappers.proto\032\035udpa/annotations/statu" +
      "s.proto\032!udpa/annotations/versioning.pro" +
      "to\032\027validate/validate.proto\"\262\t\n\030Gradient" +
      "ControllerConfig\022;\n\033sample_aggregate_per" +
      "centile\030\001 \001(\0132\026.envoy.type.v3.Percent\022\235\001" +
      "\n\030concurrency_limit_params\030\002 \001(\0132q.envoy" +
      ".extensions.filters.http.adaptive_concur" +
      "rency.v3.GradientControllerConfig.Concur" +
      "rencyLimitCalculationParamsB\010\372B\005\212\001\002\020\001\022\222\001" +
      "\n\023min_rtt_calc_params\030\003 \001(\0132k.envoy.exte" +
      "nsions.filters.http.adaptive_concurrency" +
      ".v3.GradientControllerConfig.MinimumRTTC" +
      "alculationParamsB\010\372B\005\212\001\002\020\001\032\256\002\n!Concurren" +
      "cyLimitCalculationParams\022D\n\025max_concurre" +
      "ncy_limit\030\002 \001(\0132\034.google.protobuf.UInt32" +
      "ValueB\007\372B\004*\002 \000\022J\n\033concurrency_update_int" +
      "erval\030\003 \001(\0132\031.google.protobuf.DurationB\n" +
      "\372B\007\252\001\004\010\001*\000:w\232\305\210\036r\npenvoy.config.filter.h" +
      "ttp.adaptive_concurrency.v2alpha.Gradien" +
      "tControllerConfig.ConcurrencyLimitCalcul" +
      "ationParams\032\233\003\n\033MinimumRTTCalculationPar" +
      "ams\022;\n\010interval\030\001 \001(\0132\031.google.protobuf." +
      "DurationB\016\372B\013\252\001\010\010\0012\004\020\300\204=\022<\n\rrequest_coun" +
      "t\030\002 \001(\0132\034.google.protobuf.UInt32ValueB\007\372" +
      "B\004*\002 \000\022&\n\006jitter\030\003 \001(\0132\026.envoy.type.v3.P" +
      "ercent\022>\n\017min_concurrency\030\004 \001(\0132\034.google" +
      ".protobuf.UInt32ValueB\007\372B\004*\002 \000\022&\n\006buffer" +
      "\030\005 \001(\0132\026.envoy.type.v3.Percent:q\232\305\210\036l\nje" +
      "nvoy.config.filter.http.adaptive_concurr" +
      "ency.v2alpha.GradientControllerConfig.Mi" +
      "nimumRTTCalculationParams:U\232\305\210\036P\nNenvoy." +
      "config.filter.http.adaptive_concurrency." +
      "v2alpha.GradientControllerConfig\"\217\003\n\023Ada" +
      "ptiveConcurrency\022\177\n\032gradient_controller_" +
      "config\030\001 \001(\0132O.envoy.extensions.filters." +
      "http.adaptive_concurrency.v3.GradientCon" +
      "trollerConfigB\010\372B\005\212\001\002\020\001H\000\0229\n\007enabled\030\002 \001" +
      "(\0132(.envoy.config.core.v3.RuntimeFeature" +
      "Flag\022D\n!concurrency_limit_exceeded_statu" +
      "s\030\003 \001(\0132\031.envoy.type.v3.HttpStatus:P\232\305\210\036" +
      "K\nIenvoy.config.filter.http.adaptive_con" +
      "currency.v2alpha.AdaptiveConcurrencyB$\n\035" +
      "concurrency_controller_config\022\003\370B\001B\336\001\nCi" +
      "o.envoyproxy.envoy.extensions.filters.ht" +
      "tp.adaptive_concurrency.v3B\030AdaptiveConc" +
      "urrencyProtoP\001Zsgithub.com/envoyproxy/go" +
      "-control-plane/envoy/extensions/filters/" +
      "http/adaptive_concurrency/v3;adaptive_co" +
      "ncurrencyv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_descriptor,
        new java.lang.String[] { "SampleAggregatePercentile", "ConcurrencyLimitParams", "MinRttCalcParams", });
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_ConcurrencyLimitCalculationParams_descriptor =
      internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_descriptor.getNestedTypes().get(0);
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_ConcurrencyLimitCalculationParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_ConcurrencyLimitCalculationParams_descriptor,
        new java.lang.String[] { "MaxConcurrencyLimit", "ConcurrencyUpdateInterval", });
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_MinimumRTTCalculationParams_descriptor =
      internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_descriptor.getNestedTypes().get(1);
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_MinimumRTTCalculationParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_GradientControllerConfig_MinimumRTTCalculationParams_descriptor,
        new java.lang.String[] { "Interval", "RequestCount", "Jitter", "MinConcurrency", "Buffer", });
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_AdaptiveConcurrency_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_AdaptiveConcurrency_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_adaptive_concurrency_v3_AdaptiveConcurrency_descriptor,
        new java.lang.String[] { "GradientControllerConfig", "Enabled", "ConcurrencyLimitExceededStatus", "ConcurrencyControllerConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}