// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/load_balancing_policies/round_robin/v3/round_robin.proto

package io.envoyproxy.envoy.extensions.load_balancing_policies.round_robin.v3;

public final class RoundRobinProto {
  private RoundRobinProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_load_balancing_policies_round_robin_v3_RoundRobin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_load_balancing_policies_round_robin_v3_RoundRobin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIenvoy/extensions/load_balancing_polici" +
      "es/round_robin/v3/round_robin.proto\0227env" +
      "oy.extensions.load_balancing_policies.ro" +
      "und_robin.v3\032?envoy/extensions/load_bala" +
      "ncing_policies/common/v3/common.proto\032\035u" +
      "dpa/annotations/status.proto\"\316\001\n\nRoundRo" +
      "bin\022^\n\021slow_start_config\030\001 \001(\0132C.envoy.e" +
      "xtensions.load_balancing_policies.common" +
      ".v3.SlowStartConfig\022`\n\022locality_lb_confi" +
      "g\030\002 \001(\0132D.envoy.extensions.load_balancin" +
      "g_policies.common.v3.LocalityLbConfigB\320\001" +
      "\nEio.envoyproxy.envoy.extensions.load_ba" +
      "lancing_policies.round_robin.v3B\017RoundRo" +
      "binProtoP\001Zlgithub.com/envoyproxy/go-con" +
      "trol-plane/envoy/extensions/load_balanci" +
      "ng_policies/round_robin/v3;round_robinv3" +
      "\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.extensions.load_balancing_policies.common.v3.CommonProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_extensions_load_balancing_policies_round_robin_v3_RoundRobin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_load_balancing_policies_round_robin_v3_RoundRobin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_load_balancing_policies_round_robin_v3_RoundRobin_descriptor,
        new java.lang.String[] { "SlowStartConfig", "LocalityLbConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.extensions.load_balancing_policies.common.v3.CommonProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}