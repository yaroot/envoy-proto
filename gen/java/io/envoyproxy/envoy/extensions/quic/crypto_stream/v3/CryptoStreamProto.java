// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/quic/crypto_stream/v3/crypto_stream.proto

package io.envoyproxy.envoy.extensions.quic.crypto_stream.v3;

public final class CryptoStreamProto {
  private CryptoStreamProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_quic_crypto_stream_v3_CryptoServerStreamConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_quic_crypto_stream_v3_CryptoServerStreamConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:envoy/extensions/quic/crypto_stream/v3" +
      "/crypto_stream.proto\022&envoy.extensions.q" +
      "uic.crypto_stream.v3\032\035udpa/annotations/s" +
      "tatus.proto\"\032\n\030CryptoServerStreamConfigB" +
      "\262\001\n4io.envoyproxy.envoy.extensions.quic." +
      "crypto_stream.v3B\021CryptoStreamProtoP\001Z]g" +
      "ithub.com/envoyproxy/go-control-plane/en" +
      "voy/extensions/quic/crypto_stream/v3;cry" +
      "pto_streamv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_extensions_quic_crypto_stream_v3_CryptoServerStreamConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_quic_crypto_stream_v3_CryptoServerStreamConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_quic_crypto_stream_v3_CryptoServerStreamConfig_descriptor,
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