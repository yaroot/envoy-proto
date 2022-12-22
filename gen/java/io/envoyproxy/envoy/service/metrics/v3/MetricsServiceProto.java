// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/metrics/v3/metrics_service.proto

package io.envoyproxy.envoy.service.metrics.v3;

public final class MetricsServiceProto {
  private MetricsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_metrics_v3_StreamMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_metrics_v3_StreamMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_metrics_v3_StreamMetricsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_metrics_v3_StreamMetricsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_metrics_v3_StreamMetricsMessage_Identifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_metrics_v3_StreamMetricsMessage_Identifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.envoy/service/metrics/v3/metrics_servi" +
      "ce.proto\022\030envoy.service.metrics.v3\032\037envo" +
      "y/config/core/v3/base.proto\032\"io/promethe" +
      "us/client/metrics.proto\032\035udpa/annotation" +
      "s/status.proto\032!udpa/annotations/version" +
      "ing.proto\032\027validate/validate.proto\"N\n\025St" +
      "reamMetricsResponse:5\232\305\210\0360\n.envoy.servic" +
      "e.metrics.v2.StreamMetricsResponse\"\332\002\n\024S" +
      "treamMetricsMessage\022M\n\nidentifier\030\001 \001(\0132" +
      "9.envoy.service.metrics.v3.StreamMetrics" +
      "Message.Identifier\0229\n\renvoy_metrics\030\002 \003(" +
      "\0132\".io.prometheus.client.MetricFamily\032\201\001" +
      "\n\nIdentifier\0222\n\004node\030\001 \001(\0132\032.envoy.confi" +
      "g.core.v3.NodeB\010\372B\005\212\001\002\020\001:?\232\305\210\036:\n8envoy.s" +
      "ervice.metrics.v2.StreamMetricsMessage.I" +
      "dentifier:4\232\305\210\036/\n-envoy.service.metrics." +
      "v2.StreamMetricsMessage2\206\001\n\016MetricsServi" +
      "ce\022t\n\rStreamMetrics\022..envoy.service.metr" +
      "ics.v3.StreamMetricsMessage\032/.envoy.serv" +
      "ice.metrics.v3.StreamMetricsResponse\"\000(\001" +
      "B\225\001\n&io.envoyproxy.envoy.service.metrics" +
      ".v3B\023MetricsServiceProtoP\001ZIgithub.com/e" +
      "nvoyproxy/go-control-plane/envoy/service" +
      "/metrics/v3;metricsv3\210\001\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.prometheus.client.Metrics.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_service_metrics_v3_StreamMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_metrics_v3_StreamMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_metrics_v3_StreamMetricsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_service_metrics_v3_StreamMetricsMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_service_metrics_v3_StreamMetricsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_metrics_v3_StreamMetricsMessage_descriptor,
        new java.lang.String[] { "Identifier", "EnvoyMetrics", });
    internal_static_envoy_service_metrics_v3_StreamMetricsMessage_Identifier_descriptor =
      internal_static_envoy_service_metrics_v3_StreamMetricsMessage_descriptor.getNestedTypes().get(0);
    internal_static_envoy_service_metrics_v3_StreamMetricsMessage_Identifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_metrics_v3_StreamMetricsMessage_Identifier_descriptor,
        new java.lang.String[] { "Node", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.prometheus.client.Metrics.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}