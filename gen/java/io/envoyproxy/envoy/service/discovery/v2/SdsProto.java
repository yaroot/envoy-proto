// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v2/sds.proto

package io.envoyproxy.envoy.service.discovery.v2;

public final class SdsProto {
  private SdsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_discovery_v2_SdsDummy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_discovery_v2_SdsDummy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/service/discovery/v2/sds.proto\022\032" +
      "envoy.service.discovery.v2\032\034envoy/api/v2" +
      "/discovery.proto\032\034google/api/annotations" +
      ".proto\032 envoy/annotations/resource.proto" +
      "\032\036udpa/annotations/migrate.proto\032\035udpa/a" +
      "nnotations/status.proto\"\n\n\010SdsDummy2\354\002\n\026" +
      "SecretDiscoveryService\022_\n\014DeltaSecrets\022#" +
      ".envoy.api.v2.DeltaDiscoveryRequest\032$.en" +
      "voy.api.v2.DeltaDiscoveryResponse\"\000(\0010\001\022" +
      "V\n\rStreamSecrets\022\036.envoy.api.v2.Discover" +
      "yRequest\032\037.envoy.api.v2.DiscoveryRespons" +
      "e\"\000(\0010\001\022w\n\014FetchSecrets\022\036.envoy.api.v2.D" +
      "iscoveryRequest\032\037.envoy.api.v2.Discovery" +
      "Response\"&\202\323\344\223\002\027\"\025/v2/discovery:secrets\202" +
      "\323\344\223\002\003:\001*\032 \212\244\226\363\007\032\n\030envoy.api.v2.auth.Secr" +
      "etB\257\001\n(io.envoyproxy.envoy.service.disco" +
      "very.v2B\010SdsProtoP\001ZMgithub.com/envoypro" +
      "xy/go-control-plane/envoy/service/discov" +
      "ery/v2;discoveryv2\210\001\001\362\230\376\217\005\031\022\027envoy.servi" +
      "ce.secret.v3\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.DiscoveryProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          envoy.annotations.Resource.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_service_discovery_v2_SdsDummy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_discovery_v2_SdsDummy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_discovery_v2_SdsDummy_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(envoy.annotations.Resource.resource);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.DiscoveryProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    envoy.annotations.Resource.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}