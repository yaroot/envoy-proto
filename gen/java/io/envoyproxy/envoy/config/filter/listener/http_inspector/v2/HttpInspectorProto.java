// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/listener/http_inspector/v2/http_inspector.proto

package io.envoyproxy.envoy.config.filter.listener.http_inspector.v2;

public final class HttpInspectorProto {
  private HttpInspectorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_filter_listener_http_inspector_v2_HttpInspector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_filter_listener_http_inspector_v2_HttpInspector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCenvoy/config/filter/listener/http_insp" +
      "ector/v2/http_inspector.proto\022.envoy.con" +
      "fig.filter.listener.http_inspector.v2\032\036u" +
      "dpa/annotations/migrate.proto\032\035udpa/anno" +
      "tations/status.proto\"\017\n\rHttpInspectorB\377\001" +
      "\n<io.envoyproxy.envoy.config.filter.list" +
      "ener.http_inspector.v2B\022HttpInspectorPro" +
      "toP\001Zfgithub.com/envoyproxy/go-control-p" +
      "lane/envoy/config/filter/listener/http_i" +
      "nspector/v2;http_inspectorv2\362\230\376\217\0055\0223envo" +
      "y.extensions.filters.listener.http_inspe" +
      "ctor.v3\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_config_filter_listener_http_inspector_v2_HttpInspector_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_filter_listener_http_inspector_v2_HttpInspector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_filter_listener_http_inspector_v2_HttpInspector_descriptor,
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