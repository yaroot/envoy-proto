// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/network/dns_resolver/apple/v3/apple_dns_resolver.proto

package io.envoyproxy.envoy.extensions.network.dns_resolver.apple.v3;

public final class AppleDnsResolverProto {
  private AppleDnsResolverProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_network_dns_resolver_apple_v3_AppleDnsResolverConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_network_dns_resolver_apple_v3_AppleDnsResolverConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGenvoy/extensions/network/dns_resolver/" +
      "apple/v3/apple_dns_resolver.proto\022.envoy" +
      ".extensions.network.dns_resolver.apple.v" +
      "3\032\035udpa/annotations/status.proto\"=\n\026Appl" +
      "eDnsResolverConfig\022#\n\033include_unroutable" +
      "_families\030\001 \001(\010B\276\001\n<io.envoyproxy.envoy." +
      "extensions.network.dns_resolver.apple.v3" +
      "B\025AppleDnsResolverProtoP\001Z]github.com/en" +
      "voyproxy/go-control-plane/envoy/extensio" +
      "ns/network/dns_resolver/apple/v3;applev3" +
      "\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_extensions_network_dns_resolver_apple_v3_AppleDnsResolverConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_network_dns_resolver_apple_v3_AppleDnsResolverConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_network_dns_resolver_apple_v3_AppleDnsResolverConfig_descriptor,
        new java.lang.String[] { "IncludeUnroutableFamilies", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}