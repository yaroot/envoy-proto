// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v2/dynamic_ot.proto

package io.envoyproxy.envoy.config.trace.v2;

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
    internal_static_envoy_config_trace_v2_DynamicOtConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_trace_v2_DynamicOtConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&envoy/config/trace/v2/dynamic_ot.proto" +
      "\022\025envoy.config.trace.v2\032\034google/protobuf" +
      "/struct.proto\032\035udpa/annotations/status.p" +
      "roto\032\027validate/validate.proto\"T\n\017Dynamic" +
      "OtConfig\022\030\n\007library\030\001 \001(\tB\007\372B\004r\002 \001\022\'\n\006co" +
      "nfig\030\002 \001(\0132\027.google.protobuf.StructB\205\001\n#" +
      "io.envoyproxy.envoy.config.trace.v2B\016Dyn" +
      "amicOtProtoP\001ZDgithub.com/envoyproxy/go-" +
      "control-plane/envoy/config/trace/v2;trac" +
      "ev2\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_trace_v2_DynamicOtConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_trace_v2_DynamicOtConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_trace_v2_DynamicOtConfig_descriptor,
        new java.lang.String[] { "Library", "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.StructProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}