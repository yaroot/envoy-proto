// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/compression/brotli/decompressor/v3/brotli.proto

package io.envoyproxy.envoy.extensions.compression.brotli.decompressor.v3;

public final class BrotliProto {
  private BrotliProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_compression_brotli_decompressor_v3_Brotli_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_compression_brotli_decompressor_v3_Brotli_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@envoy/extensions/compression/brotli/de" +
      "compressor/v3/brotli.proto\0223envoy.extens" +
      "ions.compression.brotli.decompressor.v3\032" +
      "\036google/protobuf/wrappers.proto\032\035udpa/an" +
      "notations/status.proto\032\027validate/validat" +
      "e.proto\"r\n\006Brotli\022(\n disable_ring_buffer" +
      "_reallocation\030\001 \001(\010\022>\n\nchunk_size\030\002 \001(\0132" +
      "\034.google.protobuf.UInt32ValueB\014\372B\t*\007\030\200\200\004" +
      "(\200 B\305\001\nAio.envoyproxy.envoy.extensions.c" +
      "ompression.brotli.decompressor.v3B\013Brotl" +
      "iProtoP\001Zigithub.com/envoyproxy/go-contr" +
      "ol-plane/envoy/extensions/compression/br" +
      "otli/decompressor/v3;decompressorv3\272\200\310\321\006" +
      "\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_compression_brotli_decompressor_v3_Brotli_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_compression_brotli_decompressor_v3_Brotli_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_compression_brotli_decompressor_v3_Brotli_descriptor,
        new java.lang.String[] { "DisableRingBufferReallocation", "ChunkSize", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}