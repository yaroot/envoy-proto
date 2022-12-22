// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/rbac/v2/rbac.proto

package io.envoyproxy.envoy.config.filter.network.rbac.v2;

public final class RbacProto {
  private RbacProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_filter_network_rbac_v2_RBAC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_filter_network_rbac_v2_RBAC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.envoy/config/filter/network/rbac/v2/rb" +
      "ac.proto\022#envoy.config.filter.network.rb" +
      "ac.v2\032\037envoy/config/rbac/v2/rbac.proto\032\036" +
      "udpa/annotations/migrate.proto\032\035udpa/ann" +
      "otations/status.proto\032\027validate/validate" +
      ".proto\"\225\002\n\004RBAC\022)\n\005rules\030\001 \001(\0132\032.envoy.c" +
      "onfig.rbac.v2.RBAC\0220\n\014shadow_rules\030\002 \001(\013" +
      "2\032.envoy.config.rbac.v2.RBAC\022\034\n\013stat_pre" +
      "fix\030\003 \001(\tB\007\372B\004r\002 \001\022S\n\020enforcement_type\030\004" +
      " \001(\01629.envoy.config.filter.network.rbac." +
      "v2.RBAC.EnforcementType\"=\n\017EnforcementTy" +
      "pe\022\032\n\026ONE_TIME_ON_FIRST_BYTE\020\000\022\016\n\nCONTIN" +
      "UOUS\020\001B\313\001\n1io.envoyproxy.envoy.config.fi" +
      "lter.network.rbac.v2B\tRbacProtoP\001ZQgithu" +
      "b.com/envoyproxy/go-control-plane/envoy/" +
      "config/filter/network/rbac/v2;rbacv2\362\230\376\217" +
      "\005*\022(envoy.extensions.filters.network.rba" +
      "c.v3\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.rbac.v2.RbacProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_filter_network_rbac_v2_RBAC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_filter_network_rbac_v2_RBAC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_filter_network_rbac_v2_RBAC_descriptor,
        new java.lang.String[] { "Rules", "ShadowRules", "StatPrefix", "EnforcementType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.rbac.v2.RbacProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}