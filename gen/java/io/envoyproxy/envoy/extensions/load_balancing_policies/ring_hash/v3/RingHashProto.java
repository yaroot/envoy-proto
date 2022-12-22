// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/load_balancing_policies/ring_hash/v3/ring_hash.proto

package io.envoyproxy.envoy.extensions.load_balancing_policies.ring_hash.v3;

public final class RingHashProto {
  private RingHashProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_load_balancing_policies_ring_hash_v3_RingHash_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_load_balancing_policies_ring_hash_v3_RingHash_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEenvoy/extensions/load_balancing_polici" +
      "es/ring_hash/v3/ring_hash.proto\0225envoy.e" +
      "xtensions.load_balancing_policies.ring_h" +
      "ash.v3\032?envoy/extensions/load_balancing_" +
      "policies/common/v3/common.proto\032\036google/" +
      "protobuf/wrappers.proto\032#envoy/annotatio" +
      "ns/deprecation.proto\032\035udpa/annotations/s" +
      "tatus.proto\032\027validate/validate.proto\"\270\004\n" +
      "\010RingHash\022m\n\rhash_function\030\001 \001(\0162L.envoy" +
      ".extensions.load_balancing_policies.ring" +
      "_hash.v3.RingHash.HashFunctionB\010\372B\005\202\001\002\020\001" +
      "\022C\n\021minimum_ring_size\030\002 \001(\0132\034.google.pro" +
      "tobuf.UInt64ValueB\n\372B\0072\005\030\200\200\200\004\022C\n\021maximum" +
      "_ring_size\030\003 \001(\0132\034.google.protobuf.UInt6" +
      "4ValueB\n\372B\0072\005\030\200\200\200\004\022-\n\030use_hostname_for_h" +
      "ashing\030\004 \001(\010B\013\030\001\222\307\206\330\004\0033.0\022M\n\023hash_balanc" +
      "e_factor\030\005 \001(\0132\034.google.protobuf.UInt32V" +
      "alueB\022\030\001\372B\004*\002(d\222\307\206\330\004\0033.0\022s\n\034consistent_h" +
      "ashing_lb_config\030\006 \001(\0132M.envoy.extension" +
      "s.load_balancing_policies.common.v3.Cons" +
      "istentHashingLbConfig\"@\n\014HashFunction\022\020\n" +
      "\014DEFAULT_HASH\020\000\022\013\n\007XX_HASH\020\001\022\021\n\rMURMUR_H" +
      "ASH_2\020\002B\310\001\nCio.envoyproxy.envoy.extensio" +
      "ns.load_balancing_policies.ring_hash.v3B" +
      "\rRingHashProtoP\001Zhgithub.com/envoyproxy/" +
      "go-control-plane/envoy/extensions/load_b" +
      "alancing_policies/ring_hash/v3;ring_hash" +
      "v3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.extensions.load_balancing_policies.common.v3.CommonProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          envoy.annotations.Deprecation.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_load_balancing_policies_ring_hash_v3_RingHash_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_load_balancing_policies_ring_hash_v3_RingHash_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_load_balancing_policies_ring_hash_v3_RingHash_descriptor,
        new java.lang.String[] { "HashFunction", "MinimumRingSize", "MaximumRingSize", "UseHostnameForHashing", "HashBalanceFactor", "ConsistentHashingLbConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(envoy.annotations.Deprecation.deprecatedAtMinorVersion);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.extensions.load_balancing_policies.common.v3.CommonProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    envoy.annotations.Deprecation.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}