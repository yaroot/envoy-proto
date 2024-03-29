// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/http_uri.proto

package io.envoyproxy.envoy.api.v2.core;

public final class HttpUriProto {
  private HttpUriProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_HttpUri_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_HttpUri_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n envoy/api/v2/core/http_uri.proto\022\021envo" +
      "y.api.v2.core\032\036google/protobuf/duration." +
      "proto\032\036udpa/annotations/migrate.proto\032\035u" +
      "dpa/annotations/status.proto\032\027validate/v" +
      "alidate.proto\"\216\001\n\007HttpUri\022\024\n\003uri\030\001 \001(\tB\007" +
      "\372B\004r\002 \001\022\032\n\007cluster\030\002 \001(\tB\007\372B\004r\002 \001H\000\0226\n\007t" +
      "imeout\030\003 \001(\0132\031.google.protobuf.DurationB" +
      "\n\372B\007\252\001\004\010\0012\000B\031\n\022http_upstream_type\022\003\370B\001B\217" +
      "\001\n\037io.envoyproxy.envoy.api.v2.coreB\014Http" +
      "UriProtoP\001Z8github.com/envoyproxy/go-con" +
      "trol-plane/envoy/api/v2/core\362\230\376\217\005\026\022\024envo" +
      "y.config.core.v3\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_api_v2_core_HttpUri_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_core_HttpUri_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_HttpUri_descriptor,
        new java.lang.String[] { "Uri", "Cluster", "Timeout", "HttpUpstreamType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DurationProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
