// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/listener/tls_inspector/v2/tls_inspector.proto

package io.envoyproxy.envoy.config.filter.listener.tls_inspector.v2;

public final class TlsInspectorProto {
  private TlsInspectorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_filter_listener_tls_inspector_v2_TlsInspector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_filter_listener_tls_inspector_v2_TlsInspector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAenvoy/config/filter/listener/tls_inspe" +
      "ctor/v2/tls_inspector.proto\022-envoy.confi" +
      "g.filter.listener.tls_inspector.v2\032\036udpa" +
      "/annotations/migrate.proto\032\035udpa/annotat" +
      "ions/status.proto\"\016\n\014TlsInspectorB\372\001\n;io" +
      ".envoyproxy.envoy.config.filter.listener" +
      ".tls_inspector.v2B\021TlsInspectorProtoP\001Zd" +
      "github.com/envoyproxy/go-control-plane/e" +
      "nvoy/config/filter/listener/tls_inspecto" +
      "r/v2;tls_inspectorv2\362\230\376\217\0054\0222envoy.extens" +
      "ions.filters.listener.tls_inspector.v3\272\200" +
      "\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_config_filter_listener_tls_inspector_v2_TlsInspector_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_filter_listener_tls_inspector_v2_TlsInspector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_filter_listener_tls_inspector_v2_TlsInspector_descriptor,
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