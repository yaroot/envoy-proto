// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/common/key_value/v3/config.proto

package io.envoyproxy.envoy.config.common.key_value.v3;

public final class ConfigProto {
  private ConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_common_key_value_v3_KeyValueStoreConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_common_key_value_v3_KeyValueStoreConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-envoy/config/common/key_value/v3/confi" +
      "g.proto\022 envoy.config.common.key_value.v" +
      "3\032$envoy/config/core/v3/extension.proto\032" +
      "\037xds/annotations/v3/status.proto\032\035udpa/a" +
      "nnotations/status.proto\032\027validate/valida" +
      "te.proto\"e\n\023KeyValueStoreConfig\022D\n\006confi" +
      "g\030\001 \001(\0132*.envoy.config.core.v3.TypedExte" +
      "nsionConfigB\010\372B\005\212\001\002\020\001:\010\322\306\244\341\006\002\010\001B\234\001\n.io.e" +
      "nvoyproxy.envoy.config.common.key_value." +
      "v3B\013ConfigProtoP\001ZSgithub.com/envoyproxy" +
      "/go-control-plane/envoy/config/common/ke" +
      "y_value/v3;key_valuev3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor(),
          xds.annotations.v3.Status.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_common_key_value_v3_KeyValueStoreConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_common_key_value_v3_KeyValueStoreConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_common_key_value_v3_KeyValueStoreConfig_descriptor,
        new java.lang.String[] { "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    registry.add(xds.annotations.v3.Status.messageStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.ExtensionProto.getDescriptor();
    xds.annotations.v3.Status.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}