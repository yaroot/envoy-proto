// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/stat_sinks/wasm/v3/wasm.proto

package io.envoyproxy.envoy.extensions.stat_sinks.wasm.v3;

public final class WasmProto {
  private WasmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_stat_sinks_wasm_v3_Wasm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_stat_sinks_wasm_v3_Wasm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.envoy/extensions/stat_sinks/wasm/v3/wa" +
      "sm.proto\022#envoy.extensions.stat_sinks.wa" +
      "sm.v3\032#envoy/extensions/wasm/v3/wasm.pro" +
      "to\032\035udpa/annotations/status.proto\">\n\004Was" +
      "m\0226\n\006config\030\001 \001(\0132&.envoy.extensions.was" +
      "m.v3.PluginConfigB\233\001\n1io.envoyproxy.envo" +
      "y.extensions.stat_sinks.wasm.v3B\tWasmPro" +
      "toP\001ZQgithub.com/envoyproxy/go-control-p" +
      "lane/envoy/extensions/stat_sinks/wasm/v3" +
      ";wasmv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.extensions.wasm.v3.WasmProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_extensions_stat_sinks_wasm_v3_Wasm_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_stat_sinks_wasm_v3_Wasm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_stat_sinks_wasm_v3_Wasm_descriptor,
        new java.lang.String[] { "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.extensions.wasm.v3.WasmProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}