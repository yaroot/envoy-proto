// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/cluster/filter.proto

package io.envoyproxy.envoy.api.v2.cluster;

public final class FilterProto {
  private FilterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_cluster_Filter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_cluster_Filter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!envoy/api/v2/cluster/filter.proto\022\024env" +
      "oy.api.v2.cluster\032\031google/protobuf/any.p" +
      "roto\032\036udpa/annotations/migrate.proto\032\035ud" +
      "pa/annotations/status.proto\032\027validate/va" +
      "lidate.proto\"K\n\006Filter\022\025\n\004name\030\001 \001(\tB\007\372B" +
      "\004r\002 \001\022*\n\014typed_config\030\002 \001(\0132\024.google.pro" +
      "tobuf.AnyB\314\001\n\"io.envoyproxy.envoy.api.v2" +
      ".clusterB\013FilterProtoP\001Z;github.com/envo" +
      "yproxy/go-control-plane/envoy/api/v2/clu" +
      "ster\252\002\026Envoy.Api.V2.ClusterNS\352\002\031Envoy::A" +
      "pi::V2::ClusterNS\362\230\376\217\005\031\022\027envoy.config.cl" +
      "uster.v3\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_api_v2_cluster_Filter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_cluster_Filter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_cluster_Filter_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}