// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/accesslog/v2/als.proto

package io.envoyproxy.envoy.service.accesslog.v2;

public final class AlsProto {
  private AlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_Identifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_Identifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_HTTPAccessLogEntries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_HTTPAccessLogEntries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_TCPAccessLogEntries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_TCPAccessLogEntries_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/service/accesslog/v2/als.proto\022\032" +
      "envoy.service.accesslog.v2\032\034envoy/api/v2" +
      "/core/base.proto\032\'envoy/data/accesslog/v" +
      "2/accesslog.proto\032\035udpa/annotations/stat" +
      "us.proto\032\027validate/validate.proto\"\032\n\030Str" +
      "eamAccessLogsResponse\"\331\004\n\027StreamAccessLo" +
      "gsMessage\022R\n\nidentifier\030\001 \001(\0132>.envoy.se" +
      "rvice.accesslog.v2.StreamAccessLogsMessa" +
      "ge.Identifier\022]\n\thttp_logs\030\002 \001(\0132H.envoy" +
      ".service.accesslog.v2.StreamAccessLogsMe" +
      "ssage.HTTPAccessLogEntriesH\000\022[\n\010tcp_logs" +
      "\030\003 \001(\0132G.envoy.service.accesslog.v2.Stre" +
      "amAccessLogsMessage.TCPAccessLogEntriesH" +
      "\000\032X\n\nIdentifier\022/\n\004node\030\001 \001(\0132\027.envoy.ap" +
      "i.v2.core.NodeB\010\372B\005\212\001\002\020\001\022\031\n\010log_name\030\002 \001" +
      "(\tB\007\372B\004r\002 \001\032`\n\024HTTPAccessLogEntries\022H\n\tl" +
      "og_entry\030\001 \003(\0132+.envoy.data.accesslog.v2" +
      ".HTTPAccessLogEntryB\010\372B\005\222\001\002\010\001\032^\n\023TCPAcce" +
      "ssLogEntries\022G\n\tlog_entry\030\001 \003(\0132*.envoy." +
      "data.accesslog.v2.TCPAccessLogEntryB\010\372B\005" +
      "\222\001\002\010\001B\022\n\013log_entries\022\003\370B\0012\226\001\n\020AccessLogS" +
      "ervice\022\201\001\n\020StreamAccessLogs\0223.envoy.serv" +
      "ice.accesslog.v2.StreamAccessLogsMessage" +
      "\0324.envoy.service.accesslog.v2.StreamAcce" +
      "ssLogsResponse\"\000(\001B\220\001\n(io.envoyproxy.env" +
      "oy.service.accesslog.v2B\010AlsProtoP\001ZMgit" +
      "hub.com/envoyproxy/go-control-plane/envo" +
      "y/service/accesslog/v2;accesslogv2\210\001\001\272\200\310" +
      "\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.core.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.data.accesslog.v2.AccesslogProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v2_StreamAccessLogsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_descriptor,
        new java.lang.String[] { "Identifier", "HttpLogs", "TcpLogs", "LogEntries", });
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_Identifier_descriptor =
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_descriptor.getNestedTypes().get(0);
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_Identifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_Identifier_descriptor,
        new java.lang.String[] { "Node", "LogName", });
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_HTTPAccessLogEntries_descriptor =
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_descriptor.getNestedTypes().get(1);
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_HTTPAccessLogEntries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_HTTPAccessLogEntries_descriptor,
        new java.lang.String[] { "LogEntry", });
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_TCPAccessLogEntries_descriptor =
      internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_descriptor.getNestedTypes().get(2);
    internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_TCPAccessLogEntries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v2_StreamAccessLogsMessage_TCPAccessLogEntries_descriptor,
        new java.lang.String[] { "LogEntry", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.core.BaseProto.getDescriptor();
    io.envoyproxy.envoy.data.accesslog.v2.AccesslogProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}