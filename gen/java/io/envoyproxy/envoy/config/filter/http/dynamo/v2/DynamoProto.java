// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/dynamo/v2/dynamo.proto

package io.envoyproxy.envoy.config.filter.http.dynamo.v2;

public final class DynamoProto {
  private DynamoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_filter_http_dynamo_v2_Dynamo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_filter_http_dynamo_v2_Dynamo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/envoy/config/filter/http/dynamo/v2/dyn" +
      "amo.proto\022\"envoy.config.filter.http.dyna" +
      "mo.v2\032\036udpa/annotations/migrate.proto\032\035u" +
      "dpa/annotations/status.proto\"\010\n\006DynamoB\314" +
      "\001\n0io.envoyproxy.envoy.config.filter.htt" +
      "p.dynamo.v2B\013DynamoProtoP\001ZRgithub.com/e" +
      "nvoyproxy/go-control-plane/envoy/config/" +
      "filter/http/dynamo/v2;dynamov2\362\230\376\217\005)\022\'en" +
      "voy.extensions.filters.http.dynamo.v3\272\200\310" +
      "\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_config_filter_http_dynamo_v2_Dynamo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_filter_http_dynamo_v2_Dynamo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_filter_http_dynamo_v2_Dynamo_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}