// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/access_loggers/stream/v3/stream.proto

package io.envoyproxy.envoy.extensions.access_loggers.stream.v3;

public final class StreamProto {
  private StreamProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_access_loggers_stream_v3_StdoutAccessLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_access_loggers_stream_v3_StdoutAccessLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_access_loggers_stream_v3_StderrAccessLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_access_loggers_stream_v3_StderrAccessLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6envoy/extensions/access_loggers/stream" +
      "/v3/stream.proto\022)envoy.extensions.acces" +
      "s_loggers.stream.v3\0325envoy/config/core/v" +
      "3/substitution_format_string.proto\032\035udpa" +
      "/annotations/status.proto\032\027validate/vali" +
      "date.proto\"v\n\017StdoutAccessLog\022N\n\nlog_for" +
      "mat\030\001 \001(\0132..envoy.config.core.v3.Substit" +
      "utionFormatStringB\010\372B\005\212\001\002\020\001H\000B\023\n\021access_" +
      "log_format\"v\n\017StderrAccessLog\022N\n\nlog_for" +
      "mat\030\001 \001(\0132..envoy.config.core.v3.Substit" +
      "utionFormatStringB\010\372B\005\212\001\002\020\001H\000B\023\n\021access_" +
      "log_formatB\253\001\n7io.envoyproxy.envoy.exten" +
      "sions.access_loggers.stream.v3B\013StreamPr" +
      "otoP\001ZYgithub.com/envoyproxy/go-control-" +
      "plane/envoy/extensions/access_loggers/st" +
      "ream/v3;streamv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.SubstitutionFormatStringProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_access_loggers_stream_v3_StdoutAccessLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_access_loggers_stream_v3_StdoutAccessLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_access_loggers_stream_v3_StdoutAccessLog_descriptor,
        new java.lang.String[] { "LogFormat", "AccessLogFormat", });
    internal_static_envoy_extensions_access_loggers_stream_v3_StderrAccessLog_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_access_loggers_stream_v3_StderrAccessLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_access_loggers_stream_v3_StderrAccessLog_descriptor,
        new java.lang.String[] { "LogFormat", "AccessLogFormat", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.SubstitutionFormatStringProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}