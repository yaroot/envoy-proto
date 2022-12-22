// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/stateful_session/v3/stateful_session.proto

package io.envoyproxy.envoy.extensions.filters.http.stateful_session.v3;

public final class StatefulSessionProto {
  private StatefulSessionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSession_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSessionPerRoute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSessionPerRoute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHenvoy/extensions/filters/http/stateful" +
      "_session/v3/stateful_session.proto\0221envo" +
      "y.extensions.filters.http.stateful_sessi" +
      "on.v3\032$envoy/config/core/v3/extension.pr" +
      "oto\032\035udpa/annotations/status.proto\032\027vali" +
      "date/validate.proto\"T\n\017StatefulSession\022A" +
      "\n\rsession_state\030\001 \001(\0132*.envoy.config.cor" +
      "e.v3.TypedExtensionConfig\"\247\001\n\027StatefulSe" +
      "ssionPerRoute\022\033\n\010disabled\030\001 \001(\010B\007\372B\004j\002\010\001" +
      "H\000\022^\n\020stateful_session\030\002 \001(\0132B.envoy.ext" +
      "ensions.filters.http.stateful_session.v3" +
      ".StatefulSessionH\000B\017\n\010override\022\003\370B\001B\316\001\n?" +
      "io.envoyproxy.envoy.extensions.filters.h" +
      "ttp.stateful_session.v3B\024StatefulSession" +
      "ProtoP\001Zkgithub.com/envoyproxy/go-contro" +
      "l-plane/envoy/extensions/filters/http/st" +
      "ateful_session/v3;stateful_sessionv3\272\200\310\321" +
      "\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSession_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSession_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSession_descriptor,
        new java.lang.String[] { "SessionState", });
    internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSessionPerRoute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSessionPerRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_stateful_session_v3_StatefulSessionPerRoute_descriptor,
        new java.lang.String[] { "Disabled", "StatefulSession", "Override", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}