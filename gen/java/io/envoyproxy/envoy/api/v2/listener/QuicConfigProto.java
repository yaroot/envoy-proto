// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/listener/quic_config.proto

package io.envoyproxy.envoy.api.v2.listener;

public final class QuicConfigProto {
  private QuicConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_listener_QuicProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_listener_QuicProtocolOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'envoy/api/v2/listener/quic_config.prot" +
      "o\022\025envoy.api.v2.listener\032\036google/protobu" +
      "f/duration.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032\036udpa/annotations/migrate.proto" +
      "\032\035udpa/annotations/status.proto\"\301\001\n\023Quic" +
      "ProtocolOptions\022<\n\026max_concurrent_stream" +
      "s\030\001 \001(\0132\034.google.protobuf.UInt32Value\022/\n" +
      "\014idle_timeout\030\002 \001(\0132\031.google.protobuf.Du" +
      "ration\022;\n\030crypto_handshake_timeout\030\003 \001(\013" +
      "2\031.google.protobuf.DurationB\325\001\n#io.envoy" +
      "proxy.envoy.api.v2.listenerB\017QuicConfigP" +
      "rotoP\001Z<github.com/envoyproxy/go-control" +
      "-plane/envoy/api/v2/listener\252\002\027Envoy.Api" +
      ".V2.ListenerNS\352\002\032Envoy::Api::V2::Listene" +
      "rNS\362\230\376\217\005\032\022\030envoy.config.listener.v3\272\200\310\321\006" +
      "\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_api_v2_listener_QuicProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_listener_QuicProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_listener_QuicProtocolOptions_descriptor,
        new java.lang.String[] { "MaxConcurrentStreams", "IdleTimeout", "CryptoHandshakeTimeout", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}