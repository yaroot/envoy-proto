// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/quic_config.proto

package io.envoyproxy.envoy.config.listener.v3;

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
    internal_static_envoy_config_listener_v3_QuicProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_listener_v3_QuicProtocolOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*envoy/config/listener/v3/quic_config.p" +
      "roto\022\030envoy.config.listener.v3\032\037envoy/co" +
      "nfig/core/v3/base.proto\032$envoy/config/co" +
      "re/v3/extension.proto\032#envoy/config/core" +
      "/v3/protocol.proto\032\036google/protobuf/dura" +
      "tion.proto\032\036google/protobuf/wrappers.pro" +
      "to\032\035udpa/annotations/status.proto\032!udpa/" +
      "annotations/versioning.proto\032\027validate/v" +
      "alidate.proto\"\373\004\n\023QuicProtocolOptions\022H\n" +
      "\025quic_protocol_options\030\001 \001(\0132).envoy.con" +
      "fig.core.v3.QuicProtocolOptions\022/\n\014idle_" +
      "timeout\030\002 \001(\0132\031.google.protobuf.Duration" +
      "\022;\n\030crypto_handshake_timeout\030\003 \001(\0132\031.goo" +
      "gle.protobuf.Duration\0229\n\007enabled\030\004 \001(\0132(" +
      ".envoy.config.core.v3.RuntimeFeatureFlag" +
      "\022X\n)packets_to_read_to_connection_count_" +
      "ratio\030\005 \001(\0132\034.google.protobuf.UInt32Valu" +
      "eB\007\372B\004*\002(\001\022H\n\024crypto_stream_config\030\006 \001(\013" +
      "2*.envoy.config.core.v3.TypedExtensionCo" +
      "nfig\022G\n\023proof_source_config\030\007 \001(\0132*.envo" +
      "y.config.core.v3.TypedExtensionConfig\022R\n" +
      "\036connection_id_generator_config\030\010 \001(\0132*." +
      "envoy.config.core.v3.TypedExtensionConfi" +
      "g:0\232\305\210\036+\n)envoy.api.v2.listener.QuicProt" +
      "ocolOptionsB\217\001\n&io.envoyproxy.envoy.conf" +
      "ig.listener.v3B\017QuicConfigProtoP\001ZJgithu" +
      "b.com/envoyproxy/go-control-plane/envoy/" +
      "config/listener/v3;listenerv3\272\200\310\321\006\002\020\002b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.ProtocolProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_listener_v3_QuicProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_listener_v3_QuicProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_listener_v3_QuicProtocolOptions_descriptor,
        new java.lang.String[] { "QuicProtocolOptions", "IdleTimeout", "CryptoHandshakeTimeout", "Enabled", "PacketsToReadToConnectionCountRatio", "CryptoStreamConfig", "ProofSourceConfig", "ConnectionIdGeneratorConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.ProtocolProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
