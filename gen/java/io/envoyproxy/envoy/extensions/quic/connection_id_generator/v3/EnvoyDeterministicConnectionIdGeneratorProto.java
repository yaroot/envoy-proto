// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/quic/connection_id_generator/v3/envoy_deterministic_connection_id_generator.proto

package io.envoyproxy.envoy.extensions.quic.connection_id_generator.v3;

public final class EnvoyDeterministicConnectionIdGeneratorProto {
  private EnvoyDeterministicConnectionIdGeneratorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_quic_connection_id_generator_v3_DeterministicConnectionIdGeneratorConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_quic_connection_id_generator_v3_DeterministicConnectionIdGeneratorConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nbenvoy/extensions/quic/connection_id_ge" +
      "nerator/v3/envoy_deterministic_connectio" +
      "n_id_generator.proto\0220envoy.extensions.q" +
      "uic.connection_id_generator.v3\032\035udpa/ann" +
      "otations/status.proto\"*\n(DeterministicCo" +
      "nnectionIdGeneratorConfigB\353\001\n>io.envoypr" +
      "oxy.envoy.extensions.quic.connection_id_" +
      "generator.v3B,EnvoyDeterministicConnecti" +
      "onIdGeneratorProtoP\001Zqgithub.com/envoypr" +
      "oxy/go-control-plane/envoy/extensions/qu" +
      "ic/connection_id_generator/v3;connection" +
      "_id_generatorv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_extensions_quic_connection_id_generator_v3_DeterministicConnectionIdGeneratorConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_quic_connection_id_generator_v3_DeterministicConnectionIdGeneratorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_quic_connection_id_generator_v3_DeterministicConnectionIdGeneratorConfig_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}