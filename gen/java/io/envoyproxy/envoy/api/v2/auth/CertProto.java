// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/auth/cert.proto

package io.envoyproxy.envoy.api.v2.auth;

public final class CertProto {
  private CertProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034envoy/api/v2/auth/cert.proto\022\021envoy.ap" +
      "i.v2.auth\032\036udpa/annotations/migrate.prot" +
      "o\032\036envoy/api/v2/auth/common.proto\032\036envoy" +
      "/api/v2/auth/secret.proto\032\033envoy/api/v2/" +
      "auth/tls.protoB\231\001\n\037io.envoyproxy.envoy.a" +
      "pi.v2.authB\tCertProtoP\001Z8github.com/envo" +
      "yproxy/go-control-plane/envoy/api/v2/aut" +
      "h\362\230\376\217\005+\022)envoy.extensions.transport_sock" +
      "ets.tls.v3P\001P\002P\003b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Migrate.getDescriptor(),
          io.envoyproxy.envoy.api.v2.auth.CommonProto.getDescriptor(),
          io.envoyproxy.envoy.api.v2.auth.SecretProto.getDescriptor(),
          io.envoyproxy.envoy.api.v2.auth.TlsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Migrate.getDescriptor();
    io.envoyproxy.envoy.api.v2.auth.CommonProto.getDescriptor();
    io.envoyproxy.envoy.api.v2.auth.SecretProto.getDescriptor();
    io.envoyproxy.envoy.api.v2.auth.TlsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}