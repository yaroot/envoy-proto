// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v3/dynamic_ot.proto

package io.envoyproxy.envoy.config.trace.v3;

public final class DynamicOtProto {
  private DynamicOtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_trace_v3_DynamicOtConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_trace_v3_DynamicOtConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&envoy/config/trace/v3/dynamic_ot.proto" +
      "\022\025envoy.config.trace.v3\032\034google/protobuf" +
      "/struct.proto\032\036udpa/annotations/migrate." +
      "proto\032\035udpa/annotations/status.proto\032!ud" +
      "pa/annotations/versioning.proto\032\027validat" +
      "e/validate.proto\"\202\001\n\017DynamicOtConfig\022\030\n\007" +
      "library\030\001 \001(\tB\007\372B\004r\002\020\001\022\'\n\006config\030\002 \001(\0132\027" +
      ".google.protobuf.Struct:,\232\305\210\036\'\n%envoy.co" +
      "nfig.trace.v2.DynamicOtConfigB\270\001\n#io.env" +
      "oyproxy.envoy.config.trace.v3B\016DynamicOt" +
      "ProtoP\001ZDgithub.com/envoyproxy/go-contro" +
      "l-plane/envoy/config/trace/v3;tracev3\362\230\376" +
      "\217\005-\022+envoy.extensions.tracers.dynamic_ot" +
      ".v4alpha\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_trace_v3_DynamicOtConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_trace_v3_DynamicOtConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_trace_v3_DynamicOtConfig_descriptor,
        new java.lang.String[] { "Library", "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.StructProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}