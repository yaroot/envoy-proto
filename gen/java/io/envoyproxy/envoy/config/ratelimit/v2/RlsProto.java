// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/ratelimit/v2/rls.proto

package io.envoyproxy.envoy.config.ratelimit.v2;

public final class RlsProto {
  private RlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_ratelimit_v2_RateLimitServiceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_ratelimit_v2_RateLimitServiceConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#envoy/config/ratelimit/v2/rls.proto\022\031e" +
      "nvoy.config.ratelimit.v2\032$envoy/api/v2/c" +
      "ore/grpc_service.proto\032\035udpa/annotations" +
      "/status.proto\032\027validate/validate.proto\"d" +
      "\n\026RateLimitServiceConfig\022>\n\014grpc_service" +
      "\030\002 \001(\0132\036.envoy.api.v2.core.GrpcServiceB\010" +
      "\372B\005\212\001\002\020\001J\004\010\001\020\002J\004\010\003\020\004B\213\001\n\'io.envoyproxy.e" +
      "nvoy.config.ratelimit.v2B\010RlsProtoP\001ZLgi" +
      "thub.com/envoyproxy/go-control-plane/env" +
      "oy/config/ratelimit/v2;ratelimitv2\272\200\310\321\006\002" +
      "\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.core.GrpcServiceProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_ratelimit_v2_RateLimitServiceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_ratelimit_v2_RateLimitServiceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_ratelimit_v2_RateLimitServiceConfig_descriptor,
        new java.lang.String[] { "GrpcService", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.core.GrpcServiceProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}